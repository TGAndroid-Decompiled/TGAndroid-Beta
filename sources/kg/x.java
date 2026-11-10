package kg;

import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x implements RequestDelegate {
    public final int f17579a;
    public final y f17580b;

    public x(y yVar, int i7) {
        this.f17579a = i7;
        this.f17580b = yVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17579a) {
            case 0:
                final y yVar = this.f17580b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        y yVar2 = yVar;
                        switch (i7) {
                            case 0:
                                int i10 = yVar2.f17588a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    yVar2.f17589b.add(tL_businessChatLink);
                                    qs.f(i10).k(125, new Object[0]);
                                    qs.f(i10).k(126, tL_businessChatLink);
                                    yVar2.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = yVar2.f17589b;
                                int i11 = yVar2.f17588a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    qp.s1(i11).Y3(businesschatlinks.users, false);
                                    qp.s1(i11).S3(businesschatlinks.chats, false);
                                    yr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    qs.f(i11).k(125, new Object[0]);
                                    yVar2.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                yVar2.f17590c = false;
                                yVar2.d = true;
                                return;
                        }
                    }
                });
                return;
            default:
                final y yVar2 = this.f17580b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        y yVar22 = yVar2;
                        switch (i7) {
                            case 0:
                                int i10 = yVar22.f17588a;
                                if (tLObject2 instanceof TL_account.TL_businessChatLink) {
                                    TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) tLObject2;
                                    yVar22.f17589b.add(tL_businessChatLink);
                                    qs.f(i10).k(125, new Object[0]);
                                    qs.f(i10).k(126, tL_businessChatLink);
                                    yVar22.f();
                                    return;
                                }
                                return;
                            default:
                                ArrayList arrayList = yVar22.f17589b;
                                int i11 = yVar22.f17588a;
                                if (tLObject2 instanceof TL_account.businessChatLinks) {
                                    TL_account.businessChatLinks businesschatlinks = (TL_account.businessChatLinks) tLObject2;
                                    arrayList.clear();
                                    arrayList.addAll(businesschatlinks.links);
                                    qp.s1(i11).Y3(businesschatlinks.users, false);
                                    qp.s1(i11).S3(businesschatlinks.chats, false);
                                    yr.a0(i11).m1(businesschatlinks.users, businesschatlinks.chats, true, true);
                                    qs.f(i11).k(125, new Object[0]);
                                    yVar22.f();
                                } else {
                                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                                }
                                yVar22.f17590c = false;
                                yVar22.d = true;
                                return;
                        }
                    }
                });
                return;
        }
    }
}
