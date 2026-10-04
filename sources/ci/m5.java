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
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.wg;
import org.telegram.ui.Components.xi;
import org.telegram.ui.yn;
import org.telegram.ui.zi0;
public final class m5 implements View.OnLongClickListener {
    public final int f5567a;
    public final Object f5568b;

    public m5(Object obj, int i10) {
        this.f5567a = i10;
        this.f5568b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e7;
        yn ynVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        int e10;
        switch (this.f5567a) {
            case 0:
                q6 q6Var = (q6) this.f5568b;
                int i11 = q6Var.F1;
                if (q6Var.I1 != null) {
                    pg.u0 e11 = pg.u0.e(i11);
                    e11.f44655k = !e11.f44655k;
                    e11.f44647a.edit().putBoolean("fill_shapes", e11.f44655k).apply();
                    boolean z11 = pg.u0.e(i11).f44655k;
                    for (int i12 = 0; i12 < q6Var.I1.getItemsCount(); i12++) {
                        View childAt = q6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof n6) {
                            pg.l lVar = (pg.l) pg.l.f44526b.get(i12);
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
                kc kcVar = (kc) this.f5568b;
                Activity activity = kcVar.f5377b;
                nb nbVar = kcVar.B0;
                if (nbVar == null || !nbVar.isFrontface()) {
                    return false;
                }
                kcVar.p();
                kcVar.E0.setSelected(true);
                kcVar.f5432s.e(0.85f, 240L, null);
                b80 F = b80.F(kcVar.f5428r, kcVar.f5374a, kcVar.E0);
                e8 e8Var = new e8(activity, 1);
                e8Var.d(kcVar.f5432s.f6277o);
                e8Var.h = new ha(kcVar, 21);
                F.q(e8Var);
                F.o();
                e8 e8Var2 = new e8(activity, 2);
                e8Var2.f5031b = 0.65f;
                e8Var2.f5032c = 1.0f;
                e8Var2.d(kcVar.f5432s.f6278p);
                e8Var2.h = new ha(kcVar, 0);
                F.q(e8Var2);
                F.f24844p = new ga(kcVar, 1);
                F.f24849s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ii.i1) this.f5568b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ii.e2.U((ii.e2) this.f5568b, view);
            case 4:
                ii.r rVar = ((ii.m) this.f5568b).f12516a;
                ii.c4 c4Var = rVar.f12604s;
                org.telegram.ui.ActionBar.d6 d6Var = rVar.f29647a;
                xi xiVar = rVar.f29648b;
                ii.x3 x3Var = rVar.f12603r;
                int i13 = rVar.f12602n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new rg.y0(xiVar.f32819f0, rVar.getContext(), rVar.f12602n, 43, true).show();
                    return true;
                }
                if (x3Var.m3() && !x3Var.o3()) {
                    if (!x3Var.O3()) {
                        if (c4Var != null) {
                            c4Var.setSendEnabled(x3Var.O3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> b32 = x3Var.b3();
                        if (!b32.isEmpty()) {
                            org.telegram.ui.ActionBar.n2 n2Var = xiVar.f32819f0;
                            if (n2Var instanceof yn) {
                                ynVar = (yn) n2Var;
                            } else {
                                ynVar = null;
                            }
                            zi0 zi0Var = rVar.O;
                            if (zi0Var != null) {
                                zi0Var.h(false);
                                rVar.O = null;
                            }
                            zi0 zi0Var2 = new zi0(rVar.getContext(), d6Var);
                            rVar.O = zi0Var2;
                            zi0Var2.setOnDismissListener(new ai.f5(rVar, 4));
                            long n12 = xiVar.n1();
                            if (ynVar != null) {
                                messageObject = ynVar.f43412l5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f20063id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = b32;
                            richMessage.photos = x3Var.D2();
                            tL_message.rich_message.documents = x3Var.A2();
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
                            rVar.O.q(org.telegram.messenger.q.k(messageObject2));
                            wg sendButton = c4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            wg r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                            if (r10 != null) {
                                r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, d6Var))));
                                zi0 zi0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                zi0Var3.m0 = true;
                                zi0Var3.Y = dp;
                            }
                            b80 F2 = b80.F(rVar, d6Var, sendButton);
                            if (ynVar != null && UserObject.isUserSelf(ynVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (ynVar != null && ynVar.D6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z10) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new ai.j(rVar, n12, 10), false);
                                if (!z10 && n12 > 0) {
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
                ((lg.f) this.f5568b).f15525c.callOnClick();
                return true;
            default:
                qg.m0 m0Var = (qg.m0) this.f5568b;
                int i15 = m0Var.P1;
                if (m0Var.S1 != null) {
                    pg.u0 e12 = pg.u0.e(i15);
                    e12.f44655k = !e12.f44655k;
                    e12.f44647a.edit().putBoolean("fill_shapes", e12.f44655k).apply();
                    boolean z12 = pg.u0.e(i15).f44655k;
                    for (int i16 = 0; i16 < m0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof qg.l0) {
                            pg.l lVar2 = (pg.l) pg.l.f44526b.get(i16);
                            if (z12) {
                                e10 = lVar2.m();
                            } else {
                                e10 = lVar2.e();
                            }
                            ((qg.l0) childAt2).a(e10, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
