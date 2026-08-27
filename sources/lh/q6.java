package lh;

import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.un;

public abstract class q6 extends FrameLayout {

    public static final int f16557x0 = 0;
    public e0 A;
    public cc B;
    public final org.telegram.ui.Components.z9 C;
    public final p6 D;
    public long E;
    public long F;
    public final m6 G;
    public final m6 H;
    public final m6 I;
    public s9 J;
    public boolean K;
    public final org.telegram.ui.Components.y5 L;
    public final Paint M;
    public Drawable N;
    public Drawable O;
    public final Paint P;
    public int Q;
    public int R;
    public final Matrix S;
    public final float[] T;
    public float U;
    public float V;
    public float W;

    public Bitmap f16558a;

    public boolean f16559a0;

    public final Rect f16560b;

    public final org.telegram.ui.Components.y5 f16561b0;

    public final Rect f16562c;

    public boolean f16563c0;
    public z7 d;

    public final Matrix f16564d0;

    public m61 f16565e;

    public final Matrix f16566e0;

    public int f16567f;

    public final Matrix f16568f0;

    public boolean f16569g0;
    public int h;

    public final PointF f16570h0;

    public final PointF f16571i0;

    public float f16572j0;

    public double f16573k0;

    public boolean f16574l0;
    public boolean m0;

    public a61 f16575n;

    public boolean f16576n0;

    public final Matrix f16577o0;

    public final Matrix f16578p0;

    public float f16579q0;

    public TextureView f16580r;

    public boolean f16581r0;

    public ve0 f16582s;

    public boolean f16583s0;

    public long f16584t0;

    public Runnable f16585u0;
    public s9 v;

    public final HashSet f16586v0;

    public zf.c2 f16587w;

    public j0 f16588w0;

    public m61 f16589x;

    public m61 f16590y;

    public q6(Context context, org.telegram.ui.Components.z9 z9Var, p6 p6Var) {
        super(context);
        this.f16560b = new Rect();
        this.f16562c = new Rect();
        Paint paint = new Paint(1);
        new m6(this, 2);
        this.G = new m6(this, 3);
        this.H = new m6(this, 4);
        this.I = new m6(this, 5);
        this.L = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.M = new Paint(7);
        this.P = new Paint(1);
        this.S = new Matrix();
        this.T = new float[2];
        this.f16559a0 = true;
        this.f16561b0 = new org.telegram.ui.Components.y5(this, 0L, 320L, er.f28123g);
        this.f16563c0 = false;
        this.f16564d0 = new Matrix();
        this.f16566e0 = new Matrix();
        this.f16568f0 = new Matrix();
        this.f16569g0 = true;
        this.f16570h0 = new PointF();
        this.f16571i0 = new PointF();
        this.f16577o0 = new Matrix();
        this.f16578p0 = new Matrix();
        this.f16586v0 = new HashSet();
        this.C = z9Var;
        this.D = p6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(q6 q6Var, z7 z7Var) {
        long j10;
        String str;
        Bitmap[] bitmapArr = new Bitmap[1];
        boolean[] zArr = {true};
        if (z7Var != null) {
            int measuredWidth = q6Var.getMeasuredWidth() <= 0 ? AndroidUtilities.displaySize.x : q6Var.getMeasuredWidth();
            int i10 = (int) ((measuredWidth * 16) / 9.0f);
            if (z7Var.K) {
                Bitmap bitmap = z7Var.M0;
                if (bitmap != null) {
                    bitmapArr[0] = bitmap;
                }
                if (bitmapArr[0] == null && (str = z7Var.N) != null && str.startsWith("vthumb://")) {
                    j10 = Long.parseLong(z7Var.N.substring(9));
                    if (bitmapArr[0] == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            bitmapArr[0] = q6Var.getContext().getContentResolver().loadThumbnail(z7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j10) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j10), new Size(measuredWidth, i10), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    j10 = -1;
                }
            } else {
                j10 = -1;
            }
            long j11 = j10;
            if (j11 < 0 && z7Var.K && z7Var.N == null) {
                q6Var.invalidate();
                return;
            }
            if (bitmapArr[0] == null) {
                File file = z7Var.Z0;
                if (file == null) {
                    file = z7Var.L;
                }
                if (file == null) {
                    return;
                }
                a9.d dVar = new a9.d(q6Var, z7Var, j11, file.getPath(), 4);
                boolean z10 = z7Var.K;
                bitmapArr[0] = z7.q(dVar, measuredWidth, i10, !z10 ? z7Var.Q : 0, !z10);
                zArr[0] = false;
            }
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(q6Var, bitmapArr, z7Var, zArr, 15));
    }

    public static Drawable e(Drawable drawable, int i10, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z10);
    }

    public static Drawable f(Drawable drawable, int i10, TLRPC.WallPaper wallPaper, boolean z10) {
        org.telegram.ui.ActionBar.f6 f6VarN0;
        SparseIntArray sparseIntArray;
        String[] strArr;
        String str;
        SparseIntArray sparseIntArrayQ0;
        int[] iArr;
        org.telegram.ui.ActionBar.e6 e6VarK;
        int i11;
        af.h hVarH;
        BitmapDrawable bitmapDrawable;
        int i12;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return un.d(drawable, wallPaper, z10);
        }
        org.telegram.ui.ActionBar.b4 theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i10).getTheme(of.b.d(wallPaper.settings.emoticon));
        if (theme != null) {
            return g(i10, theme, z10);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
        if (string.equals(string2)) {
            if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            if (z10) {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
            } else {
                f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
            }
            sparseIntArray = new SparseIntArray();
            strArr = new String[1];
            str = f6VarN0.d;
            if (str != null) {
                sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(null, str, strArr);
            } else {
                sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(new File(f6VarN0.f22943b), null, strArr);
            }
            iArr = org.telegram.ui.ActionBar.g6.nl;
            if (iArr != null) {
                for (i12 = 0; i12 < iArr.length; i12++) {
                    sparseIntArray.put(i12, iArr[i12]);
                }
            }
            e6VarK = f6VarN0.k(false);
            if (e6VarK != null) {
                e6VarK.c(sparseIntArrayQ0, sparseIntArray);
            } else {
                for (i11 = 0; i11 < sparseIntArrayQ0.size(); i11++) {
                    sparseIntArray.put(sparseIntArrayQ0.keyAt(i11), sparseIntArrayQ0.valueAt(i11));
                }
            }
            hVarH = org.telegram.ui.ActionBar.g6.H(f6VarN0, sparseIntArray, strArr[0], 0, true);
            bitmapDrawable = (BitmapDrawable) hVarH.f275b;
            if (bitmapDrawable != null) {
                return bitmapDrawable;
            }
            return (Drawable) hVarH.f274a;
        }
        str3 = string2;
        str2 = string;
        if (z10) {
            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str3);
        } else {
            f6VarN0 = org.telegram.ui.ActionBar.g6.N0(str2);
        }
        sparseIntArray = new SparseIntArray();
        strArr = new String[1];
        str = f6VarN0.d;
        if (str != null) {
            sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(null, str, strArr);
        } else {
            sparseIntArrayQ0 = org.telegram.ui.ActionBar.g6.Q0(new File(f6VarN0.f22943b), null, strArr);
        }
        iArr = org.telegram.ui.ActionBar.g6.nl;
        if (iArr != null) {
            while (i12 < iArr.length) {
                sparseIntArray.put(i12, iArr[i12]);
            }
        }
        e6VarK = f6VarN0.k(false);
        if (e6VarK != null) {
            e6VarK.c(sparseIntArrayQ0, sparseIntArray);
        } else {
            while (i11 < sparseIntArrayQ0.size()) {
                sparseIntArray.put(sparseIntArrayQ0.keyAt(i11), sparseIntArrayQ0.valueAt(i11));
            }
        }
        hVarH = org.telegram.ui.ActionBar.g6.H(f6VarN0, sparseIntArray, strArr[0], 0, true);
        bitmapDrawable = (BitmapDrawable) hVarH.f275b;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        return (Drawable) hVarH.f274a;
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.b4 b4Var, final boolean z10) {
        if (b4Var.m()) {
            org.telegram.ui.ActionBar.g6.H(org.telegram.ui.ActionBar.b4.e(z10), b4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var.f22784f.get(z10 ? 1 : 0)).f22715g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray sparseIntArrayH = b4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.g6.Nd;
        int i12 = sparseIntArrayH.get(i11, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.g6.Od;
        int i14 = sparseIntArrayH.get(i13, org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.g6.Pd;
        int i16 = sparseIntArrayH.get(i15, org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.g6.Qd;
        int i18 = sparseIntArrayH.get(i17, org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        final nb0 nb0Var = new nb0();
        nb0Var.f30926g = false;
        nb0Var.t(nb0Var.f30939u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        nb0Var.o(i12, i14, i16, i18, 0, true);
        nb0Var.v(0);
        final int iF = nb0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long jLongValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((mf.a) pair.second).f18037b;
                org.telegram.ui.ActionBar.b4 b4Var2 = b4Var;
                if (jLongValue != b4Var2.i(z10 ? 1 : 0) || bitmap == null) {
                    return;
                }
                int i19 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                nb0 nb0Var2 = nb0Var;
                nb0Var2.t(bitmap, i19);
                nb0Var2.u(iF);
                nb0Var2.s(1.0f);
            }

            @Override
            public final void onError(Throwable th) {
                org.telegram.tgnet.k.a(this, th);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.k.b(this, tL_error);
            }
        });
        return nb0Var;
    }

    private void setupCollage(z7 z7Var) {
        cc ccVar = this.B;
        if (ccVar != null) {
            ccVar.setCollage(z7Var != null ? z7Var.T : null);
        }
    }

    private void setupImage(z7 z7Var) {
        Utilities.searchQueue.postRunnable(new jh.p6(24, this, z7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        z7 z7Var;
        m61 m61Var = this.f16565e;
        float f12 = 0.0f;
        if (m61Var != null) {
            if (this.K || ((z7Var = this.d) != null && z7Var.Y)) {
                f11 = 0.0f;
            } else {
                f11 = z7Var != null ? z7Var.P : 1.0f;
            }
            m61Var.X(f11);
        }
        m61 m61Var2 = this.f16589x;
        if (m61Var2 != null) {
            if (this.K) {
                f10 = 0.0f;
            } else {
                z7 z7Var2 = this.d;
                f10 = z7Var2 != null ? z7Var2.f17236u0 : 1.0f;
            }
            m61Var2.X(f10);
        }
        m61 m61Var3 = this.f16590y;
        if (m61Var3 != null) {
            if (!this.K) {
                z7 z7Var3 = this.d;
                f12 = z7Var3 != null ? z7Var3.G : 1.0f;
            }
            m61Var3.X(f12);
        }
        e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.setMuted(this.K);
        }
    }

    public final void d(Matrix matrix) {
        z7 z7Var = this.d;
        if (z7Var == null) {
            return;
        }
        float f10 = z7Var.f17217k0 / 2.0f;
        float[] fArr = this.T;
        fArr[0] = f10;
        fArr[1] = z7Var.f17219l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.U = fArr[0];
        this.V = fArr[1];
        z7 z7Var2 = this.d;
        fArr[0] = z7Var2.f17217k0;
        fArr[1] = z7Var2.f17219l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.W = (float) Math.toDegrees(Math.atan2(fArr[1] - this.V, fArr[0] - this.U));
        h7.y.a(this.U, this.V, fArr[0], fArr[1]);
        z7 z7Var3 = this.d;
        fArr[0] = z7Var3.f17217k0 / 2.0f;
        fArr[1] = z7Var3.f17219l0;
        matrix.mapPoints(fArr);
        h7.y.a(this.U, this.V, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.O != null) {
            if (this.f16563c0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.O;
            float fD = ((drawable instanceof nb0) && ((nb0) drawable).f30939u == null) ? 0.0f : this.L.d(1.0f, false);
            Drawable drawable2 = this.N;
            if (drawable2 != null && fD < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - fD) * 255.0f));
                z7.j(canvas, this.N, getWidth(), getHeight());
            }
            this.O.setAlpha((int) (fD * 255.0f));
            z7.j(canvas, this.O, getWidth(), getHeight());
            if (this.f16563c0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.P);
        }
        j0 j0Var = this.f16588w0;
        if (j0Var != null) {
            j0Var.d.b(canvas2, true);
        } else if (this.f16559a0 && this.d != null && !j()) {
            float fE = this.f16561b0.e(this.f16558a == null);
            if (this.f16558a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f17213i0, getHeight() / this.d.f17215j0);
                canvas2.concat(this.d.f17222n0);
                z7 z7Var = this.d;
                if (z7Var.m0 != null) {
                    canvas2.translate(z7Var.f17217k0 / 2.0f, z7Var.f17219l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    z7 z7Var2 = this.d;
                    int i10 = z7Var2.f17217k0;
                    int i11 = z7Var2.f17219l0;
                    int i12 = z7Var2.Q;
                    MediaController.CropState cropState = z7Var2.m0;
                    if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f10 = cropState.cropPw;
                    float f11 = cropState.cropPh;
                    float f12 = i10;
                    float f13 = i11;
                    canvas2.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.cropScale;
                    canvas2.scale(f14, f14);
                    MediaController.CropState cropState2 = this.d.m0;
                    canvas2.translate(cropState2.cropPx * f12, cropState2.cropPy * f13);
                    MediaController.CropState cropState3 = this.d.m0;
                    canvas2.rotate(cropState3.cropRotate + cropState3.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    z7 z7Var3 = this.d;
                    canvas2.translate((-z7Var3.f17217k0) / 2.0f, (-z7Var3.f17219l0) / 2.0f);
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((1.0f - fE) * 255.0f));
                int width = this.f16558a.getWidth();
                int height = this.f16558a.getHeight();
                Rect rect = this.f16560b;
                rect.set(0, 0, width, height);
                z7 z7Var4 = this.d;
                int i13 = z7Var4.f17217k0;
                int i14 = z7Var4.f17219l0;
                Rect rect2 = this.f16562c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f16558a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        Runnable runnable;
        boolean zV = v(motionEvent);
        sb sbVar = ((hb) this).f16082y0;
        ib ibVar = sbVar.Y0;
        if (ibVar == null || !ibVar.K1) {
            te0 te0Var = sbVar.f16823y1;
            mb0 mb0Var = te0Var.E;
            if (te0Var.v && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    te0Var.f32760y = false;
                    te0Var.A = System.currentTimeMillis();
                    te0Var.B = motionEvent.getX();
                    te0Var.C = motionEvent.getY();
                    ve0 ve0Var = te0Var.f32758w;
                    if (ve0Var != null) {
                        te0Var.D = ve0Var.getEnhanceValue();
                    }
                } else if (action == 2) {
                    float x8 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (!te0Var.f32760y && System.currentTimeMillis() - te0Var.A <= ViewConfiguration.getLongPressTimeout() && Math.abs(te0Var.C - y10) < Math.abs(te0Var.B - x8) && Math.abs(te0Var.B - x8) > AndroidUtilities.touchSlop) {
                        te0Var.f32760y = true;
                        AndroidUtilities.cancelRunOnUIThread(mb0Var);
                        te0Var.f32756r = true;
                        te0Var.invalidate();
                    }
                    if (te0Var.f32760y) {
                        float f10 = x8 - te0Var.B;
                        if (te0Var.f32758w == null) {
                            te0Var.f32759x.run();
                        }
                        ve0 ve0Var2 = te0Var.f32758w;
                        if (ve0Var2 == null) {
                            te0Var.f32760y = false;
                        } else {
                            float f11 = AndroidUtilities.displaySize.x * 0.8f;
                            float enhanceValue = ve0Var2.getEnhanceValue();
                            float fClamp = Utilities.clamp((f10 / f11) + enhanceValue, 1.0f, 0.0f);
                            int iRound = Math.round(fClamp * 100.0f);
                            int iRound2 = Math.round(enhanceValue * 100.0f);
                            int iRound3 = Math.round(te0Var.D * 100.0f);
                            if (iRound == iRound2 || !(iRound == 100 || iRound == 0)) {
                                if (Math.abs(iRound - iRound3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                    AndroidUtilities.vibrateCursor(te0Var);
                                    te0Var.D = fClamp;
                                }
                            } else {
                                try {
                                    te0Var.performHapticFeedback(3, 1);
                                } catch (Exception unused) {
                                }
                                te0Var.D = fClamp;
                            }
                            te0Var.f32758w.setEnhanceValue(fClamp);
                            ve0 ve0Var3 = te0Var.f32758w;
                            StaticLayout staticLayout = new StaticLayout("" + Math.round((ve0Var3 == null ? 0.0f : ve0Var3.getEnhanceValue()) * 100.0f), te0Var.f32751b, te0Var.getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            te0Var.f32754f = staticLayout;
                            te0Var.h = staticLayout.getLineCount() > 0 ? te0Var.f32754f.getLineWidth(0) : 0.0f;
                            te0Var.f32755n = te0Var.f32754f.getLineCount() > 0 ? te0Var.f32754f.getLineLeft(0) : 0.0f;
                            te0Var.invalidate();
                            te0Var.B = x8;
                            te0Var.C = y10;
                        }
                    } else {
                        te0Var.B = x8;
                        te0Var.C = y10;
                    }
                } else if (action == 1 || action == 3) {
                    te0Var.f32760y = false;
                    te0Var.A = -1L;
                    ve0 ve0Var4 = te0Var.f32758w;
                    if (ve0Var4 != null) {
                        te0Var.D = ve0Var4.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(mb0Var, 600L);
                }
            } else if (te0Var.f32756r) {
                te0Var.f32756r = false;
                te0Var.invalidate();
            }
            z10 = zV;
        } else if (zV) {
        }
        if (motionEvent.getAction() == 0) {
            this.f16584t0 = System.currentTimeMillis();
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f16584t0 <= ViewConfiguration.getTapTimeout() && (runnable = this.f16585u0) != null) {
                runnable.run();
            }
            this.f16584t0 = 0L;
        } else if (motionEvent.getAction() == 3) {
            this.f16584t0 = 0L;
        }
        if (!z10) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() <= 1) {
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z7 z7Var;
        z7 z7Var2;
        a61 a61Var = this.f16575n;
        if (view == a61Var && (z7Var2 = this.d) != null && z7Var2.f17235u) {
            return false;
        }
        if ((view != a61Var && view != this.f16580r) || (z7Var = this.d) == null || z7Var.m0 == null) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.scale(getWidth() / this.d.f17213i0, getHeight() / this.d.f17215j0);
        canvas.concat(this.d.f17222n0);
        z7 z7Var3 = this.d;
        if (z7Var3.m0 != null) {
            canvas.translate(z7Var3.f17217k0 / 2.0f, z7Var3.f17219l0 / 2.0f);
            canvas.rotate(-this.d.Q);
            z7 z7Var4 = this.d;
            int i10 = z7Var4.f17217k0;
            int i11 = z7Var4.f17219l0;
            int i12 = z7Var4.Q;
            MediaController.CropState cropState = z7Var4.m0;
            if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                i11 = i10;
                i10 = i11;
            }
            float f10 = cropState.cropPw;
            float f11 = cropState.cropPh;
            canvas.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (i10 * f10) / 2.0f, (i11 * f11) / 2.0f);
            canvas.rotate(this.d.Q);
            z7 z7Var5 = this.d;
            canvas.translate((-z7Var5.f17217k0) / 2.0f, (-z7Var5.f17219l0) / 2.0f);
        }
        canvas.concat(this.f16564d0);
        canvas.scale(1.0f / (getWidth() / this.d.f17213i0), 1.0f / (getHeight() / this.d.f17215j0));
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    public int getContentHeight() {
        z7 z7Var = this.d;
        if (z7Var == null) {
            return 1;
        }
        return z7Var.f17219l0;
    }

    public int getContentWidth() {
        z7 z7Var = this.d;
        if (z7Var == null) {
            return 1;
        }
        return z7Var.f17217k0;
    }

    public long getCurrentPosition() {
        m61 m61Var = this.f16565e;
        if (m61Var != null) {
            return m61Var.o();
        }
        m61 m61Var2 = this.f16589x;
        if (m61Var2 != null) {
            return m61Var2.o();
        }
        m61 m61Var3 = this.f16590y;
        if (m61Var3 != null) {
            return m61Var3.o();
        }
        return 0L;
    }

    public long getDuration() {
        z7 z7Var = this.d;
        if (z7Var != null) {
            double d = z7Var.f17212i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        m61 m61Var = this.f16565e;
        if (m61Var == null || m61Var.q() == -9223372036854775807L) {
            return 1L;
        }
        return this.f16565e.q();
    }

    public int getOrientation() {
        z7 z7Var = this.d;
        if (z7Var == null) {
            return 0;
        }
        return z7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.d == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.d.f17213i0), Integer.valueOf(this.d.f17215j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f16558a;
    }

    public a61 getTextureView() {
        return this.f16575n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        a61 a61Var;
        int iDp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int iDp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int iDp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (a61Var = this.f16575n) != null) {
                    bitmapArr[i10] = a61Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i10] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i10] = Bitmap.createBitmap(iDp, iDp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i10]);
                    canvas.save();
                    float fMax = Math.max(iDp / viewArr[i10].getWidth(), iDp2 / viewArr[i10].getHeight());
                    canvas.scale(fMax, fMax);
                    viewArr[i10].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new l6(iDp, iDp2, iDp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        z7 z7Var;
        return (this.A == null || (z7Var = this.d) == null || !z7Var.v()) ? false : true;
    }

    public final boolean k() {
        return !this.f16586v0.contains(-9982);
    }

    public final void l(z7 z7Var) {
        this.d = z7Var;
        if (z7Var == null) {
            setupImage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (z7Var.K) {
            setupImage(z7Var);
            if (z7Var.A0 == 0 && z7Var.B0 == 0) {
                z7Var.z(new m6((hb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(z7Var);
            r();
        }
        b();
        u(z7Var);
        p(z7Var, false);
        s(z7Var, null, false);
    }

    public final void m(long j10) {
        m61 m61Var = this.f16565e;
        if (m61Var != null) {
            m61Var.M(j10, false);
        } else if (j()) {
            this.A.m(j10, false);
        } else {
            m61 m61Var2 = this.f16589x;
            if (m61Var2 != null) {
                m61Var2.M(j10, false);
            } else {
                m61 m61Var3 = this.f16590y;
                if (m61Var3 != null) {
                    m61Var3.M(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(z7 z7Var, y9 y9Var, long j10) {
        this.d = z7Var;
        if (z7Var == null) {
            t(null, y9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (z7Var.v()) {
            setupImage(null);
            t(null, y9Var, j10);
            setupCollage(z7Var);
        } else if (z7Var.K) {
            setupImage(z7Var);
            setupCollage(null);
            t(z7Var, y9Var, j10);
            if (z7Var.A0 == 0 && z7Var.B0 == 0) {
                z7Var.z(new m6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, y9Var, 0L);
            setupImage(z7Var);
            r();
        }
        b();
        u(z7Var);
        p(z7Var, false);
        s(z7Var, null, false);
    }

    public final void o(TextureView textureView, ve0 ve0Var) {
        TextureView textureView2 = this.f16580r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f16580r = null;
        }
        this.f16582s = ve0Var;
        this.f16580r = textureView;
        if (ve0Var != null) {
            int i10 = this.Q;
            int i11 = this.R;
            jz jzVar = ve0Var.f33390h0;
            if (jzVar != null) {
                jzVar.i(i10, i11);
            } else {
                ve0Var.F0 = i10;
                ve0Var.G0 = i11;
            }
        }
        TextureView textureView3 = this.f16580r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f16569g0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        v(motionEvent);
        return true;
    }

    public final void p(z7 z7Var, boolean z10) {
        boolean z11;
        m61 m61Var = this.f16590y;
        if (m61Var != null) {
            m61Var.C();
            this.f16590y.I();
            this.f16590y = null;
        }
        if (z7Var == null) {
            return;
        }
        cc ccVar = this.B;
        boolean z12 = false;
        if (ccVar != null) {
            String str = z7Var.f17242y;
            String str2 = z7Var.A;
            String str3 = z7Var.B;
            long j10 = z7Var.C;
            long j11 = z7Var.D;
            float f10 = z7Var.E;
            float f11 = z7Var.F;
            float f12 = z7Var.G;
            if (!TextUtils.equals(ccVar.K, str)) {
                vb vbVar = ccVar.T;
                if (vbVar != null) {
                    vbVar.a();
                    ccVar.T = null;
                    ccVar.Q = false;
                }
                ccVar.K = str;
                ccVar.p();
            }
            ccVar.K = str;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            ccVar.J = !zIsEmpty;
            if (zIsEmpty) {
                ccVar.L = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (ccVar.J) {
                ccVar.N = j10;
                ccVar.M = j11 - ((long) (j10 * f10));
                ccVar.O = f10;
                ccVar.P = f11;
                ccVar.R = f12;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, ccVar.H0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ccVar.I0 = staticLayout;
                    ccVar.J0 = staticLayout.getLineCount() > 0 ? ccVar.I0.getLineWidth(0) : 0.0f;
                    ccVar.K0 = ccVar.I0.getLineCount() > 0 ? ccVar.I0.getLineLeft(0) : 0.0f;
                } else {
                    ccVar.J0 = 0.0f;
                    ccVar.I0 = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, ccVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    ccVar.M0 = staticLayout2;
                    ccVar.N0 = staticLayout2.getLineCount() > 0 ? ccVar.M0.getLineWidth(0) : 0.0f;
                    ccVar.O0 = ccVar.M0.getLineCount() > 0 ? ccVar.M0.getLineLeft(0) : 0.0f;
                } else {
                    ccVar.N0 = 0.0f;
                    ccVar.M0 = null;
                }
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = true;
                ccVar.f15765a0.f(ccVar.J, true);
            }
            ccVar.invalidate();
        } else {
            z11 = true;
        }
        if (z7Var.f17242y != null) {
            m61 m61Var2 = new m61();
            this.f16590y = m61Var2;
            m61Var2.f30605y = z11;
            m61Var2.F = new a9.i(this, 26);
            m61Var2.E(Uri.fromFile(new File(z7Var.f17242y)), "other");
            c();
            if (this.f16565e != null && getDuration() > 0) {
                long duration = (long) (z7Var.Z * getDuration());
                this.f16565e.M(duration, false);
                this.B.setProgress(duration);
            }
            w(true);
        }
        sb sbVar = ((hb) this).f16082y0;
        va vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            z7 z7Var2 = sbVar.G1;
            if (z7Var2 != null && z7Var2.f17242y != null) {
                z12 = true;
            }
            vaVar.setHasAudio(z12);
        }
    }

    public final void q(MessageObject messageObject) {
        z7 z7Var;
        long duration;
        z7 z7Var2 = this.d;
        if (z7Var2 != null) {
            z7Var2.f17214j = true;
            if (messageObject == null || messageObject.messageOwner == null) {
                z7Var2.f17242y = null;
                z7Var2.f17244z = null;
                z7Var2.A = null;
                z7Var2.B = null;
                z7Var2.D = 0L;
                z7Var2.C = 0L;
                z7Var2.E = 0.0f;
                z7Var2.F = 1.0f;
            } else {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f22386id != 0) {
                    this.d.f17244z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f17244z;
                    inputDocument.f22392id = document.f22386id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach == null || !pathToAttach.exists()) {
                            z7 z7Var3 = this.d;
                            z7Var3.f17242y = null;
                            z7Var3.f17244z = null;
                            z7Var3.A = null;
                            z7Var3.B = null;
                            z7Var3.D = 0L;
                            z7Var3.C = 0L;
                            z7Var3.E = 0.0f;
                            z7Var3.F = 1.0f;
                            return;
                        }
                        this.d.f17242y = pathToAttach.getAbsolutePath();
                    }
                    this.d.f17242y = pathToAttach.getAbsolutePath();
                } else {
                    this.d.f17242y = messageObject.messageOwner.attachPath;
                }
                z7 z7Var4 = this.d;
                z7Var4.A = null;
                z7Var4.B = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i11);
                        i11++;
                        TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                            this.d.A = documentAttribute2.performer;
                            if (!TextUtils.isEmpty(documentAttribute2.title)) {
                                this.d.B = documentAttribute2.title;
                            }
                            this.d.C = (long) (documentAttribute2.duration * 1000.0d);
                            break;
                        }
                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                            this.d.B = documentAttribute2.file_name;
                        }
                    }
                }
                z7 z7Var5 = this.d;
                z7Var5.D = 0L;
                if (z7Var5.K) {
                    z7Var5.D = (long) (z7Var5.Z * getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.A.h;
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            z7 z7Var6 = ((d0) obj).f15846n;
                            if (z7Var6 != null && z7Var6.K) {
                                duration = this.A.getDuration();
                            }
                        } else {
                            z7Var = this.d;
                            if (z7Var.K) {
                                duration = getDuration();
                            } else {
                                duration = z7Var.C;
                            }
                        }
                    }
                } else {
                    z7Var = this.d;
                    if (z7Var.K) {
                        duration = getDuration();
                    } else {
                        duration = z7Var.C;
                    }
                }
                cc ccVar = this.B;
                int maxCount = ccVar == null ? 1 : ccVar.getMaxCount();
                z7 z7Var7 = this.d;
                z7Var7.F = z7Var7.C != 0 ? Math.min(1.0f, Math.min(duration, ((long) maxCount) * 59000) / this.d.C) : 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        if (this.d == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        z7 z7Var = this.d;
        int i10 = z7Var.A0;
        Paint paint = this.P;
        if (i10 == 0 || z7Var.B0 == 0) {
            Bitmap bitmap = this.f16558a;
            if (bitmap != null) {
                new o6(this, measuredHeight, 0).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f10 = measuredHeight;
            z7 z7Var2 = this.d;
            int i11 = z7Var2.A0;
            this.Q = i11;
            int i12 = z7Var2.B0;
            this.R = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            a61 a61Var = this.f16575n;
            if (a61Var != null) {
                int i13 = this.Q;
                int i14 = this.R;
                jz jzVar = a61Var.f26644b;
                if (jzVar == null) {
                    a61Var.f26648n = i13;
                    a61Var.f26649r = i14;
                } else {
                    jzVar.i(i13, i14);
                }
            }
            ve0 ve0Var = this.f16582s;
            if (ve0Var != null) {
                int i15 = this.Q;
                int i16 = this.R;
                jz jzVar2 = ve0Var.f33390h0;
                if (jzVar2 != null) {
                    jzVar2.i(i15, i16);
                } else {
                    ve0Var.F0 = i15;
                    ve0Var.G0 = i16;
                }
            }
        }
        invalidate();
    }

    public final void s(z7 z7Var, zf.c2 c2Var, boolean z10) {
        m61 m61Var;
        if (z7Var == null || z7Var.f17224o0 == null) {
            m61 m61Var2 = this.f16589x;
            if (m61Var2 != null) {
                m61Var2.C();
                this.f16589x.I();
                this.f16589x = null;
            }
            cc ccVar = this.B;
            if (ccVar != null) {
                ccVar.setRoundNull(z10);
            }
            this.f16587w = null;
            AndroidUtilities.cancelRunOnUIThread(this.G);
            return;
        }
        m61 m61Var3 = this.f16589x;
        if (m61Var3 != null) {
            m61Var3.I();
            this.f16589x = null;
        }
        m61 m61Var4 = new m61();
        this.f16589x = m61Var4;
        m61Var4.f30605y = true;
        m61Var4.F = new ga.c(this, 23);
        this.f16589x.E(Uri.fromFile(z7Var.f17224o0), "other");
        c();
        this.f16587w = c2Var;
        if (c2Var != null && (m61Var = this.f16589x) != null) {
            m61Var.W(c2Var.f50363q0);
        }
        this.B.n(z7Var.f17224o0.getAbsolutePath(), z7Var.f17228q0, z7Var.f17230r0, z7Var.f17232s0, z7Var.f17234t0, z7Var.f17236u0, z10);
        y(true);
    }

    public void set(z7 z7Var) {
        n(z7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f16569g0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.A = e0Var;
    }

    public void setCropEditorDrawing(j0 j0Var) {
        if (this.f16588w0 != j0Var) {
            this.f16588w0 = j0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f16559a0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f16585u0 = runnable;
    }

    public void setVideoTimelineView(cc ccVar) {
        this.B = ccVar;
        if (ccVar != null) {
            ccVar.setDelegate(new ae.b(this, 25));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(z7 z7Var, Runnable runnable, long j10) {
        ArrayList arrayList;
        org.telegram.ui.Components.fa faVar;
        if (z7Var == null || z7Var.v()) {
            m61 m61Var = this.f16565e;
            if (m61Var != null) {
                m61Var.C();
                this.f16565e.I();
                this.f16565e = null;
            }
            p6 p6Var = this.D;
            if (p6Var == null || !p6Var.f16531g) {
                a61 a61Var = this.f16575n;
                if (a61Var != null) {
                    a61Var.clearAnimation();
                    this.f16575n.animate().alpha(0.0f).withEndAction(new m6(this, 6)).start();
                }
            } else {
                p6Var.a(null);
            }
            cc ccVar = this.B;
            if (ccVar != null) {
                ccVar.o(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.G);
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
            return;
        }
        m61 m61Var2 = this.f16565e;
        if (m61Var2 != null) {
            m61Var2.I();
            this.f16565e = null;
        }
        int i10 = 0;
        m61 m61Var3 = new m61();
        this.f16565e = m61Var3;
        m61Var3.f30605y = true;
        m61Var3.F = new j9.a(this, z7Var, new Runnable[]{runnable}, 9);
        a61 a61Var2 = this.f16575n;
        if (a61Var2 != null) {
            a61Var2.clearAnimation();
            a61 a61Var3 = this.f16575n;
            jz jzVar = a61Var3.f26644b;
            if (jzVar != null) {
                jzVar.postRunnable(new gz(jzVar, i10));
            }
            a61Var3.f26643a = null;
            removeView(this.f16575n);
            this.f16575n = null;
        }
        this.f16575n = new a61(getContext(), this.f16565e);
        this.C.e();
        a61 a61Var4 = this.f16575n;
        org.telegram.ui.Components.z9 z9Var = z7Var.f17235u ? null : this.C;
        a61Var4.f26650s = z9Var;
        jz jzVar2 = a61Var4.f26644b;
        if (jzVar2 != null && (faVar = jzVar2.E) != null) {
            org.telegram.ui.Components.z9 z9Var2 = faVar.f28335t;
            if (z9Var2 != null && z9Var2.f35212m != null) {
                z9Var2.f35212m = null;
            }
            faVar.f28335t = z9Var;
            if (z9Var != null && z9Var.f35212m != faVar) {
                z9Var.f35212m = faVar;
                z9Var.d();
            }
        }
        this.f16575n.setOpaque(false);
        b();
        p6 p6Var2 = this.D;
        if (p6Var2 == null || !p6Var2.f16531g) {
            this.f16575n.setAlpha(runnable != null ? 1.0f : 0.0f);
            addView(this.f16575n, h7.z5.e(-2, -2, 51));
        } else {
            p6Var2.a(this.f16575n);
        }
        n6 n6Var = new n6(this, i10);
        y7 y7Var = z7Var.f17203d1;
        if (y7Var != null) {
            n6Var.run(y7Var);
        } else if (!z7Var.K || Build.VERSION.SDK_INT < 24) {
            y7 y7Var2 = new y7();
            z7Var.f17203d1 = y7Var2;
            n6Var.run(y7Var2);
        } else {
            Utilities.globalQueue.postRunnable(new u7(z7Var, n6Var, i10));
        }
        File file = z7Var.Z0;
        if (file == null) {
            file = z7Var.L;
        }
        this.f16565e.E(Uri.fromFile(file), "other");
        this.f16565e.Q(this.f16586v0.isEmpty());
        this.f16565e.O(true);
        if (z7Var.h) {
            j10 = (long) ((z7Var.Z * z7Var.f17211h0) + j10);
        }
        if (j10 > 0) {
            this.f16565e.M(j10, false);
        }
        c();
        w(true);
        boolean z10 = z7Var.f17235u && (arrayList = z7Var.v) != null && arrayList.size() == 1 && ((MessageObject) z7Var.v.get(0)).type == 5;
        cc ccVar2 = this.B;
        File file2 = z7Var.Z0;
        if (file2 == null) {
            file2 = z7Var.L;
        }
        ccVar2.o(z10, file2.getAbsolutePath(), getDuration(), z7Var.P);
        this.B.setVideoLeft(z7Var.Z);
        this.B.setVideoRight(z7Var.f17194a0);
        cc ccVar3 = this.B;
        if (ccVar3 == null || j10 <= 0) {
            return;
        }
        ccVar3.setProgress(j10);
    }

    public final void u(z7 z7Var) {
        Drawable drawable = this.O;
        this.N = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (z7Var == null) {
            this.O = null;
            return;
        }
        long j10 = z7Var.f17245z0;
        if (j10 == Long.MIN_VALUE) {
            this.O = null;
            return;
        }
        Drawable drawableE = e(this.O, z7Var.f17193a, j10, z7Var.f17243y0);
        z7Var.f17241x0 = drawableE;
        this.O = drawableE;
        if (this.N != drawableE) {
            this.N = null;
        }
        if (drawableE != null) {
            drawableE.setCallback(this);
        }
        org.telegram.ui.Components.z9 z9Var = this.C;
        if (z9Var != null) {
            Drawable drawable2 = this.O;
            if (drawable2 == null) {
                z9Var.f(null, false);
            } else if (drawable2 instanceof BitmapDrawable) {
                z9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.O.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f10 = intrinsicWidth;
                float f11 = intrinsicHeight;
                float fMax = Math.max(100.0f / f10, 100.0f / f11);
                if (fMax > 1.0f) {
                    intrinsicWidth = (int) (f10 * fMax);
                    intrinsicHeight = (int) (f11 * fMax);
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.O.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.O.draw(new Canvas(bitmapCreateBitmap));
                z9Var.f(bitmapCreateBitmap, true);
            }
        }
        invalidate();
    }

    public final boolean v(MotionEvent motionEvent) {
        double dAtan2;
        float fA;
        if (this.f16569g0) {
            boolean z10 = motionEvent.getPointerCount() > 1;
            PointF pointF = this.f16571i0;
            if (z10) {
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
            boolean z11 = this.f16574l0;
            PointF pointF2 = this.f16570h0;
            if (z11 != z10) {
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.f16572j0 = fA;
                this.f16573k0 = dAtan2;
                this.f16574l0 = z10;
            }
            z7 z7Var = this.d;
            if (z7Var != null) {
                float width = z7Var.f17213i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f16577o0;
                if (actionMasked == 0) {
                    this.f16579q0 = 0.0f;
                    this.f16581r0 = false;
                    invalidate();
                    this.f16583s0 = true;
                    matrix.set(this.d.f17222n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f16583s0 && this.d != null) {
                    float f10 = pointF.x * width;
                    float f11 = pointF.y * width;
                    float f12 = pointF2.x * width;
                    float f13 = pointF2.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f16572j0;
                        if (f14 != 0.0f) {
                            float f15 = fA / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        float degrees = (float) Math.toDegrees(dAtan2 - this.f16573k0);
                        float f16 = this.f16579q0 + degrees;
                        this.f16579q0 = f16;
                        if (!this.f16576n0) {
                            boolean z12 = Math.abs(f16) > 20.0f;
                            this.f16576n0 = z12;
                            if (!z12) {
                                d(matrix);
                                this.f16576n0 = (((float) Math.round(this.W / 90.0f)) * 90.0f) - this.W > 20.0f;
                            }
                            if (!this.f16581r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f16581r0 = true;
                            }
                        }
                        if (this.f16576n0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.m0 = true;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.m0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f16578p0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.S;
                    matrix3.set(matrix);
                    d(matrix3);
                    float fRound = (Math.round(this.W / 90.0f) * 90.0f) - this.W;
                    if (this.f16576n0) {
                        if (Math.abs(fRound) < 3.5f) {
                            matrix2.postRotate(fRound, this.U, this.V);
                            if (!this.f16581r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f16581r0 = true;
                            }
                        } else {
                            this.f16581r0 = false;
                        }
                    }
                    this.d.f17222n0.set(matrix2);
                    this.d.f17214j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.m0 = false;
                        sb sbVar = ((hb) this).f16082y0;
                        sbVar.f16777k1.a(true, false, sbVar.f16757e0);
                        sbVar.f16777k1.b(sbVar.Y0.getText());
                    }
                    this.f16583s0 = false;
                    this.f16576n0 = false;
                    this.f16579q0 = 0.0f;
                    this.f16581r0 = false;
                    invalidate();
                }
                PointF pointF3 = pointF;
                pointF2.x = pointF3.x;
                pointF2.y = pointF3.y;
                this.f16572j0 = fA;
                this.f16573k0 = dAtan2;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.O == drawable || super.verifyDrawable(drawable);
    }

    public final void w(boolean z10) {
        long jO;
        boolean z11;
        boolean z12;
        if (this.f16590y == null || this.d == null) {
            return;
        }
        if (this.f16565e == null && this.f16589x == null && !j()) {
            this.f16590y.Q(this.f16586v0.isEmpty());
            this.f16590y.O(true);
            long jO2 = this.f16590y.o();
            if (!z10 || this.f16590y.q() == -9223372036854775807L) {
                return;
            }
            float fQ = jO2 / this.f16590y.q();
            z7 z7Var = this.d;
            if ((fQ < z7Var.E || fQ > z7Var.F) && System.currentTimeMillis() - this.F > 500) {
                this.F = System.currentTimeMillis();
                this.f16590y.L(-this.d.D);
                return;
            }
            return;
        }
        if (j()) {
            jO = this.A.getPositionWithOffset();
            z11 = this.A.m0;
        } else {
            m61 m61Var = this.f16565e;
            if (m61Var == null) {
                m61Var = this.f16589x;
            }
            jO = m61Var.o();
            z11 = m61Var.z();
        }
        z7 z7Var2 = this.d;
        float f10 = z7Var2.F;
        float f11 = z7Var2.E;
        long j10 = z7Var2.C;
        long j11 = (long) ((f10 - f11) * j10);
        if (z11) {
            long j12 = z7Var2.D;
            z12 = jO >= j12 && jO <= j12 + j11;
        }
        long j13 = jO - (z7Var2.D - ((long) (f11 * j10)));
        if (this.f16590y.z() != z12) {
            this.f16590y.Q(z12);
            this.f16590y.L(j13);
        } else if (z10) {
            if (Math.abs(this.f16590y.o() - j13) > (j() ? 300 : 120)) {
                this.f16590y.L(j13);
            }
        }
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f16586v0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        m61 m61Var = this.f16565e;
        if (m61Var != null) {
            m61Var.Q(hashSet.isEmpty());
        }
        e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long jO;
        boolean z11;
        if (this.f16589x == null || this.d == null) {
            return;
        }
        if (this.f16565e == null && !j()) {
            this.f16589x.Q(this.f16586v0.isEmpty());
            this.f16589x.O(true);
            zf.c2 c2Var = this.f16587w;
            if (c2Var != null && !c2Var.f50370x0) {
                c2Var.f50370x0 = true;
                c2Var.f50371y0.f(true, true);
                c2Var.invalidate();
            }
            long jO2 = this.f16589x.o();
            if (!z10 || this.f16589x.q() == -9223372036854775807L) {
                return;
            }
            float fQ = jO2 / this.f16589x.q();
            z7 z7Var = this.d;
            if ((fQ < z7Var.f17232s0 || fQ > z7Var.f17234t0) && System.currentTimeMillis() - this.F > 500) {
                this.F = System.currentTimeMillis();
                this.f16589x.M(-this.d.f17230r0, false);
                return;
            }
            return;
        }
        if (j()) {
            jO = this.A.getPositionWithOffset();
            z11 = this.A.m0;
        } else {
            jO = this.f16565e.o();
            z11 = this.f16565e.z();
        }
        z7 z7Var2 = this.d;
        float f10 = z7Var2.f17234t0;
        float f11 = z7Var2.f17232s0;
        float f12 = z7Var2.f17228q0;
        long j10 = (long) ((f10 - f11) * f12);
        long j11 = z7Var2.f17230r0;
        boolean z12 = jO >= j11 && jO <= j10 + j11;
        boolean z13 = z11 && z12;
        long j12 = (jO - j11) + ((long) (f11 * f12));
        zf.c2 c2Var2 = this.f16587w;
        if (c2Var2 != null && c2Var2.f50370x0 != z12) {
            c2Var2.f50370x0 = z12;
            c2Var2.invalidate();
        }
        if (this.f16589x.z() != z13) {
            this.f16589x.Q(z13);
            this.f16589x.M(j12, false);
        } else if (z10) {
            if (Math.abs(this.f16589x.o() - j12) > (j() ? 300 : 120)) {
                this.f16589x.M(j12, false);
            }
        }
    }
}
