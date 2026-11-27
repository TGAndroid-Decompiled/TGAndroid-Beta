package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class ie4 extends c79 {
    public final je4 c;

    public ie4(je4 je4Var) {
        this.c = je4Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.H;
    }

    @Override
    public final int d(int i) {
        if (i != 0) {
            je4 je4Var = this.c;
            if (i != je4Var.O && i != je4Var.K) {
                if (i == je4Var.I) {
                    return 3;
                }
                if (i >= je4Var.M && i < je4Var.N) {
                    return 4;
                }
                if (i != je4Var.L && i != je4Var.J) {
                    return 0;
                }
                return 5;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f;
        je4 je4Var = this.c;
        ArrayList arrayList = je4Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = je4Var.d;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            je4Var.Q = (yd4) view;
            je4Var.k0();
        } else if (i2 == 2) {
            ilb ilbVar = (ilb) view;
            if (i == je4Var.O) {
                ilbVar.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    ilbVar.setText(ob6.M0(2131750712, null));
                    return;
                } else {
                    ilbVar.setText(ob6.M0(2131750711, null));
                    return;
                }
            }
            ilbVar.setFixedSize(12);
        } else {
            int i3 = 1;
            if (i2 == 3) {
                ce4 ce4Var = (ce4) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                TextView textView = ce4Var.n;
                ema emaVar = ce4Var.c;
                ImageView imageView = ce4Var.d;
                xb xbVar = ce4Var.f;
                xb xbVar2 = ce4Var.h;
                ce4Var.s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                emaVar.l(str3, false);
                float f2 = ce4Var.w;
                if (str3 == null) {
                    i3 = 0;
                }
                if (f2 != i3) {
                    ValueAnimator valueAnimator = ce4Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ce4Var.x = null;
                    }
                    if (str3 != null) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ce4Var.w = f;
                    be4 be4Var = ce4Var.e;
                    be4Var.d = f;
                    be4Var.invalidate();
                    xbVar.setAlpha(ce4Var.w);
                    xbVar2.setAlpha(ce4Var.w);
                    imageView.setAlpha(ce4Var.w);
                    ce4Var.n.setAlpha(1.0f - ce4Var.w);
                    emaVar.setAlpha(ce4Var.w);
                    ce4Var.b.setAlpha(1.0f - ce4Var.w);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        xbVar.setVisibility(8);
                        xbVar2.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    xbVar.setVisibility(0);
                    xbVar2.setVisibility(0);
                }
            } else if (i2 == 4) {
                bd5 bd5Var = (bd5) view;
                Long l = (Long) je4Var.h.get(i - je4Var.M);
                long longValue = l.longValue();
                if (longValue >= 0) {
                    TLRPC.User X1 = je4Var.getMessagesController().X1(l);
                    if (X1 != null) {
                        str = lbc.r(X1);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = X1;
                } else {
                    TLRPC.Chat M0 = je4Var.getMessagesController().M0(Long.valueOf(-longValue));
                    if (M0 != null) {
                        str = M0.title;
                        if (M0.participants_count != 0) {
                            boolean V = xc2.V(M0);
                            int i4 = M0.participants_count;
                            if (V) {
                                str2 = ob6.H(',', "Subscribers", i4);
                                chat = M0;
                            } else {
                                str2 = ob6.H(',', "Members", i4);
                                chat = M0;
                            }
                        } else if (xc2.V(M0)) {
                            str2 = ob6.N0("ChannelPublic");
                            chat = M0;
                        } else {
                            str2 = ob6.N0("MegaPublic");
                            chat = M0;
                        }
                    } else {
                        str = null;
                        str2 = null;
                        chat = M0;
                    }
                }
                if (arrayList.contains(l)) {
                    bd5Var.setForbiddenCheck(false);
                    bd5Var.c(je4Var.e.contains(l), false);
                } else {
                    bd5Var.setForbiddenCheck(true);
                    bd5Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = ob6.M0(2131750736, null);
                        } else {
                            str2 = ob6.M0(2131750704, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (xc2.V(chat)) {
                            str2 = ob6.M0(2131750734, null);
                        } else {
                            str2 = ob6.M0(2131750723, null);
                        }
                    }
                }
                bd5Var.setTag(l);
                bd5Var.d(chat, str, str2);
            } else if (i2 == 5) {
                nn4 nn4Var = (nn4) view;
                if (nn4Var == je4Var.P) {
                    je4Var.P = null;
                }
                if (i == je4Var.J) {
                    nn4Var.b(ob6.M0(2131748903, null), false);
                    nn4Var.a("", null);
                    return;
                }
                je4Var.P = nn4Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    je4Var.j0(false);
                    return;
                }
                nn4Var.b(ob6.M0(2131750718, null), false);
                nn4Var.a("", null);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        je4 je4Var = this.c;
        View view2 = null;
        if (i == 0) {
            Activity parentActivity = je4Var.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624028, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, tre.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            tpa tpaVar = new tpa(parentActivity);
            frameLayout.a = tpaVar;
            yob.X(tpaVar, aob.B6, null);
            tpaVar.setTextSize(1, 14.0f);
            tpaVar.setGravity(17);
            tpaVar.setLines(2);
            frameLayout.addView(tpaVar, tre.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i == 2) {
                view2 = new ilb(je4Var.getParentActivity());
            } else if (i == 3) {
                View he4Var = new he4(this, je4Var.getParentActivity(), je4Var);
                he4Var.setLayoutParams(new r79(-1, -2));
                yob.h(aob.d6, null, he4Var);
                view2 = he4Var;
            } else if (i == 4) {
                View bd5Var = new bd5(je4Var.getParentActivity(), 1, 0, false);
                yob.h(aob.d6, null, bd5Var);
                view = bd5Var;
            } else if (i == 5) {
                View nn4Var = new nn4(je4Var.getParentActivity());
                yob.h(aob.d6, null, nn4Var);
                view = nn4Var;
            }
            return new f89(view2);
        }
        view2 = view;
        return new f89(view2);
    }
}
