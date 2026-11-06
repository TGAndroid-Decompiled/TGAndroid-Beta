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
public final class oi implements Runnable {
    public final int f24323a;
    public final long f24324b;
    public final int f24325c;
    public final long d;
    public final int f24326e;
    public final ch.o0 f24327f;
    public final int h;
    public final int f24328n;
    public final int f24329r;
    public final int f24330s;
    public final ui f24331w;

    public oi(ui uiVar, int i7, long j3, int i10, long j10, int i11, ch.o0 o0Var, int i12, int i13, int i14, boolean z9, int i15) {
        this.f24331w = uiVar;
        this.f24323a = i7;
        this.f24324b = j3;
        this.f24325c = i10;
        this.d = j10;
        this.f24326e = i11;
        this.f24327f = o0Var;
        this.h = i12;
        this.f24328n = i13;
        this.f24329r = i14;
        this.f24330s = i15;
    }

    @Override
    public final void run() {
        TLRPC.TL_messages_messages tL_messages_messages;
        ui uiVar;
        int i7;
        int i10;
        int i11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        ArrayList arrayList;
        int i16;
        ArrayList arrayList2;
        SQLiteDatabase R;
        boolean C;
        TLRPC.TL_messages_messages tL_messages_messages2;
        ch.o0 o0Var;
        long j11;
        int i17;
        int i18;
        long j12;
        int i19;
        SQLiteDatabase sQLiteDatabase;
        ch.o0 o0Var2;
        int i20;
        SQLiteCursor queryFinalized;
        boolean z9;
        boolean z10;
        int i21;
        HashSet hashSet;
        TLRPC.TL_messages_messages tL_messages_messages3;
        ArrayList<TLRPC.Message> arrayList3;
        long j13;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j14;
        String str;
        String str2;
        int i22;
        boolean z11;
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
        boolean z12;
        int i28;
        int i29;
        SQLiteCursor queryFinalized4;
        int i30;
        long j15;
        int i31;
        SQLiteCursor queryFinalized5;
        int i32;
        SQLiteCursor queryFinalized6;
        SQLiteCursor sQLiteCursor;
        int intValue;
        SQLitePreparedStatement executeFast;
        int i33;
        oi oiVar = this;
        int i34 = oiVar.f24323a;
        int i35 = oiVar.f24328n;
        long j16 = oiVar.f24324b;
        ui uiVar2 = oiVar.f24331w;
        long e10 = uiVar2.getUserConfig().e();
        TLRPC.TL_messages_messages tL_messages_messages4 = new TLRPC.TL_messages_messages();
        boolean z13 = false;
        try {
            ArrayList arrayList6 = new ArrayList();
            try {
                arrayList = new ArrayList();
                i16 = i34 + 1;
                arrayList2 = arrayList6;
                R = uiVar2.getMessagesStorage().R();
                C = m5.C(j16);
                tL_messages_messages2 = tL_messages_messages4;
                o0Var = oiVar.f24327f;
                j11 = e10;
                i17 = oiVar.h;
                i18 = oiVar.f24325c;
                j12 = oiVar.d;
                i19 = oiVar.f24326e;
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
                        z11 = false;
                    } else {
                        int i36 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                        str = " AND m.topic_id = ";
                        if (i36 == 0) {
                            str2 = " AND type = ";
                            i22 = i17;
                            Locale locale = Locale.US;
                            i31 = 0;
                            queryFinalized5 = R.queryFinalized("SELECT start FROM media_holes_v2 WHERE uid = " + j16 + str2 + i19 + " AND start IN (0, 1)", new Object[0]);
                        } else {
                            Locale locale2 = Locale.US;
                            StringBuilder sb2 = new StringBuilder("SELECT start FROM media_holes_topics WHERE uid = ");
                            sb2.append(j16);
                            sb2.append(" AND topic_id = ");
                            sb2.append(j12);
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
                                z11 = true;
                                queryFinalized5.dispose();
                            }
                        } else {
                            queryFinalized5.dispose();
                            if (i36 != 0) {
                                Locale locale3 = Locale.US;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_topics WHERE uid = " + j16 + " AND topic_id = " + j12 + str2 + i19 + " AND mid > 0", new Object[0]);
                                i32 = 0;
                            } else {
                                Locale locale4 = Locale.US;
                                i32 = 0;
                                queryFinalized6 = R.queryFinalized("SELECT min(mid) FROM media_v4 WHERE uid = " + j16 + str2 + i19 + " AND mid > 0", new Object[0]);
                            }
                            SQLiteCursor sQLiteCursor2 = queryFinalized6;
                            if (sQLiteCursor2.next() && (intValue = sQLiteCursor2.intValue(i32)) != 0) {
                                if (i36 != 0) {
                                    executeFast = R.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                } else {
                                    executeFast = R.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                }
                                executeFast.requery();
                                executeFast.bindLong(1, j16);
                                if (i36 != 0) {
                                    executeFast.bindLong(2, j12);
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
                        z11 = false;
                        queryFinalized5.dispose();
                    }
                    if (o0Var != null) {
                        if (!TextUtils.isEmpty(o0Var.f6356f)) {
                            j15 = o0Var.f6356f.hashCode();
                        } else {
                            j15 = o0Var.f6357g;
                        }
                        str3 = "INNER JOIN tag_message_id t ON m.mid = t.mid";
                        str4 = "t.tag = " + j15 + " AND";
                    } else {
                        str3 = "";
                        str4 = "";
                    }
                    z10 = z11;
                    o0Var2 = o0Var;
                    if (i22 != 0) {
                        int i37 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                        String str7 = str4;
                        if (i37 != 0) {
                            Locale locale5 = Locale.US;
                            StringBuilder sb3 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                            sb3.append(j16);
                            sb3.append(" AND topic_id = ");
                            sb3.append(j12);
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
                            queryFinalized4 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j16 + str2 + i19 + " AND start <= " + i28 + " ORDER BY end DESC LIMIT 1", new Object[0]);
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
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + str + j12 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.mid >= " + i30 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                z10 = false;
                                sQLiteDatabase = R;
                            } else {
                                Locale locale8 = Locale.US;
                                R = R;
                                queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + str + j12 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                sQLiteDatabase = R;
                            }
                        } else if (i30 > 1) {
                            Locale locale9 = Locale.US;
                            R = R;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.mid >= " + i30 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            z10 = false;
                            sQLiteDatabase = R;
                        } else {
                            R = R;
                            Locale locale10 = Locale.US;
                            queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str7 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid < " + i28 + " AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                            sQLiteDatabase = R;
                        }
                    } else {
                        String str8 = str4;
                        if (i18 != 0) {
                            int i38 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                            if (i38 != 0) {
                                Locale locale11 = Locale.US;
                                StringBuilder sb4 = new StringBuilder("SELECT start, end FROM media_holes_topics WHERE uid = ");
                                sb4.append(j16);
                                sb4.append(" AND topic_id = ");
                                sb4.append(j12);
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
                                queryFinalized3 = R.queryFinalized("SELECT start, end FROM media_holes_v2 WHERE uid = " + j16 + str2 + i19 + " AND end >= " + i25 + " ORDER BY end ASC LIMIT 1", new Object[0]);
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
                                    queryFinalized = R.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str + j12 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.mid <= " + i27 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    sQLiteDatabase = R;
                                    i18 = i25;
                                    z12 = true;
                                    z9 = z12;
                                    i20 = i18;
                                } else {
                                    Locale locale14 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str + j12 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    z10 = true;
                                    i18 = i25;
                                    z12 = true;
                                    z9 = z12;
                                    i20 = i18;
                                }
                            } else {
                                int i39 = i27;
                                if (i39 > 1) {
                                    Locale locale15 = Locale.US;
                                    sQLiteDatabase = R;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.mid <= " + i39 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    i18 = i25;
                                    z12 = true;
                                    z9 = z12;
                                    i20 = i18;
                                } else {
                                    sQLiteDatabase = R;
                                    Locale locale16 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid > 0 AND m.mid >= " + i25 + " AND m.type = " + i19 + " ORDER BY m.date ASC, m.mid ASC LIMIT " + i16, new Object[0]);
                                    z10 = true;
                                    i18 = i25;
                                    z12 = true;
                                    z9 = z12;
                                    i20 = i18;
                                }
                            }
                        } else {
                            sQLiteDatabase = R;
                            String str9 = str;
                            int i40 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                            if (i40 == 0) {
                                str5 = " AND m.type = ";
                                str6 = str9;
                                Locale locale17 = Locale.US;
                                i23 = 0;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_v2 WHERE uid = " + j16 + str2 + i19, new Object[0]);
                            } else {
                                Locale locale18 = Locale.US;
                                str5 = " AND m.type = ";
                                str6 = str9;
                                queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT max(end) FROM media_holes_topics WHERE uid = " + j16 + " AND topic_id = " + j12 + str2 + i19, new Object[0]);
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
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str6 + j12 + " AND m.mid >= " + i24 + str5 + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                } else {
                                    Locale locale20 = Locale.US;
                                    sQLiteDatabase = sQLiteDatabase;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_topics m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + str6 + j12 + " AND m.mid > 0 AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                }
                            } else {
                                String str10 = str5;
                                if (i24 > 1) {
                                    Locale locale21 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid >= " + i24 + str10 + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                } else {
                                    Locale locale22 = Locale.US;
                                    queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid FROM media_v4 m " + str3 + " WHERE " + str8 + " m.uid = " + j16 + " AND m.mid > 0 AND m.type = " + i19 + " ORDER BY m.date DESC, m.mid DESC LIMIT " + i16, new Object[0]);
                                }
                            }
                        }
                    }
                    z12 = false;
                    z9 = z12;
                    i20 = i18;
                } else {
                    sQLiteDatabase = R;
                    o0Var2 = o0Var;
                    if (j12 != 0) {
                        if (i17 != 0) {
                            Locale locale23 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.topic_id = " + j12 + " AND m.mid > " + i17 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                            i20 = i18;
                        } else {
                            if (i18 != 0) {
                                Locale locale24 = Locale.US;
                                StringBuilder sb5 = new StringBuilder("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = ");
                                sb5.append(j16);
                                sb5.append(" AND m.topic_id = ");
                                sb5.append(j12);
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
                                queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_topics as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.topic_id = " + j12 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                            }
                            i20 = i21;
                        }
                    } else {
                        i20 = i18;
                        if (i17 != 0) {
                            Locale locale26 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.mid > " + i17 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        } else if (i20 != 0) {
                            Locale locale27 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND m.mid < " + i20 + " AND type = " + i19 + " ORDER BY m.mid DESC LIMIT " + i16, new Object[0]);
                        } else {
                            Locale locale28 = Locale.US;
                            queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, r.random_id FROM media_v4 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid WHERE m.uid = " + j16 + " AND type = " + i19 + " ORDER BY m.mid ASC LIMIT " + i16, new Object[0]);
                        }
                    }
                    z9 = false;
                    z10 = true;
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
                            j14 = j11;
                            TLdeserialize.readAttachPath(byteBufferValue, j14);
                            byteBufferValue.reuse();
                            TLdeserialize.f26973id = queryFinalized.intValue(1);
                            TLdeserialize.dialog_id = j16;
                            if (m5.C(j16)) {
                                TLdeserialize.random_id = queryFinalized.longValue(2);
                            }
                            long j17 = TLdeserialize.grouped_id;
                            if (j17 != 0 && hashSet != null) {
                                hashSet.add(Long.valueOf(j17));
                            }
                            if (z9) {
                                tL_messages_messages3 = tL_messages_messages2;
                                try {
                                    tL_messages_messages3.messages.add(0, TLdeserialize);
                                } catch (Exception e12) {
                                    e = e12;
                                    oiVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i35 = i35;
                                    try {
                                        tL_messages_messages.messages.clear();
                                        tL_messages_messages.chats.clear();
                                        tL_messages_messages.users.clear();
                                        a8.f(e);
                                        g0.h3(new k7(oiVar, oiVar, i35, 11));
                                        int i41 = oiVar.f24328n;
                                        int i42 = oiVar.f24330s;
                                        j10 = oiVar.f24324b;
                                        int i43 = oiVar.f24323a;
                                        i10 = i41;
                                        i7 = i42;
                                        i15 = i43;
                                        i14 = oiVar.h;
                                        i13 = oiVar.f24325c;
                                        i12 = oiVar.f24326e;
                                        j3 = oiVar.d;
                                        i11 = oiVar.f24329r;
                                        uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        g0.h3(new k7(oiVar, oiVar, i35, 11));
                                        uiVar.u1(tL_messages_messages, oiVar.f24324b, oiVar.f24323a, oiVar.h, oiVar.f24325c, oiVar.f24326e, oiVar.d, oiVar.f24329r, oiVar.f24328n, false, oiVar.f24330s);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    oiVar = this;
                                    tL_messages_messages = tL_messages_messages3;
                                    uiVar = uiVar2;
                                    i35 = i35;
                                    g0.h3(new k7(oiVar, oiVar, i35, 11));
                                    uiVar.u1(tL_messages_messages, oiVar.f24324b, oiVar.f24323a, oiVar.h, oiVar.f24325c, oiVar.f24326e, oiVar.d, oiVar.f24329r, oiVar.f24328n, false, oiVar.f24330s);
                                    throw th;
                                }
                            } else {
                                tL_messages_messages3 = tL_messages_messages2;
                                tL_messages_messages3.messages.add(TLdeserialize);
                            }
                            arrayList4 = arrayList;
                            arrayList5 = arrayList2;
                            yr.e(TLdeserialize, arrayList5, arrayList4, null);
                        } else {
                            arrayList4 = arrayList;
                            arrayList5 = arrayList2;
                            tL_messages_messages3 = tL_messages_messages2;
                            j14 = j11;
                        }
                        tL_messages_messages2 = tL_messages_messages3;
                        j11 = j14;
                        arrayList2 = arrayList5;
                        arrayList = arrayList4;
                    } catch (Exception e13) {
                        e = e13;
                        tL_messages_messages3 = tL_messages_messages2;
                        oiVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i35 = i35;
                        tL_messages_messages.messages.clear();
                        tL_messages_messages.chats.clear();
                        tL_messages_messages.users.clear();
                        a8.f(e);
                        g0.h3(new k7(oiVar, oiVar, i35, 11));
                        int i412 = oiVar.f24328n;
                        int i422 = oiVar.f24330s;
                        j10 = oiVar.f24324b;
                        int i432 = oiVar.f24323a;
                        i10 = i412;
                        i7 = i422;
                        i15 = i432;
                        i14 = oiVar.h;
                        i13 = oiVar.f24325c;
                        i12 = oiVar.f24326e;
                        j3 = oiVar.d;
                        i11 = oiVar.f24329r;
                        uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
                    } catch (Throwable th5) {
                        th = th5;
                        tL_messages_messages3 = tL_messages_messages2;
                        oiVar = this;
                        tL_messages_messages = tL_messages_messages3;
                        uiVar = uiVar2;
                        i35 = i35;
                        g0.h3(new k7(oiVar, oiVar, i35, 11));
                        uiVar.u1(tL_messages_messages, oiVar.f24324b, oiVar.f24323a, oiVar.h, oiVar.f24325c, oiVar.f24326e, oiVar.d, oiVar.f24329r, oiVar.f24328n, false, oiVar.f24330s);
                        throw th;
                    }
                }
                ArrayList arrayList7 = arrayList;
                ArrayList arrayList8 = arrayList2;
                tL_messages_messages3 = tL_messages_messages2;
                long j18 = j11;
                queryFinalized.dispose();
                if (o0Var2 != null && !hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        Long l10 = (Long) it.next();
                        long longValue = l10.longValue();
                        int i44 = 0;
                        while (true) {
                            if (i44 < tL_messages_messages3.messages.size()) {
                                j13 = j16;
                                if (tL_messages_messages3.messages.get(i44).grouped_id == longValue) {
                                    break;
                                }
                                i44++;
                                j16 = j13;
                            } else {
                                j13 = j16;
                                i44 = -1;
                                break;
                            }
                        }
                        if (i44 < 0) {
                            j16 = j13;
                        } else {
                            SQLiteCursor queryFinalized7 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM messages_v2 WHERE uid = ? AND group_id = ? ORDER BY mid DESC", Long.valueOf(j13), l10);
                            ArrayList arrayList9 = new ArrayList();
                            while (queryFinalized7.next()) {
                                int intValue2 = queryFinalized7.intValue(1);
                                NativeByteBuffer byteBufferValue2 = queryFinalized7.byteBufferValue(0);
                                if (byteBufferValue2 != null) {
                                    Iterator it2 = it;
                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                    TLdeserialize2.readAttachPath(byteBufferValue2, j18);
                                    byteBufferValue2.reuse();
                                    TLdeserialize2.f26973id = intValue2;
                                    long j19 = j13;
                                    TLdeserialize2.dialog_id = j19;
                                    arrayList9.add(TLdeserialize2);
                                    yr.e(TLdeserialize2, arrayList8, arrayList7, null);
                                    j13 = j19;
                                    it = it2;
                                }
                            }
                            Iterator it3 = it;
                            long j20 = j13;
                            if (z9) {
                                Collections.reverse(arrayList9);
                            }
                            tL_messages_messages3.messages.remove(i44);
                            tL_messages_messages3.messages.addAll(i44, arrayList9);
                            queryFinalized7.dispose();
                            j16 = j20;
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
                if (tL_messages_messages3.messages.size() > i34 && i20 == 0) {
                    tL_messages_messages3.messages.remove(arrayList3.size() - 1);
                } else if (i20 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                g0.h3(new k7(this, this, i35, 11));
                int i45 = this.f24328n;
                int i46 = this.f24330s;
                j10 = this.f24324b;
                int i47 = this.f24323a;
                i10 = i45;
                i7 = i46;
                i14 = this.h;
                i13 = this.f24325c;
                tL_messages_messages = tL_messages_messages3;
                i12 = this.f24326e;
                j3 = this.d;
                i11 = this.f24329r;
                uiVar = uiVar2;
                i15 = i47;
            } catch (Exception e14) {
                e = e14;
                oiVar = this;
                uiVar = uiVar2;
                i35 = i35;
                tL_messages_messages = tL_messages_messages2;
                tL_messages_messages.messages.clear();
                tL_messages_messages.chats.clear();
                tL_messages_messages.users.clear();
                a8.f(e);
                g0.h3(new k7(oiVar, oiVar, i35, 11));
                int i4122 = oiVar.f24328n;
                int i4222 = oiVar.f24330s;
                j10 = oiVar.f24324b;
                int i4322 = oiVar.f24323a;
                i10 = i4122;
                i7 = i4222;
                i15 = i4322;
                i14 = oiVar.h;
                i13 = oiVar.f24325c;
                i12 = oiVar.f24326e;
                j3 = oiVar.d;
                i11 = oiVar.f24329r;
                uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
            } catch (Throwable th6) {
                th = th6;
                oiVar = this;
                uiVar = uiVar2;
                i35 = i35;
                tL_messages_messages = tL_messages_messages2;
                g0.h3(new k7(oiVar, oiVar, i35, 11));
                uiVar.u1(tL_messages_messages, oiVar.f24324b, oiVar.f24323a, oiVar.h, oiVar.f24325c, oiVar.f24326e, oiVar.d, oiVar.f24329r, oiVar.f24328n, false, oiVar.f24330s);
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        } catch (Throwable th7) {
            th = th7;
            tL_messages_messages = tL_messages_messages4;
            uiVar = uiVar2;
        }
        uiVar.u1(tL_messages_messages, j10, i15, i14, i13, i12, j3, i11, i10, z13, i7);
    }
}
