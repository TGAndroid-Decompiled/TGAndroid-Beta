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
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wg;
import org.telegram.ui.fo;
import org.telegram.ui.hj0;
public final class l5 implements View.OnLongClickListener {
    public final int f7351a;
    public final Object f7352b;

    public l5(Object obj, int i10) {
        this.f7351a = i10;
        this.f7352b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        fo foVar;
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        int i10;
        int e7;
        switch (this.f7351a) {
            case 0:
                o6 o6Var = (o6) this.f7352b;
                int i11 = o6Var.F1;
                if (o6Var.I1 != null) {
                    qg.s0 e10 = qg.s0.e(i11);
                    e10.f43572k = !e10.f43572k;
                    e10.f43565a.edit().putBoolean("fill_shapes", e10.f43572k).apply();
                    boolean z12 = qg.s0.e(i11).f43572k;
                    for (int i12 = 0; i12 < o6Var.I1.getItemsCount(); i12++) {
                        View childAt = o6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof l6) {
                            qg.l lVar = (qg.l) qg.l.f43480b.get(i12);
                            if (z12) {
                                e = lVar.m();
                            } else {
                                e = lVar.e();
                            }
                            ((l6) childAt).a(e, z12, true);
                        }
                    }
                }
                return true;
            case 1:
                kc kcVar = (kc) this.f7352b;
                Activity activity = kcVar.f7237b;
                nb nbVar = kcVar.B0;
                if (nbVar == null || !nbVar.isFrontface()) {
                    return false;
                }
                kcVar.o();
                kcVar.E0.setSelected(true);
                kcVar.f7291s.e(0.85f, 240L, null);
                m80 F = m80.F(kcVar.f7287r, kcVar.f7234a, kcVar.E0);
                e8 e8Var = new e8(activity, 1);
                e8Var.d(kcVar.f7291s.f8038o);
                e8Var.h = new ha(kcVar, 21);
                F.q(e8Var);
                F.o();
                e8 e8Var2 = new e8(activity, 2);
                e8Var2.f6899b = 0.65f;
                e8Var2.f6900c = 1.0f;
                e8Var2.d(kcVar.f7291s.f8039p);
                e8Var2.h = new ha(kcVar, 0);
                F.q(e8Var2);
                F.f27293p = new ga(kcVar, 1);
                F.f27298s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ji.h1) this.f7352b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ji.d2.W((ji.d2) this.f7352b, view);
            case 4:
                ji.r rVar = ((ji.m) this.f7352b).f13395a;
                ji.c4 c4Var = rVar.f13484s;
                org.telegram.ui.ActionBar.c6 c6Var = rVar.f27670a;
                vi viVar = rVar.f27671b;
                ji.x3 x3Var = rVar.f13483r;
                int i13 = rVar.f13482n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new sg.y0(viVar.f30001f0, rVar.getContext(), rVar.f13482n, 43, true).show();
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
                            org.telegram.ui.ActionBar.m2 m2Var = viVar.f30001f0;
                            if (m2Var instanceof fo) {
                                foVar = (fo) m2Var;
                            } else {
                                foVar = null;
                            }
                            hj0 hj0Var = rVar.O;
                            if (hj0Var != null) {
                                hj0Var.h(false);
                                rVar.O = null;
                            }
                            hj0 hj0Var2 = new hj0(rVar.getContext(), c6Var);
                            rVar.O = hj0Var2;
                            hj0Var2.setOnDismissListener(new bi.t4(rVar, 4));
                            long p12 = viVar.p1();
                            if (foVar != null) {
                                messageObject = foVar.f36038n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f19237id = 0;
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
                            rVar.O.q(org.telegram.messenger.q.l(messageObject2));
                            wg sendButton = c4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            wg r10 = rVar.O.r(sendButton, true, new ah.g0(rVar, 28));
                            if (r10 != null) {
                                r10.setBackground(new ji.c2(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var))));
                                hj0 hj0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                z10 = true;
                                hj0Var3.m0 = true;
                                hj0Var3.Y = dp;
                            } else {
                                z10 = true;
                            }
                            m80 F2 = m80.F(rVar, c6Var, sendButton);
                            if (foVar != null && UserObject.isUserSelf(foVar.i())) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            if (foVar != null && foVar.G6()) {
                                int i14 = R.drawable.msg_calendar2;
                                if (z11) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i14, LocaleController.getString(i10), new bi.g(rVar, p12, 11), false);
                                if (!z11 && p12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new ji.d(rVar, 0), false);
                                }
                            }
                            if (!z11) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new ji.d(rVar, 1), false);
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
                ((mg.f) this.f7352b).f15779c.callOnClick();
                return true;
            default:
                rg.o0 o0Var = (rg.o0) this.f7352b;
                int i15 = o0Var.P1;
                if (o0Var.S1 != null) {
                    qg.s0 e11 = qg.s0.e(i15);
                    e11.f43572k = !e11.f43572k;
                    e11.f43565a.edit().putBoolean("fill_shapes", e11.f43572k).apply();
                    boolean z13 = qg.s0.e(i15).f43572k;
                    for (int i16 = 0; i16 < o0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = o0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof rg.n0) {
                            qg.l lVar2 = (qg.l) qg.l.f43480b.get(i16);
                            if (z13) {
                                e7 = lVar2.m();
                            } else {
                                e7 = lVar2.e();
                            }
                            ((rg.n0) childAt2).a(e7, z13, true);
                        }
                    }
                }
                return true;
        }
    }
}
