package ch;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f3;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.mz;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.sq;
import org.telegram.ui.pl;
public final class q0 {
    public static int W;
    public float A;
    public boolean B;
    public int C;
    public boolean D;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public float N;
    public float O;
    public n0 P;
    public boolean Q;
    public c1.a R;
    public float f5511a;
    public int f5512b;
    public int f5513c;
    public float d;
    public float f5514e;
    public float f5515f;
    public float f5516g;
    public boolean h;
    public boolean f5517i;
    public boolean f5518j;
    public int f5519k;
    public int f5521m;
    public int f5522n;
    public int f5523o;
    public boolean f5524p;
    public final float f5525q;
    public int f5526r;
    public final org.telegram.ui.Cells.z f5530w;
    public gj f5531x;
    public h6 f5532y;
    public Integer f5533z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final m0 X = new Object();
    public static int Y = 1;
    public static final a3.c Z = new a3.c(13);
    public final ArrayList f5527s = new ArrayList();
    public final ArrayList f5528t = new ArrayList();
    public final HashMap f5529u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int f5520l = k10.f24968t0;

    public q0(org.telegram.ui.Cells.z zVar) {
        this.f5530w = zVar;
        n(this.f5532y);
        this.f5525q = ViewConfiguration.get(org.telegram.messenger.t0.f26931b).getScaledTouchSlop();
    }

    public static boolean g(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji)) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || !(reaction2 instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
            return false;
        }
        return true;
    }

    public static void h(RectF rectF, RectF rectF2, Path path) {
        float f10;
        path.rewind();
        float f11 = rectF.left;
        rectF2.set(f11, rectF.top, org.telegram.messenger.g0.L(12.0f) + f11, rectF.top + org.telegram.messenger.g0.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - org.telegram.messenger.g0.L(12.0f), rectF.left + org.telegram.messenger.g0.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > org.telegram.messenger.g0.L(26.0f)) {
            f10 = 1.4f;
        } else {
            f10 = 0.0f;
        }
        float N = rectF.right - org.telegram.messenger.g0.N(9.09f);
        float N2 = N - org.telegram.messenger.g0.N(0.056f);
        float N3 = org.telegram.messenger.g0.N(1.22f) + N;
        float N4 = org.telegram.messenger.g0.N(3.07f) + N;
        float N5 = org.telegram.messenger.g0.N(2.406f) + N;
        float N6 = org.telegram.messenger.g0.N(8.27f + f10) + N;
        float N7 = org.telegram.messenger.g0.N(8.923f + f10) + N;
        float N8 = org.telegram.messenger.g0.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - org.telegram.messenger.g0.N(1.753f);
        float N10 = org.telegram.messenger.g0.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - org.telegram.messenger.g0.N(0.663f);
        float f12 = 10.263f + f10;
        float N12 = org.telegram.messenger.g0.N(f12) + rectF.top;
        float N13 = rectF.bottom - org.telegram.messenger.g0.N(f12);
        float f13 = f10 + 11.333f;
        float N14 = org.telegram.messenger.g0.N(f13) + rectF.top;
        float N15 = rectF.bottom - org.telegram.messenger.g0.N(f13);
        path.lineTo(N2, rectF.bottom);
        path.cubicTo(N3, rectF.bottom, N5, N11, N4, N9);
        path.lineTo(N6, N13);
        path.cubicTo(N7, N15, N7, N14, N6, N12);
        path.lineTo(N4, N8);
        float f14 = rectF.top;
        path.cubicTo(N5, N10, N3, f14, N2, f14);
        path.close();
    }

    public static long j(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).f28583id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f28434id;
        }
        return 0L;
    }

    public static void n(h6 h6Var) {
        S.setColor(m6.w0(m6.Ze, h6Var));
        int w02 = m6.w0(m6.Ji, h6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        d9 d9Var;
        int i7;
        if (this.f5531x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.f5528t;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((n0) arrayList.get(i10)).b();
            i10++;
        }
        arrayList.clear();
        hashMap.putAll(this.f5529u);
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f5527s;
            if (i11 >= arrayList2.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList2.get(i11);
            String str = n0Var.f5476n;
            sq sqVar = n0Var.E;
            n0 n0Var2 = (n0) hashMap.get(str);
            if (n0Var2 != null) {
                hashMap.remove(n0Var.f5476n);
                int i12 = n0Var.f5484w;
                int i13 = n0Var2.f5484w;
                if (i12 == i13 && n0Var.f5485x == n0Var2.f5485x && n0Var.f5487z == n0Var2.f5487z && n0Var.v == n0Var2.v && n0Var.f5477o == n0Var2.f5477o && n0Var.S == null && n0Var2.S == null) {
                    n0Var.f5461b = 0;
                    i11++;
                } else {
                    n0Var.f5463c = i13;
                    n0Var.d = n0Var2.f5485x;
                    n0Var.f5466e = n0Var2.f5487z;
                    n0Var.h = n0Var2.M;
                    n0Var.f5468f = n0Var2.N;
                    n0Var.f5470g = n0Var2.O;
                    n0Var.f5461b = 3;
                    int i14 = n0Var.v;
                    int i15 = n0Var2.v;
                    if (i14 != i15 && sqVar != null) {
                        sqVar.c(i15, false);
                        sqVar.c(n0Var.v, true);
                    }
                    d9 d9Var2 = n0Var.S;
                    if (d9Var2 != null || n0Var2.S != null) {
                        if (d9Var2 == null) {
                            n0Var.o(new ArrayList());
                        }
                        if (n0Var2.S == null) {
                            n0Var2.o(new ArrayList());
                        }
                        ArrayList arrayList3 = n0Var2.T;
                        ArrayList arrayList4 = n0Var.T;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i16);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i16);
                                if (tLObject != null && tLObject2 != null && j(tLObject) == j(tLObject2)) {
                                }
                            }
                        }
                        d9 d9Var3 = n0Var.S;
                        if (d9Var3 != null && (d9Var = n0Var2.S) != null) {
                            ValueAnimator valueAnimator = d9Var.f34428f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (d9Var3.f34443w) {
                                    d9Var3.f34443w = false;
                                    d9Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i17 = 0;
                            while (true) {
                                i7 = this.f5520l;
                                if (i17 >= 3) {
                                    break;
                                }
                                tLObjectArr[i17] = d9Var3.f34425b[i17].h;
                                d9Var3.j(i17, i7, d9Var.f34425b[i17].h);
                                i17++;
                            }
                            d9Var3.a(false, true);
                            for (int i18 = 0; i18 < 3; i18++) {
                                d9Var3.j(i18, i7, tLObjectArr[i18]);
                            }
                            d9Var3.d = true;
                            d9Var3.a(true, false);
                        }
                    }
                }
            } else {
                n0Var.f5461b = 1;
            }
            z10 = true;
            i11++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                ((n0) arrayList.get(i19)).f5473k = ((n0) arrayList.get(i19)).f5475m;
                ((n0) arrayList.get(i19)).a();
            }
            z10 = true;
        }
        if (this.h) {
            float f10 = this.f5515f;
            if (f10 != this.f5512b || this.f5516g != this.f5513c) {
                this.f5517i = true;
                this.d = f10;
                this.f5514e = this.f5516g;
                z10 = true;
            }
        }
        if (this.C != this.f5523o) {
            z10 = true;
        }
        int i20 = this.F;
        if (i20 != this.f5522n) {
            this.f5518j = true;
            this.G = i20;
            return true;
        }
        return z10;
    }

    public final void b(p0 p0Var) {
        int i7 = 0;
        if (p0Var.f5508g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(p0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.f5530w);
                int i10 = W;
                W = i10 + 1;
                imageReceiver.f22701w1 = Integer.toString(i10);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(this.f5520l).f26847r.get(p0Var.f5507f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(gc.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(p0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || p0Var.f5508g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f5527s;
            if (i7 < arrayList.size()) {
                if (p0Var.f(((n0) arrayList.get(i7)).f5479q)) {
                    ((n0) arrayList.get(i7)).p();
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        gj gjVar;
        TLRPC.Message message;
        int i7 = 0;
        if (this.f5524p || (gjVar = this.f5531x) == null || (message = gjVar.f24213k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.f5530w;
        if (e2.s(zVar)) {
            y10 -= zVar.getPaddingTop();
            if (zVar instanceof v0) {
                x10 -= ((v0) zVar).f32125k0 / 2.0f;
            }
        }
        float f10 = x10 - this.f5512b;
        float f11 = y10 - this.f5513c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.f5527s;
            int size = arrayList.size();
            while (true) {
                if (i7 >= size) {
                    break;
                } else if (f10 > ((n0) arrayList.get(i7)).f5484w && f10 < ((n0) arrayList.get(i7)).f5484w + ((n0) arrayList.get(i7)).f5487z && f11 > ((n0) arrayList.get(i7)).f5485x && f11 < ((n0) arrayList.get(i7)).f5485x + ((n0) arrayList.get(i7)).A) {
                    this.N = motionEvent.getX();
                    this.O = y10;
                    this.P = (n0) arrayList.get(i7);
                    c1.a aVar = this.R;
                    if (aVar != null) {
                        org.telegram.messenger.g0.r(aVar);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    c1.a aVar2 = new c1.a(8, this, this.P);
                    this.R = aVar2;
                    org.telegram.messenger.g0.h3(aVar2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.Q;
            float f12 = this.f5525q;
            if ((z10 && Math.abs(motionEvent.getX() - this.N) > f12) || Math.abs(y10 - this.O) > f12) {
                this.Q = false;
                n0 n0Var = this.P;
                if (n0Var != null) {
                    n0Var.X.c(false);
                }
                this.P = null;
                c1.a aVar3 = this.R;
                if (aVar3 != null) {
                    org.telegram.messenger.g0.r(aVar3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            c1.a aVar4 = this.R;
            if (aVar4 != null) {
                org.telegram.messenger.g0.r(aVar4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.f5459a;
                float x11 = motionEvent.getX();
                if (e2.s(zVar)) {
                    ((q4) zVar).d(reactionCount, false, x11, y10);
                }
            }
            this.Q = false;
            n0 n0Var2 = this.P;
            if (n0Var2 != null) {
                n0Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f10, Integer num) {
        float f11;
        float f12;
        float f13;
        boolean z10;
        Canvas canvas2 = canvas;
        boolean z11 = this.f5524p;
        ArrayList arrayList = this.f5528t;
        if (!z11 || !arrayList.isEmpty()) {
            float f14 = this.f5512b;
            float f15 = this.f5513c;
            if (this.f5524p) {
                f14 = this.f5515f;
                f15 = this.f5516g;
            } else if (this.f5517i) {
                float f16 = 1.0f - f10;
                f14 = (f14 * f10) + (this.d * f16);
                f15 = (f15 * f10) + (this.f5514e * f16);
            }
            float f17 = f14;
            float f18 = f15;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f5527s;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                n0 n0Var = (n0) arrayList2.get(i10);
                if (this.f5533z == null && num == null && this.A < 0.5f) {
                    n0Var.c();
                }
                if (!Integer.valueOf(n0Var.f5479q.hashCode()).equals(this.f5533z) && (num == null || n0Var.f5479q.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f19 = n0Var.f5484w;
                    float f20 = n0Var.f5485x;
                    int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i11 != 0 && n0Var.f5461b == 3) {
                        float f21 = 1.0f - f10;
                        f19 = (f19 * f10) + (n0Var.f5463c * f21);
                        f20 = (f20 * f10) + (n0Var.d * f21);
                    }
                    if (i11 != 0 && n0Var.f5461b == 1) {
                        float f22 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f22, f22, (n0Var.f5487z / 2.0f) + f17 + f19, (n0Var.A / 2.0f) + f18 + f20);
                        f11 = f10;
                    } else {
                        f11 = 1.0f;
                    }
                    float f23 = f19 + f17;
                    float f24 = f20 + f18;
                    if (n0Var.f5461b == 3) {
                        f12 = f11;
                        f13 = f10;
                    } else {
                        f12 = f11;
                        f13 = 1.0f;
                    }
                    if (num != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n0Var.d(canvas2, f23, f24, f13, f12, z10, this.B, this.A);
                    canvas2.restore();
                }
                i10++;
            }
            while (i7 < arrayList.size()) {
                n0 n0Var2 = (n0) arrayList.get(i7);
                float f25 = 1.0f - f10;
                float f26 = (f25 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f26, f26, (n0Var2.f5487z / 2.0f) + n0Var2.f5484w + f17, (n0Var2.A / 2.0f) + n0Var2.f5485x + f18);
                ((n0) arrayList.get(i7)).d(canvas2, n0Var2.f5484w + f17, n0Var2.f5485x + f18, 1.0f, f25, false, this.B, this.A);
                canvas.restore();
                i7++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f10) {
        n0 n0Var;
        boolean z10;
        float f11;
        boolean z11 = this.f5524p;
        ArrayList arrayList = this.f5528t;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f5512b;
            float f13 = this.f5513c;
            float f14 = 1.0f;
            if (this.f5524p) {
                f12 = this.f5515f;
                f13 = this.f5516g;
            } else if (this.f5517i) {
                float f15 = 1.0f - f10;
                f12 = (f12 * f10) + (this.d * f15);
                f13 = (f13 * f10) + (this.f5514e * f15);
            }
            int i7 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList2 = this.f5527s;
                if (i7 >= arrayList2.size()) {
                    break;
                }
                n0 n0Var2 = (n0) arrayList2.get(i7);
                if (!n0Var2.f5474l) {
                    f11 = f14;
                } else {
                    canvas.save();
                    float f16 = n0Var2.f5484w;
                    float f17 = n0Var2.f5485x;
                    int i10 = (f10 > f14 ? 1 : (f10 == f14 ? 0 : -1));
                    if (i10 != 0) {
                        f11 = f14;
                        if (n0Var2.f5461b == 3) {
                            float f18 = f11 - f10;
                            f16 = (f16 * f10) + (n0Var2.f5463c * f18);
                            f17 = (f17 * f10) + (n0Var2.d * f18);
                        }
                    } else {
                        f11 = f14;
                    }
                    if (i10 != 0 && n0Var2.f5461b == 1) {
                        float f19 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f19, f19, (n0Var2.f5487z / 2.0f) + f12 + f16, (n0Var2.A / 2.0f) + f13 + f17);
                    }
                    if (!z12 && !n0Var2.f(canvas, f16 + f12, f17 + f13)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    canvas.restore();
                }
                i7++;
                f14 = f11;
            }
            float f20 = f14;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((n0) arrayList.get(i11)).f5474l) {
                    float f21 = ((f20 - f10) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f21, f21, (n0Var.f5487z / 2.0f) + n0Var.f5484w + f12, (n0Var.A / 2.0f) + n0Var.f5485x + f13);
                    if (!z12 && !((n0) arrayList.get(i11)).f(canvas, n0Var.f5484w + f12, n0Var.f5485x + f13)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    canvas.restore();
                    z12 = z10;
                }
            }
        }
    }

    public final void f(pl plVar, Canvas canvas, int i7, Integer num) {
        int i10;
        if (!this.f5524p || !this.f5528t.isEmpty()) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f5527s;
                if (i11 < arrayList.size()) {
                    n0 n0Var = (n0) arrayList.get(i11);
                    if ((num == null || n0Var.f5479q.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(n0Var.f5481s);
                        float L = org.telegram.messenger.g0.L(140.0f);
                        float L2 = org.telegram.messenger.g0.L(14.0f);
                        org.telegram.ui.Cells.z zVar = this.f5530w;
                        if (zVar instanceof r1) {
                            i10 = ((r1) zVar).getParentWidth();
                        } else {
                            i10 = org.telegram.messenger.g0.f24046q.x;
                        }
                        float i12 = Utilities.i(rectF.left - org.telegram.messenger.g0.L(12.0f), (i10 - L) - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                        float f10 = rectF.top - L2;
                        float f11 = i7;
                        float f12 = f10 + f11;
                        RectF rectF2 = this.L;
                        rectF2.set(i12, (f10 - L) + f11, L + i12, f12);
                        float interpolation = nr.h.getInterpolation(this.A);
                        org.telegram.messenger.g0.Z1(rectF, rectF2, interpolation, rectF2);
                        int i13 = n0Var.U;
                        p0 p0Var = n0Var.f5480r;
                        View view = n0Var.V;
                        if (n0Var.f5467e0 == null && n0Var.f5469f0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (n0Var.f5479q != null && !p0Var.f5503a) {
                                if (p0Var.f5507f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(i13).f26847r.get(p0Var.f5507f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        mz f13 = u5.f(tL_availableReaction.static_icon, m6.f29324a7, 1.0f, null);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        n0Var.f5467e0 = imageReceiver;
                                        imageReceiver.E0(7);
                                        n0Var.f5467e0.P();
                                        n0Var.f5467e0.J0(org.telegram.messenger.g0.L(14.0f));
                                        ImageReceiver imageReceiver2 = n0Var.f5467e0;
                                        imageReceiver2.f22697v0 = true;
                                        imageReceiver2.f22695u0 = true;
                                        imageReceiver2.W(1);
                                        ImageReceiver imageReceiver3 = n0Var.f5467e0;
                                        imageReceiver3.f22703x0 = true;
                                        imageReceiver3.q0(gc.b(tL_availableReaction.activate_animation), "140_140", f13, null, tL_availableReaction, 1);
                                    }
                                } else if (p0Var.f5508g != 0) {
                                    p5 p5Var = new p5(24, i13, p0Var.f5508g);
                                    n0Var.f5469f0 = p5Var;
                                    p5Var.a(view);
                                }
                            }
                        }
                        this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver4 = n0Var.f5467e0;
                            if (imageReceiver4 != null) {
                                imageReceiver4.A0(rectF2);
                                n0Var.f5467e0.setAlpha(interpolation);
                                n0Var.f5467e0.h(canvas, null);
                            } else {
                                p5 p5Var2 = n0Var.f5469f0;
                                if (p5Var2 != null) {
                                    p5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    n0Var.f5469f0.setAlpha((int) (interpolation * 255.0f));
                                    n0Var.f5469f0.draw(canvas);
                                }
                            }
                            plVar.invalidate();
                        }
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f10) {
        if (this.f5518j) {
            return (this.f5522n * f10) + ((1.0f - f10) * this.G);
        }
        return this.f5522n;
    }

    public final n0 k(p0 p0Var) {
        String l10;
        if (p0Var.f5503a) {
            l10 = "stars";
        } else {
            String str = p0Var.f5507f;
            if (str != null) {
                l10 = str;
            } else {
                l10 = Long.toString(p0Var.f5508g);
            }
        }
        return l(l10);
    }

    public final n0 l(String str) {
        return (n0) this.f5529u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            if ((!this.f5524p || !this.f5528t.isEmpty()) && qc.e(8200) && qc.e(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(int i7, int i10) {
        ArrayList arrayList;
        float f10;
        int L;
        float f11;
        int i11;
        this.f5521m = 0;
        this.f5523o = 0;
        this.f5519k = 0;
        this.f5522n = 0;
        if (this.f5524p) {
            return;
        }
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            arrayList = this.f5527s;
            if (i12 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i12);
            n0Var.getClass();
            n6 n6Var = n0Var.F;
            sq sqVar = n0Var.E;
            if (n0Var.R) {
                n0Var.f5487z = org.telegram.messenger.g0.L(42.0f);
                n0Var.A = org.telegram.messenger.g0.L(26.0f);
                if (n0Var.f5482t) {
                    n0Var.f5487z = (int) (n6Var.d + org.telegram.messenger.g0.L(8.0f) + n0Var.f5487z);
                } else if (sqVar != null && n0Var.v > 1) {
                    n0Var.f5487z = f3.C(8.0f, (int) Math.ceil(sqVar.f39662m), n0Var.f5487z);
                }
            } else {
                int L2 = org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f);
                if (n0Var.C != null) {
                    f11 = 6.0f;
                } else {
                    f11 = 4.0f;
                }
                n0Var.f5487z = org.telegram.messenger.g0.L(f11) + L2;
                if (n0Var.S != null && n0Var.T.size() > 0) {
                    n0Var.T.size();
                    if (n0Var.T.size() > 1) {
                        i11 = n0Var.T.size() - 1;
                    } else {
                        i11 = 0;
                    }
                    n0Var.f5487z = (int) ((org.telegram.messenger.g0.L(20.0f) * i11 * 0.8f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(1.0f) + n0Var.f5487z);
                    n0Var.S.f34436o = org.telegram.messenger.g0.L(26.0f);
                } else if (n0Var.f5482t) {
                    n0Var.f5487z = (int) (n6Var.d + org.telegram.messenger.g0.L(8.0f) + n0Var.f5487z);
                } else if (((int) Math.ceil(sqVar.f39662m)) > 0) {
                    n0Var.f5487z = f3.C(8.0f, (int) Math.ceil(sqVar.f39662m), n0Var.f5487z);
                } else {
                    n0Var.f5487z -= org.telegram.messenger.g0.L(1.0f);
                }
                n0Var.A = org.telegram.messenger.g0.L(26.0f);
            }
            if (n0Var.f5487z + i13 > i7) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = f3.C(4.0f, n0Var.A, i15);
                i16++;
                i13 = 0;
            }
            n0Var.f5484w = i13;
            n0Var.f5485x = i15;
            n0Var.f5486y = i16;
            i13 = f3.C(4.0f, n0Var.f5487z, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i10 == 5 && !arrayList.isEmpty()) {
            int i17 = ((n0) arrayList.get(0)).f5485x;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((n0) arrayList.get(i19)).f5485x != i17) {
                    int i20 = i19 - 1;
                    int i21 = i7 - (((n0) arrayList.get(i20)).f5484w + ((n0) arrayList.get(i20)).f5487z);
                    while (i18 < i19) {
                        ((n0) arrayList.get(i18)).f5484w += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i7 - (((n0) arrayList.get(size)).f5484w + ((n0) arrayList.get(size)).f5487z);
            while (i18 <= size) {
                ((n0) arrayList.get(i18)).f5484w += i22;
                i18++;
            }
        } else if (i10 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                n0 n0Var2 = (n0) arrayList.get(i23);
                int i24 = n0Var2.f5486y;
                if (i24 >= 0 && i24 < arrayList2.size()) {
                    f10 = ((Integer) arrayList2.get(n0Var2.f5486y)).intValue();
                } else {
                    f10 = 0.0f;
                }
                n0Var2.f5484w = (int) e2.A(i7, f10, 2.0f, n0Var2.f5484w);
            }
        }
        this.f5526r = i13;
        if (i10 != 5 && i10 != 1) {
            this.f5523o = i14;
        } else {
            this.f5523o = i7;
        }
        if (arrayList.size() == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(26.0f);
        }
        this.f5521m = i15 + L;
        this.f5511a = 0.0f;
    }

    public final void p() {
        int i7 = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.f5527s;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((n0) arrayList.get(i7)).b();
            i7++;
        }
        HashMap hashMap = this.E;
        if (!hashMap.isEmpty()) {
            for (ImageReceiver imageReceiver : hashMap.values()) {
                imageReceiver.R();
            }
        }
        hashMap.clear();
    }

    public final void q() {
        HashMap hashMap = this.f5529u;
        hashMap.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5527s;
            if (i7 < arrayList.size()) {
                hashMap.put(((n0) arrayList.get(i7)).f5476n, (n0) arrayList.get(i7));
                i7++;
            } else {
                this.h = !this.f5524p;
                this.f5515f = this.f5512b;
                this.f5516g = this.f5513c;
                this.C = this.f5523o;
                this.F = this.f5522n;
                return;
            }
        }
    }

    public final void r(org.telegram.messenger.gj r21, boolean r22, org.telegram.ui.ActionBar.h6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: ch.q0.r(org.telegram.messenger.gj, boolean, org.telegram.ui.ActionBar.h6):void");
    }
}
