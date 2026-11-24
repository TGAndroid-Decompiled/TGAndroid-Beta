package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class yb9 extends mz0 {
    public static final int f2 = 0;
    public final String S1;
    public final xb9 T1;
    public final HorizontalScrollView U1;
    public final ib9 V1;
    public final ib9 W1;
    public final ib9 X1;
    public final ib9 Y1;
    public final hra Z1;
    public h72 a2;
    public final HashSet b2;
    public boolean c2;
    public vb d2;
    public boolean e2;

    public yb9(final Context context, String str, final xb9 xb9Var) {
        super(2, (ylb) null, context, false);
        this.b2 = new HashSet();
        this.E1 = gm.L(12.0f);
        J();
        this.S1 = str;
        this.T1 = xb9Var;
        this.o1.setTitle(J0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(gm.L(11.0f), gm.L(6.0f), gm.L(11.0f), gm.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.U1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        ib9 ib9Var = new ib9(this.J0, context, false);
        this.V1 = ib9Var;
        ib9Var.setSorting(xb9Var.c.p);
        linearLayout.addView(ib9Var, qoe.t(-2, -2, 16, 0, 0, 6, 0));
        ib9Var.setOnClickListener(new r39(this, xb9Var, (byte) 2));
        ib9 ib9Var2 = new ib9(this.J0, context, false);
        this.W1 = ib9Var2;
        ib9Var2.setValue(jb6.M0(2131750320, null));
        linearLayout.addView(ib9Var2, qoe.t(-2, -2, 16, 0, 0, 6, 0));
        ib9Var2.setOnClickListener(new View.OnClickListener(this) {
            public final yb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r4;
                final xb9 xb9Var2 = xb9Var;
                yb9 yb9Var = this.b;
                switch (b) {
                    case 0:
                        qb9 qb9Var = xb9Var2.c;
                        if (!qb9Var.f.isEmpty()) {
                            final bu5 bu5Var = new bu5(yb9Var.c, yb9Var.J0, yb9Var.W1, false, true, false);
                            bu5Var.t = false;
                            bu5Var.b0 = true;
                            bu5Var.b0(0.0f, gm.L(-8.0f));
                            bu5Var.U = true;
                            bu5Var.p = new bo1(bu5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(qb9Var.f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i = yb9Var.a;
                            jac jacVar = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i2;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList2 = arrayList;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr2 = strArr;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var2 = xb9Var3.c;
                                            boolean isEmpty = qb9Var2.j.isEmpty();
                                            int size = arrayList2.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj3 = arrayList2.get(i3);
                                                i3++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var2.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var2.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var3 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var3.k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList2.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList2.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i2 = z;
                                                } else {
                                                    i2 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i2;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i2 = 0;
                                    bu5 bu5Var2 = bu5Var;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var2 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var2.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = qb9Var2.f;
                                                    int size = arrayList2.size();
                                                    while (i2 < size) {
                                                        Object obj3 = arrayList2.get(i2);
                                                        i2++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var2.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var2.m();
                                            bu5Var2.u();
                                            return;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i3));
                                            qb9 qb9Var3 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var3.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = qb9Var3.g;
                                                    int size2 = arrayList3.size();
                                                    while (i2 < size2) {
                                                        Object obj4 = arrayList3.get(i2);
                                                        i2++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i3) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i3));
                                                }
                                            } else {
                                                qb9Var3.k.remove(Integer.valueOf(i3));
                                            }
                                            qb9Var3.m();
                                            bu5Var2.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i2 < size3) {
                                                        Object obj5 = arrayList4.get(i2);
                                                        i2++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var2.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar = yb9Var.J0;
                            Context context2 = context;
                            t34 t34Var = new t34(context2, i, 0, false, jacVar, oacVar, null, ylbVar, (byte) 5);
                            t34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232754);
                            anb.s(imageView, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var = new qu3(context2, yb9Var.J0);
                            qu3Var.setTextSize(1, 16.0f);
                            qu3Var.setInputType(573441);
                            qu3Var.setRawInputType(573441);
                            anb.D(qu3Var, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var, 30, cmb.F6, yb9Var.J0);
                            qu3Var.setCursorSize(gm.L(19.0f));
                            qu3Var.setCursorWidth(1.5f);
                            qu3Var.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var, cmb.D8, yb9Var.J0);
                            qu3Var.setBackground(null);
                            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                bu5Var.q(frameLayout, qoe.o(-1, 44));
                                bu5Var.j();
                            }
                            if (!qb9Var.j.isEmpty()) {
                                bu5Var.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 0), false);
                            }
                            bu5Var.p(t34Var);
                            bu5Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        qb9 qb9Var2 = xb9Var2.c;
                        if (!qb9Var2.g.isEmpty()) {
                            final bu5 bu5Var2 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.X1, false, true, false);
                            bu5Var2.t = false;
                            bu5Var2.b0 = true;
                            bu5Var2.b0(0.0f, gm.L(-8.0f));
                            bu5Var2.U = true;
                            bu5Var2.p = new bo1(bu5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(qb9Var2.g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i2 = yb9Var.a;
                            jac jacVar2 = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj3 = arrayList22.get(i3);
                                                i3++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList3.add(K);
                                                }
                                            }
                                            if (arrayList3.isEmpty()) {
                                                arrayList3.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var3 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var3.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var3.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var3.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar2 = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var2;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i3 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i3));
                                            qb9 qb9Var3 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var3.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = qb9Var3.g;
                                                    int size2 = arrayList3.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList3.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i3) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i3));
                                                }
                                            } else {
                                                qb9Var3.k.remove(Integer.valueOf(i3));
                                            }
                                            qb9Var3.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar2 = yb9Var.J0;
                            Context context3 = context;
                            t34 t34Var2 = new t34(context3, i2, 0, false, jacVar2, oacVar2, null, ylbVar2, (byte) 6);
                            t34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232754);
                            anb.s(imageView2, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var2 = new qu3(context3, yb9Var.J0);
                            qu3Var2.setTextSize(1, 16.0f);
                            qu3Var2.setInputType(573441);
                            qu3Var2.setRawInputType(573441);
                            anb.D(qu3Var2, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var2, 30, cmb.F6, yb9Var.J0);
                            qu3Var2.setCursorSize(gm.L(19.0f));
                            qu3Var2.setCursorWidth(1.5f);
                            qu3Var2.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var2, cmb.D8, yb9Var.J0);
                            qu3Var2.setBackground(null);
                            frameLayout2.addView(qu3Var2, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var2.addTextChangedListener(new qz(strArr2, t34Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                bu5Var2.q(frameLayout2, qoe.o(-1, 44));
                                bu5Var2.j();
                            }
                            if (!qb9Var2.k.isEmpty()) {
                                bu5Var2.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 1), false);
                            }
                            bu5Var2.p(t34Var2);
                            bu5Var2.a0();
                            return;
                        }
                        return;
                    default:
                        qb9 qb9Var3 = xb9Var2.c;
                        if (!qb9Var3.h.isEmpty()) {
                            final bu5 bu5Var3 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.Y1, false, true, false);
                            bu5Var3.t = false;
                            bu5Var3.b0 = true;
                            bu5Var3.b0(0.0f, gm.L(-8.0f));
                            bu5Var3.U = true;
                            bu5Var3.p = new bo1(bu5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(qb9Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i3 = yb9Var.a;
                            jac jacVar3 = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i32 = 0;
                                            while (i32 < size) {
                                                Object obj3 = arrayList22.get(i32);
                                                i32++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar3 = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var3;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            } else {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar3 = yb9Var.J0;
                            Context context4 = context;
                            t34 t34Var3 = new t34(context4, i3, 0, false, jacVar3, oacVar3, null, ylbVar3, (byte) 7);
                            t34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232754);
                            anb.s(imageView3, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var3 = new qu3(context4, yb9Var.J0);
                            qu3Var3.setTextSize(1, 16.0f);
                            qu3Var3.setInputType(573441);
                            qu3Var3.setRawInputType(573441);
                            anb.D(qu3Var3, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var3, 30, cmb.F6, yb9Var.J0);
                            qu3Var3.setCursorSize(gm.L(19.0f));
                            qu3Var3.setCursorWidth(1.5f);
                            qu3Var3.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var3, cmb.D8, yb9Var.J0);
                            qu3Var3.setBackground(null);
                            frameLayout3.addView(qu3Var3, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var3.addTextChangedListener(new qz(strArr3, t34Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                bu5Var3.q(frameLayout3, qoe.o(-1, 44));
                                bu5Var3.j();
                            }
                            if (!qb9Var3.l.isEmpty()) {
                                bu5Var3.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 2), false);
                            }
                            bu5Var3.p(t34Var3);
                            bu5Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        ib9 ib9Var3 = new ib9(this.J0, context, false);
        this.X1 = ib9Var3;
        ib9Var3.setValue(jb6.M0(2131750321, null));
        linearLayout.addView(ib9Var3, qoe.t(-2, -2, 16, 0, 0, 6, 0));
        ib9Var3.setOnClickListener(new View.OnClickListener(this) {
            public final yb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r4;
                final xb9 xb9Var2 = xb9Var;
                yb9 yb9Var = this.b;
                switch (b) {
                    case 0:
                        qb9 qb9Var = xb9Var2.c;
                        if (!qb9Var.f.isEmpty()) {
                            final bu5 bu5Var = new bu5(yb9Var.c, yb9Var.J0, yb9Var.W1, false, true, false);
                            bu5Var.t = false;
                            bu5Var.b0 = true;
                            bu5Var.b0(0.0f, gm.L(-8.0f));
                            bu5Var.U = true;
                            bu5Var.p = new bo1(bu5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(qb9Var.f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i = yb9Var.a;
                            jac jacVar = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i32 = 0;
                                            while (i32 < size) {
                                                Object obj3 = arrayList22.get(i32);
                                                i32++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            } else {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar = yb9Var.J0;
                            Context context2 = context;
                            t34 t34Var = new t34(context2, i, 0, false, jacVar, oacVar, null, ylbVar, (byte) 5);
                            t34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232754);
                            anb.s(imageView, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var = new qu3(context2, yb9Var.J0);
                            qu3Var.setTextSize(1, 16.0f);
                            qu3Var.setInputType(573441);
                            qu3Var.setRawInputType(573441);
                            anb.D(qu3Var, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var, 30, cmb.F6, yb9Var.J0);
                            qu3Var.setCursorSize(gm.L(19.0f));
                            qu3Var.setCursorWidth(1.5f);
                            qu3Var.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var, cmb.D8, yb9Var.J0);
                            qu3Var.setBackground(null);
                            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                bu5Var.q(frameLayout, qoe.o(-1, 44));
                                bu5Var.j();
                            }
                            if (!qb9Var.j.isEmpty()) {
                                bu5Var.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 0), false);
                            }
                            bu5Var.p(t34Var);
                            bu5Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        qb9 qb9Var2 = xb9Var2.c;
                        if (!qb9Var2.g.isEmpty()) {
                            final bu5 bu5Var2 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.X1, false, true, false);
                            bu5Var2.t = false;
                            bu5Var2.b0 = true;
                            bu5Var2.b0(0.0f, gm.L(-8.0f));
                            bu5Var2.U = true;
                            bu5Var2.p = new bo1(bu5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(qb9Var2.g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i2 = yb9Var.a;
                            jac jacVar2 = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i32 = 0;
                                            while (i32 < size) {
                                                Object obj3 = arrayList22.get(i32);
                                                i32++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar2 = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var2;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            } else {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar2 = yb9Var.J0;
                            Context context3 = context;
                            t34 t34Var2 = new t34(context3, i2, 0, false, jacVar2, oacVar2, null, ylbVar2, (byte) 6);
                            t34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232754);
                            anb.s(imageView2, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var2 = new qu3(context3, yb9Var.J0);
                            qu3Var2.setTextSize(1, 16.0f);
                            qu3Var2.setInputType(573441);
                            qu3Var2.setRawInputType(573441);
                            anb.D(qu3Var2, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var2, 30, cmb.F6, yb9Var.J0);
                            qu3Var2.setCursorSize(gm.L(19.0f));
                            qu3Var2.setCursorWidth(1.5f);
                            qu3Var2.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var2, cmb.D8, yb9Var.J0);
                            qu3Var2.setBackground(null);
                            frameLayout2.addView(qu3Var2, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var2.addTextChangedListener(new qz(strArr2, t34Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                bu5Var2.q(frameLayout2, qoe.o(-1, 44));
                                bu5Var2.j();
                            }
                            if (!qb9Var2.k.isEmpty()) {
                                bu5Var2.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 1), false);
                            }
                            bu5Var2.p(t34Var2);
                            bu5Var2.a0();
                            return;
                        }
                        return;
                    default:
                        qb9 qb9Var3 = xb9Var2.c;
                        if (!qb9Var3.h.isEmpty()) {
                            final bu5 bu5Var3 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.Y1, false, true, false);
                            bu5Var3.t = false;
                            bu5Var3.b0 = true;
                            bu5Var3.b0(0.0f, gm.L(-8.0f));
                            bu5Var3.U = true;
                            bu5Var3.p = new bo1(bu5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(qb9Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i3 = yb9Var.a;
                            jac jacVar3 = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i32 = 0;
                                            while (i32 < size) {
                                                Object obj3 = arrayList22.get(i32);
                                                i32++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar3 = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var3;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            } else {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar3 = yb9Var.J0;
                            Context context4 = context;
                            t34 t34Var3 = new t34(context4, i3, 0, false, jacVar3, oacVar3, null, ylbVar3, (byte) 7);
                            t34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232754);
                            anb.s(imageView3, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var3 = new qu3(context4, yb9Var.J0);
                            qu3Var3.setTextSize(1, 16.0f);
                            qu3Var3.setInputType(573441);
                            qu3Var3.setRawInputType(573441);
                            anb.D(qu3Var3, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var3, 30, cmb.F6, yb9Var.J0);
                            qu3Var3.setCursorSize(gm.L(19.0f));
                            qu3Var3.setCursorWidth(1.5f);
                            qu3Var3.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var3, cmb.D8, yb9Var.J0);
                            qu3Var3.setBackground(null);
                            frameLayout3.addView(qu3Var3, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var3.addTextChangedListener(new qz(strArr3, t34Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                bu5Var3.q(frameLayout3, qoe.o(-1, 44));
                                bu5Var3.j();
                            }
                            if (!qb9Var3.l.isEmpty()) {
                                bu5Var3.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 2), false);
                            }
                            bu5Var3.p(t34Var3);
                            bu5Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        ib9 ib9Var4 = new ib9(this.J0, context, false);
        this.Y1 = ib9Var4;
        ib9Var4.setValue(jb6.M0(2131750313, null));
        linearLayout.addView(ib9Var4, qoe.t(-2, -2, 16, 0, 0, 0, 0));
        ib9Var4.setOnClickListener(new View.OnClickListener(this) {
            public final yb9 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r4;
                final xb9 xb9Var2 = xb9Var;
                yb9 yb9Var = this.b;
                switch (b) {
                    case 0:
                        qb9 qb9Var = xb9Var2.c;
                        if (!qb9Var.f.isEmpty()) {
                            final bu5 bu5Var = new bu5(yb9Var.c, yb9Var.J0, yb9Var.W1, false, true, false);
                            bu5Var.t = false;
                            bu5Var.b0 = true;
                            bu5Var.b0(0.0f, gm.L(-8.0f));
                            bu5Var.U = true;
                            bu5Var.p = new bo1(bu5Var, (byte) 8);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(qb9Var.f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i = yb9Var.a;
                            jac jacVar = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i32 = 0;
                                            while (i32 < size) {
                                                Object obj3 = arrayList22.get(i32);
                                                i32++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            } else {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar = yb9Var.J0;
                            Context context2 = context;
                            t34 t34Var = new t34(context2, i, 0, false, jacVar, oacVar, null, ylbVar, (byte) 5);
                            t34Var.g3.r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232754);
                            anb.s(imageView, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var = new qu3(context2, yb9Var.J0);
                            qu3Var.setTextSize(1, 16.0f);
                            qu3Var.setInputType(573441);
                            qu3Var.setRawInputType(573441);
                            anb.D(qu3Var, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var, 30, cmb.F6, yb9Var.J0);
                            qu3Var.setCursorSize(gm.L(19.0f));
                            qu3Var.setCursorWidth(1.5f);
                            qu3Var.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var, cmb.D8, yb9Var.J0);
                            qu3Var.setBackground(null);
                            frameLayout.addView(qu3Var, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var.addTextChangedListener(new qz(strArr, t34Var, false, (byte) 14));
                            if (arrayList.size() > 8) {
                                bu5Var.q(frameLayout, qoe.o(-1, 44));
                                bu5Var.j();
                            }
                            if (!qb9Var.j.isEmpty()) {
                                bu5Var.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 0), false);
                            }
                            bu5Var.p(t34Var);
                            bu5Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        qb9 qb9Var2 = xb9Var2.c;
                        if (!qb9Var2.g.isEmpty()) {
                            final bu5 bu5Var2 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.X1, false, true, false);
                            bu5Var2.t = false;
                            bu5Var2.b0 = true;
                            bu5Var2.b0(0.0f, gm.L(-8.0f));
                            bu5Var2.U = true;
                            bu5Var2.p = new bo1(bu5Var2, (byte) 6);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(qb9Var2.g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i2 = yb9Var.a;
                            jac jacVar2 = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList2;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr2;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i32 = 0;
                                            while (i32 < size) {
                                                Object obj3 = arrayList22.get(i32);
                                                i32++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar2 = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var2;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            } else {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar2 = yb9Var.J0;
                            Context context3 = context;
                            t34 t34Var2 = new t34(context3, i2, 0, false, jacVar2, oacVar2, null, ylbVar2, (byte) 6);
                            t34Var2.g3.r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232754);
                            anb.s(imageView2, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var2 = new qu3(context3, yb9Var.J0);
                            qu3Var2.setTextSize(1, 16.0f);
                            qu3Var2.setInputType(573441);
                            qu3Var2.setRawInputType(573441);
                            anb.D(qu3Var2, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var2, 30, cmb.F6, yb9Var.J0);
                            qu3Var2.setCursorSize(gm.L(19.0f));
                            qu3Var2.setCursorWidth(1.5f);
                            qu3Var2.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var2, cmb.D8, yb9Var.J0);
                            qu3Var2.setBackground(null);
                            frameLayout2.addView(qu3Var2, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var2.addTextChangedListener(new qz(strArr2, t34Var2, false, (byte) 15));
                            if (arrayList2.size() > 8) {
                                bu5Var2.q(frameLayout2, qoe.o(-1, 44));
                                bu5Var2.j();
                            }
                            if (!qb9Var2.k.isEmpty()) {
                                bu5Var2.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 1), false);
                            }
                            bu5Var2.p(t34Var2);
                            bu5Var2.a0();
                            return;
                        }
                        return;
                    default:
                        qb9 qb9Var3 = xb9Var2.c;
                        if (!qb9Var3.h.isEmpty()) {
                            final bu5 bu5Var3 = new bu5(yb9Var.c, yb9Var.J0, yb9Var.Y1, false, true, false);
                            bu5Var3.t = false;
                            bu5Var3.b0 = true;
                            bu5Var3.b0(0.0f, gm.L(-8.0f));
                            bu5Var3.U = true;
                            bu5Var3.p = new bo1(bu5Var3, (byte) 7);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(qb9Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    byte b2 = r2;
                                    xb9 xb9Var3 = xb9Var2;
                                    switch (b2) {
                                        case 0:
                                            Integer num = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) xb9Var3.c.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            Integer num3 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                                            Integer num4 = (Integer) xb9Var3.c.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            Integer num5 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                                            Integer num6 = (Integer) xb9Var3.c.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
                            int i3 = yb9Var.a;
                            jac jacVar3 = new jac() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    String str2;
                                    int intValue2;
                                    boolean z;
                                    String str3;
                                    int i22;
                                    byte b2 = r4;
                                    boolean z2 = false;
                                    String str4 = " ";
                                    ArrayList arrayList22 = arrayList3;
                                    xb9 xb9Var3 = xb9Var2;
                                    String[] strArr22 = strArr3;
                                    switch (b2) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            l7c l7cVar = (l7c) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String I3 = gm.I3(lowerCase);
                                            qb9 qb9Var22 = xb9Var3.c;
                                            boolean isEmpty = qb9Var22.j.isEmpty();
                                            int size = arrayList22.size();
                                            int i32 = 0;
                                            while (i32 < size) {
                                                Object obj3 = arrayList22.get(i32);
                                                i32++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = qb9Var22.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                                                boolean z3 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(I3) || hg9.s(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I3))) {
                                                    Integer num = (Integer) qb9Var22.m.get(Long.valueOf(stargiftattributemodel.document.id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i4 = kb9.b;
                                                    c6c K = c6c.K(kb9.class);
                                                    K.H = stargiftattributemodel;
                                                    K.m = lowerCase;
                                                    K.A = intValue;
                                                    if (!TextUtils.isEmpty(lowerCase)) {
                                                        if (!isEmpty && !contains) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    }
                                                    K.L(z3);
                                                    arrayList32.add(K);
                                                }
                                            }
                                            if (arrayList32.isEmpty()) {
                                                arrayList32.add(gb9.i(jb6.M0(2131749943, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            String str5 = " ";
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            l7c l7cVar2 = (l7c) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String I32 = gm.I3(lowerCase2);
                                            qb9 qb9Var32 = xb9Var3.c;
                                            boolean isEmpty2 = qb9Var32.k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i5 = 0;
                                            while (i5 < size2) {
                                                Object obj4 = arrayList22.get(i5);
                                                i5++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = qb9Var32.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z4 = !contains2;
                                                if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                                                    str2 = str5;
                                                    if (!hg9.s(str2, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str2.concat(I32))) {
                                                        str5 = str2;
                                                    }
                                                } else {
                                                    str2 = str5;
                                                }
                                                Integer num2 = (Integer) qb9Var32.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                if (num2 == null) {
                                                    intValue2 = 0;
                                                } else {
                                                    intValue2 = num2.intValue();
                                                }
                                                int i6 = db9.b;
                                                c6c K2 = c6c.K(db9.class);
                                                K2.H = stargiftattributebackdrop;
                                                K2.m = lowerCase2;
                                                K2.A = intValue2;
                                                if (!TextUtils.isEmpty(lowerCase2)) {
                                                    if (!isEmpty2 && !contains2) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                K2.L(z4);
                                                arrayList4.add(K2);
                                                str5 = str2;
                                            }
                                            if (arrayList4.isEmpty()) {
                                                arrayList4.add(gb9.i(jb6.M0(2131749948, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            l7c l7cVar3 = (l7c) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String I33 = gm.I3(lowerCase3);
                                            qb9 qb9Var4 = xb9Var3.c;
                                            boolean isEmpty3 = qb9Var4.l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i7 = 0;
                                            while (i7 < size3) {
                                                Object obj5 = arrayList22.get(i7);
                                                i7++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean contains3 = qb9Var4.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                                                boolean z5 = !contains3;
                                                if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(I33) && !hg9.s(str4, lowerCase3, stargiftattributepattern.name.toLowerCase())) {
                                                    z = z2;
                                                    if (!stargiftattributepattern.name.toLowerCase().contains(str4.concat(I33))) {
                                                        str3 = str4;
                                                        z2 = z;
                                                        str4 = str3;
                                                    }
                                                } else {
                                                    z = z2;
                                                }
                                                str3 = str4;
                                                Integer num3 = (Integer) qb9Var4.o.get(Long.valueOf(stargiftattributepattern.document.id));
                                                if (num3 == null) {
                                                    i22 = z;
                                                } else {
                                                    i22 = num3.intValue();
                                                }
                                                int i8 = nb9.b;
                                                c6c K3 = c6c.K(nb9.class);
                                                K3.H = stargiftattributepattern;
                                                K3.m = lowerCase3;
                                                K3.A = i22;
                                                if (!TextUtils.isEmpty(lowerCase3)) {
                                                    if (!isEmpty3 && !contains3) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = z;
                                                    }
                                                }
                                                K3.L(z5);
                                                arrayList5.add(K3);
                                                z2 = z;
                                                str4 = str3;
                                            }
                                            if (arrayList5.isEmpty()) {
                                                arrayList5.add(gb9.i(jb6.M0(2131749941, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            oac oacVar3 = new oac() {
                                @Override
                                public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    byte b2 = r3;
                                    int i22 = 0;
                                    bu5 bu5Var22 = bu5Var3;
                                    xb9 xb9Var3 = xb9Var2;
                                    c6c c6cVar = (c6c) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f = (Float) serializable;
                                    Float f3 = (Float) serializable2;
                                    switch (b2) {
                                        case 0:
                                            long j = ((TL_stars.starGiftAttributeModel) c6cVar.H).document.id;
                                            boolean contains = xb9Var3.c.j.contains(Long.valueOf(j));
                                            qb9 qb9Var22 = xb9Var3.c;
                                            if (!contains) {
                                                HashSet hashSet = qb9Var22.j;
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = qb9Var22.f;
                                                    int size = arrayList22.size();
                                                    while (i22 < size) {
                                                        Object obj3 = arrayList22.get(i22);
                                                        i22++;
                                                        long j2 = ((TL_stars.starGiftAttributeModel) obj3).document.id;
                                                        if (j2 != j) {
                                                            hashSet.add(Long.valueOf(j2));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j));
                                                }
                                            } else {
                                                qb9Var22.j.remove(Long.valueOf(j));
                                            }
                                            qb9Var22.m();
                                            bu5Var22.u();
                                            return;
                                        case 1:
                                            int i32 = ((TL_stars.starGiftAttributeBackdrop) c6cVar.H).backdrop_id;
                                            boolean contains2 = xb9Var3.c.k.contains(Integer.valueOf(i32));
                                            qb9 qb9Var32 = xb9Var3.c;
                                            if (!contains2) {
                                                HashSet hashSet2 = qb9Var32.k;
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = qb9Var32.g;
                                                    int size2 = arrayList32.size();
                                                    while (i22 < size2) {
                                                        Object obj4 = arrayList32.get(i22);
                                                        i22++;
                                                        int i4 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                                                        if (i4 != i32) {
                                                            hashSet2.add(Integer.valueOf(i4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet2.add(Integer.valueOf(i32));
                                                }
                                            } else {
                                                qb9Var32.k.remove(Integer.valueOf(i32));
                                            }
                                            qb9Var32.m();
                                            bu5Var22.u();
                                            return;
                                        default:
                                            long j3 = ((TL_stars.starGiftAttributePattern) c6cVar.H).document.id;
                                            boolean contains3 = xb9Var3.c.l.contains(Long.valueOf(j3));
                                            qb9 qb9Var4 = xb9Var3.c;
                                            if (!contains3) {
                                                HashSet hashSet3 = qb9Var4.l;
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = qb9Var4.h;
                                                    int size3 = arrayList4.size();
                                                    while (i22 < size3) {
                                                        Object obj5 = arrayList4.get(i22);
                                                        i22++;
                                                        long j4 = ((TL_stars.starGiftAttributePattern) obj5).document.id;
                                                        if (j4 != j3) {
                                                            hashSet3.add(Long.valueOf(j4));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                qb9Var4.l.remove(Long.valueOf(j3));
                                            }
                                            qb9Var4.m();
                                            bu5Var22.u();
                                            return;
                                    }
                                }
                            };
                            ylb ylbVar3 = yb9Var.J0;
                            Context context4 = context;
                            t34 t34Var3 = new t34(context4, i3, 0, false, jacVar3, oacVar3, null, ylbVar3, (byte) 7);
                            t34Var3.g3.r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232754);
                            anb.s(imageView3, cmb.E8, yb9Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, qoe.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            qu3 qu3Var3 = new qu3(context4, yb9Var.J0);
                            qu3Var3.setTextSize(1, 16.0f);
                            qu3Var3.setInputType(573441);
                            qu3Var3.setRawInputType(573441);
                            anb.D(qu3Var3, cmb.z6, yb9Var.J0);
                            anb.l(qu3Var3, 30, cmb.F6, yb9Var.J0);
                            qu3Var3.setCursorSize(gm.L(19.0f));
                            qu3Var3.setCursorWidth(1.5f);
                            qu3Var3.setHint(jb6.M0(2131749942, null));
                            anb.X(qu3Var3, cmb.D8, yb9Var.J0);
                            qu3Var3.setBackground(null);
                            frameLayout3.addView(qu3Var3, qoe.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            qu3Var3.addTextChangedListener(new qz(strArr3, t34Var3, false, (byte) 16));
                            if (arrayList3.size() > 8) {
                                bu5Var3.q(frameLayout3, qoe.o(-1, 44));
                                bu5Var3.j();
                            }
                            if (!qb9Var3.l.isEmpty()) {
                                bu5Var3.b(2131232363, jb6.M0(2131745404, null), new tb9(xb9Var2, (byte) 2), false);
                            }
                            bu5Var3.p(t34Var3);
                            bu5Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        q55 q55Var = new q55(3);
        q55Var.O = new zr1(this, (byte) 14);
        this.n1.setLayoutManager(q55Var);
        this.n1.setOnItemClickListener(new xr8(this, xb9Var, (byte) 7));
        this.n1.setPadding(gm.L(8.0f) + this.u0, 0, gm.L(8.0f) + this.u0, 0);
        this.n1.setOnScrollListener(new so7(this, (byte) 13));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.n1.setItemAnimator(sc3Var);
        this.n1.setItemSelectorColorProvider(new i98((byte) 19));
        hra hraVar = new hra(context);
        this.Z1 = hraVar;
        int L = gm.L(20.0f);
        int L2 = gm.L(9.0f);
        hraVar.h = L;
        hraVar.n = L2;
        hraVar.setRoundRadius(gm.L(22.0f));
        hraVar.setFullRect(true);
        gm.k2(new eg9(hraVar, (byte) 8), 12.0f, 12, new ArrayList());
        hraVar.setPivotY(0.0f);
        this.c.addView(hraVar, qoe.e(-1, -2, 55));
        this.d2.O(false);
        xb9Var.d = new ub9(this, (byte) 1);
    }

    @Override
    public final q59 G0(r59 r59Var) {
        vb vbVar = new vb(this, r59Var, getContext(), this.a, new vh8(this, (byte) 9), this.J0, (byte) 3);
        this.d2 = vbVar;
        return vbVar;
    }

    @Override
    public final CharSequence J0() {
        String str = this.S1;
        if (str != null) {
            return str;
        }
        return jb6.M0(2131749704, null);
    }

    @Override
    public final void O0(float f) {
        float y = this.b.getY() + f;
        hra hraVar = this.Z1;
        float measuredHeight = y - hraVar.getMeasuredHeight();
        float l = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + gm.L(8.0f)) / hraVar.getMeasuredHeight());
        float height = this.c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l = Math.min(l, Utilities.l(1.0f - ((measuredHeight - height) / gm.N(128.0f))));
        }
        hraVar.setScaleX(l);
        hraVar.setScaleY(l);
        hraVar.setAlpha(gm.x1(l, 0.5f, 1.0f));
        hraVar.setTranslationY(measuredHeight);
    }

    public final void Y0() {
        int R;
        c6c G;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            r59 r59Var = this.n1;
            if (i >= r59Var.getChildCount()) {
                break;
            }
            View childAt = r59Var.getChildAt(i);
            if ((childAt instanceof tk4) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.d2.G(R)) != null) {
                if (G.d < 10) {
                    z = true;
                } else {
                    z2 = true;
                }
            }
            i++;
        }
        xb9 xb9Var = this.T1;
        if (z) {
            xb9Var.b.a();
        }
        if (z2) {
            xb9Var.c.l(false);
        }
    }
}
