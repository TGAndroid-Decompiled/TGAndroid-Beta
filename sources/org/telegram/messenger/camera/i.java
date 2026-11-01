package org.telegram.messenger.camera;

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.c30;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.is;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Wallet.e2;
import org.telegram.ui.Wallet.k0;
import org.telegram.ui.Wallet.z1;
import zf.x0;
public final class i implements Runnable {
    public final int f15109a = 0;
    public final boolean f15110b;
    public final Object f15111c;
    public final Object d;
    public final Object e;
    public final Object f15112f;
    public final Object h;
    public final Object f15113n;
    public final Object f15114r;

    public i(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.f15111c = cameraController;
        this.d = camera;
        this.e = cameraSession;
        this.f15110b = z10;
        this.f15112f = file;
        this.h = cameraInfo;
        this.f15113n = videoTakeCallback;
        this.f15114r = runnable;
    }

    @Override
    public final void run() {
        ?? r17;
        boolean z10;
        boolean z11;
        String str;
        int i10;
        int i11;
        boolean z12;
        boolean z13;
        int i12 = this.f15109a;
        boolean z14 = this.f15110b;
        Object obj = this.f15114r;
        Object obj2 = this.f15113n;
        Object obj3 = this.h;
        Object obj4 = this.f15112f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.f15111c;
        boolean z15 = false;
        int i13 = 0;
        r11 = false;
        r11 = false;
        r11 = false;
        boolean z16 = false;
        switch (i12) {
            case 0:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.f15110b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                return;
            case 1:
                vh.d dVar = (vh.d) obj7;
                k0 k0Var = (k0) obj6;
                e2 e2Var = k0Var.f34785g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                z1 z1Var = (z1) obj4;
                TextView textView = (TextView) obj3;
                g9 g9Var = (g9) obj2;
                TextView textView2 = (TextView) obj;
                if (z14) {
                    if (k0Var.G() && k0Var.t() != null && k0Var.y() != null && !dVar.Q) {
                        z16 = true;
                    }
                    dVar.setEnabled(z16);
                    return;
                }
                ArrayList arrayList = e2Var.d;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        Object obj8 = arrayList.get(i14);
                        i14++;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                        ArrayList arrayList2 = arrayList;
                        boolean z17 = z15;
                        if (tonconnectsession2.f20056id == tonconnectsession.f20056id) {
                            z1Var.e = tonconnectsession2;
                            r17 = z17;
                        } else {
                            arrayList = arrayList2;
                            z15 = z17 ? 1 : 0;
                        }
                    } else {
                        r17 = z15;
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = z1Var.e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z10 = true;
                } else {
                    z10 = r17;
                }
                if (z10 && !z1Var.f35454f) {
                    z11 = true;
                } else {
                    z11 = r17;
                }
                dVar.setEnabled(z11);
                TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                if (tonconnectmanifest != null) {
                    Object[] objArr = new Object[1];
                    objArr[r17] = tonconnectmanifest.name;
                    str = null;
                    textView.setText(dd.V(null, null, 2131743186, objArr));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        g9Var.p(jc.p(c30.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                } else {
                    str = null;
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[r17] = num;
                    textView2.setText(dd.a0(str, str, 2131743028, objArr2));
                    return;
                } else if (!z10) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i11 = 2131748789;
                    } else {
                        i11 = 2131743018;
                    }
                    textView2.setText(dd.L0(i11, str));
                    return;
                } else {
                    e2Var.getClass();
                    if (e2.w(z1Var)) {
                        i10 = 2131743187;
                    } else {
                        i10 = 2131743189;
                    }
                    textView2.setText(dd.L0(i10, str));
                    return;
                }
            default:
                x0 x0Var = (x0) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj5;
                TLRPC.User user = (TLRPC.User) obj4;
                String str3 = (String) obj3;
                is isVar = (is) obj2;
                String str4 = (String) obj;
                t90 t90Var = x0Var.V;
                if (str2.equals(x0Var.f55683r0)) {
                    x0Var.f55687u0 = 0;
                    if (z14 && tLObject == null) {
                        x0Var.T(false, user, str2, str3);
                    } else if (t90Var != null) {
                        t90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z14 && tL_messages_botResults.cache_time != 0) {
                            isVar.v1(str4, tL_messages_botResults);
                        }
                        x0Var.f55685s0 = tL_messages_botResults.next_offset;
                        if (x0Var.T == null) {
                            x0Var.T = tL_messages_botResults.switch_pm;
                        }
                        x0Var.U = tL_messages_botResults.switch_webview;
                        int i15 = 0;
                        while (i15 < tL_messages_botResults.results.size()) {
                            TLRPC.BotInlineResult botInlineResult = tL_messages_botResults.results.get(i15);
                            if (!(botInlineResult.document instanceof TLRPC.TL_document) && !(botInlineResult.photo instanceof TLRPC.TL_photo) && !"game".equals(botInlineResult.type) && botInlineResult.content == null && (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto)) {
                                tL_messages_botResults.results.remove(i15);
                                i15--;
                            }
                            botInlineResult.query_id = tL_messages_botResults.query_id;
                            i15++;
                        }
                        if (x0Var.R != null && str3.length() != 0) {
                            x0Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                x0Var.f55685s0 = "";
                            }
                            z12 = true;
                        } else {
                            x0Var.R = tL_messages_botResults.results;
                            x0Var.f55692x0 = tL_messages_botResults.gallery;
                            z12 = false;
                        }
                        zf.k0 k0Var2 = x0Var.f55680p0;
                        if (k0Var2 != null) {
                            i0.r(k0Var2);
                            x0Var.f55680p0 = null;
                        }
                        x0Var.I = null;
                        x0Var.A0 = null;
                        x0Var.f55693y = null;
                        x0Var.D = null;
                        x0Var.J = null;
                        x0Var.Q = null;
                        x0Var.M = null;
                        x0Var.N = null;
                        x0Var.K = null;
                        x0Var.P = null;
                        x0Var.f55679o0 = false;
                        if (x0Var.R.isEmpty() && x0Var.T == null && x0Var.U == null) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        t90Var.a(z13);
                        if (z12) {
                            if (x0Var.T != null || x0Var.U != null) {
                                i13 = 1;
                            }
                            x0Var.g(((x0Var.R.size() - tL_messages_botResults.results.size()) + i13) - 1);
                            x0Var.o((x0Var.R.size() - tL_messages_botResults.results.size()) + i13, tL_messages_botResults.results.size());
                            return;
                        }
                        x0Var.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i(x0 x0Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, is isVar, String str3) {
        this.f15111c = x0Var;
        this.d = str;
        this.f15110b = z10;
        this.e = tLObject;
        this.f15112f = user;
        this.h = str2;
        this.f15113n = isVar;
        this.f15114r = str3;
    }

    public i(boolean z10, vh.d dVar, k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, z1 z1Var, TextView textView, g9 g9Var, TextView textView2) {
        this.f15110b = z10;
        this.f15111c = dVar;
        this.d = k0Var;
        this.e = tonconnectsession;
        this.f15112f = z1Var;
        this.h = textView;
        this.f15113n = g9Var;
        this.f15114r = textView2;
    }
}
