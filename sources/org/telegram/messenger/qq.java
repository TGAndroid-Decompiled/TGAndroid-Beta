package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class qq implements Runnable {
    public final int f26460a;
    public final ur f26461b;

    public qq(ur urVar, int i7) {
        this.f26460a = i7;
        this.f26461b = urVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qq.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.qq.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        int i7 = 0;
        switch (this.f26460a) {
            case 0:
                ur urVar = this.f26461b;
                urVar.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = np.u1(urVar.currentAccount).f25821g7.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num2 = (Integer) entry.getValue();
                            if (num2.intValue() != 2 && num2.intValue() != 3) {
                            }
                            String replace = key.replace("notify2_", "");
                            long j3 = 1;
                            if (num2.intValue() != 2) {
                                if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                    j3 = 1 | (num.intValue() << 32);
                                }
                            }
                            try {
                                hVar.k(Long.valueOf(j3), Long.parseLong(replace));
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    try {
                        urVar.f27216b.beginTransaction();
                        SQLitePreparedStatement executeFast = urVar.f27216b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i7 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i7));
                            executeFast.bindLong(2, ((Long) hVar.n(i7)).longValue());
                            executeFast.step();
                            i7++;
                        }
                        executeFast.dispose();
                        urVar.f27216b.commitTransaction();
                        return;
                    } catch (Exception e11) {
                        urVar.o(e11, true);
                        return;
                    }
                } catch (Throwable th2) {
                    urVar.o(th2, true);
                    return;
                }
            case 1:
                ur urVar2 = this.f26461b;
                try {
                    urVar2.f27216b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e12) {
                    urVar2.o(e12, true);
                }
                int i10 = urVar2.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54856a;
                g0.g3(new jg.x(i10, 14));
                return;
            case 2:
                ur urVar3 = this.f26461b;
                if (urVar3.R) {
                    urVar3.R = false;
                    ls.f(urVar3.currentAccount).k(298, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                ls.f(this.f26461b.currentAccount).k(306, new Object[0]);
                return;
            case 4:
                ur urVar4 = this.f26461b;
                urVar4.R = true;
                ls.f(urVar4.currentAccount).k(298, Boolean.TRUE);
                return;
            case 5:
                ur urVar5 = this.f26461b;
                urVar5.R = false;
                ls.f(urVar5.currentAccount).k(298, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f26461b.f27216b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 7:
                ur urVar6 = this.f26461b;
                ArrayList arrayList = urVar6.getMessagesController().Q0;
                int size = arrayList.size();
                while (i7 < size) {
                    ((so) arrayList.get(i7)).d = ((so) arrayList.get(i7)).f26853e;
                    i7++;
                }
                urVar6.L = urVar6.N;
                urVar6.M = urVar6.O;
                return;
            case 8:
                this.f26461b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 9:
                this.f26461b.V0(1);
                return;
            case 10:
                ur urVar7 = this.f26461b;
                for (int i11 = 0; i11 < 2; i11++) {
                    urVar7.getUserConfig().x(i11, 0, 0, 0L, 0L, 0L, 0L);
                    urVar7.getUserConfig().z(i11, 0);
                }
                k10 userConfig = urVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                k10 userConfig2 = urVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                urVar7.getNotificationCenter().k(291, new Object[0]);
                urVar7.getMediaDataController().H0(false, true, null);
                urVar7.getNotificationCenter().k(325, new Object[0]);
                urVar7.getMessagesController().R1().q();
                return;
            case 11:
                ur urVar8 = this.f26461b;
                urVar8.getClass();
                try {
                    urVar8.f27216b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    urVar8.o(e14, true);
                    return;
                }
            case 12:
                ur urVar9 = this.f26461b;
                urVar9.p(true);
                urVar9.s();
                urVar9.V0(1);
                g0.g3(new qq(urVar9, 20));
                return;
            case 13:
                this.f26461b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 14:
                ur urVar10 = this.f26461b;
                urVar10.getClass();
                try {
                    urVar10.f27216b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    urVar10.o(e15, true);
                    return;
                }
            case 15:
                ur urVar11 = this.f26461b;
                ArrayList arrayList2 = urVar11.getMessagesController().Q0;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((so) arrayList2.get(i12)).d = ((so) arrayList2.get(i12)).f26853e;
                }
                urVar11.L = urVar11.N;
                urVar11.M = urVar11.O;
                ls notificationCenter = urVar11.getNotificationCenter();
                int i13 = np.I8;
                notificationCenter.k(2, 256);
                return;
            case 16:
                this.f26461b.z0();
                return;
            case 17:
                this.f26461b.getMessagesController().I1().a();
                return;
            case 18:
                ur urVar12 = this.f26461b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    try {
                        queryFinalized = urVar12.f27216b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e16) {
                        e = e16;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (queryFinalized.next()) {
                        long intValue = queryFinalized.intValue(0);
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = intValue;
                        if (queryFinalized.intValue(1) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        tL_contact.mutual = z10;
                        arrayList3.add(tL_contact);
                        arrayList5.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        urVar12.n0(arrayList5, arrayList4, false);
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor = queryFinalized;
                    arrayList3.clear();
                    arrayList4.clear();
                    urVar12.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    i5 contactsController = urVar12.getContactsController();
                    contactsController.getClass();
                    g0.g3(new eg(contactsController, arrayList4, 1, arrayList3, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                i5 contactsController2 = urVar12.getContactsController();
                contactsController2.getClass();
                g0.g3(new eg(contactsController2, arrayList4, 1, arrayList3, 3));
                return;
            case 19:
                ur urVar13 = this.f26461b;
                urVar13.getClass();
                try {
                    urVar13.f27216b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    urVar13.o(e18, true);
                    return;
                }
            case 20:
                ur urVar14 = this.f26461b;
                urVar14.getNotificationCenter().k(325, new Object[0]);
                urVar14.getNotificationCenter().k(291, new Object[0]);
                urVar14.getMessagesController().I1().a();
                return;
            case 21:
                this.f26461b.D0();
                return;
            case 22:
                this.f26461b.C0();
                return;
            case 23:
                ur urVar15 = this.f26461b;
                try {
                    try {
                        sQLiteCursor = urVar15.f27216b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        g0.g3(new k(5, arrayList6));
                    } catch (Throwable th5) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th5;
                    }
                } catch (Exception e19) {
                    urVar15.o(e19, true);
                    if (sQLiteCursor == null) {
                        return;
                    }
                }
                sQLiteCursor.dispose();
                return;
            case 24:
                this.f26461b.getNotificationCenter().k(325, new Object[0]);
                return;
            case 25:
                ur urVar16 = this.f26461b;
                ArrayList arrayList7 = urVar16.getMessagesController().Q0;
                int size3 = arrayList7.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    ((so) arrayList7.get(i14)).d = ((so) arrayList7.get(i14)).f26853e;
                }
                urVar16.L = urVar16.N;
                urVar16.M = urVar16.O;
                ls notificationCenter2 = urVar16.getNotificationCenter();
                int i15 = np.I8;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                this.f26461b.t1(true);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                this.f26461b.getMessagesController().Z0();
                return;
        }
    }
}
