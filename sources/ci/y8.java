package ci;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.zn;
public final class y8 implements Runnable {
    public final int f6357a;
    public final Object f6358b;
    public final Object f6359c;

    public y8(int i10, Object obj, Object obj2) {
        this.f6357a = i10;
        this.f6358b = obj;
        this.f6359c = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10 = 2;
        switch (this.f6357a) {
            case 0:
                fa faVar = (fa) this.f6358b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f6359c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new y8(1, faVar, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 1:
                fa faVar2 = (fa) this.f6358b;
                HashMap hashMap = (HashMap) this.f6359c;
                if (faVar2.P == null) {
                    faVar2.P = new HashMap();
                }
                faVar2.P.putAll(hashMap);
                return;
            case 2:
                d dVar = (d) this.f6358b;
                Runnable runnable = (Runnable) this.f6359c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                uc ucVar = (uc) this.f6358b;
                Bitmap bitmap = (Bitmap) this.f6359c;
                if (ucVar.f6114k && !ucVar.f6112i) {
                    ucVar.d.add(new tc(ucVar, bitmap));
                    ucVar.f6114k = false;
                    ucVar.f6117n.invalidate();
                    return;
                }
                return;
            case 4:
                int[] iArr = (int[]) this.f6358b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f6359c;
                int i11 = iArr[0];
                if (i11 != 0) {
                    connectionsManager.cancelRequest(i11, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6358b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6359c;
                com.google.firebase.messaging.u uVar = FirebaseMessaging.f7886l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 6:
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.f6358b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f6359c;
                try {
                    taskCompletionSource2.setResult(oVar.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 7:
                v0.f fVar = (v0.f) this.f6359c;
                v0.i iVar = ((d1.e) this.f6358b).f8045f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 8:
                ((v0.i) this.f6358b).onError((w0.d) this.f6359c);
                return;
            case 9:
                ((v0.i) this.f6358b).onResult((v0.f) this.f6359c);
                return;
            case 10:
                v0.c cVar = (v0.c) this.f6359c;
                v0.i iVar2 = ((e1.d) this.f6358b).f8511f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                e2.c cVar2 = (e2.c) this.f6358b;
                Object apply = ((i2.w) this.f6359c).apply(cVar2.f8530f);
                cVar2.f8530f = apply;
                e2.b bVar = new e2.b(cVar2, apply, 1);
                e2.z zVar = (e2.z) cVar2.f8528c;
                if (zVar.f8593a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar);
                    return;
                }
                return;
            case 12:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f6359c).registerReceiver(new androidx.mediarouter.app.g((e2.u) this.f6358b, 2), intentFilter);
                return;
            case 13:
                Context context = (Context) this.f6359c;
                e2.u uVar2 = (e2.u) ((androidx.mediarouter.app.g) this.f6358b).f3022b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i10 = type != 9 ? 8 : 7;
                                        }
                                        i10 = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && i10 == 5) {
                        e2.s.a(context, uVar2);
                        return;
                    } else {
                        uVar2.c(i10);
                        return;
                    }
                }
                i10 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                uVar2.c(i10);
                return;
            case 14:
                i9.w wVar = (i9.w) this.f6359c;
                if (((i9.c0) this.f6358b).f12072a instanceof i9.a) {
                    wVar.cancel(false);
                    return;
                }
                return;
            case 15:
                ei.l lVar = (ei.l) this.f6358b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f6359c;
                if (userFull != null) {
                    lVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.W = true;
                        lVar.Y = lVar.G0();
                        lVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.I0(true);
                return;
            case 16:
                ei.k3 k3Var = (ei.k3) this.f6358b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f6359c;
                k3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    k3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 17:
                ei.k3 k3Var2 = (ei.k3) this.f6358b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6359c;
                if (!k3Var2.f9157c0) {
                    if (tL_error != null) {
                        k3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(k3Var2.f9178t0, 60000L);
                        return;
                    }
                }
                return;
            case 18:
                ei.k3 k3Var3 = (ei.k3) this.f6358b;
                org.telegram.ui.Components.tc Q = new org.telegram.ui.Components.ad(k3Var3.f9172p0, k3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f6359c));
                Q.f31096j = 5000;
                Q.k(true);
                return;
            case 19:
                ei.e4 e4Var = (ei.e4) this.f6358b;
                e4Var.getMessagesController().openApp((TLRPC.User) this.f6359c, e4Var.getClassGuid());
                return;
            case 20:
                ei.e4 e4Var2 = (ei.e4) this.f6358b;
                e4Var2.getClass();
                e4Var2.presentFragment(zn.W9(((TL_payments.connectedBotStarRef) this.f6359c).bot_id));
                return;
            case 21:
                ei.p4 p4Var = (ei.p4) this.f6358b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f6359c;
                if (!p4Var.T) {
                    if (tL_error2 != null) {
                        p4Var.f30211b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(p4Var.U, 60000L);
                        return;
                    }
                }
                return;
            case 22:
                ei.p4 p4Var2 = (ei.p4) this.f6358b;
                org.telegram.ui.Components.tc Q2 = new org.telegram.ui.Components.ad(p4Var2.f30211b.getContainer(), p4Var2.f30210a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f6359c));
                Q2.f31096j = 5000;
                Q2.k(true);
                return;
            case 23:
                fi.s sVar = (fi.s) this.f6358b;
                sVar.getClass();
                sVar.presentFragment(zn.W9(((gi.f) this.f6359c).f10908b.f20189id));
                return;
            case 24:
                ((fi.k0) this.f6358b).f9996s.presentFragment(zn.W9(((gi.f) this.f6359c).f10908b.f20189id));
                return;
            case 25:
                gg.c cVar3 = (gg.c) this.f6358b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f6359c);
                int i12 = cVar3.G;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar3.v;
                cVar3.v = null;
                cVar3.H(cVar3.f10554w, location, false);
                return;
            case 26:
                gg.h0 h0Var = (gg.h0) this.f6358b;
                View view = (View) this.f6359c;
                h0Var.m0 = false;
                h0Var.f10632o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 27:
                gg.h0 h0Var2 = (gg.h0) this.f6358b;
                TLObject tLObject = (TLObject) this.f6359c;
                int i13 = h0Var2.f10638s0;
                ArrayList arrayList = h0Var2.K;
                h0Var2.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        h0Var2.l();
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i13).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var2.l();
                    return;
                } else {
                    return;
                }
            case 28:
                gg.h0 h0Var3 = (gg.h0) this.f6358b;
                StringBuilder sb2 = (StringBuilder) this.f6359c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(h0Var3.f10638s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            default:
                gg.t1 t1Var = (gg.t1) this.f6358b;
                String str = (String) this.f6359c;
                t1Var.I = str;
                if (t1Var.f10817r) {
                    t1Var.f10815f.g(str, true, false, t1Var.f10818s, t1Var.v, t1Var.f10820x, t1Var.f10819w, -1, 1);
                }
                int i14 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i14).contacts);
                t1Var.f10821y = true;
                int i15 = t1Var.F;
                t1Var.F = i15 + 1;
                t1Var.E = i15;
                t1Var.l();
                Utilities.searchQueue.postRunnable(new ei.w4(t1Var, str, i15, arrayList2, i14, 1));
                return;
        }
    }
}
