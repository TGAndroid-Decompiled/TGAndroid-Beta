package lh;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
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

    public boolean f15721a;

    public final PointF f15722b;

    public final PointF f15723c;
    public float d;

    public double f15724e;

    public boolean f15725f;
    public boolean h;

    public final Matrix f15726n;

    public final Matrix f15727r;

    public boolean f15728s;
    public float v;

    public boolean f15729w;

    public final Matrix f15730x;

    public final Matrix f15731y;

    public c1(Context context, boolean z10) {
        super(context, z10, false);
        this.f15722b = new PointF();
        this.f15723c = new PointF();
        this.f15726n = new Matrix();
        this.f15727r = new Matrix();
        this.f15730x = new Matrix();
        this.f15731y = new Matrix();
        this.A = true;
        this.H = new Matrix();
        this.K = new float[2];
        new Matrix();
        this.Q = new float[2];
        this.f15721a = q(context);
    }

    private Matrix getSavedDualMatrix() {
        String string = MessagesController.getGlobalMainSettings().getString("dualmatrix", null);
        if (string == null) {
            return null;
        }
        String[] strArrSplit = string.split(";");
        if (strArrSplit.length != 9) {
            return null;
        }
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                fArr[i10] = Float.parseFloat(strArrSplit[i10]);
            } catch (Exception e9) {
                FileLog.e(e9);
                return null;
            }
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static boolean p(Context context, boolean z10) {
        int i10 = 0;
        boolean z11 = true;
        boolean z12 = SharedConfig.getDevicePerformanceClass() >= 1 && Camera.getNumberOfCameras() > 1 && SharedConfig.allowPreparingHevcPlayers();
        if (!z12) {
            return z12;
        }
        boolean z13 = context != null && context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
        if (z13 || !z10) {
            return z13;
        }
        int iHashCode = (Build.MANUFACTURER + " " + Build.DEVICE).toUpperCase().hashCode();
        while (true) {
            if (i10 >= 32) {
                z11 = z13;
                break;
            }
            if (T[i10] == iHashCode) {
                break;
            }
            i10++;
        }
        if (!z11) {
            (Build.MANUFACTURER + Build.MODEL).toUpperCase().getClass();
        }
        return z11;
    }

    public static boolean q(Context context) {
        return MessagesController.getGlobalMainSettings().getBoolean("dual_available", p(context, true));
    }

    public static void t(boolean z10) {
        boolean zP = p(ApplicationLoader.applicationContext, false);
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
                tL_inputAppEvent.peer = (z10 ? 1 : 0) | (zP ? 2 : 0);
                tL_help_saveAppLog.events.add(tL_inputAppEvent);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new jh.m5(4));
            } catch (Exception unused) {
            }
        }
        ApplicationLoader.logDualCamera(z10, zP);
    }

    @Override
    public final void destroy(boolean z10, Runnable runnable) {
        v();
        super.destroy(z10, runnable);
    }

    @Override
    public final void onDualCameraSuccess() {
        v();
        if (this.D) {
            wa waVar = (wa) this;
            if (MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) < 2) {
                AndroidUtilities.runOnUIThread(new kh.c(waVar, 23), 340L);
            }
            sb sbVar = waVar.U;
            sbVar.B0.setValue(waVar.isDual());
            sbVar.B0.setContentDescription(LocaleController.getString(waVar.isDual() ? R.string.AccDescrDualCameraOn : R.string.AccDescrDualCameraOff));
        }
        t(true);
    }

    @Override
    public final void onError(int i10, Camera camera, CameraSessionWrapper cameraSessionWrapper) {
        if (isDual()) {
            if (!p(getContext(), false)) {
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                this.f15721a = false;
                editorEdit.putBoolean("dual_available", false).apply();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DualErrorTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DualErrorMessage);
                i0.a.C(R.string.OK, alertDialog$Builder, null);
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
        return (motionEvent.getAction() == 0 && s(motionEvent.getX(), motionEvent.getY())) ? x(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Matrix matrix = this.f15730x;
        matrix.reset();
        matrix.postTranslate(1.0f, -1.0f);
        matrix.postScale(getMeasuredWidth() / 2.0f, (-getMeasuredHeight()) / 2.0f);
        matrix.invert(this.f15731y);
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
        return super.onTouchEvent(motionEvent) || x(motionEvent);
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
        this.O = h7.y.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
        fArr[0] = 0.0f;
        fArr[1] = 1.0f;
        matrix.mapPoints(fArr);
        this.P = h7.y.a(this.L, this.M, fArr[0], fArr[1]) * 2.0f;
    }

    public final boolean s(float f10, float f11) {
        if (!isDual()) {
            return false;
        }
        float[] fArr = this.Q;
        fArr[0] = f10;
        fArr[1] = f11;
        this.f15731y.mapPoints(fArr);
        Matrix dualPosition = getDualPosition();
        Matrix matrix = this.H;
        dualPosition.invert(matrix);
        matrix.mapPoints(fArr);
        int dualShape = getDualShape() % 3;
        float f12 = (dualShape == 0 || dualShape == 1 || dualShape == 3) ? 0.5625f : 1.0f;
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
        if (isDual() || this.f15721a) {
            if (isDual()) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("dualcam", false).remove("dualmatrix").apply();
            } else {
                w();
            }
            super.toggleDual();
        }
    }

    public abstract void u(boolean z10);

    public final void v() {
        SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
        editorEdit.putBoolean("dualcam", isDual());
        if (isDual()) {
            float[] fArr = new float[9];
            getDualPosition().getValues(fArr);
            StringBuilder sb2 = new StringBuilder(108);
            sb2.append(fArr[0]);
            for (int i10 = 1; i10 < 9; i10++) {
                sb2.append(";");
                sb2.append(fArr[i10]);
            }
            editorEdit.putString("dualmatrix", sb2.toString());
        } else {
            editorEdit.remove("dualmatrix");
        }
        editorEdit.apply();
    }

    public final void w() {
        Matrix dualPosition = getDualPosition();
        dualPosition.reset();
        Matrix savedDualMatrix = getSavedDualMatrix();
        if (savedDualMatrix != null) {
            dualPosition.set(savedDualMatrix);
        } else {
            dualPosition.postConcat(this.f15730x);
            float measuredWidth = getMeasuredWidth() * 0.43f;
            float measuredHeight = getMeasuredHeight() * 0.43f;
            float fMin = Math.min(getMeasuredWidth(), getMeasuredWidth()) * 0.025f;
            dualPosition.postScale(measuredWidth / getMeasuredWidth(), measuredHeight / getMeasuredHeight());
            dualPosition.postTranslate((getMeasuredWidth() - fMin) - measuredWidth, fMin);
            dualPosition.postConcat(this.f15731y);
        }
        updateDualPosition();
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z10;
        Matrix dualPosition;
        boolean z11;
        PointF pointF;
        double dAtan2;
        float fA;
        boolean z12;
        PointF pointF2;
        float f10;
        float f11;
        float f12;
        float f13;
        int action;
        Matrix matrix;
        float f14;
        Matrix matrix2;
        float f15;
        Matrix matrix3;
        float fRound;
        float f16;
        float f17;
        float f18;
        float f19;
        boolean z13;
        float f20;
        boolean z14;
        float degrees;
        float f21;
        boolean z15;
        boolean z16;
        float f22;
        float width;
        float f23;
        b1 b1Var;
        int dualShape;
        float f24;
        float f25;
        double dSqrt;
        double dSqrt2;
        double dSqrt3;
        double dSqrt4;
        double dSqrt5;
        double dSqrt6;
        double dSqrt7;
        double dSqrt8;
        double d;
        double d10;
        double d11;
        double d12;
        boolean z17;
        if (motionEvent.getAction() == 0) {
            this.G = System.currentTimeMillis();
            this.E = motionEvent.getX();
            this.F = motionEvent.getY();
            this.J = null;
            b1 b1Var2 = this.I;
            if (b1Var2 != null) {
                AndroidUtilities.cancelRunOnUIThread(b1Var2);
                this.I = null;
            }
            if (s(this.E, this.F)) {
                b1 b1Var3 = new b1(this, 0);
                this.I = b1Var3;
                AndroidUtilities.runOnUIThread(b1Var3, ViewConfiguration.getLongPressTimeout());
                z10 = true;
            }
            if (isDual()) {
                return z10;
            }
            dualPosition = getDualPosition();
            if (motionEvent.getPointerCount() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            pointF = this.f15723c;
            if (z11) {
                pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                fA = h7.y.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                dAtan2 = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF.x = motionEvent.getX(0);
                pointF.y = motionEvent.getY(0);
                dAtan2 = 0.0d;
                fA = 0.0f;
            }
            z12 = this.f15725f;
            pointF2 = this.f15722b;
            if (z12 != z11) {
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.d = fA;
                this.f15724e = dAtan2;
                this.f15725f = z11;
            }
            f10 = pointF.x;
            f11 = pointF.y;
            f12 = pointF2.x;
            f13 = pointF2.y;
            action = motionEvent.getAction();
            matrix = this.f15726n;
            if (action == 0) {
                matrix.set(dualPosition);
                matrix.postConcat(this.f15730x);
                this.v = 0.0f;
                this.f15729w = false;
                float f26 = pointF.x;
                f14 = 0.0f;
                float f27 = pointF.y;
                if (this.R == null) {
                    this.R = new float[8];
                }
                if (this.S == null) {
                    this.S = new float[8];
                }
                dualShape = getDualShape() % 3;
                if (dualShape != 0) {
                    f24 = 1.0f;
                    if (dualShape == 1 && dualShape != 3) {
                        f25 = 1.0f;
                    }
                    float[] fArr = this.R;
                    fArr[0] = -1.0f;
                    float f28 = -f25;
                    fArr[1] = f28;
                    fArr[2] = f24;
                    fArr[3] = f28;
                    fArr[4] = f24;
                    fArr[5] = f25;
                    fArr[6] = -1.0f;
                    fArr[7] = f25;
                    matrix.mapPoints(this.S, fArr);
                    float[] fArr2 = this.S;
                    float f29 = fArr2[0] - fArr2[2];
                    float f30 = fArr2[1] - fArr2[3];
                    dSqrt = Math.sqrt((f30 * f30) + (f29 * f29));
                    float[] fArr3 = this.S;
                    float f31 = fArr3[2] - fArr3[4];
                    float f32 = fArr3[3] - fArr3[5];
                    dSqrt2 = Math.sqrt((f32 * f32) + (f31 * f31));
                    float[] fArr4 = this.S;
                    float f33 = fArr4[4] - fArr4[6];
                    float f34 = fArr4[5] - fArr4[7];
                    dSqrt3 = Math.sqrt((f34 * f34) + (f33 * f33));
                    float[] fArr5 = this.S;
                    float f35 = fArr5[6] - fArr5[0];
                    float f36 = fArr5[7] - fArr5[1];
                    dSqrt4 = Math.sqrt((f36 * f36) + (f35 * f35));
                    float[] fArr6 = this.S;
                    float f37 = fArr6[0] - f26;
                    float f38 = fArr6[1] - f27;
                    dSqrt5 = Math.sqrt((f38 * f38) + (f37 * f37));
                    float[] fArr7 = this.S;
                    float f39 = fArr7[2] - f26;
                    float f40 = fArr7[3] - f27;
                    dSqrt6 = Math.sqrt((f40 * f40) + (f39 * f39));
                    float[] fArr8 = this.S;
                    float f41 = fArr8[4] - f26;
                    float f42 = fArr8[5] - f27;
                    dSqrt7 = Math.sqrt((f42 * f42) + (f41 * f41));
                    float[] fArr9 = this.S;
                    float f43 = fArr9[6] - f26;
                    float f44 = fArr9[7] - f27;
                    dSqrt8 = Math.sqrt((f44 * f44) + (f43 * f43));
                    d = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
                    d10 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
                    d11 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
                    d12 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
                    if ((Math.sqrt((d12 - dSqrt5) * ((d12 - dSqrt8) * ((d12 - dSqrt4) * d12))) + (Math.sqrt((d11 - dSqrt8) * ((d11 - dSqrt7) * ((d11 - dSqrt3) * d11))) + (Math.sqrt((d10 - dSqrt7) * ((d10 - dSqrt6) * ((d10 - dSqrt2) * d10))) + Math.sqrt((d - dSqrt6) * ((d - dSqrt5) * ((d - dSqrt) * d)))))) - (dSqrt * dSqrt2) < 1.0d) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    this.f15728s = z17;
                } else {
                    f24 = 1.0f;
                }
                f25 = 0.5625f;
                float[] fArr10 = this.R;
                fArr10[0] = -1.0f;
                float f210 = -f25;
                fArr10[1] = f210;
                fArr10[2] = f24;
                fArr10[3] = f210;
                fArr10[4] = f24;
                fArr10[5] = f25;
                fArr10[6] = -1.0f;
                fArr10[7] = f25;
                matrix.mapPoints(this.S, fArr10);
                float[] fArr11 = this.S;
                float f211 = fArr11[0] - fArr11[2];
                float f310 = fArr11[1] - fArr11[3];
                dSqrt = Math.sqrt((f310 * f310) + (f211 * f211));
                float[] fArr12 = this.S;
                float f311 = fArr12[2] - fArr12[4];
                float f312 = fArr12[3] - fArr12[5];
                dSqrt2 = Math.sqrt((f312 * f312) + (f311 * f311));
                float[] fArr13 = this.S;
                float f313 = fArr13[4] - fArr13[6];
                float f314 = fArr13[5] - fArr13[7];
                dSqrt3 = Math.sqrt((f314 * f314) + (f313 * f313));
                float[] fArr14 = this.S;
                float f315 = fArr14[6] - fArr14[0];
                float f316 = fArr14[7] - fArr14[1];
                dSqrt4 = Math.sqrt((f316 * f316) + (f315 * f315));
                float[] fArr15 = this.S;
                float f317 = fArr15[0] - f26;
                float f318 = fArr15[1] - f27;
                dSqrt5 = Math.sqrt((f318 * f318) + (f317 * f317));
                float[] fArr16 = this.S;
                float f319 = fArr16[2] - f26;
                float f45 = fArr16[3] - f27;
                dSqrt6 = Math.sqrt((f45 * f45) + (f319 * f319));
                float[] fArr17 = this.S;
                float f46 = fArr17[4] - f26;
                float f47 = fArr17[5] - f27;
                dSqrt7 = Math.sqrt((f47 * f47) + (f46 * f46));
                float[] fArr18 = this.S;
                float f48 = fArr18[6] - f26;
                float f49 = fArr18[7] - f27;
                dSqrt8 = Math.sqrt((f49 * f49) + (f48 * f48));
                d = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
                d10 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
                d11 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
                d12 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
                if ((Math.sqrt((d12 - dSqrt5) * ((d12 - dSqrt8) * ((d12 - dSqrt4) * d12))) + (Math.sqrt((d11 - dSqrt8) * ((d11 - dSqrt7) * ((d11 - dSqrt3) * d11))) + (Math.sqrt((d10 - dSqrt7) * ((d10 - dSqrt6) * ((d10 - dSqrt2) * d10))) + Math.sqrt((d - dSqrt6) * ((d - dSqrt5) * ((d - dSqrt) * d)))))) - (dSqrt * dSqrt2) < 1.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f15728s = z17;
            } else {
                z10 = z10;
                f14 = 0.0f;
            }
            if (motionEvent.getAction() == 2 && this.f15728s) {
                if (h7.y.a(f10, f11, f12, f13) > AndroidUtilities.dp(2.0f) && (b1Var = this.I) != null) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    this.I = null;
                }
                if (motionEvent.getPointerCount() > 1) {
                    if (this.d != f14) {
                        r(matrix);
                        f22 = fA / this.d;
                        if (this.O * f22 > getWidth() * 0.7f) {
                            width = getWidth() * 0.7f;
                            f23 = this.O;
                        } else {
                            if (this.O * f22 < getWidth() * 0.2f) {
                                width = getWidth() * 0.2f;
                                f23 = this.O;
                            }
                            matrix.postScale(f22, f22, f10, f11);
                        }
                        f22 = width / f23;
                        matrix.postScale(f22, f22, f10, f11);
                    }
                    matrix2 = matrix;
                    degrees = (float) Math.toDegrees(dAtan2 - this.f15724e);
                    f21 = this.v + degrees;
                    this.v = f21;
                    if (this.h) {
                        f15 = 90.0f;
                    } else {
                        if (Math.abs(f21) > 20.0f) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.h = z15;
                        if (z15) {
                            f15 = 90.0f;
                        } else {
                            r(matrix2);
                            f15 = 90.0f;
                            if ((Math.round(this.N / 90.0f) * 90.0f) - this.N > 20.0f) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            this.h = z16;
                        }
                        if (!this.f15729w) {
                            AndroidUtilities.vibrateCursor(this);
                            this.f15729w = true;
                        }
                    }
                    if (this.h) {
                        matrix2.postRotate(degrees, f10, f11);
                    }
                } else {
                    matrix2 = matrix;
                    f15 = 90.0f;
                }
                matrix2.postTranslate(f10 - f12, f11 - f13);
                matrix3 = this.f15727r;
                matrix3.set(matrix2);
                r(matrix3);
                fRound = (Math.round(this.N / f15) * f15) - this.N;
                if (this.h) {
                    if (Math.abs(fRound) < 5.0f) {
                        matrix3.postRotate(fRound, this.L, this.M);
                        if (!this.f15729w) {
                            AndroidUtilities.vibrateCursor(this);
                            this.f15729w = true;
                        }
                    } else {
                        this.f15729w = false;
                    }
                }
                f16 = this.L;
                if (f16 < f14) {
                    f17 = 0.0f;
                    matrix3.postTranslate(-f16, 0.0f);
                } else {
                    f17 = 0.0f;
                    if (f16 > getWidth()) {
                        matrix3.postTranslate(getWidth() - this.L, 0.0f);
                    }
                }
                f18 = this.M;
                if (f18 < f17) {
                    matrix3.postTranslate(f17, -f18);
                } else if (f18 > getHeight() - AndroidUtilities.dp(150.0f)) {
                    matrix3.postTranslate(0.0f, (getHeight() - AndroidUtilities.dp(150.0f)) - this.M);
                }
                matrix3.postConcat(this.f15731y);
                dualPosition.set(matrix3);
                updateDualPosition();
                f19 = this.M;
                if (Math.min(f19, f19 - (this.P / 2.0f)) < AndroidUtilities.dp(66.0f)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                f20 = this.M;
                if (Math.max(f20, (this.P / 2.0f) + f20) > getHeight() - AndroidUtilities.dp(66.0f)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.B != z13) {
                    this.B = z13;
                    sb sbVar = ((wa) this).U;
                    sbVar.f16777k1.a(true, z13, sbVar.f16757e0);
                }
                if (this.C != z14) {
                    this.C = z14;
                    u(z14);
                }
            }
            if (motionEvent.getAction() == 1) {
                this.h = false;
                this.v = 0.0f;
                this.f15729w = false;
                invalidate();
                this.f15728s = false;
                if (this.B) {
                    this.B = false;
                    sb sbVar2 = ((wa) this).U;
                    sbVar2.f16777k1.a(true, false, sbVar2.f16757e0);
                }
                if (this.C) {
                    this.C = false;
                    u(false);
                }
            } else if (motionEvent.getAction() == 3) {
                this.f15728s = false;
                if (this.B) {
                    this.B = false;
                    sb sbVar3 = ((wa) this).U;
                    sbVar3.f16777k1.a(true, false, sbVar3.f16757e0);
                }
                if (this.C) {
                    this.C = false;
                    u(false);
                }
            }
            pointF2.x = pointF.x;
            pointF2.y = pointF.y;
            this.d = fA;
            this.f15724e = dAtan2;
            return this.f15728s || z10;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.G <= ViewConfiguration.getTapTimeout() && h7.y.a(this.E, this.F, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.dp(10.0f)) {
                if (s(this.E, this.F)) {
                    switchCamera();
                    this.J = null;
                } else {
                    this.J = new b1(this, 1);
                }
            }
            this.G = -1L;
            b1 b1Var4 = this.I;
            if (b1Var4 != null) {
                AndroidUtilities.cancelRunOnUIThread(b1Var4);
                this.I = null;
            }
        } else if (motionEvent.getAction() == 3) {
            this.G = -1L;
            this.J = null;
            b1 b1Var5 = this.I;
            if (b1Var5 != null) {
                AndroidUtilities.cancelRunOnUIThread(b1Var5);
                this.I = null;
            }
        }
        z10 = false;
        if (isDual()) {
            return z10;
        }
        dualPosition = getDualPosition();
        if (motionEvent.getPointerCount() > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        pointF = this.f15723c;
        if (z11) {
            pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            fA = h7.y.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
            dAtan2 = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
        } else {
            pointF.x = motionEvent.getX(0);
            pointF.y = motionEvent.getY(0);
            dAtan2 = 0.0d;
            fA = 0.0f;
        }
        z12 = this.f15725f;
        pointF2 = this.f15722b;
        if (z12 != z11) {
            pointF2.x = pointF.x;
            pointF2.y = pointF.y;
            this.d = fA;
            this.f15724e = dAtan2;
            this.f15725f = z11;
        }
        f10 = pointF.x;
        f11 = pointF.y;
        f12 = pointF2.x;
        f13 = pointF2.y;
        action = motionEvent.getAction();
        matrix = this.f15726n;
        if (action == 0) {
            matrix.set(dualPosition);
            matrix.postConcat(this.f15730x);
            this.v = 0.0f;
            this.f15729w = false;
            float f212 = pointF.x;
            f14 = 0.0f;
            float f213 = pointF.y;
            if (this.R == null) {
                this.R = new float[8];
            }
            if (this.S == null) {
                this.S = new float[8];
            }
            dualShape = getDualShape() % 3;
            if (dualShape != 0) {
                f24 = 1.0f;
                if (dualShape == 1) {
                }
                float[] fArr19 = this.R;
                fArr19[0] = -1.0f;
                float f214 = -f25;
                fArr19[1] = f214;
                fArr19[2] = f24;
                fArr19[3] = f214;
                fArr19[4] = f24;
                fArr19[5] = f25;
                fArr19[6] = -1.0f;
                fArr19[7] = f25;
                matrix.mapPoints(this.S, fArr19);
                float[] fArr110 = this.S;
                float f215 = fArr110[0] - fArr110[2];
                float f3110 = fArr110[1] - fArr110[3];
                dSqrt = Math.sqrt((f3110 * f3110) + (f215 * f215));
                float[] fArr111 = this.S;
                float f3111 = fArr111[2] - fArr111[4];
                float f3112 = fArr111[3] - fArr111[5];
                dSqrt2 = Math.sqrt((f3112 * f3112) + (f3111 * f3111));
                float[] fArr112 = this.S;
                float f3113 = fArr112[4] - fArr112[6];
                float f3114 = fArr112[5] - fArr112[7];
                dSqrt3 = Math.sqrt((f3114 * f3114) + (f3113 * f3113));
                float[] fArr113 = this.S;
                float f3115 = fArr113[6] - fArr113[0];
                float f3116 = fArr113[7] - fArr113[1];
                dSqrt4 = Math.sqrt((f3116 * f3116) + (f3115 * f3115));
                float[] fArr114 = this.S;
                float f3117 = fArr114[0] - f212;
                float f3118 = fArr114[1] - f213;
                dSqrt5 = Math.sqrt((f3118 * f3118) + (f3117 * f3117));
                float[] fArr115 = this.S;
                float f3119 = fArr115[2] - f212;
                float f410 = fArr115[3] - f213;
                dSqrt6 = Math.sqrt((f410 * f410) + (f3119 * f3119));
                float[] fArr116 = this.S;
                float f411 = fArr116[4] - f212;
                float f412 = fArr116[5] - f213;
                dSqrt7 = Math.sqrt((f412 * f412) + (f411 * f411));
                float[] fArr117 = this.S;
                float f413 = fArr117[6] - f212;
                float f414 = fArr117[7] - f213;
                dSqrt8 = Math.sqrt((f414 * f414) + (f413 * f413));
                d = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
                d10 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
                d11 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
                d12 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
                if ((Math.sqrt((d12 - dSqrt5) * ((d12 - dSqrt8) * ((d12 - dSqrt4) * d12))) + (Math.sqrt((d11 - dSqrt8) * ((d11 - dSqrt7) * ((d11 - dSqrt3) * d11))) + (Math.sqrt((d10 - dSqrt7) * ((d10 - dSqrt6) * ((d10 - dSqrt2) * d10))) + Math.sqrt((d - dSqrt6) * ((d - dSqrt5) * ((d - dSqrt) * d)))))) - (dSqrt * dSqrt2) < 1.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                this.f15728s = z17;
            } else {
                f24 = 1.0f;
            }
            f25 = 0.5625f;
            float[] fArr118 = this.R;
            fArr118[0] = -1.0f;
            float f216 = -f25;
            fArr118[1] = f216;
            fArr118[2] = f24;
            fArr118[3] = f216;
            fArr118[4] = f24;
            fArr118[5] = f25;
            fArr118[6] = -1.0f;
            fArr118[7] = f25;
            matrix.mapPoints(this.S, fArr118);
            float[] fArr119 = this.S;
            float f217 = fArr119[0] - fArr119[2];
            float f31110 = fArr119[1] - fArr119[3];
            dSqrt = Math.sqrt((f31110 * f31110) + (f217 * f217));
            float[] fArr1110 = this.S;
            float f31111 = fArr1110[2] - fArr1110[4];
            float f31112 = fArr1110[3] - fArr1110[5];
            dSqrt2 = Math.sqrt((f31112 * f31112) + (f31111 * f31111));
            float[] fArr1111 = this.S;
            float f31113 = fArr1111[4] - fArr1111[6];
            float f31114 = fArr1111[5] - fArr1111[7];
            dSqrt3 = Math.sqrt((f31114 * f31114) + (f31113 * f31113));
            float[] fArr1112 = this.S;
            float f31115 = fArr1112[6] - fArr1112[0];
            float f31116 = fArr1112[7] - fArr1112[1];
            dSqrt4 = Math.sqrt((f31116 * f31116) + (f31115 * f31115));
            float[] fArr1113 = this.S;
            float f31117 = fArr1113[0] - f212;
            float f31118 = fArr1113[1] - f213;
            dSqrt5 = Math.sqrt((f31118 * f31118) + (f31117 * f31117));
            float[] fArr1114 = this.S;
            float f31119 = fArr1114[2] - f212;
            float f415 = fArr1114[3] - f213;
            dSqrt6 = Math.sqrt((f415 * f415) + (f31119 * f31119));
            float[] fArr1115 = this.S;
            float f416 = fArr1115[4] - f212;
            float f417 = fArr1115[5] - f213;
            dSqrt7 = Math.sqrt((f417 * f417) + (f416 * f416));
            float[] fArr1116 = this.S;
            float f418 = fArr1116[6] - f212;
            float f419 = fArr1116[7] - f213;
            dSqrt8 = Math.sqrt((f419 * f419) + (f418 * f418));
            d = ((dSqrt + dSqrt5) + dSqrt6) / 2.0d;
            d10 = ((dSqrt2 + dSqrt6) + dSqrt7) / 2.0d;
            d11 = ((dSqrt3 + dSqrt7) + dSqrt8) / 2.0d;
            d12 = ((dSqrt4 + dSqrt8) + dSqrt5) / 2.0d;
            if ((Math.sqrt((d12 - dSqrt5) * ((d12 - dSqrt8) * ((d12 - dSqrt4) * d12))) + (Math.sqrt((d11 - dSqrt8) * ((d11 - dSqrt7) * ((d11 - dSqrt3) * d11))) + (Math.sqrt((d10 - dSqrt7) * ((d10 - dSqrt6) * ((d10 - dSqrt2) * d10))) + Math.sqrt((d - dSqrt6) * ((d - dSqrt5) * ((d - dSqrt) * d)))))) - (dSqrt * dSqrt2) < 1.0d) {
                z17 = true;
            } else {
                z17 = false;
            }
            this.f15728s = z17;
        } else {
            z10 = z10;
            f14 = 0.0f;
        }
        if (motionEvent.getAction() == 2) {
            if (h7.y.a(f10, f11, f12, f13) > AndroidUtilities.dp(2.0f)) {
                AndroidUtilities.cancelRunOnUIThread(b1Var);
                this.I = null;
            }
            if (motionEvent.getPointerCount() > 1) {
                if (this.d != f14) {
                    r(matrix);
                    f22 = fA / this.d;
                    if (this.O * f22 > getWidth() * 0.7f) {
                        width = getWidth() * 0.7f;
                        f23 = this.O;
                    } else {
                        if (this.O * f22 < getWidth() * 0.2f) {
                            width = getWidth() * 0.2f;
                            f23 = this.O;
                        }
                        matrix.postScale(f22, f22, f10, f11);
                    }
                    f22 = width / f23;
                    matrix.postScale(f22, f22, f10, f11);
                }
                matrix2 = matrix;
                degrees = (float) Math.toDegrees(dAtan2 - this.f15724e);
                f21 = this.v + degrees;
                this.v = f21;
                if (this.h) {
                    if (Math.abs(f21) > 20.0f) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    this.h = z15;
                    if (z15) {
                        r(matrix2);
                        f15 = 90.0f;
                        if ((Math.round(this.N / 90.0f) * 90.0f) - this.N > 20.0f) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        this.h = z16;
                    } else {
                        f15 = 90.0f;
                    }
                    if (!this.f15729w) {
                        AndroidUtilities.vibrateCursor(this);
                        this.f15729w = true;
                    }
                } else {
                    f15 = 90.0f;
                }
                if (this.h) {
                    matrix2.postRotate(degrees, f10, f11);
                }
            } else {
                matrix2 = matrix;
                f15 = 90.0f;
            }
            matrix2.postTranslate(f10 - f12, f11 - f13);
            matrix3 = this.f15727r;
            matrix3.set(matrix2);
            r(matrix3);
            fRound = (Math.round(this.N / f15) * f15) - this.N;
            if (this.h) {
                if (Math.abs(fRound) < 5.0f) {
                    matrix3.postRotate(fRound, this.L, this.M);
                    if (!this.f15729w) {
                        AndroidUtilities.vibrateCursor(this);
                        this.f15729w = true;
                    }
                } else {
                    this.f15729w = false;
                }
            }
            f16 = this.L;
            if (f16 < f14) {
                f17 = 0.0f;
                matrix3.postTranslate(-f16, 0.0f);
            } else {
                f17 = 0.0f;
                if (f16 > getWidth()) {
                    matrix3.postTranslate(getWidth() - this.L, 0.0f);
                }
            }
            f18 = this.M;
            if (f18 < f17) {
                matrix3.postTranslate(f17, -f18);
            } else if (f18 > getHeight() - AndroidUtilities.dp(150.0f)) {
                matrix3.postTranslate(0.0f, (getHeight() - AndroidUtilities.dp(150.0f)) - this.M);
            }
            matrix3.postConcat(this.f15731y);
            dualPosition.set(matrix3);
            updateDualPosition();
            f19 = this.M;
            if (Math.min(f19, f19 - (this.P / 2.0f)) < AndroidUtilities.dp(66.0f)) {
                z13 = true;
            } else {
                z13 = false;
            }
            f20 = this.M;
            if (Math.max(f20, (this.P / 2.0f) + f20) > getHeight() - AndroidUtilities.dp(66.0f)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.B != z13) {
                this.B = z13;
                sb sbVar4 = ((wa) this).U;
                sbVar4.f16777k1.a(true, z13, sbVar4.f16757e0);
            }
            if (this.C != z14) {
                this.C = z14;
                u(z14);
            }
        }
        if (motionEvent.getAction() == 1) {
            this.h = false;
            this.v = 0.0f;
            this.f15729w = false;
            invalidate();
            this.f15728s = false;
            if (this.B) {
                this.B = false;
                sb sbVar5 = ((wa) this).U;
                sbVar5.f16777k1.a(true, false, sbVar5.f16757e0);
            }
            if (this.C) {
                this.C = false;
                u(false);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f15728s = false;
            if (this.B) {
                this.B = false;
                sb sbVar6 = ((wa) this).U;
                sbVar6.f16777k1.a(true, false, sbVar6.f16757e0);
            }
            if (this.C) {
                this.C = false;
                u(false);
            }
        }
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        this.d = fA;
        this.f15724e = dAtan2;
        if (this.f15728s) {
            return true;
        }
    }
}
