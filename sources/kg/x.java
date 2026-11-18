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
    public final int f18527a;
    public final y f18528b;

    public x(y yVar, int i7) {
        this.f18527a = i7;
        this.f18528b = yVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18527a) {
            case 0:
                final y yVar = this.f18528b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        y yVar2 = yVar;
                        switch (i7) {
                            case 0:
                                int i10 = yVar2.f18538a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    yVar2.f18539b.add(tL_businessChatLink);
                                    ks.f(i10).k(125, new Object[0]);
                                    ks.f(i10).k(126, tL_businessChatLink);
                                    yVar2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = yVar2.f18539b;
                                int i11 = yVar2.f18538a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    mp.u1(i11).f4(businesschatlinks.users, false);
                                    mp.u1(i11).Z3(businesschatlinks.chats, false);
                                    tr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ks.f(i11).k(125, new Object[0]);
                                    yVar2.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                yVar2.f18540c = false;
                                yVar2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final y yVar2 = this.f18528b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        y yVar22 = yVar2;
                        switch (i7) {
                            case 0:
                                int i10 = yVar22.f18538a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    yVar22.f18539b.add(tL_businessChatLink);
                                    ks.f(i10).k(125, new Object[0]);
                                    ks.f(i10).k(126, tL_businessChatLink);
                                    yVar22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = yVar22.f18539b;
                                int i11 = yVar22.f18538a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    mp.u1(i11).f4(businesschatlinks.users, false);
                                    mp.u1(i11).Z3(businesschatlinks.chats, false);
                                    tr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    ks.f(i11).k(125, new Object[0]);
                                    yVar22.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                yVar22.f18540c = false;
                                yVar22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
