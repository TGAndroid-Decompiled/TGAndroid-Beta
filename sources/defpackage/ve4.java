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
public final class ve4 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public ve4(Object obj, Object obj2, byte b) {
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
                qf4 qf4Var = (qf4) obj2;
                me4 me4Var = new me4(qf4Var.r, ((gf4) obj).m);
                me4Var.y = new re4(qf4Var, (byte) 1);
                me4Var.x = new re4(qf4Var, (byte) 2);
                qf4Var.presentFragment(me4Var);
                return;
            case 1:
                qf4 qf4Var2 = (qf4) obj2;
                qf4Var2.h = false;
                qf4Var2.s = false;
                qf4Var2.r.g = qf4Var2.E;
                qf4Var2.l0(true);
                qf4Var2.getNotificationCenter().k(185, new Object[0]);
                ((Runnable) obj).run();
                return;
            case 2:
                qf4 qf4Var3 = (qf4) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = qf4Var3.M;
                qf4Var3.O = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    qf4Var3.getMessagesController().X3(tL_chatlists_exportedInvites.chats, false);
                    qf4Var3.getMessagesController().d4(tL_chatlists_exportedInvites.users, false);
                    arrayList.clear();
                    arrayList.addAll(tL_chatlists_exportedInvites.invites);
                    qf4Var3.C0();
                }
                qf4Var3.N = 0;
                return;
            case 3:
                qf4 qf4Var4 = (qf4) obj2;
                he heVar = (he) obj;
                ub7 ub7Var = qf4Var4.r;
                if (heVar != null) {
                    try {
                        heVar.dismiss();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                qf4Var4.getMessagesController().m4(ub7Var);
                cf7 messagesStorage = qf4Var4.getMessagesStorage();
                messagesStorage.a.c(new q87(messagesStorage, ub7Var, (byte) 22));
                qf4Var4.finishFragment();
                return;
            case 4:
                qf4 qf4Var5 = (qf4) obj2;
                qf4Var5.getClass();
                qf4Var5.s0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                return;
            case 5:
                uf4 uf4Var = (uf4) obj2;
                f6b f6bVar = (f6b) obj;
                uf4Var.a();
                uf4Var.e(f6bVar);
                xf4 xf4Var = uf4Var.K;
                xf4Var.h1 = f6bVar;
                xf4Var.j();
                return;
            case 6:
                ((uf4) obj2).K.f1 = (wf4) obj;
                return;
            case 7:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                filtersSetupActivity.getClass();
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.y) {
                    filtersSetupActivity.y = true;
                    filtersSetupActivity.f0(new eh4(filtersSetupActivity, (byte) 3));
                    return;
                }
                return;
            case 8:
                FiltersSetupActivity filtersSetupActivity2 = ((lh4) obj2).e;
                filtersSetupActivity2.getMessagesController().M0.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().k(185, new Object[0]);
                return;
            case 9:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource.setResult(((FirebaseMessaging) obj2).a());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 10:
                ((rk4) obj2).e(0.0f, 240L, (Runnable) obj);
                return;
            case 11:
                tl4 tl4Var = (tl4) obj2;
                bd8 bd8Var = (bd8) obj;
                vc8 vc8Var = tl4Var.b;
                if (tl4Var.j == bd8Var) {
                    ImageView imageView = tl4Var.l;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        bd8Var.setFirstFrameCallback(new nl4(tl4Var, (byte) 4));
                    }
                    if (vc8Var.W()) {
                        vc8Var.j();
                        return;
                    } else if (!vc8Var.i()) {
                        vc8Var.e(vc8Var.k());
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 12:
                tl4 tl4Var2 = (tl4) obj2;
                qac qacVar = (qac) obj;
                tl4Var2.l();
                bd8 bd8Var2 = tl4Var2.j;
                tl4Var2.j = null;
                if (bd8Var2 != null) {
                    gm.B2(bd8Var2);
                    SurfaceTexture surfaceTexture2 = bd8Var2.a;
                    bd8Var2.a = null;
                    surfaceTexture = surfaceTexture2;
                }
                qacVar.a(surfaceTexture);
                return;
            case 13:
                ((ln4) obj2).u2 = -1;
                ((Runnable) ((Pair) obj).first).run();
                return;
            case 14:
                ((qy1) obj2).a((d) obj);
                return;
            case 15:
                ((ix4) obj2).j().g0((TLRPC.TL_error) obj, false);
                return;
            case 16:
                ox4 ox4Var = (ox4) obj2;
                ox4Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    ox4Var.G.setVisibility(8);
                    return;
                }
                return;
            case 17:
                t15 t15Var = (t15) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i = t15Var.a;
                if (u15.b[i] == t15Var) {
                    if (tLObject2 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                        oc7.r1(i).d4(starsStatus.users, false);
                        oc7.r1(i).X3(starsStatus.chats, false);
                        ArrayList<TL_stars.StarsTransaction> arrayList2 = starsStatus.history;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                TL_stars.StarsTransaction starsTransaction2 = arrayList2.get(i2);
                                i2++;
                                starsTransaction = starsTransaction2;
                                String str2 = t15Var.g;
                                if (str2 != null) {
                                    if (str2.equals(starsTransaction.id)) {
                                    }
                                } else if (starsTransaction != null && starsTransaction.id != null && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment) && (starsAmount = starsTransaction.amount) != null && starsAmount.amount < 0 && starsTransaction.date >= t15Var.d - 120 && !u15.e(i).contains(starsTransaction.id)) {
                                }
                            } else {
                                starsTransaction = null;
                            }
                        }
                        if (starsTransaction != null) {
                            if (t15Var.g == null) {
                                String str3 = starsTransaction.id;
                                t15Var.g = str3;
                                HashSet e3 = u15.e(i);
                                if (e3.add(str3)) {
                                    if (e3.size() > 100) {
                                        Iterator it = e3.iterator();
                                        while (e3.size() > 100 && it.hasNext()) {
                                            if (!((String) it.next()).equals(str3)) {
                                                it.remove();
                                            }
                                        }
                                    }
                                    oc7.r1(i).X3.edit().putStringSet("gram_earnings_wallet_withdraws", new HashSet(e3)).apply();
                                }
                            }
                            jva v = jva.v(i, true);
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
                            nm7.f(i).k(225, new Object[0]);
                            if (!starsTransaction.pending) {
                                t15Var.h = true;
                                jva.v(i, true).L();
                                ku0.g(i).j(z8c.h(i).e(), true);
                                c.C(i).J();
                                d dVar = (d) t15Var.f.get();
                                if (dVar != null && dVar.getParentActivity() != null && LaunchActivity.Q() == dVar) {
                                    long j = t15Var.c;
                                    c41 b0 = c41.b0(dVar);
                                    String a0 = jb6.a0(null, null, 2131749274, c.w(j, false));
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131749273, null));
                                    u15.f(spannableStringBuilder, "⚙", 2131232366, -1);
                                    u15.f(spannableStringBuilder, "💎", 2131231960, cmb.u6);
                                    u31 L = b0.L(2131623990, a0, spannableStringBuilder, jb6.M0(2131747550, null), new ww1(dVar, (byte) 2));
                                    L.j = 5000;
                                    L.j();
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    gm.d3(new p15(t15Var, (byte) 1), 4000L);
                    return;
                }
                return;
            case 18:
                c cVar = (c) obj2;
                c.O("enable backup: ready! getting secret phrase...");
                cVar.E(false, true, false, new lf2(cVar, (qqc) obj, (byte) 19));
                return;
            case 19:
                oc7.r1(((c) obj2).a).T3((TLRPC.Updates) obj, false);
                return;
            case 20:
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
                walletEngine2.emulateRotateKey(new vt4(cVar2, pVar));
                return;
            case 21:
                boolean[] zArr = (boolean[]) obj2;
                z15 z15Var = (z15) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z15Var.run();
                    return;
                }
                return;
            case 22:
                oc7.r1(((w45) obj2).a).T3((TLRPC.Updates) obj, false);
                return;
            case 23:
                j55 j55Var = (j55) obj2;
                mk7 mk7Var = (mk7) obj;
                if (!j55Var.e) {
                    mk7Var.d0 = true;
                    Runnable runnable = j55Var.g;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((g95) obj2).R3;
                for (int i5 = 0; i5 < arrayList5.size(); i5++) {
                    if (((ha5) arrayList5.get(i5)).x != null) {
                        arrayList4.remove(((ha5) arrayList5.get(i5)).x);
                    }
                }
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    rd2 rd2Var = (rd2) arrayList4.get(i6);
                    if (rd2Var.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, rd2Var.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(rd2Var.a, rd2Var.b);
                    }
                }
                return;
            case 25:
                g95 g95Var = (g95) obj2;
                nm7.f(g95Var.n1.a).k(76, 6, ((TLRPC.TL_error) obj).text);
                g95Var.dismiss();
                return;
            case 26:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                return;
            case 27:
                ha5 ha5Var = (ha5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap hashMap = ha5Var.G.h;
                rd2 rd2Var2 = ha5Var.x;
                boolean z = rd2Var2.b;
                TLRPC.GroupCallParticipant groupCallParticipant = rd2Var2.a;
                if (z) {
                    str = groupCallParticipant.presentationEndpoint;
                } else {
                    str = groupCallParticipant.videoEndpoint;
                }
                hashMap.put(str, bitmap);
                return;
            case 28:
                ha5 ha5Var2 = (ha5) obj;
                ((jb5) obj2).getClass();
                ha5Var2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new fa5(ha5Var2, (byte) 4)).setDuration(150L).start();
                return;
            default:
                ((kd5) obj2).g0((TLRPC.TL_error) obj);
                return;
        }
    }
}
