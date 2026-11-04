package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b8.mf;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
public final class h6 extends ma {
    public static final int f682d2 = 0;
    public final String Q1;
    public final g6 R1;
    public final HorizontalScrollView S1;
    public final o5 T1;
    public final o5 U1;
    public final o5 V1;
    public final o5 W1;
    public final ci.q4 X1;
    public ci.e2 Y1;
    public final HashSet Z1;
    public boolean f683a2;
    public f6 f684b2;
    public boolean c2;

    public h6(final Context context, String str, final g6 g6Var) {
        super(2, context, (org.telegram.ui.ActionBar.e6) null, false);
        this.Z1 = new HashSet();
        this.C1 = org.telegram.messenger.g0.L(12.0f);
        N();
        this.Q1 = str;
        this.R1 = g6Var;
        this.m1.setTitle(O0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.S1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        o5 o5Var = new o5(context, this.J0);
        this.T1 = o5Var;
        o5Var.setSorting(g6Var.f666c.f1080p);
        linearLayout.addView(o5Var, mf.t(-2, -2, 16, 0, 0, 6, 0));
        o5Var.setOnClickListener(new d(2, this, g6Var));
        o5 o5Var2 = new o5(context, this.J0);
        this.U1 = o5Var2;
        o5Var2.setValue(bd.M0(2131750395, null));
        linearLayout.addView(o5Var2, mf.t(-2, -2, 16, 0, 0, 6, 0));
        o5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final h6 f626b;

            {
                this.f626b = this;
            }

            @Override
            public final void onClick(View view) {
                int i3 = r4;
                final g6 g6Var2 = g6Var;
                h6 h6Var = this.f626b;
                switch (i3) {
                    case 0:
                        w5 w5Var = g6Var2.f666c;
                        if (!w5Var.f1071f.isEmpty()) {
                            final f60 f60Var = new f60(h6Var.f28589c, h6Var.J0, h6Var.U1, false, true, false);
                            f60Var.f33748t = false;
                            f60Var.Y = true;
                            f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var.R = true;
                            f60Var.f33742p = new g4(f60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(w5Var.f1071f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i10 = h6Var.f28583a;
                            n10 n10Var = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i11;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr2 = strArr;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var2 = g6Var3.f666c;
                                            boolean isEmpty = w5Var2.f1074j.isEmpty();
                                            int size = arrayList2.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList2.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var2.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var2.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var3 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var3.f1075k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList2.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var3.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var3.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList2.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i11 = z13;
                                                    } else {
                                                        i11 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i11;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var2 = g6Var2.f666c;
                                            HashSet hashSet = w5Var2.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = w5Var2.f1071f;
                                                    int size = arrayList2.size();
                                                    int i11 = 0;
                                                    while (i11 < size) {
                                                        Object obj3 = arrayList2.get(i11);
                                                        i11++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var2.h();
                                            f60Var.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var3 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var3.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = w5Var3.f1072g;
                                                    int size2 = arrayList3.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList3.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i12) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i12));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i12));
                                            }
                                            w5Var3.h();
                                            f60Var.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var = h6Var.J0;
                            Context context2 = context;
                            i5 i5Var = new i5(context2, i10, 0, false, n10Var, s10Var, null, e6Var, 4);
                            i5Var.f35594g3.f33698r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar = new xs(context2, h6Var.J0);
                            xsVar.setTextSize(1, 16.0f);
                            xsVar.setInputType(573441);
                            xsVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar.setCursorWidth(1.5f);
                            xsVar.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar.setBackground(null);
                            frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 4));
                            if (arrayList.size() > 8) {
                                f60Var.r(frameLayout, mf.o(-1, 44));
                                f60Var.k();
                            }
                            if (!w5Var.f1074j.isEmpty()) {
                                f60Var.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 0), false);
                            }
                            f60Var.q(i5Var);
                            f60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        w5 w5Var2 = g6Var2.f666c;
                        if (!w5Var2.f1072g.isEmpty()) {
                            final f60 f60Var2 = new f60(h6Var.f28589c, h6Var.J0, h6Var.V1, false, true, false);
                            f60Var2.f33748t = false;
                            f60Var2.Y = true;
                            f60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var2.R = true;
                            f60Var2.f33742p = new g4(f60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(w5Var2.f1072g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i11 = h6Var.f28583a;
                            n10 n10Var2 = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var3 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var3.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var3.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var3.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var2 = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var2.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var3 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var3.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = w5Var3.f1072g;
                                                    int size2 = arrayList3.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList3.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i12) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i12));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i12));
                                            }
                                            w5Var3.h();
                                            f60Var2.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var2.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var2 = h6Var.J0;
                            Context context3 = context;
                            i5 i5Var2 = new i5(context3, i11, 0, false, n10Var2, s10Var2, null, e6Var2, 5);
                            i5Var2.f35594g3.f33698r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar2 = new xs(context3, h6Var.J0);
                            xsVar2.setTextSize(1, 16.0f);
                            xsVar2.setInputType(573441);
                            xsVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar2, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar2, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar2.setCursorWidth(1.5f);
                            xsVar2.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar2, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar2.setBackground(null);
                            frameLayout2.addView(xsVar2, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar2.addTextChangedListener(new a0(strArr2, i5Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                f60Var2.r(frameLayout2, mf.o(-1, 44));
                                f60Var2.k();
                            }
                            if (!w5Var2.f1075k.isEmpty()) {
                                f60Var2.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 1), false);
                            }
                            f60Var2.q(i5Var2);
                            f60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        w5 w5Var3 = g6Var2.f666c;
                        if (!w5Var3.h.isEmpty()) {
                            final f60 f60Var3 = new f60(h6Var.f28589c, h6Var.J0, h6Var.W1, false, true, false);
                            f60Var3.f33748t = false;
                            f60Var3.Y = true;
                            f60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var3.R = true;
                            f60Var3.f33742p = new g4(f60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(w5Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i12 = h6Var.f28583a;
                            n10 n10Var3 = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var32.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var3 = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var32.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = w5Var32.f1072g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            w5Var32.h();
                                            f60Var3.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var3.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var3 = h6Var.J0;
                            Context context4 = context;
                            i5 i5Var3 = new i5(context4, i12, 0, false, n10Var3, s10Var3, null, e6Var3, 6);
                            i5Var3.f35594g3.f33698r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar3 = new xs(context4, h6Var.J0);
                            xsVar3.setTextSize(1, 16.0f);
                            xsVar3.setInputType(573441);
                            xsVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar3, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar3, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar3.setCursorWidth(1.5f);
                            xsVar3.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar3, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar3.setBackground(null);
                            frameLayout3.addView(xsVar3, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar3.addTextChangedListener(new a0(strArr3, i5Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                f60Var3.r(frameLayout3, mf.o(-1, 44));
                                f60Var3.k();
                            }
                            if (!w5Var3.f1076l.isEmpty()) {
                                f60Var3.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 2), false);
                            }
                            f60Var3.q(i5Var3);
                            f60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        o5 o5Var3 = new o5(context, this.J0);
        this.V1 = o5Var3;
        o5Var3.setValue(bd.M0(2131750396, null));
        linearLayout.addView(o5Var3, mf.t(-2, -2, 16, 0, 0, 6, 0));
        o5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final h6 f626b;

            {
                this.f626b = this;
            }

            @Override
            public final void onClick(View view) {
                int i3 = r4;
                final g6 g6Var2 = g6Var;
                h6 h6Var = this.f626b;
                switch (i3) {
                    case 0:
                        w5 w5Var = g6Var2.f666c;
                        if (!w5Var.f1071f.isEmpty()) {
                            final f60 f60Var = new f60(h6Var.f28589c, h6Var.J0, h6Var.U1, false, true, false);
                            f60Var.f33748t = false;
                            f60Var.Y = true;
                            f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var.R = true;
                            f60Var.f33742p = new g4(f60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(w5Var.f1071f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i10 = h6Var.f28583a;
                            n10 n10Var = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var32.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var32.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = w5Var32.f1072g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            w5Var32.h();
                                            f60Var.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var = h6Var.J0;
                            Context context2 = context;
                            i5 i5Var = new i5(context2, i10, 0, false, n10Var, s10Var, null, e6Var, 4);
                            i5Var.f35594g3.f33698r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar = new xs(context2, h6Var.J0);
                            xsVar.setTextSize(1, 16.0f);
                            xsVar.setInputType(573441);
                            xsVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar.setCursorWidth(1.5f);
                            xsVar.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar.setBackground(null);
                            frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 4));
                            if (arrayList.size() > 8) {
                                f60Var.r(frameLayout, mf.o(-1, 44));
                                f60Var.k();
                            }
                            if (!w5Var.f1074j.isEmpty()) {
                                f60Var.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 0), false);
                            }
                            f60Var.q(i5Var);
                            f60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        w5 w5Var2 = g6Var2.f666c;
                        if (!w5Var2.f1072g.isEmpty()) {
                            final f60 f60Var2 = new f60(h6Var.f28589c, h6Var.J0, h6Var.V1, false, true, false);
                            f60Var2.f33748t = false;
                            f60Var2.Y = true;
                            f60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var2.R = true;
                            f60Var2.f33742p = new g4(f60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(w5Var2.f1072g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i11 = h6Var.f28583a;
                            n10 n10Var2 = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var32.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var2 = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var32.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = w5Var32.f1072g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            w5Var32.h();
                                            f60Var2.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var2.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var2 = h6Var.J0;
                            Context context3 = context;
                            i5 i5Var2 = new i5(context3, i11, 0, false, n10Var2, s10Var2, null, e6Var2, 5);
                            i5Var2.f35594g3.f33698r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar2 = new xs(context3, h6Var.J0);
                            xsVar2.setTextSize(1, 16.0f);
                            xsVar2.setInputType(573441);
                            xsVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar2, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar2, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar2.setCursorWidth(1.5f);
                            xsVar2.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar2, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar2.setBackground(null);
                            frameLayout2.addView(xsVar2, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar2.addTextChangedListener(new a0(strArr2, i5Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                f60Var2.r(frameLayout2, mf.o(-1, 44));
                                f60Var2.k();
                            }
                            if (!w5Var2.f1075k.isEmpty()) {
                                f60Var2.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 1), false);
                            }
                            f60Var2.q(i5Var2);
                            f60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        w5 w5Var3 = g6Var2.f666c;
                        if (!w5Var3.h.isEmpty()) {
                            final f60 f60Var3 = new f60(h6Var.f28589c, h6Var.J0, h6Var.W1, false, true, false);
                            f60Var3.f33748t = false;
                            f60Var3.Y = true;
                            f60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var3.R = true;
                            f60Var3.f33742p = new g4(f60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(w5Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i12 = h6Var.f28583a;
                            n10 n10Var3 = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var32.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var3 = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var32.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = w5Var32.f1072g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            w5Var32.h();
                                            f60Var3.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var3.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var3 = h6Var.J0;
                            Context context4 = context;
                            i5 i5Var3 = new i5(context4, i12, 0, false, n10Var3, s10Var3, null, e6Var3, 6);
                            i5Var3.f35594g3.f33698r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar3 = new xs(context4, h6Var.J0);
                            xsVar3.setTextSize(1, 16.0f);
                            xsVar3.setInputType(573441);
                            xsVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar3, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar3, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar3.setCursorWidth(1.5f);
                            xsVar3.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar3, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar3.setBackground(null);
                            frameLayout3.addView(xsVar3, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar3.addTextChangedListener(new a0(strArr3, i5Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                f60Var3.r(frameLayout3, mf.o(-1, 44));
                                f60Var3.k();
                            }
                            if (!w5Var3.f1076l.isEmpty()) {
                                f60Var3.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 2), false);
                            }
                            f60Var3.q(i5Var3);
                            f60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        o5 o5Var4 = new o5(context, this.J0);
        this.W1 = o5Var4;
        o5Var4.setValue(bd.M0(2131750388, null));
        linearLayout.addView(o5Var4, mf.t(-2, -2, 16, 0, 0, 0, 0));
        o5Var4.setOnClickListener(new View.OnClickListener(this) {
            public final h6 f626b;

            {
                this.f626b = this;
            }

            @Override
            public final void onClick(View view) {
                int i3 = r4;
                final g6 g6Var2 = g6Var;
                h6 h6Var = this.f626b;
                switch (i3) {
                    case 0:
                        w5 w5Var = g6Var2.f666c;
                        if (!w5Var.f1071f.isEmpty()) {
                            final f60 f60Var = new f60(h6Var.f28589c, h6Var.J0, h6Var.U1, false, true, false);
                            f60Var.f33748t = false;
                            f60Var.Y = true;
                            f60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var.R = true;
                            f60Var.f33742p = new g4(f60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(w5Var.f1071f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i10 = h6Var.f28583a;
                            n10 n10Var = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var32.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var32.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = w5Var32.f1072g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            w5Var32.h();
                                            f60Var.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var = h6Var.J0;
                            Context context2 = context;
                            i5 i5Var = new i5(context2, i10, 0, false, n10Var, s10Var, null, e6Var, 4);
                            i5Var.f35594g3.f33698r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar = new xs(context2, h6Var.J0);
                            xsVar.setTextSize(1, 16.0f);
                            xsVar.setInputType(573441);
                            xsVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar.setCursorWidth(1.5f);
                            xsVar.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar.setBackground(null);
                            frameLayout.addView(xsVar, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar.addTextChangedListener(new a0(strArr, i5Var, false, 4));
                            if (arrayList.size() > 8) {
                                f60Var.r(frameLayout, mf.o(-1, 44));
                                f60Var.k();
                            }
                            if (!w5Var.f1074j.isEmpty()) {
                                f60Var.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 0), false);
                            }
                            f60Var.q(i5Var);
                            f60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        w5 w5Var2 = g6Var2.f666c;
                        if (!w5Var2.f1072g.isEmpty()) {
                            final f60 f60Var2 = new f60(h6Var.f28589c, h6Var.J0, h6Var.V1, false, true, false);
                            f60Var2.f33748t = false;
                            f60Var2.Y = true;
                            f60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var2.R = true;
                            f60Var2.f33742p = new g4(f60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(w5Var2.f1072g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i11 = h6Var.f28583a;
                            n10 n10Var2 = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var32.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var2 = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var32.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = w5Var32.f1072g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            w5Var32.h();
                                            f60Var2.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var2.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var2 = h6Var.J0;
                            Context context3 = context;
                            i5 i5Var2 = new i5(context3, i11, 0, false, n10Var2, s10Var2, null, e6Var2, 5);
                            i5Var2.f35594g3.f33698r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar2 = new xs(context3, h6Var.J0);
                            xsVar2.setTextSize(1, 16.0f);
                            xsVar2.setInputType(573441);
                            xsVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar2, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar2, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar2.setCursorWidth(1.5f);
                            xsVar2.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar2, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar2.setBackground(null);
                            frameLayout2.addView(xsVar2, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar2.addTextChangedListener(new a0(strArr2, i5Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                f60Var2.r(frameLayout2, mf.o(-1, 44));
                                f60Var2.k();
                            }
                            if (!w5Var2.f1075k.isEmpty()) {
                                f60Var2.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 1), false);
                            }
                            f60Var2.q(i5Var2);
                            f60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        w5 w5Var3 = g6Var2.f666c;
                        if (!w5Var3.h.isEmpty()) {
                            final f60 f60Var3 = new f60(h6Var.f28589c, h6Var.J0, h6Var.W1, false, true, false);
                            f60Var3.f33748t = false;
                            f60Var3.Y = true;
                            f60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            f60Var3.R = true;
                            f60Var3.f33742p = new g4(f60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(w5Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            g6 g6Var3 = g6Var2;
                                            Integer num = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) g6Var3.f666c.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            g6 g6Var4 = g6Var2;
                                            Integer num3 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                                            Integer num4 = (Integer) g6Var4.f666c.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            g6 g6Var5 = g6Var2;
                                            Integer num5 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                                            Integer num6 = (Integer) g6Var5.f666c.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
                                            if (num5 == null) {
                                                return 1;
                                            }
                                            if (num6 == null) {
                                                return -1;
                                            }
                                            return num6.intValue() - num5.intValue();
                                    }
                                }
                            });
                            int i12 = h6Var.f28583a;
                            n10 n10Var3 = new n10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    g6 g6Var3 = g6Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            f41 f41Var = (f41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String O3 = org.telegram.messenger.g0.O3(lowerCase);
                                            w5 w5Var22 = g6Var3.f666c;
                                            boolean isEmpty = w5Var22.f1074j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = w5Var22.f1074j.contains(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(O3) || k2.p1.z(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(O3))) {
                                                    Integer num = (Integer) w5Var22.f1077m.get(Long.valueOf(stargiftattributemodel.document.f27007id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = q5.f928b;
                                                    r31 K = r31.K(q5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f37627l = lowerCase;
                                                    K.f37640z = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                    }
                                                    K.L(z11);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(m5.i(bd.M0(2131750018, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            f41 f41Var2 = (f41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                                            w5 w5Var32 = g6Var3.f666c;
                                            boolean isEmpty2 = w5Var32.f1075k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = w5Var32.f1075k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(O32) || k2.p1.z(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(O32))) {
                                                    Integer num2 = (Integer) w5Var32.f1078n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k5.f766b;
                                                    r31 K2 = r31.K(k5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f37627l = lowerCase2;
                                                    K2.f37640z = intValue2;
                                                    if (!TextUtils.isEmpty(lowerCase2)) {
                                                        if (!isEmpty2 && !contains2) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                    }
                                                    K2.L(z12);
                                                    arrayList4.add(K2);
                                                }
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(m5.i(bd.M0(2131750023, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            f41 f41Var3 = (f41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String O33 = org.telegram.messenger.g0.O3(lowerCase3);
                                            w5 w5Var4 = g6Var3.f666c;
                                            boolean isEmpty3 = w5Var4.f1076l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = w5Var4.f1076l.contains(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(O33) || k2.p1.z(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(O33))) {
                                                    Integer num3 = (Integer) w5Var4.f1079o.get(Long.valueOf(stargiftattributepattern.document.f27007id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = t5.f988b;
                                                    r31 K3 = r31.K(t5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f37627l = lowerCase3;
                                                    K3.f37640z = i112;
                                                    if (!TextUtils.isEmpty(lowerCase3)) {
                                                        if (!isEmpty3 && !contains3) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = z13;
                                                        }
                                                    }
                                                    K3.L(z14);
                                                    arrayList5.add(K3);
                                                }
                                                z10 = z13;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(m5.i(bd.M0(2131750016, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            s10 s10Var3 = new s10() {
                                @Override
                                public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    r31 r31Var = (r31) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j10 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                                            w5 w5Var22 = g6Var2.f666c;
                                            HashSet hashSet = w5Var22.f1074j;
                                            if (!hashSet.contains(Long.valueOf(j10))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = w5Var22.f1071f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j11 = ((TL_stars.starGiftAttributeModel) obj3).document.f27007id;
                                                        if (j11 != j10) {
                                                            hashSet.add(Long.valueOf(j11));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j10));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j10));
                                            }
                                            w5Var22.h();
                                            f60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                                            w5 w5Var32 = g6Var2.f666c;
                                            HashSet hashSet2 = w5Var32.f1075k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = w5Var32.f1072g;
                                                    int size2 = arrayList32.size();
                                                    int i13 = 0;
                                                    while (i13 < size2) {
                                                        Object obj4 = arrayList32.get(i13);
                                                        i13++;
                                                        int i14 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i14 != i122) {
                                                            hashSet2.add(Integer.valueOf(i14));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i122));
                                                }
                                            } else {
                                                hashSet2.remove(Integer.valueOf(i122));
                                            }
                                            w5Var32.h();
                                            f60Var3.u();
                                            return;
                                        default:
                                            long j12 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                                            w5 w5Var4 = g6Var2.f666c;
                                            HashSet hashSet3 = w5Var4.f1076l;
                                            if (!hashSet3.contains(Long.valueOf(j12))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = w5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j13 = ((TL_stars.starGiftAttributePattern) obj5).document.f27007id;
                                                        if (j13 != j12) {
                                                            hashSet3.add(Long.valueOf(j13));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j12));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j12));
                                            }
                                            w5Var4.h();
                                            f60Var3.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var3 = h6Var.J0;
                            Context context4 = context;
                            i5 i5Var3 = new i5(context4, i12, 0, false, n10Var3, s10Var3, null, e6Var3, 6);
                            i5Var3.f35594g3.f33698r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232735);
                            org.telegram.ui.ActionBar.r6.t(imageView3, org.telegram.ui.ActionBar.k6.F8, h6Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, mf.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            xs xsVar3 = new xs(context4, h6Var.J0);
                            xsVar3.setTextSize(1, 16.0f);
                            xsVar3.setInputType(573441);
                            xsVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.r6.E(xsVar3, org.telegram.ui.ActionBar.k6.A6, h6Var.J0);
                            org.telegram.ui.ActionBar.r6.m(xsVar3, 30, org.telegram.ui.ActionBar.k6.G6, h6Var.J0);
                            xsVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            xsVar3.setCursorWidth(1.5f);
                            xsVar3.setHint(bd.M0(2131750017, null));
                            org.telegram.ui.ActionBar.r6.V(xsVar3, org.telegram.ui.ActionBar.k6.E8, h6Var.J0);
                            xsVar3.setBackground(null);
                            frameLayout3.addView(xsVar3, mf.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            xsVar3.addTextChangedListener(new a0(strArr3, i5Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                f60Var3.r(frameLayout3, mf.o(-1, 44));
                                f60Var3.k();
                            }
                            if (!w5Var3.f1076l.isEmpty()) {
                                f60Var3.c(2131232357, bd.M0(2131745680, null), new z5(g6Var2, 2), false);
                            }
                            f60Var3.q(i5Var3);
                            f60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        u4.s sVar = new u4.s(3);
        sVar.O = new g2(this, 1);
        this.f36102l1.setLayoutManager(sVar);
        this.f36102l1.setOnItemClickListener(new n(4, this, g6Var));
        this.f36102l1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f28618u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f28618u0, 0);
        this.f36102l1.setOnScrollListener(new j5(this, 1));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xq.h);
        kVar.n(350L);
        this.f36102l1.setItemAnimator(kVar);
        this.f36102l1.setItemSelectorColorProvider(new a3.j(4));
        ci.q4 q4Var = new ci.q4(context);
        this.X1 = q4Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        q4Var.h = L;
        q4Var.f5815n = L2;
        q4Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        q4Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new v2(q4Var, 10), 12.0f, 12, new ArrayList());
        q4Var.setPivotY(0.0f);
        this.f28589c.addView(q4Var, mf.e(-1, -2, 55));
        this.f684b2.O(false);
        g6Var.d = new a6(this, 1);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        f6 f6Var = new f6(this, tj0Var, getContext(), this.f28583a, new c(this, 8), this.J0, 0);
        this.f684b2 = f6Var;
        return f6Var;
    }

    @Override
    public final CharSequence O0() {
        String str = this.Q1;
        if (str != null) {
            return str;
        }
        return bd.M0(2131749779, null);
    }

    @Override
    public final void T0(float f10) {
        float y9 = this.f28586b.getY() + f10;
        ci.q4 q4Var = this.X1;
        float measuredHeight = y9 - q4Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / q4Var.getMeasuredHeight());
        float height = this.f28589c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l10 = Math.min(l10, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.g0.N(128.0f))));
        }
        q4Var.setScaleX(l10);
        q4Var.setScaleY(l10);
        q4Var.setAlpha(org.telegram.messenger.g0.z1(l10, 0.5f, 1.0f));
        q4Var.setTranslationY(measuredHeight);
    }

    public final void d1() {
        int R;
        r31 G;
        int i3 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            tj0 tj0Var = this.f36102l1;
            if (i3 >= tj0Var.getChildCount()) {
                break;
            }
            View childAt = tj0Var.getChildAt(i3);
            if ((childAt instanceof iz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f684b2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i3++;
        }
        g6 g6Var = this.R1;
        if (z10) {
            g6Var.f665b.a();
        }
        if (z11) {
            g6Var.f666c.g(false);
        }
    }
}
