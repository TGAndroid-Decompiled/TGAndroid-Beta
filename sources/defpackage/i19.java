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
public final class i19 {
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
    public f19 P;
    public boolean Q;
    public lw8 R;
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
    public final hf0 w;
    public k27 x;
    public wjb y;
    public Integer z;
    public static final Paint S = new Paint(1);
    public static final Paint T = new Paint(1);
    public static final Paint U = new Paint(1);
    public static final TextPaint V = new TextPaint(1);
    public static final e19 X = new Object();
    public static int Y = 1;
    public static final fx7 Z = new fx7((byte) 10);
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap E = new HashMap();
    public final ArrayList K = new ArrayList();
    public final RectF L = new RectF();
    public final Rect M = new Rect();
    public final int l = y6c.t0;

    public i19(hf0 hf0Var) {
        this.w = hf0Var;
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
        rectF2.set(f2, rectF.top, gl.L(12.0f) + f2, rectF.top + gl.L(12.0f));
        path.arcTo(rectF2, -90.0f, -90.0f, false);
        rectF2.set(rectF.left, rectF.bottom - gl.L(12.0f), rectF.left + gl.L(12.0f), rectF.bottom);
        path.arcTo(rectF2, -180.0f, -90.0f, false);
        if (rectF.height() > gl.L(26.0f)) {
            f = 1.4f;
        } else {
            f = 0.0f;
        }
        float N = rectF.right - gl.N(9.09f);
        float N2 = N - gl.N(0.056f);
        float N3 = gl.N(1.22f) + N;
        float N4 = gl.N(3.07f) + N;
        float N5 = gl.N(2.406f) + N;
        float N6 = gl.N(8.27f + f) + N;
        float N7 = gl.N(8.923f + f) + N;
        float N8 = gl.N(1.753f) + rectF.top;
        float N9 = rectF.bottom - gl.N(1.753f);
        float N10 = gl.N(0.663f) + rectF.top;
        float N11 = rectF.bottom - gl.N(0.663f);
        float f3 = 10.263f + f;
        float N12 = gl.N(f3) + rectF.top;
        float N13 = rectF.bottom - gl.N(f3);
        float f4 = f + 11.333f;
        float N14 = gl.N(f4) + rectF.top;
        float N15 = rectF.bottom - gl.N(f4);
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

    public static void n(wjb wjbVar) {
        S.setColor(bkb.v0(bkb.Ye, wjbVar));
        int v0 = bkb.v0(bkb.Ii, wjbVar);
        TextPaint textPaint = V;
        textPaint.setColor(v0);
        de9.p(textPaint, gl.L(12.0f));
        U.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final boolean a() {
        ArrayList arrayList;
        gc0 gc0Var;
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
            ((f19) arrayList.get(i2)).b();
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
            f19 f19Var = (f19) arrayList2.get(i3);
            String str = f19Var.n;
            jx2 jx2Var = f19Var.E;
            f19 f19Var2 = (f19) hashMap.get(str);
            if (f19Var2 != null) {
                hashMap.remove(f19Var.n);
                int i4 = f19Var.w;
                int i5 = f19Var2.w;
                if (i4 == i5 && f19Var.x == f19Var2.x && f19Var.z == f19Var2.z && f19Var.v == f19Var2.v && f19Var.o == f19Var2.o && f19Var.S == null && f19Var2.S == null) {
                    f19Var.b = (byte) 0;
                    i3++;
                } else {
                    f19Var.c = i5;
                    f19Var.d = f19Var2.x;
                    f19Var.e = f19Var2.z;
                    f19Var.h = f19Var2.M;
                    f19Var.f = f19Var2.N;
                    f19Var.g = f19Var2.O;
                    f19Var.b = (byte) 3;
                    int i6 = f19Var.v;
                    int i7 = f19Var2.v;
                    if (i6 != i7 && jx2Var != null) {
                        jx2Var.c(i7, false);
                        jx2Var.c(f19Var.v, true);
                    }
                    if (f19Var.S == null) {
                        if (f19Var2.S != null) {
                            f19Var.o(new ArrayList());
                        }
                    }
                    if (f19Var2.S == null) {
                        f19Var2.o(new ArrayList());
                    }
                    ArrayList arrayList3 = f19Var2.T;
                    ArrayList arrayList4 = f19Var.T;
                    if (arrayList3 != null && arrayList4 != null && arrayList3.size() == arrayList4.size()) {
                        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                            TLObject tLObject = (TLObject) arrayList3.get(i8);
                            TLObject tLObject2 = (TLObject) arrayList4.get(i8);
                            if (tLObject != null && tLObject2 != null && j(tLObject) == j(tLObject2)) {
                            }
                        }
                    }
                    gc0 gc0Var2 = f19Var.S;
                    if (gc0Var2 != null && (gc0Var = f19Var2.S) != null) {
                        ValueAnimator valueAnimator = gc0Var.f;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (gc0Var2.w) {
                                gc0Var2.w = false;
                                gc0Var2.k();
                            }
                        }
                        TLObject[] tLObjectArr = new TLObject[3];
                        int i9 = 0;
                        while (true) {
                            i = this.l;
                            if (i9 >= 3) {
                                break;
                            }
                            tLObjectArr[i9] = gc0Var2.b[i9].h;
                            gc0Var2.j(i9, i, gc0Var.b[i9].h);
                            i9++;
                        }
                        gc0Var2.a(false, true);
                        for (int i10 = 0; i10 < 3; i10++) {
                            gc0Var2.j(i10, i, tLObjectArr[i10]);
                        }
                        gc0Var2.d = true;
                        gc0Var2.a(true, false);
                    }
                }
            } else {
                f19Var.b = (byte) 1;
            }
            z = true;
            i3++;
        }
        if (!hashMap.isEmpty()) {
            arrayList.addAll(hashMap.values());
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((f19) arrayList.get(i11)).k = ((f19) arrayList.get(i11)).m;
                ((f19) arrayList.get(i11)).a();
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

    public final void b(h19 h19Var) {
        int i = 0;
        if (h19Var.g == 0) {
            HashMap hashMap = this.E;
            if (hashMap.get(h19Var) == null) {
                ImageReceiver imageReceiver = new ImageReceiver(null);
                imageReceiver.p0(this.w);
                int i2 = W;
                W = i2 + 1;
                imageReceiver.w1 = Integer.toString(i2);
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(this.l).r.get(h19Var.f);
                if (tL_availableReaction != null) {
                    imageReceiver.d0(gl5.b(tL_availableReaction.center_icon), "40_40_nolimit", null, "tgs", tL_availableReaction, 1);
                }
                imageReceiver.M(0);
                imageReceiver.I();
                hashMap.put(h19Var, imageReceiver);
                return;
            }
        }
        if (!this.J || h19Var.g == 0) {
            return;
        }
        while (true) {
            ArrayList arrayList = this.s;
            if (i < arrayList.size()) {
                if (h19Var.f(((f19) arrayList.get(i)).q)) {
                    ((f19) arrayList.get(i)).p();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean c(MotionEvent motionEvent) {
        k27 k27Var;
        TLRPC.Message message;
        int i = 0;
        if (this.p || (k27Var = this.x) == null || (message = k27Var.k) == null || message.reactions == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        hf0 hf0Var = this.w;
        float paddingTop = y - hf0Var.getPaddingTop();
        if (hf0Var instanceof uk1) {
            x -= ((uk1) hf0Var).k0 / 2.0f;
        }
        float f = x - this.b;
        float f2 = paddingTop - this.c;
        if (motionEvent.getAction() == 0) {
            ArrayList arrayList = this.s;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (f > ((f19) arrayList.get(i)).w && f < ((f19) arrayList.get(i)).w + ((f19) arrayList.get(i)).z && f2 > ((f19) arrayList.get(i)).x && f2 < ((f19) arrayList.get(i)).x + ((f19) arrayList.get(i)).A) {
                    this.N = motionEvent.getX();
                    this.O = paddingTop;
                    this.P = (f19) arrayList.get(i);
                    lw8 lw8Var = this.R;
                    if (lw8Var != null) {
                        gl.r(lw8Var);
                        this.R = null;
                    }
                    this.P.X.c(true);
                    lw8 lw8Var2 = new lw8(this, this.P, (byte) 8);
                    this.R = lw8Var2;
                    gl.d3(lw8Var2, ViewConfiguration.getLongPressTimeout());
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
                f19 f19Var = this.P;
                if (f19Var != null) {
                    f19Var.X.c(false);
                }
                this.P = null;
                lw8 lw8Var3 = this.R;
                if (lw8Var3 != null) {
                    gl.r(lw8Var3);
                    this.R = null;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            lw8 lw8Var4 = this.R;
            if (lw8Var4 != null) {
                gl.r(lw8Var4);
                this.R = null;
            }
            if (this.Q && this.P != null && motionEvent.getAction() == 1) {
                ((ni5) hf0Var).c(this.P.a, false, motionEvent.getX(), paddingTop);
            }
            this.Q = false;
            f19 f19Var2 = this.P;
            if (f19Var2 != null) {
                f19Var2.X.c(false);
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
                f19 f19Var = (f19) arrayList2.get(i2);
                if (this.z == null && num == null && this.A < 0.5f) {
                    f19Var.c();
                }
                if (!Integer.valueOf(f19Var.q.hashCode()).equals(this.z) && (num == null || f19Var.q.hashCode() == num.intValue())) {
                    canvas2.save();
                    float f10 = f19Var.w;
                    float f11 = f19Var.x;
                    int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                    if (i3 != 0 && f19Var.b == 3) {
                        float f12 = 1.0f - f;
                        f10 = (f10 * f) + (f19Var.c * f12);
                        f11 = (f11 * f) + (f19Var.d * f12);
                    }
                    if (i3 != 0 && f19Var.b == 1) {
                        float f13 = (f * 0.5f) + 0.5f;
                        canvas2.scale(f13, f13, (f19Var.z / 2.0f) + f8 + f10, (f19Var.A / 2.0f) + f9 + f11);
                        f2 = f;
                    } else {
                        f2 = 1.0f;
                    }
                    float f14 = f10 + f8;
                    float f15 = f11 + f9;
                    if (f19Var.b == 3) {
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
                    f19Var.d(canvas2, f14, f15, f4, f3, z, this.B, this.A);
                    canvas2.restore();
                }
                i2++;
            }
            while (i < arrayList.size()) {
                f19 f19Var2 = (f19) arrayList.get(i);
                float f16 = 1.0f - f;
                float f17 = (f16 * 0.5f) + 0.5f;
                canvas2.save();
                canvas2.scale(f17, f17, (f19Var2.z / 2.0f) + f19Var2.w + f8, (f19Var2.A / 2.0f) + f19Var2.x + f9);
                ((f19) arrayList.get(i)).d(canvas2, f19Var2.w + f8, f19Var2.x + f9, 1.0f, f16, false, this.B, this.A);
                canvas.restore();
                i++;
                canvas2 = canvas;
            }
        }
    }

    public final void e(Canvas canvas, float f) {
        f19 f19Var;
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
                f19 f19Var2 = (f19) arrayList2.get(i);
                if (!f19Var2.l) {
                    f2 = f5;
                } else {
                    canvas.save();
                    float f7 = f19Var2.w;
                    float f8 = f19Var2.x;
                    int i2 = (f > f5 ? 1 : (f == f5 ? 0 : -1));
                    if (i2 != 0) {
                        f2 = f5;
                        if (f19Var2.b == 3) {
                            float f9 = f2 - f;
                            f7 = (f7 * f) + (f19Var2.c * f9);
                            f8 = (f8 * f) + (f19Var2.d * f9);
                        }
                    } else {
                        f2 = f5;
                    }
                    if (i2 != 0 && f19Var2.b == 1) {
                        float f10 = (f * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, (f19Var2.z / 2.0f) + f3 + f7, (f19Var2.A / 2.0f) + f4 + f8);
                    }
                    if (!z3 && !f19Var2.f(canvas, f7 + f3, f8 + f4)) {
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
                if (((f19) arrayList.get(i3)).l) {
                    float f12 = ((f11 - f) * 0.5f) + 0.5f;
                    canvas.save();
                    canvas.scale(f12, f12, (f19Var.z / 2.0f) + f19Var.w + f3, (f19Var.A / 2.0f) + f19Var.x + f4);
                    if (!z3 && !((f19) arrayList.get(i3)).f(canvas, f19Var.w + f3, f19Var.x + f4)) {
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

    public final void f(at1 at1Var, Canvas canvas, int i, Integer num) {
        int i2;
        if (!this.p || !this.t.isEmpty()) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.s;
                if (i3 < arrayList.size()) {
                    f19 f19Var = (f19) arrayList.get(i3);
                    if (num != null && f19Var.q.hashCode() == num.intValue()) {
                        RectF rectF = gl.P;
                        rectF.set(f19Var.s);
                        float L = gl.L(140.0f);
                        float L2 = gl.L(14.0f);
                        hf0 hf0Var = this.w;
                        if (hf0Var instanceof gb2) {
                            i2 = ((gb2) hf0Var).getParentWidth();
                        } else {
                            i2 = gl.q.x;
                        }
                        float i4 = Utilities.i(rectF.left - gl.L(12.0f), (i2 - L) - gl.L(24.0f), gl.L(24.0f));
                        float f = rectF.top - L2;
                        float f2 = i;
                        float f3 = f + f2;
                        RectF rectF2 = this.L;
                        rectF2.set(i4, (f - L) + f2, L + i4, f3);
                        float interpolation = s33.h.getInterpolation(this.A);
                        gl.X1(rectF, rectF2, interpolation, rectF2);
                        int i5 = f19Var.U;
                        h19 h19Var = f19Var.r;
                        View view = f19Var.V;
                        if (f19Var.e0 == null && f19Var.f0 == null) {
                            if (view != null && (view.getParent() instanceof View)) {
                                view = (View) view.getParent();
                            }
                            if (f19Var.q != null && !h19Var.a) {
                                if (h19Var.f != null) {
                                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i5).r.get(h19Var.f);
                                    if (tL_availableReaction != null && tL_availableReaction.activate_animation != null) {
                                        kcb f4 = uo3.f(tL_availableReaction.static_icon, bkb.Z6, 1.0f, null);
                                        ImageReceiver imageReceiver = new ImageReceiver(view);
                                        f19Var.e0 = imageReceiver;
                                        imageReceiver.m0(7);
                                        f19Var.e0.I();
                                        f19Var.e0.q0(gl.L(14.0f));
                                        ImageReceiver imageReceiver2 = f19Var.e0;
                                        imageReceiver2.v0 = true;
                                        imageReceiver2.u0 = true;
                                        imageReceiver2.M(1);
                                        ImageReceiver imageReceiver3 = f19Var.e0;
                                        imageReceiver3.x0 = true;
                                        imageReceiver3.d0(gl5.b(tL_availableReaction.activate_animation), "140_140", f4, null, tL_availableReaction, 1);
                                    }
                                } else if (h19Var.g != 0) {
                                    vl vlVar = new vl(24, i5, h19Var.g);
                                    f19Var.f0 = vlVar;
                                    vlVar.b(view);
                                }
                            }
                        }
                        this.M.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                        if (interpolation > 0.0f) {
                            ImageReceiver imageReceiver4 = f19Var.e0;
                            if (imageReceiver4 != null) {
                                imageReceiver4.k0(rectF2);
                                f19Var.e0.setAlpha(interpolation);
                                f19Var.e0.h(canvas, null);
                            } else {
                                vl vlVar2 = f19Var.f0;
                                if (vlVar2 != null) {
                                    vlVar2.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                    f19Var.f0.setAlpha((int) (interpolation * 255.0f));
                                    f19Var.f0.draw(canvas);
                                }
                            }
                            at1Var.invalidate();
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

    public final f19 k(h19 h19Var) {
        String l;
        if (h19Var.a) {
            l = "stars";
        } else {
            String str = h19Var.f;
            if (str != null) {
                l = str;
            } else {
                l = Long.toString(h19Var.g);
            }
        }
        return l(l);
    }

    public final f19 l(String str) {
        return (f19) this.u.get(str);
    }

    public final boolean m() {
        if (this.I) {
            if ((!this.p || !this.t.isEmpty()) && e66.e(8200) && e66.e(131072)) {
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
            f19 f19Var = (f19) arrayList.get(i4);
            f19Var.getClass();
            gn gnVar = f19Var.F;
            jx2 jx2Var = f19Var.E;
            if (f19Var.R) {
                f19Var.z = gl.L(42.0f);
                f19Var.A = gl.L(26.0f);
                if (f19Var.t) {
                    f19Var.z = (int) (gnVar.d + gl.L(8.0f) + f19Var.z);
                } else if (jx2Var != null && f19Var.v > 1) {
                    f19Var.z = de9.w(8.0f, (int) Math.ceil(jx2Var.m), f19Var.z);
                }
            } else {
                int L2 = gl.L(20.0f) + gl.L(8.0f);
                if (f19Var.C != null) {
                    f2 = 6.0f;
                } else {
                    f2 = 4.0f;
                }
                f19Var.z = gl.L(f2) + L2;
                if (f19Var.S != null && f19Var.T.size() > 0) {
                    f19Var.T.size();
                    if (f19Var.T.size() > 1) {
                        i3 = f19Var.T.size() - 1;
                    } else {
                        i3 = 0;
                    }
                    f19Var.z = (int) ((gl.L(20.0f) * i3 * 0.8f) + gl.L(20.0f) + gl.L(2.0f) + gl.L(1.0f) + f19Var.z);
                    f19Var.S.o = gl.L(26.0f);
                } else if (f19Var.t) {
                    f19Var.z = (int) (gnVar.d + gl.L(8.0f) + f19Var.z);
                } else {
                    int ceil = (int) Math.ceil(jx2Var.m);
                    int i9 = f19Var.z;
                    if (ceil > 0) {
                        f19Var.z = de9.w(8.0f, (int) Math.ceil(jx2Var.m), i9);
                    } else {
                        f19Var.z = i9 - gl.L(1.0f);
                    }
                }
                f19Var.A = gl.L(26.0f);
            }
            if (f19Var.z + i5 > i) {
                arrayList2.add(Integer.valueOf(i5));
                i7 = de9.w(4.0f, f19Var.A, i7);
                i8++;
                i5 = 0;
            }
            f19Var.w = i5;
            f19Var.x = i7;
            f19Var.y = i8;
            i5 = de9.w(4.0f, f19Var.z, i5);
            if (i5 > i6) {
                i6 = i5;
            }
            i4++;
        }
        arrayList2.add(Integer.valueOf(i5));
        if (i2 == 5 && !arrayList.isEmpty()) {
            int i10 = ((f19) arrayList.get(0)).x;
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((f19) arrayList.get(i12)).x != i10) {
                    int i13 = i12 - 1;
                    int i14 = i - (((f19) arrayList.get(i13)).w + ((f19) arrayList.get(i13)).z);
                    while (i11 < i12) {
                        ((f19) arrayList.get(i11)).w += i14;
                        i11++;
                    }
                    i11 = i12;
                }
            }
            int size = arrayList.size() - 1;
            int i15 = i - (((f19) arrayList.get(size)).w + ((f19) arrayList.get(size)).z);
            while (i11 <= size) {
                ((f19) arrayList.get(i11)).w += i15;
                i11++;
            }
        } else if (i2 == 1 && !arrayList.isEmpty()) {
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                f19 f19Var2 = (f19) arrayList.get(i16);
                int i17 = f19Var2.y;
                if (i17 >= 0 && i17 < arrayList2.size()) {
                    f = ((Integer) arrayList2.get(f19Var2.y)).intValue();
                } else {
                    f = 0.0f;
                }
                f19Var2.w = (int) oo1.z(i, f, 2.0f, f19Var2.w);
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
            L = gl.L(26.0f);
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
            ((f19) arrayList.get(i)).b();
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
                hashMap.put(((f19) arrayList.get(i)).n, (f19) arrayList.get(i));
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

    public final void r(defpackage.k27 r22, boolean r23, defpackage.wjb r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i19.r(k27, boolean, wjb):void");
    }
}
