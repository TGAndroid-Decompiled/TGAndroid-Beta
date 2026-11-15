package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.tgnet.TLRPC;
public final class pq implements Runnable {
    public final int f25967a;
    public final Object f25968b;
    public final Object f25969c;

    public pq(int i7, Object obj, Object obj2) {
        this.f25967a = i7;
        this.f25968b = obj;
        this.f25969c = obj2;
    }

    private final void a() {
        long j3;
        at atVar = (at) this.f25968b;
        a0.h hVar = (a0.h) this.f25969c;
        ArrayList arrayList = atVar.f22567b;
        ArrayList arrayList2 = atVar.f22565a;
        int m10 = hVar.m();
        boolean z10 = false;
        for (int i7 = 0; i7 < m10; i7++) {
            hVar.j(i7);
            ArrayList arrayList3 = (ArrayList) hVar.n(i7);
            int size = arrayList3.size();
            for (int i10 = 0; i10 < size; i10++) {
                gj gjVar = (gj) arrayList3.get(i10);
                if (gjVar.J) {
                    j3 = gj.B0(gjVar.f23819k);
                } else {
                    long j10 = gjVar.f23819k.peer_id.channel_id;
                    if (j10 != 0) {
                        j3 = -j10;
                    } else {
                        j3 = 0;
                    }
                }
                SparseArray sparseArray = (SparseArray) atVar.f22569c.f(j3);
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
            atVar.Z(false);
        }
    }

    private final void b() {
        bw bwVar = (bw) this.f25968b;
        TLRPC.Message message = (TLRPC.Message) this.f25969c;
        message.send_state = 2;
        bwVar.getNotificationCenter().k(ns.M, Integer.valueOf(message.f28072id));
        bwVar.getSendMessagesHelper().d0(message.f28072id);
        bwVar.getSendMessagesHelper().i0(message.f28072id, false);
    }

    private final void c() {
        TLRPC.Message message;
        ez ezVar = (ez) this.f25968b;
        gj gjVar = (gj) this.f25969c;
        if (gjVar != null && (message = gjVar.f23819k) != null) {
            message.reqId = 0;
            if (message.send_state == 3) {
                message.send_state = 0;
                ezVar.getNotificationCenter().k(ns.m0, Long.valueOf(gj.B0(gjVar.f23819k)), k5.j(gjVar));
            }
        }
    }

    private final void d() {
        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.f25969c;
        ((ez) this.f25968b).getMessagesController().M3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
    }

    private final void f() {
        vy vyVar = ((ty) this.f25968b).f26761b;
        HashSet hashSet = vyVar.f27267c;
        hashSet.remove((String) this.f25969c);
        vyVar.f27279q.getNotificationCenter().k(ns.f25588v1, Long.valueOf(vyVar.f27272j));
        if (hashSet.isEmpty()) {
            vy.a(vyVar);
        }
    }

    private final void g() {
        zy zyVar = (zy) this.f25968b;
        HashMap hashMap = zyVar.f28031a;
        hashMap.remove((String) this.f25969c);
        zyVar.f28043o.getNotificationCenter().k(ns.f25595w1, zyVar.f28034e);
        if (hashMap.isEmpty()) {
            zyVar.b();
        }
    }

    private final void h() {
        long j3;
        h00 h00Var = (h00) this.f25968b;
        ArrayList arrayList = (ArrayList) this.f25969c;
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ur urVar = (ur) arrayList.get(i7);
            long j10 = -urVar.f26861a;
            a0.h hVar = (a0.h) h00Var.f24012b.f(j10);
            if (hVar != null) {
                hVar.l(urVar.f26862b);
            }
            ArrayList arrayList2 = (ArrayList) h00Var.f24011a.f(j10);
            if (arrayList2 != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    }
                    if (h00Var.getMessagesController().y2(urVar.f26861a)) {
                        j3 = m5.o(((TLRPC.TL_forumTopic) arrayList2.get(i10)).from_id);
                    } else {
                        j3 = ((TLRPC.TL_forumTopic) arrayList2.get(i10)).f28103id;
                    }
                    if (j3 == urVar.f26862b) {
                        arrayList2.remove(i10);
                        h00Var.getNotificationCenter().k(ns.f25609y1, Long.valueOf(-j10), Long.valueOf(urVar.f26862b));
                        hashSet.add(Long.valueOf(j10));
                        break;
                    }
                    i10++;
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            h00Var.y(((Long) it.next()).longValue(), true);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pq.run():void");
    }

    public pq(tv tvVar, vr vrVar) {
        this.f25967a = 17;
        this.f25969c = tvVar;
        this.f25968b = vrVar;
    }
}
