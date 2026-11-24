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
public final class gg7 extends fy0 {
    public static gg7 p2;
    public final eg7 S1;
    public final dg7 T1;
    public final sb U1;
    public final cg7 V1;
    public final ArrayList W1;
    public final ArrayList X1;
    public final HashSet Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final HashMap b2;
    public final ArrayList c2;
    public final LinkedHashMap d2;
    public String e2;
    public ty9 f2;
    public int g2;
    public int h2;
    public float i2;
    public bg2 j2;
    public final int k2;
    public final fg7 l2;
    public final Boolean m2;
    public final Boolean n2;
    public final bg7 o2;

    public gg7(d dVar, int i, Boolean bool, Boolean bool2, fg7 fg7Var) {
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
        this.g2 = gl.L(120.0f);
        this.h2 = -1;
        this.o2 = new bg7(this, (byte) 0);
        this.k2 = i;
        this.m2 = bool;
        this.n2 = bool2;
        this.l2 = fg7Var;
        this.o1.setTitle(J0());
        cg7 cg7Var = new cg7(getContext(), this.J0, (byte) 0);
        this.V1 = cg7Var;
        cg7Var.setOnCloseClickListener(new yf7(this, (byte) 0));
        cg7Var.setText(J0());
        cg7Var.setCloseImageVisible(false);
        cg7Var.f.c(false, 0.0f);
        this.j2 = new bg2(this, (byte) 2);
        dg7 dg7Var = new dg7(this, getContext(), this.J0, (byte) 0);
        this.T1 = dg7Var;
        int i2 = bkb.g5;
        zkb.h(i2, this.J0, dg7Var);
        dg7Var.setOnSearchTextChange(new zf7(this, (byte) 0));
        dg7Var.b.r(k96.M0(2131745644, null), false);
        sb sbVar = new sb((byte) 20, getContext(), this);
        this.U1 = sbVar;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(cg7Var, 0, nme.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(dg7Var, nme.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(sbVar, nme.f(1.0f, -1, 55, i5, 0, i5, 0));
        dr0 dr0Var = new dr0(getContext(), this.J0, (o39) null);
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(10.0f));
        zkb.h(i2, this.J0, dr0Var);
        eg7 eg7Var = new eg7(this, getContext(), this.J0, (byte) 0);
        this.S1 = eg7Var;
        eg7Var.setOnClickListener(new ag7(this, (byte) 0));
        dr0Var.addView(eg7Var, nme.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i6 = this.u0;
        viewGroup4.addView(dr0Var, nme.f(-2.0f, -1, 87, i6, 0, i6, 0));
        ty9 ty9Var = this.f2;
        o39 o39Var = this.n1;
        ty9Var.n = arrayList;
        ty9Var.f = o39Var;
        int i7 = this.u0;
        o39Var.setPadding(i7, 0, i7, gl.L(60.0f));
        this.n1.j(new ao2(this, (byte) 28));
        this.n1.setOnItemClickListener(new jh(this, i, (byte) 15));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.n1.setItemAnimator(gb3Var);
        this.n1.i(new kr(this, (byte) 7));
        dg7Var.setText("");
        dg7Var.d.b(false);
        dg7Var.b(false, hashSet, new yf7(this, (byte) 1), null);
        cg7Var.setText(J0());
        Z0(false);
        arrayList2.addAll(qu2.r(this.a).f0);
        hashMap.putAll(qu2.r(this.a).h0);
        arrayList4.addAll(qu2.r(this.a).i0);
        arrayList3.addAll(hq6.d0(this.a).j1);
        if (bool != null && bool.booleanValue()) {
            arrayList3.addAll(hq6.d0(this.a).m1);
        }
        b1(false, true);
        K();
    }

    @Override
    public final n39 G0(o39 o39Var) {
        ty9 ty9Var = new ty9(this.J0, getContext(), true);
        this.f2 = ty9Var;
        ty9Var.s = true;
        return ty9Var;
    }

    @Override
    public final void I() {
        super.I();
        p2 = null;
        gl.r(this.o2);
    }

    @Override
    public final CharSequence J0() {
        int i;
        Boolean bool = this.m2;
        if (bool != null && bool.booleanValue()) {
            if (this.k2 > 1) {
                i = 2131752124;
            } else {
                i = 2131752125;
            }
            return k96.M0(i, null);
        }
        return k96.M0(2131752097, null);
    }

    @Override
    public final void M0(Canvas canvas, int i) {
        cg7 cg7Var = this.V1;
        cg7Var.setTranslationY(Math.max(i, (((cg7Var.getMeasuredHeight() - gl.m) - gl.L(40.0f)) / 2.0f) + gl.m) + gl.L(8.0f));
        float translationY = cg7Var.getTranslationY() + cg7Var.getMeasuredHeight();
        dg7 dg7Var = this.T1;
        dg7Var.setTranslationY(translationY);
        float translationY2 = dg7Var.getTranslationY() + dg7Var.getMeasuredHeight();
        sb sbVar = this.U1;
        sbVar.setTranslationY(translationY2);
        int measuredHeight = dg7Var.getMeasuredHeight() + cg7Var.getMeasuredHeight();
        this.n1.setTranslationY((sbVar.getMeasuredHeight() + measuredHeight) - gl.L(8.0f));
    }

    public final boolean Y0(TLRPC.User user) {
        if (user == null) {
            return false;
        }
        Boolean bool = this.m2;
        if (bool != null && l7c.v(user) != bool.booleanValue()) {
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
        eg7 eg7Var = this.S1;
        eg7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        HashSet hashSet = this.Y1;
        if (hashSet.size() == 0) {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.j2, 0, 1, 33);
            Boolean bool = this.m2;
            if (bool != null && bool.booleanValue()) {
                if (this.k2 > 1) {
                    i = 2131752124;
                } else {
                    i = 2131752125;
                }
                spannableStringBuilder.append((CharSequence) k96.M0(i, null));
            } else {
                spannableStringBuilder.append((CharSequence) k96.M0(2131752097, null));
            }
        } else {
            spannableStringBuilder.append((CharSequence) k96.M0(2131749489, null));
        }
        eg7Var.c(hashSet.size(), true);
        eg7Var.i(spannableStringBuilder, z, false);
        eg7Var.setEnabled(true);
    }

    public final void a1(boolean z, boolean z2) {
        float f;
        int i;
        long j;
        int i2;
        float f2;
        ty9 ty9Var;
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
                i2 += gl.L(56.0f);
                arrayList2.add(sy9.c(user, hashSet.contains(Long.valueOf(user.id))));
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
                    TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(((TLRPC.TL_topPeer) obj2).peer.user_id));
                    if (!V1.self && !V1.bot && !l7c.C(V1.id) && !l7c.z(V1) && Y0(V1)) {
                        i += gl.L(56.0f);
                        arrayList5.add(sy9.c(V1, hashSet.contains(Long.valueOf(V1.id))));
                    }
                    size2 = i5;
                }
                f = 32.0f;
                if (!arrayList5.isEmpty()) {
                    i += gl.L(32.0f);
                    arrayList2.add(sy9.b(k96.M0(2131749500, null)));
                    arrayList2.addAll(arrayList5);
                }
            } else {
                f = 32.0f;
                i = 0;
            }
            long e = y6c.h(this.a).e();
            Boolean bool = this.m2;
            if (bool != null && bool.booleanValue()) {
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = na7.q1(this.a).y;
                int size3 = arrayList7.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj3 = arrayList7.get(i6);
                    i6++;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) obj3;
                    long j2 = e;
                    if (dialog.id >= 0) {
                        TLRPC.User V12 = na7.q1(this.a).V1(Long.valueOf(dialog.id));
                        if (Y0(V12)) {
                            i += gl.L(56.0f);
                            arrayList6.add(sy9.c(V12, hashSet.contains(Long.valueOf(V12.id))));
                        }
                    }
                    e = j2;
                }
                j = e;
                if (!arrayList6.isEmpty()) {
                    i += gl.L(f);
                    arrayList2.add(sy9.b(k96.M0(2131745630, null)));
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
                            TLRPC.User V13 = na7.q1(this.a).V1(Long.valueOf(tL_contact.user_id));
                            if (Y0(V13)) {
                                i2 += gl.L(f4);
                                arrayList9.add(sy9.c(V13, hashSet.contains(Long.valueOf(V13.id))));
                            }
                        }
                        f = f2;
                        f3 = f4;
                    }
                    float f5 = f3;
                    float f6 = f;
                    if (!arrayList9.isEmpty()) {
                        int L = gl.L(f6) + i2;
                        String upperCase = str.toUpperCase();
                        sy9 sy9Var = new sy9(7, false);
                        sy9Var.f = upperCase;
                        arrayList2.add(sy9Var);
                        arrayList2.addAll(arrayList9);
                        i2 = L;
                    }
                    f = f6;
                    f3 = f5;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new sy9(5, false));
            i2 += gl.L(150.0f);
        }
        int max = Math.max(0, ((int) (gl.q.y * 0.6f)) - i2);
        sy9 sy9Var2 = new sy9(-1, false);
        sy9Var2.k = max;
        arrayList2.add(sy9Var2);
        if (hashSet != null) {
            int size5 = hashSet.size();
            ty9 ty9Var2 = this.f2;
            if (size5 > 0) {
                ag7 ag7Var = new ag7(this, (byte) 1);
                l35 l35Var = ty9Var2.w;
                if (l35Var != null) {
                    l35Var.a(k96.M0(2131743391, null), ag7Var);
                }
            } else {
                l35 l35Var2 = ty9Var2.w;
                if (l35Var2 != null) {
                    l35Var2.setRightText(null);
                }
            }
        }
        if (z2 && (ty9Var = this.f2) != null) {
            if (z) {
                ty9Var.E(arrayList, arrayList2);
            } else {
                ty9Var.f();
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
            o39 o39Var = this.n1;
            if (i2 >= o39Var.getChildCount()) {
                break;
            }
            View childAt = o39Var.getChildAt(i2);
            if ((childAt instanceof kz9) && (R = RecyclerView.R(childAt)) > 0) {
                if (i == -1) {
                    i = R;
                }
                int i4 = R - 1;
                if (i4 >= 0) {
                    ArrayList arrayList = this.X1;
                    if (i4 < arrayList.size()) {
                        kz9 kz9Var = (kz9) childAt;
                        kz9Var.c(((sy9) arrayList.get(i4)).j, z);
                        kz9Var.i(z, 1.0f);
                    }
                }
                i3 = R;
            }
            i2++;
        }
        if (z) {
            this.f2.l(0, i);
            ty9 ty9Var = this.f2;
            ty9Var.l(i3, ty9Var.b() - i3);
        }
        Z0(z);
    }

    @Override
    public final void dismiss() {
        gl.t1(this.T1.getEditText());
        super.dismiss();
    }
}
