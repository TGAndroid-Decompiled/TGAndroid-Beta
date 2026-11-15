package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class oq implements Runnable {
    public final int f25793a;
    public final vr f25794b;

    public oq(vr vrVar, int i7) {
        this.f25793a = i7;
        this.f25794b = vrVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.oq.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.oq.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        int i7 = 0;
        switch (this.f25793a) {
            case 0:
                vr vrVar = this.f25794b;
                try {
                    vrVar.f27222b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    vrVar.o(e10, true);
                }
                int i10 = vrVar.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.f54338a;
                g0.h3(new jg.x(i10, 13));
                return;
            case 1:
                vr vrVar2 = this.f25794b;
                vrVar2.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = np.s1(vrVar2.currentAccount).f25270e7.getAll();
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
                        vrVar2.f27222b.beginTransaction();
                        SQLitePreparedStatement executeFast = vrVar2.f27222b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i7 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i7));
                            executeFast.bindLong(2, ((Long) hVar.n(i7)).longValue());
                            executeFast.step();
                            i7++;
                        }
                        executeFast.dispose();
                        vrVar2.f27222b.commitTransaction();
                        return;
                    } catch (Exception e12) {
                        vrVar2.o(e12, true);
                        return;
                    }
                } catch (Throwable th2) {
                    vrVar2.o(th2, true);
                    return;
                }
            case 2:
                vr vrVar3 = this.f25794b;
                if (vrVar3.R) {
                    vrVar3.R = false;
                    ns.f(vrVar3.currentAccount).k(295, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                ns.f(this.f25794b.currentAccount).k(303, new Object[0]);
                return;
            case 4:
                vr vrVar4 = this.f25794b;
                vrVar4.R = true;
                ns.f(vrVar4.currentAccount).k(295, Boolean.TRUE);
                return;
            case 5:
                vr vrVar5 = this.f25794b;
                vrVar5.R = false;
                ns.f(vrVar5.currentAccount).k(295, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f25794b.f27222b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e13) {
                    a8.g(e13, true);
                    return;
                }
            case 7:
                vr vrVar6 = this.f25794b;
                ArrayList arrayList = vrVar6.getMessagesController().Q0;
                int size = arrayList.size();
                while (i7 < size) {
                    ((so) arrayList.get(i7)).d = ((so) arrayList.get(i7)).f26545e;
                    i7++;
                }
                vrVar6.L = vrVar6.N;
                vrVar6.M = vrVar6.O;
                return;
            case 8:
                this.f25794b.V0(1);
                return;
            case 9:
                vr vrVar7 = this.f25794b;
                for (int i11 = 0; i11 < 2; i11++) {
                    vrVar7.getUserConfig().x(i11, 0, 0, 0L, 0L, 0L, 0L);
                    vrVar7.getUserConfig().z(i11, 0);
                }
                m10 userConfig = vrVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.Q = false;
                m10 userConfig2 = vrVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                vrVar7.getNotificationCenter().k(288, new Object[0]);
                vrVar7.getMediaDataController().E0(false, true, null);
                vrVar7.getNotificationCenter().k(322, new Object[0]);
                vrVar7.getMessagesController().P1().q();
                return;
            case 10:
                this.f25794b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 11:
                vr vrVar8 = this.f25794b;
                vrVar8.getClass();
                try {
                    vrVar8.f27222b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e14) {
                    vrVar8.o(e14, true);
                    return;
                }
            case 12:
                vr vrVar9 = this.f25794b;
                vrVar9.p(true);
                vrVar9.s();
                vrVar9.V0(1);
                g0.h3(new oq(vrVar9, 19));
                return;
            case 13:
                this.f25794b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 14:
                vr vrVar10 = this.f25794b;
                vrVar10.getClass();
                try {
                    vrVar10.f27222b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    vrVar10.o(e15, true);
                    return;
                }
            case 15:
                this.f25794b.z0();
                return;
            case 16:
                vr vrVar11 = this.f25794b;
                ArrayList arrayList2 = vrVar11.getMessagesController().Q0;
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((so) arrayList2.get(i12)).d = ((so) arrayList2.get(i12)).f26545e;
                }
                vrVar11.L = vrVar11.N;
                vrVar11.M = vrVar11.O;
                ns notificationCenter = vrVar11.getNotificationCenter();
                int i13 = np.D8;
                notificationCenter.k(2, 256);
                return;
            case 17:
                vr vrVar12 = this.f25794b;
                vrVar12.getClass();
                try {
                    vrVar12.f27222b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    vrVar12.o(e16, true);
                    return;
                }
            case 18:
                vr vrVar13 = this.f25794b;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                try {
                    try {
                        queryFinalized = vrVar13.f27222b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
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
                        vrVar13.n0(arrayList5, arrayList4, false);
                    }
                } catch (Exception e18) {
                    e = e18;
                    sQLiteCursor = queryFinalized;
                    arrayList3.clear();
                    arrayList4.clear();
                    vrVar13.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    g5 contactsController = vrVar13.getContactsController();
                    contactsController.getClass();
                    g0.h3(new cg(contactsController, arrayList4, 1, arrayList3, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                g5 contactsController2 = vrVar13.getContactsController();
                contactsController2.getClass();
                g0.h3(new cg(contactsController2, arrayList4, 1, arrayList3, 3));
                return;
            case 19:
                vr vrVar14 = this.f25794b;
                vrVar14.getNotificationCenter().k(322, new Object[0]);
                vrVar14.getNotificationCenter().k(288, new Object[0]);
                vrVar14.getMessagesController().G1().a();
                return;
            case 20:
                this.f25794b.getMessagesController().G1().a();
                return;
            case 21:
                vr vrVar15 = this.f25794b;
                try {
                    try {
                        sQLiteCursor = vrVar15.f27222b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        vrVar15.o(e19, true);
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
                this.f25794b.D0();
                return;
            case 23:
                this.f25794b.C0();
                return;
            case 24:
                this.f25794b.getNotificationCenter().k(322, new Object[0]);
                return;
            case 25:
                vr vrVar16 = this.f25794b;
                ArrayList arrayList7 = vrVar16.getMessagesController().Q0;
                int size3 = arrayList7.size();
                for (int i14 = 0; i14 < size3; i14++) {
                    ((so) arrayList7.get(i14)).d = ((so) arrayList7.get(i14)).f26545e;
                }
                vrVar16.L = vrVar16.N;
                vrVar16.M = vrVar16.O;
                ns notificationCenter2 = vrVar16.getNotificationCenter();
                int i15 = np.D8;
                notificationCenter2.k(2, 256);
                return;
            case 26:
                this.f25794b.t1(true);
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                this.f25794b.getMessagesController().X0();
                return;
        }
    }
}
