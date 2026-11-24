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
public final class tsa implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public tsa(u0b u0bVar, String str, TLRPC.TL_error tL_error, TLObject tLObject, TextView textView) {
        this.a = (byte) 1;
        this.d = u0bVar;
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
        nu9 nu9Var = null;
        Object obj = this.f;
        Object obj2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                gta gtaVar = (gta) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                ae2 ae2Var = (ae2) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj;
                if (tL_error != null) {
                    ae2Var.a(Boolean.FALSE, tL_error.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    na7.q1(gtaVar.a).a4(paymentForm.users, false);
                    pVar = new p(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    pVar = new p((TLRPC.PaymentReceipt) tLObject);
                }
                if (pVar != null) {
                    pVar.a1 = new wh9(ae2Var, (byte) 25);
                    d Q = LaunchActivity.Q();
                    if (Q != 0) {
                        if (gl.s1(Q)) {
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
                ae2Var.a(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 1:
                u0b u0bVar = (u0b) obj5;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj2;
                TextView textView = (TextView) obj;
                u0bVar.j2 = 0;
                String str3 = u0bVar.i2;
                if (str3 != null && str3.equals(str2)) {
                    if (tL_error2 == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(k96.M0(2131749043, null));
                        zkb.X(textView, bkb.v6, u0bVar.J0);
                        u0bVar.k2 = true;
                        return;
                    }
                    textView.setText(k96.M0(2131749038, null));
                    zkb.X(textView, bkb.o7, u0bVar.J0);
                    u0bVar.k2 = false;
                    return;
                }
                return;
            case 2:
                TLObject tLObject3 = (TLObject) obj2;
                ArrayList arrayList = (ArrayList) obj3;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                String str4 = ((TLRPC.TL_messages_getStickers) obj4).emoticon;
                c1b c1bVar = ((b1b) obj5).a;
                if (str4.equals(c1bVar.S)) {
                    c1bVar.P = 0;
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
                            c1bVar.J.put(arrayList, c1bVar.S);
                            if (size == 0) {
                                c1bVar.K.add(arrayList);
                            }
                            c1bVar.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                t5b t5bVar = (t5b) obj5;
                TLObject tLObject4 = (TLObject) obj2;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                y5b y5bVar = t5bVar.a0;
                ((hd) obj3).dismiss();
                if (tLObject4 instanceof TL_phone.groupCallStreamRtmpUrl) {
                    f13[] f13VarArr = new f13[1];
                    Context context = t5bVar.getContext();
                    int i2 = y5b.X1;
                    int i3 = y5bVar.a;
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject4;
                    if (!y5bVar.F1) {
                        nu9Var = new nu9(t5bVar, f13VarArr, (byte) 14);
                    }
                    f13 f13Var = new f13(context, i3, getgroupcallstreamrtmpurl, groupcallstreamrtmpurl, nu9Var, new f53());
                    f13VarArr[0] = f13Var;
                    f13Var.show();
                    return;
                } else if (tL_error3 != null) {
                    ww0 ww0Var = y5bVar.c;
                    int i4 = y5b.X1;
                    new u21(ww0Var, y5bVar.J0).g0(tL_error3, true);
                    return;
                } else {
                    return;
                }
            case 4:
                xab xabVar = (xab) obj5;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                d S = LaunchActivity.S();
                if (S != null) {
                    if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                        m21 I = u21.b0(S).I(2131624034, k96.M0(2131746665, null), k96.M0(2131746664, null));
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
                        ad7.Y(xabVar.a).g2(userFull, false);
                    }
                    if (tL_error4 != null && (str = tL_error4.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xabVar.b.getContext());
                        String M0 = k96.M0(2131746661, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131746662, null);
                        b00.t(null, 2131747638, alertDialog$Builder, null);
                        return;
                    }
                    ir2.v(null, 2131743640, u21.b0(S), 2131624012, 36);
                    return;
                }
                return;
            case 5:
                ((kob) obj5).e((ViewGroup) obj4, (wjb) obj3, (sl0) obj2, (g7b) obj);
                return;
            case 6:
                kxb kxbVar = (kxb) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                cs5 cs5Var = (cs5) obj2;
                cs5 cs5Var2 = (cs5) obj;
                mu1 mu1Var = kxbVar.s;
                if (((na7) obj4).n2(kxbVar.f, tL_forumTopic.id, null)) {
                    cs5Var.u();
                    im7.n(kxbVar.e).G(kxbVar.f, tL_forumTopic.id, false);
                    if (u21.a(mu1Var)) {
                        u21.z(mu1Var, 4, 0, kxbVar.h).j();
                        return;
                    }
                    return;
                }
                cs5Var.L(cs5Var2);
                return;
            case 7:
                b1c b1cVar = (b1c) obj5;
                k27 k27Var = (k27) obj4;
                String str5 = (String) obj3;
                m11 m11Var = (m11) obj2;
                k27Var.k.originalLanguage = str5;
                b1cVar.getMessagesStorage().U1(m11Var.a, k27Var.k);
                b1cVar.L.remove(m11Var);
                ((go2) obj).a(str5);
                return;
            case 8:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$22((AtomicBoolean) obj4, (i8c) obj3, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 9:
                ((WalletEngine2) obj5).lambda$prepareSend$52((k8c) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            default:
                boolean[] zArr = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                ar8 ar8Var = (ar8) obj3;
                String str6 = (String) obj2;
                yt0 yt0Var = (yt0) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    boolean z = w01.a;
                    webView.onPause();
                    webView.destroy();
                    gl.B2(webView);
                    gl.B2(ar8Var);
                    try {
                        jSONObject = new JSONObject(str6);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    yt0Var.a(jSONObject);
                    return;
                }
                return;
        }
    }

    public tsa(b1b b1bVar, TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
        this.a = (byte) 2;
        this.d = b1bVar;
        this.b = tL_messages_getStickers;
        this.c = tLObject;
        this.e = arrayList;
        this.f = longSparseArray;
    }

    public tsa(t5b t5bVar, hd hdVar, TLObject tLObject, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, TLRPC.TL_error tL_error) {
        this.a = (byte) 3;
        this.d = t5bVar;
        this.e = hdVar;
        this.c = tLObject;
        this.f = getgroupcallstreamrtmpurl;
        this.b = tL_error;
    }

    public tsa(xab xabVar, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        this.a = (byte) 4;
        this.d = xabVar;
        this.c = tLObject;
        this.e = userFull;
        this.f = tL_birthday;
        this.b = tL_error;
    }

    public tsa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = obj4;
        this.f = obj5;
    }
}
