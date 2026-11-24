package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class xc7 implements Runnable {
    public final byte a;
    public final cf7 b;
    public final int c;

    public xc7(cf7 cf7Var, int i, byte b) {
        this.a = b;
        this.b = cf7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        byte b = this.a;
        int i = this.c;
        cf7 cf7Var = this.b;
        switch (b) {
            case 0:
                cf7Var.getDownloadController().t(i);
                return;
            case 1:
                try {
                    SQLiteDatabase sQLiteDatabase = cf7Var.b;
                    sQLiteDatabase.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    cf7Var.n(e, true);
                    return;
                }
            case 2:
                cf7 cf7Var2 = this.b;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        vh6 vh6Var = new vh6();
                        SQLiteDatabase sQLiteDatabase2 = cf7Var2.b;
                        if (i >= 0) {
                            queryFinalized = sQLiteDatabase2.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i)), new Object[0]);
                        } else {
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        }
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!pg3.C(longValue)) {
                                    ?? obj = new Object();
                                    obj.a = queryFinalized.intValue(1);
                                    obj.c = queryFinalized.intValue(2);
                                    obj.b = queryFinalized.intValue(3);
                                    vh6Var.k(obj, longValue);
                                    if (!pg3.B(longValue)) {
                                        if (pg3.y(longValue)) {
                                            long j = -longValue;
                                            if (!arrayList2.contains(Long.valueOf(j))) {
                                                arrayList2.add(Long.valueOf(j));
                                            }
                                        } else if (!arrayList.contains(Long.valueOf(longValue))) {
                                            arrayList.add(Long.valueOf(longValue));
                                        }
                                    } else {
                                        int i2 = (int) (longValue & 4294967295L);
                                        if (!arrayList3.contains(Integer.valueOf(i2))) {
                                            arrayList3.add(Integer.valueOf(i2));
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteCursor = queryFinalized;
                                cf7Var2.n(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        queryFinalized.dispose();
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        if (!arrayList3.isEmpty()) {
                            cf7Var2.T(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            cf7Var2.k0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            cf7Var2.P(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        gm.c3(new v15(cf7Var2, arrayList4, arrayList5, arrayList6, vh6Var, (byte) 27));
                        return;
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            case 3:
                cf7Var.k(i);
                return;
            case 4:
                oc7 messagesController = cf7Var.getMessagesController();
                z8c userConfig = messagesController.getUserConfig();
                int i3 = this.c;
                if (userConfig.g(i3)[0] == 2147483647L) {
                    if (i3 == 1) {
                        messagesController.h0 = false;
                        messagesController.z();
                        return;
                    }
                    messagesController.n4(i3);
                    return;
                }
                messagesController.Z2(i3, 0, 10, false, new w77(messagesController, i3, (byte) 2));
                return;
            default:
                try {
                    SQLiteDatabase sQLiteDatabase3 = cf7Var.b;
                    sQLiteDatabase3.executeFast("DELETE FROM business_replies WHERE topic_id = " + i).stepThis().dispose();
                    sQLiteDatabase3.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return;
                }
        }
    }
}
