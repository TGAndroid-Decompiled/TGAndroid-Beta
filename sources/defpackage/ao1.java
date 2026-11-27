package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.b;
import org.telegram.ui.Wallet.c;
public final class ao1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ao1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        qn4 qn4Var = (qn4) this.b;
        TLObject tLObject = (TLObject) this.c;
        pcc pccVar = (pcc) this.e;
        int i = -1;
        qn4Var.u2 = -1;
        e eVar = qn4Var.r1;
        nf4.x0((TLRPC.TL_error) this.d, eVar, d31.b0(eVar));
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
            if (qn4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                eVar.getMessagesController().k3(true, new i61(qn4Var, pccVar, i, (byte) 2));
                return;
            }
            if (qn4Var.V1 != null) {
                eVar.getMessagesController().F(qn4Var.T1, true);
            }
            qn4Var.v2 = true;
            qn4Var.dismiss();
            pccVar.a(Integer.valueOf(i));
            return;
        }
        qn4Var.g2.a(false);
    }

    private final void b() {
        x25 x25Var;
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
        pcc pccVar = (pcc) cVar.q.remove(wallettransaction);
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
        }
        if (nftitem != null && (x25Var = cVar.o) != null) {
            x25Var.h(wallettransaction);
        }
        bVar.k();
        bVar.i();
        bVar.g();
        cVar.a0();
    }

    private final void c() {
        byte[] bArr = (byte[]) this.b;
        v35 v35Var = (v35) this.c;
        String str = (String) this.d;
        s45 s45Var = (s45) this.e;
        if (bArr == null) {
            v35Var.a(str);
        } else {
            s45Var.a(bArr);
        }
    }

    private final void d() {
        String h;
        JSONObject jSONObject;
        a55 a55Var = (a55) this.b;
        c35 c35Var = (c35) this.c;
        w45 w45Var = (w45) this.d;
        v35 v35Var = (v35) this.e;
        try {
            jSONObject = WalletEngine2.signData(c35Var, w45Var.a, w45Var.h, w45Var.g, new JSONObject(w45Var.k), a55.n(w45Var.a.manifest.url), a55Var.f.getCurrentTime());
            h = null;
        } catch (Exception e) {
            h = a55.h("sign data", e);
            jSONObject = null;
        }
        hl.c3(new z87(a55Var, w45Var, c35Var, v35Var, jSONObject, h, (byte) 13));
    }

    private final void e() {
        ((a55) this.b).l((TL_wallet.tonConnectSession) this.c, (String) this.d, (m62) this.e);
    }

    private final void f() {
        byte[] bArr;
        a55 a55Var = (a55) this.b;
        v45 v45Var = (v45) this.c;
        zj3 zj3Var = (zj3) this.d;
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) this.e;
        c cVar = a55Var.b;
        String x = cVar.x();
        byte[] D = cVar.D();
        if (D == null) {
            bArr = null;
        } else {
            bArr = (byte[]) D.clone();
        }
        byte[] bArr2 = bArr;
        v35 v35Var = new v35(v45Var, zj3Var, (byte) 1);
        if (x != null && bArr2 != null) {
            cVar.E(true, false, false, new a45(a55Var, (Object) v35Var, (TLObject) tonconnectsession, x, bArr2, (Object) v45Var, (byte) 1));
        } else {
            v35Var.a("Wallet is not ready");
        }
    }

    @Override
    public final void run() {
        boolean z;
        float f;
        float f2;
        float f3;
        vpa vpaVar;
        float f4;
        vpa vpaVar2;
        boolean z2;
        int w0;
        int i;
        int i2;
        int i3;
        ViewGroup viewGroup;
        ai aiVar;
        xb xbVar;
        int i4;
        String[] strArr;
        bg2 bg2Var;
        long B1;
        int i5;
        ArrayList arrayList;
        int i6;
        ag2 ag2Var;
        String lowerCase;
        boolean z3;
        String str;
        String str2;
        String str3;
        String str4;
        char c;
        CountDownLatch countDownLatch;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        byte b = this.a;
        boolean z6 = true;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj4;
                jf7 jf7Var = (jf7) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) == null && !messages_messages.messages.isEmpty()) {
                    int i9 = messages_messages.messages.get(0).id;
                    r47 r47Var = (r47) zu1Var.G6[0].get(i9);
                    jf7Var.a.c(new gd7(jf7Var, i9, zu1Var.l6, (byte) 4));
                    if (r47Var != null) {
                        TLRPC.Message message = r47Var.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    zu1Var.J(i9, 0, 0, 0, false, true);
                    return;
                }
                if (messages_messages != null) {
                    zu1Var.D6 = messages_messages.count;
                } else {
                    zu1Var.D6 = 0;
                }
                jf7Var.a.c(new ae7(jf7Var, zu1Var.c(), zu1Var.l6, zu1Var.D6, (byte) 3));
                int i10 = zu1Var.D6;
                if (i10 == 0) {
                    zu1Var.E6 = true;
                    zu1Var.mc(false);
                    return;
                }
                zu1Var.y1.c(2, i10, true);
                zu1Var.X9();
                return;
            case 1:
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj3)[0]) {
                    imageView = imageView2;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new g0((e43) imageView.getDrawable(), (byte) 28));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(k43.f);
                ofFloat.start();
                return;
            case 2:
                ((zu1) obj4).z9((TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (p) obj);
                return;
            case 3:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final wla wlaVar = (wla) obj3;
                int[] iArr = (int[]) obj2;
                a8a a8aVar = (a8a) obj;
                int i11 = ChatActivityEnterView.X7;
                int[] iArr2 = chatActivityEnterView.C3;
                if (chatActivityEnterView.r0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), 2131755354);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(wlaVar, tre.e(40, 40, 3));
                    dialog.setContentView(frameLayout);
                    dialog.getWindow().setLayout(-1, -1);
                    dialog.getWindow().clearFlags(1024);
                    dialog.getWindow().clearFlags(67108864);
                    dialog.getWindow().clearFlags(134217728);
                    dialog.getWindow().addFlags(Integer.MIN_VALUE);
                    dialog.getWindow().addFlags(512);
                    dialog.getWindow().addFlags(131072);
                    dialog.getWindow().getAttributes().windowAnimations = 0;
                    dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog.getWindow().setStatusBarColor(0);
                    dialog.getWindow().setNavigationBarColor(0);
                    if (aob.w0(null, aob.s8, true) == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hl.l3(dialog, z);
                    if (Build.VERSION.SDK_INT >= 26) {
                        if (hl.B(aob.w0(null, aob.a7, true)) >= 0.721f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        hl.i3(dialog, z2);
                    }
                    chatActivityEnterView.t0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.t0;
                    chatActivityEnterView.q0.getLocationInWindow(iArr2);
                    final float f5 = iArr2[0];
                    float f6 = iArr2[1];
                    float L = hl.L(5.0f);
                    float L2 = iArr[0] + chatActivityEnterView.t0 + L + hl.L(4.0f) + 0.0f;
                    float f7 = iArr[1] + chatActivityEnterView.u0 + L + 0.0f;
                    wlaVar.setTranslationX(L2);
                    wlaVar.setTranslationY(f7);
                    float f8 = chatActivityEnterView.q0.getLayoutParams().width;
                    if (chatActivityEnterView.T7) {
                        f = chatActivityEnterView.q0.getScaleX();
                    } else {
                        f = 1.0f;
                    }
                    float L3 = (f8 * f) / hl.L(40.0f);
                    wlaVar.setPivotX(0.0f);
                    wlaVar.setPivotY(0.0f);
                    wlaVar.setScaleX(0.75f);
                    wlaVar.setScaleY(0.75f);
                    wlaVar.getViewTreeObserver().addOnDrawListener(new jx1(wlaVar, a8aVar));
                    dialog.show();
                    if (!chatActivityEnterView.T7) {
                        f2 = 1.0f;
                        chatActivityEnterView.q0.setScaleX(1.0f);
                        chatActivityEnterView.q0.setScaleY(1.0f);
                    } else {
                        f2 = 1.0f;
                    }
                    chatActivityEnterView.q0.setAlpha(f2);
                    ix1 ix1Var = chatActivityEnterView.r0;
                    boolean z7 = chatActivityEnterView.T7;
                    os3 os3Var = vpa.q;
                    if (z7) {
                        vpaVar = null;
                        f3 = 0.5f;
                    } else {
                        vpa vpaVar3 = new vpa(chatActivityEnterView.q0, os3Var);
                        f3 = 0.5f;
                        vpaVar3.m = bp1.j(0.5f, 750.0f, f2);
                        vpaVar = vpaVar3;
                    }
                    boolean z8 = chatActivityEnterView.T7;
                    os3 os3Var2 = vpa.r;
                    if (z8) {
                        f4 = f6;
                        vpaVar2 = null;
                    } else {
                        f4 = f6;
                        vpa vpaVar4 = new vpa(chatActivityEnterView.q0, os3Var2);
                        vpaVar4.m = bp1.j(f3, 750.0f, f2);
                        vpaVar2 = vpaVar4;
                    }
                    vpa vpaVar5 = new vpa(chatActivityEnterView.q0, vpa.v);
                    vpaVar5.m = bp1.j(0.0f, 750.0f, f2);
                    final float f9 = f4;
                    vpaVar5.a(new ps3() {
                        @Override
                        public final void a(vpa vpaVar6, boolean z9, float f10, float f11) {
                            byte b2 = r6;
                            float f12 = f9;
                            float f13 = f5;
                            wla wlaVar2 = wlaVar;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (b2) {
                                case 0:
                                    int i12 = ChatActivityEnterView.X7;
                                    if (dialog2.isShowing()) {
                                        wlaVar2.setTranslationX(f13);
                                        wlaVar2.setTranslationY(f12);
                                        c8a c8aVar = chatActivityEnterView2.q0;
                                        c8aVar.getClass();
                                        c8aVar.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.T7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new kx1(chatActivityEnterView2, dialog2, (byte) 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i13 = ChatActivityEnterView.X7;
                                    if (dialog2.isShowing()) {
                                        wlaVar2.setTranslationX(f13);
                                        wlaVar2.setTranslationY(f12);
                                        c8a c8aVar2 = chatActivityEnterView2.q0;
                                        c8aVar2.getClass();
                                        c8aVar2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.T7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new kx1(chatActivityEnterView2, dialog2, (byte) 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    vpa vpaVar6 = new vpa(wlaVar, vpa.o);
                    vpaVar6.b = ete.a(L2, f5 - hl.L(6.0f), L2);
                    vpaVar6.c = true;
                    vpaVar6.m = bp1.j(f5, 700.0f, 0.75f);
                    vpaVar6.h = f5 - hl.L(6.0f);
                    vpa vpaVar7 = new vpa(wlaVar, vpa.p);
                    vpaVar7.b = ete.a(f7, f7, hl.L(6.0f) + f9);
                    vpaVar7.c = true;
                    vpaVar7.m = bp1.j(f9, 700.0f, 0.75f);
                    vpaVar7.g = hl.L(6.0f) + f9;
                    vpaVar7.b(new lx1(f9, wlaVar));
                    vpaVar7.a(new ps3() {
                        @Override
                        public final void a(vpa vpaVar62, boolean z9, float f10, float f11) {
                            byte b2 = r6;
                            float f12 = f9;
                            float f13 = f5;
                            wla wlaVar2 = wlaVar;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (b2) {
                                case 0:
                                    int i12 = ChatActivityEnterView.X7;
                                    if (dialog2.isShowing()) {
                                        wlaVar2.setTranslationX(f13);
                                        wlaVar2.setTranslationY(f12);
                                        c8a c8aVar = chatActivityEnterView2.q0;
                                        c8aVar.getClass();
                                        c8aVar.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.T7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new kx1(chatActivityEnterView2, dialog2, (byte) 0));
                                        return;
                                    }
                                    return;
                                default:
                                    int i13 = ChatActivityEnterView.X7;
                                    if (dialog2.isShowing()) {
                                        wlaVar2.setTranslationX(f13);
                                        wlaVar2.setTranslationY(f12);
                                        c8a c8aVar2 = chatActivityEnterView2.q0;
                                        c8aVar2.getClass();
                                        c8aVar2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.T7) {
                                            chatActivityEnterView2.q0.setScaleX(1.0f);
                                            chatActivityEnterView2.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.q0.setAlpha(1.0f);
                                        chatActivityEnterView2.q0.getViewTreeObserver().addOnPreDrawListener(new kx1(chatActivityEnterView2, dialog2, (byte) 1));
                                        return;
                                    }
                                    return;
                            }
                        }
                    });
                    vpa vpaVar8 = new vpa(wlaVar, os3Var);
                    vpaVar8.m = bp1.j(L3, 1000.0f, 1.0f);
                    vpa vpaVar9 = new vpa(wlaVar, os3Var2);
                    vpaVar9.m = bp1.j(L3, 1000.0f, 1.0f);
                    ix1Var.l(vpaVar, vpaVar2, vpaVar5, vpaVar6, vpaVar7, vpaVar8, vpaVar9);
                    return;
                }
                return;
            case 4:
                int i12 = ChatActivityEnterView.X7;
                ((ChatActivityEnterView) obj4).F1(((Boolean) obj3).booleanValue(), ((Integer) obj2).intValue(), ((Integer) obj).intValue(), 0L, true);
                return;
            case 5:
                zv4 zv4Var = (zv4) obj3;
                knc kncVar = (knc) obj2;
                FrameLayout frameLayout2 = (FrameLayout) obj;
                ChatActivityEnterView chatActivityEnterView2 = ((org.telegram.ui.Components.c) obj4).a;
                if (chatActivityEnterView2.x6 == zv4Var) {
                    chatActivityEnterView2.x6 = null;
                }
                kncVar.setLanguagePillAlpha(1.0f);
                kncVar.setLanguageMenuUp(false);
                hl.B2(frameLayout2);
                return;
            case 6:
                a72 a72Var = (a72) obj4;
                Context context = (Context) obj3;
                vnb vnbVar = (vnb) obj;
                long j = a72Var.W;
                final h01 h01Var = new h01(a72Var, (View) obj2, (byte) 28);
                kc kcVar = new kc((byte) 10);
                int i13 = aob.j5;
                if (vnbVar != null) {
                    w0 = vnbVar.f(i13);
                    i = vnbVar.f(aob.h5);
                    vnbVar.f(aob.Aj);
                    vnbVar.f(aob.Ej);
                    vnbVar.f(aob.E8);
                    vnbVar.f(aob.G8);
                    vnbVar.f(aob.i6);
                    i2 = vnbVar.f(aob.Ji);
                    i3 = vnbVar.f(aob.Fi);
                    vnbVar.f(aob.Hi);
                } else {
                    w0 = aob.w0(null, i13, false);
                    int w02 = aob.w0(null, aob.h5, false);
                    aob.w0(null, aob.Aj, false);
                    aob.w0(null, aob.Ej, false);
                    aob.w0(null, aob.E8, false);
                    aob.w0(null, aob.G8, false);
                    aob.w0(null, aob.i6, false);
                    int w03 = aob.w0(null, aob.Ji, false);
                    int w04 = aob.w0(null, aob.Fi, false);
                    aob.w0(null, aob.Hi, false);
                    i = w02;
                    i2 = w03;
                    i3 = w04;
                }
                Pattern pattern = jj.a;
                if (context != null) {
                    final int g = (int) uc7.s1(yac.t0).k4.P.g(TimeUnit.SECONDS);
                    final z8d z8dVar = new z8d(context, vnbVar);
                    ((nx0) z8dVar.b).w0 = false;
                    final hq7 hq7Var = new hq7(context, vnbVar);
                    hq7Var.setTextColor(w0);
                    hq7Var.setTextOffset(hl.L(10.0f));
                    hq7Var.setItemCount(5);
                    final ?? hq7Var2 = new hq7(context, vnbVar);
                    hq7Var2.setWrapSelectorWheel(true);
                    hq7Var2.setAllItemsCount(24);
                    hq7Var2.setItemCount(5);
                    hq7Var2.setTextColor(w0);
                    hq7Var2.setTextOffset(-hl.L(10.0f));
                    final ?? hq7Var3 = new hq7(context, vnbVar);
                    hq7Var3.setWrapSelectorWheel(true);
                    hq7Var3.setAllItemsCount(60);
                    hq7Var3.setItemCount(5);
                    hq7Var3.setTextColor(w0);
                    hq7Var3.setTextOffset(-hl.L(34.0f));
                    ViewGroup frameLayout3 = new FrameLayout(context);
                    ai aiVar2 = new ai(context, hq7Var, hq7Var2, hq7Var3, (byte) 3);
                    aiVar2.setOrientation(1);
                    frameLayout3.addView(aiVar2, tre.c(-1.0f, -1));
                    frameLayout3.addView(new FrameLayout(context), tre.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    aiVar2.addView(frameLayout4, tre.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView = new TextView(context);
                    textView.setText(ob6.M0(2131744484, null));
                    textView.setTextColor(w0);
                    bs2.t(textView, 1, 20.0f);
                    frameLayout4.addView(textView, tre.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView.setOnTouchListener(new q8((byte) 6));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    aiVar2.addView(linearLayout, tre.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 12.0f);
                    yob.X(textView2, aob.q5, vnbVar);
                    textView2.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    xb xbVar2 = new xb(context, (byte) 3);
                    xbVar2.setText(ob6.M0(2131744485, null));
                    iye.b(xbVar2, 0.02f, 1.2f);
                    linearLayout.addView(hq7Var, tre.l(0.5f, 0, 270));
                    hq7Var.setMinValue(0);
                    hq7Var.setMaxValue(365);
                    hq7Var.setWrapSelectorWheel(false);
                    hq7Var.setFormatter(new bg((byte) 1));
                    eg egVar = new eg(g, hq7Var, (li) hq7Var2, (mi) hq7Var3, textView2);
                    hq7Var.setOnValueChangedListener(egVar);
                    hq7Var2.setMinValue(0);
                    hq7Var2.setMaxValue(23);
                    int i14 = i;
                    linearLayout.addView((View) hq7Var2, tre.l(0.2f, 0, 270));
                    hq7Var2.setFormatter(new bg((byte) 2));
                    hq7Var2.setOnValueChangedListener(egVar);
                    hq7Var3.setMinValue(0);
                    hq7Var3.setMaxValue(59);
                    hq7Var3.setValue(0);
                    hq7Var3.setFormatter(new bg((byte) 3));
                    linearLayout.addView((View) hq7Var3, tre.l(0.3f, 0, 270));
                    hq7Var3.setOnValueChangedListener(egVar);
                    if (j > 0 && j != 2147483646) {
                        viewGroup = frameLayout3;
                        long j2 = j * 1000;
                        aiVar = aiVar2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        xbVar = xbVar2;
                        int timeInMillis = (int) ((j2 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j2);
                        if (timeInMillis >= 0) {
                            hq7Var3.setValue(calendar.get(12));
                            hq7Var2.setValue(calendar.get(11));
                            hq7Var.setValue(timeInMillis);
                        }
                    } else {
                        viewGroup = frameLayout3;
                        aiVar = aiVar2;
                        xbVar = xbVar2;
                    }
                    final boolean[] zArr = {true};
                    jj.g(null, null, 0L, g, 3, hq7Var, hq7Var2, hq7Var3);
                    jj.e(textView2, hq7Var, hq7Var2, hq7Var3);
                    xbVar.setPadding(hl.L(34.0f), 0, hl.L(34.0f), 0);
                    xbVar.setGravity(17);
                    xbVar.setTextColor(i2);
                    xbVar.setTextSize(1, 14.0f);
                    xbVar.setTypeface(hl.o());
                    xbVar.setBackground(rnb.e(i3, 24.0f));
                    aiVar.addView(xbVar, tre.t(-1, 48, 83, 14, 15, 14, 16));
                    xbVar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            zArr[0] = false;
                            hq7 hq7Var4 = hq7Var;
                            li liVar = hq7Var2;
                            mi miVar = hq7Var3;
                            boolean g2 = jj.g(null, null, 0L, g, 3, hq7Var4, liVar, miVar);
                            jj.e(textView2, hq7Var4, liVar, miVar);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, hq7Var4.getValue());
                            calendar2.set(11, liVar.getValue());
                            calendar2.set(12, miVar.getValue());
                            if (g2) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            h01Var.y((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            ((nx0) z8dVar.b).y0.run();
                        }
                    });
                    aiVar.addView(textView2, tre.t(-1, -2, 83, 14, 0, 14, 16));
                    nx0 nx0Var = (nx0) z8dVar.b;
                    nx0Var.O = viewGroup;
                    nx0Var.show();
                    nx0Var.setOnDismissListener(new h5(kcVar, zArr, (byte) 3));
                    nx0Var.s0(i14);
                    nx0Var.K(i14);
                    return;
                }
                return;
            case 7:
                ((v72) obj4).r.Z4((mk0) obj3, (TL_iv.PageBlock) obj2);
                ((fu5) obj).u();
                return;
            case 8:
                ((na2) obj4).a0((id[]) obj3, (TLRPC.Chat) obj2, (xc5) obj);
                return;
            case 9:
                pd2 pd2Var = (pd2) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj3;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                pd2Var.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.e0(password);
                    pd2Var.e0(twoStepVerificationActivity.d0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 10:
                bg2 bg2Var2 = (bg2) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                le leVar = (le) obj;
                if (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    leVar.a(1);
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bg2Var2.getParentActivity());
                String M0 = ob6.M0(2131689472, "AppName");
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.a0(null, null, 2131754343, lbc.r(user));
                alertDialog$Builder.j(ob6.M0(2131747558, "OK"), new rd1(leVar, (byte) 26));
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                bg2Var2.showDialog(idVar);
                return;
            case 11:
                ag2 ag2Var2 = (ag2) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                bg2 bg2Var3 = ag2Var2.E;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    hl.c3(new la7(ag2Var2, new ArrayList(), new zh6(), new ArrayList(), new ArrayList(), (byte) 25));
                    return;
                }
                String S0 = ob6.D0().S0(lowerCase2, true, false);
                S0 = (lowerCase2.equals(S0) || S0.length() == 0) ? null : null;
                if (S0 != null) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int i15 = i4 + 1;
                String[] strArr2 = new String[i15];
                strArr2[0] = lowerCase2;
                if (S0 != null) {
                    strArr2[1] = S0;
                }
                ArrayList arrayList4 = new ArrayList();
                String[] strArr3 = strArr2;
                zh6 zh6Var = new zh6();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLObject tLObject3 = (TLObject) arrayList2.get(i16);
                        if (tLObject3 instanceof TLRPC.ChatParticipant) {
                            strArr = strArr3;
                            B1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                        } else {
                            strArr = strArr3;
                            if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                                B1 = r47.B1(((TLRPC.ChannelParticipant) tLObject3).peer);
                            } else {
                                bg2Var = bg2Var3;
                                ag2Var = ag2Var2;
                                i6 = i16;
                                arrayList = arrayList2;
                                i5 = size;
                                i16 = i6 + 1;
                                strArr3 = strArr;
                                bg2Var3 = bg2Var;
                                ag2Var2 = ag2Var;
                                arrayList2 = arrayList;
                                size = i5;
                            }
                        }
                        if (B1 > 0) {
                            bg2Var = bg2Var3;
                            TLRPC.User X1 = bg2Var.getMessagesController().X1(Long.valueOf(B1));
                            if (X1.id != bg2Var.getUserConfig().e()) {
                                String lowerCase3 = lbc.r(X1).toLowerCase();
                                String p = lbc.p(X1);
                                String str5 = X1.first_name;
                                i6 = i16;
                                str3 = X1.last_name;
                                str = str5;
                                lowerCase = lowerCase3;
                                ag2Var = ag2Var2;
                                str2 = p;
                                z3 = false;
                            }
                            ag2Var = ag2Var2;
                            i6 = i16;
                            arrayList = arrayList2;
                            i5 = size;
                            i16 = i6 + 1;
                            strArr3 = strArr;
                            bg2Var3 = bg2Var;
                            ag2Var2 = ag2Var;
                            arrayList2 = arrayList;
                            size = i5;
                        } else {
                            bg2Var = bg2Var3;
                            TLRPC.Chat M02 = bg2Var.getMessagesController().M0(Long.valueOf(-B1));
                            lowerCase = M02.title.toLowerCase();
                            z3 = false;
                            String K = xc2.K(M02, false);
                            str = M02.title;
                            ag2Var = ag2Var2;
                            str2 = K;
                            i6 = i16;
                            str3 = null;
                        }
                        arrayList = arrayList2;
                        i5 = size;
                        String S02 = ob6.D0().S0(lowerCase, true, z3);
                        if (lowerCase.equals(S02)) {
                            S02 = null;
                        }
                        char c2 = 0;
                        int i17 = 0;
                        while (true) {
                            if (i17 < i15) {
                                char c3 = c2;
                                String str6 = strArr[i17];
                                if (!lowerCase.startsWith(str6) && !uh9.t(" ", str6, lowerCase) && (S02 == null || (!S02.startsWith(str6) && !uh9.t(" ", str6, S02)))) {
                                    if (str2 != null && str2.startsWith(str6)) {
                                        str4 = lowerCase;
                                        c = 2;
                                    } else {
                                        str4 = lowerCase;
                                        c = c3;
                                    }
                                } else {
                                    str4 = lowerCase;
                                    c = 1;
                                }
                                if (c != 0) {
                                    if (c == 1) {
                                        arrayList5.add(hl.r0(str, str3, str6));
                                    } else {
                                        arrayList5.add(hl.r0(c00.i("@", str2), null, "@" + str6));
                                    }
                                    arrayList6.add(tLObject3);
                                } else {
                                    i17++;
                                    c2 = c;
                                    lowerCase = str4;
                                }
                            }
                        }
                        i16 = i6 + 1;
                        strArr3 = strArr;
                        bg2Var3 = bg2Var;
                        ag2Var2 = ag2Var;
                        arrayList2 = arrayList;
                        size = i5;
                    }
                }
                bg2 bg2Var4 = bg2Var3;
                String[] strArr4 = strArr3;
                ag2 ag2Var3 = ag2Var2;
                if (arrayList3 != null) {
                    for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                        TLRPC.User X12 = bg2Var4.getMessagesController().X1(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i18)).user_id));
                        if (X12.id != bg2Var4.getUserConfig().e()) {
                            String lowerCase4 = lbc.r(X12).toLowerCase();
                            String S03 = ob6.D0().S0(lowerCase4, true, false);
                            if (lowerCase4.equals(S03)) {
                                S03 = null;
                            }
                            char c4 = 0;
                            int i19 = 0;
                            while (true) {
                                if (i19 < i15) {
                                    String str7 = strArr4[i19];
                                    if (!lowerCase4.startsWith(str7) && !uh9.t(" ", str7, lowerCase4) && (S03 == null || (!S03.startsWith(str7) && !uh9.t(" ", str7, S03)))) {
                                        String p2 = lbc.p(X12);
                                        if (p2 != null && p2.startsWith(str7)) {
                                            c4 = 2;
                                        }
                                    } else {
                                        c4 = 1;
                                    }
                                    if (c4 != 0) {
                                        if (c4 == 1) {
                                            arrayList5.add(hl.r0(X12.first_name, X12.last_name, str7));
                                        } else {
                                            arrayList5.add(hl.r0("@" + lbc.p(X12), null, "@" + str7));
                                        }
                                        arrayList4.add(X12);
                                        zh6Var.k(X12.id, X12);
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                        }
                    }
                }
                hl.c3(new la7(ag2Var3, arrayList4, zh6Var, arrayList5, arrayList6, (byte) 25));
                return;
            case 12:
                rc3 rc3Var = (rc3) obj4;
                ta0 ta0Var = (ta0) obj3;
                String str8 = ta0Var.a;
                i5c i5cVar = (i5c) obj2;
                r90 r90Var = (r90) obj;
                rc3Var.getClass();
                Logger logger = rc3.f;
                try {
                    d5c a = rc3Var.c.a(str8);
                    if (a == null) {
                        String str9 = "Transport backend '" + str8 + "' is not registered";
                        logger.warning(str9);
                        i5cVar.d(new IllegalArgumentException(str9));
                    } else {
                        rc3Var.e.f(new fu2(rc3Var, ta0Var, ((td1) a).a(r90Var), (byte) 4));
                        i5cVar.d(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    i5cVar.d(e);
                    return;
                }
            case 13:
                j7b j7bVar = (j7b) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                try {
                    DictationAsr.f0((float[]) obj4, (pm3) obj3, j7bVar, zArr2);
                    return;
                } catch (Throwable th) {
                    Log.e("Dictation", "tinyasr: transcription failed", th);
                    hl.c3(new wd3(zArr2, j7bVar, (byte) 15));
                    return;
                }
            case 14:
                DictationAsr.H((String) obj4, (boolean[]) obj3, (s2c) obj2, (pm3) obj);
                return;
            case 15:
                l14 l14Var = (l14) obj4;
                id[] idVarArr = (id[]) obj2;
                TLObject tLObject4 = (TLObject) obj3;
                z8d z8dVar2 = (z8d) obj;
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                idVarArr[0] = null;
                if (tLObject4 instanceof TLRPC.TL_emojiURL) {
                    m01.u(((o14) l14Var.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject4).url);
                    ((nx0) z8dVar2.b).y0.run();
                    return;
                }
                return;
            case 16:
                i24 i24Var = (i24) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj2;
                TLObject tLObject5 = (TLObject) obj3;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList7 = i24Var.s;
                j24 j24Var = i24Var.x;
                if (j24Var.N == i24Var.b) {
                    j24Var.M = 0;
                    if (tL_messages_getStickers.emoticon.equals(i24Var.a)) {
                        if (!(tLObject5 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            return;
                        }
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject5;
                        int size2 = arrayList7.size();
                        int size3 = tL_messages_stickers.stickers.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i20);
                            if (i24Var.w.indexOfKey(document.id) < 0) {
                                arrayList7.add(document);
                            }
                        }
                        if (size2 != arrayList7.size()) {
                            i24Var.f.put(arrayList7, j24Var.O);
                            if (size2 == 0) {
                                i24Var.h.add(arrayList7);
                            }
                        }
                    }
                    runnable.run();
                    return;
                }
                return;
            case 17:
                ic4 ic4Var = (ic4) obj4;
                ArrayList arrayList8 = (ArrayList) obj3;
                long[] jArr = (long[]) obj2;
                countDownLatch = (CountDownLatch) obj;
                ic4Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ic4Var.c();
                for (int i21 = 0; i21 < arrayList8.size(); i21++) {
                    try {
                        ((r47) arrayList8.get(i21)).K(false);
                    } finally {
                        try {
                            cc4.g(th, true);
                            return;
                        } finally {
                        }
                    }
                }
                jArr[0] = System.currentTimeMillis() - currentTimeMillis;
                return;
            case 18:
                ic4 ic4Var2 = (ic4) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                LongSparseArray longSparseArray = (LongSparseArray) obj2;
                countDownLatch = (CountDownLatch) obj;
                ic4Var2.getClass();
                try {
                    ic4Var2.c();
                    ?? obj5 = new Object();
                    for (int i22 = 0; i22 < arrayList9.size(); i22++) {
                        hc4 e2 = ic4Var2.e(((v51) arrayList9.get(i22)).a, obj5);
                        if (e2 != null) {
                            long j3 = e2.a;
                            if (j3 != 0) {
                                ArrayList arrayList10 = (ArrayList) longSparseArray.get(j3);
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                    longSparseArray.put(e2.a, arrayList10);
                                }
                                v51 v51Var = (v51) arrayList9.get(i22);
                                if (e2.c == 23) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                v51Var.d = z4;
                                arrayList10.add((v51) arrayList9.get(i22));
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
                ((xc4) obj4).s((String) obj3, (String) obj2, (n5b) obj, null, true, false);
                return;
            case 20:
                a();
                return;
            case 21:
                ((uj3) obj4).Q4(((Integer) obj3).intValue());
                hl.d3(new se4((rx1) obj2, (e) obj, (byte) 10), 200L);
                return;
            case 22:
                e eVar = (e) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l01 l01Var = (l01) obj3;
                id idVar2 = (id) obj;
                if (eVar != null && tL_error2 != null) {
                    d31.b0(eVar).g0(tL_error2, false);
                }
                if ((eVar instanceof zu1) && tL_error2 == null) {
                    ((zu1) eVar).Dc();
                }
                l01Var.c(false);
                idVar2.dismiss();
                return;
            case 23:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj2;
                b bVar = (b) obj;
                ((c35) obj3).close();
                c.P("disable backup: fail!");
                wallettransaction.pending = false;
                wallettransaction.failed = true;
                bVar.k();
                bVar.i();
                bVar.g();
                ((c) obj4).a0();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                n55 n55Var = (n55) obj4;
                c51 c51Var = (c51) obj3;
                int[] iArr3 = (int[]) obj2;
                c51 c51Var2 = (c51) obj;
                boolean a2 = n55Var.a();
                if (iArr3[0] == 2) {
                    i7 = 2131742621;
                } else {
                    i7 = 2131742819;
                }
                c51Var.setText(ob6.M0(i7, null));
                if (!a2 && !n55Var.d && ((i8 = iArr3[0]) == 1 || i8 == 2)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                c51Var.setEnabled(z5);
                c51Var2.setEnabled((a2 || n55Var.d) ? false : false);
                return;
        }
    }

    public ao1(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
        this.e = obj4;
    }
}
