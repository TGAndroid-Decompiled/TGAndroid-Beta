package jg;

import android.hardware.Camera;
import android.widget.TextView;
import di.a8;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.fc;
import org.telegram.messenger.g20;
import org.telegram.messenger.gd;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Wallet.h2;
import org.telegram.ui.Wallet.m2;
public final class w0 implements Runnable {
    public final int f17800a = 0;
    public final boolean f17801b;
    public final Object f17802c;
    public final Object d;
    public final Object f17803e;
    public final Object f17804f;
    public final Object h;
    public final Object f17805n;
    public final Object f17806r;

    public w0(h1 h1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, tr trVar, String str3) {
        this.f17802c = h1Var;
        this.d = str;
        this.f17801b = z10;
        this.h = tLObject;
        this.f17805n = user;
        this.f17803e = str2;
        this.f17806r = trVar;
        this.f17804f = str3;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? r32;
        boolean z11;
        int i7;
        ?? r15;
        boolean z12;
        boolean z13;
        String str;
        int i10;
        int i11;
        int i12 = this.f17800a;
        boolean z14 = this.f17801b;
        Object obj = this.f17806r;
        Object obj2 = this.f17805n;
        Object obj3 = this.h;
        Object obj4 = this.f17804f;
        Object obj5 = this.f17803e;
        Object obj6 = this.d;
        Object obj7 = this.f17802c;
        boolean z15 = true;
        switch (i12) {
            case 0:
                h1 h1Var = (h1) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj5;
                tr trVar = (tr) obj;
                String str4 = (String) obj4;
                n90 n90Var = h1Var.W;
                if (str2.equals(h1Var.f17619s0)) {
                    h1Var.f17622v0 = 0;
                    if (z14 && tLObject == null) {
                        h1Var.T(false, user, str2, str3);
                    } else if (n90Var != null) {
                        n90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z14 && tL_messages_botResults.cache_time != 0) {
                            trVar.v1(str4, tL_messages_botResults);
                        }
                        h1Var.f17620t0 = tL_messages_botResults.next_offset;
                        if (h1Var.U == null) {
                            h1Var.U = tL_messages_botResults.switch_pm;
                        }
                        h1Var.V = tL_messages_botResults.switch_webview;
                        int i13 = 0;
                        while (i13 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i13);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i13);
                                i13--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i13++;
                        }
                        if (h1Var.S != null && str3.length() != 0) {
                            h1Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                h1Var.f17620t0 = "";
                            }
                            z10 = true;
                        } else {
                            h1Var.S = tL_messages_botResults.results;
                            h1Var.f17628y0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        a8 a8Var = h1Var.f17615q0;
                        if (a8Var != null) {
                            org.telegram.messenger.g0.r(a8Var);
                            r32 = 0;
                            h1Var.f17615q0 = null;
                        } else {
                            r32 = 0;
                        }
                        h1Var.J = r32;
                        h1Var.B0 = r32;
                        h1Var.f17627y = r32;
                        h1Var.E = r32;
                        h1Var.K = r32;
                        h1Var.R = r32;
                        h1Var.N = r32;
                        h1Var.O = r32;
                        h1Var.L = r32;
                        h1Var.Q = r32;
                        h1Var.f17614p0 = false;
                        if (h1Var.S.isEmpty() && h1Var.U == null && h1Var.V == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        n90Var.a(z11);
                        if (z10) {
                            if (h1Var.U == null && h1Var.V == null) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            h1Var.g(((h1Var.S.size() - tL_messages_botResults.results.size()) + i7) - 1);
                            h1Var.o((h1Var.S.size() - tL_messages_botResults.results.size()) + i7, tL_messages_botResults.results.size());
                            return;
                        }
                        h1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.f17801b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                return;
            default:
                hi.e eVar = (hi.e) obj7;
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj6;
                m2 m2Var = v0Var.f45260g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                h2 h2Var = (h2) obj4;
                TextView textView = (TextView) obj3;
                p9 p9Var = (p9) obj2;
                TextView textView2 = (TextView) obj;
                if (z14) {
                    eVar.setEnabled((!v0Var.N() || v0Var.y() == null || v0Var.E() == null || eVar.R) ? false : false);
                    return;
                }
                ArrayList arrayList = m2Var.d;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        Object obj8 = arrayList.get(i14);
                        int i15 = i14 + 1;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                        r15 = 0;
                        ArrayList arrayList2 = arrayList;
                        if (tonconnectsession2.f28754id == tonconnectsession.f28754id) {
                            h2Var.f44422e = tonconnectsession2;
                        } else {
                            i14 = i15;
                            arrayList = arrayList2;
                        }
                    } else {
                        r15 = 0;
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = h2Var.f44422e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z12 = true;
                } else {
                    z12 = r15;
                }
                if (z12 && !h2Var.f44423f) {
                    z13 = true;
                } else {
                    z13 = r15;
                }
                eVar.setEnabled(z13);
                TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                if (tonconnectmanifest != null) {
                    Object[] objArr = new Object[1];
                    objArr[r15] = tonconnectmanifest.name;
                    str = null;
                    textView.setText(gd.V(null, null, 2131742909, objArr));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        p9Var.p(fc.p(g20.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                } else {
                    str = null;
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[r15] = num;
                    textView2.setText(gd.a0(str, str, 2131742731, objArr2));
                    return;
                } else if (!z12) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i11 = 2131748586;
                    } else {
                        i11 = 2131742721;
                    }
                    textView2.setText(gd.N0(i11, str));
                    return;
                } else {
                    m2Var.getClass();
                    if (m2.w(h2Var)) {
                        i10 = 2131742910;
                    } else {
                        i10 = 2131742912;
                    }
                    textView2.setText(gd.N0(i10, str));
                    return;
                }
        }
    }

    public w0(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.f17802c = cameraController;
        this.d = camera;
        this.f17803e = cameraSession;
        this.f17801b = z10;
        this.f17804f = file;
        this.h = cameraInfo;
        this.f17805n = videoTakeCallback;
        this.f17806r = runnable;
    }

    public w0(boolean z10, hi.e eVar, org.telegram.ui.Wallet.v0 v0Var, TL_wallet.tonConnectSession tonconnectsession, h2 h2Var, TextView textView, p9 p9Var, TextView textView2) {
        this.f17801b = z10;
        this.f17802c = eVar;
        this.d = v0Var;
        this.f17803e = tonconnectsession;
        this.f17804f = h2Var;
        this.h = textView;
        this.f17805n = p9Var;
        this.f17806r = textView2;
    }
}
