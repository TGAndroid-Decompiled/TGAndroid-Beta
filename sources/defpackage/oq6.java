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
public final class oq6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public oq6(lv2 lv2Var, HashMap hashMap, HashMap hashMap2, boolean z, HashMap hashMap3, ArrayList arrayList, HashMap hashMap4, boolean[] zArr) {
        this.a = (byte) 2;
        this.c = lv2Var;
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
                ls6 ls6Var = (ls6) this.c;
                boolean z7 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                ArrayList arrayList2 = (ArrayList) this.h;
                zh6 zh6Var = (zh6) this.n;
                zh6 zh6Var2 = (zh6) this.r;
                ls6Var.getMessagesController().j4((ArrayList) this.d, z7);
                ls6Var.getMessagesController().c4((ArrayList) this.e, z7);
                int size = arrayList.size();
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    TLRPC.Message message = (TLRPC.Message) arrayList.get(i5);
                    if ((r47.n1(message) instanceof TLRPC.TL_messageMediaDocument) || (r47.n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
                        i4++;
                    }
                    int i6 = ls6Var.currentAccount;
                    if (i4 < 30) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList2.add(new r47(i6, message, zh6Var, zh6Var2, false, z));
                }
                hl.c3(new ar6(ls6Var, arrayList2, (byte) 0));
                return;
            case 1:
                ((CameraController) this.c).lambda$recordVideo$14((Camera) this.d, (CameraSession) this.e, this.b, (File) this.f, (CameraInfo) this.h, (CameraController.VideoTakeCallback) this.n, (Runnable) this.r);
                return;
            case 2:
                lv2 lv2Var = (lv2) this.c;
                boolean z8 = this.b;
                HashMap hashMap = (HashMap) this.h;
                ArrayList arrayList3 = (ArrayList) this.d;
                HashMap hashMap2 = (HashMap) this.n;
                boolean[] zArr = (boolean[]) this.r;
                lv2Var.a0 = (HashMap) this.e;
                lv2Var.Z = (HashMap) this.f;
                lv2Var.e = false;
                lv2Var.r = true;
                if (z8) {
                    lv2Var.h = true;
                }
                if (!lv2Var.x.isEmpty() && lv2Var.h) {
                    lv2Var.c(lv2Var.x, null, null, null);
                    lv2Var.x.clear();
                }
                hl.c3(new xu2(lv2Var, hashMap, arrayList3, hashMap2, (byte) 3));
                if (zArr[0]) {
                    Utilities.e.d(new pu2(lv2Var, (byte) 8), 300000L);
                    return;
                }
                return;
            case 3:
                boolean z9 = this.b;
                c51 c51Var = (c51) this.c;
                c cVar = (c) this.d;
                a55 a55Var = cVar.g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
                v45 v45Var = (v45) this.f;
                TextView textView = (TextView) this.h;
                de0 de0Var = (de0) this.n;
                TextView textView2 = (TextView) this.r;
                if (z9) {
                    c51Var.setEnabled((!cVar.M() || cVar.x() == null || cVar.D() == null || c51Var.R) ? false : false);
                    return;
                }
                ArrayList arrayList4 = a55Var.d;
                int size2 = arrayList4.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        Object obj = arrayList4.get(i7);
                        i7++;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            v45Var.e = tonconnectsession2;
                        }
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = v45Var.e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && !v45Var.f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c51Var.setEnabled(z3);
                TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                if (tonconnectmanifest != null) {
                    str = null;
                    textView.setText(ob6.V(null, null, 2131742811, tonconnectmanifest.name));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        de0Var.p(jn5.p(jxc.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                } else {
                    str = null;
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    textView2.setText(ob6.a0(str, str, 2131742633, num));
                    return;
                } else if (!z2) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i2 = 2131748533;
                    } else {
                        i2 = 2131742623;
                    }
                    textView2.setText(ob6.M0(i2, str));
                    return;
                } else {
                    a55Var.getClass();
                    if (a55.w(v45Var)) {
                        i = 2131742812;
                    } else {
                        i = 2131742814;
                    }
                    textView2.setText(ob6.M0(i, str));
                    return;
                }
            case 4:
                r17 r17Var = (r17) this.c;
                String str2 = (String) this.d;
                boolean z10 = this.b;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.User user = (TLRPC.User) this.f;
                String str3 = (String) this.h;
                jf7 jf7Var = (jf7) this.n;
                String str4 = (String) this.r;
                w17 w17Var = r17Var.W;
                if (str2.equals(r17Var.s0)) {
                    r17Var.v0 = 0;
                    if (z10 && tLObject == null) {
                        r17Var.T(false, user, str2, str3);
                    } else if (w17Var != null) {
                        w17Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z10 && tL_messages_botResults.cache_time != 0) {
                            jf7Var.s1(str4, tL_messages_botResults);
                        }
                        r17Var.t0 = tL_messages_botResults.next_offset;
                        if (r17Var.U == null) {
                            r17Var.U = tL_messages_botResults.switch_pm;
                        }
                        r17Var.V = tL_messages_botResults.switch_webview;
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
                        if (r17Var.S != null && str3.length() != 0) {
                            r17Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                r17Var.t0 = "";
                            }
                            z4 = true;
                        } else {
                            r17Var.S = tL_messages_botResults.results;
                            r17Var.y0 = tL_messages_botResults.gallery;
                            z4 = false;
                        }
                        yg6 yg6Var = r17Var.q0;
                        if (yg6Var != null) {
                            hl.r(yg6Var);
                            r17Var.q0 = null;
                        }
                        r17Var.J = null;
                        r17Var.B0 = null;
                        r17Var.y = null;
                        r17Var.E = null;
                        r17Var.K = null;
                        r17Var.R = null;
                        r17Var.N = null;
                        r17Var.O = null;
                        r17Var.L = null;
                        r17Var.Q = null;
                        r17Var.p0 = false;
                        if (r17Var.S.isEmpty() && r17Var.U == null && r17Var.V == null) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        w17Var.a(z5);
                        if (z4) {
                            i3 = (r17Var.U == null && r17Var.V == null) ? 1 : 1;
                            r17Var.g(((r17Var.S.size() - tL_messages_botResults.results.size()) + i3) - 1);
                            r17Var.p((r17Var.S.size() - tL_messages_botResults.results.size()) + i3, tL_messages_botResults.results.size());
                            return;
                        }
                        r17Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                r7a r7aVar = (r7a) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z11 = this.b;
                r47 r47Var = (r47) this.h;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.n;
                zu1 zu1Var = (zu1) this.r;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    r7aVar.m0(z11, r47Var, keyboardButtonProto, twoStepVerificationActivity.d0(), twoStepVerificationActivity, zu1Var);
                    return;
                }
                return;
        }
    }

    public oq6(r7a r7aVar, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, r47 r47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zu1 zu1Var) {
        this.a = (byte) 5;
        this.c = r7aVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f = twoStepVerificationActivity;
        this.b = z;
        this.h = r47Var;
        this.n = keyboardButtonProto;
        this.r = zu1Var;
    }

    public oq6(Object obj, Serializable serializable, boolean z, Object obj2, Object obj3, Serializable serializable2, Object obj4, Object obj5, byte b) {
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

    public oq6(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
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

    public oq6(boolean z, c51 c51Var, c cVar, TL_wallet.tonConnectSession tonconnectsession, v45 v45Var, TextView textView, de0 de0Var, TextView textView2) {
        this.a = (byte) 3;
        this.b = z;
        this.c = c51Var;
        this.d = cVar;
        this.e = tonconnectsession;
        this.f = v45Var;
        this.h = textView;
        this.n = de0Var;
        this.r = textView2;
    }
}
