package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
public final class fo0 implements RequestDelegate {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public fo0(dw9 dw9Var, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, k47 k47Var, String str) {
        this.a = (byte) 14;
        this.e = dw9Var;
        this.b = decryptedMessage;
        this.c = encryptedChat;
        this.d = message;
        this.f = k47Var;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r27, org.telegram.tgnet.TLRPC.TL_error r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo0.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public fo0(oc7 oc7Var, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.e = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = obj4;
    }

    public fo0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.f = obj5;
    }
}
