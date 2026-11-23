package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nu0;
public final class sq implements Runnable {
    public final int f26903a;
    public final Object f26904b;
    public final Object f26905c;

    public sq(int i7, Object obj, Object obj2) {
        this.f26903a = i7;
        this.f26904b = obj;
        this.f26905c = obj2;
    }

    private final void a() {
        ((nu0) this.f26904b).accept((HashSet) this.f26905c);
    }

    private final void b() {
        long j3;
        ys ysVar = (ys) this.f26904b;
        a0.h hVar = (a0.h) this.f26905c;
        ArrayList arrayList = ysVar.f28178b;
        ArrayList arrayList2 = ysVar.f28176a;
        int m10 = hVar.m();
        boolean z10 = false;
        for (int i7 = 0; i7 < m10; i7++) {
            hVar.j(i7);
            ArrayList arrayList3 = (ArrayList) hVar.n(i7);
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                gj gjVar = (gj) arrayList3.get(i10);
                if (gjVar.J) {
                    j3 = gj.B0(gjVar.f24213k);
                } else {
                    long j10 = gjVar.f24213k.peer_id.channel_id;
                    if (j10 != 0) {
                        j3 = -j10;
                    } else {
                        j3 = 0;
                    }
                }
                SparseArray sparseArray = (SparseArray) ysVar.f28180c.f(j3);
                if (sparseArray == null) {
                    break;
                }
                gj gjVar2 = (gj) sparseArray.get(gjVar.e1());
                if (gjVar2 != null && (gjVar2.I || gjVar2.J)) {
                    gjVar2 = null;
                }
                if (gjVar2 != null) {
                    sparseArray.put(gjVar.e1(), gjVar);
                    int indexOf = arrayList2.indexOf(gjVar2);
                    if (indexOf >= 0) {
                        arrayList2.set(indexOf, gjVar);
                    }
                    int indexOf2 = arrayList.indexOf(gjVar2);
                    if (indexOf2 >= 0) {
                        arrayList.set(indexOf2, gjVar);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            ysVar.Z(false);
        }
    }

    private final void c() {
        ((r10) this.f26904b).a(null, ((Throwable) this.f26905c).getMessage());
    }

    private final void d() {
        qv qvVar = (qv) this.f26905c;
        try {
            SQLitePreparedStatement executeFast = ((ur) this.f26904b).f27252b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
            executeFast.requery();
            executeFast.bindLong(1, 0L);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new ov(qvVar, 2));
    }

    private final void f() {
        yv yvVar = (yv) this.f26904b;
        TLRPC.Message message = (TLRPC.Message) this.f26905c;
        message.send_state = 2;
        yvVar.getNotificationCenter().k(ls.M, Integer.valueOf(message.f28455id));
        yvVar.getSendMessagesHelper().d0(message.f28455id);
        yvVar.getSendMessagesHelper().i0(message.f28455id, false);
    }

    private final void g() {
        TLRPC.Message message;
        az azVar = (az) this.f26904b;
        gj gjVar = (gj) this.f26905c;
        if (gjVar != null && (message = gjVar.f24213k) != null) {
            message.reqId = 0;
            if (message.send_state == 3) {
                message.send_state = 0;
                azVar.getNotificationCenter().k(ls.m0, Long.valueOf(gj.B0(gjVar.f24213k)), f3.i(gjVar));
            }
        }
    }

    private final void h() {
        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.f26905c;
        ((az) this.f26904b).getMessagesController().T3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    private final void i() {
        ry ryVar = ((py) this.f26904b).f26371b;
        HashSet hashSet = ryVar.f26696c;
        hashSet.remove((String) this.f26905c);
        ryVar.f26708q.getNotificationCenter().k(ls.f25399v1, Long.valueOf(ryVar.f26701j));
        if (hashSet.isEmpty()) {
            ry.a(ryVar);
        }
    }

    private final void j() {
        vy vyVar = (vy) this.f26904b;
        HashMap hashMap = vyVar.f27650a;
        hashMap.remove((String) this.f26905c);
        vyVar.f27662o.getNotificationCenter().k(ls.f25406w1, vyVar.f27653e);
        if (hashMap.isEmpty()) {
            vyVar.b();
        }
    }

    private final void k() {
        long j3;
        f00 f00Var = (f00) this.f26904b;
        ArrayList arrayList = (ArrayList) this.f26905c;
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            tr trVar = (tr) arrayList.get(i7);
            long j10 = -trVar.f27073a;
            a0.h hVar = (a0.h) f00Var.f23808b.f(j10);
            if (hVar != null) {
                hVar.l(trVar.f27074b);
            }
            ArrayList arrayList2 = (ArrayList) f00Var.f23807a.f(j10);
            if (arrayList2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if (f00Var.getMessagesController().E2(trVar.f27073a)) {
                        j3 = n5.o(((TLRPC.TL_forumTopic) arrayList2.get(i10)).from_id);
                    } else {
                        j3 = ((TLRPC.TL_forumTopic) arrayList2.get(i10)).f28486id;
                    }
                    if (j3 == trVar.f27074b) {
                        arrayList2.remove(i10);
                        f00Var.getNotificationCenter().k(ls.f25420y1, Long.valueOf(-j10), Long.valueOf(trVar.f27074b));
                        hashSet.add(Long.valueOf(j10));
                        break;
                    }
                    i10++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f00Var.y(((Long) it.next()).longValue(), true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sq.run():void");
    }

    public sq(qv qvVar, ur urVar) {
        this.f26903a = 18;
        this.f26905c = qvVar;
        this.f26904b = urVar;
    }
}
