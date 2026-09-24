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
import org.telegram.ui.Components.vg;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.y70;
import org.telegram.ui.vi0;
import org.telegram.ui.wn;
public final class m5 implements View.OnLongClickListener {
    public final int f5168a;
    public final Object f5169b;

    public m5(Object obj, int i10) {
        this.f5168a = i10;
        this.f5169b = obj;
    }

    @Override
    public final boolean onLongClick(View view) {
        int e;
        wn wnVar;
        MessageObject messageObject;
        boolean z10;
        int i10;
        int e7;
        switch (this.f5168a) {
            case 0:
                q6 q6Var = (q6) this.f5169b;
                int i11 = q6Var.F1;
                if (q6Var.I1 != null) {
                    pg.u0 e10 = pg.u0.e(i11);
                    e10.f41267k = !e10.f41267k;
                    e10.f41260a.edit().putBoolean("fill_shapes", e10.f41267k).apply();
                    boolean z11 = pg.u0.e(i11).f41267k;
                    for (int i12 = 0; i12 < q6Var.I1.getItemsCount(); i12++) {
                        View childAt = q6Var.I1.L.getChildAt(i12);
                        if (childAt instanceof n6) {
                            pg.l lVar = (pg.l) pg.l.f41148b.get(i12);
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
                lc lcVar = (lc) this.f5169b;
                Activity activity = lcVar.f5029b;
                ob obVar = lcVar.B0;
                if (obVar == null || !obVar.isFrontface()) {
                    return false;
                }
                lcVar.p();
                lcVar.E0.setSelected(true);
                lcVar.f5083s.e(0.85f, 240L, null);
                y70 F = y70.F(lcVar.f5079r, lcVar.f5026a, lcVar.E0);
                f8 f8Var = new f8(activity, 1);
                f8Var.d(lcVar.f5083s.f5818o);
                f8Var.h = new ia(lcVar, 21);
                F.q(f8Var);
                F.o();
                f8 f8Var2 = new f8(activity, 2);
                f8Var2.f4682b = 0.65f;
                f8Var2.f4683c = 1.0f;
                f8Var2.d(lcVar.f5083s.f5819p);
                f8Var2.h = new ia(lcVar, 0);
                F.q(f8Var2);
                F.f30542p = new ha(lcVar, 1);
                F.f30547s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(46.0f), -AndroidUtilities.dp(4.0f));
                F.P(-1155851493);
                F.Z();
                return true;
            case 2:
                if (((ii.i1) this.f5169b).length() != 0) {
                    return true;
                }
                return false;
            case 3:
                return ii.e2.W((ii.e2) this.f5169b, view);
            case 4:
                ii.r rVar = ((ii.m) this.f5169b).f11493a;
                ii.c4 c4Var = rVar.f11573s;
                org.telegram.ui.ActionBar.d6 d6Var = rVar.f27082a;
                wi wiVar = rVar.f27083b;
                ii.x3 x3Var = rVar.f11572r;
                int i13 = rVar.f11571n;
                if (!UserConfig.getInstance(i13).isPremium()) {
                    new rg.x0(wiVar.f29985f0, rVar.getContext(), rVar.f11571n, 43, true).show();
                    return true;
                }
                if (x3Var.k3() && !x3Var.m3()) {
                    if (!x3Var.M3()) {
                        if (c4Var != null) {
                            c4Var.setSendEnabled(x3Var.M3());
                        }
                    } else {
                        ArrayList<TL_iv.PageBlock> Z2 = x3Var.Z2();
                        if (!Z2.isEmpty()) {
                            org.telegram.ui.ActionBar.m2 m2Var = wiVar.f29985f0;
                            if (m2Var instanceof wn) {
                                wnVar = (wn) m2Var;
                            } else {
                                wnVar = null;
                            }
                            vi0 vi0Var = rVar.O;
                            if (vi0Var != null) {
                                vi0Var.h(false);
                                rVar.O = null;
                            }
                            vi0 vi0Var2 = new vi0(rVar.getContext(), d6Var);
                            rVar.O = vi0Var2;
                            vi0Var2.setOnDismissListener(new ai.f5(rVar, 4));
                            long n12 = wiVar.n1();
                            if (wnVar != null) {
                                messageObject = wnVar.f39559n5;
                            } else {
                                messageObject = null;
                            }
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.f18342id = 0;
                            tL_message.out = true;
                            tL_message.peer_id = MessagesController.getInstance(i13).getPeer(n12);
                            tL_message.from_id = MessagesController.getInstance(i13).getPeer(UserConfig.getInstance(i13).getClientUserId());
                            tL_message.flags2 |= 8192;
                            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                            tL_message.rich_message = richMessage;
                            richMessage.blocks = Z2;
                            richMessage.photos = x3Var.B2();
                            tL_message.rich_message.documents = x3Var.y2();
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
                            rVar.O.q(org.telegram.messenger.f0.k(messageObject2));
                            vg sendButton = c4Var.getSendButton();
                            sendButton.setScaleX(1.0f);
                            sendButton.setScaleY(1.0f);
                            vg r10 = rVar.O.r(sendButton, true, new ai.v0(rVar, 27));
                            if (r10 != null) {
                                r10.setBackground(new ii.d2(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(22.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var))));
                                vi0 vi0Var3 = rVar.O;
                                int dp = AndroidUtilities.dp(44.0f);
                                vi0Var3.m0 = true;
                                vi0Var3.Y = dp;
                            }
                            y70 F2 = y70.F(rVar, d6Var, sendButton);
                            if (wnVar != null && UserObject.isUserSelf(wnVar.i())) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (wnVar != null && wnVar.D6()) {
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
                ((lg.f) this.f5169b).f14263c.callOnClick();
                return true;
            default:
                qg.n0 n0Var = (qg.n0) this.f5169b;
                int i15 = n0Var.P1;
                if (n0Var.S1 != null) {
                    pg.u0 e11 = pg.u0.e(i15);
                    e11.f41267k = !e11.f41267k;
                    e11.f41260a.edit().putBoolean("fill_shapes", e11.f41267k).apply();
                    boolean z12 = pg.u0.e(i15).f41267k;
                    for (int i16 = 0; i16 < n0Var.S1.getItemsCount(); i16++) {
                        View childAt2 = n0Var.S1.L.getChildAt(i16);
                        if (childAt2 instanceof qg.m0) {
                            pg.l lVar2 = (pg.l) pg.l.f41148b.get(i16);
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
