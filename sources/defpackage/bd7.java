package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
public final class bd7 implements Runnable {
    public final byte a;
    public final kf7 b;
    public final int c;

    public bd7(kf7 kf7Var, int i, byte b) {
        this.a = b;
        this.b = kf7Var;
        this.c = i;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        byte b = this.a;
        int i = this.c;
        kf7 kf7Var = this.b;
        switch (b) {
            case 0:
                kf7Var.m(i);
                return;
            case 1:
                try {
                    SQLiteDatabase sQLiteDatabase = kf7Var.b;
                    sQLiteDatabase.executeFast("DELETE FROM shortcut_widget WHERE id = " + i).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    kf7Var.p(e, true);
                    return;
                }
            case 2:
                kf7 kf7Var2 = this.b;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        zh6 zh6Var = new zh6();
                        SQLiteDatabase sQLiteDatabase2 = kf7Var2.b;
                        if (i >= 0) {
                            queryFinalized = sQLiteDatabase2.queryFinalized(String.format(Locale.US, "SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0 AND folder_id = %1$d", Integer.valueOf(i)), new Object[0]);
                        } else {
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT did, last_mid, unread_count, date FROM dialogs WHERE unread_count > 0", new Object[0]);
                        }
                        while (queryFinalized.next()) {
                            try {
                                long longValue = queryFinalized.longValue(0);
                                if (!wf3.C(longValue)) {
                                    ?? obj = new Object();
                                    obj.a = queryFinalized.intValue(1);
                                    obj.c = queryFinalized.intValue(2);
                                    obj.b = queryFinalized.intValue(3);
                                    zh6Var.k(longValue, obj);
                                    if (!wf3.B(longValue)) {
                                        if (wf3.y(longValue)) {
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
                                kf7Var2.p(e, true);
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
                            kf7Var2.V(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        }
                        if (!arrayList.isEmpty()) {
                            kf7Var2.m0(arrayList, arrayList4, false);
                        }
                        if (!arrayList2.isEmpty()) {
                            kf7Var2.R(TextUtils.join(",", arrayList2), arrayList5);
                        }
                        hl.c3(new tw4(kf7Var2, arrayList4, arrayList5, arrayList6, zh6Var, (byte) 27));
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            case 3:
                uc7 messagesController = kf7Var.getMessagesController();
                yac userConfig = messagesController.getUserConfig();
                int i3 = this.c;
                if (userConfig.g(i3)[0] == 2147483647L) {
                    if (i3 == 1) {
                        messagesController.h0 = false;
                        messagesController.B();
                        return;
                    }
                    messagesController.t4(i3);
                    return;
                }
                messagesController.d3(i3, 0, 10, false, new y77(messagesController, i3, (byte) 3));
                return;
            case 4:
                kf7Var.getDownloadController().t(i);
                return;
            default:
                try {
                    SQLiteDatabase sQLiteDatabase3 = kf7Var.b;
                    sQLiteDatabase3.executeFast("DELETE FROM business_replies WHERE topic_id = " + i).stepThis().dispose();
                    sQLiteDatabase3.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
        }
    }
}
