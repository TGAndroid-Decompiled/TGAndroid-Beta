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
public final class p51 implements Runnable {
    public final byte a;
    public final cf7 b;
    public final ArrayList c;

    public p51(cf7 cf7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = cf7Var;
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
        k47 k47Var;
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
        cf7 cf7Var = this.b;
        ArrayList arrayList = this.c;
        switch (b) {
            case 0:
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase3 = cf7Var.b;
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
                        fc4.g(e, true);
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
                    SQLiteDatabase sQLiteDatabase4 = cf7Var.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 2:
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    Pair pair = (Pair) obj;
                    cf7Var.getMessagesController().s4(((Integer) pair.second).intValue(), ((Long) pair.first).longValue(), false);
                }
                return;
            case 3:
                if (cf7Var.getMessagesController().E1().p(arrayList)) {
                    cf7Var.getMessagesController().E1().k();
                    return;
                }
                return;
            case 4:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    cf7Var.getMessagesController().v3((k47) obj2);
                }
                return;
            case 5:
                cf7 cf7Var2 = this.b;
                try {
                    try {
                        String join = TextUtils.join(",", arrayList);
                        SQLiteDatabase sQLiteDatabase5 = cf7Var2.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase5.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id IN(" + join + ")", new Object[0]);
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    vh6 vh6Var = new vh6();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(1);
                        ArrayList arrayList2 = (ArrayList) vh6Var.f(longValue);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            vh6Var.k(arrayList2, longValue);
                        }
                        arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                    }
                    queryFinalized.dispose();
                    if (!vh6Var.i()) {
                        int m = vh6Var.m();
                        while (i2 < m) {
                            long j = vh6Var.j(i2);
                            ArrayList arrayList3 = (ArrayList) vh6Var.n(i2);
                            gm.c3(new p51(cf7Var2, arrayList3, (byte) 12));
                            cf7Var2.R1(arrayList3, null, null, null, null);
                            cf7 cf7Var3 = cf7Var2;
                            try {
                                cf7Var3.N0(0, 0, j, arrayList3, true);
                                cf7Var3.P1(j, 0L, arrayList3, null);
                                cf7Var2 = cf7Var3;
                                i2++;
                            } catch (Exception e4) {
                                e = e4;
                                cf7Var2 = cf7Var3;
                                cf7Var2.n(e, true);
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
                cf7Var.getFileLoader().g(arrayList);
                return;
            case 7:
                if (cf7Var.getMessagesController().E1().p(arrayList)) {
                    cf7Var.getMessagesController().E1().k();
                    return;
                }
                return;
            case 8:
                cf7Var.getFileLoader().g(arrayList);
                return;
            case 9:
                HashSet hashSet = new HashSet();
                vh6 vh6Var2 = new vh6();
                vh6 vh6Var3 = new vh6();
                int i4 = 0;
                boolean z2 = false;
                while (i4 < arrayList.size()) {
                    ze7 ze7Var = (ze7) arrayList.get(i4);
                    TLRPC.TL_messageReactions tL_messageReactions = ze7Var.b;
                    long j2 = ze7Var.a;
                    TLRPC.TL_messageReactions tL_messageReactions2 = ze7Var.c;
                    vh6Var2.b();
                    vh6Var3.b();
                    if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                        int i5 = 0;
                        while (i5 < tL_messageReactions.results.size()) {
                            k39 d = k39.d(tL_messageReactions.results.get(i5).reaction);
                            vh6Var2.k(d, d.h);
                            i5++;
                            cf7Var = cf7Var;
                        }
                    }
                    cf7 cf7Var4 = cf7Var;
                    if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                        for (int i6 = 0; i6 < tL_messageReactions2.results.size(); i6++) {
                            k39 d2 = k39.d(tL_messageReactions2.results.get(i6).reaction);
                            vh6Var3.k(d2, d2.h);
                        }
                    }
                    for (int i7 = 0; i7 < vh6Var2.m(); i7++) {
                        long j3 = vh6Var2.j(i7);
                        k39 k39Var = (k39) vh6Var2.n(i7);
                        if (!vh6Var3.d(j3) && cf7Var4.getMessagesController().A5(j2, k39Var, false)) {
                            hashSet.add(Long.valueOf(j2));
                            z2 = true;
                        }
                    }
                    for (int i8 = 0; i8 < vh6Var3.m(); i8++) {
                        long j4 = vh6Var3.j(i8);
                        k39 k39Var2 = (k39) vh6Var3.n(i8);
                        if (!vh6Var2.d(j4) && cf7Var4.getMessagesController().A5(j2, k39Var2, true)) {
                            hashSet.add(Long.valueOf(j2));
                            z2 = true;
                        }
                    }
                    i4++;
                    cf7Var = cf7Var4;
                }
                cf7 cf7Var5 = cf7Var;
                if (z2 && !hashSet.isEmpty()) {
                    cf7Var5.getMessagesController().z5(hashSet);
                    return;
                }
                return;
            case 10:
                ArrayList arrayList4 = cf7Var.I;
                arrayList4.clear();
                SparseArray sparseArray = cf7Var.J;
                sparseArray.clear();
                arrayList4.addAll(arrayList);
                while (i2 < arrayList.size()) {
                    ((ub7) arrayList.get(i2)).f = i2;
                    sparseArray.put(((ub7) arrayList.get(i2)).a, (ub7) arrayList.get(i2));
                    i2++;
                }
                cf7Var.w1();
                return;
            case 11:
                cf7Var.getFileLoader().g(arrayList);
                return;
            case 12:
                cf7Var.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                return;
            case 13:
                cf7Var.getNotificationCenter().k(59, arrayList);
                return;
            case 14:
                er3 downloadController = cf7Var.getDownloadController();
                downloadController.getClass();
                int size3 = arrayList.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    fr3 fr3Var = (fr3) downloadController.h.get((Pair) arrayList.get(i9));
                    if (fr3Var != null) {
                        TLObject tLObject = fr3Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            downloadController.getFileLoader().f((TLRPC.Document) tLObject);
                        } else if ((tLObject instanceof TLRPC.Photo) && (w = bc4.w(((TLRPC.Photo) tLObject).sizes, gm.Y0(false), false, null, false)) != null) {
                            bc4 fileLoader = downloadController.getFileLoader();
                            fileLoader.getClass();
                            fileLoader.e(null, null, null, w.location, null, null);
                        }
                    }
                }
                return;
            case 15:
                cf7Var.getFileLoader().g(arrayList);
                return;
            case 16:
                HashSet hashSet2 = new HashSet();
                long[] jArr = new long[1];
                int i10 = 0;
                boolean z3 = false;
                while (i10 < arrayList.size()) {
                    hs6 mediaDataController = cf7Var.getMediaDataController();
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    ArrayList arrayList5 = mediaDataController.d1;
                    int i11 = 0;
                    while (true) {
                        if (i11 < arrayList5.size()) {
                            if (((k47) arrayList5.get(i11)).e1() == intValue) {
                                k47Var = (k47) arrayList5.get(i11);
                            } else {
                                i11++;
                            }
                        } else {
                            k47Var = null;
                        }
                    }
                    if (k47Var != null && k47.B0(k47Var.k) == mediaDataController.getUserConfig().e()) {
                        z = mediaDataController.getMessagesController().L3(k47Var.k);
                        jArr[0] = k47.Q1(mediaDataController.getUserConfig().e(), k47Var.k);
                    } else {
                        z = false;
                    }
                    arrayList5.remove(k47Var);
                    if (z) {
                        hashSet2.add(Long.valueOf(jArr[0]));
                        z3 = true;
                    }
                    i10++;
                    z3 = z3;
                }
                if (z3) {
                    cf7Var.getMessagesController().z5(hashSet2);
                    return;
                }
                return;
            case 17:
                if (cf7Var.getMessagesController().E1().p(arrayList)) {
                    cf7Var.getMessagesController().E1().k();
                    return;
                }
                return;
            case 18:
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    cf7Var.getNotificationCenter().k(49, arrayList.get(i12));
                }
                return;
            case 19:
                cf7Var.getFileLoader().g(arrayList);
                return;
            case 20:
                try {
                    try {
                        cf7Var.b.beginTransaction();
                        try {
                            executeFast = cf7Var.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
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
                        executeFast.bindLong(3, k47.B0(message));
                        executeFast.step();
                    }
                    executeFast.dispose();
                    cf7Var.b.commitTransaction();
                    return;
                } catch (Exception e8) {
                    e = e8;
                    sQLitePreparedStatement = executeFast;
                    i2 = 1;
                    cf7Var.n(e, true);
                    if (i2 != 0 && (sQLiteDatabase2 = cf7Var.b) != null) {
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
                    if (i2 != 0 && (sQLiteDatabase = cf7Var.b) != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 21:
                cf7Var.getMessagesController().X3(arrayList, true);
                return;
            case 22:
                cf7Var.getMessagesController().d4(arrayList, true);
                return;
            case 23:
                try {
                    String join2 = TextUtils.join(",", arrayList);
                    cf7Var.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    cf7Var.n(e9, true);
                    return;
                }
            default:
                try {
                    cf7Var.b.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    fc4.g(e10, true);
                    return;
                }
        }
    }
}
