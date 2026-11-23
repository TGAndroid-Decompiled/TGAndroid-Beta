package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cr implements Runnable {
    public final int f23328a;
    public final Object f23329b;
    public final long f23330c;
    public final Object d;

    public cr(Object obj, Object obj2, long j3, int i7) {
        this.f23328a = i7;
        this.f23329b = obj;
        this.d = obj2;
        this.f23330c = j3;
    }

    private final void a() {
        a10 a10Var = (a10) this.f23329b;
        long j3 = this.f23330c;
        v00 v00Var = (v00) this.d;
        synchronized (a10Var) {
            try {
                ArrayList arrayList = (ArrayList) a10Var.I.get(Long.valueOf(j3));
                if (arrayList != null) {
                    arrayList.remove(v00Var);
                    if (arrayList.isEmpty()) {
                        a10Var.I.remove(Long.valueOf(j3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
        tL_messages_translateRichMessage.flags |= 1;
        tL_messages_translateRichMessage.peer = a10Var.getMessagesController().l1(j3);
        tL_messages_translateRichMessage.f28521id = v00Var.f27267b;
        tL_messages_translateRichMessage.to_lang = a10.D(v00Var.d);
        int sendRequest = a10Var.getConnectionsManager().sendRequest(tL_messages_translateRichMessage, new ho(a10Var, v00Var, j3, 12));
        synchronized (a10Var) {
            v00Var.f27270f = sendRequest;
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cr.run():void");
    }

    public cr(c1 c1Var, long j3, Object obj, int i7) {
        this.f23328a = i7;
        this.f23329b = c1Var;
        this.f23330c = j3;
        this.d = obj;
    }
}
