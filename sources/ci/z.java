package ci;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class z implements RequestDelegate {
    public final int f6425a;
    public final i0 f6426b;

    public z(i0 i0Var, int i3) {
        this.f6425a = i3;
        this.f6426b = i0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6425a) {
            case 0:
                final i0 i0Var = this.f6426b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var2 = i0Var;
                                i0Var2.getClass();
                                i0Var2.f5275j = new ArrayList();
                                i0Var2.f5274i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i3 = 0; i3 < vector.objects.size(); i3++) {
                                        i0Var2.f5275j.add((TLRPC.User) vector.objects.get(i3));
                                    }
                                    hp.s1(i0Var2.f5268a).Y3(i0Var2.f5275j, false);
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var;
                                int i10 = i0Var3.f5268a;
                                i0Var3.f5277l = new ArrayList();
                                i0Var3.f5276k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    hp.s1(i10).S3(messages_chats.chats, false);
                                    i0Var3.f5277l.addAll(messages_chats.chats);
                                }
                                hs.f(i10).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final i0 i0Var2 = this.f6426b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                i0 i0Var22 = i0Var2;
                                i0Var22.getClass();
                                i0Var22.f5275j = new ArrayList();
                                i0Var22.f5274i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i3 = 0; i3 < vector.objects.size(); i3++) {
                                        i0Var22.f5275j.add((TLRPC.User) vector.objects.get(i3));
                                    }
                                    hp.s1(i0Var22.f5268a).Y3(i0Var22.f5275j, false);
                                    return;
                                }
                                return;
                            default:
                                i0 i0Var3 = i0Var2;
                                int i10 = i0Var3.f5268a;
                                i0Var3.f5277l = new ArrayList();
                                i0Var3.f5276k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    hp.s1(i10).S3(messages_chats.chats, false);
                                    i0Var3.f5277l.addAll(messages_chats.chats);
                                }
                                hs.f(i10).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
