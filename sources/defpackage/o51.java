package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o51 implements RequestDelegate {
    public final byte a;
    public final q51 b;

    public o51(q51 q51Var, byte b) {
        this.a = b;
        this.b = q51Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final q51 q51Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        q51 q51Var2 = q51Var;
                        switch (b2) {
                            case 0:
                                int i = q51Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    q51Var2.b.add(tL_businessChatLink);
                                    nm7.f(i).k(126, new Object[0]);
                                    nm7.f(i).k(127, tL_businessChatLink);
                                    q51Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = q51Var2.b;
                                int i2 = q51Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    oc7.r1(i2).d4(businesschatlinks.users, false);
                                    oc7.r1(i2).X3(businesschatlinks.chats, false);
                                    cf7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    nm7.f(i2).k(126, new Object[0]);
                                    q51Var2.f();
                                } else {
                                    fc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                q51Var2.c = false;
                                q51Var2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        q51 q51Var2 = q51Var;
                        switch (b2) {
                            case 0:
                                int i = q51Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    q51Var2.b.add(tL_businessChatLink);
                                    nm7.f(i).k(126, new Object[0]);
                                    nm7.f(i).k(127, tL_businessChatLink);
                                    q51Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = q51Var2.b;
                                int i2 = q51Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    oc7.r1(i2).d4(businesschatlinks.users, false);
                                    oc7.r1(i2).X3(businesschatlinks.chats, false);
                                    cf7.Y(i2).j1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    nm7.f(i2).k(126, new Object[0]);
                                    q51Var2.f();
                                } else {
                                    fc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                q51Var2.c = false;
                                q51Var2.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
