package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.mu0;
public final class rq implements Runnable {
    public final int f26790a;
    public final Object f26791b;
    public final Object f26792c;

    public rq(int i7, Object obj, Object obj2) {
        this.f26790a = i7;
        this.f26791b = obj;
        this.f26792c = obj2;
    }

    private final void a() {
        ((mu0) this.f26791b).accept((HashSet) this.f26792c);
    }

    private final void b() {
        long j3;
        xs xsVar = (xs) this.f26791b;
        a0.h hVar = (a0.h) this.f26792c;
        ArrayList arrayList = xsVar.f28082b;
        ArrayList arrayList2 = xsVar.f28080a;
        int m10 = hVar.m();
        boolean z10 = false;
        for (int i7 = 0; i7 < m10; i7++) {
            hVar.j(i7);
            ArrayList arrayList3 = (ArrayList) hVar.n(i7);
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                fj fjVar = (fj) arrayList3.get(i10);
                if (fjVar.J) {
                    j3 = fj.B0(fjVar.f24073k);
                } else {
                    long j10 = fjVar.f24073k.peer_id.channel_id;
                    if (j10 != 0) {
                        j3 = -j10;
                    } else {
                        j3 = 0;
                    }
                }
                SparseArray sparseArray = (SparseArray) xsVar.f28084c.f(j3);
                if (sparseArray == null) {
                    break;
                }
                fj fjVar2 = (fj) sparseArray.get(fjVar.e1());
                if (fjVar2 != null && (fjVar2.I || fjVar2.J)) {
                    fjVar2 = null;
                }
                if (fjVar2 != null) {
                    sparseArray.put(fjVar.e1(), fjVar);
                    int indexOf = arrayList2.indexOf(fjVar2);
                    if (indexOf >= 0) {
                        arrayList2.set(indexOf, fjVar);
                    }
                    int indexOf2 = arrayList.indexOf(fjVar2);
                    if (indexOf2 >= 0) {
                        arrayList.set(indexOf2, fjVar);
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            xsVar.Z(false);
        }
    }

    private final void c() {
        ((p10) this.f26791b).a(null, ((Throwable) this.f26792c).getMessage());
    }

    private final void d() {
        pv pvVar = (pv) this.f26792c;
        try {
            SQLitePreparedStatement executeFast = ((tr) this.f26791b).f27151b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
            executeFast.requery();
            executeFast.bindLong(1, 0L);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new nv(pvVar, 2));
    }

    private final void f() {
        xv xvVar = (xv) this.f26791b;
        TLRPC.Message message = (TLRPC.Message) this.f26792c;
        message.send_state = 2;
        xvVar.getNotificationCenter().k(ks.M, Integer.valueOf(message.f28513id));
        xvVar.getSendMessagesHelper().d0(message.f28513id);
        xvVar.getSendMessagesHelper().i0(message.f28513id, false);
    }

    private final void g() {
        TLRPC.Message message;
        zy zyVar = (zy) this.f26791b;
        fj fjVar = (fj) this.f26792c;
        if (fjVar != null && (message = fjVar.f24073k) != null) {
            message.reqId = 0;
            if (message.send_state == 3) {
                message.send_state = 0;
                zyVar.getNotificationCenter().k(ks.m0, Long.valueOf(fj.B0(fjVar.f24073k)), f3.i(fjVar));
            }
        }
    }

    private final void h() {
        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.f26792c;
        ((zy) this.f26791b).getMessagesController().T3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    private final void i() {
        qy qyVar = ((oy) this.f26791b).f26222b;
        HashSet hashSet = qyVar.f26597c;
        hashSet.remove((String) this.f26792c);
        qyVar.f26609q.getNotificationCenter().k(ks.f25304v1, Long.valueOf(qyVar.f26602j));
        if (hashSet.isEmpty()) {
            qy.a(qyVar);
        }
    }

    private final void j() {
        uy uyVar = (uy) this.f26791b;
        HashMap hashMap = uyVar.f27390a;
        hashMap.remove((String) this.f26792c);
        uyVar.f27402o.getNotificationCenter().k(ks.f25311w1, uyVar.f27393e);
        if (hashMap.isEmpty()) {
            uyVar.b();
        }
    }

    private final void k() {
        long j3;
        d00 d00Var = (d00) this.f26791b;
        ArrayList arrayList = (ArrayList) this.f26792c;
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            sr srVar = (sr) arrayList.get(i7);
            long j10 = -srVar.f26946a;
            a0.h hVar = (a0.h) d00Var.f23571b.f(j10);
            if (hVar != null) {
                hVar.l(srVar.f26947b);
            }
            ArrayList arrayList2 = (ArrayList) d00Var.f23570a.f(j10);
            if (arrayList2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if (d00Var.getMessagesController().E2(srVar.f26946a)) {
                        j3 = n5.o(((TLRPC.TL_forumTopic) arrayList2.get(i10)).from_id);
                    } else {
                        j3 = ((TLRPC.TL_forumTopic) arrayList2.get(i10)).f28544id;
                    }
                    if (j3 == srVar.f26947b) {
                        arrayList2.remove(i10);
                        d00Var.getNotificationCenter().k(ks.f25325y1, Long.valueOf(-j10), Long.valueOf(srVar.f26947b));
                        hashSet.add(Long.valueOf(j10));
                        break;
                    }
                    i10++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            d00Var.y(((Long) it.next()).longValue(), true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rq.run():void");
    }

    public rq(pv pvVar, tr trVar) {
        this.f26790a = 18;
        this.f26792c = pvVar;
        this.f26791b = trVar;
    }
}
