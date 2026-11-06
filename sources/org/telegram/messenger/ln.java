package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ln implements Runnable {
    public final int f23903a;
    public final boolean f23904b;
    public final Object f23905c;
    public final Object d;
    public final Object f23906e;
    public final Object f23907f;

    public ln(Object obj, Object obj2, Object obj3, Object obj4, boolean z9, int i7) {
        this.f23903a = i7;
        this.f23905c = obj;
        this.d = obj2;
        this.f23906e = obj3;
        this.f23904b = z9;
        this.f23907f = obj4;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ln.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ln.run():void");
    }

    public ln(c1 c1Var, Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f23903a = i7;
        this.f23905c = c1Var;
        this.d = obj;
        this.f23906e = obj2;
        this.f23907f = obj3;
        this.f23904b = z9;
    }

    public ln(c1 c1Var, TLRPC.Message message, boolean z9, Object obj, Object obj2, int i7) {
        this.f23903a = i7;
        this.f23905c = c1Var;
        this.d = message;
        this.f23904b = z9;
        this.f23906e = obj;
        this.f23907f = obj2;
    }

    public ln(ij ijVar, gz gzVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        this.f23903a = 5;
        this.f23905c = gzVar;
        this.d = tL_messages_editMessage;
        this.f23907f = ijVar;
        this.f23906e = f2Var;
        this.f23904b = z9;
    }
}
