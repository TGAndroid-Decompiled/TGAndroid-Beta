package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class h41 implements RequestDelegate {
    public final byte a;
    public final j41 b;

    public h41(j41 j41Var, byte b) {
        this.a = b;
        this.b = j41Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final j41 j41Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        j41 j41Var2 = j41Var;
                        switch (b2) {
                            case 0:
                                int i = j41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    j41Var2.b.add(tL_businessChatLink);
                                    kk7.f(i).k(125, new Object[0]);
                                    kk7.f(i).k(126, tL_businessChatLink);
                                    j41Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = j41Var2.b;
                                int i2 = j41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    na7.q1(i2).b4(businesschatlinks.users, false);
                                    na7.q1(i2).V3(businesschatlinks.chats, false);
                                    ad7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    kk7.f(i2).k(125, new Object[0]);
                                    j41Var2.f();
                                } else {
                                    fa4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                j41Var2.c = false;
                                j41Var2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        j41 j41Var2 = j41Var;
                        switch (b2) {
                            case 0:
                                int i = j41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    j41Var2.b.add(tL_businessChatLink);
                                    kk7.f(i).k(125, new Object[0]);
                                    kk7.f(i).k(126, tL_businessChatLink);
                                    j41Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = j41Var2.b;
                                int i2 = j41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    na7.q1(i2).b4(businesschatlinks.users, false);
                                    na7.q1(i2).V3(businesschatlinks.chats, false);
                                    ad7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    kk7.f(i2).k(125, new Object[0]);
                                    j41Var2.f();
                                } else {
                                    fa4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                j41Var2.c = false;
                                j41Var2.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
