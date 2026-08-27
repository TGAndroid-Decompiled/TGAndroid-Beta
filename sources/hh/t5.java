package hh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.q00;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dn;
import org.telegram.ui.ep;
import org.telegram.ui.fp;
import org.telegram.ui.gw;
import org.telegram.ui.gy;
import org.telegram.ui.jp;
import org.telegram.ui.km0;
import org.telegram.ui.oz;
import org.telegram.ui.rd;
import org.telegram.ui.rn;
import org.telegram.ui.uo;
import org.telegram.ui.wo;
import org.telegram.ui.xm0;
import org.telegram.ui.z70;

public final class t5 implements Runnable {

    public final int f10075a;

    public final boolean f10076b;

    public final Object f10077c;
    public final Object d;

    public t5(Object obj, Object obj2, boolean z10, int i10) {
        this.f10075a = i10;
        this.d = obj;
        this.f10077c = obj2;
        this.f10076b = z10;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i10 = this.f10075a;
        int i11 = 4;
        SQLiteCursor sQLiteCursorQueryFinalized = null;
        int i12 = 1;
        boolean z10 = this.f10076b;
        Object obj = this.f10077c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((Utilities.Callback2) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 1:
                ((gh.p5) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 2:
                ((cg.u0) obj2).run(Boolean.valueOf(z10), (String) obj);
                return;
            case 3:
                MessagesStorage messagesStorage = (MessagesStorage) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        SQLiteDatabase database = messagesStorage.getDatabase();
                        if (database == null) {
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        StringBuilder sb2 = new StringBuilder("SELECT id, data, type FROM story_drafts WHERE type = ");
                        sb2.append(z10 ? "2" : "0 OR type = 1");
                        sb2.append(" ORDER BY date DESC");
                        sQLiteCursorQueryFinalized = database.queryFinalized(sb2.toString(), new Object[0]);
                        while (sQLiteCursorQueryFinalized.next()) {
                            long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                            NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized.byteBufferValue(1);
                            if (nativeByteBufferByteBufferValue != null) {
                                try {
                                    lh.z0 z0Var = new lh.z0(nativeByteBufferByteBufferValue);
                                    z0Var.f17139a = jLongValue;
                                    arrayList2.add(z0Var);
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    arrayList3.add(Long.valueOf(jLongValue));
                                }
                                nativeByteBufferByteBufferValue.reuse();
                                break;
                            }
                        }
                        sQLiteCursorQueryFinalized.dispose();
                        if (arrayList3.size() > 0) {
                            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                database.executeFast("DELETE FROM story_drafts WHERE id = " + arrayList3.get(i13)).stepThis().dispose();
                            }
                        }
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        if (sQLiteCursorQueryFinalized != null) {
                        }
                        AndroidUtilities.runOnUIThread(new jh.p6(18, callback, arrayList2));
                        return;
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    AndroidUtilities.runOnUIThread(new jh.p6(18, callback, arrayList2));
                    return;
                } catch (Throwable th) {
                    if (sQLiteCursorQueryFinalized != null) {
                        sQLiteCursorQueryFinalized.dispose();
                    }
                    throw th;
                }
            case 4:
                lh.o3 o3Var = (lh.o3) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = o3Var.f16470c;
                if (tLObject instanceof TLRPC.messages_BotResults) {
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                    o3Var.h = messages_botresults.next_offset;
                    if (z10) {
                        arrayList4.clear();
                    }
                    for (int i14 = 0; i14 < messages_botresults.results.size(); i14++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i14);
                        TLRPC.Document document = botInlineResult.document;
                        if (document != null) {
                            arrayList4.add(document);
                        } else {
                            TLRPC.Photo photo = botInlineResult.photo;
                            if (photo != null) {
                                arrayList4.add(photo);
                            } else if (botInlineResult.content != null) {
                                arrayList4.add(botInlineResult);
                            }
                        }
                    }
                    o3Var.d = false;
                    o3Var.F(false);
                    o3Var.l();
                    return;
                }
                return;
            case 5:
                ((CameraController) obj2).lambda$initCamera$4(z10, (Runnable) obj);
                return;
            case 6:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$52((ArrayList) obj, z10);
                return;
            case 7:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                View view = (View) obj;
                if (view instanceof org.telegram.ui.ActionBar.i5) {
                    org.telegram.ui.ActionBar.i5 i5Var = (org.telegram.ui.ActionBar.i5) view;
                    if (i5Var.f23510a) {
                        i5Var.f23510a = false;
                        i5Var.invalidate();
                    }
                }
                if (z10) {
                    b2Var.dismiss();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                int i15 = b6Var.f22787a;
                if (arrayList5 != null && (arrayList = org.telegram.ui.ActionBar.g6.I.X) != null && !arrayList.isEmpty() && arrayList5.contains(org.telegram.ui.ActionBar.g6.I.k(false))) {
                    org.telegram.ui.ActionBar.g6.o1(true);
                }
                if (!z10) {
                    HashMap map = b6Var.f22788b;
                    if (map == null || map.isEmpty()) {
                        NotificationCenter.getInstance(i15).removeObserver(b6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i15).removeObserver(b6Var, NotificationCenter.fileLoadFailed);
                        return;
                    }
                    return;
                }
                if (b6Var.f22788b != null) {
                    NotificationCenter.getInstance(i15).addObserver(b6Var, NotificationCenter.fileLoaded);
                    NotificationCenter.getInstance(i15).addObserver(b6Var, NotificationCenter.fileLoadFailed);
                    Iterator it = b6Var.f22788b.entrySet().iterator();
                    while (it.hasNext()) {
                        FileLoader.getInstance(i15).loadFile(ImageLocation.getForDocument(((org.telegram.ui.ActionBar.a6) ((Map.Entry) it.next()).getValue()).f22734a.document), "wallpaper", null, 0, 1);
                    }
                    return;
                }
                return;
            case 9:
                ((rn) obj2).rc((MessageObject) obj, z10);
                return;
            case 10:
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (e6Var == null) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, -1);
                    return;
                }
                org.telegram.ui.ActionBar.e6 e6VarK = f6Var.k(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, f6Var, Boolean.FALSE, null, Integer.valueOf(e6Var.f22883a));
                if (z10) {
                    org.telegram.ui.ActionBar.g6.j0(f6Var, e6VarK, true);
                    return;
                }
                return;
            case 11:
                TLObject tLObject2 = (TLObject) obj;
                rn rnVar = ((dn) obj2).f37446a;
                rnVar.wb.b();
                if (!(tLObject2 instanceof TLRPC.TL_messages_stickerSet)) {
                    mc.a0(rnVar).Q(R.raw.error, 36, LocaleController.getString(z10 ? R.string.AddEmojiNotFound : R.string.AddStickersNotFound)).k(true);
                    return;
                }
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount).putStickerSet(tL_messages_stickerSet, false);
                if (rnVar.getParentActivity() == null || rnVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                tL_inputStickerSetID.access_hash = stickerSet.access_hash;
                tL_inputStickerSetID.f22400id = stickerSet.f22407id;
                if (!z10) {
                    ex0 ex0Var = new ex0(rnVar.getParentActivity(), rnVar, tL_inputStickerSetID, null, rnVar.U, rnVar.f41983aa);
                    ex0Var.setCalcMandatoryInsets(rnVar.x9());
                    rnVar.showDialog(ex0Var);
                    return;
                } else {
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(tL_inputStickerSetID);
                    cv cvVar = new cv(rnVar, rnVar.getParentActivity(), rnVar.f41983aa, arrayList6);
                    cvVar.setCalcMandatoryInsets(rnVar.x9());
                    rnVar.showDialog(cvVar);
                    return;
                }
            case 12:
                uo uoVar = (uo) obj2;
                wo woVar = uoVar.f43265a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(woVar.getContext(), 0, woVar.f35277l2);
                String string = LocaleController.getString(R.string.UsernameActivateErrorTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
                b2Var2.N = string;
                b2Var2.P = LocaleController.getString(R.string.UsernameActivateErrorMessage);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new b5.d(uoVar, (TLRPC.TL_username) obj, z10, i11));
                alertDialog$Builder.o();
                return;
            case 13:
                fp fpVar = (fp) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                jp jpVar = fpVar.f38179x.d;
                jpVar.K = false;
                if (z10 || !chat.join_request) {
                    return;
                }
                chat.join_request = false;
                jpVar.L = true;
                jpVar.getMessagesController().toggleChatJoinRequest(chat.f22380id, false, new ep(fpVar, i12), new rd(28, fpVar, chat));
                return;
            case 14:
                AnimatedPhoneNumberEditText.j((AnimatedPhoneNumberEditText) obj2, z10, (String) obj);
                return;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((gi) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                if (z10) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p1(i12, editTextBoldCursor));
                    return;
                }
                return;
            case 16:
                ((q00) obj2).R((n00) obj, !z10);
                return;
            case 17:
                o90 o90Var = (o90) obj2;
                o90Var.getMessagesController().getStoriesController().o0(o90Var.f31239e, (ArrayList) obj, this.f10076b, null);
                return;
            case 18:
                dd0 dd0Var = (dd0) obj2;
                nb0 nb0Var = (nb0) obj;
                if (z10) {
                    nb0Var.x(true);
                } else {
                    nb0Var.y();
                }
                dd0Var.b(nb0Var);
                return;
            case 19:
                ch.e eVar = (ch.e) obj2;
                nb0 nb0Var2 = (nb0) obj;
                if (z10) {
                    nb0Var2.x(true);
                } else {
                    nb0Var2.y();
                }
                ((dd0) eVar.f2910b).b(nb0Var2);
                return;
            case 20:
                mg0 mg0Var = (mg0) obj2;
                k51 k51Var = mg0Var.f30677c;
                ArrayList arrayList7 = (ArrayList) obj;
                if (z10) {
                    arrayList7 = mg0Var.f30678e;
                }
                if (arrayList7.isEmpty()) {
                    return;
                }
                if (k51Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < k51Var.getChildCount(); i16++) {
                        if (!(k51Var.getChildAt(i16) instanceof h00)) {
                        }
                    }
                    return;
                }
                mg0Var.a(false);
                return;
            case 21:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                if (z10) {
                    tVar.f33902x.removeView(tVar2);
                }
                tVar2.setVisibility(8);
                tVar.f33905y0 = null;
                return;
            case 22:
                ((gw) obj2).f38485b.presentFragment(z10 ? new FiltersSetupActivity() : new org.telegram.ui.q00((MessagesController.DialogFilter) obj, null));
                return;
            case 23:
                ArrayList arrayList8 = (ArrayList) obj;
                gy gyVar = ((gw) obj2).f38485b;
                int i17 = 0;
                for (int i18 = 0; i18 < arrayList8.size(); i18++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i18);
                    if (dialog != null) {
                        gyVar.getNotificationsController().setDialogNotificationsSettings(dialog.f22384id, 0L, z10 ? 3 : 4);
                        i17++;
                    }
                }
                mb mbVar = new mb(gyVar.getParentActivity(), null);
                mbVar.f30639b.setText(z10 ? LocaleController.formatPluralString("NotificationsMutedHintChats", i17, new Object[0]) : LocaleController.formatPluralString("NotificationsUnmutedHintChats", i17, new Object[0]));
                if (z10) {
                    mbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    mbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                ec.g(gyVar, mbVar, 1500).j();
                return;
            case 24:
                ((oz) obj2).Z((n00) obj, !z10);
                return;
            case 25:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                if (z10) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new z70(languageSelectActivity, 1), 10L);
                return;
            case 26:
                Pattern pattern = LaunchActivity.f35496x1;
                ((LaunchActivity) obj2).q0((org.telegram.ui.ActionBar.n2) obj, z10, false);
                return;
            case 27:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                BetaUpdate betaUpdate = (BetaUpdate) obj;
                Pattern pattern2 = LaunchActivity.f35496x1;
                BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
                    return;
                }
                if (z10 || betaUpdate == null || update.higherThan(betaUpdate)) {
                    ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(launchActivity, update, launchActivity.K);
                    return;
                }
                return;
            case 28:
                xm0.Y((xm0) obj2, z10, (String) obj);
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                xm0 xm0Var = ((km0) obj2).f39810e;
                if (z10) {
                    UserConfig.getInstance(((org.telegram.ui.ActionBar.n2) xm0Var).currentAccount).resetSavedPassword();
                    xm0Var.J0 = 0;
                    xm0Var.R1();
                    ViewGroup[] viewGroupArr = xm0Var.V;
                    if (viewGroupArr == null || viewGroupArr[0].getVisibility() != 0) {
                        return;
                    }
                    xm0Var.U[0].requestFocus();
                    AndroidUtilities.showKeyboard(xm0Var.U[0]);
                    return;
                }
                xm0Var.N1(true, false);
                if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                    xm0Var.A1(true);
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    xm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    xm0Var.M1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    return;
                }
        }
    }

    public t5(Object obj, boolean z10, Object obj2, int i10) {
        this.f10075a = i10;
        this.d = obj;
        this.f10076b = z10;
        this.f10077c = obj2;
    }
}
