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
import org.telegram.messenger.fh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.d51;
import org.telegram.ui.ey;
import org.telegram.ui.g31;
import org.telegram.ui.o71;
import org.telegram.ui.og0;
import org.telegram.ui.r91;
import org.telegram.ui.sn;
import org.telegram.ui.w41;
import org.telegram.ui.y41;
import org.telegram.ui.z51;
public final class ha implements View.OnClickListener {
    public final int f1425a;
    public final int f1426b;
    public final Object f1427c;
    public final Object d;

    public ha(int i10, View view, AtomicReference atomicReference) {
        this.f1425a = 20;
        this.f1426b = i10;
        this.f1427c = view;
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
        int i13 = this.f1425a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f1426b;
        Object obj = this.d;
        Object obj2 = this.f1427c;
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
                org.telegram.ui.ke keVar = (org.telegram.ui.ke) obj2;
                r91 r91Var = (r91) obj;
                org.telegram.ui.be beVar = keVar.Q0;
                if (view.isEnabled() && !beVar.N && !keVar.K0.N) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.L0 > currentTime) {
                        keVar.Z0 = org.telegram.ui.Components.xc.a0(r91Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, x.j0(keVar.L0 - currentTime)))).j();
                        return;
                    } else if (keVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        org.telegram.ui.Components.xc.a0(r91Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new org.telegram.ui.pd(keVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.ud udVar = new org.telegram.ui.ud(keVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f33924b0 = udVar;
                        beVar.setLoading(true);
                        twoStepVerificationActivity.s0(new org.telegram.ui.vd(keVar, r91Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 4:
                sn snVar = (sn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (snVar.X0 != null && snVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 5:
                sn snVar2 = (sn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (snVar2.f41175d5 != null && i15 < arrayList.size()) {
                    snVar2.Fa(((Integer) arrayList.get(i15)).intValue());
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
                i80 F = i80.F(alVar, d6Var, alVar.f24644x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new org.telegram.ui.i4(alVar, i15, d6Var, 5), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new uk(alVar, 0), false);
                F.f27134s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 8:
                ps psVar = (ps) obj2;
                s61 s61Var = (s61) obj;
                if (psVar.T()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.R = string;
                    b2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = psVar.f29424w0;
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
                s61Var.N(true);
                return;
            case 9:
                u40 u40Var = (u40) obj2;
                u40Var.f30882n = i15;
                u40Var.f30879b.d(view.getLeft(), false);
                u40Var.f30880c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                u40Var.invalidate();
                return;
            case 10:
                if0 if0Var = (if0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = if0Var.f27222n;
                ArrayList arrayList2 = if0Var.M;
                org.telegram.ui.ActionBar.n2 n2Var = if0Var.f27223r;
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
                bu0 bu0Var = (bu0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                sv0 sv0Var = bu0Var.f25047f;
                org.telegram.ui.ActionBar.n2 n2Var2 = sv0Var.f30388v1;
                n2Var2.finishPreviewFragment();
                chat.left = false;
                bu0Var.E(false);
                bu0Var.u(i15);
                if (bu0Var.d.isEmpty()) {
                    sv0Var.y1(true);
                    sv0Var.F();
                }
                n2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-sv0Var.f30363j1));
                n2Var2.getMessagesController().addUserToChat(chat.f20272id, n2Var2.getUserConfig().getCurrentUser(), 0, null, n2Var2, new go0(8, bu0Var, chat));
                return;
            case 12:
                ((f51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 13:
                ey.v0((ey) obj2, i15, (i80) obj);
                return;
            case 14:
                og0.Y((og0) obj2, i15, (i80) obj);
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
                    k6Var.f22506c.a(z12, true);
                }
                return;
            case 16:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((g31) saveToGallerySettingsActivity.f33767s.get(i15)).f37059c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f33761a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 17:
                fy fyVar = (fy) obj;
                z51 z51Var = ((y41) obj2).f43310c;
                if (!fyVar.e && !UserConfig.getInstance(z51Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new sg.y0(z51Var.f43576c1, z51Var.getContext(), z51Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    w41 w41Var = z51Var.f43586h0;
                    if (i21 < w41Var.getChildCount()) {
                        if ((w41Var.getChildAt(i21) instanceof d51) && (R = RecyclerView.R((view2 = w41Var.getChildAt(i21)))) >= 0 && z51Var.f43624y0.get(R) == i15) {
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
                    z51Var.i(num.intValue(), view2);
                }
                aw.X(null, fyVar.f26404b, false, null, null);
                z51Var.B0.add(Long.valueOf(fyVar.f26404b.f20299id));
                z51Var.B(true, true, true);
                return;
            case 18:
                ((org.telegram.ui.Wallet.l) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.i5) obj2).setSelected(i15);
                return;
            case 19:
                ei.d dVar = (ei.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.N) {
                    com.google.android.gms.internal.cast.z5 z5Var = ai1.d;
                    if (z5Var != null && ((byte[]) z5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f1426b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new fh(dVar, f3Var, i22, view, z5Var));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 20:
                SharedConfig.setSearchEngineType(i15);
                ((org.telegram.ui.Cells.q8) ((View) obj2)).u(org.telegram.ui.web.n1.a().f42680a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 21:
                rg.r1 r1Var = (rg.r1) obj2;
                r1Var.a(i15);
                r1Var.f45614b.x().i(i15 - 1, true);
                r1Var.f45614b.o((qg.m) obj);
                return;
            case 22:
                is0 is0Var = (is0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj;
                xp xpVar = is0Var.F;
                xpVar.a(!xpVar.f32428a.f24147q, true);
                boolean z17 = xpVar.f32428a.f24147q;
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
                is0Var.d.h = Boolean.valueOf(z17);
                if (is0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(is0Var.H, true);
                    is0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(is0Var.f50459c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new o71(11, is0Var, n2Var3));
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
                int flag = TLObject.setFlag(y9Var.f2495g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = y9Var.f2495g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    y9Var.f2495g = i24;
                    y9Var.j(true);
                }
                runnable.run();
                return;
        }
    }

    public ha(Object obj, int i10, Object obj2, int i11) {
        this.f1425a = i11;
        this.f1427c = obj;
        this.f1426b = i10;
        this.d = obj2;
    }

    public ha(Object obj, Object obj2, int i10, int i11) {
        this.f1425a = i11;
        this.f1427c = obj;
        this.d = obj2;
        this.f1426b = i10;
    }
}
