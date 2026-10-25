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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.vg;
import org.telegram.ui.ni0;
import org.telegram.ui.un;
public final class b5 implements View.OnLongClickListener {
    public final int f10558a;
    public final Object f10559b;

    public b5(Object obj, int i10) {
        this.f10558a = i10;
        this.f10559b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        un unVar;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        int i10;
        int e10;
        switch (this.f10558a) {
            case 0:
                e6 e6Var = (e6) this.f10559b;
                int i11 = e6Var.f10817u1;
                if (e6Var.f10823x1 != null) {
                    rg.s0 e11 = rg.s0.e(i11);
                    e11.f47547k = !e11.f47547k;
                    e11.f47540a.edit().putBoolean("fill_shapes", e11.f47547k).apply();
                    boolean z12 = rg.s0.e(i11).f47547k;
                    for (int i12 = 0; i12 < e6Var.f10823x1.getItemsCount(); i12++) {
                        View childAt = e6Var.f10823x1.L.getChildAt(i12);
                        if (childAt instanceof b6) {
                            rg.l lVar = (rg.l) rg.l.f47457b.get(i12);
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
                sb sbVar = (sb) this.f10559b;
                Activity activity = sbVar.f11608b;
                va vaVar = sbVar.B0;
                if (vaVar == null || !vaVar.isFrontface()) {
                    return false;
                }
                sbVar.o();
                sbVar.E0.setSelected(true);
                sbVar.f11662s.e(0.85f, 240L, null);
                k80 F = k80.F(sbVar.f11658r, sbVar.f11605a, sbVar.E0);
                q7 q7Var = new q7(activity, 1);
                q7Var.d(sbVar.f11662s.f11476o);
                q7Var.h = new q9(sbVar, 21);
                F.q(q7Var);
                F.o();
                q7 q7Var2 = new q7(activity, 2);
                q7Var2.f11490b = 0.65f;
                q7Var2.f11491c = 1.0f;
                q7Var2.d(sbVar.f11662s.f11477p);
                q7Var2.h = new q9(sbVar, 0);
                F.q(q7Var2);
                F.f29861p = new p9(sbVar, 1);
                F.f29866s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((li.g1) this.f10559b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return li.b2.X((li.b2) this.f10559b, view);
            case 4:
                li.q qVar = ((li.l) this.f10559b).f17336a;
                li.a4 a4Var = qVar.f17419s;
                org.telegram.ui.ActionBar.u6 u6Var = qVar.f30212a;
                ti tiVar = qVar.f30213b;
                li.v3 v3Var = qVar.f17418r;
                int i13 = qVar.f17417n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new tg.y0(tiVar.f33018f0, qVar.getContext(), qVar.f17417n, 43, true).show();
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
                            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f33018f0;
                            if (r2Var instanceof un) {
                                unVar = (un) r2Var;
                            } else {
                                unVar = null;
                            }
                            ni0 ni0Var = qVar.O;
                            if (ni0Var != null) {
                                ni0Var.g(false);
                                qVar.O = null;
                            }
                            ni0 ni0Var2 = new ni0(qVar.getContext(), u6Var);
                            qVar.O = ni0Var2;
                            ni0Var2.setOnDismissListener(new bi.cb(qVar, 7));
                            long s12 = tiVar.s1();
                            if (unVar != null) {
                                messageObject = unVar.f44498z5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f22048id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(s12);
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
                                ni0 ni0Var3 = qVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                z10 = true;
                                ni0Var3.f41916l0 = true;
                                ni0Var3.X = dp;
                            } else {
                                z10 = true;
                            }
                            k80 F2 = k80.F(qVar, u6Var, sendButton);
                            if (unVar != null && UserObject.isUserSelf(unVar.i())) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (unVar != null && unVar.I6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z11) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new bi.r3(qVar, s12, 14), false);
                                if (!z11 && s12 > 0) {
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
                ((ng.f) this.f10559b).f18798c.callOnClick();
                return true;
            default:
                sg.n0 n0Var = (sg.n0) this.f10559b;
                int i15 = n0Var.E1;
                if (n0Var.H1 != null) {
                    rg.s0 e12 = rg.s0.e(i15);
                    e12.f47547k = !e12.f47547k;
                    e12.f47540a.edit().putBoolean("fill_shapes", e12.f47547k).apply();
                    boolean z13 = rg.s0.e(i15).f47547k;
                    for (int i16 = 0; i16 < n0Var.H1.getItemsCount(); i16++) {
                        View childAt2 = n0Var.H1.L.getChildAt(i16);
                        if (childAt2 instanceof sg.m0) {
                            rg.l lVar2 = (rg.l) rg.l.f47457b.get(i16);
                            if (z13) {
                                e10 = lVar2.m();
                            } else {
                                e10 = lVar2.e();
                            }
                            ((sg.m0) childAt2).a(e10, z13, true);
                        }
                    }
                }
                return true;
        }
    }
}
