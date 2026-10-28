package bi;

import a8.me;
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
import org.telegram.messenger.kh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.u90;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.c51;
import org.telegram.ui.e51;
import org.telegram.ui.ey;
import org.telegram.ui.f61;
import org.telegram.ui.j51;
import org.telegram.ui.ke;
import org.telegram.ui.ki1;
import org.telegram.ui.m31;
import org.telegram.ui.n71;
import org.telegram.ui.rg0;
import org.telegram.ui.wn;
import org.telegram.ui.y91;
public final class pa implements View.OnClickListener {
    public final int f5240a;
    public final int f5241b;
    public final Object f5242c;
    public final Object d;

    public pa(int i10, View view, AtomicReference atomicReference) {
        this.f5240a = 21;
        this.f5241b = i10;
        this.f5242c = view;
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
        int i13 = this.f5240a;
        AndroidUtilities.VcardItem vcardItem = null;
        boolean z13 = false;
        int i14 = 0;
        boolean z14 = false;
        int i15 = this.f5241b;
        Object obj = this.d;
        Object obj2 = this.f5242c;
        switch (i13) {
            case 0:
                qf.d.r((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 1:
                org.telegram.ui.ActionBar.y5 y5Var = (org.telegram.ui.ActionBar.y5) obj;
                org.telegram.ui.ActionBar.r5 r5Var = ((org.telegram.ui.ActionBar.x5) obj2).f23248a;
                if (y5Var.s()) {
                    org.telegram.ui.ActionBar.j jVar = r5Var.T;
                    if (jVar == null || jVar.a()) {
                        y5Var.U(null, null);
                        return;
                    }
                    return;
                } else if (y5Var.f23291y0) {
                    r5Var.r(true, true);
                    return;
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = r5Var.T;
                    if (jVar2 != null) {
                        jVar2.b(i15);
                        return;
                    }
                    return;
                }
            case 2:
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) obj2;
                xaVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new fi.c4(xaVar, i15, 3));
                return;
            case 3:
                ((org.telegram.ui.Cells.fb) obj2).a(i15, ((org.telegram.ui.Cells.eb) obj).h);
                return;
            case 4:
                ke keVar = (ke) obj2;
                y91 y91Var = (y91) obj;
                org.telegram.ui.ae aeVar = keVar.G0;
                if (view.isEnabled() && !aeVar.Q && !keVar.A0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.B0 > currentTime) {
                        keVar.P0 = org.telegram.ui.Components.wc.b0(y91Var).R(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, y.s0(keVar.B0 - currentTime)))).j();
                        return;
                    } else if (keVar.N0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        org.telegram.ui.Components.wc.b0(y91Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new org.telegram.ui.qd(keVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.ud udVar = new org.telegram.ui.ud(keVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f36329b0 = udVar;
                        aeVar.setLoading(true);
                        twoStepVerificationActivity.t0(new org.telegram.ui.vd(keVar, y91Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 5:
                wn wnVar = (wn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (wnVar.f45163j1 != null && wnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 6:
                wn wnVar2 = (wn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (wnVar2.f45291t5 != null && i15 < arrayList.size()) {
                    wnVar2.Na(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 7:
                ((nd0) obj2).setValue(i15);
                ((org.telegram.ui.Components.a3) obj).run();
                return;
            case 8:
                al alVar = (al) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                l80 F = l80.F(alVar, u6Var, alVar.f26602x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new org.telegram.ui.g4(alVar, i15, u6Var, 5), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new uk(alVar, 0), false);
                F.f30168s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 9:
                rs rsVar = (rs) obj2;
                k71 k71Var = (k71) obj;
                if (rsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.R = string;
                    e2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    e2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = rsVar.f32357w0;
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
                rsVar.V();
                k71Var.O(true);
                return;
            case 10:
                w40 w40Var = (w40) obj2;
                w40Var.f34444n = i15;
                w40Var.f34441b.d(view.getLeft(), false);
                w40Var.f34442c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                w40Var.invalidate();
                return;
            case 11:
                kf0 kf0Var = (kf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = kf0Var.M;
                org.telegram.ui.ActionBar.r2 r2Var = kf0Var.f29948r;
                int i16 = kf0Var.F;
                if (i15 >= i16 && i15 < kf0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = kf0Var.H;
                    if (i15 >= i17 && i15 < kf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) kf0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (kf0Var.J) {
                        int i18 = vcardItem.type;
                        if (i18 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                r2Var.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        } else if (i18 == 1) {
                            qf.d.r(r2Var.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i18 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            qf.d.r(r2Var.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(r2Var.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ng.j(5, kf0Var, vcardItem));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= kf0Var.F && i15 < kf0Var.G) {
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
                        kf0Var.f29947n.setEnabled(z14);
                        kf0Var.M();
                    }
                    ((if0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 12:
                ku0 ku0Var = (ku0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                bw0 bw0Var = ku0Var.f30033f;
                org.telegram.ui.ActionBar.r2 r2Var2 = bw0Var.f26992x1;
                r2Var2.finishPreviewFragment();
                chat.left = false;
                ku0Var.E(false);
                ku0Var.u(i15);
                if (ku0Var.d.isEmpty()) {
                    bw0Var.J1(true);
                    bw0Var.L();
                }
                r2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-bw0Var.l1));
                r2Var2.getMessagesController().addUserToChat(chat.f22028id, r2Var2.getUserConfig().getCurrentUser(), 0, null, r2Var2, new u90(19, ku0Var, chat));
                return;
            case 13:
                ((w51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 14:
                ey.s0((ey) obj2, i15, (l80) obj);
                return;
            case 15:
                rg0.a0((rg0) obj2, i15, (l80) obj);
                return;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.p6[] p6VarArr = (org.telegram.ui.Cells.p6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i20 = 0; i20 < 2; i20++) {
                    org.telegram.ui.Cells.p6 p6Var = p6VarArr[i20];
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
                    p6Var.f24769c.a(z12, true);
                }
                return;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((m31) saveToGallerySettingsActivity.f36173s.get(i15)).f41322c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f36167a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 18:
                org.telegram.ui.Components.ey eyVar = (org.telegram.ui.Components.ey) obj;
                f61 f61Var = ((e51) obj2).f38761c;
                if (!eyVar.e && !UserConfig.getInstance(f61Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new tg.y0(f61Var.f39192c1, f61Var.getContext(), f61Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    c51 c51Var = f61Var.f39202h0;
                    if (i21 < c51Var.getChildCount()) {
                        if ((c51Var.getChildAt(i21) instanceof j51) && (R = RecyclerView.R((view2 = c51Var.getChildAt(i21)))) >= 0 && f61Var.f39240y0.get(R) == i15) {
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
                    f61Var.i(num.intValue(), view2);
                }
                aw.g0(null, eyVar.f27958b, false, null, null);
                f61Var.B0.add(Long.valueOf(eyVar.f27958b.f22055id));
                f61Var.B(true, true, true);
                return;
            case 19:
                ((org.telegram.ui.Wallet.k) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.g5) obj2).setSelected(i15);
                return;
            case 20:
                fi.d dVar = (fi.d) obj2;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                if (!dVar.Q) {
                    me meVar = ki1.d;
                    if (meVar != null && ((byte[]) meVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.f5241b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new kh(dVar, k3Var, i22, view, meVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 21:
                SharedConfig.setSearchEngineType(i15);
                ((org.telegram.ui.Cells.v8) ((View) obj2)).w(org.telegram.ui.web.n1.a().f44843a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 22:
                sg.s1 s1Var = (sg.s1) obj2;
                s1Var.a(i15);
                s1Var.f48542b.w().i(i15 - 1, true);
                s1Var.f48542b.i((rg.m) obj);
                return;
            case 23:
                t9 t9Var = (t9) obj2;
                Runnable runnable = (Runnable) obj;
                t9Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(t9Var.f5467g & i14, i15, !TLObject.hasFlag(i10, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i23 = t9Var.f5467g;
                int i24 = flag | ((~i14) & i23);
                if (i23 != i24) {
                    t9Var.f5467g = i24;
                    t9Var.j(true);
                }
                runnable.run();
                return;
            default:
                ws0 ws0Var = (ws0) obj2;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj;
                aq aqVar = ws0Var.F;
                aqVar.a(!aqVar.f26634a.f26091q, true);
                boolean z17 = aqVar.f26634a.f26091q;
                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(r2Var3);
                if (z17) {
                    i11 = R.raw.silent_unmute;
                } else {
                    i11 = R.raw.silent_mute;
                }
                if (z17) {
                    i12 = R.string.Gift2ChannelNotifyChecked;
                } else {
                    i12 = R.string.Gift2ChannelNotifyNotChecked;
                }
                b02.Q(i11, LocaleController.getString(i12)).j();
                ws0Var.d.h = Boolean.valueOf(z17);
                if (ws0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(ws0Var.H, true);
                    ws0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(ws0Var.f53290c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new n71(13, ws0Var, r2Var3));
                return;
        }
    }

    public pa(Object obj, int i10, Object obj2, int i11) {
        this.f5240a = i11;
        this.f5242c = obj;
        this.f5241b = i10;
        this.d = obj2;
    }

    public pa(Object obj, Object obj2, int i10, int i11) {
        this.f5240a = i11;
        this.f5242c = obj;
        this.d = obj2;
        this.f5241b = i10;
    }
}
