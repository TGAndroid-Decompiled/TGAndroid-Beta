package bi;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class e0 implements RequestDelegate {
    public final int f3732a;
    public final n0 f3733b;

    public e0(n0 n0Var, int i7) {
        this.f3732a = i7;
        this.f3733b = n0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3732a) {
            case 0:
                final n0 n0Var = this.f3733b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                n0 n0Var2 = n0Var;
                                n0Var2.getClass();
                                n0Var2.f4391j = new ArrayList();
                                n0Var2.f4390i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i7 = 0; i7 < vector.objects.size(); i7++) {
                                        n0Var2.f4391j.add((TLRPC.User) vector.objects.get(i7));
                                    }
                                    qp.s1(n0Var2.f4384a).Y3(n0Var2.f4391j, false);
                                    return;
                                }
                                return;
                            default:
                                n0 n0Var3 = n0Var;
                                int i10 = n0Var3.f4384a;
                                n0Var3.f4393l = new ArrayList();
                                n0Var3.f4392k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    qp.s1(i10).S3(messages_chats.chats, false);
                                    n0Var3.f4393l.addAll(messages_chats.chats);
                                }
                                qs.f(i10).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                final n0 n0Var2 = this.f3733b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                n0 n0Var22 = n0Var2;
                                n0Var22.getClass();
                                n0Var22.f4391j = new ArrayList();
                                n0Var22.f4390i = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i7 = 0; i7 < vector.objects.size(); i7++) {
                                        n0Var22.f4391j.add((TLRPC.User) vector.objects.get(i7));
                                    }
                                    qp.s1(n0Var22.f4384a).Y3(n0Var22.f4391j, false);
                                    return;
                                }
                                return;
                            default:
                                n0 n0Var3 = n0Var2;
                                int i10 = n0Var3.f4384a;
                                n0Var3.f4393l = new ArrayList();
                                n0Var3.f4392k = false;
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject3;
                                    qp.s1(i10).S3(messages_chats.chats, false);
                                    n0Var3.f4393l.addAll(messages_chats.chats);
                                }
                                qs.f(i10).k(237, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
