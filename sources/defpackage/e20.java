package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e20 implements RequestDelegate {
    public final byte a = 1;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f;
    public final Object g;
    public final Object h;

    public e20(i30 i30Var, boolean z, k47 k47Var, boolean z2, Runnable runnable, long j, TLRPC.Document document) {
        this.e = i30Var;
        this.b = z;
        this.f = k47Var;
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
                final i30 i30Var = (i30) callback;
                k47 k47Var = (k47) obj3;
                final Runnable runnable = (Runnable) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                final boolean z = this.c;
                if (tL_error != null) {
                    if (ad4.r(tL_error.text)) {
                        if (!this.b && k47Var.e1() >= 0) {
                            if (k47.B0(k47Var.k) >= 0) {
                                final int e1 = k47Var.e1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(e1));
                                ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                        byte b2 = r5;
                                        TLRPC.Message message = null;
                                        Runnable runnable2 = runnable;
                                        boolean z2 = z;
                                        int i = e1;
                                        final i30 i30Var2 = i30Var;
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
                                                        i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
                                                        return;
                                                    } else {
                                                        gm.c3(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                byte b3 = r2;
                                                                i30 i30Var3 = i30Var2;
                                                                switch (b3) {
                                                                    case 0:
                                                                        new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                    default:
                                                                        new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                } else if (tL_error2 != null) {
                                                    gm.c3(new f20(i30Var2, tL_error2, (byte) 3));
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
                                                        i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
                                                        return;
                                                    } else {
                                                        gm.c3(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                byte b3 = r2;
                                                                i30 i30Var3 = i30Var2;
                                                                switch (b3) {
                                                                    case 0:
                                                                        new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                    default:
                                                                        new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                } else if (tL_error2 != null) {
                                                    gm.c3(new f20(i30Var2, tL_error2, (byte) 2));
                                                    return;
                                                } else {
                                                    return;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                            final int e12 = k47Var.e1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = oc7.r1(i30Var.a).g1(-k47.B0(k47Var.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(i30Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    byte b2 = r5;
                                    TLRPC.Message message = null;
                                    Runnable runnable2 = runnable;
                                    boolean z2 = z;
                                    int i = e12;
                                    final i30 i30Var2 = i30Var;
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
                                                    i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
                                                    return;
                                                } else {
                                                    gm.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b3 = r2;
                                                            i30 i30Var3 = i30Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                gm.c3(new f20(i30Var2, tL_error2, (byte) 3));
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
                                                    i30Var2.L0(new k47(i30Var2.a, message, false, true), z2, runnable2, true);
                                                    return;
                                                } else {
                                                    gm.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b3 = r2;
                                                            i30 i30Var3 = i30Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new c41((FrameLayout) i30Var3.b, i30Var3.J0).t(jb6.a0(null, null, 2131743565, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                gm.c3(new f20(i30Var2, tL_error2, (byte) 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        gm.c3(new f20(i30Var, tL_error, (byte) 0));
                        return;
                    }
                    gm.c3(new f20(i30Var, tL_error, (byte) 1));
                }
                gm.c3(new qf2(i30Var, this.d, z, document, runnable));
                return;
            default:
                final ai8 ai8Var = (ai8) callback;
                final oc7 oc7Var = (oc7) obj3;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) obj2;
                final ConnectionsManager connectionsManager = (ConnectionsManager) obj;
                final boolean z2 = this.b;
                final boolean z3 = this.c;
                final long j = this.d;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.zh8.run():void");
                    }
                });
                return;
        }
    }

    public e20(ai8 ai8Var, oc7 oc7Var, boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, long j, ConnectionsManager connectionsManager) {
        this.e = ai8Var;
        this.f = oc7Var;
        this.b = z;
        this.g = tL_channels_searchPosts;
        this.c = z2;
        this.d = j;
        this.h = connectionsManager;
    }
}
