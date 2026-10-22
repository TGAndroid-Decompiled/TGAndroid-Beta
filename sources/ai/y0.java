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
    public final int f2464a;
    public final Object f2465b;
    public final Object f2466c;
    public final Object d;
    public final Object e;

    public y0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2464a = i10;
        this.f2465b = obj;
        this.f2466c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ig.y yVar = (ig.y) this.f2465b;
        TLObject tLObject = (TLObject) this.f2466c;
        TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
        Runnable runnable = (Runnable) this.e;
        ArrayList arrayList = yVar.f13089b;
        if (tLObject instanceof TL_account.TL_businessChatLink) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject;
            int indexOf = arrayList.indexOf(tL_businessChatLink);
            if (indexOf != -1) {
                arrayList.set(indexOf, tL_businessChatLink2);
                NotificationCenter.getInstance(yVar.f13088a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
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
        ig.a2 a2Var = (ig.a2) this.f2465b;
        ArrayList<Integer> arrayList = (ArrayList) this.f2466c;
        ig.z1 z1Var = (ig.z1) this.d;
        TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
        int i10 = a2Var.f12825a;
        if (!arrayList.isEmpty() && arrayList.size() >= z1Var.a()) {
            tL_messages_sendQuickReplyMessages.f20394id = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_sendQuickReplyMessages, null);
            return;
        }
        TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
        tL_messages_getQuickReplyMessages.shortcut_id = z1Var.f13098a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getQuickReplyMessages, new j2(a2Var, arrayList, tL_messages_sendQuickReplyMessages, 11));
    }

    private final void d() {
        qi.e eVar = (qi.e) this.f2465b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2466c;
        m4.h hVar = (m4.h) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
        synchronized (eVar.f44763a) {
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
        j9.e0 e0Var = (j9.e0) this.f2466c;
        e2.j jVar = (e2.j) this.d;
        j9.y yVar = (j9.y) this.e;
        if (((m4.f0) this.f2465b).j()) {
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
        this.f2464a = i10;
        this.f2465b = obj;
        this.d = tLObject;
        this.e = obj2;
        this.f2466c = tL_error;
    }
}
