package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fr implements Runnable {
    public final int f23539a;
    public final Object f23540b;
    public final long f23541c;
    public final Object d;

    public fr(Object obj, Object obj2, long j3, int i7) {
        this.f23539a = i7;
        this.f23540b = obj;
        this.d = obj2;
        this.f23541c = j3;
    }

    private final void a() {
        c10 c10Var = (c10) this.f23540b;
        long j3 = this.f23541c;
        x00 x00Var = (x00) this.d;
        synchronized (c10Var) {
            try {
                ArrayList arrayList = (ArrayList) c10Var.I.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(x00Var);
                    if (arrayList.isEmpty()) {
                        c10Var.I.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = c10Var.getMessagesController().j1(j3);
        tL_messages_translateRichMessage.f28174id = x00Var.f27447b;
        tL_messages_translateRichMessage.to_lang = c10.D(x00Var.d);
        int sendRequest = c10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new mj(c10Var, x00Var, j3, 12));
        synchronized (c10Var) {
            x00Var.f27450f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fr.run():void");
    }

    public fr(c1 c1Var, long j3, Object obj, int i7) {
        this.f23539a = i7;
        this.f23540b = c1Var;
        this.f23541c = j3;
        this.d = obj;
    }
}
