package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class b1 extends CameraView {
    public static final int[] f11635a0 = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public final Matrix D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public long K;
    public final Matrix L;
    public a1 M;
    public a1 N;
    public final float[] O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final float[] U;
    public float[] V;
    public float[] W;
    public boolean f11636a;
    public final PointF f11637b;
    public final PointF f11638c;
    public float d;
    public double f11639e;
    public boolean f11640f;
    public boolean h;
    public final Matrix f11641n;
    public final Matrix f11642r;
    public boolean f11643s;
    public float f11644w;
    public boolean f11645x;
    public final Matrix f11646y;

    public b1(Context context, boolean z9) {
        super(context, z9, false);
        this.f11637b = new PointF();
        this.f11638c = new PointF();
        this.f11641n = new Matrix();
        this.f11642r = new Matrix();
        this.f11646y = new Matrix();
        this.D = new Matrix();
        this.E = true;
        this.L = new Matrix();
        this.O = new float[2];
        new Matrix();
        this.U = new float[2];
        this.f11636a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = qp.e1().getString("dualmatrix", null);
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

    public static boolean p(Context context, boolean z9) {
        boolean z10;
        boolean z11;
        int i7 = 0;
        boolean z12 = true;
        if (iz.o() >= 1 && Camera.getNumberOfCameras() > 1 && iz.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && z9) {
                int hashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
                while (true) {
                    if (i7 < 32) {
                        if (f11635a0[i7] == hashCode) {
                            break;
                        }
                        i7++;
                    } else {
                        z12 = z11;
                        break;
                    }
                }
                if (!z12) {
                    (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
                }
                return z12;
            }
            return z11;
        }
        return z10;
    }

    public static boolean q(Context context) {
        return qp.e1().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z9) {
        int i7 = 0;
        boolean p10 = p(org.telegram.messenger.t0.f25566b, false);
        if (qp.s1(p10.f24470s0).I3) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime();
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
                tL_inputAppEvent.peer = (z9 ? 1 : 0) | i7;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(p10.f24470s0).sendRequest(tL_help_saveAppLog, new di.v5(4));
            } catch (Exception unused) {
            }
        }
        org.telegram.messenger.t0.f25565a.getClass();
    }

    @Override
    public final void destroy(boolean z9, Runnable runnable) {
        v();
        super.destroy(z9, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        int i7;
        v();
        if (this.H) {
            y9 y9Var = (y9) this;
            if (qp.e1().getInt("storysvddualhint", 0) < 2) {
                org.telegram.messenger.g0.i3(new v9(y9Var, 2), 340L);
            }
            va vaVar = y9Var.f13218b0;
            vaVar.F0.setValue(y9Var.isDual());
            hb hbVar = vaVar.F0;
            if (y9Var.isDual()) {
                i7 = 2131754886;
            } else {
                i7 = 2131754887;
            }
            hbVar.setContentDescription(id.M0(i7, null));
        }
        t(true);
    }

    @Override
    public final void onError(int i7, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = qp.e1().edit();
                this.f11636a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String M0 = id.M0(2131751340, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131751341, null);
                jg.g.C(null, 2131747831, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        qp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
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
        Matrix matrix = this.f11646y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.D);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        if (this.E) {
            if (q(getContext()) && qp.e1().getBoolean("dualcam", p(org.telegram.messenger.t0.f25566b, false))) {
                this.H = true;
                w();
                this.dual = true;
            }
            this.E = false;
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
        float[] fArr = this.O;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.P = fArr[0];
        this.Q = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.R = (float) Math.toDegrees(Math.atan2(fArr[1] - this.Q, fArr[0] - this.P));
        this.S = a8.r9.a(this.P, this.Q, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.T = a8.r9.a(this.P, this.Q, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f10, float f11) {
        float f12;
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.U;
        fArr[0] = f10;
        fArr[1] = f11;
        this.D.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.L;
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
        if (!isDual() && !this.f11636a) {
            return;
        }
        if (!isDual()) {
            w();
        } else {
            qp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }

    public abstract void u(boolean z9);

    public final void v() {
        SharedPreferences.Editor edit = qp.e1().edit();
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
            dualPosition.postConcat(this.f11646y);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.D);
        }
        updateDualPosition();
    }

    public final boolean x(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b1.x(android.view.MotionEvent):boolean");
    }
}
