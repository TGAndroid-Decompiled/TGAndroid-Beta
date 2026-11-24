package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.c;
public final class hpc implements k8c {
    public final byte a;
    public final qpc b;
    public final c c;
    public final long d;

    public hpc(qpc qpcVar, c cVar, long j, byte b) {
        this.a = b;
        this.b = qpcVar;
        this.c = cVar;
        this.d = j;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte[] bArr = null;
        final qpc qpcVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                final p8c p8cVar = (p8c) obj3;
                TLRPC.User user = qpcVar.f;
                String str2 = qpcVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = qpcVar.m0();
                }
                this.c.l0(user, str2, this.d, str, bArr, null, qpcVar.n, new p8c() {
                    @Override
                    public final void a(Object obj4) {
                        byte b2 = r3;
                        p8c p8cVar2 = p8cVar;
                        qpc qpcVar2 = qpcVar;
                        String str3 = (String) obj4;
                        qpcVar2.getClass();
                        switch (b2) {
                            case 0:
                                p8cVar2.a(str3);
                                if (!c.K(str3) && str3 == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                p8cVar2.a(str3);
                                if (!c.K(str3) && str3 == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                }, new gpc(qpcVar, (byte) 2));
                return;
            default:
                String str3 = (String) obj;
                final p8c p8cVar2 = (p8c) obj3;
                TLRPC.User user2 = qpcVar.f;
                String str4 = qpcVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = qpcVar.m0();
                }
                String str5 = qpcVar.n;
                p8c p8cVar3 = new p8c() {
                    @Override
                    public final void a(Object obj4) {
                        byte b2 = r3;
                        p8c p8cVar22 = p8cVar2;
                        qpc qpcVar2 = qpcVar;
                        String str32 = (String) obj4;
                        qpcVar2.getClass();
                        switch (b2) {
                            case 0:
                                p8cVar22.a(str32);
                                if (!c.K(str32) && str32 == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                p8cVar22.a(str32);
                                if (!c.K(str32) && str32 == null) {
                                    qpcVar2.fragmentView.postDelayed(new dpc(qpcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                };
                gpc gpcVar = new gpc(qpcVar, (byte) 3);
                this.c.l0(user2, str4, this.d, str3, bArr, null, str5, p8cVar3, gpcVar);
                return;
        }
    }
}
