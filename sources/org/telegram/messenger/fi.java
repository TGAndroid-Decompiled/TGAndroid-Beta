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
    public final int f23923a = 1;
    public final long f23924b;
    public final ArrayList f23925c;
    public final a0.h d;
    public final Runnable f23926e;
    public final c1 f23927f;
    public final Object h;
    public final Object f23928n;

    public fi(si siVar, tz tzVar, uz uzVar, ArrayList arrayList, long j3, a0.h hVar, Runnable runnable) {
        this.f23927f = siVar;
        this.h = tzVar;
        this.f23928n = uzVar;
        this.f23925c = arrayList;
        this.f23924b = j3;
        this.d = hVar;
        this.f23926e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23923a) {
            case 0:
                si siVar = (si) this.f23927f;
                uz uzVar = (uz) this.f23928n;
                ArrayList arrayList = this.f23925c;
                uz.a((tz) this.h);
                tz d = uz.d(uzVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27252b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j3 = this.f23924b;
                        a0.h hVar = this.d;
                        if (next) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, siVar.getUserConfig().f24987n);
                                byteBufferValue.reuse();
                                TLdeserialize.f28455id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j3;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList3 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList3 != null) {
                                    gj gjVar = new gj(siVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(gjVar);
                                    for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                        gj gjVar2 = (gj) arrayList3.get(i7);
                                        gjVar2.C = gjVar;
                                        gjVar2.m();
                                        gjVar2.f24213k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = gjVar2.f24213k.reply_to;
                                        messageReplyHeader.flags |= 16;
                                        messageReplyHeader.reply_to_msg_id = gjVar.L1();
                                    }
                                }
                            }
                        } else {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i10 = 0; i10 < hVar.m(); i10++) {
                                    ArrayList arrayList4 = (ArrayList) hVar.n(i10);
                                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((gj) arrayList4.get(i11)).f24213k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            uz.a(d);
                            g0.g3(new gm(siVar, uz.d(uzVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j3, arrayList2, 3));
                            Runnable runnable = this.f23926e;
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
                f00 f00Var = (f00) this.f23927f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.f23928n;
                int i12 = 0;
                f00Var.getMessagesController().f4(tL_messages_savedDialogs.users, false);
                f00Var.getMessagesController().Z3(tL_messages_savedDialogs.chats, false);
                long j10 = this.f23924b;
                ArrayList arrayList5 = this.f23925c;
                f00Var.u(j10, arrayList5, this.d, false, 2, -1);
                long j11 = -j10;
                f00Var.getMessagesStorage().C1(f00Var.getConnectionsManager().getCurrentTime(), j11, (List) f00Var.f23807a.f(j10), true);
                f00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(n5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    ur messagesStorage = f00Var.getMessagesStorage();
                    messagesStorage.f27250a.c(new op(1, j11, longValue2, messagesStorage));
                    f00Var.s(j10, longValue2);
                }
                Runnable runnable2 = this.f23926e;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    public fi(f00 f00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f23927f = f00Var;
        this.h = tL_messages_savedDialogs;
        this.f23924b = j3;
        this.f23925c = arrayList;
        this.d = hVar;
        this.f23928n = hashSet;
        this.f23926e = runnable;
    }
}
