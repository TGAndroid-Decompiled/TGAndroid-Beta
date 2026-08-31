package eg;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import mh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.mh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xx;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.be;
import org.telegram.ui.ha1;
import org.telegram.ui.ke;
import org.telegram.ui.o51;
import org.telegram.ui.od;
import org.telegram.ui.py;
import org.telegram.ui.q51;
import org.telegram.ui.r61;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.ui1;
import org.telegram.ui.v51;
import org.telegram.ui.wg0;
import org.telegram.ui.xn;
import org.telegram.ui.z31;
public final class k2 implements View.OnClickListener {
    public final int f5321a;
    public final int f5322b;
    public final Object f5323c;
    public final Object d;

    public k2(int i10, View view, AtomicReference atomicReference) {
        this.f5321a = 21;
        this.f5322b = i10;
        this.f5323c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        boolean z4;
        boolean z10;
        boolean z11;
        Integer num;
        View view2;
        int R;
        int i13 = this.f5321a;
        AndroidUtilities.VcardItem vcardItem = null;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i15 = this.f5322b;
        Object obj = this.d;
        Object obj2 = this.f5323c;
        switch (i13) {
            case 0:
                m2 m2Var = (m2) obj2;
                m2Var.a(i15);
                m2Var.f5350b.w().i(i15 - 1, true);
                m2Var.f5350b.g((dg.m) obj);
                return;
            case 1:
                pr0 pr0Var = (pr0) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                np npVar = pr0Var.C;
                npVar.a(!npVar.f29606a.f24809q, true);
                boolean z14 = npVar.f29606a.f24809q;
                qc a02 = qc.a0(p2Var);
                if (z14) {
                    i10 = R.raw.silent_unmute;
                } else {
                    i10 = R.raw.silent_mute;
                }
                if (z14) {
                    i11 = R.string.Gift2ChannelNotifyChecked;
                } else {
                    i11 = R.string.Gift2ChannelNotifyNotChecked;
                }
                a02.P(i10, LocaleController.getString(i11)).j();
                pr0Var.d.h = Boolean.valueOf(z14);
                if (pr0Var.E >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(pr0Var.E, true);
                    pr0Var.E = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(pr0Var.f13100c);
                togglechatstargiftnotifications.enabled = z14;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new b3(3, pr0Var, p2Var));
                return;
            case 2:
                l7 l7Var = (l7) obj2;
                Runnable runnable = (Runnable) obj;
                l7Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(l7Var.f14401g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i16 = l7Var.f14401g;
                int i17 = flag | ((~i14) & i16);
                if (i16 != i17) {
                    l7Var.f14401g = i17;
                    l7Var.i(true);
                }
                runnable.run();
                return;
            case 3:
                af.g.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 4:
                sa saVar = (sa) obj2;
                saVar.f23766e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new qa(saVar, i15, 0));
                return;
            case 5:
                ((za) obj2).a(i15, ((ya) obj).h);
                return;
            case 6:
                ke keVar = (ke) obj2;
                ha1 ha1Var = (ha1) obj;
                be beVar = keVar.N0;
                if (view.isEnabled() && !beVar.K && !keVar.H0.K) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.I0 > currentTime) {
                        keVar.W0 = qc.a0(ha1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, mh.p.j0(keVar.I0 - currentTime)))).j();
                        return;
                    } else if (keVar.U0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        qc.a0(ha1Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new od(keVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        td tdVar = new td(keVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.W = 1;
                        twoStepVerificationActivity.Y = tdVar;
                        beVar.setLoading(true);
                        twoStepVerificationActivity.s0(new ud(keVar, ha1Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 7:
                xn xnVar = (xn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (xnVar.U0 != null && xnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 8:
                xn xnVar2 = (xn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (xnVar2.f43117a5 != null && i15 < arrayList.size()) {
                    xnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 9:
                ((yc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.u2) obj).run();
                return;
            case 10:
                gs gsVar = (gs) obj2;
                x51 x51Var = (x51) obj;
                if (gsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    d2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = gsVar.f27277t0;
                boolean z15 = !z13;
                tL_chatBannedRights.send_media = z15;
                tL_chatBannedRights.send_photos = z15;
                tL_chatBannedRights.send_videos = z15;
                tL_chatBannedRights.send_stickers = z15;
                tL_chatBannedRights.send_gifs = z15;
                tL_chatBannedRights.send_inline = z15;
                tL_chatBannedRights.send_games = z15;
                tL_chatBannedRights.send_audios = z15;
                tL_chatBannedRights.send_docs = z15;
                tL_chatBannedRights.send_voices = z15;
                tL_chatBannedRights.send_roundvideos = z15;
                tL_chatBannedRights.embed_links = z15;
                tL_chatBannedRights.send_polls = z15;
                tL_chatBannedRights.send_reactions = z15;
                gsVar.V();
                x51Var.N(true);
                return;
            case 11:
                p40 p40Var = (p40) obj2;
                p40Var.f29955n = i15;
                p40Var.f29951b.d(view.getLeft(), false);
                p40Var.f29952c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                p40Var.invalidate();
                return;
            case 12:
                ue0 ue0Var = (ue0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ue0Var.f31666n;
                ArrayList arrayList2 = ue0Var.J;
                org.telegram.ui.ActionBar.p2 p2Var2 = ue0Var.f31667r;
                int i18 = ue0Var.C;
                if (i15 >= i18 && i15 < ue0Var.D) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i18);
                } else {
                    int i19 = ue0Var.E;
                    if (i15 >= i19 && i15 < ue0Var.F) {
                        vcardItem = (AndroidUtilities.VcardItem) ue0Var.I.get(i15 - i19);
                    }
                }
                if (vcardItem != null) {
                    if (ue0Var.G) {
                        int i20 = vcardItem.type;
                        if (i20 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                p2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                return;
                            }
                        } else if (i20 == 1) {
                            af.g.s(p2Var2.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i20 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            af.g.s(p2Var2.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(p2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new dg.t1(5, ue0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= ue0Var.C && i15 < ue0Var.D) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList2.size()) {
                                if (((AndroidUtilities.VcardItem) arrayList2.get(i21)).checked) {
                                    z12 = true;
                                } else {
                                    i21++;
                                }
                            }
                        }
                        int themedColor = ue0Var.getThemedColor(k6.Sh);
                        textView.setEnabled(z12);
                        if (!z12) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((se0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 13:
                ht0 ht0Var = (ht0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                zu0 zu0Var = ht0Var.f27587f;
                org.telegram.ui.ActionBar.p2 p2Var3 = zu0Var.f34004s1;
                p2Var3.finishPreviewFragment();
                chat.left = false;
                ht0Var.E(false);
                ht0Var.u(i15);
                if (ht0Var.d.isEmpty()) {
                    zu0Var.v1(true);
                    zu0Var.F();
                }
                p2Var3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-zu0Var.f33979g1));
                p2Var3.getMessagesController().addUserToChat(chat.f20843id, p2Var3.getUserConfig().getCurrentUser(), 0, null, p2Var3, new a90(19, ht0Var, chat));
                return;
            case 14:
                ((k41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 15:
                py.a0((py) obj2, i15, (q70) obj);
                return;
            case 16:
                wg0.Y((wg0) obj2, i15, (q70) obj);
                return;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj;
                if (i15 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zArr[0] = z4;
                for (int i22 = 0; i22 < 2; i22++) {
                    org.telegram.ui.Cells.k6 k6Var = k6VarArr[i22];
                    boolean z16 = zArr[0];
                    if (i22 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z16 == z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    k6Var.f23070c.a(z11, true);
                }
                return;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((z31) saveToGallerySettingsActivity.f34757s.get(i15)).f43805c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f34750a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 19:
                xx xxVar = (xx) obj;
                r61 r61Var = ((q51) obj2).f40351c;
                if (!xxVar.f33191e && !UserConfig.getInstance(r61Var.S).isPremium()) {
                    org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new fg.n1(r61Var.Z0, r61Var.getContext(), r61Var.S, 11, false));
                        return;
                    }
                    return;
                }
                int i23 = 0;
                while (true) {
                    o51 o51Var = r61Var.f40791e0;
                    if (i23 < o51Var.getChildCount()) {
                        if ((o51Var.getChildAt(i23) instanceof v51) && (R = RecyclerView.R((view2 = o51Var.getChildAt(i23)))) >= 0 && r61Var.f40827v0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i23++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    r61Var.i(num.intValue(), view2);
                }
                ov.W(null, xxVar.f33189b, false, null, null);
                r61Var.f40836y0.add(Long.valueOf(xxVar.f33189b.f20870id));
                r61Var.B(true, true, true);
                return;
            case 20:
                qh.d dVar = (qh.d) obj2;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                if (!dVar.K) {
                    c5.j jVar = ui1.d;
                    if (jVar != null && ((byte[]) jVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.f5322b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new mh(dVar, h3Var, i24, view, jVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            default:
                SharedConfig.setSearchEngineType(i15);
                ((o8) ((View) obj2)).u(org.telegram.ui.web.m1.a().f42638a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
        }
    }

    public k2(Object obj, int i10, Object obj2, int i11) {
        this.f5321a = i11;
        this.f5323c = obj;
        this.f5322b = i10;
        this.d = obj2;
    }

    public k2(Object obj, Object obj2, int i10, int i11) {
        this.f5321a = i11;
        this.f5323c = obj;
        this.d = obj2;
        this.f5322b = i10;
    }
}
