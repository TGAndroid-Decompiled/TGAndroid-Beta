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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class vc4 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public vc4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        TL_stars.StarsTransaction starsTransaction;
        TL_stars.StarsAmount starsAmount;
        String str;
        byte b = this.a;
        SurfaceTexture surfaceTexture = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pd4 pd4Var = (pd4) obj2;
                pd4Var.h = false;
                pd4Var.s = false;
                pd4Var.r.g = pd4Var.E;
                pd4Var.k0(true);
                pd4Var.getNotificationCenter().k(184, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 1:
                pd4 pd4Var2 = (pd4) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = pd4Var2.M;
                pd4Var2.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    pd4Var2.getMessagesController().U3(tL_chatlists_exportedInvites.chats, false);
                    pd4Var2.getMessagesController().a4(tL_chatlists_exportedInvites.users, false);
                    arrayList.clear();
                    arrayList.addAll(tL_chatlists_exportedInvites.invites);
                    pd4Var2.B0();
                }
                pd4Var2.N = 0;
                return;
            case 2:
                pd4 pd4Var3 = (pd4) obj2;
                hd hdVar = (hd) obj;
                t97 t97Var = pd4Var3.r;
                if (hdVar != null) {
                    try {
                        hdVar.dismiss();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                pd4Var3.getMessagesController().j4(t97Var);
                ad7 messagesStorage = pd4Var3.getMessagesStorage();
                messagesStorage.a.c(new t67(messagesStorage, t97Var, (byte) 21));
                pd4Var3.finishFragment();
                return;
            case 3:
                pd4 pd4Var4 = (pd4) obj2;
                pd4Var4.getClass();
                pd4Var4.r0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 4:
                td4 td4Var = (td4) obj2;
                e4b e4bVar = (e4b) obj;
                td4Var.a();
                td4Var.e(e4bVar);
                wd4 wd4Var = td4Var.K;
                wd4Var.h1 = e4bVar;
                wd4Var.j();
                return;
            case 5:
                ((td4) obj2).K.f1 = (vd4) obj;
                return;
            case 6:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.e0(new df4(filtersSetupActivity, (byte) 3));
                    return;
                }
                return;
            case 7:
                FiltersSetupActivity filtersSetupActivity2 = ((kf4) obj2).e;
                filtersSetupActivity2.getMessagesController().M0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(184, new Object[0]);
                return;
            case 8:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource.setResult(((FirebaseMessaging) obj2).a());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 9:
                ((mi4) obj2).e(0.0f, 240L, (Runnable) obj);
                return;
            case 10:
                sj4 sj4Var = (sj4) obj2;
                ya8 ya8Var = (ya8) obj;
                sa8 sa8Var = sj4Var.b;
                if (sj4Var.j == ya8Var) {
                    ImageView imageView = sj4Var.l;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        ya8Var.setFirstFrameCallback(new jj4(sj4Var, (byte) 4));
                    }
                    if (sa8Var.d1()) {
                        sa8Var.k();
                        return;
                    } else if (!sa8Var.j()) {
                        sa8Var.f(sa8Var.m());
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                sj4 sj4Var2 = (sj4) obj2;
                p8c p8cVar = (p8c) obj;
                sj4Var2.l();
                ya8 ya8Var2 = sj4Var2.j;
                sj4Var2.j = null;
                if (ya8Var2 != null) {
                    gl.B2(ya8Var2);
                    SurfaceTexture surfaceTexture2 = ya8Var2.a;
                    ya8Var2.a = null;
                    surfaceTexture = surfaceTexture2;
                }
                p8cVar.a(surfaceTexture);
                return;
            case 12:
                ((ll4) obj2).u2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 13:
                ((pz1) obj2).a((d) obj);
                return;
            case 14:
                ((hv4) obj2).j().g0((TLRPC.TL_error) obj, false);
                return;
            case 15:
                nv4 nv4Var = (nv4) obj2;
                nv4Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    nv4Var.G.setVisibility(8);
                    return;
                }
                return;
            case 16:
                tz4 tz4Var = (tz4) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i = tz4Var.a;
                if (uz4.b[i] == tz4Var) {
                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                        na7.q1(i).a4(starsStatus.users, false);
                        na7.q1(i).U3(starsStatus.chats, false);
                        ArrayList<TL_stars.StarsTransaction> arrayList2 = starsStatus.history;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TL_stars.StarsTransaction starsTransaction2 = arrayList2.get(i2);
                                i2++;
                                starsTransaction = starsTransaction2;
                                String str2 = tz4Var.g;
                                if (str2 != null) {
                                    if (str2.equals(starsTransaction.id)) {
                                    }
                                } else if (starsTransaction != null && starsTransaction.id != null && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment) && (starsAmount = starsTransaction.amount) != null && starsAmount.amount < 0 && starsTransaction.date >= tz4Var.d - 120 && !uz4.e(i).contains(starsTransaction.id)) {
                                }
                            } else {
                                starsTransaction = null;
                            }
                        }
                        if (starsTransaction != null) {
                            if (tz4Var.g == null) {
                                String str3 = starsTransaction.id;
                                tz4Var.g = str3;
                                HashSet e3 = uz4.e(i);
                                if (e3.add(str3)) {
                                    if (e3.size() > 100) {
                                        Iterator it = e3.iterator();
                                        while (e3.size() > 100 && it.hasNext()) {
                                            if (!((String) it.next()).equals(str3)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    na7.q1(i).X3.edit().putStringSet("gram_earnings_wallet_withdraws", new HashSet(e3)).apply();
                                }
                            }
                            gta v = gta.v(i, true);
                            int[] iArr = {0, 2};
                            for (int i3 = 0; i3 < 2; i3++) {
                                ArrayList arrayList3 = v.q[iArr[i3]];
                                int i4 = 0;
                                while (true) {
                                    if (i4 < arrayList3.size()) {
                                        if (starsTransaction.id.equals(((TL_stars.StarsTransaction) arrayList3.get(i4)).id)) {
                                            arrayList3.set(i4, starsTransaction);
                                        } else {
                                            i4++;
                                        }
                                    } else {
                                        arrayList3.add(0, starsTransaction);
                                    }
                                }
                            }
                            kk7.f(i).k(224, new Object[0]);
                            if (!starsTransaction.pending) {
                                tz4Var.h = true;
                                gta.v(i, true).L();
                                ct0.g(i).j(y6c.h(i).e(), true);
                                c.C(i).J();
                                d dVar = (d) tz4Var.f.get();
                                if (dVar != null && dVar.getParentActivity() != null && LaunchActivity.Q() == dVar) {
                                    long j = tz4Var.c;
                                    u21 b0 = u21.b0(dVar);
                                    String a0 = k96.a0(null, null, 2131749325, c.w(j, false));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131749324, null));
                                    uz4.f(spannableStringBuilder, "⚙", 2131232365, -1);
                                    uz4.f(spannableStringBuilder, "💎", 2131231959, bkb.u6);
                                    m21 L = b0.L(2131623990, a0, spannableStringBuilder, k96.M0(2131747624, null), new kv1(dVar, (byte) 2));
                                    L.j = 5000;
                                    L.j();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    gl.e3(new qz4(tz4Var, (byte) 1), 4000L);
                    return;
                }
                return;
            case 17:
                c cVar = (c) obj2;
                c.O("enable backup: ready! getting secret phrase...");
                cVar.E(false, true, false, new ae2(cVar, (ooc) obj, (byte) 17));
                return;
            case 18:
                na7.q1(((c) obj2).a).Q3((TLRPC.Updates) obj, false);
                return;
            case 19:
                c cVar2 = (c) obj2;
                p pVar = (p) obj;
                c.O("emulate disable backup: ready");
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
                walletEngine2.emulateRotateKey(new ur4(cVar2, pVar));
                return;
            case 20:
                boolean[] zArr = (boolean[]) obj2;
                zz4 zz4Var = (zz4) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    zz4Var.run();
                    return;
                }
                return;
            case 21:
                na7.q1(((w25) obj2).a).Q3((TLRPC.Updates) obj, false);
                return;
            case 22:
                j35 j35Var = (j35) obj2;
                ki7 ki7Var = (ki7) obj;
                if (!j35Var.e) {
                    ki7Var.d0 = true;
                    Runnable runnable = j35Var.g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((h75) obj2).R3;
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    if (((h85) arrayList5.get(i5)).x != null) {
                        arrayList4.remove(((h85) arrayList5.get(i5)).x);
                    }
                }
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    gc2 gc2Var = (gc2) arrayList4.get(i6);
                    if (gc2Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, gc2Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(gc2Var.a, gc2Var.b);
                    }
                }
                return;
            case 24:
                h75 h75Var = (h75) obj2;
                kk7.f(h75Var.n1.a).k(75, 6, ((TLRPC.TL_error) obj).text);
                h75Var.dismiss();
                return;
            case 25:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                return;
            case 26:
                h85 h85Var = (h85) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap hashMap = h85Var.G.h;
                gc2 gc2Var2 = h85Var.x;
                boolean z = gc2Var2.b;
                TLRPC.GroupCallParticipant groupCallParticipant = gc2Var2.a;
                if (z) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 27:
                h85 h85Var2 = (h85) obj;
                ((l95) obj2).getClass();
                h85Var2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new f85(h85Var2, (byte) 4)).setDuration(150L).start();
                return;
            case 28:
                ((mb5) obj2).f0((TLRPC.TL_error) obj);
                return;
            default:
                ib5 ib5Var = (ib5) obj2;
                String str4 = (String) obj;
                jb5 jb5Var = ib5Var.a;
                jb5Var.e = str4;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str4;
                jb5Var.c = jb5Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new rv3(ib5Var, str4, (byte) 10), 66);
                return;
        }
    }
}
