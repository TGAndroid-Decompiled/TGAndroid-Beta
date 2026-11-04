package gi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class b1 extends CameraView {
    public static final int[] f12428b0 = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public final Matrix E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public float J;
    public float K;
    public long L;
    public final Matrix M;
    public a1 N;
    public a1 O;
    public final float[] P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public final float[] V;
    public float[] W;
    public boolean f12429a;
    public float[] f12430a0;
    public final PointF f12431b;
    public final PointF f12432c;
    public float d;
    public double f12433e;
    public boolean f12434f;
    public boolean h;
    public final Matrix f12435n;
    public final Matrix f12436r;
    public boolean f12437s;
    public float f12438w;
    public boolean f12439x;
    public final Matrix f12440y;

    public b1(Context context, boolean z10) {
        super(context, z10, false);
        this.f12431b = new PointF();
        this.f12432c = new PointF();
        this.f12435n = new Matrix();
        this.f12436r = new Matrix();
        this.f12440y = new Matrix();
        this.E = new Matrix();
        this.F = true;
        this.M = new Matrix();
        this.P = new float[2];
        new Matrix();
        this.V = new float[2];
        this.f12429a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = hp.e1().getString("dualmatrix", null);
        if (string != null) {
            String[] split = string.split(";");
            if (split.length == 9) {
                float[] fArr = new float[9];
                for (int i3 = 0; i3 < split.length; i3++) {
                    try {
                        fArr[i3] = Float.parseFloat(split[i3]);
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
        int i3 = 0;
        boolean z13 = true;
        if (az.o() >= 1 && Camera.getNumberOfCameras() > 1 && az.b()) {
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
                    if (i3 < 32) {
                        if (f12428b0[i3] == hashCode) {
                            break;
                        }
                        i3++;
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
        return hp.e1().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z10) {
        int i3 = 0;
        boolean p10 = p(org.telegram.messenger.t0.f25457b, false);
        if (hp.s1(h10.f22829t0).J3) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime();
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
                    i3 = 2;
                }
                tL_inputAppEvent.peer = (z10 ? 1 : 0) | i3;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(h10.f22829t0).sendRequest(tL_help_saveAppLog, new ei.u5(4));
            } catch (Exception unused) {
            }
        }
        org.telegram.messenger.t0.f25456a.getClass();
    }

    @Override
    public final void destroy(boolean z10, Runnable runnable) {
        v();
        super.destroy(z10, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        int i3;
        v();
        if (this.I) {
            y9 y9Var = (y9) this;
            if (hp.e1().getInt("storysvddualhint", 0) < 2) {
                org.telegram.messenger.g0.i3(new f6(y9Var, 7), 340L);
            }
            va vaVar = y9Var.f13985c0;
            vaVar.G0.setValue(y9Var.isDual());
            hb hbVar = vaVar.G0;
            if (y9Var.isDual()) {
                i3 = 2131754886;
            } else {
                i3 = 2131754887;
            }
            hbVar.setContentDescription(bd.M0(i3, null));
        }
        t(true);
    }

    @Override
    public final void onError(int i3, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = hp.e1().edit();
                this.f12429a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                String M0 = bd.M0(2131751341, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131751342, null);
                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        hp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) {
            return x(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Matrix matrix = this.f12440y;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.E);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        if (this.F) {
            if (q(getContext()) && hp.e1().getBoolean("dualcam", p(org.telegram.messenger.t0.f25457b, false))) {
                this.I = true;
                w();
                this.dual = true;
            }
            this.F = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i3, i10);
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
        this.T = a7.h.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.U = a7.h.a(this.Q, this.R, fArr[0], fArr[1]) * 2.0f;
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
        if (!isDual() && !this.f12429a) {
            return;
        }
        if (!isDual()) {
            w();
        } else {
            hp.e1().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }

    public abstract void u(boolean z10);

    public final void v() {
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append(fArr[0]);
            for (int i3 = 1; i3 < 9; i3++) {
                sb2.append(";");
                sb2.append(fArr[i3]);
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
            dualPosition.postConcat(this.f12440y);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.E);
        }
        updateDualPosition();
    }

    public final boolean x(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: gi.b1.x(android.view.MotionEvent):boolean");
    }
}
