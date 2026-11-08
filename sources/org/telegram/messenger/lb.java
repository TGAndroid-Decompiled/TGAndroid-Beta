package org.telegram.messenger;

import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.TLRPC;
public final class lb implements Runnable {
    public final int f23877a;
    public final long f23878b;
    public final long f23879c;
    public final int d;
    public final Object f23880e;

    public lb(int i7, long j3, long j10, String str) {
        this.f23877a = 0;
        this.d = i7;
        this.f23880e = str;
        this.f23878b = j3;
        this.f23879c = j10;
    }

    @Override
    public final void run() {
        SQLiteCursor queryFinalized;
        long j3;
        long j10;
        int i7;
        int i10;
        long j11;
        long j12;
        int i11 = this.f23877a;
        int i12 = 0;
        long j13 = this.f23879c;
        long j14 = this.f23878b;
        int i13 = this.d;
        Object obj = this.f23880e;
        switch (i11) {
            case 0:
                qs.f(i13).k(141, (String) obj, Long.valueOf(j14), Long.valueOf(j13));
                return;
            case 1:
                ui uiVar = (ui) obj;
                uiVar.getClass();
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
                    long j15 = this.f23878b;
                    int i16 = (j15 > 0L ? 1 : (j15 == 0L ? 0 : -1));
                    int i17 = 4;
                    long j16 = this.f23879c;
                    if (i16 != 0) {
                        SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26721b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase.queryFinalized("SELECT type, count, old FROM media_counts_topics WHERE uid = " + j16 + " AND topic_id = " + j15, new Object[0]);
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().f26721b;
                        Locale locale2 = Locale.US;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT type, count, old FROM media_counts_v2 WHERE uid = " + j16, new Object[0]);
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
                    if (m5.C(j16)) {
                        int i18 = 0;
                        while (i18 < 9) {
                            if (iArr[i18] == -1) {
                                SQLiteDatabase sQLiteDatabase3 = uiVar.getMessagesStorage().f26721b;
                                Locale locale3 = Locale.US;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM media_v4 WHERE uid = " + j16 + " AND type = " + i18 + " LIMIT 1", new Object[0]);
                                if (queryFinalized2.next()) {
                                    iArr[i18] = queryFinalized2.intValue(0);
                                } else {
                                    iArr[i18] = 0;
                                }
                                queryFinalized2.dispose();
                                i10 = i18;
                                j12 = j15;
                                long j17 = j16;
                                ui uiVar2 = uiVar;
                                uiVar2.H1(j17, j12, i10, iArr[i18]);
                                j11 = j17;
                                uiVar = uiVar2;
                            } else {
                                i10 = i18;
                                j11 = j16;
                                j12 = j15;
                            }
                            i18 = i10 + 1;
                            j16 = j11;
                            j15 = j12;
                        }
                        g0.h3(new hg(uiVar, j16, j15, iArr, 0));
                        return;
                    }
                    TLRPC.TL_messages_getSearchCounters tL_messages_getSearchCounters = new TLRPC.TL_messages_getSearchCounters();
                    tL_messages_getSearchCounters.peer = uiVar.getMessagesController().j1(j16);
                    if (i16 != 0) {
                        if (j16 == uiVar.getUserConfig().e()) {
                            tL_messages_getSearchCounters.saved_peer_id = uiVar.getMessagesController().j1(j15);
                            tL_messages_getSearchCounters.flags |= 4;
                        } else {
                            tL_messages_getSearchCounters.top_msg_id = (int) j15;
                            tL_messages_getSearchCounters.flags |= 1;
                        }
                    }
                    int i19 = 0;
                    boolean z9 = false;
                    while (i19 < 9) {
                        if (tL_messages_getSearchCounters.peer == null) {
                            iArr[i19] = i12;
                        } else if (iArr[i19] == -1 || iArr3[i19] == 1) {
                            if (i19 == 0) {
                                i7 = i12;
                                tL_messages_getSearchCounters.filters.add(new TLRPC.TL_inputMessagesFilterPhotoVideo());
                            } else {
                                i7 = i12;
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
                                z9 = true;
                            } else if (iArr3[i19] == 1) {
                                iArr[i19] = -1;
                            }
                            i19++;
                            i12 = i7;
                            i14 = 8;
                            i15 = 7;
                            i17 = 4;
                        }
                        i7 = i12;
                        i19++;
                        i12 = i7;
                        i14 = 8;
                        i15 = 7;
                        i17 = 4;
                    }
                    if (!tL_messages_getSearchCounters.filters.isEmpty()) {
                        j10 = j16;
                        j3 = j15;
                        uiVar.getConnectionsManager().bindRequestToGuid(uiVar.getConnectionsManager().sendRequest(tL_messages_getSearchCounters, new ag(uiVar, iArr, j16, j15, 1)), i13);
                    } else {
                        j3 = j15;
                        j10 = j16;
                    }
                    if (!z9 || uiVar.getConnectionsManager().getConnectionState() != 3) {
                        g0.h3(new hg(uiVar, j10, j3, iArr2, 1));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                k00 k00Var = (k00) obj;
                long j18 = -j14;
                TLRPC.TL_forumTopic f10 = k00Var.f(j18, j13);
                if (f10 != null) {
                    f10.unread_mentions_count = i13;
                    k00Var.y(j18, true);
                    return;
                }
                return;
        }
    }

    public lb(c1 c1Var, long j3, long j10, int i7, int i10) {
        this.f23877a = i10;
        this.f23880e = c1Var;
        this.f23878b = j3;
        this.f23879c = j10;
        this.d = i7;
    }
}
