package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class ko implements RequestDelegate {
    public final int f16615a;
    public final f1 f16616b;
    public final Object f16617c;
    public final Object d;
    public final Object e;
    public final Object f16618f;

    public ko(f1 f1Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16615a = i10;
        this.f16616b = f1Var;
        this.f16617c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16618f = obj4;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r27, org.telegram.tgnet.TLRPC.TL_error r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ko.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public ko(ow owVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, jj jjVar, String str) {
        this.f16615a = 3;
        this.f16616b = owVar;
        this.f16617c = decryptedMessage;
        this.d = encryptedChat;
        this.e = message;
        this.f16618f = jjVar;
    }
}
