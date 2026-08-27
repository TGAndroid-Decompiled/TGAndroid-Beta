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
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.v90;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.rn;

public final class s1 implements Runnable {

    public final int f21477a = 0;

    public final Object f21478b;

    public final boolean f21479c;
    public final Object d;

    public final Object f21480e;

    public final Object f21481f;
    public final Object h;

    public final Object f21482n;

    public final Object f21483r;

    public s1(ContactsController contactsController, HashMap map, HashMap map2, boolean z10, HashMap map3, ArrayList arrayList, HashMap map4, boolean[] zArr) {
        this.d = contactsController;
        this.f21480e = map;
        this.f21481f = map2;
        this.f21479c = z10;
        this.h = map3;
        this.f21478b = arrayList;
        this.f21482n = map4;
        this.f21483r = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f21477a) {
            case 0:
                ((ContactsController) this.d).lambda$performSyncPhoneBook$19((HashMap) this.f21480e, (HashMap) this.f21481f, this.f21479c, (HashMap) this.h, (ArrayList) this.f21478b, (HashMap) this.f21482n, (boolean[]) this.f21483r);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastPinnedMessage$169((ArrayList) this.f21478b, this.f21479c, (ArrayList) this.f21480e, (ArrayList) this.f21481f, (ArrayList) this.h, (a0.h) this.f21482n, (a0.h) this.f21483r);
                break;
            case 2:
                ((SendMessagesHelper) this.d).lambda$sendCallback$43((TLRPC.TL_error) this.f21480e, (TLObject) this.f21481f, (TwoStepVerificationActivity) this.h, this.f21479c, (MessageObject) this.f21482n, (TL_keyboard.KeyboardButtonProto) this.f21478b, (rn) this.f21483r);
                break;
            case 3:
                ((CameraController) this.d).lambda$recordVideo$14((Camera) this.f21480e, (CameraSession) this.f21481f, this.f21479c, (File) this.h, (CameraInfo) this.f21482n, (CameraController.VideoTakeCallback) this.f21478b, (Runnable) this.f21483r);
                break;
            default:
                pf.u0 u0Var = (pf.u0) this.d;
                String str = (String) this.f21480e;
                TLObject tLObject = (TLObject) this.f21481f;
                TLRPC.User user = (TLRPC.User) this.h;
                String str2 = (String) this.f21482n;
                MessagesStorage messagesStorage = (MessagesStorage) this.f21478b;
                String str3 = (String) this.f21483r;
                v90 v90Var = u0Var.R;
                if (str.equals(u0Var.f45937n0)) {
                    u0Var.f45940q0 = 0;
                    boolean z11 = this.f21479c;
                    if (z11 && tLObject == null) {
                        u0Var.T(false, user, str, str2);
                    } else if (v90Var != null) {
                        v90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z11 && tL_messages_botResults.cache_time != 0) {
                            messagesStorage.saveBotCache(str3, tL_messages_botResults);
                        }
                        u0Var.f45938o0 = tL_messages_botResults.next_offset;
                        if (u0Var.P == null) {
                            u0Var.P = tL_messages_botResults.switch_pm;
                        }
                        u0Var.Q = tL_messages_botResults.switch_webview;
                        int i10 = 0;
                        while (i10 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i10);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i10);
                                i10--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i10++;
                        }
                        if (u0Var.N == null || str2.length() == 0) {
                            u0Var.N = tL_messages_botResults.results;
                            u0Var.f45945t0 = tL_messages_botResults.gallery;
                            z10 = false;
                        } else {
                            u0Var.N.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                u0Var.f45938o0 = "";
                            }
                            z10 = true;
                        }
                        gs0 gs0Var = u0Var.f45935l0;
                        if (gs0Var != null) {
                            AndroidUtilities.cancelRunOnUIThread(gs0Var);
                            u0Var.f45935l0 = null;
                        }
                        u0Var.E = null;
                        u0Var.f45949w0 = null;
                        u0Var.f45950x = null;
                        u0Var.f45952y = null;
                        u0Var.F = null;
                        u0Var.M = null;
                        u0Var.I = null;
                        u0Var.J = null;
                        u0Var.G = null;
                        u0Var.L = null;
                        u0Var.f45934k0 = false;
                        v90Var.a((u0Var.N.isEmpty() && u0Var.P == null && u0Var.Q == null) ? false : true);
                        if (!z10) {
                            u0Var.l();
                        } else {
                            int i11 = (u0Var.P == null && u0Var.Q == null) ? 0 : 1;
                            u0Var.m(((u0Var.N.size() - tL_messages_botResults.results.size()) + i11) - 1);
                            u0Var.s((u0Var.N.size() - tL_messages_botResults.results.size()) + i11, tL_messages_botResults.results.size());
                        }
                    }
                    break;
                }
                break;
        }
    }

    public s1(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, a0.h hVar, a0.h hVar2) {
        this.d = mediaDataController;
        this.f21478b = arrayList;
        this.f21479c = z10;
        this.f21480e = arrayList2;
        this.f21481f = arrayList3;
        this.h = arrayList4;
        this.f21482n = hVar;
        this.f21483r = hVar2;
    }

    public s1(MessageObject messageObject, SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.TL_error tL_error, TL_keyboard.KeyboardButtonProto keyboardButtonProto, rn rnVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        this.d = sendMessagesHelper;
        this.f21480e = tL_error;
        this.f21481f = tLObject;
        this.h = twoStepVerificationActivity;
        this.f21479c = z10;
        this.f21482n = messageObject;
        this.f21478b = keyboardButtonProto;
        this.f21483r = rnVar;
    }

    public s1(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.d = cameraController;
        this.f21480e = camera;
        this.f21481f = cameraSession;
        this.f21479c = z10;
        this.h = file;
        this.f21482n = cameraInfo;
        this.f21478b = videoTakeCallback;
        this.f21483r = runnable;
    }

    public s1(pf.u0 u0Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.d = u0Var;
        this.f21480e = str;
        this.f21479c = z10;
        this.f21481f = tLObject;
        this.h = user;
        this.f21482n = str2;
        this.f21478b = messagesStorage;
        this.f21483r = str3;
    }
}
