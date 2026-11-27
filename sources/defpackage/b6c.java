package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLException;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.Logging;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
public final class b6c implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public b6c(hjc hjcVar, TLObject tLObject, TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews) {
        this.a = (byte) 12;
        this.b = hjcVar;
        this.d = tLObject;
        this.c = tL_stories_getStoriesViews;
    }

    @Override
    public final void run() {
        int i;
        lm lmVar;
        String absolutePath;
        Object obj;
        String absolutePath2;
        lm lmVar2;
        boolean z;
        EGLContext eglCreateContext;
        EGLContext eGLContext = null;
        int i2 = 1;
        switch (this.a) {
            case 0:
                c6c c6cVar = (c6c) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                SparseArray sparseArray = c6cVar.f;
                ArrayList arrayList = c6cVar.e;
                ArrayList arrayList2 = c6cVar.n;
                SparseArray sparseArray2 = c6cVar.d;
                c6cVar.r = false;
                if (tL_error == null && (tLObject instanceof TLRPC.TL_messages_featuredStickers)) {
                    ArrayList<TLRPC.StickerSetCovered> arrayList3 = ((TLRPC.TL_messages_featuredStickers) tLObject).sets;
                    if (arrayList3.size() < 40) {
                        c6cVar.s = true;
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList2.isEmpty()) {
                            int i3 = c6cVar.x;
                            c6cVar.x = i3 + 1;
                            sparseArray2.put(i3, -1);
                        }
                        arrayList2.addAll(arrayList3);
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                            TLRPC.StickerSetCovered stickerSetCovered = arrayList3.get(i4);
                            if (!stickerSetCovered.covers.isEmpty() || stickerSetCovered.cover != null) {
                                arrayList.add(stickerSetCovered);
                                sparseArray.put(c6cVar.x, stickerSetCovered);
                                int i5 = c6cVar.x;
                                c6cVar.x = i5 + 1;
                                int i6 = size + 1;
                                sparseArray2.put(i5, Integer.valueOf(size));
                                if (!stickerSetCovered.covers.isEmpty()) {
                                    i = (int) Math.ceil(stickerSetCovered.covers.size() / c6cVar.w);
                                    for (int i7 = 0; i7 < stickerSetCovered.covers.size(); i7++) {
                                        sparseArray2.put(c6cVar.x + i7, stickerSetCovered.covers.get(i7));
                                    }
                                } else {
                                    sparseArray2.put(c6cVar.x, stickerSetCovered.cover);
                                    i = 1;
                                }
                                int i8 = 0;
                                while (true) {
                                    int i9 = c6cVar.w * i;
                                    int i10 = c6cVar.x;
                                    if (i8 < i9) {
                                        sparseArray.put(i10 + i8, stickerSetCovered);
                                        i8++;
                                    } else {
                                        c6cVar.x = i9 + i10;
                                        size = i6;
                                    }
                                }
                            }
                        }
                        c6cVar.f();
                        return;
                    }
                    return;
                }
                c6cVar.s = true;
                return;
            case 1:
                bcc bccVar = (bcc) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                sv9 sv9Var = bccVar.f;
                if (bccVar.n) {
                    bccVar.h = null;
                    bccVar.d = arrayList4;
                    bccVar.e = arrayList5;
                    sv9Var.f(arrayList4, null);
                    if (bccVar.n && !sv9Var.e()) {
                        bccVar.w.f.e(false, true);
                    }
                    bccVar.f();
                    return;
                }
                return;
            case 2:
                x76 x76Var = (x76) this.b;
                gba gbaVar = (gba) this.c;
                try {
                    try {
                        gbaVar.n(((nx) this.d).apply(fne.a(x76Var)));
                        return;
                    } catch (Throwable th) {
                        gbaVar.m(th);
                        return;
                    }
                } catch (Error e) {
                    e = e;
                    gbaVar.m(e);
                    return;
                } catch (CancellationException unused) {
                    gbaVar.cancel(false);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    gbaVar.m(e);
                    return;
                } catch (ExecutionException e3) {
                    e = e3;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    gbaVar.m(e);
                    return;
                }
            case 3:
                gba gbaVar2 = (gba) this.b;
                mn6 mn6Var = (mn6) this.c;
                gaa gaaVar = (gaa) this.d;
                try {
                    if (!(gbaVar2.a instanceof i2)) {
                        mn6Var.run();
                        gbaVar2.l(gaaVar);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    gbaVar2.m(th2);
                    return;
                }
            case 4:
                int[] iArr = (int[]) this.b;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.a;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                if (i11 == ((pcc[]) this.c).length) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                ((VideoAds) this.b).lambda$show$3((v21) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 6:
                ((VideoAds) this.b).lambda$show$5((v21) this.c, (boolean[]) this.d);
                return;
            case 7:
                VideoFileRenderer.d((VideoFileRenderer) this.b, (VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 8:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 9:
                ko4 ko4Var = (ko4) this.c;
                String str = gcc.a;
                s64 s64Var = ((n64) ((vfc) ((k7b) this.b).c)).a;
                s64Var.S = ko4Var;
                ea3 ea3Var = s64Var.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1017, new aa3(U, ko4Var, (w93) this.d, (byte) 17));
                return;
            case 10:
                final zb8 zb8Var = (zb8) this.b;
                Uri uri = (Uri) this.c;
                r47 r47Var = (r47) this.d;
                zb8Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.z(uri.getQueryParameter("account")).intValue();
                    Object obj2 = xb4.G(intValue).H.get(Utilities.z(uri.getQueryParameter("rid")));
                    TLRPC.TL_document tL_document = new TLRPC.TL_document();
                    tL_document.access_hash = Utilities.A(uri.getQueryParameter("hash")).longValue();
                    tL_document.id = Utilities.A(uri.getQueryParameter("id")).longValue();
                    tL_document.size = Utilities.A(uri.getQueryParameter("size")).longValue();
                    tL_document.dc_id = Utilities.z(uri.getQueryParameter("dc")).intValue();
                    tL_document.mime_type = uri.getQueryParameter("mime");
                    tL_document.file_reference = Utilities.v(uri.getQueryParameter("reference"));
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = uri.getQueryParameter("name");
                    tL_document.attributes.add(tL_documentAttributeFilename);
                    tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
                    if (xb4.G(intValue).S(xb4.r(null, tL_document))) {
                        File z2 = xb4.z(4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(tL_document.dc_id);
                        sb.append("_");
                        absolutePath = new File(z2, qu6.p(sb, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        xb4.G(intValue);
                        absolutePath = xb4.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    lmVar = new lm(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj2, 0L, intValue, true);
                    zb8Var.b = lmVar;
                } else {
                    lm lmVar3 = new lm(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                    zb8Var.b = lmVar3;
                    lmVar = lmVar3;
                }
                zb8Var.c = lmVar.d[4];
                float f = zb8Var.h;
                if (f != 0.0f) {
                    zb8Var.e(r47Var, f, zb8Var.r);
                    zb8Var.h = 0.0f;
                }
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        zb8 zb8Var2 = zb8Var;
                        switch (b) {
                            case 0:
                                zb8Var2.a = true;
                                zb8Var2.e = null;
                                if (zb8Var2.b != null) {
                                    zb8Var2.s = true;
                                    PhotoViewer photoViewer = zb8Var2.N.a;
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    if (photoViewer.u3) {
                                        photoViewer.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zb8Var2.a = true;
                                zb8Var2.e = null;
                                if (zb8Var2.b != null) {
                                    zb8Var2.s = true;
                                    PhotoViewer photoViewer2 = zb8Var2.N.a;
                                    Drawable[] drawableArr2 = PhotoViewer.d9;
                                    if (photoViewer2.u3) {
                                        photoViewer2.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 11:
                final zb8 zb8Var2 = (zb8) this.b;
                jfc jfcVar = (jfc) this.c;
                r47 r47Var2 = (r47) this.d;
                zb8Var2.getClass();
                if (jfcVar.b()) {
                    lmVar2 = new lm(new File(jfcVar.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                    zb8Var2.b = lmVar2;
                } else {
                    int i12 = yac.t0;
                    try {
                        i12 = Utilities.z(jfcVar.d.getQueryParameter("account")).intValue();
                    } catch (Exception e4) {
                        cc4.g(e4, true);
                    }
                    int i13 = i12;
                    try {
                        obj = xb4.G(i13).H.get(Utilities.z(jfcVar.d.getQueryParameter("rid")));
                    } catch (Exception e5) {
                        cc4.g(e5, true);
                        obj = null;
                    }
                    TLRPC.Document document = jfcVar.g;
                    if (xb4.G(i13).S(xb4.r(null, document))) {
                        File z3 = xb4.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(document.dc_id);
                        sb2.append("_");
                        absolutePath2 = new File(z3, qu6.p(sb2, document.id, ".temp")).getAbsolutePath();
                    } else {
                        xb4.G(i13);
                        absolutePath2 = xb4.J(document, null, false, true).getAbsolutePath();
                    }
                    lm lmVar4 = new lm(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i13, true);
                    zb8Var2.b = lmVar4;
                    lmVar2 = lmVar4;
                }
                zb8Var2.c = lmVar2.d[4];
                float f2 = zb8Var2.h;
                if (f2 != 0.0f) {
                    zb8Var2.e(r47Var2, f2, zb8Var2.r);
                    zb8Var2.h = 0.0f;
                }
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        zb8 zb8Var22 = zb8Var2;
                        switch (b) {
                            case 0:
                                zb8Var22.a = true;
                                zb8Var22.e = null;
                                if (zb8Var22.b != null) {
                                    zb8Var22.s = true;
                                    PhotoViewer photoViewer = zb8Var22.N.a;
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    if (photoViewer.u3) {
                                        photoViewer.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                zb8Var22.a = true;
                                zb8Var22.e = null;
                                if (zb8Var22.b != null) {
                                    zb8Var22.s = true;
                                    PhotoViewer photoViewer2 = zb8Var22.N.a;
                                    Drawable[] drawableArr2 = PhotoViewer.d9;
                                    if (photoViewer2.u3) {
                                        photoViewer2.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 12:
                hjc hjcVar = (hjc) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.c;
                azb azbVar = hjcVar.f;
                int i14 = hjcVar.b;
                hjc.g = System.currentTimeMillis();
                if (tLObject2 != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject2;
                    uc7.s1(i14).j4(tL_stories_storyViews.users, false);
                    if (!hjcVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        hjcVar.d = 0;
                        hjcVar.e = false;
                        return;
                    }
                    jn7.f(i14).k(328, new Object[0]);
                }
                hjcVar.d = 0;
                if (hjcVar.e) {
                    hl.r(azbVar);
                    hl.d3(azbVar, 10000L);
                    return;
                }
                return;
            case 13:
                VoIPDebugToSend.c((VoIPDebugToSend) this.b, (File) this.c, (TL_phone.saveCallDebug) this.d);
                return;
            case 14:
                anb anbVar = (anb) this.b;
                EglBase.Context context = (EglBase.Context) this.c;
                int[] iArr2 = (int[]) this.d;
                StringBuilder sb3 = new StringBuilder("VoIPEglBase.create context, shared: ");
                if (context != null) {
                    z = true;
                } else {
                    z = false;
                }
                sb3.append(z);
                anbVar.c(sb3.toString());
                if (context != null && !(context instanceof EglBase14.Context)) {
                    lq5.j("Only an EGL 1.4 context can be shared");
                    return;
                }
                if (context != null) {
                    eGLContext = ((EglBase14.Context) context).getRawContext();
                }
                ?? obj3 = new Object();
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                obj3.d = eGLSurface;
                obj3.e = eGLSurface;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                    int[] iArr3 = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                        obj3.c = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr4 = new int[1];
                        if (EGL14.eglChooseConfig(eglGetDisplay, iArr2, 0, eGLConfigArr, 0, 1, iArr4, 0)) {
                            if (iArr4[0] > 0) {
                                EGLConfig eGLConfig = eGLConfigArr[0];
                                if (eGLConfig != null) {
                                    obj3.b = eGLConfig;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < iArr2.length - 1) {
                                            if (iArr2[i15] == 12352) {
                                                int i16 = iArr2[i15 + 1];
                                                if (i16 != 4) {
                                                    if (i16 == 64) {
                                                        i2 = 3;
                                                    }
                                                } else {
                                                    i2 = 2;
                                                }
                                            } else {
                                                i15++;
                                            }
                                        }
                                    }
                                    Logging.d("VoIPEglBase", "Using OpenGL ES version " + i2);
                                    EGLDisplay eGLDisplay = obj3.c;
                                    EGLConfig eGLConfig2 = obj3.b;
                                    if (eGLContext != null && eGLContext == EGL14.EGL_NO_CONTEXT) {
                                        xi4.l("Invalid sharedContext");
                                        return;
                                    }
                                    int[] iArr5 = {12440, i2, 12344};
                                    if (eGLContext == null) {
                                        eGLContext = EGL14.EGL_NO_CONTEXT;
                                    }
                                    synchronized (EglBase.lock) {
                                        eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig2, eGLContext, iArr5, 0);
                                    }
                                    if (eglCreateContext != EGL14.EGL_NO_CONTEXT) {
                                        obj3.a = eglCreateContext;
                                        anbVar.r = obj3;
                                        return;
                                    }
                                    throw new GLException(EGL14.eglGetError(), "Failed to create EGL context: 0x" + Integer.toHexString(EGL14.eglGetError()));
                                }
                                xi4.l("eglChooseConfig returned null");
                                return;
                            }
                            xi4.l("Unable to find any matching EGL config");
                            return;
                        }
                        throw new GLException(EGL14.eglGetError(), "eglChooseConfig failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    }
                    throw new GLException(EGL14.eglGetError(), "Unable to initialize EGL14: 0x" + Integer.toHexString(EGL14.eglGetError()));
                }
                throw new GLException(EGL14.eglGetError(), "Unable to get EGL14 display: 0x" + Integer.toHexString(EGL14.eglGetError()));
            case 15:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((TLRPC.TL_error) this.c, (String) this.d);
                return;
            case 16:
                ((VoIPService) this.b).lambda$onBroadcastStateChanged$17((vc2) this.c, (NativeInstance) this.d);
                return;
            case 17:
                ((kta) this.b).run();
                ((fu5) this.c).L((fu5) this.d);
                return;
            case 18:
                kcc kccVar = (kcc) this.b;
                jl7[] jl7VarArr = (jl7[]) this.c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (kccVar == null) {
                    jl7 jl7Var = jl7VarArr[0];
                    if (jl7Var != null) {
                        jl7Var.dismiss();
                    }
                    e S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(zu1.ha(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 19:
                jl7[] jl7VarArr2 = (jl7[]) this.b;
                jl7VarArr2[0].setOnDismissListener(new gf((TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d, (byte) 18));
                jl7VarArr2[0].dismiss();
                return;
            case 20:
                kcc kccVar2 = (kcc) this.b;
                jl7[] jl7VarArr3 = (jl7[]) this.c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (kccVar2 == null) {
                    jl7 jl7Var2 = jl7VarArr3[0];
                    if (jl7Var2 != null) {
                        jl7Var2.dismiss();
                    }
                    e S2 = LaunchActivity.S();
                    if (S2 != null) {
                        S2.presentFragment(zu1.ha(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ((icc) this.b).a(((String[]) this.c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 22:
                zqc zqcVar = (zqc) this.b;
                wqc wqcVar = (wqc) this.c;
                zqcVar.b = wqcVar;
                wqcVar.j(zqcVar.c);
                zqcVar.h0 = Float.NaN;
                zqcVar.b(zqcVar.d0, zqcVar.g0);
                zqcVar.e.setVisibility(0);
                ((xqc) this.d).run();
                ov8 ov8Var = zqcVar.d;
                if (ov8Var != null) {
                    zqcVar.d = null;
                    ov8Var.run();
                    return;
                }
                return;
            case 23:
                ((WalletEngine2) this.b).lambda$previewSignMessage$11((z45) this.c, (pcc) this.d);
                return;
            case 24:
                ((icc) this.b).a((Long) this.c, (String) this.d);
                return;
            case 25:
                ((icc) this.b).a((String) this.c, (String) this.d);
                return;
            case 26:
                ((WalletEngine2) this.b).lambda$previewTonConnect$2((z45) this.c, (icc) this.d);
                return;
            case 27:
                vsc vscVar = (vsc) this.b;
                int[] iArr6 = (int[]) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                vscVar.C = false;
                wsc wscVar = vscVar.d0;
                boolean z4 = wscVar.b1;
                frc frcVar = wscVar.c;
                if (!z4) {
                    if (vscVar.u == null) {
                        vscVar.u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (frcVar.isShown() && frcVar.getAlpha() > 0.0f) {
                            usc uscVar = vscVar.r;
                            uscVar.a(0.0f);
                            uscVar.b = 1.0f;
                        }
                    }
                    vscVar.u.setPixels(iArr6, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && vscVar.w == null) {
                        vscVar.w = bitmap;
                    }
                    if (vscVar.D) {
                        vscVar.c();
                    }
                    wscVar.f0();
                    return;
                }
                return;
            case 28:
                gtc gtcVar = (gtc) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, gtcVar.getResourceProvider(), gtcVar.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131742782, null);
                alertDialog$Builder.a.U = ob6.M0(2131742785, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131742787, null), new o48(gtcVar, (c) this.c, (z25) this.d, (byte) 23));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            default:
                kvc kvcVar = (kvc) this.c;
                hl.c3(new jvc((lvc) this.b, kvcVar, nvc.e(kvcVar.a, new z7b((File) this.d, (byte) 5))));
                return;
        }
    }

    public b6c(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
