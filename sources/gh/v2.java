package gh;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hh.m7;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import lh.o6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.gh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.a40;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.kx;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.ps0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a61;
import org.telegram.ui.ci1;
import org.telegram.ui.e51;
import org.telegram.ui.fe;
import org.telegram.ui.gy;
import org.telegram.ui.jd;
import org.telegram.ui.k31;
import org.telegram.ui.od;
import org.telegram.ui.pd;
import org.telegram.ui.q91;
import org.telegram.ui.qg0;
import org.telegram.ui.rn;
import org.telegram.ui.wd;
import org.telegram.ui.x41;
import org.telegram.ui.z41;

public final class v2 implements View.OnClickListener {

    public final int f7587a;

    public final int f7588b;

    public final Object f7589c;
    public final Object d;

    public v2(int i10, View view, AtomicReference atomicReference) {
        this.f7587a = 20;
        this.f7588b = i10;
        this.f7589c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        int themedColor;
        Integer numValueOf;
        View childAt;
        int iR;
        int i10 = this.f7587a;
        int i11 = 4;
        AndroidUtilities.VcardItem vcardItem = null;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 1;
        int i15 = this.f7588b;
        Object obj = this.d;
        Object obj2 = this.f7589c;
        switch (i10) {
            case 0:
                wq0 wq0Var = (wq0) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                bp bpVar = wq0Var.B;
                bpVar.a(!bpVar.f27188a.f26309q, true);
                boolean z11 = bpVar.f27188a.f26309q;
                mc.a0(n2Var).P(z11 ? R.raw.silent_unmute : R.raw.silent_mute, LocaleController.getString(z11 ? R.string.Gift2ChannelNotifyChecked : R.string.Gift2ChannelNotifyNotChecked)).j();
                wq0Var.d.h = Boolean.valueOf(z11);
                if (wq0Var.D >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(wq0Var.D, true);
                    wq0Var.D = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(wq0Var.f7199c);
                togglechatstargiftnotifications.enabled = z11;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new cg.g0(i12, wq0Var, n2Var));
                break;
            case 1:
                m7 m7Var = (m7) obj2;
                Runnable runnable = (Runnable) obj;
                m7Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int i16 = m7Var.f9749g & i13;
                int flag = TLObject.setFlag(i16, i15, !TLObject.hasFlag(i16, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i17 = m7Var.f9749g;
                int i18 = flag | ((~i13) & i17);
                if (i17 != i18) {
                    m7Var.f9749g = i18;
                    m7Var.i(true);
                }
                runnable.run();
                break;
            case 2:
                we.e.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 3:
                oa oaVar = (oa) obj2;
                oaVar.f24830e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new o6(oaVar, i15, i14));
                break;
            case 4:
                ((wa) obj2).a(i15, ((va) obj).h);
                break;
            case 5:
                fe feVar = (fe) obj2;
                q91 q91Var = (q91) obj;
                wd wdVar = feVar.M0;
                if (view.isEnabled() && !wdVar.J && !feVar.G0.J) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (feVar.H0 > currentTime) {
                        feVar.V0 = mc.a0(q91Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, hh.r.j0(feVar.H0 - currentTime)))).j();
                    } else if (feVar.T0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        mc.a0(q91Var).L(feVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new jd(feVar, i15, i14))).j();
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        od odVar = new od(feVar, twoStepVerificationActivity, i12);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = odVar;
                        wdVar.setLoading(true);
                        twoStepVerificationActivity.s0(new pd(feVar, q91Var, twoStepVerificationActivity, i12));
                    }
                    break;
                }
                break;
            case 6:
                rn rnVar = (rn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (rnVar.T0 != null && rnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 7:
                rn rnVar2 = (rn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (rnVar2.Z4 != null && i15 < arrayList.size()) {
                    rnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 8:
                ((fc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.u2) obj).run();
                break;
            case 9:
                ur urVar = (ur) obj2;
                b51 b51Var = (b51) obj;
                if (urVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(urVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string;
                    b2Var.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    b2Var.show();
                } else {
                    boolean z12 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = urVar.f33186s0;
                    boolean z13 = !z12;
                    tL_chatBannedRights.send_media = z13;
                    tL_chatBannedRights.send_photos = z13;
                    tL_chatBannedRights.send_videos = z13;
                    tL_chatBannedRights.send_stickers = z13;
                    tL_chatBannedRights.send_gifs = z13;
                    tL_chatBannedRights.send_inline = z13;
                    tL_chatBannedRights.send_games = z13;
                    tL_chatBannedRights.send_audios = z13;
                    tL_chatBannedRights.send_docs = z13;
                    tL_chatBannedRights.send_voices = z13;
                    tL_chatBannedRights.send_roundvideos = z13;
                    tL_chatBannedRights.embed_links = z13;
                    tL_chatBannedRights.send_polls = z13;
                    tL_chatBannedRights.send_reactions = z13;
                    urVar.V();
                    b51Var.N(true);
                }
                break;
            case 10:
                a40 a40Var = (a40) obj2;
                a40Var.f26626n = i15;
                a40Var.f26622b.d(view.getLeft(), false);
                a40Var.f26623c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                a40Var.invalidate();
                break;
            case 11:
                be0 be0Var = (be0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = be0Var.f27078n;
                ArrayList arrayList2 = be0Var.I;
                org.telegram.ui.ActionBar.n2 n2Var2 = be0Var.f27079r;
                int i19 = be0Var.B;
                if (i15 < i19 || i15 >= be0Var.C) {
                    int i20 = be0Var.D;
                    if (i15 >= i20 && i15 < be0Var.E) {
                        vcardItem = (AndroidUtilities.VcardItem) be0Var.H.get(i15 - i20);
                    }
                } else {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i19);
                }
                if (vcardItem != null) {
                    if (!be0Var.F) {
                        vcardItem.checked = !vcardItem.checked;
                        if (i15 >= be0Var.B && i15 < be0Var.C) {
                            for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                                if (((AndroidUtilities.VcardItem) arrayList2.get(i21)).checked) {
                                    z10 = true;
                                    themedColor = be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Sh);
                                    textView.setEnabled(z10);
                                    if (!z10) {
                                        themedColor &= Integer.MAX_VALUE;
                                    }
                                    textView.setTextColor(themedColor);
                                }
                            }
                            themedColor = be0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Sh);
                            textView.setEnabled(z10);
                            if (!z10) {
                                themedColor &= Integer.MAX_VALUE;
                            }
                            textView.setTextColor(themedColor);
                        }
                        ((zd0) viewGroup).setChecked(vcardItem.checked);
                    } else {
                        int i22 = vcardItem.type;
                        if (i22 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                n2Var2.getParentActivity().startActivityForResult(intent, 500);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                return;
                            }
                        } else if (i22 == 1) {
                            we.e.s(n2Var2.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                        } else if (i22 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            we.e.s(n2Var2.getParentActivity(), value);
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new org.telegram.ui.w(i11, be0Var, vcardItem));
                            alertDialog$Builder2.o();
                        }
                    }
                    break;
                }
                break;
            case 12:
                ps0 ps0Var = (ps0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                hu0 hu0Var = ps0Var.f31661f;
                org.telegram.ui.ActionBar.n2 n2Var3 = hu0Var.f29145r1;
                n2Var3.finishPreviewFragment();
                chat.left = false;
                ps0Var.E(false);
                ps0Var.u(i15);
                if (ps0Var.d.isEmpty()) {
                    hu0Var.v1(true);
                    hu0Var.F();
                }
                n2Var3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-hu0Var.f29121f1));
                n2Var3.getMessagesController().addUserToChat(chat.f22380id, n2Var3.getUserConfig().getCurrentUser(), 0, null, n2Var3, new lg0(14, ps0Var, chat));
                break;
            case 13:
                ((p31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 14:
                gy.a0((gy) obj2, i15, (b70) obj);
                break;
            case 15:
                qg0.Y((qg0) obj2, i15, (b70) obj);
                break;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.h6[] h6VarArr = (org.telegram.ui.Cells.h6[]) obj;
                zArr[0] = i15 == 1;
                int i23 = 0;
                while (i23 < 2) {
                    h6VarArr[i23].f24451c.a(zArr[0] == (i23 == 1), true);
                    i23++;
                }
                break;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.n1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((k31) saveToGallerySettingsActivity.f36117s.get(i15)).f39588c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f36110a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 18:
                kx kxVar = (kx) obj;
                a61 a61Var = ((z41) obj2).f45028c;
                if (kxVar.f30207e || UserConfig.getInstance(a61Var.R).isPremium()) {
                    int i24 = 0;
                    while (true) {
                        x41 x41Var = a61Var.f36392d0;
                        if (i24 >= x41Var.getChildCount()) {
                            numValueOf = null;
                            childAt = null;
                        } else if ((x41Var.getChildAt(i24) instanceof e51) && (iR = RecyclerView.R((childAt = x41Var.getChildAt(i24)))) >= 0 && a61Var.f36429u0.get(iR) == i15) {
                            numValueOf = Integer.valueOf(iR);
                        } else {
                            i24++;
                        }
                    }
                    if (numValueOf != null) {
                        a61Var.i(numValueOf.intValue(), childAt);
                    }
                    cv.W(null, kxVar.f30205b, false, null, null);
                    a61Var.f36437x0.add(Long.valueOf(kxVar.f30205b.f22407id));
                    a61Var.B(true, true, true);
                } else {
                    org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                    if (n2VarR != null) {
                        n2VarR.showDialog(new ag.g2(a61Var.Y0, a61Var.getContext(), a61Var.R, 11, false));
                    }
                }
                break;
            case 19:
                lh.d dVar = (lh.d) obj2;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                if (!dVar.J) {
                    af.h hVar = ci1.d;
                    if (hVar == null || ((byte[]) hVar.d) == null) {
                        FileLog.d("wear-auth: login pressed with no session/key");
                    } else {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags = 4 | tL_messages_requestUrlAuth.flags;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i25 = this.f7588b;
                        ConnectionsManager.getInstance(i25).sendRequestTyped(tL_messages_requestUrlAuth, new org.telegram.messenger.a(), new gh(dVar, e3Var, i25, view, hVar));
                    }
                    break;
                }
                break;
            case 20:
                SharedConfig.setSearchEngineType(i15);
                ((l8) ((View) obj2)).u(org.telegram.ui.web.k1.a().f43889a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            default:
                zf.r1 r1Var = (zf.r1) obj2;
                r1Var.a(i15);
                r1Var.f50685b.x().i(i15 - 1, true);
                r1Var.f50685b.l((yf.m) obj);
                break;
        }
    }

    public v2(Object obj, int i10, Object obj2, int i11) {
        this.f7587a = i11;
        this.f7589c = obj;
        this.f7588b = i10;
        this.d = obj2;
    }

    public v2(Object obj, Object obj2, int i10, int i11) {
        this.f7587a = i11;
        this.f7589c = obj;
        this.d = obj2;
        this.f7588b = i10;
    }
}
