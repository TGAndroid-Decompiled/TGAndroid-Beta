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
public final class s7c extends fy0 implements gk7 {
    public final byte S1;
    public final eg7 T1;
    public final dg7 U1;
    public final si9 V1;
    public final cg7 W1;
    public final wf2 X1;
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
    public ty9 j2;
    public int k2;
    public final ArrayList l2;
    public boolean m2;
    public float n2;
    public bg2 o2;
    public final xia p2;
    public int q2;
    public w35 r2;
    public final HashSet s2;
    public i8c t2;

    public s7c(Activity activity, int i, e53 e53Var) {
        super(activity, null, true, false, e53Var);
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
        this.k2 = gl.L(120.0f);
        this.l2 = new ArrayList();
        this.m2 = false;
        this.p2 = new xia(this, (byte) 10);
        this.q2 = -1;
        this.s2 = new HashSet();
        this.a = i;
        int i2 = bkb.g5;
        M(i2);
        this.s = false;
        this.S1 = (byte) 4;
        ty9 ty9Var = this.j2;
        if (ty9Var != null) {
            ty9Var.y = true;
        }
        cg7 cg7Var = new cg7(getContext(), e53Var, (byte) 1);
        this.W1 = cg7Var;
        cg7Var.setOnCloseClickListener(new m7c(this, (byte) 10));
        cg7Var.setText(J0());
        cg7Var.setCloseImageVisible(false);
        cg7Var.f.c(false, 0.0f);
        this.o2 = new bg2(this, (byte) 4);
        dg7 dg7Var = new dg7(this, getContext(), e53Var, (byte) 1);
        this.U1 = dg7Var;
        zkb.h(i2, e53Var, dg7Var);
        dg7Var.setOnSearchTextChange(new n7c(this, (byte) 1));
        hashSet.isEmpty();
        dg7Var.b.r(k96.M0(2131745644, null), false);
        si9 si9Var = new si9((byte) 14, getContext(), this);
        this.V1 = si9Var;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(cg7Var, 0, nme.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(dg7Var, nme.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(si9Var, nme.f(1.0f, -1, 55, i5, 0, i5, 0));
        dr0 dr0Var = new dr0(getContext(), e53Var, (o39) null);
        this.Y1 = dr0Var;
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(10.0f));
        zkb.h(i2, e53Var, dr0Var);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), gl.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i6 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i6, this.J0), 6, 6);
        vkb M = zkb.M(i6);
        linearLayout.setBackground(Y);
        zkb.j(linearLayout, Y, null, M, e53Var);
        wf2 wf2Var = new wf2(24, e53Var, activity);
        this.X1 = wf2Var;
        wf2Var.b(bkb.Ei, bkb.i7, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(false, false);
        wf2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        zkb.X(textView, bkb.i5, e53Var);
        ir2.r(14.0f, 1, 2131751813, textView, null);
        linearLayout.addView(textView, nme.t(-2, -2, 16, 9, 0, 0, 0));
        ote.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final s7c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                wf2 wf2Var2;
                byte b = r2;
                s7c s7cVar = this.b;
                boolean z = true;
                switch (b) {
                    case 0:
                        s7cVar.X1.a(!wf2Var2.a.q, true);
                        return;
                    default:
                        byte b2 = s7cVar.S1;
                        ArrayList arrayList3 = s7cVar.l2;
                        HashSet hashSet2 = s7cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b2 == 0 || b2 == 2 || b2 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : s7cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gl.t1(s7cVar.U1.getEditText());
                                if (b2 != 1) {
                                    if (b2 == 4) {
                                        i8c i8cVar = s7cVar.t2;
                                        if (i8cVar != null) {
                                            wf2 wf2Var3 = s7cVar.X1;
                                            i8cVar.a(Boolean.valueOf((wf2Var3 == null || !wf2Var3.a.q) ? false : false), hashSet2);
                                            s7cVar.t2 = null;
                                        }
                                        s7cVar.dismiss();
                                        return;
                                    }
                                    List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j = ((TLRPC.User) arrayList4.get(0)).id;
                                        if (l7c.b(j)) {
                                            b00.u(k96.a0(null, null, 2131743503, cf3.s(j)), new u21(s7cVar.c, s7cVar.J0), 2131624012, 36);
                                            return;
                                        }
                                        tv4 tv4Var = new tv4(s7cVar.getContext(), s7cVar.a, j, d, new n7c(s7cVar, (byte) 0));
                                        tv4Var.a1(false);
                                        tv4Var.show();
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
        dr0Var.addView(linearLayout, nme.t(-2, -2, 17, 0, 0, 0, 8));
        eg7 eg7Var = new eg7(this, getContext(), e53Var, (byte) 1);
        this.T1 = eg7Var;
        dr0Var.setAlpha(0.0f);
        dr0Var.setVisibility(8);
        eg7Var.setOnClickListener(new View.OnClickListener(this) {
            public final s7c b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                wf2 wf2Var2;
                byte b = r2;
                s7c s7cVar = this.b;
                boolean z = true;
                switch (b) {
                    case 0:
                        s7cVar.X1.a(!wf2Var2.a.q, true);
                        return;
                    default:
                        byte b2 = s7cVar.S1;
                        ArrayList arrayList3 = s7cVar.l2;
                        HashSet hashSet2 = s7cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b2 == 0 || b2 == 2 || b2 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : s7cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gl.t1(s7cVar.U1.getEditText());
                                if (b2 != 1) {
                                    if (b2 == 4) {
                                        i8c i8cVar = s7cVar.t2;
                                        if (i8cVar != null) {
                                            wf2 wf2Var3 = s7cVar.X1;
                                            i8cVar.a(Boolean.valueOf((wf2Var3 == null || !wf2Var3.a.q) ? false : false), hashSet2);
                                            s7cVar.t2 = null;
                                        }
                                        s7cVar.dismiss();
                                        return;
                                    }
                                    List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                    if (arrayList4.size() == 1) {
                                        long j = ((TLRPC.User) arrayList4.get(0)).id;
                                        if (l7c.b(j)) {
                                            b00.u(k96.a0(null, null, 2131743503, cf3.s(j)), new u21(s7cVar.c, s7cVar.J0), 2131624012, 36);
                                            return;
                                        }
                                        tv4 tv4Var = new tv4(s7cVar.getContext(), s7cVar.a, j, d, new n7c(s7cVar, (byte) 0));
                                        tv4Var.a1(false);
                                        tv4Var.show();
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
        dr0Var.addView(eg7Var, nme.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i7 = this.u0;
        viewGroup4.addView(dr0Var, nme.f(-2.0f, -1, 87, i7, 0, i7, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.b;
        int i8 = this.u0;
        viewGroup5.addView(frameLayout, nme.f(300.0f, -1, 87, i8, 0, i8, gl.L(68.0f)));
        ty9 ty9Var2 = this.j2;
        o39 o39Var = this.n1;
        ty9Var2.n = arrayList;
        ty9Var2.f = o39Var;
        int i9 = this.u0;
        o39Var.setPadding(i9, 0, i9, gl.L(60.0f));
        this.n1.j(new vdb(this, (byte) 5));
        this.n1.setOnItemClickListener(new r7c(this, e53Var, i));
        this.n1.setOnItemLongClickListener(new r7c(this));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.n1.setItemAnimator(gb3Var);
        this.n1.i(new kr(this, (byte) 10));
        dg7Var.setText("");
        dg7Var.d.b(false);
        dg7Var.b(false, hashSet, new m7c(this, (byte) 11), null);
        cg7Var.setText(J0());
        by0 by0Var = this.o1;
        if (by0Var != null) {
            by0Var.setTitle(J0());
        }
        e1(false);
        c1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(hq6.d0(this.a).j1);
        }
        g1(false, true);
    }

    @Override
    public final n39 G0(o39 o39Var) {
        ty9 ty9Var = new ty9(this.J0, getContext(), false);
        this.j2 = ty9Var;
        ty9Var.s = true;
        return ty9Var;
    }

    @Override
    public final void I() {
        super.I();
        gl.r(this.p2);
    }

    @Override
    public final CharSequence J0() {
        byte b = this.S1;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 4) {
                        return k96.M0(2131749425, null);
                    }
                    return k96.M0(2131743183, null);
                }
            } else {
                return k96.M0(2131749432, null);
            }
        }
        return k96.M0(2131749426, null);
    }

    @Override
    public final void M0(Canvas canvas, int i) {
        float max = Math.max(i, gl.m - gl.L(8.0f)) + gl.L(8.0f);
        cg7 cg7Var = this.W1;
        cg7Var.setTranslationY(max);
        float translationY = cg7Var.getTranslationY() + cg7Var.getMeasuredHeight();
        dg7 dg7Var = this.U1;
        dg7Var.setTranslationY(translationY);
        float translationY2 = dg7Var.getTranslationY() + dg7Var.getMeasuredHeight();
        si9 si9Var = this.V1;
        si9Var.setTranslationY(translationY2);
        int measuredHeight = dg7Var.getMeasuredHeight() + cg7Var.getMeasuredHeight();
        this.n1.setTranslationY((si9Var.getMeasuredHeight() + measuredHeight) - gl.L(8.0f));
    }

    public final void Y0() {
        byte b;
        if (this.b2.isEmpty() && (b = this.S1) != 1 && b != 2 && b != 4) {
            if (this.m2) {
                this.m2 = false;
                gl.d3(new m7c(this, (byte) 4), 10L);
            }
        } else if (!this.m2) {
            this.m2 = true;
            gl.d3(new m7c(this, (byte) 3), 10L);
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
            gl.r(this.p2);
            f1(true, true);
        }
    }

    public final sy9 a1(sy9 sy9Var) {
        TLRPC.User user = sy9Var.c;
        if (this.S1 == 4) {
            if (user == null) {
                return sy9Var;
            }
            final long j = user.id;
            ?? r2 = new View.OnClickListener(this) {
                public final s7c b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r4;
                    long j2 = j;
                    s7c s7cVar = this.b;
                    switch (b) {
                        case 0:
                            HashSet hashSet = s7cVar.b2;
                            hashSet.add(Long.valueOf(j2));
                            i8c i8cVar = s7cVar.t2;
                            if (i8cVar != null) {
                                i8cVar.a(Boolean.FALSE, hashSet);
                                s7cVar.t2 = null;
                            }
                            s7cVar.dismiss();
                            return;
                        default:
                            HashSet hashSet2 = s7cVar.b2;
                            hashSet2.add(Long.valueOf(j2));
                            i8c i8cVar2 = s7cVar.t2;
                            if (i8cVar2 != null) {
                                i8cVar2.a(Boolean.TRUE, hashSet2);
                                s7cVar.t2 = null;
                            }
                            s7cVar.dismiss();
                            return;
                    }
                }
            };
            ?? r3 = new View.OnClickListener(this) {
                public final s7c b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r4;
                    long j2 = j;
                    s7c s7cVar = this.b;
                    switch (b) {
                        case 0:
                            HashSet hashSet = s7cVar.b2;
                            hashSet.add(Long.valueOf(j2));
                            i8c i8cVar = s7cVar.t2;
                            if (i8cVar != null) {
                                i8cVar.a(Boolean.FALSE, hashSet);
                                s7cVar.t2 = null;
                            }
                            s7cVar.dismiss();
                            return;
                        default:
                            HashSet hashSet2 = s7cVar.b2;
                            hashSet2.add(Long.valueOf(j2));
                            i8c i8cVar2 = s7cVar.t2;
                            if (i8cVar2 != null) {
                                i8cVar2.a(Boolean.TRUE, hashSet2);
                                s7cVar.t2 = null;
                            }
                            s7cVar.dismiss();
                            return;
                    }
                }
            };
            sy9Var.n = r2;
            sy9Var.o = r3;
            return sy9Var;
        }
        sy9Var.m = new vzb(this, user, (byte) 7);
        return sy9Var;
    }

    public final int b1() {
        if (this.S1 == 4) {
            return Math.max(0, (na7.q1(this.a).k4.w3.f() - this.s2.size()) - 1);
        }
        return 10;
    }

    public final void c1(boolean z) {
        ArrayList arrayList = this.c2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(qu2.r(this.a).f0);
            this.f2.putAll(qu2.r(this.a).h0);
            this.g2.addAll(qu2.r(this.a).i0);
            if (z) {
                f1(true, true);
            }
        }
    }

    public final void d1() {
        String M0;
        if (this.S1 == 4) {
            M0 = k96.H(',', "UserSelectorLimit", b1());
        } else {
            M0 = k96.M0(2131753269, null);
        }
        wjb wjbVar = this.J0;
        ww0 ww0Var = this.c;
        new u21(ww0Var, wjbVar).Q(2131623982, 36, M0).k(true);
        try {
            ww0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.T2) {
            dismiss();
        } else if (i == kk7.N) {
            gl.c3(new m7c(this, (byte) 0));
        } else if (i == kk7.R0) {
            gl.c3(new m7c(this, (byte) 6));
        } else if (i == kk7.D0) {
            gl.c3(new m7c(this, (byte) 9));
        }
    }

    @Override
    public final void dismiss() {
        gl.t1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z) {
        eg7 eg7Var = this.T1;
        boolean z2 = false;
        eg7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b = this.S1;
        HashSet hashSet = this.b2;
        if (b == 4) {
            spannableStringBuilder.append((CharSequence) k96.M0(2131752611, null));
        } else if (hashSet.size() == 0) {
            if (k96.a0) {
                spannableStringBuilder.append((CharSequence) k96.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) k96.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
            }
        } else {
            spannableStringBuilder.append((CharSequence) k96.M0(2131749489, "GiftPremiumProceedBtn"));
        }
        eg7Var.c(hashSet.size(), true);
        eg7Var.i(spannableStringBuilder, z, false);
        if (hashSet.size() > 0) {
            z2 = true;
        }
        eg7Var.setEnabled(z2);
    }

    public final void f1(boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7c.f1(boolean, boolean):void");
    }

    public final void g1(boolean z, boolean z2) {
        int R;
        int R2;
        f1(z, z2);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            o39 o39Var = this.n1;
            if (i2 >= o39Var.getChildCount()) {
                break;
            }
            View childAt = o39Var.getChildAt(i2);
            if ((childAt instanceof kz9) && (R = RecyclerView.R(childAt)) - 1 >= 0) {
                ArrayList arrayList = this.a2;
                if (R2 < arrayList.size()) {
                    if (i == -1) {
                        i = R;
                    }
                    kz9 kz9Var = (kz9) childAt;
                    kz9Var.c(((sy9) arrayList.get(R2)).j, z);
                    kz9Var.i(z, 1.0f);
                    i3 = R;
                }
            }
            i2++;
        }
        if (z) {
            this.j2.l(0, i);
            ty9 ty9Var = this.j2;
            ty9Var.l(i3, ty9Var.b() - i3);
        }
        e1(z);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.T2);
        kk7.f(this.a).b(this, kk7.D0);
        kk7.f(this.a).b(this, kk7.N);
        kk7.f(this.a).b(this, kk7.R0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.T2);
        kk7.f(this.a).n(this, kk7.D0);
        kk7.f(this.a).n(this, kk7.N);
        kk7.f(this.a).n(this, kk7.R0);
    }

    @Override
    public final void p0() {
        super.p0();
        o39 o39Var = this.n1;
        if (o39Var != null) {
            for (int i = 0; i < o39Var.getChildCount(); i++) {
                try {
                    o39Var.getChildAt(i).invalidate();
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
        }
    }
}
