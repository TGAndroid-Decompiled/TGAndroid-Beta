package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class hq implements Runnable {
    public final int f23188a;
    public final qr f23189b;

    public hq(qr qrVar, int i3) {
        this.f23188a = i3;
        this.f23189b = qrVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hq.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hq.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        int i3 = 0;
        switch (this.f23188a) {
            case 0:
                qr qrVar = this.f23189b;
                try {
                    qrVar.f24936b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    qrVar.o(e10, true);
                }
                int i10 = qrVar.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52941a;
                g0.h3(new ii.i2(i10, 13));
                return;
            case 1:
                qr qrVar2 = this.f23189b;
                qrVar2.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = hp.s1(qrVar2.currentAccount).f22989d7.getAll();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        if (key.startsWith("notify2_")) {
                            Integer num2 = (Integer) entry.getValue();
                            if (num2.intValue() != 2 && num2.intValue() != 3) {
                            }
                            String replace = key.replace("notify2_", "");
                            long j10 = 1;
                            if (num2.intValue() != 2) {
                                if (((Integer) all.get("notifyuntil_" + replace)) != null) {
                                    j10 = 1 | (num.intValue() << 32);
                                }
                            }
                            try {
                                hVar.k(Long.valueOf(j10), Long.parseLong(replace));
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    try {
                        qrVar2.f24936b.beginTransaction();
                        SQLitePreparedStatement executeFast = qrVar2.f24936b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i3 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i3));
                            executeFast.bindLong(2, ((Long) hVar.n(i3)).longValue());
                            executeFast.step();
                            i3++;
                        }
                        executeFast.dispose();
                        qrVar2.f24936b.commitTransaction();
                        return;
                    } catch (Exception e12) {
                        qrVar2.o(e12, true);
                        return;
                    }
                } catch (Throwable th2) {
                    qrVar2.o(th2, true);
                    return;
                }
            case 2:
                qr qrVar3 = this.f23189b;
                if (qrVar3.R) {
                    qrVar3.R = false;
                    hs.f(qrVar3.currentAccount).k(295, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                hs.f(this.f23189b.currentAccount).k(303, new Object[0]);
                return;
            case 4:
                qr qrVar4 = this.f23189b;
                qrVar4.R = true;
                hs.f(qrVar4.currentAccount).k(295, Boolean.TRUE);
                return;
            case 5:
                qr qrVar5 = this.f23189b;
                qrVar5.R = false;
                hs.f(qrVar5.currentAccount).k(295, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f23189b.f24936b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 7:
                qr qrVar6 = this.f23189b;
                ArrayList arrayList = qrVar6.getMessagesController().Q0;
                int size = arrayList.size();
                while (i3 < size) {
                    ((mo) arrayList.get(i3)).d = ((mo) arrayList.get(i3)).f24240e;
                    i3++;
                }
                qrVar6.L = qrVar6.N;
                qrVar6.M = qrVar6.O;
                return;
            case 8:
                qr qrVar7 = this.f23189b;
                for (int i11 = 0; i11 < 2; i11++) {
                    qrVar7.getUserConfig().x(i11, 0, 0, 0L, 0L, 0L, 0L);
                    qrVar7.getUserConfig().z(i11, 0);
                }
                h10 userConfig = qrVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                h10 userConfig2 = qrVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                qrVar7.getNotificationCenter().k(288, new Object[0]);
                qrVar7.getMediaDataController().E0(false, true, null);
                qrVar7.getNotificationCenter().k(322, new Object[0]);
                qrVar7.getMessagesController().P1().q();
                return;
            case 9:
                this.f23189b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 10:
                this.f23189b.V0(1);
                return;
            case 11:
                qr qrVar8 = this.f23189b;
                qrVar8.getClass();
                try {
                    qrVar8.f24936b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    qrVar8.o(e14, true);
                    return;
                }
            case 12:
                qr qrVar9 = this.f23189b;
                qrVar9.p(true);
                qrVar9.s();
                qrVar9.V0(1);
                g0.h3(new hq(qrVar9, 19));
                return;
            case 13:
                qr qrVar10 = this.f23189b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        queryFinalized = qrVar10.f24936b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
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
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        tL_contact.mutual = z10;
                        arrayList2.add(tL_contact);
                        arrayList4.add(Long.valueOf(tL_contact.user_id));
                    }
                    queryFinalized.dispose();
                    if (!arrayList4.isEmpty()) {
                        qrVar10.n0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e16) {
                    e = e16;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    qrVar10.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    g5 contactsController = qrVar10.getContactsController();
                    contactsController.getClass();
                    g0.h3(new vf(contactsController, arrayList3, 1, arrayList2, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                g5 contactsController2 = qrVar10.getContactsController();
                contactsController2.getClass();
                g0.h3(new vf(contactsController2, arrayList3, 1, arrayList2, 3));
                return;
            case 14:
                this.f23189b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 15:
                qr qrVar11 = this.f23189b;
                qrVar11.getClass();
                try {
                    qrVar11.f24936b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e17) {
                    qrVar11.o(e17, true);
                    return;
                }
            case 16:
                this.f23189b.z0();
                return;
            case 17:
                qr qrVar12 = this.f23189b;
                ArrayList arrayList5 = qrVar12.getMessagesController().Q0;
                int size2 = arrayList5.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((mo) arrayList5.get(i12)).d = ((mo) arrayList5.get(i12)).f24240e;
                }
                qrVar12.L = qrVar12.N;
                qrVar12.M = qrVar12.O;
                hs notificationCenter = qrVar12.getNotificationCenter();
                int i13 = hp.C8;
                notificationCenter.k(2, 256);
                return;
            case 18:
                qr qrVar13 = this.f23189b;
                qrVar13.getClass();
                try {
                    qrVar13.f24936b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e18) {
                    qrVar13.o(e18, true);
                    return;
                }
            case 19:
                qr qrVar14 = this.f23189b;
                qrVar14.getNotificationCenter().k(322, new Object[0]);
                qrVar14.getNotificationCenter().k(288, new Object[0]);
                qrVar14.getMessagesController().G1().a();
                return;
            case 20:
                this.f23189b.getMessagesController().G1().a();
                return;
            case 21:
                qr qrVar15 = this.f23189b;
                try {
                    try {
                        sQLiteCursor = qrVar15.f24936b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        qrVar15.o(e19, true);
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
                this.f23189b.D0();
                return;
            case 23:
                this.f23189b.getNotificationCenter().k(322, new Object[0]);
                return;
            case 24:
                qr qrVar16 = this.f23189b;
                ArrayList arrayList7 = qrVar16.getMessagesController().Q0;
                int size3 = arrayList7.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    ((mo) arrayList7.get(i14)).d = ((mo) arrayList7.get(i14)).f24240e;
                }
                qrVar16.L = qrVar16.N;
                qrVar16.M = qrVar16.O;
                hs notificationCenter2 = qrVar16.getNotificationCenter();
                int i15 = hp.C8;
                notificationCenter2.k(2, 256);
                return;
            case 25:
                this.f23189b.t1(true);
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                this.f23189b.getMessagesController().X0();
                return;
            default:
                this.f23189b.C0();
                return;
        }
    }
}
