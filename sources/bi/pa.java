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
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.hf0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.w40;
import org.telegram.ui.Components.zp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.b51;
import org.telegram.ui.c61;
import org.telegram.ui.cy;
import org.telegram.ui.g51;
import org.telegram.ui.ii1;
import org.telegram.ui.k31;
import org.telegram.ui.ke;
import org.telegram.ui.l71;
import org.telegram.ui.pg0;
import org.telegram.ui.un;
import org.telegram.ui.w91;
import org.telegram.ui.z41;
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
                org.telegram.ui.ActionBar.r5 r5Var = ((org.telegram.ui.ActionBar.x5) obj2).f23245a;
                if (y5Var.s()) {
                    org.telegram.ui.ActionBar.j jVar = r5Var.T;
                    if (jVar == null || jVar.a()) {
                        y5Var.U(null, null);
                        return;
                    }
                    return;
                } else if (y5Var.f23288y0) {
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
                w91 w91Var = (w91) obj;
                org.telegram.ui.ae aeVar = keVar.G0;
                if (view.isEnabled() && !aeVar.Q && !keVar.A0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.B0 > currentTime) {
                        keVar.P0 = org.telegram.ui.Components.wc.b0(w91Var).R(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, y.s0(keVar.B0 - currentTime)))).j();
                        return;
                    } else if (keVar.N0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        org.telegram.ui.Components.wc.b0(w91Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new org.telegram.ui.qd(keVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        org.telegram.ui.ud udVar = new org.telegram.ui.ud(keVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.Z = 1;
                        twoStepVerificationActivity.f36302b0 = udVar;
                        aeVar.setLoading(true);
                        twoStepVerificationActivity.t0(new org.telegram.ui.vd(keVar, w91Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 5:
                un unVar = (un) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (unVar.f44292j1 != null && unVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 6:
                un unVar2 = (un) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (unVar2.f44371p5 != null && i15 < arrayList.size()) {
                    unVar2.Ka(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 7:
                ((md0) obj2).setValue(i15);
                ((org.telegram.ui.Components.a3) obj).run();
                return;
            case 8:
                al alVar = (al) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                k80 F = k80.F(alVar, u6Var, alVar.f26545x);
                F.Q = true;
                F.c(R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds), new org.telegram.ui.g4(alVar, i15, u6Var, 5), false);
                F.c(R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment), new uk(alVar, 0), false);
                F.f29866s = 0;
                F.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F.Z();
                return;
            case 9:
                rs rsVar = (rs) obj2;
                j71 j71Var = (j71) obj;
                if (rsVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rsVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.R = string;
                    e2Var.T = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    e2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = rsVar.f32315w0;
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
                j71Var.O(true);
                return;
            case 10:
                w40 w40Var = (w40) obj2;
                w40Var.f34359n = i15;
                w40Var.f34356b.d(view.getLeft(), false);
                w40Var.f34357c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                w40Var.invalidate();
                return;
            case 11:
                jf0 jf0Var = (jf0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = jf0Var.M;
                org.telegram.ui.ActionBar.r2 r2Var = jf0Var.f29635r;
                int i16 = jf0Var.F;
                if (i15 >= i16 && i15 < jf0Var.G) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i16);
                } else {
                    int i17 = jf0Var.H;
                    if (i15 >= i17 && i15 < jf0Var.I) {
                        vcardItem = (AndroidUtilities.VcardItem) jf0Var.L.get(i15 - i17);
                    }
                }
                if (vcardItem != null) {
                    if (jf0Var.J) {
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
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ng.j(5, jf0Var, vcardItem));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= jf0Var.F && i15 < jf0Var.G) {
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
                        jf0Var.f29634n.setEnabled(z14);
                        jf0Var.M();
                    }
                    ((hf0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 12:
                ju0 ju0Var = (ju0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                aw0 aw0Var = ju0Var.f29723f;
                org.telegram.ui.ActionBar.r2 r2Var2 = aw0Var.f26702x1;
                r2Var2.finishPreviewFragment();
                chat.left = false;
                ju0Var.E(false);
                ju0Var.u(i15);
                if (ju0Var.d.isEmpty()) {
                    aw0Var.J1(true);
                    aw0Var.L();
                }
                r2Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-aw0Var.l1));
                r2Var2.getMessagesController().addUserToChat(chat.f22027id, r2Var2.getUserConfig().getCurrentUser(), 0, null, r2Var2, new t90(19, ju0Var, chat));
                return;
            case 13:
                ((v51) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 14:
                cy.s0((cy) obj2, i15, (k80) obj);
                return;
            case 15:
                pg0.a0((pg0) obj2, i15, (k80) obj);
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
                    p6Var.f24765c.a(z12, true);
                }
                return;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((k31) saveToGallerySettingsActivity.f36146s.get(i15)).f40792c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f36140a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 18:
                ey eyVar = (ey) obj;
                c61 c61Var = ((b51) obj2).f37977c;
                if (!eyVar.e && !UserConfig.getInstance(c61Var.V).isPremium()) {
                    org.telegram.ui.ActionBar.r2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new tg.y0(c61Var.f38286c1, c61Var.getContext(), c61Var.V, 11, false));
                        return;
                    }
                    return;
                }
                int i21 = 0;
                while (true) {
                    z41 z41Var = c61Var.f38296h0;
                    if (i21 < z41Var.getChildCount()) {
                        if ((z41Var.getChildAt(i21) instanceof g51) && (R = RecyclerView.R((view2 = z41Var.getChildAt(i21)))) >= 0 && c61Var.f38334y0.get(R) == i15) {
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
                    c61Var.i(num.intValue(), view2);
                }
                aw.g0(null, eyVar.f28006b, false, null, null);
                c61Var.B0.add(Long.valueOf(eyVar.f28006b.f22054id));
                c61Var.B(true, true, true);
                return;
            case 19:
                ((org.telegram.ui.Wallet.k) obj).run(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.g5) obj2).setSelected(i15);
                return;
            case 20:
                fi.d dVar = (fi.d) obj2;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                if (!dVar.Q) {
                    me meVar = ii1.d;
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
                ((org.telegram.ui.Cells.v8) ((View) obj2)).w(org.telegram.ui.web.n1.a().f45329a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            case 22:
                sg.t1 t1Var = (sg.t1) obj2;
                t1Var.a(i15);
                t1Var.f48514b.w().i(i15 - 1, true);
                t1Var.f48514b.i((rg.m) obj);
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
                vs0 vs0Var = (vs0) obj2;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj;
                zp zpVar = vs0Var.F;
                zpVar.a(!zpVar.f35379a.f26087q, true);
                boolean z17 = zpVar.f35379a.f26087q;
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
                vs0Var.d.h = Boolean.valueOf(z17);
                if (vs0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(vs0Var.H, true);
                    vs0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(vs0Var.f53229c);
                togglechatstargiftnotifications.enabled = z17;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new l71(13, vs0Var, r2Var3));
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
