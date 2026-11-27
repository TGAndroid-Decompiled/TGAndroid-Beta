package defpackage;

import android.net.Uri;
import android.transition.TransitionManager;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.VoIPPendingCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.webrtc.VideoFileRenderer;
public final class azb implements Runnable {
    public final byte a;
    public final Object b;

    public azb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        vh4 vh4Var = (vh4) this.b;
        Map map = null;
        ((AtomicReference) vh4Var.c).set(null);
        synchronized (vh4Var) {
            if (((AtomicMarkableReference) vh4Var.b).isMarked()) {
                map = ((vx5) ((AtomicMarkableReference) vh4Var.b).getReference()).a();
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) vh4Var.b;
                atomicMarkableReference.set((vx5) atomicMarkableReference.getReference(), false);
            }
        }
        if (map != null) {
            gd4 gd4Var = (gd4) vh4Var.d;
            ((rf7) gd4Var.b).h((String) gd4Var.a, map, vh4Var.a);
        }
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2 = true;
        String str = null;
        switch (this.a) {
            case 0:
                ((dzb) this.b).b.D0();
                return;
            case 1:
                l1c l1cVar = (l1c) ((i1a) this.b).c;
                if (l1cVar.i()) {
                    l1cVar.j();
                    return;
                }
                return;
            case 2:
                ((a4c) this.b).c.setVisibility(8);
                return;
            case 3:
                ((as1) this.b).c.presentFragment(new ee9());
                return;
            case 4:
                a5c a5cVar = (a5c) this.b;
                uc7 uc7Var = a5cVar.n;
                String string = uc7Var.Y3.getString("translating_dialog_languages2", null);
                if (string != null) {
                    for (String str2 : string.split(";")) {
                        String[] split = str2.split("=");
                        if (split.length >= 2) {
                            long parseLong = Long.parseLong(split[0]);
                            String[] split2 = split[1].split(">");
                            if (split2.length == 2) {
                                String str3 = split2[0];
                                String str4 = split2[1];
                                if (str4.length() > 0 && str4.charAt(str4.length() - 1) == '!') {
                                    str4 = bs2.n(1, 0, str4);
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if ("null".equals(str3)) {
                                    str3 = null;
                                }
                                if ("null".equals(str4)) {
                                    str4 = null;
                                }
                                if (str3 != null) {
                                    a5cVar.e.put(Long.valueOf(parseLong), str3);
                                    if (!a5cVar.v(str3)) {
                                        a5cVar.a.put(parseLong, Boolean.valueOf(!z));
                                        a5cVar.b.add(Long.valueOf(parseLong));
                                    }
                                    if (str4 != null) {
                                        a5cVar.d.put(Long.valueOf(parseLong), str4);
                                    }
                                }
                            }
                        }
                    }
                    Set<String> stringSet = uc7Var.Y3.getStringSet("hidden_translation_at", null);
                    if (stringSet != null) {
                        for (String str5 : stringSet) {
                            try {
                                a5cVar.h.add(Long.valueOf(Long.parseLong(str5)));
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((n5c) this.b).requestLayout();
                return;
            case 6:
                ((z7c) this.b).f();
                return;
            case 7:
                z8c z8cVar = ((a9c) this.b).a;
                if (z8cVar != null) {
                    z8cVar.f();
                    return;
                }
                return;
            case 8:
                UndoView undoView = (UndoView) this.b;
                int i = UndoView.j0;
                try {
                    undoView.f.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                ((fac) this.b).invalidateSelf();
                return;
            case 10:
                gd4 gd4Var = (gd4) this.b;
                synchronized (((AtomicMarkableReference) gd4Var.g)) {
                    if (((AtomicMarkableReference) gd4Var.g).isMarked()) {
                        str = (String) ((AtomicMarkableReference) gd4Var.g).getReference();
                        ((AtomicMarkableReference) gd4Var.g).set(str, false);
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((rf7) gd4Var.b).i((String) gd4Var.a, str);
                    return;
                }
                return;
            case 11:
                a();
                return;
            case 12:
                rf4 rf4Var = ((kec) this.b).b;
                if (rf4Var != null) {
                    rf4Var.b(false, true, false);
                    return;
                }
                return;
            case 13:
                VideoFileRenderer.b((VideoFileRenderer) this.b);
                return;
            case 14:
                ((yec) this.b).c();
                return;
            case 15:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                return;
            case 16:
                kfc kfcVar = (kfc) this.b;
                s64 s64Var = kfcVar.d;
                if (s64Var != null) {
                    TextureView textureView = kfcVar.n;
                    s64Var.y1();
                    if (textureView != null && textureView == s64Var.X) {
                        s64Var.y1();
                        s64Var.i1();
                        s64Var.q1(null);
                        s64Var.f1(0, 0);
                    }
                    kfcVar.d.s1(kfcVar.n);
                    ArrayList arrayList = kfcVar.O;
                    if (arrayList != null) {
                        kfcVar.j0(arrayList, kfcVar.P);
                    } else {
                        boolean z3 = kfcVar.V;
                        Uri uri = kfcVar.R;
                        String str6 = kfcVar.T;
                        if (z3) {
                            kfcVar.k0(uri, str6, kfcVar.S, kfcVar.U);
                        } else {
                            kfcVar.i0(uri, str6);
                        }
                    }
                    kfcVar.g0();
                    return;
                }
                return;
            case 17:
                kfc kfcVar2 = (kfc) ((lm9) this.b).f;
                kfcVar2.b0.removeCallbacksAndMessages(null);
                kfcVar2.L.t(false, null);
                return;
            case 18:
                ((sfc) this.b).g = false;
                return;
            case 19:
                ((yfc) this.b).a();
                return;
            case 20:
                cgc cgcVar = (cgc) this.b;
                cgcVar.h = 0.0f;
                lm lmVar = cgcVar.b;
                if (lmVar != null) {
                    lmVar.u();
                    cgcVar.b = null;
                    return;
                }
                return;
            case 21:
                ((hjc) this.b).c();
                return;
            case 22:
                ((VoIPFeedbackActivity) this.b).finish();
                return;
            case 23:
                ((dkc) this.b).a.y();
                return;
            case 24:
                ((ekc) this.b).a.y();
                return;
            case 25:
                mkc mkcVar = ((ckc) this.b).b;
                mkcVar.L0.e();
                dlc.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                mkcVar.Z.setCornerRadius(-1.0f);
                mkcVar.d0.d.e();
                mkcVar.e0.d.e();
                mkcVar.c0.e();
                mkcVar.b();
                mkcVar.u0.d();
                dlc.T = false;
                mkcVar.E0 = false;
                mkc.m1 = null;
                elc.c();
                return;
            case 26:
                kkc kkcVar = (kkc) this.b;
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (kkcVar.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                zkc zkcVar = (zkc) this.b;
                zkcVar.e = false;
                HashMap hashMap = zkcVar.a;
                ArrayList arrayList2 = zkcVar.c;
                ArrayList arrayList3 = zkcVar.b;
                if (!arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                    if (zkcVar.getParent() != null) {
                        TransitionManager.beginDelayedTransition(zkcVar, zkcVar.d);
                    }
                    int i2 = 0;
                    while (i2 < arrayList3.size()) {
                        ykc ykcVar = (ykc) arrayList3.get(i2);
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList2.size()) {
                                break;
                            } else if (ykcVar.a.equals(((ykc) arrayList2.get(i3)).a)) {
                                arrayList3.remove(i2);
                                arrayList2.remove(i3);
                                i2--;
                            } else {
                                i3++;
                            }
                        }
                        i2++;
                    }
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        zkcVar.addView((View) arrayList3.get(i4), tre.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                        zkcVar.removeView((View) arrayList2.get(i5));
                    }
                    hashMap.clear();
                    for (int i6 = 0; i6 < zkcVar.getChildCount(); i6++) {
                        ykc ykcVar2 = (ykc) zkcVar.getChildAt(i6);
                        hashMap.put(ykcVar2.a, ykcVar2);
                    }
                    arrayList3.clear();
                    arrayList2.clear();
                    zkcVar.e = true;
                    hl.d3(new azb(zkcVar, (byte) 27), 700L);
                    Runnable runnable = zkcVar.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                VoIPPendingCall.a((VoIPPendingCall) this.b);
                return;
            default:
                ((VoIPPermissionActivity) this.b).finish();
                return;
        }
    }
}
