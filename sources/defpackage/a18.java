package defpackage;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.p;
import org.telegram.ui.s;
import org.telegram.ui.v;
public final class a18 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public a18(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        long j;
        int i;
        int i2;
        u9b u9bVar;
        nab nabVar;
        ms1 ms1Var;
        wm4 wm4Var;
        wm4 wm4Var2;
        int i3 = 0;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                TLRPC.TL_payments_paymentVerificationNeeded tL_payments_paymentVerificationNeeded = (TLRPC.TL_payments_paymentVerificationNeeded) this.c;
                qac qacVar = pVar.e1;
                if (qacVar != null) {
                    qacVar.a(tL_payments_paymentVerificationNeeded);
                }
                pVar.J0(false);
                pVar.A0 = true;
                pVar.N0(true, true);
                mx2 mx2Var = pVar.r;
                if (mx2Var != null) {
                    mx2Var.setVisibility(0);
                }
                r7 r7Var = pVar.n;
                if (r7Var != null) {
                    r7Var.setEnabled(false);
                    pVar.n.getContentView().setVisibility(4);
                }
                pVar.getMessagesController().b4 = new wu2(pVar, pVar.getParentLayout(), pVar.getParentActivity(), (byte) 21);
                WebView webView = pVar.x;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = pVar.x;
                    String str = tL_payments_paymentVerificationNeeded.url;
                    pVar.y = str;
                    webView2.loadUrl(str);
                }
                pVar.b1 = true;
                pVar.g1 = 3;
                w18 w18Var = pVar.a1;
                if (w18Var != null) {
                    w18Var.c(3);
                    return;
                }
                return;
            case 1:
                a58 a58Var = (a58) this.b;
                hg5 hg5Var = (hg5) this.c;
                a58Var.removeView(hg5Var);
                if (a58Var.T1 == hg5Var) {
                    a58Var.T1 = null;
                    return;
                }
                return;
            case 2:
                a58 a58Var2 = (a58) this.b;
                v9b C = v9b.C((Activity) this.c, a58Var2.s2);
                c40 c40Var = a58Var2.C2;
                if (c40Var != null && (nabVar = (nab) c40Var.c) != null) {
                    j = nabVar.currentPosition;
                } else {
                    j = 0;
                }
                File f = a58Var2.E1.f();
                TL_stories.StoryItem storyItem = a58Var2.E1.a;
                g6b g6bVar = new g6b();
                g6bVar.n = true;
                g6bVar.t = storyItem.media;
                int i4 = g6bVar.a;
                g6bVar.q = oc7.r1(i4).x1(storyItem.dialogId);
                g6bVar.r = storyItem.id;
                g6bVar.s = storyItem.caption;
                g6bVar.L = f;
                g6bVar.M = false;
                g6bVar.k0 = 720;
                g6bVar.l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    g6bVar.K = false;
                    if (f != null) {
                        g6bVar.h(f.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    g6bVar.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i5);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    g6bVar.k0 = documentAttribute.w;
                                    g6bVar.l0 = documentAttribute.h;
                                    g6bVar.i = documentAttribute.duration;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str2 = storyItem.firstFramePath;
                        if (str2 != null) {
                            g6bVar.N = str2;
                        } else if (document2.thumbs != null) {
                            for (int i6 = 0; i6 < storyItem.media.document.thumbs.size(); i6++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i6);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    g6bVar.O = fn5.B(null, photoSize.bytes);
                                } else {
                                    bc4.G(i4);
                                    File J = bc4.J(photoSize, null, true, true);
                                    if (J != null && J.exists()) {
                                        g6bVar.N = J.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                g6bVar.z();
                g6bVar.e(storyItem);
                o9b d = q9b.d(a58Var2.z0);
                RectF rectF = C.I;
                WindowManager.LayoutParams layoutParams = C.h;
                WindowManager windowManager = C.f;
                int i7 = C.c;
                if (!C.d) {
                    if (oc7.r1(i7).u2()) {
                        h5.b(i7);
                    } else {
                        C.v0 = false;
                        C.e = false;
                        C.C2 = false;
                        if (windowManager != null && (u9bVar = C.n) != null && u9bVar.getParent() == null) {
                            gm.s3(windowManager, C.n, layoutParams);
                            windowManager.addView(C.n, layoutParams);
                            C.f0();
                        }
                        C.L1 = g6bVar;
                        c8b.a(i7, g6bVar);
                        g6b g6bVar2 = C.L1;
                        if (g6bVar2 != null && g6bVar2.K) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        C.P1 = i;
                        C.t0.g = false;
                        if (d != null) {
                            C.G = d;
                            C.K = d.a;
                            rectF.set(d.c);
                            C.H = d.b;
                            C.G.e();
                        } else {
                            C.K = false;
                            Point point = gm.q;
                            rectF.set(0.0f, gm.L(100.0f), point.x, gm.L(100.0f) + point.y);
                            C.H = gm.L(8.0f);
                        }
                        C.r.c();
                        i9b i9bVar = C.i0;
                        boolean z = C.K;
                        if (!z && z) {
                            i2 = -14737633;
                        } else {
                            i2 = 0;
                        }
                        i9bVar.setBackgroundColor(i2);
                        C.r.setTranslationX(0.0f);
                        C.r.setTranslationY(0.0f);
                        C.r.b(0.0f);
                        C.r.setScaleX(1.0f);
                        C.r.setScaleY(1.0f);
                        C.L = 0.0f;
                        gm.e2(C.b);
                        g6b g6bVar3 = C.L1;
                        if (g6bVar3 != null) {
                            C.d1.setText(g6bVar3.C0);
                        }
                        C.J(new f8b(C, (byte) 7), j);
                        C.c1.b(true, false);
                        C.I(1, false);
                        C.k0(-1, false, false);
                        C.a();
                        C.w0 = 0L;
                        C.x0 = "";
                    }
                }
                C.R = new h38(a58Var2, (byte) 12);
                C.S = new g25(a58Var2, C, (byte) 1);
                return;
            case 3:
                ((fab) ((v48) this.b).x.G1).h(new kj8(((oab) this.c).f, 14, false));
                return;
            case 4:
                ((g88) this.b).s((Bitmap) this.c);
                return;
            case 5:
                kn knVar = (kn) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr = PhotoViewer.d9;
                ArrayList arrayList = knVar.h;
                hn hnVar = knVar.n;
                if (hnVar != null) {
                    arrayList.add(hnVar);
                }
                hn hnVar2 = knVar.r;
                if (hnVar2 != null) {
                    arrayList.add(hnVar2);
                }
                hn hnVar3 = knVar.s;
                if (hnVar3 != null) {
                    arrayList.add(hnVar3);
                }
                knVar.n = new hn(bitmap);
                knVar.r = null;
                knVar.s = null;
                knVar.t();
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                Drawable[] drawableArr2 = PhotoViewer.d9;
                cd9.Y0(photoViewer.F, photoViewer.l4, false, (r63) this.c, null);
                return;
            case 7:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                ea8 ea8Var = (ea8) this.c;
                Drawable[] drawableArr3 = PhotoViewer.d9;
                if (ea8Var.getWindow() != null) {
                    ea8Var.v0(true);
                    yv1 yv1Var = photoViewer2.k4;
                    if (yv1Var != null && (ms1Var = yv1Var.a0) != null) {
                        ms1Var.J0(false);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Drawable[] drawableArr4 = PhotoViewer.d9;
                ((s2c) this.b).a((Bitmap) this.c);
                return;
            case 9:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                ra8 ra8Var = (ra8) this.c;
                Drawable[] drawableArr5 = PhotoViewer.d9;
                ra8Var.e.h();
                ra8Var.c.postRunnable(new bn3((byte) 29));
                photoViewer3.f0.removeView(photoViewer3.O1);
                return;
            case 10:
                ((View) this.c).setOutlineProvider(null);
                PhotoViewer photoViewer4 = ((ga8) this.b).c;
                ImageView imageView = photoViewer4.x3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                kb8 kb8Var = photoViewer4.F2;
                if (kb8Var != null) {
                    kb8Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 11:
                na8 na8Var = (na8) this.b;
                ndc ndcVar = (ndc) this.c;
                if (ndcVar.U() > 0 && ndcVar.S() >= ndcVar.U() - 590) {
                    na8Var.a.f0.invalidate();
                    return;
                }
                return;
            case 12:
                s sVar = (s) this.b;
                ra8 ra8Var2 = (ra8) this.c;
                ra8Var2.e.h();
                ra8Var2.c.postRunnable(new bn3((byte) 29));
                try {
                    sVar.b.f0.removeView(ra8Var2);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 13:
                ((v) this.b).r.q7.d();
                ((AnimatorSet) this.c).start();
                return;
            case 14:
                qb8 qb8Var = (qb8) this.c;
                ((v) this.b).r.r4 = false;
                if (!qb8Var.s) {
                    qb8Var.a.v0(false, true);
                    return;
                }
                return;
            case 15:
                bd8 bd8Var = (bd8) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                if (bd8Var.a == surfaceTexture && bd8Var.getSurfaceTexture() == null) {
                    bd8Var.setSurfaceTexture(surfaceTexture);
                    return;
                }
                return;
            case 16:
                gm.g((String) this.c);
                ((xg8) this.b).b(true);
                return;
            case 17:
                gm.g(k47.h0(((TLRPC.PollAnswer) this.c).text, false));
                ((xg8) this.b).b(true);
                return;
            case 18:
                xg8 xg8Var = (xg8) this.b;
                byte[] bArr = (byte[]) this.c;
                a6a B = a6a.B(xg8Var.I.K1);
                k47 k47Var = xg8Var.I;
                if (k47Var != null && (k47.m1(k47Var) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = k47.B0(k47Var.k);
                    int e1 = k47Var.e1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = B.getMessagesController().i1(B0);
                    tL_messages_deletePollAnswer.msg_id = e1;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = B.getConnectionsManager();
                    mp3 mp3Var = Utilities.d;
                    Objects.requireNonNull(mp3Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new rf2(mp3Var, (byte) 0), new vh8(B, (byte) 20));
                }
                xg8Var.b(true);
                return;
            case 19:
                qa4 qa4Var = (qa4) this.b;
                dc2 dc2Var = (dc2) this.c;
                qa4Var.getClass();
                dc2Var.run();
                qa4Var.a.remove(dc2Var);
                return;
            case 20:
                ai8 ai8Var = (ai8) this.b;
                TLObject tLObject = (TLObject) this.c;
                ai8Var.N = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    ai8Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        ai8Var.a(false);
                        return;
                    }
                    ai8Var.d();
                    ai8Var.c.g3.O(true);
                    return;
                }
                return;
            case 21:
                ((qac) this.b).a((Bitmap) this.c);
                return;
            case 22:
                ((cl8) this.b).k((g6b) this.c);
                return;
            case 23:
                g6b g6bVar4 = (g6b) this.c;
                cl8 cl8Var = (cl8) ((in3) this.b).d;
                Bitmap bitmap2 = cl8Var.a;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    if (g6bVar4.M0 == cl8Var.a) {
                        g6bVar4.M0 = null;
                    }
                    cl8Var.a = null;
                    cl8Var.invalidate();
                    return;
                }
                return;
            case 24:
                ml8 ml8Var = (ml8) this.b;
                kl8 kl8Var = (kl8) this.c;
                synchronized (ml8Var.a) {
                    if (!ml8Var.f) {
                        ArrayList arrayList2 = (ArrayList) ml8Var.d.get(kl8Var);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i8 = 0;
                            while (i8 < size) {
                                Object obj = arrayList2.get(i8);
                                i8++;
                                if (((ll8) obj).a != null) {
                                    il8 il8Var = (il8) ml8Var.c.get(kl8Var);
                                    if (il8Var != null) {
                                        wm4Var2 = il8Var.a;
                                    } else if (!ml8Var.a()) {
                                        wm4Var2 = new wm4((Object) null, ml8Var.n, (byte) 19);
                                    } else {
                                        try {
                                            f26 c = ml8Var.h.a.c(kl8Var.a, kl8Var.b);
                                            c.b();
                                            wm4Var = new wm4(c, (Object) null, (byte) 19);
                                        } catch (LinkageError | OutOfMemoryError | RuntimeException e2) {
                                            try {
                                                fc4.g(e2, true);
                                            } catch (LinkageError | RuntimeException unused) {
                                            }
                                            wm4Var = new wm4((Object) null, e2, (byte) 19);
                                        }
                                        wm4Var2 = wm4Var;
                                    }
                                    synchronized (ml8Var.a) {
                                        if (!ml8Var.f) {
                                            if (il8Var == null && ((Throwable) wm4Var2.c) == null) {
                                                ml8Var.c(kl8Var, wm4Var2);
                                            }
                                            ArrayList arrayList3 = (ArrayList) ml8Var.d.remove(kl8Var);
                                            if (arrayList3 != null) {
                                                int size2 = arrayList3.size();
                                                while (i3 < size2) {
                                                    Object obj2 = arrayList3.get(i3);
                                                    i3++;
                                                    ll8 ll8Var = (ll8) obj2;
                                                    try {
                                                        jl8 jl8Var = ll8Var.a;
                                                        ll8Var.a = null;
                                                        if (jl8Var != null) {
                                                            jl8Var.a(wm4Var2);
                                                        }
                                                    } catch (LinkageError | RuntimeException e3) {
                                                        try {
                                                            fc4.g(e3, true);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        ml8Var.d.remove(kl8Var);
                        return;
                    }
                    return;
                }
            case 25:
                ((PrivacyControlActivity) this.b).I0((TLObject) this.c);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.B0();
                    return;
                }
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.B0();
                return;
            case 28:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                boolean z2 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z2;
                ((bjb) this.c).setChecked(z2);
                return;
            default:
                ((km8) this.b).getMessagesController().n5(null, ((Long) this.c).longValue());
                return;
        }
    }
}
