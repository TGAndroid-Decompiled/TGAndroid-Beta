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
public final class xo1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public xo1(String str, boolean[] zArr, t0c t0cVar, in3 in3Var) {
        this.a = (byte) 14;
        this.b = str;
        this.e = zArr;
        this.c = t0cVar;
        this.d = in3Var;
    }

    private final void a() {
        ln4 ln4Var = (ln4) this.b;
        TLObject tLObject = (TLObject) this.d;
        qac qacVar = (qac) this.e;
        int i = -1;
        ln4Var.u2 = -1;
        d dVar = ln4Var.r1;
        qf4.x0((TLRPC.TL_error) this.c, dVar, c41.b0(dVar));
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
            if (ln4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                dVar.getMessagesController().g3(true, new h71(ln4Var, qacVar, i, (byte) 2));
                return;
            }
            if (ln4Var.V1 != null) {
                dVar.getMessagesController().D(ln4Var.T1, true);
            }
            ln4Var.v2 = true;
            ln4Var.dismiss();
            qacVar.a(Integer.valueOf(i));
            return;
        }
        ln4Var.g2.a(false);
    }

    private final void b() {
        ((nk3) this.b).Q4(((Integer) this.c).intValue());
        gm.d3(new ve4((qy1) this.d, (d) this.e, (byte) 14), 200L);
    }

    private final void c() {
        d dVar = (d) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        k11 k11Var = (k11) this.e;
        he heVar = (he) this.d;
        if (dVar != null && tL_error != null) {
            c41.b0(dVar).g0(tL_error, false);
        }
        if ((dVar instanceof yv1) && tL_error == null) {
            ((yv1) dVar).Dc();
        }
        k11Var.c(false);
        heVar.dismiss();
    }

    private final void d() {
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.d;
        b bVar = (b) this.e;
        ((y25) this.c).close();
        c.O("disable backup: fail!");
        wallettransaction.pending = false;
        wallettransaction.failed = true;
        bVar.k();
        bVar.i();
        bVar.g();
        ((c) this.b).Z();
    }

    private final void e() {
        t25 t25Var;
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
        qac qacVar = (qac) cVar.q.remove(wallettransaction);
        if (qacVar != null) {
            qacVar.a(Boolean.FALSE);
        }
        if (nftitem != null && (t25Var = cVar.o) != null) {
            t25Var.h(wallettransaction);
        }
        bVar.k();
        bVar.i();
        bVar.g();
        cVar.Z();
    }

    private final void f() {
        byte[] bArr = (byte[]) this.b;
        u35 u35Var = (u35) this.c;
        String str = (String) this.d;
        m45 m45Var = (m45) this.e;
        if (bArr == null) {
            u35Var.a(str);
        } else {
            m45Var.a(bArr);
        }
    }

    private final void g() {
        byte[] bArr;
        w45 w45Var = (w45) this.b;
        r45 r45Var = (r45) this.c;
        sk3 sk3Var = (sk3) this.d;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
        c cVar = w45Var.b;
        String x = cVar.x();
        byte[] D = cVar.D();
        if (D == null) {
            bArr = null;
        } else {
            bArr = (byte[]) D.clone();
        }
        byte[] bArr2 = bArr;
        u35 u35Var = new u35(r45Var, sk3Var, (byte) 0);
        if (x != null && bArr2 != null) {
            cVar.E(true, false, false, new w35(w45Var, (Object) u35Var, (TLObject) tonconnectsession, x, bArr2, (Object) r45Var, (byte) 1));
        } else {
            u35Var.a("Wallet is not ready");
        }
    }

    private final void h() {
        String h;
        JSONObject jSONObject;
        w45 w45Var = (w45) this.b;
        y25 y25Var = (y25) this.c;
        s45 s45Var = (s45) this.d;
        u35 u35Var = (u35) this.e;
        try {
            jSONObject = WalletEngine2.signData(y25Var, s45Var.a, s45Var.h, s45Var.g, new JSONObject(s45Var.k), w45.n(s45Var.a.manifest.url), w45Var.f.getCurrentTime());
            h = null;
        } catch (Exception e) {
            h = w45.h("sign data", e);
            jSONObject = null;
        }
        gm.c3(new e77(w45Var, s45Var, y25Var, u35Var, jSONObject, h, (byte) 13));
    }

    @Override
    public final void run() {
        boolean z;
        TLRPC.TL_webPage tL_webPage;
        boolean z2;
        boolean z3;
        float f;
        float f2;
        zna znaVar;
        char c;
        float f3;
        zna znaVar2;
        Dialog dialog;
        boolean z4;
        boolean z5;
        int w0;
        int i;
        int i2;
        int i3;
        ViewGroup viewGroup;
        wb wbVar;
        int i4;
        String[] strArr;
        int i5;
        wg2 wg2Var;
        ArrayList arrayList;
        vg2 vg2Var;
        int i6;
        long B1;
        String lowerCase;
        boolean z6;
        String K;
        String str;
        String str2;
        String str3;
        char c2;
        boolean z7;
        int i7;
        boolean z8;
        int i8;
        byte b = this.a;
        r14 = false;
        boolean z9 = false;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj4;
                k47 k47Var = (k47) obj3;
                he heVar = (he) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = al6.d(k47Var);
                    th = null;
                    z = true;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    fc4.g(th, true);
                    tL_webPage = null;
                }
                if (th == null && tL_webPage != null) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                gm.c3(new b5a(yv1Var, heVar, zArr, z2, k47Var, tL_webPage));
                return;
            case 1:
                yv1 yv1Var2 = (yv1) obj4;
                cf7 cf7Var = (cf7) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i9 = messages_messages.messages.get(0).id;
                    k47 k47Var2 = (k47) yv1Var2.G6[0].get(i9);
                    cf7Var.a.c(new cd7(cf7Var, i9, yv1Var2.l6, (byte) 4));
                    if (k47Var2 != null) {
                        TLRPC.Message message = k47Var2.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    yv1Var2.J(i9, 0, 0, 0, false, true);
                    return;
                }
                if (messages_messages != null) {
                    yv1Var2.D6 = messages_messages.count;
                } else {
                    yv1Var2.D6 = 0;
                }
                cf7Var.a.c(new ae7(cf7Var, yv1Var2.d(), yv1Var2.l6, yv1Var2.D6, (byte) 7));
                int i10 = yv1Var2.D6;
                if (i10 == 0) {
                    yv1Var2.E6 = true;
                    yv1Var2.mc(false);
                    return;
                }
                yv1Var2.y1.c(2, i10, true);
                yv1Var2.W9();
                return;
            case 2:
                ((yv1) obj4).y9((TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (p) obj);
                return;
            case 3:
                int i11 = ChatActivityEnterView.z7;
                ((ChatActivityEnterView) obj4).x1(((Boolean) obj3).booleanValue(), ((Integer) obj2).intValue(), ((Integer) obj).intValue(), 0L, true);
                return;
            case 4:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final dka dkaVar = (dka) obj3;
                int[] iArr = (int[]) obj2;
                k6a k6aVar = (k6a) obj;
                int i12 = ChatActivityEnterView.z7;
                int[] iArr2 = chatActivityEnterView.D3;
                if (chatActivityEnterView.r0 != null) {
                    Dialog dialog2 = new Dialog(chatActivityEnterView.getContext(), 2131755354);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(dkaVar, qoe.e(40, 40, 3));
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
                    if (cmb.w0(null, cmb.r8, true) == -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    gm.l3(dialog2, z3);
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (gm.B(cmb.w0(null, cmb.Z6, true)) >= 0.721f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        gm.i3(dialog2, z4);
                    }
                    chatActivityEnterView.t0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.t0;
                    chatActivityEnterView.q0.getLocationInWindow(iArr2);
                    final float f4 = iArr2[0];
                    final float f5 = iArr2[1];
                    float L = gm.L(5.0f);
                    float L2 = iArr[0] + chatActivityEnterView.t0 + L + gm.L(4.0f) + 0.0f;
                    float f6 = iArr[1] + chatActivityEnterView.u0 + L + 0.0f;
                    dkaVar.setTranslationX(L2);
                    dkaVar.setTranslationY(f6);
                    float f7 = chatActivityEnterView.q0.getLayoutParams().width;
                    if (chatActivityEnterView.w7) {
                        f = chatActivityEnterView.q0.getScaleX();
                    } else {
                        f = 1.0f;
                    }
                    float L3 = (f7 * f) / gm.L(40.0f);
                    dkaVar.setPivotX(0.0f);
                    dkaVar.setPivotY(0.0f);
                    dkaVar.setScaleX(0.75f);
                    dkaVar.setScaleY(0.75f);
                    dkaVar.getViewTreeObserver().addOnDrawListener(new iy1(dkaVar, k6aVar));
                    dialog2.show();
                    if (!chatActivityEnterView.w7) {
                        f2 = 1.0f;
                        chatActivityEnterView.q0.setScaleX(1.0f);
                        chatActivityEnterView.q0.setScaleY(1.0f);
                    } else {
                        f2 = 1.0f;
                    }
                    chatActivityEnterView.q0.setAlpha(f2);
                    hy1 hy1Var = chatActivityEnterView.r0;
                    boolean z10 = chatActivityEnterView.w7;
                    gt3 gt3Var = zna.q;
                    if (z10) {
                        c = 2;
                        f3 = 0.5f;
                        znaVar = null;
                    } else {
                        c = 2;
                        znaVar = new zna(chatActivityEnterView.q0, gt3Var);
                        f3 = 0.5f;
                        znaVar.m = aq1.j(0.5f, 750.0f, f2);
                    }
                    boolean z11 = chatActivityEnterView.w7;
                    gt3 gt3Var2 = zna.r;
                    if (z11) {
                        dialog = dialog2;
                        znaVar2 = null;
                    } else {
                        dialog = dialog2;
                        znaVar2 = new zna(chatActivityEnterView.q0, gt3Var2);
                        znaVar2.m = aq1.j(f3, 750.0f, f2);
                    }
                    zna znaVar3 = znaVar2;
                    zna znaVar4 = new zna(chatActivityEnterView.q0, zna.v);
                    znaVar4.m = aq1.j(0.0f, 750.0f, f2);
                    final Dialog dialog3 = dialog;
                    znaVar4.a(new ht3() {
                        @Override
                        public final void a(zna znaVar5, boolean z12, float f8, float f9) {
                            byte b2 = r6;
                            float f10 = f5;
                            float f11 = f4;
                            dka dkaVar2 = dkaVar;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (b2) {
                                case 0:
                                    int i13 = ChatActivityEnterView.z7;
                                    if (dialog4.isShowing()) {
                                        dkaVar2.setTranslationX(f11);
                                        dkaVar2.setTranslationY(f10);
                                        m6a m6aVar = chatActivityEnterView2.q0;
                                        m6aVar.getClass();
                                        m6aVar.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.w7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new jy1(chatActivityEnterView2, dialog4, (byte) 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i14 = ChatActivityEnterView.z7;
                                    if (dialog4.isShowing()) {
                                        dkaVar2.setTranslationX(f11);
                                        dkaVar2.setTranslationY(f10);
                                        m6a m6aVar2 = chatActivityEnterView2.q0;
                                        m6aVar2.getClass();
                                        m6aVar2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.w7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new jy1(chatActivityEnterView2, dialog4, (byte) 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    zna znaVar5 = new zna(dkaVar, zna.o);
                    znaVar5.b = pqe.a(L2, f4 - gm.L(6.0f), L2);
                    znaVar5.c = true;
                    znaVar5.m = aq1.j(f4, 700.0f, 0.75f);
                    znaVar5.h = f4 - gm.L(6.0f);
                    zna znaVar6 = new zna(dkaVar, zna.p);
                    znaVar6.b = pqe.a(f6, f6, gm.L(6.0f) + f5);
                    znaVar6.c = true;
                    znaVar6.m = aq1.j(f5, 700.0f, 0.75f);
                    znaVar6.g = gm.L(6.0f) + f5;
                    znaVar6.b(new ky1(f5, dkaVar));
                    znaVar6.a(new ht3() {
                        @Override
                        public final void a(zna znaVar52, boolean z12, float f8, float f9) {
                            byte b2 = r6;
                            float f10 = f5;
                            float f11 = f4;
                            dka dkaVar2 = dkaVar;
                            Dialog dialog4 = dialog3;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (b2) {
                                case 0:
                                    int i13 = ChatActivityEnterView.z7;
                                    if (dialog4.isShowing()) {
                                        dkaVar2.setTranslationX(f11);
                                        dkaVar2.setTranslationY(f10);
                                        m6a m6aVar = chatActivityEnterView2.q0;
                                        m6aVar.getClass();
                                        m6aVar.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.w7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new jy1(chatActivityEnterView2, dialog4, (byte) 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i14 = ChatActivityEnterView.z7;
                                    if (dialog4.isShowing()) {
                                        dkaVar2.setTranslationX(f11);
                                        dkaVar2.setTranslationY(f10);
                                        m6a m6aVar2 = chatActivityEnterView2.q0;
                                        m6aVar2.getClass();
                                        m6aVar2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.w7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new jy1(chatActivityEnterView2, dialog4, (byte) 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    zna znaVar7 = new zna(dkaVar, gt3Var);
                    znaVar7.m = aq1.j(L3, 1000.0f, 1.0f);
                    zna znaVar8 = new zna(dkaVar, gt3Var2);
                    znaVar8.m = aq1.j(L3, 1000.0f, 1.0f);
                    zna[] znaVarArr = new zna[7];
                    znaVarArr[0] = znaVar;
                    znaVarArr[1] = znaVar3;
                    znaVarArr[c] = znaVar4;
                    znaVarArr[3] = znaVar5;
                    znaVarArr[4] = znaVar6;
                    znaVarArr[5] = znaVar7;
                    znaVarArr[6] = znaVar8;
                    hy1Var.l(znaVarArr);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.c cVar = (org.telegram.ui.Components.c) obj4;
                FrameLayout frameLayout2 = (FrameLayout) obj3;
                View view = (View) obj2;
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                int i13 = ChatActivityEnterView.z7;
                un3 z0 = chatActivityEnterView2.z0();
                xy1 xy1Var = new xy1(cVar, frameLayout2, (byte) 1);
                mf2 mf2Var = new mf2((eg9) obj, (byte) 16);
                yy1 yy1Var = new yy1(frameLayout2, (byte) 1);
                z0.l();
                Context context = z0.h;
                ylb ylbVar = z0.n;
                xv4 xv4Var = new xv4(context, view, ylbVar, xy1Var);
                int[] iArr3 = new int[2];
                view.getLocationInWindow(iArr3);
                if (iArr3[1] > gm.q.y / 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xv4Var.T = z5;
                xv4Var.M = gm.L(220.0f);
                xv4Var.L = 0;
                xv4Var.n = gm.L(292.0f);
                int v0 = cmb.v0(cmb.F6, ylbVar);
                ArrayList J = z0.J();
                int size = J.size();
                for (int i14 = 0; i14 < size; i14++) {
                    vm3 vm3Var = (vm3) J.get(i14);
                    xv4Var.a(new tn3(z0.h, vm3Var, v0, z0.f.a.R, false), 44, new rd3(mf2Var, vm3Var, (byte) 22));
                }
                xv4Var.setFocusableInTouchMode(true);
                xv4Var.setOnKeyListener(new qn3(xv4Var, (byte) 2));
                xv4Var.R = yy1Var;
                frameLayout2.addView(xv4Var, new FrameLayout.LayoutParams(-1, -1));
                xv4Var.requestFocus();
                xv4Var.f();
                return;
            case 6:
                v72 v72Var = (v72) obj4;
                Context context2 = (Context) obj3;
                ylb ylbVar2 = (ylb) obj;
                long j = v72Var.W;
                final g11 g11Var = new g11(v72Var, (View) obj2, (byte) 27);
                jd jdVar = new jd((byte) 10);
                int i15 = cmb.i5;
                if (ylbVar2 != null) {
                    w0 = ylbVar2.f(i15);
                    i = ylbVar2.f(cmb.g5);
                    ylbVar2.f(cmb.zj);
                    ylbVar2.f(cmb.Dj);
                    ylbVar2.f(cmb.D8);
                    ylbVar2.f(cmb.F8);
                    ylbVar2.f(cmb.h6);
                    i2 = ylbVar2.f(cmb.Ii);
                    i3 = ylbVar2.f(cmb.Ei);
                    ylbVar2.f(cmb.Gi);
                } else {
                    w0 = cmb.w0(null, i15, false);
                    int w02 = cmb.w0(null, cmb.g5, false);
                    cmb.w0(null, cmb.zj, false);
                    cmb.w0(null, cmb.Dj, false);
                    cmb.w0(null, cmb.D8, false);
                    cmb.w0(null, cmb.F8, false);
                    cmb.w0(null, cmb.h6, false);
                    int w03 = cmb.w0(null, cmb.Ii, false);
                    int w04 = cmb.w0(null, cmb.Ei, false);
                    cmb.w0(null, cmb.Gi, false);
                    i = w02;
                    i2 = w03;
                    i3 = w04;
                }
                Pattern pattern = ik.a;
                if (context2 != null) {
                    final int g = (int) oc7.r1(z8c.t0).l4.I.g(TimeUnit.SECONDS);
                    final k6d k6dVar = new k6d(context2, ylbVar2);
                    Object obj5 = k6dVar.b;
                    ((my0) obj5).w0 = false;
                    final lp7 lp7Var = new lp7(context2, ylbVar2);
                    lp7Var.setTextColor(w0);
                    lp7Var.setTextOffset(gm.L(10.0f));
                    lp7Var.setItemCount(5);
                    final ?? lp7Var2 = new lp7(context2, ylbVar2);
                    lp7Var2.setWrapSelectorWheel(true);
                    lp7Var2.setAllItemsCount(24);
                    lp7Var2.setItemCount(5);
                    lp7Var2.setTextColor(w0);
                    lp7Var2.setTextOffset(-gm.L(10.0f));
                    final ?? lp7Var3 = new lp7(context2, ylbVar2);
                    lp7Var3.setWrapSelectorWheel(true);
                    lp7Var3.setAllItemsCount(60);
                    lp7Var3.setItemCount(5);
                    lp7Var3.setTextColor(w0);
                    lp7Var3.setTextOffset(-gm.L(34.0f));
                    ViewGroup frameLayout3 = new FrameLayout(context2);
                    zi ziVar = new zi(context2, lp7Var, lp7Var2, lp7Var3, (byte) 3);
                    ziVar.setOrientation(1);
                    frameLayout3.addView(ziVar, qoe.c(-1.0f, -1));
                    frameLayout3.addView(new FrameLayout(context2), qoe.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout4 = new FrameLayout(context2);
                    ziVar.addView(frameLayout4, qoe.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context2);
                    textView.setText(jb6.M0(2131744516, null));
                    textView.setTextColor(w0);
                    ts2.s(textView, 1, 20.0f);
                    frameLayout4.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new p8((byte) 7));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    ziVar.addView(linearLayout, qoe.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context2);
                    textView2.setTextSize(1, 12.0f);
                    anb.X(textView2, cmb.p5, ylbVar2);
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    wb wbVar2 = new wb(context2, (byte) 3);
                    wbVar2.setText(jb6.M0(2131744517, null));
                    rve.b(wbVar2, 0.02f, 1.2f);
                    linearLayout.addView(lp7Var, qoe.l(0.5f, 0, 270));
                    lp7Var.setMinValue(0);
                    lp7Var.setMaxValue(365);
                    lp7Var.setWrapSelectorWheel(false);
                    lp7Var.setFormatter(new zg((byte) 4));
                    gh ghVar = new gh(g, lp7Var, (kj) lp7Var2, (lj) lp7Var3, textView2);
                    lp7Var.setOnValueChangedListener(ghVar);
                    lp7Var2.setMinValue(0);
                    lp7Var2.setMaxValue(23);
                    int i16 = i;
                    linearLayout.addView((View) lp7Var2, qoe.l(0.2f, 0, 270));
                    lp7Var2.setFormatter(new zg((byte) 5));
                    lp7Var2.setOnValueChangedListener(ghVar);
                    lp7Var3.setMinValue(0);
                    lp7Var3.setMaxValue(59);
                    lp7Var3.setValue(0);
                    lp7Var3.setFormatter(new zg((byte) 6));
                    linearLayout.addView((View) lp7Var3, qoe.l(0.3f, 0, 270));
                    lp7Var3.setOnValueChangedListener(ghVar);
                    if (j > 0 && j != 2147483646) {
                        viewGroup = frameLayout3;
                        long j2 = j * 1000;
                        wbVar = wbVar2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j2);
                        if (timeInMillis >= 0) {
                            lp7Var3.setValue(calendar.get(12));
                            lp7Var2.setValue(calendar.get(11));
                            lp7Var.setValue(timeInMillis);
                        }
                    } else {
                        viewGroup = frameLayout3;
                        wbVar = wbVar2;
                    }
                    final boolean[] zArr2 = {true};
                    ik.g(null, null, 0L, g, 3, lp7Var, lp7Var2, lp7Var3);
                    ik.e(textView2, lp7Var, lp7Var2, lp7Var3);
                    wbVar.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                    wbVar.setGravity(17);
                    wbVar.setTextColor(i2);
                    wbVar.setTextSize(1, 14.0f);
                    wbVar.setTypeface(gm.o());
                    wbVar.setBackground(ulb.e(i3, 24.0f));
                    ziVar.addView(wbVar, qoe.t(-1, 48, 83, 14, 15, 14, 16));
                    wbVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            zArr2[0] = false;
                            lp7 lp7Var4 = lp7Var;
                            kj kjVar = lp7Var2;
                            lj ljVar = lp7Var3;
                            boolean g2 = ik.g(null, null, 0L, g, 3, lp7Var4, kjVar, ljVar);
                            ik.e(textView2, lp7Var4, kjVar, ljVar);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, lp7Var4.getValue());
                            calendar2.set(11, kjVar.getValue());
                            calendar2.set(12, ljVar.getValue());
                            if (g2) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            g11Var.y((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            ((my0) k6dVar.b).y0.run();
                        }
                    });
                    ziVar.addView(textView2, qoe.t(-1, -2, 83, 14, 0, 14, 16));
                    my0 my0Var = (my0) obj5;
                    my0Var.O = viewGroup;
                    my0Var.show();
                    my0Var.setOnDismissListener(new g5(jdVar, zArr2, (byte) 2));
                    my0Var.s0(i16);
                    my0Var.K(i16);
                    return;
                }
                return;
            case 7:
                ((p82) obj4).r.Y4((ll0) obj3, (TL_iv.PageBlock) obj2);
                ((bu5) obj).u();
                return;
            case 8:
                ((ib2) obj4).b0((he[]) obj3, (TLRPC.Chat) obj2, (uc5) obj);
                return;
            case 9:
                ke2 ke2Var = (ke2) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                ke2Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    ke2Var.f0(twoStepVerificationActivity.e0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 10:
                wg2 wg2Var2 = (wg2) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                fi fiVar = (fi) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    fiVar.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg2Var2.getParentActivity());
                String M0 = jb6.M0(2131689472, "AppName");
                he heVar2 = alertDialog$Builder.a;
                heVar2.S = M0;
                heVar2.U = jb6.a0(null, null, 2131754347, m9c.r(user));
                alertDialog$Builder.j(jb6.M0(2131747564, "OK"), new cd1(fiVar, (byte) 27));
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                wg2Var2.showDialog(heVar2);
                return;
            case 11:
                vg2 vg2Var2 = (vg2) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                wg2 wg2Var3 = vg2Var2.E;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    gm.c3(new da7(vg2Var2, new ArrayList(), new vh6(), new ArrayList(), new ArrayList(), (byte) 24));
                    return;
                }
                String S0 = jb6.D0().S0(lowerCase2, true, false);
                S0 = (lowerCase2.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int i17 = i4 + 1;
                String[] strArr2 = new String[i17];
                strArr2[0] = lowerCase2;
                if (S0 != null) {
                    strArr2[1] = S0;
                }
                ArrayList arrayList4 = new ArrayList();
                vh6 vh6Var = new vh6();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        TLObject tLObject3 = (TLObject) arrayList2.get(i18);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            strArr = strArr2;
                            i5 = size2;
                            B1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            strArr = strArr2;
                            i5 = size2;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                B1 = k47.B1(((TLRPC.ChannelParticipant) tLObject3).peer);
                            } else {
                                wg2Var = wg2Var3;
                                arrayList = arrayList2;
                                vg2Var = vg2Var2;
                                i6 = i18;
                                i18 = i6 + 1;
                                strArr2 = strArr;
                                size2 = i5;
                                wg2Var3 = wg2Var;
                                arrayList2 = arrayList;
                                vg2Var2 = vg2Var;
                            }
                        }
                        if (B1 > 0) {
                            TLRPC.User W1 = wg2Var3.getMessagesController().W1(Long.valueOf(B1));
                            i6 = i18;
                            if (W1.id == wg2Var3.getUserConfig().e()) {
                                wg2Var = wg2Var3;
                                arrayList = arrayList2;
                                vg2Var = vg2Var2;
                                i18 = i6 + 1;
                                strArr2 = strArr;
                                size2 = i5;
                                wg2Var3 = wg2Var;
                                arrayList2 = arrayList;
                                vg2Var2 = vg2Var;
                            } else {
                                lowerCase = m9c.r(W1).toLowerCase();
                                String p = m9c.p(W1);
                                String str4 = W1.first_name;
                                wg2Var = wg2Var3;
                                str2 = W1.last_name;
                                str = str4;
                                K = p;
                                z6 = false;
                            }
                        } else {
                            i6 = i18;
                            TLRPC.Chat L0 = wg2Var3.getMessagesController().L0(Long.valueOf(-B1));
                            lowerCase = L0.title.toLowerCase();
                            z6 = false;
                            K = sd2.K(L0, false);
                            str = L0.title;
                            wg2Var = wg2Var3;
                            str2 = null;
                        }
                        arrayList = arrayList2;
                        vg2Var = vg2Var2;
                        String S02 = jb6.D0().S0(lowerCase, true, z6);
                        if (lowerCase.equals(S02)) {
                            S02 = null;
                        }
                        char c3 = 0;
                        int i19 = 0;
                        while (true) {
                            if (i19 < i17) {
                                char c4 = c3;
                                String str5 = strArr[i19];
                                if (!lowerCase.startsWith(str5) && !hg9.s(" ", str5, lowerCase) && (S02 == null || (!S02.startsWith(str5) && !hg9.s(" ", str5, S02)))) {
                                    if (K != null && K.startsWith(str5)) {
                                        str3 = lowerCase;
                                        c2 = 2;
                                    } else {
                                        str3 = lowerCase;
                                        c2 = c4;
                                    }
                                } else {
                                    str3 = lowerCase;
                                    c2 = 1;
                                }
                                if (c2 != 0) {
                                    if (c2 == 1) {
                                        arrayList5.add(gm.r0(str, str2, str5));
                                    } else {
                                        arrayList5.add(gm.r0(b10.h("@", K), null, "@" + str5));
                                    }
                                    arrayList6.add(tLObject3);
                                } else {
                                    i19++;
                                    c3 = c2;
                                    lowerCase = str3;
                                }
                            }
                        }
                        i18 = i6 + 1;
                        strArr2 = strArr;
                        size2 = i5;
                        wg2Var3 = wg2Var;
                        arrayList2 = arrayList;
                        vg2Var2 = vg2Var;
                    }
                }
                wg2 wg2Var4 = wg2Var3;
                String[] strArr3 = strArr2;
                vg2 vg2Var3 = vg2Var2;
                if (arrayList3 != null) {
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        TLRPC.User W12 = wg2Var4.getMessagesController().W1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i20)).user_id));
                        if (W12.id != wg2Var4.getUserConfig().e()) {
                            String lowerCase3 = m9c.r(W12).toLowerCase();
                            String S03 = jb6.D0().S0(lowerCase3, true, false);
                            if (lowerCase3.equals(S03)) {
                                S03 = null;
                            }
                            char c5 = 0;
                            int i21 = 0;
                            while (true) {
                                if (i21 < i17) {
                                    String str6 = strArr3[i21];
                                    if (!lowerCase3.startsWith(str6) && !hg9.s(" ", str6, lowerCase3) && (S03 == null || (!S03.startsWith(str6) && !hg9.s(" ", str6, S03)))) {
                                        String p2 = m9c.p(W12);
                                        if (p2 != null && p2.startsWith(str6)) {
                                            c5 = 2;
                                        }
                                    } else {
                                        c5 = 1;
                                    }
                                    if (c5 != 0) {
                                        if (c5 == 1) {
                                            arrayList5.add(gm.r0(W12.first_name, W12.last_name, str6));
                                        } else {
                                            arrayList5.add(gm.r0("@" + m9c.p(W12), null, "@" + str6));
                                        }
                                        arrayList4.add(W12);
                                        vh6Var.k(W12, W12.id);
                                    } else {
                                        i21++;
                                    }
                                }
                            }
                        }
                    }
                }
                gm.c3(new da7(vg2Var3, arrayList4, vh6Var, arrayList5, arrayList6, (byte) 24));
                return;
            case 12:
                kd3 kd3Var = (kd3) obj4;
                rb0 rb0Var = (rb0) obj3;
                String str7 = rb0Var.a;
                j3c j3cVar = (j3c) obj2;
                pa0 pa0Var = (pa0) obj;
                kd3Var.getClass();
                Logger logger = kd3.f;
                try {
                    e3c a = kd3Var.c.a(str7);
                    if (a == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        j3cVar.d(new IllegalArgumentException(str8));
                    } else {
                        kd3Var.e.f(new wu2(kd3Var, rb0Var, ((se1) a).a(pa0Var), (byte) 4));
                        j3cVar.d(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    j3cVar.d(e);
                    return;
                }
            case 13:
                o5b o5bVar = (o5b) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                try {
                    DictationAsr.d0((float[]) obj4, (in3) obj3, o5bVar, zArr3);
                    return;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    gm.c3(new rd3(zArr3, o5bVar, (byte) 16));
                    return;
                }
            case 14:
                DictationAsr.F((String) obj4, (boolean[]) obj, (t0c) obj3, (in3) obj2);
                return;
            case 15:
                b24 b24Var = (b24) obj4;
                he[] heVarArr = (he[]) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                k6d k6dVar2 = (k6d) obj;
                try {
                    heVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                heVarArr[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    l11.u(((e24) b24Var.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    ((my0) k6dVar2.b).y0.run();
                    return;
                }
                return;
            case 16:
                y24 y24Var = (y24) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList7 = y24Var.s;
                z24 z24Var = y24Var.x;
                if (z24Var.N == y24Var.b) {
                    z24Var.M = 0;
                    if (tL_messages_getStickers.emoticon.equals(y24Var.a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size3 = arrayList7.size();
                        int size4 = tL_messages_stickers.stickers.size();
                        for (int i22 = 0; i22 < size4; i22++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i22);
                            if (y24Var.w.indexOfKey(document.id) < 0) {
                                arrayList7.add(document);
                            }
                        }
                        if (size3 != arrayList7.size()) {
                            y24Var.f.put(arrayList7, z24Var.O);
                            if (size3 == 0) {
                                y24Var.h.add(arrayList7);
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                return;
            case 17:
                lc4 lc4Var = (lc4) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                long[] jArr = (long[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                lc4Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                lc4Var.c();
                for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                    try {
                        ((k47) arrayList8.get(i23)).K(false);
                    } finally {
                        try {
                            fc4.g(th, true);
                            return;
                        } finally {
                        }
                    }
                }
                jArr[0] = System.currentTimeMillis() - currentTimeMillis;
                return;
            case 18:
                lc4 lc4Var2 = (lc4) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                LongSparseArray longSparseArray = (LongSparseArray) obj2;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj;
                lc4Var2.getClass();
                try {
                    lc4Var2.c();
                    ?? obj6 = new Object();
                    for (int i24 = 0; i24 < arrayList9.size(); i24++) {
                        kc4 e2 = lc4Var2.e(((u61) arrayList9.get(i24)).a, obj6);
                        if (e2 != null) {
                            long j3 = e2.a;
                            if (j3 != 0) {
                                ArrayList arrayList10 = (ArrayList) longSparseArray.get(j3);
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                    longSparseArray.put(e2.a, arrayList10);
                                }
                                u61 u61Var = (u61) arrayList9.get(i24);
                                if (e2.c == 23) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                u61Var.d = z7;
                                arrayList10.add((u61) arrayList9.get(i24));
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
                ((ad4) obj4).s((String) obj3, (String) obj2, (s3b) obj, null, true, false);
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
                ((w45) obj4).l((TL_wallet.tonConnectSession) obj3, (String) obj2, (h72) obj);
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
                j55 j55Var = (j55) obj4;
                b61 b61Var = (b61) obj3;
                int[] iArr4 = (int[]) obj2;
                b61 b61Var2 = (b61) obj;
                boolean a2 = j55Var.a();
                if (iArr4[0] == 2) {
                    i7 = 2131742653;
                } else {
                    i7 = 2131742851;
                }
                b61Var.setText(jb6.M0(i7, null));
                if (!a2 && !j55Var.d && ((i8 = iArr4[0]) == 1 || i8 == 2)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                b61Var.setEnabled(z8);
                if (!a2 && !j55Var.d) {
                    z9 = true;
                }
                b61Var2.setEnabled(z9);
                return;
        }
    }

    public xo1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public xo1(d dVar, TLRPC.TL_error tL_error, k11 k11Var, he heVar) {
        this.a = (byte) 22;
        this.b = dVar;
        this.c = tL_error;
        this.e = k11Var;
        this.d = heVar;
    }
}
