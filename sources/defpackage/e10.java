package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e10 implements RequestDelegate {
    public final byte a = 0;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f;
    public final Object g;
    public final Object h;

    public e10(i20 i20Var, boolean z, k27 k27Var, boolean z2, Runnable runnable, long j, TLRPC.Document document) {
        this.e = i20Var;
        this.b = z;
        this.f = k27Var;
        this.c = z2;
        this.g = runnable;
        this.d = j;
        this.h = document;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        KeyEvent.Callback callback = this.e;
        switch (b) {
            case 0:
                final i20 i20Var = (i20) callback;
                k27 k27Var = (k27) obj3;
                final Runnable runnable = (Runnable) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                final boolean z = this.c;
                if (tL_error != null) {
                    if (ab4.r(tL_error.text)) {
                        if (!this.b && k27Var.e1() >= 0) {
                            if (k27.B0(k27Var.k) >= 0) {
                                final int e1 = k27Var.e1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(e1));
                                ConnectionsManager.getInstance(i20Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                        byte b2 = r5;
                                        TLRPC.Message message = null;
                                        Runnable runnable2 = runnable;
                                        boolean z2 = z;
                                        int i = e1;
                                        final i20 i20Var2 = i20Var;
                                        switch (b2) {
                                            case 0:
                                                if (tLObject2 instanceof TLRPC.messages_Messages) {
                                                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                    int i2 = 0;
                                                    while (true) {
                                                        if (i2 < messages_messages.messages.size()) {
                                                            if (messages_messages.messages.get(i2).id == i) {
                                                                message = messages_messages.messages.get(i2);
                                                            } else {
                                                                i2++;
                                                            }
                                                        }
                                                    }
                                                    if (message != null) {
                                                        i20Var2.L0(new k27(i20Var2.a, message, false, true), z2, runnable2, true);
                                                        return;
                                                    } else {
                                                        gl.c3(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                byte b3 = r2;
                                                                i20 i20Var3 = i20Var2;
                                                                switch (b3) {
                                                                    case 0:
                                                                        new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                    default:
                                                                        new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                } else if (tL_error2 != null) {
                                                    gl.c3(new f10(i20Var2, tL_error2, (byte) 3));
                                                    return;
                                                } else {
                                                    return;
                                                }
                                            default:
                                                if (tLObject2 instanceof TLRPC.messages_Messages) {
                                                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                    int i3 = 0;
                                                    while (true) {
                                                        if (i3 < messages_messages2.messages.size()) {
                                                            if (messages_messages2.messages.get(i3).id == i) {
                                                                message = messages_messages2.messages.get(i3);
                                                            } else {
                                                                i3++;
                                                            }
                                                        }
                                                    }
                                                    if (message != null) {
                                                        i20Var2.L0(new k27(i20Var2.a, message, false, true), z2, runnable2, true);
                                                        return;
                                                    } else {
                                                        gl.c3(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                byte b3 = r2;
                                                                i20 i20Var3 = i20Var2;
                                                                switch (b3) {
                                                                    case 0:
                                                                        new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                    default:
                                                                        new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                } else if (tL_error2 != null) {
                                                    gl.c3(new f10(i20Var2, tL_error2, (byte) 2));
                                                    return;
                                                } else {
                                                    return;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                            final int e12 = k27Var.e1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = na7.q1(i20Var.a).f1(-k27.B0(k27Var.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(i20Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    byte b2 = r5;
                                    TLRPC.Message message = null;
                                    Runnable runnable2 = runnable;
                                    boolean z2 = z;
                                    int i = e12;
                                    final i20 i20Var2 = i20Var;
                                    switch (b2) {
                                        case 0:
                                            if (tLObject2 instanceof TLRPC.messages_Messages) {
                                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 < messages_messages.messages.size()) {
                                                        if (messages_messages.messages.get(i2).id == i) {
                                                            message = messages_messages.messages.get(i2);
                                                        } else {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                                if (message != null) {
                                                    i20Var2.L0(new k27(i20Var2.a, message, false, true), z2, runnable2, true);
                                                    return;
                                                } else {
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b3 = r2;
                                                            i20 i20Var3 = i20Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                gl.c3(new f10(i20Var2, tL_error2, (byte) 3));
                                                return;
                                            } else {
                                                return;
                                            }
                                        default:
                                            if (tLObject2 instanceof TLRPC.messages_Messages) {
                                                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                                                int i3 = 0;
                                                while (true) {
                                                    if (i3 < messages_messages2.messages.size()) {
                                                        if (messages_messages2.messages.get(i3).id == i) {
                                                            message = messages_messages2.messages.get(i3);
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                }
                                                if (message != null) {
                                                    i20Var2.L0(new k27(i20Var2.a, message, false, true), z2, runnable2, true);
                                                    return;
                                                } else {
                                                    gl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b3 = r2;
                                                            i20 i20Var3 = i20Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new u21((FrameLayout) i20Var3.b, i20Var3.J0).t(k96.a0(null, null, 2131743639, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                gl.c3(new f10(i20Var2, tL_error2, (byte) 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        gl.c3(new f10(i20Var, tL_error, (byte) 0));
                        return;
                    }
                    gl.c3(new f10(i20Var, tL_error, (byte) 1));
                }
                gl.c3(new fe2(i20Var, this.d, z, document, runnable));
                return;
            default:
                final yf8 yf8Var = (yf8) callback;
                final na7 na7Var = (na7) obj3;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) obj2;
                final ConnectionsManager connectionsManager = (ConnectionsManager) obj;
                final boolean z2 = this.b;
                final boolean z3 = this.c;
                final long j = this.d;
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf8.run():void");
                    }
                });
                return;
        }
    }

    public e10(yf8 yf8Var, na7 na7Var, boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, long j, ConnectionsManager connectionsManager) {
        this.e = yf8Var;
        this.f = na7Var;
        this.b = z;
        this.g = tL_channels_searchPosts;
        this.c = z2;
        this.d = j;
        this.h = connectionsManager;
    }
}
