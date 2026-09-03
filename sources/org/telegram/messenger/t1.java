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
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.xn;
public final class t1 implements Runnable {
    public final int f20043a = 0;
    public final Object f20044b;
    public final boolean f20045c;
    public final Object d;
    public final Object f20046e;
    public final Object f20047f;
    public final Object h;
    public final Object f20048n;
    public final Object f20049r;

    public t1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z4, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = contactsController;
        this.f20046e = hashMap;
        this.f20047f = hashMap2;
        this.f20045c = z4;
        this.h = hashMap3;
        this.f20044b = arrayList;
        this.f20048n = hashMap4;
        this.f20049r = zArr;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.f20043a) {
            case 0:
                ((ContactsController) this.d).lambda$performSyncPhoneBook$19((HashMap) this.f20046e, (HashMap) this.f20047f, this.f20045c, (HashMap) this.h, (ArrayList) this.f20044b, (HashMap) this.f20048n, (boolean[]) this.f20049r);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastPinnedMessage$169((ArrayList) this.f20044b, this.f20045c, (ArrayList) this.f20046e, (ArrayList) this.f20047f, (ArrayList) this.h, (a0.h) this.f20048n, (a0.h) this.f20049r);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$sendCallback$43((TLRPC.TL_error) this.f20046e, (TLObject) this.f20047f, (TwoStepVerificationActivity) this.h, this.f20045c, (MessageObject) this.f20048n, (TL_keyboard.KeyboardButtonProto) this.f20044b, (xn) this.f20049r);
                return;
            case 3:
                ((CameraController) this.d).lambda$recordVideo$14((Camera) this.f20046e, (CameraSession) this.f20047f, this.f20045c, (File) this.h, (CameraInfo) this.f20048n, (CameraController.VideoTakeCallback) this.f20044b, (Runnable) this.f20049r);
                return;
            default:
                uf.u0 u0Var = (uf.u0) this.d;
                String str = (String) this.f20046e;
                TLObject tLObject = (TLObject) this.f20047f;
                TLRPC.User user = (TLRPC.User) this.h;
                String str2 = (String) this.f20048n;
                MessagesStorage messagesStorage = (MessagesStorage) this.f20044b;
                String str3 = (String) this.f20049r;
                ma0 ma0Var = u0Var.S;
                if (str.equals(u0Var.f48746o0)) {
                    int i10 = 0;
                    u0Var.f48750r0 = 0;
                    boolean z11 = this.f20045c;
                    if (z11 && tLObject == null) {
                        u0Var.T(false, user, str, str2);
                    } else if (ma0Var != null) {
                        ma0Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        u0Var.f48747p0 = tL_messages_botResults.next_offset;
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
                                u0Var.f48747p0 = "";
                            }
                            z4 = true;
                        } else {
                            u0Var.O = tL_messages_botResults.results;
                            u0Var.f48754u0 = tL_messages_botResults.gallery;
                            z4 = false;
                        }
                        n71 n71Var = u0Var.m0;
                        if (n71Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(n71Var);
                            u0Var.m0 = null;
                        }
                        u0Var.F = null;
                        u0Var.f48759x0 = null;
                        u0Var.f48758x = null;
                        u0Var.f48760y = null;
                        u0Var.G = null;
                        u0Var.N = null;
                        u0Var.J = null;
                        u0Var.K = null;
                        u0Var.H = null;
                        u0Var.M = null;
                        u0Var.f48743l0 = false;
                        if (u0Var.O.isEmpty() && u0Var.Q == null && u0Var.R == null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        ma0Var.a(z10);
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
        this.f20044b = arrayList;
        this.f20045c = z4;
        this.f20046e = arrayList2;
        this.f20047f = arrayList3;
        this.h = arrayList4;
        this.f20048n = hVar;
        this.f20049r = hVar2;
    }

    public t1(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4) {
        this.d = sendMessagesHelper;
        this.f20046e = tL_error;
        this.f20047f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f20045c = z4;
        this.f20048n = messageObject;
        this.f20044b = keyboardButtonProto;
        this.f20049r = xnVar;
    }

    public t1(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z4, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.d = cameraController;
        this.f20046e = camera;
        this.f20047f = cameraSession;
        this.f20045c = z4;
        this.h = file;
        this.f20048n = cameraInfo;
        this.f20044b = videoTakeCallback;
        this.f20049r = runnable;
    }

    public t1(uf.u0 u0Var, String str, boolean z4, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.d = u0Var;
        this.f20046e = str;
        this.f20045c = z4;
        this.f20047f = tLObject;
        this.h = user;
        this.f20048n = str2;
        this.f20044b = messagesStorage;
        this.f20049r = str3;
    }
}
