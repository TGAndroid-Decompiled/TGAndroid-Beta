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
public final class di implements Runnable {
    public final int f23084a = 1;
    public final long f23085b;
    public final ArrayList f23086c;
    public final a0.h d;
    public final Runnable f23087e;
    public final c1 f23088f;
    public final Object h;
    public final Object f23089n;

    public di(si siVar, wz wzVar, xz xzVar, ArrayList arrayList, long j3, a0.h hVar, Runnable runnable) {
        this.f23088f = siVar;
        this.h = wzVar;
        this.f23089n = xzVar;
        this.f23086c = arrayList;
        this.f23085b = j3;
        this.d = hVar;
        this.f23087e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f23084a) {
            case 0:
                si siVar = (si) this.f23088f;
                xz xzVar = (xz) this.f23089n;
                ArrayList arrayList = this.f23086c;
                xz.a((wz) this.h);
                wz d = xz.d(xzVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = siVar.getMessagesStorage().f27222b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j3 = this.f23085b;
                        a0.h hVar = this.d;
                        if (next) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue, siVar.getUserConfig().f24953n);
                                byteBufferValue.reuse();
                                TLdeserialize.f28072id = queryFinalized.intValue(1);
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
                                        gjVar2.f23817k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = gjVar2.f23817k.reply_to;
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
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((gj) arrayList4.get(i11)).f23817k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        }
                                    }
                                }
                            }
                            xz.a(d);
                            g0.h3(new gm(siVar, xz.d(xzVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j3, arrayList2, 3));
                            Runnable runnable = this.f23087e;
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
                h00 h00Var = (h00) this.f23088f;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) this.h;
                HashSet hashSet = (HashSet) this.f23089n;
                int i12 = 0;
                h00Var.getMessagesController().Y3(tL_messages_savedDialogs.users, false);
                h00Var.getMessagesController().S3(tL_messages_savedDialogs.chats, false);
                long j10 = this.f23085b;
                ArrayList arrayList5 = this.f23086c;
                h00Var.u(j10, arrayList5, this.d, false, 2, -1);
                long j11 = -j10;
                h00Var.getMessagesStorage().C1(h00Var.getConnectionsManager().getCurrentTime(), j11, (List) h00Var.f24008a.f(j10), true);
                h00Var.getMessagesStorage().j1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList5.size();
                while (i12 < size) {
                    Object obj = arrayList5.get(i12);
                    i12++;
                    hashSet.remove(Long.valueOf(m5.o(((TLRPC.TL_forumTopic) obj).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    vr messagesStorage = h00Var.getMessagesStorage();
                    messagesStorage.f27220a.c(new sp(1, j11, longValue2, messagesStorage));
                    h00Var.s(j10, longValue2);
                }
                Runnable runnable2 = this.f23087e;
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
        }
    }

    public di(h00 h00Var, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j3, ArrayList arrayList, a0.h hVar, HashSet hashSet, Runnable runnable) {
        this.f23088f = h00Var;
        this.h = tL_messages_savedDialogs;
        this.f23085b = j3;
        this.f23086c = arrayList;
        this.d = hVar;
        this.f23089n = hashSet;
        this.f23087e = runnable;
    }
}
