package di;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class x implements RequestDelegate {
    public final int f9699a;
    public final e0 f9700b;

    public x(e0 e0Var, int i7) {
        this.f9699a = i7;
        this.f9700b = e0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9699a) {
            case 0:
                final e0 e0Var = this.f9700b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                e0Var2.getClass();
                                e0Var2.f8437j = new ArrayList();
                                e0Var2.f8436i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i7 = 0; i7 < vector.objects.size(); i7++) {
                                        e0Var2.f8437j.add((TLRPC.User) vector.objects.get(i7));
                                    }
                                    np.s1(e0Var2.f8430a).Y3(e0Var2.f8437j, false);
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var3 = e0Var;
                                int i10 = e0Var3.f8430a;
                                e0Var3.f8439l = new ArrayList();
                                e0Var3.f8438k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    np.s1(i10).S3(messages_chats.chats, false);
                                    e0Var3.f8439l.addAll(messages_chats.chats);
                                }
                                ns.f(i10).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final e0 e0Var2 = this.f9700b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e0 e0Var22 = e0Var2;
                                e0Var22.getClass();
                                e0Var22.f8437j = new ArrayList();
                                e0Var22.f8436i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i7 = 0; i7 < vector.objects.size(); i7++) {
                                        e0Var22.f8437j.add((TLRPC.User) vector.objects.get(i7));
                                    }
                                    np.s1(e0Var22.f8430a).Y3(e0Var22.f8437j, false);
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var3 = e0Var2;
                                int i10 = e0Var3.f8430a;
                                e0Var3.f8439l = new ArrayList();
                                e0Var3.f8438k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    np.s1(i10).S3(messages_chats.chats, false);
                                    e0Var3.f8439l.addAll(messages_chats.chats);
                                }
                                ns.f(i10).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
