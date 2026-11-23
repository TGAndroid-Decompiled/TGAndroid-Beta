package hi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import org.telegram.messenger.bz;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class l1 extends CameraView {
    public static final int[] f14809b0 = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public final Matrix E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public long L;
    public final Matrix M;
    public k1 N;
    public k1 O;
    public final float[] P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public final float[] V;
    public float[] W;
    public boolean f14810a;
    public float[] f14811a0;
    public final PointF f14812b;
    public final PointF f14813c;
    public float d;
    public double f14814e;
    public boolean f14815f;
    public boolean h;
    public final Matrix f14816n;
    public final Matrix f14817r;
    public boolean f14818s;
    public float f14819w;
    public boolean f14820x;
    public final Matrix f14821y;

    public l1(Context context, boolean z10) {
        super(context, z10, false);
        this.f14812b = new PointF();
        this.f14813c = new PointF();
        this.f14816n = new Matrix();
        this.f14817r = new Matrix();
        this.f14821y = new Matrix();
        this.E = new Matrix();
        this.F = true;
        this.M = new Matrix();
        this.P = new float[2];
        new Matrix();
        this.V = new float[2];
        this.f14810a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = mp.g1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i7 = 0; i7 < split.length; i7++) {
                    try {
                        fArr[i7] = Float.parseFloat(split[i7]);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
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

    public static boolean p(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        int i7 = 0;
        boolean z13 = true;
        if (bz.o() >= 1 && Camera.getNumberOfCameras() > 1 && bz.b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12 && z10) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                while (true) {
                    if (i7 < 32) {
                        if (f14809b0[i7] == hashCode) {
                            break;
                        }
                        i7++;
                    } else {
                        z13 = z12;
                        break;
                    }
                }
                if (!z13) {
                    (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
                }
                return z13;
            }
            return z12;
        }
        return z11;
    }

    public static boolean q(Context context) {
        return mp.g1().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z10) {
        int i7 = 0;
        boolean p10 = p(org.telegram.messenger.t0.f27013b, false);
        if (mp.u1(i10.f24637t0).L3) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(i10.f24637t0).getCurrentTime();
                tL_inputAppEvent.type = "android_dual_camera";
                TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
                TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
                tL_jsonObjectValue.key = "device";
                TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
                tL_jsonString.value = "" + Build.MANUFACTURER + Build.MODEL;
                tL_jsonObjectValue.value = tL_jsonString;
                tL_jsonObject.value.add(tL_jsonObjectValue);
                tL_inputAppEvent.data = tL_jsonObject;
                if (p10) {
                    i7 = 2;
                }
                tL_inputAppEvent.peer = (z10 ? 1 : 0) | i7;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(i10.f24637t0).sendRequest(tL_help_saveAppLog, new fi.l5(4));
            } catch (Exception unused) {
            }
        }
        org.telegram.messenger.t0.f27012a.getClass();
    }

    @Override
    public final void destroy(boolean z10, Runnable runnable) {
        v();
        super.destroy(z10, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        int i7;
        v();
        if (this.I) {
            qa qaVar = (qa) this;
            if (mp.g1().getInt("storysvddualhint", 0) < 2) {
                org.telegram.messenger.g0.h3(new w(qaVar, 20), 340L);
            }
            nb nbVar = qaVar.f15246c0;
            nbVar.G0.setValue(qaVar.isDual());
            zb zbVar = nbVar.G0;
            if (qaVar.isDual()) {
                i7 = 2131754886;
            } else {
                i7 = 2131754887;
            }
            zbVar.setContentDescription(gd.N0(i7, null));
        }
        t(true);
    }

    @Override
    public final void onError(int i7, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = mp.g1().edit();
                this.f14810a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String N0 = gd.N0(2131751328, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131751329, null);
                org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        mp.g1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) {
            return x(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        Matrix matrix = this.f14821y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.E);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (this.F) {
            if (q(getContext()) && mp.g1().getBoolean("dualcam", p(org.telegram.messenger.t0.f27013b, false))) {
                this.I = true;
                w();
                this.dual = true;
            }
            this.F = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i7, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean x10 = x(motionEvent);
        if (!super.onTouchEvent(motionEvent) && !x10) {
            return false;
        }
        return true;
    }

    public final void r(Matrix matrix) {
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
        this.T = a8.x9.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.U = a8.x9.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f10, float f11) {
        float f12;
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.V;
        fArr[0] = f10;
        fArr[1] = f11;
        this.E.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.M;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        if (dualShape != 0 && dualShape != 1 && dualShape != 3) {
            f12 = 1.0f;
        } else {
            f12 = 0.5625f;
        }
        float f13 = fArr[0];
        if (f13 >= -1.0f && f13 <= 1.0f) {
            float f14 = fArr[1];
            if (f14 >= (-f12) && f14 <= f12) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void toggleDual() {
        if (!isDual() && !this.f14810a) {
            return;
        }
        if (!isDual()) {
            w();
        } else {
            mp.g1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }

    public abstract void u(boolean z10);

    public final void v() {
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append(fArr[0]);
            for (int i7 = 1; i7 < 9; i7++) {
                sb2.append(";");
                sb2.append(fArr[i7]);
            }
            edit.putString("dualmatrix", sb2.toString());
        } else {
            edit.remove("dualmatrix");
        }
        edit.apply();
    }

    public final void w() {
        Matrix dualPosition = getDualPosition();
        dualPosition.reset();
        Matrix savedDualMatrix = getSavedDualMatrix();
        if (savedDualMatrix != null) {
            dualPosition.set(savedDualMatrix);
        } else {
            dualPosition.postConcat(this.f14821y);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.E);
        }
        updateDualPosition();
    }

    public final boolean x(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: hi.l1.x(android.view.MotionEvent):boolean");
    }
}
