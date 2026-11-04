package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class eb implements Runnable {
    public final int f22333a;
    public final long f22334b;
    public final long f22335c;
    public final int d;
    public final Object f22336e;

    public eb(int i3, long j10, long j11, String str) {
        this.f22333a = 0;
        this.d = i3;
        this.f22336e = str;
        this.f22334b = j10;
        this.f22335c = j11;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        long j10;
        long j11;
        int i3;
        int i10;
        long j12;
        long j13;
        int i11 = this.f22333a;
        int i12 = 0;
        long j14 = this.f22335c;
        long j15 = this.f22334b;
        int i13 = this.d;
        Object obj = this.f22336e;
        switch (i11) {
            case 0:
                hs.f(i13).k(141, (String) obj, Long.valueOf(j15), Long.valueOf(j14));
                return;
            case 1:
                li liVar = (li) obj;
                liVar.getClass();
                try {
                    int[] iArr = new int[9];
                    iArr[0] = -1;
                    iArr[1] = -1;
                    iArr[2] = -1;
                    iArr[3] = -1;
                    iArr[4] = -1;
                    iArr[5] = -1;
                    iArr[6] = -1;
                    iArr[7] = -1;
                    iArr[8] = -1;
                    int i14 = 8;
                    int[] iArr2 = new int[9];
                    iArr2[0] = -1;
                    iArr2[1] = -1;
                    iArr2[2] = -1;
                    iArr2[3] = -1;
                    iArr2[4] = -1;
                    iArr2[5] = -1;
                    iArr2[6] = -1;
                    iArr2[7] = -1;
                    iArr2[8] = -1;
                    int i15 = 7;
                    int[] iArr3 = new int[9];
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    iArr3[2] = 0;
                    iArr3[3] = 0;
                    iArr3[4] = 0;
                    iArr3[5] = 0;
                    iArr3[6] = 0;
                    iArr3[7] = 0;
                    iArr3[8] = 0;
                    long j16 = this.f22334b;
                    int i16 = (j16 > 0L ? 1 : (j16 == 0L ? 0 : -1));
                    int i17 = 4;
                    long j17 = this.f22335c;
                    if (i16 != 0) {
                        SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().f24936b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j17 + " AND topic_id = " + j16, new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = liVar.getMessagesStorage().f24936b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j17, new Object[0]);
                    }
                    while (queryFinalized.next()) {
                        int intValue = queryFinalized.intValue(0);
                        if (intValue >= 0 && intValue < 9) {
                            int intValue2 = queryFinalized.intValue(1);
                            iArr[intValue] = intValue2;
                            iArr2[intValue] = intValue2;
                            iArr3[intValue] = queryFinalized.intValue(2);
                        }
                    }
                    queryFinalized.dispose();
                    if (m5.C(j17)) {
                        int i18 = 0;
                        while (i18 < 9) {
                            if (iArr[i18] == -1) {
                                SQLiteDatabase sQLiteDatabase3 = liVar.getMessagesStorage().f24936b;
                                Locale locale3 = Locale.US;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j17 + " AND type = " + i18 + " LIMIT 1", new Object[0]);
                                if (queryFinalized2.next()) {
                                    iArr[i18] = queryFinalized2.intValue(0);
                                } else {
                                    iArr[i18] = 0;
                                }
                                queryFinalized2.dispose();
                                i10 = i18;
                                j13 = j16;
                                long j18 = j17;
                                li liVar2 = liVar;
                                liVar2.H1(j18, j13, i10, iArr[i18]);
                                j12 = j18;
                                liVar = liVar2;
                            } else {
                                i10 = i18;
                                j12 = j17;
                                j13 = j16;
                            }
                            i18 = i10 + 1;
                            j17 = j12;
                            j16 = j13;
                        }
                        g0.h3(new zf(liVar, j17, j16, iArr, 0));
                        return;
                    }
                    TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
                    tL_messages_getSearchCounters.peer = liVar.getMessagesController().j1(j17);
                    if (i16 != 0) {
                        if (j17 == liVar.getUserConfig().e()) {
                            tL_messages_getSearchCounters.saved_peer_id = liVar.getMessagesController().j1(j16);
                            tL_messages_getSearchCounters.flags |= 4;
                        } else {
                            tL_messages_getSearchCounters.top_msg_id = (int) j16;
                            tL_messages_getSearchCounters.flags |= 1;
                        }
                    }
                    int i19 = 0;
                    boolean z10 = false;
                    while (i19 < 9) {
                        if (tL_messages_getSearchCounters.peer == null) {
                            iArr[i19] = i12;
                        } else if (iArr[i19] == -1 || iArr3[i19] == 1) {
                            if (i19 == 0) {
                                i3 = i12;
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                            } else {
                                i3 = i12;
                                if (i19 == 1) {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterDocument());
                                } else if (i19 == 2) {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterRoundVoice());
                                } else if (i19 == 3) {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterUrl());
                                } else if (i19 == i17) {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterMusic());
                                } else if (i19 == 6) {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotos());
                                } else if (i19 == i15) {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterVideo());
                                } else if (i19 == i14) {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPoll());
                                } else {
                                    tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterGif());
                                }
                            }
                            if (iArr[i19] == -1) {
                                z10 = true;
                            } else if (iArr3[i19] == 1) {
                                iArr[i19] = -1;
                            }
                            i19++;
                            i12 = i3;
                            i14 = 8;
                            i15 = 7;
                            i17 = 4;
                        }
                        i3 = i12;
                        i19++;
                        i12 = i3;
                        i14 = 8;
                        i15 = 7;
                        i17 = 4;
                    }
                    if (!tL_messages_getSearchCounters.filters.isEmpty()) {
                        j11 = j17;
                        j10 = j16;
                        liVar.getConnectionsManager().bindRequestToGuid(liVar.getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new sf(liVar, iArr, j17, j16, 1)), i13);
                    } else {
                        j10 = j16;
                        j11 = j17;
                    }
                    if (!z10 || liVar.getConnectionsManager().getConnectionState() != 3) {
                        g0.h3(new zf(liVar, j11, j10, iArr2, 1));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                c00 c00Var = (c00) obj;
                long j19 = -j15;
                TLRPC.TL_forumTopic f10 = c00Var.f(j19, j14);
                if (f10 != null) {
                    f10.unread_mentions_count = i13;
                    c00Var.y(j19, true);
                    return;
                }
                return;
        }
    }

    public eb(c1 c1Var, long j10, long j11, int i3, int i10) {
        this.f22333a = i10;
        this.f22336e = c1Var;
        this.f22334b = j10;
        this.f22335c = j11;
        this.d = i3;
    }
}
