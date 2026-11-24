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
import org.telegram.ui.ActionBar.d;
public final class ji7 extends mz0 {
    public static ji7 p2;
    public final hi7 S1;
    public final gi7 T1;
    public final sb U1;
    public final fi7 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashSet Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final HashMap b2;
    public final ArrayList c2;
    public final LinkedHashMap d2;
    public String e2;
    public v0a f2;
    public int g2;
    public int h2;
    public float i2;
    public ph2 j2;
    public final int k2;
    public final ii7 l2;
    public final Boolean m2;
    public final Boolean n2;
    public final ei7 o2;

    public ji7(d dVar, int i, Boolean bool, Boolean bool2, ii7 ii7Var) {
        super(dVar, true, false, dVar.getResourceProvider());
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
        this.g2 = gm.L(120.0f);
        this.h2 = -1;
        this.o2 = new ei7(this, (byte) 0);
        this.k2 = i;
        this.m2 = bool;
        this.n2 = bool2;
        this.l2 = ii7Var;
        this.o1.setTitle(J0());
        fi7 fi7Var = new fi7(getContext(), this.J0, (byte) 0);
        this.V1 = fi7Var;
        fi7Var.setOnCloseClickListener(new bi7(this, (byte) 0));
        fi7Var.setText(J0());
        fi7Var.setCloseImageVisible(false);
        fi7Var.f.c(false, 0.0f);
        this.j2 = new ph2(this, (byte) 2);
        gi7 gi7Var = new gi7(this, getContext(), this.J0, (byte) 0);
        this.T1 = gi7Var;
        int i2 = cmb.g5;
        anb.h(i2, this.J0, gi7Var);
        gi7Var.setOnSearchTextChange(new ci7(this, (byte) 0));
        gi7Var.b.r(jb6.M0(2131745570, null), false);
        sb sbVar = new sb((byte) 21, getContext(), this);
        this.U1 = sbVar;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(fi7Var, 0, qoe.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(gi7Var, qoe.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(sbVar, qoe.f(1.0f, -1, 55, i5, 0, i5, 0));
        ds0 ds0Var = new ds0(getContext(), this.J0, (r59) null);
        ds0Var.setClickable(true);
        ds0Var.setOrientation(1);
        ds0Var.setPadding(gm.L(10.0f), gm.L(10.0f), gm.L(10.0f), gm.L(10.0f));
        anb.h(i2, this.J0, ds0Var);
        hi7 hi7Var = new hi7(this, getContext(), this.J0, (byte) 0);
        this.S1 = hi7Var;
        hi7Var.setOnClickListener(new di7(this, (byte) 0));
        ds0Var.addView(hi7Var, qoe.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i6 = this.u0;
        viewGroup4.addView(ds0Var, qoe.f(-2.0f, -1, 87, i6, 0, i6, 0));
        v0a v0aVar = this.f2;
        r59 r59Var = this.n1;
        v0aVar.n = arrayList;
        v0aVar.f = r59Var;
        int i7 = this.u0;
        r59Var.setPadding(i7, 0, i7, gm.L(60.0f));
        this.n1.j(new ip2(this, (byte) 29));
        this.n1.setOnItemClickListener(new ji(this, i, (byte) 15));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.n1.setItemAnimator(sc3Var);
        this.n1.i(new ks(this, (byte) 7));
        gi7Var.setText("");
        gi7Var.d.b(false);
        gi7Var.b(false, hashSet, new bi7(this, (byte) 1), null);
        fi7Var.setText(J0());
        Z0(false);
        arrayList2.addAll(bw2.r(this.a).f0);
        hashMap.putAll(bw2.r(this.a).h0);
        arrayList4.addAll(bw2.r(this.a).i0);
        arrayList3.addAll(hs6.d0(this.a).j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(hs6.d0(this.a).m1);
        }
        b1(false, true);
        J();
    }

    @Override
    public final q59 G0(r59 r59Var) {
        v0a v0aVar = new v0a(this.J0, getContext(), true);
        this.f2 = v0aVar;
        v0aVar.s = true;
        return v0aVar;
    }

    @Override
    public final void H() {
        super.H();
        p2 = null;
        gm.r(this.o2);
    }

    @Override
    public final CharSequence J0() {
        int i;
        Boolean bool = this.m2;
        if (bool != null && bool.booleanValue()) {
            if (this.k2 > 1) {
                i = 2131752073;
            } else {
                i = 2131752074;
            }
            return jb6.M0(i, null);
        }
        return jb6.M0(2131752046, null);
    }

    @Override
    public final void M0(Canvas canvas, int i) {
        fi7 fi7Var = this.V1;
        fi7Var.setTranslationY(Math.max(i, (((fi7Var.getMeasuredHeight() - gm.m) - gm.L(40.0f)) / 2.0f) + gm.m) + gm.L(8.0f));
        float translationY = fi7Var.getTranslationY() + fi7Var.getMeasuredHeight();
        gi7 gi7Var = this.T1;
        gi7Var.setTranslationY(translationY);
        float translationY2 = gi7Var.getTranslationY() + gi7Var.getMeasuredHeight();
        sb sbVar = this.U1;
        sbVar.setTranslationY(translationY2);
        int measuredHeight = gi7Var.getMeasuredHeight() + fi7Var.getMeasuredHeight();
        this.n1.setTranslationY((sbVar.getMeasuredHeight() + measuredHeight) - gm.L(8.0f));
    }

    public final boolean Y0(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.m2;
        if (bool != null && m9c.v(user) != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = this.n2;
        if (bool2 != null && user.premium != bool2.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override
    public final void Z(Configuration configuration) {
        a1(false, true);
    }

    public final void Z0(boolean z) {
        int i;
        hi7 hi7Var = this.S1;
        hi7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Y1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.j2, 0, 1, 33);
            Boolean bool = this.m2;
            if (bool != null && bool.booleanValue()) {
                if (this.k2 > 1) {
                    i = 2131752073;
                } else {
                    i = 2131752074;
                }
                spannableStringBuilder.append((CharSequence) jb6.M0(i, null));
            } else {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131752046, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) jb6.M0(2131749438, null));
        }
        hi7Var.c(hashSet.size(), true);
        hi7Var.i(spannableStringBuilder, z, false);
        hi7Var.setEnabled(true);
    }

    public final void a1(boolean z, boolean z2) {
        float f;
        int i;
        long j;
        int i2;
        float f2;
        v0a v0aVar;
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
                i2 += gm.L(56.0f);
                arrayList2.add(u0a.c(user, hashSet.contains(Long.valueOf(user.id))));
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
                    TLRPC.User W1 = oc7.r1(this.a).W1(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!W1.self && !W1.bot && !m9c.C(W1.id) && !m9c.z(W1) && Y0(W1)) {
                        i += gm.L(56.0f);
                        arrayList5.add(u0a.c(W1, hashSet.contains(Long.valueOf(W1.id))));
                    }
                    size2 = i5;
                }
                f = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i += gm.L(32.0f);
                    arrayList2.add(u0a.b(jb6.M0(2131749449, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f = 32.0f;
                i = 0;
            }
            long e = z8c.h(this.a).e();
            Boolean bool = this.m2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = oc7.r1(this.a).y;
                int size3 = arrayList7.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList7.get(i6);
                    i6++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j2 = e;
                    if (dialog.id >= 0) {
                        TLRPC.User W12 = oc7.r1(this.a).W1(Long.valueOf(dialog.id));
                        if (Y0(W12)) {
                            i += gm.L(56.0f);
                            arrayList6.add(u0a.c(W12, hashSet.contains(Long.valueOf(W12.id))));
                        }
                    }
                    e = j2;
                }
                j = e;
                if (!arrayList6.isEmpty()) {
                    i += gm.L(f);
                    arrayList2.add(u0a.b(jb6.M0(2131745556, null)));
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
                            TLRPC.User W13 = oc7.r1(this.a).W1(Long.valueOf(tL_contact.user_id));
                            if (Y0(W13)) {
                                i2 += gm.L(f4);
                                arrayList9.add(u0a.c(W13, hashSet.contains(Long.valueOf(W13.id))));
                            }
                        }
                        f = f2;
                        f3 = f4;
                    }
                    float f5 = f3;
                    float f6 = f;
                    if (!arrayList9.isEmpty()) {
                        int L = gm.L(f6) + i2;
                        String upperCase = str.toUpperCase();
                        u0a u0aVar = new u0a(7, false);
                        u0aVar.f = upperCase;
                        arrayList2.add(u0aVar);
                        arrayList2.addAll(arrayList9);
                        i2 = L;
                    }
                    f = f6;
                    f3 = f5;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new u0a(5, false));
            i2 += gm.L(150.0f);
        }
        int max = Math.max(0, ((int) (gm.q.y * 0.6f)) - i2);
        u0a u0aVar2 = new u0a(-1, false);
        u0aVar2.k = max;
        arrayList2.add(u0aVar2);
        if (hashSet != null) {
            int size5 = hashSet.size();
            v0a v0aVar2 = this.f2;
            if (size5 > 0) {
                di7 di7Var = new di7(this, (byte) 1);
                l55 l55Var = v0aVar2.w;
                if (l55Var != null) {
                    l55Var.a(jb6.M0(2131743317, null), di7Var);
                }
            } else {
                l55 l55Var2 = v0aVar2.w;
                if (l55Var2 != null) {
                    l55Var2.setRightText(null);
                }
            }
        }
        if (z2 && (v0aVar = this.f2) != null) {
            if (z) {
                v0aVar.E(arrayList, arrayList2);
            } else {
                v0aVar.f();
            }
        }
    }

    public final void b1(boolean z, boolean z2) {
        int R;
        a1(z, z2);
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            r59 r59Var = this.n1;
            if (i2 >= r59Var.getChildCount()) {
                break;
            }
            View childAt = r59Var.getChildAt(i2);
            if ((childAt instanceof m1a) && (R = RecyclerView.R(childAt)) > 0) {
                if (i == -1) {
                    i = R;
                }
                int i4 = R - 1;
                if (i4 >= 0) {
                    ArrayList arrayList = this.X1;
                    if (i4 < arrayList.size()) {
                        m1a m1aVar = (m1a) childAt;
                        m1aVar.c(((u0a) arrayList.get(i4)).j, z);
                        m1aVar.i(z, 1.0f);
                    }
                }
                i3 = R;
            }
            i2++;
        }
        if (z) {
            this.f2.l(0, i);
            v0a v0aVar = this.f2;
            v0aVar.l(i3, v0aVar.b() - i3);
        }
        Z0(z);
    }

    @Override
    public final void dismiss() {
        gm.t1(this.T1.getEditText());
        super.dismiss();
    }
}
