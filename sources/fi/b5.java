package fi;

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
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.pi0;
import org.telegram.ui.wn;
public final class b5 implements View.OnLongClickListener {
    public final int f10557a;
    public final Object f10558b;

    public b5(Object obj, int i10) {
        this.f10557a = i10;
        this.f10558b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        wn wnVar;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        int i10;
        int e10;
        switch (this.f10557a) {
            case 0:
                e6 e6Var = (e6) this.f10558b;
                int i11 = e6Var.f10816u1;
                if (e6Var.f10822x1 != null) {
                    rg.s0 e11 = rg.s0.e(i11);
                    e11.f47585k = !e11.f47585k;
                    e11.f47578a.edit().putBoolean("fill_shapes", e11.f47585k).apply();
                    boolean z12 = rg.s0.e(i11).f47585k;
                    for (int i12 = 0; i12 < e6Var.f10822x1.getItemsCount(); i12++) {
                        View childAt = e6Var.f10822x1.L.getChildAt(i12);
                        if (childAt instanceof b6) {
                            rg.l lVar = (rg.l) rg.l.f47495b.get(i12);
                            if (z12) {
                                e = lVar.m();
                            } else {
                                e = lVar.e();
                            }
                            ((b6) childAt).a(e, z12, true);
                        }
                    }
                }
                return true;
            case 1:
                sb sbVar = (sb) this.f10558b;
                Activity activity = sbVar.f11607b;
                va vaVar = sbVar.B0;
                if (vaVar == null || !vaVar.isFrontface()) {
                    return false;
                }
                sbVar.o();
                sbVar.E0.setSelected(true);
                sbVar.f11661s.e(0.85f, 240L, null);
                l80 F = l80.F(sbVar.f11657r, sbVar.f11604a, sbVar.E0);
                q7 q7Var = new q7(activity, 1);
                q7Var.d(sbVar.f11661s.f11475o);
                q7Var.h = new q9(sbVar, 21);
                F.q(q7Var);
                F.o();
                q7 q7Var2 = new q7(activity, 2);
                q7Var2.f11489b = 0.65f;
                q7Var2.f11490c = 1.0f;
                q7Var2.d(sbVar.f11661s.f11476p);
                q7Var2.h = new q9(sbVar, 0);
                F.q(q7Var2);
                F.f30163p = new p9(sbVar, 1);
                F.f30168s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((li.g1) this.f10558b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return li.b2.X((li.b2) this.f10558b, view);
            case 4:
                li.q qVar = ((li.l) this.f10558b).f17335a;
                li.a4 a4Var = qVar.f17418s;
                org.telegram.ui.ActionBar.u6 u6Var = qVar.f30253a;
                ti tiVar = qVar.f30254b;
                li.v3 v3Var = qVar.f17417r;
                int i13 = qVar.f17416n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new tg.y0(tiVar.f32990f0, qVar.getContext(), qVar.f17416n, 43, true).show();
                    return true;
                }
                if (v3Var.q3() && !v3Var.s3()) {
                    if (!v3Var.S3()) {
                        if (a4Var != null) {
                            a4Var.setSendEnabled(v3Var.S3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> f32 = v3Var.f3();
                        if (!f32.isEmpty()) {
                            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
                            if (r2Var instanceof wn) {
                                wnVar = (wn) r2Var;
                            } else {
                                wnVar = null;
                            }
                            pi0 pi0Var = qVar.O;
                            if (pi0Var != null) {
                                pi0Var.g(false);
                                qVar.O = null;
                            }
                            pi0 pi0Var2 = new pi0(qVar.getContext(), u6Var);
                            qVar.O = pi0Var2;
                            pi0Var2.setOnDismissListener(new bi.cb(qVar, 7));
                            long t12 = tiVar.t1();
                            if (wnVar != null) {
                                messageObject = wnVar.D5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f22049id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(t12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = f32;
                            richMessage.photos = v3Var.H2();
                            tL_message.rich_message.documents = v3Var.E2();
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject2 = new MessageObject(i13, tL_message, false, false);
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject2.replyMessageObject = messageObject;
                            }
                            messageObject2.sendPreview = true;
                            messageObject2.isOutOwnerCached = Boolean.TRUE;
                            messageObject2.generateLayout(null);
                            messageObject2.notime = true;
                            qVar.O.p(org.telegram.messenger.t.l(messageObject2));
                            vg sendButton = a4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            vg q5 = qVar.O.q(sendButton, true, new ig.d0(qVar, 9));
                            if (q5 != null) {
                                q5.setBackground(new li.a2(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var))));
                                pi0 pi0Var3 = qVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                z10 = true;
                                pi0Var3.f42422l0 = true;
                                pi0Var3.X = dp;
                            } else {
                                z10 = true;
                            }
                            l80 F2 = l80.F(qVar, u6Var, sendButton);
                            if (wnVar != null && UserObject.isUserSelf(wnVar.i())) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (wnVar != null && wnVar.K6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z11) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new bi.r3(qVar, t12, 14), false);
                                if (!z11 && t12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new li.d(qVar, 0), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new li.d(qVar, 1), false);
                            }
                            F2.Y();
                            qVar.O.o(F2);
                            qVar.O.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            return z10;
                        }
                    }
                }
                return false;
            case 5:
                ((ng.f) this.f10558b).f18797c.callOnClick();
                return true;
            default:
                sg.m0 m0Var = (sg.m0) this.f10558b;
                int i15 = m0Var.E1;
                if (m0Var.H1 != null) {
                    rg.s0 e12 = rg.s0.e(i15);
                    e12.f47585k = !e12.f47585k;
                    e12.f47578a.edit().putBoolean("fill_shapes", e12.f47585k).apply();
                    boolean z13 = rg.s0.e(i15).f47585k;
                    for (int i16 = 0; i16 < m0Var.H1.getItemsCount(); i16++) {
                        View childAt2 = m0Var.H1.L.getChildAt(i16);
                        if (childAt2 instanceof sg.l0) {
                            rg.l lVar2 = (rg.l) rg.l.f47495b.get(i16);
                            if (z13) {
                                e10 = lVar2.m();
                            } else {
                                e10 = lVar2.e();
                            }
                            ((sg.l0) childAt2).a(e10, z13, true);
                        }
                    }
                }
                return true;
        }
    }
}
