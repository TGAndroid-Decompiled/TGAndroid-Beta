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
public final class q41 implements Runnable {
    public final byte a;
    public final jf7 b;
    public final ArrayList c;

    public q41(jf7 jf7Var, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = jf7Var;
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
        r47 r47Var;
        boolean z;
        byte b = this.a;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r7 = null;
        SQLiteCursor sQLiteCursor = null;
        SQLiteCursor sQLiteCursor2 = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        sQLitePreparedStatement = null;
        int i2 = 0;
        jf7 jf7Var = this.b;
        ArrayList arrayList = this.c;
        try {
            switch (b) {
                case 0:
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
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
                        } catch (Throwable th) {
                            if (sQLitePreparedStatement2 != null) {
                                sQLitePreparedStatement2.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                case 1:
                    try {
                        SQLiteDatabase sQLiteDatabase4 = jf7Var.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.executeFast("DELETE FROM story_drafts WHERE id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                        return;
                    }
                case 2:
                    jf7 jf7Var2 = this.b;
                    try {
                        try {
                            String join = TextUtils.join(",", arrayList);
                            SQLiteDatabase sQLiteDatabase5 = jf7Var2.b;
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase5.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id IN(" + join + ")", new Object[0]);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            zh6 zh6Var = new zh6();
                            while (queryFinalized.next()) {
                                long longValue = queryFinalized.longValue(1);
                                ArrayList arrayList2 = (ArrayList) zh6Var.f(longValue);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    zh6Var.k(longValue, arrayList2);
                                }
                                arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                            }
                            queryFinalized.dispose();
                            if (!zh6Var.i()) {
                                int m = zh6Var.m();
                                while (i2 < m) {
                                    long j = zh6Var.j(i2);
                                    ArrayList arrayList3 = (ArrayList) zh6Var.n(i2);
                                    hl.c3(new q41(jf7Var2, arrayList3, (byte) 9));
                                    jf7Var2.R1(arrayList3, null, null, null, null);
                                    jf7 jf7Var3 = jf7Var2;
                                    try {
                                        jf7Var3.N0(0, 0, j, arrayList3, true);
                                        jf7Var3.P1(j, 0L, arrayList3, null);
                                        jf7Var2 = jf7Var3;
                                        i2++;
                                    } catch (Exception e3) {
                                        e = e3;
                                        jf7Var2 = jf7Var3;
                                        jf7Var2.n(e, true);
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception e4) {
                            e = e4;
                            sQLiteCursor2 = queryFinalized;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                case 3:
                    jf7Var.getFileLoader().g(arrayList);
                    return;
                case 4:
                    if (jf7Var.getMessagesController().F1().p(arrayList)) {
                        jf7Var.getMessagesController().F1().k();
                        return;
                    }
                    return;
                case 5:
                    jf7Var.getFileLoader().g(arrayList);
                    return;
                case 6:
                    HashSet hashSet = new HashSet();
                    zh6 zh6Var2 = new zh6();
                    zh6 zh6Var3 = new zh6();
                    int i3 = 0;
                    boolean z2 = false;
                    while (i3 < arrayList.size()) {
                        gf7 gf7Var = (gf7) arrayList.get(i3);
                        TLRPC.TL_messageReactions tL_messageReactions = gf7Var.b;
                        long j2 = gf7Var.a;
                        TLRPC.TL_messageReactions tL_messageReactions2 = gf7Var.c;
                        zh6Var2.b();
                        zh6Var3.b();
                        if (tL_messageReactions != null && tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
                            int i4 = 0;
                            while (i4 < tL_messageReactions.results.size()) {
                                w49 d = w49.d(tL_messageReactions.results.get(i4).reaction);
                                zh6Var2.k(d.h, d);
                                i4++;
                                jf7Var = jf7Var;
                            }
                        }
                        jf7 jf7Var4 = jf7Var;
                        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
                            for (int i5 = 0; i5 < tL_messageReactions2.results.size(); i5++) {
                                w49 d2 = w49.d(tL_messageReactions2.results.get(i5).reaction);
                                zh6Var3.k(d2.h, d2);
                            }
                        }
                        for (int i6 = 0; i6 < zh6Var2.m(); i6++) {
                            long j3 = zh6Var2.j(i6);
                            w49 w49Var = (w49) zh6Var2.n(i6);
                            if (!zh6Var3.d(j3) && jf7Var4.getMessagesController().G5(j2, w49Var, false)) {
                                hashSet.add(Long.valueOf(j2));
                                z2 = true;
                            }
                        }
                        for (int i7 = 0; i7 < zh6Var3.m(); i7++) {
                            long j4 = zh6Var3.j(i7);
                            w49 w49Var2 = (w49) zh6Var3.n(i7);
                            if (!zh6Var2.d(j4) && jf7Var4.getMessagesController().G5(j2, w49Var2, true)) {
                                hashSet.add(Long.valueOf(j2));
                                z2 = true;
                            }
                        }
                        i3++;
                        jf7Var = jf7Var4;
                    }
                    jf7 jf7Var5 = jf7Var;
                    if (z2 && !hashSet.isEmpty()) {
                        jf7Var5.getMessagesController().F5(hashSet);
                        return;
                    }
                    return;
                case 7:
                    ArrayList arrayList4 = jf7Var.I;
                    arrayList4.clear();
                    SparseArray sparseArray = jf7Var.J;
                    sparseArray.clear();
                    arrayList4.addAll(arrayList);
                    while (i2 < arrayList.size()) {
                        ((ac7) arrayList.get(i2)).f = i2;
                        sparseArray.put(((ac7) arrayList.get(i2)).a, (ac7) arrayList.get(i2));
                        i2++;
                    }
                    jf7Var.w1();
                    return;
                case 8:
                    jf7Var.getFileLoader().g(arrayList);
                    return;
                case 9:
                    jf7Var.getNotificationCenter().k(7, arrayList, 0L, Boolean.FALSE);
                    return;
                case 10:
                    jf7Var.getNotificationCenter().k(59, arrayList);
                    return;
                case 11:
                    lq3 downloadController = jf7Var.getDownloadController();
                    downloadController.getClass();
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        mq3 mq3Var = (mq3) downloadController.h.get((Pair) arrayList.get(i8));
                        if (mq3Var != null) {
                            TLObject tLObject = mq3Var.a;
                            if (tLObject instanceof TLRPC.Document) {
                                downloadController.getFileLoader().f((TLRPC.Document) tLObject);
                            } else if ((tLObject instanceof TLRPC.Photo) && (w = xb4.w(((TLRPC.Photo) tLObject).sizes, hl.Y0(false), false, null, false)) != null) {
                                xb4 fileLoader = downloadController.getFileLoader();
                                fileLoader.getClass();
                                fileLoader.e(null, null, null, w.location, null, null);
                            }
                        }
                    }
                    return;
                case 12:
                    jf7Var.getFileLoader().g(arrayList);
                    return;
                case 13:
                    HashSet hashSet2 = new HashSet();
                    long[] jArr = new long[1];
                    int i9 = 0;
                    boolean z3 = false;
                    while (i9 < arrayList.size()) {
                        ls6 mediaDataController = jf7Var.getMediaDataController();
                        int intValue = ((Integer) arrayList.get(i9)).intValue();
                        ArrayList arrayList5 = mediaDataController.d1;
                        int i10 = 0;
                        while (true) {
                            if (i10 < arrayList5.size()) {
                                if (((r47) arrayList5.get(i10)).e1() == intValue) {
                                    r47Var = (r47) arrayList5.get(i10);
                                } else {
                                    i10++;
                                }
                            } else {
                                r47Var = null;
                            }
                        }
                        if (r47Var != null && r47.B0(r47Var.k) == mediaDataController.getUserConfig().e()) {
                            z = mediaDataController.getMessagesController().Q3(r47Var.k);
                            jArr[0] = r47.Q1(mediaDataController.getUserConfig().e(), r47Var.k);
                        } else {
                            z = false;
                        }
                        arrayList5.remove(r47Var);
                        if (z) {
                            hashSet2.add(Long.valueOf(jArr[0]));
                            z3 = true;
                        }
                        i9++;
                        z3 = z3;
                    }
                    if (z3) {
                        jf7Var.getMessagesController().F5(hashSet2);
                        return;
                    }
                    return;
                case 14:
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        jf7Var.getNotificationCenter().k(49, arrayList.get(i11));
                    }
                    return;
                case 15:
                    jf7Var.getFileLoader().g(arrayList);
                    return;
                case 16:
                    if (jf7Var.getMessagesController().F1().p(arrayList)) {
                        jf7Var.getMessagesController().F1().k();
                        return;
                    }
                    return;
                case 17:
                    try {
                        jf7Var.b.beginTransaction();
                        try {
                            executeFast = jf7Var.b.executeFast("UPDATE messages_v2 SET imp = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e6) {
                            e = e6;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e7) {
                        e = e7;
                    }
                    try {
                        int size2 = arrayList.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            TLRPC.Message message = (TLRPC.Message) arrayList.get(i12);
                            executeFast.requery();
                            int i13 = message.stickerVerified;
                            if (i13 == 0) {
                                i = 1;
                            } else if (i13 == 2) {
                                i = 2;
                            } else {
                                i = 0;
                            }
                            executeFast.bindInteger(1, i);
                            executeFast.bindInteger(2, message.id);
                            executeFast.bindLong(3, r47.B0(message));
                            executeFast.step();
                        }
                        executeFast.dispose();
                        jf7Var.b.commitTransaction();
                        return;
                    } catch (Exception e8) {
                        e = e8;
                        sQLitePreparedStatement = executeFast;
                        i2 = 1;
                        jf7Var.n(e, true);
                        if (i2 != 0 && (sQLiteDatabase2 = jf7Var.b) != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        th = th5;
                        sQLitePreparedStatement = executeFast;
                        i2 = 1;
                        if (i2 != 0 && (sQLiteDatabase = jf7Var.b) != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                case 18:
                    try {
                        String join2 = TextUtils.join(",", arrayList);
                        jf7Var.b.executeFast("DELETE FROM contacts WHERE uid IN(" + join2 + ")").stepThis().dispose();
                        return;
                    } catch (Exception e9) {
                        jf7Var.n(e9, true);
                        return;
                    }
                case 19:
                    jf7Var.getMessagesController().c4(arrayList, true);
                    return;
                case 20:
                    jf7Var.getMessagesController().j4(arrayList, true);
                    return;
                case 21:
                    int size3 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        Pair pair = (Pair) obj;
                        jf7Var.getMessagesController().y4(((Integer) pair.second).intValue(), ((Long) pair.first).longValue(), false);
                    }
                    return;
                case 22:
                    if (jf7Var.getMessagesController().F1().p(arrayList)) {
                        jf7Var.getMessagesController().F1().k();
                        return;
                    }
                    return;
                case 23:
                    int size4 = arrayList.size();
                    while (i2 < size4) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        jf7Var.getMessagesController().z3((r47) obj2);
                    }
                    return;
                default:
                    try {
                        jf7Var.b.executeFast("DELETE FROM quick_replies_messages WHERE topic_id IN (" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                        return;
                    } catch (Exception e10) {
                        cc4.g(e10, true);
                        return;
                    }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
