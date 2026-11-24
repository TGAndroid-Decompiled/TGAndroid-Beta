package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Wallet.c;
public final class jrc implements lac {
    public final byte a;
    public final rrc b;
    public final c c;
    public final long d;

    public jrc(rrc rrcVar, c cVar, long j, byte b) {
        this.a = b;
        this.b = rrcVar;
        this.c = cVar;
        this.d = j;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte[] bArr = null;
        final rrc rrcVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                final qac qacVar = (qac) obj3;
                TLRPC.User user = rrcVar.f;
                String str2 = rrcVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = rrcVar.n0();
                }
                this.c.l0(user, str2, this.d, str, bArr, null, rrcVar.n, new qac() {
                    @Override
                    public final void a(Object obj4) {
                        byte b2 = r3;
                        qac qacVar2 = qacVar;
                        rrc rrcVar2 = rrcVar;
                        String str3 = (String) obj4;
                        rrcVar2.getClass();
                        switch (b2) {
                            case 0:
                                qacVar2.a(str3);
                                if (!c.K(str3) && str3 == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                qacVar2.a(str3);
                                if (!c.K(str3) && str3 == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                }, new irc(rrcVar, (byte) 2));
                return;
            default:
                String str3 = (String) obj;
                final qac qacVar2 = (qac) obj3;
                TLRPC.User user2 = rrcVar.f;
                String str4 = rrcVar.h;
                if (((Boolean) obj2).booleanValue()) {
                    bArr = rrcVar.n0();
                }
                String str5 = rrcVar.n;
                qac qacVar3 = new qac() {
                    @Override
                    public final void a(Object obj4) {
                        byte b2 = r3;
                        qac qacVar22 = qacVar2;
                        rrc rrcVar2 = rrcVar;
                        String str32 = (String) obj4;
                        rrcVar2.getClass();
                        switch (b2) {
                            case 0:
                                qacVar22.a(str32);
                                if (!c.K(str32) && str32 == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                            default:
                                qacVar22.a(str32);
                                if (!c.K(str32) && str32 == null) {
                                    rrcVar2.fragmentView.postDelayed(new frc(rrcVar2, (byte) 4), 220L);
                                    return;
                                }
                                return;
                        }
                    }
                };
                irc ircVar = new irc(rrcVar, (byte) 3);
                this.c.l0(user2, str4, this.d, str3, bArr, null, str5, qacVar3, ircVar);
                return;
        }
    }
}
