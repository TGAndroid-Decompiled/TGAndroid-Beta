package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.w51;
public final class b5 implements Utilities.Callback2 {
    public final int f10616a;
    public final String[] f10617b;
    public final o5 f10618c;
    public final ArrayList d;

    public b5(String[] strArr, o5 o5Var, ArrayList arrayList, int i10) {
        this.f10616a = i10;
        this.f10617b = strArr;
        this.f10618c = o5Var;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        String str2;
        int intValue3;
        int i10 = this.f10616a;
        String str3 = " ";
        ArrayList arrayList = this.d;
        o5 o5Var = this.f10618c;
        String[] strArr = this.f10617b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                a5 a5Var = o5Var.f10851c;
                boolean isEmpty = a5Var.f10586j.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj3;
                    boolean contains = a5Var.f10586j.contains(Long.valueOf(stargiftattributemodel.document.f19165id));
                    boolean z4 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) || stargiftattributemodel.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", lowerCase, stargiftattributemodel.name.toLowerCase()) || org.telegram.messenger.y3.w(" ", translitSafe, stargiftattributemodel.name.toLowerCase())) {
                        Integer num = (Integer) a5Var.f10589m.get(Long.valueOf(stargiftattributemodel.document.f19165id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = u4.f10976a;
                        i51 J = i51.J(u4.class);
                        J.G = stargiftattributemodel;
                        J.f25585l = lowerCase;
                        J.f25598z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        J.K(z4);
                        arrayList2.add(J);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(p4.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                a5 a5Var2 = o5Var.f10851c;
                boolean isEmpty2 = a5Var2.f10587k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = a5Var2.f10587k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z10 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!org.telegram.messenger.y3.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !org.telegram.messenger.y3.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) a5Var2.f10590n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i14 = n4.f10841a;
                    i51 J2 = i51.J(n4.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f25585l = lowerCase2;
                    J2.f25598z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        if (!isEmpty2 && !contains2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    J2.K(z10);
                    arrayList3.add(J2);
                    str4 = str;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(p4.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                w51 w51Var3 = (w51) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                a5 a5Var3 = o5Var.f10851c;
                boolean isEmpty3 = a5Var3.f10588l.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj5;
                    boolean contains3 = a5Var3.f10588l.contains(Long.valueOf(stargiftattributepattern.document.f19165id));
                    boolean z11 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe3) && !org.telegram.messenger.y3.w(str3, lowerCase3, stargiftattributepattern.name.toLowerCase()) && !org.telegram.messenger.y3.w(str3, translitSafe3, stargiftattributepattern.name.toLowerCase())) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        Integer num3 = (Integer) a5Var3.f10591o.get(Long.valueOf(stargiftattributepattern.document.f19165id));
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            intValue3 = num3.intValue();
                        }
                        int i16 = x4.f11058a;
                        i51 J3 = i51.J(x4.class);
                        J3.G = stargiftattributepattern;
                        J3.f25585l = lowerCase3;
                        J3.f25598z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        J3.K(z11);
                        arrayList4.add(J3);
                    }
                    str3 = str2;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(p4.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
        }
    }
}
