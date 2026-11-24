package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.p;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
public final class l3c implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public l3c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        TLObject Z1;
        TLObject Z12;
        u3b u3bVar;
        xl3 xl3Var;
        int i;
        ArrayList arrayList = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((p3c) this.b).s0((String) this.c);
                return;
            case 1:
                Runnable runnable = (Runnable) this.c;
                sj2[] sj2VarArr = ((p3c) this.b).x.f;
                int length = sj2VarArr.length;
                while (i2 < length) {
                    sj2VarArr[i2].D(0.0f);
                    i2++;
                }
                runnable.run();
                return;
            case 2:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i3 = UndoView.j0;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new p((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                return;
            case 3:
                ((c4c) this.b).E.onClick((zgb) this.c);
                return;
            case 4:
                y6c y6cVar = (y6c) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                y6cVar.getClass();
                if (tLObject2 != null) {
                    y6cVar.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject2).period / 60;
                    y6cVar.getNotificationCenter().k(324, new Object[0]);
                    y6cVar.r0 = false;
                    y6cVar.s0 = System.currentTimeMillis();
                    return;
                }
                return;
            case 5:
                c7c c7cVar = (c7c) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList2 = c7cVar.e;
                ArrayList arrayList3 = c7cVar.d;
                if (tLObject3 instanceof TLRPC.messages_Chats) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.messages_Chats) tLObject3).chats);
                }
                na7.q1(c7cVar.a).V3(arrayList3, false);
                c7cVar.c = false;
                c7cVar.b = true;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
                arrayList2.clear();
                return;
            case 6:
                s7c s7cVar = (s7c) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList4 = s7cVar.e2;
                arrayList4.clear();
                s7cVar.q2 = -1;
                if (tLObject4 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject4;
                    na7 q1 = na7.q1(s7cVar.a);
                    q1.b4(tL_contacts_found.users, false);
                    q1.V3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.my_results;
                    int size2 = arrayList5.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        TLRPC.Peer peer = arrayList5.get(i4);
                        i4++;
                        long n = cf3.n(peer);
                        if (!hashSet.contains(Long.valueOf(n)) && (Z12 = q1.Z1(n)) != null) {
                            arrayList4.add(Z12);
                            hashSet.add(Long.valueOf(n));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList6 = tL_contacts_found.results;
                    int size3 = arrayList6.size();
                    while (i2 < size3) {
                        TLRPC.Peer peer2 = arrayList6.get(i2);
                        i2++;
                        long n2 = cf3.n(peer2);
                        if (!hashSet.contains(Long.valueOf(n2)) && (Z1 = q1.Z1(n2)) != null) {
                            arrayList4.add(Z1);
                            hashSet.add(Long.valueOf(n2));
                        }
                    }
                }
                s7cVar.g1(true, true);
                return;
            case 7:
                t56 t56Var = (t56) this.c;
                if (((p7a) this.b).a instanceof h2) {
                    t56Var.cancel(false);
                    return;
                }
                return;
            case 8:
                ((VideoAds) this.b).lambda$showPremium$19((jh8) this.c);
                return;
            case 9:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 10:
                ((VideoAds) this.b).lambda$show$16((p8c) this.c);
                return;
            case 11:
                cb9.Y0((Context) this.b, null, false, (e53) this.c, null);
                return;
            case 12:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 13:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 14:
                VideoFileRenderer.b((VideoFileRenderer) this.b, (VideoFrame) this.c);
                return;
            case 15:
                VideoFileRenderer.d((VideoFileRenderer) this.b, (CountDownLatch) this.c);
                return;
            case 16:
                lbc lbcVar = (lbc) this.b;
                j54 j54Var = (j54) this.c;
                Throwable cause = j54Var.getCause();
                if ((cause instanceof hk6) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    fa4.g(j54Var, true);
                    fa4.d("av1 codec failed, we think this codec is not supported");
                    na7.c1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = lbc.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = lbcVar.O;
                    if (arrayList7 != null) {
                        int i5 = 0;
                        while (i5 < arrayList7.size()) {
                            hbc hbcVar = (hbc) arrayList7.get(i5);
                            int i6 = 0;
                            while (true) {
                                ArrayList arrayList8 = hbcVar.d;
                                if (i6 < arrayList8.size()) {
                                    jbc jbcVar = (jbc) arrayList8.get(i6);
                                    if (!TextUtils.isEmpty(jbcVar.m) && !lbc.C0(jbcVar.m)) {
                                        arrayList8.remove(i6);
                                        i6--;
                                    }
                                    i6++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i5);
                                        i5--;
                                    }
                                    i5++;
                                }
                            }
                        }
                        arrayList = arrayList7;
                    }
                    lbcVar.O = arrayList;
                    if (arrayList != null) {
                        lbcVar.j0(arrayList, lbcVar.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = lbcVar.n;
                if (textureView != null && ((!lbcVar.F && (cause instanceof jk6)) || (cause instanceof acb))) {
                    lbcVar.F = true;
                    if (lbcVar.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(lbcVar.n);
                            viewGroup.removeView(lbcVar.n);
                            viewGroup.addView(lbcVar.n, indexOfChild);
                        }
                        do3 do3Var = lbcVar.b;
                        if (do3Var != null) {
                            do3Var.postRunnable(new cib(lbcVar, (byte) 29));
                            return;
                        }
                        y54 y54Var = lbcVar.d;
                        TextureView textureView2 = lbcVar.n;
                        y54Var.y1();
                        if (textureView2 != null && textureView2 == y54Var.X) {
                            y54Var.y1();
                            y54Var.i1();
                            y54Var.q1(null);
                            y54Var.f1(0, 0);
                        }
                        lbcVar.d.s1(lbcVar.n);
                        ArrayList arrayList9 = lbcVar.O;
                        if (arrayList9 != null) {
                            lbcVar.j0(arrayList9, lbcVar.P);
                        } else {
                            boolean z = lbcVar.V;
                            Uri uri = lbcVar.R;
                            String str = lbcVar.T;
                            if (z) {
                                lbcVar.k0(uri, str, lbcVar.S, lbcVar.U);
                            } else {
                                lbcVar.i0(uri, str);
                            }
                        }
                        lbcVar.g0();
                        return;
                    }
                    return;
                }
                lbcVar.K.onError(lbcVar, j54Var);
                return;
            case 17:
                ((lbc) ((xi9) this.b).f).L.o(true, (float[]) this.c);
                return;
            case 18:
                mbc mbcVar = (mbc) this.b;
                if (mbcVar.b == ((u3b[]) this.c)[0]) {
                    if (na7.c1().getBoolean("asr_video_captions", false) && (xl3Var = (u3bVar = mbcVar.b).f) != null && (DictationAsr.A((vl3) xl3Var.b) || DictationAsr.y((vl3) u3bVar.f.b))) {
                        mbcVar.b();
                    }
                    mbcVar.a.a();
                    return;
                }
                return;
            case 19:
                mbc mbcVar2 = (mbc) this.b;
                if (mbcVar2.b == ((u3b) this.c) && mbcVar2.d) {
                    mbcVar2.d();
                    return;
                }
                return;
            case 20:
                String str2 = g8c.a;
                ((t54) ((xbc) ((v8b) this.b).c)).a.G.V((uj2) this.c);
                return;
            case 21:
                icc iccVar = (icc) this.c;
                String str3 = g8c.a;
                y54 y54Var2 = ((t54) ((xbc) ((v8b) this.b).c)).a;
                y54Var2.k0 = iccVar;
                y54Var2.m.e(25, new j93(iccVar));
                return;
            case 22:
                String str4 = g8c.a;
                l93 l93Var = ((t54) ((xbc) ((v8b) this.b).c)).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1030, new jz2(U, (Exception) this.c, (byte) 10));
                return;
            case 23:
                String str5 = g8c.a;
                l93 l93Var2 = ((t54) ((xbc) ((v8b) this.b).c)).a.s;
                tj U2 = l93Var2.U();
                l93Var2.V(U2, 1019, new jz2(U2, (String) this.c, (byte) 17));
                return;
            case 24:
                acc accVar = (acc) this.b;
                ba4.G(accVar.s);
                gl.c3(new l3c(accVar, ba4.I((TLRPC.Document) this.c), (byte) 25));
                return;
            case 25:
                acc accVar2 = (acc) this.b;
                accVar2.e = (File) this.c;
                accVar2.a();
                return;
            case 26:
                ecc eccVar = (ecc) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (eccVar.x != null) {
                        Bitmap bitmap2 = eccVar.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        eccVar.w = eccVar.x;
                    }
                    eccVar.x = bitmap;
                    Bitmap bitmap3 = eccVar.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    eccVar.H = bitmapShader;
                    bitmapShader.setLocalMatrix(eccVar.M);
                    eccVar.K.setShader(eccVar.H);
                    eccVar.invalidate();
                    int L = gl.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i = L;
                    }
                    ViewGroup.LayoutParams layoutParams = eccVar.getLayoutParams();
                    if (eccVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i) {
                        layoutParams.width = L;
                        layoutParams.height = i;
                        eccVar.setVisibility(0);
                        eccVar.requestLayout();
                    }
                }
                eccVar.f = null;
                return;
            case 27:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                return;
            case 28:
                hgc hgcVar = (hgc) this.b;
                hgcVar.V.a(new qfc(hgcVar, (VoIPService) this.c, (byte) 1), true);
                return;
            default:
                hgc hgcVar2 = (hgc) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                xgc.T = false;
                xgc.b();
                ViewPropertyAnimator duration = hgcVar2.L.animate().setDuration(150L);
                s33 s33Var = s33.f;
                duration.setInterpolator(s33Var).start();
                hgcVar2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
                hgcVar2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(s33Var).start();
                hgcVar2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(s33Var).start();
                hgcVar2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(s33Var).start();
                valueAnimator.addListener(new xfc(hgcVar2, (byte) 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(s33Var);
                valueAnimator.start();
                return;
        }
    }
}
