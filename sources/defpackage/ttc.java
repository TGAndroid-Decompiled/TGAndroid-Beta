package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.c;
public final class ttc implements kcc {
    public final byte a;
    public final euc b;
    public final c c;
    public final long d;

    public ttc(euc eucVar, c cVar, long j, byte b) {
        this.a = b;
        this.b = eucVar;
        this.c = cVar;
        this.d = j;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte[] bArr = null;
        final euc eucVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                final pcc pccVar = (pcc) obj3;
                TLRPC.User user = eucVar.f;
                String str2 = eucVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = eucVar.m0();
                }
                this.c.n0(user, str2, this.d, str, bArr, null, eucVar.n, new pcc() {
                    @Override
                    public final void a(Object obj4) {
                        byte b2 = r3;
                        pcc pccVar2 = pccVar;
                        euc eucVar2 = eucVar;
                        String str3 = (String) obj4;
                        eucVar2.getClass();
                        switch (b2) {
                            case 0:
                                pccVar2.a(str3);
                                if (!c.K(str3) && str3 == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                pccVar2.a(str3);
                                if (!c.K(str3) && str3 == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                }, new stc(eucVar, (byte) 2));
                return;
            default:
                String str3 = (String) obj;
                final pcc pccVar2 = (pcc) obj3;
                TLRPC.User user2 = eucVar.f;
                String str4 = eucVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = eucVar.m0();
                }
                String str5 = eucVar.n;
                pcc pccVar3 = new pcc() {
                    @Override
                    public final void a(Object obj4) {
                        byte b2 = r3;
                        pcc pccVar22 = pccVar2;
                        euc eucVar2 = eucVar;
                        String str32 = (String) obj4;
                        eucVar2.getClass();
                        switch (b2) {
                            case 0:
                                pccVar22.a(str32);
                                if (!c.K(str32) && str32 == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                pccVar22.a(str32);
                                if (!c.K(str32) && str32 == null) {
                                    eucVar2.fragmentView.postDelayed(new ptc(eucVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                };
                stc stcVar = new stc(eucVar, (byte) 3);
                this.c.n0(user2, str4, this.d, str3, bArr, null, str5, pccVar3, stcVar);
                return;
        }
    }
}
