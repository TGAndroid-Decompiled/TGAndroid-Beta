package ai;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.messenger.ih;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.gu0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a51;
import org.telegram.ui.b61;
import org.telegram.ui.ey;
import org.telegram.ui.f51;
import org.telegram.ui.gi1;
import org.telegram.ui.j31;
import org.telegram.ui.q71;
import org.telegram.ui.rg0;
import org.telegram.ui.sn;
import org.telegram.ui.u91;
import org.telegram.ui.y41;
public final class ia implements View.OnClickListener {
    public final int f1492a;
    public final int f1493b;
    public final Object f1494c;
    public final Object d;

    public ia(int i10, View view, AtomicReference atomicReference) {
        this.f1492a = 20;
        this.f1493b = i10;
        this.f1494c = view;
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
        int i13 = this.f1492a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f1493b;
        Object obj = this.d;
        Object obj2 = this.f1494c;
        switch (i13) {
            case 0:
                pf.d.r((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 1:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) obj2;
                taVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new ei.e4(taVar, i15, 3));
                return;
            case 2:
                ((org.telegram.ui.Cells.bb) obj2).a(i15, ((org.telegram.ui.Cells.ab) obj).h);
                return;
            case 3:
                org.telegram.ui.ie ieVar = (org.telegram.ui.ie) obj2;
                u91 u91Var = (u91) obj;
                org.telegram.ui.zd zdVar = ieVar.Q0;
                if (view.isEnabled() && !zdVar.Q && !ieVar.K0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (ieVar.L0 > currentTime) {
                        ieVar.Z0 = org.telegram.ui.Components.xc.a0(u91Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, x.j0(ieVar.L0 - currentTime)))).j();
                        return;
                    } else if (ieVar.X0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        org.telegram.ui.Components.xc.a0(u91Var).L(ieVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new org.telegram.ui.nd(ieVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.sd sdVar = new org.telegram.ui.sd(ieVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f34240b0 = sdVar;
                        zdVar.setLoading(true);
                        twoStepVerificationActivity.s0(new org.telegram.ui.td(ieVar, u91Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 4:
                sn snVar = (sn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (snVar.f41561j1 != null && snVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 5:
                sn snVar2 = (sn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (snVar2.p5 != null && i15 < arrayList.size()) {
                    snVar2.Fa(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 6:
                ((qd0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                return;
            case 7:
                al alVar = (al) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                j80 F = j80.F(alVar, g6Var, alVar.f24765x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new org.telegram.ui.h4(alVar, i15, g6Var, 5), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new uk(alVar, 0), false);
                F.f27580s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 8:
                ps psVar = (ps) obj2;
                b71 b71Var = (b71) obj;
                if (psVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(psVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                    c2Var.R = string;
                    c2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    c2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = psVar.f29662w0;
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
                psVar.V();
                b71Var.N(true);
                return;
            case 9:
                u40 u40Var = (u40) obj2;
                u40Var.f31077n = i15;
                u40Var.f31074b.d(view.getLeft(), false);
                u40Var.f31075c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                u40Var.invalidate();
                return;
            case 10:
                mf0 mf0Var = (mf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = mf0Var.M;
                org.telegram.ui.ActionBar.o2 o2Var = mf0Var.f28647r;
                int i16 = mf0Var.F;
                if (i15 >= i16 && i15 < mf0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = mf0Var.H;
                    if (i15 >= i17 && i15 < mf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) mf0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (mf0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                o2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i18 == 1) {
                            pf.d.r(o2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            pf.d.r(o2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new mg.j(5, mf0Var, vcardItem));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= mf0Var.F && i15 < mf0Var.G) {
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
                        mf0Var.f28646n.setEnabled(z14);
                        mf0Var.M();
                    }
                    ((kf0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 11:
                gu0 gu0Var = (gu0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                xv0 xv0Var = gu0Var.f26716f;
                org.telegram.ui.ActionBar.o2 o2Var2 = xv0Var.f32711v1;
                o2Var2.finishPreviewFragment();
                chat.left = false;
                gu0Var.E(false);
                gu0Var.u(i15);
                if (gu0Var.d.isEmpty()) {
                    xv0Var.A1(true);
                    xv0Var.G();
                }
                o2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-xv0Var.f32686j1));
                o2Var2.getMessagesController().addUserToChat(chat.f20343id, o2Var2.getUserConfig().getCurrentUser(), 0, null, o2Var2, new ko0(8, gu0Var, chat));
                return;
            case 12:
                ((n51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 13:
                ey.p0((ey) obj2, i15, (j80) obj);
                return;
            case 14:
                rg0.Y((rg0) obj2, i15, (j80) obj);
                return;
            case 15:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.l6[] l6VarArr = (org.telegram.ui.Cells.l6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i20 = 0; i20 < 2; i20++) {
                    org.telegram.ui.Cells.l6 l6Var = l6VarArr[i20];
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
                    l6Var.f22681c.a(z12, true);
                }
                return;
            case 16:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.m1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((j31) saveToGallerySettingsActivity.f34083s.get(i15)).f38453c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f34077a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 17:
                fy fyVar = (fy) obj;
                b61 b61Var = ((a51) obj2).f35575c;
                if (!fyVar.e && !UserConfig.getInstance(b61Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new sg.y0(b61Var.f35895c1, b61Var.getContext(), b61Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    y41 y41Var = b61Var.f35905h0;
                    if (i21 < y41Var.getChildCount()) {
                        if ((y41Var.getChildAt(i21) instanceof f51) && (R = RecyclerView.R((view2 = y41Var.getChildAt(i21)))) >= 0 && b61Var.f35943y0.get(R) == i15) {
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
                    b61Var.i(num.intValue(), view2);
                }
                aw.g0(null, fyVar.f26469b, false, null, null);
                b61Var.B0.add(Long.valueOf(fyVar.f26469b.f20370id));
                b61Var.B(true, true, true);
                return;
            case 18:
                ((org.telegram.ui.Wallet.k) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.i5) obj2).setSelected(i15);
                return;
            case 19:
                ei.d dVar = (ei.d) obj2;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                if (!dVar.Q) {
                    com.google.android.gms.internal.cast.z5 z5Var = gi1.d;
                    if (z5Var != null && ((byte[]) z5Var.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f1493b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new ih(dVar, h3Var, i22, view, z5Var));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 20:
                SharedConfig.setSearchEngineType(i15);
                ((org.telegram.ui.Cells.r8) ((View) obj2)).w(org.telegram.ui.web.n1.a().f43206a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 21:
                rg.s1 s1Var = (rg.s1) obj2;
                s1Var.a(i15);
                s1Var.f46067b.w().i(i15 - 1, true);
                s1Var.f46067b.n((qg.m) obj);
                return;
            case 22:
                ns0 ns0Var = (ns0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj;
                xp xpVar = ns0Var.F;
                xpVar.a(!xpVar.f32618a.f24296q, true);
                boolean z17 = xpVar.f32618a.f24296q;
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(o2Var3);
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
                ns0Var.d.h = Boolean.valueOf(z17);
                if (ns0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(ns0Var.H, true);
                    ns0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(ns0Var.f50926c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new q71(11, ns0Var, o2Var3));
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
                int flag = TLObject.setFlag(y9Var.f2507g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = y9Var.f2507g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    y9Var.f2507g = i24;
                    y9Var.j(true);
                }
                runnable.run();
                return;
        }
    }

    public ia(Object obj, int i10, Object obj2, int i11) {
        this.f1492a = i11;
        this.f1494c = obj;
        this.f1493b = i10;
        this.d = obj2;
    }

    public ia(Object obj, Object obj2, int i10, int i11) {
        this.f1492a = i11;
        this.f1494c = obj;
        this.d = obj2;
        this.f1493b = i10;
    }
}
