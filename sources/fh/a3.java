package fh;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import gh.n7;
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
import org.telegram.messenger.ch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a51;
import org.telegram.ui.b61;
import org.telegram.ui.di1;
import org.telegram.ui.dy;
import org.telegram.ui.f51;
import org.telegram.ui.fe;
import org.telegram.ui.jd;
import org.telegram.ui.l31;
import org.telegram.ui.ng0;
import org.telegram.ui.od;
import org.telegram.ui.pd;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.wd;
import org.telegram.ui.y41;
public final class a3 implements View.OnClickListener {
    public final int f6350a;
    public final int f6351b;
    public final Object f6352c;
    public final Object d;

    public a3(int i9, View view, AtomicReference atomicReference) {
        this.f6350a = 20;
        this.f6351b = i9;
        this.f6352c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int R;
        int i12 = this.f6350a;
        AndroidUtilities.VcardItem vcardItem = null;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i14 = this.f6351b;
        Object obj = this.d;
        Object obj2 = this.f6352c;
        switch (i12) {
            case 0:
                vq0 vq0Var = (vq0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                dp dpVar = vq0Var.B;
                dpVar.a(!dpVar.f27781a.f26313q, true);
                boolean z15 = dpVar.f27781a.f26313q;
                oc a02 = oc.a0(o2Var);
                if (z15) {
                    i9 = R.raw.silent_unmute;
                } else {
                    i9 = R.raw.silent_mute;
                }
                if (z15) {
                    i10 = R.string.Gift2ChannelNotifyChecked;
                } else {
                    i10 = R.string.Gift2ChannelNotifyNotChecked;
                }
                a02.P(i9, LocaleController.getString(i10)).j();
                vq0Var.d.h = Boolean.valueOf(z15);
                if (vq0Var.D >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(vq0Var.D, true);
                    vq0Var.D = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i14).getInputPeer(vq0Var.f6547c);
                togglechatstargiftnotifications.enabled = z15;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new bg.j0(2, vq0Var, o2Var));
                return;
            case 1:
                n7 n7Var = (n7) obj2;
                Runnable runnable = (Runnable) obj;
                n7Var.getClass();
                if ((i14 & 15) != 0) {
                    i13 = 15;
                } else if ((i14 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(n7Var.f8621g & i13, i14, !TLObject.hasFlag(i11, i14));
                if (flag == 0) {
                    flag = (~i14) & i13;
                }
                int i15 = n7Var.f8621g;
                int i16 = flag | ((~i13) & i15);
                if (i15 != i16) {
                    n7Var.f8621g = i16;
                    n7Var.i(true);
                }
                runnable.run();
                return;
            case 2:
                ve.e.s((Context) obj2, "https://" + MessagesController.getInstance(i14).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 3:
                sa saVar = (sa) obj2;
                saVar.f25300e.a(true, true);
                MessagesController.getInstance(i14).getUnconfirmedAuthController().deny((ArrayList) obj, new kh.p6(saVar, i14, 1));
                return;
            case 4:
                ((za) obj2).a(i14, ((ya) obj).h);
                return;
            case 5:
                fe feVar = (fe) obj2;
                s91 s91Var = (s91) obj;
                wd wdVar = feVar.M0;
                if (view.isEnabled() && !wdVar.J && !feVar.G0.J) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (feVar.H0 > currentTime) {
                        feVar.V0 = oc.a0(s91Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, gh.r.i0(feVar.H0 - currentTime)))).j();
                        return;
                    } else if (feVar.T0 < MessagesController.getInstance(i14).starsRevenueWithdrawalMin) {
                        oc.a0(s91Var).L(feVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i14).starsRevenueWithdrawalMin, new Object[0]), new jd(feVar, i14, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        od odVar = new od(feVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = odVar;
                        wdVar.setLoading(true);
                        twoStepVerificationActivity.r0(new pd(feVar, s91Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 6:
                qn qnVar = (qn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (qnVar.T0 != null && qnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    return;
                }
                return;
            case 7:
                qn qnVar2 = (qn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (qnVar2.Z4 != null && i14 < arrayList.size()) {
                    qnVar2.Ba(((Integer) arrayList.get(i14)).intValue());
                    return;
                }
                return;
            case 8:
                ((bc0) obj2).setValue(i14);
                ((org.telegram.ui.Components.u2) obj).run();
                return;
            case 9:
                wr wrVar = (wr) obj2;
                z41 z41Var = (z41) obj;
                if (wrVar.R()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wrVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    c2Var.show();
                    return;
                }
                if (i14 <= 0) {
                    z14 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = wrVar.f34339s0;
                boolean z16 = !z14;
                tL_chatBannedRights.send_media = z16;
                tL_chatBannedRights.send_photos = z16;
                tL_chatBannedRights.send_videos = z16;
                tL_chatBannedRights.send_stickers = z16;
                tL_chatBannedRights.send_gifs = z16;
                tL_chatBannedRights.send_inline = z16;
                tL_chatBannedRights.send_games = z16;
                tL_chatBannedRights.send_audios = z16;
                tL_chatBannedRights.send_docs = z16;
                tL_chatBannedRights.send_voices = z16;
                tL_chatBannedRights.send_roundvideos = z16;
                tL_chatBannedRights.embed_links = z16;
                tL_chatBannedRights.send_polls = z16;
                tL_chatBannedRights.send_reactions = z16;
                wrVar.U();
                z41Var.N(true);
                return;
            case 10:
                v30 v30Var = (v30) obj2;
                v30Var.f33253n = i14;
                v30Var.f33249b.d(view.getLeft(), false);
                v30Var.f33250c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i14);
                v30Var.invalidate();
                return;
            case 11:
                wd0 wd0Var = (wd0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = wd0Var.f34210n;
                ArrayList arrayList2 = wd0Var.I;
                org.telegram.ui.ActionBar.o2 o2Var2 = wd0Var.f34211r;
                int i17 = wd0Var.B;
                if (i14 >= i17 && i14 < wd0Var.C) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i14 - i17);
                } else {
                    int i18 = wd0Var.D;
                    if (i14 >= i18 && i14 < wd0Var.E) {
                        vcardItem = (AndroidUtilities.VcardItem) wd0Var.H.get(i14 - i18);
                    }
                }
                if (vcardItem != null) {
                    if (wd0Var.F) {
                        int i19 = vcardItem.type;
                        if (i19 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                o2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        } else if (i19 == 1) {
                            ve.e.s(o2Var2.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i19 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            ve.e.s(o2Var2.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new org.telegram.ui.v(4, wd0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i14 >= wd0Var.B && i14 < wd0Var.C) {
                        int i20 = 0;
                        while (true) {
                            if (i20 < arrayList2.size()) {
                                if (((AndroidUtilities.VcardItem) arrayList2.get(i20)).checked) {
                                    z13 = true;
                                } else {
                                    i20++;
                                }
                            }
                        }
                        int themedColor = wd0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Sh);
                        textView.setEnabled(z13);
                        if (!z13) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((ud0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 12:
                ns0 ns0Var = (ns0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                eu0 eu0Var = ns0Var.f31179f;
                org.telegram.ui.ActionBar.o2 o2Var3 = eu0Var.f28160r1;
                o2Var3.finishPreviewFragment();
                chat.left = false;
                ns0Var.E(false);
                ns0Var.u(i14);
                if (ns0Var.d.isEmpty()) {
                    eu0Var.v1(true);
                    eu0Var.F();
                }
                o2Var3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-eu0Var.f28136f1));
                o2Var3.getMessagesController().addUserToChat(chat.f22380id, o2Var3.getUserConfig().getCurrentUser(), 0, null, o2Var3, new jg0(14, ns0Var, chat));
                return;
            case 13:
                ((n31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                return;
            case 14:
                dy.Z((dy) obj2, i14, (x60) obj);
                return;
            case 15:
                ng0.X((ng0) obj2, i14, (x60) obj);
                return;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj;
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i21 = 0; i21 < 2; i21++) {
                    org.telegram.ui.Cells.k6 k6Var = k6VarArr[i21];
                    boolean z17 = zArr[0];
                    if (i21 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z17 == z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    k6Var.f24615c.a(z12, true);
                }
                return;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((l31) saveToGallerySettingsActivity.f36114s.get(i14)).f39987c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f36107a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 18:
                jx jxVar = (jx) obj;
                b61 b61Var = ((a51) obj2).f36366c;
                if (!jxVar.f29867e && !UserConfig.getInstance(b61Var.R).isPremium()) {
                    org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new zf.x0(b61Var.Y0, b61Var.getContext(), b61Var.R, 11, false));
                        return;
                    }
                    return;
                }
                int i22 = 0;
                while (true) {
                    y41 y41Var = b61Var.f36669d0;
                    if (i22 < y41Var.getChildCount()) {
                        if ((y41Var.getChildAt(i22) instanceof f51) && (R = RecyclerView.R((view2 = y41Var.getChildAt(i22)))) >= 0 && b61Var.f36706u0.get(R) == i14) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    } else {
                        num = null;
                        view2 = null;
                    }
                }
                if (num != null) {
                    b61Var.i(num.intValue(), view2);
                }
                dv.V(null, jxVar.f29865b, false, null, null);
                b61Var.f36714x0.add(Long.valueOf(jxVar.f29865b.f22407id));
                b61Var.B(true, true, true);
                return;
            case 19:
                kh.d dVar = (kh.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.J) {
                    b3.b bVar = di1.d;
                    if (bVar != null && ((byte[]) bVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags = 4 | tL_messages_requestUrlAuth.flags;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.f6351b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new ch(dVar, f3Var, i23, view, bVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            case 20:
                SharedConfig.setSearchEngineType(i14);
                ((p8) ((View) obj2)).u(org.telegram.ui.web.j1.a().f43902a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
            default:
                yf.r1 r1Var = (yf.r1) obj2;
                r1Var.a(i14);
                r1Var.f50090b.x().i(i14 - 1, true);
                r1Var.f50090b.n((xf.m) obj);
                return;
        }
    }

    public a3(Object obj, int i9, Object obj2, int i10) {
        this.f6350a = i10;
        this.f6352c = obj;
        this.f6351b = i9;
        this.d = obj2;
    }

    public a3(Object obj, Object obj2, int i9, int i10) {
        this.f6350a = i10;
        this.f6352c = obj;
        this.d = obj2;
        this.f6351b = i9;
    }
}
