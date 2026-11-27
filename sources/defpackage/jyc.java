package defpackage;

import org.telegram.tgnet.RequestTimeDelegate;
public final class jyc implements RequestTimeDelegate {
    public final lyc a;
    public final kyc b;

    public jyc(lyc lycVar, kyc kycVar) {
        this.a = lycVar;
        this.b = kycVar;
    }

    @Override
    public final void run(long j) {
        hl.c3(new j5b(this.a, this.b, j, (byte) 15));
    }
}
