package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.VoIPPendingCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.ui.VoIPFeedbackActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFileRenderer;
public final class f8c implements Runnable {
    public final byte a;
    public final Object b;

    public f8c(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        yh4 yh4Var = (yh4) this.b;
        Map map = null;
        ((AtomicReference) yh4Var.c).set(null);
        synchronized (yh4Var) {
            if (((AtomicMarkableReference) yh4Var.b).isMarked()) {
                map = ((qx5) ((AtomicMarkableReference) yh4Var.b).getReference()).a();
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) yh4Var.b;
                atomicMarkableReference.set((qx5) atomicMarkableReference.getReference(), false);
            }
        }
        if (map != null) {
            jd4 jd4Var = (jd4) yh4Var.d;
            ((jf7) jd4Var.b).h((String) jd4Var.a, map, yh4Var.a);
        }
    }

    @Override
    public final void run() {
        View d;
        boolean z = true;
        String str = null;
        switch (this.a) {
            case 0:
                ((g8c) this.b).invalidateSelf();
                return;
            case 1:
                jd4 jd4Var = (jd4) this.b;
                synchronized (((AtomicMarkableReference) jd4Var.g)) {
                    if (((AtomicMarkableReference) jd4Var.g).isMarked()) {
                        str = (String) ((AtomicMarkableReference) jd4Var.g).getReference();
                        ((AtomicMarkableReference) jd4Var.g).set(str, false);
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    ((jf7) jd4Var.b).i((String) jd4Var.a, str);
                    return;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                uf4 uf4Var = ((ncc) this.b).b;
                if (uf4Var != null) {
                    uf4Var.b(false, true, false);
                    return;
                }
                return;
            case 4:
                VideoFileRenderer.c((VideoFileRenderer) this.b);
                return;
            case 5:
                ((bdc) this.b).c();
                return;
            case 6:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                return;
            case 7:
                ndc ndcVar = (ndc) this.b;
                h74 h74Var = ndcVar.d;
                if (h74Var != null) {
                    TextureView textureView = ndcVar.n;
                    h74Var.y1();
                    if (textureView != null && textureView == h74Var.X) {
                        h74Var.y1();
                        h74Var.i1();
                        h74Var.q1(null);
                        h74Var.f1(0, 0);
                    }
                    ndcVar.d.s1(ndcVar.n);
                    ArrayList arrayList = ndcVar.O;
                    if (arrayList != null) {
                        ndcVar.j0(arrayList, ndcVar.P);
                    } else {
                        boolean z2 = ndcVar.V;
                        Uri uri = ndcVar.R;
                        String str2 = ndcVar.T;
                        if (z2) {
                            ndcVar.k0(uri, str2, ndcVar.S, ndcVar.U);
                        } else {
                            ndcVar.i0(uri, str2);
                        }
                    }
                    ndcVar.g0();
                    return;
                }
                return;
            case 8:
                ndc ndcVar2 = (ndc) ((yk9) this.b).f;
                ndcVar2.b0.removeCallbacksAndMessages(null);
                ndcVar2.L.s(false, null);
                return;
            case 9:
                ((vdc) this.b).g = false;
                return;
            case 10:
                ((bec) this.b).a();
                return;
            case 11:
                fec fecVar = (fec) this.b;
                fecVar.h = 0.0f;
                kn knVar = fecVar.b;
                if (knVar != null) {
                    knVar.u();
                    fecVar.b = null;
                    return;
                }
                return;
            case 12:
                ((ihc) this.b).c();
                return;
            case 13:
                ((VoIPFeedbackActivity) this.b).finish();
                return;
            case 14:
                ((zhc) this.b).a.y();
                return;
            case 15:
                ((aic) this.b).a.y();
                return;
            case 16:
                iic iicVar = ((yhc) this.b).b;
                iicVar.L0.e();
                yic.d().getClass();
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().swapSinks();
                }
                iicVar.Z.setCornerRadius(-1.0f);
                iicVar.d0.d.release();
                iicVar.e0.d.release();
                iicVar.c0.release();
                iicVar.b();
                iicVar.u0.d();
                yic.T = false;
                iicVar.E0 = false;
                iic.m1 = null;
                zic.b();
                return;
            case 17:
                gic gicVar = (gic) this.b;
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    if (gicVar.a.n0 && VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().requestVideoCall(false);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                uic uicVar = (uic) this.b;
                uicVar.e = false;
                HashMap hashMap = uicVar.a;
                ArrayList arrayList2 = uicVar.c;
                ArrayList arrayList3 = uicVar.b;
                if (!arrayList3.isEmpty() || !arrayList2.isEmpty()) {
                    if (uicVar.getParent() != null) {
                        TransitionManager.beginDelayedTransition(uicVar, uicVar.d);
                    }
                    int i = 0;
                    while (i < arrayList3.size()) {
                        tic ticVar = (tic) arrayList3.get(i);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList2.size()) {
                                break;
                            } else if (ticVar.a.equals(((tic) arrayList2.get(i2)).a)) {
                                arrayList3.remove(i);
                                arrayList2.remove(i2);
                                i--;
                            } else {
                                i2++;
                            }
                        }
                        i++;
                    }
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        uicVar.addView((View) arrayList3.get(i3), qoe.t(-2, -2, 1, 4, 0, 0, 4));
                    }
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        uicVar.removeView((View) arrayList2.get(i4));
                    }
                    hashMap.clear();
                    for (int i5 = 0; i5 < uicVar.getChildCount(); i5++) {
                        tic ticVar2 = (tic) uicVar.getChildAt(i5);
                        hashMap.put(ticVar2.a, ticVar2);
                    }
                    arrayList3.clear();
                    arrayList2.clear();
                    uicVar.e = true;
                    gm.d3(new f8c(uicVar, (byte) 18), 700L);
                    Runnable runnable = uicVar.h;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((VoIPPendingCall) this.b).lambda$new$1();
                return;
            case 20:
                ((VoIPPermissionActivity) this.b).finish();
                return;
            case 21:
                cq9 cq9Var = (cq9) this.b;
                cq9Var.a.clear();
                SurfaceTextureHelper surfaceTextureHelper = cq9Var.b;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    cq9Var.b.dispose();
                    cq9Var.b = null;
                }
                Surface surface = cq9Var.c;
                if (surface != null) {
                    surface.release();
                    cq9Var.c = null;
                    return;
                }
                return;
            case 22:
                VoIPService.lambda$updateBluetoothHeadsetState$109((VoipAudioManager) this.b);
                return;
            case 23:
                TextView[] textViewArr = ((xjc) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 24:
                TextView[] textViewArr2 = ((xjc) ((rb2) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 25:
                bkc bkcVar = (bkc) this.b;
                if (bkcVar.getVisibility() == 0) {
                    bkcVar.a();
                    return;
                }
                return;
            case 26:
                fkc fkcVar = (fkc) this.b;
                fkcVar.e = Bitmap.createBitmap(fkcVar.getMeasuredWidth(), fkcVar.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(fkcVar.e).drawText(fkcVar.d, fkcVar.getMeasuredWidth() / 2, (int) ((fkcVar.getMeasuredHeight() / 2) - ((fkcVar.a.ascent() + fkcVar.a.descent()) / 2.0f)), fkcVar.a);
                fkcVar.postInvalidate();
                return;
            case 27:
                jlc jlcVar = (jlc) this.b;
                if (!jlcVar.p0) {
                    jlcVar.setVisibility(8);
                    jlcVar.s();
                    jlc jlcVar2 = jlcVar.a.h;
                    if (jlcVar2 != null) {
                        gm.B2(jlcVar2);
                        Log.d("VoiceLive", "overlay removed");
                        return;
                    }
                    return;
                }
                return;
            case 28:
                coc cocVar = (coc) this.b;
                va vaVar = cocVar.c;
                if (vaVar != null && vaVar.getScrollState() == 0) {
                    q7c r0 = cocVar.j.r0();
                    if ((r0 == null || r0.getScrollState() == 0) && (d = cocVar.d(cocVar.c.f3)) != null) {
                        u46 u46Var = cocVar.c.f3;
                        u46Var.getClass();
                        int i6 = new int[]{0, f69.y(d) - u46Var.E()}[1];
                        if (i6 != 0) {
                            cocVar.c.x0(0, i6, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                yc ycVar = (yc) this.b;
                ix8 ix8Var = (ix8) ycVar.b;
                hx8 hx8Var = (hx8) ycVar.c;
                if (hx8Var != null) {
                    ix8Var.a(hx8Var);
                    ix8Var.D = 0.0f;
                    ycVar.c = null;
                    ycVar.invalidate();
                    return;
                }
                return;
        }
    }
}
