package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class fb2 extends q59 {
    public final Context c;
    public final ib2 d;

    public fb2(ib2 ib2Var, Context context) {
        this.d = ib2Var;
        this.c = context;
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ib2 ib2Var = this.d;
        if (ib2Var.x && !ib2Var.y) {
            return 0;
        }
        return ib2Var.N;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 3;
        }
        ib2 ib2Var = this.d;
        if (i != ib2Var.G && i != ib2Var.J) {
            if (i >= ib2Var.H && i < ib2Var.I) {
                return 0;
            }
            if (i == ib2Var.L) {
                return 4;
            }
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        String h;
        ib2 ib2Var = this.d;
        boolean z = ib2Var.s;
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    fj6 fj6Var = (fj6) view;
                    if (z) {
                        if (ib2Var.h.linked_chat_id != 0) {
                            int i3 = cmb.o7;
                            fj6Var.a(i3, i3);
                            fj6Var.b(2131232334, 5, jb6.M0(2131751308, null), false);
                            return;
                        }
                        fj6Var.a(cmb.u6, cmb.t6);
                        fj6Var.b(2131232181, 5, jb6.M0(2131751322, null), true);
                        return;
                    }
                    int i4 = cmb.o7;
                    fj6Var.a(i4, i4);
                    fj6Var.b(2131232334, 5, jb6.M0(2131751310, null), false);
                    return;
                }
                return;
            }
            njb njbVar = (njb) view;
            if (i == ib2Var.M) {
                njbVar.setText(jb6.M0(2131752241, null));
                return;
            } else if (i == ib2Var.K) {
                if (z) {
                    njbVar.setText(jb6.M0(2131751324, null));
                    return;
                } else {
                    njbVar.setText(jb6.M0(2131751320, null));
                    return;
                }
            } else {
                return;
            }
        }
        ij6 ij6Var = (ij6) view;
        ij6Var.setTag(Integer.valueOf(i));
        TLRPC.Chat chat = (TLRPC.Chat) ib2Var.w.get(i - ib2Var.H);
        String K = sd2.K(chat, false);
        if (TextUtils.isEmpty(K)) {
            h = null;
        } else {
            h = b10.h("@", K);
        }
        if (i != ib2Var.I - 1 || ib2Var.h.linked_chat_id != 0) {
            z2 = true;
        }
        ij6Var.c(chat, null, h, z2);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout ij6Var;
        TLRPC.Chat chat;
        ib2 ib2Var = this.d;
        boolean z = ib2Var.s;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        FrameLayout frameLayout = new FrameLayout(context);
                        ?? linearLayout = new LinearLayout(context);
                        linearLayout.c = z8c.t0;
                        linearLayout.setPadding(0, gm.L(12.0f), 0, gm.L(12.0f));
                        linearLayout.setOrientation(1);
                        bf0 bf0Var = new bf0(context);
                        linearLayout.a = bf0Var;
                        ua6 ua6Var = new ua6(bf0Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", gm.L(104.0f), gm.L(104.0f));
                        linearLayout.b = ua6Var;
                        bf0Var.setImageDrawable(ua6Var);
                        linearLayout.addView(bf0Var, qoe.t(104, 104, 49, 0, 2, 0, 0));
                        frameLayout.addView((View) linearLayout, qoe.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                        TextView textView = new TextView(context);
                        anb.X(textView, cmb.f9, null);
                        textView.setTextSize(1, 14.0f);
                        textView.setGravity(17);
                        if (z) {
                            TLRPC.ChatFull chatFull = ib2Var.h;
                            if (chatFull != null && chatFull.linked_chat_id != 0) {
                                TLRPC.Chat L0 = ib2Var.getMessagesController().L0(Long.valueOf(ib2Var.h.linked_chat_id));
                                if (L0 != null) {
                                    hg9.q("DiscussionChannelGroupSetHelp2", null, 2131751325, new Object[]{L0.title}, textView);
                                }
                            } else {
                                textView.setText(jb6.M0(2131751323, null));
                            }
                        } else {
                            TLRPC.Chat L02 = ib2Var.getMessagesController().L0(Long.valueOf(ib2Var.h.linked_chat_id));
                            if (L02 != null) {
                                hg9.q("DiscussionGroupHelp", null, 2131751321, new Object[]{L02.title}, textView);
                            }
                        }
                        frameLayout.addView(textView, qoe.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                        frameLayout.setTag(-33024);
                        ij6Var = frameLayout;
                    } else {
                        if (z) {
                            chat = (TLRPC.Chat) ib2Var.w.get(0);
                        } else {
                            chat = ib2Var.f;
                        }
                        eb2 eb2Var = new eb2(this, context, chat, chat);
                        ib2Var.E = eb2Var;
                        ij6Var = eb2Var;
                    }
                } else {
                    ij6Var = new fj6(context);
                }
            } else {
                ij6Var = new njb(context);
            }
        } else {
            ij6Var = new ij6(this.c, 6, 2, false, null);
        }
        return new u69(ij6Var);
    }
}
