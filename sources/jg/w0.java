package jg;

import android.hardware.Camera;
import android.widget.TextView;
import di.a8;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Wallet.g2;
import org.telegram.ui.Wallet.l2;
public final class w0 implements Runnable {
    public final int f17732a = 0;
    public final boolean f17733b;
    public final Object f17734c;
    public final Object d;
    public final Object f17735e;
    public final Object f17736f;
    public final Object h;
    public final Object f17737n;
    public final Object f17738r;

    public w0(h1 h1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, ur urVar, String str3) {
        this.f17734c = h1Var;
        this.d = str;
        this.f17733b = z10;
        this.h = tLObject;
        this.f17737n = user;
        this.f17735e = str2;
        this.f17738r = urVar;
        this.f17736f = str3;
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
        int i12 = this.f17732a;
        boolean z14 = this.f17733b;
        Object obj = this.f17738r;
        Object obj2 = this.f17737n;
        Object obj3 = this.h;
        Object obj4 = this.f17736f;
        Object obj5 = this.f17735e;
        Object obj6 = this.d;
        Object obj7 = this.f17734c;
        boolean z15 = true;
        switch (i12) {
            case 0:
                h1 h1Var = (h1) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj5;
                ur urVar = (ur) obj;
                String str4 = (String) obj4;
                q90 q90Var = h1Var.W;
                if (str2.equals(h1Var.f17551s0)) {
                    h1Var.f17554v0 = 0;
                    if (z14 && tLObject == null) {
                        h1Var.T(false, user, str2, str3);
                    } else if (q90Var != null) {
                        q90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z14 && tL_messages_botResults.cache_time != 0) {
                            urVar.v1(str4, tL_messages_botResults);
                        }
                        h1Var.f17552t0 = tL_messages_botResults.next_offset;
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
                                h1Var.f17552t0 = "";
                            }
                            z10 = true;
                        } else {
                            h1Var.S = tL_messages_botResults.results;
                            h1Var.f17560y0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        a8 a8Var = h1Var.f17547q0;
                        if (a8Var != null) {
                            org.telegram.messenger.g0.r(a8Var);
                            r32 = 0;
                            h1Var.f17547q0 = null;
                        } else {
                            r32 = 0;
                        }
                        h1Var.J = r32;
                        h1Var.B0 = r32;
                        h1Var.f17559y = r32;
                        h1Var.E = r32;
                        h1Var.K = r32;
                        h1Var.R = r32;
                        h1Var.N = r32;
                        h1Var.O = r32;
                        h1Var.L = r32;
                        h1Var.Q = r32;
                        h1Var.f17546p0 = false;
                        if (h1Var.S.isEmpty() && h1Var.U == null && h1Var.V == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        q90Var.a(z11);
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
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.f17733b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                return;
            default:
                hi.e eVar = (hi.e) obj7;
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj6;
                l2 l2Var = u0Var.f45132g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                g2 g2Var = (g2) obj4;
                TextView textView = (TextView) obj3;
                q9 q9Var = (q9) obj2;
                TextView textView2 = (TextView) obj;
                if (z14) {
                    eVar.setEnabled((!u0Var.N() || u0Var.y() == null || u0Var.E() == null || eVar.R) ? false : false);
                    return;
                }
                ArrayList arrayList = l2Var.d;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        Object obj8 = arrayList.get(i14);
                        int i15 = i14 + 1;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                        r15 = 0;
                        ArrayList arrayList2 = arrayList;
                        if (tonconnectsession2.f28696id == tonconnectsession.f28696id) {
                            g2Var.f44294e = tonconnectsession2;
                        } else {
                            i14 = i15;
                            arrayList = arrayList2;
                        }
                    } else {
                        r15 = 0;
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = g2Var.f44294e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z12 = true;
                } else {
                    z12 = r15;
                }
                if (z12 && !g2Var.f44295f) {
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
                    textView.setText(hd.V(null, null, 2131742914, objArr));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        q9Var.p(gc.p(i20.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                } else {
                    str = null;
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[r15] = num;
                    textView2.setText(hd.a0(str, str, 2131742736, objArr2));
                    return;
                } else if (!z12) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i11 = 2131748586;
                    } else {
                        i11 = 2131742726;
                    }
                    textView2.setText(hd.N0(i11, str));
                    return;
                } else {
                    l2Var.getClass();
                    if (l2.w(g2Var)) {
                        i10 = 2131742915;
                    } else {
                        i10 = 2131742917;
                    }
                    textView2.setText(hd.N0(i10, str));
                    return;
                }
        }
    }

    public w0(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.f17734c = cameraController;
        this.d = camera;
        this.f17735e = cameraSession;
        this.f17733b = z10;
        this.f17736f = file;
        this.h = cameraInfo;
        this.f17737n = videoTakeCallback;
        this.f17738r = runnable;
    }

    public w0(boolean z10, hi.e eVar, org.telegram.ui.Wallet.u0 u0Var, TL_wallet.tonConnectSession tonconnectsession, g2 g2Var, TextView textView, q9 q9Var, TextView textView2) {
        this.f17733b = z10;
        this.f17734c = eVar;
        this.d = u0Var;
        this.f17735e = tonconnectsession;
        this.f17736f = g2Var;
        this.h = textView;
        this.f17737n = q9Var;
        this.f17738r = textView2;
    }
}
