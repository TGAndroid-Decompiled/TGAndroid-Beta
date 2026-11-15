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
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.pz;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.v8;
import org.telegram.ui.ol;
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
    public c1.c R;
    public float f5194a;
    public int f5195b;
    public int f5196c;
    public float d;
    public float f5197e;
    public float f5198f;
    public float f5199g;
    public boolean h;
    public boolean f5200i;
    public boolean f5201j;
    public int f5202k;
    public int f5204m;
    public int f5205n;
    public int f5206o;
    public boolean f5207p;
    public final float f5208q;
    public int f5209r;
    public final org.telegram.ui.Cells.z f5213w;
    public gj f5214x;
    public e6 f5215y;
    public Integer f5216z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final m0 X = new Object();
    public static int Y = 1;
    public static final a3.c Z = new a3.c(13);
    public final ArrayList f5210s = new ArrayList();
    public final ArrayList f5211t = new ArrayList();
    public final HashMap f5212u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int f5203l = m10.f24940t0;

    public q0(org.telegram.ui.Cells.z zVar) {
        this.f5213w = zVar;
        n(this.f5215y);
        this.f5208q = ViewConfiguration.get(org.telegram.messenger.t0.f26609b).getScaledTouchSlop();
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
            return ((TLRPC.User) tLObject).f28200id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).f28051id;
        }
        return 0L;
    }

    public static void n(e6 e6Var) {
        S.setColor(j6.w0(j6.Ze, e6Var));
        int w02 = j6.w0(j6.Ji, e6Var);
        TextPaint textPaint = V;
        textPaint.setColor(w02);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        v8 v8Var;
        int i7;
        if (this.f5214x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.f5211t;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((n0) arrayList.get(i10)).b();
            i10++;
        }
        arrayList.clear();
        hashMap.putAll(this.f5212u);
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList2 = this.f5210s;
            if (i11 >= arrayList2.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList2.get(i11);
            String str = n0Var.f5159n;
            jq jqVar = n0Var.E;
            n0 n0Var2 = (n0) hashMap.get(str);
            if (n0Var2 != null) {
                hashMap.remove(n0Var.f5159n);
                int i12 = n0Var.f5167w;
                int i13 = n0Var2.f5167w;
                if (i12 == i13 && n0Var.f5168x == n0Var2.f5168x && n0Var.f5170z == n0Var2.f5170z && n0Var.v == n0Var2.v && n0Var.f5160o == n0Var2.f5160o && n0Var.S == null && n0Var2.S == null) {
                    n0Var.f5144b = 0;
                    i11++;
                } else {
                    n0Var.f5146c = i13;
                    n0Var.d = n0Var2.f5168x;
                    n0Var.f5149e = n0Var2.f5170z;
                    n0Var.h = n0Var2.M;
                    n0Var.f5151f = n0Var2.N;
                    n0Var.f5153g = n0Var2.O;
                    n0Var.f5144b = 3;
                    int i14 = n0Var.v;
                    int i15 = n0Var2.v;
                    if (i14 != i15 && jqVar != null) {
                        jqVar.c(i15, false);
                        jqVar.c(n0Var.v, true);
                    }
                    v8 v8Var2 = n0Var.S;
                    if (v8Var2 != null || n0Var2.S != null) {
                        if (v8Var2 == null) {
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
                        v8 v8Var3 = n0Var.S;
                        if (v8Var3 != null && (v8Var = n0Var2.S) != null) {
                            ValueAnimator valueAnimator = v8Var.f40327f;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                                if (v8Var3.f40342w) {
                                    v8Var3.f40342w = false;
                                    v8Var3.k();
                                }
                            }
                            TLObject[] tLObjectArr = new TLObject[3];
                            int i17 = 0;
                            while (true) {
                                i7 = this.f5203l;
                                if (i17 >= 3) {
                                    break;
                                }
                                tLObjectArr[i17] = v8Var3.f40324b[i17].h;
                                v8Var3.j(i17, i7, v8Var.f40324b[i17].h);
                                i17++;
                            }
                            v8Var3.a(false, true);
                            for (int i18 = 0; i18 < 3; i18++) {
                                v8Var3.j(i18, i7, tLObjectArr[i18]);
                            }
                            v8Var3.d = true;
                            v8Var3.a(true, false);
                        }
                    }
                }
            } else {
                n0Var.f5144b = 1;
            }
            z10 = true;
            i11++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                ((n0) arrayList.get(i19)).f5156k = ((n0) arrayList.get(i19)).f5158m;
                ((n0) arrayList.get(i19)).a();
            }
            z10 = true;
        }
        if (this.h) {
            float f10 = this.f5198f;
            if (f10 != this.f5195b || this.f5199g != this.f5196c) {
                this.f5200i = true;
                this.d = f10;
                this.f5197e = this.f5199g;
                z10 = true;
            }
        }
        if (this.C != this.f5206o) {
            z10 = true;
        }
        int i20 = this.F;
        if (i20 != this.f5205n) {
            this.f5201j = true;
            this.G = i20;
            return true;
        }
        return z10;
    }

    public final void b(p0 p0Var) {
        int i7 = 0;
        if (p0Var.f5192g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(p0Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.H0(this.f5213w);
                int i10 = W;
                W = i10 + 1;
                imageReceiver.f22307w1 = Integer.toString(i10);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(this.f5203l).f26505r.get(p0Var.f5191f);
                if (tL_availableReaction != null) {
                    imageReceiver.q0(gc.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.W(0);
                imageReceiver.P();
                hashMap.put(p0Var, imageReceiver);
                return;
            }
        }
        if (!this.J || p0Var.f5192g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.f5210s;
            if (i7 < arrayList.size()) {
                if (p0Var.f(((n0) arrayList.get(i7)).f5162q)) {
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
        if (this.f5207p || (gjVar = this.f5214x) == null || (message = gjVar.f23819k) == null || message.reactions == null) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Cells.z zVar = this.f5213w;
        if (e2.s(zVar)) {
            y10 -= zVar.getPaddingTop();
            if (zVar instanceof org.telegram.ui.Cells.t0) {
                x10 -= ((org.telegram.ui.Cells.t0) zVar).f31476k0 / 2.0f;
            }
        }
        float f10 = x10 - this.f5195b;
        float f11 = y10 - this.f5196c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.f5210s;
            int size = arrayList.size();
            while (true) {
                if (i7 >= size) {
                    break;
                } else if (f10 > ((n0) arrayList.get(i7)).f5167w && f10 < ((n0) arrayList.get(i7)).f5167w + ((n0) arrayList.get(i7)).f5170z && f11 > ((n0) arrayList.get(i7)).f5168x && f11 < ((n0) arrayList.get(i7)).f5168x + ((n0) arrayList.get(i7)).A) {
                    this.N = motionEvent.getX();
                    this.O = y10;
                    this.P = (n0) arrayList.get(i7);
                    c1.c cVar = this.R;
                    if (cVar != null) {
                        org.telegram.messenger.g0.r(cVar);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    c1.c cVar2 = new c1.c(7, this, this.P);
                    this.R = cVar2;
                    org.telegram.messenger.g0.i3(cVar2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z10 = this.Q;
            float f12 = this.f5208q;
            if ((z10 && Math.abs(motionEvent.getX() - this.N) > f12) || Math.abs(y10 - this.O) > f12) {
                this.Q = false;
                n0 n0Var = this.P;
                if (n0Var != null) {
                    n0Var.X.c(false);
                }
                this.P = null;
                c1.c cVar3 = this.R;
                if (cVar3 != null) {
                    org.telegram.messenger.g0.r(cVar3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            c1.c cVar4 = this.R;
            if (cVar4 != null) {
                org.telegram.messenger.g0.r(cVar4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                TLRPC.ReactionCount reactionCount = this.P.f5142a;
                float x11 = motionEvent.getX();
                if (e2.s(zVar)) {
                    ((p4) zVar).c(reactionCount, false, x11, y10);
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
        boolean z11 = this.f5207p;
        ArrayList arrayList = this.f5211t;
        if (!z11 || !arrayList.isEmpty()) {
            float f14 = this.f5195b;
            float f15 = this.f5196c;
            if (this.f5207p) {
                f14 = this.f5198f;
                f15 = this.f5199g;
            } else if (this.f5200i) {
                float f16 = 1.0f - f10;
                f14 = (f14 * f10) + (this.d * f16);
                f15 = (f15 * f10) + (this.f5197e * f16);
            }
            float f17 = f14;
            float f18 = f15;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f5210s;
                if (i10 >= arrayList2.size()) {
                    break;
                }
                n0 n0Var = (n0) arrayList2.get(i10);
                if (this.f5216z == null && num == null && this.A < 0.5f) {
                    n0Var.c();
                }
                if (!Integer.valueOf(n0Var.f5162q.hashCode()).equals(this.f5216z) && (num == null || n0Var.f5162q.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f19 = n0Var.f5167w;
                    float f20 = n0Var.f5168x;
                    int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                    if (i11 != 0 && n0Var.f5144b == 3) {
                        float f21 = 1.0f - f10;
                        f19 = (f19 * f10) + (n0Var.f5146c * f21);
                        f20 = (f20 * f10) + (n0Var.d * f21);
                    }
                    if (i11 != 0 && n0Var.f5144b == 1) {
                        float f22 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f22, f22, (n0Var.f5170z / 2.0f) + f17 + f19, (n0Var.A / 2.0f) + f18 + f20);
                        f11 = f10;
                    } else {
                        f11 = 1.0f;
                    }
                    float f23 = f19 + f17;
                    float f24 = f20 + f18;
                    if (n0Var.f5144b == 3) {
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
                canvas2.scale(f26, f26, (n0Var2.f5170z / 2.0f) + n0Var2.f5167w + f17, (n0Var2.A / 2.0f) + n0Var2.f5168x + f18);
                ((n0) arrayList.get(i7)).d(canvas2, n0Var2.f5167w + f17, n0Var2.f5168x + f18, 1.0f, f25, false, this.B, this.A);
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
        boolean z11 = this.f5207p;
        ArrayList arrayList = this.f5211t;
        if (!z11 || !arrayList.isEmpty()) {
            float f12 = this.f5195b;
            float f13 = this.f5196c;
            float f14 = 1.0f;
            if (this.f5207p) {
                f12 = this.f5198f;
                f13 = this.f5199g;
            } else if (this.f5200i) {
                float f15 = 1.0f - f10;
                f12 = (f12 * f10) + (this.d * f15);
                f13 = (f13 * f10) + (this.f5197e * f15);
            }
            int i7 = 0;
            boolean z12 = false;
            while (true) {
                ArrayList arrayList2 = this.f5210s;
                if (i7 >= arrayList2.size()) {
                    break;
                }
                n0 n0Var2 = (n0) arrayList2.get(i7);
                if (!n0Var2.f5157l) {
                    f11 = f14;
                } else {
                    canvas.save();
                    float f16 = n0Var2.f5167w;
                    float f17 = n0Var2.f5168x;
                    int i10 = (f10 > f14 ? 1 : (f10 == f14 ? 0 : -1));
                    if (i10 != 0) {
                        f11 = f14;
                        if (n0Var2.f5144b == 3) {
                            float f18 = f11 - f10;
                            f16 = (f16 * f10) + (n0Var2.f5146c * f18);
                            f17 = (f17 * f10) + (n0Var2.d * f18);
                        }
                    } else {
                        f11 = f14;
                    }
                    if (i10 != 0 && n0Var2.f5144b == 1) {
                        float f19 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f19, f19, (n0Var2.f5170z / 2.0f) + f12 + f16, (n0Var2.A / 2.0f) + f13 + f17);
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
                if (((n0) arrayList.get(i11)).f5157l) {
                    float f21 = ((f20 - f10) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f21, f21, (n0Var.f5170z / 2.0f) + n0Var.f5167w + f12, (n0Var.A / 2.0f) + n0Var.f5168x + f13);
                    if (!z12 && !((n0) arrayList.get(i11)).f(canvas, n0Var.f5167w + f12, n0Var.f5168x + f13)) {
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

    public final void f(ol olVar, Canvas canvas, int i7, Integer num) {
        int i10;
        if (!this.f5207p || !this.f5211t.isEmpty()) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f5210s;
                if (i11 < arrayList.size()) {
                    n0 n0Var = (n0) arrayList.get(i11);
                    if ((num == null || n0Var.f5162q.hashCode() == num.intValue()) && num != null) {
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(n0Var.f5164s);
                        float L = org.telegram.messenger.g0.L(140.0f);
                        float L2 = org.telegram.messenger.g0.L(14.0f);
                        org.telegram.ui.Cells.z zVar = this.f5213w;
                        if (zVar instanceof q1) {
                            i10 = ((q1) zVar).getParentWidth();
                        } else {
                            i10 = org.telegram.messenger.g0.f23611q.x;
                        }
                        float i12 = Utilities.i(rectF.left - org.telegram.messenger.g0.L(12.0f), (i10 - L) - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
                        float f10 = rectF.top - L2;
                        float f11 = i7;
                        float f12 = f10 + f11;
                        RectF rectF2 = this.L;
                        rectF2.set(i12, (f10 - L) + f11, L + i12, f12);
                        float interpolation = er.h.getInterpolation(this.A);
                        org.telegram.messenger.g0.Z1(rectF, rectF2, interpolation, rectF2);
                        int i13 = n0Var.U;
                        p0 p0Var = n0Var.f5163r;
                        View view = n0Var.V;
                        if (n0Var.f5150e0 == null && n0Var.f5152f0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (n0Var.f5162q != null && !p0Var.f5187a) {
                                if (p0Var.f5191f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(i13).f26505r.get(p0Var.f5191f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        pz f13 = t5.f(tL_availableReaction.static_icon, j6.f28792a7, 1.0f, null);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        n0Var.f5150e0 = imageReceiver;
                                        imageReceiver.E0(7);
                                        n0Var.f5150e0.P();
                                        n0Var.f5150e0.J0(org.telegram.messenger.g0.L(14.0f));
                                        ImageReceiver imageReceiver2 = n0Var.f5150e0;
                                        imageReceiver2.f22303v0 = true;
                                        imageReceiver2.f22301u0 = true;
                                        imageReceiver2.W(1);
                                        ImageReceiver imageReceiver3 = n0Var.f5150e0;
                                        imageReceiver3.f22309x0 = true;
                                        imageReceiver3.q0(gc.b(tL_availableReaction.activate_animation), "140_140", f13, null, tL_availableReaction, 1);
                                    }
                                } else if (p0Var.f5192g != 0) {
                                    g5 g5Var = new g5(24, i13, p0Var.f5192g);
                                    n0Var.f5152f0 = g5Var;
                                    g5Var.a(view);
                                }
                            }
                        }
                        this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver4 = n0Var.f5150e0;
                            if (imageReceiver4 != null) {
                                imageReceiver4.A0(rectF2);
                                n0Var.f5150e0.setAlpha(interpolation);
                                n0Var.f5150e0.h(canvas, null);
                            } else {
                                g5 g5Var2 = n0Var.f5152f0;
                                if (g5Var2 != null) {
                                    g5Var2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    n0Var.f5152f0.setAlpha((int) (interpolation * 255.0f));
                                    n0Var.f5152f0.draw(canvas);
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
        if (this.f5201j) {
            return (this.f5205n * f10) + ((1.0f - f10) * this.G);
        }
        return this.f5205n;
    }

    public final n0 k(p0 p0Var) {
        String l10;
        if (p0Var.f5187a) {
            l10 = "stars";
        } else {
            String str = p0Var.f5191f;
            if (str != null) {
                l10 = str;
            } else {
                l10 = Long.toString(p0Var.f5192g);
            }
        }
        return l(l10);
    }

    public final n0 l(String str) {
        return (n0) this.f5212u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            if ((!this.f5207p || !this.f5211t.isEmpty()) && qc.e(8200) && qc.e(131072)) {
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
        this.f5204m = 0;
        this.f5206o = 0;
        this.f5202k = 0;
        this.f5205n = 0;
        if (this.f5207p) {
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
            arrayList = this.f5210s;
            if (i12 >= arrayList.size()) {
                break;
            }
            n0 n0Var = (n0) arrayList.get(i12);
            n0Var.getClass();
            g6 g6Var = n0Var.F;
            jq jqVar = n0Var.E;
            if (n0Var.R) {
                n0Var.f5170z = org.telegram.messenger.g0.L(42.0f);
                n0Var.A = org.telegram.messenger.g0.L(26.0f);
                if (n0Var.f5165t) {
                    n0Var.f5170z = (int) (g6Var.d + org.telegram.messenger.g0.L(8.0f) + n0Var.f5170z);
                } else if (jqVar != null && n0Var.v > 1) {
                    n0Var.f5170z = k5.C(8.0f, (int) Math.ceil(jqVar.f36139m), n0Var.f5170z);
                }
            } else {
                int L2 = org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(8.0f);
                if (n0Var.C != null) {
                    f11 = 6.0f;
                } else {
                    f11 = 4.0f;
                }
                n0Var.f5170z = org.telegram.messenger.g0.L(f11) + L2;
                if (n0Var.S != null && n0Var.T.size() > 0) {
                    n0Var.T.size();
                    if (n0Var.T.size() > 1) {
                        i11 = n0Var.T.size() - 1;
                    } else {
                        i11 = 0;
                    }
                    n0Var.f5170z = (int) ((org.telegram.messenger.g0.L(20.0f) * i11 * 0.8f) + org.telegram.messenger.g0.L(20.0f) + org.telegram.messenger.g0.L(2.0f) + org.telegram.messenger.g0.L(1.0f) + n0Var.f5170z);
                    n0Var.S.f40335o = org.telegram.messenger.g0.L(26.0f);
                } else if (n0Var.f5165t) {
                    n0Var.f5170z = (int) (g6Var.d + org.telegram.messenger.g0.L(8.0f) + n0Var.f5170z);
                } else if (((int) Math.ceil(jqVar.f36139m)) > 0) {
                    n0Var.f5170z = k5.C(8.0f, (int) Math.ceil(jqVar.f36139m), n0Var.f5170z);
                } else {
                    n0Var.f5170z -= org.telegram.messenger.g0.L(1.0f);
                }
                n0Var.A = org.telegram.messenger.g0.L(26.0f);
            }
            if (n0Var.f5170z + i13 > i7) {
                arrayList2.add(Integer.valueOf(i13));
                i15 = k5.C(4.0f, n0Var.A, i15);
                i16++;
                i13 = 0;
            }
            n0Var.f5167w = i13;
            n0Var.f5168x = i15;
            n0Var.f5169y = i16;
            i13 = k5.C(4.0f, n0Var.f5170z, i13);
            if (i13 > i14) {
                i14 = i13;
            }
            i12++;
        }
        arrayList2.add(Integer.valueOf(i13));
        if (i10 == 5 && !arrayList.isEmpty()) {
            int i17 = ((n0) arrayList.get(0)).f5168x;
            int i18 = 0;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                if (((n0) arrayList.get(i19)).f5168x != i17) {
                    int i20 = i19 - 1;
                    int i21 = i7 - (((n0) arrayList.get(i20)).f5167w + ((n0) arrayList.get(i20)).f5170z);
                    while (i18 < i19) {
                        ((n0) arrayList.get(i18)).f5167w += i21;
                        i18++;
                    }
                    i18 = i19;
                }
            }
            int size = arrayList.size() - 1;
            int i22 = i7 - (((n0) arrayList.get(size)).f5167w + ((n0) arrayList.get(size)).f5170z);
            while (i18 <= size) {
                ((n0) arrayList.get(i18)).f5167w += i22;
                i18++;
            }
        } else if (i10 == 1 && !arrayList.isEmpty()) {
            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                n0 n0Var2 = (n0) arrayList.get(i23);
                int i24 = n0Var2.f5169y;
                if (i24 >= 0 && i24 < arrayList2.size()) {
                    f10 = ((Integer) arrayList2.get(n0Var2.f5169y)).intValue();
                } else {
                    f10 = 0.0f;
                }
                n0Var2.f5167w = (int) e2.A(i7, f10, 2.0f, n0Var2.f5167w);
            }
        }
        this.f5209r = i13;
        if (i10 != 5 && i10 != 1) {
            this.f5206o = i14;
        } else {
            this.f5206o = i7;
        }
        if (arrayList.size() == 0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(26.0f);
        }
        this.f5204m = i15 + L;
        this.f5194a = 0.0f;
    }

    public final void p() {
        int i7 = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.f5210s;
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
        HashMap hashMap = this.f5212u;
        hashMap.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f5210s;
            if (i7 < arrayList.size()) {
                hashMap.put(((n0) arrayList.get(i7)).f5159n, (n0) arrayList.get(i7));
                i7++;
            } else {
                this.h = !this.f5207p;
                this.f5198f = this.f5195b;
                this.f5199g = this.f5196c;
                this.C = this.f5206o;
                this.F = this.f5205n;
                return;
            }
        }
    }

    public final void r(org.telegram.messenger.gj r21, boolean r22, org.telegram.ui.ActionBar.e6 r23) {
        throw new UnsupportedOperationException("Method not decompiled: ch.q0.r(org.telegram.messenger.gj, boolean, org.telegram.ui.ActionBar.e6):void");
    }
}
