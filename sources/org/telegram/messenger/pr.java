package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pr implements Runnable {
    public final int f17630a;
    public final Object f17631b;
    public final long f17632c;
    public final Object d;

    public pr(Object obj, Object obj2, long j10, int i10) {
        this.f17630a = i10;
        this.f17631b = obj;
        this.d = obj2;
        this.f17632c = j10;
    }

    private final void a() {
        u10 u10Var = (u10) this.f17631b;
        long j10 = this.f17632c;
        p10 p10Var = (p10) this.d;
        synchronized (u10Var) {
            try {
                ArrayList arrayList = (ArrayList) u10Var.H.get(Long.valueOf(j10));
                if (arrayList != null) {
                    arrayList.remove(p10Var);
                    if (arrayList.isEmpty()) {
                        u10Var.H.remove(Long.valueOf(j10));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = u10Var.getMessagesController().i1(j10);
        tL_messages_translateRichMessage.f19917id = p10Var.f17551b;
        tL_messages_translateRichMessage.to_lang = u10.D(p10Var.d);
        int sendRequest = u10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new rj(u10Var, p10Var, j10, 12));
        synchronized (u10Var) {
            p10Var.f17553f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pr.run():void");
    }

    public pr(f1 f1Var, long j10, Object obj, int i10) {
        this.f17630a = i10;
        this.f17631b = f1Var;
        this.f17632c = j10;
        this.d = obj;
    }
}
