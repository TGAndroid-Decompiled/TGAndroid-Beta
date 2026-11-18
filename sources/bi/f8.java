package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z41;
public final class f8 extends sa {
    public static final int f3582g2 = 0;
    public final String T1;
    public final e8 U1;
    public final HorizontalScrollView V1;
    public final l7 W1;
    public final l7 X1;
    public final l7 Y1;
    public final l7 Z1;
    public final di.k4 f3583a2;
    public di.c2 f3584b2;
    public final HashSet f3585c2;
    public boolean d2;
    public d8 f3586e2;
    public boolean f3587f2;

    public f8(final Context context, String str, final e8 e8Var) {
        super(2, context, (org.telegram.ui.ActionBar.i6) null, false);
        this.f3585c2 = new HashSet();
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        this.T1 = str;
        this.U1 = e8Var;
        this.f39535p1.setTitle(P0());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(6.0f));
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.V1 = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipChildren(false);
        horizontalScrollView.setClipToPadding(false);
        horizontalScrollView.addView(linearLayout);
        l7 l7Var = new l7(context, this.J0, false);
        this.W1 = l7Var;
        l7Var.setSorting(e8Var.f3554c.f4100p);
        linearLayout.addView(l7Var, ma.t(-2, -2, 16, 0, 0, 6, 0));
        l7Var.setOnClickListener(new ai.v2(7, this, e8Var));
        l7 l7Var2 = new l7(context, this.J0, false);
        this.X1 = l7Var2;
        l7Var2.setValue(gd.M0(2131750371, null));
        linearLayout.addView(l7Var2, ma.t(-2, -2, 16, 0, 0, 6, 0));
        l7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f3505b;

            {
                this.f3505b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final e8 e8Var2 = e8Var;
                f8 f8Var = this.f3505b;
                switch (i7) {
                    case 0:
                        u7 u7Var = e8Var2.f3554c;
                        if (!u7Var.f4091f.isEmpty()) {
                            final y60 y60Var = new y60(f8Var.f30193c, f8Var.J0, f8Var.X1, false, true, false);
                            y60Var.f42377t = false;
                            y60Var.f42345b0 = true;
                            y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var.U = true;
                            y60Var.f42369p = new b6(y60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(u7Var.f4091f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i10 = f8Var.f30187a;
                            q10 q10Var = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i11;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr2 = strArr;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var2 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var2.f4094j.isEmpty();
                                            int size = arrayList2.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList2.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var2.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var2.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList3.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var3 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var3.f4095k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList2.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var3.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var3.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList2.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i11 = z13;
                                                    } else {
                                                        i11 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i11;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var2 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var2.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = u7Var2.f4091f;
                                                    int size = arrayList2.size();
                                                    int i11 = 0;
                                                    while (i11 < size) {
                                                        Object obj3 = arrayList2.get(i11);
                                                        i11++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var2.m();
                                            y60Var.v();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var3 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var3.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = u7Var3.f4092g;
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
                                            u7Var3.m();
                                            y60Var.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = f8Var.J0;
                            Context context2 = context;
                            f7 f7Var = new f7(context2, i10, 0, false, q10Var, v10Var, null, i6Var, 4);
                            f7Var.f34607g3.f42809r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, f8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, f7Var, false, 4));
                            if (arrayList.size() > 8) {
                                y60Var.r(frameLayout, ma.o(-1, 44));
                                y60Var.k();
                            }
                            if (!u7Var.f4094j.isEmpty()) {
                                y60Var.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 0), false);
                            }
                            y60Var.q(f7Var);
                            y60Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        u7 u7Var2 = e8Var2.f3554c;
                        if (!u7Var2.f4092g.isEmpty()) {
                            final y60 y60Var2 = new y60(f8Var.f30193c, f8Var.J0, f8Var.Y1, false, true, false);
                            y60Var2.f42377t = false;
                            y60Var2.f42345b0 = true;
                            y60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var2.U = true;
                            y60Var2.f42369p = new b6(y60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(u7Var2.f4092g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i11 = f8Var.f30187a;
                            q10 q10Var2 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList3.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var3 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var3.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var3.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var3.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var2.v();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var3 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var3.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = u7Var3.f4092g;
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
                                            u7Var3.m();
                                            y60Var2.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var2.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = f8Var.J0;
                            Context context3 = context;
                            f7 f7Var2 = new f7(context3, i11, 0, false, q10Var2, v10Var2, null, i6Var2, 5);
                            f7Var2.f34607g3.f42809r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, f8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, f7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                y60Var2.r(frameLayout2, ma.o(-1, 44));
                                y60Var2.k();
                            }
                            if (!u7Var2.f4095k.isEmpty()) {
                                y60Var2.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 1), false);
                            }
                            y60Var2.q(f7Var2);
                            y60Var2.a0();
                            return;
                        }
                        return;
                    default:
                        u7 u7Var3 = e8Var2.f3554c;
                        if (!u7Var3.h.isEmpty()) {
                            final y60 y60Var3 = new y60(f8Var.f30193c, f8Var.J0, f8Var.Z1, false, true, false);
                            y60Var3.f42377t = false;
                            y60Var3.f42345b0 = true;
                            y60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var3.U = true;
                            y60Var3.f42369p = new b6(y60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(u7Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i12 = f8Var.f30187a;
                            q10 q10Var3 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList32.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var32 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var32.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var32.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var32.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var3.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var32 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var32.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = u7Var32.f4092g;
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
                                            u7Var32.m();
                                            y60Var3.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var3.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = f8Var.J0;
                            Context context4 = context;
                            f7 f7Var3 = new f7(context4, i12, 0, false, q10Var3, v10Var3, null, i6Var3, 6);
                            f7Var3.f34607g3.f42809r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, f8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, f7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                y60Var3.r(frameLayout3, ma.o(-1, 44));
                                y60Var3.k();
                            }
                            if (!u7Var3.f4096l.isEmpty()) {
                                y60Var3.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 2), false);
                            }
                            y60Var3.q(f7Var3);
                            y60Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        l7 l7Var3 = new l7(context, this.J0, false);
        this.Y1 = l7Var3;
        l7Var3.setValue(gd.M0(2131750372, null));
        linearLayout.addView(l7Var3, ma.t(-2, -2, 16, 0, 0, 6, 0));
        l7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f3505b;

            {
                this.f3505b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final e8 e8Var2 = e8Var;
                f8 f8Var = this.f3505b;
                switch (i7) {
                    case 0:
                        u7 u7Var = e8Var2.f3554c;
                        if (!u7Var.f4091f.isEmpty()) {
                            final y60 y60Var = new y60(f8Var.f30193c, f8Var.J0, f8Var.X1, false, true, false);
                            y60Var.f42377t = false;
                            y60Var.f42345b0 = true;
                            y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var.U = true;
                            y60Var.f42369p = new b6(y60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(u7Var.f4091f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i10 = f8Var.f30187a;
                            q10 q10Var = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList32.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var32 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var32.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var32.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var32.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var32 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var32.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = u7Var32.f4092g;
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
                                            u7Var32.m();
                                            y60Var.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = f8Var.J0;
                            Context context2 = context;
                            f7 f7Var = new f7(context2, i10, 0, false, q10Var, v10Var, null, i6Var, 4);
                            f7Var.f34607g3.f42809r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, f8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, f7Var, false, 4));
                            if (arrayList.size() > 8) {
                                y60Var.r(frameLayout, ma.o(-1, 44));
                                y60Var.k();
                            }
                            if (!u7Var.f4094j.isEmpty()) {
                                y60Var.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 0), false);
                            }
                            y60Var.q(f7Var);
                            y60Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        u7 u7Var2 = e8Var2.f3554c;
                        if (!u7Var2.f4092g.isEmpty()) {
                            final y60 y60Var2 = new y60(f8Var.f30193c, f8Var.J0, f8Var.Y1, false, true, false);
                            y60Var2.f42377t = false;
                            y60Var2.f42345b0 = true;
                            y60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var2.U = true;
                            y60Var2.f42369p = new b6(y60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(u7Var2.f4092g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i11 = f8Var.f30187a;
                            q10 q10Var2 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList32.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var32 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var32.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var32.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var32.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var2.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var32 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var32.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = u7Var32.f4092g;
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
                                            u7Var32.m();
                                            y60Var2.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var2.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = f8Var.J0;
                            Context context3 = context;
                            f7 f7Var2 = new f7(context3, i11, 0, false, q10Var2, v10Var2, null, i6Var2, 5);
                            f7Var2.f34607g3.f42809r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, f8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, f7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                y60Var2.r(frameLayout2, ma.o(-1, 44));
                                y60Var2.k();
                            }
                            if (!u7Var2.f4095k.isEmpty()) {
                                y60Var2.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 1), false);
                            }
                            y60Var2.q(f7Var2);
                            y60Var2.a0();
                            return;
                        }
                        return;
                    default:
                        u7 u7Var3 = e8Var2.f3554c;
                        if (!u7Var3.h.isEmpty()) {
                            final y60 y60Var3 = new y60(f8Var.f30193c, f8Var.J0, f8Var.Z1, false, true, false);
                            y60Var3.f42377t = false;
                            y60Var3.f42345b0 = true;
                            y60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var3.U = true;
                            y60Var3.f42369p = new b6(y60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(u7Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i12 = f8Var.f30187a;
                            q10 q10Var3 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList32.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var32 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var32.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var32.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var32.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var3.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var32 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var32.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = u7Var32.f4092g;
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
                                            u7Var32.m();
                                            y60Var3.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var3.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = f8Var.J0;
                            Context context4 = context;
                            f7 f7Var3 = new f7(context4, i12, 0, false, q10Var3, v10Var3, null, i6Var3, 6);
                            f7Var3.f34607g3.f42809r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, f8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, f7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                y60Var3.r(frameLayout3, ma.o(-1, 44));
                                y60Var3.k();
                            }
                            if (!u7Var3.f4096l.isEmpty()) {
                                y60Var3.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 2), false);
                            }
                            y60Var3.q(f7Var3);
                            y60Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        l7 l7Var4 = new l7(context, this.J0, false);
        this.Z1 = l7Var4;
        l7Var4.setValue(gd.M0(2131750364, null));
        linearLayout.addView(l7Var4, ma.t(-2, -2, 16, 0, 0, 0, 0));
        l7Var4.setOnClickListener(new View.OnClickListener(this) {
            public final f8 f3505b;

            {
                this.f3505b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final e8 e8Var2 = e8Var;
                f8 f8Var = this.f3505b;
                switch (i7) {
                    case 0:
                        u7 u7Var = e8Var2.f3554c;
                        if (!u7Var.f4091f.isEmpty()) {
                            final y60 y60Var = new y60(f8Var.f30193c, f8Var.J0, f8Var.X1, false, true, false);
                            y60Var.f42377t = false;
                            y60Var.f42345b0 = true;
                            y60Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var.U = true;
                            y60Var.f42369p = new b6(y60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(u7Var.f4091f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i10 = f8Var.f30187a;
                            q10 q10Var = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList32.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var32 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var32.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var32.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var32.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var32 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var32.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = u7Var32.f4092g;
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
                                            u7Var32.m();
                                            y60Var.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var = f8Var.J0;
                            Context context2 = context;
                            f7 f7Var = new f7(context2, i10, 0, false, q10Var, v10Var, null, i6Var, 4);
                            f7Var.f34607g3.f42809r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar = new mt(context2, f8Var.J0);
                            mtVar.setTextSize(1, 16.0f);
                            mtVar.setInputType(573441);
                            mtVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar.setCursorWidth(1.5f);
                            mtVar.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar.setBackground(null);
                            frameLayout.addView(mtVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar.addTextChangedListener(new v(strArr, f7Var, false, 4));
                            if (arrayList.size() > 8) {
                                y60Var.r(frameLayout, ma.o(-1, 44));
                                y60Var.k();
                            }
                            if (!u7Var.f4094j.isEmpty()) {
                                y60Var.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 0), false);
                            }
                            y60Var.q(f7Var);
                            y60Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        u7 u7Var2 = e8Var2.f3554c;
                        if (!u7Var2.f4092g.isEmpty()) {
                            final y60 y60Var2 = new y60(f8Var.f30193c, f8Var.J0, f8Var.Y1, false, true, false);
                            y60Var2.f42377t = false;
                            y60Var2.f42345b0 = true;
                            y60Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var2.U = true;
                            y60Var2.f42369p = new b6(y60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(u7Var2.f4092g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i11 = f8Var.f30187a;
                            q10 q10Var2 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList32.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var32 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var32.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var32.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var32.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var2.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var32 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var32.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = u7Var32.f4092g;
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
                                            u7Var32.m();
                                            y60Var2.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var2.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var2 = f8Var.J0;
                            Context context3 = context;
                            f7 f7Var2 = new f7(context3, i11, 0, false, q10Var2, v10Var2, null, i6Var2, 5);
                            f7Var2.f34607g3.f42809r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar2 = new mt(context3, f8Var.J0);
                            mtVar2.setTextSize(1, 16.0f);
                            mtVar2.setInputType(573441);
                            mtVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar2, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar2, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar2.setCursorWidth(1.5f);
                            mtVar2.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar2, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar2.setBackground(null);
                            frameLayout2.addView(mtVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar2.addTextChangedListener(new v(strArr2, f7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                y60Var2.r(frameLayout2, ma.o(-1, 44));
                                y60Var2.k();
                            }
                            if (!u7Var2.f4095k.isEmpty()) {
                                y60Var2.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 1), false);
                            }
                            y60Var2.q(f7Var2);
                            y60Var2.a0();
                            return;
                        }
                        return;
                    default:
                        u7 u7Var3 = e8Var2.f3554c;
                        if (!u7Var3.h.isEmpty()) {
                            final y60 y60Var3 = new y60(f8Var.f30193c, f8Var.J0, f8Var.Z1, false, true, false);
                            y60Var3.f42377t = false;
                            y60Var3.f42345b0 = true;
                            y60Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            y60Var3.U = true;
                            y60Var3.f42369p = new b6(y60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(u7Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            e8 e8Var3 = e8Var2;
                                            Integer num = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) e8Var3.f3554c.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            e8 e8Var4 = e8Var2;
                                            Integer num3 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                                            Integer num4 = (Integer) e8Var4.f3554c.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            e8 e8Var5 = e8Var2;
                                            Integer num5 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                                            Integer num6 = (Integer) e8Var5.f3554c.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
                            int i12 = f8Var.f30187a;
                            q10 q10Var3 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    e8 e8Var3 = e8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            z41 z41Var = (z41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            u7 u7Var22 = e8Var3.f3554c;
                                            boolean isEmpty = u7Var22.f4094j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = u7Var22.f4094j.contains(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) u7Var22.f4097m.get(Long.valueOf(stargiftattributemodel.document.f28409id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = o7.f3921b;
                                                    l41 K = l41.K(o7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f37018m = lowerCase;
                                                    K.A = intValue;
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
                                                arrayList32.add(j7.i(gd.M0(2131749994, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            z41 z41Var2 = (z41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            u7 u7Var32 = e8Var3.f3554c;
                                            boolean isEmpty2 = u7Var32.f4095k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = u7Var32.f4095k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) u7Var32.f4098n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = g7.f3623b;
                                                    l41 K2 = l41.K(g7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f37018m = lowerCase2;
                                                    K2.A = intValue2;
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
                                                arrayList4.add(j7.i(gd.M0(2131749999, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            z41 z41Var3 = (z41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            u7 u7Var4 = e8Var3.f3554c;
                                            boolean isEmpty3 = u7Var4.f4096l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = u7Var4.f4096l.contains(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) u7Var4.f4099o.get(Long.valueOf(stargiftattributepattern.document.f28409id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = r7.f4014b;
                                                    l41 K3 = l41.K(r7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f37018m = lowerCase3;
                                                    K3.A = i112;
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
                                                arrayList5.add(j7.i(gd.M0(2131749992, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    l41 l41Var = (l41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                                            u7 u7Var22 = e8Var2.f3554c;
                                            HashSet hashSet = u7Var22.f4094j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = u7Var22.f4091f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28409id;
                                                        if (j10 != j3) {
                                                            hashSet.add(Long.valueOf(j10));
                                                        }
                                                    }
                                                } else {
                                                    hashSet.add(Long.valueOf(j3));
                                                }
                                            } else {
                                                hashSet.remove(Long.valueOf(j3));
                                            }
                                            u7Var22.m();
                                            y60Var3.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                                            u7 u7Var32 = e8Var2.f3554c;
                                            HashSet hashSet2 = u7Var32.f4095k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = u7Var32.f4092g;
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
                                            u7Var32.m();
                                            y60Var3.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                                            u7 u7Var4 = e8Var2.f3554c;
                                            HashSet hashSet3 = u7Var4.f4096l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = u7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28409id;
                                                        if (j12 != j11) {
                                                            hashSet3.add(Long.valueOf(j12));
                                                        }
                                                    }
                                                } else {
                                                    hashSet3.add(Long.valueOf(j11));
                                                }
                                            } else {
                                                hashSet3.remove(Long.valueOf(j11));
                                            }
                                            u7Var4.m();
                                            y60Var3.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.i6 i6Var3 = f8Var.J0;
                            Context context4 = context;
                            f7 f7Var3 = new f7(context4, i12, 0, false, q10Var3, v10Var3, null, i6Var3, 6);
                            f7Var3.f34607g3.f42809r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.u6.s(imageView3, org.telegram.ui.ActionBar.n6.F8, f8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            mt mtVar3 = new mt(context4, f8Var.J0);
                            mtVar3.setTextSize(1, 16.0f);
                            mtVar3.setInputType(573441);
                            mtVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.u6.D(mtVar3, org.telegram.ui.ActionBar.n6.A6, f8Var.J0);
                            org.telegram.ui.ActionBar.u6.l(mtVar3, 30, org.telegram.ui.ActionBar.n6.G6, f8Var.J0);
                            mtVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            mtVar3.setCursorWidth(1.5f);
                            mtVar3.setHint(gd.M0(2131749993, null));
                            org.telegram.ui.ActionBar.u6.U(mtVar3, org.telegram.ui.ActionBar.n6.E8, f8Var.J0);
                            mtVar3.setBackground(null);
                            frameLayout3.addView(mtVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            mtVar3.addTextChangedListener(new v(strArr3, f7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                y60Var3.r(frameLayout3, ma.o(-1, 44));
                                y60Var3.k();
                            }
                            if (!u7Var3.f4096l.isEmpty()) {
                                y60Var3.c(2131232359, gd.M0(2131745475, null), new x7(e8Var2, 2), false);
                            }
                            y60Var3.q(f7Var3);
                            y60Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        v4.t tVar = new v4.t(3);
        tVar.O = new s2(this, 1);
        this.f39534o1.setLayoutManager(tVar);
        this.f39534o1.setOnItemClickListener(new ab.g(6, this, e8Var));
        this.f39534o1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f30225u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f30225u0, 0);
        this.f39534o1.setOnScrollListener(new q1(this, 2));
        v4.k kVar = new v4.k();
        kVar.f59152m = false;
        kVar.C = false;
        kVar.o(lr.h);
        kVar.n(350L);
        this.f39534o1.setItemAnimator(kVar);
        this.f39534o1.setItemSelectorColorProvider(new a3.l(23));
        di.k4 k4Var = new di.k4(context);
        this.f3583a2 = k4Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        k4Var.h = L;
        k4Var.f9154n = L2;
        k4Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        k4Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new ai.g0(k4Var, 11), 12.0f, 12, new ArrayList());
        k4Var.setPivotY(0.0f);
        this.f30193c.addView(k4Var, ma.e(-1, -2, 55));
        this.f3586e2.O(false);
        e8Var.d = new y7(this, 1);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        d8 d8Var = new d8(this, ck0Var, getContext(), this.f30187a, new b(this, 10), this.J0, 0);
        this.f3586e2 = d8Var;
        return d8Var;
    }

    @Override
    public final CharSequence P0() {
        String str = this.T1;
        if (str != null) {
            return str;
        }
        return gd.M0(2131749755, null);
    }

    @Override
    public final void U0(float f10) {
        float y10 = this.f30190b.getY() + f10;
        di.k4 k4Var = this.f3583a2;
        float measuredHeight = y10 - k4Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / k4Var.getMeasuredHeight());
        float height = this.f30193c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l10 = Math.min(l10, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.g0.N(128.0f))));
        }
        k4Var.setScaleX(l10);
        k4Var.setScaleY(l10);
        k4Var.setAlpha(org.telegram.messenger.g0.z1(l10, 0.5f, 1.0f));
        k4Var.setTranslationY(measuredHeight);
    }

    public final void e1() {
        int R;
        l41 G;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ck0 ck0Var = this.f39534o1;
            if (i7 >= ck0Var.getChildCount()) {
                break;
            }
            View childAt = ck0Var.getChildAt(i7);
            if ((childAt instanceof wz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f3586e2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i7++;
        }
        e8 e8Var = this.U1;
        if (z10) {
            e8Var.f3553b.a();
        }
        if (z11) {
            e8Var.f3554c.l(false);
        }
    }
}
