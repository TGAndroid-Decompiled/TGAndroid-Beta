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
import org.telegram.ui.Components.o71;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.xn;
public final class t1 implements Runnable {
    public final int f20041a = 0;
    public final Object f20042b;
    public final boolean f20043c;
    public final Object d;
    public final Object f20044e;
    public final Object f20045f;
    public final Object h;
    public final Object f20046n;
    public final Object f20047r;

    public t1(ContactsController contactsController, HashMap hashMap, HashMap hashMap2, boolean z4, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.d = contactsController;
        this.f20044e = hashMap;
        this.f20045f = hashMap2;
        this.f20043c = z4;
        this.h = hashMap3;
        this.f20042b = arrayList;
        this.f20046n = hashMap4;
        this.f20047r = zArr;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        switch (this.f20041a) {
            case 0:
                ((ContactsController) this.d).lambda$performSyncPhoneBook$19((HashMap) this.f20044e, (HashMap) this.f20045f, this.f20043c, (HashMap) this.h, (ArrayList) this.f20042b, (HashMap) this.f20046n, (boolean[]) this.f20047r);
                return;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastPinnedMessage$169((ArrayList) this.f20042b, this.f20043c, (ArrayList) this.f20044e, (ArrayList) this.f20045f, (ArrayList) this.h, (a0.h) this.f20046n, (a0.h) this.f20047r);
                return;
            case 2:
                ((SendMessagesHelper) this.d).lambda$sendCallback$43((TLRPC.TL_error) this.f20044e, (TLObject) this.f20045f, (TwoStepVerificationActivity) this.h, this.f20043c, (MessageObject) this.f20046n, (TL_keyboard.KeyboardButtonProto) this.f20042b, (xn) this.f20047r);
                return;
            case 3:
                ((CameraController) this.d).lambda$recordVideo$14((Camera) this.f20044e, (CameraSession) this.f20045f, this.f20043c, (File) this.h, (CameraInfo) this.f20046n, (CameraController.VideoTakeCallback) this.f20042b, (Runnable) this.f20047r);
                return;
            default:
                uf.u0 u0Var = (uf.u0) this.d;
                String str = (String) this.f20044e;
                TLObject tLObject = (TLObject) this.f20045f;
                TLRPC.User user = (TLRPC.User) this.h;
                String str2 = (String) this.f20046n;
                MessagesStorage messagesStorage = (MessagesStorage) this.f20042b;
                String str3 = (String) this.f20047r;
                ma0 ma0Var = u0Var.S;
                if (str.equals(u0Var.f48710o0)) {
                    int i10 = 0;
                    u0Var.f48714r0 = 0;
                    boolean z11 = this.f20043c;
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
                        u0Var.f48711p0 = tL_messages_botResults.next_offset;
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
                                u0Var.f48711p0 = "";
                            }
                            z4 = true;
                        } else {
                            u0Var.O = tL_messages_botResults.results;
                            u0Var.f48718u0 = tL_messages_botResults.gallery;
                            z4 = false;
                        }
                        o71 o71Var = u0Var.m0;
                        if (o71Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(o71Var);
                            u0Var.m0 = null;
                        }
                        u0Var.F = null;
                        u0Var.f48723x0 = null;
                        u0Var.f48722x = null;
                        u0Var.f48724y = null;
                        u0Var.G = null;
                        u0Var.N = null;
                        u0Var.J = null;
                        u0Var.K = null;
                        u0Var.H = null;
                        u0Var.M = null;
                        u0Var.f48707l0 = false;
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
        this.f20042b = arrayList;
        this.f20043c = z4;
        this.f20044e = arrayList2;
        this.f20045f = arrayList3;
        this.h = arrayList4;
        this.f20046n = hVar;
        this.f20047r = hVar2;
    }

    public t1(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z4) {
        this.d = sendMessagesHelper;
        this.f20044e = tL_error;
        this.f20045f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f20043c = z4;
        this.f20046n = messageObject;
        this.f20042b = keyboardButtonProto;
        this.f20047r = xnVar;
    }

    public t1(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z4, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.d = cameraController;
        this.f20044e = camera;
        this.f20045f = cameraSession;
        this.f20043c = z4;
        this.h = file;
        this.f20046n = cameraInfo;
        this.f20042b = videoTakeCallback;
        this.f20047r = runnable;
    }

    public t1(uf.u0 u0Var, String str, boolean z4, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.d = u0Var;
        this.f20044e = str;
        this.f20043c = z4;
        this.f20045f = tLObject;
        this.h = user;
        this.f20046n = str2;
        this.f20042b = messagesStorage;
        this.f20047r = str3;
    }
}
