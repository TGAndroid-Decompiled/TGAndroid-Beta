package ci;

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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.xn;
import org.telegram.ui.yi0;
public final class m5 implements View.OnLongClickListener {
    public final int f5169a;
    public final Object f5170b;

    public m5(Object obj, int i10) {
        this.f5169a = i10;
        this.f5170b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        xn xnVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        int e7;
        switch (this.f5169a) {
            case 0:
                q6 q6Var = (q6) this.f5170b;
                int i11 = q6Var.F1;
                if (q6Var.I1 != null) {
                    pg.u0 e10 = pg.u0.e(i11);
                    e10.f41279k = !e10.f41279k;
                    e10.f41272a.edit().putBoolean("fill_shapes", e10.f41279k).apply();
                    boolean z11 = pg.u0.e(i11).f41279k;
                    for (int i12 = 0; i12 < q6Var.I1.getItemsCount(); i12++) {
                        View childAt = q6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof n6) {
                            pg.l lVar = (pg.l) pg.l.f41160b.get(i12);
                            if (z11) {
                                e = lVar.m();
                            } else {
                                e = lVar.e();
                            }
                            ((n6) childAt).a(e, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                kc kcVar = (kc) this.f5170b;
                Activity activity = kcVar.f4985b;
                nb nbVar = kcVar.B0;
                if (nbVar == null || !nbVar.isFrontface()) {
                    return false;
                }
                kcVar.p();
                kcVar.E0.setSelected(true);
                kcVar.f5039s.e(0.85f, 240L, null);
                a80 F = a80.F(kcVar.f5035r, kcVar.f4982a, kcVar.E0);
                e8 e8Var = new e8(activity, 1);
                e8Var.d(kcVar.f5039s.f5827o);
                e8Var.h = new ha(kcVar, 21);
                F.q(e8Var);
                F.o();
                e8 e8Var2 = new e8(activity, 2);
                e8Var2.f4657b = 0.65f;
                e8Var2.f4658c = 1.0f;
                e8Var2.d(kcVar.f5039s.f5828p);
                e8Var2.h = new ha(kcVar, 0);
                F.q(e8Var2);
                F.f22601p = new ga(kcVar, 1);
                F.f22606s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ii.i1) this.f5170b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ii.e2.W((ii.e2) this.f5170b, view);
            case 4:
                ii.r rVar = ((ii.m) this.f5170b).f11496a;
                ii.c4 c4Var = rVar.f11576s;
                org.telegram.ui.ActionBar.e6 e6Var = rVar.f27103a;
                wi wiVar = rVar.f27104b;
                ii.x3 x3Var = rVar.f11575r;
                int i13 = rVar.f11574n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new rg.x0(wiVar.f29962f0, rVar.getContext(), rVar.f11574n, 43, true).show();
                    return true;
                }
                if (x3Var.l3() && !x3Var.n3()) {
                    if (!x3Var.N3()) {
                        if (c4Var != null) {
                            c4Var.setSendEnabled(x3Var.N3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> a32 = x3Var.a3();
                        if (!a32.isEmpty()) {
                            org.telegram.ui.ActionBar.o2 o2Var = wiVar.f29962f0;
                            if (o2Var instanceof xn) {
                                xnVar = (xn) o2Var;
                            } else {
                                xnVar = null;
                            }
                            yi0 yi0Var = rVar.O;
                            if (yi0Var != null) {
                                yi0Var.h(false);
                                rVar.O = null;
                            }
                            yi0 yi0Var2 = new yi0(rVar.getContext(), e6Var);
                            rVar.O = yi0Var2;
                            yi0Var2.setOnDismissListener(new ai.f5(rVar, 4));
                            long l1 = wiVar.l1();
                            if (xnVar != null) {
                                messageObject = xnVar.f39856n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f18350id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(l1);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = a32;
                            richMessage.photos = x3Var.C2();
                            tL_message.rich_message.documents = x3Var.z2();
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
                            rVar.O.q(org.telegram.messenger.l0.j(messageObject2));
                            vg sendButton = c4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            vg r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                            if (r10 != null) {
                                r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var))));
                                yi0 yi0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                yi0Var3.m0 = true;
                                yi0Var3.Y = dp;
                            }
                            a80 F2 = a80.F(rVar, e6Var, sendButton);
                            if (xnVar != null && UserObject.isUserSelf(xnVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (xnVar != null && xnVar.D6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z10) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new ai.j(rVar, l1, 10), false);
                                if (!z10 && l1 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ii.d(rVar, 0), false);
                                }
                            }
                            if (!z10) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ii.d(rVar, 1), false);
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
                ((lg.f) this.f5170b).f14280c.callOnClick();
                return true;
            default:
                qg.m0 m0Var = (qg.m0) this.f5170b;
                int i15 = m0Var.P1;
                if (m0Var.S1 != null) {
                    pg.u0 e11 = pg.u0.e(i15);
                    e11.f41279k = !e11.f41279k;
                    e11.f41272a.edit().putBoolean("fill_shapes", e11.f41279k).apply();
                    boolean z12 = pg.u0.e(i15).f41279k;
                    for (int i16 = 0; i16 < m0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof qg.l0) {
                            pg.l lVar2 = (pg.l) pg.l.f41160b.get(i16);
                            if (z12) {
                                e7 = lVar2.m();
                            } else {
                                e7 = lVar2.e();
                            }
                            ((qg.l0) childAt2).a(e7, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
