package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class cr implements Runnable {
    public final int f15204a;
    public final is f15205b;

    public cr(is isVar, int i10) {
        this.f15204a = i10;
        this.f15205b = isVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cr.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cr.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        int i10 = 0;
        switch (this.f15204a) {
            case 0:
                is isVar = this.f15205b;
                isVar.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = wp.r1(isVar.currentAccount).e7.getAll();
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
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    try {
                        isVar.f16333b.beginTransaction();
                        SQLitePreparedStatement executeFast = isVar.f16333b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i10 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i10));
                            executeFast.bindLong(2, ((Long) hVar.n(i10)).longValue());
                            executeFast.step();
                            i10++;
                        }
                        executeFast.dispose();
                        isVar.f16333b.commitTransaction();
                        return;
                    } catch (Exception e7) {
                        isVar.o(e7, true);
                        return;
                    }
                } catch (Throwable th2) {
                    isVar.o(th2, true);
                    return;
                }
            case 1:
                is isVar2 = this.f15205b;
                try {
                    isVar2.f16333b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    isVar2.o(e10, true);
                }
                int i11 = isVar2.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f44441a;
                i0.g3(new xd(i11, 12));
                return;
            case 2:
                is isVar3 = this.f15205b;
                if (isVar3.Q) {
                    isVar3.Q = false;
                    at.f(isVar3.currentAccount).k(295, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                at.f(this.f15205b.currentAccount).k(303, new Object[0]);
                return;
            case 4:
                is isVar4 = this.f15205b;
                isVar4.Q = true;
                at.f(isVar4.currentAccount).k(295, Boolean.TRUE);
                return;
            case 5:
                is isVar5 = this.f15205b;
                isVar5.Q = false;
                at.f(isVar5.currentAccount).k(295, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f15205b.f16333b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return;
                }
            case 7:
                is isVar6 = this.f15205b;
                ArrayList arrayList = isVar6.getMessagesController().P0;
                int size = arrayList.size();
                while (i10 < size) {
                    ((bp) arrayList.get(i10)).d = ((bp) arrayList.get(i10)).e;
                    i10++;
                }
                isVar6.K = isVar6.M;
                isVar6.L = isVar6.N;
                return;
            case 8:
                is isVar7 = this.f15205b;
                for (int i12 = 0; i12 < 2; i12++) {
                    isVar7.getUserConfig().x(i12, 0, 0, 0L, 0L, 0L, 0L);
                    isVar7.getUserConfig().z(i12, 0);
                }
                e20 userConfig = isVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.P = false;
                e20 userConfig2 = isVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                isVar7.getNotificationCenter().k(288, new Object[0]);
                isVar7.getMediaDataController().E0(false, true, null);
                isVar7.getNotificationCenter().k(322, new Object[0]);
                isVar7.getMessagesController().O1().q();
                return;
            case 9:
                this.f15205b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 10:
                this.f15205b.V0(1);
                return;
            case 11:
                is isVar8 = this.f15205b;
                isVar8.getClass();
                try {
                    isVar8.f16333b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    isVar8.o(e12, true);
                    return;
                }
            case 12:
                is isVar9 = this.f15205b;
                isVar9.p(true);
                isVar9.s();
                isVar9.V0(1);
                i0.g3(new cr(isVar9, 18));
                return;
            case 13:
                is isVar10 = this.f15205b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        queryFinalized = isVar10.f16333b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (queryFinalized.next()) {
                        TLRPC.TL_contact tL_contact = new TLRPC.TL_contact();
                        tL_contact.user_id = queryFinalized.intValue(0);
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
                        isVar10.n0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    isVar10.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    i5 contactsController = isVar10.getContactsController();
                    contactsController.getClass();
                    i0.g3(new dg(contactsController, arrayList3, 1, arrayList2, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                i5 contactsController2 = isVar10.getContactsController();
                contactsController2.getClass();
                i0.g3(new dg(contactsController2, arrayList3, 1, arrayList2, 3));
                return;
            case 14:
                this.f15205b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 15:
                this.f15205b.z0();
                return;
            case 16:
                is isVar11 = this.f15205b;
                isVar11.getClass();
                try {
                    isVar11.f16333b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    isVar11.o(e15, true);
                    return;
                }
            case 17:
                is isVar12 = this.f15205b;
                ArrayList arrayList5 = isVar12.getMessagesController().P0;
                int size2 = arrayList5.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((bp) arrayList5.get(i13)).d = ((bp) arrayList5.get(i13)).e;
                }
                isVar12.K = isVar12.M;
                isVar12.L = isVar12.N;
                at notificationCenter = isVar12.getNotificationCenter();
                int i14 = wp.D8;
                notificationCenter.k(2, 256);
                return;
            case 18:
                is isVar13 = this.f15205b;
                isVar13.getNotificationCenter().k(322, new Object[0]);
                isVar13.getNotificationCenter().k(288, new Object[0]);
                isVar13.getMessagesController().F1().a();
                return;
            case 19:
                this.f15205b.getMessagesController().F1().a();
                return;
            case 20:
                is isVar14 = this.f15205b;
                isVar14.getClass();
                try {
                    isVar14.f16333b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    isVar14.o(e16, true);
                    return;
                }
            case 21:
                this.f15205b.D0();
                return;
            case 22:
                this.f15205b.getNotificationCenter().k(322, new Object[0]);
                return;
            case 23:
                is isVar15 = this.f15205b;
                try {
                    try {
                        sQLiteCursor = isVar15.f16333b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        i0.g3(new l(5, arrayList6));
                    } catch (Exception e17) {
                        isVar15.o(e17, true);
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
            case 24:
                is isVar16 = this.f15205b;
                ArrayList arrayList7 = isVar16.getMessagesController().P0;
                int size3 = arrayList7.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((bp) arrayList7.get(i15)).d = ((bp) arrayList7.get(i15)).e;
                }
                isVar16.K = isVar16.M;
                isVar16.L = isVar16.N;
                at notificationCenter2 = isVar16.getNotificationCenter();
                int i16 = wp.D8;
                notificationCenter2.k(2, 256);
                return;
            case 25:
                this.f15205b.t1(true);
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                this.f15205b.getMessagesController().W0();
                return;
            default:
                this.f15205b.C0();
                return;
        }
    }
}
