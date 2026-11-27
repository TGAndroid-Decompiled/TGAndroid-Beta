package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.utils.twidget.x;
public final class jwc implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jwc(x xVar, n0d n0dVar, String str) {
        this.a = (byte) 3;
        this.c = xVar;
        this.d = n0dVar;
        this.b = str;
    }

    @Override
    public final void run() {
        vnb vnbVar;
        Object obj;
        int i = 0;
        boolean z = true;
        switch (this.a) {
            case 0:
                String str = (String) this.b;
                String str2 = (String) this.c;
                byte[] bArr = (byte[]) this.d;
                int i2 = WearAuthListenerService.r;
                str.getClass();
                if (!str.equals("/tg-wear-auth/offer")) {
                    if (!str.equals("/tg-wear-auth/cancel")) {
                        cc4.b("wear-auth: unexpected path ".concat(str));
                        return;
                    }
                    cc4.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger = nwc.a;
                    cc4.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    nwc.d = null;
                    nx0 nx0Var = nwc.c;
                    if (nx0Var != null) {
                        nx0Var.dismiss();
                        nwc.c = null;
                        return;
                    }
                    return;
                }
                StringBuilder p = ik8.p("wear-auth: offer from ", str2, " (");
                p.append(bArr.length);
                p.append(" bytes)");
                cc4.b(p.toString());
                BigInteger bigInteger2 = nwc.a;
                if (bArr.length != 272) {
                    cc4.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                am2 am2Var = nwc.d;
                if (am2Var != null && Arrays.equals((byte[]) am2Var.b, copyOfRange)) {
                    cc4.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                cc4.b("wear-auth: new session " + nwc.c(copyOfRange) + " from " + str2);
                nwc.d = new am2(copyOfRange, copyOfRange2, str2);
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = a.b;
                }
                if (context != null) {
                    e S = LaunchActivity.S();
                    if (S != null) {
                        vnbVar = S.getResourceProvider();
                    } else {
                        vnbVar = null;
                    }
                    nx0 nx0Var2 = nwc.c;
                    if (nx0Var2 != null) {
                        nx0Var2.dismiss();
                        nwc.c = null;
                    }
                    nx0 h = uh9.h(1, vnbVar, context, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    h.O = frameLayout;
                    int i3 = yac.t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i4 = 0; i4 < 4; i4++) {
                        if (yac.h(i4).o()) {
                            if (!ConnectionsManager.getInstance(i4).isTestBackend()) {
                                i3 = i4;
                            }
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    Collections.sort(arrayList, new fna((byte) 14));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = hl.L(14.0f);
                        int i5 = aob.i5;
                        Drawable b0 = aob.b0(L, aob.v0(i5, vnbVar));
                        uob M = yob.M(i5);
                        frameLayout3.setBackground(b0);
                        yob.j(frameLayout3, b0, M, null, vnbVar);
                        de0 de0Var = new de0(context);
                        de0Var.setRoundRadius(hl.L(14.0f));
                        de0Var.getImageReceiver().B0 = true;
                        rb0 rb0Var = new rb0((vnb) null);
                        int[] iArr = {yac.t0};
                        TLRPC.User f = yac.h(iArr[0]).f();
                        rb0Var.q(f);
                        de0Var.f(f, rb0Var);
                        frameLayout3.addView(de0Var, tre.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        yob.s(imageView, aob.r5, vnbVar, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230873);
                        frameLayout3.addView(imageView, tre.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, tre.e(52, 28, 17));
                        frameLayout2.setPadding(hl.L(8.0f), hl.L(4.0f), hl.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, tre.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        iye.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout j = uh9.j(context, 1);
                        frameLayout.addView(j, tre.e(-1, -1, 119));
                        de0 de0Var2 = new de0(context);
                        j.addView(de0Var2, tre.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        ls6.d0(i3).e2(de0Var2, "Utya3D", "😎", "130_130");
                        int i6 = aob.j5;
                        TextView b = zze.b(context, 20.0f, i6, true, vnbVar);
                        uh9.q(b, 17, null, 2131742575);
                        j.addView(b, tre.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b2 = zze.b(context, 14.0f, i6, false, null);
                        uh9.q(b2, 17, null, 2131742576);
                        j.addView(b2, tre.t(-1, -2, 49, 32, 0, 32, 24));
                        c51 i7 = xnb.i(24, vnbVar, context, true);
                        i7.setText(ob6.M0(2131747981, null));
                        j.addView(i7, tre.t(-1, 48, 7, 12, 12, 12, 8));
                        int i8 = aob.a7;
                        h.t0(i8);
                        h.L(i8);
                        frameLayout2.setOnClickListener(new xf(h, frameLayout3, arrayList, iArr, rb0Var, de0Var, (byte) 5));
                        i7.setOnClickListener(new jjb(i7, iArr, (byte) 19));
                        nwc.c = h;
                        h.show();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                rxc rxcVar = (rxc) this.b;
                qxc qxcVar = (qxc) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                rxcVar.getClass();
                if (rxc.f != null) {
                    if ((qxcVar.d > 0 && qxcVar.e > 0) || bitmap == null) {
                        z = false;
                    }
                    if (bitmap != null) {
                        rxcVar.d.put(qxcVar.b, bitmap);
                        if (z) {
                            int i9 = qxcVar.d;
                            int i10 = qxcVar.e;
                            if (i9 == 0) {
                                if (i10 == 0) {
                                    qxcVar.d = bitmap.getWidth();
                                    qxcVar.e = bitmap.getHeight();
                                } else {
                                    qxcVar.d = (int) ((bitmap.getWidth() / bitmap.getHeight()) * qxcVar.e);
                                }
                            } else if (i10 == 0) {
                                qxcVar.e = (int) ((bitmap.getHeight() / bitmap.getWidth()) * qxcVar.d);
                            }
                        }
                    }
                    ArrayList arrayList2 = (ArrayList) rxc.f.remove(qxcVar.b);
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        while (i < size) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            Pair pair = (Pair) obj2;
                            ((ImageReceiver) pair.first).f0(bitmap);
                            if (z && (obj = pair.second) != null) {
                                ((Runnable) obj).run();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                pyc pycVar = (pyc) this.b;
                WebView webView = (WebView) this.c;
                cv5 cv5Var = (cv5) this.d;
                synchronized (pycVar.a) {
                    if (!pycVar.u && pycVar.o == webView && pycVar.p == cv5Var && !pycVar.r) {
                        if (pycVar.s) {
                            cc4.d("WEB proxy: Base64 bridge installation timed out again; transport stopped");
                            pycVar.q();
                            return;
                        }
                        pycVar.s = true;
                        cc4.d("WEB proxy: Base64 bridge installation timed out; retrying once");
                        pycVar.h();
                        return;
                    }
                    return;
                }
            default:
                ((x) this.c).p((n0d) this.d, (String) this.b);
                return;
        }
    }

    public jwc(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
