package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class br implements Runnable {
    public final int f23150a;
    public final Object f23151b;
    public final long f23152c;
    public final Object d;

    public br(Object obj, Object obj2, long j3, int i7) {
        this.f23150a = i7;
        this.f23151b = obj;
        this.d = obj2;
        this.f23152c = j3;
    }

    private final void a() {
        z00 z00Var = (z00) this.f23151b;
        long j3 = this.f23152c;
        u00 u00Var = (u00) this.d;
        synchronized (z00Var) {
            try {
                ArrayList arrayList = (ArrayList) z00Var.I.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(u00Var);
                    if (arrayList.isEmpty()) {
                        z00Var.I.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = z00Var.getMessagesController().l1(j3);
        tL_messages_translateRichMessage.f28554id = u00Var.f27136b;
        tL_messages_translateRichMessage.to_lang = z00.D(u00Var.d);
        int sendRequest = z00Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new go(z00Var, u00Var, j3, 12));
        synchronized (z00Var) {
            u00Var.f27139f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.br.run():void");
    }

    public br(c1 c1Var, long j3, Object obj, int i7) {
        this.f23150a = i7;
        this.f23151b = c1Var;
        this.f23152c = j3;
        this.d = obj;
    }
}
