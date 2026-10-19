package ei;

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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.li0;
import org.telegram.ui.qn;
public final class c5 implements View.OnLongClickListener {
    public final int f8824a;
    public final Object f8825b;

    public c5(Object obj, int i10) {
        this.f8824a = i10;
        this.f8825b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        qn qnVar;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        int i10;
        int e7;
        switch (this.f8824a) {
            case 0:
                f6 f6Var = (f6) this.f8825b;
                int i11 = f6Var.F1;
                if (f6Var.I1 != null) {
                    qg.v0 e10 = qg.v0.e(i11);
                    e10.f44674k = !e10.f44674k;
                    e10.f44667a.edit().putBoolean("fill_shapes", e10.f44674k).apply();
                    boolean z12 = qg.v0.e(i11).f44674k;
                    for (int i12 = 0; i12 < f6Var.I1.getItemsCount(); i12++) {
                        View childAt = f6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof c6) {
                            qg.l lVar = (qg.l) qg.l.f44544b.get(i12);
                            if (z12) {
                                e = lVar.m();
                            } else {
                                e = lVar.e();
                            }
                            ((c6) childAt).a(e, z12, true);
                        }
                    }
                }
                return true;
            case 1:
                vb vbVar = (vb) this.f8825b;
                Activity activity = vbVar.f9952b;
                ya yaVar = vbVar.B0;
                if (yaVar == null || !yaVar.isFrontface()) {
                    return false;
                }
                vbVar.o();
                vbVar.E0.setSelected(true);
                vbVar.f10006s.e(0.85f, 240L, null);
                i80 F = i80.F(vbVar.f10002r, vbVar.f9949a, vbVar.E0);
                u7 u7Var = new u7(activity, 1);
                u7Var.d(vbVar.f10006s.f9779o);
                u7Var.h = new u9(vbVar, 21);
                F.q(u7Var);
                F.o();
                u7 u7Var2 = new u7(activity, 2);
                u7Var2.f9902b = 0.65f;
                u7Var2.f9903c = 1.0f;
                u7Var2.d(vbVar.f10006s.f9780p);
                u7Var2.h = new u9(vbVar, 0);
                F.q(u7Var2);
                F.f27131p = new t9(vbVar, 1);
                F.f27136s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ki.h1) this.f8825b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ki.d2.W((ki.d2) this.f8825b, view);
            case 4:
                ki.q qVar = ((ki.l) this.f8825b).f15370a;
                ki.b4 b4Var = qVar.f15451s;
                org.telegram.ui.ActionBar.d6 d6Var = qVar.f28224a;
                ti tiVar = qVar.f28225b;
                ki.w3 w3Var = qVar.f15450r;
                int i13 = qVar.f15449n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new sg.y0(tiVar.f30536f0, qVar.getContext(), qVar.f15449n, 43, true).show();
                    return true;
                }
                if (w3Var.l3() && !w3Var.n3()) {
                    if (!w3Var.N3()) {
                        if (b4Var != null) {
                            b4Var.setSendEnabled(w3Var.N3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> a32 = w3Var.a3();
                        if (!a32.isEmpty()) {
                            org.telegram.ui.ActionBar.n2 n2Var = tiVar.f30536f0;
                            if (n2Var instanceof qn) {
                                qnVar = (qn) n2Var;
                            } else {
                                qnVar = null;
                            }
                            li0 li0Var = qVar.O;
                            if (li0Var != null) {
                                li0Var.h(false);
                                qVar.O = null;
                            }
                            li0 li0Var2 = new li0(qVar.getContext(), d6Var);
                            qVar.O = li0Var2;
                            li0Var2.setOnDismissListener(new ai.bb(qVar, 7));
                            long p12 = tiVar.p1();
                            if (qnVar != null) {
                                messageObject = qnVar.f40781n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f20296id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(p12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = a32;
                            richMessage.photos = w3Var.C2();
                            tL_message.rich_message.documents = w3Var.z2();
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
                            qVar.O.q(org.telegram.messenger.g0.k(messageObject2));
                            vg sendButton = b4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            vg r10 = qVar.O.r(sendButton, true, new hg.r0(qVar, 8));
                            if (r10 != null) {
                                r10.setBackground(new ki.c2(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var))));
                                li0 li0Var3 = qVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                z10 = true;
                                li0Var3.m0 = true;
                                li0Var3.Y = dp;
                            } else {
                                z10 = true;
                            }
                            i80 F2 = i80.F(qVar, d6Var, sendButton);
                            if (qnVar != null && UserObject.isUserSelf(qnVar.i())) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (qnVar != null && qnVar.G6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z11) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new ai.u3(qVar, p12, 14), false);
                                if (!z11 && p12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ki.d(qVar, 0), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ki.d(qVar, 1), false);
                            }
                            F2.Y();
                            qVar.O.p(F2);
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
                ((mg.f) this.f8825b).f16874c.callOnClick();
                return true;
            default:
                rg.m0 m0Var = (rg.m0) this.f8825b;
                int i15 = m0Var.P1;
                if (m0Var.S1 != null) {
                    qg.v0 e11 = qg.v0.e(i15);
                    e11.f44674k = !e11.f44674k;
                    e11.f44667a.edit().putBoolean("fill_shapes", e11.f44674k).apply();
                    boolean z13 = qg.v0.e(i15).f44674k;
                    for (int i16 = 0; i16 < m0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof rg.l0) {
                            qg.l lVar2 = (qg.l) qg.l.f44544b.get(i16);
                            if (z13) {
                                e7 = lVar2.m();
                            } else {
                                e7 = lVar2.e();
                            }
                            ((rg.l0) childAt2).a(e7, z13, true);
                        }
                    }
                }
                return true;
        }
    }
}
