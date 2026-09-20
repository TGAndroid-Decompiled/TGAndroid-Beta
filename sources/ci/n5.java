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
import org.telegram.ui.Components.ug;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vi;
import org.telegram.ui.dj0;
import org.telegram.ui.zn;
public final class n5 implements View.OnLongClickListener {
    public final int f5072a;
    public final Object f5073b;

    public n5(Object obj, int i10) {
        this.f5072a = i10;
        this.f5073b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        zn znVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        int e7;
        switch (this.f5072a) {
            case 0:
                r6 r6Var = (r6) this.f5073b;
                int i11 = r6Var.F1;
                if (r6Var.I1 != null) {
                    pg.u0 e10 = pg.u0.e(i11);
                    e10.f41310k = !e10.f41310k;
                    e10.f41303a.edit().putBoolean("fill_shapes", e10.f41310k).apply();
                    boolean z11 = pg.u0.e(i11).f41310k;
                    for (int i12 = 0; i12 < r6Var.I1.getItemsCount(); i12++) {
                        View childAt = r6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof o6) {
                            pg.l lVar = (pg.l) pg.l.f41192b.get(i12);
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
                oc ocVar = (oc) this.f5073b;
                Activity activity = ocVar.f5208b;
                rb rbVar = ocVar.B0;
                if (rbVar == null || !rbVar.isFrontface()) {
                    return false;
                }
                ocVar.p();
                ocVar.E0.setSelected(true);
                ocVar.f5262s.e(0.85f, 240L, null);
                v70 F = v70.F(ocVar.f5258r, ocVar.f5205a, ocVar.E0);
                i8 i8Var = new i8(activity, 1);
                i8Var.d(ocVar.f5262s.f5818o);
                i8Var.h = new la(ocVar, 21);
                F.q(i8Var);
                F.o();
                i8 i8Var2 = new i8(activity, 2);
                i8Var2.f4792b = 0.65f;
                i8Var2.f4793c = 1.0f;
                i8Var2.d(ocVar.f5262s.f5819p);
                i8Var2.h = new la(ocVar, 0);
                F.q(i8Var2);
                F.f28989p = new ka(ocVar, 1);
                F.f28994s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ii.i1) this.f5073b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ii.d2.W((ii.d2) this.f5073b, view);
            case 4:
                ii.r rVar = ((ii.m) this.f5073b).f11497a;
                ii.b4 b4Var = rVar.f11593s;
                org.telegram.ui.ActionBar.f6 f6Var = rVar.f26654a;
                vi viVar = rVar.f26655b;
                ii.w3 w3Var = rVar.f11592r;
                int i13 = rVar.f11591n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new rg.x0(viVar.f29098f0, rVar.getContext(), rVar.f11591n, 43, true).show();
                    return true;
                }
                if (w3Var.l3() && !w3Var.n3()) {
                    if (!w3Var.N3()) {
                        if (b4Var != null) {
                            b4Var.setSendEnabled(w3Var.N3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> a32 = w3Var.a3();
                        if (!a32.isEmpty()) {
                            org.telegram.ui.ActionBar.n2 n2Var = viVar.f29098f0;
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
                            dj0 dj0Var2 = new dj0(rVar.getContext(), f6Var);
                            rVar.O = dj0Var2;
                            dj0Var2.setOnDismissListener(new ai.g5(rVar, 4));
                            long n12 = viVar.n1();
                            if (znVar != null) {
                                messageObject = znVar.f40409n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f18349id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = a32;
                            richMessage.photos = w3Var.C2();
                            tL_message.rich_message.documents = w3Var.z2();
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
                            ug sendButton = b4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            ug r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                            if (r10 != null) {
                                r10.setBackground(new ii.c2(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var))));
                                dj0 dj0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                dj0Var3.m0 = true;
                                dj0Var3.Y = dp;
                            }
                            v70 F2 = v70.F(rVar, f6Var, sendButton);
                            if (znVar != null && UserObject.isUserSelf(znVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (znVar != null && znVar.D6()) {
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
                ((lg.f) this.f5073b).f14247c.callOnClick();
                return true;
            default:
                qg.n0 n0Var = (qg.n0) this.f5073b;
                int i15 = n0Var.P1;
                if (n0Var.S1 != null) {
                    pg.u0 e11 = pg.u0.e(i15);
                    e11.f41310k = !e11.f41310k;
                    e11.f41303a.edit().putBoolean("fill_shapes", e11.f41310k).apply();
                    boolean z12 = pg.u0.e(i15).f41310k;
                    for (int i16 = 0; i16 < n0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = n0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof qg.m0) {
                            pg.l lVar2 = (pg.l) pg.l.f41192b.get(i16);
                            if (z12) {
                                e7 = lVar2.m();
                            } else {
                                e7 = lVar2.e();
                            }
                            ((qg.m0) childAt2).a(e7, z12, true);
                        }
                    }
                }
                return true;
        }
    }
}
