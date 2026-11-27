package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class j81 extends e implements fn7 {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public gd0 I;
    public int J;
    public int K;
    public int L;
    public kr M;
    public k09 N;
    public zu1 O;
    public kg5 P;
    public int Q;
    public int R;
    public ValueAnimator S;
    public final SparseArray T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public final byte Y;
    public boolean Z;
    public z71 a;
    public final int a0;
    public gu b;
    public final int b0;
    public x46 c;
    public gb0 c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public boolean e0;
    public final TextPaint f;
    public int f0;
    public u5b g0;
    public TextView h;
    public z8d h0;
    public int i0;
    public tg0 j0;
    public a81 k0;
    public View l0;
    public final Path m0;
    public TextView n;
    public final npa n0;
    public int o0;
    public boolean p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public int s0;
    public tb w;
    public final Paint x;
    public long y;

    public j81(int i, int i2, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.x = new Paint(1);
        this.T = new SparseArray();
        this.V = 0;
        this.m0 = new Path();
        this.n0 = new npa();
        this.Y = i;
        if (i2 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i2 * 1000);
            this.a0 = calendar.get(1);
            this.b0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(2.0f));
    }

    public static wk5 j0(j81 j81Var) {
        return j81Var.parentLayout;
    }

    public static wk5 k0(j81 j81Var) {
        return j81Var.parentLayout;
    }

    public static wk5 l0(j81 j81Var) {
        return j81Var.parentLayout;
    }

    public static wk5 m0(j81 j81Var) {
        return j81Var.parentLayout;
    }

    public static wk5 n0(j81 j81Var) {
        return j81Var.parentLayout;
    }

    public static wk5 o0(j81 j81Var) {
        return j81Var.parentLayout;
    }

    public final void A0(g81 g81Var, boolean z) {
        int i;
        int i2;
        if (this.Q != 0 && this.R != 0) {
            if (g81Var.n != null) {
                if (!z) {
                    SparseArray sparseArray = g81Var.x;
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        g81Var.a(sparseArray.keyAt(i3), 0, 0, false, false);
                    }
                }
                int i4 = g81Var.e;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                for (int i8 = 0; i8 < g81Var.d; i8++) {
                    h81 h81Var = (h81) g81Var.n.get(i8, null);
                    if (h81Var != null && (i2 = h81Var.h) >= this.Q && i2 <= this.R) {
                        if (i5 == -1) {
                            i5 = i4;
                        }
                        i6 = i4;
                    }
                    i4++;
                    if (i4 >= 7) {
                        if (i5 != -1 && i6 != -1) {
                            i = i7;
                            g81Var.a(i, i5, i6, true, z);
                        } else {
                            i = i7;
                            g81Var.a(i, 0, 0, false, z);
                        }
                        i7 = i + 1;
                        i5 = -1;
                        i6 = -1;
                        i4 = 0;
                    }
                }
                int i9 = i7;
                if (i5 != -1 && i6 != -1) {
                    g81Var.a(i9, i5, i6, true, z);
                    return;
                } else {
                    g81Var.a(i9, 0, 0, false, z);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = g81Var.x;
        for (int i10 = 0; i10 < sparseArray2.size(); i10++) {
            g81Var.a(sparseArray2.keyAt(i10), 0, 0, false, z);
        }
    }

    public final void B0() {
        int abs;
        boolean z;
        String M0;
        TextView textView;
        kg5 kg5Var;
        if (!this.e0) {
            this.simpleActionBar.setTitle(ob6.M0(2131752623, null));
            this.I.c(true, 0.0f);
            return;
        }
        int i = this.Q;
        int i2 = this.R;
        if (i == i2 && i == 0) {
            abs = 0;
        } else {
            abs = (Math.abs(i - i2) / 86400) + 1;
        }
        boolean z2 = this.p0;
        int i3 = this.o0;
        if (abs == i3 && z2 == this.H) {
            return;
        }
        if (i3 > abs) {
            z = true;
        } else {
            z = false;
        }
        this.o0 = abs;
        boolean z3 = this.H;
        this.p0 = z3;
        float f = 1.0f;
        if (abs > 0) {
            M0 = ob6.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z3) {
            M0 = ob6.M0(2131745388, null);
            this.I.c(true, 1.0f);
        } else {
            M0 = ob6.M0(2131752623, null);
            this.I.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.n.setText(ob6.a0("ClearHistoryForTheseDays", null, 2131752052, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.n.setText(ob6.a0("ClearHistoryForThisDay", null, 2131752051, new Object[0]));
        }
        gb0 gb0Var = this.c0;
        if (abs <= 0 && !this.H) {
            textView = this.h;
        } else {
            textView = this.n;
        }
        gb0Var.a(textView, true);
        jla jlaVar = this.simpleActionBar;
        jlaVar.getClass();
        jlaVar.K(str, z, 150L, k43.h);
        if ((!this.H || abs > 0) && (kg5Var = this.P) != null) {
            kg5Var.f(true);
        }
        if (abs <= 0 && !this.H) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(hl.L(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.n.animate().alpha(0.0f).translationY(-hl.L(20.0f)).setDuration(150L).setListener(new gf4(this.n)).start();
            this.h.setEnabled(true);
            this.n.setEnabled(false);
            return;
        }
        if (this.n.getVisibility() == 8) {
            this.n.setAlpha(0.0f);
            this.n.setTranslationY(-hl.L(20.0f));
        }
        this.n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(hl.L(20.0f)).setDuration(150L).setListener(new gf4(this.h)).start();
        ViewPropertyAnimator animate = this.n.animate();
        if (abs == 0) {
            f = 0.5f;
        }
        animate.alpha(f).translationY(0.0f).start();
        this.h.setEnabled(false);
        this.n.setEnabled(true);
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        float f;
        TextPaint textPaint = this.d;
        textPaint.setTextSize(hl.L(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f;
        textPaint2.setTextSize(hl.L(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(hl.o());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(hl.L(16.0f));
        textPaint3.setTypeface(hl.o());
        textPaint3.setTextAlign(align);
        z71 z71Var = new z71(this, context);
        this.a = z71Var;
        z71Var.setBackgroundColor(getThemedColor(aob.a7));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(ob6.M0(2131752623, null));
        gu guVar = new gu((byte) 4, context, this);
        this.b = guVar;
        x46 x46Var = new x46();
        this.c = x46Var;
        guVar.setLayoutManager(x46Var);
        this.c.j1(true);
        gu guVar2 = this.b;
        kr krVar = new kr(this, (byte) 2);
        this.M = krVar;
        guVar2.setAdapter(krVar);
        this.b.j(new y(this, (byte) 12));
        if (this.f0 == 0 && this.e0) {
            z = true;
        } else {
            z = false;
        }
        z71 z71Var2 = this.a;
        gu guVar3 = this.b;
        if (z) {
            f = 48.0f;
        } else {
            f = 0.0f;
        }
        z71Var2.addView(guVar3, tre.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f));
        a81 a81Var = new a81(this, context, new String[]{ob6.M0(2131752621, null), ob6.M0(2131752617, null), ob6.M0(2131752616, null), ob6.M0(2131752618, null), ob6.M0(2131752622, null), ob6.M0(2131752620, null), ob6.M0(2131752619, null)}, (byte) 0);
        this.k0 = a81Var;
        a81Var.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        a81 a81Var2 = this.k0;
        jl0 c = getBaseSimpleGlass().c.c(this.k0, null, false);
        c.p(dtd.l(this.resourceProvider));
        c.q(hl.L(9.66f));
        c.r(hl.L(18.0f));
        a81Var2.setBackground(c);
        this.k0.setTranslationY(eg0.f(0) - hl.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 15));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i = calendar.get(2);
        this.K = i;
        int i2 = this.a0;
        if (i2 != 0) {
            int h = bp1.h(this.J, i2, 12, i) - this.b0;
            this.L = h + 1;
            this.c.g1(h, hl.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        gd0 gd0Var = new gd0(false);
        this.I = gd0Var;
        this.simpleActionBar.setBackButtonDrawable(gd0Var);
        this.I.c(false, 0.0f);
        w0();
        y0();
        textPaint3.setColor(-1);
        if (z) {
            this.c0 = new gb0(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(hl.o());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final j81 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j81 j81Var = this.b;
                            j81Var.H = true;
                            j81Var.B0();
                            return;
                        default:
                            j81 j81Var2 = this.b;
                            int i3 = j81Var2.o0;
                            if (i3 == 0) {
                                if (j81Var2.P == null) {
                                    kg5 kg5Var = new kg5(j81Var2.a.getContext(), 3);
                                    kg5Var.p(true);
                                    kg5Var.h = hl.L(310.0f);
                                    kg5Var.d = 2300L;
                                    kg5Var.U = true;
                                    kg5Var.e = true;
                                    kg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                                    kg5Var.v0 = -hl.L(10.0f);
                                    j81Var2.P = kg5Var;
                                    kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                                    j81Var2.P.k(j81Var2.getBaseSimpleGlass().c);
                                    j81Var2.a.addView(j81Var2.P, tre.e(-1, 150, 55));
                                    j81Var2.P.t(ob6.M0(2131745387, null));
                                }
                                j81Var2.P.x(j81Var2.c0, true);
                                return;
                            }
                            jj.q(j81Var2, i3, j81Var2.getMessagesController().X1(Long.valueOf(j81Var2.y)), null, false, new zm9(j81Var2, (byte) 13), null);
                            return;
                    }
                }
            });
            this.h.setText(ob6.M0(2131745388, null));
            this.c0.addView(this.h, tre.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(hl.o());
            this.n.setOnClickListener(new View.OnClickListener(this) {
                public final j81 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            j81 j81Var = this.b;
                            j81Var.H = true;
                            j81Var.B0();
                            return;
                        default:
                            j81 j81Var2 = this.b;
                            int i3 = j81Var2.o0;
                            if (i3 == 0) {
                                if (j81Var2.P == null) {
                                    kg5 kg5Var = new kg5(j81Var2.a.getContext(), 3);
                                    kg5Var.p(true);
                                    kg5Var.h = hl.L(310.0f);
                                    kg5Var.d = 2300L;
                                    kg5Var.U = true;
                                    kg5Var.e = true;
                                    kg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                                    kg5Var.v0 = -hl.L(10.0f);
                                    j81Var2.P = kg5Var;
                                    kg5Var.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                                    j81Var2.P.k(j81Var2.getBaseSimpleGlass().c);
                                    j81Var2.a.addView(j81Var2.P, tre.e(-1, 150, 55));
                                    j81Var2.P.t(ob6.M0(2131745387, null));
                                }
                                j81Var2.P.x(j81Var2.c0, true);
                                return;
                            }
                            jj.q(j81Var2, i3, j81Var2.getMessagesController().X1(Long.valueOf(j81Var2.y)), null, false, new zm9(j81Var2, (byte) 13), null);
                            return;
                    }
                }
            });
            this.n.setVisibility(8);
            this.c0.addView(this.n, tre.e(-2, 38, 17));
            this.a.addView(this.c0, tre.e(-1, 50, 80));
            this.c0.a(this.h, false);
            int L = hl.L(19.0f);
            TextView textView3 = this.h;
            int i3 = aob.sf;
            yob.R(textView3, aob.Y(vm2.o(aob.w0(null, i3, false), 51), L, L), null, yob.g(i3, 51), null);
            TextView textView4 = this.n;
            int i4 = aob.q7;
            yob.R(textView4, aob.Y(vm2.o(aob.w0(null, i4, false), 51), L, L), null, yob.g(i4, 51), null);
            yob.X(this.h, i3, null);
            yob.X(this.n, i4, null);
        }
        View view = new View(context);
        this.l0 = view;
        this.a.addView(view, tre.e(-1, 0, 48));
        this.l0.getLayoutParams().height = hl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.k0, tre.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.A5 && this.g0 == ((u5b) objArr[0])) {
            z0();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i = aob.a;
        int i2 = aob.a;
        int i3 = aob.a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (vm2.h(aob.w0(null, aob.d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.H) {
            if (z) {
                this.H = false;
                this.R = 0;
                this.Q = 0;
                B0();
                r0();
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i = getArguments().getInt("type");
        this.f0 = i;
        if (i == 2) {
            this.g0 = uc7.s1(this.currentAccount).O1().z(0, -1, this.y, true);
        } else if (i == 3) {
            this.g0 = uc7.s1(this.currentAccount).O1().z(1, -1, this.y, true);
        }
        u5b u5bVar = this.g0;
        if (u5bVar != null) {
            this.h0 = new z8d(this, (byte) 15);
        }
        if (this.y >= 0) {
            this.e0 = true;
        } else {
            this.e0 = false;
        }
        if (u5bVar != null) {
            jn7.f(this.currentAccount).b(this, jn7.A5);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.g0 != null) {
            jn7.f(this.currentAccount).n(this, jn7.A5);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.l0.getLayoutParams().height = hl.L(44.0f) + a.getCurrentActionBarHeight() + i2;
        this.k0.setTranslationY(eg0.f(i2) - hl.L(9.66f));
        t0(i2, i4);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.I != null && this.d != null && this.f != null && this.e != null) {
            int w0 = aob.w0(null, aob.d6, false);
            int w02 = aob.w0(null, aob.G6, false);
            int w03 = aob.w0(null, aob.i6, false);
            if (w0 != this.q0 || w02 != this.r0 || w03 != this.s0) {
                this.q0 = w0;
                this.r0 = w02;
                this.s0 = w03;
                y0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        tb tbVar;
        if (z && (tbVar = this.w) != null && tbVar.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        tb tbVar = this.w;
        if (tbVar != null && tbVar.getVisibility() == 0) {
            tb tbVar2 = this.w;
            if (z) {
                tbVar2.setAlpha(1.0f - f);
            } else {
                tbVar2.setAlpha(f);
            }
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.Z = true;
    }

    @Override
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        mq5 mq5Var = this.mSystemInsets;
        t0(mq5Var.b, mq5Var.d);
    }

    public final void r0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(k43.f);
        duration.addUpdateListener(new g0(this, (byte) 23));
        duration.addListener(new h0(this, (byte) 28));
        duration.start();
        this.S = duration;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            A0((g81) this.b.getChildAt(i), true);
        }
        for (int i2 = 0; i2 < this.b.getCachedChildCount(); i2++) {
            g81 g81Var = (g81) this.b.Q(i2);
            A0(g81Var, false);
            int i3 = this.Q;
            int i4 = this.R;
            int i5 = g81.E;
            g81Var.c(i3, i4);
            g81Var.b(1.0f);
        }
        for (int i6 = 0; i6 < this.b.getHiddenChildCount(); i6++) {
            g81 g81Var2 = (g81) this.b.X(i6);
            A0(g81Var2, false);
            int i7 = this.Q;
            int i8 = this.R;
            int i9 = g81.E;
            g81Var2.c(i7, i8);
            g81Var2.b(1.0f);
        }
        for (int i10 = 0; i10 < this.b.getAttachedScrapChildCount(); i10++) {
            g81 g81Var3 = (g81) this.b.P(i10);
            A0(g81Var3, false);
            int i11 = this.Q;
            int i12 = this.R;
            int i13 = g81.E;
            g81Var3.c(i11, i12);
            g81Var3.b(1.0f);
        }
    }

    public final void s0() {
        if (!this.F && !this.U) {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
                View childAt = this.b.getChildAt(i2);
                if (childAt instanceof g81) {
                    g81 g81Var = (g81) childAt;
                    int i3 = (g81Var.b * 100) + g81Var.c;
                    if (i3 < i) {
                        i = i3;
                    }
                }
            }
            int i4 = this.X;
            if ((i4 % 100) + ((i4 / 100) * 12) + 3 >= (i % 100) + ((i / 100) * 12)) {
                w0();
            }
        }
    }

    public final void t0(int i, int i2) {
        int i3;
        if (this.c0 != null) {
            i3 = hl.L(50.0f);
        } else {
            i3 = 0;
        }
        eg0.g(this.b, i, i2, hl.L(42.0f) + a.getCurrentActionBarHeight(), i3);
        gb0 gb0Var = this.c0;
        if (gb0Var != null) {
            gb0Var.setTranslationY((-i2) - hl.L(6.0f));
        }
    }

    public final void u0(TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray;
        long j;
        long j2;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            int i = 0;
            while (true) {
                int size = tL_messages_searchResultsCalendar.periods.size();
                sparseArray = this.T;
                j = 1000;
                if (i >= size) {
                    break;
                }
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i).date * 1000);
                int i2 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i2, sparseArray2);
                }
                h81 h81Var = new h81();
                h81Var.a = new r47(this.currentAccount, tL_messages_searchResultsCalendar.messages.get(i), false, false);
                h81Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i3 = this.V + tL_messages_searchResultsCalendar.periods.get(i).count;
                this.V = i3;
                h81Var.c = i3;
                int i4 = calendar.get(5) - 1;
                if (sparseArray2.get(i4, null) == null || !((h81) sparseArray2.get(i4, null)).g) {
                    sparseArray2.put(i4, h81Var);
                }
                int i5 = this.X;
                if (i2 < i5 || i5 == 0) {
                    this.X = i2;
                }
                i++;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i6 = tL_messages_searchResultsCalendar.min_date;
            this.d0 = i6;
            while (true) {
                calendar.setTimeInMillis(i6 * j);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                j2 = j;
                if (calendar.getTimeInMillis() / j > currentTimeMillis) {
                    break;
                }
                int i7 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray3 = (SparseArray) sparseArray.get(i7);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray.put(i7, sparseArray3);
                }
                int i8 = calendar.get(5) - 1;
                if (sparseArray3.get(i8, null) == null) {
                    h81 h81Var2 = new h81();
                    h81Var2.g = false;
                    h81Var2.h = (int) (calendar.getTimeInMillis() / j2);
                    sparseArray3.put(i8, h81Var2);
                }
                i6 += 86400;
                j = j2;
            }
            this.F = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                this.W = ((TLRPC.Message) c00.g(1, tL_messages_searchResultsCalendar.messages)).id;
                this.U = false;
                s0();
            } else {
                this.U = true;
            }
            if (this.Z) {
                this.G = true;
            }
            this.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / j2) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            this.M.l(0, this.L);
            int i9 = this.L;
            if (timeInMillis > i9) {
                this.M.p(i9 + 1, timeInMillis);
                this.L = timeInMillis;
            }
            if (this.U) {
                resumeDelayedFragmentAnimation();
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        if (!this.F && !this.U) {
            if (this.g0 != null) {
                z0();
                this.g0.p(100, false);
                this.F = this.g0.k();
                return;
            }
            this.F = true;
            TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
            byte b = this.Y;
            if (b == 1) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
            } else if (b == 2) {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
            } else {
                tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
            }
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().j1(this.y);
            if (this.E != 0 && this.y == getUserConfig().e()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().j1(this.E);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.W;
            Calendar calendar = Calendar.getInstance();
            this.b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new ql(this, calendar, (byte) 9));
        }
    }

    public final void x0() {
        if (this.w == null) {
            return;
        }
        int measuredWidth = (int) (this.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (this.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.w.setBackground(new BitmapDrawable(createBitmap));
        this.w.setAlpha(0.0f);
        this.w.setVisibility(0);
    }

    public final void y0() {
        this.e.setColor(-1);
        int i = aob.G6;
        this.d.setColor(aob.w0(null, i, false));
        this.f.setColor(aob.w0(null, i, false));
        this.I.a(aob.w0(null, i, false));
    }

    public final void z0() {
        this.F = this.g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.d0 = Integer.MAX_VALUE;
        for (int i = 0; i < this.g0.i.size(); i++) {
            r47 r47Var = (r47) this.g0.i.get(i);
            this.d0 = Math.min(this.d0, r47Var.k.date);
            calendar.setTimeInMillis(r47Var.k.date * 1000);
            int i2 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i2, sparseArray2);
            }
            int i3 = calendar.get(5) - 1;
            h81 h81Var = (h81) sparseArray2.get(i3);
            if (h81Var == null) {
                h81Var = new h81();
                h81Var.b = new ArrayList();
            }
            h81Var.b.add(Integer.valueOf(r47Var.e1()));
            h81Var.a = r47Var;
            h81Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i3, h81Var);
            int i4 = this.X;
            if (i2 < i4 || i4 == 0) {
                this.X = i2;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i5 = this.d0; i5 < currentTimeMillis; i5 += 86400) {
            calendar.setTimeInMillis(i5 * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i6 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray3 = (SparseArray) sparseArray.get(i6);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray();
                sparseArray.put(i6, sparseArray3);
            }
            int i7 = calendar.get(5) - 1;
            if (sparseArray3.get(i7, null) == null) {
                h81 h81Var2 = new h81();
                h81Var2.g = false;
                h81Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i7, h81Var2);
            }
        }
        this.U = this.g0.r;
        if (this.Z) {
            this.G = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.d0) / 2629800)) + 1;
        this.M.l(0, this.L);
        int i8 = this.L;
        if (timeInMillis > i8) {
            this.M.p(i8 + 1, timeInMillis);
            this.L = timeInMillis;
        }
        if (this.U) {
            resumeDelayedFragmentAnimation();
        }
    }
}
