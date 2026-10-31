package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class or implements Runnable {
    public final int f17297a;
    public final Object f17298b;
    public final long f17299c;
    public final Object d;

    public or(Object obj, Object obj2, long j10, int i10) {
        this.f17297a = i10;
        this.f17298b = obj;
        this.d = obj2;
        this.f17299c = j10;
    }

    private final void a() {
        t10 t10Var = (t10) this.f17298b;
        long j10 = this.f17299c;
        o10 o10Var = (o10) this.d;
        synchronized (t10Var) {
            try {
                ArrayList arrayList = (ArrayList) t10Var.H.get(Long.valueOf(j10));
                if (arrayList != null) {
                    arrayList.remove(o10Var);
                    if (arrayList.isEmpty()) {
                        t10Var.H.remove(Long.valueOf(j10));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = t10Var.getMessagesController().i1(j10);
        tL_messages_translateRichMessage.f19916id = o10Var.f17214b;
        tL_messages_translateRichMessage.to_lang = t10.D(o10Var.d);
        int sendRequest = t10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new qj(t10Var, o10Var, j10, 11));
        synchronized (t10Var) {
            o10Var.f17216f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.or.run():void");
    }

    public or(f1 f1Var, long j10, Object obj, int i10) {
        this.f17297a = i10;
        this.f17298b = f1Var;
        this.f17299c = j10;
        this.d = obj;
    }
}
