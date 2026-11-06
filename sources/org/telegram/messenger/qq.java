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
    public final int f24956a;
    public final yr f24957b;

    public qq(yr yrVar, int i7) {
        this.f24956a = i7;
        this.f24957b = yrVar;
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
        boolean z9;
        SQLiteCursor sQLiteCursor = null;
        int i7 = 0;
        switch (this.f24956a) {
            case 0:
                yr yrVar = this.f24957b;
                try {
                    yrVar.f26698b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    yrVar.o(e10, true);
                }
                int i10 = yrVar.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52874a;
                g0.h3(new hi.j2(i10, 13));
                return;
            case 1:
                yr yrVar2 = this.f24957b;
                yrVar2.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = qp.s1(yrVar2.currentAccount).f24757d7.getAll();
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
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    try {
                        yrVar2.f26698b.beginTransaction();
                        SQLitePreparedStatement executeFast = yrVar2.f26698b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i7 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i7));
                            executeFast.bindLong(2, ((Long) hVar.n(i7)).longValue());
                            executeFast.step();
                            i7++;
                        }
                        executeFast.dispose();
                        yrVar2.f26698b.commitTransaction();
                        return;
                    } catch (Exception e12) {
                        yrVar2.o(e12, true);
                        return;
                    }
                } catch (Throwable th2) {
                    yrVar2.o(th2, true);
                    return;
                }
            case 2:
                yr yrVar3 = this.f24957b;
                if (yrVar3.Q) {
                    yrVar3.Q = false;
                    qs.f(yrVar3.currentAccount).k(295, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                qs.f(this.f24957b.currentAccount).k(303, new Object[0]);
                return;
            case 4:
                yr yrVar4 = this.f24957b;
                yrVar4.Q = true;
                qs.f(yrVar4.currentAccount).k(295, Boolean.TRUE);
                return;
            case 5:
                yr yrVar5 = this.f24957b;
                yrVar5.Q = false;
                qs.f(yrVar5.currentAccount).k(295, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f24957b.f26698b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 7:
                yr yrVar6 = this.f24957b;
                ArrayList arrayList = yrVar6.getMessagesController().P0;
                int size = arrayList.size();
                while (i7 < size) {
                    ((vo) arrayList.get(i7)).d = ((vo) arrayList.get(i7)).f26067e;
                    i7++;
                }
                yrVar6.K = yrVar6.M;
                yrVar6.L = yrVar6.N;
                return;
            case 8:
                yr yrVar7 = this.f24957b;
                for (int i11 = 0; i11 < 2; i11++) {
                    yrVar7.getUserConfig().x(i11, 0, 0, 0L, 0L, 0L, 0L);
                    yrVar7.getUserConfig().z(i11, 0);
                }
                p10 userConfig = yrVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.P = false;
                p10 userConfig2 = yrVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                yrVar7.getNotificationCenter().k(288, new Object[0]);
                yrVar7.getMediaDataController().E0(false, true, null);
                yrVar7.getNotificationCenter().k(322, new Object[0]);
                yrVar7.getMessagesController().P1().q();
                return;
            case 9:
                this.f24957b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 10:
                this.f24957b.V0(1);
                return;
            case 11:
                yr yrVar8 = this.f24957b;
                yrVar8.getClass();
                try {
                    yrVar8.f26698b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    yrVar8.o(e14, true);
                    return;
                }
            case 12:
                yr yrVar9 = this.f24957b;
                yrVar9.p(true);
                yrVar9.s();
                yrVar9.V0(1);
                g0.h3(new qq(yrVar9, 19));
                return;
            case 13:
                yr yrVar10 = this.f24957b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        queryFinalized = yrVar10.f26698b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (queryFinalized.next()) {
                        long intValue = queryFinalized.intValue(0);
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = intValue;
                        if (queryFinalized.intValue(1) == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        tL_contact.mutual = z9;
                        arrayList2.add(tL_contact);
                        arrayList4.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList4.isEmpty()) {
                        yrVar10.n0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    yrVar10.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    g5 contactsController = yrVar10.getContactsController();
                    contactsController.getClass();
                    g0.h3(new dg(contactsController, arrayList3, 1, arrayList2, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                g5 contactsController2 = yrVar10.getContactsController();
                contactsController2.getClass();
                g0.h3(new dg(contactsController2, arrayList3, 1, arrayList2, 3));
                return;
            case 14:
                this.f24957b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 15:
                yr yrVar11 = this.f24957b;
                yrVar11.getClass();
                try {
                    yrVar11.f26698b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    yrVar11.o(e17, true);
                    return;
                }
            case 16:
                this.f24957b.z0();
                return;
            case 17:
                yr yrVar12 = this.f24957b;
                ArrayList arrayList5 = yrVar12.getMessagesController().P0;
                int size2 = arrayList5.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((vo) arrayList5.get(i12)).d = ((vo) arrayList5.get(i12)).f26067e;
                }
                yrVar12.K = yrVar12.M;
                yrVar12.L = yrVar12.N;
                qs notificationCenter = yrVar12.getNotificationCenter();
                int i13 = qp.C8;
                notificationCenter.k(2, 256);
                return;
            case 18:
                yr yrVar13 = this.f24957b;
                yrVar13.getClass();
                try {
                    yrVar13.f26698b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    yrVar13.o(e18, true);
                    return;
                }
            case 19:
                yr yrVar14 = this.f24957b;
                yrVar14.getNotificationCenter().k(322, new Object[0]);
                yrVar14.getNotificationCenter().k(288, new Object[0]);
                yrVar14.getMessagesController().G1().a();
                return;
            case 20:
                this.f24957b.getMessagesController().G1().a();
                return;
            case 21:
                yr yrVar15 = this.f24957b;
                try {
                    try {
                        sQLiteCursor = yrVar15.f26698b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        g0.h3(new k(5, arrayList6));
                    } catch (Exception e19) {
                        yrVar15.o(e19, true);
                        if (sQLiteCursor == null) {
                            return;
                        }
                    }
                    sQLiteCursor.dispose();
                    return;
                } catch (Throwable th5) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th5;
                }
            case 22:
                this.f24957b.D0();
                return;
            case 23:
                this.f24957b.getNotificationCenter().k(322, new Object[0]);
                return;
            case 24:
                yr yrVar16 = this.f24957b;
                ArrayList arrayList7 = yrVar16.getMessagesController().P0;
                int size3 = arrayList7.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    ((vo) arrayList7.get(i14)).d = ((vo) arrayList7.get(i14)).f26067e;
                }
                yrVar16.K = yrVar16.M;
                yrVar16.L = yrVar16.N;
                qs notificationCenter2 = yrVar16.getNotificationCenter();
                int i15 = qp.C8;
                notificationCenter2.k(2, 256);
                return;
            case 25:
                this.f24957b.t1(true);
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                this.f24957b.getMessagesController().X0();
                return;
            default:
                this.f24957b.C0();
                return;
        }
    }
}
