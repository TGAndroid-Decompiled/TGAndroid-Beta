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
public final class n1b extends FrameLayout implements jm7 {
    public volatile boolean E;
    public k1b F;
    public float G;
    public boolean H;
    public k1b[] I;
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
    public jlb T;
    public int U;
    public int V;
    public boolean W;
    public int a;
    public l1b a0;
    public final ln b;
    public final ylb b0;
    public final ln c;
    public w0b c0;
    public final Paint d;
    public String d0;
    public final Paint e;
    public xq3 e0;
    public final Paint f;
    public final Matrix f0;
    public float g0;
    public final Paint h;
    public float h0;
    public final aw7 i0;
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

    public n1b(ContextThemeWrapper contextThemeWrapper, ylb ylbVar) {
        super(contextThemeWrapper);
        this.a = -1;
        d53 d53Var = d53.h;
        this.b = new ln(0.0f, (View) null, 0L, 420L, d53Var);
        this.c = new ln(0.0f, (View) null, 0L, 420L, d53Var);
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
        this.b0 = ylbVar;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{gm.L(5.0f), gm.L(10.0f)}, 0.5f));
        paint.setShadowLayer(gm.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.N = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, qoe.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(gm.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(gm.L(20.0f)));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(gm.L(4.0f), blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(gm.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(gm.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(gm.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        aw7 aw7Var = new aw7(contextThemeWrapper);
        this.i0 = aw7Var;
        aw7Var.setAlpha(0.0f);
        aw7Var.setTranslationX(-gm.L(18.0f));
        aw7Var.b(0.33f, 10.0f);
        aw7Var.setBrushWeight(this.G);
        aw7Var.setValueOverride(new et8(this, (byte) 15));
        aw7Var.setTranslationX(-gm.L(18.0f));
        aw7Var.setAlpha(0.0f);
        addView(aw7Var, qoe.c(-1.0f, -1));
    }

    public static void c(defpackage.k1b r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1b.c(k1b, int, int):void");
    }

    public static List j(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((j1b) arrayList.get(0));
        int i = 1;
        while (i < arrayList.size() - 1) {
            j1b j1bVar = (j1b) arrayList.get(i - 1);
            j1b j1bVar2 = (j1b) arrayList.get(i);
            i++;
            j1b j1bVar3 = (j1b) arrayList.get(i);
            int i2 = ((Point) j1bVar2).x;
            int i3 = ((Point) j1bVar).x;
            int i4 = ((Point) j1bVar3).y;
            int i5 = ((Point) j1bVar).y;
            if (Math.abs((((i4 - i5) * (i2 - i3)) - ((((Point) j1bVar3).x - i3) * (((Point) j1bVar2).y - i5))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(j1bVar2);
            }
        }
        arrayList2.add((j1b) b10.f(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final l1b l1bVar = this.a0;
        if (l1bVar != null) {
            final int i = z8c.t0;
            l1bVar.o = true;
            if (l1bVar.m != null) {
                h();
                l1bVar.m.a(l1bVar.b, l1bVar.e.document);
                gm.d3(new e1b((byte) 0), 250L);
            } else if (l1bVar.k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = hs6.c0(l1bVar.k, l1bVar.c).document;
                tL_stickers_replaceSticker.new_sticker = l1bVar.e;
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final n1b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final n1b n1bVar = this.b;
                                final int i2 = i;
                                final l1b l1bVar2 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar3 = l1bVar2;
                                        int i3 = i2;
                                        final n1b n1bVar2 = n1bVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i3).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i3).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i3).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var = n1bVar2.e0;
                                                    if (xq3Var != null) {
                                                        xq3Var.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar4 = l1bVar3;
                                                            TLObject tLObject3 = tLObject2;
                                                            n1b n1bVar3 = n1bVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar4.f.document;
                                                                    String str = l1bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject3, document, str, bool);
                                                                    n1bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject3, l1bVar4.f.document, l1bVar4.l, Boolean.TRUE);
                                                                    n1bVar3.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar4.f.document;
                                                                    String str2 = l1bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject3, document2, str2, bool2);
                                                                    n1bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar2.m(tL_error2);
                                                    n1bVar2.h();
                                                }
                                                qy1 qy1Var = l1bVar3.n;
                                                if (qy1Var != null) {
                                                    qy1Var.a(Boolean.valueOf(z));
                                                    l1bVar3.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i3).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i3).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var2 = n1bVar2.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar4 = l1bVar3;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar3 = n1bVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar4.f.document;
                                                                    String str = l1bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar4.f.document, l1bVar4.l, Boolean.TRUE);
                                                                    n1bVar3.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar4.f.document;
                                                                    String str2 = l1bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar2.m(tL_error2);
                                                    n1bVar2.h();
                                                }
                                                qy1 qy1Var2 = l1bVar3.n;
                                                if (qy1Var2 != null) {
                                                    qy1Var2.a(Boolean.valueOf(z));
                                                    l1bVar3.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i3).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i3).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i3).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar2.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar4 = l1bVar3;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar3 = n1bVar2;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar4.f.document;
                                                                    String str = l1bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar4.f.document, l1bVar4.l, Boolean.TRUE);
                                                                    n1bVar3.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar4.f.document;
                                                                    String str2 = l1bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar2.m(tL_error2);
                                                    n1bVar2.h();
                                                }
                                                qy1 qy1Var3 = l1bVar3.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar3.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final n1b n1bVar2 = this.b;
                                final int i3 = i;
                                final l1b l1bVar3 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar3;
                                        int i32 = i3;
                                        final n1b n1bVar22 = n1bVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var = n1bVar22.e0;
                                                    if (xq3Var != null) {
                                                        xq3Var.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar4 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar3 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar4.f.document;
                                                                    String str = l1bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar4.f.document, l1bVar4.l, Boolean.TRUE);
                                                                    n1bVar3.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar4.f.document;
                                                                    String str2 = l1bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var = l1bVar32.n;
                                                if (qy1Var != null) {
                                                    qy1Var.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar4 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar3 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar4.f.document;
                                                                    String str = l1bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar4.f.document, l1bVar4.l, Boolean.TRUE);
                                                                    n1bVar3.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar4.f.document;
                                                                    String str2 = l1bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var2 = l1bVar32.n;
                                                if (qy1Var2 != null) {
                                                    qy1Var2.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar4 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar3 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar4.f.document;
                                                                    String str = l1bVar4.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar3.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar4.f.document, l1bVar4.l, Boolean.TRUE);
                                                                    n1bVar3.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar4.f.document;
                                                                    String str2 = l1bVar4.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final n1b n1bVar3 = this.b;
                                final int i4 = i;
                                final l1b l1bVar4 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar4;
                                        int i32 = i4;
                                        final n1b n1bVar22 = n1bVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var = n1bVar22.e0;
                                                    if (xq3Var != null) {
                                                        xq3Var.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var = l1bVar32.n;
                                                if (qy1Var != null) {
                                                    qy1Var.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var2 = l1bVar32.n;
                                                if (qy1Var2 != null) {
                                                    qy1Var2.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
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
            } else if (l1bVar.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = l1bVar.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(l1bVar.e);
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final n1b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final n1b n1bVar = this.b;
                                final int i2 = i;
                                final l1b l1bVar2 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar2;
                                        int i32 = i2;
                                        final n1b n1bVar22 = n1bVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var = n1bVar22.e0;
                                                    if (xq3Var != null) {
                                                        xq3Var.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var = l1bVar32.n;
                                                if (qy1Var != null) {
                                                    qy1Var.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var2 = l1bVar32.n;
                                                if (qy1Var2 != null) {
                                                    qy1Var2.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final n1b n1bVar2 = this.b;
                                final int i3 = i;
                                final l1b l1bVar3 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar3;
                                        int i32 = i3;
                                        final n1b n1bVar22 = n1bVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var = n1bVar22.e0;
                                                    if (xq3Var != null) {
                                                        xq3Var.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var = l1bVar32.n;
                                                if (qy1Var != null) {
                                                    qy1Var.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var2 = l1bVar32.n;
                                                if (qy1Var2 != null) {
                                                    qy1Var2.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final n1b n1bVar3 = this.b;
                                final int i4 = i;
                                final l1b l1bVar4 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar4;
                                        int i32 = i4;
                                        final n1b n1bVar22 = n1bVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var = n1bVar22.e0;
                                                    if (xq3Var != null) {
                                                        xq3Var.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var = l1bVar32.n;
                                                if (qy1Var != null) {
                                                    qy1Var.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var2 = l1bVar32.n;
                                                if (qy1Var2 != null) {
                                                    qy1Var2.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
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
            } else if (l1bVar.h) {
                h();
                nm7.f(i).m(nm7.u3, Boolean.FALSE);
                gm.d3(new nsa(l1bVar, (byte) 10), 350L);
                qy1 qy1Var = l1bVar.n;
                if (qy1Var != null) {
                    qy1Var.a(Boolean.TRUE);
                }
            } else if (l1bVar.i != 0) {
                a6a.B(i).t0(l1bVar.f.document, null, l1bVar.i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                xq3 xq3Var = this.e0;
                if (xq3Var != null) {
                    xq3Var.setProgress(1.0f);
                }
                gm.d3(new ge7(this, i, (byte) 18), 450L);
                qy1 qy1Var2 = l1bVar.n;
                if (qy1Var2 != null) {
                    qy1Var2.a(Boolean.TRUE);
                    l1bVar.n = null;
                }
            } else if (l1bVar.j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = hs6.b0(l1bVar.j);
                tL_stickers_addStickerToSet.sticker = l1bVar.e;
                ConnectionsManager.getInstance(i).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final n1b b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final n1b n1bVar = this.b;
                                final int i2 = i;
                                final l1b l1bVar2 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar2;
                                        int i32 = i2;
                                        final n1b n1bVar22 = n1bVar;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var22 = n1bVar22.e0;
                                                    if (xq3Var22 != null) {
                                                        xq3Var22.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var22 = l1bVar32.n;
                                                if (qy1Var22 != null) {
                                                    qy1Var22.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var32 = l1bVar32.n;
                                                if (qy1Var32 != null) {
                                                    qy1Var32.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final n1b n1bVar2 = this.b;
                                final int i3 = i;
                                final l1b l1bVar3 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar3;
                                        int i32 = i3;
                                        final n1b n1bVar22 = n1bVar2;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var22 = n1bVar22.e0;
                                                    if (xq3Var22 != null) {
                                                        xq3Var22.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var22 = l1bVar32.n;
                                                if (qy1Var22 != null) {
                                                    qy1Var22.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var32 = l1bVar32.n;
                                                if (qy1Var32 != null) {
                                                    qy1Var32.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final n1b n1bVar3 = this.b;
                                final int i4 = i;
                                final l1b l1bVar4 = l1bVar;
                                gm.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b = r6;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        final l1b l1bVar32 = l1bVar4;
                                        int i32 = i4;
                                        final n1b n1bVar22 = n1bVar3;
                                        boolean z = false;
                                        switch (b) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                if (tLObject2 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var2 = n1bVar22.e0;
                                                    if (xq3Var2 != null) {
                                                        xq3Var2.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject2;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var3 = l1bVar32.n;
                                                if (qy1Var3 != null) {
                                                    qy1Var3.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                                                    hs6.d0(i32).L1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    hs6.d0(i32).h2(null, tLObject3, 2, null, false, false);
                                                    xq3 xq3Var22 = n1bVar22.e0;
                                                    if (xq3Var22 != null) {
                                                        xq3Var22.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject3;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var22 = l1bVar32.n;
                                                if (qy1Var22 != null) {
                                                    qy1Var22.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                if (tLObject4 instanceof TLRPC.TL_messages_stickerSet) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    hs6.d0(i32).L1(tL_messages_stickerSet2, true);
                                                    if (!hs6.d0(i32).D0(tL_messages_stickerSet2.set.id, true)) {
                                                        hs6.d0(i32).h2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    xq3 xq3Var3 = n1bVar22.e0;
                                                    if (xq3Var3 != null) {
                                                        xq3Var3.setProgress(1.0f);
                                                    }
                                                    gm.d3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b2 = r4;
                                                            l1b l1bVar42 = l1bVar32;
                                                            TLObject tLObject32 = tLObject4;
                                                            n1b n1bVar32 = n1bVar22;
                                                            switch (b2) {
                                                                case 0:
                                                                    nm7 f = nm7.f(z8c.t0);
                                                                    TLRPC.Document document = l1bVar42.f.document;
                                                                    String str = l1bVar42.l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f.m(218, bool, tLObject32, document, str, bool);
                                                                    n1bVar32.h();
                                                                    return;
                                                                case 1:
                                                                    nm7.f(z8c.t0).m(218, Boolean.FALSE, tLObject32, l1bVar42.f.document, l1bVar42.l, Boolean.TRUE);
                                                                    n1bVar32.h();
                                                                    return;
                                                                default:
                                                                    nm7 f2 = nm7.f(z8c.t0);
                                                                    TLRPC.Document document2 = l1bVar42.f.document;
                                                                    String str2 = l1bVar42.l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f2.m(218, bool2, tLObject32, document2, str2, bool2);
                                                                    n1bVar32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    n1bVar22.m(tL_error2);
                                                    n1bVar22.h();
                                                }
                                                qy1 qy1Var32 = l1bVar32.n;
                                                if (qy1Var32 != null) {
                                                    qy1Var32.a(Boolean.valueOf(z));
                                                    l1bVar32.n = null;
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
                k1b[] k1bVarArr = this.I;
                if (i >= k1bVarArr.length) {
                    break;
                }
                k1b k1bVar = k1bVarArr[i];
                if (k1bVar != null) {
                    k1bVar.l.reset();
                    Bitmap bitmap = k1bVar.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        k1bVar.e = null;
                    }
                    Bitmap bitmap2 = k1bVar.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        k1bVar.d = null;
                    }
                    Bitmap bitmap3 = k1bVar.g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        k1bVar.g = null;
                    }
                    Bitmap bitmap4 = k1bVar.f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        k1bVar.f = null;
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
        l1b l1bVar = this.a0;
        if (l1bVar != null) {
            if (!l1bVar.o) {
                l1bVar.a();
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
        l1b l1bVar;
        if (i == nm7.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            l1b l1bVar2 = this.a0;
            if (l1bVar2 != null && str.equalsIgnoreCase(l1bVar2.b)) {
                l1b l1bVar3 = this.a0;
                l1bVar3.g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = l1bVar3.g;
                if (l1bVar3.s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = l1bVar3.c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(z8c.t0).sendRequest(tL_messages_uploadMedia, new ara(this, l1bVar3, (byte) 4), 2);
            }
        } else if (i == nm7.W1) {
            String str2 = (String) objArr[0];
            l1b l1bVar4 = this.a0;
            if (l1bVar4 != null && str2.equalsIgnoreCase(l1bVar4.b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    l1b l1bVar5 = this.a0;
                    l1bVar5.u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, l1bVar5.u);
                    xq3 xq3Var = this.e0;
                    if (xq3Var != null) {
                        xq3Var.setProgress(this.a0.b());
                    }
                }
            }
        } else if (i == nm7.V1) {
            String str3 = (String) objArr[0];
            l1b l1bVar6 = this.a0;
            if (l1bVar6 != null && str3.equalsIgnoreCase(l1bVar6.b)) {
                h();
            }
        } else if (i == nm7.a2) {
            l1b l1bVar7 = this.a0;
            if (l1bVar7 != null && objArr[0] == l1bVar7.r) {
                bc4.G(z8c.t0).h0(false, 67108864, this.a0.b, true);
            }
        } else if (i == nm7.b2) {
            l1b l1bVar8 = this.a0;
            if (l1bVar8 != null && objArr[0] == l1bVar8.r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f = (Float) objArr[4];
                float floatValue = f.floatValue();
                this.a0.r.r0.X = true;
                bc4.G(this.a).n(str4, false, Math.max(1L, longValue3), longValue4, f);
                l1b l1bVar9 = this.a0;
                l1bVar9.t = Math.max(l1bVar9.t, floatValue);
                xq3 xq3Var2 = this.e0;
                if (xq3Var2 != null) {
                    xq3Var2.setProgress(this.a0.b());
                }
            }
        } else if (i == nm7.c2 && (l1bVar = this.a0) != null && objArr[0] == l1bVar.r) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        k1b k1bVar = this.F;
        if (k1bVar != null) {
            this.L = bitmap;
            if (k1bVar.f != null && this.M) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                k1b k1bVar2 = this.F;
                if (k1bVar2.c != 0) {
                    Matrix matrix = new Matrix();
                    k1b k1bVar3 = this.F;
                    matrix.postRotate(k1bVar3.c, k1bVar3.a().getWidth() / 2.0f, this.F.a().getHeight() / 2.0f);
                    k1b k1bVar4 = this.F;
                    if ((k1bVar4.c / 90) % 2 != 0) {
                        float height = (k1bVar4.b().getHeight() - this.F.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.F.a().getHeight(), bitmap.getHeight() / this.F.a().getWidth());
                    canvas.drawBitmap(this.F.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(k1bVar2.a(), (Rect) null, rect, paint);
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
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(d53.h).start();
    }

    public final void g(Canvas canvas, boolean z, ViewGroup viewGroup, boolean z2) {
        boolean z3;
        float d;
        float f;
        Paint paint;
        ln lnVar = this.c;
        lnVar.a = viewGroup;
        boolean z4 = this.j0;
        if (z4 || lnVar.c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z4 && !z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                d = lnVar.d(z3);
            }
            k1b[] k1bVarArr = this.I;
            if (k1bVarArr != null) {
                for (k1b k1bVar : k1bVarArr) {
                    if (k1bVar != null && k1bVar == this.F) {
                        if (this.G > 0.0f) {
                            if (k1bVar.t.l0 != null) {
                                canvas.save();
                                canvas.clipPath(k1bVar.t.l0);
                                if (k1bVar.t.J != null) {
                                    if (z) {
                                        paint = k1bVar.q;
                                    } else {
                                        paint = k1bVar.p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(gm.L(f));
                                    canvas.drawPath(k1bVar.l, paint);
                                    if (k1bVar.t.l0 != null && z) {
                                        canvas.clipPath(k1bVar.l);
                                        paint.setStrokeWidth(gm.L(f * 2.0f));
                                        canvas.drawPath(k1bVar.t.l0, paint);
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
        k1b k1bVar;
        if (this.M && (k1bVar = this.F) != null) {
            return k1bVar.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.J;
    }

    public jlb getThanosEffect() {
        if (!jlb.c()) {
            return null;
        }
        if (this.T == null) {
            jlb jlbVar = new jlb(getContext(), new d1b(this, (byte) 1));
            this.T = jlbVar;
            addView(jlbVar, qoe.c(-1.0f, -1));
        }
        return this.T;
    }

    public final void h() {
        xq3 xq3Var = this.e0;
        if (xq3Var != null) {
            xq3Var.a();
            this.e0 = null;
        }
    }

    public final k1b i(float f, float f2) {
        int width;
        int height;
        if (this.J != null) {
            int i = 0;
            while (true) {
                k1b[] k1bVarArr = this.I;
                if (i < k1bVarArr.length) {
                    k1b k1bVar = k1bVarArr[i];
                    if (k1bVar != null) {
                        int i2 = (k1bVar.c / 90) % 2;
                        Bitmap bitmap = this.J;
                        if (i2 != 0) {
                            width = bitmap.getHeight();
                            height = this.J.getWidth();
                        } else {
                            width = bitmap.getWidth();
                            height = this.J.getHeight();
                        }
                        RectF rectF = gm.P;
                        RectF rectF2 = this.I[i].i;
                        float f3 = width;
                        float f4 = this.g0;
                        float f5 = height;
                        float f6 = this.h0;
                        rectF.set((rectF2.left / f3) * f4, (rectF2.top / f5) * f6, (rectF2.right / f3) * f4, (rectF2.bottom / f5) * f6);
                        this.f0.mapRect(rectF);
                        if (rectF.contains(f, f2)) {
                            return k1bVar;
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
        k1b[] k1bVarArr = this.I;
        if (k1bVarArr != null) {
            for (k1b k1bVar : k1bVarArr) {
                if (k1bVar != null && (bitmap = k1bVar.e) != null) {
                    bitmap.recycle();
                    k1bVar.e = null;
                    Bitmap bitmap2 = k1bVar.g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        k1bVar.g = null;
                    }
                    c(k1bVar, this.U, this.V);
                }
            }
        }
    }

    public final void l(Bitmap bitmap, int i, int i2, int i3, t88 t88Var) {
        int i4;
        int i5;
        li7 li7Var;
        if (i2 <= 0) {
            i4 = gm.q.x;
        } else {
            i4 = i2;
        }
        if (i3 <= 0) {
            i5 = gm.q.y;
        } else {
            i5 = i3;
        }
        this.U = i4;
        this.V = i5;
        if (!this.E && !this.y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.J = bitmap;
            this.K = i;
            this.d0 = null;
            h71 h71Var = new h71(this, i, t88Var, (byte) 5);
            this.y = true;
            j10 j10Var = new j10();
            j10Var.b = true;
            j10Var.c = true;
            npd a = wwe.a(new hcb(j10Var));
            if (s34.m(getContext()).h()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.J;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.a).drawRect(0.0f, 0.0f, obj.d, obj.e, cmb.Gm);
                obj.b = (bitmap2.getWidth() - obj.d) / 2;
                obj.c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                h71Var.a(arrayList);
                return;
            }
            gq5 a2 = gq5.a(i, bitmap);
            a.c(a2).addOnSuccessListener(new wta(h71Var, (byte) 3)).addOnFailureListener(new gh(this, bitmap, i, t88Var, h71Var));
            if (this.d0 == null) {
                im5 im5Var = im5.b;
                ite.i(im5Var, "options cannot be null");
                synchronized (li7.class) {
                    li7Var = (li7) cg7.c().a(li7.class);
                }
                nv8 nv8Var = (nv8) li7Var.a.get(im5.class);
                ite.h(nv8Var);
                mpd mpdVar = (mpd) nv8Var.get();
                mpdVar.getClass();
                b6f b6fVar = mpdVar.c;
                ?? obj2 = new Object();
                obj2.c = wue.TYPE_THIN;
                mlb.c(1, new de1(b6fVar, new ry((eq) obj2, 1), hve.ON_DEVICE_IMAGE_LABEL_CREATE, b6fVar.b(), (byte) 3));
                new hm5((mi6) mpdVar.a.c(im5Var), (Executor) mpdVar.b.a.get(), new o94("vision.ica", 1L)).c(a2).addOnSuccessListener(new wta(this, (byte) 4)).addOnFailureListener(new c1b((byte) 0));
            }
            ArrayList arrayList2 = hs6.d0(this.a).n;
            for (int i6 = 0; i6 < Math.min(arrayList2.size(), 9); i6++) {
                gw3.g(((TLRPC.TL_availableReaction) arrayList2.get(i6)).reaction);
            }
        }
    }

    public final void m(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new c41((FrameLayout) getParent(), this.b0).t(tL_error.text, null).j();
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
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.m0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.l0.addPath(this.m0, this.k0);
        this.l0.computeBounds(this.n0, true);
    }

    public final void o(final String str, final rcc rccVar, final String str2, final CharSequence charSequence, final boolean z, final long j, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final qy1 qy1Var, final f fVar) {
        gm.d3(new Runnable() {
            @Override
            public final void run() {
                boolean z2;
                l1b l1bVar;
                n1b n1bVar = n1b.this;
                qy1 qy1Var2 = qy1Var;
                if (qy1Var2 != null && (l1bVar = n1bVar.a0) != null && l1bVar.o) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    l1b l1bVar2 = n1bVar.a0;
                    if (l1bVar2 != null) {
                        l1bVar2.a();
                    }
                    ?? obj = new Object();
                    obj.p = new ArrayList();
                    obj.q = new ArrayList();
                    obj.t = 0.0f;
                    obj.u = 0.0f;
                    n1bVar.a0 = obj;
                }
                l1b l1bVar3 = n1bVar.a0;
                l1bVar3.c = str2;
                String str4 = str;
                l1bVar3.b = str4;
                l1bVar3.a = str4;
                l1bVar3.d = charSequence;
                l1bVar3.h = z;
                l1bVar3.i = j;
                l1bVar3.j = stickerSet;
                l1bVar3.k = document;
                rcc rccVar2 = rccVar;
                l1bVar3.s = rccVar2;
                l1bVar3.l = str3;
                l1bVar3.n = qy1Var2;
                l1bVar3.m = fVar;
                ArrayList arrayList = l1bVar3.q;
                if (!TextUtils.isEmpty(str4)) {
                    l1bVar3.p.add(new File(l1bVar3.b));
                }
                if (!TextUtils.isEmpty(l1bVar3.a) && !TextUtils.equals(l1bVar3.a, l1bVar3.b)) {
                    arrayList.add(new File(l1bVar3.a));
                }
                if (!TextUtils.isEmpty(l1bVar3.l)) {
                    arrayList.add(new File(l1bVar3.l));
                }
                if (!z2) {
                    n1bVar.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        l1b l1bVar4 = n1bVar.a0;
                        l1bVar4.e = hs6.c0(document3, l1bVar4.c);
                        n1bVar.a0.f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = n1bVar.a0.f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        n1bVar.a();
                    } else if (rccVar2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        l1b l1bVar5 = n1bVar.a0;
                        String absolutePath = g6b.w(z8c.t0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        l1bVar5.b = absolutePath;
                        n1bVar.a0.r = new k47(z8c.t0, tL_message, null, false, false);
                        n1bVar.a0.r.r0 = rccVar2;
                        MediaController.w().g0(n1bVar.a0.r, false, false, false);
                    } else {
                        bc4.G(n1bVar.a).h0(false, 67108864, str4, true);
                    }
                }
                if (qy1Var2 == null) {
                    xq3 xq3Var = n1bVar.e0;
                    if (xq3Var == null) {
                        xq3Var = new xq3(n1bVar.getContext(), jb6.M0(2131746654, null));
                        n1bVar.e0 = xq3Var;
                    }
                    xq3Var.setOnCancelListener(new d1b(n1bVar, (byte) 0));
                    if (n1bVar.e0.getParent() == null) {
                        n1bVar.addView(n1bVar.e0, qoe.e(-1, -1, 17));
                    }
                    xq3 xq3Var2 = n1bVar.e0;
                    xq3Var2.F = true;
                    xq3Var2.invalidate();
                }
            }
        }, 300L);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.U1);
        nm7.f(this.a).b(this, nm7.W1);
        nm7.f(this.a).b(this, nm7.V1);
        nm7.f(this.a).b(this, nm7.c2);
        nm7.f(this.a).b(this, nm7.a2);
        nm7.f(this.a).b(this, nm7.b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        if (i >= 0) {
            nm7.f(i).n(this, nm7.U1);
            nm7.f(this.a).n(this, nm7.W1);
            nm7.f(this.a).n(this, nm7.V1);
            nm7.f(this.a).n(this, nm7.c2);
            nm7.f(this.a).n(this, nm7.a2);
            nm7.f(this.a).n(this, nm7.b2);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float L = gm.L(10.0f);
        float f = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f;
        float measuredHeight = getMeasuredHeight() - f;
        float f2 = measuredWidth / 8.0f;
        RectF rectF = gm.P;
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
        rectF.inset(gm.L(-1.0f), gm.L(-1.0f));
        path4.addRoundRect(rectF, f2, f2, direction);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.N.setTranslationY(-((getMeasuredWidth() / 2.0f) + gm.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.q0;
            arrayList.clear();
            if (this.j0) {
                Rect rect = this.r0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, gm.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setCurrentAccount(int i) {
        int i2 = this.a;
        if (i2 != i) {
            int i3 = nm7.b2;
            int i4 = nm7.a2;
            int i5 = nm7.c2;
            int i6 = nm7.V1;
            int i7 = nm7.W1;
            int i8 = nm7.U1;
            if (i2 >= 0 && isAttachedToWindow()) {
                nm7.f(this.a).n(this, i8);
                nm7.f(this.a).n(this, i7);
                nm7.f(this.a).n(this, i6);
                nm7.f(this.a).n(this, i5);
                nm7.f(this.a).n(this, i4);
                nm7.f(this.a).n(this, i3);
            }
            this.a = i;
            if (i >= 0 && isAttachedToWindow()) {
                nm7.f(this.a).b(this, i8);
                nm7.f(this.a).b(this, i7);
                nm7.f(this.a).b(this, i6);
                nm7.f(this.a).b(this, i5);
                nm7.f(this.a).b(this, i4);
                nm7.f(this.a).b(this, i3);
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
                f2 = gm.L(-18.0f);
            }
            alpha.translationX(f2).setInterpolator(d53.h).setDuration(320L).start();
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
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, gm.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
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

    public void setStickerCutOutBtn(w0b w0bVar) {
        this.c0 = w0bVar;
    }
}
