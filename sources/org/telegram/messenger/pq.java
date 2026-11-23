package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class pq implements Runnable {
    public final int f26381a;
    public final tr f26382b;

    public pq(tr trVar, int i7) {
        this.f26381a = i7;
        this.f26382b = trVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pq.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pq.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        int i7 = 0;
        switch (this.f26381a) {
            case 0:
                tr trVar = this.f26382b;
                trVar.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = mp.u1(trVar.currentAccount).f25753g7.getAll();
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
                        trVar.f27151b.beginTransaction();
                        SQLitePreparedStatement executeFast = trVar.f27151b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i7 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i7));
                            executeFast.bindLong(2, ((Long) hVar.n(i7)).longValue());
                            executeFast.step();
                            i7++;
                        }
                        executeFast.dispose();
                        trVar.f27151b.commitTransaction();
                        return;
                    } catch (Exception e11) {
                        trVar.o(e11, true);
                        return;
                    }
                } catch (Throwable th2) {
                    trVar.o(th2, true);
                    return;
                }
            case 1:
                tr trVar2 = this.f26382b;
                try {
                    trVar2.f27151b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e12) {
                    trVar2.o(e12, true);
                }
                int i10 = trVar2.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54972a;
                g0.g3(new jg.x(i10, 14));
                return;
            case 2:
                tr trVar3 = this.f26382b;
                if (trVar3.R) {
                    trVar3.R = false;
                    ks.f(trVar3.currentAccount).k(298, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                ks.f(this.f26382b.currentAccount).k(306, new Object[0]);
                return;
            case 4:
                tr trVar4 = this.f26382b;
                trVar4.R = true;
                ks.f(trVar4.currentAccount).k(298, Boolean.TRUE);
                return;
            case 5:
                tr trVar5 = this.f26382b;
                trVar5.R = false;
                ks.f(trVar5.currentAccount).k(298, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f26382b.f27151b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 7:
                tr trVar6 = this.f26382b;
                ArrayList arrayList = trVar6.getMessagesController().Q0;
                int size = arrayList.size();
                while (i7 < size) {
                    ((ro) arrayList.get(i7)).d = ((ro) arrayList.get(i7)).f26776e;
                    i7++;
                }
                trVar6.L = trVar6.N;
                trVar6.M = trVar6.O;
                return;
            case 8:
                this.f26382b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 9:
                this.f26382b.V0(1);
                return;
            case 10:
                tr trVar7 = this.f26382b;
                for (int i11 = 0; i11 < 2; i11++) {
                    trVar7.getUserConfig().x(i11, 0, 0, 0L, 0L, 0L, 0L);
                    trVar7.getUserConfig().z(i11, 0);
                }
                i10 userConfig = trVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                i10 userConfig2 = trVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                trVar7.getNotificationCenter().k(291, new Object[0]);
                trVar7.getMediaDataController().H0(false, true, null);
                trVar7.getNotificationCenter().k(325, new Object[0]);
                trVar7.getMessagesController().R1().q();
                return;
            case 11:
                tr trVar8 = this.f26382b;
                trVar8.getClass();
                try {
                    trVar8.f27151b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    trVar8.o(e14, true);
                    return;
                }
            case 12:
                tr trVar9 = this.f26382b;
                trVar9.p(true);
                trVar9.s();
                trVar9.V0(1);
                g0.g3(new pq(trVar9, 20));
                return;
            case 13:
                this.f26382b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 14:
                tr trVar10 = this.f26382b;
                trVar10.getClass();
                try {
                    trVar10.f27151b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    trVar10.o(e15, true);
                    return;
                }
            case 15:
                tr trVar11 = this.f26382b;
                ArrayList arrayList2 = trVar11.getMessagesController().Q0;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((ro) arrayList2.get(i12)).d = ((ro) arrayList2.get(i12)).f26776e;
                }
                trVar11.L = trVar11.N;
                trVar11.M = trVar11.O;
                ks notificationCenter = trVar11.getNotificationCenter();
                int i13 = mp.I8;
                notificationCenter.k(2, 256);
                return;
            case 16:
                this.f26382b.z0();
                return;
            case 17:
                this.f26382b.getMessagesController().I1().a();
                return;
            case 18:
                tr trVar12 = this.f26382b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    try {
                        queryFinalized = trVar12.f27151b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
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
                        trVar12.n0(arrayList5, arrayList4, false);
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor = queryFinalized;
                    arrayList3.clear();
                    arrayList4.clear();
                    trVar12.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    i5 contactsController = trVar12.getContactsController();
                    contactsController.getClass();
                    g0.g3(new dg(contactsController, arrayList4, 1, arrayList3, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                i5 contactsController2 = trVar12.getContactsController();
                contactsController2.getClass();
                g0.g3(new dg(contactsController2, arrayList4, 1, arrayList3, 3));
                return;
            case 19:
                tr trVar13 = this.f26382b;
                trVar13.getClass();
                try {
                    trVar13.f27151b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    trVar13.o(e18, true);
                    return;
                }
            case 20:
                tr trVar14 = this.f26382b;
                trVar14.getNotificationCenter().k(325, new Object[0]);
                trVar14.getNotificationCenter().k(291, new Object[0]);
                trVar14.getMessagesController().I1().a();
                return;
            case 21:
                this.f26382b.D0();
                return;
            case 22:
                this.f26382b.C0();
                return;
            case 23:
                tr trVar15 = this.f26382b;
                try {
                    try {
                        sQLiteCursor = trVar15.f27151b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                    trVar15.o(e19, true);
                    if (sQLiteCursor == null) {
                        return;
                    }
                }
                sQLiteCursor.dispose();
                return;
            case 24:
                this.f26382b.getNotificationCenter().k(325, new Object[0]);
                return;
            case 25:
                tr trVar16 = this.f26382b;
                ArrayList arrayList7 = trVar16.getMessagesController().Q0;
                int size3 = arrayList7.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    ((ro) arrayList7.get(i14)).d = ((ro) arrayList7.get(i14)).f26776e;
                }
                trVar16.L = trVar16.N;
                trVar16.M = trVar16.O;
                ks notificationCenter2 = trVar16.getNotificationCenter();
                int i15 = mp.I8;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                this.f26382b.t1(true);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                this.f26382b.getMessagesController().Z0();
                return;
        }
    }
}
