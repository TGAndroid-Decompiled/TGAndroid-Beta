package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ka2 extends c79 {
    public final Context c;
    public final na2 d;

    public ka2(na2 na2Var, Context context) {
        this.d = na2Var;
        this.c = context;
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        na2 na2Var = this.d;
        if (na2Var.x && !na2Var.y) {
            return 0;
        }
        return na2Var.N;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 3;
        }
        na2 na2Var = this.d;
        if (i != na2Var.G && i != na2Var.J) {
            if (i >= na2Var.H && i < na2Var.I) {
                return 0;
            }
            if (i == na2Var.L) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        String i2;
        na2 na2Var = this.d;
        boolean z = na2Var.s;
        int i3 = f89Var.f;
        View view = f89Var.a;
        boolean z2 = false;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    ij6 ij6Var = (ij6) view;
                    if (z) {
                        if (na2Var.h.linked_chat_id != 0) {
                            int i4 = aob.p7;
                            ij6Var.a(i4, i4);
                            ij6Var.b(2131232333, 5, ob6.M0(2131751336, null), false);
                            return;
                        }
                        ij6Var.a(aob.v6, aob.u6);
                        ij6Var.b(2131232180, 5, ob6.M0(2131751350, null), true);
                        return;
                    }
                    int i5 = aob.p7;
                    ij6Var.a(i5, i5);
                    ij6Var.b(2131232333, 5, ob6.M0(2131751338, null), false);
                    return;
                }
                return;
            }
            ilb ilbVar = (ilb) view;
            if (i == na2Var.M) {
                ilbVar.setText(ob6.M0(2131752269, null));
                return;
            } else if (i == na2Var.K) {
                if (z) {
                    ilbVar.setText(ob6.M0(2131751352, null));
                    return;
                } else {
                    ilbVar.setText(ob6.M0(2131751348, null));
                    return;
                }
            } else {
                return;
            }
        }
        lj6 lj6Var = (lj6) view;
        lj6Var.setTag(Integer.valueOf(i));
        TLRPC.Chat chat = (TLRPC.Chat) na2Var.w.get(i - na2Var.H);
        String K = xc2.K(chat, false);
        if (TextUtils.isEmpty(K)) {
            i2 = null;
        } else {
            i2 = c00.i("@", K);
        }
        if (i != na2Var.I - 1 || na2Var.h.linked_chat_id != 0) {
            z2 = true;
        }
        lj6Var.c(chat, null, i2, z2);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout lj6Var;
        TLRPC.Chat chat;
        na2 na2Var = this.d;
        boolean z = na2Var.s;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.c = yac.t0;
                        linearLayout.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
                        linearLayout.setOrientation(1);
                        de0 de0Var = new de0(context);
                        linearLayout.a = de0Var;
                        za6 za6Var = new za6(de0Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", hl.L(104.0f), hl.L(104.0f));
                        linearLayout.b = za6Var;
                        de0Var.setImageDrawable(za6Var);
                        linearLayout.addView(de0Var, tre.t(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, tre.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        yob.X(textView, aob.g9, null);
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z) {
                            TLRPC.ChatFull chatFull = na2Var.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat M0 = na2Var.getMessagesController().M0(Long.valueOf(na2Var.h.linked_chat_id));
                                if (M0 != null) {
                                    uh9.r("DiscussionChannelGroupSetHelp2", null, 2131751353, new Object[]{M0.title}, textView);
                                }
                            } else {
                                textView.setText(ob6.M0(2131751351, null));
                            }
                        } else {
                            TLRPC.Chat M02 = na2Var.getMessagesController().M0(Long.valueOf(na2Var.h.linked_chat_id));
                            if (M02 != null) {
                                uh9.r("DiscussionGroupHelp", null, 2131751349, new Object[]{M02.title}, textView);
                            }
                        }
                        frameLayout.addView(textView, tre.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        lj6Var = frameLayout;
                    } else {
                        if (z) {
                            chat = (TLRPC.Chat) na2Var.w.get(0);
                        } else {
                            chat = na2Var.f;
                        }
                        ja2 ja2Var = new ja2(this, context, chat, chat);
                        na2Var.E = ja2Var;
                        lj6Var = ja2Var;
                    }
                } else {
                    lj6Var = new ij6(context);
                }
            } else {
                lj6Var = new ilb(context);
            }
        } else {
            lj6Var = new lj6(this.c, 6, 2, false, null);
        }
        return new f89(lj6Var);
    }
}
