package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class uwa implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public uwa(WalletEngine2 walletEngine2, AtomicBoolean atomicBoolean, icc iccVar, TL_wallet.walletTransaction wallettransaction, String str) {
        this.a = (byte) 9;
        this.b = walletEngine2;
        this.d = atomicBoolean;
        this.c = iccVar;
        this.e = wallettransaction;
        this.f = str;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        ku9 ku9Var = null;
        int i = 0;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                List list = (List) obj5;
                icc iccVar = (icc) obj4;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) obj3;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    cc4.b("StarsController.buy queryProductDetails done: no products");
                    hl.c3(new g25(iccVar, (byte) 4));
                    return;
                }
                wo8 wo8Var = (wo8) list.get(0);
                to8 a = wo8Var.a();
                if (a == null) {
                    cc4.b("StarsController.buy queryProductDetails done: no details");
                    hl.c3(new g25(iccVar, (byte) 5));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a.c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, di0.h().g(tL_starsTopupOption.currency)) * (a.b / 1000000.0d));
                di0.h().c(wo8Var.c, new hw(iccVar, (byte) 17));
                di0.h().h = new g25(iccVar, (byte) 6);
                cc4.b("StarsController.buy launchBillingFlow");
                di0 h = di0.h();
                k5 a2 = k5.a(yac.t0);
                qx6 qx6Var = new qx6((byte) 7, false);
                qx6Var.O((wo8) list.get(0));
                h.k(activity, a2, tL_inputStorePaymentStarsTopup, Collections.singletonList(qx6Var.g()));
                return;
            case 1:
                TLObject tLObject = (TLObject) obj3;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj2;
                pcc pccVar = (pcc) obj;
                int i2 = ((jxa) obj5).a;
                ((id) obj4).dismiss();
                if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                    uc7.s1(i2).j4(tL_payments_savedStarGifts.users, false);
                    uc7.s1(i2).c4(tL_payments_savedStarGifts.chats, false);
                    while (i < tL_payments_savedStarGifts.gifts.size()) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(i);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift.saved_id)) {
                            ku9Var = savedStarGift;
                        } else {
                            i++;
                        }
                    }
                }
                pccVar.a(ku9Var);
                return;
            case 2:
                s4b s4bVar = (s4b) obj5;
                String str2 = (String) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TextView textView = (TextView) obj;
                s4bVar.j2 = 0;
                String str3 = s4bVar.i2;
                if (str3 != null && str3.equals(str2)) {
                    if (tL_error == null && (tLObject2 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(ob6.M0(2131748989, null));
                        yob.X(textView, aob.w6, s4bVar.J0);
                        s4bVar.k2 = true;
                        return;
                    }
                    textView.setText(ob6.M0(2131748984, null));
                    yob.X(textView, aob.p7, s4bVar.J0);
                    s4bVar.k2 = false;
                    return;
                }
                return;
            case 3:
                TLObject tLObject3 = (TLObject) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                String str4 = ((TLRPC.TL_messages_getStickers) obj4).emoticon;
                z4b z4bVar = ((y4b) obj5).a;
                if (str4.equals(z4bVar.S)) {
                    z4bVar.P = 0;
                    if (tLObject3 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject3;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        while (i < size2) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i);
                            if (longSparseArray.indexOfKey(document.id) < 0) {
                                arrayList.add(document);
                            }
                            i++;
                        }
                        if (size != arrayList.size()) {
                            z4bVar.J.put(arrayList, z4bVar.S);
                            if (size == 0) {
                                z4bVar.K.add(arrayList);
                            }
                            z4bVar.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                r9b r9bVar = (r9b) obj5;
                TLObject tLObject4 = (TLObject) obj3;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                w9b w9bVar = r9bVar.a0;
                ((id) obj4).dismiss();
                if (tLObject4 instanceof TL_phone.groupCallStreamRtmpUrl) {
                    y13[] y13VarArr = new y13[1];
                    Context context = r9bVar.getContext();
                    int i3 = w9b.X1;
                    int i4 = w9bVar.a;
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject4;
                    if (!w9bVar.F1) {
                        ku9Var = new ku9(r9bVar, y13VarArr, (byte) 14);
                    }
                    y13 y13Var = new y13(context, i4, getgroupcallstreamrtmpurl, groupcallstreamrtmpurl, ku9Var, new x53());
                    y13VarArr[0] = y13Var;
                    y13Var.show();
                    return;
                } else if (tL_error2 != null) {
                    ex0 ex0Var = w9bVar.c;
                    int i5 = w9b.X1;
                    new d31(ex0Var, w9bVar.J0).g0(tL_error2, true);
                    return;
                } else {
                    return;
                }
            case 5:
                ueb uebVar = (ueb) obj5;
                TLObject tLObject5 = (TLObject) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                        v21 I = d31.b0(S).I(2131624034, ob6.M0(2131746585, null), ob6.M0(2131746584, null));
                        I.j = 5000;
                        I.j();
                        return;
                    }
                    if (userFull != null) {
                        int i6 = userFull.flags2;
                        if (tL_birthday == null) {
                            userFull.flags2 = i6 & (-33);
                        } else {
                            userFull.flags2 = i6 | 32;
                        }
                        userFull.birthday = tL_birthday;
                        kf7.a0(uebVar.a).l2(userFull, false);
                    }
                    if (tL_error3 != null && (str = tL_error3.text) != null && str.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uebVar.b.getContext());
                        String M0 = ob6.M0(2131746581, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = ob6.M0(2131746582, null);
                        c00.u(null, 2131747558, alertDialog$Builder, null);
                        return;
                    }
                    bs2.v(null, 2131743534, d31.b0(S), 2131624012, 36);
                    return;
                }
                return;
            case 6:
                ((ksb) obj5).e((ViewGroup) obj4, (vnb) obj3, (tl0) obj2, (fbb) obj);
                return;
            case 7:
                l1c l1cVar = (l1c) obj5;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj3;
                fu5 fu5Var = (fu5) obj2;
                fu5 fu5Var2 = (fu5) obj;
                zu1 zu1Var = l1cVar.s;
                if (((uc7) obj4).p2(l1cVar.f, tL_forumTopic.id, null)) {
                    fu5Var.u();
                    ip7.n(l1cVar.e).G(l1cVar.f, tL_forumTopic.id, false);
                    if (d31.a(zu1Var)) {
                        d31.z(zu1Var, 4, 0, l1cVar.h).j();
                        return;
                    }
                    return;
                }
                fu5Var.L(fu5Var2);
                return;
            case 8:
                a5c a5cVar = (a5c) obj5;
                r47 r47Var = (r47) obj4;
                String str5 = (String) obj3;
                v11 v11Var = (v11) obj2;
                r47Var.k.originalLanguage = str5;
                a5cVar.getMessagesStorage().Z1(v11Var.a, r47Var.k);
                a5cVar.L.remove(v11Var);
                ((zo2) obj).a(str5);
                return;
            case 9:
                ((WalletEngine2) obj5).lambda$emulateSendNFT$22((AtomicBoolean) obj3, (icc) obj4, (TL_wallet.walletTransaction) obj2, (String) obj);
                return;
            case 10:
                ((WalletEngine2) obj5).lambda$prepareSend$52((kcc) obj4, (TL_wallet.sendTransfer) obj3, (String) obj2, (String) obj);
                return;
            default:
                boolean[] zArr = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                ir8 ir8Var = (ir8) obj3;
                String str6 = (String) obj2;
                hu0 hu0Var = (hu0) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    boolean z = f11.a;
                    webView.onPause();
                    webView.destroy();
                    hl.B2(webView);
                    hl.B2(ir8Var);
                    try {
                        ku9Var = new JSONObject(str6);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    hu0Var.a(ku9Var);
                    return;
                }
                return;
        }
    }

    public uwa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
