package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class i41 implements Runnable {
    public final byte a;
    public final ad7 b;
    public final ArrayList c;

    public i41(ad7 ad7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        int i;
        SQLiteCursor queryFinalized;
        TLRPC.PhotoSize w;
        k27 k27Var;
        boolean z;
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r7 = null;
        r7 = null;
        SQLiteCursor sQLiteCursor = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        int i2 = 0;
        ad7 ad7Var = this.b;
        ArrayList arrayList = this.c;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                        sQLiteDatabase3.executeFast("DELETE FROM business_links").stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase3.executeFast("REPLACE INTO business_links VALUES(?, ?)");
                        while (i2 < arrayList.size()) {
                            TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) arrayList.get(i2);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_businessChatLink.getObjectSize());
                            tL_businessChatLink.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                            sQLitePreparedStatement2.bindInteger(2, i2);
                            sQLitePreparedStatement2.step();
                            i2++;
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th;
                }
            case 1:
                try {
                    SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 2:
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    Pair pair = (Pair) obj;
                    ad7Var.getMessagesController().q4(((Integer) pair.second).intValue(), ((Long) pair.first).longValue(), false);
                }
                return;
            case 3:
                if (ad7Var.getMessagesController().D1().p(arrayList)) {
                    ad7Var.getMessagesController().D1().k();
                    return;
                }
                return;
            case 4:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ad7Var.getMessagesController().t3((k27) obj2);
                }
                return;
            case 5:
                ad7 ad7Var2 = this.b;
                try {
                    try {
                        String join = TextUtils.join(",", arrayList);
                        SQLiteDatabase sQLiteDatabase5 = ad7Var2.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase5.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id IN(" + join + ")", new Object[0]);
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    vf6 vf6Var = new vf6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(1);
                        ArrayList arrayList2 = (ArrayList) vf6Var.f(longValue);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            vf6Var.k(arrayList2, longValue);
                        }
                        arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                    }
                    queryFinalized.dispose();
                    if (!vf6Var.i()) {
                        int m = vf6Var.m();
                        while (i2 < m) {
                            long j = vf6Var.j(i2);
                            ArrayList arrayList3 = (ArrayList) vf6Var.n(i2);
                            gl.c3(new i41(ad7Var2, arrayList3, (byte) 12));
                            ad7Var2.R1(arrayList3, null, null, null, null);
                            ad7 ad7Var3 = ad7Var2;
                            try {
                                ad7Var3.N0(0, 0, j, arrayList3, true);
                                ad7Var3.P1(j, 0L, arrayList3, null);
                                ad7Var2 = ad7Var3;
                                i2++;
                            } catch (Exception e4) {
                                e = e4;
                                ad7Var2 = ad7Var3;
                                ad7Var2.n(e, true);
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
                } catch (Exception e5) {
                    e = e5;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th;
                }
            case 6:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 7:
                if (ad7Var.getMessagesController().D1().p(arrayList)) {
                    ad7Var.getMessagesController().D1().k();
                    return;
                }
                return;
            case 8:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 9:
                HashSet hashSet = new HashSet();
                vf6 vf6Var2 = new vf6();
                vf6 vf6Var3 = new vf6();
                int i4 = 0;
                boolean z2 = false;
                while (i4 < arrayList.size()) {
                    xc7 xc7Var = (xc7) arrayList.get(i4);
                    TLRPC.TL_messageReactions tL_messageReactions = xc7Var.b;
                    long j2 = xc7Var.a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = xc7Var.c;
                    vf6Var2.b();
                    vf6Var3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i5 = 0;
                        while (i5 < tL_messageReactions.results.size()) {
                            h19 d = h19.d(tL_messageReactions.results.get(i5).reaction);
                            vf6Var2.k(d, d.h);
                            i5++;
                            ad7Var = ad7Var;
                        }
                    }
                    ad7 ad7Var4 = ad7Var;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i6 = 0; i6 < tL_messageReactions2.results.size(); i6++) {
                            h19 d2 = h19.d(tL_messageReactions2.results.get(i6).reaction);
                            vf6Var3.k(d2, d2.h);
                        }
                    }
                    for (int i7 = 0; i7 < vf6Var2.m(); i7++) {
                        long j3 = vf6Var2.j(i7);
                        h19 h19Var = (h19) vf6Var2.n(i7);
                        if (!vf6Var3.d(j3) && ad7Var4.getMessagesController().y5(j2, h19Var, false)) {
                            hashSet.add(Long.valueOf(j2));
                            z2 = true;
                        }
                    }
                    for (int i8 = 0; i8 < vf6Var3.m(); i8++) {
                        long j4 = vf6Var3.j(i8);
                        h19 h19Var2 = (h19) vf6Var3.n(i8);
                        if (!vf6Var2.d(j4) && ad7Var4.getMessagesController().y5(j2, h19Var2, true)) {
                            hashSet.add(Long.valueOf(j2));
                            z2 = true;
                        }
                    }
                    i4++;
                    ad7Var = ad7Var4;
                }
                ad7 ad7Var5 = ad7Var;
                if (z2 && !hashSet.isEmpty()) {
                    ad7Var5.getMessagesController().x5(hashSet);
                    return;
                }
                return;
            case 10:
                ArrayList arrayList4 = ad7Var.I;
                arrayList4.clear();
                SparseArray sparseArray = ad7Var.J;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i2 < arrayList.size()) {
                    ((t97) arrayList.get(i2)).f = i2;
                    sparseArray.put(((t97) arrayList.get(i2)).a, (t97) arrayList.get(i2));
                    i2++;
                }
                ad7Var.w1();
                return;
            case 11:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 12:
                ad7Var.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 13:
                ad7Var.getNotificationCenter().k(58, arrayList);
                return;
            case 14:
                up3 downloadController = ad7Var.getDownloadController();
                downloadController.getClass();
                int size3 = arrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    vp3 vp3Var = (vp3) downloadController.h.get((Pair) arrayList.get(i9));
                    if (vp3Var != null) {
                        TLObject tLObject = vp3Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            downloadController.getFileLoader().f((TLRPC.Document) tLObject);
                        } else if ((tLObject instanceof TLRPC.Photo) && (w = ba4.w(((TLRPC.Photo) tLObject).sizes, gl.Y0(false), false, null, false)) != null) {
                            ba4 fileLoader = downloadController.getFileLoader();
                            fileLoader.getClass();
                            fileLoader.e(null, null, null, w.location, null, null);
                        }
                    }
                }
                return;
            case 15:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 16:
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i10 = 0;
                boolean z3 = false;
                while (i10 < arrayList.size()) {
                    hq6 mediaDataController = ad7Var.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    ArrayList arrayList5 = mediaDataController.d1;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList5.size()) {
                            if (((k27) arrayList5.get(i11)).e1() == intValue) {
                                k27Var = (k27) arrayList5.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            k27Var = null;
                        }
                    }
                    if (k27Var != null && k27.B0(k27Var.k) == mediaDataController.getUserConfig().e()) {
                        z = mediaDataController.getMessagesController().J3(k27Var.k);
                        jArr[0] = k27.Q1(mediaDataController.getUserConfig().e(), k27Var.k);
                    } else {
                        z = false;
                    }
                    arrayList5.remove(k27Var);
                    if (z) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z3 = true;
                    }
                    i10++;
                    z3 = z3;
                }
                if (z3) {
                    ad7Var.getMessagesController().x5(hashSet2);
                    return;
                }
                return;
            case 17:
                if (ad7Var.getMessagesController().D1().p(arrayList)) {
                    ad7Var.getMessagesController().D1().k();
                    return;
                }
                return;
            case 18:
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    ad7Var.getNotificationCenter().k(48, arrayList.get(i12));
                }
                return;
            case 19:
                ad7Var.getFileLoader().g(arrayList);
                return;
            case 20:
                try {
                    try {
                        ad7Var.b.beginTransaction();
                        try {
                            executeFast = ad7Var.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e6) {
                            e = e6;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    int size4 = arrayList.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        TLRPC.Message message = (TLRPC.Message) arrayList.get(i13);
                        executeFast.requery();
                        int i14 = message.stickerVerified;
                        if (i14 == 0) {
                            i = 1;
                        } else if (i14 == 2) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        executeFast.bindInteger(1, i);
                        executeFast.bindInteger(2, message.id);
                        executeFast.bindLong(3, k27.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    ad7Var.b.commitTransaction();
                    return;
                } catch (Exception e8) {
                    e = e8;
                    sQLitePreparedStatement = executeFast;
                    i2 = 1;
                    ad7Var.n(e, true);
                    if (i2 != 0 && (sQLiteDatabase2 = ad7Var.b) != null) {
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
                    i2 = 1;
                    if (i2 != 0 && (sQLiteDatabase = ad7Var.b) != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 21:
                ad7Var.getMessagesController().V3(arrayList, true);
                return;
            case 22:
                ad7Var.getMessagesController().b4(arrayList, true);
                return;
            case 23:
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    ad7Var.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    ad7Var.n(e9, true);
                    return;
                }
            default:
                try {
                    ad7Var.b.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    fa4.g(e10, true);
                    return;
                }
        }
    }
}
