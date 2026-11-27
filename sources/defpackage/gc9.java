package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class gc9 implements icc {
    public final byte a;
    public final nd9 b;
    public final String[] c;
    public final ArrayList d;

    public gc9(nd9 nd9Var, String[] strArr, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = nd9Var;
        this.c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        String lowerCase;
        String str;
        boolean z;
        String str2;
        int i;
        byte b = this.a;
        boolean z2 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                nd9Var.getClass();
                String lowerCase2 = strArr[0].toLowerCase();
                String I3 = hl.I3(lowerCase2);
                ed9 ed9Var = nd9Var.e;
                boolean isEmpty = ed9Var.l.isEmpty();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj3;
                    boolean contains = ed9Var.l.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z3 = !contains;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(I3) || uh9.t(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(I3))) {
                        Integer num = (Integer) ed9Var.o.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i3 = oc9.b;
                        b8c K = b8c.K(oc9.class);
                        K.H = stargiftattributebackdrop;
                        K.m = lowerCase2;
                        K.A = intValue;
                        if (!TextUtils.isEmpty(lowerCase2)) {
                            if (!isEmpty && !contains) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        K.L(z3);
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(uc9.i(ob6.M0(2131749963, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                l9c l9cVar2 = (l9c) obj2;
                nd9Var.getClass();
                String lowerCase3 = strArr[0].toLowerCase();
                String I32 = hl.I3(lowerCase3);
                ed9 ed9Var2 = nd9Var.e;
                boolean isEmpty2 = ed9Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj4;
                    boolean contains2 = ed9Var2.k.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z4 = !contains2;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(I32) || uh9.t(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(I32))) {
                        Integer num2 = (Integer) ed9Var2.n.get(Long.valueOf(stargiftattributemodel.document.id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i5 = yc9.b;
                        b8c K2 = b8c.K(yc9.class);
                        K2.H = stargiftattributemodel;
                        K2.m = lowerCase3;
                        K2.A = intValue2;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty2 && !contains2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        K2.L(z4);
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(uc9.i(ob6.M0(2131749957, null)));
                    return;
                }
                return;
            case 2:
                String str4 = " ";
                ArrayList arrayList4 = (ArrayList) obj;
                l9c l9cVar3 = (l9c) obj2;
                nd9Var.getClass();
                String lowerCase4 = strArr[0].toLowerCase();
                String I33 = hl.I3(lowerCase4);
                int size3 = arrayList.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj5 = arrayList.get(i6);
                    i6++;
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj5;
                    String str5 = starGift.title;
                    if (str5 == null) {
                        lowerCase = "";
                    } else {
                        lowerCase = str5.toLowerCase();
                    }
                    if (!TextUtils.isEmpty(lowerCase4) && !lowerCase.startsWith(lowerCase4) && !lowerCase.startsWith(I33)) {
                        str = str4;
                        if (!uh9.t(str, lowerCase4, lowerCase) && !lowerCase.contains(str.concat(I33))) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    int i7 = sc9.b;
                    b8c K3 = b8c.K(sc9.class);
                    K3.H = starGift;
                    K3.m = lowerCase4;
                    K3.L(nd9Var.e.b.contains(Long.valueOf(starGift.id)));
                    arrayList4.add(K3);
                    str4 = str;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(uc9.i(ob6.M0(2131749961, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = (ArrayList) obj;
                l9c l9cVar4 = (l9c) obj2;
                nd9Var.getClass();
                String lowerCase5 = strArr[0].toLowerCase();
                String I34 = hl.I3(lowerCase5);
                ed9 ed9Var3 = nd9Var.e;
                boolean isEmpty3 = ed9Var3.m.isEmpty();
                int size4 = arrayList.size();
                int i8 = 0;
                while (i8 < size4) {
                    Object obj6 = arrayList.get(i8);
                    i8++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj6;
                    boolean contains3 = ed9Var3.m.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z5 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase5) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase5) && !stargiftattributepattern.name.toLowerCase().startsWith(I34) && !uh9.t(str3, lowerCase5, stargiftattributepattern.name.toLowerCase())) {
                        z = z2;
                        if (!stargiftattributepattern.name.toLowerCase().contains(str3.concat(I34))) {
                            str2 = str3;
                            z2 = z;
                            str3 = str2;
                        }
                    } else {
                        z = z2;
                    }
                    str2 = str3;
                    Integer num3 = (Integer) ed9Var3.p.get(Long.valueOf(stargiftattributepattern.document.id));
                    if (num3 == null) {
                        i = z;
                    } else {
                        i = num3.intValue();
                    }
                    int i9 = bd9.b;
                    b8c K4 = b8c.K(bd9.class);
                    K4.H = stargiftattributepattern;
                    K4.m = lowerCase5;
                    K4.A = i;
                    if (!TextUtils.isEmpty(lowerCase5)) {
                        if (!isEmpty3 && !contains3) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                    }
                    K4.L(z5);
                    arrayList5.add(K4);
                    z2 = z;
                    str3 = str2;
                }
                if (arrayList5.isEmpty()) {
                    arrayList5.add(uc9.i(ob6.M0(2131749955, null)));
                    return;
                }
                return;
        }
    }
}
