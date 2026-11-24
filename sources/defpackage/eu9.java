package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;
public final class eu9 implements f59 {
    public final byte a;
    public final int b;
    public final FrameLayout c;

    public eu9(FrameLayout frameLayout, int i, byte b) {
        this.a = b;
        this.c = frameLayout;
        this.b = i;
    }

    @Override
    public final void g(int i, View view) {
        boolean z;
        TLRPC.Chat chat;
        k39 k39Var;
        TLRPC.Document document;
        byte b = this.a;
        int i2 = this.b;
        FrameLayout frameLayout = this.c;
        switch (b) {
            case 0:
                ju9 ju9Var = (ju9) frameLayout;
                d dVar = ju9Var.H;
                ny0 ny0Var = ju9Var.c;
                k47 E = ny0Var.E(i);
                if (E != null) {
                    boolean z2 = false;
                    if (ju9Var.J.u()) {
                        ju9Var.J.i(E, view, 0);
                        ug4 ug4Var = ju9Var.K;
                        int e1 = E.e1();
                        ug4Var.a = k47.B0(E.k);
                        ug4Var.b = e1;
                        ny0Var.g(i);
                        if (!ju9Var.J.u()) {
                            ny0Var.l(0, ((ju9) ny0Var.d).r);
                            return;
                        }
                        return;
                    }
                    if (view instanceof gu9) {
                        ida idaVar = ((gu9) view).a;
                        k47 message = idaVar.getMessage();
                        TLRPC.Document F0 = message.F0();
                        if (idaVar.H) {
                            if (!message.g4() && !k47.Q4(message.k)) {
                                boolean x = message.x();
                                if (!x) {
                                    TLRPC.Message message2 = message.k;
                                    if (message2 != null && message2.noforwards) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (E.k.peer_id.channel_id != 0) {
                                        chat = oc7.r1(z8c.t0).L0(Long.valueOf(E.k.peer_id.channel_id));
                                    } else {
                                        chat = null;
                                    }
                                    if (chat == null) {
                                        if (E.k.peer_id.chat_id != 0) {
                                            chat = oc7.r1(z8c.t0).L0(Long.valueOf(E.k.peer_id.chat_id));
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
                                    PhotoViewer.r0().n1(arrayList, 0, 0L, 0L, 0L, new Object());
                                    return;
                                }
                                gm.q2(message, ju9Var.G, dVar);
                            } else {
                                MediaController.w().R(message);
                                return;
                            }
                        } else if (!idaVar.G) {
                            E.P = true;
                            bc4.G(j5.a(z8c.t0).a).X(F0, E, 0, 0);
                            idaVar.f(true);
                            er3.q(i2).y();
                        } else {
                            bc4.G(j5.a(z8c.t0).a).f(F0);
                            idaVar.f(true);
                        }
                        ju9Var.d(true);
                    }
                    if (view instanceof eda) {
                        ((eda) view).a();
                        return;
                    }
                    return;
                }
                return;
            default:
                vz9 vz9Var = (vz9) frameLayout;
                try {
                    if (view instanceof fz9) {
                        fz9 fz9Var = (fz9) view;
                        if (!fz9Var.s && (((k39Var = fz9Var.y) == null || !k39Var.a) && i2 != 13 && i2 != 14)) {
                            if (fz9Var.R && (document = fz9Var.d) != null) {
                                if (vz9Var.a0 == 6) {
                                    vz9Var.o(fz9Var, Long.valueOf(document.id), document, fz9Var.w, null);
                                } else {
                                    vz9Var.o(fz9Var, null, document, fz9Var.w, null);
                                }
                            } else {
                                vz9Var.n(fz9Var, fz9Var.e);
                            }
                        } else {
                            vz9Var.k();
                            vz9Var.q(fz9Var, fz9Var.y);
                        }
                        if (i2 != 1 && i2 != 11) {
                            vz9Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof ImageView) {
                        vz9Var.n(view, null);
                        if (i2 != 1 && i2 != 11) {
                            vz9Var.performHapticFeedback(3, 1);
                        } else {
                            return;
                        }
                    } else if (view instanceof az9) {
                        vz9Var.h(i, (az9) view);
                        if (i2 != 1 && i2 != 11) {
                            vz9Var.performHapticFeedback(3, 1);
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
