package bi;

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
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.cj0;
import org.telegram.ui.eo;
public final class l6 implements View.OnLongClickListener {
    public final int f3040a;
    public final Object f3041b;

    public l6(Object obj, int i10) {
        this.f3040a = i10;
        this.f3041b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        eo eoVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        int e7;
        switch (this.f3040a) {
            case 0:
                r7 r7Var = (r7) this.f3041b;
                int i11 = r7Var.F1;
                if (r7Var.I1 != null) {
                    og.x0 e10 = og.x0.e(i11);
                    e10.f14559k = !e10.f14559k;
                    e10.f14552a.edit().putBoolean("fill_shapes", e10.f14559k).apply();
                    boolean z11 = og.x0.e(i11).f14559k;
                    for (int i12 = 0; i12 < r7Var.I1.getItemsCount(); i12++) {
                        View childAt = r7Var.I1.L.getChildAt(i12);
                        if (childAt instanceof o7) {
                            og.l lVar = (og.l) og.l.f14414b.get(i12);
                            if (z11) {
                                e = lVar.m();
                            } else {
                                e = lVar.e();
                            }
                            ((o7) childAt).a(e, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                ce ceVar = (ce) this.f3041b;
                Activity activity = ceVar.f2433b;
                bd bdVar = ceVar.B0;
                if (bdVar == null || !bdVar.isFrontface()) {
                    return false;
                }
                ceVar.p();
                ceVar.E0.setSelected(true);
                ceVar.f2487s.e(0.85f, 240L, null);
                w70 F = w70.F(ceVar.f2483r, ceVar.f2430a, ceVar.E0);
                k9 k9Var = new k9(activity, 1);
                k9Var.d(ceVar.f2487s.f3087o);
                k9Var.h = new ub(ceVar, 21);
                F.q(k9Var);
                F.o();
                k9 k9Var2 = new k9(activity, 2);
                k9Var2.f2993b = 0.65f;
                k9Var2.f2994c = 1.0f;
                k9Var2.d(ceVar.f2487s.f3088p);
                k9Var2.h = new ub(ceVar, 0);
                F.q(k9Var2);
                F.f28696p = new tb(ceVar, 1);
                F.f28701s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((hi.k1) this.f3041b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return hi.g2.W((hi.g2) this.f3041b, view);
            case 4:
                hi.s sVar = ((hi.n) this.f3041b).f9749a;
                hi.e4 e4Var = sVar.f9836s;
                org.telegram.ui.ActionBar.f6 f6Var = sVar.f26421a;
                yi yiVar = sVar.f26422b;
                hi.z3 z3Var = sVar.f9835r;
                int i13 = sVar.f9834n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new qg.a1(yiVar.f29366f0, sVar.getContext(), sVar.f9834n, 43, true).show();
                    return true;
                }
                if (z3Var.j3() && !z3Var.l3()) {
                    if (!z3Var.L3()) {
                        if (e4Var != null) {
                            e4Var.setSendEnabled(z3Var.L3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Y2 = z3Var.Y2();
                        if (!Y2.isEmpty()) {
                            org.telegram.ui.ActionBar.p2 p2Var = yiVar.f29366f0;
                            if (p2Var instanceof eo) {
                                eoVar = (eo) p2Var;
                            } else {
                                eoVar = null;
                            }
                            cj0 cj0Var = sVar.O;
                            if (cj0Var != null) {
                                cj0Var.h(false);
                                sVar.O = null;
                            }
                            cj0 cj0Var2 = new cj0(sVar.getContext(), f6Var);
                            sVar.O = cj0Var2;
                            cj0Var2.setOnDismissListener(new gg.o(sVar, 2));
                            long n12 = yiVar.n1();
                            if (eoVar != null) {
                                messageObject = eoVar.f32421n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f17216id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Y2;
                            richMessage.photos = z3Var.A2();
                            tL_message.rich_message.documents = z3Var.x2();
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
                            sVar.O.q(org.telegram.messenger.a2.l(messageObject2));
                            xg sendButton = e4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            xg r10 = sVar.O.r(sendButton, true, new ai.u(sVar, 22));
                            if (r10 != null) {
                                r10.setBackground(new hi.f2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                                cj0 cj0Var3 = sVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                cj0Var3.m0 = true;
                                cj0Var3.Y = dp;
                            }
                            w70 F2 = w70.F(sVar, f6Var, sendButton);
                            if (eoVar != null && UserObject.isUserSelf(eoVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (eoVar != null && eoVar.D6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z10) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new va(sVar, n12, 5), false);
                                if (!z10 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new hi.e(sVar, 0), false);
                                }
                            }
                            if (!z10) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new hi.e(sVar, 1), false);
                            }
                            F2.Y();
                            sVar.O.p(F2);
                            sVar.O.show();
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
                ((kg.f) this.f3041b).f12450c.callOnClick();
                return true;
            default:
                pg.m0 m0Var = (pg.m0) this.f3041b;
                int i15 = m0Var.P1;
                if (m0Var.S1 != null) {
                    og.x0 e11 = og.x0.e(i15);
                    e11.f14559k = !e11.f14559k;
                    e11.f14552a.edit().putBoolean("fill_shapes", e11.f14559k).apply();
                    boolean z12 = og.x0.e(i15).f14559k;
                    for (int i16 = 0; i16 < m0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof pg.l0) {
                            og.l lVar2 = (og.l) og.l.f14414b.get(i16);
                            if (z12) {
                                e7 = lVar2.m();
                            } else {
                                e7 = lVar2.e();
                            }
                            ((pg.l0) childAt2).a(e7, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
