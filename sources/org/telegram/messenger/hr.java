package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hr implements Runnable {
    public final int f22978a;
    public final Object f22979b;
    public final long f22980c;
    public final Object d;

    public hr(Object obj, Object obj2, long j3, int i7) {
        this.f22978a = i7;
        this.f22979b = obj;
        this.d = obj2;
        this.f22980c = j3;
    }

    private final void a() {
        f10 f10Var = (f10) this.f22979b;
        long j3 = this.f22980c;
        a10 a10Var = (a10) this.d;
        synchronized (f10Var) {
            try {
                ArrayList arrayList = (ArrayList) f10Var.H.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(a10Var);
                    if (arrayList.isEmpty()) {
                        f10Var.H.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = f10Var.getMessagesController().j1(j3);
        tL_messages_translateRichMessage.f27076id = a10Var.f21365b;
        tL_messages_translateRichMessage.to_lang = f10.D(a10Var.d);
        int sendRequest = f10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new oj(f10Var, a10Var, j3, 12));
        synchronized (f10Var) {
            a10Var.f21368f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hr.run():void");
    }

    public hr(c1 c1Var, long j3, Object obj, int i7) {
        this.f22978a = i7;
        this.f22979b = c1Var;
        this.f22980c = j3;
        this.d = obj;
    }
}
