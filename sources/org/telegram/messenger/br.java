package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class br implements Runnable {
    public final int f14821a;
    public final hs f14822b;

    public br(hs hsVar, int i10) {
        this.f14821a = i10;
        this.f14822b = hsVar;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.br.a():void");
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.br.b():void");
    }

    @Override
    public final void run() {
        Integer num;
        SQLiteCursor queryFinalized;
        boolean z10;
        SQLiteCursor sQLiteCursor = null;
        int i10 = 0;
        switch (this.f14821a) {
            case 0:
                hs hsVar = this.f14822b;
                hsVar.getClass();
                try {
                    a0.h hVar = new a0.h();
                    Map<String, ?> all = vp.r1(hsVar.currentAccount).e7.getAll();
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
                        hsVar.f15940b.beginTransaction();
                        SQLitePreparedStatement executeFast = hsVar.f15940b.executeFast("REPLACE INTO dialog_settings VALUES(?, ?)");
                        while (i10 < hVar.m()) {
                            executeFast.requery();
                            executeFast.bindLong(1, hVar.j(i10));
                            executeFast.bindLong(2, ((Long) hVar.n(i10)).longValue());
                            executeFast.step();
                            i10++;
                        }
                        executeFast.dispose();
                        hsVar.f15940b.commitTransaction();
                        return;
                    } catch (Exception e7) {
                        hsVar.o(e7, true);
                        return;
                    }
                } catch (Throwable th2) {
                    hsVar.o(th2, true);
                    return;
                }
            case 1:
                hs hsVar2 = this.f14822b;
                try {
                    hsVar2.f15940b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
                } catch (Exception e10) {
                    hsVar2.o(e10, true);
                }
                int i11 = hsVar2.currentAccount;
                ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f44430a;
                i0.g3(new wd(i11, 12));
                return;
            case 2:
                hs hsVar3 = this.f14822b;
                if (hsVar3.Q) {
                    hsVar3.Q = false;
                    zs.f(hsVar3.currentAccount).k(295, Boolean.FALSE);
                    return;
                }
                return;
            case 3:
                zs.f(this.f14822b.currentAccount).k(303, new Object[0]);
                return;
            case 4:
                hs hsVar4 = this.f14822b;
                hsVar4.Q = true;
                zs.f(hsVar4.currentAccount).k(295, Boolean.TRUE);
                return;
            case 5:
                hs hsVar5 = this.f14822b;
                hsVar5.Q = false;
                zs.f(hsVar5.currentAccount).k(295, Boolean.FALSE);
                return;
            case 6:
                try {
                    this.f14822b.f15940b.executeFast("DELETE FROM fact_checks WHERE expires > " + System.currentTimeMillis()).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return;
                }
            case 7:
                hs hsVar6 = this.f14822b;
                ArrayList arrayList = hsVar6.getMessagesController().P0;
                int size = arrayList.size();
                while (i10 < size) {
                    ((ap) arrayList.get(i10)).d = ((ap) arrayList.get(i10)).e;
                    i10++;
                }
                hsVar6.K = hsVar6.M;
                hsVar6.L = hsVar6.N;
                return;
            case 8:
                hs hsVar7 = this.f14822b;
                for (int i12 = 0; i12 < 2; i12++) {
                    hsVar7.getUserConfig().x(i12, 0, 0, 0L, 0L, 0L, 0L);
                    hsVar7.getUserConfig().z(i12, 0);
                }
                d20 userConfig = hsVar7.getUserConfig();
                userConfig.k().edit().remove("filtersLoaded").apply();
                userConfig.P = false;
                d20 userConfig2 = hsVar7.getUserConfig();
                SharedPreferences.Editor edit = userConfig2.k().edit();
                for (String str : userConfig2.k().getAll().keySet()) {
                    if (str.startsWith("2pinnedDialogsLoaded")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                hsVar7.getNotificationCenter().k(288, new Object[0]);
                hsVar7.getMediaDataController().E0(false, true, null);
                hsVar7.getNotificationCenter().k(322, new Object[0]);
                hsVar7.getMessagesController().O1().q();
                return;
            case 9:
                this.f14822b.getNotificationCenter().k(78, new Object[0]);
                return;
            case 10:
                this.f14822b.V0(1);
                return;
            case 11:
                hs hsVar8 = this.f14822b;
                hsVar8.getClass();
                try {
                    hsVar8.f15940b.executeFast("DELETE FROM sent_files_v2 WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e12) {
                    hsVar8.o(e12, true);
                    return;
                }
            case 12:
                hs hsVar9 = this.f14822b;
                hsVar9.p(true);
                hsVar9.s();
                hsVar9.V0(1);
                i0.g3(new br(hsVar9, 18));
                return;
            case 13:
                hs hsVar10 = this.f14822b;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                try {
                    try {
                        queryFinalized = hsVar10.f15940b.queryFinalized("SELECT * FROM contacts WHERE 1", new Object[0]);
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
                        hsVar10.n0(arrayList4, arrayList3, false);
                    }
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor = queryFinalized;
                    arrayList2.clear();
                    arrayList3.clear();
                    hsVar10.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    i5 contactsController = hsVar10.getContactsController();
                    contactsController.getClass();
                    i0.g3(new cg(contactsController, arrayList3, 1, arrayList2, 3));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
                i5 contactsController2 = hsVar10.getContactsController();
                contactsController2.getClass();
                i0.g3(new cg(contactsController2, arrayList3, 1, arrayList2, 3));
                return;
            case 14:
                this.f14822b.getNotificationCenter().k(121, new Object[0]);
                return;
            case 15:
                this.f14822b.z0();
                return;
            case 16:
                hs hsVar11 = this.f14822b;
                hsVar11.getClass();
                try {
                    hsVar11.f15940b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
                    return;
                } catch (Exception e15) {
                    hsVar11.o(e15, true);
                    return;
                }
            case 17:
                hs hsVar12 = this.f14822b;
                ArrayList arrayList5 = hsVar12.getMessagesController().P0;
                int size2 = arrayList5.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((ap) arrayList5.get(i13)).d = ((ap) arrayList5.get(i13)).e;
                }
                hsVar12.K = hsVar12.M;
                hsVar12.L = hsVar12.N;
                zs notificationCenter = hsVar12.getNotificationCenter();
                int i14 = vp.D8;
                notificationCenter.k(2, 256);
                return;
            case 18:
                hs hsVar13 = this.f14822b;
                hsVar13.getNotificationCenter().k(322, new Object[0]);
                hsVar13.getNotificationCenter().k(288, new Object[0]);
                hsVar13.getMessagesController().F1().a();
                return;
            case 19:
                this.f14822b.getMessagesController().F1().a();
                return;
            case 20:
                hs hsVar14 = this.f14822b;
                hsVar14.getClass();
                try {
                    hsVar14.f15940b.executeFast("DELETE FROM unread_push_messages WHERE is_reaction = 2").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    hsVar14.o(e16, true);
                    return;
                }
            case 21:
                this.f14822b.D0();
                return;
            case 22:
                this.f14822b.getNotificationCenter().k(322, new Object[0]);
                return;
            case 23:
                hs hsVar15 = this.f14822b;
                try {
                    try {
                        sQLiteCursor = hsVar15.f15940b.queryFinalized("SELECT data FROM wallpapers2 WHERE 1 ORDER BY num ASC", new Object[0]);
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
                        hsVar15.o(e17, true);
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
                hs hsVar16 = this.f14822b;
                ArrayList arrayList7 = hsVar16.getMessagesController().P0;
                int size3 = arrayList7.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    ((ap) arrayList7.get(i15)).d = ((ap) arrayList7.get(i15)).e;
                }
                hsVar16.K = hsVar16.M;
                hsVar16.L = hsVar16.N;
                zs notificationCenter2 = hsVar16.getNotificationCenter();
                int i16 = vp.D8;
                notificationCenter2.k(2, 256);
                return;
            case 25:
                this.f14822b.t1(true);
                return;
            case 26:
                a();
                return;
            case 27:
                b();
                return;
            case 28:
                this.f14822b.getMessagesController().W0();
                return;
            default:
                this.f14822b.C0();
                return;
        }
    }
}
