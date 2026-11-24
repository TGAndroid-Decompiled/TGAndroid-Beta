package defpackage;

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
public final class oo6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public oo6(qu2 qu2Var, HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.a = (byte) 2;
        this.c = qu2Var;
        this.e = hashMap;
        this.f = hashMap2;
        this.b = z;
        this.h = hashMap3;
        this.d = arrayList;
        this.n = hashMap4;
        this.r = zArr;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        int i;
        int i2;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        int i3 = 0;
        switch (this.a) {
            case 0:
                hq6 hq6Var = (hq6) this.c;
                boolean z7 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                ArrayList arrayList2 = (ArrayList) this.h;
                vf6 vf6Var = (vf6) this.n;
                vf6 vf6Var2 = (vf6) this.r;
                hq6Var.getMessagesController().a4((ArrayList) this.d, z7);
                hq6Var.getMessagesController().U3((ArrayList) this.e, z7);
                int size = arrayList.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i5);
                    if ((k27.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i4++;
                    }
                    int i6 = hq6Var.currentAccount;
                    if (i4 < 30) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(new k27(i6, message, vf6Var, vf6Var2, false, z));
                }
                gl.d3(new yo6(hq6Var, arrayList2, (byte) 0));
                return;
            case 1:
                ((CameraController) this.c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.b, (File) this.f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.n, (Runnable) this.r);
                return;
            case 2:
                qu2 qu2Var = (qu2) this.c;
                boolean z8 = this.b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.d;
                HashMap hashMap2 = (HashMap) this.n;
                boolean[] zArr = (boolean[]) this.r;
                qu2Var.a0 = (HashMap) this.e;
                qu2Var.Z = (HashMap) this.f;
                qu2Var.e = false;
                qu2Var.r = true;
                if (z8) {
                    qu2Var.h = true;
                }
                if (!qu2Var.x.isEmpty() && qu2Var.h) {
                    qu2Var.c(qu2Var.x, null, null, null);
                    qu2Var.x.clear();
                }
                gl.d3(new du2(qu2Var, hashMap, arrayList3, hashMap2, (byte) 3));
                if (zArr[0]) {
                    Utilities.e.d(new wt2(qu2Var, (byte) 7), 300000L);
                    return;
                }
                return;
            case 3:
                boolean z9 = this.b;
                u41 u41Var = (u41) this.c;
                c cVar = (c) this.d;
                w25 w25Var = cVar.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
                r25 r25Var = (r25) this.f;
                TextView textView = (TextView) this.h;
                be0 be0Var = (be0) this.n;
                TextView textView2 = (TextView) this.r;
                if (z9) {
                    u41Var.setEnabled((!cVar.M() || cVar.x() == null || cVar.D() == null || u41Var.R) ? false : false);
                    return;
                }
                ArrayList arrayList4 = w25Var.d;
                int size2 = arrayList4.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        Object obj = arrayList4.get(i7);
                        i7++;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            r25Var.e = tonconnectsession2;
                        }
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = r25Var.e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && !r25Var.f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                u41Var.setEnabled(z3);
                TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                if (tonconnectmanifest != null) {
                    str = null;
                    textView.setText(k96.V(null, null, 2131742917, tonconnectmanifest.name));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        be0Var.p(gl5.p(usc.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                } else {
                    str = null;
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    textView2.setText(k96.a0(str, str, 2131742739, num));
                    return;
                } else if (!z2) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i2 = 2131748587;
                    } else {
                        i2 = 2131742729;
                    }
                    textView2.setText(k96.M0(i2, str));
                    return;
                } else {
                    w25Var.getClass();
                    if (w25.w(r25Var)) {
                        i = 2131742918;
                    } else {
                        i = 2131742920;
                    }
                    textView2.setText(k96.M0(i, str));
                    return;
                }
            case 4:
                kz6 kz6Var = (kz6) this.c;
                String str2 = (String) this.d;
                boolean z10 = this.b;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                String str3 = (String) this.h;
                ad7 ad7Var = (ad7) this.n;
                String str4 = (String) this.r;
                pz6 pz6Var = kz6Var.W;
                if (str2.equals(kz6Var.s0)) {
                    kz6Var.v0 = 0;
                    if (z10 && tLObject == null) {
                        kz6Var.T(false, user, str2, str3);
                    } else if (pz6Var != null) {
                        pz6Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z10 && tL_messages_botResults.cache_time != 0) {
                            ad7Var.s1(str4, tL_messages_botResults);
                        }
                        kz6Var.t0 = tL_messages_botResults.next_offset;
                        if (kz6Var.U == null) {
                            kz6Var.U = tL_messages_botResults.switch_pm;
                        }
                        kz6Var.V = tL_messages_botResults.switch_webview;
                        int i8 = 0;
                        while (i8 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i8);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i8);
                                i8--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i8++;
                        }
                        if (kz6Var.S != null && str3.length() != 0) {
                            kz6Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                kz6Var.t0 = "";
                            }
                            z4 = true;
                        } else {
                            kz6Var.S = tL_messages_botResults.results;
                            kz6Var.y0 = tL_messages_botResults.gallery;
                            z4 = false;
                        }
                        lo6 lo6Var = kz6Var.q0;
                        if (lo6Var != null) {
                            gl.r(lo6Var);
                            kz6Var.q0 = null;
                        }
                        kz6Var.J = null;
                        kz6Var.B0 = null;
                        kz6Var.y = null;
                        kz6Var.E = null;
                        kz6Var.K = null;
                        kz6Var.R = null;
                        kz6Var.N = null;
                        kz6Var.O = null;
                        kz6Var.L = null;
                        kz6Var.Q = null;
                        kz6Var.p0 = false;
                        if (kz6Var.S.isEmpty() && kz6Var.U == null && kz6Var.V == null) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        pz6Var.a(z5);
                        if (z4) {
                            i3 = (kz6Var.U == null && kz6Var.V == null) ? 1 : 1;
                            kz6Var.g(((kz6Var.S.size() - tL_messages_botResults.results.size()) + i3) - 1);
                            kz6Var.p((kz6Var.S.size() - tL_messages_botResults.results.size()) + i3, tL_messages_botResults.results.size());
                            return;
                        }
                        kz6Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                z3a z3aVar = (z3a) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z11 = this.b;
                k27 k27Var = (k27) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                mu1 mu1Var = (mu1) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    z3aVar.m0(z11, k27Var, keyboardButtonProto, twoStepVerificationActivity.d0(), twoStepVerificationActivity, mu1Var);
                    return;
                }
                return;
        }
    }

    public oo6(z3a z3aVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, k27 k27Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, mu1 mu1Var) {
        this.a = (byte) 5;
        this.c = z3aVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z;
        this.h = k27Var;
        this.n = keyboardButtonProto;
        this.r = mu1Var;
    }

    public oo6(Object obj, Serializable serializable, boolean z, Object obj2, Object obj3, Serializable serializable2, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = serializable;
        this.b = z;
        this.e = obj2;
        this.f = obj3;
        this.h = serializable2;
        this.n = obj4;
        this.r = obj5;
    }

    public oo6(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.a = (byte) 1;
        this.c = cameraController;
        this.d = camera;
        this.e = cameraSession;
        this.b = z;
        this.f = file;
        this.h = cameraInfo;
        this.n = videoTakeCallback;
        this.r = runnable;
    }

    public oo6(boolean z, u41 u41Var, c cVar, TL_wallet.tonConnectSession tonconnectsession, r25 r25Var, TextView textView, be0 be0Var, TextView textView2) {
        this.a = (byte) 3;
        this.b = z;
        this.c = u41Var;
        this.d = cVar;
        this.e = tonconnectsession;
        this.f = r25Var;
        this.h = textView;
        this.n = be0Var;
        this.r = textView2;
    }
}
