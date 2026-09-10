package fg;

import android.hardware.Camera;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
public final class y0 implements Runnable {
    public final int f8265a;
    public final boolean f8266b;
    public final Object f8267c;
    public final Object d;
    public final Object e;
    public final Object f8268f;
    public final Object h;
    public final Object f8269n;
    public final Object f8270r;

    public y0(l1 l1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f8265a = 0;
        this.f8267c = l1Var;
        this.d = str;
        this.f8266b = z10;
        this.h = tLObject;
        this.f8269n = user;
        this.e = str2;
        this.f8270r = messagesStorage;
        this.f8268f = str3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f8265a) {
            case 0:
                l1 l1Var = (l1) this.f8267c;
                String str = (String) this.d;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.User user = (TLRPC.User) this.f8269n;
                String str2 = (String) this.e;
                MessagesStorage messagesStorage = (MessagesStorage) this.f8270r;
                String str3 = (String) this.f8268f;
                sa0 sa0Var = l1Var.V;
                if (str.equals(l1Var.f8122r0)) {
                    int i10 = 0;
                    l1Var.f8126u0 = 0;
                    boolean z12 = this.f8266b;
                    if (z12 && tLObject == null) {
                        l1Var.T(false, user, str, str2);
                    } else if (sa0Var != null) {
                        sa0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z12 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        l1Var.f8124s0 = tL_messages_botResults.next_offset;
                        if (l1Var.T == null) {
                            l1Var.T = tL_messages_botResults.switch_pm;
                        }
                        l1Var.U = tL_messages_botResults.switch_webview;
                        int i11 = 0;
                        while (i11 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i11);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i11);
                                i11--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i11++;
                        }
                        if (l1Var.R != null && str2.length() != 0) {
                            l1Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                l1Var.f8124s0 = "";
                            }
                            z10 = true;
                        } else {
                            l1Var.R = tL_messages_botResults.results;
                            l1Var.f8131x0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        a3.k0 k0Var = l1Var.f8119p0;
                        if (k0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(k0Var);
                            l1Var.f8119p0 = null;
                        }
                        l1Var.I = null;
                        l1Var.A0 = null;
                        l1Var.f8130x = null;
                        l1Var.f8132y = null;
                        l1Var.J = null;
                        l1Var.Q = null;
                        l1Var.M = null;
                        l1Var.N = null;
                        l1Var.K = null;
                        l1Var.P = null;
                        l1Var.f8118o0 = false;
                        if (l1Var.R.isEmpty() && l1Var.T == null && l1Var.U == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        sa0Var.a(z11);
                        if (z10) {
                            i10 = (l1Var.T == null && l1Var.U == null) ? 1 : 1;
                            l1Var.m(((l1Var.R.size() - tL_messages_botResults.results.size()) + i10) - 1);
                            l1Var.s((l1Var.R.size() - tL_messages_botResults.results.size()) + i10, tL_messages_botResults.results.size());
                            return;
                        }
                        l1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ContactsController) this.f8267c).lambda$performSyncPhoneBook$19((HashMap) this.d, (HashMap) this.e, this.f8266b, (HashMap) this.f8268f, (ArrayList) this.h, (HashMap) this.f8269n, (boolean[]) this.f8270r);
                return;
            case 2:
                ((MediaDataController) this.f8267c).lambda$broadcastPinnedMessage$169((ArrayList) this.d, this.f8266b, (ArrayList) this.e, (ArrayList) this.f8268f, (ArrayList) this.h, (a0.i) this.f8269n, (a0.i) this.f8270r);
                return;
            case 3:
                ((SendMessagesHelper) this.f8267c).lambda$sendCallback$43((TLRPC.TL_error) this.d, (TLObject) this.h, (TwoStepVerificationActivity) this.e, this.f8266b, (MessageObject) this.f8268f, (TL_keyboard.KeyboardButtonProto) this.f8269n, (eo) this.f8270r);
                return;
            default:
                ((CameraController) this.f8267c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.f8266b, (File) this.f8268f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.f8269n, (Runnable) this.f8270r);
                return;
        }
    }

    public y0(Object obj, Object obj2, Object obj3, boolean z10, Serializable serializable, Object obj4, Object obj5, Object obj6, int i10) {
        this.f8265a = i10;
        this.f8267c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f8266b = z10;
        this.f8268f = serializable;
        this.h = obj4;
        this.f8269n = obj5;
        this.f8270r = obj6;
    }

    public y0(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.i iVar, a0.i iVar2) {
        this.f8265a = 2;
        this.f8267c = mediaDataController;
        this.d = arrayList;
        this.f8266b = z10;
        this.e = arrayList2;
        this.f8268f = arrayList3;
        this.h = arrayList4;
        this.f8269n = iVar;
        this.f8270r = iVar2;
    }

    public y0(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f8265a = 3;
        this.f8267c = sendMessagesHelper;
        this.d = tL_error;
        this.h = tLObject;
        this.e = twoStepVerificationActivity;
        this.f8266b = z10;
        this.f8268f = messageObject;
        this.f8269n = keyboardButtonProto;
        this.f8270r = eoVar;
    }
}
