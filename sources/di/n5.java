package di;

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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.vi;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
public final class n5 implements View.OnLongClickListener {
    public final int f7708a;
    public final Object f7709b;

    public n5(Object obj, int i10) {
        this.f7708a = i10;
        this.f7709b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e7;
        co coVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        int e10;
        switch (this.f7708a) {
            case 0:
                q6 q6Var = (q6) this.f7709b;
                int i11 = q6Var.F1;
                if (q6Var.I1 != null) {
                    qg.s0 e11 = qg.s0.e(i11);
                    e11.f44602k = !e11.f44602k;
                    e11.f44594a.edit().putBoolean("fill_shapes", e11.f44602k).apply();
                    boolean z11 = qg.s0.e(i11).f44602k;
                    for (int i12 = 0; i12 < q6Var.I1.getItemsCount(); i12++) {
                        View childAt = q6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof n6) {
                            qg.l lVar = (qg.l) qg.l.f44503b.get(i12);
                            if (z11) {
                                e7 = lVar.m();
                            } else {
                                e7 = lVar.e();
                            }
                            ((n6) childAt).a(e7, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                pc pcVar = (pc) this.f7709b;
                Activity activity = pcVar.f7872b;
                sb sbVar = pcVar.B0;
                if (sbVar == null || !sbVar.isFrontface()) {
                    return false;
                }
                pcVar.p();
                pcVar.E0.setSelected(true);
                pcVar.f7927s.e(0.85f, 240L, null);
                n70 F = n70.F(pcVar.f7923r, pcVar.f7869a, pcVar.E0);
                i8 i8Var = new i8(activity, 1);
                i8Var.d(pcVar.f7927s.f8488o);
                i8Var.h = new la(pcVar, 21);
                F.q(i8Var);
                F.o();
                i8 i8Var2 = new i8(activity, 2);
                i8Var2.f7402b = 0.65f;
                i8Var2.f7403c = 1.0f;
                i8Var2.d(pcVar.f7927s.f8489p);
                i8Var2.h = new la(pcVar, 0);
                F.q(i8Var2);
                F.f28682p = new ka(pcVar, 1);
                F.f28687s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ji.h1) this.f7709b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ji.c2.W((ji.c2) this.f7709b, view);
            case 4:
                ji.r rVar = ((ji.m) this.f7709b).f14074a;
                ji.a4 a4Var = rVar.f14160s;
                org.telegram.ui.ActionBar.f6 f6Var = rVar.f28779a;
                vi viVar = rVar.f28780b;
                ji.v3 v3Var = rVar.f14159r;
                int i13 = rVar.f14158n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new sg.a1(viVar.f31306f0, rVar.getContext(), rVar.f14158n, 43, true).show();
                    return true;
                }
                if (v3Var.j3() && !v3Var.l3()) {
                    if (!v3Var.L3()) {
                        if (a4Var != null) {
                            a4Var.setSendEnabled(v3Var.L3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Y2 = v3Var.Y2();
                        if (!Y2.isEmpty()) {
                            org.telegram.ui.ActionBar.n2 n2Var = viVar.f31306f0;
                            if (n2Var instanceof co) {
                                coVar = (co) n2Var;
                            } else {
                                coVar = null;
                            }
                            cj0 cj0Var = rVar.O;
                            if (cj0Var != null) {
                                cj0Var.h(false);
                                rVar.O = null;
                            }
                            cj0 cj0Var2 = new cj0(rVar.getContext(), f6Var);
                            rVar.O = cj0Var2;
                            cj0Var2.setOnDismissListener(new bi.r4(rVar, 4));
                            long n12 = viVar.n1();
                            if (coVar != null) {
                                messageObject = coVar.f35379n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f19917id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Y2;
                            richMessage.photos = v3Var.A2();
                            tL_message.rich_message.documents = v3Var.x2();
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
                            rVar.O.q(org.telegram.messenger.w1.l(messageObject2));
                            vg sendButton = a4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            vg r10 = rVar.O.r(sendButton, true, new ah.h0(rVar, 28));
                            if (r10 != null) {
                                r10.setBackground(new ji.b2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                                cj0 cj0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                cj0Var3.m0 = true;
                                cj0Var3.Y = dp;
                            }
                            n70 F2 = n70.F(rVar, f6Var, sendButton);
                            if (coVar != null && UserObject.isUserSelf(coVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (coVar != null && coVar.D6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z10) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new bi.g(rVar, n12, 10), false);
                                if (!z10 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ji.d(rVar, 0), false);
                                }
                            }
                            if (!z10) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ji.d(rVar, 1), false);
                            }
                            F2.Y();
                            rVar.O.p(F2);
                            rVar.O.show();
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
                ((mg.f) this.f7709b).f16277c.callOnClick();
                return true;
            default:
                rg.o0 o0Var = (rg.o0) this.f7709b;
                int i15 = o0Var.P1;
                if (o0Var.S1 != null) {
                    qg.s0 e12 = qg.s0.e(i15);
                    e12.f44602k = !e12.f44602k;
                    e12.f44594a.edit().putBoolean("fill_shapes", e12.f44602k).apply();
                    boolean z12 = qg.s0.e(i15).f44602k;
                    for (int i16 = 0; i16 < o0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = o0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof rg.n0) {
                            qg.l lVar2 = (qg.l) qg.l.f44503b.get(i16);
                            if (z12) {
                                e10 = lVar2.m();
                            } else {
                                e10 = lVar2.e();
                            }
                            ((rg.n0) childAt2).a(e10, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
