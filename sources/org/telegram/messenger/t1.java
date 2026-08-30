package org.telegram.messenger;

import android.hardware.Camera;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.xn;
public final class t1 implements Runnable {
    public final int f18445a = 0;
    public final Object f18446b;
    public final boolean f18447c;
    public final Object d;
    public final Object e;
    public final Object f18448f;
    public final Object h;
    public final Object f18449n;
    public final Object f18450r;

    public t1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z4, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = contactsController;
        this.e = hashMap;
        this.f18448f = hashMap2;
        this.f18447c = z4;
        this.h = hashMap3;
        this.f18446b = arrayList;
        this.f18449n = hashMap4;
        this.f18450r = zArr;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.f18445a) {
            case 0:
                ((ContactsController) this.d).lambda$performSyncPhoneBook$19((HashMap) this.e, (HashMap) this.f18448f, this.f18447c, (HashMap) this.h, (ArrayList) this.f18446b, (HashMap) this.f18449n, (boolean[]) this.f18450r);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastPinnedMessage$169((ArrayList) this.f18446b, this.f18447c, (ArrayList) this.e, (ArrayList) this.f18448f, (ArrayList) this.h, (a0.h) this.f18449n, (a0.h) this.f18450r);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$sendCallback$43((TLRPC.TL_error) this.e, (TLObject) this.f18448f, (TwoStepVerificationActivity) this.h, this.f18447c, (MessageObject) this.f18449n, (TL_keyboard.KeyboardButtonProto) this.f18446b, (xn) this.f18450r);
                return;
            case 3:
                ((CameraController) this.d).lambda$recordVideo$14((Camera) this.e, (CameraSession) this.f18448f, this.f18447c, (File) this.h, (CameraInfo) this.f18449n, (CameraController.VideoTakeCallback) this.f18446b, (Runnable) this.f18450r);
                return;
            default:
                tf.u0 u0Var = (tf.u0) this.d;
                String str = (String) this.e;
                TLObject tLObject = (TLObject) this.f18448f;
                TLRPC.User user = (TLRPC.User) this.h;
                String str2 = (String) this.f18449n;
                MessagesStorage messagesStorage = (MessagesStorage) this.f18446b;
                String str3 = (String) this.f18450r;
                ka0 ka0Var = u0Var.S;
                if (str.equals(u0Var.f44853o0)) {
                    int i10 = 0;
                    u0Var.f44857r0 = 0;
                    boolean z11 = this.f18447c;
                    if (z11 && tLObject == null) {
                        u0Var.T(false, user, str, str2);
                    } else if (ka0Var != null) {
                        ka0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        u0Var.f44854p0 = tL_messages_botResults.next_offset;
                        if (u0Var.Q == null) {
                            u0Var.Q = tL_messages_botResults.switch_pm;
                        }
                        u0Var.R = tL_messages_botResults.switch_webview;
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
                        if (u0Var.O != null && str2.length() != 0) {
                            u0Var.O.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                u0Var.f44854p0 = "";
                            }
                            z4 = true;
                        } else {
                            u0Var.O = tL_messages_botResults.results;
                            u0Var.f44861u0 = tL_messages_botResults.gallery;
                            z4 = false;
                        }
                        m71 m71Var = u0Var.m0;
                        if (m71Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(m71Var);
                            u0Var.m0 = null;
                        }
                        u0Var.F = null;
                        u0Var.f44866x0 = null;
                        u0Var.f44865x = null;
                        u0Var.f44867y = null;
                        u0Var.G = null;
                        u0Var.N = null;
                        u0Var.J = null;
                        u0Var.K = null;
                        u0Var.H = null;
                        u0Var.M = null;
                        u0Var.f44850l0 = false;
                        if (u0Var.O.isEmpty() && u0Var.Q == null && u0Var.R == null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        ka0Var.a(z10);
                        if (z4) {
                            i10 = (u0Var.Q == null && u0Var.R == null) ? 1 : 1;
                            u0Var.m(((u0Var.O.size() - tL_messages_botResults.results.size()) + i10) - 1);
                            u0Var.s((u0Var.O.size() - tL_messages_botResults.results.size()) + i10, tL_messages_botResults.results.size());
                            return;
                        }
                        u0Var.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public t1(MediaDataController mediaDataController, ArrayList arrayList, boolean z4, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = mediaDataController;
        this.f18446b = arrayList;
        this.f18447c = z4;
        this.e = arrayList2;
        this.f18448f = arrayList3;
        this.h = arrayList4;
        this.f18449n = hVar;
        this.f18450r = hVar2;
    }

    public t1(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4) {
        this.d = sendMessagesHelper;
        this.e = tL_error;
        this.f18448f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f18447c = z4;
        this.f18449n = messageObject;
        this.f18446b = keyboardButtonProto;
        this.f18450r = xnVar;
    }

    public t1(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z4, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.d = cameraController;
        this.e = camera;
        this.f18448f = cameraSession;
        this.f18447c = z4;
        this.h = file;
        this.f18449n = cameraInfo;
        this.f18446b = videoTakeCallback;
        this.f18450r = runnable;
    }

    public t1(tf.u0 u0Var, String str, boolean z4, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.d = u0Var;
        this.e = str;
        this.f18447c = z4;
        this.f18448f = tLObject;
        this.h = user;
        this.f18449n = str2;
        this.f18446b = messagesStorage;
        this.f18450r = str3;
    }
}
