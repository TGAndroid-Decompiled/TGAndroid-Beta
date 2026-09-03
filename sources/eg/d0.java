package eg;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.q70;
import org.telegram.ui.ti0;
import org.telegram.ui.xn;
import qh.a5;
import qh.ba;
import qh.f8;
import qh.f9;
import qh.g8;
import qh.k6;
import qh.y4;
public final class d0 implements View.OnLongClickListener {
    public final int f5148a;
    public final Object f5149b;

    public d0(Object obj, int i10) {
        this.f5148a = i10;
        this.f5149b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e6;
        int e10;
        xn xnVar;
        MessageObject messageObject;
        boolean z4;
        int i10;
        switch (this.f5148a) {
            case 0:
                c1 c1Var = (c1) this.f5149b;
                int i11 = c1Var.M1;
                if (c1Var.P1 != null) {
                    dg.e1 e11 = dg.e1.e(i11);
                    e11.f4522k = !e11.f4522k;
                    e11.f4514a.edit().putBoolean("fill_shapes", e11.f4522k).apply();
                    boolean z10 = dg.e1.e(i11).f4522k;
                    for (int i12 = 0; i12 < c1Var.P1.getItemsCount(); i12++) {
                        View childAt = c1Var.P1.I.getChildAt(i12);
                        if (childAt instanceof a1) {
                            dg.l lVar = (dg.l) dg.l.f4576b.get(i12);
                            if (z10) {
                                e6 = lVar.m();
                            } else {
                                e6 = lVar.e();
                            }
                            ((a1) childAt).a(e6, z10, true);
                        }
                    }
                }
                return true;
            case 1:
                a5 a5Var = (a5) this.f5149b;
                int i13 = a5Var.C1;
                if (a5Var.F1 != null) {
                    dg.e1 e12 = dg.e1.e(i13);
                    e12.f4522k = !e12.f4522k;
                    e12.f4514a.edit().putBoolean("fill_shapes", e12.f4522k).apply();
                    boolean z11 = dg.e1.e(i13).f4522k;
                    for (int i14 = 0; i14 < a5Var.F1.getItemsCount(); i14++) {
                        View childAt2 = a5Var.F1.I.getChildAt(i14);
                        if (childAt2 instanceof y4) {
                            dg.l lVar2 = (dg.l) dg.l.f4576b.get(i14);
                            if (z11) {
                                e10 = lVar2.m();
                            } else {
                                e10 = lVar2.e();
                            }
                            ((y4) childAt2).a(e10, z11, true);
                        }
                    }
                }
                return true;
            case 2:
                ba baVar = (ba) this.f5149b;
                Activity activity = baVar.f45043b;
                f9 f9Var = baVar.f45120y0;
                if (f9Var == null || !f9Var.isFrontface()) {
                    return false;
                }
                baVar.p();
                baVar.B0.setSelected(true);
                baVar.f45098s.e(0.85f, 240L, null);
                q70 F = q70.F(baVar.f45094r, baVar.f45040a, baVar.B0);
                k6 k6Var = new k6(activity, 1);
                k6Var.d(baVar.f45098s.f45159o);
                k6Var.h = new g8(baVar, 21);
                F.q(k6Var);
                F.o();
                k6 k6Var2 = new k6(activity, 2);
                k6Var2.f45613b = 0.65f;
                k6Var2.f45614c = 1.0f;
                k6Var2.d(baVar.f45098s.f45160p);
                k6Var2.h = new g8(baVar, 0);
                F.q(k6Var2);
                F.f30328p = new f8(baVar, 1);
                F.f30333s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 3:
                if (((wh.e1) this.f5149b).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return wh.z1.W((wh.z1) this.f5149b, view);
            case 5:
                wh.q qVar = ((wh.l) this.f5149b).f49882a;
                wh.v3 v3Var = qVar.f49967s;
                g6 g6Var = qVar.f26589a;
                mi miVar = qVar.f26590b;
                wh.r3 r3Var = qVar.f49966r;
                int i15 = qVar.f49965n;
                if (!UserConfig.getInstance(i15).isPremium()) {
                    new fg.n1(miVar.f29058c0, qVar.getContext(), qVar.f49965n, 43, true).show();
                    return true;
                }
                if (r3Var.j3() && !r3Var.l3()) {
                    if (!r3Var.L3()) {
                        if (v3Var != null) {
                            v3Var.setSendEnabled(r3Var.L3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Y2 = r3Var.Y2();
                        if (!Y2.isEmpty()) {
                            org.telegram.ui.ActionBar.p2 p2Var = miVar.f29058c0;
                            if (p2Var instanceof xn) {
                                xnVar = (xn) p2Var;
                            } else {
                                xnVar = null;
                            }
                            ti0 ti0Var = qVar.L;
                            if (ti0Var != null) {
                                ti0Var.h(false);
                                qVar.L = null;
                            }
                            ti0 ti0Var2 = new ti0(qVar.getContext(), g6Var);
                            qVar.L = ti0Var2;
                            ti0Var2.setOnDismissListener(new fg.d0(qVar, 13));
                            long n12 = miVar.n1();
                            if (xnVar != null) {
                                messageObject = xnVar.f43223k5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f20866id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i15).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i15).getPeer(UserConfig.getInstance(i15).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Y2;
                            richMessage.photos = r3Var.A2();
                            tL_message.rich_message.documents = r3Var.x2();
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject2 = new MessageObject(i15, tL_message, false, false);
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject2.replyMessageObject = messageObject;
                            }
                            messageObject2.sendPreview = true;
                            messageObject2.isOutOwnerCached = Boolean.TRUE;
                            messageObject2.generateLayout(null);
                            messageObject2.notime = true;
                            qVar.L.q(org.telegram.messenger.y3.m(messageObject2));
                            lg sendButton = v3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            lg r10 = qVar.L.r(sendButton, true, new org.telegram.ui.Components.voip.o(qVar, 26));
                            if (r10 != null) {
                                r10.setBackground(new wh.y1(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var))));
                                ti0 ti0Var3 = qVar.L;
                                int dp = AndroidUtilities.dp(44.0f);
                                ti0Var3.f41561j0 = true;
                                ti0Var3.V = dp;
                            }
                            q70 F2 = q70.F(qVar, g6Var, sendButton);
                            if (xnVar != null && UserObject.isUserSelf(xnVar.i())) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (xnVar != null && xnVar.D6()) {
                                int i16 = R.drawable.msg_calendar2;
                                if (z4) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i16, LocaleController.getString(i10), new wh.d(qVar, n12, 0), false);
                                if (!z4 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new wh.e(qVar, 0), false);
                                }
                            }
                            if (!z4) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new wh.e(qVar, 1), false);
                            }
                            F2.Y();
                            qVar.L.p(F2);
                            qVar.L.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((zf.e) this.f5149b).f51153c.callOnClick();
                return true;
        }
    }
}
