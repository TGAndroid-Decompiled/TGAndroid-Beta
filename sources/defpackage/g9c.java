package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.Looper;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
import org.webrtc.EglBase;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
public final class g9c implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public g9c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        TLObject b2;
        TLObject b22;
        r7b r7bVar;
        pm3 pm3Var;
        int i;
        float[] fArr;
        ArrayList arrayList = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((b8c) this.b).E.onClick((vkb) this.c);
                return;
            case 1:
                yac yacVar = (yac) this.b;
                TLObject tLObject = (TLObject) this.c;
                yacVar.getClass();
                if (tLObject != null) {
                    yacVar.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject).period / 60;
                    yacVar.getNotificationCenter().k(325, new Object[0]);
                    yacVar.r0 = false;
                    yacVar.s0 = System.currentTimeMillis();
                    return;
                }
                return;
            case 2:
                cbc cbcVar = (cbc) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ArrayList arrayList2 = cbcVar.e;
                ArrayList arrayList3 = cbcVar.d;
                if (tLObject2 instanceof TLRPC.messages_Chats) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.messages_Chats) tLObject2).chats);
                }
                uc7.s1(cbcVar.a).c4(arrayList3, false);
                cbcVar.c = false;
                cbcVar.b = true;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
                arrayList2.clear();
                return;
            case 3:
                sbc sbcVar = (sbc) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList4 = sbcVar.e2;
                arrayList4.clear();
                sbcVar.q2 = -1;
                if (tLObject3 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject3;
                    uc7 s1 = uc7.s1(sbcVar.a);
                    s1.j4(tL_contacts_found.users, false);
                    s1.c4(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.my_results;
                    int size2 = arrayList5.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        TLRPC.Peer peer = arrayList5.get(i3);
                        i3++;
                        long n = wf3.n(peer);
                        if (!hashSet.contains(Long.valueOf(n)) && (b22 = s1.b2(n)) != null) {
                            arrayList4.add(b22);
                            hashSet.add(Long.valueOf(n));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList6 = tL_contacts_found.results;
                    int size3 = arrayList6.size();
                    while (i2 < size3) {
                        TLRPC.Peer peer2 = arrayList6.get(i2);
                        i2++;
                        long n2 = wf3.n(peer2);
                        if (!hashSet.contains(Long.valueOf(n2)) && (b2 = s1.b2(n2)) != null) {
                            arrayList4.add(b2);
                            hashSet.add(Long.valueOf(n2));
                        }
                    }
                }
                sbcVar.h1(true, true);
                return;
            case 4:
                x76 x76Var = (x76) this.c;
                if (((gba) this.b).a instanceof i2) {
                    x76Var.cancel(false);
                    return;
                }
                return;
            case 5:
                ((VideoAds) this.b).lambda$showPremium$19((xk8) this.c);
                return;
            case 6:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 7:
                ((VideoAds) this.b).lambda$show$16((pcc) this.c);
                return;
            case 8:
                qe9.Z0((Context) this.b, null, false, (w53) this.c, null);
                return;
            case 9:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 10:
                VideoFileRenderer.a((VideoFileRenderer) this.b, (VideoFrame) this.c);
                return;
            case 11:
                VideoFileRenderer.c((VideoFileRenderer) this.b, (CountDownLatch) this.c);
                return;
            case 12:
                kfc kfcVar = (kfc) this.b;
                e64 e64Var = (e64) this.c;
                Throwable cause = e64Var.getCause();
                if ((cause instanceof mm6) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    cc4.g(e64Var, true);
                    cc4.d("av1 codec failed, we think this codec is not supported");
                    uc7.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = kfc.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = kfcVar.O;
                    if (arrayList7 != null) {
                        int i4 = 0;
                        while (i4 < arrayList7.size()) {
                            hfc hfcVar = (hfc) arrayList7.get(i4);
                            int i5 = 0;
                            while (true) {
                                ArrayList arrayList8 = hfcVar.d;
                                if (i5 < arrayList8.size()) {
                                    jfc jfcVar = (jfc) arrayList8.get(i5);
                                    if (!TextUtils.isEmpty(jfcVar.m) && !kfc.C0(jfcVar.m)) {
                                        arrayList8.remove(i5);
                                        i5--;
                                    }
                                    i5++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i4);
                                        i4--;
                                    }
                                    i4++;
                                }
                            }
                        }
                        arrayList = arrayList7;
                    }
                    kfcVar.O = arrayList;
                    if (arrayList != null) {
                        kfcVar.j0(arrayList, kfcVar.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = kfcVar.n;
                if (textureView != null && ((!kfcVar.F && (cause instanceof om6)) || (cause instanceof wfb))) {
                    kfcVar.F = true;
                    if (kfcVar.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(kfcVar.n);
                            viewGroup.removeView(kfcVar.n);
                            viewGroup.addView(kfcVar.n, indexOfChild);
                        }
                        uo3 uo3Var = kfcVar.b;
                        if (uo3Var != null) {
                            uo3Var.postRunnable(new azb(kfcVar, (byte) 16));
                            return;
                        }
                        s64 s64Var = kfcVar.d;
                        TextureView textureView2 = kfcVar.n;
                        s64Var.y1();
                        if (textureView2 != null && textureView2 == s64Var.X) {
                            s64Var.y1();
                            s64Var.i1();
                            s64Var.q1(null);
                            s64Var.f1(0, 0);
                        }
                        kfcVar.d.s1(kfcVar.n);
                        ArrayList arrayList9 = kfcVar.O;
                        if (arrayList9 != null) {
                            kfcVar.j0(arrayList9, kfcVar.P);
                        } else {
                            boolean z = kfcVar.V;
                            Uri uri = kfcVar.R;
                            String str = kfcVar.T;
                            if (z) {
                                kfcVar.k0(uri, str, kfcVar.S, kfcVar.U);
                            } else {
                                kfcVar.i0(uri, str);
                            }
                        }
                        kfcVar.g0();
                        return;
                    }
                    return;
                }
                kfcVar.K.onError(kfcVar, e64Var);
                return;
            case 13:
                ((kfc) ((lm9) this.b).f).L.t(true, (float[]) this.c);
                return;
            case 14:
                lfc lfcVar = (lfc) this.b;
                if (lfcVar.b == ((r7b[]) this.c)[0]) {
                    if (uc7.e1().getBoolean("asr_video_captions", false) && (pm3Var = (r7bVar = lfcVar.b).f) != null && (DictationAsr.B((nm3) pm3Var.b) || DictationAsr.z((nm3) r7bVar.f.b))) {
                        lfcVar.b();
                    }
                    lfcVar.a.a();
                    return;
                }
                return;
            case 15:
                lfc lfcVar2 = (lfc) this.b;
                if (lfcVar2.b == ((r7b) this.c) && lfcVar2.d) {
                    lfcVar2.d();
                    return;
                }
                return;
            case 16:
                String str2 = gcc.a;
                ((n64) ((vfc) ((k7b) this.b).c)).a.G.H((pk2) this.c);
                return;
            case 17:
                ggc ggcVar = (ggc) this.c;
                String str3 = gcc.a;
                s64 s64Var2 = ((n64) ((vfc) ((k7b) this.b).c)).a;
                s64Var2.k0 = ggcVar;
                s64Var2.m.e(25, new ca3(ggcVar));
                return;
            case 18:
                String str4 = gcc.a;
                ea3 ea3Var = ((n64) ((vfc) ((k7b) this.b).c)).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1030, new uy2(U, (Exception) this.c, (byte) 16));
                return;
            case 19:
                String str5 = gcc.a;
                ea3 ea3Var2 = ((n64) ((vfc) ((k7b) this.b).c)).a.s;
                uj U2 = ea3Var2.U();
                ea3Var2.V(U2, 1019, new uy2(U2, (String) this.c, (byte) 23));
                return;
            case 20:
                yfc yfcVar = (yfc) this.b;
                xb4.G(yfcVar.s);
                hl.c3(new g9c(yfcVar, xb4.I((TLRPC.Document) this.c), (byte) 21));
                return;
            case 21:
                yfc yfcVar2 = (yfc) this.b;
                yfcVar2.e = (File) this.c;
                yfcVar2.a();
                return;
            case 22:
                cgc cgcVar = (cgc) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (cgcVar.x != null) {
                        Bitmap bitmap2 = cgcVar.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        cgcVar.w = cgcVar.x;
                    }
                    cgcVar.x = bitmap;
                    Bitmap bitmap3 = cgcVar.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    cgcVar.H = bitmapShader;
                    bitmapShader.setLocalMatrix(cgcVar.M);
                    cgcVar.K.setShader(cgcVar.H);
                    cgcVar.invalidate();
                    int L = hl.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i = L;
                    }
                    ViewGroup.LayoutParams layoutParams = cgcVar.getLayoutParams();
                    if (cgcVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i) {
                        layoutParams.width = L;
                        layoutParams.height = i;
                        cgcVar.setVisibility(0);
                        cgcVar.requestLayout();
                    }
                }
                cgcVar.f = null;
                return;
            case 23:
                ((VideoSource) this.b).lambda$setVideoProcessor$2((VideoFrame) this.c);
                return;
            case 24:
                rjc rjcVar = (rjc) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                rjcVar.getClass();
                synchronized (EglBase.lock) {
                    GLES20.glUseProgram(0);
                }
                nkc nkcVar = rjcVar.w;
                if (nkcVar != null) {
                    nkcVar.d();
                    rjcVar.w = null;
                }
                nmc nmcVar = rjcVar.s;
                mmc mmcVar = nmcVar.d;
                mmcVar.a = null;
                int[] iArr = mmcVar.b;
                if (iArr != null) {
                    GLES20.glDeleteTextures(3, iArr, 0);
                    mmcVar.b = null;
                }
                nmcVar.e = null;
                rjcVar.J.release();
                if (rjcVar.r != null) {
                    rjcVar.c("eglBase detach and release.");
                    rjcVar.r.detachCurrent();
                    rjcVar.r.release();
                    rjcVar.r = null;
                }
                rjcVar.e.clear();
                countDownLatch.countDown();
                return;
            case 25:
                ((rjc) this.b).c("Quitting render thread.");
                ((Looper) this.c).quit();
                return;
            case 26:
                rjc rjcVar2 = (rjc) this.b;
                e05 e05Var = (e05) this.c;
                nmc nmcVar2 = rjcVar2.s;
                nkc nkcVar2 = rjcVar2.w;
                if (ik8.A(nkcVar2) && nkcVar2.g != null && (fArr = nkcVar2.k) != null) {
                    double asin = Math.asin(fArr[2]);
                    if (asin < 1.5707963267948966d && asin > -1.5707963267948966d) {
                        float[] fArr2 = nkcVar2.k;
                        float f = fArr2[1];
                        float f2 = fArr2[0];
                    }
                    float f3 = nkcVar2.l;
                    int i6 = (int) (nkcVar2.i[0] / f3);
                    int i7 = (int) (nkcVar2.j[0] / f3);
                    GLES20.glBindFramebuffer(36160, nkcVar2.g[0]);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, nkcVar2.f[0], 0);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i6 * i7) << 2);
                    GLES20.glReadPixels(0, 0, i6, i7, 6408, 5121, allocateDirect);
                    Bitmap createBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    ka5 ka5Var = (ka5) e05Var.b;
                    if (createBitmap != null && createBitmap.getPixel(0, 0) != 0) {
                        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(createBitmap.getWidth(), createBitmap.getHeight()) / 180));
                        hl.c3(new se4(ka5Var, createBitmap, (byte) 23));
                        return;
                    }
                    return;
                }
                return;
            case 27:
                mkc mkcVar = (mkc) this.b;
                mkcVar.V.a(new vjc(mkcVar, (VoIPService) this.c, (byte) 1), true);
                return;
            case 28:
                mkc mkcVar2 = (mkc) this.b;
                ValueAnimator valueAnimator = (ValueAnimator) this.c;
                dlc.T = false;
                dlc.b();
                ViewPropertyAnimator duration = mkcVar2.L.animate().setDuration(150L);
                k43 k43Var = k43.f;
                duration.setInterpolator(k43Var).start();
                mkcVar2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
                mkcVar2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
                mkcVar2.O.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
                mkcVar2.Y.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
                mkcVar2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(k43Var).start();
                mkcVar2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(k43Var).start();
                mkcVar2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(k43Var).start();
                mkcVar2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(k43Var).start();
                valueAnimator.addListener(new ckc(mkcVar2, (byte) 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(k43Var);
                valueAnimator.start();
                return;
            default:
                ((VoIPService) this.b).lambda$startScreenCapture$61((TLRPC.Updates) this.c);
                return;
        }
    }
}
