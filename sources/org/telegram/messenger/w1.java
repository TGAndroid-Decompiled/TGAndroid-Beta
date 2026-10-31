package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class w1 {
    public final String f19037a;
    public final ArrayList f19038b = new ArrayList();
    public final ArrayList f19039c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public w1(String str) {
        this.f19037a = str;
    }

    public static w1 b(TL_account.contactBirthdays contactbirthdays) {
        ArrayList arrayList;
        w1 w1Var;
        int i10;
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(5);
        int i12 = calendar.get(2) + 1;
        int i13 = calendar.get(1);
        calendar.add(5, -1);
        int i14 = calendar.get(5);
        int i15 = calendar.get(2) + 1;
        calendar.get(1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 1);
        int i16 = calendar2.get(5);
        int i17 = calendar2.get(2) + 1;
        calendar2.get(1);
        w1 w1Var2 = new w1(i11 + "_" + i12 + "_" + i13);
        ArrayList<TL_account.TL_contactBirthday> arrayList2 = contactbirthdays.contacts;
        int size = arrayList2.size();
        int i18 = 0;
        while (i18 < size) {
            TL_account.TL_contactBirthday tL_contactBirthday = arrayList2.get(i18);
            i18++;
            TL_account.TL_contactBirthday tL_contactBirthday2 = tL_contactBirthday;
            TL_account.TL_birthday tL_birthday = tL_contactBirthday2.birthday;
            int i19 = tL_birthday.day;
            TLRPC.User user = null;
            if (i19 == i11 && tL_birthday.month == i12) {
                arrayList = w1Var2.f19039c;
            } else if (i19 == i14 && tL_birthday.month == i15) {
                arrayList = w1Var2.f19038b;
            } else if (i19 == i16 && tL_birthday.month == i17) {
                arrayList = w1Var2.d;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                int i20 = 0;
                while (true) {
                    if (i20 < contactbirthdays.users.size()) {
                        w1Var = w1Var2;
                        i10 = i16;
                        if (contactbirthdays.users.get(i20).f19942id == tL_contactBirthday2.contact_id) {
                            user = contactbirthdays.users.get(i20);
                            break;
                        }
                        i20++;
                        i16 = i10;
                        w1Var2 = w1Var;
                    } else {
                        w1Var = w1Var2;
                        i10 = i16;
                        break;
                    }
                }
                if (user != null && !h20.B(user)) {
                    arrayList.add(user);
                }
            } else {
                w1Var = w1Var2;
                i10 = i16;
            }
            i16 = i10;
            w1Var2 = w1Var;
        }
        return w1Var2;
    }

    public final boolean a(long j10) {
        ArrayList arrayList = this.f19038b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((TLRPC.User) obj).f19942id == j10) {
                return true;
            }
        }
        ArrayList arrayList2 = this.f19039c;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            if (((TLRPC.User) obj2).f19942id == j10) {
                return true;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            if (((TLRPC.User) obj3).f19942id == j10) {
                return true;
            }
        }
        return false;
    }
}
