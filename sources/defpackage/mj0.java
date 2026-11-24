package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mj0 {
    public final String a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public mj0(String str) {
        this.a = str;
    }

    public static mj0 b(TL_account.contactBirthdays contactbirthdays) {
        ArrayList arrayList;
        mj0 mj0Var;
        int i;
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(5);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(1);
        calendar.add(5, -1);
        int i5 = calendar.get(5);
        int i6 = calendar.get(2) + 1;
        calendar.get(1);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, 1);
        int i7 = calendar2.get(5);
        int i8 = calendar2.get(2) + 1;
        calendar2.get(1);
        mj0 mj0Var2 = new mj0(i2 + "_" + i3 + "_" + i4);
        ArrayList<TL_account.TL_contactBirthday> arrayList2 = contactbirthdays.contacts;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            TL_account.TL_contactBirthday tL_contactBirthday = arrayList2.get(i9);
            i9++;
            TL_account.TL_contactBirthday tL_contactBirthday2 = tL_contactBirthday;
            TL_account.TL_birthday tL_birthday = tL_contactBirthday2.birthday;
            int i10 = tL_birthday.day;
            TLRPC.User user = null;
            if (i10 == i2 && tL_birthday.month == i3) {
                arrayList = mj0Var2.c;
            } else if (i10 == i5 && tL_birthday.month == i6) {
                arrayList = mj0Var2.b;
            } else if (i10 == i7 && tL_birthday.month == i8) {
                arrayList = mj0Var2.d;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                int i11 = 0;
                while (true) {
                    if (i11 < contactbirthdays.users.size()) {
                        mj0Var = mj0Var2;
                        i = i7;
                        if (contactbirthdays.users.get(i11).id == tL_contactBirthday2.contact_id) {
                            user = contactbirthdays.users.get(i11);
                            break;
                        }
                        i11++;
                        i7 = i;
                        mj0Var2 = mj0Var;
                    } else {
                        mj0Var = mj0Var2;
                        i = i7;
                        break;
                    }
                }
                if (user != null && !l7c.D(user)) {
                    arrayList.add(user);
                }
            } else {
                mj0Var = mj0Var2;
                i = i7;
            }
            i7 = i;
            mj0Var2 = mj0Var;
        }
        return mj0Var2;
    }

    public final boolean a(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((TLRPC.User) obj).id == j) {
                return true;
            }
        }
        ArrayList arrayList2 = this.c;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            if (((TLRPC.User) obj2).id == j) {
                return true;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            if (((TLRPC.User) obj3).id == j) {
                return true;
            }
        }
        return false;
    }
}
