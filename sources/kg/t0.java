package kg;

import android.hardware.Camera;
import android.widget.TextView;
import ei.h9;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.e20;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Wallet.c2;
public final class t0 implements Runnable {
    public final int f17190a = 0;
    public final boolean f17191b;
    public final Object f17192c;
    public final Object d;
    public final Object f17193e;
    public final Object f17194f;
    public final Object h;
    public final Object f17195n;
    public final Object f17196r;

    public t0(e1 e1Var, String str, boolean z10, TLObject tLObject, TLRPC.User user, String str2, qr qrVar, String str3) {
        this.f17192c = e1Var;
        this.d = str;
        this.f17191b = z10;
        this.h = tLObject;
        this.f17195n = user;
        this.f17193e = str2;
        this.f17196r = qrVar;
        this.f17194f = str3;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? r32;
        boolean z11;
        int i3;
        ?? r15;
        boolean z12;
        boolean z13;
        String str;
        int i10;
        int i11;
        int i12 = this.f17190a;
        boolean z14 = this.f17191b;
        Object obj = this.f17196r;
        Object obj2 = this.f17195n;
        Object obj3 = this.h;
        Object obj4 = this.f17194f;
        Object obj5 = this.f17193e;
        Object obj6 = this.d;
        Object obj7 = this.f17192c;
        boolean z15 = true;
        switch (i12) {
            case 0:
                e1 e1Var = (e1) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj5;
                qr qrVar = (qr) obj;
                String str4 = (String) obj4;
                x80 x80Var = e1Var.W;
                if (str2.equals(e1Var.f17013s0)) {
                    e1Var.f17016v0 = 0;
                    if (z14 && tLObject == null) {
                        e1Var.T(false, user, str2, str3);
                    } else if (x80Var != null) {
                        x80Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z14 && tL_messages_botResults.cache_time != 0) {
                            qrVar.v1(str4, tL_messages_botResults);
                        }
                        e1Var.f17014t0 = tL_messages_botResults.next_offset;
                        if (e1Var.U == null) {
                            e1Var.U = tL_messages_botResults.switch_pm;
                        }
                        e1Var.V = tL_messages_botResults.switch_webview;
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
                        if (e1Var.S != null && str3.length() != 0) {
                            e1Var.S.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                e1Var.f17014t0 = "";
                            }
                            z10 = true;
                        } else {
                            e1Var.S = tL_messages_botResults.results;
                            e1Var.f17022y0 = tL_messages_botResults.gallery;
                            z10 = false;
                        }
                        h9 h9Var = e1Var.f17009q0;
                        if (h9Var != null) {
                            org.telegram.messenger.g0.r(h9Var);
                            r32 = 0;
                            e1Var.f17009q0 = null;
                        } else {
                            r32 = 0;
                        }
                        e1Var.J = r32;
                        e1Var.B0 = r32;
                        e1Var.f17021y = r32;
                        e1Var.E = r32;
                        e1Var.K = r32;
                        e1Var.R = r32;
                        e1Var.N = r32;
                        e1Var.O = r32;
                        e1Var.L = r32;
                        e1Var.Q = r32;
                        e1Var.f17008p0 = false;
                        if (e1Var.S.isEmpty() && e1Var.U == null && e1Var.V == null) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        x80Var.a(z11);
                        if (z10) {
                            if (e1Var.U == null && e1Var.V == null) {
                                i3 = 0;
                            } else {
                                i3 = 1;
                            }
                            e1Var.g(((e1Var.S.size() - tL_messages_botResults.results.size()) + i3) - 1);
                            e1Var.o((e1Var.S.size() - tL_messages_botResults.results.size()) + i3, tL_messages_botResults.results.size());
                            return;
                        }
                        e1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.f17191b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                return;
            default:
                gi.d dVar = (gi.d) obj7;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj6;
                c2 c2Var = k0Var.f42723g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.x1 x1Var = (org.telegram.ui.Wallet.x1) obj4;
                TextView textView = (TextView) obj3;
                k9 k9Var = (k9) obj2;
                TextView textView2 = (TextView) obj;
                if (z14) {
                    dVar.setEnabled((!k0Var.G() || k0Var.t() == null || k0Var.y() == null || dVar.R) ? false : false);
                    return;
                }
                ArrayList arrayList = c2Var.d;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        Object obj8 = arrayList.get(i14);
                        int i15 = i14 + 1;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                        r15 = 0;
                        ArrayList arrayList2 = arrayList;
                        if (tonconnectsession2.f27264id == tonconnectsession.f27264id) {
                            x1Var.f43387e = tonconnectsession2;
                        } else {
                            i14 = i15;
                            arrayList = arrayList2;
                        }
                    } else {
                        r15 = 0;
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = x1Var.f43387e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z12 = true;
                } else {
                    z12 = r15;
                }
                if (z12 && !x1Var.f43388f) {
                    z13 = true;
                } else {
                    z13 = r15;
                }
                dVar.setEnabled(z13);
                TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                if (tonconnectmanifest != null) {
                    Object[] objArr = new Object[1];
                    objArr[r15] = tonconnectmanifest.name;
                    str = null;
                    textView.setText(bd.V(null, null, 2131743170, objArr));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        k9Var.p(ac.p(e20.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                } else {
                    str = null;
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[r15] = num;
                    textView2.setText(bd.a0(str, str, 2131743012, objArr2));
                    return;
                } else if (!z12) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i11 = 2131748787;
                    } else {
                        i11 = 2131743002;
                    }
                    textView2.setText(bd.M0(i11, str));
                    return;
                } else {
                    c2Var.getClass();
                    if (c2.w(x1Var)) {
                        i10 = 2131743171;
                    } else {
                        i10 = 2131743173;
                    }
                    textView2.setText(bd.M0(i10, str));
                    return;
                }
        }
    }

    public t0(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z10, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.f17192c = cameraController;
        this.d = camera;
        this.f17193e = cameraSession;
        this.f17191b = z10;
        this.f17194f = file;
        this.h = cameraInfo;
        this.f17195n = videoTakeCallback;
        this.f17196r = runnable;
    }

    public t0(boolean z10, gi.d dVar, org.telegram.ui.Wallet.k0 k0Var, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.x1 x1Var, TextView textView, k9 k9Var, TextView textView2) {
        this.f17191b = z10;
        this.f17192c = dVar;
        this.d = k0Var;
        this.f17193e = tonconnectsession;
        this.f17194f = x1Var;
        this.h = textView;
        this.f17195n = k9Var;
        this.f17196r = textView2;
    }
}
