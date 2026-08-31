package mh;

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
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ap;
import org.telegram.ui.b10;
import org.telegram.ui.dp;
import org.telegram.ui.fn0;
import org.telegram.ui.hq0;
import org.telegram.ui.i80;
import org.telegram.ui.jn;
import org.telegram.ui.lp;
import org.telegram.ui.mp;
import org.telegram.ui.np;
import org.telegram.ui.pw;
import org.telegram.ui.py;
import org.telegram.ui.rm0;
import org.telegram.ui.rp;
import org.telegram.ui.xn;
import org.telegram.ui.zz;
public final class r5 implements Runnable {
    public final int f14688a;
    public final boolean f14689b;
    public final Object f14690c;
    public final Object d;

    public r5(Object obj, Object obj2, boolean z4, int i10) {
        this.f14688a = i10;
        this.d = obj;
        this.f14690c = obj2;
        this.f14689b = z4;
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
        int i13 = this.f14688a;
        boolean z4 = this.f14689b;
        Object obj = this.f14690c;
        Object obj2 = this.d;
        switch (i13) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z4), (String) obj);
                return;
            case 1:
                ((lh.i5) obj2).run(Boolean.valueOf(z4), (String) obj);
                return;
            case 2:
                ((eh.w) obj2).run(Boolean.valueOf(z4), (String) obj);
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
                if (view instanceof org.telegram.ui.ActionBar.m5) {
                    org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) view;
                    if (m5Var.f22136a) {
                        m5Var.f22136a = false;
                        m5Var.invalidate();
                    }
                }
                if (z4) {
                    d2Var.dismiss();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int i14 = f6Var.f21365a;
                if (arrayList2 != null && (arrayList = org.telegram.ui.ActionBar.k6.I.Y) != null && !arrayList.isEmpty() && arrayList2.contains(org.telegram.ui.ActionBar.k6.I.k(false))) {
                    org.telegram.ui.ActionBar.k6.o1(true);
                }
                if (z4) {
                    if (f6Var.f21366b != null) {
                        NotificationCenter.getInstance(i14).addObserver(f6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i14).addObserver(f6Var, NotificationCenter.fileLoadFailed);
                        for (Map.Entry entry : f6Var.f21366b.entrySet()) {
                            FileLoader.getInstance(i14).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.e6) entry.getValue()).f21334a.document), "wallpaper", null, 0, 1);
                        }
                        return;
                    }
                    return;
                }
                HashMap hashMap = f6Var.f21366b;
                if (hashMap == null || hashMap.isEmpty()) {
                    NotificationCenter.getInstance(i14).removeObserver(f6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i14).removeObserver(f6Var, NotificationCenter.fileLoadFailed);
                    return;
                }
                return;
            case 7:
                ((xn) obj2).rc((MessageObject) obj, z4);
                return;
            case 8:
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                if (i6Var != null) {
                    org.telegram.ui.ActionBar.i6 k10 = j6Var.k(false);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var, Boolean.FALSE, null, Integer.valueOf(i6Var.f21467a));
                    if (z4) {
                        org.telegram.ui.ActionBar.k6.j0(j6Var, k10, true);
                        return;
                    }
                    return;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var, Boolean.FALSE, null, -1);
                return;
            case 9:
                TLObject tLObject = (TLObject) obj;
                xn xnVar = ((jn) obj2).f38188a;
                xnVar.f43414xb.b();
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet, false);
                    if (xnVar.getParentActivity() != null && xnVar.getParentActivity() != null) {
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                        tL_inputStickerSetID.f20863id = stickerSet.f20870id;
                        if (z4) {
                            ArrayList arrayList3 = new ArrayList(1);
                            arrayList3.add(tL_inputStickerSetID);
                            ov ovVar = new ov(xnVar, xnVar.getParentActivity(), xnVar.f43136ba, arrayList3);
                            ovVar.setCalcMandatoryInsets(xnVar.x9());
                            xnVar.showDialog(ovVar);
                            return;
                        }
                        yx0 yx0Var = new yx0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.V, xnVar.f43136ba);
                        yx0Var.setCalcMandatoryInsets(xnVar.x9());
                        xnVar.showDialog(yx0Var);
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
                dp dpVar = apVar.f35224a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dpVar.getContext(), 0, dpVar.f31383m2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f21166a;
                d2Var2.O = string;
                d2Var2.Q = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new com.google.firebase.messaging.i(apVar, (TLRPC.TL_username) obj, z4, 4));
                alertDialog$Builder.o();
                return;
            case 11:
                np npVar = (np) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                rp rpVar = npVar.f39500x.d;
                rpVar.L = false;
                if (!z4 && chat.join_request) {
                    chat.join_request = false;
                    rpVar.M = true;
                    rpVar.getMessagesController().toggleChatJoinRequest(chat.f20843id, false, new lp(npVar, 1), new mp(3, npVar, chat));
                    return;
                }
                return;
            case 12:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z4, (String) obj);
                return;
            case 13:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((mi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z4) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q1(1, editTextBoldCursor));
                    return;
                }
                return;
            case 14:
                ((d10) obj2).R((a10) obj, !z4);
                return;
            case 15:
                fa0 fa0Var = (fa0) obj2;
                fa0Var.getMessagesController().getStoriesController().o0(fa0Var.f26853e, (ArrayList) obj, this.f14689b, null);
                return;
            case 16:
                xd0 xd0Var = (xd0) obj2;
                fc0 fc0Var = (fc0) obj;
                if (z4) {
                    fc0Var.x(true);
                } else {
                    fc0Var.y();
                }
                xd0Var.b(fc0Var);
                return;
            case 17:
                eh.c cVar = (eh.c) obj2;
                fc0 fc0Var2 = (fc0) obj;
                if (z4) {
                    fc0Var2.x(true);
                } else {
                    fc0Var2.y();
                }
                ((xd0) cVar.f5618b).b(fc0Var2);
                return;
            case 18:
                gh0 gh0Var = (gh0) obj2;
                i61 i61Var = gh0Var.f27194c;
                ArrayList arrayList4 = (ArrayList) obj;
                if (z4) {
                    arrayList4 = gh0Var.f27195e;
                }
                if (!arrayList4.isEmpty()) {
                    if (i61Var.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < i61Var.getChildCount(); i16++) {
                            if (!(i61Var.getChildAt(i16) instanceof u00)) {
                            }
                        }
                        return;
                    }
                    gh0Var.a(false);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                if (z4) {
                    uVar.f32391x.removeView(uVar2);
                }
                uVar2.setVisibility(8);
                uVar.f32395z0 = null;
                return;
            case 20:
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj;
                py pyVar = ((pw) obj2).f40168b;
                if (z4) {
                    b10Var = new FiltersSetupActivity();
                } else {
                    b10Var = new b10(dialogFilter, null);
                }
                pyVar.presentFragment(b10Var);
                return;
            case 21:
                ArrayList arrayList5 = (ArrayList) obj;
                py pyVar2 = ((pw) obj2).f40168b;
                int i17 = 0;
                for (int i18 = 0; i18 < arrayList5.size(); i18++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList5.get(i18);
                    if (dialog != null) {
                        NotificationsController notificationsController = pyVar2.getNotificationsController();
                        long j10 = dialog.f20847id;
                        if (z4) {
                            i12 = 3;
                        } else {
                            i12 = 4;
                        }
                        notificationsController.setDialogNotificationsSettings(j10, 0L, i12);
                        i17++;
                    }
                }
                qb qbVar = new qb(pyVar2.getParentActivity(), null);
                TextView textView = qbVar.f30359b;
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
                ic.g(pyVar2, qbVar, 1500).j();
                return;
            case 22:
                ((zz) obj2).Z((a10) obj, !z4);
                return;
            case 23:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                if (!z4) {
                    AndroidUtilities.runOnUIThread(new i80(languageSelectActivity, 1), 10L);
                    return;
                }
                return;
            case 24:
                Pattern pattern = LaunchActivity.f34134y1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.p2) obj, z4, false);
                return;
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                BetaUpdate betaUpdate = (BetaUpdate) obj;
                Pattern pattern2 = LaunchActivity.f34134y1;
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
                fn0.Y((fn0) obj2, z4, (String) obj);
                return;
            case 27:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                fn0 fn0Var = ((rm0) obj2).f40996e;
                if (z4) {
                    UserConfig.getInstance(fn0.r0(fn0Var)).resetSavedPassword();
                    fn0Var.K0 = 0;
                    fn0Var.R1();
                    ViewGroup[] viewGroupArr = fn0Var.W;
                    if (viewGroupArr != null && viewGroupArr[0].getVisibility() == 0) {
                        fn0Var.V[0].requestFocus();
                        AndroidUtilities.showKeyboard(fn0Var.V[0]);
                        return;
                    }
                    return;
                }
                fn0Var.N1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    fn0Var.A1(true);
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString2 = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString2 = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    fn0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString2));
                    return;
                } else {
                    fn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            case 28:
                hq0.U((hq0) obj2, (TLObject) obj, z4);
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
        this.f14688a = i10;
        this.d = obj;
        this.f14689b = z4;
        this.f14690c = obj2;
    }
}
