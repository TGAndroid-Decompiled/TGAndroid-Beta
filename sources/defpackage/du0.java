package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class du0 implements RequestDelegate {
    public final byte a;
    public final ku0 b;

    public du0(ku0 ku0Var, byte b) {
        this.a = b;
        this.b = ku0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final ku0 ku0Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        ku0 ku0Var2 = ku0Var;
                        switch (b2) {
                            case 0:
                                ku0Var2.j = new ArrayList();
                                ku0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ku0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    oc7.r1(ku0Var2.a).d4(ku0Var2.j, false);
                                    return;
                                }
                                return;
                            default:
                                int i2 = ku0Var2.a;
                                ku0Var2.l = new ArrayList();
                                ku0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    oc7.r1(i2).X3(messages_chats.chats, false);
                                    ku0Var2.l.addAll(messages_chats.chats);
                                }
                                nm7.f(i2).k(241, new Object[0]);
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
                        ku0 ku0Var2 = ku0Var;
                        switch (b2) {
                            case 0:
                                ku0Var2.j = new ArrayList();
                                ku0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        ku0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    oc7.r1(ku0Var2.a).d4(ku0Var2.j, false);
                                    return;
                                }
                                return;
                            default:
                                int i2 = ku0Var2.a;
                                ku0Var2.l = new ArrayList();
                                ku0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    oc7.r1(i2).X3(messages_chats.chats, false);
                                    ku0Var2.l.addAll(messages_chats.chats);
                                }
                                nm7.f(i2).k(241, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
