package jg;

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
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.o6;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.t5;
import org.telegram.ui.wo0;
import vh.n5;
import w7.b6;
import w7.w7;
import x7.ga;
import x7.m7;
import x7.o7;
public final class v2 extends FrameLayout implements us {
    public static final int f10307r0 = 0;
    public volatile boolean D;
    public s2 E;
    public float F;
    public boolean G;
    public s2[] H;
    public volatile Bitmap I;
    public int J;
    public Bitmap K;
    public boolean L;
    public final TextView M;
    public ValueAnimator N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public h01 S;
    public int T;
    public int U;
    public boolean V;
    public t2 W;
    public int f10308a;
    public final p6 f10309a0;
    public final t5 f10310b;
    public j2 f10311b0;
    public final t5 f10312c;
    public String f10313c0;
    public final Paint d;
    public vh.m0 f10314d0;
    public final Paint e;
    public final Matrix f10315e0;
    public final Paint f10316f;
    public float f10317f0;
    public float f10318g0;
    public final Paint h;
    public final d2 f10319h0;
    public boolean f10320i0;
    public final Matrix f10321j0;
    public Path f10322k0;
    public Path f10323l0;
    public final RectF m0;
    public final PathMeasure f10324n;
    public float f10325n0;
    public float f10326o0;
    public final ArrayList f10327p0;
    public final Rect f10328q0;
    public final Path f10329r;
    public final Path f10330s;
    public final Path f10331w;
    public final Path f10332x;
    public volatile boolean f10333y;

    public v2(ContextThemeWrapper contextThemeWrapper, p6 p6Var) {
        super(contextThemeWrapper);
        this.f10308a = -1;
        gr grVar = gr.h;
        this.f10310b = new t5(0.0f, (View) null, 0L, 420L, grVar);
        this.f10312c = new t5(0.0f, (View) null, 0L, 420L, grVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f10316f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f10324n = new PathMeasure();
        this.f10329r = new Path();
        this.f10330s = new Path();
        this.f10331w = new Path();
        this.f10332x = new Path();
        this.F = 2.0f;
        this.f10315e0 = new Matrix();
        this.f10321j0 = new Matrix();
        this.m0 = new RectF();
        this.f10327p0 = new ArrayList();
        this.f10328q0 = new Rect();
        this.f10309a0 = p6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(10.0f)}, 0.5f));
        paint.setShadowLayer(org.telegram.messenger.i0.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.M = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, b6.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(20.0f)));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.i0.L(4.0f), blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(org.telegram.messenger.i0.L(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(org.telegram.messenger.i0.L(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        d2 d2Var = new d2(contextThemeWrapper);
        this.f10319h0 = d2Var;
        d2Var.setAlpha(0.0f);
        d2Var.setTranslationX(-org.telegram.messenger.i0.L(18.0f));
        d2Var.b(0.33f, 10.0f);
        d2Var.setBrushWeight(this.F);
        d2Var.setValueOverride(new za.c(this, 26));
        d2Var.setTranslationX(-org.telegram.messenger.i0.L(18.0f));
        d2Var.setAlpha(0.0f);
        addView(d2Var, b6.c(-1.0f, -1));
    }

    public static void c(jg.s2 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: jg.v2.c(jg.s2, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((r2) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            r2 r2Var = (r2) arrayList.get(i10 - 1);
            r2 r2Var2 = (r2) arrayList.get(i10);
            i10++;
            r2 r2Var3 = (r2) arrayList.get(i10);
            int i11 = ((Point) r2Var2).x;
            int i12 = ((Point) r2Var).x;
            int i13 = ((Point) r2Var3).y;
            int i14 = ((Point) r2Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) r2Var3).x - i12) * (((Point) r2Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(r2Var2);
            }
        }
        arrayList2.add((r2) i0.a.g(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final t2 t2Var = this.W;
        if (t2Var != null) {
            final int i10 = d20.f15147s0;
            t2Var.f10280o = true;
            if (t2Var.f10278m != null) {
                h();
                t2Var.f10278m.a(t2Var.f10270b, t2Var.e.document);
                org.telegram.messenger.i0.h3(new ag.f3(6), 250L);
            } else if (t2Var.f10276k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = ui.a0(t2Var.f10276k, t2Var.f10271c).document;
                tL_stickers_replaceSticker.new_sticker = t2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final v2 f10087b;

                    {
                        this.f10087b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final v2 v2Var = this.f10087b;
                                final int i11 = i10;
                                final t2 t2Var2 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var2 = v2Var;
                                                final t2 t2Var3 = t2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i12 = i11;
                                                    z10 = true;
                                                    ui.b0(i12).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i12).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i12).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var2.f10314d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i13 = r4;
                                                            t2 t2Var4 = t2Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            v2 v2Var3 = v2Var2;
                                                            switch (i13) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var4.f10272f.document;
                                                                    String str = t2Var4.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject3, document, str, bool);
                                                                    v2Var3.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject3, t2Var4.f10272f.document, t2Var4.f10277l, Boolean.TRUE);
                                                                    v2Var3.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var4.f10272f.document;
                                                                    String str2 = t2Var4.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject3, document2, str2, bool2);
                                                                    v2Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var2.n(tL_error);
                                                    v2Var2.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var = t2Var3.f10279n;
                                                if (q20Var != null) {
                                                    q20Var.a(Boolean.valueOf(z10));
                                                    t2Var3.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var3 = v2Var;
                                                final t2 t2Var4 = t2Var2;
                                                if (z14) {
                                                    int i13 = i11;
                                                    z11 = true;
                                                    ui.b0(i13).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i13).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var3.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            t2 t2Var42 = t2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var32 = v2Var3;
                                                            switch (i132) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var42.f10272f.document;
                                                                    String str = t2Var42.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var42.f10272f.document, t2Var42.f10277l, Boolean.TRUE);
                                                                    v2Var32.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var42.f10272f.document;
                                                                    String str2 = t2Var42.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var3.n(tL_error);
                                                    v2Var3.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var2 = t2Var4.f10279n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z11));
                                                    t2Var4.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var;
                                                final t2 t2Var5 = t2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            t2 t2Var42 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var32 = v2Var4;
                                                            switch (i132) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var42.f10272f.document;
                                                                    String str = t2Var42.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var42.f10272f.document, t2Var42.f10277l, Boolean.TRUE);
                                                                    v2Var32.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var42.f10272f.document;
                                                                    String str2 = t2Var42.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final v2 v2Var2 = this.f10087b;
                                final int i12 = i10;
                                final t2 t2Var3 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var2;
                                                final t2 t2Var32 = t2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.f10314d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            t2 t2Var42 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var32 = v2Var22;
                                                            switch (i132) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var42.f10272f.document;
                                                                    String str = t2Var42.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var42.f10272f.document, t2Var42.f10277l, Boolean.TRUE);
                                                                    v2Var32.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var42.f10272f.document;
                                                                    String str2 = t2Var42.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var = t2Var32.f10279n;
                                                if (q20Var != null) {
                                                    q20Var.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var3 = v2Var2;
                                                final t2 t2Var4 = t2Var3;
                                                if (z14) {
                                                    int i13 = i12;
                                                    z11 = true;
                                                    ui.b0(i13).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i13).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var3.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            t2 t2Var42 = t2Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var32 = v2Var3;
                                                            switch (i132) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var42.f10272f.document;
                                                                    String str = t2Var42.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var42.f10272f.document, t2Var42.f10277l, Boolean.TRUE);
                                                                    v2Var32.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var42.f10272f.document;
                                                                    String str2 = t2Var42.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var3.n(tL_error);
                                                    v2Var3.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var2 = t2Var4.f10279n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z11));
                                                    t2Var4.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var2;
                                                final t2 t2Var5 = t2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            t2 t2Var42 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var32 = v2Var4;
                                                            switch (i132) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var42.f10272f.document;
                                                                    String str = t2Var42.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var42.f10272f.document, t2Var42.f10277l, Boolean.TRUE);
                                                                    v2Var32.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var42.f10272f.document;
                                                                    String str2 = t2Var42.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final v2 v2Var3 = this.f10087b;
                                final int i13 = i10;
                                final t2 t2Var4 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var3;
                                                final t2 t2Var32 = t2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.f10314d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            t2 t2Var42 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var32 = v2Var22;
                                                            switch (i132) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var42.f10272f.document;
                                                                    String str = t2Var42.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var32.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var42.f10272f.document, t2Var42.f10277l, Boolean.TRUE);
                                                                    v2Var32.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var42.f10272f.document;
                                                                    String str2 = t2Var42.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var = t2Var32.f10279n;
                                                if (q20Var != null) {
                                                    q20Var.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var3;
                                                final t2 t2Var42 = t2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    z11 = true;
                                                    ui.b0(i132).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i132).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var32.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var2 = t2Var42.f10279n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z11));
                                                    t2Var42.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var3;
                                                final t2 t2Var5 = t2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
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
            } else if (t2Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = t2Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(t2Var.e);
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final v2 f10087b;

                    {
                        this.f10087b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final v2 v2Var = this.f10087b;
                                final int i11 = i10;
                                final t2 t2Var2 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var;
                                                final t2 t2Var32 = t2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.f10314d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var = t2Var32.f10279n;
                                                if (q20Var != null) {
                                                    q20Var.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var;
                                                final t2 t2Var42 = t2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    z11 = true;
                                                    ui.b0(i132).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i132).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var32.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var2 = t2Var42.f10279n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z11));
                                                    t2Var42.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var;
                                                final t2 t2Var5 = t2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final v2 v2Var2 = this.f10087b;
                                final int i12 = i10;
                                final t2 t2Var3 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var2;
                                                final t2 t2Var32 = t2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.f10314d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var = t2Var32.f10279n;
                                                if (q20Var != null) {
                                                    q20Var.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var2;
                                                final t2 t2Var42 = t2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    z11 = true;
                                                    ui.b0(i132).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i132).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var32.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var2 = t2Var42.f10279n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z11));
                                                    t2Var42.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var2;
                                                final t2 t2Var5 = t2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final v2 v2Var3 = this.f10087b;
                                final int i13 = i10;
                                final t2 t2Var4 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var3;
                                                final t2 t2Var32 = t2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var = v2Var22.f10314d0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var = t2Var32.f10279n;
                                                if (q20Var != null) {
                                                    q20Var.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var3;
                                                final t2 t2Var42 = t2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    z11 = true;
                                                    ui.b0(i132).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i132).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var2 = v2Var32.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var2 = t2Var42.f10279n;
                                                if (q20Var2 != null) {
                                                    q20Var2.a(Boolean.valueOf(z11));
                                                    t2Var42.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var3;
                                                final t2 t2Var5 = t2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var3 = t2Var5.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
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
            } else if (t2Var.h) {
                h();
                zs.f(i10).m(zs.f19687s3, Boolean.FALSE);
                org.telegram.messenger.i0.h3(new gg.c(t2Var, 16), 350L);
                q20 q20Var = t2Var.f10279n;
                if (q20Var != null) {
                    q20Var.a(Boolean.TRUE);
                }
            } else if (t2Var.f10274i != 0) {
                qz.C(i10).v0(t2Var.f10272f.document, null, t2Var.f10274i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                vh.m0 m0Var = this.f10314d0;
                if (m0Var != null) {
                    m0Var.setProgress(1.0f);
                }
                org.telegram.messenger.i0.h3(new ag.d3(this, i10, 8), 450L);
                q20 q20Var2 = t2Var.f10279n;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.TRUE);
                    t2Var.f10279n = null;
                }
            } else if (t2Var.f10275j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = ui.Z(t2Var.f10275j);
                tL_stickers_addStickerToSet.sticker = t2Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final v2 f10087b;

                    {
                        this.f10087b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final v2 v2Var = this.f10087b;
                                final int i11 = i10;
                                final t2 t2Var2 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var;
                                                final t2 t2Var32 = t2Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var2 = v2Var22.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var3 = t2Var32.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var;
                                                final t2 t2Var42 = t2Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    z11 = true;
                                                    ui.b0(i132).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i132).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var22 = v2Var32.f10314d0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var22 = t2Var42.f10279n;
                                                if (q20Var22 != null) {
                                                    q20Var22.a(Boolean.valueOf(z11));
                                                    t2Var42.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var;
                                                final t2 t2Var5 = t2Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var32 = t2Var5.f10279n;
                                                if (q20Var32 != null) {
                                                    q20Var32.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final v2 v2Var2 = this.f10087b;
                                final int i12 = i10;
                                final t2 t2Var3 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var2;
                                                final t2 t2Var32 = t2Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var2 = v2Var22.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var3 = t2Var32.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var2;
                                                final t2 t2Var42 = t2Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    z11 = true;
                                                    ui.b0(i132).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i132).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var22 = v2Var32.f10314d0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var22 = t2Var42.f10279n;
                                                if (q20Var22 != null) {
                                                    q20Var22.a(Boolean.valueOf(z11));
                                                    t2Var42.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var2;
                                                final t2 t2Var5 = t2Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var32 = t2Var5.f10279n;
                                                if (q20Var32 != null) {
                                                    q20Var32.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final v2 v2Var3 = this.f10087b;
                                final int i13 = i10;
                                final t2 t2Var4 = t2Var;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var22 = v2Var3;
                                                final t2 t2Var32 = t2Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    z10 = true;
                                                    ui.b0(i122).I1(tL_messages_stickerSet, true);
                                                    if (!ui.b0(i122).B0(tL_messages_stickerSet.set.f19820id, true)) {
                                                        ui.b0(i122).f2(null, tLObject2, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var2 = v2Var22.f10314d0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            v2 v2Var322 = v2Var22;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var22.n(tL_error);
                                                    v2Var22.h();
                                                    z10 = false;
                                                }
                                                q20 q20Var3 = t2Var32.f10279n;
                                                if (q20Var3 != null) {
                                                    q20Var3.a(Boolean.valueOf(z10));
                                                    t2Var32.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var32 = v2Var3;
                                                final t2 t2Var42 = t2Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    z11 = true;
                                                    ui.b0(i132).I1((TLRPC.TL_messages_stickerSet) tLObject3, true);
                                                    ui.b0(i132).f2(null, tLObject3, 2, null, false, false);
                                                    vh.m0 m0Var22 = v2Var32.f10314d0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            v2 v2Var322 = v2Var32;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                } else {
                                                    v2Var32.n(tL_error);
                                                    v2Var32.h();
                                                    z11 = false;
                                                }
                                                q20 q20Var22 = t2Var42.f10279n;
                                                if (q20Var22 != null) {
                                                    q20Var22.a(Boolean.valueOf(z11));
                                                    t2Var42.f10279n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final v2 v2Var4 = v2Var3;
                                                final t2 t2Var5 = t2Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    z12 = true;
                                                    ui.b0(i14).I1(tL_messages_stickerSet2, true);
                                                    if (!ui.b0(i14).B0(tL_messages_stickerSet2.set.f19820id, true)) {
                                                        ui.b0(i14).f2(null, tLObject4, 2, null, false, false);
                                                    }
                                                    vh.m0 m0Var3 = v2Var4.f10314d0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    org.telegram.messenger.i0.h3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            t2 t2Var422 = t2Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            v2 v2Var322 = v2Var4;
                                                            switch (i1322) {
                                                                case 0:
                                                                    zs f7 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document = t2Var422.f10272f.document;
                                                                    String str = t2Var422.f10277l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    f7.m(215, bool, tLObject32, document, str, bool);
                                                                    v2Var322.h();
                                                                    return;
                                                                case 1:
                                                                    zs.f(d20.f15147s0).m(215, Boolean.FALSE, tLObject32, t2Var422.f10272f.document, t2Var422.f10277l, Boolean.TRUE);
                                                                    v2Var322.h();
                                                                    return;
                                                                default:
                                                                    zs f10 = zs.f(d20.f15147s0);
                                                                    TLRPC.Document document2 = t2Var422.f10272f.document;
                                                                    String str2 = t2Var422.f10277l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    f10.m(215, bool2, tLObject32, document2, str2, bool2);
                                                                    v2Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                } else {
                                                    v2Var4.n(tL_error);
                                                    v2Var4.h();
                                                    z12 = false;
                                                }
                                                q20 q20Var32 = t2Var5.f10279n;
                                                if (q20Var32 != null) {
                                                    q20Var32.a(Boolean.valueOf(z12));
                                                    t2Var5.f10279n = null;
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
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        this.I = null;
        if (this.H != null) {
            int i10 = 0;
            while (true) {
                s2[] s2VarArr = this.H;
                if (i10 >= s2VarArr.length) {
                    break;
                }
                s2 s2Var = s2VarArr[i10];
                if (s2Var != null) {
                    s2Var.f10221l.reset();
                    Bitmap bitmap = s2Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        s2Var.e = null;
                    }
                    Bitmap bitmap2 = s2Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        s2Var.d = null;
                    }
                    Bitmap bitmap3 = s2Var.f10217g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        s2Var.f10217g = null;
                    }
                    Bitmap bitmap4 = s2Var.f10216f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        s2Var.f10216f = null;
                    }
                }
                i10++;
            }
            this.H = null;
        }
        this.D = false;
        this.f10333y = false;
        this.L = false;
        this.M.setAlpha(0.0f);
        this.M.setScaleX(0.3f);
        this.M.setScaleY(0.3f);
        t2 t2Var = this.W;
        if (t2Var != null) {
            if (!t2Var.f10280o) {
                t2Var.a();
            }
            this.W = null;
        }
        h();
        this.V = false;
    }

    public final Bitmap d(int i10, int i11, Bitmap bitmap, boolean z10) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap != null && !bitmap.isRecycled() && sourceBitmap != null) {
            Paint paint = new Paint(3);
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap);
            if (z10) {
                canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, i10, i11, paint);
            } else {
                canvas.drawBitmap(bitmap, i10, i11, paint);
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t2 t2Var;
        if (i10 == zs.U1) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            t2 t2Var2 = this.W;
            if (t2Var2 != null && str.equalsIgnoreCase(t2Var2.f10270b)) {
                t2 t2Var3 = this.W;
                t2Var3.f10273g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = t2Var3.f10273g;
                if (t2Var3.f10284s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = t2Var3.f10271c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(d20.f15147s0).sendRequest(tL_messages_uploadMedia, new ag.k0(3, this, t2Var3), 2);
            }
        } else if (i10 == zs.W1) {
            String str2 = (String) objArr[0];
            t2 t2Var4 = this.W;
            if (t2Var4 != null && str2.equalsIgnoreCase(t2Var4.f10270b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    t2 t2Var5 = this.W;
                    t2Var5.f10286u = Utilities.i(((float) longValue) / ((float) longValue2), 1.0f, t2Var5.f10286u);
                    vh.m0 m0Var = this.f10314d0;
                    if (m0Var != null) {
                        m0Var.setProgress(this.W.b());
                    }
                }
            }
        } else if (i10 == zs.V1) {
            String str3 = (String) objArr[0];
            t2 t2Var6 = this.W;
            if (t2Var6 != null && str3.equalsIgnoreCase(t2Var6.f10270b)) {
                h();
            }
        } else if (i10 == zs.a2) {
            t2 t2Var7 = this.W;
            if (t2Var7 != null && objArr[0] == t2Var7.f10283r) {
                b8.G(d20.f15147s0).i0(false, 67108864, this.W.f10270b, true);
            }
        } else if (i10 == zs.f19586b2) {
            t2 t2Var8 = this.W;
            if (t2Var8 != null && objArr[0] == t2Var8.f10283r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f7 = (Float) objArr[4];
                float floatValue = f7.floatValue();
                this.W.f10283r.f16356p0.Y = true;
                b8.G(this.f10308a).n(str4, false, Math.max(1L, longValue3), longValue4, f7);
                t2 t2Var9 = this.W;
                t2Var9.f10285t = Math.max(t2Var9.f10285t, floatValue);
                vh.m0 m0Var2 = this.f10314d0;
                if (m0Var2 != null) {
                    m0Var2.setProgress(this.W.b());
                }
            }
        } else if (i10 == zs.f19592c2 && (t2Var = this.W) != null && objArr[0] == t2Var.f10283r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.f10331w, this.e);
        canvas.drawPath(this.f10332x, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: jg.v2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        s2 s2Var = this.E;
        if (s2Var != null) {
            this.K = bitmap;
            if (s2Var.f10216f != null && this.L) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                s2 s2Var2 = this.E;
                if (s2Var2.f10215c != 0) {
                    Matrix matrix = new Matrix();
                    s2 s2Var3 = this.E;
                    matrix.postRotate(s2Var3.f10215c, s2Var3.a().getWidth() / 2.0f, this.E.a().getHeight() / 2.0f);
                    s2 s2Var4 = this.E;
                    if ((s2Var4.f10215c / 90) % 2 != 0) {
                        float height = (s2Var4.b().getHeight() - this.E.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.E.a().getHeight(), bitmap.getHeight() / this.E.a().getWidth());
                    canvas.drawBitmap(this.E.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(s2Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f10310b.e(false, 0.0f);
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.N = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.M;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(gr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float d;
        float f7;
        Paint paint;
        t5 t5Var = this.f10312c;
        t5Var.f30443a = viewGroup;
        boolean z13 = this.f10320i0;
        if (z13 || t5Var.f30445c > 0.0f) {
            if (viewGroup == null) {
                d = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                d = t5Var.d(z12);
            }
            s2[] s2VarArr = this.H;
            if (s2VarArr != null) {
                for (s2 s2Var : s2VarArr) {
                    if (s2Var != null && s2Var == this.E) {
                        if (this.F > 0.0f) {
                            if (s2Var.f10229t.f10322k0 != null) {
                                canvas.save();
                                canvas.clipPath(s2Var.f10229t.f10322k0);
                                if (s2Var.f10229t.I != null) {
                                    if (z10) {
                                        paint = s2Var.f10226q;
                                    } else {
                                        paint = s2Var.f10225p;
                                    }
                                    paint.setAlpha((int) (d * 255.0f));
                                    paint.setStrokeWidth(org.telegram.messenger.i0.L(f7));
                                    canvas.drawPath(s2Var.f10221l, paint);
                                    if (s2Var.f10229t.f10322k0 != null && z10) {
                                        canvas.clipPath(s2Var.f10221l);
                                        paint.setStrokeWidth(org.telegram.messenger.i0.L(f7 * 2.0f));
                                        canvas.drawPath(s2Var.f10229t.f10322k0, paint);
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
        return this.P;
    }

    public float getSegmentBorderImageWidth() {
        return this.O;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        s2 s2Var;
        if (this.L && (s2Var = this.E) != null) {
            return s2Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.I;
    }

    public h01 getThanosEffect() {
        if (!h01.c()) {
            return null;
        }
        if (this.S == null) {
            h01 h01Var = new h01(getContext(), new k2(this, 1));
            this.S = h01Var;
            addView(h01Var, b6.c(-1.0f, -1));
        }
        return this.S;
    }

    public final void h() {
        vh.m0 m0Var = this.f10314d0;
        if (m0Var != null) {
            m0Var.a();
            this.f10314d0 = null;
        }
    }

    public final boolean i() {
        return this.L;
    }

    public final s2 j(float f7, float f10) {
        int width;
        int height;
        if (this.I == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            s2[] s2VarArr = this.H;
            if (i10 >= s2VarArr.length) {
                return null;
            }
            s2 s2Var = s2VarArr[i10];
            if (s2Var != null) {
                if ((s2Var.f10215c / 90) % 2 != 0) {
                    width = this.I.getHeight();
                    height = this.I.getWidth();
                } else {
                    width = this.I.getWidth();
                    height = this.I.getHeight();
                }
                RectF rectF = org.telegram.messenger.i0.P;
                RectF rectF2 = this.H[i10].f10218i;
                float f11 = width;
                float f12 = this.f10317f0;
                float f13 = height;
                float f14 = this.f10318g0;
                rectF.set((rectF2.left / f11) * f12, (rectF2.top / f13) * f14, (rectF2.right / f11) * f12, (rectF2.bottom / f13) * f14);
                this.f10315e0.mapRect(rectF);
                if (rectF.contains(f7, f10)) {
                    return s2Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        s2[] s2VarArr = this.H;
        if (s2VarArr != null) {
            for (s2 s2Var : s2VarArr) {
                if (s2Var != null && (bitmap = s2Var.e) != null) {
                    bitmap.recycle();
                    s2Var.e = null;
                    Bitmap bitmap2 = s2Var.f10217g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        s2Var.f10217g = null;
                    }
                    c(s2Var, this.T, this.U);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, wo0 wo0Var) {
        int i13;
        int i14;
        pb.c cVar;
        if (i11 <= 0) {
            i13 = org.telegram.messenger.i0.f16026q.x;
        } else {
            i13 = i11;
        }
        if (i12 <= 0) {
            i14 = org.telegram.messenger.i0.f16026q.y;
        } else {
            i14 = i12;
        }
        this.T = i13;
        this.U = i14;
        if (!this.D && !this.f10333y && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.I = bitmap;
            this.J = i10;
            this.f10313c0 = null;
            o2 o2Var = new o2(this, i10, wo0Var, 0);
            this.f10333y = true;
            ea.b bVar = new ea.b();
            bVar.f6460b = true;
            bVar.f6461c = true;
            zzd a2 = w7.a(new tb.d(bVar));
            if (o6.h(getContext()).f()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.I;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.f10295a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f10295a).drawRect(0.0f, 0.0f, obj.d, obj.e, t6.Dm);
                obj.f10296b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f10297c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                o2Var.a(arrayList);
                return;
            }
            ob.a a10 = ob.a.a(bitmap, i10);
            a2.g(a10).addOnSuccessListener(new ig.c0(o2Var, 14)).addOnFailureListener(new q2(this, bitmap, i10, wo0Var, o2Var, 0));
            if (this.f10313c0 == null) {
                rb.a aVar = rb.a.f46478b;
                n6.l.h(aVar, "options cannot be null");
                synchronized (pb.c.class) {
                    cVar = (pb.c) jb.g.c().a(pb.c.class);
                }
                qa.b bVar2 = (qa.b) cVar.f44900a.get(rb.a.class);
                n6.l.g(bVar2);
                sb.c cVar2 = (sb.c) bVar2.get();
                cVar2.getClass();
                ga gaVar = cVar2.f48135c;
                ?? obj2 = new Object();
                obj2.f9349c = m7.TYPE_THIN;
                jb.m.f9797a.execute(new com.google.android.gms.internal.cast.o(gaVar, new a5.a((j2.f) obj2, 1), o7.ON_DEVICE_IMAGE_LABEL_CREATE, gaVar.b(), 7));
                new ImageLabelerImpl((jb.e) cVar2.f48133a.R0(aVar), (Executor) cVar2.f48134b.f9778a.get(), new k6.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new ig.c0(this, 15)).addOnFailureListener(new j2.e(24));
            }
            ArrayList arrayList2 = ui.b0(this.f10308a).f18332n;
            for (int i15 = 0; i15 < Math.min(arrayList2.size(), 9); i15++) {
                k6.g(((TLRPC.TL_availableReaction) arrayList2.get(i15)).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new cc((FrameLayout) getParent(), this.f10309a0).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f10322k0;
        if (path == null) {
            this.f10322k0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f10323l0 == null) {
            this.f10323l0 = new Path();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f10323l0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f10322k0.addPath(this.f10323l0, this.f10321j0);
        this.f10322k0.computeBounds(this.m0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.f10308a).c(this, zs.U1);
        zs.f(this.f10308a).c(this, zs.W1);
        zs.f(this.f10308a).c(this, zs.V1);
        zs.f(this.f10308a).c(this, zs.f19592c2);
        zs.f(this.f10308a).c(this, zs.a2);
        zs.f(this.f10308a).c(this, zs.f19586b2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f10308a;
        if (i10 >= 0) {
            zs.f(i10).n(this, zs.U1);
            zs.f(this.f10308a).n(this, zs.W1);
            zs.f(this.f10308a).n(this, zs.V1);
            zs.f(this.f10308a).n(this, zs.f19592c2);
            zs.f(this.f10308a).n(this, zs.a2);
            zs.f(this.f10308a).n(this, zs.f19586b2);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(10.0f);
        float f7 = L * 2.0f;
        float measuredWidth = getMeasuredWidth() - f7;
        float measuredHeight = getMeasuredHeight() - f7;
        float f10 = measuredWidth / 8.0f;
        RectF rectF = org.telegram.messenger.i0.P;
        float f11 = measuredWidth + L;
        rectF.set(L, L, f11, f11);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f10330s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.f10329r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.f10331w;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f10332x;
        path4.rewind();
        rectF.inset(org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.M.setTranslationY(-((getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f10327p0;
            arrayList.clear();
            if (this.f10320i0) {
                Rect rect = this.f10328q0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.i0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final x20 x20Var, final String str2, final CharSequence charSequence, final boolean z10, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final q20 q20Var, final j20 j20Var) {
        org.telegram.messenger.i0.h3(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                t2 t2Var;
                v2 v2Var = v2.this;
                q20 q20Var2 = q20Var;
                if (q20Var2 != null && (t2Var = v2Var.W) != null && t2Var.f10280o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    t2 t2Var2 = v2Var.W;
                    if (t2Var2 != null) {
                        t2Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f10281p = new ArrayList();
                    obj.f10282q = new ArrayList();
                    obj.f10285t = 0.0f;
                    obj.f10286u = 0.0f;
                    v2Var.W = obj;
                }
                t2 t2Var3 = v2Var.W;
                t2Var3.f10271c = str2;
                String str4 = str;
                t2Var3.f10270b = str4;
                t2Var3.f10269a = str4;
                t2Var3.d = charSequence;
                t2Var3.h = z10;
                t2Var3.f10274i = j10;
                t2Var3.f10275j = stickerSet;
                t2Var3.f10276k = document;
                x20 x20Var2 = x20Var;
                t2Var3.f10284s = x20Var2;
                t2Var3.f10277l = str3;
                t2Var3.f10279n = q20Var2;
                t2Var3.f10278m = j20Var;
                ArrayList arrayList = t2Var3.f10282q;
                if (!TextUtils.isEmpty(str4)) {
                    t2Var3.f10281p.add(new File(t2Var3.f10270b));
                }
                if (!TextUtils.isEmpty(t2Var3.f10269a) && !TextUtils.equals(t2Var3.f10269a, t2Var3.f10270b)) {
                    arrayList.add(new File(t2Var3.f10269a));
                }
                if (!TextUtils.isEmpty(t2Var3.f10277l)) {
                    arrayList.add(new File(t2Var3.f10277l));
                }
                if (!z11) {
                    v2Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        t2 t2Var4 = v2Var.W;
                        t2Var4.e = ui.a0(document3, t2Var4.f10271c);
                        v2Var.W.f10272f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = v2Var.W.f10272f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        v2Var.a();
                    } else if (x20Var2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f19814id = 1;
                        t2 t2Var5 = v2Var.W;
                        String absolutePath = n5.w(d20.f15147s0, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        t2Var5.f10270b = absolutePath;
                        v2Var.W.f10283r = new jj(d20.f15147s0, tL_message, null, false, false);
                        v2Var.W.f10283r.f16356p0 = x20Var2;
                        MediaController.B().h0(v2Var.W.f10283r, false, false, false);
                    } else {
                        b8.G(v2Var.f10308a).i0(false, 67108864, str4, true);
                    }
                }
                if (q20Var2 == null) {
                    if (v2Var.f10314d0 == null) {
                        v2Var.f10314d0 = new vh.m0(v2Var.getContext(), cd.L0(2131746934, null));
                    }
                    v2Var.f10314d0.setOnCancelListener(new k2(v2Var, 0));
                    if (v2Var.f10314d0.getParent() == null) {
                        v2Var.addView(v2Var.f10314d0, b6.e(-1, -1, 17));
                    }
                    vh.m0 m0Var = v2Var.f10314d0;
                    m0Var.E = true;
                    m0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f10308a;
        if (i11 != i10) {
            int i12 = zs.f19586b2;
            int i13 = zs.a2;
            int i14 = zs.f19592c2;
            int i15 = zs.V1;
            int i16 = zs.W1;
            int i17 = zs.U1;
            if (i11 >= 0 && isAttachedToWindow()) {
                zs.f(this.f10308a).n(this, i17);
                zs.f(this.f10308a).n(this, i16);
                zs.f(this.f10308a).n(this, i15);
                zs.f(this.f10308a).n(this, i14);
                zs.f(this.f10308a).n(this, i13);
                zs.f(this.f10308a).n(this, i12);
            }
            this.f10308a = i10;
            if (i10 >= 0 && isAttachedToWindow()) {
                zs.f(this.f10308a).c(this, i17);
                zs.f(this.f10308a).c(this, i16);
                zs.f(this.f10308a).c(this, i15);
                zs.f(this.f10308a).c(this, i14);
                zs.f(this.f10308a).c(this, i13);
                zs.f(this.f10308a).c(this, i12);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f7;
        if (this.f10320i0 != z10) {
            this.f10320i0 = z10;
            ViewPropertyAnimator animate = this.f10319h0.animate();
            float f10 = 0.0f;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            if (!z10) {
                f10 = org.telegram.messenger.i0.L(-18.0f);
            }
            alpha.translationX(f10).setInterpolator(gr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f10327p0;
                arrayList.clear();
                if (this.f10320i0) {
                    Rect rect = this.f10328q0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.i0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f7) {
        this.F = f7;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(j2 j2Var) {
        this.f10311b0 = j2Var;
    }
}
