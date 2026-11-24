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
public final class lc4 extends n39 {
    public final mc4 c;

    public lc4(mc4 mc4Var) {
        this.c = mc4Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 4) {
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
            mc4 mc4Var = this.c;
            if (i != mc4Var.O && i != mc4Var.K) {
                if (i == mc4Var.I) {
                    return 3;
                }
                if (i >= mc4Var.M && i < mc4Var.N) {
                    return 4;
                }
                if (i != mc4Var.L && i != mc4Var.J) {
                    return 0;
                }
                return 5;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        String str;
        String str2;
        TLRPC.Chat chat;
        String str3;
        float f;
        mc4 mc4Var = this.c;
        ArrayList arrayList = mc4Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = mc4Var.d;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            mc4Var.Q = (bc4) view;
            mc4Var.k0();
        } else if (i2 == 2) {
            mhb mhbVar = (mhb) view;
            if (i == mc4Var.O) {
                mhbVar.setFixedSize(0);
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    mhbVar.setText(k96.M0(2131750735, null));
                    return;
                } else {
                    mhbVar.setText(k96.M0(2131750734, null));
                    return;
                }
            }
            mhbVar.setFixedSize(12);
        } else {
            int i3 = 1;
            if (i2 == 3) {
                fc4 fc4Var = (fc4) view;
                if (tL_exportedChatlistInvite == null) {
                    str3 = null;
                } else {
                    str3 = tL_exportedChatlistInvite.url;
                }
                TextView textView = fc4Var.n;
                jia jiaVar = fc4Var.c;
                ImageView imageView = fc4Var.d;
                wb wbVar = fc4Var.f;
                wb wbVar2 = fc4Var.h;
                fc4Var.s = str3;
                if (str3 != null) {
                    if (str3.startsWith("http://")) {
                        str3 = str3.substring(7);
                    }
                    if (str3.startsWith("https://")) {
                        str3 = str3.substring(8);
                    }
                }
                jiaVar.l(str3, false);
                float f2 = fc4Var.w;
                if (str3 == null) {
                    i3 = 0;
                }
                if (f2 != i3) {
                    ValueAnimator valueAnimator = fc4Var.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        fc4Var.x = null;
                    }
                    if (str3 != null) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    fc4Var.w = f;
                    ec4 ec4Var = fc4Var.e;
                    ec4Var.d = f;
                    ec4Var.invalidate();
                    wbVar.setAlpha(fc4Var.w);
                    wbVar2.setAlpha(fc4Var.w);
                    imageView.setAlpha(fc4Var.w);
                    fc4Var.n.setAlpha(1.0f - fc4Var.w);
                    jiaVar.setAlpha(fc4Var.w);
                    fc4Var.b.setAlpha(1.0f - fc4Var.w);
                    if (str3 == null) {
                        textView.setVisibility(0);
                        imageView.setVisibility(8);
                        wbVar.setVisibility(8);
                        wbVar2.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(8);
                    imageView.setVisibility(0);
                    wbVar.setVisibility(0);
                    wbVar2.setVisibility(0);
                }
            } else if (i2 == 4) {
                za5 za5Var = (za5) view;
                Long l = (Long) mc4Var.h.get(i - mc4Var.M);
                long longValue = l.longValue();
                if (longValue >= 0) {
                    TLRPC.User V1 = mc4Var.getMessagesController().V1(l);
                    if (V1 != null) {
                        str = l7c.r(V1);
                    } else {
                        str = null;
                    }
                    str2 = null;
                    chat = V1;
                } else {
                    TLRPC.Chat K0 = mc4Var.getMessagesController().K0(Long.valueOf(-longValue));
                    if (K0 != null) {
                        str = K0.title;
                        if (K0.participants_count != 0) {
                            boolean V = hc2.V(K0);
                            int i4 = K0.participants_count;
                            if (V) {
                                str2 = k96.H(',', "Subscribers", i4);
                                chat = K0;
                            } else {
                                str2 = k96.H(',', "Members", i4);
                                chat = K0;
                            }
                        } else if (hc2.V(K0)) {
                            str2 = k96.N0("ChannelPublic");
                            chat = K0;
                        } else {
                            str2 = k96.N0("MegaPublic");
                            chat = K0;
                        }
                    } else {
                        str = null;
                        str2 = null;
                        chat = K0;
                    }
                }
                if (arrayList.contains(l)) {
                    za5Var.setForbiddenCheck(false);
                    za5Var.c(mc4Var.e.contains(l), false);
                } else {
                    za5Var.setForbiddenCheck(true);
                    za5Var.c(false, false);
                    if (chat instanceof TLRPC.User) {
                        if (((TLRPC.User) chat).bot) {
                            str2 = k96.M0(2131750759, null);
                        } else {
                            str2 = k96.M0(2131750727, null);
                        }
                    } else if (chat instanceof TLRPC.Chat) {
                        if (hc2.V(chat)) {
                            str2 = k96.M0(2131750757, null);
                        } else {
                            str2 = k96.M0(2131750746, null);
                        }
                    }
                }
                za5Var.setTag(l);
                za5Var.d(chat, str, str2);
            } else if (i2 == 5) {
                il4 il4Var = (il4) view;
                if (il4Var == mc4Var.P) {
                    mc4Var.P = null;
                }
                if (i == mc4Var.J) {
                    il4Var.b(k96.M0(2131748957, null), false);
                    il4Var.a("", null);
                    return;
                }
                mc4Var.P = il4Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    mc4Var.j0(false);
                    return;
                }
                il4Var.b(k96.M0(2131750741, null), false);
                il4Var.a("", null);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        mc4 mc4Var = this.c;
        View view2 = null;
        if (i == 0) {
            Activity parentActivity = mc4Var.getParentActivity();
            ?? frameLayout = new FrameLayout(parentActivity);
            ?? imageView = new ImageView(parentActivity);
            imageView.f(2131624028, 90, 90, null);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.d();
            imageView.setImportantForAccessibility(2);
            frameLayout.addView(imageView, nme.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            wla wlaVar = new wla(parentActivity);
            frameLayout.a = wlaVar;
            zkb.X(wlaVar, bkb.A6, null);
            wlaVar.setTextSize(1, 14.0f);
            wlaVar.setGravity(17);
            wlaVar.setLines(2);
            frameLayout.addView(wlaVar, nme.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
            view = frameLayout;
        } else {
            if (i == 2) {
                view2 = new mhb(mc4Var.getParentActivity());
            } else if (i == 3) {
                View kc4Var = new kc4(this, mc4Var.getParentActivity(), mc4Var);
                kc4Var.setLayoutParams(new e49(-1, -2));
                zkb.h(bkb.c6, null, kc4Var);
                view2 = kc4Var;
            } else if (i == 4) {
                View za5Var = new za5(mc4Var.getParentActivity(), 1, 0, false);
                zkb.h(bkb.c6, null, za5Var);
                view = za5Var;
            } else if (i == 5) {
                View il4Var = new il4(mc4Var.getParentActivity());
                zkb.h(bkb.c6, null, il4Var);
                view = il4Var;
            }
            return new s49(view2);
        }
        view2 = view;
        return new s49(view2);
    }
}
