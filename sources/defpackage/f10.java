package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f10 implements RequestDelegate {
    public final byte a = 0;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final KeyEvent.Callback e;
    public final Object f;
    public final Object g;
    public final Object h;

    public f10(j20 j20Var, boolean z, r47 r47Var, boolean z2, Runnable runnable, long j, TLRPC.Document document) {
        this.e = j20Var;
        this.b = z;
        this.f = r47Var;
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
                final j20 j20Var = (j20) callback;
                r47 r47Var = (r47) obj3;
                final Runnable runnable = (Runnable) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                final boolean z = this.c;
                if (tL_error != null) {
                    if (xc4.r(tL_error.text)) {
                        if (!this.b && r47Var.e1() >= 0) {
                            if (r47.B0(r47Var.k) >= 0) {
                                final int e1 = r47Var.e1();
                                TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                                tL_messages_getMessages.id.add(Integer.valueOf(e1));
                                ConnectionsManager.getInstance(j20Var.a).sendRequest(tL_messages_getMessages, new RequestDelegate() {
                                    @Override
                                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                        byte b2 = r5;
                                        TLRPC.Message message = null;
                                        Runnable runnable2 = runnable;
                                        boolean z2 = z;
                                        int i = e1;
                                        final j20 j20Var2 = j20Var;
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
                                                        j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
                                                        return;
                                                    } else {
                                                        hl.c3(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                byte b3 = r2;
                                                                j20 j20Var3 = j20Var2;
                                                                switch (b3) {
                                                                    case 0:
                                                                        new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                    default:
                                                                        new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                } else if (tL_error2 != null) {
                                                    hl.c3(new g10(j20Var2, tL_error2, (byte) 3));
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
                                                        j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
                                                        return;
                                                    } else {
                                                        hl.c3(new Runnable() {
                                                            @Override
                                                            public final void run() {
                                                                byte b3 = r2;
                                                                j20 j20Var3 = j20Var2;
                                                                switch (b3) {
                                                                    case 0:
                                                                        new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                    default:
                                                                        new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        return;
                                                    }
                                                } else if (tL_error2 != null) {
                                                    hl.c3(new g10(j20Var2, tL_error2, (byte) 2));
                                                    return;
                                                } else {
                                                    return;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                            final int e12 = r47Var.e1();
                            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
                            tL_channels_getMessages.channel = uc7.s1(j20Var.a).h1(-r47.B0(r47Var.k));
                            tL_channels_getMessages.id.add(Integer.valueOf(e12));
                            ConnectionsManager.getInstance(j20Var.a).sendRequest(tL_channels_getMessages, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                    byte b2 = r5;
                                    TLRPC.Message message = null;
                                    Runnable runnable2 = runnable;
                                    boolean z2 = z;
                                    int i = e12;
                                    final j20 j20Var2 = j20Var;
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
                                                    j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
                                                    return;
                                                } else {
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b3 = r2;
                                                            j20 j20Var3 = j20Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                hl.c3(new g10(j20Var2, tL_error2, (byte) 3));
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
                                                    j20Var2.M0(new r47(j20Var2.a, message, false, true), z2, runnable2, true);
                                                    return;
                                                } else {
                                                    hl.c3(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            byte b3 = r2;
                                                            j20 j20Var3 = j20Var2;
                                                            switch (b3) {
                                                                case 0:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                                default:
                                                                    new d31((FrameLayout) j20Var3.b, j20Var3.J0).t(ob6.a0(null, null, 2131743533, "CLIENT_MESSAGE_NOT_FOUND"), null).j();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                }
                                            } else if (tL_error2 != null) {
                                                hl.c3(new g10(j20Var2, tL_error2, (byte) 2));
                                                return;
                                            } else {
                                                return;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                        hl.c3(new g10(j20Var, tL_error, (byte) 0));
                        return;
                    }
                    hl.c3(new g10(j20Var, tL_error, (byte) 1));
                }
                hl.c3(new re2(j20Var, this.d, z, document, runnable));
                return;
            default:
                final mj8 mj8Var = (mj8) callback;
                final uc7 uc7Var = (uc7) obj3;
                final TLRPC.TL_channels_searchPosts tL_channels_searchPosts = (TLRPC.TL_channels_searchPosts) obj2;
                final ConnectionsManager connectionsManager = (ConnectionsManager) obj;
                final boolean z2 = this.b;
                final boolean z3 = this.c;
                final long j = this.d;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj8.run():void");
                    }
                });
                return;
        }
    }

    public f10(mj8 mj8Var, uc7 uc7Var, boolean z, TLRPC.TL_channels_searchPosts tL_channels_searchPosts, boolean z2, long j, ConnectionsManager connectionsManager) {
        this.e = mj8Var;
        this.f = uc7Var;
        this.b = z;
        this.g = tL_channels_searchPosts;
        this.c = z2;
        this.d = j;
        this.h = connectionsManager;
    }
}
