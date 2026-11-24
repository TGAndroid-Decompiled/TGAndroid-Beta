package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q82 implements RequestDelegate {
    public final byte a;
    public final f92 b;

    public q82(f92 f92Var, byte b) {
        this.a = b;
        this.b = f92Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final f92 f92Var = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    gl.d3(new r82(f92Var, (byte) 3));
                    return;
                }
                return;
            case 1:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        f92 f92Var2 = f92Var;
                        switch (b2) {
                            case 0:
                                ArrayList arrayList = f92Var2.g0;
                                f92Var2.e0 = false;
                                if (tLObject2 != null && f92Var2.getParentActivity() != null) {
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        f92Var2.n.removeView((View) arrayList.get(i));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
                                        jb jbVar = new jb(f92Var2.getParentActivity(), new u82(f92Var2, (byte) 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
                                        boolean z = true;
                                        if (i2 != tL_messages_chats.chats.size() - 1) {
                                            z = false;
                                        }
                                        jbVar.a(chat, z);
                                        arrayList.add(jbVar);
                                        f92Var2.y.addView(jbVar, nme.o(-1, 72));
                                    }
                                    f92Var2.g0();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    for (int i3 = 0; i3 < f92Var2.Y.usernames.size(); i3++) {
                                        TLRPC.TL_username tL_username = f92Var2.Y.usernames.get(i3);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                f92Var2.t0 = false;
                                gl.d3(new r82(f92Var2, (byte) 4));
                                return;
                        }
                    }
                });
                return;
            case 2:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        f92 f92Var2 = f92Var;
                        switch (b2) {
                            case 0:
                                ArrayList arrayList = f92Var2.g0;
                                f92Var2.e0 = false;
                                if (tLObject2 != null && f92Var2.getParentActivity() != null) {
                                    for (int i = 0; i < arrayList.size(); i++) {
                                        f92Var2.n.removeView((View) arrayList.get(i));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i2 = 0; i2 < tL_messages_chats.chats.size(); i2++) {
                                        jb jbVar = new jb(f92Var2.getParentActivity(), new u82(f92Var2, (byte) 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i2);
                                        boolean z = true;
                                        if (i2 != tL_messages_chats.chats.size() - 1) {
                                            z = false;
                                        }
                                        jbVar.a(chat, z);
                                        arrayList.add(jbVar);
                                        f92Var2.y.addView(jbVar, nme.o(-1, 72));
                                    }
                                    f92Var2.g0();
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    for (int i3 = 0; i3 < f92Var2.Y.usernames.size(); i3++) {
                                        TLRPC.TL_username tL_username = f92Var2.Y.usernames.get(i3);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                f92Var2.t0 = false;
                                gl.d3(new r82(f92Var2, (byte) 4));
                                return;
                        }
                    }
                });
                return;
            default:
                gl.d3(new kx1(f92Var, tL_error, (byte) 28));
                return;
        }
    }
}
