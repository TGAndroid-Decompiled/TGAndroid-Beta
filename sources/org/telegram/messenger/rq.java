package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class rq implements Runnable {
    public final int f25320a;
    public final yr f25321b;

    public rq(yr yrVar, int i7) {
        this.f25320a = i7;
        this.f25321b = yrVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rq.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rq.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z9;
        SQLiteCursor sQLiteCursor = null;
        int i7 = 0;
        switch (this.f25320a) {
            case 0:
                yr yrVar = this.f25321b;
                try {
                    yrVar.f26721b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    yrVar.o(e10, true);
                }
                int i10 = yrVar.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f52929a;
                g0.h3(new hi.j2(i10, 13));
                return;
            case 1:
                yr yrVar2 = this.f25321b;
                yrVar2.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = qp.s1(yrVar2.currentAccount).f24764d7.getAll();
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
                        yrVar2.f26721b.beginTransaction();
                        SQLitePreparedStatement executeFast = yrVar2.f26721b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i7 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i7));
                            executeFast.bindLong(2, ((Long) hVar.n(i7)).longValue());
                            executeFast.step();
                            i7++;
                        }
                        executeFast.dispose();
                        yrVar2.f26721b.commitTransaction();
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
                yr yrVar3 = this.f25321b;
                if (yrVar3.Q) {
                    yrVar3.Q = false;
                    qs.f(yrVar3.currentAccount).k(295, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                qs.f(this.f25321b.currentAccount).k(303, new Object[0]);
                return;
            case 4:
                yr yrVar4 = this.f25321b;
                yrVar4.Q = true;
                qs.f(yrVar4.currentAccount).k(295, Boolean.TRUE);
                return;
            case 5:
                yr yrVar5 = this.f25321b;
                yrVar5.Q = false;
                qs.f(yrVar5.currentAccount).k(295, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f25321b.f26721b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 7:
                yr yrVar6 = this.f25321b;
                ArrayList arrayList = yrVar6.getMessagesController().P0;
                int size = arrayList.size();
                while (i7 < size) {
                    ((vo) arrayList.get(i7)).d = ((vo) arrayList.get(i7)).f26073e;
                    i7++;
                }
                yrVar6.K = yrVar6.M;
                yrVar6.L = yrVar6.N;
                return;
            case 8:
                this.f25321b.V0(1);
                return;
            case 9:
                yr yrVar7 = this.f25321b;
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
            case 10:
                this.f25321b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 11:
                yr yrVar8 = this.f25321b;
                yrVar8.getClass();
                try {
                    yrVar8.f26721b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    yrVar8.o(e14, true);
                    return;
                }
            case 12:
                yr yrVar9 = this.f25321b;
                yrVar9.p(true);
                yrVar9.s();
                yrVar9.V0(1);
                g0.h3(new rq(yrVar9, 19));
                return;
            case 13:
                this.f25321b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 14:
                yr yrVar10 = this.f25321b;
                yrVar10.getClass();
                try {
                    yrVar10.f26721b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    yrVar10.o(e15, true);
                    return;
                }
            case 15:
                this.f25321b.z0();
                return;
            case 16:
                yr yrVar11 = this.f25321b;
                ArrayList arrayList2 = yrVar11.getMessagesController().P0;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((vo) arrayList2.get(i12)).d = ((vo) arrayList2.get(i12)).f26073e;
                }
                yrVar11.K = yrVar11.M;
                yrVar11.L = yrVar11.N;
                qs notificationCenter = yrVar11.getNotificationCenter();
                int i13 = qp.C8;
                notificationCenter.k(2, 256);
                return;
            case 17:
                yr yrVar12 = this.f25321b;
                yrVar12.getClass();
                try {
                    yrVar12.f26721b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    yrVar12.o(e16, true);
                    return;
                }
            case 18:
                yr yrVar13 = this.f25321b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    try {
                        queryFinalized = yrVar13.f26721b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e17) {
                        e = e17;
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
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        tL_contact.mutual = z9;
                        arrayList3.add(tL_contact);
                        arrayList5.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList5.isEmpty()) {
                        yrVar13.n0(arrayList5, arrayList4, false);
                    }
                } catch (Exception e18) {
                    e = e18;
                    sQLiteCursor = queryFinalized;
                    arrayList3.clear();
                    arrayList4.clear();
                    yrVar13.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    g5 contactsController = yrVar13.getContactsController();
                    contactsController.getClass();
                    g0.h3(new dg(contactsController, arrayList4, 1, arrayList3, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                g5 contactsController2 = yrVar13.getContactsController();
                contactsController2.getClass();
                g0.h3(new dg(contactsController2, arrayList4, 1, arrayList3, 3));
                return;
            case 19:
                yr yrVar14 = this.f25321b;
                yrVar14.getNotificationCenter().k(322, new Object[0]);
                yrVar14.getNotificationCenter().k(288, new Object[0]);
                yrVar14.getMessagesController().G1().a();
                return;
            case 20:
                this.f25321b.getMessagesController().G1().a();
                return;
            case 21:
                yr yrVar15 = this.f25321b;
                try {
                    try {
                        sQLiteCursor = yrVar15.f26721b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                this.f25321b.D0();
                return;
            case 23:
                this.f25321b.C0();
                return;
            case 24:
                this.f25321b.getNotificationCenter().k(322, new Object[0]);
                return;
            case 25:
                yr yrVar16 = this.f25321b;
                ArrayList arrayList7 = yrVar16.getMessagesController().P0;
                int size3 = arrayList7.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    ((vo) arrayList7.get(i14)).d = ((vo) arrayList7.get(i14)).f26073e;
                }
                yrVar16.K = yrVar16.M;
                yrVar16.L = yrVar16.N;
                qs notificationCenter2 = yrVar16.getNotificationCenter();
                int i15 = qp.C8;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                this.f25321b.t1(true);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                this.f25321b.getMessagesController().X0();
                return;
        }
    }
}
