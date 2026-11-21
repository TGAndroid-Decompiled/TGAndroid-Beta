package di;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class x implements RequestDelegate {
    public final int f10015a;
    public final e0 f10016b;

    public x(e0 e0Var, int i7) {
        this.f10015a = i7;
        this.f10016b = e0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10015a) {
            case 0:
                final e0 e0Var = this.f10016b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                e0Var2.getClass();
                                e0Var2.f8723j = new ArrayList();
                                e0Var2.f8722i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i7 = 0; i7 < vector.objects.size(); i7++) {
                                        e0Var2.f8723j.add((TLRPC.User) vector.objects.get(i7));
                                    }
                                    mp.u1(e0Var2.f8716a).f4(e0Var2.f8723j, false);
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var3 = e0Var;
                                int i10 = e0Var3.f8716a;
                                e0Var3.f8725l = new ArrayList();
                                e0Var3.f8724k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    mp.u1(i10).Z3(messages_chats.chats, false);
                                    e0Var3.f8725l.addAll(messages_chats.chats);
                                }
                                ks.f(i10).k(240, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final e0 e0Var2 = this.f10016b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e0 e0Var22 = e0Var2;
                                e0Var22.getClass();
                                e0Var22.f8723j = new ArrayList();
                                e0Var22.f8722i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i7 = 0; i7 < vector.objects.size(); i7++) {
                                        e0Var22.f8723j.add((TLRPC.User) vector.objects.get(i7));
                                    }
                                    mp.u1(e0Var22.f8716a).f4(e0Var22.f8723j, false);
                                    return;
                                }
                                return;
                            default:
                                e0 e0Var3 = e0Var2;
                                int i10 = e0Var3.f8716a;
                                e0Var3.f8725l = new ArrayList();
                                e0Var3.f8724k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    mp.u1(i10).Z3(messages_chats.chats, false);
                                    e0Var3.f8725l.addAll(messages_chats.chats);
                                }
                                ks.f(i10).k(240, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
