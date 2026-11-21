package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.o41;
public final class z6 implements q10 {
    public final int f4337a;
    public final k8 f4338b;
    public final String[] f4339c;
    public final ArrayList d;

    public z6(k8 k8Var, String[] strArr, ArrayList arrayList, int i7) {
        this.f4337a = i7;
        this.f4338b = k8Var;
        this.f4339c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        int i7;
        int i10 = this.f4337a;
        boolean z10 = false;
        ArrayList arrayList = this.d;
        String[] strArr = this.f4339c;
        k8 k8Var = this.f4338b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                c51 c51Var = (c51) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                y7 y7Var = k8Var.d;
                boolean isEmpty = y7Var.f4302l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = y7Var.f4302l.contains(Long.valueOf(stargiftattributepattern.document.f28437id));
                    boolean z11 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(M3) || i5.c.B(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || stargiftattributepattern.name.toLowerCase().contains(" ".concat(M3))) {
                        Integer num = (Integer) y7Var.f4305o.get(Long.valueOf(stargiftattributepattern.document.f28437id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = v7.f4192b;
                        o41 K = o41.K(v7.class);
                        K.H = stargiftattributepattern;
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
                        arrayList2.add(K);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(n7.i(gd.N0(2131749991, null)));
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = (ArrayList) obj;
                c51 c51Var2 = (c51) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                y7 y7Var2 = k8Var.d;
                boolean isEmpty2 = y7Var2.f4301k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = y7Var2.f4301k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z12 = !contains2;
                    if (TextUtils.isEmpty(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) || stargiftattributebackdrop.name.toLowerCase().startsWith(M32) || i5.c.B(" ", lowerCase2, stargiftattributebackdrop.name.toLowerCase()) || stargiftattributebackdrop.name.toLowerCase().contains(" ".concat(M32))) {
                        Integer num2 = (Integer) y7Var2.f4304n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            intValue2 = num2.intValue();
                        }
                        int i14 = k7.f3795b;
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
                        arrayList3.add(K2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(n7.i(gd.N0(2131749998, null)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                c51 c51Var3 = (c51) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String M33 = org.telegram.messenger.g0.M3(lowerCase3);
                y7 y7Var3 = k8Var.d;
                boolean isEmpty3 = y7Var3.f4300j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean z13 = z10;
                    boolean contains3 = y7Var3.f4300j.contains(Long.valueOf(stargiftattributemodel.document.f28437id));
                    boolean z14 = !contains3;
                    if (TextUtils.isEmpty(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) || stargiftattributemodel.name.toLowerCase().startsWith(M33) || i5.c.B(" ", lowerCase3, stargiftattributemodel.name.toLowerCase()) || stargiftattributemodel.name.toLowerCase().contains(" ".concat(M33))) {
                        Integer num3 = (Integer) y7Var3.f4303m.get(Long.valueOf(stargiftattributemodel.document.f28437id));
                        if (num3 == null) {
                            i7 = z13;
                        } else {
                            i7 = num3.intValue();
                        }
                        int i16 = s7.f4093b;
                        o41 K3 = o41.K(s7.class);
                        K3.H = stargiftattributemodel;
                        K3.f38098m = lowerCase3;
                        K3.A = i7;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z14 = true;
                            } else {
                                z14 = z13;
                            }
                        }
                        K3.L(z14);
                        arrayList4.add(K3);
                    }
                    z10 = z13;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(n7.i(gd.N0(2131749993, null)));
                    return;
                }
                return;
        }
    }
}
