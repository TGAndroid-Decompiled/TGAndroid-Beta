package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.widget.ImageView;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class se4 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public se4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        TL_stars.StarsTransaction starsTransaction;
        TL_stars.StarsAmount starsAmount;
        String str;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        byte b = this.a;
        SurfaceTexture surfaceTexture = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nf4 nf4Var = (nf4) obj2;
                nf4Var.getClass();
                nf4Var.r0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 1:
                rf4 rf4Var = (rf4) obj2;
                b8b b8bVar = (b8b) obj;
                rf4Var.a();
                rf4Var.e(b8bVar);
                uf4 uf4Var = rf4Var.K;
                uf4Var.h1 = b8bVar;
                uf4Var.j();
                return;
            case 2:
                ((rf4) obj2).K.f1 = (tf4) obj;
                return;
            case 3:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.e0(new bh4(filtersSetupActivity, (byte) 3));
                    return;
                }
                return;
            case 4:
                FiltersSetupActivity filtersSetupActivity2 = ((ih4) obj2).e;
                filtersSetupActivity2.getMessagesController().M0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(185, new Object[0]);
                return;
            case 5:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource.setResult(((FirebaseMessaging) obj2).a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                ((rk4) obj2).e(0.0f, 240L, (Runnable) obj);
                return;
            case 7:
                xl4 xl4Var = (xl4) obj2;
                ne8 ne8Var = (ne8) obj;
                je8 je8Var = xl4Var.b;
                if (xl4Var.l == ne8Var) {
                    ImageView imageView = xl4Var.n;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        ne8Var.setFirstFrameCallback(new nl4(xl4Var, (byte) 4));
                    }
                    if (je8Var.Y()) {
                        je8Var.j();
                        return;
                    } else if (!je8Var.i()) {
                        je8Var.g(je8Var.k());
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                xl4 xl4Var2 = (xl4) obj2;
                pcc pccVar = (pcc) obj;
                xl4Var2.m();
                ne8 ne8Var2 = xl4Var2.l;
                xl4Var2.l = null;
                if (ne8Var2 != null) {
                    hl.B2(ne8Var2);
                    SurfaceTexture surfaceTexture2 = ne8Var2.a;
                    ne8Var2.a = null;
                    surfaceTexture = surfaceTexture2;
                }
                pccVar.a(surfaceTexture);
                return;
            case 9:
                ((qn4) obj2).u2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 10:
                ((rx1) obj2).a((e) obj);
                return;
            case 11:
                ((mx4) obj2).j().g0((TLRPC.TL_error) obj, false);
                return;
            case 12:
                sx4 sx4Var = (sx4) obj2;
                sx4Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    sx4Var.G.setVisibility(8);
                    return;
                }
                return;
            case 13:
                y15 y15Var = (y15) obj2;
                TLObject tLObject = (TLObject) obj;
                int i = y15Var.a;
                if (z15.b[i] == y15Var) {
                    if (tLObject instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                        uc7.s1(i).j4(starsStatus.users, false);
                        uc7.s1(i).c4(starsStatus.chats, false);
                        ArrayList<TL_stars.StarsTransaction> arrayList = starsStatus.history;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TL_stars.StarsTransaction starsTransaction2 = arrayList.get(i2);
                                i2++;
                                starsTransaction = starsTransaction2;
                                String str2 = y15Var.g;
                                if (str2 != null) {
                                    if (str2.equals(starsTransaction.id)) {
                                    }
                                } else if (starsTransaction != null && starsTransaction.id != null && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment) && (starsAmount = starsTransaction.amount) != null && starsAmount.amount < 0 && starsTransaction.date >= y15Var.d - 120 && !z15.e(i).contains(starsTransaction.id)) {
                                }
                            } else {
                                starsTransaction = null;
                            }
                        }
                        if (starsTransaction != null) {
                            if (y15Var.g == null) {
                                String str3 = starsTransaction.id;
                                y15Var.g = str3;
                                HashSet e2 = z15.e(i);
                                if (e2.add(str3)) {
                                    if (e2.size() > 100) {
                                        Iterator it = e2.iterator();
                                        while (e2.size() > 100 && it.hasNext()) {
                                            if (!((String) it.next()).equals(str3)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    uc7.s1(i).Y3.edit().putStringSet("gram_earnings_wallet_withdraws", new HashSet(e2)).apply();
                                }
                            }
                            jxa v = jxa.v(i, true);
                            int[] iArr = {0, 2};
                            for (int i3 = 0; i3 < 2; i3++) {
                                ArrayList arrayList2 = v.q[iArr[i3]];
                                int i4 = 0;
                                while (true) {
                                    if (i4 < arrayList2.size()) {
                                        if (starsTransaction.id.equals(((TL_stars.StarsTransaction) arrayList2.get(i4)).id)) {
                                            arrayList2.set(i4, starsTransaction);
                                        } else {
                                            i4++;
                                        }
                                    } else {
                                        arrayList2.add(0, starsTransaction);
                                    }
                                }
                            }
                            jn7.f(i).k(225, new Object[0]);
                            if (!starsTransaction.pending) {
                                y15Var.h = true;
                                jxa.v(i, true).L();
                                kt0.g(i).j(yac.h(i).e(), true);
                                c.C(i).J();
                                e eVar = (e) y15Var.f.get();
                                if (eVar != null && eVar.getParentActivity() != null && LaunchActivity.Q() == eVar) {
                                    long j = y15Var.c;
                                    d31 b0 = d31.b0(eVar);
                                    String a0 = ob6.a0(null, null, 2131749271, c.w(j, false));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131749270, null));
                                    z15.f(spannableStringBuilder, "⚙", 2131232365, -1);
                                    z15.f(spannableStringBuilder, "💎", 2131231959, aob.v6);
                                    v21 L = b0.L(2131623990, a0, spannableStringBuilder, ob6.M0(2131747544, null), new yv1(eVar, (byte) 2));
                                    L.j = 5000;
                                    L.j();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    hl.d3(new u15(y15Var, (byte) 1), 4000L);
                    return;
                }
                return;
            case 14:
                c cVar = (c) obj2;
                c.P("enable backup: ready! getting secret phrase...");
                cVar.E(false, true, false, new qe2(cVar, (btc) obj, (byte) 17));
                return;
            case 15:
                uc7.s1(((c) obj2).a).Y3((TLRPC.Updates) obj, false);
                return;
            case 16:
                c cVar2 = (c) obj2;
                p pVar = (p) obj;
                c.P("emulate disable backup: ready");
                if (cVar2.z() <= 0) {
                    pVar.a(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = cVar2.b;
                if (walletEngine2 == null) {
                    c.m("emulate disable backup: no engine!");
                    pVar.a(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new yt4(cVar2, pVar));
                return;
            case 17:
                boolean[] zArr = (boolean[]) obj2;
                d25 d25Var = (d25) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d25Var.run();
                    return;
                }
                return;
            case 18:
                uc7.s1(((a55) obj2).a).Y3((TLRPC.Updates) obj, false);
                return;
            case 19:
                n55 n55Var = (n55) obj2;
                tk7 tk7Var = (tk7) obj;
                if (!n55Var.e) {
                    tk7Var.d0 = true;
                    Runnable runnable = n55Var.g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = ((j95) obj2).R3;
                for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                    if (((ka5) arrayList4.get(i5)).x != null) {
                        arrayList3.remove(((ka5) arrayList4.get(i5)).x);
                    }
                }
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    wc2 wc2Var = (wc2) arrayList3.get(i6);
                    if (wc2Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, wc2Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(wc2Var.a, wc2Var.b);
                    }
                }
                return;
            case 21:
                j95 j95Var = (j95) obj2;
                jn7.f(j95Var.n1.a).k(76, 6, ((TLRPC.TL_error) obj).text);
                j95Var.dismiss();
                return;
            case 22:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                return;
            case 23:
                ka5 ka5Var = (ka5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap hashMap = ka5Var.G.h;
                wc2 wc2Var2 = ka5Var.x;
                boolean z = wc2Var2.b;
                TLRPC.GroupCallParticipant groupCallParticipant = wc2Var2.a;
                if (z) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 24:
                ka5 ka5Var2 = (ka5) obj;
                ((mb5) obj2).getClass();
                ka5Var2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new ia5(ka5Var2, (byte) 4)).setDuration(150L).start();
                return;
            case 25:
                ((nd5) obj2).f0((TLRPC.TL_error) obj);
                return;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                nd5 nd5Var = ((jd5) obj2).a.h;
                if (tLObject2 != null) {
                    nd5Var.h0((TLRPC.TL_messages_stickerSet) tLObject2);
                    return;
                } else {
                    nd5Var.h0(null);
                    return;
                }
            case 27:
                jd5 jd5Var = (jd5) obj2;
                String str4 = (String) obj;
                kd5 kd5Var = jd5Var.a;
                kd5Var.e = str4;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str4;
                kd5Var.c = kd5Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new mw3(jd5Var, str4, (byte) 10), 66);
                return;
            case 28:
                md5 md5Var = (md5) obj2;
                String str5 = (String) obj;
                md5Var.h = str5;
                nd5 nd5Var2 = md5Var.r;
                if (nd5Var2.O) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                md5Var.n = nd5Var2.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new m65(md5Var, str5, str5, (byte) 1), 66);
                return;
            default:
                ng5 ng5Var = (ng5) ((cm0) obj2).c;
                ArrayList arrayList5 = ng5Var.h;
                arrayList5.clear();
                arrayList5.addAll((ArrayList) obj);
                ng5Var.n = false;
                wa waVar = ng5Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
                    return;
                }
                return;
        }
    }
}
