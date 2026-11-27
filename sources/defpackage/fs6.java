package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class fs6 implements Runnable {
    public final byte a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final w49 f;
    public final int h;
    public final int n;
    public final boolean r;
    public final int s;
    public final ls6 w;

    public fs6(ls6 ls6Var, int i, long j, int i2, long j2, int i3, w49 w49Var, int i4, int i5, int i6, boolean z, int i7) {
        this.w = ls6Var;
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = j2;
        this.e = i3;
        this.f = w49Var;
        this.h = i4;
        this.n = i5;
        this.r = i6;
        this.s = i7;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_messages tL_messages_messages;
        ls6 ls6Var;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        byte b;
        long j2;
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        SQLiteDatabase sQLiteDatabase;
        boolean B;
        TLRPC.TL_messages_messages tL_messages_messages2;
        w49 w49Var;
        long j3;
        int i8;
        int i9;
        long j4;
        int i10;
        SQLiteDatabase sQLiteDatabase2;
        w49 w49Var2;
        int i11;
        SQLiteCursor queryFinalized;
        boolean z;
        boolean z2;
        int i12;
        HashSet hashSet;
        TLRPC.TL_messages_messages tL_messages_messages3;
        ArrayList<TLRPC.Message> arrayList3;
        long j5;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j6;
        String str;
        String str2;
        int i13;
        boolean z3;
        String str3;
        String str4;
        String str5;
        String str6;
        int i14;
        SQLiteCursor queryFinalized2;
        int i15;
        int i16;
        int i17;
        SQLiteCursor queryFinalized3;
        int i18;
        boolean z4;
        int i19;
        int i20;
        SQLiteCursor queryFinalized4;
        int i21;
        long j7;
        int i22;
        SQLiteCursor queryFinalized5;
        int i23;
        SQLiteCursor queryFinalized6;
        SQLiteCursor sQLiteCursor;
        int intValue;
        SQLitePreparedStatement executeFast;
        int i24;
        fs6 fs6Var = this;
        byte b2 = fs6Var.a;
        int i25 = fs6Var.n;
        long j8 = fs6Var.b;
        ls6 ls6Var2 = fs6Var.w;
        long e = ls6Var2.getUserConfig().e();
        TLRPC.TL_messages_messages tL_messages_messages4 = new TLRPC.TL_messages_messages();
        boolean z5 = false;
        try {
            ArrayList arrayList6 = new ArrayList();
            try {
                arrayList = new ArrayList();
                i7 = b2 + 1;
                arrayList2 = arrayList6;
                sQLiteDatabase = ls6Var2.getMessagesStorage().b;
                B = wf3.B(j8);
                tL_messages_messages2 = tL_messages_messages4;
                w49Var = fs6Var.f;
                j3 = e;
                i8 = fs6Var.h;
                i9 = fs6Var.c;
                j4 = fs6Var.d;
                i10 = fs6Var.e;
            } catch (Exception e2) {
                e = e2;
                tL_messages_messages = tL_messages_messages4;
            } catch (Throwable th) {
                th = th;
                tL_messages_messages = tL_messages_messages4;
            }
        } catch (Exception e3) {
            e = e3;
            tL_messages_messages = tL_messages_messages4;
            ls6Var = ls6Var2;
        } catch (Throwable th2) {
            th = th2;
            tL_messages_messages = tL_messages_messages4;
            ls6Var = ls6Var2;
        }
        try {
            if (!B) {
                if (i9 != 0) {
                    str = " AND m.topic_id = ";
                    str2 = " AND type = ";
                    i13 = i8;
                    z3 = false;
                } else {
                    int i26 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                    str = " AND m.topic_id = ";
                    if (i26 == 0) {
                        str2 = " AND type = ";
                        i13 = i8;
                        Locale locale = Locale.US;
                        i22 = 0;
                        queryFinalized5 = sQLiteDatabase.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + j8 + str2 + i10 + " AND start IN (0, 1)", new Object[0]);
                    } else {
                        Locale locale2 = Locale.US;
                        StringBuilder sb = new StringBuilder("SELECT start FROM media_holes_topics WHERE uid = ");
                        sb.append(j8);
                        sb.append(" AND topic_id = ");
                        sb.append(j4);
                        str2 = " AND type = ";
                        sb.append(str2);
                        sb.append(i10);
                        sb.append(" AND start IN (0, 1)");
                        i13 = i8;
                        queryFinalized5 = sQLiteDatabase.queryFinalized(sb.toString(), new Object[0]);
                        i22 = 0;
                    }
                    if (queryFinalized5.next()) {
                        if (queryFinalized5.intValue(i22) == 1) {
                            z3 = true;
                            queryFinalized5.dispose();
                        }
                    } else {
                        queryFinalized5.dispose();
                        if (i26 != 0) {
                            queryFinalized6 = sQLiteDatabase.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + j8 + " AND topic_id = " + j4 + str2 + i10 + " AND mid > 0", new Object[0]);
                            i23 = 0;
                        } else {
                            i23 = 0;
                            queryFinalized6 = sQLiteDatabase.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + j8 + str2 + i10 + " AND mid > 0", new Object[0]);
                        }
                        SQLiteCursor sQLiteCursor2 = queryFinalized6;
                        if (sQLiteCursor2.next() && (intValue = sQLiteCursor2.intValue(i23)) != 0) {
                            if (i26 != 0) {
                                executeFast = sQLiteDatabase.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                            } else {
                                executeFast = sQLiteDatabase.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                            }
                            executeFast.requery();
                            executeFast.bindLong(1, j8);
                            if (i26 != 0) {
                                executeFast.bindLong(2, j4);
                                i24 = 3;
                            } else {
                                i24 = 2;
                            }
                            executeFast.bindInteger(i24, i10);
                            sQLiteCursor = sQLiteCursor2;
                            executeFast.bindInteger(i24 + 1, 0);
                            executeFast.bindInteger(i24 + 2, intValue);
                            executeFast.step();
                            executeFast.dispose();
                        } else {
                            sQLiteCursor = sQLiteCursor2;
                        }
                        queryFinalized5 = sQLiteCursor;
                    }
                    z3 = false;
                    queryFinalized5.dispose();
                }
                if (w49Var != null) {
                    if (!TextUtils.isEmpty(w49Var.f)) {
                        j7 = w49Var.f.hashCode();
                    } else {
                        j7 = w49Var.g;
                    }
                    str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                    str4 = "t.tag = " + j7 + " AND";
                } else {
                    str3 = "";
                    str4 = "";
                }
                z2 = z3;
                w49Var2 = w49Var;
                if (i13 != 0) {
                    int i27 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                    String str7 = str4;
                    if (i27 != 0) {
                        Locale locale3 = Locale.US;
                        StringBuilder sb2 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                        sb2.append(j8);
                        sb2.append(" AND topic_id = ");
                        sb2.append(j4);
                        sb2.append(str2);
                        sb2.append(i10);
                        sb2.append(" AND start <= ");
                        i19 = i13;
                        sb2.append(i19);
                        sb2.append(" ORDER BY end DESC LIMIT 1");
                        queryFinalized4 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                        i20 = 0;
                    } else {
                        i19 = i13;
                        Locale locale4 = Locale.US;
                        i20 = 0;
                        queryFinalized4 = sQLiteDatabase.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j8 + str2 + i10 + " AND start <= " + i19 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                    }
                    if (queryFinalized4.next()) {
                        queryFinalized4.intValue(i20);
                        i21 = queryFinalized4.intValue(1);
                    } else {
                        i21 = 0;
                    }
                    queryFinalized4.dispose();
                    if (i27 != 0) {
                        if (i21 > 1) {
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j8 + str + j4 + " AND m.mid > 0 AND m.mid < " + i19 + " AND m.mid >= " + i21 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            z2 = false;
                            sQLiteDatabase2 = sQLiteDatabase;
                        } else {
                            sQLiteDatabase = sQLiteDatabase;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j8 + str + j4 + " AND m.mid > 0 AND m.mid < " + i19 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            sQLiteDatabase2 = sQLiteDatabase;
                        }
                    } else if (i21 > 1) {
                        sQLiteDatabase = sQLiteDatabase;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j8 + " AND m.mid > 0 AND m.mid < " + i19 + " AND m.mid >= " + i21 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                        z2 = false;
                        sQLiteDatabase2 = sQLiteDatabase;
                    } else {
                        sQLiteDatabase = sQLiteDatabase;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j8 + " AND m.mid > 0 AND m.mid < " + i19 + " AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                        sQLiteDatabase2 = sQLiteDatabase;
                    }
                } else {
                    String str8 = str4;
                    if (i9 != 0) {
                        int i28 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                        if (i28 != 0) {
                            Locale locale5 = Locale.US;
                            StringBuilder sb3 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                            sb3.append(j8);
                            sb3.append(" AND topic_id = ");
                            sb3.append(j4);
                            sb3.append(str2);
                            sb3.append(i10);
                            sb3.append(" AND end >= ");
                            i16 = i9;
                            sb3.append(i16);
                            sb3.append(" ORDER BY end ASC LIMIT 1");
                            queryFinalized3 = sQLiteDatabase.queryFinalized(sb3.toString(), new Object[0]);
                            i17 = 0;
                        } else {
                            i16 = i9;
                            Locale locale6 = Locale.US;
                            i17 = 0;
                            queryFinalized3 = sQLiteDatabase.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j8 + str2 + i10 + " AND end >= " + i16 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                        }
                        if (queryFinalized3.next()) {
                            i18 = queryFinalized3.intValue(i17);
                            queryFinalized3.intValue(1);
                        } else {
                            i18 = 0;
                        }
                        queryFinalized3.dispose();
                        if (i28 != 0) {
                            if (i18 > 1) {
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + str + j4 + " AND m.mid > 0 AND m.mid >= " + i16 + " AND m.mid <= " + i18 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                                sQLiteDatabase2 = sQLiteDatabase;
                                i9 = i16;
                                z4 = true;
                                z = z4;
                                i11 = i9;
                            } else {
                                sQLiteDatabase2 = sQLiteDatabase;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + str + j4 + " AND m.mid > 0 AND m.mid >= " + i16 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                                z2 = true;
                                i9 = i16;
                                z4 = true;
                                z = z4;
                                i11 = i9;
                            }
                        } else {
                            int i29 = i18;
                            if (i29 > 1) {
                                sQLiteDatabase2 = sQLiteDatabase;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + " AND m.mid > 0 AND m.mid >= " + i16 + " AND m.mid <= " + i29 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                                i9 = i16;
                                z4 = true;
                                z = z4;
                                i11 = i9;
                            } else {
                                sQLiteDatabase2 = sQLiteDatabase;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + " AND m.mid > 0 AND m.mid >= " + i16 + " AND m.type = " + i10 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i7, new Object[0]);
                                z2 = true;
                                i9 = i16;
                                z4 = true;
                                z = z4;
                                i11 = i9;
                            }
                        }
                    } else {
                        sQLiteDatabase2 = sQLiteDatabase;
                        String str9 = str;
                        int i30 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                        if (i30 == 0) {
                            str5 = " AND m.type = ";
                            str6 = str9;
                            Locale locale7 = Locale.US;
                            i14 = 0;
                            queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + j8 + str2 + i10, new Object[0]);
                        } else {
                            Locale locale8 = Locale.US;
                            str5 = " AND m.type = ";
                            str6 = str9;
                            queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT max(end) FROM media_holes_topics WHERE uid = " + j8 + " AND topic_id = " + j4 + str2 + i10, new Object[0]);
                            i14 = 0;
                        }
                        if (queryFinalized2.next()) {
                            i15 = queryFinalized2.intValue(i14);
                        } else {
                            i15 = 0;
                        }
                        queryFinalized2.dispose();
                        if (i30 != 0) {
                            if (i15 > 1) {
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + str6 + j4 + " AND m.mid >= " + i15 + str5 + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            } else {
                                sQLiteDatabase2 = sQLiteDatabase2;
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + str6 + j4 + " AND m.mid > 0 AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            }
                        } else {
                            String str10 = str5;
                            if (i15 > 1) {
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + " AND m.mid >= " + i15 + str10 + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            } else {
                                queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j8 + " AND m.mid > 0 AND m.type = " + i10 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i7, new Object[0]);
                            }
                        }
                    }
                }
                z4 = false;
                z = z4;
                i11 = i9;
            } else {
                sQLiteDatabase2 = sQLiteDatabase;
                w49Var2 = w49Var;
                if (j4 != 0) {
                    if (i8 != 0) {
                        Locale locale9 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j8 + " AND m.topic_id = " + j4 + " AND m.mid > " + i8 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                        i11 = i9;
                    } else {
                        if (i9 != 0) {
                            Locale locale10 = Locale.US;
                            StringBuilder sb4 = new StringBuilder("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = ");
                            sb4.append(j8);
                            sb4.append(" AND m.topic_id = ");
                            sb4.append(j4);
                            sb4.append(" AND m.mid < ");
                            i12 = i9;
                            sb4.append(i12);
                            sb4.append(" AND type = ");
                            sb4.append(i10);
                            sb4.append(" ORDER BY m.mid DESC LIMIT ");
                            sb4.append(i7);
                            queryFinalized = sQLiteDatabase2.queryFinalized(sb4.toString(), new Object[0]);
                        } else {
                            i12 = i9;
                            Locale locale11 = Locale.US;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j8 + " AND m.topic_id = " + j4 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                        }
                        i11 = i12;
                    }
                } else {
                    i11 = i9;
                    if (i8 != 0) {
                        Locale locale12 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j8 + " AND m.mid > " + i8 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                    } else if (i11 != 0) {
                        Locale locale13 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j8 + " AND m.mid < " + i11 + " AND type = " + i10 + " ORDER BY m.mid DESC LIMIT " + i7, new Object[0]);
                    } else {
                        Locale locale14 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j8 + " AND type = " + i10 + " ORDER BY m.mid ASC LIMIT " + i7, new Object[0]);
                    }
                }
                z = false;
                z2 = true;
            }
            if (w49Var2 != null) {
                hashSet = new HashSet();
            } else {
                hashSet = null;
            }
            while (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        j6 = j3;
                        TLdeserialize.readAttachPath(byteBufferValue, j6);
                        byteBufferValue.reuse();
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j8;
                        if (wf3.B(j8)) {
                            TLdeserialize.random_id = queryFinalized.longValue(2);
                        }
                        long j9 = TLdeserialize.grouped_id;
                        if (j9 != 0 && hashSet != null) {
                            hashSet.add(Long.valueOf(j9));
                        }
                        tL_messages_messages3 = tL_messages_messages2;
                        try {
                            ArrayList<TLRPC.Message> arrayList7 = tL_messages_messages3.messages;
                            if (z) {
                                arrayList7.add(0, TLdeserialize);
                            } else {
                                arrayList7.add(TLdeserialize);
                            }
                            arrayList4 = arrayList;
                            arrayList5 = arrayList2;
                            jf7.d(TLdeserialize, arrayList5, arrayList4, null);
                        } catch (Exception e4) {
                            e = e4;
                            fs6Var = this;
                            tL_messages_messages = tL_messages_messages3;
                            ls6Var = ls6Var2;
                            i25 = i25;
                            try {
                                tL_messages_messages.messages.clear();
                                tL_messages_messages.chats.clear();
                                tL_messages_messages.users.clear();
                                cc4.f(e);
                                hl.c3(new l65(fs6Var, fs6Var, i25, (byte) 8));
                                int i31 = fs6Var.n;
                                int i32 = fs6Var.s;
                                j2 = fs6Var.b;
                                byte b3 = fs6Var.a;
                                int i33 = fs6Var.h;
                                int i34 = fs6Var.c;
                                int i35 = fs6Var.e;
                                long j10 = fs6Var.d;
                                i2 = i31;
                                i3 = fs6Var.r ? 1 : 0;
                                i = i32;
                                b = b3;
                                i6 = i33;
                                i5 = i34;
                                i4 = i35;
                                j = j10;
                                ls6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
                            } catch (Throwable th3) {
                                th = th3;
                                hl.c3(new l65(fs6Var, fs6Var, i25, (byte) 8));
                                ls6Var.v1(tL_messages_messages, fs6Var.b, fs6Var.a, fs6Var.h, fs6Var.c, fs6Var.e, fs6Var.d, fs6Var.r ? 1 : 0, fs6Var.n, false, fs6Var.s);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            fs6Var = this;
                            tL_messages_messages = tL_messages_messages3;
                            ls6Var = ls6Var2;
                            i25 = i25;
                            hl.c3(new l65(fs6Var, fs6Var, i25, (byte) 8));
                            ls6Var.v1(tL_messages_messages, fs6Var.b, fs6Var.a, fs6Var.h, fs6Var.c, fs6Var.e, fs6Var.d, fs6Var.r ? 1 : 0, fs6Var.n, false, fs6Var.s);
                            throw th;
                        }
                    } else {
                        arrayList4 = arrayList;
                        arrayList5 = arrayList2;
                        tL_messages_messages3 = tL_messages_messages2;
                        j6 = j3;
                    }
                    tL_messages_messages2 = tL_messages_messages3;
                    j3 = j6;
                    arrayList2 = arrayList5;
                    arrayList = arrayList4;
                } catch (Exception e5) {
                    e = e5;
                    tL_messages_messages3 = tL_messages_messages2;
                    fs6Var = this;
                    tL_messages_messages = tL_messages_messages3;
                    ls6Var = ls6Var2;
                    i25 = i25;
                    tL_messages_messages.messages.clear();
                    tL_messages_messages.chats.clear();
                    tL_messages_messages.users.clear();
                    cc4.f(e);
                    hl.c3(new l65(fs6Var, fs6Var, i25, (byte) 8));
                    int i312 = fs6Var.n;
                    int i322 = fs6Var.s;
                    j2 = fs6Var.b;
                    byte b32 = fs6Var.a;
                    int i332 = fs6Var.h;
                    int i342 = fs6Var.c;
                    int i352 = fs6Var.e;
                    long j102 = fs6Var.d;
                    i2 = i312;
                    i3 = fs6Var.r ? 1 : 0;
                    i = i322;
                    b = b32;
                    i6 = i332;
                    i5 = i342;
                    i4 = i352;
                    j = j102;
                    ls6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
                } catch (Throwable th5) {
                    th = th5;
                    tL_messages_messages3 = tL_messages_messages2;
                    fs6Var = this;
                    tL_messages_messages = tL_messages_messages3;
                    ls6Var = ls6Var2;
                    i25 = i25;
                    hl.c3(new l65(fs6Var, fs6Var, i25, (byte) 8));
                    ls6Var.v1(tL_messages_messages, fs6Var.b, fs6Var.a, fs6Var.h, fs6Var.c, fs6Var.e, fs6Var.d, fs6Var.r ? 1 : 0, fs6Var.n, false, fs6Var.s);
                    throw th;
                }
            }
            ArrayList arrayList8 = arrayList;
            ArrayList arrayList9 = arrayList2;
            tL_messages_messages3 = tL_messages_messages2;
            long j11 = j3;
            queryFinalized.dispose();
            if (w49Var2 != null && !hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Long l = (Long) it.next();
                    long longValue = l.longValue();
                    int i36 = 0;
                    while (true) {
                        if (i36 < tL_messages_messages3.messages.size()) {
                            j5 = j8;
                            if (tL_messages_messages3.messages.get(i36).grouped_id == longValue) {
                                break;
                            }
                            i36++;
                            j8 = j5;
                        } else {
                            j5 = j8;
                            i36 = -1;
                            break;
                        }
                    }
                    if (i36 < 0) {
                        j8 = j5;
                    } else {
                        SQLiteCursor queryFinalized7 = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(j5), l);
                        ArrayList arrayList10 = new ArrayList();
                        while (queryFinalized7.next()) {
                            int intValue2 = queryFinalized7.intValue(1);
                            NativeByteBuffer byteBufferValue2 = queryFinalized7.byteBufferValue(0);
                            if (byteBufferValue2 != null) {
                                Iterator it2 = it;
                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                TLdeserialize2.readAttachPath(byteBufferValue2, j11);
                                byteBufferValue2.reuse();
                                TLdeserialize2.id = intValue2;
                                long j12 = j5;
                                TLdeserialize2.dialog_id = j12;
                                arrayList10.add(TLdeserialize2);
                                jf7.d(TLdeserialize2, arrayList9, arrayList8, null);
                                j5 = j12;
                                it = it2;
                            }
                        }
                        Iterator it3 = it;
                        long j13 = j5;
                        if (z) {
                            Collections.reverse(arrayList10);
                        }
                        tL_messages_messages3.messages.remove(i36);
                        tL_messages_messages3.messages.addAll(i36, arrayList10);
                        queryFinalized7.dispose();
                        j8 = j13;
                        it = it3;
                    }
                }
            }
            if (!arrayList9.isEmpty()) {
                ls6Var2.getMessagesStorage().j0(arrayList9, tL_messages_messages3.users);
            }
            if (!arrayList8.isEmpty()) {
                ls6Var2.getMessagesStorage().P(TextUtils.join(",", arrayList8), tL_messages_messages3.chats);
            }
            if (tL_messages_messages3.messages.size() > b2 && i11 == 0) {
                tL_messages_messages3.messages.remove(arrayList3.size() - 1);
            } else if (i11 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            hl.c3(new l65(this, this, i25, (byte) 8));
            int i37 = this.n;
            int i38 = this.s;
            j2 = this.b;
            byte b4 = this.a;
            int i39 = this.h;
            int i40 = this.c;
            int i41 = this.e;
            long j14 = this.d;
            i2 = i37;
            i3 = this.r ? 1 : 0;
            i = i38;
            i6 = i39;
            i5 = i40;
            tL_messages_messages = tL_messages_messages3;
            i4 = i41;
            j = j14;
            ls6Var = ls6Var2;
            b = b4;
        } catch (Exception e6) {
            e = e6;
            fs6Var = this;
            ls6Var = ls6Var2;
            i25 = i25;
            tL_messages_messages = tL_messages_messages2;
            tL_messages_messages.messages.clear();
            tL_messages_messages.chats.clear();
            tL_messages_messages.users.clear();
            cc4.f(e);
            hl.c3(new l65(fs6Var, fs6Var, i25, (byte) 8));
            int i3122 = fs6Var.n;
            int i3222 = fs6Var.s;
            j2 = fs6Var.b;
            byte b322 = fs6Var.a;
            int i3322 = fs6Var.h;
            int i3422 = fs6Var.c;
            int i3522 = fs6Var.e;
            long j1022 = fs6Var.d;
            i2 = i3122;
            i3 = fs6Var.r ? 1 : 0;
            i = i3222;
            b = b322;
            i6 = i3322;
            i5 = i3422;
            i4 = i3522;
            j = j1022;
            ls6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
        } catch (Throwable th6) {
            th = th6;
            fs6Var = this;
            ls6Var = ls6Var2;
            i25 = i25;
            tL_messages_messages = tL_messages_messages2;
            hl.c3(new l65(fs6Var, fs6Var, i25, (byte) 8));
            ls6Var.v1(tL_messages_messages, fs6Var.b, fs6Var.a, fs6Var.h, fs6Var.c, fs6Var.e, fs6Var.d, fs6Var.r ? 1 : 0, fs6Var.n, false, fs6Var.s);
            throw th;
        }
        ls6Var.v1(tL_messages_messages, j2, b, i6, i5, i4, j, i3, i2, z5, i);
    }
}
