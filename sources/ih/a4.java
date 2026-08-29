package ih;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;
public final class a4 implements Utilities.Callback2 {
    public final int f9018a;
    public final r5 f9019b;
    public final String[] f9020c;
    public final ArrayList d;

    public a4(r5 r5Var, String[] strArr, ArrayList arrayList, int i10) {
        this.f9018a = i10;
        this.f9019b = r5Var;
        this.f9020c = strArr;
        this.d = arrayList;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int intValue;
        String str;
        int intValue2;
        String str2;
        int intValue3;
        int i10 = this.f9018a;
        String str3 = " ";
        ArrayList arrayList = this.d;
        String[] strArr = this.f9020c;
        r5 r5Var = this.f9019b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                String lowerCase = strArr[0].toLowerCase();
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                b5 b5Var = r5Var.d;
                boolean isEmpty = b5Var.f9052l.isEmpty();
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                    boolean contains = b5Var.f9052l.contains(Long.valueOf(stargiftattributepattern.document.f22398id));
                    boolean z10 = !contains;
                    if (TextUtils.isEmpty(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) || stargiftattributepattern.name.toLowerCase().startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", lowerCase, stargiftattributepattern.name.toLowerCase()) || org.telegram.messenger.x3.w(" ", translitSafe, stargiftattributepattern.name.toLowerCase())) {
                        Integer num = (Integer) b5Var.f9055o.get(Long.valueOf(stargiftattributepattern.document.f22398id));
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        int i12 = y4.f9547a;
                        w41 J = w41.J(y4.class);
                        J.G = stargiftattributepattern;
                        J.f34300l = lowerCase;
                        J.f34313z = intValue;
                        if (!TextUtils.isEmpty(lowerCase)) {
                            if (!isEmpty && !contains) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        J.K(z10);
                        arrayList2.add(J);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2.add(q4.a(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
                    return;
                }
                return;
            case 1:
                String str4 = " ";
                ArrayList arrayList3 = (ArrayList) obj;
                k51 k51Var2 = (k51) obj2;
                String lowerCase2 = strArr[0].toLowerCase();
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                b5 b5Var2 = r5Var.d;
                boolean isEmpty2 = b5Var2.f9051k.isEmpty();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj4;
                    boolean contains2 = b5Var2.f9051k.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    boolean z11 = !contains2;
                    if (!TextUtils.isEmpty(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase2) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe2)) {
                        str = str4;
                        if (!org.telegram.messenger.x3.w(str, lowerCase2, stargiftattributebackdrop.name.toLowerCase()) && !org.telegram.messenger.x3.w(str, translitSafe2, stargiftattributebackdrop.name.toLowerCase())) {
                            str4 = str;
                        }
                    } else {
                        str = str4;
                    }
                    Integer num2 = (Integer) b5Var2.f9054n.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                    if (num2 == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = num2.intValue();
                    }
                    int i14 = o4.f9319a;
                    w41 J2 = w41.J(o4.class);
                    J2.G = stargiftattributebackdrop;
                    J2.f34300l = lowerCase2;
                    J2.f34313z = intValue2;
                    if (!TextUtils.isEmpty(lowerCase2)) {
                        if (!isEmpty2 && !contains2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                    J2.K(z11);
                    arrayList3.add(J2);
                    str4 = str;
                }
                if (arrayList3.isEmpty()) {
                    arrayList3.add(q4.a(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
                    return;
                }
                return;
            default:
                ArrayList arrayList4 = (ArrayList) obj;
                k51 k51Var3 = (k51) obj2;
                String lowerCase3 = strArr[0].toLowerCase();
                String translitSafe3 = AndroidUtilities.translitSafe(lowerCase3);
                b5 b5Var3 = r5Var.d;
                boolean isEmpty3 = b5Var3.f9050j.isEmpty();
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj5 = arrayList.get(i15);
                    i15++;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj5;
                    boolean contains3 = b5Var3.f9050j.contains(Long.valueOf(stargiftattributemodel.document.f22398id));
                    boolean z12 = !contains3;
                    if (!TextUtils.isEmpty(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase3) && !stargiftattributemodel.name.toLowerCase().startsWith(translitSafe3) && !org.telegram.messenger.x3.w(str3, lowerCase3, stargiftattributemodel.name.toLowerCase()) && !org.telegram.messenger.x3.w(str3, translitSafe3, stargiftattributemodel.name.toLowerCase())) {
                        str2 = str3;
                    } else {
                        str2 = str3;
                        Integer num3 = (Integer) b5Var3.f9053m.get(Long.valueOf(stargiftattributemodel.document.f22398id));
                        if (num3 == null) {
                            intValue3 = 0;
                        } else {
                            intValue3 = num3.intValue();
                        }
                        int i16 = v4.f9460a;
                        w41 J3 = w41.J(v4.class);
                        J3.G = stargiftattributemodel;
                        J3.f34300l = lowerCase3;
                        J3.f34313z = intValue3;
                        if (!TextUtils.isEmpty(lowerCase3)) {
                            if (!isEmpty3 && !contains3) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                        }
                        J3.K(z12);
                        arrayList4.add(J3);
                    }
                    str3 = str2;
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(q4.a(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
                    return;
                }
                return;
        }
    }
}
