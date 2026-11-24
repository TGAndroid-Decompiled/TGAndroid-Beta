package defpackage;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class xd7 implements Runnable {
    public final byte a;
    public final cf7 b;

    public xd7(cf7 cf7Var, byte b) {
        this.a = b;
        this.b = cf7Var;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd7.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd7.b():void");
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
                cf7 cf7Var = this.b;
                try {
                    vh6 vh6Var = new vh6();
                    Map<String, ?> all = oc7.r1(cf7Var.currentAccount).W3.getAll();
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
                                    vh6Var.k(Long.valueOf(j), Long.parseLong(replace));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    try {
                        cf7Var.b.beginTransaction();
                        SQLitePreparedStatement executeFast = cf7Var.b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i < vh6Var.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, vh6Var.j(i));
                            executeFast.bindLong(2, ((Long) vh6Var.n(i)).longValue());
                            executeFast.step();
                            i++;
                        }
                        executeFast.dispose();
                        cf7Var.b.commitTransaction();
                        return;
                    } catch (Exception e2) {
                        cf7Var.n(e2, true);
                        return;
                    }
                } catch (Throwable th) {
                    cf7Var.n(th, true);
                    return;
                }
            case 1:
                cf7 cf7Var2 = this.b;
                try {
                    cf7Var2.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e3) {
                    cf7Var2.n(e3, true);
                }
                int i2 = cf7Var2.currentAccount;
                ConcurrentHashMap concurrentHashMap = wxc.a;
                gm.c3(new fx0(i2, (byte) 14));
                return;
            case 2:
                cf7 cf7Var3 = this.b;
                if (cf7Var3.R) {
                    cf7Var3.R = false;
                    nm7.f(cf7Var3.currentAccount).k(300, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                nm7.f(this.b.currentAccount).k(308, new Object[0]);
                return;
            case 4:
                cf7 cf7Var4 = this.b;
                cf7Var4.R = true;
                nm7.f(cf7Var4.currentAccount).k(300, Boolean.TRUE);
                return;
            case 5:
                cf7 cf7Var5 = this.b;
                cf7Var5.R = false;
                nm7.f(cf7Var5.currentAccount).k(300, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.b.b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e4) {
                    fc4.g(e4, true);
                    return;
                }
            case 7:
                cf7 cf7Var6 = this.b;
                ArrayList arrayList = cf7Var6.getMessagesController().G0;
                int size = arrayList.size();
                while (i < size) {
                    ((ub7) arrayList.get(i)).d = ((ub7) arrayList.get(i)).e;
                    i++;
                }
                cf7Var6.L = cf7Var6.N;
                cf7Var6.M = cf7Var6.O;
                return;
            case 8:
                this.b.getNotificationCenter().k(79, new Object[0]);
                return;
            case 9:
                this.b.S0(1);
                return;
            case 10:
                cf7 cf7Var7 = this.b;
                for (int i3 = 0; i3 < 2; i3++) {
                    cf7Var7.getUserConfig().w(i3, 0, 0, 0L, 0L, 0L, 0L);
                    cf7Var7.getUserConfig().y(i3, 0);
                }
                z8c userConfig = cf7Var7.getUserConfig();
                userConfig.j().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                z8c userConfig2 = cf7Var7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.j().edit();
                for (String str : userConfig2.j().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                cf7Var7.getNotificationCenter().k(293, new Object[0]);
                cf7Var7.getMediaDataController().G0(false, true, null);
                cf7Var7.getNotificationCenter().k(327, new Object[0]);
                cf7Var7.getMessagesController().N1().p();
                return;
            case 11:
                cf7 cf7Var8 = this.b;
                try {
                    cf7Var8.b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e5) {
                    cf7Var8.n(e5, true);
                    return;
                }
            case 12:
                cf7 cf7Var9 = this.b;
                cf7Var9.o(true);
                cf7Var9.r();
                cf7Var9.S0(1);
                gm.c3(new xd7(cf7Var9, (byte) 20));
                return;
            case 13:
                this.b.getNotificationCenter().k(122, new Object[0]);
                return;
            case 14:
                cf7 cf7Var10 = this.b;
                try {
                    cf7Var10.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e6) {
                    cf7Var10.n(e6, true);
                    return;
                }
            case 15:
                cf7 cf7Var11 = this.b;
                ArrayList arrayList2 = cf7Var11.getMessagesController().G0;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((ub7) arrayList2.get(i4)).d = ((ub7) arrayList2.get(i4)).e;
                }
                cf7Var11.L = cf7Var11.N;
                cf7Var11.M = cf7Var11.O;
                nm7 notificationCenter = cf7Var11.getNotificationCenter();
                int i5 = oc7.s5;
                notificationCenter.k(2, 256);
                return;
            case 16:
                this.b.w0();
                return;
            case 17:
                this.b.getMessagesController().E1().a();
                return;
            case 18:
                cf7 cf7Var12 = this.b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    try {
                        queryFinalized = cf7Var12.b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (queryFinalized.next()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = queryFinalized.intValue(0);
                        if (queryFinalized.intValue(1) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        tL_contact.mutual = z;
                        arrayList3.add(tL_contact);
                        arrayList5.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        cf7Var12.k0(arrayList5, arrayList4, false);
                    }
                } catch (Exception e8) {
                    e = e8;
                    sQLiteCursor = queryFinalized;
                    arrayList3.clear();
                    arrayList4.clear();
                    cf7Var12.n(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    bw2 contactsController = cf7Var12.getContactsController();
                    contactsController.getClass();
                    gm.c3(new sv2(contactsController, arrayList4, 1, arrayList3, (byte) 0));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                bw2 contactsController2 = cf7Var12.getContactsController();
                contactsController2.getClass();
                gm.c3(new sv2(contactsController2, arrayList4, 1, arrayList3, (byte) 0));
                return;
            case 19:
                cf7 cf7Var13 = this.b;
                try {
                    cf7Var13.b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    cf7Var13.n(e9, true);
                    return;
                }
            case 20:
                cf7 cf7Var14 = this.b;
                cf7Var14.getNotificationCenter().k(327, new Object[0]);
                cf7Var14.getNotificationCenter().k(293, new Object[0]);
                cf7Var14.getMessagesController().E1().a();
                return;
            case 21:
                this.b.A0();
                return;
            case 22:
                this.b.z0();
                return;
            case 23:
                cf7 cf7Var15 = this.b;
                try {
                    try {
                        sQLiteCursor = cf7Var15.b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        gm.c3(new sf(arrayList6, (byte) 7));
                    } catch (Exception e10) {
                        cf7Var15.n(e10, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th4) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th4;
                }
            case 24:
                this.b.getNotificationCenter().k(327, new Object[0]);
                return;
            case 25:
                cf7 cf7Var16 = this.b;
                ArrayList arrayList7 = cf7Var16.getMessagesController().G0;
                int size3 = arrayList7.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ((ub7) arrayList7.get(i6)).d = ((ub7) arrayList7.get(i6)).e;
                }
                cf7Var16.L = cf7Var16.N;
                cf7Var16.M = cf7Var16.O;
                nm7 notificationCenter2 = cf7Var16.getNotificationCenter();
                int i7 = oc7.s5;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                this.b.q1(true);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                this.b.getMessagesController().W0();
                return;
        }
    }
}
