package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
public final class x4c implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public x4c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        TLObject a2;
        TLObject a22;
        v5b v5bVar;
        in3 in3Var;
        int i;
        ArrayList arrayList = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((TwoStepVerificationActivity) this.b).j0((TL_account.updatePasswordSettings) this.c);
                return;
            case 1:
                ((TwoStepVerificationActivity) this.b).q0((TLRPC.TL_error) this.c);
                return;
            case 2:
                ((p5c) this.b).t0((String) this.c);
                return;
            case 3:
                Runnable runnable = (Runnable) this.c;
                gl2[] gl2VarArr = ((p5c) this.b).x.f;
                int length = gl2VarArr.length;
                while (i2 < length) {
                    gl2VarArr[i2].D(0.0f);
                    i2++;
                }
                runnable.run();
                return;
            case 4:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i3 = UndoView.j0;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new p((TLRPC.PaymentReceipt) tLObject));
                    return;
                }
                return;
            case 5:
                ((c6c) this.b).E.onClick((ajb) this.c);
                return;
            case 6:
                z8c z8cVar = (z8c) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                z8cVar.getClass();
                if (tLObject2 != null) {
                    z8cVar.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject2).period / 60;
                    z8cVar.getNotificationCenter().k(326, new Object[0]);
                    z8cVar.r0 = false;
                    z8cVar.s0 = System.currentTimeMillis();
                    return;
                }
                return;
            case 7:
                d9c d9cVar = (d9c) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList2 = d9cVar.e;
                ArrayList arrayList3 = d9cVar.d;
                if (tLObject3 instanceof TLRPC.messages_Chats) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.messages_Chats) tLObject3).chats);
                }
                oc7.r1(d9cVar.a).X3(arrayList3, false);
                d9cVar.c = false;
                d9cVar.b = true;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
                arrayList2.clear();
                return;
            case 8:
                t9c t9cVar = (t9c) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList4 = t9cVar.e2;
                arrayList4.clear();
                t9cVar.q2 = -1;
                if (tLObject4 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject4;
                    oc7 r1 = oc7.r1(t9cVar.a);
                    r1.d4(tL_contacts_found.users, false);
                    r1.X3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.my_results;
                    int size2 = arrayList5.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        TLRPC.Peer peer = arrayList5.get(i4);
                        i4++;
                        long n = pg3.n(peer);
                        if (!hashSet.contains(Long.valueOf(n)) && (a22 = r1.a2(n)) != null) {
                            arrayList4.add(a22);
                            hashSet.add(Long.valueOf(n));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList6 = tL_contacts_found.results;
                    int size3 = arrayList6.size();
                    while (i2 < size3) {
                        TLRPC.Peer peer2 = arrayList6.get(i2);
                        i2++;
                        long n2 = pg3.n(peer2);
                        if (!hashSet.contains(Long.valueOf(n2)) && (a2 = r1.a2(n2)) != null) {
                            arrayList4.add(a2);
                            hashSet.add(Long.valueOf(n2));
                        }
                    }
                }
                t9cVar.g1(true, true);
                return;
            case 9:
                t76 t76Var = (t76) this.c;
                if (((q9a) this.b).a instanceof h2) {
                    t76Var.cancel(false);
                    return;
                }
                return;
            case 10:
                ((VideoAds) this.b).lambda$showPremium$19((kj8) this.c);
                return;
            case 11:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 12:
                ((VideoAds) this.b).lambda$show$16((qac) this.c);
                return;
            case 13:
                cd9.Y0((Context) this.b, null, false, (q63) this.c, null);
                return;
            case 14:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 15:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 16:
                VideoFileRenderer.b((VideoFileRenderer) this.b, (VideoFrame) this.c);
                return;
            case 17:
                VideoFileRenderer.d((VideoFileRenderer) this.b, (CountDownLatch) this.c);
                return;
            case 18:
                ndc ndcVar = (ndc) this.b;
                u64 u64Var = (u64) this.c;
                Throwable cause = u64Var.getCause();
                if ((cause instanceof km6) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    fc4.g(u64Var, true);
                    fc4.d("av1 codec failed, we think this codec is not supported");
                    oc7.d1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = ndc.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = ndcVar.O;
                    if (arrayList7 != null) {
                        int i5 = 0;
                        while (i5 < arrayList7.size()) {
                            kdc kdcVar = (kdc) arrayList7.get(i5);
                            int i6 = 0;
                            while (true) {
                                ArrayList arrayList8 = kdcVar.d;
                                if (i6 < arrayList8.size()) {
                                    mdc mdcVar = (mdc) arrayList8.get(i6);
                                    if (!TextUtils.isEmpty(mdcVar.m) && !ndc.C0(mdcVar.m)) {
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
                    ndcVar.O = arrayList;
                    if (arrayList != null) {
                        ndcVar.j0(arrayList, ndcVar.P);
                        return;
                    }
                    return;
                }
                TextureView textureView = ndcVar.n;
                if (textureView != null && ((!ndcVar.F && (cause instanceof mm6)) || (cause instanceof ceb))) {
                    ndcVar.F = true;
                    if (ndcVar.d != null) {
                        ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                        if (viewGroup != null) {
                            int indexOfChild = viewGroup.indexOfChild(ndcVar.n);
                            viewGroup.removeView(ndcVar.n);
                            viewGroup.addView(ndcVar.n, indexOfChild);
                        }
                        np3 np3Var = ndcVar.b;
                        if (np3Var != null) {
                            np3Var.postRunnable(new f8c(ndcVar, (byte) 7));
                            return;
                        }
                        h74 h74Var = ndcVar.d;
                        TextureView textureView2 = ndcVar.n;
                        h74Var.y1();
                        if (textureView2 != null && textureView2 == h74Var.X) {
                            h74Var.y1();
                            h74Var.i1();
                            h74Var.q1(null);
                            h74Var.f1(0, 0);
                        }
                        ndcVar.d.s1(ndcVar.n);
                        ArrayList arrayList9 = ndcVar.O;
                        if (arrayList9 != null) {
                            ndcVar.j0(arrayList9, ndcVar.P);
                        } else {
                            boolean z = ndcVar.V;
                            Uri uri = ndcVar.R;
                            String str = ndcVar.T;
                            if (z) {
                                ndcVar.k0(uri, str, ndcVar.S, ndcVar.U);
                            } else {
                                ndcVar.i0(uri, str);
                            }
                        }
                        ndcVar.g0();
                        return;
                    }
                    return;
                }
                ndcVar.K.onError(ndcVar, u64Var);
                return;
            case 19:
                ((ndc) ((yk9) this.b).f).L.s(true, (float[]) this.c);
                return;
            case 20:
                odc odcVar = (odc) this.b;
                if (odcVar.b == ((v5b[]) this.c)[0]) {
                    if (oc7.d1().getBoolean("asr_video_captions", false) && (in3Var = (v5bVar = odcVar.b).f) != null && (DictationAsr.A((gn3) in3Var.b) || DictationAsr.y((gn3) v5bVar.f.b))) {
                        odcVar.b();
                    }
                    odcVar.a.a();
                    return;
                }
                return;
            case 21:
                odc odcVar2 = (odc) this.b;
                if (odcVar2.b == ((v5b) this.c) && odcVar2.d) {
                    odcVar2.d();
                    return;
                }
                return;
            case 22:
                String str2 = hac.a;
                ((c74) ((ydc) ((xab) this.b).c)).a.G.H((hl2) this.c);
                return;
            case 23:
                jec jecVar = (jec) this.c;
                String str3 = hac.a;
                h74 h74Var2 = ((c74) ((ydc) ((xab) this.b).c)).a;
                h74Var2.k0 = jecVar;
                h74Var2.m.e(25, new va3(jecVar));
                return;
            case 24:
                String str4 = hac.a;
                xa3 xa3Var = ((c74) ((ydc) ((xab) this.b).c)).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1030, new u03(U, (Exception) this.c, (byte) 11));
                return;
            case 25:
                String str5 = hac.a;
                xa3 xa3Var2 = ((c74) ((ydc) ((xab) this.b).c)).a.s;
                tk U2 = xa3Var2.U();
                xa3Var2.V(U2, 1019, new u03(U2, (String) this.c, (byte) 18));
                return;
            case 26:
                bec becVar = (bec) this.b;
                bc4.G(becVar.s);
                gm.c3(new x4c(becVar, bc4.I((TLRPC.Document) this.c), (byte) 27));
                return;
            case 27:
                bec becVar2 = (bec) this.b;
                becVar2.e = (File) this.c;
                becVar2.a();
                return;
            case 28:
                fec fecVar = (fec) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (fecVar.x != null) {
                        Bitmap bitmap2 = fecVar.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        fecVar.w = fecVar.x;
                    }
                    fecVar.x = bitmap;
                    Bitmap bitmap3 = fecVar.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    fecVar.H = bitmapShader;
                    bitmapShader.setLocalMatrix(fecVar.M);
                    fecVar.K.setShader(fecVar.H);
                    fecVar.invalidate();
                    int L = gm.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i = L;
                    }
                    ViewGroup.LayoutParams layoutParams = fecVar.getLayoutParams();
                    if (fecVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i) {
                        layoutParams.width = L;
                        layoutParams.height = i;
                        fecVar.setVisibility(0);
                        fecVar.requestLayout();
                    }
                }
                fecVar.f = null;
                return;
            default:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                return;
        }
    }
}
