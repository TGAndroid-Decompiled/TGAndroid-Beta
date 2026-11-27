package defpackage;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class be7 implements Runnable {
    public final byte a;
    public final jf7 b;

    public be7(jf7 jf7Var, byte b) {
        this.a = b;
        this.b = jf7Var;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be7.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be7.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z;
        SQLiteCursor sQLiteCursor = null;
        int i = 0;
        switch (this.a) {
            case 0:
                jf7 jf7Var = this.b;
                try {
                    zh6 zh6Var = new zh6();
                    Map<String, ?> all = uc7.s1(jf7Var.currentAccount).W3.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num2 = (Integer) entry.getValue();
                            if (num2.intValue() == 2 || num2.intValue() == 3) {
                                String replace = key.replace("notify2_", "");
                                long j = 1;
                                if (num2.intValue() != 2) {
                                    if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                        j = 1 | (num.intValue() << 32);
                                    }
                                }
                                try {
                                    zh6Var.k(Long.parseLong(replace), Long.valueOf(j));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    try {
                        jf7Var.b.beginTransaction();
                        SQLitePreparedStatement executeFast = jf7Var.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i < zh6Var.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, zh6Var.j(i));
                            executeFast.bindLong(2, ((Long) zh6Var.n(i)).longValue());
                            executeFast.step();
                            i++;
                        }
                        executeFast.dispose();
                        jf7Var.b.commitTransaction();
                        return;
                    } catch (Exception e2) {
                        jf7Var.n(e2, true);
                        return;
                    }
                } catch (Throwable th) {
                    jf7Var.n(th, true);
                    return;
                }
            case 1:
                jf7 jf7Var2 = this.b;
                try {
                    jf7Var2.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e3) {
                    jf7Var2.n(e3, true);
                }
                int i2 = jf7Var2.currentAccount;
                ConcurrentHashMap concurrentHashMap = k0d.a;
                hl.c3(new gw0(i2, (byte) 18));
                return;
            case 2:
                jf7 jf7Var3 = this.b;
                if (jf7Var3.R) {
                    jf7Var3.R = false;
                    jn7.f(jf7Var3.currentAccount).k(299, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                jn7.f(this.b.currentAccount).k(307, new Object[0]);
                return;
            case 4:
                jf7 jf7Var4 = this.b;
                jf7Var4.R = true;
                jn7.f(jf7Var4.currentAccount).k(299, Boolean.TRUE);
                return;
            case 5:
                jf7 jf7Var5 = this.b;
                jf7Var5.R = false;
                jn7.f(jf7Var5.currentAccount).k(299, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.b.b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
            case 7:
                jf7 jf7Var6 = this.b;
                ArrayList arrayList = jf7Var6.getMessagesController().G0;
                int size = arrayList.size();
                while (i < size) {
                    ((ac7) arrayList.get(i)).d = ((ac7) arrayList.get(i)).e;
                    i++;
                }
                jf7Var6.L = jf7Var6.N;
                jf7Var6.M = jf7Var6.O;
                return;
            case 8:
                this.b.getNotificationCenter().k(79, new Object[0]);
                return;
            case 9:
                jf7 jf7Var7 = this.b;
                for (int i3 = 0; i3 < 2; i3++) {
                    jf7Var7.getUserConfig().w(i3, 0, 0, 0L, 0L, 0L, 0L);
                    jf7Var7.getUserConfig().y(i3, 0);
                }
                yac userConfig = jf7Var7.getUserConfig();
                userConfig.j().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                yac userConfig2 = jf7Var7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.j().edit();
                for (String str : userConfig2.j().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                jf7Var7.getNotificationCenter().k(292, new Object[0]);
                jf7Var7.getMediaDataController().G0(false, true, null);
                jf7Var7.getNotificationCenter().k(326, new Object[0]);
                jf7Var7.getMessagesController().O1().p();
                return;
            case 10:
                this.b.q1(true);
                return;
            case 11:
                jf7 jf7Var8 = this.b;
                try {
                    jf7Var8.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e5) {
                    jf7Var8.n(e5, true);
                    return;
                }
            case 12:
                this.b.getNotificationCenter().k(122, new Object[0]);
                return;
            case 13:
                jf7 jf7Var9 = this.b;
                try {
                    jf7Var9.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e6) {
                    jf7Var9.n(e6, true);
                    return;
                }
            case 14:
                jf7 jf7Var10 = this.b;
                try {
                    jf7Var10.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e7) {
                    jf7Var10.n(e7, true);
                    return;
                }
            case 15:
                jf7 jf7Var11 = this.b;
                jf7Var11.o(true);
                jf7Var11.r();
                jf7Var11.S0(1);
                hl.c3(new be7(jf7Var11, (byte) 20));
                return;
            case 16:
                jf7 jf7Var12 = this.b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        queryFinalized = jf7Var12.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e8) {
                        e = e8;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (queryFinalized.next()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = queryFinalized.intValue(0);
                        if (queryFinalized.intValue(1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        tL_contact.mutual = z;
                        arrayList2.add(tL_contact);
                        arrayList4.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList4.isEmpty()) {
                        jf7Var12.k0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e9) {
                    e = e9;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    jf7Var12.n(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    lv2 contactsController = jf7Var12.getContactsController();
                    contactsController.getClass();
                    hl.c3(new av2(contactsController, arrayList3, 1, arrayList2, (byte) 0));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                lv2 contactsController2 = jf7Var12.getContactsController();
                contactsController2.getClass();
                hl.c3(new av2(contactsController2, arrayList3, 1, arrayList2, (byte) 0));
                return;
            case 17:
                jf7 jf7Var13 = this.b;
                ArrayList arrayList5 = jf7Var13.getMessagesController().G0;
                int size2 = arrayList5.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((ac7) arrayList5.get(i4)).d = ((ac7) arrayList5.get(i4)).e;
                }
                jf7Var13.L = jf7Var13.N;
                jf7Var13.M = jf7Var13.O;
                jn7 notificationCenter = jf7Var13.getNotificationCenter();
                int i5 = uc7.r5;
                notificationCenter.k(2, 256);
                return;
            case 18:
                this.b.w0();
                return;
            case 19:
                this.b.getMessagesController().F1().a();
                return;
            case 20:
                jf7 jf7Var14 = this.b;
                jf7Var14.getNotificationCenter().k(326, new Object[0]);
                jf7Var14.getNotificationCenter().k(292, new Object[0]);
                jf7Var14.getMessagesController().F1().a();
                return;
            case 21:
                this.b.A0();
                return;
            case 22:
                this.b.z0();
                return;
            case 23:
                this.b.getNotificationCenter().k(326, new Object[0]);
                return;
            case 24:
                jf7 jf7Var15 = this.b;
                try {
                    try {
                        sQLiteCursor = jf7Var15.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
                        ArrayList arrayList6 = new ArrayList();
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.WallPaper TLdeserialize = TLRPC.WallPaper.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    arrayList6.add(TLdeserialize);
                                }
                            }
                        }
                        hl.c3(new se(arrayList6, (byte) 6));
                    } catch (Throwable th4) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th4;
                    }
                } catch (Exception e10) {
                    jf7Var15.n(e10, true);
                    if (sQLiteCursor == null) {
                        return;
                    }
                }
                sQLiteCursor.dispose();
                return;
            case 25:
                jf7 jf7Var16 = this.b;
                ArrayList arrayList7 = jf7Var16.getMessagesController().G0;
                int size3 = arrayList7.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ((ac7) arrayList7.get(i6)).d = ((ac7) arrayList7.get(i6)).e;
                }
                jf7Var16.L = jf7Var16.N;
                jf7Var16.M = jf7Var16.O;
                jn7 notificationCenter2 = jf7Var16.getNotificationCenter();
                int i7 = uc7.r5;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                this.b.getMessagesController().X0();
                return;
            default:
                this.b.S0(1);
                return;
        }
    }
}
