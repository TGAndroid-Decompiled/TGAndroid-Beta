package dg;

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
import lh.l7;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.qa;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.se0;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.be;
import org.telegram.ui.ga1;
import org.telegram.ui.ke;
import org.telegram.ui.m51;
import org.telegram.ui.o51;
import org.telegram.ui.od;
import org.telegram.ui.oy;
import org.telegram.ui.q61;
import org.telegram.ui.ri1;
import org.telegram.ui.t51;
import org.telegram.ui.td;
import org.telegram.ui.ud;
import org.telegram.ui.vg0;
import org.telegram.ui.x31;
import org.telegram.ui.xn;
public final class m2 implements View.OnClickListener {
    public final int f4663a;
    public final int f4664b;
    public final Object f4665c;
    public final Object d;

    public m2(int i10, View view, AtomicReference atomicReference) {
        this.f4663a = 21;
        this.f4664b = i10;
        this.f4665c = view;
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
        int i13 = this.f4663a;
        AndroidUtilities.VcardItem vcardItem = null;
        int i14 = 0;
        boolean z12 = false;
        boolean z13 = false;
        int i15 = this.f4664b;
        Object obj = this.d;
        Object obj2 = this.f4665c;
        switch (i13) {
            case 0:
                o2 o2Var = (o2) obj2;
                o2Var.a(i15);
                o2Var.f4692b.v().i(i15 - 1, true);
                o2Var.f4692b.x((cg.m) obj);
                return;
            case 1:
                or0 or0Var = (or0) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                lp lpVar = or0Var.C;
                lpVar.a(!lpVar.f26837a.f22965q, true);
                boolean z14 = lpVar.f26837a.f22965q;
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
                or0Var.d.h = Boolean.valueOf(z14);
                if (or0Var.E >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(or0Var.E, true);
                    or0Var.E = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(or0Var.f10941c);
                togglechatstargiftnotifications.enabled = z14;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new d3(3, or0Var, p2Var));
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
                int flag = TLObject.setFlag(l7Var.f12768g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i16 = l7Var.f12768g;
                int i17 = flag | ((~i14) & i16);
                if (i16 != i17) {
                    l7Var.f12768g = i17;
                    l7Var.i(true);
                }
                runnable.run();
                return;
            case 3:
                af.g.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 4:
                sa saVar = (sa) obj2;
                saVar.e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new qa(saVar, i15, 0));
                return;
            case 5:
                ((za) obj2).a(i15, ((ya) obj).h);
                return;
            case 6:
                ke keVar = (ke) obj2;
                ga1 ga1Var = (ga1) obj;
                be beVar = keVar.N0;
                if (view.isEnabled() && !beVar.K && !keVar.H0.K) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (keVar.I0 > currentTime) {
                        keVar.W0 = qc.a0(ga1Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, lh.q.j0(keVar.I0 - currentTime)))).j();
                        return;
                    } else if (keVar.U0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        qc.a0(ga1Var).L(keVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new od(keVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        td tdVar = new td(keVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.W = 1;
                        twoStepVerificationActivity.Y = tdVar;
                        beVar.setLoading(true);
                        twoStepVerificationActivity.s0(new ud(keVar, ga1Var, twoStepVerificationActivity, 2));
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
                if (xnVar2.f39949a5 != null && i15 < arrayList.size()) {
                    xnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 9:
                ((wc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.u2) obj).run();
                return;
            case 10:
                es esVar = (es) obj2;
                w51 w51Var = (w51) obj;
                if (esVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(esVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                    d2Var.O = string;
                    d2Var.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    d2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z13 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = esVar.f24658t0;
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
                esVar.V();
                w51Var.N(true);
                return;
            case 11:
                n40 n40Var = (n40) obj2;
                n40Var.f27187n = i15;
                n40Var.f27184b.d(view.getLeft(), false);
                n40Var.f27185c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                n40Var.invalidate();
                return;
            case 12:
                se0 se0Var = (se0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = se0Var.f28695n;
                ArrayList arrayList2 = se0Var.J;
                org.telegram.ui.ActionBar.p2 p2Var2 = se0Var.f28696r;
                int i18 = se0Var.C;
                if (i15 >= i18 && i15 < se0Var.D) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i18);
                } else {
                    int i19 = se0Var.E;
                    if (i15 >= i19 && i15 < se0Var.F) {
                        vcardItem = (AndroidUtilities.VcardItem) se0Var.I.get(i15 - i19);
                    }
                }
                if (vcardItem != null) {
                    if (se0Var.G) {
                        int i20 = vcardItem.type;
                        if (i20 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                p2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
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
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new cg.u1(5, se0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= se0Var.C && i15 < se0Var.D) {
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
                        int themedColor = se0Var.getThemedColor(j6.Sh);
                        textView.setEnabled(z12);
                        if (!z12) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((qe0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 13:
                gt0 gt0Var = (gt0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                yu0 yu0Var = gt0Var.f25249f;
                org.telegram.ui.ActionBar.p2 p2Var3 = yu0Var.f31144s1;
                p2Var3.finishPreviewFragment();
                chat.left = false;
                gt0Var.E(false);
                gt0Var.u(i15);
                if (gt0Var.d.isEmpty()) {
                    yu0Var.v1(true);
                    yu0Var.F();
                }
                p2Var3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-yu0Var.f31119g1));
                p2Var3.getMessagesController().addUserToChat(chat.f19184id, p2Var3.getUserConfig().getCurrentUser(), 0, null, p2Var3, new i80(20, gt0Var, chat));
                return;
            case 14:
                ((j41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 15:
                oy.a0((oy) obj2, i15, (o70) obj);
                return;
            case 16:
                vg0.Y((vg0) obj2, i15, (o70) obj);
                return;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                k6[] k6VarArr = (k6[]) obj;
                if (i15 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zArr[0] = z4;
                for (int i22 = 0; i22 < 2; i22++) {
                    k6 k6Var = k6VarArr[i22];
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
                    k6Var.f21305c.a(z11, true);
                }
                return;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.p1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((x31) saveToGallerySettingsActivity.f32222s.get(i15)).f39852c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f32216a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 19:
                vx vxVar = (vx) obj;
                q61 q61Var = ((o51) obj2).f36795c;
                if (!vxVar.e && !UserConfig.getInstance(q61Var.S).isPremium()) {
                    org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new eg.o1(q61Var.Z0, q61Var.getContext(), q61Var.S, 11, false));
                        return;
                    }
                    return;
                }
                int i23 = 0;
                while (true) {
                    m51 m51Var = q61Var.f37605e0;
                    if (i23 < m51Var.getChildCount()) {
                        if ((m51Var.getChildAt(i23) instanceof t51) && (R = RecyclerView.R((view2 = m51Var.getChildAt(i23)))) >= 0 && q61Var.f37641v0.get(R) == i15) {
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
                    q61Var.i(num.intValue(), view2);
                }
                mv.W(null, vxVar.f30100b, false, null, null);
                q61Var.f37650y0.add(Long.valueOf(vxVar.f30100b.f19211id));
                q61Var.B(true, true, true);
                return;
            case 20:
                ph.d dVar = (ph.d) obj2;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj;
                if (!dVar.K) {
                    c5.j jVar = ri1.d;
                    if (jVar != null && ((byte[]) jVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.f4664b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new mh(dVar, g3Var, i24, view, jVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            default:
                SharedConfig.setSearchEngineType(i15);
                ((o8) ((View) obj2)).u(org.telegram.ui.web.l1.a().f39570a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
        }
    }

    public m2(Object obj, int i10, Object obj2, int i11) {
        this.f4663a = i11;
        this.f4665c = obj;
        this.f4664b = i10;
        this.d = obj2;
    }

    public m2(Object obj, Object obj2, int i10, int i11) {
        this.f4663a = i11;
        this.f4665c = obj;
        this.d = obj2;
        this.f4664b = i10;
    }
}
