package gg;

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
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.zn;
public final class x0 implements Runnable {
    public final int f10857a;
    public final boolean f10858b;
    public final Object f10859c;
    public final Object d;
    public final Object f10860e;
    public final Object f10861f;
    public final Object h;
    public final Object f10862n;
    public final Object f10863r;

    public x0(j1 j1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f10857a = 0;
        this.f10859c = j1Var;
        this.d = str;
        this.f10858b = z10;
        this.h = tLObject;
        this.f10862n = user;
        this.f10860e = str2;
        this.f10863r = messagesStorage;
        this.f10861f = str3;
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
        int i13 = this.f10857a;
        boolean z14 = this.f10858b;
        boolean z15 = true;
        Object obj = this.f10863r;
        Object obj2 = this.f10862n;
        Object obj3 = this.h;
        Object obj4 = this.f10861f;
        Object obj5 = this.f10860e;
        Object obj6 = this.d;
        Object obj7 = this.f10859c;
        switch (i13) {
            case 0:
                j1 j1Var = (j1) obj7;
                String str = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str2 = (String) obj5;
                MessagesStorage messagesStorage = (MessagesStorage) obj;
                String str3 = (String) obj4;
                kb0 kb0Var = j1Var.V;
                if (str.equals(j1Var.f10686r0)) {
                    j1Var.f10690u0 = 0;
                    if (z14 && tLObject == null) {
                        j1Var.T(false, user, str, str2);
                    } else if (kb0Var != null) {
                        kb0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z14 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        j1Var.f10688s0 = tL_messages_botResults.next_offset;
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
                                j1Var.f10688s0 = "";
                            }
                            z10 = true;
                        } else {
                            j1Var.R = tL_messages_botResults.results;
                            j1Var.f10695x0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        t tVar = j1Var.f10683p0;
                        if (tVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(tVar);
                            r10 = 0;
                            j1Var.f10683p0 = null;
                        } else {
                            r10 = 0;
                        }
                        j1Var.I = r10;
                        j1Var.A0 = r10;
                        j1Var.f10694x = r10;
                        j1Var.f10696y = r10;
                        j1Var.J = r10;
                        j1Var.Q = r10;
                        j1Var.M = r10;
                        j1Var.N = r10;
                        j1Var.K = r10;
                        j1Var.P = r10;
                        j1Var.f10682o0 = false;
                        if (j1Var.R.isEmpty() && j1Var.T == null && j1Var.U == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        kb0Var.a(z11);
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
                ((ContactsController) obj7).lambda$performSyncPhoneBook$19((HashMap) obj6, (HashMap) obj5, this.f10858b, (HashMap) obj4, (ArrayList) obj3, (HashMap) obj2, (boolean[]) obj);
                return;
            case 2:
                ((MediaDataController) obj7).lambda$broadcastPinnedMessage$169((ArrayList) obj6, this.f10858b, (ArrayList) obj5, (ArrayList) obj4, (ArrayList) obj3, (a0.i) obj2, (a0.i) obj);
                return;
            case 3:
                ((SendMessagesHelper) obj7).lambda$sendCallback$46((TLRPC.TL_error) obj6, (TLObject) obj3, (TwoStepVerificationActivity) obj5, this.f10858b, (MessageObject) obj4, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj);
                return;
            case 4:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.f10858b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                return;
            default:
                ci.d dVar = (ci.d) obj7;
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj6;
                org.telegram.ui.Wallet.f2 f2Var = l0Var.f35224g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.a2 a2Var = (org.telegram.ui.Wallet.a2) obj4;
                TextView textView2 = (TextView) obj3;
                y9 y9Var = (y9) obj2;
                TextView textView3 = (TextView) obj;
                if (z14) {
                    dVar.setEnabled((!l0Var.D() || l0Var.r() == null || l0Var.w() == null || dVar.N) ? false : false);
                    return;
                }
                ArrayList arrayList = f2Var.d;
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
                        if (tonconnectsession2.f20329id == tonconnectsession.f20329id) {
                            a2Var.f34685e = tonconnectsession2;
                        } else {
                            textView3 = textView;
                            arrayList = arrayList2;
                        }
                    } else {
                        textView = textView3;
                        r16 = 0;
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = a2Var.f34685e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z12 = true;
                } else {
                    z12 = r16;
                }
                if (z12 && !a2Var.f34686f) {
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
                        y9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "76_76", null, tonconnectsession3.manifest);
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
                    f2Var.getClass();
                    if (org.telegram.ui.Wallet.f2.u(a2Var)) {
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
        this.f10857a = i10;
        this.f10859c = obj;
        this.d = obj2;
        this.f10860e = obj3;
        this.f10858b = z10;
        this.f10861f = serializable;
        this.h = obj4;
        this.f10862n = obj5;
        this.f10863r = obj6;
    }

    public x0(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.i iVar, a0.i iVar2) {
        this.f10857a = 2;
        this.f10859c = mediaDataController;
        this.d = arrayList;
        this.f10858b = z10;
        this.f10860e = arrayList2;
        this.f10861f = arrayList3;
        this.h = arrayList4;
        this.f10862n = iVar;
        this.f10863r = iVar2;
    }

    public x0(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f10857a = 3;
        this.f10859c = sendMessagesHelper;
        this.d = tL_error;
        this.h = tLObject;
        this.f10860e = twoStepVerificationActivity;
        this.f10858b = z10;
        this.f10861f = messageObject;
        this.f10862n = keyboardButtonProto;
        this.f10863r = znVar;
    }

    public x0(boolean z10, ci.d dVar, org.telegram.ui.Wallet.l0 l0Var, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.a2 a2Var, TextView textView, y9 y9Var, TextView textView2) {
        this.f10857a = 5;
        this.f10858b = z10;
        this.f10859c = dVar;
        this.d = l0Var;
        this.f10860e = tonconnectsession;
        this.f10861f = a2Var;
        this.h = textView;
        this.f10862n = y9Var;
        this.f10863r = textView2;
    }
}
