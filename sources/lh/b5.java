package lh;

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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.hg;
import org.telegram.ui.ni0;
import org.telegram.ui.rn;

public final class b5 implements View.OnLongClickListener {

    public final int f15680a;

    public final Object f15681b;

    public b5(Object obj, int i10) {
        this.f15680a = i10;
        this.f15681b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f15680a) {
            case 0:
                f6 f6Var = (f6) this.f15681b;
                int i10 = f6Var.B1;
                if (f6Var.E1 != null) {
                    yf.r0 r0VarE = yf.r0.e(i10);
                    r0VarE.f50062k = !r0VarE.f50062k;
                    r0VarE.f50054a.edit().putBoolean("fill_shapes", r0VarE.f50062k).apply();
                    boolean z10 = yf.r0.e(i10).f50062k;
                    for (int i11 = 0; i11 < f6Var.E1.getItemsCount(); i11++) {
                        View childAt = f6Var.E1.H.getChildAt(i11);
                        if (childAt instanceof c6) {
                            yf.l lVar = (yf.l) yf.l.f49973b.get(i11);
                            ((c6) childAt).a(z10 ? lVar.m() : lVar.e(), z10, true);
                        }
                    }
                }
                return true;
            case 1:
                sb sbVar = (sb) this.f15681b;
                Activity activity = sbVar.f16745b;
                wa waVar = sbVar.f16818x0;
                if (waVar == null || !waVar.isFrontface()) {
                    return false;
                }
                sbVar.p();
                sbVar.A0.setSelected(true);
                sbVar.f16800s.e(0.85f, 240L, null);
                b70 b70VarF = b70.F(sbVar.f16796r, sbVar.f16742a, sbVar.A0);
                t7 t7Var = new t7(activity, 1);
                t7Var.d(sbVar.f16800s.f16638o);
                t7Var.h = new t9(sbVar, 21);
                b70VarF.q(t7Var);
                b70VarF.o();
                t7 t7Var2 = new t7(activity, 2);
                t7Var2.f16862b = 0.65f;
                t7Var2.f16863c = 1.0f;
                t7Var2.d(sbVar.f16800s.f16639p);
                t7Var2.h = new t9(sbVar, 0);
                b70VarF.q(t7Var2);
                b70VarF.f26987p = new s9(sbVar, 1);
                b70VarF.f26992s = 0;
                b70VarF.V(5);
                b70VarF.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                b70VarF.P(-1155851493);
                b70VarF.Z();
                return true;
            case 2:
                return ((rh.d1) this.f15681b).length() != 0;
            case 3:
                return rh.x1.W((rh.x1) this.f15681b, view);
            case 4:
                rh.p pVar = ((rh.k) this.f15681b).f47228a;
                rh.t3 t3Var = pVar.f47325s;
                org.telegram.ui.ActionBar.c6 c6Var = pVar.f34899a;
                gi giVar = pVar.f34900b;
                rh.p3 p3Var = pVar.f47324r;
                int i12 = pVar.f47323n;
                if (!UserConfig.getInstance(i12).isPremium()) {
                    new ag.g2(giVar.f28635b0, pVar.getContext(), pVar.f47323n, 43, true).show();
                    return true;
                }
                if (p3Var.k3() && !p3Var.m3()) {
                    if (p3Var.M3()) {
                        ArrayList<TL_iv.PageBlock> arrayListZ2 = p3Var.Z2();
                        if (!arrayListZ2.isEmpty()) {
                            org.telegram.ui.ActionBar.n2 n2Var = giVar.f28635b0;
                            rn rnVar = n2Var instanceof rn ? (rn) n2Var : null;
                            ni0 ni0Var = pVar.K;
                            if (ni0Var != null) {
                                ni0Var.h(false);
                                pVar.K = null;
                            }
                            ni0 ni0Var2 = new ni0(pVar.getContext(), c6Var);
                            pVar.K = ni0Var2;
                            ni0Var2.setOnDismissListener(new ag.j0(pVar, 13));
                            long jN1 = giVar.n1();
                            MessageObject messageObject = rnVar != null ? rnVar.f42095j5 : null;
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f22401id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i12).getPeer(jN1);
                            tL_message.from_id = MessagesController.getInstance(i12).getPeer(UserConfig.getInstance(i12).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = arrayListZ2;
                            richMessage.photos = p3Var.B2();
                            tL_message.rich_message.documents = p3Var.y2();
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject2 = new MessageObject(i12, tL_message, false, false);
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject2.replyMessageObject = messageObject;
                            }
                            messageObject2.sendPreview = true;
                            messageObject2.isOutOwnerCached = Boolean.TRUE;
                            messageObject2.generateLayout(null);
                            messageObject2.notime = true;
                            pVar.K.q(org.telegram.messenger.y1.m(messageObject2));
                            hg sendButton = t3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            hg hgVarR = pVar.K.r(sendButton, true, new c5(pVar, 22));
                            if (hgVarR != null) {
                                hgVarR.setBackground(new rh.w1(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var))));
                                ni0 ni0Var3 = pVar.K;
                                int iDp = AndroidUtilities.dp(44.0f);
                                ni0Var3.f40853i0 = true;
                                ni0Var3.U = iDp;
                            }
                            b70 b70VarF2 = b70.F(pVar, c6Var, sendButton);
                            boolean z11 = rnVar != null && UserObject.isUserSelf(rnVar.i());
                            if (rnVar != null && rnVar.D6()) {
                                b70VarF2.c(R.drawable.msg_calendar2, LocaleController.getString(z11 ? R.string.SetReminder : R.string.ScheduleMessage), new org.telegram.ui.web.c0(pVar, jN1, 1), false);
                                if (!z11 && jN1 > 0) {
                                    b70VarF2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new rh.d(pVar, 0), false);
                                }
                            }
                            if (!z11) {
                                b70VarF2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new rh.d(pVar, 1), false);
                            }
                            b70VarF2.Y();
                            pVar.K.p(b70VarF2);
                            pVar.K.show();
                            try {
                                view.performHapticFeedback(3, 2);
                                break;
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                    } else if (t3Var != null) {
                        t3Var.setSendEnabled(p3Var.M3());
                    }
                }
                return false;
            case 5:
                ((uf.e) this.f15681b).f48578c.callOnClick();
                return true;
            default:
                zf.l0 l0Var = (zf.l0) this.f15681b;
                int i13 = l0Var.L1;
                if (l0Var.O1 != null) {
                    yf.r0 r0VarE2 = yf.r0.e(i13);
                    r0VarE2.f50062k = !r0VarE2.f50062k;
                    r0VarE2.f50054a.edit().putBoolean("fill_shapes", r0VarE2.f50062k).apply();
                    boolean z12 = yf.r0.e(i13).f50062k;
                    for (int i14 = 0; i14 < l0Var.O1.getItemsCount(); i14++) {
                        View childAt2 = l0Var.O1.H.getChildAt(i14);
                        if (childAt2 instanceof zf.k0) {
                            yf.l lVar2 = (yf.l) yf.l.f49973b.get(i14);
                            ((zf.k0) childAt2).a(z12 ? lVar2.m() : lVar2.e(), z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
