package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public final class fi implements Runnable {
    public final int f22415a = 1;
    public final long f22416b;
    public final ArrayList f22417c;
    public final a0.h d;
    public final Runnable f22418e;
    public final c1 f22419f;
    public final Object h;
    public final Object f22420n;

    public fi(ui uiVar, zz zzVar, a00 a00Var, ArrayList arrayList, long j3, a0.h hVar, Runnable runnable) {
        this.f22419f = uiVar;
        this.h = zzVar;
        this.f22420n = a00Var;
        this.f22417c = arrayList;
        this.f22416b = j3;
        this.d = hVar;
        this.f22418e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f22415a) {
            case 0:
                ui uiVar = (ui) this.f22419f;
                a00 a00Var = (a00) this.f22420n;
                ArrayList arrayList = this.f22417c;
                a00.a((zz) this.h);
                zz d = a00.d(a00Var, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().f26721b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j3 = this.f22416b;
                        a0.h hVar = this.d;
                        if (next) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, uiVar.getUserConfig().f24489n);
                                byteBufferValue.reuse();
                                TLdeserialize.f26977id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j3;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList3 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList3 != null) {
                                    ij ijVar = new ij(uiVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(ijVar);
                                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                        ij ijVar2 = (ij) arrayList3.get(i7);
                                        ijVar2.C = ijVar;
                                        ijVar2.m();
                                        ijVar2.f23262k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = ijVar2.f23262k.reply_to;
                                        messageReplyHeader.flags |= 16;
                                        messageReplyHeader.reply_to_msg_id = ijVar.L1();
                                    }
                                }
                            }
                        } else {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i10 = 0; i10 < hVar.m(); i10++) {
                                    ArrayList arrayList4 = (ArrayList) hVar.n(i10);
                                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((ij) arrayList4.get(i11)).f23262k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            a00.a(d);
                            g0.h3(new jm(uiVar, a00.d(a00Var, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j3, arrayList2, 3));
                            Runnable runnable = this.f22418e;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                k00 k00Var = (k00) this.f22419f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.f22420n;
                int i12 = 0;
                k00Var.getMessagesController().Y3(tL_messages_savedDialogs.users, false);
                k00Var.getMessagesController().S3(tL_messages_savedDialogs.chats, false);
                long j10 = this.f22416b;
                ArrayList arrayList5 = this.f22417c;
                k00Var.u(j10, arrayList5, this.d, false, 2, -1);
                long j11 = -j10;
                k00Var.getMessagesStorage().C1(k00Var.getConnectionsManager().getCurrentTime(), j11, (List) k00Var.f23640a.f(j10), true);
                k00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(m5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    yr messagesStorage = k00Var.getMessagesStorage();
                    messagesStorage.f26719a.c(new vp(1, j11, longValue2, messagesStorage));
                    k00Var.s(j10, longValue2);
                }
                Runnable runnable2 = this.f22418e;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    public fi(k00 k00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f22419f = k00Var;
        this.h = tL_messages_savedDialogs;
        this.f22416b = j3;
        this.f22417c = arrayList;
        this.d = hVar;
        this.f22420n = hashSet;
        this.f22418e = runnable;
    }
}
