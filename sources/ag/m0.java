package ag;

import java.util.ArrayList;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m0 implements RequestDelegate {
    public final int f632a;
    public final s0 f633b;

    public m0(s0 s0Var, int i10) {
        this.f632a = i10;
        this.f633b = s0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f632a) {
            case 0:
                final s0 s0Var = this.f633b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        s0 s0Var2 = s0Var;
                        switch (i10) {
                            case 0:
                                int i11 = s0Var2.f701a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    s0Var2.f702b.add(tL_businessChatLink);
                                    zs.f(i11).k(125, new Object[0]);
                                    zs.f(i11).k(126, tL_businessChatLink);
                                    s0Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = s0Var2.f702b;
                                int i12 = s0Var2.f701a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    vp.r1(i12).V3(businesschatlinks.users, false);
                                    vp.r1(i12).P3(businesschatlinks.chats, false);
                                    hs.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    zs.f(i12).k(125, new Object[0]);
                                    s0Var2.f();
                                } else {
                                    f8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                s0Var2.f703c = false;
                                s0Var2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final s0 s0Var2 = this.f633b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        s0 s0Var22 = s0Var2;
                        switch (i10) {
                            case 0:
                                int i11 = s0Var22.f701a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    s0Var22.f702b.add(tL_businessChatLink);
                                    zs.f(i11).k(125, new Object[0]);
                                    zs.f(i11).k(126, tL_businessChatLink);
                                    s0Var22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = s0Var22.f702b;
                                int i12 = s0Var22.f701a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    vp.r1(i12).V3(businesschatlinks.users, false);
                                    vp.r1(i12).P3(businesschatlinks.chats, false);
                                    hs.a0(i12).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    zs.f(i12).k(125, new Object[0]);
                                    s0Var22.f();
                                } else {
                                    f8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                s0Var22.f703c = false;
                                s0Var22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
