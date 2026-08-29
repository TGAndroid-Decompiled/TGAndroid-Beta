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
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.tn;
public final class s1 implements Runnable {
    public final int f21486a = 0;
    public final Object f21487b;
    public final boolean f21488c;
    public final Object d;
    public final Object f21489e;
    public final Object f21490f;
    public final Object h;
    public final Object f21491n;
    public final Object f21492r;

    public s1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z10, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = contactsController;
        this.f21489e = hashMap;
        this.f21490f = hashMap2;
        this.f21488c = z10;
        this.h = hashMap3;
        this.f21487b = arrayList;
        this.f21491n = hashMap4;
        this.f21492r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.f21486a) {
            case 0:
                ((ContactsController) this.d).lambda$performSyncPhoneBook$19((HashMap) this.f21489e, (HashMap) this.f21490f, this.f21488c, (HashMap) this.h, (ArrayList) this.f21487b, (HashMap) this.f21491n, (boolean[]) this.f21492r);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastPinnedMessage$169((ArrayList) this.f21487b, this.f21488c, (ArrayList) this.f21489e, (ArrayList) this.f21490f, (ArrayList) this.h, (a0.h) this.f21491n, (a0.h) this.f21492r);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$sendCallback$43((TLRPC.TL_error) this.f21489e, (TLObject) this.f21490f, (TwoStepVerificationActivity) this.h, this.f21488c, (MessageObject) this.f21491n, (TL_keyboard.KeyboardButtonProto) this.f21487b, (tn) this.f21492r);
                return;
            case 3:
                ((CameraController) this.d).lambda$recordVideo$14((Camera) this.f21489e, (CameraSession) this.f21490f, this.f21488c, (File) this.h, (CameraInfo) this.f21491n, (CameraController.VideoTakeCallback) this.f21487b, (Runnable) this.f21492r);
                return;
            default:
                rf.v0 v0Var = (rf.v0) this.d;
                String str = (String) this.f21489e;
                TLObject tLObject = (TLObject) this.f21490f;
                TLRPC.User user = (TLRPC.User) this.h;
                String str2 = (String) this.f21491n;
                MessagesStorage messagesStorage = (MessagesStorage) this.f21487b;
                String str3 = (String) this.f21492r;
                fa0 fa0Var = v0Var.R;
                if (str.equals(v0Var.f47378n0)) {
                    int i10 = 0;
                    v0Var.f47381q0 = 0;
                    boolean z12 = this.f21488c;
                    if (z12 && tLObject == null) {
                        v0Var.T(false, user, str, str2);
                    } else if (fa0Var != null) {
                        fa0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z12 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        v0Var.f47379o0 = tL_messages_botResults.next_offset;
                        if (v0Var.P == null) {
                            v0Var.P = tL_messages_botResults.switch_pm;
                        }
                        v0Var.Q = tL_messages_botResults.switch_webview;
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
                        if (v0Var.N != null && str2.length() != 0) {
                            v0Var.N.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                v0Var.f47379o0 = "";
                            }
                            z10 = true;
                        } else {
                            v0Var.N = tL_messages_botResults.results;
                            v0Var.f47386t0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        yw0 yw0Var = v0Var.f47376l0;
                        if (yw0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(yw0Var);
                            v0Var.f47376l0 = null;
                        }
                        v0Var.E = null;
                        v0Var.f47390w0 = null;
                        v0Var.f47391x = null;
                        v0Var.f47393y = null;
                        v0Var.F = null;
                        v0Var.M = null;
                        v0Var.I = null;
                        v0Var.J = null;
                        v0Var.G = null;
                        v0Var.L = null;
                        v0Var.f47375k0 = false;
                        if (v0Var.N.isEmpty() && v0Var.P == null && v0Var.Q == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        fa0Var.a(z11);
                        if (z10) {
                            i10 = (v0Var.P == null && v0Var.Q == null) ? 1 : 1;
                            v0Var.m(((v0Var.N.size() - tL_messages_botResults.results.size()) + i10) - 1);
                            v0Var.s((v0Var.N.size() - tL_messages_botResults.results.size()) + i10, tL_messages_botResults.results.size());
                            return;
                        }
                        v0Var.l();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public s1(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = mediaDataController;
        this.f21487b = arrayList;
        this.f21488c = z10;
        this.f21489e = arrayList2;
        this.f21490f = arrayList3;
        this.h = arrayList4;
        this.f21491n = hVar;
        this.f21492r = hVar2;
    }

    public s1(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, tn tnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.d = sendMessagesHelper;
        this.f21489e = tL_error;
        this.f21490f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f21488c = z10;
        this.f21491n = messageObject;
        this.f21487b = keyboardButtonProto;
        this.f21492r = tnVar;
    }

    public s1(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.d = cameraController;
        this.f21489e = camera;
        this.f21490f = cameraSession;
        this.f21488c = z10;
        this.h = file;
        this.f21491n = cameraInfo;
        this.f21487b = videoTakeCallback;
        this.f21492r = runnable;
    }

    public s1(rf.v0 v0Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.d = v0Var;
        this.f21489e = str;
        this.f21488c = z10;
        this.f21490f = tLObject;
        this.h = user;
        this.f21491n = str2;
        this.f21487b = messagesStorage;
        this.f21492r = str3;
    }
}
