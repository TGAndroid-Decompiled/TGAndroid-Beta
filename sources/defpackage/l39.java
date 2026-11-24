package defpackage;

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
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l39 {
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
    public i39 P;
    public boolean Q;
    public ey8 R;
    public float a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public final float q;
    public int r;
    public final hg0 w;
    public k47 x;
    public ylb y;
    public Integer z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final h39 X = new Object();
    public static int Y = 1;
    public static final qx7 Z = new qx7((byte) 11);
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int l = z8c.t0;

    public l39(hg0 hg0Var) {
        this.w = hg0Var;
        n(this.y);
        this.q = ViewConfiguration.get(a.b).getScaledTouchSlop();
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
        float f;
        path.rewind();
        float f2 = rectF.left;
        rectF2.set(f2, rectF.top, gm.L(12.0f) + f2, rectF.top + gm.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - gm.L(12.0f), rectF.left + gm.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > gm.L(26.0f)) {
            f = 1.4f;
        } else {
            f = 0.0f;
        }
        float N = rectF.right - gm.N(9.09f);
        float N2 = N - gm.N(0.056f);
        float N3 = gm.N(1.22f) + N;
        float N4 = gm.N(3.07f) + N;
        float N5 = gm.N(2.406f) + N;
        float N6 = gm.N(8.27f + f) + N;
        float N7 = gm.N(8.923f + f) + N;
        float N8 = gm.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - gm.N(1.753f);
        float N10 = gm.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - gm.N(0.663f);
        float f3 = 10.263f + f;
        float N12 = gm.N(f3) + rectF.top;
        float N13 = rectF.bottom - gm.N(f3);
        float f4 = f + 11.333f;
        float N14 = gm.N(f4) + rectF.top;
        float N15 = rectF.bottom - gm.N(f4);
        path.lineTo(N2, rectF.bottom);
        path.cubicTo(N3, rectF.bottom, N5, N11, N4, N9);
        path.lineTo(N6, N13);
        path.cubicTo(N7, N15, N7, N14, N6, N12);
        path.lineTo(N4, N8);
        float f5 = rectF.top;
        path.cubicTo(N5, N10, N3, f5, N2, f5);
        path.close();
    }

    public static long j(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return ((TLRPC.User) tLObject).id;
        }
        if (tLObject instanceof TLRPC.Chat) {
            return ((TLRPC.Chat) tLObject).id;
        }
        return 0L;
    }

    public static void n(ylb ylbVar) {
        S.setColor(cmb.v0(cmb.Ye, ylbVar));
        int v0 = cmb.v0(cmb.Ii, ylbVar);
        TextPaint textPaint = V;
        textPaint.setColor(v0);
        hg9.o(textPaint, gm.L(12.0f));
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        gd0 gd0Var;
        int i;
        if (this.x == null) {
            return false;
        }
        HashMap hashMap = this.v;
        hashMap.clear();
        int i2 = 0;
        while (true) {
            arrayList = this.t;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((i39) arrayList.get(i2)).b();
            i2++;
        }
        arrayList.clear();
        hashMap.putAll(this.u);
        int i3 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList2 = this.s;
            if (i3 >= arrayList2.size()) {
                break;
            }
            i39 i39Var = (i39) arrayList2.get(i3);
            String str = i39Var.n;
            ty2 ty2Var = i39Var.E;
            i39 i39Var2 = (i39) hashMap.get(str);
            if (i39Var2 != null) {
                hashMap.remove(i39Var.n);
                int i4 = i39Var.w;
                int i5 = i39Var2.w;
                if (i4 == i5 && i39Var.x == i39Var2.x && i39Var.z == i39Var2.z && i39Var.v == i39Var2.v && i39Var.o == i39Var2.o && i39Var.S == null && i39Var2.S == null) {
                    i39Var.b = (byte) 0;
                    i3++;
                } else {
                    i39Var.c = i5;
                    i39Var.d = i39Var2.x;
                    i39Var.e = i39Var2.z;
                    i39Var.h = i39Var2.M;
                    i39Var.f = i39Var2.N;
                    i39Var.g = i39Var2.O;
                    i39Var.b = (byte) 3;
                    int i6 = i39Var.v;
                    int i7 = i39Var2.v;
                    if (i6 != i7 && ty2Var != null) {
                        ty2Var.c(i7, false);
                        ty2Var.c(i39Var.v, true);
                    }
                    if (i39Var.S == null) {
                        if (i39Var2.S != null) {
                            i39Var.o(new ArrayList());
                        }
                    }
                    if (i39Var2.S == null) {
                        i39Var2.o(new ArrayList());
                    }
                    ArrayList arrayList3 = i39Var2.T;
                    ArrayList arrayList4 = i39Var.T;
                    if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                            TLObject tLObject = (TLObject) arrayList3.get(i8);
                            TLObject tLObject2 = (TLObject) arrayList4.get(i8);
                            if (tLObject != null && tLObject2 != null && j(tLObject) == j(tLObject2)) {
                            }
                        }
                    }
                    gd0 gd0Var2 = i39Var.S;
                    if (gd0Var2 != null && (gd0Var = i39Var2.S) != null) {
                        ValueAnimator valueAnimator = gd0Var.f;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (gd0Var2.w) {
                                gd0Var2.w = false;
                                gd0Var2.k();
                            }
                        }
                        TLObject[] tLObjectArr = new TLObject[3];
                        int i9 = 0;
                        while (true) {
                            i = this.l;
                            if (i9 >= 3) {
                                break;
                            }
                            tLObjectArr[i9] = gd0Var2.b[i9].h;
                            gd0Var2.j(i9, i, gd0Var.b[i9].h);
                            i9++;
                        }
                        gd0Var2.a(false, true);
                        for (int i10 = 0; i10 < 3; i10++) {
                            gd0Var2.j(i10, i, tLObjectArr[i10]);
                        }
                        gd0Var2.d = true;
                        gd0Var2.a(true, false);
                    }
                }
            } else {
                i39Var.b = (byte) 1;
            }
            z = true;
            i3++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((i39) arrayList.get(i11)).k = ((i39) arrayList.get(i11)).m;
                ((i39) arrayList.get(i11)).a();
            }
            z = true;
        }
        if (this.h) {
            float f = this.f;
            if (f != this.b || this.g != this.c) {
                this.i = true;
                this.d = f;
                this.e = this.g;
                z = true;
            }
        }
        if (this.C != this.o) {
            z = true;
        }
        int i12 = this.F;
        if (i12 != this.n) {
            this.j = true;
            this.G = i12;
            return true;
        }
        return z;
    }

    public final void b(k39 k39Var) {
        int i = 0;
        if (k39Var.g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(k39Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.p0(this.w);
                int i2 = W;
                W = i2 + 1;
                imageReceiver.w1 = Integer.toString(i2);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(this.l).r.get(k39Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.d0(gn5.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.M(0);
                imageReceiver.I();
                hashMap.put(k39Var, imageReceiver);
                return;
            }
        }
        if (!this.J || k39Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.s;
            if (i < arrayList.size()) {
                if (k39Var.f(((i39) arrayList.get(i)).q)) {
                    ((i39) arrayList.get(i)).p();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        k47 k47Var;
        TLRPC.Message message;
        int i = 0;
        if (this.p || (k47Var = this.x) == null || (message = k47Var.k) == null || message.reactions == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        hg0 hg0Var = this.w;
        float paddingTop = y - hg0Var.getPaddingTop();
        if (hg0Var instanceof cm1) {
            x -= ((cm1) hg0Var).k0 / 2.0f;
        }
        float f = x - this.b;
        float f2 = paddingTop - this.c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (f > ((i39) arrayList.get(i)).w && f < ((i39) arrayList.get(i)).w + ((i39) arrayList.get(i)).z && f2 > ((i39) arrayList.get(i)).x && f2 < ((i39) arrayList.get(i)).x + ((i39) arrayList.get(i)).A) {
                    this.N = motionEvent.getX();
                    this.O = paddingTop;
                    this.P = (i39) arrayList.get(i);
                    ey8 ey8Var = this.R;
                    if (ey8Var != null) {
                        gm.r(ey8Var);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    ey8 ey8Var2 = new ey8(this, this.P, (byte) 10);
                    this.R = ey8Var2;
                    gm.d3(ey8Var2, ViewConfiguration.getLongPressTimeout());
                    this.Q = true;
                } else {
                    i++;
                }
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z = this.Q;
            float f3 = this.q;
            if ((z && Math.abs(motionEvent.getX() - this.N) > f3) || Math.abs(paddingTop - this.O) > f3) {
                this.Q = false;
                i39 i39Var = this.P;
                if (i39Var != null) {
                    i39Var.X.c(false);
                }
                this.P = null;
                ey8 ey8Var3 = this.R;
                if (ey8Var3 != null) {
                    gm.r(ey8Var3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            ey8 ey8Var4 = this.R;
            if (ey8Var4 != null) {
                gm.r(ey8Var4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                ((mk5) hg0Var).c(this.P.a, false, motionEvent.getX(), paddingTop);
            }
            this.Q = false;
            i39 i39Var2 = this.P;
            if (i39Var2 != null) {
                i39Var2.X.c(false);
            }
            this.P = null;
        }
        return this.Q;
    }

    public final void d(Canvas canvas, float f, Integer num) {
        float f2;
        float f3;
        float f4;
        boolean z;
        Canvas canvas2 = canvas;
        boolean z2 = this.p;
        ArrayList arrayList = this.t;
        if (!z2 || !arrayList.isEmpty()) {
            float f5 = this.b;
            float f6 = this.c;
            if (this.p) {
                f5 = this.f;
                f6 = this.g;
            } else if (this.i) {
                float f7 = 1.0f - f;
                f5 = (f5 * f) + (this.d * f7);
                f6 = (f6 * f) + (this.e * f7);
            }
            float f8 = f5;
            float f9 = f6;
            int i = 0;
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.s;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                i39 i39Var = (i39) arrayList2.get(i2);
                if (this.z == null && num == null && this.A < 0.5f) {
                    i39Var.c();
                }
                if (!Integer.valueOf(i39Var.q.hashCode()).equals(this.z) && (num == null || i39Var.q.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f10 = i39Var.w;
                    float f11 = i39Var.x;
                    int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                    if (i3 != 0 && i39Var.b == 3) {
                        float f12 = 1.0f - f;
                        f10 = (f10 * f) + (i39Var.c * f12);
                        f11 = (f11 * f) + (i39Var.d * f12);
                    }
                    if (i3 != 0 && i39Var.b == 1) {
                        float f13 = (f * 0.5f) + 0.5f;
                        canvas2.scale(f13, f13, (i39Var.z / 2.0f) + f8 + f10, (i39Var.A / 2.0f) + f9 + f11);
                        f2 = f;
                    } else {
                        f2 = 1.0f;
                    }
                    float f14 = f10 + f8;
                    float f15 = f11 + f9;
                    if (i39Var.b == 3) {
                        f3 = f2;
                        f4 = f;
                    } else {
                        f3 = f2;
                        f4 = 1.0f;
                    }
                    if (num != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i39Var.d(canvas2, f14, f15, f4, f3, z, this.B, this.A);
                    canvas2.restore();
                }
                i2++;
            }
            while (i < arrayList.size()) {
                i39 i39Var2 = (i39) arrayList.get(i);
                float f16 = 1.0f - f;
                float f17 = (f16 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f17, f17, (i39Var2.z / 2.0f) + i39Var2.w + f8, (i39Var2.A / 2.0f) + i39Var2.x + f9);
                ((i39) arrayList.get(i)).d(canvas2, i39Var2.w + f8, i39Var2.x + f9, 1.0f, f16, false, this.B, this.A);
                canvas.restore();
                i++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f) {
        i39 i39Var;
        boolean z;
        float f2;
        boolean z2 = this.p;
        ArrayList arrayList = this.t;
        if (!z2 || !arrayList.isEmpty()) {
            float f3 = this.b;
            float f4 = this.c;
            float f5 = 1.0f;
            if (this.p) {
                f3 = this.f;
                f4 = this.g;
            } else if (this.i) {
                float f6 = 1.0f - f;
                f3 = (f3 * f) + (this.d * f6);
                f4 = (f4 * f) + (this.e * f6);
            }
            int i = 0;
            boolean z3 = false;
            while (true) {
                ArrayList arrayList2 = this.s;
                if (i >= arrayList2.size()) {
                    break;
                }
                i39 i39Var2 = (i39) arrayList2.get(i);
                if (!i39Var2.l) {
                    f2 = f5;
                } else {
                    canvas.save();
                    float f7 = i39Var2.w;
                    float f8 = i39Var2.x;
                    int i2 = (f > f5 ? 1 : (f == f5 ? 0 : -1));
                    if (i2 != 0) {
                        f2 = f5;
                        if (i39Var2.b == 3) {
                            float f9 = f2 - f;
                            f7 = (f7 * f) + (i39Var2.c * f9);
                            f8 = (f8 * f) + (i39Var2.d * f9);
                        }
                    } else {
                        f2 = f5;
                    }
                    if (i2 != 0 && i39Var2.b == 1) {
                        float f10 = (f * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, (i39Var2.z / 2.0f) + f3 + f7, (i39Var2.A / 2.0f) + f4 + f8);
                    }
                    if (!z3 && !i39Var2.f(canvas, f7 + f3, f8 + f4)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    canvas.restore();
                }
                i++;
                f5 = f2;
            }
            float f11 = f5;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (((i39) arrayList.get(i3)).l) {
                    float f12 = ((f11 - f) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f12, f12, (i39Var.z / 2.0f) + i39Var.w + f3, (i39Var.A / 2.0f) + i39Var.x + f4);
                    if (!z3 && !((i39) arrayList.get(i3)).f(canvas, i39Var.w + f3, i39Var.x + f4)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    canvas.restore();
                    z3 = z;
                }
            }
        }
    }

    public final void f(mu1 mu1Var, Canvas canvas, int i, Integer num) {
        int i2;
        if (!this.p || !this.t.isEmpty()) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.s;
                if (i3 < arrayList.size()) {
                    i39 i39Var = (i39) arrayList.get(i3);
                    if (num != null && i39Var.q.hashCode() == num.intValue()) {
                        RectF rectF = gm.P;
                        rectF.set(i39Var.s);
                        float L = gm.L(140.0f);
                        float L2 = gm.L(14.0f);
                        hg0 hg0Var = this.w;
                        if (hg0Var instanceof rc2) {
                            i2 = ((rc2) hg0Var).getParentWidth();
                        } else {
                            i2 = gm.q.x;
                        }
                        float i4 = Utilities.i(rectF.left - gm.L(12.0f), (i2 - L) - gm.L(24.0f), gm.L(24.0f));
                        float f = rectF.top - L2;
                        float f2 = i;
                        float f3 = f + f2;
                        RectF rectF2 = this.L;
                        rectF2.set(i4, (f - L) + f2, L + i4, f3);
                        float interpolation = d53.h.getInterpolation(this.A);
                        gm.X1(rectF, rectF2, interpolation, rectF2);
                        int i5 = i39Var.U;
                        k39 k39Var = i39Var.r;
                        View view = i39Var.V;
                        if (i39Var.e0 == null && i39Var.f0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (i39Var.q != null && !k39Var.a) {
                                if (k39Var.f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i5).r.get(k39Var.f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        meb f4 = eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        i39Var.e0 = imageReceiver;
                                        imageReceiver.m0(7);
                                        i39Var.e0.I();
                                        i39Var.e0.q0(gm.L(14.0f));
                                        ImageReceiver imageReceiver2 = i39Var.e0;
                                        imageReceiver2.v0 = true;
                                        imageReceiver2.u0 = true;
                                        imageReceiver2.M(1);
                                        ImageReceiver imageReceiver3 = i39Var.e0;
                                        imageReceiver3.x0 = true;
                                        imageReceiver3.d0(gn5.b(tL_availableReaction.activate_animation), "140_140", f4, null, tL_availableReaction, 1);
                                    }
                                } else if (k39Var.g != 0) {
                                    vm vmVar = new vm(24, i5, k39Var.g);
                                    i39Var.f0 = vmVar;
                                    vmVar.b(view);
                                }
                            }
                        }
                        this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver4 = i39Var.e0;
                            if (imageReceiver4 != null) {
                                imageReceiver4.k0(rectF2);
                                i39Var.e0.setAlpha(interpolation);
                                i39Var.e0.h(canvas, null);
                            } else {
                                vm vmVar2 = i39Var.f0;
                                if (vmVar2 != null) {
                                    vmVar2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    i39Var.f0.setAlpha((int) (interpolation * 255.0f));
                                    i39Var.f0.draw(canvas);
                                }
                            }
                            mu1Var.invalidate();
                        }
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final float i(float f) {
        if (this.j) {
            float f2 = 1.0f - f;
            return (this.n * f) + (f2 * this.G);
        }
        return this.n;
    }

    public final i39 k(k39 k39Var) {
        String l;
        if (k39Var.a) {
            l = "stars";
        } else {
            String str = k39Var.f;
            if (str != null) {
                l = str;
            } else {
                l = Long.toString(k39Var.g);
            }
        }
        return l(l);
    }

    public final i39 l(String str) {
        return (i39) this.u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            if ((!this.p || !this.t.isEmpty()) && e86.e(8200) && e86.e(131072)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o(int i, int i2) {
        ArrayList arrayList;
        float f;
        int L;
        float f2;
        int i3;
        this.m = 0;
        this.o = 0;
        this.k = 0;
        this.n = 0;
        if (this.p) {
            return;
        }
        ArrayList arrayList2 = this.K;
        arrayList2.clear();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            arrayList = this.s;
            if (i4 >= arrayList.size()) {
                break;
            }
            i39 i39Var = (i39) arrayList.get(i4);
            i39Var.getClass();
            ho hoVar = i39Var.F;
            ty2 ty2Var = i39Var.E;
            if (i39Var.R) {
                i39Var.z = gm.L(42.0f);
                i39Var.A = gm.L(26.0f);
                if (i39Var.t) {
                    i39Var.z = (int) (hoVar.d + gm.L(8.0f) + i39Var.z);
                } else if (ty2Var != null && i39Var.v > 1) {
                    i39Var.z = hg9.v(8.0f, (int) Math.ceil(ty2Var.m), i39Var.z);
                }
            } else {
                int L2 = gm.L(20.0f) + gm.L(8.0f);
                if (i39Var.C != null) {
                    f2 = 6.0f;
                } else {
                    f2 = 4.0f;
                }
                i39Var.z = gm.L(f2) + L2;
                if (i39Var.S != null && i39Var.T.size() > 0) {
                    i39Var.T.size();
                    if (i39Var.T.size() > 1) {
                        i3 = i39Var.T.size() - 1;
                    } else {
                        i3 = 0;
                    }
                    i39Var.z = (int) ((gm.L(20.0f) * i3 * 0.8f) + gm.L(20.0f) + gm.L(2.0f) + gm.L(1.0f) + i39Var.z);
                    i39Var.S.o = gm.L(26.0f);
                } else if (i39Var.t) {
                    i39Var.z = (int) (hoVar.d + gm.L(8.0f) + i39Var.z);
                } else {
                    int ceil = (int) Math.ceil(ty2Var.m);
                    int i9 = i39Var.z;
                    if (ceil > 0) {
                        i39Var.z = hg9.v(8.0f, (int) Math.ceil(ty2Var.m), i9);
                    } else {
                        i39Var.z = i9 - gm.L(1.0f);
                    }
                }
                i39Var.A = gm.L(26.0f);
            }
            if (i39Var.z + i5 > i) {
                arrayList2.add(Integer.valueOf(i5));
                i7 = hg9.v(4.0f, i39Var.A, i7);
                i8++;
                i5 = 0;
            }
            i39Var.w = i5;
            i39Var.x = i7;
            i39Var.y = i8;
            i5 = hg9.v(4.0f, i39Var.z, i5);
            if (i5 > i6) {
                i6 = i5;
            }
            i4++;
        }
        arrayList2.add(Integer.valueOf(i5));
        if (i2 == 5 && !arrayList.isEmpty()) {
            int i10 = ((i39) arrayList.get(0)).x;
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((i39) arrayList.get(i12)).x != i10) {
                    int i13 = i12 - 1;
                    int i14 = i - (((i39) arrayList.get(i13)).w + ((i39) arrayList.get(i13)).z);
                    while (i11 < i12) {
                        ((i39) arrayList.get(i11)).w += i14;
                        i11++;
                    }
                    i11 = i12;
                }
            }
            int size = arrayList.size() - 1;
            int i15 = i - (((i39) arrayList.get(size)).w + ((i39) arrayList.get(size)).z);
            while (i11 <= size) {
                ((i39) arrayList.get(i11)).w += i15;
                i11++;
            }
        } else if (i2 == 1 && !arrayList.isEmpty()) {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                i39 i39Var2 = (i39) arrayList.get(i16);
                int i17 = i39Var2.y;
                if (i17 >= 0 && i17 < arrayList2.size()) {
                    f = ((Integer) arrayList2.get(i39Var2.y)).intValue();
                } else {
                    f = 0.0f;
                }
                i39Var2.w = (int) aq1.z(i, f, 2.0f, i39Var2.w);
            }
        }
        this.r = i5;
        if (i2 != 5 && i2 != 1) {
            this.o = i6;
        } else {
            this.o = i;
        }
        if (arrayList.size() == 0) {
            L = 0;
        } else {
            L = gm.L(26.0f);
        }
        this.m = i7 + L;
        this.a = 0.0f;
    }

    public final void p() {
        int i = 0;
        this.D = false;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                break;
            }
            ((i39) arrayList.get(i)).b();
            i++;
        }
        HashMap hashMap = this.E;
        if (!hashMap.isEmpty()) {
            for (ImageReceiver imageReceiver : hashMap.values()) {
                imageReceiver.K();
            }
        }
        hashMap.clear();
    }

    public final void q() {
        HashMap hashMap = this.u;
        hashMap.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i < arrayList.size()) {
                hashMap.put(((i39) arrayList.get(i)).n, (i39) arrayList.get(i));
                i++;
            } else {
                this.h = !this.p;
                this.f = this.b;
                this.g = this.c;
                this.C = this.o;
                this.F = this.n;
                return;
            }
        }
    }

    public final void r(defpackage.k47 r22, boolean r23, defpackage.ylb r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l39.r(k47, boolean, ylb):void");
    }
}
