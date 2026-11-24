package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class hn1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public hn1(String str, boolean[] zArr, syb sybVar, xl3 xl3Var) {
        this.a = (byte) 14;
        this.b = str;
        this.e = zArr;
        this.c = sybVar;
        this.d = xl3Var;
    }

    private final void a() {
        ll4 ll4Var = (ll4) this.b;
        TLObject tLObject = (TLObject) this.d;
        p8c p8cVar = (p8c) this.e;
        int i = -1;
        ll4Var.u2 = -1;
        d dVar = ll4Var.r1;
        pd4.w0((TLRPC.TL_error) this.c, dVar, u21.b0(dVar));
        int i2 = 0;
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList<TLRPC.Update> arrayList = updates.updates;
                if (arrayList.isEmpty()) {
                    TLRPC.Update update = updates.update;
                    if (update instanceof TL_update.TL_updateDialogFilter) {
                        i = ((TL_update.TL_updateDialogFilter) update).id;
                    }
                } else {
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (arrayList.get(i2) instanceof TL_update.TL_updateDialogFilter) {
                            i = ((TL_update.TL_updateDialogFilter) arrayList.get(i2)).id;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            if (ll4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                dVar.getMessagesController().e3(true, new a61(ll4Var, p8cVar, i, (byte) 2));
                return;
            }
            if (ll4Var.V1 != null) {
                dVar.getMessagesController().D(ll4Var.T1, true);
            }
            ll4Var.v2 = true;
            ll4Var.dismiss();
            p8cVar.a(Integer.valueOf(i));
            return;
        }
        ll4Var.g2.a(false);
    }

    private final void b() {
        ((cj3) this.b).M4(((Integer) this.c).intValue());
        gl.d3(new vc4((pz1) this.d, (d) this.e, (byte) 13), 200L);
    }

    private final void c() {
        d dVar = (d) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        c01 c01Var = (c01) this.e;
        hd hdVar = (hd) this.d;
        if (dVar != null && tL_error != null) {
            u21.b0(dVar).g0(tL_error, false);
        }
        if ((dVar instanceof mu1) && tL_error == null) {
            ((mu1) dVar).rc();
        }
        c01Var.c(false);
        hdVar.dismiss();
    }

    private final void d() {
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
        b bVar = (b) this.e;
        ((y05) this.c).close();
        c.O("disable backup: fail!");
        wallettransaction.pending = false;
        wallettransaction.failed = true;
        bVar.k();
        bVar.i();
        bVar.g();
        ((c) this.b).Z();
    }

    private final void e() {
        t05 t05Var;
        c cVar = (c) this.b;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.c;
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.d;
        b bVar = (b) this.e;
        if (!wallettransaction.pending && !wallettransaction.failed && !TextUtils.isEmpty(wallettransaction.id)) {
            return;
        }
        wallettransaction.pending = false;
        wallettransaction.failed = true;
        cVar.r.remove(wallettransaction);
        p8c p8cVar = (p8c) cVar.q.remove(wallettransaction);
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
        }
        if (nftitem != null && (t05Var = cVar.o) != null) {
            t05Var.h(wallettransaction);
        }
        bVar.k();
        bVar.i();
        bVar.g();
        cVar.Z();
    }

    private final void f() {
        byte[] bArr = (byte[]) this.b;
        x15 x15Var = (x15) this.c;
        String str = (String) this.d;
        m25 m25Var = (m25) this.e;
        if (bArr == null) {
            x15Var.a(str);
        } else {
            m25Var.a(bArr);
        }
    }

    private final void g() {
        byte[] bArr;
        w25 w25Var = (w25) this.b;
        r25 r25Var = (r25) this.c;
        hj3 hj3Var = (hj3) this.d;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
        c cVar = w25Var.b;
        String x = cVar.x();
        byte[] D = cVar.D();
        if (D == null) {
            bArr = null;
        } else {
            bArr = (byte[]) D.clone();
        }
        byte[] bArr2 = bArr;
        pz1 pz1Var = new pz1(r25Var, hj3Var, (byte) 29);
        if (x != null && bArr2 != null) {
            cVar.E(true, false, false, new v15(w25Var, (Object) pz1Var, (TLObject) tonconnectsession, x, bArr2, (Object) r25Var, (byte) 1));
        } else {
            pz1Var.a("Wallet is not ready");
        }
    }

    private final void h() {
        String h;
        JSONObject jSONObject;
        w25 w25Var = (w25) this.b;
        y05 y05Var = (y05) this.c;
        s25 s25Var = (s25) this.d;
        x15 x15Var = (x15) this.e;
        try {
            jSONObject = WalletEngine2.signData(y05Var, s25Var.a, s25Var.h, s25Var.g, new JSONObject(s25Var.k), w25.n(s25Var.a.manifest.url), w25Var.f.getCurrentTime());
            h = null;
        } catch (Exception e) {
            h = w25.h("sign data", e);
            jSONObject = null;
        }
        gl.c3(new e57(w25Var, s25Var, y05Var, x15Var, jSONObject, h, (byte) 13));
    }

    @Override
    public final void run() {
        boolean z;
        Throwable th;
        TLRPC.TL_webPage tL_webPage;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        float f3;
        yla ylaVar;
        yla ylaVar2;
        Dialog dialog;
        boolean z4;
        boolean z5;
        int w0;
        int i;
        int i2;
        int i3;
        ViewGroup viewGroup;
        zh zhVar;
        int i4;
        int i5;
        ArrayList arrayList;
        String[] strArr;
        kf2 kf2Var;
        jf2 jf2Var;
        int i6;
        long B1;
        int i7;
        jf2 jf2Var2;
        String lowerCase;
        boolean z6;
        String K;
        String str;
        String str2;
        String str3;
        char c;
        boolean z7;
        int i8;
        boolean z8;
        int i9;
        byte b = this.a;
        r14 = false;
        boolean z9 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj4;
                k27 k27Var = (k27) obj3;
                hd hdVar = (hd) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = xi6.d(k27Var);
                    z = true;
                    th = null;
                } catch (Throwable th2) {
                    z = true;
                    fa4.g(th2, true);
                    th = th2;
                    tL_webPage = null;
                }
                if (th == null && tL_webPage != null) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                gl.c3(new z2a(mu1Var, hdVar, zArr, z2, k27Var, tL_webPage));
                return;
            case 1:
                mu1 mu1Var2 = (mu1) obj4;
                ad7 ad7Var = (ad7) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i10 = messages_messages.messages.get(0).id;
                    k27 k27Var2 = (k27) mu1Var2.G6[0].get(i10);
                    ad7Var.a.c(new bb7(ad7Var, i10, mu1Var2.l6, (byte) 4));
                    if (k27Var2 != null) {
                        TLRPC.Message message = k27Var2.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    mu1Var2.J(i10, 0, 0, 0, false, true);
                    return;
                }
                if (messages_messages != null) {
                    mu1Var2.D6 = messages_messages.count;
                } else {
                    mu1Var2.D6 = 0;
                }
                ad7Var.a.c(new yb7(ad7Var, mu1Var2.d(), mu1Var2.l6, mu1Var2.D6, (byte) 7));
                int i11 = mu1Var2.D6;
                if (i11 == 0) {
                    mu1Var2.E6 = true;
                    mu1Var2.ac(false);
                    return;
                }
                mu1Var2.y1.c(2, i11, true);
                mu1Var2.M9();
                return;
            case 2:
                ((mu1) obj4).o9((TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (p) obj);
                return;
            case 3:
                int i12 = ChatActivityEnterView.r7;
                ((ChatActivityEnterView) obj4).v1(((Boolean) obj3).booleanValue(), ((Integer) obj2).intValue(), ((Integer) obj).intValue(), 0L, true);
                return;
            case 4:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final bia biaVar = (bia) obj3;
                int[] iArr = (int[]) obj2;
                i4a i4aVar = (i4a) obj;
                int i13 = ChatActivityEnterView.r7;
                int[] iArr2 = chatActivityEnterView.D3;
                if (chatActivityEnterView.r0 != null) {
                    Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), 2131755354);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(biaVar, nme.e(40, 40, 3));
                    dialog2.setContentView(frameLayout);
                    dialog2.getWindow().setLayout(-1, -1);
                    dialog2.getWindow().clearFlags(1024);
                    dialog2.getWindow().clearFlags(67108864);
                    dialog2.getWindow().clearFlags(134217728);
                    dialog2.getWindow().addFlags(Integer.MIN_VALUE);
                    dialog2.getWindow().addFlags(512);
                    dialog2.getWindow().addFlags(131072);
                    dialog2.getWindow().getAttributes().windowAnimations = 0;
                    dialog2.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog2.getWindow().setStatusBarColor(0);
                    dialog2.getWindow().setNavigationBarColor(0);
                    if (bkb.w0(null, bkb.r8, true) == -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    gl.l3(dialog2, z3);
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (gl.B(bkb.w0(null, bkb.Z6, true)) >= 0.721f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        gl.i3(dialog2, z4);
                    }
                    chatActivityEnterView.t0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.t0;
                    chatActivityEnterView.q0.getLocationInWindow(iArr2);
                    final float f4 = iArr2[0];
                    final float f5 = iArr2[1];
                    float L = gl.L(5.0f);
                    float L2 = iArr[0] + chatActivityEnterView.t0 + L + gl.L(4.0f) + 0.0f;
                    float f6 = iArr[1] + chatActivityEnterView.u0 + L + 0.0f;
                    biaVar.setTranslationX(L2);
                    biaVar.setTranslationY(f6);
                    float f7 = chatActivityEnterView.q0.getLayoutParams().width;
                    if (chatActivityEnterView.o7) {
                        f = chatActivityEnterView.q0.getScaleX();
                    } else {
                        f = 1.0f;
                    }
                    float L3 = (f7 * f) / gl.L(40.0f);
                    biaVar.setPivotX(0.0f);
                    biaVar.setPivotY(0.0f);
                    biaVar.setScaleX(0.75f);
                    biaVar.setScaleY(0.75f);
                    biaVar.getViewTreeObserver().addOnDrawListener(new vw1(biaVar, i4aVar));
                    dialog2.show();
                    if (!chatActivityEnterView.o7) {
                        f2 = 1.0f;
                        chatActivityEnterView.q0.setScaleX(1.0f);
                        chatActivityEnterView.q0.setScaleY(1.0f);
                    } else {
                        f2 = 1.0f;
                    }
                    chatActivityEnterView.q0.setAlpha(f2);
                    uw1 uw1Var = chatActivityEnterView.r0;
                    boolean z10 = chatActivityEnterView.o7;
                    wr3 wr3Var = yla.q;
                    if (z10) {
                        ylaVar = null;
                        f3 = 0.5f;
                    } else {
                        yla ylaVar3 = new yla(chatActivityEnterView.q0, wr3Var);
                        f3 = 0.5f;
                        ylaVar3.m = oo1.j(0.5f, 750.0f, f2);
                        ylaVar = ylaVar3;
                    }
                    boolean z11 = chatActivityEnterView.o7;
                    wr3 wr3Var2 = yla.r;
                    if (z11) {
                        dialog = dialog2;
                        ylaVar2 = null;
                    } else {
                        dialog = dialog2;
                        ylaVar2 = new yla(chatActivityEnterView.q0, wr3Var2);
                        ylaVar2.m = oo1.j(f3, 750.0f, f2);
                    }
                    yla ylaVar4 = new yla(chatActivityEnterView.q0, yla.v);
                    ylaVar4.m = oo1.j(0.0f, 750.0f, f2);
                    final Dialog dialog3 = dialog;
                    ylaVar4.a(new xr3() {
                        @Override
                        public final void a(yla ylaVar5, boolean z12, float f8, float f9) {
                            byte b2 = r6;
                            float f10 = f5;
                            float f11 = f4;
                            bia biaVar2 = biaVar;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (b2) {
                                case 0:
                                    int i14 = ChatActivityEnterView.r7;
                                    if (dialog4.isShowing()) {
                                        biaVar2.setTranslationX(f11);
                                        biaVar2.setTranslationY(f10);
                                        k4a k4aVar = chatActivityEnterView2.q0;
                                        k4aVar.getClass();
                                        k4aVar.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.o7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ww1(chatActivityEnterView2, dialog4, (byte) 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i15 = ChatActivityEnterView.r7;
                                    if (dialog4.isShowing()) {
                                        biaVar2.setTranslationX(f11);
                                        biaVar2.setTranslationY(f10);
                                        k4a k4aVar2 = chatActivityEnterView2.q0;
                                        k4aVar2.getClass();
                                        k4aVar2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.o7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ww1(chatActivityEnterView2, dialog4, (byte) 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    yla ylaVar5 = new yla(biaVar, yla.o);
                    ylaVar5.b = moe.a(L2, f4 - gl.L(6.0f), L2);
                    ylaVar5.c = true;
                    ylaVar5.m = oo1.j(f4, 700.0f, 0.75f);
                    ylaVar5.h = f4 - gl.L(6.0f);
                    yla ylaVar6 = new yla(biaVar, yla.p);
                    ylaVar6.b = moe.a(f6, f6, gl.L(6.0f) + f5);
                    ylaVar6.c = true;
                    ylaVar6.m = oo1.j(f5, 700.0f, 0.75f);
                    ylaVar6.g = gl.L(6.0f) + f5;
                    ylaVar6.b(new xw1(f5, biaVar));
                    ylaVar6.a(new xr3() {
                        @Override
                        public final void a(yla ylaVar52, boolean z12, float f8, float f9) {
                            byte b2 = r6;
                            float f10 = f5;
                            float f11 = f4;
                            bia biaVar2 = biaVar;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (b2) {
                                case 0:
                                    int i14 = ChatActivityEnterView.r7;
                                    if (dialog4.isShowing()) {
                                        biaVar2.setTranslationX(f11);
                                        biaVar2.setTranslationY(f10);
                                        k4a k4aVar = chatActivityEnterView2.q0;
                                        k4aVar.getClass();
                                        k4aVar.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.o7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ww1(chatActivityEnterView2, dialog4, (byte) 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i15 = ChatActivityEnterView.r7;
                                    if (dialog4.isShowing()) {
                                        biaVar2.setTranslationX(f11);
                                        biaVar2.setTranslationY(f10);
                                        k4a k4aVar2 = chatActivityEnterView2.q0;
                                        k4aVar2.getClass();
                                        k4aVar2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.o7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new ww1(chatActivityEnterView2, dialog4, (byte) 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    yla ylaVar7 = new yla(biaVar, wr3Var);
                    ylaVar7.m = oo1.j(L3, 1000.0f, 1.0f);
                    yla ylaVar8 = new yla(biaVar, wr3Var2);
                    ylaVar8.m = oo1.j(L3, 1000.0f, 1.0f);
                    uw1Var.l(ylaVar, ylaVar2, ylaVar4, ylaVar5, ylaVar6, ylaVar7, ylaVar8);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.c cVar = (org.telegram.ui.Components.c) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view = (View) obj2;
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                int i14 = ChatActivityEnterView.r7;
                jm3 z0 = chatActivityEnterView2.z0();
                lx1 lx1Var = new lx1(cVar, frameLayout2, (byte) 0);
                be2 be2Var = new be2((ae9) obj, (byte) 17);
                jx1 jx1Var = new jx1(frameLayout2, (byte) 1);
                z0.l();
                Context context = z0.h;
                wjb wjbVar = z0.n;
                vt4 vt4Var = new vt4(context, view, wjbVar, lx1Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                if (iArr3[1] > gl.q.y / 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                vt4Var.T = z5;
                vt4Var.M = gl.L(220.0f);
                vt4Var.L = 0;
                vt4Var.n = gl.L(292.0f);
                int v0 = bkb.v0(bkb.F6, wjbVar);
                ArrayList J = z0.J();
                int size = J.size();
                for (int i15 = 0; i15 < size; i15++) {
                    kl3 kl3Var = (kl3) J.get(i15);
                    vt4Var.a(new im3(z0.h, kl3Var, v0, z0.f.a.R, false), 44, new wc3(be2Var, kl3Var, (byte) 21));
                }
                vt4Var.setFocusableInTouchMode(true);
                vt4Var.setOnKeyListener(new fm3(vt4Var, (byte) 2));
                vt4Var.R = jx1Var;
                frameLayout2.addView(vt4Var, new FrameLayout.LayoutParams(-1, -1));
                vt4Var.requestFocus();
                vt4Var.f();
                return;
            case 6:
                k62 k62Var = (k62) obj4;
                Context context2 = (Context) obj3;
                wjb wjbVar2 = (wjb) obj;
                long j = k62Var.W;
                final q31 q31Var = new q31(k62Var, (View) obj2, (byte) 26);
                jc jcVar = new jc((byte) 10);
                int i16 = bkb.i5;
                if (wjbVar2 != null) {
                    w0 = wjbVar2.f(i16);
                    i = wjbVar2.f(bkb.g5);
                    wjbVar2.f(bkb.zj);
                    wjbVar2.f(bkb.Dj);
                    wjbVar2.f(bkb.D8);
                    wjbVar2.f(bkb.F8);
                    wjbVar2.f(bkb.h6);
                    i2 = wjbVar2.f(bkb.Ii);
                    i3 = wjbVar2.f(bkb.Ei);
                    wjbVar2.f(bkb.Gi);
                } else {
                    w0 = bkb.w0(null, i16, false);
                    int w02 = bkb.w0(null, bkb.g5, false);
                    bkb.w0(null, bkb.zj, false);
                    bkb.w0(null, bkb.Dj, false);
                    bkb.w0(null, bkb.D8, false);
                    bkb.w0(null, bkb.F8, false);
                    bkb.w0(null, bkb.h6, false);
                    int w03 = bkb.w0(null, bkb.Ii, false);
                    int w04 = bkb.w0(null, bkb.Ei, false);
                    bkb.w0(null, bkb.Gi, false);
                    i = w02;
                    i2 = w03;
                    i3 = w04;
                }
                Pattern pattern = ij.a;
                if (context2 != null) {
                    final int g = (int) na7.q1(y6c.t0).k4.I.g(TimeUnit.SECONDS);
                    final i4d i4dVar = new i4d(context2, wjbVar2);
                    Object obj5 = i4dVar.a;
                    ((fx0) obj5).w0 = false;
                    final hn7 hn7Var = new hn7(context2, wjbVar2);
                    hn7Var.setTextColor(w0);
                    hn7Var.setTextOffset(gl.L(10.0f));
                    hn7Var.setItemCount(5);
                    final ?? hn7Var2 = new hn7(context2, wjbVar2);
                    hn7Var2.setWrapSelectorWheel(true);
                    hn7Var2.setAllItemsCount(24);
                    hn7Var2.setItemCount(5);
                    hn7Var2.setTextColor(w0);
                    hn7Var2.setTextOffset(-gl.L(10.0f));
                    final ?? hn7Var3 = new hn7(context2, wjbVar2);
                    hn7Var3.setWrapSelectorWheel(true);
                    hn7Var3.setAllItemsCount(60);
                    hn7Var3.setItemCount(5);
                    hn7Var3.setTextColor(w0);
                    hn7Var3.setTextOffset(-gl.L(34.0f));
                    ViewGroup frameLayout3 = new FrameLayout(context2);
                    zh zhVar2 = new zh(context2, hn7Var, hn7Var2, hn7Var3, (byte) 3);
                    zhVar2.setOrientation(1);
                    frameLayout3.addView(zhVar2, nme.c(-1.0f, -1));
                    frameLayout3.addView(new FrameLayout(context2), nme.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout4 = new FrameLayout(context2);
                    zhVar2.addView(frameLayout4, nme.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(k96.M0(2131744590, null));
                    textView.setTextColor(w0);
                    ir2.t(textView, 1, 20.0f);
                    frameLayout4.addView(textView, nme.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new p8((byte) 7));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    zhVar2.addView(linearLayout, nme.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    zkb.X(textView2, bkb.p5, wjbVar2);
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    wb wbVar = new wb(context2, (byte) 3);
                    wbVar.setText(k96.M0(2131744591, null));
                    ote.b(wbVar, 0.02f, 1.2f);
                    linearLayout.addView(hn7Var, nme.l(0.5f, 0, 270));
                    hn7Var.setMinValue(0);
                    hn7Var.setMaxValue(365);
                    hn7Var.setWrapSelectorWheel(false);
                    hn7Var.setFormatter(new zf((byte) 4));
                    gg ggVar = new gg(g, hn7Var, (ki) hn7Var2, (li) hn7Var3, textView2);
                    hn7Var.setOnValueChangedListener(ggVar);
                    hn7Var2.setMinValue(0);
                    hn7Var2.setMaxValue(23);
                    int i17 = i;
                    linearLayout.addView((View) hn7Var2, nme.l(0.2f, 0, 270));
                    hn7Var2.setFormatter(new zf((byte) 5));
                    hn7Var2.setOnValueChangedListener(ggVar);
                    hn7Var3.setMinValue(0);
                    hn7Var3.setMaxValue(59);
                    hn7Var3.setValue(0);
                    hn7Var3.setFormatter(new zf((byte) 6));
                    linearLayout.addView((View) hn7Var3, nme.l(0.3f, 0, 270));
                    hn7Var3.setOnValueChangedListener(ggVar);
                    if (j > 0 && j != 2147483646) {
                        viewGroup = frameLayout3;
                        long j2 = j * 1000;
                        zhVar = zhVar2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i4 = i2;
                        int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j2);
                        if (timeInMillis >= 0) {
                            hn7Var3.setValue(calendar.get(12));
                            hn7Var2.setValue(calendar.get(11));
                            hn7Var.setValue(timeInMillis);
                        }
                    } else {
                        viewGroup = frameLayout3;
                        zhVar = zhVar2;
                        i4 = i2;
                    }
                    final boolean[] zArr2 = {true};
                    ij.g(null, null, 0L, g, 3, hn7Var, hn7Var2, hn7Var3);
                    ij.e(textView2, hn7Var, hn7Var2, hn7Var3);
                    wbVar.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                    wbVar.setGravity(17);
                    wbVar.setTextColor(i4);
                    wbVar.setTextSize(1, 14.0f);
                    wbVar.setTypeface(gl.o());
                    wbVar.setBackground(sjb.e(i3, 24.0f));
                    zhVar.addView(wbVar, nme.t(-1, 48, 83, 14, 15, 14, 16));
                    wbVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            zArr2[0] = false;
                            hn7 hn7Var4 = hn7Var;
                            ki kiVar = hn7Var2;
                            li liVar = hn7Var3;
                            boolean g2 = ij.g(null, null, 0L, g, 3, hn7Var4, kiVar, liVar);
                            ij.e(textView2, hn7Var4, kiVar, liVar);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, hn7Var4.getValue());
                            calendar2.set(11, kiVar.getValue());
                            calendar2.set(12, liVar.getValue());
                            if (g2) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            q31Var.s((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            ((fx0) i4dVar.a).y0.run();
                        }
                    });
                    zhVar.addView(textView2, nme.t(-1, -2, 83, 14, 0, 14, 16));
                    fx0 fx0Var = (fx0) obj5;
                    fx0Var.O = viewGroup;
                    fx0Var.show();
                    fx0Var.setOnDismissListener(new g5(jcVar, zArr2, (byte) 2));
                    fx0Var.s0(i17);
                    fx0Var.L(i17);
                    return;
                }
                return;
            case 7:
                ((e72) obj4).r.Y4((lk0) obj3, (TL_iv.PageBlock) obj2);
                ((cs5) obj).u();
                return;
            case 8:
                ((x92) obj4).a0((hd[]) obj3, (TLRPC.Chat) obj2, (wa5) obj);
                return;
            case 9:
                zc2 zc2Var = (zc2) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                zc2Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    zc2Var.e0(twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 10:
                kf2 kf2Var2 = (kf2) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                fh fhVar = (fh) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    fhVar.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kf2Var2.getParentActivity());
                String M0 = k96.M0(2131689472, "AppName");
                hd hdVar2 = alertDialog$Builder.a;
                hdVar2.S = M0;
                hdVar2.U = k96.a0(null, null, 2131754347, l7c.r(user));
                alertDialog$Builder.j(k96.M0(2131747638, "OK"), new rh1(fhVar, (byte) 24));
                alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                kf2Var2.showDialog(hdVar2);
                return;
            case 11:
                jf2 jf2Var3 = (jf2) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                kf2 kf2Var3 = jf2Var3.E;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    gl.c3(new b87(jf2Var3, new ArrayList(), new vf6(), new ArrayList(), new ArrayList(), (byte) 24));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase2, true, false);
                S0 = (lowerCase2.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                int i18 = i5 + 1;
                String[] strArr2 = new String[i18];
                strArr2[0] = lowerCase2;
                if (S0 != null) {
                    strArr2[1] = S0;
                }
                ArrayList arrayList4 = new ArrayList();
                vf6 vf6Var = new vf6();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size2) {
                        TLObject tLObject3 = (TLObject) arrayList2.get(i19);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            arrayList = arrayList2;
                            strArr = strArr2;
                            B1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            arrayList = arrayList2;
                            strArr = strArr2;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                B1 = k27.B1(((TLRPC.ChannelParticipant) tLObject3).peer);
                            } else {
                                kf2Var = kf2Var3;
                                jf2Var = jf2Var3;
                                i6 = i19;
                                i7 = size2;
                                i19 = i6 + 1;
                                arrayList2 = arrayList;
                                strArr2 = strArr;
                                kf2Var3 = kf2Var;
                                jf2Var3 = jf2Var;
                                size2 = i7;
                            }
                        }
                        if (B1 > 0) {
                            TLRPC.User V1 = kf2Var3.getMessagesController().V1(Long.valueOf(B1));
                            jf2Var2 = jf2Var3;
                            if (V1.id == kf2Var3.getUserConfig().e()) {
                                kf2Var = kf2Var3;
                                i6 = i19;
                                jf2Var = jf2Var2;
                                i7 = size2;
                                i19 = i6 + 1;
                                arrayList2 = arrayList;
                                strArr2 = strArr;
                                kf2Var3 = kf2Var;
                                jf2Var3 = jf2Var;
                                size2 = i7;
                            } else {
                                lowerCase = l7c.r(V1).toLowerCase();
                                K = l7c.p(V1);
                                kf2Var = kf2Var3;
                                str = V1.first_name;
                                i6 = i19;
                                str2 = V1.last_name;
                                z6 = false;
                            }
                        } else {
                            kf2Var = kf2Var3;
                            jf2Var2 = jf2Var3;
                            TLRPC.Chat K0 = kf2Var.getMessagesController().K0(Long.valueOf(-B1));
                            lowerCase = K0.title.toLowerCase();
                            z6 = false;
                            K = hc2.K(K0, false);
                            str = K0.title;
                            i6 = i19;
                            str2 = null;
                        }
                        jf2Var = jf2Var2;
                        i7 = size2;
                        String S02 = k96.D0().S0(lowerCase, true, z6);
                        if (lowerCase.equals(S02)) {
                            S02 = null;
                        }
                        char c2 = 0;
                        int i20 = 0;
                        while (true) {
                            if (i20 < i18) {
                                char c3 = c2;
                                String str4 = strArr[i20];
                                if (!lowerCase.startsWith(str4) && !de9.t(" ", str4, lowerCase) && (S02 == null || (!S02.startsWith(str4) && !de9.t(" ", str4, S02)))) {
                                    if (K != null && K.startsWith(str4)) {
                                        str3 = lowerCase;
                                        c = 2;
                                    } else {
                                        str3 = lowerCase;
                                        c = c3;
                                    }
                                } else {
                                    str3 = lowerCase;
                                    c = 1;
                                }
                                if (c != 0) {
                                    if (c == 1) {
                                        arrayList5.add(gl.r0(str, str2, str4));
                                    } else {
                                        arrayList5.add(gl.r0(b00.h("@", K), null, "@" + str4));
                                    }
                                    arrayList6.add(tLObject3);
                                } else {
                                    i20++;
                                    c2 = c;
                                    lowerCase = str3;
                                }
                            }
                        }
                        i19 = i6 + 1;
                        arrayList2 = arrayList;
                        strArr2 = strArr;
                        kf2Var3 = kf2Var;
                        jf2Var3 = jf2Var;
                        size2 = i7;
                    }
                }
                kf2 kf2Var4 = kf2Var3;
                String[] strArr3 = strArr2;
                jf2 jf2Var4 = jf2Var3;
                if (arrayList3 != null) {
                    for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                        TLRPC.User V12 = kf2Var4.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i21)).user_id));
                        if (V12.id != kf2Var4.getUserConfig().e()) {
                            String lowerCase3 = l7c.r(V12).toLowerCase();
                            String S03 = k96.D0().S0(lowerCase3, true, false);
                            if (lowerCase3.equals(S03)) {
                                S03 = null;
                            }
                            char c4 = 0;
                            int i22 = 0;
                            while (true) {
                                if (i22 < i18) {
                                    String str5 = strArr3[i22];
                                    if (!lowerCase3.startsWith(str5) && !de9.t(" ", str5, lowerCase3) && (S03 == null || (!S03.startsWith(str5) && !de9.t(" ", str5, S03)))) {
                                        String p = l7c.p(V12);
                                        if (p != null && p.startsWith(str5)) {
                                            c4 = 2;
                                        }
                                    } else {
                                        c4 = 1;
                                    }
                                    if (c4 != 0) {
                                        if (c4 == 1) {
                                            arrayList5.add(gl.r0(V12.first_name, V12.last_name, str5));
                                        } else {
                                            arrayList5.add(gl.r0("@" + l7c.p(V12), null, "@" + str5));
                                        }
                                        arrayList4.add(V12);
                                        vf6Var.k(V12, V12.id);
                                    } else {
                                        i22++;
                                    }
                                }
                            }
                        }
                    }
                }
                gl.c3(new b87(jf2Var4, arrayList4, vf6Var, arrayList5, arrayList6, (byte) 24));
                return;
            case 12:
                yb3 yb3Var = (yb3) obj4;
                ra0 ra0Var = (ra0) obj3;
                String str6 = ra0Var.a;
                j1c j1cVar = (j1c) obj2;
                p90 p90Var = (p90) obj;
                yb3Var.getClass();
                Logger logger = yb3.f;
                try {
                    e1c a = yb3Var.c.a(str6);
                    if (a == null) {
                        String str7 = "Transport backend '" + str6 + "' is not registered";
                        logger.warning(str7);
                        j1cVar.e(new IllegalArgumentException(str7));
                    } else {
                        yb3Var.e.f(new lt2(yb3Var, ra0Var, ((kd1) a).a(p90Var), (byte) 4));
                        j1cVar.e(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    j1cVar.e(e);
                    return;
                }
            case 13:
                n3b n3bVar = (n3b) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                try {
                    DictationAsr.d0((float[]) obj4, (xl3) obj3, n3bVar, zArr3);
                    return;
                } catch (Throwable th3) {
                    Log.e("Dictation", "tinyasr: transcription failed", th3);
                    gl.c3(new wc3(zArr3, n3bVar, (byte) 15));
                    return;
                }
            case 14:
                DictationAsr.F((String) obj4, (boolean[]) obj, (syb) obj3, (xl3) obj2);
                return;
            case 15:
                q04 q04Var = (q04) obj4;
                hd[] hdVarArr = (hd[]) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                i4d i4dVar2 = (i4d) obj;
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                hdVarArr[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    d01.t(((t04) q04Var.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    ((fx0) i4dVar2.a).y0.run();
                    return;
                }
                return;
            case 16:
                n14 n14Var = (n14) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList7 = n14Var.s;
                o14 o14Var = n14Var.x;
                if (o14Var.N == n14Var.b) {
                    o14Var.M = 0;
                    if (tL_messages_getStickers.emoticon.equals(n14Var.a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size3 = arrayList7.size();
                        int size4 = tL_messages_stickers.stickers.size();
                        for (int i23 = 0; i23 < size4; i23++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i23);
                            if (n14Var.w.indexOfKey(document.id) < 0) {
                                arrayList7.add(document);
                            }
                        }
                        if (size3 != arrayList7.size()) {
                            n14Var.f.put(arrayList7, o14Var.O);
                            if (size3 == 0) {
                                n14Var.h.add(arrayList7);
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                return;
            case 17:
                la4 la4Var = (la4) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                long[] jArr = (long[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                la4Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                la4Var.c();
                for (int i24 = 0; i24 < arrayList8.size(); i24++) {
                    try {
                        ((k27) arrayList8.get(i24)).K(false);
                    } finally {
                        try {
                            fa4.g(th, true);
                            return;
                        } finally {
                        }
                    }
                }
                jArr[0] = System.currentTimeMillis() - currentTimeMillis;
                return;
            case 18:
                la4 la4Var2 = (la4) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                LongSparseArray longSparseArray = (LongSparseArray) obj2;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                la4Var2.getClass();
                try {
                    la4Var2.c();
                    ?? obj6 = new Object();
                    for (int i25 = 0; i25 < arrayList9.size(); i25++) {
                        ka4 e2 = la4Var2.e(((n51) arrayList9.get(i25)).a, obj6);
                        if (e2 != null) {
                            long j3 = e2.a;
                            if (j3 != 0) {
                                ArrayList arrayList10 = (ArrayList) longSparseArray.get(j3);
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                    longSparseArray.put(e2.a, arrayList10);
                                }
                                n51 n51Var = (n51) arrayList9.get(i25);
                                if (e2.c == 23) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                n51Var.d = z7;
                                arrayList10.add((n51) arrayList9.get(i25));
                            }
                        }
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            case 19:
                ((ab4) obj4).s((String) obj3, (String) obj2, (q1b) obj, null, true, false);
                return;
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                d();
                return;
            case 24:
                e();
                return;
            case 25:
                ((w25) obj4).l((TL_wallet.tonConnectSession) obj3, (String) obj2, (w52) obj);
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                j35 j35Var = (j35) obj4;
                u41 u41Var = (u41) obj3;
                int[] iArr4 = (int[]) obj2;
                u41 u41Var2 = (u41) obj;
                boolean a2 = j35Var.a();
                if (iArr4[0] == 2) {
                    i8 = 2131742727;
                } else {
                    i8 = 2131742925;
                }
                u41Var.setText(k96.M0(i8, null));
                if (!a2 && !j35Var.d && ((i9 = iArr4[0]) == 1 || i9 == 2)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                u41Var.setEnabled(z8);
                if (!a2 && !j35Var.d) {
                    z9 = true;
                }
                u41Var2.setEnabled(z9);
                return;
        }
    }

    public hn1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public hn1(d dVar, TLRPC.TL_error tL_error, c01 c01Var, hd hdVar) {
        this.a = (byte) 22;
        this.b = dVar;
        this.c = tL_error;
        this.e = c01Var;
        this.d = hdVar;
    }
}
