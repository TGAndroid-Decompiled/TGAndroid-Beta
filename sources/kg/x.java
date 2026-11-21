package kg;

import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x implements RequestDelegate {
    public final int f18556a;
    public final z f18557b;

    public x(z zVar, int i7) {
        this.f18556a = i7;
        this.f18557b = zVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18556a) {
            case 0:
                final z zVar = this.f18557b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        z zVar2 = zVar;
                        switch (i7) {
                            case 0:
                                int i10 = zVar2.f18575a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar2.f18576b.add(tL_businessChatLink);
                                    ks.f(i10).k(125, new Object[0]);
                                    ks.f(i10).k(126, tL_businessChatLink);
                                    zVar2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = zVar2.f18576b;
                                int i11 = zVar2.f18575a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    mp.u1(i11).f4(businesschatlinks.users, false);
                                    mp.u1(i11).Z3(businesschatlinks.chats, false);
                                    tr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ks.f(i11).k(125, new Object[0]);
                                    zVar2.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar2.f18577c = false;
                                zVar2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final z zVar2 = this.f18557b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        z zVar22 = zVar2;
                        switch (i7) {
                            case 0:
                                int i10 = zVar22.f18575a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar22.f18576b.add(tL_businessChatLink);
                                    ks.f(i10).k(125, new Object[0]);
                                    ks.f(i10).k(126, tL_businessChatLink);
                                    zVar22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = zVar22.f18576b;
                                int i11 = zVar22.f18575a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    mp.u1(i11).f4(businesschatlinks.users, false);
                                    mp.u1(i11).Z3(businesschatlinks.chats, false);
                                    tr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ks.f(i11).k(125, new Object[0]);
                                    zVar22.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar22.f18577c = false;
                                zVar22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
