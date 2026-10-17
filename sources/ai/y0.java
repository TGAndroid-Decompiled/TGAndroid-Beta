package ai;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class y0 implements Runnable {
    public final int f2467a;
    public final Object f2468b;
    public final Object f2469c;
    public final Object d;
    public final Object e;

    public y0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2467a = i10;
        this.f2468b = obj;
        this.f2469c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ig.y yVar = (ig.y) this.f2468b;
        TLObject tLObject = (TLObject) this.f2469c;
        TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
        Runnable runnable = (Runnable) this.e;
        ArrayList arrayList = yVar.f13087b;
        if (tLObject instanceof TL_account.TL_businessChatLink) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject;
            int indexOf = arrayList.indexOf(tL_businessChatLink);
            if (indexOf != -1) {
                arrayList.set(indexOf, tL_businessChatLink2);
                NotificationCenter.getInstance(yVar.f13086a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                }
                yVar.f();
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ai.y0.b():void");
    }

    private final void c() {
        ig.y1 y1Var = (ig.y1) this.f2468b;
        ArrayList<Integer> arrayList = (ArrayList) this.f2469c;
        ig.x1 x1Var = (ig.x1) this.d;
        TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
        int i10 = y1Var.f13093a;
        if (!arrayList.isEmpty() && arrayList.size() >= x1Var.a()) {
            tL_messages_sendQuickReplyMessages.f20387id = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_sendQuickReplyMessages, null);
            return;
        }
        TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
        tL_messages_getQuickReplyMessages.shortcut_id = x1Var.f13080a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getQuickReplyMessages, new p2(y1Var, arrayList, tL_messages_sendQuickReplyMessages, 11));
    }

    private final void d() {
        qi.e eVar = (qi.e) this.f2468b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2469c;
        m4.h hVar = (m4.h) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
        synchronized (eVar.f44777a) {
            try {
                if (!atomicBoolean.get()) {
                    eVar.l(hVar);
                } else {
                    atomicBoolean2.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: ai.y0.f():void");
    }

    private final void g() {
        throw new UnsupportedOperationException("Method not decompiled: ai.y0.g():void");
    }

    private final void h() {
        j9.e0 e0Var = (j9.e0) this.f2469c;
        e2.j jVar = (e2.j) this.d;
        j9.y yVar = (j9.y) this.e;
        if (((m4.f0) this.f2468b).j()) {
            e0Var.m(null);
            return;
        }
        try {
            jVar.accept(yVar);
            e0Var.m(null);
        } catch (Throwable th2) {
            e0Var.n(th2);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.y0.run():void");
    }

    public y0(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i10) {
        this.f2467a = i10;
        this.f2468b = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f2469c = tL_error;
    }
}
