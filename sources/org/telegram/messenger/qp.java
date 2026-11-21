package org.telegram.messenger;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qp implements Runnable {
    public final int f26460a;
    public final tr f26461b;
    public final ArrayList f26462c;

    public qp(tr trVar, ArrayList arrayList, int i7) {
        this.f26460a = i7;
        this.f26461b = trVar;
        this.f26462c = arrayList;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        TLRPC.PhotoSize w10;
        fj fjVar;
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        int i7;
        int i10 = this.f26460a;
        SQLiteCursor sQLiteCursor = null;
        r6 = null;
        r6 = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        sQLiteCursor = null;
        sQLiteCursor = null;
        int i11 = 0;
        tr trVar = this.f26461b;
        ArrayList arrayList = this.f26462c;
        switch (i10) {
            case 0:
                tr.a(trVar, arrayList);
                return;
            case 1:
                if (trVar.getMessagesController().I1().q(arrayList)) {
                    trVar.getMessagesController().I1().l();
                    return;
                }
                return;
            case 2:
                trVar.getClass();
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    trVar.getMessagesController().y3((fj) obj);
                }
                return;
            case 3:
                tr trVar2 = this.f26461b;
                try {
                    try {
                        String join = TextUtils.join(",", arrayList);
                        SQLiteDatabase sQLiteDatabase3 = trVar2.f27082b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase3.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id IN(" + join + ")", new Object[0]);
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(1);
                        ArrayList arrayList2 = (ArrayList) hVar.f(longValue);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            hVar.k(arrayList2, longValue);
                        }
                        arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                    }
                    queryFinalized.dispose();
                    if (!hVar.i()) {
                        int m10 = hVar.m();
                        while (i11 < m10) {
                            long j3 = hVar.j(i11);
                            ArrayList arrayList3 = (ArrayList) hVar.n(i11);
                            g0.g3(new qp(trVar2, arrayList3, 10));
                            trVar2.U1(arrayList3, null, null, null, null);
                            tr trVar3 = trVar2;
                            try {
                                trVar3.Q0(0, 0, j3, arrayList3, true);
                                trVar3.S1(j3, 0L, arrayList3, null);
                                trVar2 = trVar3;
                                i11++;
                            } catch (Exception e11) {
                                e = e11;
                                trVar2 = trVar3;
                                trVar2.o(e, true);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            case 4:
                trVar.getFileLoader().g(arrayList);
                return;
            case 5:
                if (trVar.getMessagesController().I1().q(arrayList)) {
                    trVar.getMessagesController().I1().l();
                    return;
                }
                return;
            case 6:
                trVar.getFileLoader().g(arrayList);
                return;
            case 7:
                HashSet hashSet = new HashSet();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                int i12 = 0;
                boolean z11 = false;
                while (i12 < arrayList.size()) {
                    qr qrVar = (qr) arrayList.get(i12);
                    TLRPC.TL_messageReactions tL_messageReactions = qrVar.f26470b;
                    long j10 = qrVar.f26469a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = qrVar.f26471c;
                    hVar2.b();
                    hVar3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i13 = 0;
                        while (i13 < tL_messageReactions.results.size()) {
                            ch.p0 d = ch.p0.d(tL_messageReactions.results.get(i13).reaction);
                            hVar2.k(d, d.h);
                            i13++;
                            trVar = trVar;
                        }
                    }
                    tr trVar4 = trVar;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i14 = 0; i14 < tL_messageReactions2.results.size(); i14++) {
                            ch.p0 d2 = ch.p0.d(tL_messageReactions2.results.get(i14).reaction);
                            hVar3.k(d2, d2.h);
                        }
                    }
                    for (int i15 = 0; i15 < hVar2.m(); i15++) {
                        long j11 = hVar2.j(i15);
                        ch.p0 p0Var = (ch.p0) hVar2.n(i15);
                        if (!hVar3.d(j11) && trVar4.getMessagesController().E5(j10, p0Var, false)) {
                            hashSet.add(Long.valueOf(j10));
                            z11 = true;
                        }
                    }
                    for (int i16 = 0; i16 < hVar3.m(); i16++) {
                        long j12 = hVar3.j(i16);
                        ch.p0 p0Var2 = (ch.p0) hVar3.n(i16);
                        if (!hVar2.d(j12) && trVar4.getMessagesController().E5(j10, p0Var2, true)) {
                            hashSet.add(Long.valueOf(j10));
                            z11 = true;
                        }
                    }
                    i12++;
                    trVar = trVar4;
                }
                tr trVar5 = trVar;
                if (z11 && !hashSet.isEmpty()) {
                    trVar5.getMessagesController().D5(hashSet);
                    return;
                }
                return;
            case 8:
                ArrayList arrayList4 = trVar.I;
                arrayList4.clear();
                SparseArray sparseArray = trVar.J;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i11 < arrayList.size()) {
                    ((ro) arrayList.get(i11)).f26704f = i11;
                    sparseArray.put(((ro) arrayList.get(i11)).f26700a, (ro) arrayList.get(i11));
                    i11++;
                }
                trVar.z1();
                return;
            case 9:
                trVar.getFileLoader().g(arrayList);
                return;
            case 10:
                trVar.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 11:
                trVar.getNotificationCenter().k(58, arrayList);
                return;
            case 12:
                a6 downloadController = trVar.getDownloadController();
                downloadController.getClass();
                int size2 = arrayList.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    b6 b6Var = (b6) downloadController.h.get((Pair) arrayList.get(i17));
                    if (b6Var != null) {
                        TLObject tLObject = b6Var.f23066a;
                        if (tLObject instanceof TLRPC.Document) {
                            downloadController.getFileLoader().f((TLRPC.Document) tLObject);
                        } else if ((tLObject instanceof TLRPC.Photo) && (w10 = w7.w(((TLRPC.Photo) tLObject).sizes, g0.Z0(false), false, null, false)) != null) {
                            w7 fileLoader = downloadController.getFileLoader();
                            fileLoader.getClass();
                            fileLoader.e(null, null, null, w10.location, null, null);
                        }
                    }
                }
                return;
            case 13:
                trVar.getFileLoader().g(arrayList);
                return;
            case 14:
                trVar.getClass();
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i18 = 0;
                boolean z12 = false;
                while (i18 < arrayList.size()) {
                    ri mediaDataController = trVar.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i18)).intValue();
                    ArrayList arrayList5 = mediaDataController.f26634d1;
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList5.size()) {
                            if (((fj) arrayList5.get(i19)).e1() == intValue) {
                                fjVar = (fj) arrayList5.get(i19);
                            } else {
                                i19++;
                            }
                        } else {
                            fjVar = null;
                        }
                    }
                    if (fjVar != null && fj.B0(fjVar.f23993k) == mediaDataController.getUserConfig().e()) {
                        z10 = mediaDataController.getMessagesController().N3(fjVar.f23993k);
                        jArr[0] = fj.Q1(mediaDataController.getUserConfig().e(), fjVar.f23993k);
                    } else {
                        z10 = false;
                    }
                    arrayList5.remove(fjVar);
                    if (z10) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z12 = true;
                    }
                    i18++;
                    z12 = z12;
                }
                if (z12) {
                    trVar.getMessagesController().D5(hashSet2);
                    return;
                }
                return;
            case 15:
                if (trVar.getMessagesController().I1().q(arrayList)) {
                    trVar.getMessagesController().I1().l();
                    return;
                }
                return;
            case 16:
                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                    trVar.getNotificationCenter().k(48, arrayList.get(i20));
                }
                return;
            case 17:
                trVar.getFileLoader().g(arrayList);
                return;
            case 18:
                trVar.getClass();
                try {
                    try {
                        trVar.f27082b.beginTransaction();
                        try {
                            executeFast = trVar.f27082b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e13) {
                            e = e13;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
                try {
                    int size3 = arrayList.size();
                    for (int i21 = 0; i21 < size3; i21++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i21);
                        executeFast.requery();
                        int i22 = message.stickerVerified;
                        if (i22 == 0) {
                            i7 = 1;
                        } else if (i22 == 2) {
                            i7 = 2;
                        } else {
                            i7 = 0;
                        }
                        executeFast.bindInteger(1, i7);
                        executeFast.bindInteger(2, message.f28452id);
                        executeFast.bindLong(3, fj.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    trVar.f27082b.commitTransaction();
                    return;
                } catch (Exception e15) {
                    e = e15;
                    sQLitePreparedStatement = executeFast;
                    i11 = 1;
                    trVar.o(e, true);
                    if (i11 != 0 && (sQLiteDatabase2 = trVar.f27082b) != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = executeFast;
                    i11 = 1;
                    if (i11 != 0 && (sQLiteDatabase = trVar.f27082b) != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 19:
                trVar.getMessagesController().Z3(arrayList, true);
                return;
            case 20:
                trVar.getMessagesController().f4(arrayList, true);
                return;
            default:
                trVar.getClass();
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    trVar.f27082b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e16) {
                    trVar.o(e16, true);
                    return;
                }
        }
    }
}
