package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.eh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.cy;
import org.telegram.ui.f31;
import org.telegram.ui.m71;
import org.telegram.ui.ng0;
import org.telegram.ui.p91;
import org.telegram.ui.qn;
import org.telegram.ui.u41;
import org.telegram.ui.w41;
import org.telegram.ui.x51;
import org.telegram.ui.yh1;
public final class ha implements View.OnClickListener {
    public final int f1433a;
    public final int f1434b;
    public final Object f1435c;
    public final Object d;

    public ha(int i10, View view, AtomicReference atomicReference) {
        this.f1433a = 20;
        this.f1434b = i10;
        this.f1435c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int R;
        int i10;
        int i11;
        int i12;
        int i13 = this.f1433a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f1434b;
        Object obj = this.d;
        Object obj2 = this.f1435c;
        switch (i13) {
            case 0:
                pf.d.r((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 1:
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) obj2;
                saVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ei.e4(saVar, i15, 3));
                return;
            case 2:
                ((org.telegram.ui.Cells.ab) obj2).a(i15, ((org.telegram.ui.Cells.za) obj).h);
                return;
            case 3:
                org.telegram.ui.ie ieVar = (org.telegram.ui.ie) obj2;
                p91 p91Var = (p91) obj;
                org.telegram.ui.zd zdVar = ieVar.Q0;
                if (view.isEnabled() && !zdVar.N && !ieVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (ieVar.L0 > currentTime) {
                        ieVar.Z0 = org.telegram.ui.Components.xc.a0(p91Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, x.j0(ieVar.L0 - currentTime)))).j();
                        return;
                    } else if (ieVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        org.telegram.ui.Components.xc.a0(p91Var).L(ieVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new org.telegram.ui.nd(ieVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.sd sdVar = new org.telegram.ui.sd(ieVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f33932b0 = sdVar;
                        zdVar.setLoading(true);
                        twoStepVerificationActivity.s0(new org.telegram.ui.td(ieVar, p91Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 4:
                qn qnVar = (qn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (qnVar.X0 != null && qnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 5:
                qn qnVar2 = (qn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (qnVar2.f40651d5 != null && i15 < arrayList.size()) {
                    qnVar2.Fa(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 6:
                ((od0) obj2).setValue(i15);
                ((org.telegram.ui.Components.y2) obj).run();
                return;
            case 7:
                al alVar = (al) obj2;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj;
                i80 F = i80.F(alVar, d6Var, alVar.f24624x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new org.telegram.ui.i4(alVar, i15, d6Var, 5), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new uk(alVar, 0), false);
                F.f27134s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 8:
                ps psVar = (ps) obj2;
                t61 t61Var = (t61) obj;
                if (psVar.T()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20602a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = psVar.f29395w0;
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
                psVar.W();
                t61Var.N(true);
                return;
            case 9:
                u40 u40Var = (u40) obj2;
                u40Var.f30884n = i15;
                u40Var.f30881b.d(view.getLeft(), false);
                u40Var.f30882c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                u40Var.invalidate();
                return;
            case 10:
                if0 if0Var = (if0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = if0Var.f27237n;
                ArrayList arrayList2 = if0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = if0Var.f27238r;
                int i16 = if0Var.F;
                if (i15 >= i16 && i15 < if0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = if0Var.H;
                    if (i15 >= i17 && i15 < if0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) if0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (if0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                n2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i18 == 1) {
                            pf.d.r(n2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            pf.d.r(n2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(5, if0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= if0Var.F && i15 < if0Var.G) {
                        int i19 = 0;
                        while (true) {
                            if (i19 < arrayList2.size()) {
                                if (((AndroidUtilities.VcardItem) arrayList2.get(i19)).checked) {
                                    z14 = true;
                                } else {
                                    i19++;
                                }
                            }
                        }
                        int themedColor = if0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Sh);
                        textView.setEnabled(z14);
                        if (!z14) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((gf0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 11:
                cu0 cu0Var = (cu0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                tv0 tv0Var = cu0Var.f25344f;
                org.telegram.ui.ActionBar.n2 n2Var2 = tv0Var.f30732v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                cu0Var.E(false);
                cu0Var.u(i15);
                if (cu0Var.d.isEmpty()) {
                    tv0Var.y1(true);
                    tv0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-tv0Var.f30707j1));
                n2Var2.getMessagesController().addUserToChat(chat.f20273id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new go0(8, cu0Var, chat));
                return;
            case 12:
                ((g51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 13:
                cy.v0((cy) obj2, i15, (i80) obj);
                return;
            case 14:
                ng0.Y((ng0) obj2, i15, (i80) obj);
                return;
            case 15:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i20 = 0; i20 < 2; i20++) {
                    org.telegram.ui.Cells.k6 k6Var = k6VarArr[i20];
                    boolean z16 = zArr[0];
                    if (i20 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z16 == z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    k6Var.f22507c.a(z12, true);
                }
                return;
            case 16:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((f31) saveToGallerySettingsActivity.f33775s.get(i15)).f36881c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f33769a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 17:
                fy fyVar = (fy) obj;
                x51 x51Var = ((w41) obj2).f42464c;
                if (!fyVar.e && !UserConfig.getInstance(x51Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new sg.y0(x51Var.f43045c1, x51Var.getContext(), x51Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    u41 u41Var = x51Var.f43055h0;
                    if (i21 < u41Var.getChildCount()) {
                        if ((u41Var.getChildAt(i21) instanceof b51) && (R = RecyclerView.R((view2 = u41Var.getChildAt(i21)))) >= 0 && x51Var.f43093y0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i21++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    x51Var.i(num.intValue(), view2);
                }
                aw.X(null, fyVar.f26394b, false, null, null);
                x51Var.B0.add(Long.valueOf(fyVar.f26394b.f20300id));
                x51Var.B(true, true, true);
                return;
            case 18:
                ((org.telegram.ui.Wallet.l) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.j5) obj2).setSelected(i15);
                return;
            case 19:
                ei.d dVar = (ei.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    com.google.android.gms.internal.cast.z5 z5Var = yh1.d;
                    if (z5Var != null && ((byte[]) z5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f1434b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new eh(dVar, f3Var, i22, view, z5Var));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 20:
                SharedConfig.setSearchEngineType(i15);
                ((org.telegram.ui.Cells.q8) ((View) obj2)).u(org.telegram.ui.web.m1.a().f42719a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 21:
                rg.r1 r1Var = (rg.r1) obj2;
                r1Var.a(i15);
                r1Var.f45615b.x().i(i15 - 1, true);
                r1Var.f45615b.o((qg.m) obj);
                return;
            case 22:
                js0 js0Var = (js0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                xp xpVar = js0Var.F;
                xpVar.a(!xpVar.f32430a.f24148q, true);
                boolean z17 = xpVar.f32430a.f24148q;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var3);
                if (z17) {
                    i10 = R.raw.silent_unmute;
                } else {
                    i10 = R.raw.silent_mute;
                }
                if (z17) {
                    i11 = R.string.Gift2ChannelNotifyChecked;
                } else {
                    i11 = R.string.Gift2ChannelNotifyNotChecked;
                }
                a02.P(i10, LocaleController.getString(i11)).j();
                js0Var.d.h = Boolean.valueOf(z17);
                if (js0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(js0Var.H, true);
                    js0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(js0Var.f50460c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new m71(11, js0Var, n2Var3));
                return;
            default:
                y9 y9Var = (y9) obj2;
                Runnable runnable = (Runnable) obj;
                y9Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(y9Var.f2500g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = y9Var.f2500g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    y9Var.f2500g = i24;
                    y9Var.j(true);
                }
                runnable.run();
                return;
        }
    }

    public ha(Object obj, int i10, Object obj2, int i11) {
        this.f1433a = i11;
        this.f1435c = obj;
        this.f1434b = i10;
        this.d = obj2;
    }

    public ha(Object obj, Object obj2, int i10, int i11) {
        this.f1433a = i11;
        this.f1435c = obj;
        this.d = obj2;
        this.f1434b = i10;
    }
}
