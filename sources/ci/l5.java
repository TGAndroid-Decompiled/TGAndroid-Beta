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
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.cj0;
import org.telegram.ui.zn;
public final class l5 implements View.OnLongClickListener {
    public final int f5387a;
    public final Object f5388b;

    public l5(Object obj, int i10) {
        this.f5387a = i10;
        this.f5388b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e7;
        zn znVar;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        int i10;
        int e10;
        switch (this.f5387a) {
            case 0:
                q6 q6Var = (q6) this.f5388b;
                int i11 = q6Var.F1;
                if (q6Var.I1 != null) {
                    pg.u0 e11 = pg.u0.e(i11);
                    e11.f45876k = !e11.f45876k;
                    e11.f45868a.edit().putBoolean("fill_shapes", e11.f45876k).apply();
                    boolean z12 = pg.u0.e(i11).f45876k;
                    for (int i12 = 0; i12 < q6Var.I1.getItemsCount(); i12++) {
                        View childAt = q6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof n6) {
                            pg.l lVar = (pg.l) pg.l.f45748b.get(i12);
                            if (z12) {
                                e7 = lVar.m();
                            } else {
                                e7 = lVar.e();
                            }
                            ((n6) childAt).a(e7, z12, true);
                        }
                    }
                }
                return true;
            case 1:
                lc lcVar = (lc) this.f5388b;
                Activity activity = lcVar.f5460b;
                ob obVar = lcVar.B0;
                if (obVar == null || !obVar.isFrontface()) {
                    return false;
                }
                lcVar.o();
                lcVar.E0.setSelected(true);
                lcVar.f5515s.e(0.85f, 240L, null);
                p80 F = p80.F(lcVar.f5511r, lcVar.f5457a, lcVar.E0);
                f8 f8Var = new f8(activity, 1);
                f8Var.d(lcVar.f5515s.f6194o);
                f8Var.h = new ia(lcVar, 21);
                F.q(f8Var);
                F.o();
                f8 f8Var2 = new f8(activity, 2);
                f8Var2.f5076b = 0.65f;
                f8Var2.f5077c = 1.0f;
                f8Var2.d(lcVar.f5515s.f6195p);
                f8Var2.h = new ia(lcVar, 0);
                F.q(f8Var2);
                F.f29774p = new ha(lcVar, 1);
                F.f29779s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ii.i1) this.f5388b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ii.e2.W((ii.e2) this.f5388b, view);
            case 4:
                ii.r rVar = ((ii.m) this.f5388b).f12560a;
                ii.c4 c4Var = rVar.f12650s;
                org.telegram.ui.ActionBar.d6 d6Var = rVar.f30244a;
                yi yiVar = rVar.f30245b;
                ii.x3 x3Var = rVar.f12649r;
                int i13 = rVar.f12648n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new rg.y0(yiVar.f33289f0, rVar.getContext(), rVar.f12648n, 43, true).show();
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
                            org.telegram.ui.ActionBar.m2 m2Var = yiVar.f33289f0;
                            if (m2Var instanceof zn) {
                                znVar = (zn) m2Var;
                            } else {
                                znVar = null;
                            }
                            cj0 cj0Var = rVar.O;
                            if (cj0Var != null) {
                                cj0Var.h(false);
                                rVar.O = null;
                            }
                            cj0 cj0Var2 = new cj0(rVar.getContext(), d6Var);
                            rVar.O = cj0Var2;
                            cj0Var2.setOnDismissListener(new ai.g5(rVar, 4));
                            long p12 = yiVar.p1();
                            if (znVar != null) {
                                messageObject = znVar.f44901n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f20089id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(p12);
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
                            rVar.O.q(org.telegram.messenger.q.k(messageObject2));
                            xg sendButton = c4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            xg r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                            if (r10 != null) {
                                r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var))));
                                cj0 cj0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                z10 = true;
                                cj0Var3.m0 = true;
                                cj0Var3.Y = dp;
                            } else {
                                z10 = true;
                            }
                            p80 F2 = p80.F(rVar, d6Var, sendButton);
                            if (znVar != null && UserObject.isUserSelf(znVar.i())) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (znVar != null && znVar.G6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z11) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new ai.j(rVar, p12, 11), false);
                                if (!z11 && p12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ii.d(rVar, 0), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ii.d(rVar, 1), false);
                            }
                            F2.Y();
                            rVar.O.p(F2);
                            rVar.O.show();
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
                ((lg.f) this.f5388b).f15560c.callOnClick();
                return true;
            default:
                qg.m0 m0Var = (qg.m0) this.f5388b;
                int i15 = m0Var.P1;
                if (m0Var.S1 != null) {
                    pg.u0 e12 = pg.u0.e(i15);
                    e12.f45876k = !e12.f45876k;
                    e12.f45868a.edit().putBoolean("fill_shapes", e12.f45876k).apply();
                    boolean z13 = pg.u0.e(i15).f45876k;
                    for (int i16 = 0; i16 < m0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof qg.l0) {
                            pg.l lVar2 = (pg.l) pg.l.f45748b.get(i16);
                            if (z13) {
                                e10 = lVar2.m();
                            } else {
                                e10 = lVar2.e();
                            }
                            ((qg.l0) childAt2).a(e10, z13, true);
                        }
                    }
                }
                return true;
        }
    }
}
