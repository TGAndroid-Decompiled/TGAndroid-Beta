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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
public final class z5 extends ja {
    public static final int f4029g2 = 0;
    public final String T1;
    public final y5 U1;
    public final HorizontalScrollView V1;
    public final f5 W1;
    public final f5 X1;
    public final f5 Y1;
    public final f5 Z1;
    public final di.h4 f4030a2;
    public di.y1 f4031b2;
    public final HashSet f4032c2;
    public boolean d2;
    public x5 f4033e2;
    public boolean f4034f2;

    public z5(final Context context, String str, final y5 y5Var) {
        super(2, context, (org.telegram.ui.ActionBar.e6) null, false);
        this.f4032c2 = new HashSet();
        this.F1 = org.telegram.messenger.g0.L(12.0f);
        O();
        this.T1 = str;
        this.U1 = y5Var;
        this.f35937p1.setTitle(O0());
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
        f5 f5Var = new f5(context, this.J0, false);
        this.W1 = f5Var;
        f5Var.setSorting(y5Var.f4016c.f3767p);
        linearLayout.addView(f5Var, c8.ja.t(-2, -2, 16, 0, 0, 6, 0));
        f5Var.setOnClickListener(new ai.t2(4, this, y5Var));
        f5 f5Var2 = new f5(context, this.J0, false);
        this.X1 = f5Var2;
        f5Var2.setValue(hd.M0(2131750387, null));
        linearLayout.addView(f5Var2, c8.ja.t(-2, -2, 16, 0, 0, 6, 0));
        f5Var2.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f3961b;

            {
                this.f3961b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final y5 y5Var2 = y5Var;
                z5 z5Var = this.f3961b;
                switch (i7) {
                    case 0:
                        o5 o5Var = y5Var2.f4016c;
                        if (!o5Var.f3758f.isEmpty()) {
                            final m60 m60Var = new m60(z5Var.f29685c, z5Var.J0, z5Var.X1, false, true, false);
                            m60Var.f37112t = false;
                            m60Var.Y = true;
                            m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var.R = true;
                            m60Var.f37106p = new u3(m60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(o5Var.f3758f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i10 = z5Var.f29679a;
                            s10 s10Var = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i11;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList2 = arrayList;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr2 = strArr;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr2[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var2 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var2.f3761j.isEmpty();
                                            int size = arrayList2.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList2.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var2.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var2.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList3.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr2[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var3 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var3.f3762k.isEmpty();
                                            int size2 = arrayList2.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList2.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var3.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var3.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr2[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList2.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList2.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i11 = z13;
                                                    } else {
                                                        i11 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i11;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var2 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var2.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList2 = o5Var2.f3758f;
                                                    int size = arrayList2.size();
                                                    int i11 = 0;
                                                    while (i11 < size) {
                                                        Object obj3 = arrayList2.get(i11);
                                                        i11++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var2.h();
                                            m60Var.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var3 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var3.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = o5Var3.f3759g;
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
                                            o5Var3.h();
                                            m60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var = z5Var.J0;
                            Context context2 = context;
                            y4 y4Var = new y4(context2, i10, 0, false, s10Var, x10Var, null, e6Var, 4);
                            y4Var.f39895g3.f38201r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar = new ft(context2, z5Var.J0);
                            ftVar.setTextSize(1, 16.0f);
                            ftVar.setInputType(573441);
                            ftVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar.setCursorWidth(1.5f);
                            ftVar.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar.setBackground(null);
                            frameLayout.addView(ftVar, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar.addTextChangedListener(new v(strArr, y4Var, false, 4));
                            if (arrayList.size() > 8) {
                                m60Var.r(frameLayout, c8.ja.o(-1, 44));
                                m60Var.k();
                            }
                            if (!o5Var.f3761j.isEmpty()) {
                                m60Var.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 0), false);
                            }
                            m60Var.q(y4Var);
                            m60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        o5 o5Var2 = y5Var2.f4016c;
                        if (!o5Var2.f3759g.isEmpty()) {
                            final m60 m60Var2 = new m60(z5Var.f29685c, z5Var.J0, z5Var.Y1, false, true, false);
                            m60Var2.f37112t = false;
                            m60Var2.Y = true;
                            m60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var2.R = true;
                            m60Var2.f37106p = new u3(m60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(o5Var2.f3759g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i11 = z5Var.f29679a;
                            s10 s10Var2 = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i12 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i12) {
                                        case 0:
                                            ArrayList arrayList3 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList3.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var3 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var3.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var3.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var3.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var2 = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var2.u();
                                            return;
                                        case 1:
                                            int i12 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var3 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var3.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i12))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList3 = o5Var3.f3759g;
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
                                            o5Var3.h();
                                            m60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var2.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var2 = z5Var.J0;
                            Context context3 = context;
                            y4 y4Var2 = new y4(context3, i11, 0, false, s10Var2, x10Var2, null, e6Var2, 5);
                            y4Var2.f39895g3.f38201r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar2 = new ft(context3, z5Var.J0);
                            ftVar2.setTextSize(1, 16.0f);
                            ftVar2.setInputType(573441);
                            ftVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar2, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar2, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar2.setCursorWidth(1.5f);
                            ftVar2.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar2, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar2.setBackground(null);
                            frameLayout2.addView(ftVar2, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar2.addTextChangedListener(new v(strArr2, y4Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                m60Var2.r(frameLayout2, c8.ja.o(-1, 44));
                                m60Var2.k();
                            }
                            if (!o5Var2.f3762k.isEmpty()) {
                                m60Var2.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 1), false);
                            }
                            m60Var2.q(y4Var2);
                            m60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        o5 o5Var3 = y5Var2.f4016c;
                        if (!o5Var3.h.isEmpty()) {
                            final m60 m60Var3 = new m60(z5Var.f29685c, z5Var.J0, z5Var.Z1, false, true, false);
                            m60Var3.f37112t = false;
                            m60Var3.Y = true;
                            m60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var3.R = true;
                            m60Var3.f37106p = new u3(m60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(o5Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i12 = z5Var.f29679a;
                            s10 s10Var3 = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList32.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var32 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var32.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var32.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var32.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var3 = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var32 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var32.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = o5Var32.f3759g;
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
                                            o5Var32.h();
                                            m60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var3.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var3 = z5Var.J0;
                            Context context4 = context;
                            y4 y4Var3 = new y4(context4, i12, 0, false, s10Var3, x10Var3, null, e6Var3, 6);
                            y4Var3.f39895g3.f38201r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar3 = new ft(context4, z5Var.J0);
                            ftVar3.setTextSize(1, 16.0f);
                            ftVar3.setInputType(573441);
                            ftVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar3, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar3, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar3.setCursorWidth(1.5f);
                            ftVar3.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar3, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar3.setBackground(null);
                            frameLayout3.addView(ftVar3, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar3.addTextChangedListener(new v(strArr3, y4Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                m60Var3.r(frameLayout3, c8.ja.o(-1, 44));
                                m60Var3.k();
                            }
                            if (!o5Var3.f3763l.isEmpty()) {
                                m60Var3.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 2), false);
                            }
                            m60Var3.q(y4Var3);
                            m60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        f5 f5Var3 = new f5(context, this.J0, false);
        this.Y1 = f5Var3;
        f5Var3.setValue(hd.M0(2131750388, null));
        linearLayout.addView(f5Var3, c8.ja.t(-2, -2, 16, 0, 0, 6, 0));
        f5Var3.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f3961b;

            {
                this.f3961b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final y5 y5Var2 = y5Var;
                z5 z5Var = this.f3961b;
                switch (i7) {
                    case 0:
                        o5 o5Var = y5Var2.f4016c;
                        if (!o5Var.f3758f.isEmpty()) {
                            final m60 m60Var = new m60(z5Var.f29685c, z5Var.J0, z5Var.X1, false, true, false);
                            m60Var.f37112t = false;
                            m60Var.Y = true;
                            m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var.R = true;
                            m60Var.f37106p = new u3(m60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(o5Var.f3758f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i10 = z5Var.f29679a;
                            s10 s10Var = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList32.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var32 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var32.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var32.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var32.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var32 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var32.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = o5Var32.f3759g;
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
                                            o5Var32.h();
                                            m60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var = z5Var.J0;
                            Context context2 = context;
                            y4 y4Var = new y4(context2, i10, 0, false, s10Var, x10Var, null, e6Var, 4);
                            y4Var.f39895g3.f38201r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar = new ft(context2, z5Var.J0);
                            ftVar.setTextSize(1, 16.0f);
                            ftVar.setInputType(573441);
                            ftVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar.setCursorWidth(1.5f);
                            ftVar.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar.setBackground(null);
                            frameLayout.addView(ftVar, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar.addTextChangedListener(new v(strArr, y4Var, false, 4));
                            if (arrayList.size() > 8) {
                                m60Var.r(frameLayout, c8.ja.o(-1, 44));
                                m60Var.k();
                            }
                            if (!o5Var.f3761j.isEmpty()) {
                                m60Var.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 0), false);
                            }
                            m60Var.q(y4Var);
                            m60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        o5 o5Var2 = y5Var2.f4016c;
                        if (!o5Var2.f3759g.isEmpty()) {
                            final m60 m60Var2 = new m60(z5Var.f29685c, z5Var.J0, z5Var.Y1, false, true, false);
                            m60Var2.f37112t = false;
                            m60Var2.Y = true;
                            m60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var2.R = true;
                            m60Var2.f37106p = new u3(m60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(o5Var2.f3759g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i11 = z5Var.f29679a;
                            s10 s10Var2 = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList32.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var32 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var32.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var32.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var32.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var2 = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var32 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var32.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = o5Var32.f3759g;
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
                                            o5Var32.h();
                                            m60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var2.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var2 = z5Var.J0;
                            Context context3 = context;
                            y4 y4Var2 = new y4(context3, i11, 0, false, s10Var2, x10Var2, null, e6Var2, 5);
                            y4Var2.f39895g3.f38201r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar2 = new ft(context3, z5Var.J0);
                            ftVar2.setTextSize(1, 16.0f);
                            ftVar2.setInputType(573441);
                            ftVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar2, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar2, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar2.setCursorWidth(1.5f);
                            ftVar2.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar2, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar2.setBackground(null);
                            frameLayout2.addView(ftVar2, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar2.addTextChangedListener(new v(strArr2, y4Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                m60Var2.r(frameLayout2, c8.ja.o(-1, 44));
                                m60Var2.k();
                            }
                            if (!o5Var2.f3762k.isEmpty()) {
                                m60Var2.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 1), false);
                            }
                            m60Var2.q(y4Var2);
                            m60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        o5 o5Var3 = y5Var2.f4016c;
                        if (!o5Var3.h.isEmpty()) {
                            final m60 m60Var3 = new m60(z5Var.f29685c, z5Var.J0, z5Var.Z1, false, true, false);
                            m60Var3.f37112t = false;
                            m60Var3.Y = true;
                            m60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var3.R = true;
                            m60Var3.f37106p = new u3(m60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(o5Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i12 = z5Var.f29679a;
                            s10 s10Var3 = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList32.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var32 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var32.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var32.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var32.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var3 = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var32 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var32.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = o5Var32.f3759g;
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
                                            o5Var32.h();
                                            m60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var3.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var3 = z5Var.J0;
                            Context context4 = context;
                            y4 y4Var3 = new y4(context4, i12, 0, false, s10Var3, x10Var3, null, e6Var3, 6);
                            y4Var3.f39895g3.f38201r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar3 = new ft(context4, z5Var.J0);
                            ftVar3.setTextSize(1, 16.0f);
                            ftVar3.setInputType(573441);
                            ftVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar3, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar3, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar3.setCursorWidth(1.5f);
                            ftVar3.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar3, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar3.setBackground(null);
                            frameLayout3.addView(ftVar3, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar3.addTextChangedListener(new v(strArr3, y4Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                m60Var3.r(frameLayout3, c8.ja.o(-1, 44));
                                m60Var3.k();
                            }
                            if (!o5Var3.f3763l.isEmpty()) {
                                m60Var3.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 2), false);
                            }
                            m60Var3.q(y4Var3);
                            m60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        f5 f5Var4 = new f5(context, this.J0, false);
        this.Z1 = f5Var4;
        f5Var4.setValue(hd.M0(2131750380, null));
        linearLayout.addView(f5Var4, c8.ja.t(-2, -2, 16, 0, 0, 0, 0));
        f5Var4.setOnClickListener(new View.OnClickListener(this) {
            public final z5 f3961b;

            {
                this.f3961b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7 = r4;
                final y5 y5Var2 = y5Var;
                z5 z5Var = this.f3961b;
                switch (i7) {
                    case 0:
                        o5 o5Var = y5Var2.f4016c;
                        if (!o5Var.f3758f.isEmpty()) {
                            final m60 m60Var = new m60(z5Var.f29685c, z5Var.J0, z5Var.X1, false, true, false);
                            m60Var.f37112t = false;
                            m60Var.Y = true;
                            m60Var.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var.R = true;
                            m60Var.f37106p = new u3(m60Var, 6);
                            final String[] strArr = {""};
                            final ArrayList arrayList = new ArrayList(o5Var.f3758f);
                            Collections.sort(arrayList, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i10 = z5Var.f29679a;
                            s10 s10Var = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList32.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var32 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var32.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var32.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var32.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var32 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var32.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = o5Var32.f3759g;
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
                                            o5Var32.h();
                                            m60Var.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var = z5Var.J0;
                            Context context2 = context;
                            y4 y4Var = new y4(context2, i10, 0, false, s10Var, x10Var, null, e6Var, 4);
                            y4Var.f39895g3.f38201r = false;
                            FrameLayout frameLayout = new FrameLayout(context2);
                            ImageView imageView = new ImageView(context2);
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                            imageView.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout.addView(imageView, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar = new ft(context2, z5Var.J0);
                            ftVar.setTextSize(1, 16.0f);
                            ftVar.setInputType(573441);
                            ftVar.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar.setCursorWidth(1.5f);
                            ftVar.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar.setBackground(null);
                            frameLayout.addView(ftVar, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar.addTextChangedListener(new v(strArr, y4Var, false, 4));
                            if (arrayList.size() > 8) {
                                m60Var.r(frameLayout, c8.ja.o(-1, 44));
                                m60Var.k();
                            }
                            if (!o5Var.f3761j.isEmpty()) {
                                m60Var.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 0), false);
                            }
                            m60Var.q(y4Var);
                            m60Var.Z();
                            return;
                        }
                        return;
                    case 1:
                        o5 o5Var2 = y5Var2.f4016c;
                        if (!o5Var2.f3759g.isEmpty()) {
                            final m60 m60Var2 = new m60(z5Var.f29685c, z5Var.J0, z5Var.Y1, false, true, false);
                            m60Var2.f37112t = false;
                            m60Var2.Y = true;
                            m60Var2.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var2.R = true;
                            m60Var2.f37106p = new u3(m60Var2, 4);
                            final String[] strArr2 = {""};
                            final ArrayList arrayList2 = new ArrayList(o5Var2.f3759g);
                            Collections.sort(arrayList2, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i11 = z5Var.f29679a;
                            s10 s10Var2 = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList2;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr2;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList32.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var32 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var32.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var32.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var32.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var2 = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var2.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var32 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var32.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = o5Var32.f3759g;
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
                                            o5Var32.h();
                                            m60Var2.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var2.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var2 = z5Var.J0;
                            Context context3 = context;
                            y4 y4Var2 = new y4(context3, i11, 0, false, s10Var2, x10Var2, null, e6Var2, 5);
                            y4Var2.f39895g3.f38201r = false;
                            FrameLayout frameLayout2 = new FrameLayout(context3);
                            ImageView imageView2 = new ImageView(context3);
                            imageView2.setScaleType(ImageView.ScaleType.CENTER);
                            imageView2.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout2.addView(imageView2, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar2 = new ft(context3, z5Var.J0);
                            ftVar2.setTextSize(1, 16.0f);
                            ftVar2.setInputType(573441);
                            ftVar2.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar2, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar2, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar2.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar2.setCursorWidth(1.5f);
                            ftVar2.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar2, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar2.setBackground(null);
                            frameLayout2.addView(ftVar2, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar2.addTextChangedListener(new v(strArr2, y4Var2, false, 5));
                            if (arrayList2.size() > 8) {
                                m60Var2.r(frameLayout2, c8.ja.o(-1, 44));
                                m60Var2.k();
                            }
                            if (!o5Var2.f3762k.isEmpty()) {
                                m60Var2.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 1), false);
                            }
                            m60Var2.q(y4Var2);
                            m60Var2.Z();
                            return;
                        }
                        return;
                    default:
                        o5 o5Var3 = y5Var2.f4016c;
                        if (!o5Var3.h.isEmpty()) {
                            final m60 m60Var3 = new m60(z5Var.f29685c, z5Var.J0, z5Var.Z1, false, true, false);
                            m60Var3.f37112t = false;
                            m60Var3.Y = true;
                            m60Var3.a0(0.0f, org.telegram.messenger.g0.L(-8.0f));
                            m60Var3.R = true;
                            m60Var3.f37106p = new u3(m60Var3, 5);
                            final String[] strArr3 = {""};
                            final ArrayList arrayList3 = new ArrayList(o5Var3.h);
                            Collections.sort(arrayList3, new Comparator() {
                                @Override
                                public final int compare(Object obj, Object obj2) {
                                    switch (r2) {
                                        case 0:
                                            y5 y5Var3 = y5Var2;
                                            Integer num = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                                            Integer num2 = (Integer) y5Var3.f4016c.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                                            if (num == null) {
                                                return 1;
                                            }
                                            if (num2 == null) {
                                                return -1;
                                            }
                                            return num2.intValue() - num.intValue();
                                        case 1:
                                            y5 y5Var4 = y5Var2;
                                            Integer num3 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                                            Integer num4 = (Integer) y5Var4.f4016c.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
                                            if (num3 == null) {
                                                return 1;
                                            }
                                            if (num4 == null) {
                                                return -1;
                                            }
                                            return num4.intValue() - num3.intValue();
                                        default:
                                            y5 y5Var5 = y5Var2;
                                            Integer num5 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                                            Integer num6 = (Integer) y5Var5.f4016c.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
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
                            int i12 = z5Var.f29679a;
                            s10 s10Var3 = new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    int intValue;
                                    int intValue2;
                                    int i112;
                                    int i122 = r4;
                                    boolean z10 = false;
                                    ArrayList arrayList22 = arrayList3;
                                    y5 y5Var3 = y5Var2;
                                    String[] strArr22 = strArr3;
                                    switch (i122) {
                                        case 0:
                                            ArrayList arrayList32 = (ArrayList) obj;
                                            p41 p41Var = (p41) obj2;
                                            String lowerCase = strArr22[0].toLowerCase();
                                            String N3 = org.telegram.messenger.g0.N3(lowerCase);
                                            o5 o5Var22 = y5Var3.f4016c;
                                            boolean isEmpty = o5Var22.f3761j.isEmpty();
                                            int size = arrayList22.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj3 = arrayList22.get(i13);
                                                i13++;
                                                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                                                boolean contains = o5Var22.f3761j.contains(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                boolean z11 = !contains;
                                                if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(N3) || i5.c.A(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(N3))) {
                                                    Integer num = (Integer) o5Var22.f3764m.get(Long.valueOf(stargiftattributemodel.document.f28057id));
                                                    if (num == null) {
                                                        intValue = 0;
                                                    } else {
                                                        intValue = num.intValue();
                                                    }
                                                    int i14 = i5.f3618b;
                                                    b41 K = b41.K(i5.class);
                                                    K.G = stargiftattributemodel;
                                                    K.f33181l = lowerCase;
                                                    K.f33194z = intValue;
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
                                                arrayList32.add(d5.i(hd.M0(2131750010, null)));
                                                return;
                                            }
                                            return;
                                        case 1:
                                            ArrayList arrayList4 = (ArrayList) obj;
                                            p41 p41Var2 = (p41) obj2;
                                            String lowerCase2 = strArr22[0].toLowerCase();
                                            String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                                            o5 o5Var32 = y5Var3.f4016c;
                                            boolean isEmpty2 = o5Var32.f3762k.isEmpty();
                                            int size2 = arrayList22.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Object obj4 = arrayList22.get(i15);
                                                i15++;
                                                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                                                boolean contains2 = o5Var32.f3762k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                boolean z12 = !contains2;
                                                if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(N32) || i5.c.A(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(N32))) {
                                                    Integer num2 = (Integer) o5Var32.f3765n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                                                    if (num2 == null) {
                                                        intValue2 = 0;
                                                    } else {
                                                        intValue2 = num2.intValue();
                                                    }
                                                    int i16 = a5.f3374b;
                                                    b41 K2 = b41.K(a5.class);
                                                    K2.G = stargiftattributebackdrop;
                                                    K2.f33181l = lowerCase2;
                                                    K2.f33194z = intValue2;
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
                                                arrayList4.add(d5.i(hd.M0(2131750015, null)));
                                                return;
                                            }
                                            return;
                                        default:
                                            ArrayList arrayList5 = (ArrayList) obj;
                                            p41 p41Var3 = (p41) obj2;
                                            String lowerCase3 = strArr22[0].toLowerCase();
                                            String N33 = org.telegram.messenger.g0.N3(lowerCase3);
                                            o5 o5Var4 = y5Var3.f4016c;
                                            boolean isEmpty3 = o5Var4.f3763l.isEmpty();
                                            int size3 = arrayList22.size();
                                            int i17 = 0;
                                            while (i17 < size3) {
                                                Object obj5 = arrayList22.get(i17);
                                                i17++;
                                                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                                                boolean z13 = z10;
                                                boolean contains3 = o5Var4.f3763l.contains(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                boolean z14 = !contains3;
                                                if (TextUtils.isEmpty(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) || stargiftattributepattern.name.toLowerCase().startsWith(N33) || i5.c.A(" ", lowerCase3, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(N33))) {
                                                    Integer num3 = (Integer) o5Var4.f3766o.get(Long.valueOf(stargiftattributepattern.document.f28057id));
                                                    if (num3 == null) {
                                                        i112 = z13;
                                                    } else {
                                                        i112 = num3.intValue();
                                                    }
                                                    int i18 = l5.f3676b;
                                                    b41 K3 = b41.K(l5.class);
                                                    K3.G = stargiftattributepattern;
                                                    K3.f33181l = lowerCase3;
                                                    K3.f33194z = i112;
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
                                                arrayList5.add(d5.i(hd.M0(2131750008, null)));
                                                return;
                                            }
                                            return;
                                    }
                                }
                            };
                            x10 x10Var3 = new x10() {
                                @Override
                                public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
                                    b41 b41Var = (b41) obj;
                                    View view2 = (View) obj2;
                                    Integer num = (Integer) number;
                                    Float f10 = (Float) serializable;
                                    Float f11 = (Float) serializable2;
                                    switch (r3) {
                                        case 0:
                                            long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                                            o5 o5Var22 = y5Var2.f4016c;
                                            HashSet hashSet = o5Var22.f3761j;
                                            if (!hashSet.contains(Long.valueOf(j3))) {
                                                if (hashSet.isEmpty()) {
                                                    ArrayList arrayList22 = o5Var22.f3758f;
                                                    int size = arrayList22.size();
                                                    int i112 = 0;
                                                    while (i112 < size) {
                                                        Object obj3 = arrayList22.get(i112);
                                                        i112++;
                                                        long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
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
                                            o5Var22.h();
                                            m60Var3.u();
                                            return;
                                        case 1:
                                            int i122 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                                            o5 o5Var32 = y5Var2.f4016c;
                                            HashSet hashSet2 = o5Var32.f3762k;
                                            if (!hashSet2.contains(Integer.valueOf(i122))) {
                                                if (hashSet2.isEmpty()) {
                                                    ArrayList arrayList32 = o5Var32.f3759g;
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
                                            o5Var32.h();
                                            m60Var3.u();
                                            return;
                                        default:
                                            long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                                            o5 o5Var4 = y5Var2.f4016c;
                                            HashSet hashSet3 = o5Var4.f3763l;
                                            if (!hashSet3.contains(Long.valueOf(j11))) {
                                                if (hashSet3.isEmpty()) {
                                                    ArrayList arrayList4 = o5Var4.h;
                                                    int size3 = arrayList4.size();
                                                    int i15 = 0;
                                                    while (i15 < size3) {
                                                        Object obj5 = arrayList4.get(i15);
                                                        i15++;
                                                        long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
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
                                            o5Var4.h();
                                            m60Var3.u();
                                            return;
                                    }
                                }
                            };
                            org.telegram.ui.ActionBar.e6 e6Var3 = z5Var.J0;
                            Context context4 = context;
                            y4 y4Var3 = new y4(context4, i12, 0, false, s10Var3, x10Var3, null, e6Var3, 6);
                            y4Var3.f39895g3.f38201r = false;
                            FrameLayout frameLayout3 = new FrameLayout(context4);
                            ImageView imageView3 = new ImageView(context4);
                            imageView3.setScaleType(ImageView.ScaleType.CENTER);
                            imageView3.setImageResource(2131232738);
                            org.telegram.ui.ActionBar.q6.s(imageView3, org.telegram.ui.ActionBar.j6.F8, z5Var.J0, PorterDuff.Mode.SRC_IN);
                            frameLayout3.addView(imageView3, c8.ja.d(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
                            ft ftVar3 = new ft(context4, z5Var.J0);
                            ftVar3.setTextSize(1, 16.0f);
                            ftVar3.setInputType(573441);
                            ftVar3.setRawInputType(573441);
                            org.telegram.ui.ActionBar.q6.D(ftVar3, org.telegram.ui.ActionBar.j6.A6, z5Var.J0);
                            org.telegram.ui.ActionBar.q6.l(ftVar3, 30, org.telegram.ui.ActionBar.j6.G6, z5Var.J0);
                            ftVar3.setCursorSize(org.telegram.messenger.g0.L(19.0f));
                            ftVar3.setCursorWidth(1.5f);
                            ftVar3.setHint(hd.M0(2131750009, null));
                            org.telegram.ui.ActionBar.q6.U(ftVar3, org.telegram.ui.ActionBar.j6.E8, z5Var.J0);
                            ftVar3.setBackground(null);
                            frameLayout3.addView(ftVar3, c8.ja.d(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
                            ftVar3.addTextChangedListener(new v(strArr3, y4Var3, false, 6));
                            if (arrayList3.size() > 8) {
                                m60Var3.r(frameLayout3, c8.ja.o(-1, 44));
                                m60Var3.k();
                            }
                            if (!o5Var3.f3763l.isEmpty()) {
                                m60Var3.c(2131232358, hd.M0(2131745670, null), new r5(y5Var2, 2), false);
                            }
                            m60Var3.q(y4Var3);
                            m60Var3.Z();
                            return;
                        }
                        return;
                }
            }
        });
        getContext();
        v4.s sVar = new v4.s(3);
        sVar.O = new y1(this, 1);
        this.f35936o1.setLayoutManager(sVar);
        this.f35936o1.setOnItemClickListener(new ab.g(7, this, y5Var));
        this.f35936o1.setPadding(org.telegram.messenger.g0.L(8.0f) + this.f29717u0, 0, org.telegram.messenger.g0.L(8.0f) + this.f29717u0, 0);
        this.f35936o1.setOnScrollListener(new z4(this, 1));
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(er.h);
        kVar.n(350L);
        this.f35936o1.setItemAnimator(kVar);
        this.f35936o1.setItemSelectorColorProvider(new a3.l(22));
        di.h4 h4Var = new di.h4(context);
        this.f4030a2 = h4Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int L2 = org.telegram.messenger.g0.L(9.0f);
        h4Var.h = L;
        h4Var.f8672n = L2;
        h4Var.setRoundRadius(org.telegram.messenger.g0.L(22.0f));
        h4Var.setFullRect(true);
        org.telegram.messenger.g0.m2(new ai.f0(h4Var, 10), 12.0f, 12, new ArrayList());
        h4Var.setPivotY(0.0f);
        this.f29685c.addView(h4Var, c8.ja.e(-1, -2, 55));
        this.f4033e2.O(false);
        y5Var.d = new s5(this, 1);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        x5 x5Var = new x5(this, uj0Var, getContext(), this.f29679a, new b(this, 8), this.J0, 0);
        this.f4033e2 = x5Var;
        return x5Var;
    }

    @Override
    public final CharSequence O0() {
        String str = this.T1;
        if (str != null) {
            return str;
        }
        return hd.M0(2131749771, null);
    }

    @Override
    public final void T0(float f10) {
        float y10 = this.f29682b.getY() + f10;
        di.h4 h4Var = this.f4030a2;
        float measuredHeight = y10 - h4Var.getMeasuredHeight();
        float l10 = 1.0f - Utilities.l(Math.max(0.0f, (-measuredHeight) + org.telegram.messenger.g0.L(8.0f)) / h4Var.getMeasuredHeight());
        float height = this.f29685c.getHeight() / 2.0f;
        if (measuredHeight > height) {
            l10 = Math.min(l10, Utilities.l(1.0f - ((measuredHeight - height) / org.telegram.messenger.g0.N(128.0f))));
        }
        h4Var.setScaleX(l10);
        h4Var.setScaleY(l10);
        h4Var.setAlpha(org.telegram.messenger.g0.z1(l10, 0.5f, 1.0f));
        h4Var.setTranslationY(measuredHeight);
    }

    public final void d1() {
        int R;
        b41 G;
        int i7 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            uj0 uj0Var = this.f35936o1;
            if (i7 >= uj0Var.getChildCount()) {
                break;
            }
            View childAt = uj0Var.getChildAt(i7);
            if ((childAt instanceof pz) && (R = RecyclerView.R(childAt) - 1) >= 0 && (G = this.f4033e2.G(R)) != null) {
                if (G.d < 10) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
            i7++;
        }
        y5 y5Var = this.U1;
        if (z10) {
            y5Var.f4015b.a();
        }
        if (z11) {
            y5Var.f4016c.g(false);
        }
    }
}
