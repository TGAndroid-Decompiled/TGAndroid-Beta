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
public final class wh implements Runnable {
    public final int f26201a = 1;
    public final long f26202b;
    public final ArrayList f26203c;
    public final a0.h d;
    public final Runnable f26204e;
    public final c1 f26205f;
    public final Object h;
    public final Object f26206n;

    public wh(li liVar, rz rzVar, sz szVar, ArrayList arrayList, long j10, a0.h hVar, Runnable runnable) {
        this.f26205f = liVar;
        this.h = rzVar;
        this.f26206n = szVar;
        this.f26203c = arrayList;
        this.f26202b = j10;
        this.d = hVar;
        this.f26204e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f26201a) {
            case 0:
                li liVar = (li) this.f26205f;
                sz szVar = (sz) this.f26206n;
                ArrayList arrayList = this.f26203c;
                sz.a((rz) this.h);
                rz d = sz.d(szVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().f24936b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j10 = this.f26202b;
                        a0.h hVar = this.d;
                        if (next) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, liVar.getUserConfig().f22848n);
                                byteBufferValue.reuse();
                                TLdeserialize.f27022id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j10;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList3 = (ArrayList) hVar.f(longValue);
                                hVar.l(longValue);
                                if (arrayList3 != null) {
                                    zi ziVar = new zi(liVar.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(ziVar);
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        zi ziVar2 = (zi) arrayList3.get(i3);
                                        ziVar2.C = ziVar;
                                        ziVar2.m();
                                        ziVar2.f26868k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = ziVar2.f26868k.reply_to;
                                        messageReplyHeader.flags |= 16;
                                        messageReplyHeader.reply_to_msg_id = ziVar.M1();
                                    }
                                }
                            }
                        } else {
                            queryFinalized.dispose();
                            if (hVar.m() != 0) {
                                for (int i10 = 0; i10 < hVar.m(); i10++) {
                                    ArrayList arrayList4 = (ArrayList) hVar.n(i10);
                                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((zi) arrayList4.get(i11)).f26868k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            sz.a(d);
                            g0.h3(new zl(liVar, sz.d(szVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j10, arrayList2, 3));
                            Runnable runnable = this.f26204e;
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
                c00 c00Var = (c00) this.f26205f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.f26206n;
                int i12 = 0;
                c00Var.getMessagesController().Y3(tL_messages_savedDialogs.users, false);
                c00Var.getMessagesController().S3(tL_messages_savedDialogs.chats, false);
                long j11 = this.f26202b;
                ArrayList arrayList5 = this.f26203c;
                c00Var.u(j11, arrayList5, this.d, false, 2, -1);
                long j12 = -j11;
                c00Var.getMessagesStorage().C1(c00Var.getConnectionsManager().getCurrentTime(), j12, (List) c00Var.f21922a.f(j11), true);
                c00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(m5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    qr messagesStorage = c00Var.getMessagesStorage();
                    messagesStorage.f24934a.c(new mp(1, j12, longValue2, messagesStorage));
                    c00Var.s(j11, longValue2);
                }
                Runnable runnable2 = this.f26204e;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    public wh(c00 c00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j10, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f26205f = c00Var;
        this.h = tL_messages_savedDialogs;
        this.f26202b = j10;
        this.f26203c = arrayList;
        this.d = hVar;
        this.f26206n = hashSet;
        this.f26204e = runnable;
    }
}
