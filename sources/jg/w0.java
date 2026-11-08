package jg;

import android.hardware.Camera;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraInfo;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.m20;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Wallet.e2;
public final class w0 implements Runnable {
    public final int f16970a = 0;
    public final boolean f16971b;
    public final Object f16972c;
    public final Object d;
    public final Object f16973e;
    public final Object f16974f;
    public final Object h;
    public final Object f16975n;
    public final Object f16976r;

    public w0(i1 i1Var, String str, boolean z9, TLObject tLObject, TLRPC.User user, String str2, yr yrVar, String str3) {
        this.f16972c = i1Var;
        this.d = str;
        this.f16971b = z9;
        this.h = tLObject;
        this.f16975n = user;
        this.f16973e = str2;
        this.f16976r = yrVar;
        this.f16974f = str3;
    }

    @Override
    public final void run() {
        boolean z9;
        ?? r32;
        boolean z10;
        int i7;
        ?? r15;
        boolean z11;
        boolean z12;
        String str;
        int i10;
        int i11;
        int i12 = this.f16970a;
        boolean z13 = this.f16971b;
        Object obj = this.f16976r;
        Object obj2 = this.f16975n;
        Object obj3 = this.h;
        Object obj4 = this.f16974f;
        Object obj5 = this.f16973e;
        Object obj6 = this.d;
        Object obj7 = this.f16972c;
        boolean z14 = true;
        switch (i12) {
            case 0:
                i1 i1Var = (i1) obj7;
                String str2 = (String) obj6;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                String str3 = (String) obj5;
                yr yrVar = (yr) obj;
                String str4 = (String) obj4;
                b90 b90Var = i1Var.V;
                if (str2.equals(i1Var.f16795r0)) {
                    i1Var.f16799u0 = 0;
                    if (z13 && tLObject == null) {
                        i1Var.T(false, user, str2, str3);
                    } else if (b90Var != null) {
                        b90Var.b(false);
                    }
                    if (tLObject instanceof TLRPC.TL_messages_botResults) {
                        TLRPC.TL_messages_botResults tL_messages_botResults = (TLRPC.TL_messages_botResults) tLObject;
                        if (!z13 && tL_messages_botResults.cache_time != 0) {
                            yrVar.v1(str4, tL_messages_botResults);
                        }
                        i1Var.f16797s0 = tL_messages_botResults.next_offset;
                        if (i1Var.T == null) {
                            i1Var.T = tL_messages_botResults.switch_pm;
                        }
                        i1Var.U = tL_messages_botResults.switch_webview;
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
                        if (i1Var.R != null && str3.length() != 0) {
                            i1Var.R.addAll(tL_messages_botResults.results);
                            if (tL_messages_botResults.results.isEmpty()) {
                                i1Var.f16797s0 = "";
                            }
                            z9 = true;
                        } else {
                            i1Var.R = tL_messages_botResults.results;
                            i1Var.f16804x0 = tL_messages_botResults.gallery;
                            z9 = false;
                        }
                        fi.x1 x1Var = i1Var.f16792p0;
                        if (x1Var != null) {
                            org.telegram.messenger.g0.r(x1Var);
                            r32 = 0;
                            i1Var.f16792p0 = null;
                        } else {
                            r32 = 0;
                        }
                        i1Var.I = r32;
                        i1Var.A0 = r32;
                        i1Var.f16805y = r32;
                        i1Var.D = r32;
                        i1Var.J = r32;
                        i1Var.Q = r32;
                        i1Var.M = r32;
                        i1Var.N = r32;
                        i1Var.K = r32;
                        i1Var.P = r32;
                        i1Var.f16791o0 = false;
                        if (i1Var.R.isEmpty() && i1Var.T == null && i1Var.U == null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        b90Var.a(z10);
                        if (z9) {
                            if (i1Var.T == null && i1Var.U == null) {
                                i7 = 0;
                            } else {
                                i7 = 1;
                            }
                            i1Var.g(((i1Var.R.size() - tL_messages_botResults.results.size()) + i7) - 1);
                            i1Var.o((i1Var.R.size() - tL_messages_botResults.results.size()) + i7, tL_messages_botResults.results.size());
                            return;
                        }
                        i1Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((CameraController) obj7).lambda$recordVideo$14((Camera) obj6, (CameraSession) obj5, this.f16971b, (File) obj4, (CameraInfo) obj3, (CameraController.VideoTakeCallback) obj2, (Runnable) obj);
                return;
            default:
                fi.d dVar = (fi.d) obj7;
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj6;
                e2 e2Var = m0Var.f42767g;
                TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj5;
                org.telegram.ui.Wallet.z1 z1Var = (org.telegram.ui.Wallet.z1) obj4;
                TextView textView = (TextView) obj3;
                l9 l9Var = (l9) obj2;
                TextView textView2 = (TextView) obj;
                if (z13) {
                    dVar.setEnabled((!m0Var.G() || m0Var.t() == null || m0Var.y() == null || dVar.Q) ? false : false);
                    return;
                }
                ArrayList arrayList = e2Var.d;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        Object obj8 = arrayList.get(i14);
                        int i15 = i14 + 1;
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj8;
                        r15 = 0;
                        ArrayList arrayList2 = arrayList;
                        if (tonconnectsession2.f27218id == tonconnectsession.f27218id) {
                            z1Var.f43465e = tonconnectsession2;
                        } else {
                            i14 = i15;
                            arrayList = arrayList2;
                        }
                    } else {
                        r15 = 0;
                    }
                }
                TL_wallet.tonConnectSession tonconnectsession3 = z1Var.f43465e;
                if (tonconnectsession3.manifest != null && tonconnectsession3.manifest_error == null && !tonconnectsession3.closed && !tonconnectsession3.closing) {
                    z11 = true;
                } else {
                    z11 = r15;
                }
                if (z11 && !z1Var.f43466f) {
                    z12 = true;
                } else {
                    z12 = r15;
                }
                dVar.setEnabled(z12);
                TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession3.manifest;
                if (tonconnectmanifest != null) {
                    Object[] objArr = new Object[1];
                    objArr[r15] = tonconnectmanifest.name;
                    str = null;
                    textView.setText(id.V(null, null, 2131743163, objArr));
                    TLRPC.WebDocument webDocument = tonconnectsession3.manifest.icon;
                    if (webDocument != null) {
                        l9Var.p(hc.p(m20.c(webDocument)), "76_76", null, tonconnectsession3.manifest);
                    }
                } else {
                    str = null;
                }
                Integer num = tonconnectsession3.manifest_error;
                if (num != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[r15] = num;
                    textView2.setText(id.a0(str, str, 2131743005, objArr2));
                    return;
                } else if (!z11) {
                    if (!tonconnectsession3.closed && !tonconnectsession3.closing) {
                        i11 = 2131748780;
                    } else {
                        i11 = 2131742995;
                    }
                    textView2.setText(id.M0(i11, str));
                    return;
                } else {
                    e2Var.getClass();
                    if (e2.w(z1Var)) {
                        i10 = 2131743164;
                    } else {
                        i10 = 2131743166;
                    }
                    textView2.setText(id.M0(i10, str));
                    return;
                }
        }
    }

    public w0(CameraController cameraController, Camera camera, CameraSession cameraSession, boolean z9, File file, CameraInfo cameraInfo, CameraController.VideoTakeCallback videoTakeCallback, Runnable runnable) {
        this.f16972c = cameraController;
        this.d = camera;
        this.f16973e = cameraSession;
        this.f16971b = z9;
        this.f16974f = file;
        this.h = cameraInfo;
        this.f16975n = videoTakeCallback;
        this.f16976r = runnable;
    }

    public w0(boolean z9, fi.d dVar, org.telegram.ui.Wallet.m0 m0Var, TL_wallet.tonConnectSession tonconnectsession, org.telegram.ui.Wallet.z1 z1Var, TextView textView, l9 l9Var, TextView textView2) {
        this.f16971b = z9;
        this.f16972c = dVar;
        this.d = m0Var;
        this.f16973e = tonconnectsession;
        this.f16974f = z1Var;
        this.h = textView;
        this.f16975n = l9Var;
        this.f16976r = textView2;
    }
}
