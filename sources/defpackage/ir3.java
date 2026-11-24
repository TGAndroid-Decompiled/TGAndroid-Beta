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
public abstract class ir3 extends CameraView {
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
    public hr3 N;
    public hr3 O;
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

    public ir3(Context context, boolean z) {
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
        this.a = o(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = na7.c1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i = 0; i < split.length; i++) {
                    try {
                        fArr[i] = Float.parseFloat(split[i]);
                    } catch (Exception e) {
                        fa4.g(e, true);
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

    public static boolean n(Context context, boolean z) {
        boolean z2;
        boolean z3;
        int i = 0;
        boolean z4 = true;
        if (gba.o() >= 1 && Camera.getNumberOfCameras() > 1 && gba.b()) {
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

    public static boolean o(Context context) {
        return na7.c1().getBoolean("dual_available", n(context, true));
    }

    public static void r(boolean z) {
        int i;
        boolean n = n(a.b, false);
        if (na7.q1(y6c.t0).k4.k3.f) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                if (n) {
                    i = 2;
                } else {
                    i = 0;
                }
                tL_inputAppEvent.peer = (z ? 1 : 0) | i;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_help_saveAppLog, new ce2((byte) 0));
            } catch (Exception unused) {
            }
        }
        a.a.getClass();
    }

    @Override
    public final void destroy(boolean z, Runnable runnable) {
        t();
        super.destroy(z, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        int i;
        t();
        if (this.I) {
            y6b y6bVar = (y6b) this;
            if (na7.c1().getInt("storysvddualhint", 0) < 2) {
                gl.e3(new kya(y6bVar, (byte) 18), 340L);
            }
            t7b t7bVar = y6bVar.c0;
            t7bVar.G0.setValue(y6bVar.isDual());
            npb npbVar = t7bVar.G0;
            if (y6bVar.isDual()) {
                i = 2131754886;
            } else {
                i = 2131754887;
            }
            npbVar.setContentDescription(k96.M0(i, null));
        }
        r(true);
    }

    @Override
    public final void onError(int i, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!n(getContext(), false)) {
                SharedPreferences.Editor edit = na7.c1().edit();
                this.a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String M0 = k96.M0(2131751328, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131751329, null);
                b00.t(null, 2131747638, alertDialog$Builder, null);
            }
            r(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        na7.c1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && q(motionEvent.getX(), motionEvent.getY())) {
            return v(motionEvent);
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
            if (o(getContext()) && na7.c1().getBoolean("dualcam", n(a.b, false))) {
                this.I = true;
                u();
                this.dual = true;
            }
            this.F = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean v = v(motionEvent);
        if (!super.onTouchEvent(motionEvent) && !v) {
            return false;
        }
        return true;
    }

    public final void p(Matrix matrix) {
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
        this.T = loe.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.U = loe.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean q(float f, float f2) {
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

    public abstract void s(boolean z);

    public final void t() {
        SharedPreferences.Editor edit = na7.c1().edit();
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

    @Override
    public void toggleDual() {
        if (!isDual() && !this.a) {
            return;
        }
        if (!isDual()) {
            u();
        } else {
            na7.c1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }

    public final void u() {
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

    public final boolean v(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir3.v(android.view.MotionEvent):boolean");
    }
}
