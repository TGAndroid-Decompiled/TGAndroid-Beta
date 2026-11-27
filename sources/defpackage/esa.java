package defpackage;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.webrtc.VideoSource;
public final class esa implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public esa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public final void run() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        String str;
        e S;
        String str2;
        byte b = this.a;
        boolean z = true;
        Object obj = this.d;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                final wua wuaVar = (wua) obj6;
                TLObject tLObject = (TLObject) obj5;
                final CharSequence charSequence = (CharSequence) obj4;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                wuaVar.getClass();
                if (tLObject instanceof TLRPC.PaymentForm) {
                    final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
                    int size = arrayList.size();
                    long j = 0;
                    int i = 0;
                    while (i < size) {
                        TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                        i++;
                        j += tL_labeledPrice.amount;
                    }
                    LinearLayout linearLayout = new LinearLayout(wuaVar.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
                    TextView b2 = zze.b(wuaVar.getContext(), 16.0f, aob.j5, false, null);
                    b2.setText(ob6.M0(2131749999, null));
                    linearLayout.addView(b2, tre.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    hjb hjbVar = new hjb(wuaVar.getContext(), wuaVar.J0);
                    fjb a = hjbVar.a(charSequence);
                    a.setFilled(true);
                    tpa tpaVar = (tpa) a.getChildAt(0);
                    tpaVar.setTextSize(1, 12.0f);
                    tpaVar.setGravity(17);
                    linearLayout.addView(hjbVar, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wuaVar.J0, wuaVar.getContext());
                    alertDialog$Builder.a.S = ob6.M0(2131749998, null);
                    alertDialog$Builder.n(linearLayout);
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    final long j2 = j;
                    alertDialog$Builder.j(nza.T0(ob6.a0(null, null, 2131750000, Integer.valueOf((int) j))), new fd() {
                        @Override
                        public final void w(id idVar, int i2) {
                            wua wuaVar2 = wua.this;
                            wuaVar2.getClass();
                            l01 g = idVar.g(-1, true, true);
                            g.d();
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
                            ConnectionsManager.getInstance(wuaVar2.a).sendRequest(tL_payments_sendStarsForm, new qh3(wuaVar2, g, idVar, tL_starGiftUnique, j2, charSequence));
                        }
                    });
                    alertDialog$Builder.o();
                    return;
                } else if (tL_error != null) {
                    wuaVar.j().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                wua wuaVar2 = (wua) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                bx4[] bx4VarArr = (bx4[]) obj4;
                Long l = (Long) obj3;
                jr9 jr9Var = (jr9) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    uc7.s1(wuaVar2.a).j4(tL_users_userFull.users, false);
                    uc7.s1(wuaVar2.a).c4(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        c00.v(ob6.a0(null, null, 2131743397, wf3.s(l.longValue())), new d31(bx4VarArr[0].c, wuaVar2.J0), 2131624012, 36);
                        return;
                    } else {
                        jr9Var.run();
                        return;
                    }
                }
                v21 Z = wuaVar2.j().Z(tL_error2);
                Z.u = true;
                Z.j();
                return;
            case 2:
                jxa jxaVar = (jxa) obj6;
                List list = (List) obj5;
                qe2 qe2Var = (qe2) obj4;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj3;
                gi0 gi0Var = (gi0) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    hl.c3(new cwa(qe2Var, (byte) 0));
                    return;
                }
                wo8 wo8Var = (wo8) list.get(0);
                if (wo8Var.a() == null) {
                    hl.c3(new cwa(qe2Var, (byte) 1));
                    return;
                }
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                ConnectionsManager.getInstance(jxaVar.a).sendRequest(tL_payments_canPurchaseStore, new mn0(wo8Var, gi0Var, (icc) qe2Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list, (byte) 4));
                return;
            case 3:
                ((boolean[]) obj5)[0] = true;
                ((jxa) obj6).Y((r47) obj4, (TLRPC.InputInvoice) obj3, (TLRPC.TL_payments_paymentFormStars) obj2, new m62((pcc) obj, (byte) 5));
                return;
            case 4:
                jxa jxaVar2 = (jxa) obj6;
                Runnable runnable = (Runnable) obj5;
                r47 r47Var = (r47) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) obj2;
                pcc pccVar = (pcc) obj;
                if (!jxaVar2.e) {
                    jxa.c("NO_BALANCE");
                    runnable.run();
                    return;
                }
                jxaVar2.X(r47Var, inputInvoice, tL_payments_paymentFormStars, runnable, pccVar);
                return;
            case 5:
                jxa jxaVar3 = (jxa) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                r47 r47Var2 = (r47) obj4;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) obj3;
                go1 go1Var = (go1) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    jxaVar3.X(r47Var2, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject3, go1Var, null);
                } else {
                    if (tL_error3 == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error3.text;
                    }
                    jxa.c(str);
                }
                go1Var.run();
                return;
            case 6:
                zwa zwaVar = (zwa) obj6;
                TLObject tLObject4 = (TLObject) obj5;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj4;
                axa axaVar = (axa) obj3;
                pcc pccVar2 = (pcc) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                long j3 = zwaVar.b;
                int i2 = zwaVar.a;
                HashMap hashMap = zwaVar.h;
                ArrayList arrayList2 = zwaVar.e;
                zwaVar.k = false;
                if (tLObject4 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject4;
                    arrayList2.remove(tL_starGiftCollection);
                    arrayList2.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i3 = tL_starGiftCollection2.collection_id;
                    axaVar.d = i3;
                    hashMap.put(Integer.valueOf(i3), axaVar);
                    zwaVar.j();
                    jn7.f(i2).k(234, Long.valueOf(j3), zwaVar);
                    pccVar2.a(tL_starGiftCollection2);
                    return;
                }
                if (tL_error4 != null && (S = LaunchActivity.S()) != null) {
                    d31.b0(S).g0(tL_error4, false);
                }
                arrayList2.remove(tL_starGiftCollection);
                hashMap.remove(-1);
                zwaVar.j();
                jn7.f(i2).k(234, Long.valueOf(j3), zwaVar);
                return;
            case 7:
                s4b s4bVar = (s4b) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                int[] iArr = (int[]) obj;
                if ((tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) && (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) != null) {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    s4bVar.F0(textView, editTextBoldCursor.getText().toString(), true);
                } else {
                    z = false;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), hl.L(4.0f), 0, 0);
                if (!z) {
                    editTextBoldCursor.setText("");
                }
                iArr[0] = 2;
                return;
            case 8:
                v5b v5bVar = (v5b) obj6;
                ArrayList arrayList3 = (ArrayList) obj5;
                HashSet hashSet = (HashSet) obj;
                StringBuilder sb = new StringBuilder("StoriesList ");
                sb.append((int) v5bVar.e);
                sb.append("{");
                sb.append(v5bVar.d);
                sb.append("} preloadCache {");
                sb.append(c6b.k0(arrayList3));
                uh9.s("}", sb);
                ArrayList arrayList4 = v5bVar.g;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj4);
                v5bVar.t = false;
                int i4 = v5bVar.c;
                uc7.s1(i4).j4((ArrayList) obj3, true);
                uc7.s1(i4).c4((ArrayList) obj2, true);
                if (v5bVar.v) {
                    v5bVar.v = false;
                    v5bVar.y = null;
                    v5bVar.j();
                    return;
                }
                v5bVar.m.addAll(hashSet);
                v5bVar.k.clear();
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    v5bVar.t((r47) arrayList3.get(i5), true);
                }
                v5bVar.d(false);
                u5b u5bVar = v5bVar.y;
                if (u5bVar != null) {
                    u5bVar.a(0);
                    v5bVar.y = null;
                }
                jn7.f(i4).k(330, v5bVar);
                return;
            case 9:
                ((VideoSource) obj6).lambda$adaptOutputFormat$0((VideoSource.AspectRatio) obj5, (Integer) obj4, (VideoSource.AspectRatio) obj3, (Integer) obj2, (Integer) obj);
                return;
            case 10:
                ((WalletEngine2) obj6).lambda$prepareTonConnectTransferPair$8((byte[]) obj5, (z45) obj4, (String) obj3, (z45) obj2, (icc) obj);
                return;
            case 11:
                ((WalletEngine2) obj6).lambda$prepareSendNFT$29((String) obj5, (String) obj4, (String) obj3, (byte[]) obj2, (icc) obj);
                return;
            default:
                TLObject tLObject6 = (TLObject) obj5;
                uc7 uc7Var = (uc7) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                twc twcVar = (twc) obj2;
                e52 e52Var = (e52) obj;
                ((int[]) obj6)[0] = 0;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    uc7Var.j4(tL_contacts_resolvedPeer.users, false);
                    uc7Var.c4(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User X1 = uc7Var.X1(Long.valueOf(wf3.n(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = X1;
                    if (X1 != null) {
                        twcVar.run();
                        return;
                    }
                }
                e52Var.a(null);
                return;
        }
    }
}
