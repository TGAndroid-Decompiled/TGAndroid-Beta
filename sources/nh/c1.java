package nh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class c1 extends CameraView {
    public static final int[] T = {1893745684, -215458996, -862041025, -1258375037, -1320049076, -215749424, 1901578030, -215451421, 1908491424, -1321491332, -1155551678, 1908524435, 976847578, -1489198134, 1910814392, -713271737, -2010722764, 1407170066, -821405251, -1394190955, -1394190055, 1407170066, 1407159934, 1407172057, 1231389747, -2076538925, 41497626, 846150482, -1198092731, -251277614, -2073158771, 1273004781};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public float E;
    public float F;
    public long G;
    public final Matrix H;
    public b1 I;
    public b1 J;
    public final float[] K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public final float[] Q;
    public float[] R;
    public float[] S;
    public boolean f17457a;
    public final PointF f17458b;
    public final PointF f17459c;
    public float d;
    public double f17460e;
    public boolean f17461f;
    public boolean h;
    public final Matrix f17462n;
    public final Matrix f17463r;
    public boolean f17464s;
    public float v;
    public boolean f17465w;
    public final Matrix f17466x;
    public final Matrix f17467y;

    public c1(Context context, boolean z10) {
        super(context, z10, false);
        this.f17458b = new PointF();
        this.f17459c = new PointF();
        this.f17462n = new Matrix();
        this.f17463r = new Matrix();
        this.f17466x = new Matrix();
        this.f17467y = new Matrix();
        this.A = true;
        this.H = new Matrix();
        this.K = new float[2];
        new Matrix();
        this.Q = new float[2];
        this.f17457a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = MessagesController.getGlobalMainSettings().getString("dualmatrix", null);
        if (string == null) {
            return null;
        }
        String[] split = string.split(";");
        if (split.length != 9) {
            return null;
        }
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < split.length; i10++) {
            try {
                fArr[i10] = Float.parseFloat(split[i10]);
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static boolean p(Context context, boolean z10) {
        boolean z11;
        boolean z12;
        int i10 = 0;
        boolean z13 = true;
        if (SharedConfig.getDevicePerformanceClass() >= 1 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers()) {
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
                    if (i10 < 32) {
                        if (T[i10] == hashCode) {
                            break;
                        }
                        i10++;
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
        return MessagesController.getGlobalMainSettings().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z10) {
        int i10 = 0;
        boolean p10 = p(ApplicationLoader.applicationContext, false);
        if (MessagesController.getInstance(UserConfig.selectedAccount).collectDeviceStats) {
            try {
                TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
                TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
                tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
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
                    i10 = 2;
                }
                tL_inputAppEvent.peer = (z10 ? 1 : 0) | i10;
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new lh.o5(4));
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z10, p10);
    }

    @Override
    public final void destroy(boolean z10, Runnable runnable) {
        v();
        super.destroy(z10, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        int i10;
        v();
        if (this.D) {
            ka kaVar = (ka) this;
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new m6(kaVar, 7), 340L);
            }
            gb gbVar = kaVar.U;
            gbVar.B0.setValue(kaVar.isDual());
            sb sbVar = gbVar.B0;
            if (kaVar.isDual()) {
                i10 = R.string.AccDescrDualCameraOn;
            } else {
                i10 = R.string.AccDescrDualCameraOff;
            }
            sbVar.setContentDescription(LocaleController.getString(i10));
        }
        t(true);
    }

    @Override
    public final void onError(int i10, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
                this.f17457a = false;
                edit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DualErrorTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DualErrorMessage);
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
            }
            t(false);
            toggleDual();
        }
        if (getCameraSession(0) != null && getCameraSession(0).equals(cameraSessionWrapper)) {
            resetCamera();
        }
        MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) {
            return x(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Matrix matrix = this.f17466x;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.f17467y);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.A) {
            if (q(getContext()) && MessagesController.getGlobalMainSettings().getBoolean("dualcam", p(ApplicationLoader.applicationContext, false))) {
                this.D = true;
                w();
                this.dual = true;
            }
            this.A = false;
        }
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean x4 = x(motionEvent);
        if (!super.onTouchEvent(motionEvent) && !x4) {
            return false;
        }
        return true;
    }

    public final void r(Matrix matrix) {
        float[] fArr = this.K;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.L = fArr[0];
        this.M = fArr[1];
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        matrix.mapPoints(fArr);
        this.N = (float) Math.toDegrees(Math.atan2(fArr[1] - this.M, fArr[0] - this.L));
        this.O = i7.z5.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.P = i7.z5.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f9, float f10) {
        float f11;
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.Q;
        fArr[0] = f9;
        fArr[1] = f10;
        this.f17467y.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.H;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        if (dualShape != 0 && dualShape != 1 && dualShape != 3) {
            f11 = 1.0f;
        } else {
            f11 = 0.5625f;
        }
        float f12 = fArr[0];
        if (f12 >= -1.0f && f12 <= 1.0f) {
            float f13 = fArr[1];
            if (f13 >= (-f11) && f13 <= f11) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void toggleDual() {
        if (!isDual() && !this.f17457a) {
            return;
        }
        if (!isDual()) {
            w();
        } else {
            MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
        }
        super.toggleDual();
    }

    public abstract void u(boolean z10);

    public final void v() {
        SharedPreferences.Editor edit = MessagesController.getGlobalMainSettings().edit();
        edit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append(fArr[0]);
            for (int i10 = 1; i10 < 9; i10++) {
                sb2.append(";");
                sb2.append(fArr[i10]);
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
            dualPosition.postConcat(this.f17466x);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float min = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), (getMeasuredHeight() * 0.43f) / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - min) - measuredWidth, min);
            dualPosition.postConcat(this.f17467y);
        }
        updateDualPosition();
    }

    public final boolean x(android.view.MotionEvent r52) {
        throw new UnsupportedOperationException("Method not decompiled: nh.c1.x(android.view.MotionEvent):boolean");
    }
}
