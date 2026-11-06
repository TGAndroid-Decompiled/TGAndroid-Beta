package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class t1 {
    public final String f25576a;
    public final ArrayList f25577b = new ArrayList();
    public final ArrayList f25578c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public t1(String str) {
        this.f25576a = str;
    }

    public static t1 b(TL_account.contactBirthdays contactbirthdays) {
        ArrayList arrayList;
        t1 t1Var;
        int i7;
        Calendar calendar = Calendar.getInstance();
        int i10 = calendar.get(5);
        int i11 = calendar.get(2) + 1;
        int i12 = calendar.get(1);
        calendar.add(5, -1);
        int i13 = calendar.get(5);
        int i14 = calendar.get(2) + 1;
        calendar.get(1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 1);
        int i15 = calendar2.get(5);
        int i16 = calendar2.get(2) + 1;
        calendar2.get(1);
        t1 t1Var2 = new t1(i10 + "_" + i11 + "_" + i12);
        ArrayList<TL_account.TL_contactBirthday> arrayList2 = contactbirthdays.contacts;
        int size = arrayList2.size();
        int i17 = 0;
        while (i17 < size) {
            TL_account.TL_contactBirthday tL_contactBirthday = arrayList2.get(i17);
            i17++;
            TL_account.TL_contactBirthday tL_contactBirthday2 = tL_contactBirthday;
            TL_account.TL_birthday tL_birthday = tL_contactBirthday2.birthday;
            int i18 = tL_birthday.day;
            TLRPC.User user = null;
            if (i18 == i10 && tL_birthday.month == i11) {
                arrayList = t1Var2.f25578c;
            } else if (i18 == i13 && tL_birthday.month == i14) {
                arrayList = t1Var2.f25577b;
            } else if (i18 == i15 && tL_birthday.month == i16) {
                arrayList = t1Var2.d;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                int i19 = 0;
                while (true) {
                    if (i19 < contactbirthdays.users.size()) {
                        t1Var = t1Var2;
                        i7 = i15;
                        if (contactbirthdays.users.get(i19).f27102id == tL_contactBirthday2.contact_id) {
                            user = contactbirthdays.users.get(i19);
                            break;
                        }
                        i19++;
                        i15 = i7;
                        t1Var2 = t1Var;
                    } else {
                        t1Var = t1Var2;
                        i7 = i15;
                        break;
                    }
                }
                if (user != null && !t10.B(user)) {
                    arrayList.add(user);
                }
            } else {
                t1Var = t1Var2;
                i7 = i15;
            }
            i15 = i7;
            t1Var2 = t1Var;
        }
        return t1Var2;
    }

    public final boolean a(long j3) {
        ArrayList arrayList = this.f25577b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((TLRPC.User) obj).f27102id == j3) {
                return true;
            }
        }
        ArrayList arrayList2 = this.f25578c;
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            if (((TLRPC.User) obj2).f27102id == j3) {
                return true;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            if (((TLRPC.User) obj3).f27102id == j3) {
                return true;
            }
        }
        return false;
    }
}
