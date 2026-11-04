package org.telegram.messenger;

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
public final class fi implements Runnable {
    public final int f22494a;
    public final long f22495b;
    public final int f22496c;
    public final long d;
    public final int f22497e;
    public final dh.n0 f22498f;
    public final int h;
    public final int f22499n;
    public final int f22500r;
    public final int f22501s;
    public final li f22502w;

    public fi(li liVar, int i3, long j10, int i10, long j11, int i11, dh.n0 n0Var, int i12, int i13, int i14, boolean z10, int i15) {
        this.f22502w = liVar;
        this.f22494a = i3;
        this.f22495b = j10;
        this.f22496c = i10;
        this.d = j11;
        this.f22497e = i11;
        this.f22498f = n0Var;
        this.h = i12;
        this.f22499n = i13;
        this.f22500r = i14;
        this.f22501s = i15;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_messages tL_messages_messages;
        li liVar;
        int i3;
        int i10;
        int i11;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11;
        ArrayList arrayList;
        int i16;
        ArrayList arrayList2;
        SQLiteDatabase R;
        boolean C;
        TLRPC.TL_messages_messages tL_messages_messages2;
        dh.n0 n0Var;
        long j12;
        int i17;
        int i18;
        long j13;
        int i19;
        SQLiteDatabase sQLiteDatabase;
        dh.n0 n0Var2;
        int i20;
        SQLiteCursor queryFinalized;
        boolean z10;
        boolean z11;
        int i21;
        HashSet hashSet;
        TLRPC.TL_messages_messages tL_messages_messages3;
        ArrayList<TLRPC.Message> arrayList3;
        long j14;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j15;
        String str;
        String str2;
        int i22;
        boolean z12;
        String str3;
        String str4;
        String str5;
        String str6;
        int i23;
        SQLiteCursor queryFinalized2;
        int i24;
        int i25;
        int i26;
        SQLiteCursor queryFinalized3;
        int i27;
        boolean z13;
        int i28;
        int i29;
        SQLiteCursor queryFinalized4;
        int i30;
        long j16;
        int i31;
        SQLiteCursor queryFinalized5;
        int i32;
        SQLiteCursor queryFinalized6;
        SQLiteCursor sQLiteCursor;
        int intValue;
        SQLitePreparedStatement executeFast;
        int i33;
        fi fiVar = this;
        int i34 = fiVar.f22494a;
        int i35 = fiVar.f22499n;
        long j17 = fiVar.f22495b;
        li liVar2 = fiVar.f22502w;
        long e10 = liVar2.getUserConfig().e();
        TLRPC.TL_messages_messages tL_messages_messages4 = new TLRPC.TL_messages_messages();
        boolean z14 = false;
        try {
            ArrayList arrayList6 = new ArrayList();
            try {
                arrayList = new ArrayList();
                i16 = i34 + 1;
                arrayList2 = arrayList6;
                R = liVar2.getMessagesStorage().R();
                C = m5.C(j17);
                tL_messages_messages2 = tL_messages_messages4;
                n0Var = fiVar.f22498f;
                j12 = e10;
                i17 = fiVar.h;
                i18 = fiVar.f22496c;
                j13 = fiVar.d;
                i19 = fiVar.f22497e;
            } catch (Exception e11) {
                e = e11;
                tL_messages_messages = tL_messages_messages4;
            } catch (Throwable th2) {
                th = th2;
                tL_messages_messages = tL_messages_messages4;
            }
            try {
                if (!C) {
                    if (i18 != 0) {
                        str = " AND m.topic_id = ";
                        str2 = " AND type = ";
                        i22 = i17;
                        z12 = false;
                    } else {
                        int i36 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                        str = " AND m.topic_id = ";
                        if (i36 == 0) {
                            str2 = " AND type = ";
                            i22 = i17;
                            Locale locale = Locale.US;
                            i31 = 0;
                            queryFinalized5 = R.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + j17 + str2 + i19 + " AND start IN (0, 1)", new Object[0]);
                        } else {
                            Locale locale2 = Locale.US;
                            StringBuilder sb2 = new StringBuilder("SELECT start FROM media_holes_topics WHERE uid = ");
                            sb2.append(j17);
                            sb2.append(" AND topic_id = ");
                            sb2.append(j13);
                            str2 = " AND type = ";
                            sb2.append(str2);
                            sb2.append(i19);
                            sb2.append(" AND start IN (0, 1)");
                            i22 = i17;
                            queryFinalized5 = R.queryFinalized(sb2.toString(), new Object[0]);
                            i31 = 0;
                        }
                        if (queryFinalized5.next()) {
                            if (queryFinalized5.intValue(i31) == 1) {
                                z12 = true;
                                queryFinalized5.dispose();
                            }
                        } else {
                            queryFinalized5.dispose();
                            if (i36 != 0) {
                                Locale locale3 = Locale.US;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + j17 + " AND topic_id = " + j13 + str2 + i19 + " AND mid > 0", new Object[0]);
                                i32 = 0;
                            } else {
                                Locale locale4 = Locale.US;
                                i32 = 0;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + j17 + str2 + i19 + " AND mid > 0", new Object[0]);
                            }
                            SQLiteCursor sQLiteCursor2 = queryFinalized6;
                            if (sQLiteCursor2.next() && (intValue = sQLiteCursor2.intValue(i32)) != 0) {
                                if (i36 != 0) {
                                    executeFast = R.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                } else {
                                    executeFast = R.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                }
                                executeFast.requery();
                                executeFast.bindLong(1, j17);
                                if (i36 != 0) {
                                    executeFast.bindLong(2, j13);
                                    i33 = 3;
                                } else {
                                    i33 = 2;
                                }
                                executeFast.bindInteger(i33, i19);
                                sQLiteCursor = sQLiteCursor2;
                                executeFast.bindInteger(i33 + 1, 0);
                                executeFast.bindInteger(i33 + 2, intValue);
                                executeFast.step();
                                executeFast.dispose();
                            } else {
                                sQLiteCursor = sQLiteCursor2;
                            }
                            queryFinalized5 = sQLiteCursor;
                        }
                        z12 = false;
                        queryFinalized5.dispose();
                    }
                    if (n0Var != null) {
                        if (!TextUtils.isEmpty(n0Var.f9097f)) {
                            j16 = n0Var.f9097f.hashCode();
                        } else {
                            j16 = n0Var.f9098g;
                        }
                        str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                        str4 = "t.tag = " + j16 + " AND";
                    } else {
                        str3 = "";
                        str4 = "";
                    }
                    z11 = z12;
                    n0Var2 = n0Var;
                    if (i22 != 0) {
                        int i37 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                        String str7 = str4;
                        if (i37 != 0) {
                            Locale locale5 = Locale.US;
                            StringBuilder sb3 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                            sb3.append(j17);
                            sb3.append(" AND topic_id = ");
                            sb3.append(j13);
                            sb3.append(str2);
                            sb3.append(i19);
                            sb3.append(" AND start <= ");
                            i28 = i22;
                            sb3.append(i28);
                            sb3.append(" ORDER BY end DESC LIMIT 1");
                            queryFinalized4 = R.queryFinalized(sb3.toString(), new Object[0]);
                            i29 = 0;
                        } else {
                            i28 = i22;
                            Locale locale6 = Locale.US;
                            i29 = 0;
                            queryFinalized4 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j17 + str2 + i19 + " AND start <= " + i28 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                        }
                        if (queryFinalized4.next()) {
                            queryFinalized4.intValue(i29);
                            i30 = queryFinalized4.intValue(1);
                        } else {
                            i30 = 0;
                        }
                        queryFinalized4.dispose();
                        if (i37 != 0) {
                            if (i30 > 1) {
                                Locale locale7 = Locale.US;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.mid >= " + i30 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                z11 = false;
                                sQLiteDatabase = R;
                            } else {
                                Locale locale8 = Locale.US;
                                R = R;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                sQLiteDatabase = R;
                            }
                        } else if (i30 > 1) {
                            Locale locale9 = Locale.US;
                            R = R;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.mid >= " + i30 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            z11 = false;
                            sQLiteDatabase = R;
                        } else {
                            R = R;
                            Locale locale10 = Locale.US;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            sQLiteDatabase = R;
                        }
                    } else {
                        String str8 = str4;
                        if (i18 != 0) {
                            int i38 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                            if (i38 != 0) {
                                Locale locale11 = Locale.US;
                                StringBuilder sb4 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                                sb4.append(j17);
                                sb4.append(" AND topic_id = ");
                                sb4.append(j13);
                                sb4.append(str2);
                                sb4.append(i19);
                                sb4.append(" AND end >= ");
                                i25 = i18;
                                sb4.append(i25);
                                sb4.append(" ORDER BY end ASC LIMIT 1");
                                queryFinalized3 = R.queryFinalized(sb4.toString(), new Object[0]);
                                i26 = 0;
                            } else {
                                i25 = i18;
                                Locale locale12 = Locale.US;
                                i26 = 0;
                                queryFinalized3 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j17 + str2 + i19 + " AND end >= " + i25 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                            }
                            if (queryFinalized3.next()) {
                                i27 = queryFinalized3.intValue(i26);
                                queryFinalized3.intValue(1);
                            } else {
                                i27 = 0;
                            }
                            queryFinalized3.dispose();
                            if (i38 != 0) {
                                if (i27 > 1) {
                                    Locale locale13 = Locale.US;
                                    queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.mid <= " + i27 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    sQLiteDatabase = R;
                                    i18 = i25;
                                    z13 = true;
                                    z10 = z13;
                                    i20 = i18;
                                } else {
                                    Locale locale14 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    z11 = true;
                                    i18 = i25;
                                    z13 = true;
                                    z10 = z13;
                                    i20 = i18;
                                }
                            } else {
                                int i39 = i27;
                                if (i39 > 1) {
                                    Locale locale15 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.mid <= " + i39 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    i18 = i25;
                                    z13 = true;
                                    z10 = z13;
                                    i20 = i18;
                                } else {
                                    sQLiteDatabase = R;
                                    Locale locale16 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    z11 = true;
                                    i18 = i25;
                                    z13 = true;
                                    z10 = z13;
                                    i20 = i18;
                                }
                            }
                        } else {
                            sQLiteDatabase = R;
                            String str9 = str;
                            int i40 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                            if (i40 == 0) {
                                str5 = " AND m.type = ";
                                str6 = str9;
                                Locale locale17 = Locale.US;
                                i23 = 0;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + j17 + str2 + i19, new Object[0]);
                            } else {
                                Locale locale18 = Locale.US;
                                str5 = " AND m.type = ";
                                str6 = str9;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_topics WHERE uid = " + j17 + " AND topic_id = " + j13 + str2 + i19, new Object[0]);
                                i23 = 0;
                            }
                            if (queryFinalized2.next()) {
                                i24 = queryFinalized2.intValue(i23);
                            } else {
                                i24 = 0;
                            }
                            queryFinalized2.dispose();
                            if (i40 != 0) {
                                if (i24 > 1) {
                                    Locale locale19 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str6 + j13 + " AND m.mid >= " + i24 + str5 + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                } else {
                                    Locale locale20 = Locale.US;
                                    sQLiteDatabase = sQLiteDatabase;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str6 + j13 + " AND m.mid > 0 AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                }
                            } else {
                                String str10 = str5;
                                if (i24 > 1) {
                                    Locale locale21 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid >= " + i24 + str10 + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                } else {
                                    Locale locale22 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid > 0 AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                }
                            }
                        }
                    }
                    z13 = false;
                    z10 = z13;
                    i20 = i18;
                } else {
                    sQLiteDatabase = R;
                    n0Var2 = n0Var;
                    if (j13 != 0) {
                        if (i17 != 0) {
                            Locale locale23 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.topic_id = " + j13 + " AND m.mid > " + i17 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                            i20 = i18;
                        } else {
                            if (i18 != 0) {
                                Locale locale24 = Locale.US;
                                StringBuilder sb5 = new StringBuilder("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = ");
                                sb5.append(j17);
                                sb5.append(" AND m.topic_id = ");
                                sb5.append(j13);
                                sb5.append(" AND m.mid < ");
                                i21 = i18;
                                sb5.append(i21);
                                sb5.append(" AND type = ");
                                sb5.append(i19);
                                sb5.append(" ORDER BY m.mid DESC LIMIT ");
                                sb5.append(i16);
                                queryFinalized = sQLiteDatabase.queryFinalized(sb5.toString(), new Object[0]);
                            } else {
                                i21 = i18;
                                Locale locale25 = Locale.US;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.topic_id = " + j13 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                            }
                            i20 = i21;
                        }
                    } else {
                        i20 = i18;
                        if (i17 != 0) {
                            Locale locale26 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.mid > " + i17 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        } else if (i20 != 0) {
                            Locale locale27 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.mid < " + i20 + " AND type = " + i19 + " ORDER BY m.mid DESC LIMIT " + i16, new Object[0]);
                        } else {
                            Locale locale28 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        }
                    }
                    z10 = false;
                    z11 = true;
                }
                if (n0Var2 != null) {
                    hashSet = new HashSet();
                } else {
                    hashSet = null;
                }
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            j15 = j12;
                            TLdeserialize.readAttachPath(byteBufferValue, j15);
                            byteBufferValue.reuse();
                            TLdeserialize.f27022id = queryFinalized.intValue(1);
                            TLdeserialize.dialog_id = j17;
                            if (m5.C(j17)) {
                                TLdeserialize.random_id = queryFinalized.longValue(2);
                            }
                            long j18 = TLdeserialize.grouped_id;
                            if (j18 != 0 && hashSet != null) {
                                hashSet.add(Long.valueOf(j18));
                            }
                            if (z10) {
                                tL_messages_messages3 = tL_messages_messages2;
                                try {
                                    tL_messages_messages3.messages.add(0, TLdeserialize);
                                } catch (Exception e12) {
                                    e = e12;
                                    fiVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    liVar = liVar2;
                                    i35 = i35;
                                    try {
                                        tL_messages_messages.messages.clear();
                                        tL_messages_messages.chats.clear();
                                        tL_messages_messages.users.clear();
                                        a8.f(e);
                                        g0.h3(new k7(fiVar, fiVar, i35, 11));
                                        int i41 = fiVar.f22499n;
                                        int i42 = fiVar.f22501s;
                                        j11 = fiVar.f22495b;
                                        int i43 = fiVar.f22494a;
                                        i10 = i41;
                                        i3 = i42;
                                        i15 = i43;
                                        i14 = fiVar.h;
                                        i13 = fiVar.f22496c;
                                        i12 = fiVar.f22497e;
                                        j10 = fiVar.d;
                                        i11 = fiVar.f22500r;
                                        liVar.u1(tL_messages_messages, j11, i15, i14, i13, i12, j10, i11, i10, z14, i3);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        g0.h3(new k7(fiVar, fiVar, i35, 11));
                                        liVar.u1(tL_messages_messages, fiVar.f22495b, fiVar.f22494a, fiVar.h, fiVar.f22496c, fiVar.f22497e, fiVar.d, fiVar.f22500r, fiVar.f22499n, false, fiVar.f22501s);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    fiVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    liVar = liVar2;
                                    i35 = i35;
                                    g0.h3(new k7(fiVar, fiVar, i35, 11));
                                    liVar.u1(tL_messages_messages, fiVar.f22495b, fiVar.f22494a, fiVar.h, fiVar.f22496c, fiVar.f22497e, fiVar.d, fiVar.f22500r, fiVar.f22499n, false, fiVar.f22501s);
                                    throw th;
                                }
                            } else {
                                tL_messages_messages3 = tL_messages_messages2;
                                tL_messages_messages3.messages.add(TLdeserialize);
                            }
                            arrayList4 = arrayList;
                            arrayList5 = arrayList2;
                            qr.e(TLdeserialize, arrayList5, arrayList4, null);
                        } else {
                            arrayList4 = arrayList;
                            arrayList5 = arrayList2;
                            tL_messages_messages3 = tL_messages_messages2;
                            j15 = j12;
                        }
                        tL_messages_messages2 = tL_messages_messages3;
                        j12 = j15;
                        arrayList2 = arrayList5;
                        arrayList = arrayList4;
                    } catch (Exception e13) {
                        e = e13;
                        tL_messages_messages3 = tL_messages_messages2;
                        fiVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        liVar = liVar2;
                        i35 = i35;
                        tL_messages_messages.messages.clear();
                        tL_messages_messages.chats.clear();
                        tL_messages_messages.users.clear();
                        a8.f(e);
                        g0.h3(new k7(fiVar, fiVar, i35, 11));
                        int i412 = fiVar.f22499n;
                        int i422 = fiVar.f22501s;
                        j11 = fiVar.f22495b;
                        int i432 = fiVar.f22494a;
                        i10 = i412;
                        i3 = i422;
                        i15 = i432;
                        i14 = fiVar.h;
                        i13 = fiVar.f22496c;
                        i12 = fiVar.f22497e;
                        j10 = fiVar.d;
                        i11 = fiVar.f22500r;
                        liVar.u1(tL_messages_messages, j11, i15, i14, i13, i12, j10, i11, i10, z14, i3);
                    } catch (Throwable th5) {
                        th = th5;
                        tL_messages_messages3 = tL_messages_messages2;
                        fiVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        liVar = liVar2;
                        i35 = i35;
                        g0.h3(new k7(fiVar, fiVar, i35, 11));
                        liVar.u1(tL_messages_messages, fiVar.f22495b, fiVar.f22494a, fiVar.h, fiVar.f22496c, fiVar.f22497e, fiVar.d, fiVar.f22500r, fiVar.f22499n, false, fiVar.f22501s);
                        throw th;
                    }
                }
                ArrayList arrayList7 = arrayList;
                ArrayList arrayList8 = arrayList2;
                tL_messages_messages3 = tL_messages_messages2;
                long j19 = j12;
                queryFinalized.dispose();
                if (n0Var2 != null && !hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        long longValue = l10.longValue();
                        int i44 = 0;
                        while (true) {
                            if (i44 < tL_messages_messages3.messages.size()) {
                                j14 = j17;
                                if (tL_messages_messages3.messages.get(i44).grouped_id == longValue) {
                                    break;
                                }
                                i44++;
                                j17 = j14;
                            } else {
                                j14 = j17;
                                i44 = -1;
                                break;
                            }
                        }
                        if (i44 < 0) {
                            j17 = j14;
                        } else {
                            SQLiteCursor queryFinalized7 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(j14), l10);
                            ArrayList arrayList9 = new ArrayList();
                            while (queryFinalized7.next()) {
                                int intValue2 = queryFinalized7.intValue(1);
                                NativeByteBuffer byteBufferValue2 = queryFinalized7.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    Iterator it2 = it;
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, j19);
                                    byteBufferValue2.reuse();
                                    TLdeserialize2.f27022id = intValue2;
                                    long j20 = j14;
                                    TLdeserialize2.dialog_id = j20;
                                    arrayList9.add(TLdeserialize2);
                                    qr.e(TLdeserialize2, arrayList8, arrayList7, null);
                                    j14 = j20;
                                    it = it2;
                                }
                            }
                            Iterator it3 = it;
                            long j21 = j14;
                            if (z10) {
                                Collections.reverse(arrayList9);
                            }
                            tL_messages_messages3.messages.remove(i44);
                            tL_messages_messages3.messages.addAll(i44, arrayList9);
                            queryFinalized7.dispose();
                            j17 = j21;
                            it = it3;
                        }
                    }
                }
                if (!arrayList8.isEmpty()) {
                    liVar2.getMessagesStorage().m0(arrayList8, tL_messages_messages3.users);
                }
                if (!arrayList7.isEmpty()) {
                    liVar2.getMessagesStorage().Q(TextUtils.join(",", arrayList7), tL_messages_messages3.chats);
                }
                if (tL_messages_messages3.messages.size() > i34 && i20 == 0) {
                    tL_messages_messages3.messages.remove(arrayList3.size() - 1);
                } else if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                g0.h3(new k7(this, this, i35, 11));
                int i45 = this.f22499n;
                int i46 = this.f22501s;
                j11 = this.f22495b;
                int i47 = this.f22494a;
                i10 = i45;
                i3 = i46;
                i14 = this.h;
                i13 = this.f22496c;
                tL_messages_messages = tL_messages_messages3;
                i12 = this.f22497e;
                j10 = this.d;
                i11 = this.f22500r;
                liVar = liVar2;
                i15 = i47;
            } catch (Exception e14) {
                e = e14;
                fiVar = this;
                liVar = liVar2;
                i35 = i35;
                tL_messages_messages = tL_messages_messages2;
                tL_messages_messages.messages.clear();
                tL_messages_messages.chats.clear();
                tL_messages_messages.users.clear();
                a8.f(e);
                g0.h3(new k7(fiVar, fiVar, i35, 11));
                int i4122 = fiVar.f22499n;
                int i4222 = fiVar.f22501s;
                j11 = fiVar.f22495b;
                int i4322 = fiVar.f22494a;
                i10 = i4122;
                i3 = i4222;
                i15 = i4322;
                i14 = fiVar.h;
                i13 = fiVar.f22496c;
                i12 = fiVar.f22497e;
                j10 = fiVar.d;
                i11 = fiVar.f22500r;
                liVar.u1(tL_messages_messages, j11, i15, i14, i13, i12, j10, i11, i10, z14, i3);
            } catch (Throwable th6) {
                th = th6;
                fiVar = this;
                liVar = liVar2;
                i35 = i35;
                tL_messages_messages = tL_messages_messages2;
                g0.h3(new k7(fiVar, fiVar, i35, 11));
                liVar.u1(tL_messages_messages, fiVar.f22495b, fiVar.f22494a, fiVar.h, fiVar.f22496c, fiVar.f22497e, fiVar.d, fiVar.f22500r, fiVar.f22499n, false, fiVar.f22501s);
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            tL_messages_messages = tL_messages_messages4;
            liVar = liVar2;
        } catch (Throwable th7) {
            th = th7;
            tL_messages_messages = tL_messages_messages4;
            liVar = liVar2;
        }
        liVar.u1(tL_messages_messages, j11, i15, i14, i13, i12, j10, i11, i10, z14, i3);
    }
}
