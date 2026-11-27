package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class hd7 implements Runnable {
    public final byte a;
    public final kf7 b;

    public hd7(kf7 kf7Var, byte b) {
        this.a = b;
        this.b = kf7Var;
    }

    private final void a() {
        kf7 kf7Var;
        int i = 0;
        while (true) {
            kf7Var = this.b;
            if (i >= 2) {
                break;
            }
            kf7Var.getUserConfig().w(i, 0, 0, 0L, 0L, 0L, 0L);
            kf7Var.getUserConfig().y(i, 0);
            i++;
        }
        yac userConfig = kf7Var.getUserConfig();
        userConfig.j().edit().remove("filtersLoaded").apply();
        userConfig.Q = false;
        yac userConfig2 = kf7Var.getUserConfig();
        SharedPreferences.Editor edit = userConfig2.j().edit();
        for (String str : userConfig2.j().getAll().keySet()) {
            if (str.startsWith("2pinnedDialogsLoaded")) {
                edit.remove(str);
            }
        }
        edit.apply();
        kf7Var.getNotificationCenter().k(jn7.O4, new Object[0]);
        kf7Var.getMediaDataController().G0(false, true, null);
        kf7Var.getNotificationCenter().k(jn7.w5, new Object[0]);
        kf7Var.getMessagesController().O1().p();
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd7.b():void");
    }

    private final void c() {
        kf7 kf7Var = this.b;
        try {
            kf7Var.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
        } catch (Exception e) {
            kf7Var.p(e, true);
        }
    }

    private final void d() {
        kf7 kf7Var = this.b;
        try {
            kf7Var.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
        } catch (Exception e) {
            kf7Var.p(e, true);
        }
    }

    private final void e() {
        kf7 kf7Var = this.b;
        kf7Var.q(true);
        kf7Var.t();
        kf7Var.W0(1);
        hl.c3(new hd7(kf7Var, (byte) 22));
    }

    private final void f() {
        Throwable th;
        SQLiteCursor queryFinalized;
        boolean z;
        kf7 kf7Var = this.b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = kf7Var.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            while (queryFinalized.next()) {
                TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                tL_contact.user_id = queryFinalized.intValue(0);
                if (queryFinalized.intValue(1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                tL_contact.mutual = z;
                arrayList.add(tL_contact);
                arrayList3.add(Long.valueOf(tL_contact.user_id));
            }
            queryFinalized.dispose();
            if (!arrayList3.isEmpty()) {
                kf7Var.m0(arrayList3, arrayList2, false);
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteCursor = queryFinalized;
            arrayList.clear();
            arrayList2.clear();
            kf7Var.p(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            lv2 contactsController = kf7Var.getContactsController();
            contactsController.getClass();
            hl.c3(new av2(contactsController, arrayList2, 1, arrayList, (byte) 0));
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        lv2 contactsController2 = kf7Var.getContactsController();
        contactsController2.getClass();
        hl.c3(new av2(contactsController2, arrayList2, 1, arrayList, (byte) 0));
    }

    private final void g() {
        kf7 kf7Var = this.b;
        ArrayList arrayList = kf7Var.getMessagesController().G0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ac7) arrayList.get(i)).d = ((ac7) arrayList.get(i)).e;
        }
        kf7Var.L = kf7Var.N;
        kf7Var.M = kf7Var.O;
        jn7 notificationCenter = kf7Var.getNotificationCenter();
        int i2 = uc7.s5;
        notificationCenter.k(2, 256);
    }

    private final void h() {
        kf7 kf7Var = this.b;
        if (kf7Var.X == null && !kf7Var.a0) {
            kf7Var.Y = 0;
            kf7Var.F1(15000L);
        }
    }

    private final void i() {
        kf7 kf7Var = this.b;
        kf7Var.getNotificationCenter().k(jn7.w5, new Object[0]);
        kf7Var.getNotificationCenter().k(jn7.O4, new Object[0]);
        kf7Var.getMessagesController().F1().a();
    }

    private final void j() {
        kf7 kf7Var = this.b;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = kf7Var.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                ArrayList arrayList = new ArrayList();
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.WallPaper TLdeserialize = TLRPC.WallPaper.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize != null) {
                            arrayList.add(TLdeserialize);
                        }
                    }
                }
                hl.c3(new se(arrayList, (byte) 7));
                sQLiteCursor.dispose();
            } catch (Exception e) {
                kf7Var.p(e, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void k() {
        this.b.C0();
    }

    private final void l() {
        this.b.getNotificationCenter().k(jn7.w5, new Object[0]);
    }

    private final void m() {
        kf7 kf7Var = this.b;
        ArrayList arrayList = kf7Var.getMessagesController().G0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ac7) arrayList.get(i)).d = ((ac7) arrayList.get(i)).e;
        }
        kf7Var.L = kf7Var.N;
        kf7Var.M = kf7Var.O;
        jn7 notificationCenter = kf7Var.getNotificationCenter();
        int i2 = uc7.s5;
        notificationCenter.k(2, 256);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd7.run():void");
    }
}
