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
public final class ei implements Runnable {
    public final int f23717a = 1;
    public final long f23718b;
    public final ArrayList f23719c;
    public final a0.h d;
    public final Runnable f23720e;
    public final c1 f23721f;
    public final Object h;
    public final Object f23722n;

    public ei(ri riVar, sz szVar, tz tzVar, ArrayList arrayList, long j3, a0.h hVar, Runnable runnable) {
        this.f23721f = riVar;
        this.h = szVar;
        this.f23722n = tzVar;
        this.f23719c = arrayList;
        this.f23718b = j3;
        this.d = hVar;
        this.f23720e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23717a) {
            case 0:
                ri riVar = (ri) this.f23721f;
                tz tzVar = (tz) this.f23722n;
                ArrayList arrayList = this.f23719c;
                tz.a((sz) this.h);
                sz d = tz.d(tzVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = riVar.getMessagesStorage().f27056b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j3 = this.f23718b;
                        a0.h hVar = this.d;
                        if (next) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, riVar.getUserConfig().f24792n);
                                byteBufferValue.reuse();
                                TLdeserialize.f28426id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j3;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList3 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList3 != null) {
                                    fj fjVar = new fj(riVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(fjVar);
                                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                        fj fjVar2 = (fj) arrayList3.get(i7);
                                        fjVar2.C = fjVar;
                                        fjVar2.m();
                                        fjVar2.f23968k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = fjVar2.f23968k.reply_to;
                                        messageReplyHeader.flags |= 16;
                                        messageReplyHeader.reply_to_msg_id = fjVar.L1();
                                    }
                                }
                            }
                        } else {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i10 = 0; i10 < hVar.m(); i10++) {
                                    ArrayList arrayList4 = (ArrayList) hVar.n(i10);
                                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((fj) arrayList4.get(i11)).f23968k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            tz.a(d);
                            g0.g3(new fm(riVar, tz.d(tzVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j3, arrayList2, 3));
                            Runnable runnable = this.f23720e;
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
                e00 e00Var = (e00) this.f23721f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.f23722n;
                int i12 = 0;
                e00Var.getMessagesController().f4(tL_messages_savedDialogs.users, false);
                e00Var.getMessagesController().Z3(tL_messages_savedDialogs.chats, false);
                long j10 = this.f23718b;
                ArrayList arrayList5 = this.f23719c;
                e00Var.u(j10, arrayList5, this.d, false, 2, -1);
                long j11 = -j10;
                e00Var.getMessagesStorage().C1(e00Var.getConnectionsManager().getCurrentTime(), j11, (List) e00Var.f23623a.f(j10), true);
                e00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(n5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    tr messagesStorage = e00Var.getMessagesStorage();
                    messagesStorage.f27054a.c(new np(1, j11, longValue2, messagesStorage));
                    e00Var.s(j10, longValue2);
                }
                Runnable runnable2 = this.f23720e;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    public ei(e00 e00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f23721f = e00Var;
        this.h = tL_messages_savedDialogs;
        this.f23718b = j3;
        this.f23719c = arrayList;
        this.d = hVar;
        this.f23722n = hashSet;
        this.f23720e = runnable;
    }
}
