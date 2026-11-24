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
import org.telegram.ui.ActionBar.d;
public final class b81 extends d implements gk7 {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ed0 I;
    public int J;
    public int K;
    public int L;
    public jr M;
    public v39 N;
    public mu1 O;
    public je5 P;
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
    public r71 a;
    public final int a0;
    public fu b;
    public final int b0;
    public t26 c;
    public eb0 c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public boolean e0;
    public final TextPaint f;
    public int f0;
    public y1b g0;
    public TextView h;
    public i4d h0;
    public int i0;
    public sg0 j0;
    public s71 k0;
    public View l0;
    public final Path m0;
    public TextView n;
    public final qla n0;
    public int o0;
    public boolean p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public int s0;
    public sb w;
    public final Paint x;
    public long y;

    public b81(int i, int i2, Bundle bundle) {
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
        this.n0 = new qla();
        this.Y = i;
        if (i2 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i2 * 1000);
            this.a0 = calendar.get(1);
            this.b0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.L(2.0f));
    }

    public final void A0() {
        int abs;
        boolean z;
        String M0;
        TextView textView;
        je5 je5Var;
        if (!this.e0) {
            this.simpleActionBar.setTitle(k96.M0(2131752630, null));
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
            M0 = k96.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z3) {
            M0 = k96.M0(2131745468, null);
            this.I.c(true, 1.0f);
        } else {
            M0 = k96.M0(2131752630, null);
            this.I.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.n.setText(k96.a0("ClearHistoryForTheseDays", null, 2131752075, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.n.setText(k96.a0("ClearHistoryForThisDay", null, 2131752074, new Object[0]));
        }
        eb0 eb0Var = this.c0;
        if (abs <= 0 && !this.H) {
            textView = this.h;
        } else {
            textView = this.n;
        }
        eb0Var.a(textView, true);
        pha phaVar = this.simpleActionBar;
        phaVar.getClass();
        phaVar.I(str, z, 150L, s33.h);
        if ((!this.H || abs > 0) && (je5Var = this.P) != null) {
            je5Var.f(true);
        }
        if (abs <= 0 && !this.H) {
            if (this.h.getVisibility() == 8) {
                this.h.setAlpha(0.0f);
                this.h.setTranslationY(gl.L(20.0f));
            }
            this.h.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(1.0f).translationY(0.0f).start();
            this.n.animate().alpha(0.0f).translationY(-gl.L(20.0f)).setDuration(150L).setListener(new id4(this.n)).start();
            this.h.setEnabled(true);
            this.n.setEnabled(false);
            return;
        }
        if (this.n.getVisibility() == 8) {
            this.n.setAlpha(0.0f);
            this.n.setTranslationY(-gl.L(20.0f));
        }
        this.n.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.n.animate().setListener(null).cancel();
        this.h.animate().alpha(0.0f).translationY(gl.L(20.0f)).setDuration(150L).setListener(new id4(this.h)).start();
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
        textPaint.setTextSize(gl.L(16.0f));
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.f;
        textPaint2.setTextSize(gl.L(11.0f));
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(gl.o());
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(gl.L(16.0f));
        textPaint3.setTypeface(gl.o());
        textPaint3.setTextAlign(align);
        r71 r71Var = new r71(this, context);
        this.a = r71Var;
        r71Var.setBackgroundColor(getThemedColor(bkb.Z6));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(k96.M0(2131752630, null));
        fu fuVar = new fu((byte) 4, context, this);
        this.b = fuVar;
        t26 t26Var = new t26();
        this.c = t26Var;
        fuVar.setLayoutManager(t26Var);
        this.c.j1(true);
        fu fuVar2 = this.b;
        jr jrVar = new jr(this, (byte) 2);
        this.M = jrVar;
        fuVar2.setAdapter(jrVar);
        this.b.j(new y(this, (byte) 12));
        if (this.f0 == 0 && this.e0) {
            z = true;
        } else {
            z = false;
        }
        r71 r71Var2 = this.a;
        fu fuVar3 = this.b;
        if (z) {
            f = 48.0f;
        } else {
            f = 0.0f;
        }
        r71Var2.addView(fuVar3, nme.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, f));
        s71 s71Var = new s71(this, context, new String[]{k96.M0(2131752628, null), k96.M0(2131752624, null), k96.M0(2131752623, null), k96.M0(2131752625, null), k96.M0(2131752629, null), k96.M0(2131752627, null), k96.M0(2131752626, null)}, (byte) 0);
        this.k0 = s71Var;
        s71Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
        s71 s71Var2 = this.k0;
        il0 c = getBaseSimpleGlass().c.c(this.k0, null, false);
        c.p(nod.l(this.resourceProvider));
        c.q(gl.L(9.66f));
        c.r(gl.L(18.0f));
        s71Var2.setBackground(c);
        this.k0.setTranslationY(dg0.d(0) - gl.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 14));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i = calendar.get(2);
        this.K = i;
        int i2 = this.a0;
        if (i2 != 0) {
            int h = oo1.h(this.J, i2, 12, i) - this.b0;
            this.L = h + 1;
            this.c.g1(h, gl.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        ed0 ed0Var = new ed0(false);
        this.I = ed0Var;
        this.simpleActionBar.setBackButtonDrawable(ed0Var);
        this.I.c(false, 0.0f);
        v0();
        x0();
        textPaint3.setColor(-1);
        if (z) {
            this.c0 = new eb0(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(gl.o());
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final b81 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            b81 b81Var = this.b;
                            b81Var.H = true;
                            b81Var.A0();
                            return;
                        default:
                            b81 b81Var2 = this.b;
                            int i3 = b81Var2.o0;
                            if (i3 == 0) {
                                if (b81Var2.P == null) {
                                    je5 je5Var = new je5(b81Var2.a.getContext(), 3);
                                    je5Var.p(true);
                                    je5Var.h = gl.L(310.0f);
                                    je5Var.d = 2300L;
                                    je5Var.U = true;
                                    je5Var.e = true;
                                    je5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                                    je5Var.v0 = -gl.L(10.0f);
                                    b81Var2.P = je5Var;
                                    je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                                    b81Var2.P.k(b81Var2.getBaseSimpleGlass().c);
                                    b81Var2.a.addView(b81Var2.P, nme.e(-1, 150, 55));
                                    b81Var2.P.t(k96.M0(2131745467, null));
                                }
                                b81Var2.P.x(b81Var2.c0, true);
                                return;
                            }
                            ij.q(b81Var2, i3, b81Var2.getMessagesController().V1(Long.valueOf(b81Var2.y)), null, false, new lj9(b81Var2, (byte) 13), null);
                            return;
                    }
                }
            });
            this.h.setText(k96.M0(2131745468, null));
            this.c0.addView(this.h, nme.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(gl.o());
            this.n.setOnClickListener(new View.OnClickListener(this) {
                public final b81 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            b81 b81Var = this.b;
                            b81Var.H = true;
                            b81Var.A0();
                            return;
                        default:
                            b81 b81Var2 = this.b;
                            int i3 = b81Var2.o0;
                            if (i3 == 0) {
                                if (b81Var2.P == null) {
                                    je5 je5Var = new je5(b81Var2.a.getContext(), 3);
                                    je5Var.p(true);
                                    je5Var.h = gl.L(310.0f);
                                    je5Var.d = 2300L;
                                    je5Var.U = true;
                                    je5Var.e = true;
                                    je5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                                    je5Var.v0 = -gl.L(10.0f);
                                    b81Var2.P = je5Var;
                                    je5Var.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                                    b81Var2.P.k(b81Var2.getBaseSimpleGlass().c);
                                    b81Var2.a.addView(b81Var2.P, nme.e(-1, 150, 55));
                                    b81Var2.P.t(k96.M0(2131745467, null));
                                }
                                b81Var2.P.x(b81Var2.c0, true);
                                return;
                            }
                            ij.q(b81Var2, i3, b81Var2.getMessagesController().V1(Long.valueOf(b81Var2.y)), null, false, new lj9(b81Var2, (byte) 13), null);
                            return;
                    }
                }
            });
            this.n.setVisibility(8);
            this.c0.addView(this.n, nme.e(-2, 38, 17));
            this.a.addView(this.c0, nme.e(-1, 50, 80));
            this.c0.a(this.h, false);
            int L = gl.L(19.0f);
            TextView textView3 = this.h;
            int i3 = bkb.rf;
            zkb.R(textView3, bkb.Y(bm2.o(bkb.w0(null, i3, false), 51), L, L), null, zkb.g(i3, 51), null);
            TextView textView4 = this.n;
            int i4 = bkb.p7;
            zkb.R(textView4, bkb.Y(bm2.o(bkb.w0(null, i4, false), 51), L, L), null, zkb.g(i4, 51), null);
            zkb.X(this.h, i3, null);
            zkb.X(this.n, i4, null);
        }
        View view = new View(context);
        this.l0 = view;
        this.a.addView(view, nme.e(-1, 0, 48));
        this.l0.getLayoutParams().height = gl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.k0, nme.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.z5 && this.g0 == ((y1b) objArr[0])) {
            y0();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i = bkb.a;
        int i2 = bkb.a;
        int i3 = bkb.a;
        return super.getThemeDescriptions();
    }

    @Override
    public final boolean isLightStatusBar() {
        if (bm2.h(bkb.w0(null, bkb.c6, true)) > 0.699999988079071d) {
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
                A0();
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
            this.g0 = na7.q1(this.currentAccount).M1().z(0, -1, this.y, true);
        } else if (i == 3) {
            this.g0 = na7.q1(this.currentAccount).M1().z(1, -1, this.y, true);
        }
        y1b y1bVar = this.g0;
        if (y1bVar != null) {
            this.h0 = new i4d(this);
        }
        if (this.y >= 0) {
            this.e0 = true;
        } else {
            this.e0 = false;
        }
        if (y1bVar != null) {
            kk7.f(this.currentAccount).b(this, kk7.z5);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.g0 != null) {
            kk7.f(this.currentAccount).n(this, kk7.z5);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.l0.getLayoutParams().height = gl.L(44.0f) + a.getCurrentActionBarHeight() + i2;
        this.k0.setTranslationY(dg0.d(i2) - gl.L(9.66f));
        t0(i2, i4);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar != null && this.I != null && this.d != null && this.f != null && this.e != null) {
            int w0 = bkb.w0(null, bkb.c6, false);
            int w02 = bkb.w0(null, bkb.F6, false);
            int w03 = bkb.w0(null, bkb.h6, false);
            if (w0 != this.q0 || w02 != this.r0 || w03 != this.s0) {
                this.q0 = w0;
                this.r0 = w02;
                this.s0 = w03;
                x0();
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        sb sbVar;
        if (z && (sbVar = this.w) != null && sbVar.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.setBackground(null);
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        sb sbVar = this.w;
        if (sbVar != null && sbVar.getVisibility() == 0) {
            sb sbVar2 = this.w;
            if (z) {
                sbVar2.setAlpha(1.0f - f);
            } else {
                sbVar2.setAlpha(f);
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
        io5 io5Var = this.mSystemInsets;
        t0(io5Var.b, io5Var.d);
    }

    public final void r0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(s33.f);
        duration.addUpdateListener(new f0(this, (byte) 22));
        duration.addListener(new g0(this, (byte) 28));
        duration.start();
        this.S = duration;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            z0((y71) this.b.getChildAt(i), true);
        }
        for (int i2 = 0; i2 < this.b.getCachedChildCount(); i2++) {
            y71 y71Var = (y71) this.b.P(i2);
            z0(y71Var, false);
            int i3 = this.Q;
            int i4 = this.R;
            int i5 = y71.E;
            y71Var.c(i3, i4);
            y71Var.b(1.0f);
        }
        for (int i6 = 0; i6 < this.b.getHiddenChildCount(); i6++) {
            y71 y71Var2 = (y71) this.b.W(i6);
            z0(y71Var2, false);
            int i7 = this.Q;
            int i8 = this.R;
            int i9 = y71.E;
            y71Var2.c(i7, i8);
            y71Var2.b(1.0f);
        }
        for (int i10 = 0; i10 < this.b.getAttachedScrapChildCount(); i10++) {
            y71 y71Var3 = (y71) this.b.O(i10);
            z0(y71Var3, false);
            int i11 = this.Q;
            int i12 = this.R;
            int i13 = y71.E;
            y71Var3.c(i11, i12);
            y71Var3.b(1.0f);
        }
    }

    public final void s0() {
        if (!this.F && !this.U) {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
                View childAt = this.b.getChildAt(i2);
                if (childAt instanceof y71) {
                    y71 y71Var = (y71) childAt;
                    int i3 = (y71Var.b * 100) + y71Var.c;
                    if (i3 < i) {
                        i = i3;
                    }
                }
            }
            int i4 = this.X;
            if ((i4 % 100) + ((i4 / 100) * 12) + 3 >= (i % 100) + ((i / 100) * 12)) {
                v0();
            }
        }
    }

    public final void t0(int i, int i2) {
        int i3;
        if (this.c0 != null) {
            i3 = gl.L(50.0f);
        } else {
            i3 = 0;
        }
        dg0.e(this.b, i, i2, gl.L(42.0f) + a.getCurrentActionBarHeight(), i3);
        eb0 eb0Var = this.c0;
        if (eb0Var != null) {
            eb0Var.setTranslationY((-i2) - gl.L(6.0f));
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
                z71 z71Var = new z71();
                z71Var.a = new k27(this.currentAccount, tL_messages_searchResultsCalendar.messages.get(i), false, false);
                z71Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i3 = this.V + tL_messages_searchResultsCalendar.periods.get(i).count;
                this.V = i3;
                z71Var.c = i3;
                int i4 = calendar.get(5) - 1;
                if (sparseArray2.get(i4, null) == null || !((z71) sparseArray2.get(i4, null)).g) {
                    sparseArray2.put(i4, z71Var);
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
                    z71 z71Var2 = new z71();
                    z71Var2.g = false;
                    z71Var2.h = (int) (calendar.getTimeInMillis() / j2);
                    sparseArray3.put(i8, z71Var2);
                }
                i6 += 86400;
                j = j2;
            }
            this.F = false;
            if (!tL_messages_searchResultsCalendar.messages.isEmpty()) {
                this.W = ((TLRPC.Message) b00.f(1, tL_messages_searchResultsCalendar.messages)).id;
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

    public final void v0() {
        if (!this.F && !this.U) {
            if (this.g0 != null) {
                y0();
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
            tL_messages_getSearchResultsCalendar.peer = getMessagesController().h1(this.y);
            if (this.E != 0 && this.y == getUserConfig().e()) {
                tL_messages_getSearchResultsCalendar.flags |= 4;
                tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().h1(this.E);
            }
            tL_messages_getSearchResultsCalendar.offset_id = this.W;
            Calendar calendar = Calendar.getInstance();
            this.b.setItemAnimator(null);
            getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new pl(this, calendar, (byte) 9));
        }
    }

    public final void w0() {
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

    public final void x0() {
        this.e.setColor(-1);
        int i = bkb.F6;
        this.d.setColor(bkb.w0(null, i, false));
        this.f.setColor(bkb.w0(null, i, false));
        this.I.a(bkb.w0(null, i, false));
    }

    public final void y0() {
        this.F = this.g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.d0 = Integer.MAX_VALUE;
        for (int i = 0; i < this.g0.i.size(); i++) {
            k27 k27Var = (k27) this.g0.i.get(i);
            this.d0 = Math.min(this.d0, k27Var.k.date);
            calendar.setTimeInMillis(k27Var.k.date * 1000);
            int i2 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i2, sparseArray2);
            }
            int i3 = calendar.get(5) - 1;
            z71 z71Var = (z71) sparseArray2.get(i3);
            if (z71Var == null) {
                z71Var = new z71();
                z71Var.b = new ArrayList();
            }
            z71Var.b.add(Integer.valueOf(k27Var.e1()));
            z71Var.a = k27Var;
            z71Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i3, z71Var);
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
                z71 z71Var2 = new z71();
                z71Var2.g = false;
                z71Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i7, z71Var2);
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

    public final void z0(y71 y71Var, boolean z) {
        int i;
        int i2;
        if (this.Q != 0 && this.R != 0) {
            if (y71Var.n != null) {
                if (!z) {
                    SparseArray sparseArray = y71Var.x;
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        y71Var.a(sparseArray.keyAt(i3), 0, 0, false, false);
                    }
                }
                int i4 = y71Var.e;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                for (int i8 = 0; i8 < y71Var.d; i8++) {
                    z71 z71Var = (z71) y71Var.n.get(i8, null);
                    if (z71Var != null && (i2 = z71Var.h) >= this.Q && i2 <= this.R) {
                        if (i5 == -1) {
                            i5 = i4;
                        }
                        i6 = i4;
                    }
                    i4++;
                    if (i4 >= 7) {
                        if (i5 != -1 && i6 != -1) {
                            i = i7;
                            y71Var.a(i, i5, i6, true, z);
                        } else {
                            i = i7;
                            y71Var.a(i, 0, 0, false, z);
                        }
                        i7 = i + 1;
                        i5 = -1;
                        i6 = -1;
                        i4 = 0;
                    }
                }
                int i9 = i7;
                if (i5 != -1 && i6 != -1) {
                    y71Var.a(i9, i5, i6, true, z);
                    return;
                } else {
                    y71Var.a(i9, 0, 0, false, z);
                    return;
                }
            }
            return;
        }
        SparseArray sparseArray2 = y71Var.x;
        for (int i10 = 0; i10 < sparseArray2.size(); i10++) {
            y71Var.a(sparseArray2.keyAt(i10), 0, 0, false, z);
        }
    }
}
