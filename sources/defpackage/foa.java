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
public final class foa implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public foa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
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
                final vqa vqaVar = (vqa) obj6;
                TLObject tLObject = (TLObject) obj5;
                final CharSequence charSequence = (CharSequence) obj4;
                final TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
                final TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                vqaVar.getClass();
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
                    LinearLayout linearLayout = new LinearLayout(vqaVar.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
                    TextView b2 = hve.b(vqaVar.getContext(), 16.0f, bkb.i5, false, null);
                    b2.setText(k96.M0(2131750025, null));
                    linearLayout.addView(b2, nme.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                    mfb mfbVar = new mfb(vqaVar.getContext(), vqaVar.J0);
                    kfb a = mfbVar.a(charSequence);
                    a.setFilled(true);
                    wla wlaVar = (wla) a.getChildAt(0);
                    wlaVar.setTextSize(1, 12.0f);
                    wlaVar.setGravity(17);
                    linearLayout.addView(mfbVar, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vqaVar.J0, vqaVar.getContext());
                    alertDialog$Builder.a.S = k96.M0(2131750024, null);
                    alertDialog$Builder.n(linearLayout);
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    final long j2 = j;
                    alertDialog$Builder.j(jva.S0(k96.a0(null, null, 2131750026, Integer.valueOf((int) j))), new ed() {
                        @Override
                        public final void u(hd hdVar, int i2) {
                            vqa vqaVar2 = vqa.this;
                            vqaVar2.getClass();
                            c01 g = hdVar.g(-1, true, true);
                            g.d();
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
                            ConnectionsManager.getInstance(vqaVar2.a).sendRequest(tL_payments_sendStarsForm, new wg3(vqaVar2, g, hdVar, tL_starGiftUnique, j2, charSequence));
                        }
                    });
                    alertDialog$Builder.o();
                    return;
                } else if (tL_error != null) {
                    vqaVar.j().g0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                vqa vqaVar2 = (vqa) obj6;
                TLObject tLObject2 = (TLObject) obj5;
                xu4[] xu4VarArr = (xu4[]) obj4;
                Long l = (Long) obj3;
                q3a q3aVar = (q3a) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    na7.q1(vqaVar2.a).a4(tL_users_userFull.users, false);
                    na7.q1(vqaVar2.a).U3(tL_users_userFull.chats, false);
                    TLRPC.UserFull userFull = tL_users_userFull.full_user;
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        b00.u(k96.a0(null, null, 2131743503, cf3.s(l.longValue())), new u21(xu4VarArr[0].c, vqaVar2.J0), 2131624012, 36);
                        return;
                    } else {
                        q3aVar.run();
                        return;
                    }
                }
                m21 Z = vqaVar2.j().Z(tL_error2);
                Z.t = true;
                Z.j();
                return;
            case 2:
                gta gtaVar = (gta) obj6;
                List list = (List) obj5;
                ae2 ae2Var = (ae2) obj4;
                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = (TLRPC.TL_inputStorePaymentStarsGiveaway) obj3;
                fi0 fi0Var = (fi0) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    gl.d3(new qra(ae2Var, (byte) 0));
                    return;
                }
                kl8 kl8Var = (kl8) list.get(0);
                if (kl8Var.a() == null) {
                    gl.d3(new qra(ae2Var, (byte) 1));
                    return;
                }
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentStarsGiveaway;
                ConnectionsManager.getInstance(gtaVar.a).sendRequest(tL_payments_canPurchaseStore, new kn0(kl8Var, fi0Var, (i8c) ae2Var, activity, (TLRPC.InputStorePaymentPurpose) tL_inputStorePaymentStarsGiveaway, list, (byte) 3));
                return;
            case 3:
                ((boolean[]) obj5)[0] = true;
                ((gta) obj6).X((k27) obj4, (TLRPC.InputInvoice) obj3, (TLRPC.TL_payments_paymentFormStars) obj2, new w52((p8c) obj, (byte) 5));
                return;
            case 4:
                gta gtaVar2 = (gta) obj6;
                TLObject tLObject3 = (TLObject) obj5;
                k27 k27Var = (k27) obj4;
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) obj3;
                hq1 hq1Var = (hq1) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TLRPC.TL_payments_paymentFormStars) {
                    gtaVar2.W(k27Var, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject3, hq1Var, null);
                    hq1Var = hq1Var;
                } else {
                    if (tL_error3 == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error3.text;
                    }
                    gta.c(str);
                }
                hq1Var.run();
                return;
            case 5:
                gta gtaVar3 = (gta) obj6;
                Runnable runnable = (Runnable) obj5;
                k27 k27Var2 = (k27) obj4;
                TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) obj3;
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) obj2;
                p8c p8cVar = (p8c) obj;
                if (!gtaVar3.e) {
                    gta.c("NO_BALANCE");
                    runnable.run();
                    return;
                }
                gtaVar3.W(k27Var2, inputInvoice, tL_payments_paymentFormStars, runnable, p8cVar);
                return;
            case 6:
                wsa wsaVar = (wsa) obj6;
                TLObject tLObject4 = (TLObject) obj5;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj4;
                xsa xsaVar = (xsa) obj3;
                p8c p8cVar2 = (p8c) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                long j3 = wsaVar.b;
                int i2 = wsaVar.a;
                HashMap hashMap = wsaVar.h;
                ArrayList arrayList2 = wsaVar.e;
                wsaVar.k = false;
                if (tLObject4 instanceof TL_stars.TL_starGiftCollection) {
                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject4;
                    arrayList2.remove(tL_starGiftCollection);
                    arrayList2.add(tL_starGiftCollection2);
                    hashMap.remove(-1);
                    int i3 = tL_starGiftCollection2.collection_id;
                    xsaVar.d = i3;
                    hashMap.put(Integer.valueOf(i3), xsaVar);
                    wsaVar.j();
                    kk7.f(i2).k(233, Long.valueOf(j3), wsaVar);
                    p8cVar2.a(tL_starGiftCollection2);
                    return;
                }
                if (tL_error4 != null && (S = LaunchActivity.S()) != null) {
                    u21.b0(S).g0(tL_error4, false);
                }
                arrayList2.remove(tL_starGiftCollection);
                hashMap.remove(-1);
                wsaVar.j();
                kk7.f(i2).k(233, Long.valueOf(j3), wsaVar);
                return;
            case 7:
                u0b u0bVar = (u0b) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                int[] iArr = (int[]) obj;
                if ((tLObject5 instanceof TLRPC.TL_stickers_suggestedShortName) && (str2 = ((TLRPC.TL_stickers_suggestedShortName) tLObject5).short_name) != null) {
                    editTextBoldCursor.setText(str2);
                    editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                    u0bVar.E0(textView, editTextBoldCursor.getText().toString(), true);
                } else {
                    z = false;
                }
                textView2.setVisibility(0);
                editTextBoldCursor.setPadding(textView2.getMeasuredWidth(), gl.L(4.0f), 0, 0);
                if (!z) {
                    editTextBoldCursor.setText("");
                }
                iArr[0] = 2;
                return;
            case 8:
                y1b y1bVar = (y1b) obj6;
                ArrayList arrayList3 = (ArrayList) obj5;
                HashSet hashSet = (HashSet) obj;
                StringBuilder sb = new StringBuilder("StoriesList ");
                sb.append((int) y1bVar.e);
                sb.append("{");
                sb.append(y1bVar.d);
                sb.append("} preloadCache {");
                sb.append(g2b.k0(arrayList3));
                de9.s("}", sb);
                ArrayList arrayList4 = y1bVar.g;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj4);
                y1bVar.t = false;
                int i4 = y1bVar.c;
                na7.q1(i4).a4((ArrayList) obj3, true);
                na7.q1(i4).U3((ArrayList) obj2, true);
                if (y1bVar.v) {
                    y1bVar.v = false;
                    y1bVar.y = null;
                    y1bVar.j();
                    return;
                }
                y1bVar.m.addAll(hashSet);
                y1bVar.k.clear();
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    y1bVar.t((k27) arrayList3.get(i5), true);
                }
                y1bVar.d(false);
                x1b x1bVar = y1bVar.y;
                if (x1bVar != null) {
                    x1bVar.a(0);
                    y1bVar.y = null;
                }
                kk7.f(i4).k(329, y1bVar);
                return;
            case 9:
                ((WalletEngine2) obj6).lambda$prepareTonConnectTransferPair$8((byte[]) obj5, (v25) obj4, (String) obj3, (v25) obj2, (i8c) obj);
                return;
            case 10:
                ((WalletEngine2) obj6).lambda$prepareSendNFT$29((String) obj5, (String) obj4, (String) obj3, (byte[]) obj2, (i8c) obj);
                return;
            default:
                TLObject tLObject6 = (TLObject) obj5;
                na7 na7Var = (na7) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                dsc dscVar = (dsc) obj2;
                o42 o42Var = (o42) obj;
                ((int[]) obj6)[0] = 0;
                if (tLObject6 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject6;
                    na7Var.a4(tL_contacts_resolvedPeer.users, false);
                    na7Var.U3(tL_contacts_resolvedPeer.chats, false);
                    TLRPC.User V1 = na7Var.V1(Long.valueOf(cf3.n(tL_contacts_resolvedPeer.peer)));
                    userArr[0] = V1;
                    if (V1 != null) {
                        dscVar.run();
                        return;
                    }
                }
                o42Var.a(null);
                return;
        }
    }
}
