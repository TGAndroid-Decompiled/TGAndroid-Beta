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
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.vi;
import org.telegram.ui.bj0;
import org.telegram.ui.bo;
public final class n5 implements View.OnLongClickListener {
    public final int f5066a;
    public final Object f5067b;

    public n5(Object obj, int i10) {
        this.f5066a = i10;
        this.f5067b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        bo boVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        int e7;
        switch (this.f5066a) {
            case 0:
                r6 r6Var = (r6) this.f5067b;
                int i11 = r6Var.F1;
                if (r6Var.I1 != null) {
                    pg.s0 e10 = pg.s0.e(i11);
                    e10.f40999k = !e10.f40999k;
                    e10.f40992a.edit().putBoolean("fill_shapes", e10.f40999k).apply();
                    boolean z11 = pg.s0.e(i11).f40999k;
                    for (int i12 = 0; i12 < r6Var.I1.getItemsCount(); i12++) {
                        View childAt = r6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof o6) {
                            pg.l lVar = (pg.l) pg.l.f40907b.get(i12);
                            if (z11) {
                                e = lVar.m();
                            } else {
                                e = lVar.e();
                            }
                            ((o6) childAt).a(e, z11, true);
                        }
                    }
                }
                return true;
            case 1:
                oc ocVar = (oc) this.f5067b;
                Activity activity = ocVar.f5202b;
                rb rbVar = ocVar.B0;
                if (rbVar == null || !rbVar.isFrontface()) {
                    return false;
                }
                ocVar.p();
                ocVar.E0.setSelected(true);
                ocVar.f5256s.e(0.85f, 240L, null);
                n70 F = n70.F(ocVar.f5252r, ocVar.f5199a, ocVar.E0);
                i8 i8Var = new i8(activity, 1);
                i8Var.d(ocVar.f5256s.f5812o);
                i8Var.h = new la(ocVar, 21);
                F.q(i8Var);
                F.o();
                i8 i8Var2 = new i8(activity, 2);
                i8Var2.f4786b = 0.65f;
                i8Var2.f4787c = 1.0f;
                i8Var2.d(ocVar.f5256s.f5813p);
                i8Var2.h = new la(ocVar, 0);
                F.q(i8Var2);
                F.f26363p = new ka(ocVar, 1);
                F.f26368s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ii.i1) this.f5067b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ii.d2.W((ii.d2) this.f5067b, view);
            case 4:
                ii.r rVar = ((ii.m) this.f5067b).f11493a;
                ii.b4 b4Var = rVar.f11589s;
                org.telegram.ui.ActionBar.e6 e6Var = rVar.f26461a;
                vi viVar = rVar.f26462b;
                ii.w3 w3Var = rVar.f11588r;
                int i13 = rVar.f11587n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new rg.x0(viVar.f28750f0, rVar.getContext(), rVar.f11587n, 43, true).show();
                    return true;
                }
                if (w3Var.k3() && !w3Var.m3()) {
                    if (!w3Var.M3()) {
                        if (b4Var != null) {
                            b4Var.setSendEnabled(w3Var.M3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Z2 = w3Var.Z2();
                        if (!Z2.isEmpty()) {
                            org.telegram.ui.ActionBar.n2 n2Var = viVar.f28750f0;
                            if (n2Var instanceof bo) {
                                boVar = (bo) n2Var;
                            } else {
                                boVar = null;
                            }
                            bj0 bj0Var = rVar.O;
                            if (bj0Var != null) {
                                bj0Var.h(false);
                                rVar.O = null;
                            }
                            bj0 bj0Var2 = new bj0(rVar.getContext(), e6Var);
                            rVar.O = bj0Var2;
                            bj0Var2.setOnDismissListener(new ai.g5(rVar, 4));
                            long n12 = viVar.n1();
                            if (boVar != null) {
                                messageObject = boVar.f32403n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f18133id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Z2;
                            richMessage.photos = w3Var.B2();
                            tL_message.rich_message.documents = w3Var.y2();
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
                            rVar.O.q(org.telegram.messenger.w1.l(messageObject2));
                            tg sendButton = b4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            tg r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                            if (r10 != null) {
                                r10.setBackground(new ii.c2(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, e6Var))));
                                bj0 bj0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                bj0Var3.m0 = true;
                                bj0Var3.Y = dp;
                            }
                            n70 F2 = n70.F(rVar, e6Var, sendButton);
                            if (boVar != null && UserObject.isUserSelf(boVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (boVar != null && boVar.D6()) {
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
                ((lg.f) this.f5067b).f14052c.callOnClick();
                return true;
            default:
                qg.p0 p0Var = (qg.p0) this.f5067b;
                int i15 = p0Var.P1;
                if (p0Var.S1 != null) {
                    pg.s0 e11 = pg.s0.e(i15);
                    e11.f40999k = !e11.f40999k;
                    e11.f40992a.edit().putBoolean("fill_shapes", e11.f40999k).apply();
                    boolean z12 = pg.s0.e(i15).f40999k;
                    for (int i16 = 0; i16 < p0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = p0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof qg.o0) {
                            pg.l lVar2 = (pg.l) pg.l.f40907b.get(i16);
                            if (z12) {
                                e7 = lVar2.m();
                            } else {
                                e7 = lVar2.e();
                            }
                            ((qg.o0) childAt2).a(e7, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
