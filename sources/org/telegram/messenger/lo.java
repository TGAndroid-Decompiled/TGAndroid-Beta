package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class lo implements RequestDelegate {
    public final int f16980a;
    public final f1 f16981b;
    public final Object f16982c;
    public final Object d;
    public final Object e;
    public final Object f16983f;

    public lo(f1 f1Var, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16980a = i10;
        this.f16981b = f1Var;
        this.f16982c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16983f = obj4;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r27, org.telegram.tgnet.TLRPC.TL_error r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.lo.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public lo(pw pwVar, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, kj kjVar, String str) {
        this.f16980a = 3;
        this.f16981b = pwVar;
        this.f16982c = decryptedMessage;
        this.d = encryptedChat;
        this.e = message;
        this.f16983f = kjVar;
    }
}
