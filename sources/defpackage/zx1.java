package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
public final class zx1 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final int n;
    public final Object r;
    public final Object s;

    public zx1(zg6 zg6Var, TLObject tLObject, TLRPC.TL_error tL_error, to8 to8Var, int i, wo8 wo8Var, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
        this.a = (byte) 4;
        this.b = zg6Var;
        this.e = tLObject;
        this.d = tL_error;
        this.c = to8Var;
        this.n = i;
        this.s = wo8Var;
        this.f = tL_inputStorePaymentAuthCode;
        this.h = str;
        this.r = tL_payments_canPurchaseStore;
    }

    @Override
    public final void run() {
        jl0 jl0Var;
        char c;
        boolean z;
        pnc pncVar;
        String str;
        boolean z2;
        nnc nncVar;
        ArrayList arrayList;
        ChatActivityEnterView chatActivityEnterView;
        pnc pncVar2;
        c cVar;
        zv4 zv4Var;
        float f;
        float f2;
        jl0 jl0Var2;
        bl0 bl0Var;
        int[] iArr;
        int[] iArr2;
        String H;
        byte b = this.a;
        int i = this.n;
        Object obj = this.r;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.s;
        Object obj5 = this.c;
        Object obj6 = this.d;
        Object obj7 = this.e;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                c cVar2 = (c) obj8;
                ey1 ey1Var = (ey1) obj7;
                FrameLayout frameLayout = (FrameLayout) obj6;
                knc kncVar = (knc) obj5;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                nnc nncVar2 = (nnc) obj;
                cVar2.getClass();
                ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                Context context = chatActivityEnterView2.getContext();
                zu1 zu1Var = chatActivityEnterView2.E3;
                zv4 zv4Var2 = new zv4(context, ey1Var, chatActivityEnterView2.K4, new ay1(cVar2, frameLayout, (byte) 0));
                zv4Var2.c0 = true;
                zv4Var2.a0 = true;
                zv4Var2.M = hl.L(220.0f);
                zv4Var2.L = 0;
                int i2 = ChatActivityEnterView.X7;
                z92 G0 = chatActivityEnterView2.G0();
                ll0 ll0Var = chatActivityEnterView2.K1;
                if (ll0Var != null && G0 != null && (jl0Var2 = G0.r) != null && (bl0Var = jl0Var2.w) != null) {
                    jl0Var = ll0Var.c(zv4Var2, bl0Var, false);
                } else {
                    jl0Var = null;
                }
                zv4Var2.S = jl0Var;
                zv4Var2.W = new h01(zv4Var2, kncVar, (byte) 22);
                zv4Var2.V = new on1(kncVar, frameLayout, ey1Var, (byte) 11);
                kncVar.setLanguageMenuUp(true);
                int J0 = chatActivityEnterView2.J0(aob.G6);
                int L = layoutParams.topMargin - hl.L(28.0f);
                int i3 = 0;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    if (i4 < arrayList3.size() && arrayList3.get(i4) != null) {
                        f2 = 54.0f;
                    } else {
                        f2 = 44.0f;
                    }
                    i3 += hl.L(f2);
                }
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                frameLayout.getLocationInWindow(iArr3);
                chatActivityEnterView2.getLocationInWindow(iArr4);
                int L2 = hl.L(8.0f);
                if (zu1Var != null && zu1Var.getActionBar() != null) {
                    int[] iArr5 = new int[2];
                    zu1Var.getActionBar().getLocationInWindow(iArr5);
                    c = 1;
                    L2 = hl.L(8.0f) + zu1Var.getActionBar().getHeight() + (iArr5[1] - iArr3[1]);
                } else {
                    c = 1;
                }
                int i5 = L2;
                int L3 = (iArr4[c] - iArr3[c]) - hl.L(8.0f);
                int L4 = (L3 - i5) - hl.L(12.0f);
                if (L < hl.L(198.0f) && L4 > L) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    zv4Var2.T = i5;
                    zv4Var2.U = L3;
                }
                int min = Math.min(i3, hl.L(286.0f));
                int L5 = hl.L(44.0f) * 3;
                if (z) {
                    L = L4;
                }
                int min2 = Math.min(min, Math.max(L5, L));
                ScrollView scrollView = new ScrollView(chatActivityEnterView2.getContext());
                scrollView.setPadding(0, hl.L(6.0f), 0, hl.L(6.0f));
                scrollView.setClipToPadding(false);
                scrollView.setVerticalScrollBarEnabled(false);
                scrollView.setOverScrollMode(2);
                scrollView.setOnTouchListener(new q8((byte) 29));
                LinearLayout linearLayout = new LinearLayout(chatActivityEnterView2.getContext());
                linearLayout.setOrientation(1);
                int i6 = 0;
                while (i6 < arrayList2.size()) {
                    if (i6 < arrayList3.size()) {
                        pncVar = (pnc) arrayList3.get(i6);
                    } else {
                        pncVar = null;
                    }
                    Context context2 = chatActivityEnterView2.getContext();
                    CharSequence charSequence = (CharSequence) arrayList2.get(i6);
                    if (pncVar != null) {
                        str = pncVar.a;
                    } else {
                        str = null;
                    }
                    if (i6 == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    k43 k43Var = bn3.J0;
                    l7 l7Var = new l7(context2, charSequence, str, J0, z2);
                    int i7 = J0;
                    FrameLayout frameLayout2 = frameLayout;
                    knc kncVar2 = kncVar;
                    l7Var.setBackground(aob.f0(aob.p1(0.08f, i7), 2, -1));
                    if (pncVar == null) {
                        l7Var.setOnClickListener(new ae(zv4Var2, nncVar2, i6, (byte) 4));
                        c cVar3 = cVar2;
                        nncVar = nncVar2;
                        cVar = cVar3;
                        arrayList = arrayList3;
                        chatActivityEnterView = chatActivityEnterView2;
                        pncVar2 = pncVar;
                        zv4Var = zv4Var2;
                        J0 = i7;
                    } else {
                        J0 = i7;
                        c cVar4 = cVar2;
                        nncVar = nncVar2;
                        arrayList = arrayList3;
                        chatActivityEnterView = chatActivityEnterView2;
                        pncVar2 = pncVar;
                        cVar = cVar4;
                        zv4Var = zv4Var2;
                        l7Var.setOnClickListener(new jf(cVar4, pncVar2, J0, zv4Var2, (byte) 3));
                    }
                    if (pncVar2 != null) {
                        f = 54.0f;
                    } else {
                        f = 44.0f;
                    }
                    linearLayout.addView(l7Var, new LinearLayout.LayoutParams(-1, hl.L(f)));
                    i6++;
                    nnc nncVar3 = nncVar;
                    cVar2 = cVar;
                    nncVar2 = nncVar3;
                    zv4Var2 = zv4Var;
                    chatActivityEnterView2 = chatActivityEnterView;
                    kncVar = kncVar2;
                    arrayList3 = arrayList;
                    frameLayout = frameLayout2;
                }
                FrameLayout frameLayout3 = frameLayout;
                knc kncVar3 = kncVar;
                zv4 zv4Var3 = zv4Var2;
                c cVar5 = cVar2;
                ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                scrollView.addView(linearLayout);
                FrameLayout frameLayout4 = new FrameLayout(chatActivityEnterView3.getContext());
                frameLayout4.addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
                zv4Var3.a(frameLayout4, Math.round(min2 / hl.p) + 12, null);
                frameLayout4.setBackground(null);
                if (frameLayout4.getParent() instanceof View) {
                    ((View) frameLayout4.getParent()).setPadding(0, 0, 0, 0);
                }
                if (i > 0) {
                    scrollView.post(new bt(scrollView, i, min2, (byte) 2));
                }
                chatActivityEnterView3.x6 = zv4Var3;
                zv4Var3.R = new ao1(cVar5, zv4Var3, kncVar3, frameLayout3, (byte) 5);
                frameLayout3.addView(zv4Var3, new FrameLayout.LayoutParams(-1, -1));
                zv4Var3.setFocusableInTouchMode(true);
                zv4Var3.setOnKeyListener(new by1(zv4Var3, (byte) 0));
                zv4Var3.requestFocus();
                zv4Var3.g();
                return;
            case 1:
                c cVar6 = (c) obj8;
                knc kncVar4 = (knc) obj5;
                FrameLayout frameLayout5 = (FrameLayout) obj6;
                ey1 ey1Var2 = (ey1) obj7;
                RectF rectF = (RectF) obj4;
                nnc nncVar4 = (nnc) obj;
                cVar6.getClass();
                kncVar4.getLocationInWindow(new int[2]);
                frameLayout5.getLocationInWindow(new int[2]);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ey1Var2.getLayoutParams();
                layoutParams2.leftMargin = Math.round((rectF.left + iArr[0]) - iArr2[0]);
                layoutParams2.topMargin = Math.round((rectF.top + iArr[1]) - iArr2[1]);
                ey1Var2.setLayoutParams(layoutParams2);
                ey1Var2.post(new zx1(cVar6, ey1Var2, frameLayout5, kncVar4, layoutParams2, (ArrayList) obj3, (ArrayList) obj2, this.n, nncVar4));
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj8;
                TLObject tLObject = (TLObject) obj7;
                int[] iArr6 = (int[]) obj6;
                tg5 tg5Var = (tg5) obj5;
                Integer num = (Integer) obj4;
                Integer num2 = (Integer) obj3;
                Long l = (Long) obj2;
                Integer num3 = (Integer) obj;
                String str2 = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.TL_messages_chats) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        uc7.s1(launchActivity.P).c4(tL_messages_chats.chats, false);
                        iArr6[0] = launchActivity.z0(this.n, tg5Var, num, num2, l, num3, null, tL_messages_chats.chats.get(0), null, null, 0, -1);
                        return;
                    }
                }
                try {
                    tg5Var.run();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                launchActivity.F0(jj.E(launchActivity, ob6.M0(2131751419, null), ob6.M0(2131748649, null)));
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj8;
                tg5 tg5Var2 = (tg5) obj7;
                TLObject tLObject2 = (TLObject) obj6;
                TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) obj5;
                TL_account.getAuthorizationForm getauthorizationform = (TL_account.getAuthorizationForm) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                String str5 = (String) obj;
                String str6 = LaunchActivity.C1;
                try {
                    tg5Var2.run();
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                if (tLObject2 != null) {
                    uc7.s1(i).j4(authorizationform.users, false);
                    launchActivity2.t0(new b18(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str3, str4, str5, authorizationform, (TL_account.Password) tLObject2));
                    return;
                }
                return;
            case 4:
                zg6 zg6Var = (zg6) obj8;
                TLObject tLObject3 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                to8 to8Var = (to8) obj5;
                wo8 wo8Var = (wo8) obj4;
                TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) obj3;
                String str7 = (String) obj2;
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = (TLRPC.TL_payments_canPurchaseStore) obj;
                qh6 qh6Var = zg6Var.w;
                c51 c51Var = zg6Var.b;
                cc4.b("LoginBilling canPurchaseStore returned " + tLObject3 + " " + tL_error);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    c51Var.i(ob6.a0(null, null, 2131745695, to8Var.a), false, true);
                    if (i == 7) {
                        H = ob6.M0(2131745699, null);
                    } else {
                        H = ob6.H(',', "SMSFeePurchaseTextDays", i);
                    }
                    c51Var.g(H, false);
                    c51Var.setLoading(false);
                    c51Var.setOnClickListener(new nh(zg6Var, wo8Var, tL_inputStorePaymentAuthCode, str7, tL_payments_canPurchaseStore, (byte) 9));
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_boolFalse) {
                    zg6Var.e = "RESPONSE_FALSE";
                    new d31(qh6Var.a0, null).H(2131624012, ob6.a0(null, null, 2131743533, "RESPONSE_FALSE"));
                    return;
                } else if (tL_error != null) {
                    zg6Var.e = tL_error.text;
                    new d31(qh6Var.a0, null).g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                jxa jxaVar = (jxa) obj8;
                ((boolean[]) obj7)[0] = true;
                jxaVar.Y((r47) obj6, (TLRPC.InputInvoice) obj5, (TLRPC.TL_payments_paymentFormStars) obj4, new sva(jxaVar, (boolean[]) obj3, this.n, (pcc) obj2, (pcc) obj));
                return;
        }
    }

    public zx1(jxa jxaVar, boolean[] zArr, r47 r47Var, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, boolean[] zArr2, int i, pcc pccVar, pcc pccVar2) {
        this.a = (byte) 5;
        this.b = jxaVar;
        this.e = zArr;
        this.d = r47Var;
        this.c = inputInvoice;
        this.s = tL_payments_paymentFormStars;
        this.f = zArr2;
        this.n = i;
        this.h = pccVar;
        this.r = pccVar2;
    }

    public zx1(c cVar, ey1 ey1Var, FrameLayout frameLayout, knc kncVar, FrameLayout.LayoutParams layoutParams, ArrayList arrayList, ArrayList arrayList2, int i, nnc nncVar) {
        this.a = (byte) 0;
        this.b = cVar;
        this.e = ey1Var;
        this.d = frameLayout;
        this.c = kncVar;
        this.s = layoutParams;
        this.f = arrayList;
        this.h = arrayList2;
        this.n = i;
        this.r = nncVar;
    }

    public zx1(c cVar, knc kncVar, FrameLayout frameLayout, ey1 ey1Var, RectF rectF, ArrayList arrayList, ArrayList arrayList2, int i, nnc nncVar) {
        this.a = (byte) 1;
        this.b = cVar;
        this.c = kncVar;
        this.d = frameLayout;
        this.e = ey1Var;
        this.s = rectF;
        this.f = arrayList;
        this.h = arrayList2;
        this.n = i;
        this.r = nncVar;
    }

    public zx1(LaunchActivity launchActivity, Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = launchActivity;
        this.e = obj;
        this.d = obj2;
        this.n = i;
        this.c = obj3;
        this.s = obj4;
        this.f = obj5;
        this.h = obj6;
        this.r = obj7;
    }
}
