package bg;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import nh.g9;
import nh.gb;
import nh.h9;
import nh.i7;
import nh.ka;
import nh.r5;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.og;
import org.telegram.ui.ki0;
import org.telegram.ui.tn;
public final class g0 implements View.OnLongClickListener {
    public final int f2222a;
    public final Object f2223b;

    public g0(Object obj, int i10) {
        this.f2222a = i10;
        this.f2223b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e10;
        int e11;
        tn tnVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        switch (this.f2222a) {
            case 0:
                g1 g1Var = (g1) this.f2223b;
                int i11 = g1Var.L1;
                if (g1Var.O1 != null) {
                    ag.h1 e12 = ag.h1.e(i11);
                    e12.f523k = !e12.f523k;
                    e12.f515a.edit().putBoolean("fill_shapes", e12.f523k).apply();
                    boolean z11 = ag.h1.e(i11).f523k;
                    for (int i12 = 0; i12 < g1Var.O1.getItemsCount(); i12++) {
                        View childAt = g1Var.O1.H.getChildAt(i12);
                        if (childAt instanceof e1) {
                            ag.l lVar = (ag.l) ag.l.f574b.get(i12);
                            if (z11) {
                                e10 = lVar.m();
                            } else {
                                e10 = lVar.e();
                            }
                            ((e1) childAt).a(e10, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                t5 t5Var = (t5) this.f2223b;
                int i13 = t5Var.B1;
                if (t5Var.E1 != null) {
                    ag.h1 e13 = ag.h1.e(i13);
                    e13.f523k = !e13.f523k;
                    e13.f515a.edit().putBoolean("fill_shapes", e13.f523k).apply();
                    boolean z12 = ag.h1.e(i13).f523k;
                    for (int i14 = 0; i14 < t5Var.E1.getItemsCount(); i14++) {
                        View childAt2 = t5Var.E1.H.getChildAt(i14);
                        if (childAt2 instanceof r5) {
                            ag.l lVar2 = (ag.l) ag.l.f574b.get(i14);
                            if (z12) {
                                e11 = lVar2.m();
                            } else {
                                e11 = lVar2.e();
                            }
                            ((r5) childAt2).a(e11, z12, true);
                        }
                    }
                }
                return true;
            case 2:
                gb gbVar = (gb) this.f2223b;
                Activity activity = gbVar.f17739b;
                ka kaVar = gbVar.f17812x0;
                if (kaVar == null || !kaVar.isFrontface()) {
                    return false;
                }
                gbVar.p();
                gbVar.A0.setSelected(true);
                gbVar.f17794s.e(0.85f, 240L, null);
                j70 F = j70.F(gbVar.f17790r, gbVar.f17736a, gbVar.A0);
                i7 i7Var = new i7(activity, 1);
                i7Var.d(gbVar.f17794s.f18342o);
                i7Var.h = new h9(gbVar, 21);
                F.q(i7Var);
                F.o();
                i7 i7Var2 = new i7(activity, 2);
                i7Var2.f17894b = 0.65f;
                i7Var2.f17895c = 1.0f;
                i7Var2.d(gbVar.f17794s.f18343p);
                i7Var2.h = new h9(gbVar, 0);
                F.q(i7Var2);
                F.f29595p = new g9(gbVar, 1);
                F.f29600s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 3:
                if (((th.d1) this.f2223b).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return th.x1.W((th.x1) this.f2223b, view);
            case 5:
                th.p pVar = ((th.k) this.f2223b).f48528a;
                th.t3 t3Var = pVar.f48624s;
                c6 c6Var = pVar.f28402a;
                ni niVar = pVar.f28403b;
                th.p3 p3Var = pVar.f48623r;
                int i15 = pVar.f48622n;
                if (!UserConfig.getInstance(i15).isPremium()) {
                    new cg.p1(niVar.f30990b0, pVar.getContext(), pVar.f48622n, 43, true).show();
                    return true;
                }
                if (p3Var.k3() && !p3Var.m3()) {
                    if (!p3Var.M3()) {
                        if (t3Var != null) {
                            t3Var.setSendEnabled(p3Var.M3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Z2 = p3Var.Z2();
                        if (!Z2.isEmpty()) {
                            org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
                            if (o2Var instanceof tn) {
                                tnVar = (tn) o2Var;
                            } else {
                                tnVar = null;
                            }
                            ki0 ki0Var = pVar.K;
                            if (ki0Var != null) {
                                ki0Var.h(false);
                                pVar.K = null;
                            }
                            ki0 ki0Var2 = new ki0(pVar.getContext(), c6Var);
                            pVar.K = ki0Var2;
                            ki0Var2.setOnDismissListener(new cg.d0(pVar, 13));
                            long n12 = niVar.n1();
                            if (tnVar != null) {
                                messageObject = tnVar.f42856j5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f22413id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i15).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i15).getPeer(UserConfig.getInstance(i15).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Z2;
                            richMessage.photos = p3Var.B2();
                            tL_message.rich_message.documents = p3Var.y2();
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
                            pVar.K.q(org.telegram.messenger.x3.n(messageObject2));
                            og sendButton = t3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            og r6 = pVar.K.r(sendButton, true, new mh.n(pVar, 26));
                            if (r6 != null) {
                                r6.setBackground(new th.w1(g6.b0(AndroidUtilities.dp(22.0f), g6.v0(g6.Oh, c6Var))));
                                ki0 ki0Var3 = pVar.K;
                                int dp = AndroidUtilities.dp(44.0f);
                                ki0Var3.f39885i0 = true;
                                ki0Var3.U = dp;
                            }
                            j70 F2 = j70.F(pVar, c6Var, sendButton);
                            if (tnVar != null && UserObject.isUserSelf(tnVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (tnVar != null && tnVar.D6()) {
                                int i16 = R.drawable.msg_calendar2;
                                if (z10) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i16, LocaleController.getString(i10), new qh.m0(pVar, n12, 1), false);
                                if (!z10 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new th.d(pVar, 0), false);
                                }
                            }
                            if (!z10) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new th.d(pVar, 1), false);
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
            default:
                ((wf.e) this.f2223b).f49905c.callOnClick();
                return true;
        }
    }
}
