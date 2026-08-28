package kh;

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
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.x60;
import org.telegram.ui.li0;
import org.telegram.ui.qn;
public final class d5 implements View.OnLongClickListener {
    public final int f15104a;
    public final Object f15105b;

    public d5(Object obj, int i9) {
        this.f15104a = i9;
        this.f15105b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e10;
        qn qnVar;
        MessageObject messageObject;
        boolean z10;
        int i9;
        int e11;
        switch (this.f15104a) {
            case 0:
                g6 g6Var = (g6) this.f15105b;
                int i10 = g6Var.B1;
                if (g6Var.E1 != null) {
                    xf.s0 e12 = xf.s0.e(i10);
                    e12.f49366k = !e12.f49366k;
                    e12.f49358a.edit().putBoolean("fill_shapes", e12.f49366k).apply();
                    boolean z11 = xf.s0.e(i10).f49366k;
                    for (int i11 = 0; i11 < g6Var.E1.getItemsCount(); i11++) {
                        View childAt = g6Var.E1.H.getChildAt(i11);
                        if (childAt instanceof d6) {
                            xf.l lVar = (xf.l) xf.l.f49266b.get(i11);
                            if (z11) {
                                e10 = lVar.m();
                            } else {
                                e10 = lVar.e();
                            }
                            ((d6) childAt).a(e10, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                wb wbVar = (wb) this.f15105b;
                Activity activity = wbVar.f16249b;
                za zaVar = wbVar.f16322x0;
                if (zaVar == null || !zaVar.isFrontface()) {
                    return false;
                }
                wbVar.p();
                wbVar.A0.setSelected(true);
                wbVar.f16304s.e(0.85f, 240L, null);
                x60 F = x60.F(wbVar.f16300r, wbVar.f16246a, wbVar.A0);
                u7 u7Var = new u7(activity, 1);
                u7Var.d(wbVar.f16304s.f16021o);
                u7Var.h = new w9(wbVar, 21);
                F.q(u7Var);
                F.o();
                u7 u7Var2 = new u7(activity, 2);
                u7Var2.f16155b = 0.65f;
                u7Var2.f16156c = 1.0f;
                u7Var2.d(wbVar.f16304s.f16022p);
                u7Var2.h = new w9(wbVar, 0);
                F.q(u7Var2);
                F.f34575p = new v9(wbVar, 1);
                F.f34580s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((qh.d1) this.f15105b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return qh.x1.V((qh.x1) this.f15105b, view);
            case 4:
                qh.p pVar = ((qh.k) this.f15105b).f46471a;
                qh.s3 s3Var = pVar.f46607s;
                org.telegram.ui.ActionBar.b6 b6Var = pVar.f27492a;
                ki kiVar = pVar.f27493b;
                qh.o3 o3Var = pVar.f46606r;
                int i12 = pVar.f46605n;
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new zf.x0(kiVar.f30099b0, pVar.getContext(), pVar.f46605n, 43, true).show();
                    return true;
                }
                if (o3Var.k3() && !o3Var.m3()) {
                    if (!o3Var.M3()) {
                        if (s3Var != null) {
                            s3Var.setSendEnabled(o3Var.M3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Z2 = o3Var.Z2();
                        if (!Z2.isEmpty()) {
                            org.telegram.ui.ActionBar.o2 o2Var = kiVar.f30099b0;
                            if (o2Var instanceof qn) {
                                qnVar = (qn) o2Var;
                            } else {
                                qnVar = null;
                            }
                            li0 li0Var = pVar.K;
                            if (li0Var != null) {
                                li0Var.h(false);
                                pVar.K = null;
                            }
                            li0 li0Var2 = new li0(pVar.getContext(), b6Var);
                            pVar.K = li0Var2;
                            li0Var2.setOnDismissListener(new eh.l(pVar, 11));
                            long n12 = kiVar.n1();
                            if (qnVar != null) {
                                messageObject = qnVar.f41959j5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f22401id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Z2;
                            richMessage.photos = o3Var.B2();
                            tL_message.rich_message.documents = o3Var.y2();
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject2 = new MessageObject(i12, tL_message, false, false);
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject2.replyMessageObject = messageObject;
                            }
                            messageObject2.sendPreview = true;
                            messageObject2.isOutOwnerCached = Boolean.TRUE;
                            messageObject2.generateLayout(null);
                            messageObject2.notime = true;
                            pVar.K.q(org.telegram.messenger.l0.k(messageObject2));
                            lg sendButton = s3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            lg r10 = pVar.K.r(sendButton, true, new x8(pVar, 20));
                            if (r10 != null) {
                                r10.setBackground(new qh.w1(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var))));
                                li0 li0Var3 = pVar.K;
                                int dp = AndroidUtilities.dp(44.0f);
                                li0Var3.f40160i0 = true;
                                li0Var3.U = dp;
                            }
                            x60 F2 = x60.F(pVar, b6Var, sendButton);
                            if (qnVar != null && UserObject.isUserSelf(qnVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (qnVar != null && qnVar.D6()) {
                                int i13 = R.drawable.msg_calendar2;
                                if (z10) {
                                    i9 = R.string.SetReminder;
                                } else {
                                    i9 = R.string.ScheduleMessage;
                                }
                                F2.c(i13, LocaleController.getString(i9), new org.telegram.ui.web.b0(pVar, n12, 1), false);
                                if (!z10 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new qh.d(pVar, 0), false);
                                }
                            }
                            if (!z10) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new qh.d(pVar, 1), false);
                            }
                            F2.Y();
                            pVar.K.p(F2);
                            pVar.K.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                    }
                }
                return false;
            case 5:
                ((tf.e) this.f15105b).f47856c.callOnClick();
                return true;
            default:
                yf.l0 l0Var = (yf.l0) this.f15105b;
                int i14 = l0Var.L1;
                if (l0Var.O1 != null) {
                    xf.s0 e13 = xf.s0.e(i14);
                    e13.f49366k = !e13.f49366k;
                    e13.f49358a.edit().putBoolean("fill_shapes", e13.f49366k).apply();
                    boolean z12 = xf.s0.e(i14).f49366k;
                    for (int i15 = 0; i15 < l0Var.O1.getItemsCount(); i15++) {
                        View childAt2 = l0Var.O1.H.getChildAt(i15);
                        if (childAt2 instanceof yf.k0) {
                            xf.l lVar2 = (xf.l) xf.l.f49266b.get(i15);
                            if (z12) {
                                e11 = lVar2.m();
                            } else {
                                e11 = lVar2.e();
                            }
                            ((yf.k0) childAt2).a(e11, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
