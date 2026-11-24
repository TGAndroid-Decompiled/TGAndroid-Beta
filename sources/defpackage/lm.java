package defpackage;

import org.telegram.tgnet.TLRPC;
public final class lm implements sm {
    public final byte a;
    public final vm b;

    public lm(vm vmVar, byte b) {
        this.a = b;
        this.b = vmVar;
    }

    @Override
    public final void a(TLRPC.Document document) {
        byte b = this.a;
        vm vmVar = this.b;
        switch (b) {
            case 0:
                vmVar.e = document;
                vmVar.i(false);
                return;
            default:
                vmVar.e = document;
                vmVar.i(false);
                return;
        }
    }
}
