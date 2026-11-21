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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.yz;
public final class j8 extends sa {
    public static final int f3753g2 = 0;
    public final String T1;
    public final i8 U1;
    public final HorizontalScrollView V1;
    public final p7 W1;
    public final p7 X1;
    public final p7 Y1;
    public final p7 Z1;
    public final di.k4 f3754a2;
    public di.c2 f3755b2;
    public final HashSet f3756c2;
    public boolean d2;
    public h8 f3757e2;
    public boolean f3758f2;

    public j8(final Context context, String str, final i8 i8Var) {
        super(2, context, (org.telegram.ui.ActionBar.h6) null, false);
        this.f3756c2 = new HashSet();
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        this.T1 = str;
        this.U1 = i8Var;
        this.f39540p1.setTitle(P0());
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
        p7 p7Var = new p7(context, this.J0, false);
        this.W1 = p7Var;
        p7Var.setSorting(i8Var.f3731c.f4306p);
        linearLayout.addView(p7Var, ma.t(-2, -2, 16, 0, 0, 6, 0));
        p7Var.setOnClickListener(new ai.x2(6, this, i8Var));
        p7 p7Var2 = new p7(context, this.J0, false);
        this.X1 = p7Var2;
        p7Var2.setValue(gd.N0(2131750370, null));
        linearLayout.addView(p7Var2, ma.t(-2, -2, 16, 0, 0, 6, 0));
        p7Var2.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f3686b;

            {
                this.f3686b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final i8 i8Var2 = i8Var;
                j8 j8Var = this.f3686b;
                switch (i7) {
                    case 0:
                        y7 y7Var = i8Var2.f3731c;
                        if (!y7Var.f4297f.isEmpty()) {
                            final a70 a70Var = new a70(j8Var.f30176c, j8Var.J0, j8Var.X1, false, true, false);
                            a70Var.f33386t = false;
                            a70Var.f33354b0 = true;
                            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var.U = true;
                            a70Var.f33378p = new f6(a70Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(y7Var.f4297f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i10 = j8Var.f30170a;
                            q10 q10Var = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i11;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr2 = strArr;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var2 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var2.f4300j.isEmpty();
                                            int size = arrayList2.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList2.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var2.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var2.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList3.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var3 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var3.f4301k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList2.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var3.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var3.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList2.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i11 = z13;
                                                    } else {
                                                        i11 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var2 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var2.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = y7Var2.f4297f;
                                                    int size = arrayList2.size();
                                                    int i11 = 0;
                                                    while (i11 < size) {
                                                        Object obj3 = arrayList2.get(i11);
                                                        i11++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var2.m();
                                            a70Var.v();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var3 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var3.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = y7Var3.f4298g;
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
                                            y7Var3.m();
                                            a70Var.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var = j8Var.J0;
                            Context context2 = context;
                            j7 j7Var = new j7(context2, i10, 0, false, q10Var, v10Var, null, h6Var, 4);
                            j7Var.f35796g3.f34068r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar = new ot(context2, j8Var.J0);
                            otVar.setTextSize(1, 16.0f);
                            otVar.setInputType(573441);
                            otVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar.setCursorWidth(1.5f);
                            otVar.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar.setBackground(null);
                            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar.addTextChangedListener(new v(strArr, j7Var, false, 4));
                            if (arrayList.size() > 8) {
                                a70Var.r(frameLayout, ma.o(-1, 44));
                                a70Var.k();
                            }
                            if (!y7Var.f4300j.isEmpty()) {
                                a70Var.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 0), false);
                            }
                            a70Var.q(j7Var);
                            a70Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        y7 y7Var2 = i8Var2.f3731c;
                        if (!y7Var2.f4298g.isEmpty()) {
                            final a70 a70Var2 = new a70(j8Var.f30176c, j8Var.J0, j8Var.Y1, false, true, false);
                            a70Var2.f33386t = false;
                            a70Var2.f33354b0 = true;
                            a70Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var2.U = true;
                            a70Var2.f33378p = new f6(a70Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(y7Var2.f4298g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i11 = j8Var.f30170a;
                            q10 q10Var2 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList3.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var3 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var3.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var3.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var3.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var2.v();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var3 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var3.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = y7Var3.f4298g;
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
                                            y7Var3.m();
                                            a70Var2.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var2.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var2 = j8Var.J0;
                            Context context3 = context;
                            j7 j7Var2 = new j7(context3, i11, 0, false, q10Var2, v10Var2, null, h6Var2, 5);
                            j7Var2.f35796g3.f34068r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar2 = new ot(context3, j8Var.J0);
                            otVar2.setTextSize(1, 16.0f);
                            otVar2.setInputType(573441);
                            otVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar2, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar2, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar2.setCursorWidth(1.5f);
                            otVar2.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar2, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar2.setBackground(null);
                            frameLayout2.addView(otVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar2.addTextChangedListener(new v(strArr2, j7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                a70Var2.r(frameLayout2, ma.o(-1, 44));
                                a70Var2.k();
                            }
                            if (!y7Var2.f4301k.isEmpty()) {
                                a70Var2.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 1), false);
                            }
                            a70Var2.q(j7Var2);
                            a70Var2.a0();
                            return;
                        }
                        return;
                    default:
                        y7 y7Var3 = i8Var2.f3731c;
                        if (!y7Var3.h.isEmpty()) {
                            final a70 a70Var3 = new a70(j8Var.f30176c, j8Var.J0, j8Var.Z1, false, true, false);
                            a70Var3.f33386t = false;
                            a70Var3.f33354b0 = true;
                            a70Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var3.U = true;
                            a70Var3.f33378p = new f6(a70Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(y7Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i12 = j8Var.f30170a;
                            q10 q10Var3 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList32.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var32 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var32.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var32.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var32.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var3.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var32 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var32.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = y7Var32.f4298g;
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
                                            y7Var32.m();
                                            a70Var3.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var3.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var3 = j8Var.J0;
                            Context context4 = context;
                            j7 j7Var3 = new j7(context4, i12, 0, false, q10Var3, v10Var3, null, h6Var3, 6);
                            j7Var3.f35796g3.f34068r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar3 = new ot(context4, j8Var.J0);
                            otVar3.setTextSize(1, 16.0f);
                            otVar3.setInputType(573441);
                            otVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar3, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar3, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar3.setCursorWidth(1.5f);
                            otVar3.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar3, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar3.setBackground(null);
                            frameLayout3.addView(otVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar3.addTextChangedListener(new v(strArr3, j7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                a70Var3.r(frameLayout3, ma.o(-1, 44));
                                a70Var3.k();
                            }
                            if (!y7Var3.f4302l.isEmpty()) {
                                a70Var3.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 2), false);
                            }
                            a70Var3.q(j7Var3);
                            a70Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        p7 p7Var3 = new p7(context, this.J0, false);
        this.Y1 = p7Var3;
        p7Var3.setValue(gd.N0(2131750371, null));
        linearLayout.addView(p7Var3, ma.t(-2, -2, 16, 0, 0, 6, 0));
        p7Var3.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f3686b;

            {
                this.f3686b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final i8 i8Var2 = i8Var;
                j8 j8Var = this.f3686b;
                switch (i7) {
                    case 0:
                        y7 y7Var = i8Var2.f3731c;
                        if (!y7Var.f4297f.isEmpty()) {
                            final a70 a70Var = new a70(j8Var.f30176c, j8Var.J0, j8Var.X1, false, true, false);
                            a70Var.f33386t = false;
                            a70Var.f33354b0 = true;
                            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var.U = true;
                            a70Var.f33378p = new f6(a70Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(y7Var.f4297f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i10 = j8Var.f30170a;
                            q10 q10Var = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList32.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var32 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var32.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var32.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var32.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var32 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var32.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = y7Var32.f4298g;
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
                                            y7Var32.m();
                                            a70Var.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var = j8Var.J0;
                            Context context2 = context;
                            j7 j7Var = new j7(context2, i10, 0, false, q10Var, v10Var, null, h6Var, 4);
                            j7Var.f35796g3.f34068r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar = new ot(context2, j8Var.J0);
                            otVar.setTextSize(1, 16.0f);
                            otVar.setInputType(573441);
                            otVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar.setCursorWidth(1.5f);
                            otVar.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar.setBackground(null);
                            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar.addTextChangedListener(new v(strArr, j7Var, false, 4));
                            if (arrayList.size() > 8) {
                                a70Var.r(frameLayout, ma.o(-1, 44));
                                a70Var.k();
                            }
                            if (!y7Var.f4300j.isEmpty()) {
                                a70Var.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 0), false);
                            }
                            a70Var.q(j7Var);
                            a70Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        y7 y7Var2 = i8Var2.f3731c;
                        if (!y7Var2.f4298g.isEmpty()) {
                            final a70 a70Var2 = new a70(j8Var.f30176c, j8Var.J0, j8Var.Y1, false, true, false);
                            a70Var2.f33386t = false;
                            a70Var2.f33354b0 = true;
                            a70Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var2.U = true;
                            a70Var2.f33378p = new f6(a70Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(y7Var2.f4298g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i11 = j8Var.f30170a;
                            q10 q10Var2 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList32.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var32 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var32.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var32.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var32.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var2.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var32 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var32.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = y7Var32.f4298g;
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
                                            y7Var32.m();
                                            a70Var2.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var2.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var2 = j8Var.J0;
                            Context context3 = context;
                            j7 j7Var2 = new j7(context3, i11, 0, false, q10Var2, v10Var2, null, h6Var2, 5);
                            j7Var2.f35796g3.f34068r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar2 = new ot(context3, j8Var.J0);
                            otVar2.setTextSize(1, 16.0f);
                            otVar2.setInputType(573441);
                            otVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar2, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar2, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar2.setCursorWidth(1.5f);
                            otVar2.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar2, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar2.setBackground(null);
                            frameLayout2.addView(otVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar2.addTextChangedListener(new v(strArr2, j7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                a70Var2.r(frameLayout2, ma.o(-1, 44));
                                a70Var2.k();
                            }
                            if (!y7Var2.f4301k.isEmpty()) {
                                a70Var2.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 1), false);
                            }
                            a70Var2.q(j7Var2);
                            a70Var2.a0();
                            return;
                        }
                        return;
                    default:
                        y7 y7Var3 = i8Var2.f3731c;
                        if (!y7Var3.h.isEmpty()) {
                            final a70 a70Var3 = new a70(j8Var.f30176c, j8Var.J0, j8Var.Z1, false, true, false);
                            a70Var3.f33386t = false;
                            a70Var3.f33354b0 = true;
                            a70Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var3.U = true;
                            a70Var3.f33378p = new f6(a70Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(y7Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i12 = j8Var.f30170a;
                            q10 q10Var3 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList32.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var32 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var32.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var32.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var32.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var3.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var32 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var32.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = y7Var32.f4298g;
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
                                            y7Var32.m();
                                            a70Var3.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var3.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var3 = j8Var.J0;
                            Context context4 = context;
                            j7 j7Var3 = new j7(context4, i12, 0, false, q10Var3, v10Var3, null, h6Var3, 6);
                            j7Var3.f35796g3.f34068r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar3 = new ot(context4, j8Var.J0);
                            otVar3.setTextSize(1, 16.0f);
                            otVar3.setInputType(573441);
                            otVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar3, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar3, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar3.setCursorWidth(1.5f);
                            otVar3.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar3, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar3.setBackground(null);
                            frameLayout3.addView(otVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar3.addTextChangedListener(new v(strArr3, j7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                a70Var3.r(frameLayout3, ma.o(-1, 44));
                                a70Var3.k();
                            }
                            if (!y7Var3.f4302l.isEmpty()) {
                                a70Var3.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 2), false);
                            }
                            a70Var3.q(j7Var3);
                            a70Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        p7 p7Var4 = new p7(context, this.J0, false);
        this.Z1 = p7Var4;
        p7Var4.setValue(gd.N0(2131750363, null));
        linearLayout.addView(p7Var4, ma.t(-2, -2, 16, 0, 0, 0, 0));
        p7Var4.setOnClickListener(new View.OnClickListener(this) {
            public final j8 f3686b;

            {
                this.f3686b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final i8 i8Var2 = i8Var;
                j8 j8Var = this.f3686b;
                switch (i7) {
                    case 0:
                        y7 y7Var = i8Var2.f3731c;
                        if (!y7Var.f4297f.isEmpty()) {
                            final a70 a70Var = new a70(j8Var.f30176c, j8Var.J0, j8Var.X1, false, true, false);
                            a70Var.f33386t = false;
                            a70Var.f33354b0 = true;
                            a70Var.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var.U = true;
                            a70Var.f33378p = new f6(a70Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(y7Var.f4297f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i10 = j8Var.f30170a;
                            q10 q10Var = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList32.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var32 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var32.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var32.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var32.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var32 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var32.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = y7Var32.f4298g;
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
                                            y7Var32.m();
                                            a70Var.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var = j8Var.J0;
                            Context context2 = context;
                            j7 j7Var = new j7(context2, i10, 0, false, q10Var, v10Var, null, h6Var, 4);
                            j7Var.f35796g3.f34068r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar = new ot(context2, j8Var.J0);
                            otVar.setTextSize(1, 16.0f);
                            otVar.setInputType(573441);
                            otVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar.setCursorWidth(1.5f);
                            otVar.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar.setBackground(null);
                            frameLayout.addView(otVar, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar.addTextChangedListener(new v(strArr, j7Var, false, 4));
                            if (arrayList.size() > 8) {
                                a70Var.r(frameLayout, ma.o(-1, 44));
                                a70Var.k();
                            }
                            if (!y7Var.f4300j.isEmpty()) {
                                a70Var.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 0), false);
                            }
                            a70Var.q(j7Var);
                            a70Var.a0();
                            return;
                        }
                        return;
                    case 1:
                        y7 y7Var2 = i8Var2.f3731c;
                        if (!y7Var2.f4298g.isEmpty()) {
                            final a70 a70Var2 = new a70(j8Var.f30176c, j8Var.J0, j8Var.Y1, false, true, false);
                            a70Var2.f33386t = false;
                            a70Var2.f33354b0 = true;
                            a70Var2.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var2.U = true;
                            a70Var2.f33378p = new f6(a70Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(y7Var2.f4298g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i11 = j8Var.f30170a;
                            q10 q10Var2 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList32.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var32 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var32.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var32.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var32.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var2 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var2.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var32 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var32.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = y7Var32.f4298g;
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
                                            y7Var32.m();
                                            a70Var2.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var2.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var2 = j8Var.J0;
                            Context context3 = context;
                            j7 j7Var2 = new j7(context3, i11, 0, false, q10Var2, v10Var2, null, h6Var2, 5);
                            j7Var2.f35796g3.f34068r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar2 = new ot(context3, j8Var.J0);
                            otVar2.setTextSize(1, 16.0f);
                            otVar2.setInputType(573441);
                            otVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar2, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar2, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar2.setCursorWidth(1.5f);
                            otVar2.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar2, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar2.setBackground(null);
                            frameLayout2.addView(otVar2, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar2.addTextChangedListener(new v(strArr2, j7Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                a70Var2.r(frameLayout2, ma.o(-1, 44));
                                a70Var2.k();
                            }
                            if (!y7Var2.f4301k.isEmpty()) {
                                a70Var2.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 1), false);
                            }
                            a70Var2.q(j7Var2);
                            a70Var2.a0();
                            return;
                        }
                        return;
                    default:
                        y7 y7Var3 = i8Var2.f3731c;
                        if (!y7Var3.h.isEmpty()) {
                            final a70 a70Var3 = new a70(j8Var.f30176c, j8Var.J0, j8Var.Z1, false, true, false);
                            a70Var3.f33386t = false;
                            a70Var3.f33354b0 = true;
                            a70Var3.b0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            a70Var3.U = true;
                            a70Var3.f33378p = new f6(a70Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(y7Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            i8 i8Var3 = i8Var2;
                                            Integer num = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) i8Var3.f3731c.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            i8 i8Var4 = i8Var2;
                                            Integer num3 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                                            Integer num4 = (Integer) i8Var4.f3731c.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            i8 i8Var5 = i8Var2;
                                            Integer num5 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                                            Integer num6 = (Integer) i8Var5.f3731c.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
                            int i12 = j8Var.f30170a;
                            q10 q10Var3 = new q10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    i8 i8Var3 = i8Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            c51 c51Var = (c51) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String M3 = org.telegram.messenger.g0.M3(lowerCase);
                                            y7 y7Var22 = i8Var3.f3731c;
                                            boolean isEmpty = y7Var22.f4300j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = y7Var22.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M3))) {
                                                    Integer num = (Integer) y7Var22.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = s7.f4093b;
                                                    o41 K = o41.K(s7.class);
                                                    K.H = stargiftattributemodel;
                                                    K.f38098m = lowerCase;
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
                                                arrayList32.add(n7.i(gd.N0(2131749993, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            c51 c51Var2 = (c51) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                                            y7 y7Var32 = i8Var3.f3731c;
                                            boolean isEmpty2 = y7Var32.f4301k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = y7Var32.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                                                    Integer num2 = (Integer) y7Var32.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = k7.f3795b;
                                                    o41 K2 = o41.K(k7.class);
                                                    K2.H = stargiftattributebackdrop;
                                                    K2.f38098m = lowerCase2;
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
                                                arrayList4.add(n7.i(gd.N0(2131749998, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            c51 c51Var3 = (c51) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                                            y7 y7Var4 = i8Var3.f3731c;
                                            boolean isEmpty3 = y7Var4.f4302l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = y7Var4.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M33))) {
                                                    Integer num3 = (Integer) y7Var4.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = v7.f4192b;
                                                    o41 K3 = o41.K(v7.class);
                                                    K3.H = stargiftattributepattern;
                                                    K3.f38098m = lowerCase3;
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
                                                arrayList5.add(n7.i(gd.N0(2131749991, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            v10 v10Var3 = new v10() {
                                @Override
                                public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    o41 o41Var = (o41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                                            y7 y7Var22 = i8Var2.f3731c;
                                            HashSet hashSet = y7Var22.f4300j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = y7Var22.f4297f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28437id;
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
                                            y7Var22.m();
                                            a70Var3.v();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                                            y7 y7Var32 = i8Var2.f3731c;
                                            HashSet hashSet2 = y7Var32.f4301k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = y7Var32.f4298g;
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
                                            y7Var32.m();
                                            a70Var3.v();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                                            y7 y7Var4 = i8Var2.f3731c;
                                            HashSet hashSet3 = y7Var4.f4302l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = y7Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28437id;
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
                                            y7Var4.m();
                                            a70Var3.v();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.h6 h6Var3 = j8Var.J0;
                            Context context4 = context;
                            j7 j7Var3 = new j7(context4, i12, 0, false, q10Var3, v10Var3, null, h6Var3, 6);
                            j7Var3.f35796g3.f34068r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232739);
                            org.telegram.ui.ActionBar.t6.s(imageView3, org.telegram.ui.ActionBar.m6.F8, j8Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, ma.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ot otVar3 = new ot(context4, j8Var.J0);
                            otVar3.setTextSize(1, 16.0f);
                            otVar3.setInputType(573441);
                            otVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.t6.D(otVar3, org.telegram.ui.ActionBar.m6.A6, j8Var.J0);
                            org.telegram.ui.ActionBar.t6.l(otVar3, 30, org.telegram.ui.ActionBar.m6.G6, j8Var.J0);
                            otVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            otVar3.setCursorWidth(1.5f);
                            otVar3.setHint(gd.N0(2131749992, null));
                            org.telegram.ui.ActionBar.t6.U(otVar3, org.telegram.ui.ActionBar.m6.E8, j8Var.J0);
                            otVar3.setBackground(null);
                            frameLayout3.addView(otVar3, ma.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            otVar3.addTextChangedListener(new v(strArr3, j7Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                a70Var3.r(frameLayout3, ma.o(-1, 44));
                                a70Var3.k();
                            }
                            if (!y7Var3.f4302l.isEmpty()) {
                                a70Var3.c(2131232359, gd.N0(2131745474, null), new b8(i8Var2, 2), false);
                            }
                            a70Var3.q(j7Var3);
                            a70Var3.a0();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        v4.t tVar = new v4.t(3);
        tVar.O = new w2(this, 1);
        this.f39539o1.setLayoutManager(tVar);
        this.f39539o1.setOnItemClickListener(new ab.g(6, this, i8Var));
        this.f39539o1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f30208u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f30208u0, 0);
        this.f39539o1.setOnScrollListener(new u1(this, 2));
        v4.k kVar = new v4.k();
        kVar.f59190m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.f39539o1.setItemAnimator(kVar);
        this.f39539o1.setItemSelectorColorProvider(new a3.l(23));
        di.k4 k4Var = new di.k4(context);
        this.f3754a2 = k4Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        k4Var.h = L;
        k4Var.f9177n = L2;
        k4Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        k4Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new ai.h0(k4Var, 11), 12.0f, 12, new ArrayList());
        k4Var.setPivotY(0.0f);
        this.f30176c.addView(k4Var, ma.e(-1, -2, 55));
        this.f3757e2.O(false);
        i8Var.d = new c8(this, 1);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        h8 h8Var = new h8(this, ek0Var, getContext(), this.f30170a, new b(this, 10), this.J0, 0);
        this.f3757e2 = h8Var;
        return h8Var;
    }

    @Override
    public final CharSequence P0() {
        String str = this.T1;
        if (str != null) {
            return str;
        }
        return gd.N0(2131749754, null);
    }

    @Override
    public final void U0(float f10) {
        float y10 = this.f30173b.getY() + f10;
        di.k4 k4Var = this.f3754a2;
        float measuredHeight = y10 - k4Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / k4Var.getMeasuredHeight());
        float height = this.f30176c.getHeight() / 2.0f;
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
        o41 G;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ek0 ek0Var = this.f39539o1;
            if (i7 >= ek0Var.getChildCount()) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if ((childAt instanceof yz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f3757e2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i7++;
        }
        i8 i8Var = this.U1;
        if (z10) {
            i8Var.f3730b.a();
        }
        if (z11) {
            i8Var.f3731c.l(false);
        }
    }
}
