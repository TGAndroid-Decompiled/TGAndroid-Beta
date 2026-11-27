package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class p41 implements RequestDelegate {
    public final byte a;
    public final r41 b;

    public p41(r41 r41Var, byte b) {
        this.a = b;
        this.b = r41Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final r41 r41Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        r41 r41Var2 = r41Var;
                        switch (b2) {
                            case 0:
                                int i = r41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    r41Var2.b.add(tL_businessChatLink);
                                    jn7.f(i).k(126, new Object[0]);
                                    jn7.f(i).k(127, tL_businessChatLink);
                                    r41Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = r41Var2.b;
                                int i2 = r41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    uc7.s1(i2).j4(businesschatlinks.users, false);
                                    uc7.s1(i2).c4(businesschatlinks.chats, false);
                                    kf7.a0(i2).n1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    jn7.f(i2).k(126, new Object[0]);
                                    r41Var2.f();
                                } else {
                                    cc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                r41Var2.c = false;
                                r41Var2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        r41 r41Var2 = r41Var;
                        switch (b2) {
                            case 0:
                                int i = r41Var2.a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    r41Var2.b.add(tL_businessChatLink);
                                    jn7.f(i).k(126, new Object[0]);
                                    jn7.f(i).k(127, tL_businessChatLink);
                                    r41Var2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = r41Var2.b;
                                int i2 = r41Var2.a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    uc7.s1(i2).j4(businesschatlinks.users, false);
                                    uc7.s1(i2).c4(businesschatlinks.chats, false);
                                    kf7.a0(i2).n1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    jn7.f(i2).k(126, new Object[0]);
                                    r41Var2.f();
                                } else {
                                    cc4.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                r41Var2.c = false;
                                r41Var2.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
