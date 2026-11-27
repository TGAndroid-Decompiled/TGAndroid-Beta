package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h92 implements RequestDelegate {
    public final byte a;
    public final v92 b;

    public h92(v92 v92Var, byte b) {
        this.a = b;
        this.b = v92Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final v92 v92Var = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    hl.c3(new i92(v92Var, (byte) 3));
                    return;
                }
                return;
            case 1:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        v92 v92Var2 = v92Var;
                        switch (b2) {
                            case 0:
                                ArrayList arrayList = v92Var2.g0;
                                v92Var2.e0 = false;
                                if (tLObject2 != null && v92Var2.getParentActivity() != null) {
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        v92Var2.n.removeView((View) arrayList.get(i));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
                                        kb kbVar = new kb(v92Var2.getParentActivity(), new l92(v92Var2, (byte) 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
                                        boolean z = true;
                                        if (i2 != tL_messages_chats.chats.size() - 1) {
                                            z = false;
                                        }
                                        kbVar.a(chat, z);
                                        arrayList.add(kbVar);
                                        v92Var2.y.addView(kbVar, tre.o(-1, 72));
                                    }
                                    v92Var2.g0();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    for (int i3 = 0; i3 < v92Var2.Y.usernames.size(); i3++) {
                                        TLRPC.TL_username tL_username = v92Var2.Y.usernames.get(i3);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                v92Var2.t0 = false;
                                hl.c3(new i92(v92Var2, (byte) 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        v92 v92Var2 = v92Var;
                        switch (b2) {
                            case 0:
                                ArrayList arrayList = v92Var2.g0;
                                v92Var2.e0 = false;
                                if (tLObject2 != null && v92Var2.getParentActivity() != null) {
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        v92Var2.n.removeView((View) arrayList.get(i));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
                                        kb kbVar = new kb(v92Var2.getParentActivity(), new l92(v92Var2, (byte) 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
                                        boolean z = true;
                                        if (i2 != tL_messages_chats.chats.size() - 1) {
                                            z = false;
                                        }
                                        kbVar.a(chat, z);
                                        arrayList.add(kbVar);
                                        v92Var2.y.addView(kbVar, tre.o(-1, 72));
                                    }
                                    v92Var2.g0();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    for (int i3 = 0; i3 < v92Var2.Y.usernames.size(); i3++) {
                                        TLRPC.TL_username tL_username = v92Var2.Y.usernames.get(i3);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                v92Var2.t0 = false;
                                hl.c3(new i92(v92Var2, (byte) 4));
                                return;
                        }
                    }
                });
                return;
            default:
                hl.c3(new dy1(v92Var, tL_error, (byte) 26));
                return;
        }
    }
}
