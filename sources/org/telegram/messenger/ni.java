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
public final class ni implements Runnable {
    public final int f17106a;
    public final long f17107b;
    public final int f17108c;
    public final long d;
    public final int e;
    public final sg.o0 f17109f;
    public final int h;
    public final int f17110n;
    public final int f17111r;
    public final int f17112s;
    public final ui f17113w;

    public ni(ui uiVar, int i10, long j10, int i11, long j11, int i12, sg.o0 o0Var, int i13, int i14, int i15, boolean z10, int i16) {
        this.f17113w = uiVar;
        this.f17106a = i10;
        this.f17107b = j10;
        this.f17108c = i11;
        this.d = j11;
        this.e = i12;
        this.f17109f = o0Var;
        this.h = i13;
        this.f17110n = i14;
        this.f17111r = i15;
        this.f17112s = i16;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_messages tL_messages_messages;
        ui uiVar;
        int i10;
        int i11;
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        long j11;
        ArrayList arrayList;
        int i17;
        ArrayList arrayList2;
        SQLiteDatabase R;
        boolean C;
        TLRPC.TL_messages_messages tL_messages_messages2;
        sg.o0 o0Var;
        long j12;
        int i18;
        int i19;
        long j13;
        int i20;
        SQLiteDatabase sQLiteDatabase;
        sg.o0 o0Var2;
        int i21;
        SQLiteCursor queryFinalized;
        boolean z10;
        boolean z11;
        int i22;
        HashSet hashSet;
        TLRPC.TL_messages_messages tL_messages_messages3;
        ArrayList<TLRPC.Message> arrayList3;
        long j14;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j15;
        String str;
        String str2;
        int i23;
        boolean z12;
        String str3;
        String str4;
        String str5;
        String str6;
        int i24;
        SQLiteCursor queryFinalized2;
        int i25;
        int i26;
        int i27;
        SQLiteCursor queryFinalized3;
        int i28;
        boolean z13;
        int i29;
        int i30;
        SQLiteCursor queryFinalized4;
        int i31;
        long j16;
        int i32;
        SQLiteCursor queryFinalized5;
        int i33;
        SQLiteCursor queryFinalized6;
        SQLiteCursor sQLiteCursor;
        int intValue;
        SQLitePreparedStatement executeFast;
        int i34;
        ni niVar = this;
        int i35 = niVar.f17106a;
        int i36 = niVar.f17110n;
        long j17 = niVar.f17107b;
        ui uiVar2 = niVar.f17113w;
        long e = uiVar2.getUserConfig().e();
        TLRPC.TL_messages_messages tL_messages_messages4 = new TLRPC.TL_messages_messages();
        boolean z14 = false;
        try {
            ArrayList arrayList6 = new ArrayList();
            try {
                arrayList = new ArrayList();
                i17 = i35 + 1;
                arrayList2 = arrayList6;
                R = uiVar2.getMessagesStorage().R();
                C = o5.C(j17);
                tL_messages_messages2 = tL_messages_messages4;
                o0Var = niVar.f17109f;
                j12 = e;
                i18 = niVar.h;
                i19 = niVar.f17108c;
                j13 = niVar.d;
                i20 = niVar.e;
            } catch (Exception e7) {
                e = e7;
                tL_messages_messages = tL_messages_messages4;
            } catch (Throwable th2) {
                th = th2;
                tL_messages_messages = tL_messages_messages4;
            }
            try {
                if (!C) {
                    if (i19 != 0) {
                        str = " AND m.topic_id = ";
                        str2 = " AND type = ";
                        i23 = i18;
                        z12 = false;
                    } else {
                        int i37 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                        str = " AND m.topic_id = ";
                        if (i37 == 0) {
                            str2 = " AND type = ";
                            i23 = i18;
                            Locale locale = Locale.US;
                            i32 = 0;
                            queryFinalized5 = R.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + j17 + str2 + i20 + " AND start IN (0, 1)", new Object[0]);
                        } else {
                            Locale locale2 = Locale.US;
                            StringBuilder sb2 = new StringBuilder("SELECT start FROM media_holes_topics WHERE uid = ");
                            sb2.append(j17);
                            sb2.append(" AND topic_id = ");
                            sb2.append(j13);
                            str2 = " AND type = ";
                            sb2.append(str2);
                            sb2.append(i20);
                            sb2.append(" AND start IN (0, 1)");
                            i23 = i18;
                            queryFinalized5 = R.queryFinalized(sb2.toString(), new Object[0]);
                            i32 = 0;
                        }
                        if (queryFinalized5.next()) {
                            if (queryFinalized5.intValue(i32) == 1) {
                                z12 = true;
                                queryFinalized5.dispose();
                            }
                        } else {
                            queryFinalized5.dispose();
                            if (i37 != 0) {
                                Locale locale3 = Locale.US;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + j17 + " AND topic_id = " + j13 + str2 + i20 + " AND mid > 0", new Object[0]);
                                i33 = 0;
                            } else {
                                Locale locale4 = Locale.US;
                                i33 = 0;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + j17 + str2 + i20 + " AND mid > 0", new Object[0]);
                            }
                            SQLiteCursor sQLiteCursor2 = queryFinalized6;
                            if (sQLiteCursor2.next() && (intValue = sQLiteCursor2.intValue(i33)) != 0) {
                                if (i37 != 0) {
                                    executeFast = R.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                } else {
                                    executeFast = R.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                }
                                executeFast.requery();
                                executeFast.bindLong(1, j17);
                                if (i37 != 0) {
                                    executeFast.bindLong(2, j13);
                                    i34 = 3;
                                } else {
                                    i34 = 2;
                                }
                                executeFast.bindInteger(i34, i20);
                                sQLiteCursor = sQLiteCursor2;
                                executeFast.bindInteger(i34 + 1, 0);
                                executeFast.bindInteger(i34 + 2, intValue);
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
                    if (o0Var != null) {
                        if (!TextUtils.isEmpty(o0Var.f48434f)) {
                            j16 = o0Var.f48434f.hashCode();
                        } else {
                            j16 = o0Var.f48435g;
                        }
                        str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                        str4 = "t.tag = " + j16 + " AND";
                    } else {
                        str3 = "";
                        str4 = "";
                    }
                    z11 = z12;
                    o0Var2 = o0Var;
                    if (i23 != 0) {
                        int i38 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                        String str7 = str4;
                        if (i38 != 0) {
                            Locale locale5 = Locale.US;
                            StringBuilder sb3 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                            sb3.append(j17);
                            sb3.append(" AND topic_id = ");
                            sb3.append(j13);
                            sb3.append(str2);
                            sb3.append(i20);
                            sb3.append(" AND start <= ");
                            i29 = i23;
                            sb3.append(i29);
                            sb3.append(" ORDER BY end DESC LIMIT 1");
                            queryFinalized4 = R.queryFinalized(sb3.toString(), new Object[0]);
                            i30 = 0;
                        } else {
                            i29 = i23;
                            Locale locale6 = Locale.US;
                            i30 = 0;
                            queryFinalized4 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j17 + str2 + i20 + " AND start <= " + i29 + " ORDER BY end DESC LIMIT 1", new Object[0]);
                        }
                        if (queryFinalized4.next()) {
                            queryFinalized4.intValue(i30);
                            i31 = queryFinalized4.intValue(1);
                        } else {
                            i31 = 0;
                        }
                        queryFinalized4.dispose();
                        if (i38 != 0) {
                            if (i31 > 1) {
                                Locale locale7 = Locale.US;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid < " + i29 + " AND m.mid >= " + i31 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                z11 = false;
                                sQLiteDatabase = R;
                            } else {
                                Locale locale8 = Locale.US;
                                R = R;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid < " + i29 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                sQLiteDatabase = R;
                            }
                        } else if (i31 > 1) {
                            Locale locale9 = Locale.US;
                            R = R;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid < " + i29 + " AND m.mid >= " + i31 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                            z11 = false;
                            sQLiteDatabase = R;
                        } else {
                            R = R;
                            Locale locale10 = Locale.US;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid < " + i29 + " AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                            sQLiteDatabase = R;
                        }
                    } else {
                        String str8 = str4;
                        if (i19 != 0) {
                            int i39 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                            if (i39 != 0) {
                                Locale locale11 = Locale.US;
                                StringBuilder sb4 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                                sb4.append(j17);
                                sb4.append(" AND topic_id = ");
                                sb4.append(j13);
                                sb4.append(str2);
                                sb4.append(i20);
                                sb4.append(" AND end >= ");
                                i26 = i19;
                                sb4.append(i26);
                                sb4.append(" ORDER BY end ASC LIMIT 1");
                                queryFinalized3 = R.queryFinalized(sb4.toString(), new Object[0]);
                                i27 = 0;
                            } else {
                                i26 = i19;
                                Locale locale12 = Locale.US;
                                i27 = 0;
                                queryFinalized3 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j17 + str2 + i20 + " AND end >= " + i26 + " ORDER BY end ASC LIMIT 1", new Object[0]);
                            }
                            if (queryFinalized3.next()) {
                                i28 = queryFinalized3.intValue(i27);
                                queryFinalized3.intValue(1);
                            } else {
                                i28 = 0;
                            }
                            queryFinalized3.dispose();
                            if (i39 != 0) {
                                if (i28 > 1) {
                                    Locale locale13 = Locale.US;
                                    queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid >= " + i26 + " AND m.mid <= " + i28 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                    sQLiteDatabase = R;
                                    i19 = i26;
                                    z13 = true;
                                    z10 = z13;
                                    i21 = i19;
                                } else {
                                    Locale locale14 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str + j13 + " AND m.mid > 0 AND m.mid >= " + i26 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                    z11 = true;
                                    i19 = i26;
                                    z13 = true;
                                    z10 = z13;
                                    i21 = i19;
                                }
                            } else {
                                int i40 = i28;
                                if (i40 > 1) {
                                    Locale locale15 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid >= " + i26 + " AND m.mid <= " + i40 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                    i19 = i26;
                                    z13 = true;
                                    z10 = z13;
                                    i21 = i19;
                                } else {
                                    sQLiteDatabase = R;
                                    Locale locale16 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid > 0 AND m.mid >= " + i26 + " AND m.type = " + i20 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i17, new Object[0]);
                                    z11 = true;
                                    i19 = i26;
                                    z13 = true;
                                    z10 = z13;
                                    i21 = i19;
                                }
                            }
                        } else {
                            sQLiteDatabase = R;
                            String str9 = str;
                            int i41 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
                            if (i41 == 0) {
                                str5 = " AND m.type = ";
                                str6 = str9;
                                Locale locale17 = Locale.US;
                                i24 = 0;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + j17 + str2 + i20, new Object[0]);
                            } else {
                                Locale locale18 = Locale.US;
                                str5 = " AND m.type = ";
                                str6 = str9;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_topics WHERE uid = " + j17 + " AND topic_id = " + j13 + str2 + i20, new Object[0]);
                                i24 = 0;
                            }
                            if (queryFinalized2.next()) {
                                i25 = queryFinalized2.intValue(i24);
                            } else {
                                i25 = 0;
                            }
                            queryFinalized2.dispose();
                            if (i41 != 0) {
                                if (i25 > 1) {
                                    Locale locale19 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str6 + j13 + " AND m.mid >= " + i25 + str5 + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                } else {
                                    Locale locale20 = Locale.US;
                                    sQLiteDatabase = sQLiteDatabase;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + str6 + j13 + " AND m.mid > 0 AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                }
                            } else {
                                String str10 = str5;
                                if (i25 > 1) {
                                    Locale locale21 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid >= " + i25 + str10 + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                } else {
                                    Locale locale22 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j17 + " AND m.mid > 0 AND m.type = " + i20 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i17, new Object[0]);
                                }
                            }
                        }
                    }
                    z13 = false;
                    z10 = z13;
                    i21 = i19;
                } else {
                    sQLiteDatabase = R;
                    o0Var2 = o0Var;
                    if (j13 != 0) {
                        if (i18 != 0) {
                            Locale locale23 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.topic_id = " + j13 + " AND m.mid > " + i18 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                            i21 = i19;
                        } else {
                            if (i19 != 0) {
                                Locale locale24 = Locale.US;
                                StringBuilder sb5 = new StringBuilder("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = ");
                                sb5.append(j17);
                                sb5.append(" AND m.topic_id = ");
                                sb5.append(j13);
                                sb5.append(" AND m.mid < ");
                                i22 = i19;
                                sb5.append(i22);
                                sb5.append(" AND type = ");
                                sb5.append(i20);
                                sb5.append(" ORDER BY m.mid DESC LIMIT ");
                                sb5.append(i17);
                                queryFinalized = sQLiteDatabase.queryFinalized(sb5.toString(), new Object[0]);
                            } else {
                                i22 = i19;
                                Locale locale25 = Locale.US;
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.topic_id = " + j13 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                            }
                            i21 = i22;
                        }
                    } else {
                        i21 = i19;
                        if (i18 != 0) {
                            Locale locale26 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.mid > " + i18 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                        } else if (i21 != 0) {
                            Locale locale27 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND m.mid < " + i21 + " AND type = " + i20 + " ORDER BY m.mid DESC LIMIT " + i17, new Object[0]);
                        } else {
                            Locale locale28 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j17 + " AND type = " + i20 + " ORDER BY m.mid ASC LIMIT " + i17, new Object[0]);
                        }
                    }
                    z10 = false;
                    z11 = true;
                }
                if (o0Var2 != null) {
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
                            TLdeserialize.f19814id = queryFinalized.intValue(1);
                            TLdeserialize.dialog_id = j17;
                            if (o5.C(j17)) {
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
                                } catch (Exception e10) {
                                    e = e10;
                                    niVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i36 = i36;
                                    try {
                                        tL_messages_messages.messages.clear();
                                        tL_messages_messages.chats.clear();
                                        tL_messages_messages.users.clear();
                                        f8.f(e);
                                        i0.g3(new o7(niVar, niVar, i36, 11));
                                        int i42 = niVar.f17110n;
                                        int i43 = niVar.f17112s;
                                        j11 = niVar.f17107b;
                                        int i44 = niVar.f17106a;
                                        i11 = i42;
                                        i10 = i43;
                                        i16 = i44;
                                        i15 = niVar.h;
                                        i14 = niVar.f17108c;
                                        i13 = niVar.e;
                                        j10 = niVar.d;
                                        i12 = niVar.f17111r;
                                        uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i0.g3(new o7(niVar, niVar, i36, 11));
                                        uiVar.u1(tL_messages_messages, niVar.f17107b, niVar.f17106a, niVar.h, niVar.f17108c, niVar.e, niVar.d, niVar.f17111r, niVar.f17110n, false, niVar.f17112s);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    niVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i36 = i36;
                                    i0.g3(new o7(niVar, niVar, i36, 11));
                                    uiVar.u1(tL_messages_messages, niVar.f17107b, niVar.f17106a, niVar.h, niVar.f17108c, niVar.e, niVar.d, niVar.f17111r, niVar.f17110n, false, niVar.f17112s);
                                    throw th;
                                }
                            } else {
                                tL_messages_messages3 = tL_messages_messages2;
                                tL_messages_messages3.messages.add(TLdeserialize);
                            }
                            arrayList4 = arrayList;
                            arrayList5 = arrayList2;
                            hs.e(TLdeserialize, arrayList5, arrayList4, null);
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
                    } catch (Exception e11) {
                        e = e11;
                        tL_messages_messages3 = tL_messages_messages2;
                        niVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i36 = i36;
                        tL_messages_messages.messages.clear();
                        tL_messages_messages.chats.clear();
                        tL_messages_messages.users.clear();
                        f8.f(e);
                        i0.g3(new o7(niVar, niVar, i36, 11));
                        int i422 = niVar.f17110n;
                        int i432 = niVar.f17112s;
                        j11 = niVar.f17107b;
                        int i442 = niVar.f17106a;
                        i11 = i422;
                        i10 = i432;
                        i16 = i442;
                        i15 = niVar.h;
                        i14 = niVar.f17108c;
                        i13 = niVar.e;
                        j10 = niVar.d;
                        i12 = niVar.f17111r;
                        uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
                    } catch (Throwable th5) {
                        th = th5;
                        tL_messages_messages3 = tL_messages_messages2;
                        niVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i36 = i36;
                        i0.g3(new o7(niVar, niVar, i36, 11));
                        uiVar.u1(tL_messages_messages, niVar.f17107b, niVar.f17106a, niVar.h, niVar.f17108c, niVar.e, niVar.d, niVar.f17111r, niVar.f17110n, false, niVar.f17112s);
                        throw th;
                    }
                }
                ArrayList arrayList7 = arrayList;
                ArrayList arrayList8 = arrayList2;
                tL_messages_messages3 = tL_messages_messages2;
                long j19 = j12;
                queryFinalized.dispose();
                if (o0Var2 != null && !hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l4 = (Long) it.next();
                        long longValue = l4.longValue();
                        int i45 = 0;
                        while (true) {
                            if (i45 < tL_messages_messages3.messages.size()) {
                                j14 = j17;
                                if (tL_messages_messages3.messages.get(i45).grouped_id == longValue) {
                                    break;
                                }
                                i45++;
                                j17 = j14;
                            } else {
                                j14 = j17;
                                i45 = -1;
                                break;
                            }
                        }
                        if (i45 < 0) {
                            j17 = j14;
                        } else {
                            SQLiteCursor queryFinalized7 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(j14), l4);
                            ArrayList arrayList9 = new ArrayList();
                            while (queryFinalized7.next()) {
                                int intValue2 = queryFinalized7.intValue(1);
                                NativeByteBuffer byteBufferValue2 = queryFinalized7.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    Iterator it2 = it;
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, j19);
                                    byteBufferValue2.reuse();
                                    TLdeserialize2.f19814id = intValue2;
                                    long j20 = j14;
                                    TLdeserialize2.dialog_id = j20;
                                    arrayList9.add(TLdeserialize2);
                                    hs.e(TLdeserialize2, arrayList8, arrayList7, null);
                                    j14 = j20;
                                    it = it2;
                                }
                            }
                            Iterator it3 = it;
                            long j21 = j14;
                            if (z10) {
                                Collections.reverse(arrayList9);
                            }
                            tL_messages_messages3.messages.remove(i45);
                            tL_messages_messages3.messages.addAll(i45, arrayList9);
                            queryFinalized7.dispose();
                            j17 = j21;
                            it = it3;
                        }
                    }
                }
                if (!arrayList8.isEmpty()) {
                    uiVar2.getMessagesStorage().m0(arrayList8, tL_messages_messages3.users);
                }
                if (!arrayList7.isEmpty()) {
                    uiVar2.getMessagesStorage().Q(TextUtils.join(",", arrayList7), tL_messages_messages3.chats);
                }
                if (tL_messages_messages3.messages.size() > i35 && i21 == 0) {
                    tL_messages_messages3.messages.remove(arrayList3.size() - 1);
                } else if (i21 != 0) {
                    z14 = false;
                } else {
                    z14 = z11;
                }
                i0.g3(new o7(this, this, i36, 11));
                int i46 = this.f17110n;
                int i47 = this.f17112s;
                j11 = this.f17107b;
                int i48 = this.f17106a;
                i11 = i46;
                i10 = i47;
                i15 = this.h;
                i14 = this.f17108c;
                tL_messages_messages = tL_messages_messages3;
                i13 = this.e;
                j10 = this.d;
                i12 = this.f17111r;
                uiVar = uiVar2;
                i16 = i48;
            } catch (Exception e12) {
                e = e12;
                niVar = this;
                uiVar = uiVar2;
                i36 = i36;
                tL_messages_messages = tL_messages_messages2;
                tL_messages_messages.messages.clear();
                tL_messages_messages.chats.clear();
                tL_messages_messages.users.clear();
                f8.f(e);
                i0.g3(new o7(niVar, niVar, i36, 11));
                int i4222 = niVar.f17110n;
                int i4322 = niVar.f17112s;
                j11 = niVar.f17107b;
                int i4422 = niVar.f17106a;
                i11 = i4222;
                i10 = i4322;
                i16 = i4422;
                i15 = niVar.h;
                i14 = niVar.f17108c;
                i13 = niVar.e;
                j10 = niVar.d;
                i12 = niVar.f17111r;
                uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
            } catch (Throwable th6) {
                th = th6;
                niVar = this;
                uiVar = uiVar2;
                i36 = i36;
                tL_messages_messages = tL_messages_messages2;
                i0.g3(new o7(niVar, niVar, i36, 11));
                uiVar.u1(tL_messages_messages, niVar.f17107b, niVar.f17106a, niVar.h, niVar.f17108c, niVar.e, niVar.d, niVar.f17111r, niVar.f17110n, false, niVar.f17112s);
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        } catch (Throwable th7) {
            th = th7;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        }
        uiVar.u1(tL_messages_messages, j11, i16, i15, i14, i13, j10, i12, i11, z14, i10);
    }
}
