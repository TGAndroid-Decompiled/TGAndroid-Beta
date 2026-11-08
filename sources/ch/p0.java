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
import bi.a4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.rz;
import org.telegram.messenger.sc;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y8;
import org.telegram.ui.ol;
public final class p0 {
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
    public m0 P;
    public boolean Q;
    public a4 R;
    public float f6360a;
    public int f6361b;
    public int f6362c;
    public float d;
    public float f6363e;
    public float f6364f;
    public float f6365g;
    public boolean h;
    public boolean f6366i;
    public boolean f6367j;
    public int f6368k;
    public int f6370m;
    public int f6371n;
    public int f6372o;
    public boolean f6373p;
    public final float f6374q;
    public int f6375r;
    public final org.telegram.ui.Cells.z f6379w;
    public ij f6380x;
    public f6 f6381y;
    public Integer f6382z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final l0 X = new Object();
    public static int Y = 1;
    public static final a3.c Z = new a3.c(16);
    public final ArrayList f6376s = new ArrayList();
    public final ArrayList f6377t = new ArrayList();
    public final HashMap f6378u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int f6369l = p10.f24470s0;

    public p0(org.telegram.ui.Cells.z zVar) {
        this.f6379w = zVar;
        n(this.f6381y);
        this.f6374q = ViewConfiguration.get(t0.f25566b).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f27105id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f26956id;
        }
        return 0L;
    }

    public static void n(f6 f6Var) {
        S.setColor(k6.w0(k6.We, f6Var));
        int w02 = k6.w0(k6.Gi, f6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        y8 y8Var;
        int i7;
        if (this.f6380x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.f6377t;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i10)).b();
            i10++;
        }
        arrayList.clear();
        hashMap.putAll(this.f6378u);
        int i11 = 0;
        boolean z9 = false;
        while (true) {
            ArrayList arrayList2 = this.f6376s;
            if (i11 >= arrayList2.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList2.get(i11);
            String str = m0Var.f6326n;
            bq bqVar = m0Var.E;
            m0 m0Var2 = (m0) hashMap.get(str);
            if (m0Var2 != null) {
                hashMap.remove(m0Var.f6326n);
                int i12 = m0Var.f6334w;
                int i13 = m0Var2.f6334w;
                if (i12 == i13 && m0Var.f6335x == m0Var2.f6335x && m0Var.f6337z == m0Var2.f6337z && m0Var.v == m0Var2.v && m0Var.f6327o == m0Var2.f6327o && m0Var.S == null && m0Var2.S == null) {
                    m0Var.f6311b = 0;
                    i11++;
                } else {
                    m0Var.f6313c = i13;
                    m0Var.d = m0Var2.f6335x;
                    m0Var.f6316e = m0Var2.f6337z;
                    m0Var.h = m0Var2.M;
                    m0Var.f6318f = m0Var2.N;
                    m0Var.f6320g = m0Var2.O;
                    m0Var.f6311b = 3;
                    int i14 = m0Var.v;
                    int i15 = m0Var2.v;
                    if (i14 != i15 && bqVar != null) {
                        bqVar.c(i15, false);
                        bqVar.c(m0Var.v, true);
                    }
                    y8 y8Var2 = m0Var.S;
                    if (y8Var2 != null || m0Var2.S != null) {
                        if (y8Var2 == null) {
                            m0Var.o(new ArrayList());
                        }
                        if (m0Var2.S == null) {
                            m0Var2.o(new ArrayList());
                        }
                        ArrayList arrayList3 = m0Var2.T;
                        ArrayList arrayList4 = m0Var.T;
                        if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                                TLObject tLObject = (TLObject) arrayList3.get(i16);
                                TLObject tLObject2 = (TLObject) arrayList4.get(i16);
                                if (tLObject != null && tLObject2 != null && j(tLObject) == j(tLObject2)) {
                                }
                            }
                        }
                        y8 y8Var3 = m0Var.S;
                        if (y8Var3 != null && (y8Var = m0Var2.S) != null) {
                            ValueAnimator valueAnimator = y8Var.f40606f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (y8Var3.f40621w) {
                                    y8Var3.f40621w = false;
                                    y8Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i17 = 0;
                            while (true) {
                                i7 = this.f6369l;
                                if (i17 >= 3) {
                                    break;
                                }
                                tLObjectArr[i17] = y8Var3.f40603b[i17].h;
                                y8Var3.j(i17, i7, y8Var.f40603b[i17].h);
                                i17++;
                            }
                            y8Var3.a(false, true);
                            for (int i18 = 0; i18 < 3; i18++) {
                                y8Var3.j(i18, i7, tLObjectArr[i18]);
                            }
                            y8Var3.d = true;
                            y8Var3.a(true, false);
                        }
                    }
                }
            } else {
                m0Var.f6311b = 1;
            }
            z9 = true;
            i11++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                ((m0) arrayList.get(i19)).f6323k = ((m0) arrayList.get(i19)).f6325m;
                ((m0) arrayList.get(i19)).a();
            }
            z9 = true;
        }
        if (this.h) {
            float f10 = this.f6364f;
            if (f10 != this.f6361b || this.f6365g != this.f6362c) {
                this.f6366i = true;
                this.d = f10;
                this.f6363e = this.f6365g;
                z9 = true;
            }
        }
        if (this.C != this.f6372o) {
            z9 = true;
        }
        int i20 = this.F;
        if (i20 != this.f6371n) {
            this.f6367j = true;
            this.G = i20;
            return true;
        }
        return z9;
    }

    public final void b(o0 o0Var) {
        int i7 = 0;
        if (o0Var.f6357g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(o0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.f6379w);
                int i10 = W;
                W = i10 + 1;
                imageReceiver.f21225v1 = Integer.toString(i10);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.f6369l).f25836r.get(o0Var.f6356f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(hc.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(o0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || o0Var.f6357g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f6376s;
            if (i7 < arrayList.size()) {
                if (o0Var.f(((m0) arrayList.get(i7)).f6329q)) {
                    ((m0) arrayList.get(i7)).p();
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        ij ijVar;
        TLRPC.Message message;
        int i7 = 0;
        if (this.f6373p || (ijVar = this.f6380x) == null || (message = ijVar.f23262k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.f6379w;
        if (com.google.android.recaptcha.internal.a.u(zVar)) {
            y10 -= zVar.getPaddingTop();
            if (zVar instanceof org.telegram.ui.Cells.t0) {
                x10 -= ((org.telegram.ui.Cells.t0) zVar).f30323j0 / 2.0f;
            }
        }
        float f10 = x10 - this.f6361b;
        float f11 = y10 - this.f6362c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.f6376s;
            int size = arrayList.size();
            while (true) {
                if (i7 >= size) {
                    break;
                } else if (f10 > ((m0) arrayList.get(i7)).f6334w && f10 < ((m0) arrayList.get(i7)).f6334w + ((m0) arrayList.get(i7)).f6337z && f11 > ((m0) arrayList.get(i7)).f6335x && f11 < ((m0) arrayList.get(i7)).f6335x + ((m0) arrayList.get(i7)).A) {
                    this.N = motionEvent.getX();
                    this.O = y10;
                    this.P = (m0) arrayList.get(i7);
                    a4 a4Var = this.R;
                    if (a4Var != null) {
                        org.telegram.messenger.g0.r(a4Var);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    a4 a4Var2 = new a4(20, this, this.P);
                    this.R = a4Var2;
                    org.telegram.messenger.g0.i3(a4Var2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z9 = this.Q;
            float f12 = this.f6374q;
            if ((z9 && Math.abs(motionEvent.getX() - this.N) > f12) || Math.abs(y10 - this.O) > f12) {
                this.Q = false;
                m0 m0Var = this.P;
                if (m0Var != null) {
                    m0Var.X.c(false);
                }
                this.P = null;
                a4 a4Var3 = this.R;
                if (a4Var3 != null) {
                    org.telegram.messenger.g0.r(a4Var3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            a4 a4Var4 = this.R;
            if (a4Var4 != null) {
                org.telegram.messenger.g0.r(a4Var4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.f6309a;
                float x11 = motionEvent.getX();
                if (com.google.android.recaptcha.internal.a.u(zVar)) {
                    ((p4) zVar).e(reactionCount, false, x11, y10);
                }
            }
            this.Q = false;
            m0 m0Var2 = this.P;
            if (m0Var2 != null) {
                m0Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f10, Integer num) {
        float f11;
        float f12;
        float f13;
        boolean z9;
        Canvas canvas2 = canvas;
        boolean z10 = this.f6373p;
        ArrayList arrayList = this.f6377t;
        if (!z10 || !arrayList.isEmpty()) {
            float f14 = this.f6361b;
            float f15 = this.f6362c;
            if (this.f6373p) {
                f14 = this.f6364f;
                f15 = this.f6365g;
            } else if (this.f6366i) {
                float f16 = 1.0f - f10;
                f14 = (f14 * f10) + (this.d * f16);
                f15 = (f15 * f10) + (this.f6363e * f16);
            }
            float f17 = f14;
            float f18 = f15;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f6376s;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                m0 m0Var = (m0) arrayList2.get(i10);
                if (this.f6382z == null && num == null && this.A < 0.5f) {
                    m0Var.c();
                }
                if (!Integer.valueOf(m0Var.f6329q.hashCode()).equals(this.f6382z) && (num == null || m0Var.f6329q.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f19 = m0Var.f6334w;
                    float f20 = m0Var.f6335x;
                    int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i11 != 0 && m0Var.f6311b == 3) {
                        float f21 = 1.0f - f10;
                        f19 = (f19 * f10) + (m0Var.f6313c * f21);
                        f20 = (f20 * f10) + (m0Var.d * f21);
                    }
                    if (i11 != 0 && m0Var.f6311b == 1) {
                        float f22 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f22, f22, (m0Var.f6337z / 2.0f) + f17 + f19, (m0Var.A / 2.0f) + f18 + f20);
                        f11 = f10;
                    } else {
                        f11 = 1.0f;
                    }
                    float f23 = f19 + f17;
                    float f24 = f20 + f18;
                    if (m0Var.f6311b == 3) {
                        f12 = f11;
                        f13 = f10;
                    } else {
                        f12 = f11;
                        f13 = 1.0f;
                    }
                    if (num != null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    m0Var.d(canvas2, f23, f24, f13, f12, z9, this.B, this.A);
                    canvas2.restore();
                }
                i10++;
            }
            while (i7 < arrayList.size()) {
                m0 m0Var2 = (m0) arrayList.get(i7);
                float f25 = 1.0f - f10;
                float f26 = (f25 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f26, f26, (m0Var2.f6337z / 2.0f) + m0Var2.f6334w + f17, (m0Var2.A / 2.0f) + m0Var2.f6335x + f18);
                ((m0) arrayList.get(i7)).d(canvas2, m0Var2.f6334w + f17, m0Var2.f6335x + f18, 1.0f, f25, false, this.B, this.A);
                canvas.restore();
                i7++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f10) {
        m0 m0Var;
        boolean z9;
        float f11;
        boolean z10 = this.f6373p;
        ArrayList arrayList = this.f6377t;
        if (!z10 || !arrayList.isEmpty()) {
            float f12 = this.f6361b;
            float f13 = this.f6362c;
            float f14 = 1.0f;
            if (this.f6373p) {
                f12 = this.f6364f;
                f13 = this.f6365g;
            } else if (this.f6366i) {
                float f15 = 1.0f - f10;
                f12 = (f12 * f10) + (this.d * f15);
                f13 = (f13 * f10) + (this.f6363e * f15);
            }
            int i7 = 0;
            boolean z11 = false;
            while (true) {
                ArrayList arrayList2 = this.f6376s;
                if (i7 >= arrayList2.size()) {
                    break;
                }
                m0 m0Var2 = (m0) arrayList2.get(i7);
                if (!m0Var2.f6324l) {
                    f11 = f14;
                } else {
                    canvas.save();
                    float f16 = m0Var2.f6334w;
                    float f17 = m0Var2.f6335x;
                    int i10 = (f10 > f14 ? 1 : (f10 == f14 ? 0 : -1));
                    if (i10 != 0) {
                        f11 = f14;
                        if (m0Var2.f6311b == 3) {
                            float f18 = f11 - f10;
                            f16 = (f16 * f10) + (m0Var2.f6313c * f18);
                            f17 = (f17 * f10) + (m0Var2.d * f18);
                        }
                    } else {
                        f11 = f14;
                    }
                    if (i10 != 0 && m0Var2.f6311b == 1) {
                        float f19 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f19, f19, (m0Var2.f6337z / 2.0f) + f12 + f16, (m0Var2.A / 2.0f) + f13 + f17);
                    }
                    if (!z11 && !m0Var2.f(canvas, f16 + f12, f17 + f13)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    canvas.restore();
                }
                i7++;
                f14 = f11;
            }
            float f20 = f14;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((m0) arrayList.get(i11)).f6324l) {
                    float f21 = ((f20 - f10) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f21, f21, (m0Var.f6337z / 2.0f) + m0Var.f6334w + f12, (m0Var.A / 2.0f) + m0Var.f6335x + f13);
                    if (!z11 && !((m0) arrayList.get(i11)).f(canvas, m0Var.f6334w + f12, m0Var.f6335x + f13)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    canvas.restore();
                    z11 = z9;
                }
            }
        }
    }

    public final void f(ol olVar, Canvas canvas, int i7, Integer num) {
        int i10;
        if (!this.f6373p || !this.f6377t.isEmpty()) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f6376s;
                if (i11 < arrayList.size()) {
                    m0 m0Var = (m0) arrayList.get(i11);
                    if ((num == null || m0Var.f6329q.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(m0Var.f6331s);
                        float L = org.telegram.messenger.g0.L(140.0f);
                        float L2 = org.telegram.messenger.g0.L(14.0f);
                        org.telegram.ui.Cells.z zVar = this.f6379w;
                        if (zVar instanceof q1) {
                            i10 = ((q1) zVar).getParentWidth();
                        } else {
                            i10 = org.telegram.messenger.g0.f22563q.x;
                        }
                        float i12 = Utilities.i(rectF.left - org.telegram.messenger.g0.L(12.0f), (i10 - L) - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                        float f10 = rectF.top - L2;
                        float f11 = i7;
                        float f12 = f10 + f11;
                        RectF rectF2 = this.L;
                        rectF2.set(i12, (f10 - L) + f11, L + i12, f12);
                        float interpolation = xq.h.getInterpolation(this.A);
                        org.telegram.messenger.g0.Z1(rectF, rectF2, interpolation, rectF2);
                        int i13 = m0Var.U;
                        o0 o0Var = m0Var.f6330r;
                        View view = m0Var.V;
                        if (m0Var.f6317e0 == null && m0Var.f6319f0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (m0Var.f6329q != null && !o0Var.f6352a) {
                                if (o0Var.f6356f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(i13).f25836r.get(o0Var.f6356f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        rz f13 = t5.f(tL_availableReaction.static_icon, k6.f27796a7, 1.0f, null);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        m0Var.f6317e0 = imageReceiver;
                                        imageReceiver.E0(7);
                                        m0Var.f6317e0.P();
                                        m0Var.f6317e0.J0(org.telegram.messenger.g0.L(14.0f));
                                        ImageReceiver imageReceiver2 = m0Var.f6317e0;
                                        imageReceiver2.f21222u0 = true;
                                        imageReceiver2.f21220t0 = true;
                                        imageReceiver2.W(1);
                                        ImageReceiver imageReceiver3 = m0Var.f6317e0;
                                        imageReceiver3.f21227w0 = true;
                                        imageReceiver3.q0(hc.b(tL_availableReaction.activate_animation), "140_140", f13, null, tL_availableReaction, 1);
                                    }
                                } else if (o0Var.f6357g != 0) {
                                    i5 i5Var = new i5(24, i13, o0Var.f6357g);
                                    m0Var.f6319f0 = i5Var;
                                    i5Var.a(view);
                                }
                            }
                        }
                        this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver4 = m0Var.f6317e0;
                            if (imageReceiver4 != null) {
                                imageReceiver4.A0(rectF2);
                                m0Var.f6317e0.setAlpha(interpolation);
                                m0Var.f6317e0.h(canvas, null);
                            } else {
                                i5 i5Var2 = m0Var.f6319f0;
                                if (i5Var2 != null) {
                                    i5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    m0Var.f6319f0.setAlpha((int) (interpolation * 255.0f));
                                    m0Var.f6319f0.draw(canvas);
                                }
                            }
                            olVar.invalidate();
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
        if (this.f6367j) {
            return (this.f6371n * f10) + ((1.0f - f10) * this.G);
        }
        return this.f6371n;
    }

    public final m0 k(o0 o0Var) {
        String l10;
        if (o0Var.f6352a) {
            l10 = "stars";
        } else {
            String str = o0Var.f6356f;
            if (str != null) {
                l10 = str;
            } else {
                l10 = Long.toString(o0Var.f6357g);
            }
        }
        return l(l10);
    }

    public final m0 l(String str) {
        return (m0) this.f6378u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            if ((!this.f6373p || !this.f6377t.isEmpty()) && sc.e(8200) && sc.e(131072)) {
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
        this.f6370m = 0;
        this.f6372o = 0;
        this.f6368k = 0;
        this.f6371n = 0;
        if (this.f6373p) {
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
            arrayList = this.f6376s;
            if (i12 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i12);
            m0Var.getClass();
            i6 i6Var = m0Var.F;
            bq bqVar = m0Var.E;
            if (m0Var.R) {
                m0Var.f6337z = org.telegram.messenger.g0.L(42.0f);
                m0Var.A = org.telegram.messenger.g0.L(26.0f);
                if (m0Var.f6332t) {
                    m0Var.f6337z = (int) (i6Var.d + org.telegram.messenger.g0.L(8.0f) + m0Var.f6337z);
                } else if (bqVar != null && m0Var.v > 1) {
                    m0Var.f6337z = k5.C(8.0f, (int) Math.ceil(bqVar.f32315m), m0Var.f6337z);
                }
            } else {
                int L2 = org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f);
                if (m0Var.C != null) {
                    f11 = 6.0f;
                } else {
                    f11 = 4.0f;
                }
                m0Var.f6337z = org.telegram.messenger.g0.L(f11) + L2;
                if (m0Var.S != null && m0Var.T.size() > 0) {
                    m0Var.T.size();
                    if (m0Var.T.size() > 1) {
                        i11 = m0Var.T.size() - 1;
                    } else {
                        i11 = 0;
                    }
                    m0Var.f6337z = (int) ((org.telegram.messenger.g0.L(20.0f) * i11 * 0.8f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(1.0f) + m0Var.f6337z);
                    m0Var.S.f40614o = org.telegram.messenger.g0.L(26.0f);
                } else if (m0Var.f6332t) {
                    m0Var.f6337z = (int) (i6Var.d + org.telegram.messenger.g0.L(8.0f) + m0Var.f6337z);
                } else if (((int) Math.ceil(bqVar.f32315m)) > 0) {
                    m0Var.f6337z = k5.C(8.0f, (int) Math.ceil(bqVar.f32315m), m0Var.f6337z);
                } else {
                    m0Var.f6337z -= org.telegram.messenger.g0.L(1.0f);
                }
                m0Var.A = org.telegram.messenger.g0.L(26.0f);
            }
            if (m0Var.f6337z + i13 > i7) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = k5.C(4.0f, m0Var.A, i15);
                i16++;
                i13 = 0;
            }
            m0Var.f6334w = i13;
            m0Var.f6335x = i15;
            m0Var.f6336y = i16;
            i13 = k5.C(4.0f, m0Var.f6337z, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i10 == 5 && !arrayList.isEmpty()) {
            int i17 = ((m0) arrayList.get(0)).f6335x;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((m0) arrayList.get(i19)).f6335x != i17) {
                    int i20 = i19 - 1;
                    int i21 = i7 - (((m0) arrayList.get(i20)).f6334w + ((m0) arrayList.get(i20)).f6337z);
                    while (i18 < i19) {
                        ((m0) arrayList.get(i18)).f6334w += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i7 - (((m0) arrayList.get(size)).f6334w + ((m0) arrayList.get(size)).f6337z);
            while (i18 <= size) {
                ((m0) arrayList.get(i18)).f6334w += i22;
                i18++;
            }
        } else if (i10 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                m0 m0Var2 = (m0) arrayList.get(i23);
                int i24 = m0Var2.f6336y;
                if (i24 >= 0 && i24 < arrayList2.size()) {
                    f10 = ((Integer) arrayList2.get(m0Var2.f6336y)).intValue();
                } else {
                    f10 = 0.0f;
                }
                m0Var2.f6334w = (int) com.google.android.recaptcha.internal.a.A(i7, f10, 2.0f, m0Var2.f6334w);
            }
        }
        this.f6375r = i13;
        if (i10 != 5 && i10 != 1) {
            this.f6372o = i14;
        } else {
            this.f6372o = i7;
        }
        if (arrayList.size() == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(26.0f);
        }
        this.f6370m = i15 + L;
        this.f6360a = 0.0f;
    }

    public final void p() {
        int i7 = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.f6376s;
            if (i7 >= arrayList.size()) {
                break;
            }
            ((m0) arrayList.get(i7)).b();
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
        HashMap hashMap = this.f6378u;
        hashMap.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f6376s;
            if (i7 < arrayList.size()) {
                hashMap.put(((m0) arrayList.get(i7)).f6326n, (m0) arrayList.get(i7));
                i7++;
            } else {
                this.h = !this.f6373p;
                this.f6364f = this.f6361b;
                this.f6365g = this.f6362c;
                this.C = this.f6372o;
                this.F = this.f6371n;
                return;
            }
        }
    }

    public final void r(org.telegram.messenger.ij r21, boolean r22, org.telegram.ui.ActionBar.f6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: ch.p0.r(org.telegram.messenger.ij, boolean, org.telegram.ui.ActionBar.f6):void");
    }
}
