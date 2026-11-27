package defpackage;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class qi7 extends ny0 {
    public static qi7 p2;
    public final oi7 S1;
    public final ni7 T1;
    public final tb U1;
    public final mi7 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashSet Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final HashMap b2;
    public final ArrayList c2;
    public final LinkedHashMap d2;
    public String e2;
    public n2a f2;
    public int g2;
    public int h2;
    public float i2;
    public tg2 j2;
    public final int k2;
    public final pi7 l2;
    public final Boolean m2;
    public final Boolean n2;
    public final li7 o2;

    public qi7(e eVar, int i, Boolean bool, Boolean bool2, pi7 pi7Var) {
        super(eVar, true, false, eVar.getResourceProvider());
        this.W1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.X1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Y1 = hashSet;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.Z1 = arrayList3;
        this.a2 = new ArrayList();
        HashMap hashMap = new HashMap();
        this.b2 = hashMap;
        ArrayList arrayList4 = new ArrayList();
        this.c2 = arrayList4;
        this.d2 = new LinkedHashMap();
        this.g2 = hl.L(120.0f);
        this.h2 = -1;
        this.o2 = new li7(this, (byte) 0);
        this.k2 = i;
        this.m2 = bool;
        this.n2 = bool2;
        this.l2 = pi7Var;
        this.o1.setTitle(K0());
        mi7 mi7Var = new mi7(getContext(), this.J0, (byte) 0);
        this.V1 = mi7Var;
        mi7Var.setOnCloseClickListener(new ii7(this, (byte) 0));
        mi7Var.setText(K0());
        mi7Var.setCloseImageVisible(false);
        mi7Var.f.c(false, 0.0f);
        this.j2 = new tg2(this, (byte) 2);
        ni7 ni7Var = new ni7(this, getContext(), this.J0, (byte) 0);
        this.T1 = ni7Var;
        int i2 = aob.h5;
        yob.h(i2, this.J0, ni7Var);
        ni7Var.setOnSearchTextChange(new ji7(this, (byte) 0));
        ni7Var.b.r(ob6.M0(2131745564, null), false);
        tb tbVar = new tb((byte) 21, getContext(), this);
        this.U1 = tbVar;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(mi7Var, 0, tre.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(ni7Var, tre.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(tbVar, tre.f(1.0f, -1, 55, i5, 0, i5, 0));
        dr0 dr0Var = new dr0(getContext(), this.J0, (d79) null);
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(10.0f), hl.L(10.0f));
        yob.h(i2, this.J0, dr0Var);
        oi7 oi7Var = new oi7(this, getContext(), this.J0, (byte) 0);
        this.S1 = oi7Var;
        oi7Var.setOnClickListener(new ki7(this, (byte) 0));
        dr0Var.addView(oi7Var, tre.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i6 = this.u0;
        viewGroup4.addView(dr0Var, tre.f(-2.0f, -1, 87, i6, 0, i6, 0));
        n2a n2aVar = this.f2;
        d79 d79Var = this.n1;
        n2aVar.n = arrayList;
        n2aVar.f = d79Var;
        int i7 = this.u0;
        d79Var.setPadding(i7, 0, i7, hl.L(60.0f));
        this.n1.j(new to2(this, (byte) 28));
        this.n1.setOnItemClickListener(new wg(this, i, (byte) 15));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        this.n1.i(new lr(this, (byte) 7));
        ni7Var.setText("");
        ni7Var.d.b(false);
        ni7Var.b(false, hashSet, new ii7(this, (byte) 1), null);
        mi7Var.setText(K0());
        a1(false);
        arrayList2.addAll(lv2.r(this.a).f0);
        hashMap.putAll(lv2.r(this.a).h0);
        arrayList4.addAll(lv2.r(this.a).i0);
        arrayList3.addAll(ls6.d0(this.a).j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(ls6.d0(this.a).m1);
        }
        c1(false, true);
        J();
    }

    @Override
    public final void H() {
        super.H();
        p2 = null;
        hl.r(this.o2);
    }

    @Override
    public final c79 H0(d79 d79Var) {
        n2a n2aVar = new n2a(this.J0, getContext(), true);
        this.f2 = n2aVar;
        n2aVar.s = true;
        return n2aVar;
    }

    @Override
    public final CharSequence K0() {
        int i;
        Boolean bool = this.m2;
        if (bool != null && bool.booleanValue()) {
            if (this.k2 > 1) {
                i = 2131752101;
            } else {
                i = 2131752102;
            }
            return ob6.M0(i, null);
        }
        return ob6.M0(2131752074, null);
    }

    @Override
    public final void N0(Canvas canvas, int i) {
        mi7 mi7Var = this.V1;
        mi7Var.setTranslationY(Math.max(i, (((mi7Var.getMeasuredHeight() - hl.m) - hl.L(40.0f)) / 2.0f) + hl.m) + hl.L(8.0f));
        float translationY = mi7Var.getTranslationY() + mi7Var.getMeasuredHeight();
        ni7 ni7Var = this.T1;
        ni7Var.setTranslationY(translationY);
        float translationY2 = ni7Var.getTranslationY() + ni7Var.getMeasuredHeight();
        tb tbVar = this.U1;
        tbVar.setTranslationY(translationY2);
        int measuredHeight = ni7Var.getMeasuredHeight() + mi7Var.getMeasuredHeight();
        this.n1.setTranslationY((tbVar.getMeasuredHeight() + measuredHeight) - hl.L(8.0f));
    }

    @Override
    public final void Z(Configuration configuration) {
        b1(false, true);
    }

    public final boolean Z0(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.m2;
        if (bool != null && lbc.v(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.n2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a1(boolean z) {
        int i;
        oi7 oi7Var = this.S1;
        oi7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Y1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.j2, 0, 1, 33);
            Boolean bool = this.m2;
            if (bool != null && bool.booleanValue()) {
                if (this.k2 > 1) {
                    i = 2131752101;
                } else {
                    i = 2131752102;
                }
                spannableStringBuilder.append((CharSequence) ob6.M0(i, null));
            } else {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131752074, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131749450, null));
        }
        oi7Var.c(hashSet.size(), true);
        oi7Var.i(spannableStringBuilder, z, false);
        oi7Var.setEnabled(true);
    }

    public final void b1(boolean z, boolean z2) {
        float f;
        int i;
        long j;
        int i2;
        float f2;
        n2a n2aVar;
        ArrayList arrayList = this.W1;
        arrayList.clear();
        ArrayList arrayList2 = this.X1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.e2);
        float f3 = 56.0f;
        HashSet hashSet = this.Y1;
        if (!isEmpty) {
            ArrayList arrayList3 = this.a2;
            int size = arrayList3.size();
            i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                TLRPC.User user = (TLRPC.User) obj;
                i2 += hl.L(56.0f);
                arrayList2.add(m2a.c(user, hashSet.contains(Long.valueOf(user.id))));
            }
        } else {
            ArrayList arrayList4 = this.Z1;
            if (!arrayList4.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                i = 0;
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList4.get(i4);
                    i4++;
                    int i5 = size2;
                    TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!X1.self && !X1.bot && !lbc.C(X1.id) && !lbc.z(X1) && Z0(X1)) {
                        i += hl.L(56.0f);
                        arrayList5.add(m2a.c(X1, hashSet.contains(Long.valueOf(X1.id))));
                    }
                    size2 = i5;
                }
                f = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i += hl.L(32.0f);
                    arrayList2.add(m2a.b(ob6.M0(2131749461, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f = 32.0f;
                i = 0;
            }
            long e = yac.h(this.a).e();
            Boolean bool = this.m2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = uc7.s1(this.a).y;
                int size3 = arrayList7.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList7.get(i6);
                    i6++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j2 = e;
                    if (dialog.id >= 0) {
                        TLRPC.User X12 = uc7.s1(this.a).X1(Long.valueOf(dialog.id));
                        if (Z0(X12)) {
                            i += hl.L(56.0f);
                            arrayList6.add(m2a.c(X12, hashSet.contains(Long.valueOf(X12.id))));
                        }
                    }
                    e = j2;
                }
                j = e;
                if (!arrayList6.isEmpty()) {
                    i += hl.L(f);
                    arrayList2.add(m2a.b(ob6.M0(2131745550, null)));
                    arrayList2.addAll(arrayList6);
                }
            } else {
                j = e;
            }
            ArrayList arrayList8 = this.c2;
            int size4 = arrayList8.size();
            i2 = i;
            int i7 = 0;
            while (i7 < size4) {
                Object obj4 = arrayList8.get(i7);
                i7++;
                String str = (String) obj4;
                ArrayList arrayList9 = new ArrayList();
                List<TLRPC.TL_contact> list = (List) this.b2.get(str);
                if (list != null) {
                    for (TLRPC.TL_contact tL_contact : list) {
                        float f4 = f3;
                        if (tL_contact.user_id == j) {
                            f2 = f;
                        } else {
                            f2 = f;
                            TLRPC.User X13 = uc7.s1(this.a).X1(Long.valueOf(tL_contact.user_id));
                            if (Z0(X13)) {
                                i2 += hl.L(f4);
                                arrayList9.add(m2a.c(X13, hashSet.contains(Long.valueOf(X13.id))));
                            }
                        }
                        f = f2;
                        f3 = f4;
                    }
                    float f5 = f3;
                    float f6 = f;
                    if (!arrayList9.isEmpty()) {
                        int L = hl.L(f6) + i2;
                        String upperCase = str.toUpperCase();
                        m2a m2aVar = new m2a(7, false);
                        m2aVar.f = upperCase;
                        arrayList2.add(m2aVar);
                        arrayList2.addAll(arrayList9);
                        i2 = L;
                    }
                    f = f6;
                    f3 = f5;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new m2a(5, false));
            i2 += hl.L(150.0f);
        }
        int max = Math.max(0, ((int) (hl.q.y * 0.6f)) - i2);
        m2a m2aVar2 = new m2a(-1, false);
        m2aVar2.k = max;
        arrayList2.add(m2aVar2);
        if (hashSet != null) {
            int size5 = hashSet.size();
            n2a n2aVar2 = this.f2;
            if (size5 > 0) {
                ki7 ki7Var = new ki7(this, (byte) 1);
                p55 p55Var = n2aVar2.w;
                if (p55Var != null) {
                    p55Var.a(ob6.M0(2131743285, null), ki7Var);
                }
            } else {
                p55 p55Var2 = n2aVar2.w;
                if (p55Var2 != null) {
                    p55Var2.setRightText(null);
                }
            }
        }
        if (z2 && (n2aVar = this.f2) != null) {
            if (z) {
                n2aVar.E(arrayList, arrayList2);
            } else {
                n2aVar.f();
            }
        }
    }

    public final void c1(boolean z, boolean z2) {
        int S;
        b1(z, z2);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            d79 d79Var = this.n1;
            if (i2 >= d79Var.getChildCount()) {
                break;
            }
            View childAt = d79Var.getChildAt(i2);
            if ((childAt instanceof e3a) && (S = RecyclerView.S(childAt)) > 0) {
                if (i == -1) {
                    i = S;
                }
                int i4 = S - 1;
                if (i4 >= 0) {
                    ArrayList arrayList = this.X1;
                    if (i4 < arrayList.size()) {
                        e3a e3aVar = (e3a) childAt;
                        e3aVar.c(((m2a) arrayList.get(i4)).j, z);
                        e3aVar.i(z, 1.0f);
                    }
                }
                i3 = S;
            }
            i2++;
        }
        if (z) {
            this.f2.l(0, i);
            n2a n2aVar = this.f2;
            n2aVar.l(i3, n2aVar.b() - i3);
        }
        a1(z);
    }

    @Override
    public final void dismiss() {
        hl.t1(this.T1.getEditText());
        super.dismiss();
    }
}
