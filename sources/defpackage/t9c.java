package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class t9c extends mz0 implements jm7 {
    public final byte S1;
    public final hi7 T1;
    public final gi7 U1;
    public final xd9 V1;
    public final fi7 W1;
    public final jh2 X1;
    public final ds0 Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final HashSet b2;
    public final ArrayList c2;
    public final ArrayList d2;
    public final ArrayList e2;
    public final HashMap f2;
    public final ArrayList g2;
    public final LinkedHashMap h2;
    public String i2;
    public v0a j2;
    public int k2;
    public final ArrayList l2;
    public boolean m2;
    public float n2;
    public ph2 o2;
    public final zka p2;
    public int q2;
    public v55 r2;
    public final HashSet s2;
    public jac t2;

    public t9c(Activity activity, int i, q63 q63Var) {
        super(activity, null, true, false, q63Var);
        this.Z1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.a2 = arrayList;
        HashSet hashSet = new HashSet();
        this.b2 = hashSet;
        this.c2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.d2 = arrayList2;
        this.e2 = new ArrayList();
        this.f2 = new HashMap();
        this.g2 = new ArrayList();
        this.h2 = new LinkedHashMap();
        this.k2 = gm.L(120.0f);
        this.l2 = new ArrayList();
        this.m2 = false;
        this.p2 = new zka(this, (byte) 10);
        this.q2 = -1;
        this.s2 = new HashSet();
        this.a = i;
        int i2 = cmb.g5;
        L(i2);
        this.s = false;
        this.S1 = (byte) 4;
        v0a v0aVar = this.j2;
        if (v0aVar != null) {
            v0aVar.y = true;
        }
        fi7 fi7Var = new fi7(getContext(), q63Var, (byte) 1);
        this.W1 = fi7Var;
        fi7Var.setOnCloseClickListener(new n9c(this, (byte) 10));
        fi7Var.setText(J0());
        fi7Var.setCloseImageVisible(false);
        fi7Var.f.c(false, 0.0f);
        this.o2 = new ph2(this, (byte) 4);
        gi7 gi7Var = new gi7(this, getContext(), q63Var, (byte) 1);
        this.U1 = gi7Var;
        anb.h(i2, q63Var, gi7Var);
        gi7Var.setOnSearchTextChange(new o9c(this, (byte) 1));
        hashSet.isEmpty();
        gi7Var.b.r(jb6.M0(2131745570, null), false);
        xd9 xd9Var = new xd9((byte) 15, getContext(), this);
        this.V1 = xd9Var;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(fi7Var, 0, qoe.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(gi7Var, qoe.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(xd9Var, qoe.f(1.0f, -1, 55, i5, 0, i5, 0));
        ds0 ds0Var = new ds0(getContext(), q63Var, (r59) null);
        this.Y1 = ds0Var;
        ds0Var.setClickable(true);
        ds0Var.setOrientation(1);
        ds0Var.setPadding(gm.L(10.0f), gm.L(10.0f), gm.L(10.0f), gm.L(10.0f));
        anb.h(i2, q63Var, ds0Var);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(gm.L(12.0f), gm.L(4.0f), gm.L(12.0f), gm.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i6 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i6, this.J0), 6, 6);
        wmb M = anb.M(i6);
        linearLayout.setBackground(Y);
        anb.j(linearLayout, Y, null, M, q63Var);
        jh2 jh2Var = new jh2(24, q63Var, activity);
        this.X1 = jh2Var;
        jh2Var.b(cmb.Ei, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(false, false);
        jh2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        anb.X(textView, cmb.i5, q63Var);
        ts2.q(14.0f, 1, 2131751762, textView, null);
        linearLayout.addView(textView, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        rve.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final t9c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                jh2 jh2Var2;
                byte b = r2;
                t9c t9cVar = this.b;
                boolean z = true;
                switch (b) {
                    case 0:
                        t9cVar.X1.a(!jh2Var2.a.q, true);
                        return;
                    default:
                        byte b2 = t9cVar.S1;
                        ArrayList arrayList3 = t9cVar.l2;
                        HashSet hashSet2 = t9cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b2 == 0 || b2 == 2 || b2 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : t9cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gm.t1(t9cVar.U1.getEditText());
                                if (b2 != 1) {
                                    if (b2 == 4) {
                                        jac jacVar = t9cVar.t2;
                                        if (jacVar != null) {
                                            jh2 jh2Var3 = t9cVar.X1;
                                            jacVar.a(Boolean.valueOf((jh2Var3 == null || !jh2Var3.a.q) ? false : false), hashSet2);
                                            t9cVar.t2 = null;
                                        }
                                        t9cVar.dismiss();
                                        return;
                                    }
                                    List d = oo0.d(oo0.c(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j = ((TLRPC.User) arrayList4.get(0)).id;
                                        if (m9c.b(j)) {
                                            b10.u(jb6.a0(null, null, 2131743429, pg3.s(j)), new c41(t9cVar.c, t9cVar.J0), 2131624012, 36);
                                            return;
                                        }
                                        ux4 ux4Var = new ux4(t9cVar.getContext(), t9cVar.a, j, d, new o9c(t9cVar, (byte) 0));
                                        ux4Var.a1(false);
                                        ux4Var.show();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ds0Var.addView(linearLayout, qoe.t(-2, -2, 17, 0, 0, 0, 8));
        hi7 hi7Var = new hi7(this, getContext(), q63Var, (byte) 1);
        this.T1 = hi7Var;
        ds0Var.setAlpha(0.0f);
        ds0Var.setVisibility(8);
        hi7Var.setOnClickListener(new View.OnClickListener(this) {
            public final t9c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                jh2 jh2Var2;
                byte b = r2;
                t9c t9cVar = this.b;
                boolean z = true;
                switch (b) {
                    case 0:
                        t9cVar.X1.a(!jh2Var2.a.q, true);
                        return;
                    default:
                        byte b2 = t9cVar.S1;
                        ArrayList arrayList3 = t9cVar.l2;
                        HashSet hashSet2 = t9cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b2 == 0 || b2 == 2 || b2 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : t9cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gm.t1(t9cVar.U1.getEditText());
                                if (b2 != 1) {
                                    if (b2 == 4) {
                                        jac jacVar = t9cVar.t2;
                                        if (jacVar != null) {
                                            jh2 jh2Var3 = t9cVar.X1;
                                            jacVar.a(Boolean.valueOf((jh2Var3 == null || !jh2Var3.a.q) ? false : false), hashSet2);
                                            t9cVar.t2 = null;
                                        }
                                        t9cVar.dismiss();
                                        return;
                                    }
                                    List d = oo0.d(oo0.c(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j = ((TLRPC.User) arrayList4.get(0)).id;
                                        if (m9c.b(j)) {
                                            b10.u(jb6.a0(null, null, 2131743429, pg3.s(j)), new c41(t9cVar.c, t9cVar.J0), 2131624012, 36);
                                            return;
                                        }
                                        ux4 ux4Var = new ux4(t9cVar.getContext(), t9cVar.a, j, d, new o9c(t9cVar, (byte) 0));
                                        ux4Var.a1(false);
                                        ux4Var.show();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ds0Var.addView(hi7Var, qoe.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i7 = this.u0;
        viewGroup4.addView(ds0Var, qoe.f(-2.0f, -1, 87, i7, 0, i7, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.b;
        int i8 = this.u0;
        viewGroup5.addView(frameLayout, qoe.f(300.0f, -1, 87, i8, 0, i8, gm.L(68.0f)));
        v0a v0aVar2 = this.j2;
        r59 r59Var = this.n1;
        v0aVar2.n = arrayList;
        v0aVar2.f = r59Var;
        int i9 = this.u0;
        r59Var.setPadding(i9, 0, i9, gm.L(60.0f));
        this.n1.j(new k2b(this, (byte) 6));
        this.n1.setOnItemClickListener(new s9c(this, q63Var, i));
        this.n1.setOnItemLongClickListener(new s9c(this));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.n1.setItemAnimator(sc3Var);
        this.n1.i(new ks(this, (byte) 10));
        gi7Var.setText("");
        gi7Var.d.b(false);
        gi7Var.b(false, hashSet, new n9c(this, (byte) 11), null);
        fi7Var.setText(J0());
        iz0 iz0Var = this.o1;
        if (iz0Var != null) {
            iz0Var.setTitle(J0());
        }
        e1(false);
        c1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(hs6.d0(this.a).j1);
        }
        g1(false, true);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        v0a v0aVar = new v0a(this.J0, getContext(), false);
        this.j2 = v0aVar;
        v0aVar.s = true;
        return v0aVar;
    }

    @Override
    public final void H() {
        super.H();
        gm.r(this.p2);
    }

    @Override
    public final CharSequence J0() {
        byte b = this.S1;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 4) {
                        return jb6.M0(2131749374, null);
                    }
                    return jb6.M0(2131743109, null);
                }
            } else {
                return jb6.M0(2131749381, null);
            }
        }
        return jb6.M0(2131749375, null);
    }

    @Override
    public final void M0(Canvas canvas, int i) {
        float max = Math.max(i, gm.m - gm.L(8.0f)) + gm.L(8.0f);
        fi7 fi7Var = this.W1;
        fi7Var.setTranslationY(max);
        float translationY = fi7Var.getTranslationY() + fi7Var.getMeasuredHeight();
        gi7 gi7Var = this.U1;
        gi7Var.setTranslationY(translationY);
        float translationY2 = gi7Var.getTranslationY() + gi7Var.getMeasuredHeight();
        xd9 xd9Var = this.V1;
        xd9Var.setTranslationY(translationY2);
        int measuredHeight = gi7Var.getMeasuredHeight() + fi7Var.getMeasuredHeight();
        this.n1.setTranslationY((xd9Var.getMeasuredHeight() + measuredHeight) - gm.L(8.0f));
    }

    public final void Y0() {
        byte b;
        if (this.b2.isEmpty() && (b = this.S1) != 1 && b != 2 && b != 4) {
            if (this.m2) {
                this.m2 = false;
                gm.d3(new n9c(this, (byte) 4), 10L);
            }
        } else if (!this.m2) {
            this.m2 = true;
            gm.d3(new n9c(this, (byte) 3), 10L);
        }
    }

    @Override
    public final void Z(Configuration configuration) {
        f1(false, true);
    }

    public final void Z0() {
        if (!TextUtils.isEmpty(this.i2)) {
            this.i2 = null;
            this.U1.setText("");
            gm.r(this.p2);
            f1(true, true);
        }
    }

    public final u0a a1(u0a u0aVar) {
        TLRPC.User user = u0aVar.c;
        if (this.S1 == 4) {
            if (user == null) {
                return u0aVar;
            }
            final long j = user.id;
            ?? r2 = new View.OnClickListener(this) {
                public final t9c b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r4;
                    long j2 = j;
                    t9c t9cVar = this.b;
                    switch (b) {
                        case 0:
                            HashSet hashSet = t9cVar.b2;
                            hashSet.add(Long.valueOf(j2));
                            jac jacVar = t9cVar.t2;
                            if (jacVar != null) {
                                jacVar.a(Boolean.FALSE, hashSet);
                                t9cVar.t2 = null;
                            }
                            t9cVar.dismiss();
                            return;
                        default:
                            HashSet hashSet2 = t9cVar.b2;
                            hashSet2.add(Long.valueOf(j2));
                            jac jacVar2 = t9cVar.t2;
                            if (jacVar2 != null) {
                                jacVar2.a(Boolean.TRUE, hashSet2);
                                t9cVar.t2 = null;
                            }
                            t9cVar.dismiss();
                            return;
                    }
                }
            };
            ?? r3 = new View.OnClickListener(this) {
                public final t9c b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r4;
                    long j2 = j;
                    t9c t9cVar = this.b;
                    switch (b) {
                        case 0:
                            HashSet hashSet = t9cVar.b2;
                            hashSet.add(Long.valueOf(j2));
                            jac jacVar = t9cVar.t2;
                            if (jacVar != null) {
                                jacVar.a(Boolean.FALSE, hashSet);
                                t9cVar.t2 = null;
                            }
                            t9cVar.dismiss();
                            return;
                        default:
                            HashSet hashSet2 = t9cVar.b2;
                            hashSet2.add(Long.valueOf(j2));
                            jac jacVar2 = t9cVar.t2;
                            if (jacVar2 != null) {
                                jacVar2.a(Boolean.TRUE, hashSet2);
                                t9cVar.t2 = null;
                            }
                            t9cVar.dismiss();
                            return;
                    }
                }
            };
            u0aVar.n = r2;
            u0aVar.o = r3;
            return u0aVar;
        }
        u0aVar.m = new fyb(this, user, (byte) 8);
        return u0aVar;
    }

    public final int b1() {
        if (this.S1 == 4) {
            return Math.max(0, (oc7.r1(this.a).l4.w3.f() - this.s2.size()) - 1);
        }
        return 10;
    }

    public final void c1(boolean z) {
        ArrayList arrayList = this.c2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(bw2.r(this.a).f0);
            this.f2.putAll(bw2.r(this.a).h0);
            this.g2.addAll(bw2.r(this.a).i0);
            if (z) {
                f1(true, true);
            }
        }
    }

    public final void d1() {
        String M0;
        if (this.S1 == 4) {
            M0 = jb6.H(',', "UserSelectorLimit", b1());
        } else {
            M0 = jb6.M0(2131753237, null);
        }
        ylb ylbVar = this.J0;
        dy0 dy0Var = this.c;
        new c41(dy0Var, ylbVar).Q(2131623982, 36, M0).k(true);
        try {
            dy0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.U2) {
            dismiss();
        } else if (i == nm7.N) {
            gm.c3(new n9c(this, (byte) 0));
        } else if (i == nm7.S0) {
            gm.c3(new n9c(this, (byte) 6));
        } else if (i == nm7.E0) {
            gm.c3(new n9c(this, (byte) 9));
        }
    }

    @Override
    public final void dismiss() {
        gm.t1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z) {
        hi7 hi7Var = this.T1;
        boolean z2 = false;
        hi7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b = this.S1;
        HashSet hashSet = this.b2;
        if (b == 4) {
            spannableStringBuilder.append((CharSequence) jb6.M0(2131752576, null));
        } else if (hashSet.size() == 0) {
            if (jb6.a0) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131749451, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) jb6.M0(2131749451, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) jb6.M0(2131749438, "GiftPremiumProceedBtn"));
        }
        hi7Var.c(hashSet.size(), true);
        hi7Var.i(spannableStringBuilder, z, false);
        if (hashSet.size() > 0) {
            z2 = true;
        }
        hi7Var.setEnabled(z2);
    }

    public final void f1(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9c.f1(boolean, boolean):void");
    }

    public final void g1(boolean z, boolean z2) {
        int R;
        int R2;
        f1(z, z2);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            r59 r59Var = this.n1;
            if (i2 >= r59Var.getChildCount()) {
                break;
            }
            View childAt = r59Var.getChildAt(i2);
            if ((childAt instanceof m1a) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.a2;
                if (R2 < arrayList.size()) {
                    if (i == -1) {
                        i = R;
                    }
                    m1a m1aVar = (m1a) childAt;
                    m1aVar.c(((u0a) arrayList.get(R2)).j, z);
                    m1aVar.i(z, 1.0f);
                    i3 = R;
                }
            }
            i2++;
        }
        if (z) {
            this.j2.l(0, i);
            v0a v0aVar = this.j2;
            v0aVar.l(i3, v0aVar.b() - i3);
        }
        e1(z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.U2);
        nm7.f(this.a).b(this, nm7.E0);
        nm7.f(this.a).b(this, nm7.N);
        nm7.f(this.a).b(this, nm7.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.U2);
        nm7.f(this.a).n(this, nm7.E0);
        nm7.f(this.a).n(this, nm7.N);
        nm7.f(this.a).n(this, nm7.S0);
    }

    @Override
    public final void p0() {
        super.p0();
        r59 r59Var = this.n1;
        if (r59Var != null) {
            for (int i = 0; i < r59Var.getChildCount(); i++) {
                try {
                    r59Var.getChildAt(i).invalidate();
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
        }
    }
}
