package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class cs9 implements c39 {
    public final byte a;
    public final int b;
    public final FrameLayout c;

    public cs9(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override
    public final void d(int i, View view) {
        boolean z;
        TLRPC.Chat chat;
        h19 h19Var;
        TLRPC.Document document;
        byte b = this.a;
        int i2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                hs9 hs9Var = (hs9) frameLayout;
                d dVar = hs9Var.H;
                gx0 gx0Var = hs9Var.c;
                k27 E = gx0Var.E(i);
                if (E != null) {
                    boolean z2 = false;
                    if (hs9Var.J.t()) {
                        hs9Var.J.f(E, view, 0);
                        se4 se4Var = hs9Var.K;
                        int e1 = E.e1();
                        se4Var.a = k27.B0(E.k);
                        se4Var.b = e1;
                        gx0Var.g(i);
                        if (!hs9Var.J.t()) {
                            gx0Var.l(0, ((hs9) gx0Var.d).r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof es9) {
                        iba ibaVar = ((es9) view).a;
                        k27 message = ibaVar.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (ibaVar.H) {
                            if (!message.g4() && !k27.Q4(message.k)) {
                                boolean x = message.x();
                                if (!x) {
                                    TLRPC.Message message2 = message.k;
                                    if (message2 != null && message2.noforwards) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (E.k.peer_id.channel_id != 0) {
                                        chat = na7.q1(y6c.t0).K0(Long.valueOf(E.k.peer_id.channel_id));
                                    } else {
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.k.peer_id.chat_id != 0) {
                                            chat = na7.q1(y6c.t0).K0(Long.valueOf(E.k.peer_id.chat_id));
                                        } else {
                                            chat = null;
                                        }
                                    }
                                    if (chat != null) {
                                        z = chat.noforwards;
                                    }
                                    if (x || z) {
                                        z2 = true;
                                    }
                                    x = z2;
                                }
                                if (x) {
                                    PhotoViewer.r0().T1(null, dVar, null);
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(message);
                                    PhotoViewer.r0().T1(null, dVar, null);
                                    PhotoViewer.r0().j1(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                gl.q2(message, hs9Var.G, dVar);
                            } else {
                                MediaController.w().R(message);
                                return;
                            }
                        } else if (!ibaVar.G) {
                            E.P = true;
                            ba4.G(j5.a(y6c.t0).a).X(F0, E, 0, 0);
                            ibaVar.f(true);
                            up3.q(i2).y();
                        } else {
                            ba4.G(j5.a(y6c.t0).a).f(F0);
                            ibaVar.f(true);
                        }
                        hs9Var.d(true);
                    }
                    if (view instanceof eba) {
                        ((eba) view).a();
                        return;
                    }
                    return;
                }
                return;
            default:
                tx9 tx9Var = (tx9) frameLayout;
                try {
                    if (view instanceof dx9) {
                        dx9 dx9Var = (dx9) view;
                        if (!dx9Var.s && (((h19Var = dx9Var.y) == null || !h19Var.a) && i2 != 13 && i2 != 14)) {
                            if (dx9Var.R && (document = dx9Var.d) != null) {
                                if (tx9Var.a0 == 6) {
                                    tx9Var.o(dx9Var, Long.valueOf(document.id), document, dx9Var.w, null);
                                } else {
                                    tx9Var.o(dx9Var, null, document, dx9Var.w, null);
                                }
                            } else {
                                tx9Var.n(dx9Var, dx9Var.e);
                            }
                        } else {
                            tx9Var.k();
                            tx9Var.q(dx9Var, dx9Var.y);
                        }
                        if (i2 != 1 && i2 != 11) {
                            tx9Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        tx9Var.n(view, null);
                        if (i2 != 1 && i2 != 11) {
                            tx9Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof yw9) {
                        tx9Var.h(i, (yw9) view);
                        if (i2 != 1 && i2 != 11) {
                            tx9Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view != null) {
                        view.callOnClick();
                        return;
                    } else {
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
