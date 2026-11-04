package lg;

import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x implements RequestDelegate {
    public final int f18504a;
    public final z f18505b;

    public x(z zVar, int i3) {
        this.f18504a = i3;
        this.f18505b = zVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18504a) {
            case 0:
                final z zVar = this.f18505b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        z zVar2 = zVar;
                        switch (i3) {
                            case 0:
                                int i10 = zVar2.f18524a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar2.f18525b.add(tL_businessChatLink);
                                    hs.f(i10).k(125, new Object[0]);
                                    hs.f(i10).k(126, tL_businessChatLink);
                                    zVar2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = zVar2.f18525b;
                                int i11 = zVar2.f18524a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    hp.s1(i11).Y3(businesschatlinks.users, false);
                                    hp.s1(i11).S3(businesschatlinks.chats, false);
                                    qr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    hs.f(i11).k(125, new Object[0]);
                                    zVar2.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar2.f18526c = false;
                                zVar2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final z zVar2 = this.f18505b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        z zVar22 = zVar2;
                        switch (i3) {
                            case 0:
                                int i10 = zVar22.f18524a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar22.f18525b.add(tL_businessChatLink);
                                    hs.f(i10).k(125, new Object[0]);
                                    hs.f(i10).k(126, tL_businessChatLink);
                                    zVar22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = zVar22.f18525b;
                                int i11 = zVar22.f18524a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    hp.s1(i11).Y3(businesschatlinks.users, false);
                                    hp.s1(i11).S3(businesschatlinks.chats, false);
                                    qr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    hs.f(i11).k(125, new Object[0]);
                                    zVar22.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar22.f18526c = false;
                                zVar22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
