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
    public final int f15730a = 0;
    public final long f15731b;
    public final ArrayList f15732c;
    public final a0.h d;
    public final Runnable e;
    public final f1 f15733f;
    public final Object h;
    public final Object f15734n;

    public fi(vi viVar, l00 l00Var, m00 m00Var, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f15733f = viVar;
        this.h = l00Var;
        this.f15734n = m00Var;
        this.f15732c = arrayList;
        this.f15731b = j10;
        this.d = hVar;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15730a) {
            case 0:
                vi viVar = (vi) this.f15733f;
                m00 m00Var = (m00) this.f15734n;
                ArrayList arrayList = this.f15732c;
                m00.a((l00) this.h);
                l00 d = m00.d(m00Var, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = viVar.getMessagesStorage().f16333b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j10 = this.f15731b;
                        a0.h hVar = this.d;
                        if (next) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, viVar.getUserConfig().f15524n);
                                byteBufferValue.reuse();
                                TLdeserialize.f19815id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j10;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList3 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList3 != null) {
                                    kj kjVar = new kj(viVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(kjVar);
                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                        kj kjVar2 = (kj) arrayList3.get(i10);
                                        kjVar2.C = kjVar;
                                        kjVar2.m();
                                        kjVar2.f16690k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = kjVar2.f16690k.reply_to;
                                        messageReplyHeader.flags |= 16;
                                        messageReplyHeader.reply_to_msg_id = kjVar.M1();
                                    }
                                }
                            }
                        } else {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i11 = 0; i11 < hVar.m(); i11++) {
                                    ArrayList arrayList4 = (ArrayList) hVar.n(i11);
                                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((kj) arrayList4.get(i12)).f16690k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            m00.a(d);
                            i0.g3(new xm(viVar, m00.d(m00Var, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j10, arrayList2, 3));
                            Runnable runnable = this.e;
                            if (runnable != null) {
                                runnable.run();
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                y00 y00Var = (y00) this.f15733f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.f15734n;
                int i13 = 0;
                y00Var.getMessagesController().V3(tL_messages_savedDialogs.users, false);
                y00Var.getMessagesController().P3(tL_messages_savedDialogs.chats, false);
                long j11 = this.f15731b;
                ArrayList arrayList5 = this.f15732c;
                y00Var.u(j11, arrayList5, this.d, false, 2, -1);
                long j12 = -j11;
                y00Var.getMessagesStorage().C1(y00Var.getConnectionsManager().getCurrentTime(), j12, (List) y00Var.f19511a.f(j11), true);
                y00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i13 < size) {
                    Object obj = arrayList5.get(i13);
                    i13++;
                    hashSet.remove(Long.valueOf(o5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    is messagesStorage = y00Var.getMessagesStorage();
                    messagesStorage.f16331a.c(new bq(1, j12, longValue2, messagesStorage));
                    y00Var.s(j11, longValue2);
                }
                Runnable runnable2 = this.e;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    public fi(y00 y00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f15733f = y00Var;
        this.h = tL_messages_savedDialogs;
        this.f15731b = j10;
        this.f15732c = arrayList;
        this.d = hVar;
        this.f15734n = hashSet;
        this.e = runnable;
    }
}
