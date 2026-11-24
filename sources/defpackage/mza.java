package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mza extends FrameLayout implements gk7 {
    public volatile boolean E;
    public jza F;
    public float G;
    public boolean H;
    public jza[] I;
    public volatile Bitmap J;
    public int K;
    public Bitmap L;
    public boolean M;
    public final TextView N;
    public ValueAnimator O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public ijb T;
    public int U;
    public int V;
    public boolean W;
    public int a;
    public kza a0;
    public final lm b;
    public final wjb b0;
    public final lm c;
    public vya c0;
    public final Paint d;
    public String d0;
    public final Paint e;
    public np3 e0;
    public final Paint f;
    public final Matrix f0;
    public float g0;
    public final Paint h;
    public float h0;
    public final zt7 i0;
    public boolean j0;
    public final Matrix k0;
    public Path l0;
    public Path m0;
    public final PathMeasure n;
    public final RectF n0;
    public float o0;
    public float p0;
    public final ArrayList q0;
    public final Path r;
    public final Rect r0;
    public final Path s;
    public final Path w;
    public final Path x;
    public volatile boolean y;

    public mza(ContextThemeWrapper contextThemeWrapper, wjb wjbVar) {
        super(contextThemeWrapper);
        this.a = -1;
        s33 s33Var = s33.h;
        this.b = new lm(0.0f, (View) null, 0L, 420L, s33Var);
        this.c = new lm(0.0f, (View) null, 0L, 420L, s33Var);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.n = new PathMeasure();
        this.r = new Path();
        this.s = new Path();
        this.w = new Path();
        this.x = new Path();
        this.G = 2.0f;
        this.f0 = new Matrix();
        this.k0 = new Matrix();
        this.n0 = new RectF();
        this.q0 = new ArrayList();
        this.r0 = new Rect();
        this.b0 = wjbVar;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{gl.L(5.0f), gl.L(10.0f)}, 0.5f));
        paint.setShadowLayer(gl.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, nme.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(gl.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(gl.L(20.0f)));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(gl.L(4.0f), blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(gl.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(gl.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(gl.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        zt7 zt7Var = new zt7(contextThemeWrapper);
        this.i0 = zt7Var;
        zt7Var.setAlpha(0.0f);
        zt7Var.setTranslationX(-gl.L(18.0f));
        zt7Var.b(0.33f, 10.0f);
        zt7Var.setBrushWeight(this.G);
        zt7Var.setValueOverride(new g29(this, (byte) 14));
        zt7Var.setTranslationX(-gl.L(18.0f));
        zt7Var.setAlpha(0.0f);
        addView(zt7Var, nme.c(-1.0f, -1));
    }

    public static void c(defpackage.jza r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mza.c(jza, int, int):void");
    }

    public static List j(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((iza) arrayList.get(0));
        int i = 1;
        while (i < arrayList.size() - 1) {
            iza izaVar = (iza) arrayList.get(i - 1);
            iza izaVar2 = (iza) arrayList.get(i);
            i++;
            iza izaVar3 = (iza) arrayList.get(i);
            int i2 = ((Point) izaVar2).x;
            int i3 = ((Point) izaVar).x;
            int i4 = ((Point) izaVar3).y;
            int i5 = ((Point) izaVar).y;
            if (Math.abs((((i4 - i5) * (i2 - i3)) - ((((Point) izaVar3).x - i3) * (((Point) izaVar2).y - i5))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(izaVar2);
            }
        }
        arrayList2.add((iza) b00.f(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final kza kzaVar = this.a0;
        if (kzaVar != null) {
            final int i = y6c.t0;
            kzaVar.o = true;
            if (kzaVar.m != null) {
                h();
                kzaVar.m.a(kzaVar.b, kzaVar.e.document);
                gl.d3(new cza((byte) 0), 250L);
            } else if (kzaVar.k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = hq6.c0(kzaVar.k, kzaVar.c).document;
                tL_stickers_replaceSticker.new_sticker = kzaVar.e;
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final mza b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final mza mzaVar = this.b;
                                final int i2 = i;
                                final kza kzaVar2 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar3 = kzaVar2;
                                        int i3 = i2;
                                        final mza mzaVar2 = mzaVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i3).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i3).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i3).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var = mzaVar2.e0;
                                                    if (np3Var != null) {
                                                        np3Var.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar4 = kzaVar3;
                                                            TLObject tLObject3 = tLObject2;
                                                            mza mzaVar3 = mzaVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar4.f.document;
                                                                    String str = kzaVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject3, document, str, bool);
                                                                    mzaVar3.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject3, kzaVar4.f.document, kzaVar4.l, Boolean.TRUE);
                                                                    mzaVar3.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar4.f.document;
                                                                    String str2 = kzaVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject3, document2, str2, bool2);
                                                                    mzaVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar2.m(tL_error2);
                                                    mzaVar2.h();
                                                }
                                                pz1 pz1Var = kzaVar3.n;
                                                if (pz1Var != null) {
                                                    pz1Var.a(Boolean.valueOf(z));
                                                    kzaVar3.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i3).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i3).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var2 = mzaVar2.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar4 = kzaVar3;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar3 = mzaVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar4.f.document;
                                                                    String str = kzaVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar3.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar4.f.document, kzaVar4.l, Boolean.TRUE);
                                                                    mzaVar3.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar4.f.document;
                                                                    String str2 = kzaVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar2.m(tL_error2);
                                                    mzaVar2.h();
                                                }
                                                pz1 pz1Var2 = kzaVar3.n;
                                                if (pz1Var2 != null) {
                                                    pz1Var2.a(Boolean.valueOf(z));
                                                    kzaVar3.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i3).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i3).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i3).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar2.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar4 = kzaVar3;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar3 = mzaVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar4.f.document;
                                                                    String str = kzaVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar3.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar4.f.document, kzaVar4.l, Boolean.TRUE);
                                                                    mzaVar3.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar4.f.document;
                                                                    String str2 = kzaVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar2.m(tL_error2);
                                                    mzaVar2.h();
                                                }
                                                pz1 pz1Var3 = kzaVar3.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar3.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final mza mzaVar2 = this.b;
                                final int i3 = i;
                                final kza kzaVar3 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar3;
                                        int i32 = i3;
                                        final mza mzaVar22 = mzaVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var = mzaVar22.e0;
                                                    if (np3Var != null) {
                                                        np3Var.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar4 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar3 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar4.f.document;
                                                                    String str = kzaVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar3.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar4.f.document, kzaVar4.l, Boolean.TRUE);
                                                                    mzaVar3.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar4.f.document;
                                                                    String str2 = kzaVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var = kzaVar32.n;
                                                if (pz1Var != null) {
                                                    pz1Var.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar4 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar3 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar4.f.document;
                                                                    String str = kzaVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar3.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar4.f.document, kzaVar4.l, Boolean.TRUE);
                                                                    mzaVar3.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar4.f.document;
                                                                    String str2 = kzaVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var2 = kzaVar32.n;
                                                if (pz1Var2 != null) {
                                                    pz1Var2.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar4 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar3 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar4.f.document;
                                                                    String str = kzaVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar3.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar4.f.document, kzaVar4.l, Boolean.TRUE);
                                                                    mzaVar3.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar4.f.document;
                                                                    String str2 = kzaVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final mza mzaVar3 = this.b;
                                final int i4 = i;
                                final kza kzaVar4 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar4;
                                        int i32 = i4;
                                        final mza mzaVar22 = mzaVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var = mzaVar22.e0;
                                                    if (np3Var != null) {
                                                        np3Var.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var = kzaVar32.n;
                                                if (pz1Var != null) {
                                                    pz1Var.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var2 = kzaVar32.n;
                                                if (pz1Var2 != null) {
                                                    pz1Var2.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            } else if (kzaVar.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = kzaVar.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(kzaVar.e);
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final mza b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final mza mzaVar = this.b;
                                final int i2 = i;
                                final kza kzaVar2 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar2;
                                        int i32 = i2;
                                        final mza mzaVar22 = mzaVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var = mzaVar22.e0;
                                                    if (np3Var != null) {
                                                        np3Var.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var = kzaVar32.n;
                                                if (pz1Var != null) {
                                                    pz1Var.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var2 = kzaVar32.n;
                                                if (pz1Var2 != null) {
                                                    pz1Var2.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final mza mzaVar2 = this.b;
                                final int i3 = i;
                                final kza kzaVar3 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar3;
                                        int i32 = i3;
                                        final mza mzaVar22 = mzaVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var = mzaVar22.e0;
                                                    if (np3Var != null) {
                                                        np3Var.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var = kzaVar32.n;
                                                if (pz1Var != null) {
                                                    pz1Var.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var2 = kzaVar32.n;
                                                if (pz1Var2 != null) {
                                                    pz1Var2.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final mza mzaVar3 = this.b;
                                final int i4 = i;
                                final kza kzaVar4 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar4;
                                        int i32 = i4;
                                        final mza mzaVar22 = mzaVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var = mzaVar22.e0;
                                                    if (np3Var != null) {
                                                        np3Var.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var = kzaVar32.n;
                                                if (pz1Var != null) {
                                                    pz1Var.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var2 = kzaVar32.n;
                                                if (pz1Var2 != null) {
                                                    pz1Var2.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            } else if (kzaVar.h) {
                h();
                kk7.f(i).m(kk7.t3, Boolean.FALSE);
                gl.d3(new kya(kzaVar, (byte) 2), 350L);
                pz1 pz1Var = kzaVar.n;
                if (pz1Var != null) {
                    pz1Var.a(Boolean.TRUE);
                }
            } else if (kzaVar.i != 0) {
                z3a.B(i).t0(kzaVar.f.document, null, kzaVar.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                np3 np3Var = this.e0;
                if (np3Var != null) {
                    np3Var.setProgress(1.0f);
                }
                gl.d3(new on7(this, i, (byte) 16), 450L);
                pz1 pz1Var2 = kzaVar.n;
                if (pz1Var2 != null) {
                    pz1Var2.a(Boolean.TRUE);
                    kzaVar.n = null;
                }
            } else if (kzaVar.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = hq6.b0(kzaVar.j);
                tL_stickers_addStickerToSet.sticker = kzaVar.e;
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final mza b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final mza mzaVar = this.b;
                                final int i2 = i;
                                final kza kzaVar2 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar2;
                                        int i32 = i2;
                                        final mza mzaVar22 = mzaVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var22 = mzaVar22.e0;
                                                    if (np3Var22 != null) {
                                                        np3Var22.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var22 = kzaVar32.n;
                                                if (pz1Var22 != null) {
                                                    pz1Var22.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var32 = kzaVar32.n;
                                                if (pz1Var32 != null) {
                                                    pz1Var32.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final mza mzaVar2 = this.b;
                                final int i3 = i;
                                final kza kzaVar3 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar3;
                                        int i32 = i3;
                                        final mza mzaVar22 = mzaVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var22 = mzaVar22.e0;
                                                    if (np3Var22 != null) {
                                                        np3Var22.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var22 = kzaVar32.n;
                                                if (pz1Var22 != null) {
                                                    pz1Var22.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var32 = kzaVar32.n;
                                                if (pz1Var32 != null) {
                                                    pz1Var32.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final mza mzaVar3 = this.b;
                                final int i4 = i;
                                final kza kzaVar4 = kzaVar;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final kza kzaVar32 = kzaVar4;
                                        int i32 = i4;
                                        final mza mzaVar22 = mzaVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    np3 np3Var2 = mzaVar22.e0;
                                                    if (np3Var2 != null) {
                                                        np3Var2.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var3 = kzaVar32.n;
                                                if (pz1Var3 != null) {
                                                    pz1Var3.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hq6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hq6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    np3 np3Var22 = mzaVar22.e0;
                                                    if (np3Var22 != null) {
                                                        np3Var22.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var22 = kzaVar32.n;
                                                if (pz1Var22 != null) {
                                                    pz1Var22.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hq6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hq6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hq6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    np3 np3Var3 = mzaVar22.e0;
                                                    if (np3Var3 != null) {
                                                        np3Var3.setProgress(1.0f);
                                                    }
                                                    gl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            kza kzaVar42 = kzaVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            mza mzaVar32 = mzaVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    kk7 f = kk7.f(y6c.t0);
                                                                    TLRPC.Document document = kzaVar42.f.document;
                                                                    String str = kzaVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(217, bool, tLObject32, document, str, bool);
                                                                    mzaVar32.h();
                                                                    return;
                                                                case 1:
                                                                    kk7.f(y6c.t0).m(217, Boolean.FALSE, tLObject32, kzaVar42.f.document, kzaVar42.l, Boolean.TRUE);
                                                                    mzaVar32.h();
                                                                    return;
                                                                default:
                                                                    kk7 f2 = kk7.f(y6c.t0);
                                                                    TLRPC.Document document2 = kzaVar42.f.document;
                                                                    String str2 = kzaVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(217, bool2, tLObject32, document2, str2, bool2);
                                                                    mzaVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    mzaVar22.m(tL_error2);
                                                    mzaVar22.h();
                                                }
                                                pz1 pz1Var32 = kzaVar32.n;
                                                if (pz1Var32 != null) {
                                                    pz1Var32.a(Boolean.valueOf(z));
                                                    kzaVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        this.J = null;
        if (this.I != null) {
            int i = 0;
            while (true) {
                jza[] jzaVarArr = this.I;
                if (i >= jzaVarArr.length) {
                    break;
                }
                jza jzaVar = jzaVarArr[i];
                if (jzaVar != null) {
                    jzaVar.l.reset();
                    Bitmap bitmap = jzaVar.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        jzaVar.e = null;
                    }
                    Bitmap bitmap2 = jzaVar.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        jzaVar.d = null;
                    }
                    Bitmap bitmap3 = jzaVar.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        jzaVar.g = null;
                    }
                    Bitmap bitmap4 = jzaVar.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        jzaVar.f = null;
                    }
                }
                i++;
            }
            this.I = null;
        }
        this.E = false;
        this.y = false;
        this.M = false;
        this.N.setAlpha(0.0f);
        this.N.setScaleX(0.3f);
        this.N.setScaleY(0.3f);
        kza kzaVar = this.a0;
        if (kzaVar != null) {
            if (!kzaVar.o) {
                kzaVar.a();
            }
            this.a0 = null;
        }
        h();
        this.W = false;
    }

    public final Bitmap d(int i, int i2, Bitmap bitmap, boolean z) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap != null && !bitmap.isRecycled() && sourceBitmap != null) {
            Paint paint = new Paint(3);
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap);
            if (z) {
                canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, i, i2, paint);
            } else {
                canvas.drawBitmap(bitmap, i, i2, paint);
            }
            Utilities.stackBlurBitmap(createBitmap, 5);
            Bitmap createBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
            Paint paint2 = new Paint(3);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
            createBitmap.recycle();
            return createBitmap2;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        kza kzaVar;
        if (i == kk7.T1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            kza kzaVar2 = this.a0;
            if (kzaVar2 != null && str.equalsIgnoreCase(kzaVar2.b)) {
                kza kzaVar3 = this.a0;
                kzaVar3.g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = kzaVar3.g;
                if (kzaVar3.s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = kzaVar3.c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(y6c.t0).sendRequest(tL_messages_uploadMedia, new apa(this, kzaVar3, (byte) 4), 2);
            }
        } else if (i == kk7.V1) {
            String str2 = (String) objArr[0];
            kza kzaVar4 = this.a0;
            if (kzaVar4 != null && str2.equalsIgnoreCase(kzaVar4.b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    kza kzaVar5 = this.a0;
                    kzaVar5.u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, kzaVar5.u);
                    np3 np3Var = this.e0;
                    if (np3Var != null) {
                        np3Var.setProgress(this.a0.b());
                    }
                }
            }
        } else if (i == kk7.U1) {
            String str3 = (String) objArr[0];
            kza kzaVar6 = this.a0;
            if (kzaVar6 != null && str3.equalsIgnoreCase(kzaVar6.b)) {
                h();
            }
        } else if (i == kk7.Z1) {
            kza kzaVar7 = this.a0;
            if (kzaVar7 != null && objArr[0] == kzaVar7.r) {
                ba4.G(y6c.t0).h0(false, 67108864, this.a0.b, true);
            }
        } else if (i == kk7.a2) {
            kza kzaVar8 = this.a0;
            if (kzaVar8 != null && objArr[0] == kzaVar8.r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f = (Float) objArr[4];
                float floatValue = f.floatValue();
                this.a0.r.r0.X = true;
                ba4.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f);
                kza kzaVar9 = this.a0;
                kzaVar9.t = Math.max(kzaVar9.t, floatValue);
                np3 np3Var2 = this.e0;
                if (np3Var2 != null) {
                    np3Var2.setProgress(this.a0.b());
                }
            }
        } else if (i == kk7.b2 && (kzaVar = this.a0) != null && objArr[0] == kzaVar.r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.w, this.e);
        canvas.drawPath(this.x, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mza.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        jza jzaVar = this.F;
        if (jzaVar != null) {
            this.L = bitmap;
            if (jzaVar.f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                jza jzaVar2 = this.F;
                if (jzaVar2.c != 0) {
                    Matrix matrix = new Matrix();
                    jza jzaVar3 = this.F;
                    matrix.postRotate(jzaVar3.c, jzaVar3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    jza jzaVar4 = this.F;
                    if ((jzaVar4.c / 90) % 2 != 0) {
                        float height = (jzaVar4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                    canvas.drawBitmap(this.F.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(jzaVar2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.N;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(s33.h).start();
    }

    public final void g(Canvas canvas, boolean z, ViewGroup viewGroup, boolean z2) {
        boolean z3;
        float d;
        float f;
        Paint paint;
        lm lmVar = this.c;
        lmVar.a = viewGroup;
        boolean z4 = this.j0;
        if (z4 || lmVar.c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z4 && !z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d = lmVar.d(z3);
            }
            jza[] jzaVarArr = this.I;
            if (jzaVarArr != null) {
                for (jza jzaVar : jzaVarArr) {
                    if (jzaVar != null && jzaVar == this.F) {
                        if (this.G > 0.0f) {
                            if (jzaVar.t.l0 != null) {
                                canvas.save();
                                canvas.clipPath(jzaVar.t.l0);
                                if (jzaVar.t.J != null) {
                                    if (z) {
                                        paint = jzaVar.q;
                                    } else {
                                        paint = jzaVar.p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(gl.L(f));
                                    canvas.drawPath(jzaVar.l, paint);
                                    if (jzaVar.t.l0 != null && z) {
                                        canvas.clipPath(jzaVar.l);
                                        paint.setStrokeWidth(gl.L(f * 2.0f));
                                        canvas.drawPath(jzaVar.t.l0, paint);
                                    }
                                }
                                canvas.restore();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.Q;
    }

    public float getSegmentBorderImageWidth() {
        return this.P;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        jza jzaVar;
        if (this.M && (jzaVar = this.F) != null) {
            return jzaVar.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public ijb getThanosEffect() {
        if (!ijb.c()) {
            return null;
        }
        if (this.T == null) {
            ijb ijbVar = new ijb(getContext(), new bza(this, (byte) 1));
            this.T = ijbVar;
            addView(ijbVar, nme.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        np3 np3Var = this.e0;
        if (np3Var != null) {
            np3Var.a();
            this.e0 = null;
        }
    }

    public final jza i(float f, float f2) {
        int width;
        int height;
        if (this.J != null) {
            int i = 0;
            while (true) {
                jza[] jzaVarArr = this.I;
                if (i < jzaVarArr.length) {
                    jza jzaVar = jzaVarArr[i];
                    if (jzaVar != null) {
                        int i2 = (jzaVar.c / 90) % 2;
                        Bitmap bitmap = this.J;
                        if (i2 != 0) {
                            width = bitmap.getHeight();
                            height = this.J.getWidth();
                        } else {
                            width = bitmap.getWidth();
                            height = this.J.getHeight();
                        }
                        RectF rectF = gl.P;
                        RectF rectF2 = this.I[i].i;
                        float f3 = width;
                        float f4 = this.g0;
                        float f5 = height;
                        float f6 = this.h0;
                        rectF.set((rectF2.left / f3) * f4, (rectF2.top / f5) * f6, (rectF2.right / f3) * f4, (rectF2.bottom / f5) * f6);
                        this.f0.mapRect(rectF);
                        if (rectF.contains(f, f2)) {
                            return jzaVar;
                        }
                    }
                    i++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final void k() {
        Bitmap bitmap;
        jza[] jzaVarArr = this.I;
        if (jzaVarArr != null) {
            for (jza jzaVar : jzaVarArr) {
                if (jzaVar != null && (bitmap = jzaVar.e) != null) {
                    bitmap.recycle();
                    jzaVar.e = null;
                    Bitmap bitmap2 = jzaVar.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        jzaVar.g = null;
                    }
                    c(jzaVar, this.U, this.V);
                }
            }
        }
    }

    public final void l(Bitmap bitmap, int i, int i2, int i3, r68 r68Var) {
        int i4;
        int i5;
        ig7 ig7Var;
        if (i2 <= 0) {
            i4 = gl.q.x;
        } else {
            i4 = i2;
        }
        if (i3 <= 0) {
            i5 = gl.q.y;
        } else {
            i5 = i3;
        }
        this.U = i4;
        this.V = i5;
        if (!this.E && !this.y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i;
            this.d0 = null;
            a61 a61Var = new a61(this, i, r68Var, (byte) 5);
            this.y = true;
            j00 j00Var = new j00();
            j00Var.b = true;
            j00Var.c = true;
            knd a = uue.a(new fab(j00Var));
            if (h24.m(getContext()).h()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.a).drawRect(0.0f, 0.0f, obj.d, obj.e, bkb.Gm);
                obj.b = (bitmap2.getWidth() - obj.d) / 2;
                obj.c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                a61Var.a(arrayList);
                return;
            }
            go5 a2 = go5.a(i, bitmap);
            a.c(a2).addOnSuccessListener(new wh9(a61Var, (byte) 29)).addOnFailureListener(new gg(this, bitmap, i, r68Var, a61Var));
            if (this.d0 == null) {
                ik5 ik5Var = ik5.b;
                fre.i(ik5Var, "options cannot be null");
                synchronized (ig7.class) {
                    ig7Var = (ig7) ae7.c().a(ig7.class);
                }
                mt8 mt8Var = (mt8) ig7Var.a.get(ik5.class);
                fre.h(mt8Var);
                jnd jndVar = (jnd) mt8Var.get();
                jndVar.getClass();
                z3f z3fVar = jndVar.c;
                ?? obj2 = new Object();
                obj2.c = tse.TYPE_THIN;
                yjb.c(1, new vc1(z3fVar, new qx((ep) obj2, 1), ete.ON_DEVICE_IMAGE_LABEL_CREATE, z3fVar.b(), (byte) 3));
                new hk5((mg6) jndVar.a.c(ik5Var), (Executor) jndVar.b.a.get(), new f84("vision.ica", 1L)).c(a2).addOnSuccessListener(new hza(this, (byte) 0)).addOnFailureListener(new ho9((byte) 29));
            }
            ArrayList arrayList2 = hq6.d0(this.a).n;
            for (int i6 = 0; i6 < Math.min(arrayList2.size(), 9); i6++) {
                vu3.g(((TLRPC.TL_availableReaction) arrayList2.get(i6)).reaction);
            }
        }
    }

    public final void m(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new u21((FrameLayout) getParent(), this.b0).t(tL_error.text, null).j();
        }
    }

    public final void n() {
        Path path = this.l0;
        if (path == null) {
            this.l0 = new Path();
        } else {
            path.rewind();
        }
        if (this.m0 == null) {
            this.m0 = new Path();
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.l0.addPath(this.m0, this.k0);
        this.l0.computeBounds(this.n0, true);
    }

    public final void o(final String str, final oac oacVar, final String str2, final CharSequence charSequence, final boolean z, final long j, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final pz1 pz1Var, final f fVar) {
        gl.d3(new Runnable() {
            @Override
            public final void run() {
                boolean z2;
                kza kzaVar;
                mza mzaVar = mza.this;
                pz1 pz1Var2 = pz1Var;
                if (pz1Var2 != null && (kzaVar = mzaVar.a0) != null && kzaVar.o) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    kza kzaVar2 = mzaVar.a0;
                    if (kzaVar2 != null) {
                        kzaVar2.a();
                    }
                    ?? obj = new Object();
                    obj.p = new ArrayList();
                    obj.q = new ArrayList();
                    obj.t = 0.0f;
                    obj.u = 0.0f;
                    mzaVar.a0 = obj;
                }
                kza kzaVar3 = mzaVar.a0;
                kzaVar3.c = str2;
                String str4 = str;
                kzaVar3.b = str4;
                kzaVar3.a = str4;
                kzaVar3.d = charSequence;
                kzaVar3.h = z;
                kzaVar3.i = j;
                kzaVar3.j = stickerSet;
                kzaVar3.k = document;
                oac oacVar2 = oacVar;
                kzaVar3.s = oacVar2;
                kzaVar3.l = str3;
                kzaVar3.n = pz1Var2;
                kzaVar3.m = fVar;
                ArrayList arrayList = kzaVar3.q;
                if (!TextUtils.isEmpty(str4)) {
                    kzaVar3.p.add(new File(kzaVar3.b));
                }
                if (!TextUtils.isEmpty(kzaVar3.a) && !TextUtils.equals(kzaVar3.a, kzaVar3.b)) {
                    arrayList.add(new File(kzaVar3.a));
                }
                if (!TextUtils.isEmpty(kzaVar3.l)) {
                    arrayList.add(new File(kzaVar3.l));
                }
                if (!z2) {
                    mzaVar.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        kza kzaVar4 = mzaVar.a0;
                        kzaVar4.e = hq6.c0(document3, kzaVar4.c);
                        mzaVar.a0.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = mzaVar.a0.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        mzaVar.a();
                    } else if (oacVar2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        kza kzaVar5 = mzaVar.a0;
                        String absolutePath = f4b.w(y6c.t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        kzaVar5.b = absolutePath;
                        mzaVar.a0.r = new k27(y6c.t0, tL_message, null, false, false);
                        mzaVar.a0.r.r0 = oacVar2;
                        MediaController.w().g0(mzaVar.a0.r, false, false, false);
                    } else {
                        ba4.G(mzaVar.a).h0(false, 67108864, str4, true);
                    }
                }
                if (pz1Var2 == null) {
                    np3 np3Var = mzaVar.e0;
                    if (np3Var == null) {
                        np3Var = new np3(mzaVar.getContext(), k96.M0(2131746728, null));
                        mzaVar.e0 = np3Var;
                    }
                    np3Var.setOnCancelListener(new bza(mzaVar, (byte) 0));
                    if (mzaVar.e0.getParent() == null) {
                        mzaVar.addView(mzaVar.e0, nme.e(-1, -1, 17));
                    }
                    np3 np3Var2 = mzaVar.e0;
                    np3Var2.F = true;
                    np3Var2.invalidate();
                }
            }
        }, 300L);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.T1);
        kk7.f(this.a).b(this, kk7.V1);
        kk7.f(this.a).b(this, kk7.U1);
        kk7.f(this.a).b(this, kk7.b2);
        kk7.f(this.a).b(this, kk7.Z1);
        kk7.f(this.a).b(this, kk7.a2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        if (i >= 0) {
            kk7.f(i).n(this, kk7.T1);
            kk7.f(this.a).n(this, kk7.V1);
            kk7.f(this.a).n(this, kk7.U1);
            kk7.f(this.a).n(this, kk7.b2);
            kk7.f(this.a).n(this, kk7.Z1);
            kk7.f(this.a).n(this, kk7.a2);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = gl.L(10.0f);
        float f = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f;
        float measuredHeight = getMeasuredHeight() - f;
        float f2 = measuredWidth / 8.0f;
        RectF rectF = gl.P;
        float f3 = measuredWidth + L;
        rectF.set(L, L, f3, f3);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f2, f2, direction);
        Path path2 = this.r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.x;
        path4.rewind();
        rectF.inset(gl.L(-1.0f), gl.L(-1.0f));
        path4.addRoundRect(rectF, f2, f2, direction);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + gl.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.q0;
            arrayList.clear();
            if (this.j0) {
                Rect rect = this.r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, gl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setCurrentAccount(int i) {
        int i2 = this.a;
        if (i2 != i) {
            int i3 = kk7.a2;
            int i4 = kk7.Z1;
            int i5 = kk7.b2;
            int i6 = kk7.U1;
            int i7 = kk7.V1;
            int i8 = kk7.T1;
            if (i2 >= 0 && isAttachedToWindow()) {
                kk7.f(this.a).n(this, i8);
                kk7.f(this.a).n(this, i7);
                kk7.f(this.a).n(this, i6);
                kk7.f(this.a).n(this, i5);
                kk7.f(this.a).n(this, i4);
                kk7.f(this.a).n(this, i3);
            }
            this.a = i;
            if (i >= 0 && isAttachedToWindow()) {
                kk7.f(this.a).b(this, i8);
                kk7.f(this.a).b(this, i7);
                kk7.f(this.a).b(this, i6);
                kk7.f(this.a).b(this, i5);
                kk7.f(this.a).b(this, i4);
                kk7.f(this.a).b(this, i3);
            }
        }
    }

    public void setOutlineVisible(boolean z) {
        float f;
        if (this.j0 != z) {
            this.j0 = z;
            ViewPropertyAnimator animate = this.i0.animate();
            float f2 = 0.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (!z) {
                f2 = gl.L(-18.0f);
            }
            alpha.translationX(f2).setInterpolator(s33.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.q0;
                arrayList.clear();
                if (this.j0) {
                    Rect rect = this.r0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, gl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f) {
        this.G = f;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(vya vyaVar) {
        this.c0 = vyaVar;
    }
}
