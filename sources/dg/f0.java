package dg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.lg;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.o70;
import org.telegram.ui.si0;
import org.telegram.ui.xn;
import ph.a5;
import ph.c5;
import ph.da;
import ph.h8;
import ph.i8;
import ph.i9;
import ph.o6;
public final class f0 implements View.OnLongClickListener {
    public final int f4502a;
    public final Object f4503b;

    public f0(Object obj, int i10) {
        this.f4502a = i10;
        this.f4503b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        int e6;
        xn xnVar;
        MessageObject messageObject;
        boolean z4;
        int i10;
        switch (this.f4502a) {
            case 0:
                e1 e1Var = (e1) this.f4503b;
                int i11 = e1Var.M1;
                if (e1Var.P1 != null) {
                    cg.f1 e10 = cg.f1.e(i11);
                    e10.f2399k = !e10.f2399k;
                    e10.f2392a.edit().putBoolean("fill_shapes", e10.f2399k).apply();
                    boolean z10 = cg.f1.e(i11).f2399k;
                    for (int i12 = 0; i12 < e1Var.P1.getItemsCount(); i12++) {
                        View childAt = e1Var.P1.I.getChildAt(i12);
                        if (childAt instanceof c1) {
                            cg.l lVar = (cg.l) cg.l.f2442b.get(i12);
                            if (z10) {
                                e = lVar.m();
                            } else {
                                e = lVar.e();
                            }
                            ((c1) childAt).a(e, z10, true);
                        }
                    }
                }
                return true;
            case 1:
                c5 c5Var = (c5) this.f4503b;
                int i13 = c5Var.C1;
                if (c5Var.F1 != null) {
                    cg.f1 e11 = cg.f1.e(i13);
                    e11.f2399k = !e11.f2399k;
                    e11.f2392a.edit().putBoolean("fill_shapes", e11.f2399k).apply();
                    boolean z11 = cg.f1.e(i13).f2399k;
                    for (int i14 = 0; i14 < c5Var.F1.getItemsCount(); i14++) {
                        View childAt2 = c5Var.F1.I.getChildAt(i14);
                        if (childAt2 instanceof a5) {
                            cg.l lVar2 = (cg.l) cg.l.f2442b.get(i14);
                            if (z11) {
                                e6 = lVar2.m();
                            } else {
                                e6 = lVar2.e();
                            }
                            ((a5) childAt2).a(e6, z11, true);
                        }
                    }
                }
                return true;
            case 2:
                da daVar = (da) this.f4503b;
                Activity activity = daVar.f41475b;
                i9 i9Var = daVar.f41551y0;
                if (i9Var == null || !i9Var.isFrontface()) {
                    return false;
                }
                daVar.p();
                daVar.B0.setSelected(true);
                daVar.f41529s.e(0.85f, 240L, null);
                o70 F = o70.F(daVar.f41525r, daVar.f41472a, daVar.B0);
                o6 o6Var = new o6(activity, 1);
                o6Var.d(daVar.f41529s.f41432o);
                o6Var.h = new i8(daVar, 21);
                F.q(o6Var);
                F.o();
                o6 o6Var2 = new o6(activity, 2);
                o6Var2.f42055b = 0.65f;
                o6Var2.f42056c = 1.0f;
                o6Var2.d(daVar.f41529s.f41433p);
                o6Var2.h = new i8(daVar, 0);
                F.q(o6Var2);
                F.f27484p = new h8(daVar, 1);
                F.f27489s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 3:
                if (((vh.d1) this.f4503b).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return vh.y1.W((vh.y1) this.f4503b, view);
            case 5:
                vh.p pVar = ((vh.k) this.f4503b).f45961a;
                vh.v3 v3Var = pVar.f46060s;
                f6 f6Var = pVar.f24277a;
                li liVar = pVar.f24278b;
                vh.r3 r3Var = pVar.f46059r;
                int i15 = pVar.f46058n;
                if (!UserConfig.getInstance(i15).isPremium()) {
                    new eg.o1(liVar.f26689c0, pVar.getContext(), pVar.f46058n, 43, true).show();
                    return true;
                }
                if (r3Var.k3() && !r3Var.m3()) {
                    if (!r3Var.M3()) {
                        if (v3Var != null) {
                            v3Var.setSendEnabled(r3Var.M3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Z2 = r3Var.Z2();
                        if (!Z2.isEmpty()) {
                            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26689c0;
                            if (p2Var instanceof xn) {
                                xnVar = (xn) p2Var;
                            } else {
                                xnVar = null;
                            }
                            si0 si0Var = pVar.L;
                            if (si0Var != null) {
                                si0Var.h(false);
                                pVar.L = null;
                            }
                            si0 si0Var2 = new si0(pVar.getContext(), f6Var);
                            pVar.L = si0Var2;
                            si0Var2.setOnDismissListener(new eg.d0(pVar, 13));
                            long n12 = liVar.n1();
                            if (xnVar != null) {
                                messageObject = xnVar.f40076k5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f19205id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i15).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i15).getPeer(UserConfig.getInstance(i15).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Z2;
                            richMessage.photos = r3Var.B2();
                            tL_message.rich_message.documents = r3Var.y2();
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                tL_messageReplyHeader.flags |= 16;
                                tL_messageReplyHeader.reply_to_msg_id = messageObject.getId();
                                tL_message.reply_to = tL_messageReplyHeader;
                            }
                            MessageObject messageObject2 = new MessageObject(i15, tL_message, false, false);
                            if (messageObject != null && !messageObject.isTopicMainMessage) {
                                messageObject2.replyMessageObject = messageObject;
                            }
                            messageObject2.sendPreview = true;
                            messageObject2.isOutOwnerCached = Boolean.TRUE;
                            messageObject2.generateLayout(null);
                            messageObject2.notime = true;
                            pVar.L.q(org.telegram.messenger.y3.m(messageObject2));
                            lg sendButton = v3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            lg r10 = pVar.L.r(sendButton, true, new oh.n(pVar, 26));
                            if (r10 != null) {
                                r10.setBackground(new vh.x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(j6.Oh, f6Var))));
                                si0 si0Var3 = pVar.L;
                                int dp = AndroidUtilities.dp(44.0f);
                                si0Var3.f38363j0 = true;
                                si0Var3.V = dp;
                            }
                            o70 F2 = o70.F(pVar, f6Var, sendButton);
                            if (xnVar != null && UserObject.isUserSelf(xnVar.i())) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (xnVar != null && xnVar.D6()) {
                                int i16 = R.drawable.msg_calendar2;
                                if (z4) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i16, LocaleController.getString(i10), new sh.m0(pVar, n12, 1), false);
                                if (!z4 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new vh.d(pVar, 0), false);
                                }
                            }
                            if (!z4) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new vh.d(pVar, 1), false);
                            }
                            F2.Y();
                            pVar.L.p(F2);
                            pVar.L.show();
                            try {
                                view.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            return true;
                        }
                    }
                }
                return false;
            default:
                ((yf.e) this.f4503b).f47204c.callOnClick();
                return true;
        }
    }
}
