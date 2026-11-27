package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
public final class et0 implements RequestDelegate {
    public final byte a;
    public final kt0 b;

    public et0(kt0 kt0Var, byte b) {
        this.a = b;
        this.b = kt0Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final kt0 kt0Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        kt0 kt0Var2 = kt0Var;
                        switch (b2) {
                            case 0:
                                kt0Var2.j = new ArrayList();
                                kt0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        kt0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    uc7.s1(kt0Var2.a).j4(kt0Var2.j, false);
                                    return;
                                }
                                return;
                            default:
                                int i2 = kt0Var2.a;
                                kt0Var2.l = new ArrayList();
                                kt0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    uc7.s1(i2).c4(messages_chats.chats, false);
                                    kt0Var2.l.addAll(messages_chats.chats);
                                }
                                jn7.f(i2).k(241, new Object[0]);
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
                        kt0 kt0Var2 = kt0Var;
                        switch (b2) {
                            case 0:
                                kt0Var2.j = new ArrayList();
                                kt0Var2.i = false;
                                if (tLObject2 instanceof Vector) {
                                    Vector vector = (Vector) tLObject2;
                                    for (int i = 0; i < vector.objects.size(); i++) {
                                        kt0Var2.j.add((TLRPC.User) vector.objects.get(i));
                                    }
                                    uc7.s1(kt0Var2.a).j4(kt0Var2.j, false);
                                    return;
                                }
                                return;
                            default:
                                int i2 = kt0Var2.a;
                                kt0Var2.l = new ArrayList();
                                kt0Var2.k = false;
                                if (tLObject2 instanceof TLRPC.messages_Chats) {
                                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject2;
                                    uc7.s1(i2).c4(messages_chats.chats, false);
                                    kt0Var2.l.addAll(messages_chats.chats);
                                }
                                jn7.f(i2).k(241, new Object[0]);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
