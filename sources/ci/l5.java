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
import org.telegram.ui.dj0;
import org.telegram.ui.zn;
public final class l5 implements View.OnLongClickListener {
    public final int f5388a;
    public final Object f5389b;

    public l5(Object obj, int i10) {
        this.f5388a = i10;
        this.f5389b = obj;
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
        switch (this.f5388a) {
            case 0:
                q6 q6Var = (q6) this.f5389b;
                int i11 = q6Var.F1;
                if (q6Var.I1 != null) {
                    pg.u0 e11 = pg.u0.e(i11);
                    e11.f45808k = !e11.f45808k;
                    e11.f45800a.edit().putBoolean("fill_shapes", e11.f45808k).apply();
                    boolean z12 = pg.u0.e(i11).f45808k;
                    for (int i12 = 0; i12 < q6Var.I1.getItemsCount(); i12++) {
                        View childAt = q6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof n6) {
                            pg.l lVar = (pg.l) pg.l.f45680b.get(i12);
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
                lc lcVar = (lc) this.f5389b;
                Activity activity = lcVar.f5461b;
                ob obVar = lcVar.B0;
                if (obVar == null || !obVar.isFrontface()) {
                    return false;
                }
                lcVar.o();
                lcVar.E0.setSelected(true);
                lcVar.f5516s.e(0.85f, 240L, null);
                p80 F = p80.F(lcVar.f5512r, lcVar.f5458a, lcVar.E0);
                f8 f8Var = new f8(activity, 1);
                f8Var.d(lcVar.f5516s.f6195o);
                f8Var.h = new ia(lcVar, 21);
                F.q(f8Var);
                F.o();
                f8 f8Var2 = new f8(activity, 2);
                f8Var2.f5077b = 0.65f;
                f8Var2.f5078c = 1.0f;
                f8Var2.d(lcVar.f5516s.f6196p);
                f8Var2.h = new ia(lcVar, 0);
                F.q(f8Var2);
                F.f29784p = new ha(lcVar, 1);
                F.f29789s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ii.i1) this.f5389b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ii.e2.W((ii.e2) this.f5389b, view);
            case 4:
                ii.r rVar = ((ii.m) this.f5389b).f12561a;
                ii.c4 c4Var = rVar.f12651s;
                org.telegram.ui.ActionBar.e6 e6Var = rVar.f30172a;
                yi yiVar = rVar.f30173b;
                ii.x3 x3Var = rVar.f12650r;
                int i13 = rVar.f12649n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new rg.y0(yiVar.f33228f0, rVar.getContext(), rVar.f12649n, 43, true).show();
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
                            org.telegram.ui.ActionBar.n2 n2Var = yiVar.f33228f0;
                            if (n2Var instanceof zn) {
                                znVar = (zn) n2Var;
                            } else {
                                znVar = null;
                            }
                            dj0 dj0Var = rVar.O;
                            if (dj0Var != null) {
                                dj0Var.h(false);
                                rVar.O = null;
                            }
                            dj0 dj0Var2 = new dj0(rVar.getContext(), e6Var);
                            rVar.O = dj0Var2;
                            dj0Var2.setOnDismissListener(new ai.g5(rVar, 4));
                            long p12 = yiVar.p1();
                            if (znVar != null) {
                                messageObject = znVar.f44868n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f20059id = 0;
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
                                r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var))));
                                dj0 dj0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                z10 = true;
                                dj0Var3.m0 = true;
                                dj0Var3.Y = dp;
                            } else {
                                z10 = true;
                            }
                            p80 F2 = p80.F(rVar, e6Var, sendButton);
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
                ((lg.f) this.f5389b).f15521c.callOnClick();
                return true;
            default:
                qg.m0 m0Var = (qg.m0) this.f5389b;
                int i15 = m0Var.P1;
                if (m0Var.S1 != null) {
                    pg.u0 e12 = pg.u0.e(i15);
                    e12.f45808k = !e12.f45808k;
                    e12.f45800a.edit().putBoolean("fill_shapes", e12.f45808k).apply();
                    boolean z13 = pg.u0.e(i15).f45808k;
                    for (int i16 = 0; i16 < m0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = m0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof qg.l0) {
                            pg.l lVar2 = (pg.l) pg.l.f45680b.get(i16);
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
