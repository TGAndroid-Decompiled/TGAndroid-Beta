package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public class t09 extends FrameLayout implements gk7, tjb {
    public static final ax1 m1 = new ax1(Float.class, "transitionProgress", (byte) 3);
    public final r09 A0;
    public boolean B0;
    public float C0;
    public final HashSet D0;
    public float E;
    public final HashSet E0;
    public final float F;
    public boolean F0;
    public final float G;
    public boolean G0;
    public int H;
    public boolean H0;
    public k27 I;
    public final Paint I0;
    public boolean J;
    public final Paint J0;
    public int K;
    public bd2 K0;
    public long L;
    public boolean L0;
    public boolean M;
    public final on M0;
    public boolean N;
    public final byte N0;
    public boolean O;
    public boolean O0;
    public float P;
    public boolean P0;
    public long Q;
    public Runnable Q0;
    public ValueAnimator R;
    public boolean R0;
    public FrameLayout S;
    public l46 S0;
    public st T;
    public int T0;
    public final ArrayList U;
    public int U0;
    public final ArrayList V;
    public float V0;
    public final ArrayList W;
    public float W0;
    public il0 X0;
    public il0 Y0;
    public il0 Z0;
    public boolean a;
    public final xe2 a0;
    public kl0 a1;
    public final fu b;
    public final c83 b0;
    public nl0 b1;
    public final float c;
    public final RectF c0;
    public int c1;
    public final ArrayList d;
    public boolean d0;
    public boolean d1;
    public final ArrayList e;
    public final HashSet e0;
    public boolean e1;
    public final Paint f;
    public final HashSet f0;
    public bd2 f1;
    public final int[] g0;
    public boolean g1;
    public final Paint h;
    public s09 h0;
    public boolean h1;
    public final Rect i0;
    public boolean i1;
    public final Drawable j0;
    public Paint j1;
    public final boolean k0;
    public Matrix k1;
    public final wjb l0;
    public LinearGradient l1;
    public h19 m0;
    public final Paint n;
    public int n0;
    public float o0;
    public float p0;
    public float q0;
    public float r;
    public float r0;
    public float s;
    public boolean s0;
    public long t0;
    public d u0;
    public oh8 v0;
    public float w;
    public q43 w0;
    public final RectF x;
    public float x0;
    public final Path y;
    public m43 y0;
    public ValueAnimator z0;

    public t09(int i, int i2, wjb wjbVar, Context context, d dVar) {
        super(context);
        boolean z;
        this.a = false;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new Paint(1);
        this.n = new Paint(1);
        this.w = 1.0f;
        this.x = new RectF();
        this.y = new Path();
        this.E = gl.L(72.0f);
        float L = gl.L(8.0f);
        this.F = L;
        this.G = L / 2.0f;
        this.H = gl.L(36.0f);
        this.U = new ArrayList(20);
        this.V = new ArrayList(10);
        this.W = new ArrayList(20);
        this.c0 = new RectF();
        this.d0 = false;
        this.e0 = new HashSet();
        this.f0 = new HashSet();
        this.g0 = new int[2];
        Rect rect = new Rect();
        this.i0 = rect;
        this.D0 = new HashSet();
        this.E0 = new HashSet();
        Paint paint2 = new Paint(1);
        this.I0 = paint2;
        Paint paint3 = new Paint(1);
        this.J0 = paint3;
        this.M0 = new on(null);
        this.P0 = true;
        this.h1 = false;
        this.N0 = i;
        this.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        paint2.setColor(bkb.v0(bkb.h6, wjbVar));
        paint3.setColor(bkb.v0(bkb.zk, wjbVar));
        this.l0 = wjbVar;
        this.K = i2;
        this.u0 = dVar;
        r09 r09Var = new r09(this, context);
        this.A0 = r09Var;
        r09Var.setVisibility(8);
        r09Var.P = false;
        r09Var.c.setVisibility(8);
        addView(r09Var);
        if (gba.c() && gba.o() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.k0 = z;
        Drawable mutate = context.getDrawable(2131232678).mutate();
        this.j0 = mutate;
        int L2 = gl.L(7.0f);
        rect.bottom = L2;
        rect.right = L2;
        rect.top = L2;
        rect.left = L2;
        zkb.x(this, mutate, bkb.Je, null, PorterDuff.Mode.MULTIPLY);
        fu fuVar = new fu((byte) 28, context, this);
        this.b = fuVar;
        fuVar.setClipChildren(false);
        fuVar.setClipToPadding(false);
        xe2 xe2Var = new xe2((ViewGroup) this, (byte) 4);
        this.a0 = xe2Var;
        fuVar.i(new h09(this, (byte) 0));
        fuVar.setLayoutManager(xe2Var);
        fuVar.setOverScrollMode(2);
        c83 c83Var = new c83(this, (byte) 2);
        this.b0 = c83Var;
        fuVar.setAdapter(c83Var);
        fuVar.j(new n09(this));
        fuVar.j(new n58(this, (byte) 8));
        fuVar.i(new h09(this, (byte) 1));
        fuVar.setOnItemClickListener(new f09(this, (byte) 0));
        fuVar.setOnItemLongClickListener(new h93(this, i));
        addView(fuVar, nme.c(-1.0f, -1));
        setClipChildren(false);
        setClipToPadding(false);
        h();
        int paddingTop = (fuVar.getLayoutParams().height - fuVar.getPaddingTop()) - fuVar.getPaddingBottom();
        r09Var.getLayoutParams().width = paddingTop - gl.L(12.0f);
        r09Var.getLayoutParams().height = paddingTop;
        if (i != 2 && i != 4) {
            paint.setColor(bkb.v0(bkb.F8, wjbVar));
        } else {
            paint.setColor(bm2.f(0.13f, -16777216, -1));
        }
        hq6.d0(i2).l1();
    }

    public static HashSet f(ArrayList arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        LongSparseArray longSparseArray = new LongSparseArray();
        HashSet hashSet = new HashSet();
        boolean z = true;
        int i = 0;
        while (i < arrayList.size()) {
            k27 k27Var = (k27) arrayList.get(i);
            hashSet.clear();
            if (k27Var != null && (tL_messageReactions = k27Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < k27Var.k.reactions.results.size(); i2++) {
                    if (k27Var.k.reactions.results.get(i2).chosen) {
                        h19 d = h19.d(k27Var.k.reactions.results.get(i2).reaction);
                        if (z || longSparseArray.indexOfKey(d.h) >= 0) {
                            hashSet.add(Long.valueOf(d.h));
                            longSparseArray.put(d.h, d);
                        }
                    }
                }
            }
            int i3 = 0;
            while (i3 < longSparseArray.size()) {
                if (!hashSet.contains(Long.valueOf(longSparseArray.keyAt(i3)))) {
                    longSparseArray.removeAt(i3);
                    i3--;
                }
                i3++;
            }
            i++;
            z = false;
        }
        HashSet hashSet2 = new HashSet();
        for (int i4 = 0; i4 < longSparseArray.size(); i4++) {
            if (longSparseArray.valueAt(i4) != null) {
                hashSet2.add((h19) longSparseArray.valueAt(i4));
            }
        }
        return hashSet2;
    }

    public final void a(boolean z) {
        m43 m43Var = this.y0;
        if (m43Var != null) {
            if (!m43Var.q || !z) {
                m43Var.q = true;
                if (!z) {
                    m43Var.f();
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new h43(m43Var, (byte) 0));
                    ofFloat.addListener(new k43(m43Var, (byte) 0));
                    ofFloat.setDuration(150L);
                    ofFloat.start();
                }
            }
            this.y0 = null;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F8));
        hashSet.add(Integer.valueOf(bkb.E8));
        hashSet.add(Integer.valueOf(bkb.g5));
    }

    public final void b() {
        m43 m43Var = this.y0;
        if (m43Var != null) {
            m43Var.d();
        }
    }

    public final void c(float f, float f2, float f3, int i, Canvas canvas) {
        s33 s33Var;
        int i2;
        float height;
        RectF rectF;
        Canvas canvas2;
        float f4;
        float f5;
        float height2;
        if (this.N0 == 1) {
            return;
        }
        canvas.save();
        boolean z = this.M;
        RectF rectF2 = this.x;
        if (z) {
            s33Var = s33.f;
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), (gl.R1(rectF2.top, getMeasuredHeight(), s33Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) + 1.0f);
        } else {
            float f6 = rectF2.bottom;
            s33Var = s33.f;
            canvas.clipRect(0.0f, (gl.R1(f6, 0.0f, s33Var.getInterpolation(this.P)) - ((int) Math.ceil((1.0f - this.w) * (rectF2.height() / 2.0f)))) - 1.0f, getMeasuredWidth(), gl.R1(gl.L(8.0f) + getMeasuredHeight(), getPaddingTop() - d(), s33Var.getInterpolation(this.P)));
        }
        if (!k96.a0 && !this.N) {
            i2 = getWidth() - this.H;
        } else {
            i2 = this.H;
        }
        float f7 = i2 + this.V0;
        if (this.M) {
            height = getPaddingTop() - d();
        } else {
            height = (getHeight() - getPaddingBottom()) + d();
        }
        int L = gl.L(3.0f);
        Drawable drawable = this.j0;
        drawable.setAlpha(i);
        Paint paint = this.f;
        paint.setAlpha(i);
        float f8 = f7 - f;
        float f9 = L;
        float f10 = f9 * f2;
        float f11 = height - f;
        float f12 = f7 + f;
        float f13 = height + f;
        drawable.setBounds((int) (f8 - f10), (int) (f11 - f10), (int) (f12 + f10), (int) (f13 + f10));
        drawable.draw(canvas);
        boolean C = this.h0.C();
        float f14 = height;
        RectF rectF3 = this.c0;
        if (C) {
            rectF3.set(f8, f11, f12, f13);
            this.h0.x(canvas, rectF3, f, getX(), getY(), i, false);
            rectF = rectF3;
            f4 = f;
            canvas2 = canvas;
        } else {
            rectF = rectF3;
            canvas2 = canvas;
            f4 = f;
            if (this.Y0 != null) {
                RectF rectF4 = gl.P;
                rectF4.set(f8, f11, f12, f13);
                Rect rect = gl.Q;
                rectF4.round(rect);
                rect.inset(-gl.L(8.0f), -gl.L(8.0f));
                this.Y0.setBounds(rect);
                this.Y0.setAlpha(paint.getAlpha());
                this.Y0.draw(canvas2);
            } else {
                canvas2.drawCircle(f7, f14, f4, paint);
            }
        }
        boolean z2 = k96.a0;
        float f15 = this.F;
        if (!z2 && !this.N) {
            f5 = (getWidth() - this.H) + f15;
        } else {
            f5 = this.H - f15;
        }
        float f16 = this.V0 + this.W0 + f5;
        boolean z3 = this.M;
        float f17 = this.G;
        if (z3) {
            height2 = (getPaddingTop() - d()) - gl.L(16.0f);
        } else {
            height2 = ((getHeight() - f17) - f9) + d();
        }
        float R1 = gl.R1(height2, (f17 + f9) - d(), s33Var.getInterpolation(this.P));
        float f18 = (-gl.L(1.0f)) * f2;
        drawable.setBounds((int) ((f16 - f4) - f18), (int) ((R1 - f4) - f18), (int) (f16 + f4 + f18), (int) (f4 + R1 + f18));
        drawable.draw(canvas2);
        if (this.h0.C()) {
            rectF.set(f16 - f3, R1 - f3, f16 + f3, R1 + f3);
            Canvas canvas3 = canvas2;
            this.h0.x(canvas3, rectF, f3, getX(), getY(), i, false);
            canvas2 = canvas3;
        } else if (this.Z0 != null) {
            RectF rectF5 = gl.P;
            rectF5.set(f16 - f3, R1 - f3, f16 + f3, R1 + f3);
            Rect rect2 = gl.Q;
            rectF5.round(rect2);
            rect2.inset(-gl.L(8.0f), -gl.L(8.0f));
            this.Z0.setBounds(rect2);
            this.Z0.setAlpha(paint.getAlpha());
            this.Z0.draw(canvas2);
        } else {
            canvas2.drawCircle(f16, R1, f3, paint);
        }
        canvas2.restore();
        drawable.setAlpha(255);
        paint.setAlpha(255);
    }

    public final float d() {
        return (int) (getPullingLeftProgress() * gl.L(6.0f));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.L && getVisibility() != 0 && !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) {
                m(this.I, null, true);
                setVisibility(0);
                p(false);
            }
        } else if (i == kk7.k4) {
            if (this.N0 == 4) {
                invalidate();
                fu fuVar = this.b;
                fuVar.invalidate();
                fuVar.h1();
                for (int i3 = 0; i3 < fuVar.getChildCount(); i3++) {
                    View childAt = fuVar.getChildAt(i3);
                    if (childAt instanceof r09) {
                        r09 r09Var = (r09) childAt;
                        r09Var.a.invalidate();
                        r09Var.b.invalidate();
                    } else {
                        childAt.invalidate();
                    }
                }
            }
        } else if (i == kk7.v3) {
            m(this.I, null, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t09.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(ArrayList arrayList) {
        ArrayList arrayList2;
        HashSet hashSet = new HashSet();
        int i = 0;
        byte b = this.N0;
        if (b == 4) {
            Iterator it = this.e0.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                h19 h19Var = (h19) it.next();
                if (!hashSet.contains(h19Var)) {
                    hashSet.add(h19Var);
                    arrayList.add(h19Var);
                    i2++;
                    if (i2 >= 8) {
                        return;
                    }
                }
            }
            ArrayList arrayList3 = hq6.d0(this.K).n;
            while (i < arrayList3.size()) {
                h19 c = h19.c((TLRPC.TL_availableReaction) arrayList3.get(i));
                if (!hashSet.contains(c)) {
                    hashSet.add(c);
                    arrayList.add(c);
                    i2++;
                    if (i2 >= 8) {
                        return;
                    }
                }
                i++;
            }
        } else if (this.F0 && b != 4) {
            int i3 = this.K;
            if (b == 5) {
                TLRPC.messages_AvailableEffects C0 = na7.q1(i3).C0();
                if (C0 != null) {
                    while (i < C0.effects.size()) {
                        h19 e = h19.e(C0.effects.get(i));
                        if (!hashSet.contains(e)) {
                            hashSet.add(e);
                            arrayList.add(e);
                        }
                        i++;
                    }
                    return;
                }
                return;
            }
            if (b == 3) {
                arrayList2 = hq6.d0(i3).H1;
            } else {
                arrayList2 = hq6.d0(i3).G1;
            }
            if (b == 3) {
                TLRPC.TL_messages_savedReactionsTags F1 = na7.q1(this.K).F1(0L, false);
                if (F1 != null) {
                    for (int i4 = 0; i4 < F1.tags.size(); i4++) {
                        h19 d = h19.d(F1.tags.get(i4).reaction);
                        if (!hashSet.contains(d)) {
                            hashSet.add(d);
                            arrayList.add(d);
                        }
                    }
                }
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    h19 d2 = h19.d((TLRPC.Reaction) arrayList2.get(i5));
                    if (!hashSet.contains(d2)) {
                        hashSet.add(d2);
                        arrayList.add(d2);
                    }
                }
            } else {
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    h19 d3 = h19.d((TLRPC.Reaction) arrayList2.get(i6));
                    if (!hashSet.contains(d3) && (b == 3 || y6c.h(this.K).p() || d3.g == 0)) {
                        hashSet.add(d3);
                        arrayList.add(d3);
                    }
                }
            }
            if (b != 3 || y6c.h(this.K).p()) {
                ArrayList arrayList4 = hq6.d0(this.K).F1;
                for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                    h19 d4 = h19.d((TLRPC.Reaction) arrayList4.get(i7));
                    if (!hashSet.contains(d4)) {
                        hashSet.add(d4);
                        arrayList.add(d4);
                    }
                }
                ArrayList arrayList5 = hq6.d0(this.K).n;
                while (i < arrayList5.size()) {
                    h19 c2 = h19.c((TLRPC.TL_availableReaction) arrayList5.get(i));
                    if (!hashSet.contains(c2)) {
                        hashSet.add(c2);
                        arrayList.add(c2);
                    }
                    i++;
                }
            }
        } else {
            int i8 = this.K;
            if (b == 3) {
                ArrayList arrayList6 = hq6.d0(i8).H1;
                int i9 = 0;
                while (i < arrayList6.size()) {
                    h19 d5 = h19.d((TLRPC.Reaction) arrayList6.get(i));
                    if (!hashSet.contains(d5)) {
                        hashSet.add(d5);
                        arrayList.add(d5);
                        i9++;
                    }
                    if (i9 != 16) {
                        i++;
                    } else {
                        return;
                    }
                }
                return;
            }
            ArrayList arrayList7 = hq6.d0(i8).n;
            while (i < arrayList7.size()) {
                arrayList.add(h19.c((TLRPC.TL_availableReaction) arrayList7.get(i)));
                i++;
            }
        }
    }

    public void g() {
        int i = 0;
        while (true) {
            fu fuVar = this.b;
            if (i < fuVar.getChildCount()) {
                View childAt = fuVar.getChildAt(i);
                if (childAt instanceof r09) {
                    ((r09) childAt).b.invalidate();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public s09 getDelegate() {
        return this.h0;
    }

    public int getHintTextWidth() {
        return this.T0;
    }

    public int getItemsCount() {
        return (n() ? 1 : 0) + this.U.size() + 1;
    }

    public float getPullingLeftProgress() {
        return Utilities.i(this.C0 / gl.L(42.0f), 2.0f, 0.0f);
    }

    public m43 getReactionsWindow() {
        return this.y0;
    }

    public String getSelectedEmoji() {
        TLRPC.Document e;
        HashSet hashSet = this.e0;
        if (hashSet.isEmpty()) {
            return "";
        }
        h19 h19Var = (h19) hashSet.iterator().next();
        long j = h19Var.g;
        String str = null;
        if (j != 0 && (e = vl.e(this.K, j)) != null) {
            str = k27.V(e, null, null);
        }
        if (TextUtils.isEmpty(str)) {
            str = h19Var.f;
        }
        if (TextUtils.isEmpty(str)) {
            return "👍";
        }
        return str;
    }

    public HashSet<h19> getSelectedReactions() {
        return this.e0;
    }

    public float getTopOffset() {
        if (this.R0) {
            return ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin;
        }
        return 0.0f;
    }

    public int getTotalWidth() {
        int itemsCount = getItemsCount();
        if (!n()) {
            return gl.L(16.0f) + oo1.h(itemsCount, 1, gl.L(2.0f), gl.L(36.0f) * itemsCount);
        }
        return (gl.L(36.0f) * itemsCount) - gl.L(4.0f);
    }

    public List<h19> getVisibleReactionsList() {
        return this.U;
    }

    public int getWindowType() {
        byte b = this.N0;
        if (b == 4) {
            return 13;
        }
        if (b == 3) {
            return 11;
        }
        if (b == 5) {
            return 14;
        }
        if (this.G0) {
            return 8;
        }
        return 1;
    }

    public View getWindowView() {
        m43 m43Var = this.y0;
        if (m43Var == null) {
            return null;
        }
        return m43Var.c;
    }

    public final void h() {
        int L = gl.L(24.0f);
        float height = getHeight() / 2.0f;
        int w0 = bkb.w0(null, bkb.F8, false);
        this.c1 = w0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h.setShader(new LinearGradient(0.0f, height, L, height, w0, 0, tileMode));
        this.n.setShader(new LinearGradient(getWidth(), height, getWidth() - L, height, w0, 0, tileMode));
        invalidate();
    }

    public final void i(View view, h19 h19Var, boolean z) {
        s09 s09Var = this.h0;
        if (s09Var != null) {
            s09Var.q(view, h19Var, z, true);
        }
        if (this.N0 == 5) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    public final void k() {
        this.P0 = true;
        this.n0 = 0;
        this.o0 = 0.0f;
        this.C0 = 0.0f;
        this.m0 = null;
        this.s0 = false;
        g09 g09Var = new g09(this, (byte) 1);
        fu fuVar = this.b;
        gl.d0(fuVar, g09Var);
        this.D0.clear();
        fuVar.invalidate();
        st stVar = this.T;
        if (stVar != null) {
            stVar.invalidate();
        }
        invalidate();
    }

    public final void l(kl0 kl0Var, nl0 nl0Var) {
        this.a1 = kl0Var;
        this.b1 = nl0Var;
        il0 c = kl0Var.c(this, null, true);
        c.p(nl0Var);
        ug8.r(c, gl.L(24.0f), 8.0f);
        this.X0 = c;
        il0 c2 = kl0Var.c(this, null, true);
        c2.p(nl0Var);
        ug8.r(c2, gl.L(8.0f), 8.0f);
        this.Y0 = c2;
        il0 c3 = kl0Var.c(this, null, true);
        c3.p(nl0Var);
        ug8.r(c3, gl.L(4.0f), 8.0f);
        this.Z0 = c3;
    }

    public final void m(k27 k27Var, TLRPC.ChatFull chatFull, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        TLRPC.ChatFull chatFull2;
        boolean z4;
        TLRPC.TL_messageReactions tL_messageReactions;
        int i2;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions2;
        this.I = k27Var;
        if (k27Var != null && (message = k27Var.k) != null && (tL_messageReactions2 = message.reactions) != null) {
            ArrayList<TLRPC.ReactionCount> arrayList = tL_messageReactions2.results;
            int size = arrayList.size();
            i = 0;
            int i3 = 0;
            while (i3 < size) {
                TLRPC.ReactionCount reactionCount = arrayList.get(i3);
                i3++;
                if (!(reactionCount.reaction instanceof TLRPC.TL_reactionPaid)) {
                    i++;
                }
            }
        } else {
            i = 0;
        }
        byte b = this.N0;
        if (b == 0 && this.I != null && i >= na7.q1(this.K).M0(k27.B0(this.I.k))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.J = z2;
        if (b == 0 && this.I != null && hc2.V(na7.q1(this.K).K0(Long.valueOf(-k27.B0(this.I.k))))) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.B0 = z3;
        ArrayList arrayList2 = new ArrayList();
        if (k27Var != null && k27Var.k3()) {
            chatFull2 = na7.q1(this.K).L0(-k27Var.Z0());
            if (chatFull2 == null) {
                this.L = -k27Var.Z0();
                na7.q1(this.K).Y2(0, -k27Var.Z0(), true);
                setVisibility(4);
                return;
            }
        } else {
            chatFull2 = chatFull;
        }
        this.d0 = false;
        if (b == 3) {
            this.F0 = y6c.h(this.K).p();
            e(arrayList2);
        } else if (b == 5) {
            this.F0 = true;
            e(arrayList2);
        } else if (this.J) {
            this.F0 = false;
            if (chatFull2 != null && chatFull2.paid_reactions_available) {
                this.d0 = true;
                ?? obj = new Object();
                obj.a = true;
                arrayList2.add(obj);
            }
            ArrayList<TLRPC.ReactionCount> arrayList3 = this.I.k.reactions.results;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                TLRPC.ReactionCount reactionCount2 = arrayList3.get(i4);
                i4++;
                arrayList2.add(h19.d(reactionCount2.reaction));
            }
        } else if (chatFull2 != null) {
            if (chatFull2.paid_reactions_available) {
                this.d0 = true;
                ?? obj2 = new Object();
                obj2.a = true;
                arrayList2.add(obj2);
            }
            TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                TLRPC.Chat K0 = na7.q1(this.K).K0(Long.valueOf(chatFull2.id));
                if (K0 != null && !hc2.V(K0)) {
                    this.F0 = true;
                } else {
                    this.F0 = false;
                }
                e(arrayList2);
            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                ArrayList<TLRPC.Reaction> arrayList4 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    TLRPC.Reaction reaction = arrayList4.get(i5);
                    i5++;
                    TLRPC.Reaction reaction2 = reaction;
                    ArrayList arrayList5 = hq6.d0(this.K).n;
                    int size4 = arrayList5.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 < size4) {
                            Object obj3 = arrayList5.get(i6);
                            i6++;
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj3;
                            if ((reaction2 instanceof TLRPC.TL_reactionEmoji) && tL_availableReaction.reaction.equals(((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
                                arrayList2.add(h19.d(reaction2));
                                break;
                            } else if (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) {
                                arrayList2.add(h19.d(reaction2));
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            this.F0 = true;
            e(arrayList2);
        }
        HashSet hashSet = new HashSet();
        int i7 = 0;
        while (i7 < arrayList2.size()) {
            if (hashSet.contains(arrayList2.get(i7))) {
                i7--;
                arrayList2.remove(i7);
            } else {
                hashSet.add((h19) arrayList2.get(i7));
            }
            i7++;
        }
        if (!this.J && ((!this.F0 && arrayList2.size() > 16) || (this.F0 && !y6c.h(this.K).p() && na7.q1(this.K).F3()))) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.G0 = z4;
        if (b == 3 && !y6c.h(this.K).p()) {
            this.G0 = false;
        }
        if (b == 4) {
            this.G0 = true;
        }
        ArrayList arrayList6 = this.U;
        arrayList6.clear();
        if (n()) {
            int L = (gl.q.x - gl.L(36.0f)) / gl.L(34.0f);
            if (L > 7) {
                L = 7;
            }
            int i8 = 0;
            if (L < 1) {
                L = 1;
            }
            while (i8 < Math.min(arrayList2.size(), L)) {
                arrayList6.add((h19) arrayList2.get(i8));
                i8++;
            }
            if (i8 < arrayList2.size()) {
                this.A0.d(-1, (h19) arrayList2.get(i8));
            }
        } else {
            arrayList6.addAll(arrayList2);
        }
        this.H0 = true;
        for (int i9 = 0; i9 < arrayList6.size(); i9++) {
            if (((h19) arrayList6.get(i9)).g != 0) {
                this.H0 = false;
            }
        }
        ArrayList arrayList7 = this.W;
        arrayList7.clear();
        arrayList7.addAll(arrayList2);
        if (arrayList2.size() * (((getLayoutParams().height - ((int) getTopOffset())) - getPaddingTop()) - getPaddingBottom()) < gl.L(200.0f)) {
            getLayoutParams().width = -2;
        }
        c83 c83Var = this.b0;
        t09 t09Var = (t09) c83Var.e;
        ArrayList arrayList8 = t09Var.e;
        ArrayList arrayList9 = t09Var.U;
        ArrayList arrayList10 = t09Var.d;
        arrayList8.clear();
        arrayList8.addAll(arrayList10);
        arrayList10.clear();
        for (int i10 = 0; i10 < arrayList9.size(); i10++) {
            h19 h19Var = (h19) arrayList9.get(i10);
            if (h19Var.f == null) {
                i2 = 3;
            } else {
                i2 = 0;
            }
            arrayList10.add(new k09(i2, h19Var));
        }
        if (!t09Var.V.isEmpty() && !na7.q1(t09Var.K).F3()) {
            arrayList10.add(new k09(1, null));
        }
        if (t09Var.n()) {
            arrayList10.add(new k09(2, null));
        }
        if (z) {
            c83Var.E(arrayList8, arrayList10);
        } else {
            c83Var.f();
        }
        if (k27Var != null && (tL_messageReactions = k27Var.k.reactions) != null && tL_messageReactions.results != null) {
            for (int i11 = 0; i11 < k27Var.k.reactions.results.size(); i11++) {
                if (k27Var.k.reactions.results.get(i11).chosen) {
                    this.e0.add(h19.d(k27Var.k.reactions.results.get(i11).reaction));
                }
            }
        }
    }

    public final boolean n() {
        if (!this.F0 && !this.G0) {
            return false;
        }
        return true;
    }

    public final void o() {
        if (this.y0 != null) {
            return;
        }
        m43 m43Var = new m43(this.N0, this.u0, this.W, this.e0, this, this.l0, this.a);
        this.y0 = m43Var;
        kl0 kl0Var = this.a1;
        boolean z = true;
        if (kl0Var != null) {
            nl0 nl0Var = this.b1;
            lw9 lw9Var = m43Var.m.g0;
            lw9Var.y = true;
            lw9Var.setBackground(null);
            lw9Var.updateColors();
            lw9Var.invalidate();
            il0 c = kl0Var.c(m43Var.a, null, true);
            c.p(nl0Var);
            ug8.r(c, gl.L(12.0f), 8.0f);
            m43Var.z = c;
        }
        m43 m43Var2 = this.y0;
        s09 s09Var = this.h0;
        if (s09Var != null && !s09Var.r()) {
            z = false;
        }
        m43Var2.m.setLongPressEnabled(z);
        g();
        this.y0.p = new sr8(this, (byte) 8);
        j();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.k4);
        kk7.f(this.K).b(this, kk7.S);
        if (this.N0 == 5) {
            kk7.f(this.K).b(this, kk7.v3);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.k4);
        kk7.f(this.K).n(this, kk7.S);
        if (this.N0 == 5) {
            kk7.f(this.K).n(this, kk7.v3);
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h();
    }

    public final void p(boolean z) {
        ObjectAnimator duration;
        this.L0 = z;
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        this.M0.d();
        boolean j = gba.j();
        ax1 ax1Var = m1;
        if (j) {
            duration = ObjectAnimator.ofFloat(this, ax1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        } else {
            duration = ObjectAnimator.ofFloat(this, ax1Var, 0.0f, 1.0f).setDuration(250L);
            duration.setInterpolator(new OvershootInterpolator(0.5f));
        }
        duration.addListener(new kt7(this, (byte) 1));
        duration.start();
    }

    @Override
    public void setAlpha(float f) {
        if (getAlpha() != f && f == 0.0f) {
            this.D0.clear();
            int i = 0;
            while (true) {
                fu fuVar = this.b;
                if (i >= fuVar.getChildCount()) {
                    break;
                }
                if (fuVar.getChildAt(i) instanceof r09) {
                    ((r09) fuVar.getChildAt(i)).c();
                }
                i++;
            }
        }
        super.setAlpha(f);
    }

    public void setBubbleOffset(float f) {
        this.V0 = f;
    }

    public void setChatScrimView(bd2 bd2Var) {
        this.f1 = bd2Var;
    }

    public void setCurrentAccount(int i) {
        this.K = i;
    }

    public void setCustomEmojiEnterProgress(float f) {
        this.x0 = f;
        bd2 bd2Var = this.f1;
        if (bd2Var != null) {
            bd2Var.setPopupAlpha(1.0f - f);
        }
        invalidate();
    }

    public void setCustomEmojiReactionsBackground(boolean z) {
        q43 q43Var = this.w0;
        if (z) {
            int L = gl.L(28.0f);
            int i = bkb.h6;
            zkb.R(q43Var, bkb.h0(L, 0, bm2.o(bkb.w0(null, i, false), 40)), null, zkb.g(i, 40), null);
            return;
        }
        q43Var.setBackground(null);
    }

    public void setDelegate(s09 s09Var) {
        this.h0 = s09Var;
    }

    public void setFlippedVertically(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setFragment(d dVar) {
        this.u0 = dVar;
    }

    public void setHint(CharSequence charSequence) {
        this.R0 = true;
        if (this.S0 == null) {
            Context context = getContext();
            wjb wjbVar = this.l0;
            l46 l46Var = new l46(context, wjbVar);
            this.S0 = l46Var;
            l46Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
            this.S0.setClickable(true);
            this.S0.setTextSize(1, 12.0f);
            byte b = this.N0;
            if (b != 1 && b != 2 && b != 4) {
                zkb.X(this.S0, bkb.y6, wjbVar);
            } else {
                zkb.X(this.S0, bkb.F6, wjbVar);
                this.S0.setAlpha(0.5f);
            }
            this.S0.setGravity(1);
            addView(this.S0, nme.d(-1, -2.0f, 0, 0.0f, 6.0f, 0.0f, 0.0f));
        }
        this.S0.setText(charSequence);
        this.g1 = false;
        ((FrameLayout.LayoutParams) this.A0.getLayoutParams()).topMargin = gl.L(20.0f);
        ((FrameLayout.LayoutParams) this.b.getLayoutParams()).topMargin = gl.L(20.0f);
    }

    public void setMiniBubblesOffset(float f) {
        this.W0 = f;
    }

    public void setMirrorX(boolean z) {
        this.N = z;
        invalidate();
    }

    public void setOnSwitchedToLoopView(Runnable runnable) {
        this.Q0 = runnable;
    }

    public void setParentLayout(bd2 bd2Var) {
        this.K0 = bd2Var;
    }

    public void setSelectedEmojis(ArrayList<String> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            h19 b = h19.b(str);
            hashSet.add(b);
            this.f0.add(b);
        }
        gl.d0(this.b, new g09(this, (byte) 0));
    }

    public void setSelectedReaction(h19 h19Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (h19Var != null) {
            hashSet.add(h19Var);
        }
        this.b0.f();
    }

    public void setSelectedReactionAnimated(h19 h19Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (h19Var != null) {
            hashSet.add(h19Var);
        }
        gl.d0(this.b, new g09(this, (byte) 0));
    }

    public void setSelectedReactionInclusive(h19 h19Var) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (h19Var != null) {
            hashSet.add(h19Var);
        }
        gl.d0(this.b, new g09(this, (byte) 0));
    }

    public void setSelectedReactions(ArrayList<k27> arrayList) {
        TLRPC.TL_messageReactions tL_messageReactions;
        HashSet hashSet = this.e0;
        hashSet.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            k27 k27Var = arrayList.get(i);
            if (k27Var != null && (tL_messageReactions = k27Var.k.reactions) != null && tL_messageReactions.results != null) {
                for (int i2 = 0; i2 < k27Var.k.reactions.results.size(); i2++) {
                    if (k27Var.k.reactions.results.get(i2).chosen) {
                        hashSet.add(h19.d(k27Var.k.reactions.results.get(i2).reaction));
                    }
                }
            }
        }
        this.b0.f();
    }

    public void setSelectedReactionsInclusive(ArrayList<k27> arrayList) {
        HashSet hashSet = this.e0;
        hashSet.clear();
        hashSet.addAll(f(arrayList));
        gl.d0(this.b, new g09(this, (byte) 0));
    }

    public void setSkipDraw(boolean z) {
        if (this.e1 != z) {
            this.e1 = z;
            if (!z) {
                int i = 0;
                while (true) {
                    fu fuVar = this.b;
                    if (i >= fuVar.getChildCount()) {
                        break;
                    }
                    if (fuVar.getChildAt(i) instanceof r09) {
                        r09 r09Var = (r09) fuVar.getChildAt(i);
                        boolean z2 = r09Var.r;
                        q09 q09Var = r09Var.b;
                        if (z2 && (q09Var.getImageReceiver().y() != null || q09Var.getImageReceiver().m() != null)) {
                            q09Var.setVisibility(0);
                            r09Var.a.setVisibility(4);
                            if (r09Var.s) {
                                r09Var.w = true;
                            }
                        }
                        r09Var.invalidate();
                    }
                    i++;
                }
            }
            invalidate();
        }
    }

    public void setStoryItem(TL_stories.StoryItem storyItem) {
        TLRPC.Reaction reaction;
        HashSet hashSet = this.e0;
        hashSet.clear();
        if (storyItem != null && (reaction = storyItem.sent_reaction) != null) {
            hashSet.add(h19.d(reaction));
        }
        this.b0.f();
    }

    public void setTop(boolean z) {
        this.M = z;
    }

    public void setTransitionProgress(float f) {
        this.w = f;
        bd2 bd2Var = this.K0;
        if (bd2Var != null) {
            bd2Var.setReactionsTransitionProgress((this.L0 && gba.j()) ? 1.0f : 1.0f);
        }
        invalidate();
    }

    @Override
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        Paint paint = this.f;
        if (paint != null) {
            try {
                byte b = this.N0;
                if (b != 2 && b != 4 && paint.getColor() != (v0 = bkb.v0(bkb.F8, this.l0))) {
                    int alpha = paint.getAlpha();
                    paint.setColor(v0);
                    paint.setAlpha(alpha);
                    invalidate();
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        oh8 oh8Var = this.v0;
        if (oh8Var != null) {
            oh8Var.setColor(bm2.f(0.7f, bkb.w0(null, bkb.E8, false), bkb.w0(null, bkb.g5, false)));
        }
        if (getWidth() > 0 && getHeight() > 0 && this.c1 != bkb.w0(null, bkb.F8, false)) {
            h();
        }
    }

    public void j() {
    }
}
