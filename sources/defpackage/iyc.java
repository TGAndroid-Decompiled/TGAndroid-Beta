package defpackage;

import org.telegram.tgnet.ConnectionsManager;
public final class iyc implements Runnable {
    public final byte a;
    public final lyc b;
    public final kyc c;

    public iyc(lyc lycVar, kyc kycVar, byte b) {
        this.a = b;
        this.b = lycVar;
        this.c = kycVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        kyc kycVar = this.c;
        lyc lycVar = this.b;
        switch (b) {
            case 0:
                if (((kyc) lycVar.c) == kycVar) {
                    lycVar.d = null;
                    lycVar.s(kycVar);
                    return;
                }
                return;
            case 1:
                if (((kyc) lycVar.c) == kycVar) {
                    iyc iycVar = (iyc) lycVar.d;
                    if (iycVar != null) {
                        hl.r(iycVar);
                        lycVar.d = null;
                    }
                    int i = kycVar.d;
                    if (i == 0) {
                        lycVar.s(kycVar);
                        return;
                    }
                    iyc iycVar2 = new iyc(lycVar, kycVar, (byte) 2);
                    lycVar.e = iycVar2;
                    hl.d3(iycVar2, 20000L);
                    ht2 ht2Var = kycVar.a;
                    ((ConnectionsManager) ht2Var.b).checkWebProxyInternal(kycVar.b, i, new jyc(lycVar, kycVar));
                    return;
                }
                return;
            default:
                if (((kyc) lycVar.c) == kycVar) {
                    lycVar.e = null;
                    lycVar.s(kycVar);
                    return;
                }
                return;
        }
    }
}
