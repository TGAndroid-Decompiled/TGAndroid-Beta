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
public final class sbc extends ny0 implements fn7 {
    public final byte S1;
    public final oi7 T1;
    public final ni7 U1;
    public final nf9 V1;
    public final mi7 W1;
    public final og2 X1;
    public final dr0 Y1;
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
    public n2a j2;
    public int k2;
    public final ArrayList l2;
    public boolean m2;
    public float n2;
    public tg2 o2;
    public final bva p2;
    public int q2;
    public z55 r2;
    public final HashSet s2;
    public icc t2;

    public sbc(Activity activity, int i, w53 w53Var) {
        super(activity, null, true, false, w53Var);
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
        this.k2 = hl.L(120.0f);
        this.l2 = new ArrayList();
        this.m2 = false;
        this.p2 = new bva(this, (byte) 9);
        this.q2 = -1;
        this.s2 = new HashSet();
        this.a = i;
        int i2 = aob.h5;
        L(i2);
        this.s = false;
        this.S1 = (byte) 4;
        n2a n2aVar = this.j2;
        if (n2aVar != null) {
            n2aVar.y = true;
        }
        mi7 mi7Var = new mi7(getContext(), w53Var, (byte) 1);
        this.W1 = mi7Var;
        mi7Var.setOnCloseClickListener(new mbc(this, (byte) 10));
        mi7Var.setText(K0());
        mi7Var.setCloseImageVisible(false);
        mi7Var.f.c(false, 0.0f);
        this.o2 = new tg2(this, (byte) 4);
        ni7 ni7Var = new ni7(this, getContext(), w53Var, (byte) 1);
        this.U1 = ni7Var;
        yob.h(i2, w53Var, ni7Var);
        ni7Var.setOnSearchTextChange(new nbc(this, (byte) 1));
        hashSet.isEmpty();
        ni7Var.b.r(ob6.M0(2131745564, null), false);
        nf9 nf9Var = new nf9((byte) 15, getContext(), this);
        this.V1 = nf9Var;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(mi7Var, 0, tre.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(ni7Var, tre.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(nf9Var, tre.f(1.0f, -1, 55, i5, 0, i5, 0));
        dr0 dr0Var = new dr0(getContext(), w53Var, (d79) null);
        this.Y1 = dr0Var;
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(10.0f), hl.L(10.0f));
        yob.h(i2, w53Var, dr0Var);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(hl.L(12.0f), hl.L(4.0f), hl.L(12.0f), hl.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i6 = aob.i6;
        hf0 Y = aob.Y(aob.v0(i6, this.J0), 6, 6);
        uob M = yob.M(i6);
        linearLayout.setBackground(Y);
        yob.j(linearLayout, Y, null, M, w53Var);
        og2 og2Var = new og2(24, w53Var, activity);
        this.X1 = og2Var;
        og2Var.b(aob.Fi, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(false, false);
        og2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        yob.X(textView, aob.j5, w53Var);
        bs2.r(14.0f, 1, 2131751790, textView, null);
        linearLayout.addView(textView, tre.t(-2, -2, 16, 9, 0, 0, 0));
        iye.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final sbc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                og2 og2Var2;
                byte b = r2;
                sbc sbcVar = this.b;
                boolean z = true;
                switch (b) {
                    case 0:
                        sbcVar.X1.a(!og2Var2.a.q, true);
                        return;
                    default:
                        byte b2 = sbcVar.S1;
                        ArrayList arrayList3 = sbcVar.l2;
                        HashSet hashSet2 = sbcVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b2 == 0 || b2 == 2 || b2 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : sbcVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                hl.t1(sbcVar.U1.getEditText());
                                if (b2 != 1) {
                                    if (b2 == 4) {
                                        icc iccVar = sbcVar.t2;
                                        if (iccVar != null) {
                                            og2 og2Var3 = sbcVar.X1;
                                            iccVar.a(Boolean.valueOf((og2Var3 == null || !og2Var3.a.q) ? false : false), hashSet2);
                                            sbcVar.t2 = null;
                                        }
                                        sbcVar.dismiss();
                                        return;
                                    }
                                    List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j = ((TLRPC.User) arrayList4.get(0)).id;
                                        if (lbc.b(j)) {
                                            c00.v(ob6.a0(null, null, 2131743397, wf3.s(j)), new d31(sbcVar.c, sbcVar.J0), 2131624012, 36);
                                            return;
                                        }
                                        yx4 yx4Var = new yx4(sbcVar.getContext(), sbcVar.a, j, d, new nbc(sbcVar, (byte) 0));
                                        yx4Var.b1(false);
                                        yx4Var.show();
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
        dr0Var.addView(linearLayout, tre.t(-2, -2, 17, 0, 0, 0, 8));
        oi7 oi7Var = new oi7(this, getContext(), w53Var, (byte) 1);
        this.T1 = oi7Var;
        dr0Var.setAlpha(0.0f);
        dr0Var.setVisibility(8);
        oi7Var.setOnClickListener(new View.OnClickListener(this) {
            public final sbc b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                og2 og2Var2;
                byte b = r2;
                sbc sbcVar = this.b;
                boolean z = true;
                switch (b) {
                    case 0:
                        sbcVar.X1.a(!og2Var2.a.q, true);
                        return;
                    default:
                        byte b2 = sbcVar.S1;
                        ArrayList arrayList3 = sbcVar.l2;
                        HashSet hashSet2 = sbcVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b2 == 0 || b2 == 2 || b2 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : sbcVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                hl.t1(sbcVar.U1.getEditText());
                                if (b2 != 1) {
                                    if (b2 == 4) {
                                        icc iccVar = sbcVar.t2;
                                        if (iccVar != null) {
                                            og2 og2Var3 = sbcVar.X1;
                                            iccVar.a(Boolean.valueOf((og2Var3 == null || !og2Var3.a.q) ? false : false), hashSet2);
                                            sbcVar.t2 = null;
                                        }
                                        sbcVar.dismiss();
                                        return;
                                    }
                                    List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j = ((TLRPC.User) arrayList4.get(0)).id;
                                        if (lbc.b(j)) {
                                            c00.v(ob6.a0(null, null, 2131743397, wf3.s(j)), new d31(sbcVar.c, sbcVar.J0), 2131624012, 36);
                                            return;
                                        }
                                        yx4 yx4Var = new yx4(sbcVar.getContext(), sbcVar.a, j, d, new nbc(sbcVar, (byte) 0));
                                        yx4Var.b1(false);
                                        yx4Var.show();
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
        dr0Var.addView(oi7Var, tre.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i7 = this.u0;
        viewGroup4.addView(dr0Var, tre.f(-2.0f, -1, 87, i7, 0, i7, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.b;
        int i8 = this.u0;
        viewGroup5.addView(frameLayout, tre.f(300.0f, -1, 87, i8, 0, i8, hl.L(68.0f)));
        n2a n2aVar2 = this.j2;
        d79 d79Var = this.n1;
        n2aVar2.n = arrayList;
        n2aVar2.f = d79Var;
        int i9 = this.u0;
        d79Var.setPadding(i9, 0, i9, hl.L(60.0f));
        this.n1.j(new qhb(this, (byte) 5));
        this.n1.setOnItemClickListener(new rbc(this, w53Var, i));
        this.n1.setOnItemLongClickListener(new rbc(this));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        this.n1.i(new lr(this, (byte) 10));
        ni7Var.setText("");
        ni7Var.d.b(false);
        ni7Var.b(false, hashSet, new mbc(this, (byte) 11), null);
        mi7Var.setText(K0());
        jy0 jy0Var = this.o1;
        if (jy0Var != null) {
            jy0Var.setTitle(K0());
        }
        f1(false);
        d1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ls6.d0(this.a).j1);
        }
        h1(false, true);
    }

    @Override
    public final void H() {
        super.H();
        hl.r(this.p2);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        n2a n2aVar = new n2a(this.J0, getContext(), false);
        this.j2 = n2aVar;
        n2aVar.s = true;
        return n2aVar;
    }

    @Override
    public final CharSequence K0() {
        byte b = this.S1;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 4) {
                        return ob6.M0(2131749371, null);
                    }
                    return ob6.M0(2131743077, null);
                }
            } else {
                return ob6.M0(2131749378, null);
            }
        }
        return ob6.M0(2131749372, null);
    }

    @Override
    public final void N0(Canvas canvas, int i) {
        float max = Math.max(i, hl.m - hl.L(8.0f)) + hl.L(8.0f);
        mi7 mi7Var = this.W1;
        mi7Var.setTranslationY(max);
        float translationY = mi7Var.getTranslationY() + mi7Var.getMeasuredHeight();
        ni7 ni7Var = this.U1;
        ni7Var.setTranslationY(translationY);
        float translationY2 = ni7Var.getTranslationY() + ni7Var.getMeasuredHeight();
        nf9 nf9Var = this.V1;
        nf9Var.setTranslationY(translationY2);
        int measuredHeight = ni7Var.getMeasuredHeight() + mi7Var.getMeasuredHeight();
        this.n1.setTranslationY((nf9Var.getMeasuredHeight() + measuredHeight) - hl.L(8.0f));
    }

    @Override
    public final void Z(Configuration configuration) {
        g1(false, true);
    }

    public final void Z0() {
        byte b;
        if (this.b2.isEmpty() && (b = this.S1) != 1 && b != 2 && b != 4) {
            if (this.m2) {
                this.m2 = false;
                hl.d3(new mbc(this, (byte) 4), 10L);
            }
        } else if (!this.m2) {
            this.m2 = true;
            hl.d3(new mbc(this, (byte) 3), 10L);
        }
    }

    public final void a1() {
        if (!TextUtils.isEmpty(this.i2)) {
            this.i2 = null;
            this.U1.setText("");
            hl.r(this.p2);
            g1(true, true);
        }
    }

    public final m2a b1(m2a m2aVar) {
        TLRPC.User user = m2aVar.c;
        if (this.S1 == 4) {
            if (user == null) {
                return m2aVar;
            }
            final long j = user.id;
            ?? r2 = new View.OnClickListener(this) {
                public final sbc b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r4;
                    long j2 = j;
                    sbc sbcVar = this.b;
                    switch (b) {
                        case 0:
                            HashSet hashSet = sbcVar.b2;
                            hashSet.add(Long.valueOf(j2));
                            icc iccVar = sbcVar.t2;
                            if (iccVar != null) {
                                iccVar.a(Boolean.FALSE, hashSet);
                                sbcVar.t2 = null;
                            }
                            sbcVar.dismiss();
                            return;
                        default:
                            HashSet hashSet2 = sbcVar.b2;
                            hashSet2.add(Long.valueOf(j2));
                            icc iccVar2 = sbcVar.t2;
                            if (iccVar2 != null) {
                                iccVar2.a(Boolean.TRUE, hashSet2);
                                sbcVar.t2 = null;
                            }
                            sbcVar.dismiss();
                            return;
                    }
                }
            };
            ?? r3 = new View.OnClickListener(this) {
                public final sbc b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r4;
                    long j2 = j;
                    sbc sbcVar = this.b;
                    switch (b) {
                        case 0:
                            HashSet hashSet = sbcVar.b2;
                            hashSet.add(Long.valueOf(j2));
                            icc iccVar = sbcVar.t2;
                            if (iccVar != null) {
                                iccVar.a(Boolean.FALSE, hashSet);
                                sbcVar.t2 = null;
                            }
                            sbcVar.dismiss();
                            return;
                        default:
                            HashSet hashSet2 = sbcVar.b2;
                            hashSet2.add(Long.valueOf(j2));
                            icc iccVar2 = sbcVar.t2;
                            if (iccVar2 != null) {
                                iccVar2.a(Boolean.TRUE, hashSet2);
                                sbcVar.t2 = null;
                            }
                            sbcVar.dismiss();
                            return;
                    }
                }
            };
            m2aVar.n = r2;
            m2aVar.o = r3;
            return m2aVar;
        }
        m2aVar.m = new jjb(this, user, (byte) 10);
        return m2aVar;
    }

    public final int c1() {
        if (this.S1 == 4) {
            return Math.max(0, (uc7.s1(this.a).l4.E3.f() - this.s2.size()) - 1);
        }
        return 10;
    }

    public final void d1(boolean z) {
        ArrayList arrayList = this.c2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(lv2.r(this.a).f0);
            this.f2.putAll(lv2.r(this.a).h0);
            this.g2.addAll(lv2.r(this.a).i0);
            if (z) {
                g1(true, true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.U2) {
            dismiss();
        } else if (i == jn7.N) {
            hl.c3(new mbc(this, (byte) 0));
        } else if (i == jn7.S0) {
            hl.c3(new mbc(this, (byte) 7));
        } else if (i == jn7.E0) {
            hl.c3(new mbc(this, (byte) 9));
        }
    }

    @Override
    public final void dismiss() {
        hl.t1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        String M0;
        if (this.S1 == 4) {
            M0 = ob6.H(',', "UserSelectorLimit", c1());
        } else {
            M0 = ob6.M0(2131753265, null);
        }
        vnb vnbVar = this.J0;
        ex0 ex0Var = this.c;
        new d31(ex0Var, vnbVar).Q(2131623982, 36, M0).k(true);
        try {
            ex0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void f1(boolean z) {
        oi7 oi7Var = this.T1;
        boolean z2 = false;
        oi7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b = this.S1;
        HashSet hashSet = this.b2;
        if (b == 4) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131752604, null));
        } else if (hashSet.size() == 0) {
            if (ob6.a0) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131749463, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) ob6.M0(2131749463, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131749450, "GiftPremiumProceedBtn"));
        }
        oi7Var.c(hashSet.size(), true);
        oi7Var.i(spannableStringBuilder, z, false);
        if (hashSet.size() > 0) {
            z2 = true;
        }
        oi7Var.setEnabled(z2);
    }

    public final void g1(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sbc.g1(boolean, boolean):void");
    }

    public final void h1(boolean z, boolean z2) {
        int S;
        int S2;
        g1(z, z2);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            d79 d79Var = this.n1;
            if (i2 >= d79Var.getChildCount()) {
                break;
            }
            View childAt = d79Var.getChildAt(i2);
            if ((childAt instanceof e3a) && (S = RecyclerView.S(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.a2;
                if (S2 < arrayList.size()) {
                    if (i == -1) {
                        i = S;
                    }
                    e3a e3aVar = (e3a) childAt;
                    e3aVar.c(((m2a) arrayList.get(S2)).j, z);
                    e3aVar.i(z, 1.0f);
                    i3 = S;
                }
            }
            i2++;
        }
        if (z) {
            this.j2.l(0, i);
            n2a n2aVar = this.j2;
            n2aVar.l(i3, n2aVar.b() - i3);
        }
        f1(z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.U2);
        jn7.f(this.a).b(this, jn7.E0);
        jn7.f(this.a).b(this, jn7.N);
        jn7.f(this.a).b(this, jn7.S0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.U2);
        jn7.f(this.a).n(this, jn7.E0);
        jn7.f(this.a).n(this, jn7.N);
        jn7.f(this.a).n(this, jn7.S0);
    }

    @Override
    public final void p0() {
        super.p0();
        d79 d79Var = this.n1;
        if (d79Var != null) {
            for (int i = 0; i < d79Var.getChildCount(); i++) {
                try {
                    d79Var.getChildAt(i).invalidate();
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
        }
    }
}
