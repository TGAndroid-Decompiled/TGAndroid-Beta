package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public class lb1 extends d {
    public zna E;
    public float F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final PointF[] J;
    public final RectF K;
    public final RectF L;
    public long M;
    public kb1 N;
    public boolean O;
    public long P;
    public int Q;
    public int R;
    public String S;
    public final byte T;
    public boolean U;
    public ai4 V;
    public yf0 W;
    public final byte X;
    public ValueAnimator Y;
    public float Z;
    public lj4 a;
    public float a0;
    public jb1 b;
    public zna b0;
    public TextView c;
    public float c0;
    public CameraView d;
    public RectF d0;
    public final HandlerThread e;
    public final o1 e0;
    public Handler f;
    public float f0;
    public long g0;
    public TextView h;
    public final Paint n;
    public final Paint r;
    public ImageView s;
    public AnimatorSet w;
    public float x;
    public boolean y;

    public lb1(int i) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.n = new Paint();
        this.r = new Paint(1);
        this.x = 0.5f;
        this.y = false;
        this.E = null;
        this.F = 0.0f;
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        this.J = new PointF[4];
        for (int i2 = 0; i2 < 4; i2++) {
            this.G[i2] = new PointF(-1.0f, -1.0f);
            this.H[i2] = new PointF(-1.0f, -1.0f);
            this.I[i2] = new PointF(-1.0f, -1.0f);
            this.J[i2] = new PointF(-1.0f, -1.0f);
        }
        this.K = new RectF();
        this.L = new RectF();
        this.M = 0L;
        this.Q = 0;
        this.R = 0;
        this.U = false;
        this.V = null;
        this.W = null;
        this.Z = 0.0f;
        this.a0 = 0.0f;
        this.c0 = 0.0f;
        this.e0 = new o1(this, (byte) 11);
        this.f0 = 0.0f;
        this.g0 = 0L;
        this.X = i;
        if (f0()) {
            Utilities.e.c(new db1(this, (byte) 5));
        }
        int o = gda.o();
        if (o != 0) {
            if (o != 1) {
                this.T = (byte) 40;
                return;
            } else {
                this.T = (byte) 24;
                return;
            }
        }
        this.T = (byte) 8;
    }

    public static Bitmap e0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix2.preConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap g0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 85.0f, 85.0f, 85.0f, 0.0f, -22950.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void i0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static hb1 j0(Activity activity, int i, kb1 kb1Var) {
        if (activity == null) {
            return null;
        }
        hb1 hb1Var = new hb1(activity, new tk5[]{new ActionBarLayout(activity, false)}, i, kb1Var);
        hb1Var.z0(false);
        gm.i3(hb1Var, false);
        gm.o3(hb1Var, -16777216, false, null);
        hb1Var.z0(false);
        hb1Var.getWindow().addFlags(512);
        hb1Var.show();
        return hb1Var;
    }

    public static PointF[] k0(Point[] pointArr, int i, int i2) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i3 = 0; i3 < pointArr.length; i3++) {
            Point point = pointArr[i3];
            pointFArr[i3] = new PointF(point.x / i, point.y / i2);
        }
        return pointFArr;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231244);
        boolean z = this.y;
        a aVar = this.actionBar;
        byte b = this.X;
        bt7 bt7Var = null;
        if (z) {
            aVar.H(-1, false);
            this.actionBar.G(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (b == 0) {
            anb.l(aVar, 1, cmb.y6, null);
            anb.l(this.actionBar, 3, cmb.t8, null);
            anb.l(this.actionBar, 5, cmb.z8, null);
        } else {
            aVar.H(cmb.w0(null, cmb.y6, false), false);
            this.actionBar.G(cmb.w0(null, cmb.t8, false), false);
            this.actionBar.setTitleColor(cmb.w0(null, cmb.z8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!gm.O1() && !f0()) {
            a aVar2 = this.actionBar;
            if (aVar2.J && aVar2.w == null) {
                View view = new View(aVar2.getContext());
                aVar2.w = view;
                anb.h(cmb.w8, aVar2.K0, view);
                aVar2.addView(aVar2.w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.w.getLayoutParams();
                layoutParams.height = gm.m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                aVar2.w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 17));
        this.n.setColor(2130706432);
        Paint paint = this.r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        ib1 ib1Var = new ib1(this, context);
        ib1Var.setOnTouchListener(new p8((byte) 21));
        this.fragmentView = ib1Var;
        if (f0()) {
            this.fragmentView.postDelayed(new db1(this, (byte) 4), 450L);
        } else {
            d0();
        }
        a aVar3 = this.actionBar;
        if (b == 0) {
            int i = cmb.c6;
            anb.h(i, null, aVar3);
            anb.h(i, null, this.fragmentView);
        } else {
            aVar3.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.H(-1, false);
            this.actionBar.G(587202559, false);
            ib1Var.setBackgroundColor(-16777216);
            ib1Var.addView(this.actionBar);
        }
        if (b == 2 || b == 3) {
            this.actionBar.setTitle(jb6.M0(2131753850, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(b66.c());
        paint2.setColor(on2.p(-1, 40));
        jb1 jb1Var = new jb1(context, paint2);
        this.b = jb1Var;
        jb1Var.setGravity(1);
        this.b.setTextSize(1, 24.0f);
        ib1Var.addView(this.b);
        TextView textView = new TextView(context);
        this.c = textView;
        if (b == 3) {
            textView.setTextColor(cmb.w0(null, cmb.C6, false));
        } else {
            anb.X(textView, cmb.C6, null);
        }
        this.c.setGravity(1);
        this.c.setTextSize(1, 16.0f);
        ib1Var.addView(this.c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (b == 0) {
            this.b.setText(jb6.M0(2131747203, null));
            this.c.setText(jb6.M0(2131747202, null));
            anb.X(this.b, cmb.F6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (b != 1 && b != 3) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753853, null));
                String[] strArr = {jb6.M0(2131753858, null), jb6.M0(2131753848, null)};
                int i2 = 0;
                for (int i3 = 2; i2 < i3; i3 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i4 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i4);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.b.setMovementMethod(new cm((byte) 0));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i4, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new g6c(strArr[i2], 0), i4, indexOf2, 33);
                    spannableStringBuilder.setSpan(new z5c(gm.o()), i4, indexOf2, 33);
                    i2++;
                }
                this.b.setLinkTextColor(-1);
                this.b.setTextSize(1, 16.0f);
                this.b.setLineSpacing(gm.L(2.0f), 1.0f);
                this.b.setPadding(0, 0, 0, 0);
                this.b.setText(spannableStringBuilder);
            } else {
                this.b.setText(jb6.M0(2131753850, null));
            }
            this.b.setTextColor(-1);
            if (b == 3) {
                this.c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(gm.L(10.0f), 0, gm.L(10.0f), gm.L(10.0f));
            bt7Var = null;
            this.h.setText(jb6.M0(2131753852, null));
            ib1Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setImageResource(2131232646);
            this.s.setBackgroundDrawable(cmb.K(gm.L(60.0f), 587202559));
            ib1Var.addView(this.s);
            this.s.setOnClickListener(new k81(this, (byte) 3));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            bt7Var = ((LaunchActivity) parentActivity).t1;
        }
        if (bt7Var != null && this.a == null) {
            lj4 lj4Var = new lj4(bt7Var);
            bt7Var.b.add(lj4Var);
            bt7Var.a();
            this.a = lj4Var;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final void d0() {
        TextView textView;
        if (this.fragmentView != null && CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
            this.d = cameraView;
            cameraView.setUseMaxPreview(true);
            this.d.setOptimizeForBarcode(true);
            this.d.setDelegate(new xg0(this, (byte) 28));
            ((ViewGroup) this.fragmentView).addView(this.d, 0, qoe.c(-1.0f, -1));
            if (this.X == 0 && (textView = this.h) != null) {
                this.d.addView(textView);
            }
        }
    }

    public final boolean f0() {
        byte b = this.X;
        if (b == 1 || b == 2 || b == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (f0()) {
            return arrayList;
        }
        arrayList.add(new cnb(this.b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(this.c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C6));
        return arrayList;
    }

    public final void h0(android.graphics.Bitmap r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lb1.h0(android.graphics.Bitmap):void");
    }

    public final mx6 l0(Size size, int i, int i2, int i3, Bitmap bitmap) {
        mx6 mx6Var;
        mx6 mx6Var2;
        int i4;
        int i5;
        gi6 gi6Var;
        ?? r5;
        String str;
        in3 in3Var;
        mx6 mx6Var3 = null;
        try {
            RectF rectF = new RectF();
            yf0 yf0Var = this.W;
            float f = Float.MIN_VALUE;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            try {
                if (yf0Var != null && yf0Var.b.k()) {
                    if (bitmap != null) {
                        in3Var = new in3((byte) 4);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        in3Var.d = bitmap;
                        pd0 pd0Var = (pd0) in3Var.b;
                        pd0Var.a = width;
                        pd0Var.b = height;
                        i4 = bitmap.getWidth();
                        i5 = bitmap.getHeight();
                    } else {
                        in3Var = new in3((byte) 4);
                        ByteBuffer wrap = ByteBuffer.wrap(null);
                        int width2 = size.getWidth();
                        int height2 = size.getHeight();
                        if (wrap != null) {
                            if (wrap.capacity() >= width2 * height2) {
                                in3Var.c = wrap;
                                pd0 pd0Var2 = (pd0) in3Var.b;
                                pd0Var2.a = width2;
                                pd0Var2.b = height2;
                                i4 = size.getWidth();
                                i5 = size.getWidth();
                            } else {
                                throw new IllegalArgumentException("Invalid image data size.");
                            }
                        } else {
                            throw new IllegalArgumentException("Null image data supplied.");
                        }
                    }
                    SparseArray h = this.W.h(in3Var);
                    if (h.size() > 0) {
                        xf0 xf0Var = (xf0) h.valueAt(0);
                        String str2 = xf0Var.b;
                        Point[] pointArr = xf0Var.e;
                        r5 = k0(pointArr, i4, i5);
                        if (pointArr.length == 0) {
                            rectF = null;
                            mx6Var2 = null;
                            str = str2;
                        } else {
                            int length = pointArr.length;
                            float f3 = Float.MIN_VALUE;
                            float f4 = Float.MAX_VALUE;
                            while (i6 < length) {
                                Point point = pointArr[i6];
                                mx6 mx6Var4 = mx6Var3;
                                f2 = Math.min(f2, point.x);
                                f = Math.max(f, point.x);
                                f4 = Math.min(f4, point.y);
                                f3 = Math.max(f3, point.y);
                                i6++;
                                mx6Var3 = mx6Var4;
                            }
                            mx6Var2 = mx6Var3;
                            rectF.set(f2, f4, f, f3);
                            str = str2;
                        }
                    } else {
                        mx6Var2 = null;
                        if (bitmap != null) {
                            Bitmap e0 = e0(bitmap);
                            bitmap.recycle();
                            in3 in3Var2 = new in3((byte) 4);
                            int width3 = e0.getWidth();
                            int height3 = e0.getHeight();
                            in3Var2.d = e0;
                            pd0 pd0Var3 = (pd0) in3Var2.b;
                            pd0Var3.a = width3;
                            pd0Var3.b = height3;
                            i4 = e0.getWidth();
                            i5 = e0.getHeight();
                            SparseArray h2 = this.W.h(in3Var2);
                            if (h2.size() > 0) {
                                xf0 xf0Var2 = (xf0) h2.valueAt(0);
                                String str3 = xf0Var2.b;
                                Point[] pointArr2 = xf0Var2.e;
                                r5 = k0(pointArr2, i4, i5);
                                if (pointArr2.length == 0) {
                                    rectF = null;
                                    str = str3;
                                } else {
                                    int length2 = pointArr2.length;
                                    float f5 = Float.MIN_VALUE;
                                    float f6 = Float.MAX_VALUE;
                                    while (i6 < length2) {
                                        Point point2 = pointArr2[i6];
                                        f2 = Math.min(f2, point2.x);
                                        f = Math.max(f, point2.x);
                                        f6 = Math.min(f6, point2.y);
                                        f5 = Math.max(f5, point2.y);
                                        i6++;
                                    }
                                    rectF.set(f2, f6, f, f5);
                                    str = str3;
                                }
                            } else {
                                Bitmap g0 = g0(e0);
                                e0.recycle();
                                in3 in3Var3 = new in3((byte) 4);
                                int width4 = g0.getWidth();
                                int height4 = g0.getHeight();
                                in3Var3.d = g0;
                                pd0 pd0Var4 = (pd0) in3Var3.b;
                                pd0Var4.a = width4;
                                pd0Var4.b = height4;
                                int width5 = e0.getWidth();
                                int height5 = e0.getHeight();
                                SparseArray h3 = this.W.h(in3Var3);
                                if (h3.size() > 0) {
                                    xf0 xf0Var3 = (xf0) h3.valueAt(0);
                                    String str4 = xf0Var3.b;
                                    Point[] pointArr3 = xf0Var3.e;
                                    r5 = k0(pointArr3, width5, height5);
                                    if (pointArr3.length == 0) {
                                        rectF = null;
                                    } else {
                                        int length3 = pointArr3.length;
                                        float f7 = Float.MIN_VALUE;
                                        float f8 = Float.MAX_VALUE;
                                        while (i6 < length3) {
                                            Point point3 = pointArr3[i6];
                                            f2 = Math.min(f2, point3.x);
                                            f = Math.max(f, point3.x);
                                            f8 = Math.min(f8, point3.y);
                                            f7 = Math.max(f7, point3.y);
                                            i6++;
                                        }
                                        rectF.set(f2, f8, f, f7);
                                    }
                                    i5 = height5;
                                    str = str4;
                                    i4 = width5;
                                } else {
                                    i4 = width5;
                                    i5 = height5;
                                }
                            }
                        }
                        mx6 mx6Var5 = mx6Var2;
                        r5 = mx6Var5;
                        str = mx6Var5;
                    }
                } else {
                    mx6Var2 = null;
                    if (this.V != null) {
                        if (bitmap != null) {
                            int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                            bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                            gi6Var = new l09(bitmap.getWidth(), bitmap.getHeight(), iArr);
                            int width6 = bitmap.getWidth();
                            i5 = bitmap.getHeight();
                            i4 = width6;
                        } else {
                            sd8 sd8Var = new sd8(size.getWidth(), size.getHeight(), i, i2, i3, i3);
                            i4 = size.getWidth();
                            i5 = size.getHeight();
                            gi6Var = sd8Var;
                        }
                        in3 o = this.V.o(new lx6(new mx6(gi6Var), (byte) 8));
                        wc9[] wc9VarArr = (wc9[]) o.b;
                        String str5 = (String) o.c;
                        if (wc9VarArr.length == 0) {
                            r5 = null;
                            rectF = null;
                        } else {
                            float f9 = Float.MIN_VALUE;
                            float f10 = Float.MAX_VALUE;
                            for (wc9 wc9Var : wc9VarArr) {
                                float f11 = wc9Var.a;
                                float f12 = wc9Var.b;
                                f2 = Math.min(f2, f11);
                                f = Math.max(f, wc9Var.a);
                                f10 = Math.min(f10, f12);
                                f9 = Math.max(f9, f12);
                            }
                            rectF.set(f2, f10, f, f9);
                            if (wc9VarArr.length == 4) {
                                r5 = new PointF[4];
                                for (int i7 = 0; i7 < 4; i7++) {
                                    wc9 wc9Var2 = wc9VarArr[i7];
                                    r5[i7] = new PointF(wc9Var2.a / i4, wc9Var2.b / i5);
                                }
                            } else {
                                r5 = null;
                            }
                        }
                        str = str5;
                    } else {
                        i4 = 1;
                        i5 = 1;
                        mx6 mx6Var52 = mx6Var2;
                        r5 = mx6Var52;
                        str = mx6Var52;
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    gm.c3(new db1(this, (byte) 6));
                    return mx6Var2;
                } else if (this.X == 2 && !str.startsWith("tg://login?token=")) {
                    gm.c3(new db1(this, (byte) 6));
                    return mx6Var2;
                } else {
                    mx6 mx6Var6 = new mx6((byte) 13);
                    if (rectF != null) {
                        float L = gm.L(25.0f);
                        float L2 = gm.L(15.0f);
                        rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                        float f13 = i4;
                        float f14 = i5;
                        rectF.set(rectF.left / f13, rectF.top / f14, rectF.right / f13, rectF.bottom / f14);
                    }
                    mx6Var6.d = r5;
                    mx6Var6.c = rectF;
                    mx6Var6.b = str;
                    return mx6Var6;
                }
            } catch (Throwable unused) {
                gm.c3(new db1(this, (byte) 6));
                return mx6Var;
            }
        } catch (Throwable unused2) {
            mx6Var = mx6Var3;
        }
    }

    public final void m0() {
        int height;
        if (this.d0 == null) {
            this.d0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, height) / 1.5f);
        float f = width;
        float height2 = this.fragmentView.getHeight();
        this.d0.set(((width - min) / 2.0f) / f, ((height - min) / 2.0f) / height2, ((width + min) / 2.0f) / f, ((height + min) / 2.0f) / height2);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 11 && intent != null && intent.getData() != null) {
            try {
                Point b1 = gm.b1();
                mx6 l0 = l0(null, 0, 0, 0, fn5.G(null, intent.getData(), b1.x, b1.y, true));
                if (l0 != null) {
                    kb1 kb1Var = this.N;
                    if (kb1Var != null) {
                        kb1Var.v((String) l0.b);
                    }
                    finishFragment();
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.d;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.d = null;
        }
        this.e.quitSafely();
        lj4 lj4Var = this.a;
        if (lj4Var != null) {
            bt7 bt7Var = (bt7) lj4Var.a;
            if (bt7Var.b.remove(lj4Var)) {
                bt7Var.a();
            }
            this.a = null;
        }
        yf0 yf0Var = this.W;
        if (yf0Var != null) {
            yf0Var.d();
        }
    }
}
