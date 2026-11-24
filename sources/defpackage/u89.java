package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class u89 implements i8c {
    public final byte a;
    public final z99 b;
    public final String[] c;
    public final ArrayList d;

    public u89(z99 z99Var, String[] strArr, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = z99Var;
        this.c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        boolean z;
        String str2;
        int i;
        byte b = this.a;
        boolean z2 = false;
        String str3 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.c;
        z99 z99Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                l5c l5cVar = (l5c) obj2;
                z99Var.getClass();
                String lowerCase = strArr[0].toLowerCase();
                String I3 = gl.I3(lowerCase);
                q99 q99Var = z99Var.d;
                boolean isEmpty = q99Var.l.isEmpty();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = q99Var.l.contains(Long.valueOf(stargiftattributepattern.document.id));
                    boolean z3 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(I3) || de9.t(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(I3))) {
                        Integer num = (Integer) q99Var.o.get(Long.valueOf(stargiftattributepattern.document.id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i3 = n99.b;
                        c4c K = c4c.K(n99.class);
                        K.H = stargiftattributepattern;
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
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(g99.i(k96.M0(2131749992, null)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                l5c l5cVar2 = (l5c) obj2;
                z99Var.getClass();
                String lowerCase2 = strArr[0].toLowerCase();
                String I32 = gl.I3(lowerCase2);
                q99 q99Var2 = z99Var.d;
                boolean isEmpty2 = q99Var2.k.isEmpty();
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj4 = arrayList.get(i4);
                    i4++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = q99Var2.k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z4 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(I32)) {
                        str = str4;
                        if (!de9.t(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !stargiftattributebackdrop.name.toLowerCase().contains(str.concat(I32))) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) q99Var2.n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i5 = d99.b;
                    c4c K2 = c4c.K(d99.class);
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
                    arrayList3.add(K2);
                    str4 = str;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(g99.i(k96.M0(2131749999, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                l5c l5cVar3 = (l5c) obj2;
                z99Var.getClass();
                String lowerCase3 = strArr[0].toLowerCase();
                String I33 = gl.I3(lowerCase3);
                q99 q99Var3 = z99Var.d;
                boolean isEmpty3 = q99Var3.j.isEmpty();
                int size3 = arrayList.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj5 = arrayList.get(i6);
                    i6++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = q99Var3.j.contains(Long.valueOf(stargiftattributemodel.document.id));
                    boolean z5 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(I33) && !de9.t(str3, lowerCase3, stargiftattributemodel.name.toLowerCase())) {
                        z = z2;
                        if (!stargiftattributemodel.name.toLowerCase().contains(str3.concat(I33))) {
                            str2 = str3;
                            z2 = z;
                            str3 = str2;
                        }
                    } else {
                        z = z2;
                    }
                    str2 = str3;
                    Integer num3 = (Integer) q99Var3.m.get(Long.valueOf(stargiftattributemodel.document.id));
                    if (num3 == null) {
                        i = z;
                    } else {
                        i = num3.intValue();
                    }
                    int i7 = k99.b;
                    c4c K3 = c4c.K(k99.class);
                    K3.H = stargiftattributemodel;
                    K3.m = lowerCase3;
                    K3.A = i;
                    if (!TextUtils.isEmpty(lowerCase3)) {
                        if (!isEmpty3 && !contains3) {
                            z5 = true;
                        } else {
                            z5 = z;
                        }
                    }
                    K3.L(z5);
                    arrayList4.add(K3);
                    z2 = z;
                    str3 = str2;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(g99.i(k96.M0(2131749994, null)));
                    return;
                }
                return;
        }
    }
}
