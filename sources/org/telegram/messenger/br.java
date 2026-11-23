package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class br implements Runnable {
    public final int f23247a;
    public final Object f23248b;
    public final long f23249c;
    public final Object d;

    public br(Object obj, Object obj2, long j3, int i7) {
        this.f23247a = i7;
        this.f23248b = obj;
        this.d = obj2;
        this.f23249c = j3;
    }

    private final void a() {
        y00 y00Var = (y00) this.f23248b;
        long j3 = this.f23249c;
        t00 t00Var = (t00) this.d;
        synchronized (y00Var) {
            try {
                ArrayList arrayList = (ArrayList) y00Var.I.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(t00Var);
                    if (arrayList.isEmpty()) {
                        y00Var.I.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = y00Var.getMessagesController().l1(j3);
        tL_messages_translateRichMessage.f28615id = t00Var.f27024b;
        tL_messages_translateRichMessage.to_lang = y00.D(t00Var.d);
        int sendRequest = y00Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new go(y00Var, t00Var, j3, 12));
        synchronized (y00Var) {
            t00Var.f27027f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.br.run():void");
    }

    public br(c1 c1Var, long j3, Object obj, int i7) {
        this.f23247a = i7;
        this.f23248b = c1Var;
        this.f23249c = j3;
        this.d = obj;
    }
}
