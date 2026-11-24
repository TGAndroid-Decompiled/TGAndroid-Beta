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
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
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
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
public final class gcc implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gcc(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        kn knVar;
        String absolutePath;
        Object obj;
        String absolutePath2;
        kn knVar2;
        int i;
        ylb ylbVar;
        Object obj2;
        boolean z = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((VideoAds) this.b).lambda$show$5((u31) this.c, (boolean[]) this.d);
                return;
            case 1:
                VideoFileRenderer.a((VideoFileRenderer) this.b, (VideoFrame.I420Buffer) this.c, (VideoFrame) this.d);
                return;
            case 2:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 3:
                go4 go4Var = (go4) this.c;
                String str = hac.a;
                h74 h74Var = ((c74) ((ydc) ((xab) this.b).c)).a;
                h74Var.S = go4Var;
                xa3 xa3Var = h74Var.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1017, new ua3(U, go4Var, (pa3) this.d, (byte) 12));
                return;
            case 4:
                final ka8 ka8Var = (ka8) this.b;
                Uri uri = (Uri) this.c;
                k47 k47Var = (k47) this.d;
                ka8Var.getClass();
                if ("tg".equals(uri.getScheme())) {
                    int intValue = Utilities.z(uri.getQueryParameter("account")).intValue();
                    Object obj3 = bc4.G(intValue).H.get(Utilities.z(uri.getQueryParameter("rid")));
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
                    if (bc4.G(intValue).S(bc4.r(null, tL_document))) {
                        File z2 = bc4.z(4);
                        StringBuilder sb = new StringBuilder();
                        sb.append(tL_document.dc_id);
                        sb.append("_");
                        absolutePath = new File(z2, kt6.q(sb, tL_document.id, ".temp")).getAbsolutePath();
                    } else {
                        bc4.G(intValue);
                        absolutePath = bc4.J(tL_document, null, false, true).getAbsolutePath();
                    }
                    knVar = new kn(new File(absolutePath), true, tL_document.size, 1, tL_document, null, obj3, 0L, intValue, true);
                    ka8Var.b = knVar;
                } else {
                    knVar = new kn(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                    ka8Var.b = knVar;
                }
                ka8Var.c = knVar.d[4];
                float f = ka8Var.h;
                if (f != 0.0f) {
                    ka8Var.e(k47Var, f, ka8Var.r);
                    ka8Var.h = 0.0f;
                }
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        ka8 ka8Var2 = ka8Var;
                        switch (b) {
                            case 0:
                                ka8Var2.a = true;
                                ka8Var2.e = null;
                                if (ka8Var2.b != null) {
                                    ka8Var2.s = true;
                                    PhotoViewer photoViewer = ka8Var2.N.a;
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    if (photoViewer.u3) {
                                        photoViewer.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ka8Var2.a = true;
                                ka8Var2.e = null;
                                if (ka8Var2.b != null) {
                                    ka8Var2.s = true;
                                    PhotoViewer photoViewer2 = ka8Var2.N.a;
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
            case 5:
                final ka8 ka8Var2 = (ka8) this.b;
                mdc mdcVar = (mdc) this.c;
                k47 k47Var2 = (k47) this.d;
                ka8Var2.getClass();
                if (mdcVar.b()) {
                    knVar2 = new kn(new File(mdcVar.d.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, 0, 0, null, 0, true);
                    ka8Var2.b = knVar2;
                } else {
                    int i3 = z8c.t0;
                    try {
                        i3 = Utilities.z(mdcVar.d.getQueryParameter("account")).intValue();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    int i4 = i3;
                    try {
                        obj = bc4.G(i4).H.get(Utilities.z(mdcVar.d.getQueryParameter("rid")));
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        obj = null;
                    }
                    TLRPC.Document document = mdcVar.g;
                    if (bc4.G(i4).S(bc4.r(null, document))) {
                        File z3 = bc4.z(4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(document.dc_id);
                        sb2.append("_");
                        absolutePath2 = new File(z3, kt6.q(sb2, document.id, ".temp")).getAbsolutePath();
                    } else {
                        bc4.G(i4);
                        absolutePath2 = bc4.J(document, null, false, true).getAbsolutePath();
                    }
                    knVar2 = new kn(new File(absolutePath2), true, document.size, 1, document, null, obj, 0L, i4, true);
                    ka8Var2.b = knVar2;
                }
                ka8Var2.c = knVar2.d[4];
                float f2 = ka8Var2.h;
                if (f2 != 0.0f) {
                    ka8Var2.e(k47Var2, f2, ka8Var2.r);
                    ka8Var2.h = 0.0f;
                }
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r2;
                        ka8 ka8Var22 = ka8Var2;
                        switch (b) {
                            case 0:
                                ka8Var22.a = true;
                                ka8Var22.e = null;
                                if (ka8Var22.b != null) {
                                    ka8Var22.s = true;
                                    PhotoViewer photoViewer = ka8Var22.N.a;
                                    Drawable[] drawableArr = PhotoViewer.d9;
                                    if (photoViewer.u3) {
                                        photoViewer.l2(true);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                ka8Var22.a = true;
                                ka8Var22.e = null;
                                if (ka8Var22.b != null) {
                                    ka8Var22.s = true;
                                    PhotoViewer photoViewer2 = ka8Var22.N.a;
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
            case 6:
                ihc ihcVar = (ihc) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = (TL_stories.TL_stories_getStoriesViews) this.d;
                f8c f8cVar = ihcVar.f;
                int i5 = ihcVar.b;
                ihc.g = System.currentTimeMillis();
                if (tLObject != null) {
                    TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject;
                    i = 0;
                    oc7.r1(i5).d4(tL_stories_storyViews.users, false);
                    if (!ihcVar.d(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                        ihcVar.d = 0;
                        ihcVar.e = false;
                        return;
                    }
                    nm7.f(i5).k(329, new Object[0]);
                } else {
                    i = 0;
                }
                ihcVar.d = i;
                if (ihcVar.e) {
                    gm.r(f8cVar);
                    gm.d3(f8cVar, 10000L);
                    return;
                }
                return;
            case 7:
                VoIPDebugToSend.c((VoIPDebugToSend) this.b, (File) this.c, (TL_phone.saveCallDebug) this.d);
                return;
            case 8:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((TLRPC.TL_error) this.c, (String) this.d);
                return;
            case 9:
                ((VoIPService) this.b).lambda$onBroadcastStateChanged$17((qd2) this.c, (NativeInstance) this.d);
                return;
            case 10:
                ((hza) this.b).run();
                ((bu5) this.c).L((bu5) this.d);
                return;
            case 11:
                lac lacVar = (lac) this.b;
                el7[] el7VarArr = (el7[]) this.c;
                TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) this.d;
                if (lacVar == null) {
                    el7 el7Var = el7VarArr[0];
                    if (el7Var != null) {
                        el7Var.dismiss();
                    }
                    d S = LaunchActivity.S();
                    if (S != null) {
                        S.presentFragment(yv1.ga(wallettransactionpeeruser.user_id));
                        return;
                    }
                    return;
                }
                return;
            case 12:
                el7[] el7VarArr2 = (el7[]) this.b;
                el7VarArr2[0].setOnDismissListener(new dg((TLRPC.User) this.c, (TL_wallet.walletTransactionPeerUser) this.d, (byte) 18));
                el7VarArr2[0].dismiss();
                return;
            case 13:
                lac lacVar2 = (lac) this.b;
                el7[] el7VarArr3 = (el7[]) this.c;
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.d;
                if (lacVar2 == null) {
                    el7 el7Var2 = el7VarArr3[0];
                    if (el7Var2 != null) {
                        el7Var2.dismiss();
                    }
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        S2.presentFragment(yv1.ga(-walletTransactionPeer.channel_id));
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((jac) this.b).a(((String[]) this.c)[0], Boolean.valueOf(((boolean[]) this.d)[0]));
                return;
            case 15:
                moc mocVar = (moc) this.b;
                ioc iocVar = (ioc) this.c;
                mocVar.b = iocVar;
                iocVar.j(mocVar.c);
                mocVar.h0 = Float.NaN;
                mocVar.b(mocVar.d0, mocVar.g0);
                mocVar.e.setVisibility(0);
                ((joc) this.d).run();
                eu8 eu8Var = mocVar.d;
                if (eu8Var != null) {
                    mocVar.d = null;
                    eu8Var.run();
                    return;
                }
                return;
            case 16:
                ((WalletEngine2) this.b).lambda$previewSignMessage$11((v45) this.c, (qac) this.d);
                return;
            case 17:
                ((jac) this.b).a((Long) this.c, (String) this.d);
                return;
            case 18:
                ((jac) this.b).a((String) this.c, (String) this.d);
                return;
            case 19:
                ((WalletEngine2) this.b).lambda$previewTonConnect$2((v45) this.c, (jac) this.d);
                return;
            case 20:
                lqc lqcVar = (lqc) this.b;
                int[] iArr = (int[]) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                lqcVar.C = false;
                mqc mqcVar = lqcVar.d0;
                boolean z4 = mqcVar.b1;
                soc socVar = mqcVar.c;
                if (!z4) {
                    if (lqcVar.u == null) {
                        lqcVar.u = Bitmap.createBitmap(288, 288, Bitmap.Config.ARGB_8888);
                        if (socVar.isShown() && socVar.getAlpha() > 0.0f) {
                            kqc kqcVar = lqcVar.r;
                            kqcVar.a(0.0f);
                            kqcVar.b = 1.0f;
                        }
                    }
                    lqcVar.u.setPixels(iArr, 0, 288, 0, 0, 288, 288);
                    if (bitmap != null && lqcVar.w == null) {
                        lqcVar.w = bitmap;
                    }
                    if (lqcVar.D) {
                        lqcVar.c();
                    }
                    mqcVar.f0();
                    return;
                }
                return;
            case 21:
                vqc vqcVar = (vqc) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqcVar.getResourceProvider(), vqcVar.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131742814, null);
                alertDialog$Builder.a.U = jb6.M0(2131742817, null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131742819, null), new jq9(vqcVar, (c) this.c, (v25) this.d, (byte) 14));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 22:
                ysc yscVar = (ysc) this.c;
                gm.c3(new xsc((zsc) this.b, yscVar, btc.e(yscVar.a, new d6b((File) this.d, (byte) 5))));
                return;
            case 23:
                String str2 = (String) this.b;
                String str3 = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                int i6 = WearAuthListenerService.r;
                str2.getClass();
                if (!str2.equals("/tg-wear-auth/offer")) {
                    if (!str2.equals("/tg-wear-auth/cancel")) {
                        fc4.b("wear-auth: unexpected path ".concat(str2));
                        return;
                    }
                    fc4.b("wear-auth: cancel from " + str3);
                    BigInteger bigInteger = auc.a;
                    fc4.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    auc.d = null;
                    my0 my0Var = auc.c;
                    if (my0Var != null) {
                        my0Var.dismiss();
                        auc.c = null;
                        return;
                    }
                    return;
                }
                StringBuilder p = wi8.p("wear-auth: offer from ", str3, " (");
                p.append(bArr.length);
                p.append(" bytes)");
                fc4.b(p.toString());
                BigInteger bigInteger2 = auc.a;
                if (bArr.length != 272) {
                    fc4.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                sm2 sm2Var = auc.d;
                if (sm2Var != null && Arrays.equals((byte[]) sm2Var.b, copyOfRange)) {
                    fc4.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                fc4.b("wear-auth: new session " + auc.c(copyOfRange) + " from " + str3);
                auc.d = new sm2(copyOfRange, copyOfRange2, str3);
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = a.b;
                }
                if (context != null) {
                    d S3 = LaunchActivity.S();
                    if (S3 != null) {
                        ylbVar = S3.getResourceProvider();
                    } else {
                        ylbVar = null;
                    }
                    my0 my0Var2 = auc.c;
                    if (my0Var2 != null) {
                        my0Var2.dismiss();
                        auc.c = null;
                    }
                    my0 h = hg9.h(1, ylbVar, context, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    h.O = frameLayout;
                    int i7 = z8c.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i8 = 0; i8 < 4; i8++) {
                        if (z8c.h(i8).o()) {
                            if (!ConnectionsManager.getInstance(i8).isTestBackend()) {
                                i7 = i8;
                            }
                            arrayList.add(Integer.valueOf(i8));
                        }
                    }
                    Collections.sort(arrayList, new zua((byte) 12));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = gm.L(14.0f);
                        int i9 = cmb.h5;
                        Drawable b0 = cmb.b0(L, cmb.v0(i9, ylbVar));
                        wmb M = anb.M(i9);
                        frameLayout3.setBackground(b0);
                        anb.j(frameLayout3, b0, M, null, ylbVar);
                        bf0 bf0Var = new bf0(context);
                        bf0Var.setRoundRadius(gm.L(14.0f));
                        bf0Var.getImageReceiver().B0 = true;
                        pc0 pc0Var = new pc0((ylb) null);
                        int[] iArr2 = {z8c.t0};
                        TLRPC.User f3 = z8c.h(iArr2[0]).f();
                        pc0Var.q(f3);
                        bf0Var.f(f3, pc0Var);
                        frameLayout3.addView(bf0Var, qoe.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        anb.s(imageView, cmb.q5, ylbVar, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230874);
                        frameLayout3.addView(imageView, qoe.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, qoe.e(52, 28, 17));
                        frameLayout2.setPadding(gm.L(8.0f), gm.L(4.0f), gm.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, qoe.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        rve.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout i10 = hg9.i(context, 1);
                        frameLayout.addView(i10, qoe.e(-1, -1, 119));
                        bf0 bf0Var2 = new bf0(context);
                        i10.addView(bf0Var2, qoe.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        hs6.d0(i7).e2(bf0Var2, "Utya3D", "😎", "130_130");
                        int i11 = cmb.i5;
                        TextView b = jxe.b(context, 20.0f, i11, true, ylbVar);
                        hg9.p(b, 17, null, 2131742607);
                        i10.addView(b, qoe.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b2 = jxe.b(context, 14.0f, i11, false, null);
                        hg9.p(b2, 17, null, 2131742608);
                        i10.addView(b2, qoe.t(-1, -2, 49, 32, 0, 32, 24));
                        b61 i12 = mlb.i(24, ylbVar, context, true);
                        i12.setText(jb6.M0(2131747984, null));
                        i10.addView(i12, qoe.t(-1, 48, 7, 12, 12, 12, 8));
                        int i13 = cmb.Z6;
                        h.t0(i13);
                        h.L(i13);
                        frameLayout2.setOnClickListener(new gg(h, frameLayout3, arrayList, iArr2, pc0Var, bf0Var, (byte) 5));
                        i12.setOnClickListener(new fyb(i12, iArr2, (byte) 17));
                        auc.c = h;
                        h.show();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                dvc dvcVar = (dvc) this.b;
                cvc cvcVar = (cvc) this.c;
                Bitmap bitmap2 = (Bitmap) this.d;
                dvcVar.getClass();
                if (dvc.f != null) {
                    if ((cvcVar.d > 0 && cvcVar.e > 0) || bitmap2 == null) {
                        z = false;
                    }
                    if (bitmap2 != null) {
                        dvcVar.d.put(cvcVar.b, bitmap2);
                        if (z) {
                            int i14 = cvcVar.d;
                            int i15 = cvcVar.e;
                            if (i14 == 0) {
                                if (i15 == 0) {
                                    cvcVar.d = bitmap2.getWidth();
                                    cvcVar.e = bitmap2.getHeight();
                                } else {
                                    cvcVar.d = (int) ((bitmap2.getWidth() / bitmap2.getHeight()) * cvcVar.e);
                                }
                            } else if (i15 == 0) {
                                cvcVar.e = (int) ((bitmap2.getHeight() / bitmap2.getWidth()) * cvcVar.d);
                            }
                        }
                    }
                    ArrayList arrayList2 = (ArrayList) dvc.f.remove(cvcVar.b);
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
            case 25:
                bwc bwcVar = (bwc) this.b;
                WebView webView = (WebView) this.c;
                yu5 yu5Var = (yu5) this.d;
                synchronized (bwcVar.a) {
                    if (!bwcVar.u && bwcVar.o == webView && bwcVar.p == yu5Var && !bwcVar.r) {
                        if (bwcVar.s) {
                            fc4.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            bwcVar.q();
                            return;
                        }
                        bwcVar.s = true;
                        fc4.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                        bwcVar.h();
                        return;
                    }
                    return;
                }
            default:
                ((x) this.b).p((zxc) this.c, (String) this.d);
                return;
        }
    }
}
