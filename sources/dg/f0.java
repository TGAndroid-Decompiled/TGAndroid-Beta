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
import org.telegram.ui.Components.p70;
import org.telegram.ui.ui0;
import org.telegram.ui.zn;
import ph.a5;
import ph.c5;
import ph.da;
import ph.g8;
import ph.h8;
import ph.i9;
import ph.n6;
public final class f0 implements View.OnLongClickListener {
    public final int f4508a;
    public final Object f4509b;

    public f0(Object obj, int i10) {
        this.f4508a = i10;
        this.f4509b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        int e6;
        zn znVar;
        MessageObject messageObject;
        boolean z4;
        int i10;
        switch (this.f4508a) {
            case 0:
                e1 e1Var = (e1) this.f4509b;
                int i11 = e1Var.M1;
                if (e1Var.P1 != null) {
                    cg.f1 e10 = cg.f1.e(i11);
                    e10.f2382k = !e10.f2382k;
                    e10.f2375a.edit().putBoolean("fill_shapes", e10.f2382k).apply();
                    boolean z10 = cg.f1.e(i11).f2382k;
                    for (int i12 = 0; i12 < e1Var.P1.getItemsCount(); i12++) {
                        View childAt = e1Var.P1.I.getChildAt(i12);
                        if (childAt instanceof c1) {
                            cg.l lVar = (cg.l) cg.l.f2425b.get(i12);
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
                c5 c5Var = (c5) this.f4509b;
                int i13 = c5Var.C1;
                if (c5Var.F1 != null) {
                    cg.f1 e11 = cg.f1.e(i13);
                    e11.f2382k = !e11.f2382k;
                    e11.f2375a.edit().putBoolean("fill_shapes", e11.f2382k).apply();
                    boolean z11 = cg.f1.e(i13).f2382k;
                    for (int i14 = 0; i14 < c5Var.F1.getItemsCount(); i14++) {
                        View childAt2 = c5Var.F1.I.getChildAt(i14);
                        if (childAt2 instanceof a5) {
                            cg.l lVar2 = (cg.l) cg.l.f2425b.get(i14);
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
                da daVar = (da) this.f4509b;
                Activity activity = daVar.f41513b;
                i9 i9Var = daVar.f41589y0;
                if (i9Var == null || !i9Var.isFrontface()) {
                    return false;
                }
                daVar.p();
                daVar.B0.setSelected(true);
                daVar.f41567s.e(0.85f, 240L, null);
                p70 F = p70.F(daVar.f41563r, daVar.f41510a, daVar.B0);
                n6 n6Var = new n6(activity, 1);
                n6Var.d(daVar.f41567s.f41482o);
                n6Var.h = new h8(daVar, 21);
                F.q(n6Var);
                F.o();
                n6 n6Var2 = new n6(activity, 2);
                n6Var2.f42053b = 0.65f;
                n6Var2.f42054c = 1.0f;
                n6Var2.d(daVar.f41567s.f41483p);
                n6Var2.h = new h8(daVar, 0);
                F.q(n6Var2);
                F.f27772p = new g8(daVar, 1);
                F.f27777s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 3:
                if (((vh.e1) this.f4509b).length() != 0) {
                    return true;
                }
                return false;
            case 4:
                return vh.y1.W((vh.y1) this.f4509b, view);
            case 5:
                vh.q qVar = ((vh.l) this.f4509b).f46058a;
                vh.w3 w3Var = qVar.f46157s;
                f6 f6Var = qVar.f24281a;
                li liVar = qVar.f24282b;
                vh.s3 s3Var = qVar.f46156r;
                int i15 = qVar.f46155n;
                if (!UserConfig.getInstance(i15).isPremium()) {
                    new eg.o1(liVar.f26685c0, qVar.getContext(), qVar.f46155n, 43, true).show();
                    return true;
                }
                if (s3Var.j3() && !s3Var.l3()) {
                    if (!s3Var.L3()) {
                        if (w3Var != null) {
                            w3Var.setSendEnabled(s3Var.L3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Y2 = s3Var.Y2();
                        if (!Y2.isEmpty()) {
                            org.telegram.ui.ActionBar.p2 p2Var = liVar.f26685c0;
                            if (p2Var instanceof zn) {
                                znVar = (zn) p2Var;
                            } else {
                                znVar = null;
                            }
                            ui0 ui0Var = qVar.L;
                            if (ui0Var != null) {
                                ui0Var.h(false);
                                qVar.L = null;
                            }
                            ui0 ui0Var2 = new ui0(qVar.getContext(), f6Var);
                            qVar.L = ui0Var2;
                            ui0Var2.setOnDismissListener(new eg.d0(qVar, 13));
                            long n12 = liVar.n1();
                            if (znVar != null) {
                                messageObject = znVar.f40642k5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f19180id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i15).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i15).getPeer(UserConfig.getInstance(i15).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Y2;
                            richMessage.photos = s3Var.A2();
                            tL_message.rich_message.documents = s3Var.x2();
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
                            qVar.L.q(org.telegram.messenger.y3.m(messageObject2));
                            lg sendButton = w3Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            lg r10 = qVar.L.r(sendButton, true, new oh.n(qVar, 26));
                            if (r10 != null) {
                                r10.setBackground(new vh.x1(j6.b0(AndroidUtilities.dp(22.0f), j6.v0(j6.Oh, f6Var))));
                                ui0 ui0Var3 = qVar.L;
                                int dp = AndroidUtilities.dp(44.0f);
                                ui0Var3.f38838j0 = true;
                                ui0Var3.V = dp;
                            }
                            p70 F2 = p70.F(qVar, f6Var, sendButton);
                            if (znVar != null && UserObject.isUserSelf(znVar.i())) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (znVar != null && znVar.D6()) {
                                int i16 = R.drawable.msg_calendar2;
                                if (z4) {
                                    i10 = R.string.SetReminder;
                                } else {
                                    i10 = R.string.ScheduleMessage;
                                }
                                F2.c(i16, LocaleController.getString(i10), new vh.d(qVar, n12, 0), false);
                                if (!z4 && n12 > 0) {
                                    F2.c(R.drawable.msg_online, LocaleController.getString(R.string.SendWhenOnline), new vh.e(qVar, 0), false);
                                }
                            }
                            if (!z4) {
                                F2.c(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new vh.e(qVar, 1), false);
                            }
                            F2.Y();
                            qVar.L.p(F2);
                            qVar.L.show();
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
                ((yf.e) this.f4509b).f47268c.callOnClick();
                return true;
        }
    }
}
