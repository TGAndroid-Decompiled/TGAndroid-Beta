package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class vs0 implements RequestDelegate {
    public final byte a;
    public final ct0 b;

    public vs0(ct0 ct0Var, byte b) {
        this.a = b;
        this.b = ct0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ct0 ct0Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var2 = ct0Var;
                        switch (b2) {
                            case 0:
                                ct0Var2.j = new ArrayList();
                                ct0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ct0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    na7.q1(ct0Var2.a).a4(ct0Var2.j, false);
                                    return;
                                }
                                return;
                            default:
                                int i2 = ct0Var2.a;
                                ct0Var2.l = new ArrayList();
                                ct0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    na7.q1(i2).U3(messages_chats.chats, false);
                                    ct0Var2.l.addAll(messages_chats.chats);
                                }
                                kk7.f(i2).k(240, new Object[0]);
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var2 = ct0Var;
                        switch (b2) {
                            case 0:
                                ct0Var2.j = new ArrayList();
                                ct0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ct0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    na7.q1(ct0Var2.a).a4(ct0Var2.j, false);
                                    return;
                                }
                                return;
                            default:
                                int i2 = ct0Var2.a;
                                ct0Var2.l = new ArrayList();
                                ct0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    na7.q1(i2).U3(messages_chats.chats, false);
                                    ct0Var2.l.addAll(messages_chats.chats);
                                }
                                kk7.f(i2).k(240, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
