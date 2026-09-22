package gg;

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
import org.telegram.ui.Components.ia0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bo;
public final class y0 implements Runnable {
    public final int f9983a;
    public final boolean f9984b;
    public final Object f9985c;
    public final Object d;
    public final Object e;
    public final Object f9986f;
    public final Object h;
    public final Object f9987n;
    public final Object f9988r;

    public y0(k1 k1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f9983a = 0;
        this.f9985c = k1Var;
        this.d = str;
        this.f9984b = z10;
        this.h = tLObject;
        this.f9987n = user;
        this.e = str2;
        this.f9988r = messagesStorage;
        this.f9986f = str3;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f9983a) {
            case 0:
                k1 k1Var = (k1) this.f9985c;
                String str = (String) this.d;
                TLObject tLObject = (TLObject) this.h;
                TLRPC.User user = (TLRPC.User) this.f9987n;
                String str2 = (String) this.e;
                MessagesStorage messagesStorage = (MessagesStorage) this.f9988r;
                String str3 = (String) this.f9986f;
                ia0 ia0Var = k1Var.V;
                if (str.equals(k1Var.f9831r0)) {
                    int i10 = 0;
                    k1Var.f9835u0 = 0;
                    boolean z12 = this.f9984b;
                    if (z12 && tLObject == null) {
                        k1Var.T(false, user, str, str2);
                    } else if (ia0Var != null) {
                        ia0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z12 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        k1Var.f9833s0 = tL_messages_botResults.next_offset;
                        if (k1Var.T == null) {
                            k1Var.T = tL_messages_botResults.switch_pm;
                        }
                        k1Var.U = tL_messages_botResults.switch_webview;
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
                        if (k1Var.R != null && str2.length() != 0) {
                            k1Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                k1Var.f9833s0 = "";
                            }
                            z10 = true;
                        } else {
                            k1Var.R = tL_messages_botResults.results;
                            k1Var.f9840x0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        t tVar = k1Var.f9828p0;
                        if (tVar != null) {
                            AndroidUtilities.cancelRunOnUIThread(tVar);
                            k1Var.f9828p0 = null;
                        }
                        k1Var.I = null;
                        k1Var.A0 = null;
                        k1Var.f9839x = null;
                        k1Var.f9841y = null;
                        k1Var.J = null;
                        k1Var.Q = null;
                        k1Var.M = null;
                        k1Var.N = null;
                        k1Var.K = null;
                        k1Var.P = null;
                        k1Var.f9827o0 = false;
                        if (k1Var.R.isEmpty() && k1Var.T == null && k1Var.U == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        ia0Var.a(z11);
                        if (z10) {
                            i10 = (k1Var.T == null && k1Var.U == null) ? 1 : 1;
                            k1Var.m(((k1Var.R.size() - tL_messages_botResults.results.size()) + i10) - 1);
                            k1Var.s((k1Var.R.size() - tL_messages_botResults.results.size()) + i10, tL_messages_botResults.results.size());
                            return;
                        }
                        k1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((ContactsController) this.f9985c).lambda$performSyncPhoneBook$19((HashMap) this.d, (HashMap) this.e, this.f9984b, (HashMap) this.f9986f, (ArrayList) this.h, (HashMap) this.f9987n, (boolean[]) this.f9988r);
                return;
            case 2:
                ((MediaDataController) this.f9985c).lambda$broadcastPinnedMessage$169((ArrayList) this.d, this.f9984b, (ArrayList) this.e, (ArrayList) this.f9986f, (ArrayList) this.h, (a0.i) this.f9987n, (a0.i) this.f9988r);
                return;
            case 3:
                ((SendMessagesHelper) this.f9985c).lambda$sendCallback$43((TLRPC.TL_error) this.d, (TLObject) this.h, (TwoStepVerificationActivity) this.e, this.f9984b, (MessageObject) this.f9986f, (TL_keyboard.KeyboardButtonProto) this.f9987n, (bo) this.f9988r);
                return;
            default:
                ((CameraController) this.f9985c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.f9984b, (File) this.f9986f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.f9987n, (Runnable) this.f9988r);
                return;
        }
    }

    public y0(Object obj, Object obj2, Object obj3, boolean z10, Serializable serializable, Object obj4, Object obj5, Object obj6, int i10) {
        this.f9983a = i10;
        this.f9985c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9984b = z10;
        this.f9986f = serializable;
        this.h = obj4;
        this.f9987n = obj5;
        this.f9988r = obj6;
    }

    public y0(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.i iVar, a0.i iVar2) {
        this.f9983a = 2;
        this.f9985c = mediaDataController;
        this.d = arrayList;
        this.f9984b = z10;
        this.e = arrayList2;
        this.f9986f = arrayList3;
        this.h = arrayList4;
        this.f9987n = iVar;
        this.f9988r = iVar2;
    }

    public y0(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, bo boVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.f9983a = 3;
        this.f9985c = sendMessagesHelper;
        this.d = tL_error;
        this.h = tLObject;
        this.e = twoStepVerificationActivity;
        this.f9984b = z10;
        this.f9986f = messageObject;
        this.f9987n = keyboardButtonProto;
        this.f9988r = boVar;
    }
}
