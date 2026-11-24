package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Pair;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
import org.telegram.utils.twidget.x;
public final class wbc implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public wbc(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        km kmVar;
        String absolutePath;
        Object obj;
        String absolutePath2;
        km kmVar2;
        int i;
        wjb wjbVar;
        Object obj2;
        boolean z = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                fm4 fm4Var = (fm4) this.c;
                String str = g8c.a;
                y54 y54Var = ((t54) ((xbc) ((v8b) this.b).c)).a;
                y54Var.S = fm4Var;
                l93 l93Var = y54Var.s;
                tj U = l93Var.U();
                l93Var.V(U, 1017, new i93(U, fm4Var, (d93) this.d, (byte) 11));
                return;
            case 1:
                final h88 h88Var = (h88) this.b;
                Uri uri = (Uri) this.c;
                k27 k27Var = (k27) this.d;
                h88Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.z(uri.getQueryParameter("account")).intValue();
                    Object obj3 = ba4.G(intValue).H.get(Utilities.z(uri.getQueryParameter("rid")));
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
                    if (ba4.G(intValue).S(ba4.r(null, tL_document))) {
                        File z2 = ba4.z(4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(tL_document.dc_id);
                        sb.append("_");
                        absolutePath = new File(z2, ls6.p(sb, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        ba4.G(intValue);
                        absolutePath = ba4.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    kmVar = new km(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                    h88Var.b = kmVar;
                } else {
                    kmVar = new km(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                    h88Var.b = kmVar;
                }
                h88Var.c = kmVar.d[4];
                float f = h88Var.h;
                if (f != 0.0f) {
                    h88Var.e(k27Var, f, h88Var.r);
                    h88Var.h = 0.0f;
                }
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        h88 h88Var2 = h88Var;
                        switch (b) {
                            case 0:
                                h88Var2.a = true;
                                h88Var2.e = null;
                                if (h88Var2.b != null) {
                                    h88Var2.s = true;
                                    PhotoViewer photoViewer = h88Var2.N.a;
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    if (photoViewer.u3) {
                                        photoViewer.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                h88Var2.a = true;
                                h88Var2.e = null;
                                if (h88Var2.b != null) {
                                    h88Var2.s = true;
                                    PhotoViewer photoViewer2 = h88Var2.N.a;
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
            case 2:
                final h88 h88Var2 = (h88) this.b;
                jbc jbcVar = (jbc) this.c;
                k27 k27Var2 = (k27) this.d;
                h88Var2.getClass();
                if (jbcVar.b()) {
                    kmVar2 = new km(new File(jbcVar.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                    h88Var2.b = kmVar2;
                } else {
                    int i3 = y6c.t0;
                    try {
                        i3 = Utilities.z(jbcVar.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    int i4 = i3;
                    try {
                        obj = ba4.G(i4).H.get(Utilities.z(jbcVar.d.getQueryParameter("rid")));
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        obj = null;
                    }
                    TLRPC.Document document = jbcVar.g;
                    if (ba4.G(i4).S(ba4.r(null, document))) {
                        File z3 = ba4.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(document.dc_id);
                        sb2.append("_");
                        absolutePath2 = new File(z3, ls6.p(sb2, document.id, ".temp")).getAbsolutePath();
                    } else {
                        ba4.G(i4);
                        absolutePath2 = ba4.J(document, null, false, true).getAbsolutePath();
                    }
                    kmVar2 = new km(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i4, true);
                    h88Var2.b = kmVar2;
                }
                h88Var2.c = kmVar2.d[4];
                float f2 = h88Var2.h;
                if (f2 != 0.0f) {
                    h88Var2.e(k27Var2, f2, h88Var2.r);
                    h88Var2.h = 0.0f;
                }
                gl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        h88 h88Var22 = h88Var2;
                        switch (b) {
                            case 0:
                                h88Var22.a = true;
                                h88Var22.e = null;
                                if (h88Var22.b != null) {
                                    h88Var22.s = true;
                                    PhotoViewer photoViewer = h88Var22.N.a;
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    if (photoViewer.u3) {
                                        photoViewer.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                h88Var22.a = true;
                                h88Var22.e = null;
                                if (h88Var22.b != null) {
                                    h88Var22.s = true;
                                    PhotoViewer photoViewer2 = h88Var22.N.a;
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
            case 3:
                ifc ifcVar = (ifc) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                kbc kbcVar = ifcVar.f;
                int i5 = ifcVar.b;
                ifc.g = System.currentTimeMillis();
                if (tLObject != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject;
                    i = 0;
                    na7.q1(i5).b4(tL_stories_storyViews.users, false);
                    if (!ifcVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        ifcVar.d = 0;
                        ifcVar.e = false;
                        return;
                    }
                    kk7.f(i5).k(327, new Object[0]);
                } else {
                    i = 0;
                }
                ifcVar.d = i;
                if (ifcVar.e) {
                    gl.r(kbcVar);
                    gl.d3(kbcVar, 10000L);
                    return;
                }
                return;
            case 4:
                VoIPDebugToSend.c((VoIPDebugToSend) this.b, (File) this.c, (TL_phone.saveCallDebug) this.d);
                return;
            case 5:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((TLRPC.TL_error) this.c, (String) this.d);
                return;
            case 6:
                ((VoIPService) this.b).lambda$onBroadcastStateChanged$17((fc2) this.c, (NativeInstance) this.d);
                return;
            case 7:
                ((exa) this.b).run();
                ((cs5) this.c).L((cs5) this.d);
                return;
            case 8:
                k8c k8cVar = (k8c) this.b;
                cj7[] cj7VarArr = (cj7[]) this.c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (k8cVar == null) {
                    cj7 cj7Var = cj7VarArr[0];
                    if (cj7Var != null) {
                        cj7Var.dismiss();
                    }
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(mu1.W9(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                cj7[] cj7VarArr2 = (cj7[]) this.b;
                cj7VarArr2[0].setOnDismissListener(new cf((TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d, (byte) 18));
                cj7VarArr2[0].dismiss();
                return;
            case 10:
                k8c k8cVar2 = (k8c) this.b;
                cj7[] cj7VarArr3 = (cj7[]) this.c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (k8cVar2 == null) {
                    cj7 cj7Var2 = cj7VarArr3[0];
                    if (cj7Var2 != null) {
                        cj7Var2.dismiss();
                    }
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        S2.presentFragment(mu1.W9(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ((i8c) this.b).a(((String[]) this.c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 12:
                mmc mmcVar = (mmc) this.b;
                jmc jmcVar = (jmc) this.c;
                mmcVar.b = jmcVar;
                jmcVar.j(mmcVar.c);
                mmcVar.h0 = Float.NaN;
                mmcVar.b(mmcVar.d0, mmcVar.g0);
                mmcVar.e.setVisibility(0);
                ((kmc) this.d).run();
                ds8 ds8Var = mmcVar.d;
                if (ds8Var != null) {
                    mmcVar.d = null;
                    ds8Var.run();
                    return;
                }
                return;
            case 13:
                ((WalletEngine2) this.b).lambda$previewSignMessage$11((v25) this.c, (p8c) this.d);
                return;
            case 14:
                ((i8c) this.b).a((Long) this.c, (String) this.d);
                return;
            case 15:
                ((i8c) this.b).a((String) this.c, (String) this.d);
                return;
            case 16:
                ((WalletEngine2) this.b).lambda$previewTonConnect$2((v25) this.c, (i8c) this.d);
                return;
            case 17:
                joc jocVar = (joc) this.b;
                int[] iArr = (int[]) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                jocVar.C = false;
                koc kocVar = jocVar.d0;
                boolean z4 = kocVar.b1;
                smc smcVar = kocVar.c;
                if (!z4) {
                    if (jocVar.u == null) {
                        jocVar.u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (smcVar.isShown() && smcVar.getAlpha() > 0.0f) {
                            ioc iocVar = jocVar.r;
                            iocVar.a(0.0f);
                            iocVar.b = 1.0f;
                        }
                    }
                    jocVar.u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && jocVar.w == null) {
                        jocVar.w = bitmap;
                    }
                    if (jocVar.D) {
                        jocVar.c();
                    }
                    kocVar.f0();
                    return;
                }
                return;
            case 18:
                toc tocVar = (toc) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, tocVar.getResourceProvider(), tocVar.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131742888, null);
                alertDialog$Builder.a.U = k96.M0(2131742891, null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131742893, null), new io9(tocVar, (c) this.c, (v05) this.d, (byte) 14));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 19:
                wqc wqcVar = (wqc) this.c;
                gl.c3(new vqc((xqc) this.b, wqcVar, zqc.e(wqcVar.a, new c4b((File) this.d, (byte) 5))));
                return;
            case 20:
                String str2 = (String) this.b;
                String str3 = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                int i6 = WearAuthListenerService.r;
                str2.getClass();
                if (!str2.equals("/tg-wear-auth/offer")) {
                    if (!str2.equals("/tg-wear-auth/cancel")) {
                        fa4.b("wear-auth: unexpected path ".concat(str2));
                        return;
                    }
                    fa4.b("wear-auth: cancel from " + str3);
                    BigInteger bigInteger = xrc.a;
                    fa4.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    xrc.d = null;
                    fx0 fx0Var = xrc.c;
                    if (fx0Var != null) {
                        fx0Var.dismiss();
                        xrc.c = null;
                        return;
                    }
                    return;
                }
                StringBuilder p = ug8.p("wear-auth: offer from ", str3, " (");
                p.append(bArr.length);
                p.append(" bytes)");
                fa4.b(p.toString());
                BigInteger bigInteger2 = xrc.a;
                if (bArr.length != 272) {
                    fa4.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                gl2 gl2Var = xrc.d;
                if (gl2Var != null && Arrays.equals((byte[]) gl2Var.b, copyOfRange)) {
                    fa4.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                fa4.b("wear-auth: new session " + xrc.c(copyOfRange) + " from " + str3);
                xrc.d = new gl2(copyOfRange, copyOfRange2, str3);
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = a.b;
                }
                if (context != null) {
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        wjbVar = S3.getResourceProvider();
                    } else {
                        wjbVar = null;
                    }
                    fx0 fx0Var2 = xrc.c;
                    if (fx0Var2 != null) {
                        fx0Var2.dismiss();
                        xrc.c = null;
                    }
                    fx0 h = de9.h(1, wjbVar, context, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    h.O = frameLayout;
                    int i7 = y6c.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i8 = 0; i8 < 4; i8++) {
                        if (y6c.h(i8).o()) {
                            if (!ConnectionsManager.getInstance(i8).isTestBackend()) {
                                i7 = i8;
                            }
                            arrayList.add(Integer.valueOf(i8));
                        }
                    }
                    Collections.sort(arrayList, new pva((byte) 11));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = gl.L(14.0f);
                        int i9 = bkb.h5;
                        Drawable b0 = bkb.b0(L, bkb.v0(i9, wjbVar));
                        vkb M = zkb.M(i9);
                        frameLayout3.setBackground(b0);
                        zkb.j(frameLayout3, b0, M, null, wjbVar);
                        be0 be0Var = new be0(context);
                        be0Var.setRoundRadius(gl.L(14.0f));
                        be0Var.getImageReceiver().B0 = true;
                        pb0 pb0Var = new pb0((wjb) null);
                        int[] iArr2 = {y6c.t0};
                        TLRPC.User f3 = y6c.h(iArr2[0]).f();
                        pb0Var.q(f3);
                        be0Var.f(f3, pb0Var);
                        frameLayout3.addView(be0Var, nme.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        zkb.s(imageView, bkb.q5, wjbVar, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230873);
                        frameLayout3.addView(imageView, nme.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, nme.e(52, 28, 17));
                        frameLayout2.setPadding(gl.L(8.0f), gl.L(4.0f), gl.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, nme.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        ote.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout j = de9.j(context, 1);
                        frameLayout.addView(j, nme.e(-1, -1, 119));
                        be0 be0Var2 = new be0(context);
                        j.addView(be0Var2, nme.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        hq6.d0(i7).e2(be0Var2, "Utya3D", "😎", "130_130");
                        int i10 = bkb.i5;
                        TextView b = hve.b(context, 20.0f, i10, true, wjbVar);
                        de9.q(b, 17, null, 2131742681);
                        j.addView(b, nme.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b2 = hve.b(context, 14.0f, i10, false, null);
                        de9.q(b2, 17, null, 2131742682);
                        j.addView(b2, nme.t(-1, -2, 49, 32, 0, 32, 24));
                        u41 i11 = yjb.i(24, wjbVar, context, true);
                        i11.setText(k96.M0(2131748058, null));
                        j.addView(i11, nme.t(-1, 48, 7, 12, 12, 12, 8));
                        int i12 = bkb.Z6;
                        h.t0(i12);
                        h.M(i12);
                        frameLayout2.setOnClickListener(new ff(h, frameLayout3, arrayList, iArr2, pb0Var, be0Var, (byte) 5));
                        i11.setOnClickListener(new vzb(i11, iArr2, (byte) 16));
                        xrc.c = h;
                        h.show();
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ctc ctcVar = (ctc) this.b;
                btc btcVar = (btc) this.c;
                Bitmap bitmap2 = (Bitmap) this.d;
                ctcVar.getClass();
                if (ctc.f != null) {
                    if ((btcVar.d > 0 && btcVar.e > 0) || bitmap2 == null) {
                        z = false;
                    }
                    if (bitmap2 != null) {
                        ctcVar.d.put(btcVar.b, bitmap2);
                        if (z) {
                            int i13 = btcVar.d;
                            int i14 = btcVar.e;
                            if (i13 == 0) {
                                if (i14 == 0) {
                                    btcVar.d = bitmap2.getWidth();
                                    btcVar.e = bitmap2.getHeight();
                                } else {
                                    btcVar.d = (int) ((bitmap2.getWidth() / bitmap2.getHeight()) * btcVar.e);
                                }
                            } else if (i14 == 0) {
                                btcVar.e = (int) ((bitmap2.getHeight() / bitmap2.getWidth()) * btcVar.d);
                            }
                        }
                    }
                    ArrayList arrayList2 = (ArrayList) ctc.f.remove(btcVar.b);
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i2 < size) {
                            Object obj4 = arrayList2.get(i2);
                            i2++;
                            Pair pair = (Pair) obj4;
                            ((ImageReceiver) pair.first).f0(bitmap2);
                            if (z && (obj2 = pair.second) != null) {
                                ((Runnable) obj2).run();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 22:
                auc aucVar = (auc) this.b;
                WebView webView = (WebView) this.c;
                zs5 zs5Var = (zs5) this.d;
                synchronized (aucVar.a) {
                    if (!aucVar.u && aucVar.o == webView && aucVar.p == zs5Var && !aucVar.r) {
                        if (aucVar.s) {
                            fa4.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            aucVar.q();
                            return;
                        }
                        aucVar.s = true;
                        fa4.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                        aucVar.h();
                        return;
                    }
                    return;
                }
            default:
                ((x) this.b).p((yvc) this.c, (String) this.d);
                return;
        }
    }
}
