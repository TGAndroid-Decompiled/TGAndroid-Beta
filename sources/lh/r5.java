package lh;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ap;
import org.telegram.ui.b10;
import org.telegram.ui.cp;
import org.telegram.ui.dn0;
import org.telegram.ui.fq0;
import org.telegram.ui.h80;
import org.telegram.ui.hp;
import org.telegram.ui.jn;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.ow;
import org.telegram.ui.oy;
import org.telegram.ui.pm0;
import org.telegram.ui.qp;
import org.telegram.ui.xn;
import org.telegram.ui.yz;
public final class r5 implements Runnable {
    public final int f13025a;
    public final boolean f13026b;
    public final Object f13027c;
    public final Object d;

    public r5(Object obj, Object obj2, boolean z4, int i10) {
        this.f13025a = i10;
        this.d = obj;
        this.f13027c = obj2;
        this.f13026b = z4;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.p2 b10Var;
        String formatPluralString;
        int i12;
        String formatPluralString2;
        int i13 = this.f13025a;
        boolean z4 = this.f13026b;
        Object obj = this.f13027c;
        Object obj2 = this.d;
        switch (i13) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z4), (String) obj);
                return;
            case 1:
                ((kh.i5) obj2).run(Boolean.valueOf(z4), (String) obj);
                return;
            case 2:
                ((dh.v) obj2).run(Boolean.valueOf(z4), (String) obj);
                return;
            case 3:
                ((CameraController) obj2).lambda$initCamera$4(z4, (Runnable) obj);
                return;
            case 4:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z4);
                return;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.l5) {
                    org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
                    if (l5Var.f20428a) {
                        l5Var.f20428a = false;
                        l5Var.invalidate();
                    }
                }
                if (z4) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i14 = e6Var.f19669a;
                if (arrayList2 != null && (arrayList = org.telegram.ui.ActionBar.j6.I.Y) != null && !arrayList.isEmpty() && arrayList2.contains(org.telegram.ui.ActionBar.j6.I.k(false))) {
                    org.telegram.ui.ActionBar.j6.o1(true);
                }
                if (z4) {
                    if (e6Var.f19670b != null) {
                        NotificationCenter.getInstance(i14).addObserver(e6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i14).addObserver(e6Var, NotificationCenter.fileLoadFailed);
                        for (Map.Entry entry : e6Var.f19670b.entrySet()) {
                            FileLoader.getInstance(i14).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.d6) entry.getValue()).f19643a.document), "wallpaper", null, 0, 1);
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap = e6Var.f19670b;
                if (hashMap == null || hashMap.isEmpty()) {
                    NotificationCenter.getInstance(i14).removeObserver(e6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i14).removeObserver(e6Var, NotificationCenter.fileLoadFailed);
                    return;
                }
                return;
            case 7:
                ((xn) obj2).rc((MessageObject) obj, z4);
                return;
            case 8:
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (h6Var != null) {
                    org.telegram.ui.ActionBar.h6 k10 = i6Var.k(false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, Integer.valueOf(h6Var.f19761a));
                    if (z4) {
                        org.telegram.ui.ActionBar.j6.j0(i6Var, k10, true);
                        return;
                    }
                    return;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, i6Var, Boolean.FALSE, null, -1);
                return;
            case 9:
                TLObject tLObject = (TLObject) obj;
                xn xnVar = ((jn) obj2).f35381a;
                xnVar.f40245xb.b();
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet, false);
                    if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_inputStickerSetID.f19204id = stickerSet.f19211id;
                        if (z4) {
                            ArrayList arrayList3 = new ArrayList(1);
                            arrayList3.add(tL_inputStickerSetID);
                            mv mvVar = new mv(xnVar, xnVar.getParentActivity(), xnVar.f39968ba, arrayList3);
                            mvVar.setCalcMandatoryInsets(xnVar.x9());
                            xnVar.showDialog(mvVar);
                            return;
                        }
                        xx0 xx0Var = new xx0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.V, xnVar.f39968ba);
                        xx0Var.setCalcMandatoryInsets(xnVar.x9());
                        xnVar.showDialog(xx0Var);
                        return;
                    }
                    return;
                }
                qc a02 = qc.a0(xnVar);
                int i15 = R.raw.error;
                if (z4) {
                    i10 = R.string.AddEmojiNotFound;
                } else {
                    i10 = R.string.AddStickersNotFound;
                }
                a02.Q(i15, 36, LocaleController.getString(i10)).k(true);
                return;
            case 10:
                ap apVar = (ap) obj2;
                cp cpVar = apVar.f32684a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cpVar.getContext(), 0, cpVar.f28750m2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f19503a;
                d2Var2.O = string;
                d2Var2.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(apVar, (TLRPC.TL_username) obj, z4, 4));
                alertDialog$Builder.o();
                return;
            case 11:
                mp mpVar = (mp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                qp qpVar = mpVar.f36365x.d;
                qpVar.L = false;
                if (!z4 && chat.join_request) {
                    chat.join_request = false;
                    qpVar.M = true;
                    qpVar.getMessagesController().toggleChatJoinRequest(chat.f19184id, false, new lp(mpVar, 1), new hp(4, mpVar, chat));
                    return;
                }
                return;
            case 12:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z4, (String) obj);
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((li) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(1, editTextBoldCursor));
                    return;
                }
                return;
            case 14:
                ((c10) obj2).R((z00) obj, !z4);
                return;
            case 15:
                da0 da0Var = (da0) obj2;
                da0Var.getMessagesController().getStoriesController().o0(da0Var.e, (ArrayList) obj, this.f13026b, null);
                return;
            case 16:
                vd0 vd0Var = (vd0) obj2;
                dc0 dc0Var = (dc0) obj;
                if (z4) {
                    dc0Var.x(true);
                } else {
                    dc0Var.y();
                }
                vd0Var.b(dc0Var);
                return;
            case 17:
                dh.c cVar = (dh.c) obj2;
                dc0 dc0Var2 = (dc0) obj;
                if (z4) {
                    dc0Var2.x(true);
                } else {
                    dc0Var2.y();
                }
                ((vd0) cVar.f4886b).b(dc0Var2);
                return;
            case 18:
                eh0 eh0Var = (eh0) obj2;
                g61 g61Var = eh0Var.f24578c;
                ArrayList arrayList4 = (ArrayList) obj;
                if (z4) {
                    arrayList4 = eh0Var.e;
                }
                if (!arrayList4.isEmpty()) {
                    if (g61Var.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < g61Var.getChildCount(); i16++) {
                            if (!(g61Var.getChildAt(i16) instanceof t00)) {
                            }
                        }
                        return;
                    }
                    eh0Var.a(false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                if (z4) {
                    tVar.f29949x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.f29953z0 = null;
                return;
            case 20:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                oy oyVar = ((ow) obj2).f36989b;
                if (z4) {
                    b10Var = new FiltersSetupActivity();
                } else {
                    b10Var = new b10(dialogFilter, null);
                }
                oyVar.presentFragment(b10Var);
                return;
            case 21:
                ArrayList arrayList5 = (ArrayList) obj;
                oy oyVar2 = ((ow) obj2).f36989b;
                int i17 = 0;
                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i18);
                    if (dialog != null) {
                        NotificationsController notificationsController = oyVar2.getNotificationsController();
                        long j10 = dialog.f19188id;
                        if (z4) {
                            i12 = 3;
                        } else {
                            i12 = 4;
                        }
                        notificationsController.setDialogNotificationsSettings(j10, 0L, i12);
                        i17++;
                    }
                }
                qb qbVar = new qb(oyVar2.getParentActivity(), null);
                TextView textView = qbVar.f28100b;
                if (z4) {
                    formatPluralString = LocaleController.formatPluralString("NotificationsMutedHintChats", i17, new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("NotificationsUnmutedHintChats", i17, new Object[0]);
                }
                textView.setText(formatPluralString);
                if (z4) {
                    qbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    qbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ic.g(oyVar2, qbVar, 1500).j();
                return;
            case 22:
                ((yz) obj2).Z((z00) obj, !z4);
                return;
            case 23:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new h80(languageSelectActivity, 1), 10L);
                    return;
                }
                return;
            case 24:
                Pattern pattern = LaunchActivity.f31612y1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.p2) obj, z4, false);
                return;
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                BetaUpdate betaUpdate = (BetaUpdate) obj;
                Pattern pattern2 = LaunchActivity.f31612y1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update != null && !ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    if (z4 || betaUpdate == null || update.higherThan(betaUpdate)) {
                        ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.L);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                dn0.Y((dn0) obj2, z4, (String) obj);
                return;
            case 27:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                dn0 dn0Var = ((pm0) obj2).e;
                if (z4) {
                    UserConfig.getInstance(dn0.r0(dn0Var)).resetSavedPassword();
                    dn0Var.K0 = 0;
                    dn0Var.R1();
                    ViewGroup[] viewGroupArr = dn0Var.W;
                    if (viewGroupArr != null && viewGroupArr[0].getVisibility() == 0) {
                        dn0Var.V[0].requestFocus();
                        AndroidUtilities.showKeyboard(dn0Var.V[0]);
                        return;
                    }
                    return;
                }
                dn0Var.N1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    dn0Var.A1(true);
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    dn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    dn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 28:
                fq0.U((fq0) obj2, (TLObject) obj, z4);
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                View view2 = (View) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                if (!z4) {
                    photoViewer.getClass();
                    view2.setVisibility(8);
                }
                photoViewer.s3();
                return;
        }
    }

    public r5(Object obj, boolean z4, Object obj2, int i10) {
        this.f13025a = i10;
        this.d = obj;
        this.f13026b = z4;
        this.f13027c = obj2;
    }
}
