package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.p;
public final class vua implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public vua(x2b x2bVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        this.a = (byte) 1;
        this.d = x2bVar;
        this.e = str;
        this.b = tL_error;
        this.c = tLObject;
        this.f = textView;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        p pVar = null;
        JSONObject jSONObject = null;
        ts9 ts9Var = null;
        Object obj = this.f;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                jva jvaVar = (jva) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                lf2 lf2Var = (lf2) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error != null) {
                    lf2Var.a(Boolean.FALSE, tL_error.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    oc7.r1(jvaVar.a).d4(paymentForm.users, false);
                    pVar = new p(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    pVar = new p((TLRPC.PaymentReceipt) tLObject);
                }
                if (pVar != null) {
                    pVar.a1 = new yf9(lf2Var, (byte) 29);
                    d Q = LaunchActivity.Q();
                    if (Q != 0) {
                        if (gm.s1(Q)) {
                            ?? obj6 = new Object();
                            obj6.a = true;
                            Q.showAsSheet(pVar, obj6);
                            return;
                        }
                        Q.presentFragment(pVar);
                        return;
                    }
                    return;
                }
                lf2Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 1:
                x2b x2bVar = (x2b) obj5;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TextView textView = (TextView) obj;
                x2bVar.j2 = 0;
                String str3 = x2bVar.i2;
                if (str3 != null && str3.equals(str2)) {
                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(jb6.M0(2131748992, null));
                        anb.X(textView, cmb.v6, x2bVar.J0);
                        x2bVar.k2 = true;
                        return;
                    }
                    textView.setText(jb6.M0(2131748987, null));
                    anb.X(textView, cmb.o7, x2bVar.J0);
                    x2bVar.k2 = false;
                    return;
                }
                return;
            case 2:
                TLObject tLObject3 = (TLObject) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                String str4 = ((TLRPC.TL_messages_getStickers) obj4).emoticon;
                e3b e3bVar = ((d3b) obj5).a;
                if (str4.equals(e3bVar.S)) {
                    e3bVar.P = 0;
                    if (tLObject3 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i = 0; i < size2; i++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i);
                            if (longSparseArray.indexOfKey(document.id) < 0) {
                                arrayList.add(document);
                            }
                        }
                        if (size != arrayList.size()) {
                            e3bVar.J.put(arrayList, e3bVar.S);
                            if (size == 0) {
                                e3bVar.K.add(arrayList);
                            }
                            e3bVar.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                v7b v7bVar = (v7b) obj5;
                TLObject tLObject4 = (TLObject) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                a8b a8bVar = v7bVar.a0;
                ((he) obj3).dismiss();
                if (tLObject4 instanceof TL_phone.groupCallStreamRtmpUrl) {
                    r23[] r23VarArr = new r23[1];
                    Context context = v7bVar.getContext();
                    int i2 = a8b.X1;
                    int i3 = a8bVar.a;
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject4;
                    if (!a8bVar.F1) {
                        ts9Var = new ts9(v7bVar, r23VarArr, (byte) 15);
                    }
                    r23 r23Var = new r23(context, i3, getgroupcallstreamrtmpurl, groupcallstreamrtmpurl, ts9Var, new r63());
                    r23VarArr[0] = r23Var;
                    r23Var.show();
                    return;
                } else if (tL_error3 != null) {
                    dy0 dy0Var = a8bVar.c;
                    int i4 = a8b.X1;
                    new c41(dy0Var, a8bVar.J0).g0(tL_error3, true);
                    return;
                } else {
                    return;
                }
            case 4:
                ycb ycbVar = (ycb) obj5;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                        u31 I = c41.b0(S).I(2131624034, jb6.M0(2131746591, null), jb6.M0(2131746590, null));
                        I.j = 5000;
                        I.j();
                        return;
                    }
                    if (userFull != null) {
                        int i5 = userFull.flags2;
                        if (tL_birthday == null) {
                            userFull.flags2 = i5 & (-33);
                        } else {
                            userFull.flags2 = i5 | 32;
                        }
                        userFull.birthday = tL_birthday;
                        cf7.Y(ycbVar.a).g2(userFull, false);
                    }
                    if (tL_error4 != null && (str = tL_error4.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ycbVar.b.getContext());
                        String M0 = jb6.M0(2131746587, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131746588, null);
                        b10.t(null, 2131747564, alertDialog$Builder, null);
                        return;
                    }
                    ts2.u(null, 2131743566, c41.b0(S), 2131624012, 36);
                    return;
                }
                return;
            case 5:
                ((lqb) obj5).e((ViewGroup) obj4, (ylb) obj3, (sm0) obj2, (i9b) obj);
                return;
            case 6:
                mzb mzbVar = (mzb) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                bu5 bu5Var = (bu5) obj2;
                bu5 bu5Var2 = (bu5) obj;
                yv1 yv1Var = mzbVar.s;
                if (((oc7) obj4).o2(mzbVar.f, tL_forumTopic.id, null)) {
                    bu5Var.u();
                    lo7.n(mzbVar.e).G(mzbVar.f, tL_forumTopic.id, false);
                    if (c41.a(yv1Var)) {
                        c41.z(yv1Var, 4, 0, mzbVar.h).j();
                        return;
                    }
                    return;
                }
                bu5Var.L(bu5Var2);
                return;
            case 7:
                b3c b3cVar = (b3c) obj5;
                k47 k47Var = (k47) obj4;
                String str5 = (String) obj3;
                u21 u21Var = (u21) obj2;
                k47Var.k.originalLanguage = str5;
                b3cVar.getMessagesStorage().U1(u21Var.a, k47Var.k);
                b3cVar.L.remove(u21Var);
                ((rp2) obj).a(str5);
                return;
            case 8:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$22((AtomicBoolean) obj4, (jac) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 9:
                ((WalletEngine2) obj5).lambda$prepareSend$52((lac) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            default:
                boolean[] zArr = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                ct8 ct8Var = (ct8) obj3;
                String str6 = (String) obj2;
                hv0 hv0Var = (hv0) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    boolean z = e21.a;
                    webView.onPause();
                    webView.destroy();
                    gm.B2(webView);
                    gm.B2(ct8Var);
                    try {
                        jSONObject = new JSONObject(str6);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    hv0Var.a(jSONObject);
                    return;
                }
                return;
        }
    }

    public vua(d3b d3bVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
        this.a = (byte) 2;
        this.d = d3bVar;
        this.b = tL_messages_getStickers;
        this.c = tLObject;
        this.e = arrayList;
        this.f = longSparseArray;
    }

    public vua(v7b v7bVar, he heVar, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.a = (byte) 3;
        this.d = v7bVar;
        this.e = heVar;
        this.c = tLObject;
        this.f = getgroupcallstreamrtmpurl;
        this.b = tL_error;
    }

    public vua(ycb ycbVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = ycbVar;
        this.c = tLObject;
        this.e = userFull;
        this.f = tL_birthday;
        this.b = tL_error;
    }

    public vua(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = obj4;
        this.f = obj5;
    }
}
