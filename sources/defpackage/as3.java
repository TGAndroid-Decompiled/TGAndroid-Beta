package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class as3 extends CameraView {
    public static final int[] b0 = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public final Matrix E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public long L;
    public final Matrix M;
    public zr3 N;
    public zr3 O;
    public final float[] P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public final float[] V;
    public float[] W;
    public boolean a;
    public float[] a0;
    public final PointF b;
    public final PointF c;
    public float d;
    public double e;
    public boolean f;
    public boolean h;
    public final Matrix n;
    public final Matrix r;
    public boolean s;
    public float w;
    public boolean x;
    public final Matrix y;

    public as3(Context context, boolean z) {
        super(context, z, false);
        this.b = new PointF();
        this.c = new PointF();
        this.n = new Matrix();
        this.r = new Matrix();
        this.y = new Matrix();
        this.E = new Matrix();
        this.F = true;
        this.M = new Matrix();
        this.P = new float[2];
        this.V = new float[2];
        this.a = g0(context);
    }

    public static boolean f0(Context context, boolean z) {
        boolean z2;
        boolean z3;
        int i = 0;
        boolean z4 = true;
        if (xea.o() >= 1 && Camera.getNumberOfCameras() > 1 && xea.b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 && z) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                while (true) {
                    if (i < 32) {
                        if (b0[i] == hashCode) {
                            break;
                        }
                        i++;
                    } else {
                        z4 = z3;
                        break;
                    }
                }
                if (!z4) {
                    (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
                }
                return z4;
            }
            return z3;
        }
        return z2;
    }

    public static boolean g0(Context context) {
        return uc7.e1().getBoolean("dual_available", f0(context, true));
    }

    private Matrix getSavedDualMatrix() {
        String string = uc7.e1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i = 0; i < split.length; i++) {
                    try {
                        fArr[i] = Float.parseFloat(split[i]);
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return null;
                    }
                }
                Matrix matrix = new Matrix();
                matrix.setValues(fArr);
                return matrix;
            }
        }
        return null;
    }

    public static void j0(boolean z) {
        int i;
        boolean f0 = f0(a.b, false);
        if (uc7.s1(yac.t0).k4.s3.f) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                if (f0) {
                    i = 2;
                } else {
                    i = 0;
                }
                tL_inputAppEvent.peer = (z ? 1 : 0) | i;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_help_saveAppLog, new xe2((byte) 0));
            } catch (Exception unused) {
            }
        }
        a.a.getClass();
    }

    @Override
    public final void destroy(boolean z, Runnable runnable) {
        l0();
        super.destroy(z, runnable);
    }

    public final void h0(Matrix matrix) {
        float[] fArr = this.P;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.Q = fArr[0];
        this.R = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.S = (float) Math.toDegrees(Math.atan2(fArr[1] - this.R, fArr[0] - this.Q));
        this.T = dte.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.U = dte.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean i0(float f, float f2) {
        float f3;
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.V;
        fArr[0] = f;
        fArr[1] = f2;
        this.E.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.M;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        if (dualShape != 0 && dualShape != 1 && dualShape != 3) {
            f3 = 1.0f;
        } else {
            f3 = 0.5625f;
        }
        float f4 = fArr[0];
        if (f4 >= -1.0f && f4 <= 1.0f) {
            float f5 = fArr[1];
            if (f5 >= (-f3) && f5 <= f3) {
                return true;
            }
        }
        return false;
    }

    public abstract void k0(boolean z);

    public final void l0() {
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb = new StringBuilder(108);
            sb.append(fArr[0]);
            for (int i = 1; i < 9; i++) {
                sb.append(";");
                sb.append(fArr[i]);
            }
            edit.putString("dualmatrix", sb.toString());
        } else {
            edit.remove("dualmatrix");
        }
        edit.apply();
    }

    public final void m0() {
        Matrix dualPosition = getDualPosition();
        dualPosition.reset();
        Matrix savedDualMatrix = getSavedDualMatrix();
        if (savedDualMatrix != null) {
            dualPosition.set(savedDualMatrix);
        } else {
            dualPosition.postConcat(this.y);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.E);
        }
        updateDualPosition();
    }

    public final boolean n0(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as3.n0(android.view.MotionEvent):boolean");
    }

    @Override
    public final void onDualCameraSuccess() {
        int i;
        l0();
        if (this.I) {
            wab wabVar = (wab) this;
            if (uc7.e1().getInt("storysvddualhint", 0) < 2) {
                hl.d3(new s8b(wabVar, (byte) 5), 340L);
            }
            rbb rbbVar = wabVar.c0;
            rbbVar.G0.setValue(wabVar.isDual());
            otb otbVar = rbbVar.G0;
            if (wabVar.isDual()) {
                i = 2131754882;
            } else {
                i = 2131754883;
            }
            otbVar.setContentDescription(ob6.M0(i, null));
        }
        j0(true);
    }

    @Override
    public final void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!f0(getContext(), false)) {
                SharedPreferences.Editor edit = uc7.e1().edit();
                this.a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String M0 = ob6.M0(2131751305, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131751306, null);
                c00.u(null, 2131747558, alertDialog$Builder, null);
            }
            j0(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        uc7.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && i0(motionEvent.getX(), motionEvent.getY())) {
            return n0(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Matrix matrix = this.y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.E);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.F) {
            if (g0(getContext()) && uc7.e1().getBoolean("dualcam", f0(a.b, false))) {
                this.I = true;
                m0();
                this.dual = true;
            }
            this.F = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean n0 = n0(motionEvent);
        if (!super.onTouchEvent(motionEvent) && !n0) {
            return false;
        }
        return true;
    }

    @Override
    public void toggleDual() {
        if (!isDual() && !this.a) {
            return;
        }
        if (!isDual()) {
            m0();
        } else {
            uc7.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }
}
