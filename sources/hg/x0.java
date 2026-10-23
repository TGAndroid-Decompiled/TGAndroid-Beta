package hg;

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.sn;
public final class x0 implements Runnable {
    public final int f12129a;
    public final boolean f12130b;
    public final Object f12131c;
    public final Object d;
    public final Object e;
    public final Object f12132f;
    public final Object h;
    public final Object f12133n;
    public final Object f12134r;

    public x0(j1 j1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f12129a = 0;
        this.f12131c = j1Var;
        this.d = str;
        this.f12130b = z10;
        this.h = tLObject;
        this.f12133n = user;
        this.e = str2;
        this.f12134r = messagesStorage;
        this.f12132f = str3;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? r10;
        boolean z11;
        int i10;
        TextView textView;
        ?? r16;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        int i13 = this.f12129a;
        boolean z14 = this.f12130b;
        boolean z15 = true;
        Object obj = this.f12134r;
        Object obj2 = this.f12133n;
        Object obj3 = this.h;
        Object obj4 = this.f12132f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f12131c;
        switch (i13) {
            case 0:
                j1 j1Var = (j1) obj7;
                String str = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str2 = (String) obj5;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                String str3 = (String) obj4;
                eb0 eb0Var = j1Var.V;
                if (str.equals(j1Var.f11967r0)) {
                    j1Var.f11971u0 = 0;
                    if (z14 && tLObject == null) {
                        j1Var.T(false, user, str, str2);
                    } else if (eb0Var != null) {
                        eb0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z14 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        j1Var.f11969s0 = tL_messages_botResults.next_offset;
                        if (j1Var.T == null) {
                            j1Var.T = tL_messages_botResults.switch_pm;
                        }
                        j1Var.U = tL_messages_botResults.switch_webview;
                        int i14 = 0;
                        while (i14 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i14);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i14);
                                i14--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i14++;
                        }
                        if (j1Var.R != null && str2.length() != 0) {
                            j1Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                j1Var.f11969s0 = "";
                            }
                            z10 = true;
                        } else {
                            j1Var.R = tL_messages_botResults.results;
                            j1Var.f11976x0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        ei.z1 z1Var = j1Var.f11964p0;
                        if (z1Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(z1Var);
                            r10 = 0;
                            j1Var.f11964p0 = null;
                        } else {
                            r10 = 0;
                        }
                        j1Var.I = r10;
                        j1Var.A0 = r10;
                        j1Var.f11975x = r10;
                        j1Var.f11977y = r10;
                        j1Var.J = r10;
                        j1Var.Q = r10;
                        j1Var.M = r10;
                        j1Var.N = r10;
                        j1Var.K = r10;
                        j1Var.P = r10;
                        j1Var.f11963o0 = false;
                        if (j1Var.R.isEmpty() && j1Var.T == null && j1Var.U == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        eb0Var.a(z11);
                        if (z10) {
                            if (j1Var.T == null && j1Var.U == null) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            j1Var.m(((j1Var.R.size() - tL_messages_botResults.results.size()) + i10) - 1);
                            j1Var.s((j1Var.R.size() - tL_messages_botResults.results.size()) + i10, tL_messages_botResults.results.size());
                            return;
                        }
                        j1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ContactsController) obj7).lambda$performSyncPhoneBook$19((HashMap) obj6, (HashMap) obj5, this.f12130b, (HashMap) obj4, (ArrayList) obj3, (HashMap) obj2, (boolean[]) obj);
                return;
            case 2:
                ((MediaDataController) obj7).lambda$broadcastPinnedMessage$169((ArrayList) obj6, this.f12130b, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj3, (a0.h) obj2, (a0.h) obj);
                return;
            case 3:
                ((SendMessagesHelper) obj7).lambda$sendCallback$46((TLRPC.TL_error) obj6, (TLObject) obj3, (TwoStepVerificationActivity) obj5, this.f12130b, (MessageObject) obj4, (TL_keyboard.KeyboardButtonProto) obj2, (sn) obj);
                return;
            case 4:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.f12130b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                return;
            default:
                ei.d dVar = (ei.d) obj7;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj6;
                org.telegram.ui.Wallet.e2 e2Var = l0Var.f34745g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.z1 z1Var2 = (org.telegram.ui.Wallet.z1) obj4;
                TextView textView2 = (TextView) obj3;
                w9 w9Var = (w9) obj2;
                TextView textView3 = (TextView) obj;
                if (z14) {
                    dVar.setEnabled((!l0Var.E() || l0Var.s() == null || l0Var.x() == null || dVar.Q) ? false : false);
                    return;
                }
                ArrayList arrayList = e2Var.d;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size) {
                        Object obj8 = arrayList.get(i15);
                        i15++;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                        textView = textView3;
                        r16 = 0;
                        ArrayList arrayList2 = arrayList;
                        if (tonconnectsession2.f20601id == tonconnectsession.f20601id) {
                            z1Var2.e = tonconnectsession2;
                        } else {
                            textView3 = textView;
                            arrayList = arrayList2;
                        }
                    } else {
                        textView = textView3;
                        r16 = 0;
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = z1Var2.e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z12 = true;
                } else {
                    z12 = r16;
                }
                if (z12 && !z1Var2.f35485f) {
                    z13 = true;
                } else {
                    z13 = r16;
                }
                dVar.setEnabled(z13);
                TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                if (tonconnectmanifest != null) {
                    int i16 = R.string.WalletConnectToApp;
                    Object[] objArr = new Object[1];
                    objArr[r16] = tonconnectmanifest.name;
                    textView2.setText(LocaleController.formatSpannable(i16, objArr));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        w9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    int i17 = R.string.WalletTonConnectManifestLoadFailed;
                    Object[] objArr2 = new Object[1];
                    objArr2[r16] = num;
                    textView.setText(LocaleController.formatString(i17, objArr2));
                    return;
                } else if (!z12) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i12 = R.string.Loading;
                    } else {
                        i12 = R.string.WalletTonConnectSessionClosed;
                    }
                    textView.setText(LocaleController.getString(i12));
                    return;
                } else {
                    e2Var.getClass();
                    if (org.telegram.ui.Wallet.e2.u(z1Var2)) {
                        i11 = R.string.WalletConnectProofInfo;
                    } else {
                        i11 = R.string.WalletConnectInfo;
                    }
                    textView.setText(LocaleController.getString(i11));
                    return;
                }
        }
    }

    public x0(Object obj, Object obj2, Object obj3, boolean z10, Serializable serializable, Object obj4, Object obj5, Object obj6, int i10) {
        this.f12129a = i10;
        this.f12131c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f12130b = z10;
        this.f12132f = serializable;
        this.h = obj4;
        this.f12133n = obj5;
        this.f12134r = obj6;
    }

    public x0(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.f12129a = 2;
        this.f12131c = mediaDataController;
        this.d = arrayList;
        this.f12130b = z10;
        this.e = arrayList2;
        this.f12132f = arrayList3;
        this.h = arrayList4;
        this.f12133n = hVar;
        this.f12134r = hVar2;
    }

    public x0(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f12129a = 3;
        this.f12131c = sendMessagesHelper;
        this.d = tL_error;
        this.h = tLObject;
        this.e = twoStepVerificationActivity;
        this.f12130b = z10;
        this.f12132f = messageObject;
        this.f12133n = keyboardButtonProto;
        this.f12134r = snVar;
    }

    public x0(boolean z10, ei.d dVar, org.telegram.ui.Wallet.l0 l0Var, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.z1 z1Var, TextView textView, w9 w9Var, TextView textView2) {
        this.f12129a = 5;
        this.f12130b = z10;
        this.f12131c = dVar;
        this.d = l0Var;
        this.e = tonconnectsession;
        this.f12132f = z1Var;
        this.h = textView;
        this.f12133n = w9Var;
        this.f12134r = textView2;
    }
}
