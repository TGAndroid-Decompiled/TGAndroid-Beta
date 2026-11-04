package dh;

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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.jz;
import org.telegram.messenger.k5;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.kl;
public final class o0 {
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
    public l0 P;
    public boolean Q;
    public ci.e0 R;
    public float f9112a;
    public int f9113b;
    public int f9114c;
    public float d;
    public float f9115e;
    public float f9116f;
    public float f9117g;
    public boolean h;
    public boolean f9118i;
    public boolean f9119j;
    public int f9120k;
    public int f9122m;
    public int f9123n;
    public int f9124o;
    public boolean f9125p;
    public final float f9126q;
    public int f9127r;
    public final org.telegram.ui.Cells.z f9131w;
    public zi f9132x;
    public e6 f9133y;
    public Integer f9134z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final k0 X = new Object();
    public static int Y = 1;
    public static final a3.u Z = new a3.u(7);
    public final ArrayList f9128s = new ArrayList();
    public final ArrayList f9129t = new ArrayList();
    public final HashMap f9130u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int f9121l = h10.f22829t0;

    public o0(org.telegram.ui.Cells.z zVar) {
        this.f9131w = zVar;
        n(this.f9133y);
        this.f9126q = ViewConfiguration.get(t0.f25457b).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f27150id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f27001id;
        }
        return 0L;
    }

    public static void n(e6 e6Var) {
        S.setColor(k6.w0(k6.We, e6Var));
        int w02 = k6.w0(k6.Gi, e6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        w8 w8Var;
        int i3;
        if (this.f9132x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.f9129t;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((l0) arrayList.get(i10)).b();
            i10++;
        }
        arrayList.clear();
        hashMap.putAll(this.f9130u);
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f9128s;
            if (i11 >= arrayList2.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList2.get(i11);
            String str = l0Var.f9077n;
            cq cqVar = l0Var.E;
            l0 l0Var2 = (l0) hashMap.get(str);
            if (l0Var2 != null) {
                hashMap.remove(l0Var.f9077n);
                int i12 = l0Var.f9085w;
                int i13 = l0Var2.f9085w;
                if (i12 == i13 && l0Var.f9086x == l0Var2.f9086x && l0Var.f9088z == l0Var2.f9088z && l0Var.v == l0Var2.v && l0Var.f9078o == l0Var2.f9078o && l0Var.S == null && l0Var2.S == null) {
                    l0Var.f9062b = 0;
                    i11++;
                } else {
                    l0Var.f9064c = i13;
                    l0Var.d = l0Var2.f9086x;
                    l0Var.f9067e = l0Var2.f9088z;
                    l0Var.h = l0Var2.M;
                    l0Var.f9069f = l0Var2.N;
                    l0Var.f9071g = l0Var2.O;
                    l0Var.f9062b = 3;
                    int i14 = l0Var.v;
                    int i15 = l0Var2.v;
                    if (i14 != i15 && cqVar != null) {
                        cqVar.c(i15, false);
                        cqVar.c(l0Var.v, true);
                    }
                    w8 w8Var2 = l0Var.S;
                    if (w8Var2 != null || l0Var2.S != null) {
                        if (w8Var2 == null) {
                            l0Var.o(new ArrayList());
                        }
                        if (l0Var2.S == null) {
                            l0Var2.o(new ArrayList());
                        }
                        ArrayList arrayList3 = l0Var2.T;
                        ArrayList arrayList4 = l0Var.T;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i16);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i16);
                                if (tLObject != null && tLObject2 != null && j(tLObject) == j(tLObject2)) {
                                }
                            }
                        }
                        w8 w8Var3 = l0Var.S;
                        if (w8Var3 != null && (w8Var = l0Var2.S) != null) {
                            ValueAnimator valueAnimator = w8Var.f39951f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (w8Var3.f39966w) {
                                    w8Var3.f39966w = false;
                                    w8Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i17 = 0;
                            while (true) {
                                i3 = this.f9121l;
                                if (i17 >= 3) {
                                    break;
                                }
                                tLObjectArr[i17] = w8Var3.f39948b[i17].h;
                                w8Var3.j(i17, i3, w8Var.f39948b[i17].h);
                                i17++;
                            }
                            w8Var3.a(false, true);
                            for (int i18 = 0; i18 < 3; i18++) {
                                w8Var3.j(i18, i3, tLObjectArr[i18]);
                            }
                            w8Var3.d = true;
                            w8Var3.a(true, false);
                        }
                    }
                }
            } else {
                l0Var.f9062b = 1;
            }
            z10 = true;
            i11++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                ((l0) arrayList.get(i19)).f9074k = ((l0) arrayList.get(i19)).f9076m;
                ((l0) arrayList.get(i19)).a();
            }
            z10 = true;
        }
        if (this.h) {
            float f10 = this.f9116f;
            if (f10 != this.f9113b || this.f9117g != this.f9114c) {
                this.f9118i = true;
                this.d = f10;
                this.f9115e = this.f9117g;
                z10 = true;
            }
        }
        if (this.C != this.f9124o) {
            z10 = true;
        }
        int i20 = this.F;
        if (i20 != this.f9123n) {
            this.f9119j = true;
            this.G = i20;
            return true;
        }
        return z10;
    }

    public final void b(n0 n0Var) {
        int i3 = 0;
        if (n0Var.f9098g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(n0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.f9131w);
                int i10 = W;
                W = i10 + 1;
                imageReceiver.f21278w1 = Integer.toString(i10);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(this.f9121l).f24045r.get(n0Var.f9097f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(ac.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(n0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || n0Var.f9098g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f9128s;
            if (i3 < arrayList.size()) {
                if (n0Var.f(((l0) arrayList.get(i3)).f9080q)) {
                    ((l0) arrayList.get(i3)).p();
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        zi ziVar;
        TLRPC.Message message;
        int i3 = 0;
        if (this.f9125p || (ziVar = this.f9132x) == null || (message = ziVar.f26868k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.f9131w;
        if (com.google.android.recaptcha.internal.a.u(zVar)) {
            y9 -= zVar.getPaddingTop();
            if (zVar instanceof org.telegram.ui.Cells.t0) {
                x10 -= ((org.telegram.ui.Cells.t0) zVar).f30400k0 / 2.0f;
            }
        }
        float f10 = x10 - this.f9113b;
        float f11 = y9 - this.f9114c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.f9128s;
            int size = arrayList.size();
            while (true) {
                if (i3 >= size) {
                    break;
                } else if (f10 > ((l0) arrayList.get(i3)).f9085w && f10 < ((l0) arrayList.get(i3)).f9085w + ((l0) arrayList.get(i3)).f9088z && f11 > ((l0) arrayList.get(i3)).f9086x && f11 < ((l0) arrayList.get(i3)).f9086x + ((l0) arrayList.get(i3)).A) {
                    this.N = motionEvent.getX();
                    this.O = y9;
                    this.P = (l0) arrayList.get(i3);
                    ci.e0 e0Var = this.R;
                    if (e0Var != null) {
                        org.telegram.messenger.g0.r(e0Var);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    ci.e0 e0Var2 = new ci.e0(25, this, this.P);
                    this.R = e0Var2;
                    org.telegram.messenger.g0.i3(e0Var2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                } else {
                    i3++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.Q;
            float f12 = this.f9126q;
            if ((z10 && Math.abs(motionEvent.getX() - this.N) > f12) || Math.abs(y9 - this.O) > f12) {
                this.Q = false;
                l0 l0Var = this.P;
                if (l0Var != null) {
                    l0Var.X.c(false);
                }
                this.P = null;
                ci.e0 e0Var3 = this.R;
                if (e0Var3 != null) {
                    org.telegram.messenger.g0.r(e0Var3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ci.e0 e0Var4 = this.R;
            if (e0Var4 != null) {
                org.telegram.messenger.g0.r(e0Var4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.f9060a;
                float x11 = motionEvent.getX();
                if (com.google.android.recaptcha.internal.a.u(zVar)) {
                    ((p4) zVar).e(reactionCount, false, x11, y9);
                }
            }
            this.Q = false;
            l0 l0Var2 = this.P;
            if (l0Var2 != null) {
                l0Var2.X.c(false);
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
        boolean z11 = this.f9125p;
        ArrayList arrayList = this.f9129t;
        if (!z11 || !arrayList.isEmpty()) {
            float f14 = this.f9113b;
            float f15 = this.f9114c;
            if (this.f9125p) {
                f14 = this.f9116f;
                f15 = this.f9117g;
            } else if (this.f9118i) {
                float f16 = 1.0f - f10;
                f14 = (f14 * f10) + (this.d * f16);
                f15 = (f15 * f10) + (this.f9115e * f16);
            }
            float f17 = f14;
            float f18 = f15;
            int i3 = 0;
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f9128s;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                l0 l0Var = (l0) arrayList2.get(i10);
                if (this.f9134z == null && num == null && this.A < 0.5f) {
                    l0Var.c();
                }
                if (!Integer.valueOf(l0Var.f9080q.hashCode()).equals(this.f9134z) && (num == null || l0Var.f9080q.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f19 = l0Var.f9085w;
                    float f20 = l0Var.f9086x;
                    int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i11 != 0 && l0Var.f9062b == 3) {
                        float f21 = 1.0f - f10;
                        f19 = (f19 * f10) + (l0Var.f9064c * f21);
                        f20 = (f20 * f10) + (l0Var.d * f21);
                    }
                    if (i11 != 0 && l0Var.f9062b == 1) {
                        float f22 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f22, f22, (l0Var.f9088z / 2.0f) + f17 + f19, (l0Var.A / 2.0f) + f18 + f20);
                        f11 = f10;
                    } else {
                        f11 = 1.0f;
                    }
                    float f23 = f19 + f17;
                    float f24 = f20 + f18;
                    if (l0Var.f9062b == 3) {
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
                    l0Var.d(canvas2, f23, f24, f13, f12, z10, this.B, this.A);
                    canvas2.restore();
                }
                i10++;
            }
            while (i3 < arrayList.size()) {
                l0 l0Var2 = (l0) arrayList.get(i3);
                float f25 = 1.0f - f10;
                float f26 = (f25 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f26, f26, (l0Var2.f9088z / 2.0f) + l0Var2.f9085w + f17, (l0Var2.A / 2.0f) + l0Var2.f9086x + f18);
                ((l0) arrayList.get(i3)).d(canvas2, l0Var2.f9085w + f17, l0Var2.f9086x + f18, 1.0f, f25, false, this.B, this.A);
                canvas.restore();
                i3++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f10) {
        l0 l0Var;
        boolean z10;
        float f11;
        boolean z11 = this.f9125p;
        ArrayList arrayList = this.f9129t;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f9113b;
            float f13 = this.f9114c;
            float f14 = 1.0f;
            if (this.f9125p) {
                f12 = this.f9116f;
                f13 = this.f9117g;
            } else if (this.f9118i) {
                float f15 = 1.0f - f10;
                f12 = (f12 * f10) + (this.d * f15);
                f13 = (f13 * f10) + (this.f9115e * f15);
            }
            int i3 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList2 = this.f9128s;
                if (i3 >= arrayList2.size()) {
                    break;
                }
                l0 l0Var2 = (l0) arrayList2.get(i3);
                if (!l0Var2.f9075l) {
                    f11 = f14;
                } else {
                    canvas.save();
                    float f16 = l0Var2.f9085w;
                    float f17 = l0Var2.f9086x;
                    int i10 = (f10 > f14 ? 1 : (f10 == f14 ? 0 : -1));
                    if (i10 != 0) {
                        f11 = f14;
                        if (l0Var2.f9062b == 3) {
                            float f18 = f11 - f10;
                            f16 = (f16 * f10) + (l0Var2.f9064c * f18);
                            f17 = (f17 * f10) + (l0Var2.d * f18);
                        }
                    } else {
                        f11 = f14;
                    }
                    if (i10 != 0 && l0Var2.f9062b == 1) {
                        float f19 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f19, f19, (l0Var2.f9088z / 2.0f) + f12 + f16, (l0Var2.A / 2.0f) + f13 + f17);
                    }
                    if (!z12 && !l0Var2.f(canvas, f16 + f12, f17 + f13)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    canvas.restore();
                }
                i3++;
                f14 = f11;
            }
            float f20 = f14;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((l0) arrayList.get(i11)).f9075l) {
                    float f21 = ((f20 - f10) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f21, f21, (l0Var.f9088z / 2.0f) + l0Var.f9085w + f12, (l0Var.A / 2.0f) + l0Var.f9086x + f13);
                    if (!z12 && !((l0) arrayList.get(i11)).f(canvas, l0Var.f9085w + f12, l0Var.f9086x + f13)) {
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

    public final void f(kl klVar, Canvas canvas, int i3, Integer num) {
        int i10;
        if (!this.f9125p || !this.f9129t.isEmpty()) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f9128s;
                if (i11 < arrayList.size()) {
                    l0 l0Var = (l0) arrayList.get(i11);
                    if ((num == null || l0Var.f9080q.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(l0Var.f9082s);
                        float L = org.telegram.messenger.g0.L(140.0f);
                        float L2 = org.telegram.messenger.g0.L(14.0f);
                        org.telegram.ui.Cells.z zVar = this.f9131w;
                        if (zVar instanceof q1) {
                            i10 = ((q1) zVar).getParentWidth();
                        } else {
                            i10 = org.telegram.messenger.g0.f22608q.x;
                        }
                        float i12 = Utilities.i(rectF.left - org.telegram.messenger.g0.L(12.0f), (i10 - L) - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                        float f10 = rectF.top - L2;
                        float f11 = i3;
                        float f12 = f10 + f11;
                        RectF rectF2 = this.L;
                        rectF2.set(i12, (f10 - L) + f11, L + i12, f12);
                        float interpolation = xq.h.getInterpolation(this.A);
                        org.telegram.messenger.g0.Z1(rectF, rectF2, interpolation, rectF2);
                        int i13 = l0Var.U;
                        n0 n0Var = l0Var.f9081r;
                        View view = l0Var.V;
                        if (l0Var.f9068e0 == null && l0Var.f9070f0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (l0Var.f9080q != null && !n0Var.f9093a) {
                                if (n0Var.f9097f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(i13).f24045r.get(n0Var.f9097f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        jz f13 = t5.f(tL_availableReaction.static_icon, k6.f27824a7, 1.0f, null);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        l0Var.f9068e0 = imageReceiver;
                                        imageReceiver.E0(7);
                                        l0Var.f9068e0.P();
                                        l0Var.f9068e0.J0(org.telegram.messenger.g0.L(14.0f));
                                        ImageReceiver imageReceiver2 = l0Var.f9068e0;
                                        imageReceiver2.f21274v0 = true;
                                        imageReceiver2.f21272u0 = true;
                                        imageReceiver2.W(1);
                                        ImageReceiver imageReceiver3 = l0Var.f9068e0;
                                        imageReceiver3.f21280x0 = true;
                                        imageReceiver3.q0(ac.b(tL_availableReaction.activate_animation), "140_140", f13, null, tL_availableReaction, 1);
                                    }
                                } else if (n0Var.f9098g != 0) {
                                    g5 g5Var = new g5(24, i13, n0Var.f9098g);
                                    l0Var.f9070f0 = g5Var;
                                    g5Var.a(view);
                                }
                            }
                        }
                        this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver4 = l0Var.f9068e0;
                            if (imageReceiver4 != null) {
                                imageReceiver4.A0(rectF2);
                                l0Var.f9068e0.setAlpha(interpolation);
                                l0Var.f9068e0.h(canvas, null);
                            } else {
                                g5 g5Var2 = l0Var.f9070f0;
                                if (g5Var2 != null) {
                                    g5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    l0Var.f9070f0.setAlpha((int) (interpolation * 255.0f));
                                    l0Var.f9070f0.draw(canvas);
                                }
                            }
                            klVar.invalidate();
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
        if (this.f9119j) {
            return (this.f9123n * f10) + ((1.0f - f10) * this.G);
        }
        return this.f9123n;
    }

    public final l0 k(n0 n0Var) {
        String l10;
        if (n0Var.f9093a) {
            l10 = "stars";
        } else {
            String str = n0Var.f9097f;
            if (str != null) {
                l10 = str;
            } else {
                l10 = Long.toString(n0Var.f9098g);
            }
        }
        return l(l10);
    }

    public final l0 l(String str) {
        return (l0) this.f9130u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            if ((!this.f9125p || !this.f9129t.isEmpty()) && lc.e(8200) && lc.e(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(int i3, int i10) {
        ArrayList arrayList;
        float f10;
        int L;
        float f11;
        int i11;
        this.f9122m = 0;
        this.f9124o = 0;
        this.f9120k = 0;
        this.f9123n = 0;
        if (this.f9125p) {
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
            arrayList = this.f9128s;
            if (i12 >= arrayList.size()) {
                break;
            }
            l0 l0Var = (l0) arrayList.get(i12);
            l0Var.getClass();
            g6 g6Var = l0Var.F;
            cq cqVar = l0Var.E;
            if (l0Var.R) {
                l0Var.f9088z = org.telegram.messenger.g0.L(42.0f);
                l0Var.A = org.telegram.messenger.g0.L(26.0f);
                if (l0Var.f9083t) {
                    l0Var.f9088z = (int) (g6Var.d + org.telegram.messenger.g0.L(8.0f) + l0Var.f9088z);
                } else if (cqVar != null && l0Var.v > 1) {
                    l0Var.f9088z = k5.C(8.0f, (int) Math.ceil(cqVar.f32806m), l0Var.f9088z);
                }
            } else {
                int L2 = org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f);
                if (l0Var.C != null) {
                    f11 = 6.0f;
                } else {
                    f11 = 4.0f;
                }
                l0Var.f9088z = org.telegram.messenger.g0.L(f11) + L2;
                if (l0Var.S != null && l0Var.T.size() > 0) {
                    l0Var.T.size();
                    if (l0Var.T.size() > 1) {
                        i11 = l0Var.T.size() - 1;
                    } else {
                        i11 = 0;
                    }
                    l0Var.f9088z = (int) ((org.telegram.messenger.g0.L(20.0f) * i11 * 0.8f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(1.0f) + l0Var.f9088z);
                    l0Var.S.f39959o = org.telegram.messenger.g0.L(26.0f);
                } else if (l0Var.f9083t) {
                    l0Var.f9088z = (int) (g6Var.d + org.telegram.messenger.g0.L(8.0f) + l0Var.f9088z);
                } else if (((int) Math.ceil(cqVar.f32806m)) > 0) {
                    l0Var.f9088z = k5.C(8.0f, (int) Math.ceil(cqVar.f32806m), l0Var.f9088z);
                } else {
                    l0Var.f9088z -= org.telegram.messenger.g0.L(1.0f);
                }
                l0Var.A = org.telegram.messenger.g0.L(26.0f);
            }
            if (l0Var.f9088z + i13 > i3) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = k5.C(4.0f, l0Var.A, i15);
                i16++;
                i13 = 0;
            }
            l0Var.f9085w = i13;
            l0Var.f9086x = i15;
            l0Var.f9087y = i16;
            i13 = k5.C(4.0f, l0Var.f9088z, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i10 == 5 && !arrayList.isEmpty()) {
            int i17 = ((l0) arrayList.get(0)).f9086x;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((l0) arrayList.get(i19)).f9086x != i17) {
                    int i20 = i19 - 1;
                    int i21 = i3 - (((l0) arrayList.get(i20)).f9085w + ((l0) arrayList.get(i20)).f9088z);
                    while (i18 < i19) {
                        ((l0) arrayList.get(i18)).f9085w += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i3 - (((l0) arrayList.get(size)).f9085w + ((l0) arrayList.get(size)).f9088z);
            while (i18 <= size) {
                ((l0) arrayList.get(i18)).f9085w += i22;
                i18++;
            }
        } else if (i10 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                l0 l0Var2 = (l0) arrayList.get(i23);
                int i24 = l0Var2.f9087y;
                if (i24 >= 0 && i24 < arrayList2.size()) {
                    f10 = ((Integer) arrayList2.get(l0Var2.f9087y)).intValue();
                } else {
                    f10 = 0.0f;
                }
                l0Var2.f9085w = (int) com.google.android.recaptcha.internal.a.z(i3, f10, 2.0f, l0Var2.f9085w);
            }
        }
        this.f9127r = i13;
        if (i10 != 5 && i10 != 1) {
            this.f9124o = i14;
        } else {
            this.f9124o = i3;
        }
        if (arrayList.size() == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(26.0f);
        }
        this.f9122m = i15 + L;
        this.f9112a = 0.0f;
    }

    public final void p() {
        int i3 = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.f9128s;
            if (i3 >= arrayList.size()) {
                break;
            }
            ((l0) arrayList.get(i3)).b();
            i3++;
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
        HashMap hashMap = this.f9130u;
        hashMap.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f9128s;
            if (i3 < arrayList.size()) {
                hashMap.put(((l0) arrayList.get(i3)).f9077n, (l0) arrayList.get(i3));
                i3++;
            } else {
                this.h = !this.f9125p;
                this.f9116f = this.f9113b;
                this.f9117g = this.f9114c;
                this.C = this.f9124o;
                this.F = this.f9123n;
                return;
            }
        }
    }

    public final void r(org.telegram.messenger.zi r21, boolean r22, org.telegram.ui.ActionBar.e6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: dh.o0.r(org.telegram.messenger.zi, boolean, org.telegram.ui.ActionBar.e6):void");
    }
}
