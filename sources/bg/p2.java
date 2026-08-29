package bg;

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
import jh.k7;
import nh.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.jh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a51;
import org.telegram.ui.c51;
import org.telegram.ui.d61;
import org.telegram.ui.de;
import org.telegram.ui.ei1;
import org.telegram.ui.fy;
import org.telegram.ui.h51;
import org.telegram.ui.id;
import org.telegram.ui.l31;
import org.telegram.ui.nd;
import org.telegram.ui.ng0;
import org.telegram.ui.od;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.ud;
public final class p2 implements View.OnClickListener {
    public final int f2451a;
    public final int f2452b;
    public final Object f2453c;
    public final Object d;

    public p2(int i10, View view, AtomicReference atomicReference) {
        this.f2451a = 21;
        this.f2452b = i10;
        this.f2453c = view;
        this.d = atomicReference;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        View view2;
        int R;
        int i13 = this.f2451a;
        AndroidUtilities.VcardItem vcardItem = null;
        int i14 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i15 = this.f2452b;
        Object obj = this.d;
        Object obj2 = this.f2453c;
        switch (i13) {
            case 0:
                r2 r2Var = (r2) obj2;
                r2Var.a(i15);
                r2Var.f2471b.w().i(i15 - 1, true);
                r2Var.f2471b.q((ag.m) obj);
                return;
            case 1:
                gr0 gr0Var = (gr0) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                hp hpVar = gr0Var.B;
                hpVar.a(!hpVar.f29211a.f26324q, true);
                boolean z15 = hpVar.f29211a.f26324q;
                tc a02 = tc.a0(o2Var);
                if (z15) {
                    i10 = R.raw.silent_unmute;
                } else {
                    i10 = R.raw.silent_mute;
                }
                if (z15) {
                    i11 = R.string.Gift2ChannelNotifyChecked;
                } else {
                    i11 = R.string.Gift2ChannelNotifyNotChecked;
                }
                a02.P(i10, LocaleController.getString(i11)).j();
                gr0Var.d.h = Boolean.valueOf(z15);
                if (gr0Var.D >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(gr0Var.D, true);
                    gr0Var.D = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = MessagesController.getInstance(i15).getInputPeer(gr0Var.f9503c);
                togglechatstargiftnotifications.enabled = z15;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new h3(3, gr0Var, o2Var));
                return;
            case 2:
                k7 k7Var = (k7) obj2;
                Runnable runnable = (Runnable) obj;
                k7Var.getClass();
                if ((i15 & 15) != 0) {
                    i14 = 15;
                } else if ((i15 & 768) != 0) {
                    i14 = 768;
                }
                int flag = TLObject.setFlag(k7Var.f12383g & i14, i15, !TLObject.hasFlag(i12, i15));
                if (flag == 0) {
                    flag = (~i15) & i14;
                }
                int i16 = k7Var.f12383g;
                int i17 = flag | ((~i14) & i16);
                if (i16 != i17) {
                    k7Var.f12383g = i17;
                    k7Var.i(true);
                }
                runnable.run();
                return;
            case 3:
                ye.d.s((Context) obj2, "https://" + MessagesController.getInstance(i15).linkPrefix + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                return;
            case 4:
                pa paVar = (pa) obj2;
                paVar.f25022e.a(true, true);
                MessagesController.getInstance(i15).getUnconfirmedAuthController().deny((ArrayList) obj, new c6(paVar, i15, 1));
                return;
            case 5:
                ((wa) obj2).a(i15, ((va) obj).h);
                return;
            case 6:
                de deVar = (de) obj2;
                t91 t91Var = (t91) obj;
                ud udVar = deVar.M0;
                if (view.isEnabled() && !udVar.J && !deVar.G0.J) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (deVar.H0 > currentTime) {
                        deVar.V0 = tc.a0(t91Var).Q(R.raw.timer_3, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotStarsWithdrawalToast, jh.q.j0(deVar.H0 - currentTime)))).j();
                        return;
                    } else if (deVar.T0 < MessagesController.getInstance(i15).starsRevenueWithdrawalMin) {
                        tc.a0(t91Var).L(deVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("BotStarsWithdrawMinLimit", (int) MessagesController.getInstance(i15).starsRevenueWithdrawalMin, new Object[0]), new id(deVar, i15, 1))).j();
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        nd ndVar = new nd(deVar, twoStepVerificationActivity, 2);
                        twoStepVerificationActivity.V = 1;
                        twoStepVerificationActivity.X = ndVar;
                        udVar.setLoading(true);
                        twoStepVerificationActivity.s0(new od(deVar, t91Var, twoStepVerificationActivity, 2));
                        return;
                    }
                }
                return;
            case 7:
                tn tnVar = (tn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (tnVar.T0 != null && tnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    return;
                }
                return;
            case 8:
                tn tnVar2 = (tn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (tnVar2.Z4 != null && i15 < arrayList.size()) {
                    tnVar2.Ba(((Integer) arrayList.get(i15)).intValue());
                    return;
                }
                return;
            case 9:
                ((qc0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                return;
            case 10:
                as asVar = (as) obj2;
                k51 k51Var = (k51) obj;
                if (asVar.S()) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                    String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    c2Var.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    c2Var.show();
                    return;
                }
                if (i15 <= 0) {
                    z14 = true;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.f26858s0;
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
                asVar.V();
                k51Var.N(true);
                return;
            case 11:
                j40 j40Var = (j40) obj2;
                j40Var.f29548n = i15;
                j40Var.f29544b.d(view.getLeft(), false);
                j40Var.f29545c.d(view.getRight(), false);
                ((MessagesStorage.IntCallback) obj).run(i15);
                j40Var.invalidate();
                return;
            case 12:
                ke0 ke0Var = (ke0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                TextView textView = ke0Var.f30027n;
                ArrayList arrayList2 = ke0Var.I;
                org.telegram.ui.ActionBar.o2 o2Var2 = ke0Var.f30028r;
                int i18 = ke0Var.B;
                if (i15 >= i18 && i15 < ke0Var.C) {
                    vcardItem = (AndroidUtilities.VcardItem) arrayList2.get(i15 - i18);
                } else {
                    int i19 = ke0Var.D;
                    if (i15 >= i19 && i15 < ke0Var.E) {
                        vcardItem = (AndroidUtilities.VcardItem) ke0Var.H.get(i15 - i19);
                    }
                }
                if (vcardItem != null) {
                    if (ke0Var.F) {
                        int i20 = vcardItem.type;
                        if (i20 == 0) {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + vcardItem.getValue(false)));
                                intent.addFlags(268435456);
                                o2Var2.getParentActivity().startActivityForResult(intent, 500);
                                return;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        } else if (i20 == 1) {
                            ye.d.s(o2Var2.getParentActivity(), "mailto:" + vcardItem.getValue(false));
                            return;
                        } else if (i20 == 3) {
                            String value = vcardItem.getValue(false);
                            if (!value.startsWith("http")) {
                                value = "http://".concat(value);
                            }
                            ye.d.s(o2Var2.getParentActivity(), value);
                            return;
                        } else {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(o2Var2.getParentActivity());
                            alertDialog$Builder2.f(new CharSequence[]{LocaleController.getString(R.string.Copy)}, new ag.y1(5, ke0Var, vcardItem));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    vcardItem.checked = !vcardItem.checked;
                    if (i15 >= ke0Var.B && i15 < ke0Var.C) {
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList2.size()) {
                                if (((AndroidUtilities.VcardItem) arrayList2.get(i21)).checked) {
                                    z13 = true;
                                } else {
                                    i21++;
                                }
                            }
                        }
                        int themedColor = ke0Var.getThemedColor(g6.Sh);
                        textView.setEnabled(z13);
                        if (!z13) {
                            themedColor &= Integer.MAX_VALUE;
                        }
                        textView.setTextColor(themedColor);
                    }
                    ((ie0) viewGroup).setChecked(vcardItem.checked);
                    return;
                }
                return;
            case 13:
                ys0 ys0Var = (ys0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                qu0 qu0Var = ys0Var.f35129f;
                org.telegram.ui.ActionBar.o2 o2Var3 = qu0Var.f32093r1;
                o2Var3.finishPreviewFragment();
                chat.left = false;
                ys0Var.E(false);
                ys0Var.u(i15);
                if (ys0Var.d.isEmpty()) {
                    qu0Var.v1(true);
                    qu0Var.F();
                }
                o2Var3.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-qu0Var.f32069f1));
                o2Var3.getMessagesController().addUserToChat(chat.f22392id, o2Var3.getUserConfig().getCurrentUser(), 0, null, o2Var3, new ii0(11, ys0Var, chat));
                return;
            case 14:
                ((y31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                return;
            case 15:
                fy.a0((fy) obj2, i15, (j70) obj);
                return;
            case 16:
                ng0.Y((ng0) obj2, i15, (j70) obj);
                return;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                i6[] i6VarArr = (i6[]) obj;
                if (i15 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[0] = z10;
                for (int i22 = 0; i22 < 2; i22++) {
                    i6 i6Var = i6VarArr[i22];
                    boolean z17 = zArr[0];
                    if (i22 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z17 == z11) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i6Var.f24501c.a(z12, true);
                }
                return;
            case 18:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.o1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((l31) saveToGallerySettingsActivity.f36179s.get(i15)).f40083c.dialogId);
                bundle.putInt("type", saveToGallerySettingsActivity.f36172a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                return;
            case 19:
                rx rxVar = (rx) obj;
                d61 d61Var = ((c51) obj2).f37004c;
                if (!rxVar.f32404e && !UserConfig.getInstance(d61Var.R).isPremium()) {
                    org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                    if (R2 != null) {
                        R2.showDialog(new cg.p1(d61Var.Y0, d61Var.getContext(), d61Var.R, 11, false));
                        return;
                    }
                    return;
                }
                int i23 = 0;
                while (true) {
                    a51 a51Var = d61Var.f37326d0;
                    if (i23 < a51Var.getChildCount()) {
                        if ((a51Var.getChildAt(i23) instanceof h51) && (R = RecyclerView.R((view2 = a51Var.getChildAt(i23)))) >= 0 && d61Var.f37363u0.get(R) == i15) {
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
                    d61Var.i(num.intValue(), view2);
                }
                jv.W(null, rxVar.f32402b, false, null, null);
                d61Var.f37371x0.add(Long.valueOf(rxVar.f32402b.f22419id));
                d61Var.B(true, true, true);
                return;
            case 20:
                nh.d dVar = (nh.d) obj2;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj;
                if (!dVar.J) {
                    a5.j jVar = ei1.d;
                    if (jVar != null && ((byte[]) jVar.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.f2452b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new Object(), new jh(dVar, f3Var, i24, view, jVar));
                        return;
                    }
                    FileLog.d("wear-auth: login pressed with no session/key");
                    return;
                }
                return;
            default:
                SharedConfig.setSearchEngineType(i15);
                ((m8) ((View) obj2)).u(org.telegram.ui.web.k1.a().f44088a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                return;
        }
    }

    public p2(Object obj, int i10, Object obj2, int i11) {
        this.f2451a = i11;
        this.f2453c = obj;
        this.f2452b = i10;
        this.d = obj2;
    }

    public p2(Object obj, Object obj2, int i10, int i11) {
        this.f2451a = i11;
        this.f2453c = obj;
        this.d = obj2;
        this.f2452b = i10;
    }
}
