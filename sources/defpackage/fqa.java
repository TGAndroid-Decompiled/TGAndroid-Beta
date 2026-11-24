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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class fqa implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public fqa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
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
        d S;
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
                final wsa wsaVar = (wsa) obj6;
                TLObject tLObject = (TLObject) obj5;
                final CharSequence charSequence = (CharSequence) obj4;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                wsaVar.getClass();
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
                    LinearLayout linearLayout = new LinearLayout(wsaVar.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
                    TextView b2 = jxe.b(wsaVar.getContext(), 16.0f, cmb.i5, false, null);
                    b2.setText(jb6.M0(2131749974, null));
                    linearLayout.addView(b2, qoe.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    mhb mhbVar = new mhb(wsaVar.getContext(), wsaVar.J0);
                    khb a = mhbVar.a(charSequence);
                    a.setFilled(true);
                    xna xnaVar = (xna) a.getChildAt(0);
                    xnaVar.setTextSize(1, 12.0f);
                    xnaVar.setGravity(17);
                    linearLayout.addView(mhbVar, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wsaVar.J0, wsaVar.getContext());
                    alertDialog$Builder.a.S = jb6.M0(2131749973, null);
                    alertDialog$Builder.n(linearLayout);
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    final long j2 = j;
                    alertDialog$Builder.j(nxa.T0(jb6.a0(null, null, 2131749975, Integer.valueOf((int) j))), new ee() {
                        @Override
                        public final void r(he heVar, int i2) {
                            wsa wsaVar2 = wsa.this;
                            wsaVar2.getClass();
                            k11 g = heVar.g(-1, true, true);
                            g.d();
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
                            ConnectionsManager.getInstance(wsaVar2.a).sendRequest(tL_payments_sendStarsForm, new ii3(wsaVar2, g, heVar, tL_starGiftUnique, j2, charSequence));
                        }
                    });
                    alertDialog$Builder.o();
                    return;
                } else if (tL_error != null) {
                    wsaVar.j().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                wsa wsaVar2 = (wsa) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                yw4[] yw4VarArr = (yw4[]) obj4;
                Long l = (Long) obj3;
                hw9 hw9Var = (hw9) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    oc7.r1(wsaVar2.a).d4(tL_users_userFull.users, false);
                    oc7.r1(wsaVar2.a).X3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        b10.u(jb6.a0(null, null, 2131743429, pg3.s(l.longValue())), new c41(yw4VarArr[0].c, wsaVar2.J0), 2131624012, 36);
                        return;
                    } else {
                        hw9Var.run();
                        return;
                    }
                }
                u31 Z = wsaVar2.j().Z(tL_error2);
                Z.u = true;
                Z.j();
                return;
            case 2:
                jva jvaVar = (jva) obj6;
                List list = (List) obj5;
                lf2 lf2Var = (lf2) obj4;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj3;
                fj0 fj0Var = (fj0) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    gm.c3(new rta(lf2Var, (byte) 0));
                    return;
                }
                ln8 ln8Var = (ln8) list.get(0);
                if (ln8Var.a() == null) {
                    gm.c3(new rta(lf2Var, (byte) 1));
                    return;
                }
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                ConnectionsManager.getInstance(jvaVar.a).sendRequest(tL_payments_canPurchaseStore, new ko0(ln8Var, fj0Var, (jac) lf2Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list, (byte) 3));
                return;
            case 3:
                ((boolean[]) obj5)[0] = true;
                ((jva) obj6).X((k47) obj4, (TLRPC.InputInvoice) obj3, (TLRPC.TL_payments_paymentFormStars) obj2, new h72((qac) obj, (byte) 5));
                return;
            case 4:
                jva jvaVar2 = (jva) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                k47 k47Var = (k47) obj4;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) obj3;
                fo1 fo1Var = (fo1) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    jvaVar2.W(k47Var, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject3, fo1Var, null);
                    fo1Var = fo1Var;
                } else {
                    if (tL_error3 == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error3.text;
                    }
                    jva.c(str);
                }
                fo1Var.run();
                return;
            case 5:
                jva jvaVar3 = (jva) obj6;
                Runnable runnable = (Runnable) obj5;
                k47 k47Var2 = (k47) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) obj2;
                qac qacVar = (qac) obj;
                if (!jvaVar3.e) {
                    jva.c("NO_BALANCE");
                    runnable.run();
                    return;
                }
                jvaVar3.W(k47Var2, inputInvoice, tL_payments_paymentFormStars, runnable, qacVar);
                return;
            case 6:
                yua yuaVar = (yua) obj6;
                TLObject tLObject4 = (TLObject) obj5;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj4;
                ava avaVar = (ava) obj3;
                qac qacVar2 = (qac) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                long j3 = yuaVar.b;
                int i2 = yuaVar.a;
                HashMap hashMap = yuaVar.h;
                ArrayList arrayList2 = yuaVar.e;
                yuaVar.k = false;
                if (tLObject4 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject4;
                    arrayList2.remove(tL_starGiftCollection);
                    arrayList2.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i3 = tL_starGiftCollection2.collection_id;
                    avaVar.d = i3;
                    hashMap.put(Integer.valueOf(i3), avaVar);
                    yuaVar.j();
                    nm7.f(i2).k(234, Long.valueOf(j3), yuaVar);
                    qacVar2.a(tL_starGiftCollection2);
                    return;
                }
                if (tL_error4 != null && (S = LaunchActivity.S()) != null) {
                    c41.b0(S).g0(tL_error4, false);
                }
                arrayList2.remove(tL_starGiftCollection);
                hashMap.remove(-1);
                yuaVar.j();
                nm7.f(i2).k(234, Long.valueOf(j3), yuaVar);
                return;
            case 7:
                x2b x2bVar = (x2b) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                int[] iArr = (int[]) obj;
                if ((tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) && (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) != null) {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    x2bVar.E0(textView, editTextBoldCursor.getText().toString(), true);
                } else {
                    z = false;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), gm.L(4.0f), 0, 0);
                if (!z) {
                    editTextBoldCursor.setText("");
                }
                iArr[0] = 2;
                return;
            case 8:
                z3b z3bVar = (z3b) obj6;
                ArrayList arrayList3 = (ArrayList) obj5;
                HashSet hashSet = (HashSet) obj;
                StringBuilder sb = new StringBuilder("StoriesList ");
                sb.append((int) z3bVar.e);
                sb.append("{");
                sb.append(z3bVar.d);
                sb.append("} preloadCache {");
                sb.append(h4b.k0(arrayList3));
                hg9.r("}", sb);
                ArrayList arrayList4 = z3bVar.g;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj4);
                z3bVar.t = false;
                int i4 = z3bVar.c;
                oc7.r1(i4).d4((ArrayList) obj3, true);
                oc7.r1(i4).X3((ArrayList) obj2, true);
                if (z3bVar.v) {
                    z3bVar.v = false;
                    z3bVar.y = null;
                    z3bVar.j();
                    return;
                }
                z3bVar.m.addAll(hashSet);
                z3bVar.k.clear();
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    z3bVar.t((k47) arrayList3.get(i5), true);
                }
                z3bVar.d(false);
                y3b y3bVar = z3bVar.y;
                if (y3bVar != null) {
                    y3bVar.a(0);
                    z3bVar.y = null;
                }
                nm7.f(i4).k(331, z3bVar);
                return;
            case 9:
                ((WalletEngine2) obj6).lambda$prepareTonConnectTransferPair$8((byte[]) obj5, (v45) obj4, (String) obj3, (v45) obj2, (jac) obj);
                return;
            case 10:
                ((WalletEngine2) obj6).lambda$prepareSendNFT$29((String) obj5, (String) obj4, (String) obj3, (byte[]) obj2, (jac) obj);
                return;
            default:
                TLObject tLObject6 = (TLObject) obj5;
                oc7 oc7Var = (oc7) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                guc gucVar = (guc) obj2;
                z52 z52Var = (z52) obj;
                ((int[]) obj6)[0] = 0;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    oc7Var.d4(tL_contacts_resolvedPeer.users, false);
                    oc7Var.X3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User W1 = oc7Var.W1(Long.valueOf(pg3.n(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = W1;
                    if (W1 != null) {
                        gucVar.run();
                        return;
                    }
                }
                z52Var.a(null);
                return;
        }
    }
}
