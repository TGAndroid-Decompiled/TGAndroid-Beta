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
public final class k3b extends FrameLayout implements fn7 {
    public volatile boolean E;
    public h3b F;
    public float G;
    public boolean H;
    public h3b[] I;
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
    public hnb T;
    public int U;
    public int V;
    public boolean W;
    public int a;
    public i3b a0;
    public final mm b;
    public final vnb b0;
    public final mm c;
    public v2b c0;
    public final Paint d;
    public String d0;
    public final Paint e;
    public eq3 e0;
    public final Paint f;
    public final Matrix f0;
    public float g0;
    public final Paint h;
    public float h0;
    public final gx7 i0;
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

    public k3b(ContextThemeWrapper contextThemeWrapper, vnb vnbVar) {
        super(contextThemeWrapper);
        this.a = -1;
        k43 k43Var = k43.h;
        this.b = new mm(0.0f, (View) null, 0L, 420L, k43Var);
        this.c = new mm(0.0f, (View) null, 0L, 420L, k43Var);
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
        this.b0 = vnbVar;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{hl.L(5.0f), hl.L(10.0f)}, 0.5f));
        paint.setShadowLayer(hl.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, tre.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(hl.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(hl.L(20.0f)));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(hl.L(4.0f), blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(hl.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(hl.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(hl.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        gx7 gx7Var = new gx7(contextThemeWrapper);
        this.i0 = gx7Var;
        gx7Var.setAlpha(0.0f);
        gx7Var.setTranslationX(-hl.L(18.0f));
        gx7Var.b(0.33f, 10.0f);
        gx7Var.setBrushWeight(this.G);
        gx7Var.setValueOverride(new pq8(this, (byte) 18));
        gx7Var.setTranslationX(-hl.L(18.0f));
        gx7Var.setAlpha(0.0f);
        addView(gx7Var, tre.c(-1.0f, -1));
    }

    public static void c(defpackage.h3b r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3b.c(h3b, int, int):void");
    }

    public static List j(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((g3b) arrayList.get(0));
        int i = 1;
        while (i < arrayList.size() - 1) {
            g3b g3bVar = (g3b) arrayList.get(i - 1);
            g3b g3bVar2 = (g3b) arrayList.get(i);
            i++;
            g3b g3bVar3 = (g3b) arrayList.get(i);
            int i2 = ((Point) g3bVar2).x;
            int i3 = ((Point) g3bVar).x;
            int i4 = ((Point) g3bVar3).y;
            int i5 = ((Point) g3bVar).y;
            if (Math.abs((((i4 - i5) * (i2 - i3)) - ((((Point) g3bVar3).x - i3) * (((Point) g3bVar2).y - i5))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(g3bVar2);
            }
        }
        arrayList2.add((g3b) c00.g(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final i3b i3bVar = this.a0;
        if (i3bVar != null) {
            final int i = yac.t0;
            i3bVar.o = true;
            if (i3bVar.m != null) {
                h();
                i3bVar.m.a(i3bVar.b, i3bVar.e.document);
                hl.d3(new osa((byte) 3), 250L);
            } else if (i3bVar.k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = ls6.c0(i3bVar.k, i3bVar.c).document;
                tL_stickers_replaceSticker.new_sticker = i3bVar.e;
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final k3b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final k3b k3bVar = this.b;
                                final int i2 = i;
                                final i3b i3bVar2 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar3 = i3bVar2;
                                        int i3 = i2;
                                        final k3b k3bVar2 = k3bVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i3).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i3).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i3).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar2.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar4 = i3bVar3;
                                                            TLObject tLObject3 = tLObject2;
                                                            k3b k3bVar3 = k3bVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject3, document, str, bool);
                                                                    k3bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject3, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject3, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar2.m(tL_error2);
                                                    k3bVar2.h();
                                                }
                                                rx1 rx1Var = i3bVar3.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar3.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i3).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i3).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar2.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar4 = i3bVar3;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar3 = k3bVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar2.m(tL_error2);
                                                    k3bVar2.h();
                                                }
                                                rx1 rx1Var2 = i3bVar3.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z));
                                                    i3bVar3.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i3).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i3).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i3).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar2.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar4 = i3bVar3;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar3 = k3bVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar2.m(tL_error2);
                                                    k3bVar2.h();
                                                }
                                                rx1 rx1Var3 = i3bVar3.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar3.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final k3b k3bVar2 = this.b;
                                final int i3 = i;
                                final i3b i3bVar3 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar3;
                                        int i32 = i3;
                                        final k3b k3bVar22 = k3bVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar4 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar3 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar4 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar3 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar4 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar3 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar4.f.document;
                                                                    String str = i3bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar4.f.document, i3bVar4.l, Boolean.TRUE);
                                                                    k3bVar3.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar4.f.document;
                                                                    String str2 = i3bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final k3b k3bVar3 = this.b;
                                final int i4 = i;
                                final i3b i3bVar4 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar4;
                                        int i32 = i4;
                                        final k3b k3bVar22 = k3bVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
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
            } else if (i3bVar.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = i3bVar.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(i3bVar.e);
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final k3b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final k3b k3bVar = this.b;
                                final int i2 = i;
                                final i3b i3bVar2 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar2;
                                        int i32 = i2;
                                        final k3b k3bVar22 = k3bVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final k3b k3bVar2 = this.b;
                                final int i3 = i;
                                final i3b i3bVar3 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar3;
                                        int i32 = i3;
                                        final k3b k3bVar22 = k3bVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final k3b k3bVar3 = this.b;
                                final int i4 = i;
                                final i3b i3bVar4 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar4;
                                        int i32 = i4;
                                        final k3b k3bVar22 = k3bVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var = k3bVar22.e0;
                                                    if (eq3Var != null) {
                                                        eq3Var.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var = i3bVar32.n;
                                                if (rx1Var != null) {
                                                    rx1Var.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var2 = i3bVar32.n;
                                                if (rx1Var2 != null) {
                                                    rx1Var2.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
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
            } else if (i3bVar.h) {
                h();
                jn7.f(i).m(jn7.u3, Boolean.FALSE);
                hl.d3(new uoa(i3bVar, (byte) 19), 350L);
                rx1 rx1Var = i3bVar.n;
                if (rx1Var != null) {
                    rx1Var.a(Boolean.TRUE);
                }
            } else if (i3bVar.i != 0) {
                r7a.B(i).t0(i3bVar.f.document, null, i3bVar.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                eq3 eq3Var = this.e0;
                if (eq3Var != null) {
                    eq3Var.setProgress(1.0f);
                }
                hl.d3(new me7(this, i, (byte) 19), 450L);
                rx1 rx1Var2 = i3bVar.n;
                if (rx1Var2 != null) {
                    rx1Var2.a(Boolean.TRUE);
                    i3bVar.n = null;
                }
            } else if (i3bVar.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ls6.b0(i3bVar.j);
                tL_stickers_addStickerToSet.sticker = i3bVar.e;
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final k3b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final k3b k3bVar = this.b;
                                final int i2 = i;
                                final i3b i3bVar2 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar2;
                                        int i32 = i2;
                                        final k3b k3bVar22 = k3bVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var22 = k3bVar22.e0;
                                                    if (eq3Var22 != null) {
                                                        eq3Var22.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var22 = i3bVar32.n;
                                                if (rx1Var22 != null) {
                                                    rx1Var22.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var32 = i3bVar32.n;
                                                if (rx1Var32 != null) {
                                                    rx1Var32.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final k3b k3bVar2 = this.b;
                                final int i3 = i;
                                final i3b i3bVar3 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar3;
                                        int i32 = i3;
                                        final k3b k3bVar22 = k3bVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var22 = k3bVar22.e0;
                                                    if (eq3Var22 != null) {
                                                        eq3Var22.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var22 = i3bVar32.n;
                                                if (rx1Var22 != null) {
                                                    rx1Var22.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var32 = i3bVar32.n;
                                                if (rx1Var32 != null) {
                                                    rx1Var32.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final k3b k3bVar3 = this.b;
                                final int i4 = i;
                                final i3b i3bVar4 = i3bVar;
                                hl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final i3b i3bVar32 = i3bVar4;
                                        int i32 = i4;
                                        final k3b k3bVar22 = k3bVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var2 = k3bVar22.e0;
                                                    if (eq3Var2 != null) {
                                                        eq3Var2.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var3 = i3bVar32.n;
                                                if (rx1Var3 != null) {
                                                    rx1Var3.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    ls6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ls6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    eq3 eq3Var22 = k3bVar22.e0;
                                                    if (eq3Var22 != null) {
                                                        eq3Var22.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var22 = i3bVar32.n;
                                                if (rx1Var22 != null) {
                                                    rx1Var22.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    ls6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!ls6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        ls6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    eq3 eq3Var3 = k3bVar22.e0;
                                                    if (eq3Var3 != null) {
                                                        eq3Var3.setProgress(1.0f);
                                                    }
                                                    hl.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            i3b i3bVar42 = i3bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            k3b k3bVar32 = k3bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    jn7 f = jn7.f(yac.t0);
                                                                    TLRPC.Document document = i3bVar42.f.document;
                                                                    String str = i3bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    k3bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    jn7.f(yac.t0).m(218, Boolean.FALSE, tLObject32, i3bVar42.f.document, i3bVar42.l, Boolean.TRUE);
                                                                    k3bVar32.h();
                                                                    return;
                                                                default:
                                                                    jn7 f2 = jn7.f(yac.t0);
                                                                    TLRPC.Document document2 = i3bVar42.f.document;
                                                                    String str2 = i3bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    k3bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    k3bVar22.m(tL_error2);
                                                    k3bVar22.h();
                                                }
                                                rx1 rx1Var32 = i3bVar32.n;
                                                if (rx1Var32 != null) {
                                                    rx1Var32.a(Boolean.valueOf(z));
                                                    i3bVar32.n = null;
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
                h3b[] h3bVarArr = this.I;
                if (i >= h3bVarArr.length) {
                    break;
                }
                h3b h3bVar = h3bVarArr[i];
                if (h3bVar != null) {
                    h3bVar.l.reset();
                    Bitmap bitmap = h3bVar.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        h3bVar.e = null;
                    }
                    Bitmap bitmap2 = h3bVar.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        h3bVar.d = null;
                    }
                    Bitmap bitmap3 = h3bVar.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        h3bVar.g = null;
                    }
                    Bitmap bitmap4 = h3bVar.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        h3bVar.f = null;
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
        i3b i3bVar = this.a0;
        if (i3bVar != null) {
            if (!i3bVar.o) {
                i3bVar.a();
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
        i3b i3bVar;
        if (i == jn7.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            i3b i3bVar2 = this.a0;
            if (i3bVar2 != null && str.equalsIgnoreCase(i3bVar2.b)) {
                i3b i3bVar3 = this.a0;
                i3bVar3.g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = i3bVar3.g;
                if (i3bVar3.s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = i3bVar3.c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(yac.t0).sendRequest(tL_messages_uploadMedia, new isa(this, i3bVar3, (byte) 5), 2);
            }
        } else if (i == jn7.W1) {
            String str2 = (String) objArr[0];
            i3b i3bVar4 = this.a0;
            if (i3bVar4 != null && str2.equalsIgnoreCase(i3bVar4.b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    i3b i3bVar5 = this.a0;
                    i3bVar5.u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, i3bVar5.u);
                    eq3 eq3Var = this.e0;
                    if (eq3Var != null) {
                        eq3Var.setProgress(this.a0.b());
                    }
                }
            }
        } else if (i == jn7.V1) {
            String str3 = (String) objArr[0];
            i3b i3bVar6 = this.a0;
            if (i3bVar6 != null && str3.equalsIgnoreCase(i3bVar6.b)) {
                h();
            }
        } else if (i == jn7.a2) {
            i3b i3bVar7 = this.a0;
            if (i3bVar7 != null && objArr[0] == i3bVar7.r) {
                xb4.G(yac.t0).h0(false, 67108864, this.a0.b, true);
            }
        } else if (i == jn7.b2) {
            i3b i3bVar8 = this.a0;
            if (i3bVar8 != null && objArr[0] == i3bVar8.r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f = (Float) objArr[4];
                float floatValue = f.floatValue();
                this.a0.r.r0.X = true;
                xb4.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f);
                i3b i3bVar9 = this.a0;
                i3bVar9.t = Math.max(i3bVar9.t, floatValue);
                eq3 eq3Var2 = this.e0;
                if (eq3Var2 != null) {
                    eq3Var2.setProgress(this.a0.b());
                }
            }
        } else if (i == jn7.c2 && (i3bVar = this.a0) != null && objArr[0] == i3bVar.r) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        h3b h3bVar = this.F;
        if (h3bVar != null) {
            this.L = bitmap;
            if (h3bVar.f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                h3b h3bVar2 = this.F;
                if (h3bVar2.c != 0) {
                    Matrix matrix = new Matrix();
                    h3b h3bVar3 = this.F;
                    matrix.postRotate(h3bVar3.c, h3bVar3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    h3b h3bVar4 = this.F;
                    if ((h3bVar4.c / 90) % 2 != 0) {
                        float height = (h3bVar4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                    canvas.drawBitmap(this.F.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(h3bVar2.a(), (Rect) null, rect, paint);
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
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(k43.h).start();
    }

    public final void g(Canvas canvas, boolean z, ViewGroup viewGroup, boolean z2) {
        boolean z3;
        float d;
        float f;
        Paint paint;
        mm mmVar = this.c;
        mmVar.a = viewGroup;
        boolean z4 = this.j0;
        if (z4 || mmVar.c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z4 && !z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d = mmVar.d(z3);
            }
            h3b[] h3bVarArr = this.I;
            if (h3bVarArr != null) {
                for (h3b h3bVar : h3bVarArr) {
                    if (h3bVar != null && h3bVar == this.F) {
                        if (this.G > 0.0f) {
                            if (h3bVar.t.l0 != null) {
                                canvas.save();
                                canvas.clipPath(h3bVar.t.l0);
                                if (h3bVar.t.J != null) {
                                    if (z) {
                                        paint = h3bVar.q;
                                    } else {
                                        paint = h3bVar.p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(hl.L(f));
                                    canvas.drawPath(h3bVar.l, paint);
                                    if (h3bVar.t.l0 != null && z) {
                                        canvas.clipPath(h3bVar.l);
                                        paint.setStrokeWidth(hl.L(f * 2.0f));
                                        canvas.drawPath(h3bVar.t.l0, paint);
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
        h3b h3bVar;
        if (this.M && (h3bVar = this.F) != null) {
            return h3bVar.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public hnb getThanosEffect() {
        if (!hnb.c()) {
            return null;
        }
        if (this.T == null) {
            hnb hnbVar = new hnb(getContext(), new b3b(this, (byte) 0));
            this.T = hnbVar;
            addView(hnbVar, tre.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        eq3 eq3Var = this.e0;
        if (eq3Var != null) {
            eq3Var.a();
            this.e0 = null;
        }
    }

    public final h3b i(float f, float f2) {
        int width;
        int height;
        if (this.J != null) {
            int i = 0;
            while (true) {
                h3b[] h3bVarArr = this.I;
                if (i < h3bVarArr.length) {
                    h3b h3bVar = h3bVarArr[i];
                    if (h3bVar != null) {
                        int i2 = (h3bVar.c / 90) % 2;
                        Bitmap bitmap = this.J;
                        if (i2 != 0) {
                            width = bitmap.getHeight();
                            height = this.J.getWidth();
                        } else {
                            width = bitmap.getWidth();
                            height = this.J.getHeight();
                        }
                        RectF rectF = hl.P;
                        RectF rectF2 = this.I[i].i;
                        float f3 = width;
                        float f4 = this.g0;
                        float f5 = height;
                        float f6 = this.h0;
                        rectF.set((rectF2.left / f3) * f4, (rectF2.top / f5) * f6, (rectF2.right / f3) * f4, (rectF2.bottom / f5) * f6);
                        this.f0.mapRect(rectF);
                        if (rectF.contains(f, f2)) {
                            return h3bVar;
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
        h3b[] h3bVarArr = this.I;
        if (h3bVarArr != null) {
            for (h3b h3bVar : h3bVarArr) {
                if (h3bVar != null && (bitmap = h3bVar.e) != null) {
                    bitmap.recycle();
                    h3bVar.e = null;
                    Bitmap bitmap2 = h3bVar.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        h3bVar.g = null;
                    }
                    c(h3bVar, this.U, this.V);
                }
            }
        }
    }

    public final void l(Bitmap bitmap, int i, int i2, int i3, ea8 ea8Var) {
        int i4;
        int i5;
        ri7 ri7Var;
        if (i2 <= 0) {
            i4 = hl.q.x;
        } else {
            i4 = i2;
        }
        if (i3 <= 0) {
            i5 = hl.q.y;
        } else {
            i5 = i3;
        }
        this.U = i4;
        this.V = i5;
        if (!this.E && !this.y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i;
            this.d0 = null;
            i61 i61Var = new i61(this, i, ea8Var, (byte) 5);
            this.y = true;
            k00 k00Var = new k00();
            k00Var.b = true;
            k00Var.c = true;
            bsd a = mze.a(new deb(k00Var));
            if (c34.m(getContext()).h()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.a).drawRect(0.0f, 0.0f, obj.d, obj.e, aob.Hm);
                obj.b = (bitmap2.getWidth() - obj.d) / 2;
                obj.c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                i61Var.a(arrayList);
                return;
            }
            jq5 a2 = jq5.a(i, bitmap);
            a.c(a2).addOnSuccessListener(new hja(i61Var, (byte) 12)).addOnFailureListener(new eg(this, bitmap, i, ea8Var, i61Var));
            if (this.d0 == null) {
                lm5 lm5Var = lm5.b;
                xve.i(lm5Var, "options cannot be null");
                synchronized (ri7.class) {
                    ri7Var = (ri7) jg7.c().a(ri7.class);
                }
                vw8 vw8Var = (vw8) ri7Var.a.get(lm5.class);
                xve.h(vw8Var);
                asd asdVar = (asd) vw8Var.get();
                asdVar.getClass();
                q8f q8fVar = asdVar.c;
                ?? obj2 = new Object();
                obj2.c = kxe.TYPE_THIN;
                xnb.c(1, new dd1(q8fVar, new rx((fp) obj2, 1), vxe.ON_DEVICE_IMAGE_LABEL_CREATE, q8fVar.b(), (byte) 3));
                new km5((qi6) asdVar.a.c(lm5Var), (Executor) asdVar.b.a.get(), new a94("vision.ica", 1L)).c(a2).addOnSuccessListener(new hja(this, (byte) 13)).addOnFailureListener(new bya((byte) 1));
            }
            ArrayList arrayList2 = ls6.d0(this.a).n;
            for (int i6 = 0; i6 < Math.min(arrayList2.size(), 9); i6++) {
                pv3.g(((TLRPC.TL_availableReaction) arrayList2.get(i6)).reaction);
            }
        }
    }

    public final void m(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new d31((FrameLayout) getParent(), this.b0).t(tL_error.text, null).j();
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
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.l0.addPath(this.m0, this.k0);
        this.l0.computeBounds(this.n0, true);
    }

    public final void o(final String str, final oec oecVar, final String str2, final CharSequence charSequence, final boolean z, final long j, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final rx1 rx1Var, final c cVar) {
        hl.d3(new Runnable() {
            @Override
            public final void run() {
                boolean z2;
                i3b i3bVar;
                k3b k3bVar = k3b.this;
                rx1 rx1Var2 = rx1Var;
                if (rx1Var2 != null && (i3bVar = k3bVar.a0) != null && i3bVar.o) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    i3b i3bVar2 = k3bVar.a0;
                    if (i3bVar2 != null) {
                        i3bVar2.a();
                    }
                    ?? obj = new Object();
                    obj.p = new ArrayList();
                    obj.q = new ArrayList();
                    obj.t = 0.0f;
                    obj.u = 0.0f;
                    k3bVar.a0 = obj;
                }
                i3b i3bVar3 = k3bVar.a0;
                i3bVar3.c = str2;
                String str4 = str;
                i3bVar3.b = str4;
                i3bVar3.a = str4;
                i3bVar3.d = charSequence;
                i3bVar3.h = z;
                i3bVar3.i = j;
                i3bVar3.j = stickerSet;
                i3bVar3.k = document;
                oec oecVar2 = oecVar;
                i3bVar3.s = oecVar2;
                i3bVar3.l = str3;
                i3bVar3.n = rx1Var2;
                i3bVar3.m = cVar;
                ArrayList arrayList = i3bVar3.q;
                if (!TextUtils.isEmpty(str4)) {
                    i3bVar3.p.add(new File(i3bVar3.b));
                }
                if (!TextUtils.isEmpty(i3bVar3.a) && !TextUtils.equals(i3bVar3.a, i3bVar3.b)) {
                    arrayList.add(new File(i3bVar3.a));
                }
                if (!TextUtils.isEmpty(i3bVar3.l)) {
                    arrayList.add(new File(i3bVar3.l));
                }
                if (!z2) {
                    k3bVar.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        i3b i3bVar4 = k3bVar.a0;
                        i3bVar4.e = ls6.c0(document3, i3bVar4.c);
                        k3bVar.a0.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = k3bVar.a0.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        k3bVar.a();
                    } else if (oecVar2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        i3b i3bVar5 = k3bVar.a0;
                        String absolutePath = c8b.w(yac.t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        i3bVar5.b = absolutePath;
                        k3bVar.a0.r = new r47(yac.t0, tL_message, null, false, false);
                        k3bVar.a0.r.r0 = oecVar2;
                        MediaController.z().j0(k3bVar.a0.r, false, false, false);
                    } else {
                        xb4.G(k3bVar.a).h0(false, 67108864, str4, true);
                    }
                }
                if (rx1Var2 == null) {
                    eq3 eq3Var = k3bVar.e0;
                    if (eq3Var == null) {
                        eq3Var = new eq3(k3bVar.getContext(), ob6.M0(2131746648, null));
                        k3bVar.e0 = eq3Var;
                    }
                    eq3Var.setOnCancelListener(new b3b(k3bVar, (byte) 1));
                    if (k3bVar.e0.getParent() == null) {
                        k3bVar.addView(k3bVar.e0, tre.e(-1, -1, 17));
                    }
                    eq3 eq3Var2 = k3bVar.e0;
                    eq3Var2.F = true;
                    eq3Var2.invalidate();
                }
            }
        }, 300L);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.U1);
        jn7.f(this.a).b(this, jn7.W1);
        jn7.f(this.a).b(this, jn7.V1);
        jn7.f(this.a).b(this, jn7.c2);
        jn7.f(this.a).b(this, jn7.a2);
        jn7.f(this.a).b(this, jn7.b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        if (i >= 0) {
            jn7.f(i).n(this, jn7.U1);
            jn7.f(this.a).n(this, jn7.W1);
            jn7.f(this.a).n(this, jn7.V1);
            jn7.f(this.a).n(this, jn7.c2);
            jn7.f(this.a).n(this, jn7.a2);
            jn7.f(this.a).n(this, jn7.b2);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = hl.L(10.0f);
        float f = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f;
        float measuredHeight = getMeasuredHeight() - f;
        float f2 = measuredWidth / 8.0f;
        RectF rectF = hl.P;
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
        rectF.inset(hl.L(-1.0f), hl.L(-1.0f));
        path4.addRoundRect(rectF, f2, f2, direction);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + hl.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.q0;
            arrayList.clear();
            if (this.j0) {
                Rect rect = this.r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, hl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setCurrentAccount(int i) {
        int i2 = this.a;
        if (i2 != i) {
            int i3 = jn7.b2;
            int i4 = jn7.a2;
            int i5 = jn7.c2;
            int i6 = jn7.V1;
            int i7 = jn7.W1;
            int i8 = jn7.U1;
            if (i2 >= 0 && isAttachedToWindow()) {
                jn7.f(this.a).n(this, i8);
                jn7.f(this.a).n(this, i7);
                jn7.f(this.a).n(this, i6);
                jn7.f(this.a).n(this, i5);
                jn7.f(this.a).n(this, i4);
                jn7.f(this.a).n(this, i3);
            }
            this.a = i;
            if (i >= 0 && isAttachedToWindow()) {
                jn7.f(this.a).b(this, i8);
                jn7.f(this.a).b(this, i7);
                jn7.f(this.a).b(this, i6);
                jn7.f(this.a).b(this, i5);
                jn7.f(this.a).b(this, i4);
                jn7.f(this.a).b(this, i3);
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
                f2 = hl.L(-18.0f);
            }
            alpha.translationX(f2).setInterpolator(k43.h).setDuration(320L).start();
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
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, hl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
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

    public void setStickerCutOutBtn(v2b v2bVar) {
        this.c0 = v2bVar;
    }
}
