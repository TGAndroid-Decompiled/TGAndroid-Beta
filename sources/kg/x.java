package kg;

import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x implements RequestDelegate {
    public final int f18523a;
    public final z f18524b;

    public x(z zVar, int i7) {
        this.f18523a = i7;
        this.f18524b = zVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18523a) {
            case 0:
                final z zVar = this.f18524b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        z zVar2 = zVar;
                        switch (i7) {
                            case 0:
                                int i10 = zVar2.f18541a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar2.f18542b.add(tL_businessChatLink);
                                    ls.f(i10).k(125, new Object[0]);
                                    ls.f(i10).k(126, tL_businessChatLink);
                                    zVar2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = zVar2.f18542b;
                                int i11 = zVar2.f18541a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    np.u1(i11).f4(businesschatlinks.users, false);
                                    np.u1(i11).Z3(businesschatlinks.chats, false);
                                    ur.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ls.f(i11).k(125, new Object[0]);
                                    zVar2.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar2.f18543c = false;
                                zVar2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final z zVar2 = this.f18524b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        z zVar22 = zVar2;
                        switch (i7) {
                            case 0:
                                int i10 = zVar22.f18541a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    zVar22.f18542b.add(tL_businessChatLink);
                                    ls.f(i10).k(125, new Object[0]);
                                    ls.f(i10).k(126, tL_businessChatLink);
                                    zVar22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = zVar22.f18542b;
                                int i11 = zVar22.f18541a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    np.u1(i11).f4(businesschatlinks.users, false);
                                    np.u1(i11).Z3(businesschatlinks.chats, false);
                                    ur.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ls.f(i11).k(125, new Object[0]);
                                    zVar22.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                zVar22.f18543c = false;
                                zVar22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
