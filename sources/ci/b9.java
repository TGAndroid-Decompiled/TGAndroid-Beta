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
public final class b9 implements Runnable {
    public final int f4398a;
    public final Object f4399b;
    public final Object f4400c;

    public b9(int i10, Object obj, Object obj2) {
        this.f4398a = i10;
        this.f4399b = obj;
        this.f4400c = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10 = 2;
        switch (this.f4398a) {
            case 0:
                ia iaVar = (ia) this.f4399b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f4400c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b9(1, iaVar, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 1:
                ia iaVar2 = (ia) this.f4399b;
                HashMap hashMap = (HashMap) this.f4400c;
                if (iaVar2.P == null) {
                    iaVar2.P = new HashMap();
                }
                iaVar2.P.putAll(hashMap);
                return;
            case 2:
                d dVar = (d) this.f4399b;
                Runnable runnable = (Runnable) this.f4400c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                xc xcVar = (xc) this.f4399b;
                Bitmap bitmap = (Bitmap) this.f4400c;
                if (xcVar.f5795k && !xcVar.f5793i) {
                    xcVar.d.add(new wc(xcVar, bitmap));
                    xcVar.f5795k = false;
                    xcVar.f5798n.invalidate();
                    return;
                }
                return;
            case 4:
                int[] iArr = (int[]) this.f4399b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f4400c;
                int i11 = iArr[0];
                if (i11 != 0) {
                    connectionsManager.cancelRequest(i11, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f4399b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4400c;
                a4.m mVar = FirebaseMessaging.f7266l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 6:
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.f4399b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f4400c;
                try {
                    taskCompletionSource2.setResult(oVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 7:
                v0.f fVar = (v0.f) this.f4400c;
                v0.i iVar = ((d1.e) this.f4399b).f7409f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 8:
                ((v0.i) this.f4399b).onError((w0.d) this.f4400c);
                return;
            case 9:
                ((v0.i) this.f4399b).onResult((v0.f) this.f4400c);
                return;
            case 10:
                v0.c cVar = (v0.c) this.f4400c;
                v0.i iVar2 = ((e1.d) this.f4399b).f7868f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                e2.c cVar2 = (e2.c) this.f4399b;
                Object apply = ((i2.v) this.f4400c).apply(cVar2.f7885f);
                cVar2.f7885f = apply;
                e2.b bVar = new e2.b(cVar2, apply, 1);
                e2.z zVar = (e2.z) cVar2.f7884c;
                if (zVar.f7942a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar);
                    return;
                }
                return;
            case 12:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f4400c).registerReceiver(new androidx.mediarouter.app.g((e2.u) this.f4399b, 2), intentFilter);
                return;
            case 13:
                Context context = (Context) this.f4400c;
                e2.u uVar = (e2.u) ((androidx.mediarouter.app.g) this.f4399b).f2726b;
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
                        e2.s.a(context, uVar);
                        return;
                    } else {
                        uVar.c(i10);
                        return;
                    }
                }
                i10 = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                uVar.c(i10);
                return;
            case 14:
                i9.w wVar = (i9.w) this.f4400c;
                if (((i9.c0) this.f4399b).f11049a instanceof i9.a) {
                    wVar.cancel(false);
                    return;
                }
                return;
            case 15:
                ei.l lVar = (ei.l) this.f4399b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f4400c;
                if (userFull != null) {
                    lVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.W = true;
                        lVar.Y = lVar.F0();
                        lVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.H0(true);
                return;
            case 16:
                ei.k3 k3Var = (ei.k3) this.f4399b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f4400c;
                k3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    k3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 17:
                ei.k3 k3Var2 = (ei.k3) this.f4399b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4400c;
                if (!k3Var2.f8430c0) {
                    if (tL_error != null) {
                        k3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(k3Var2.f8450t0, 60000L);
                        return;
                    }
                }
                return;
            case 18:
                ei.k3 k3Var3 = (ei.k3) this.f4399b;
                org.telegram.ui.Components.qc Q = new org.telegram.ui.Components.xc(k3Var3.f8444p0, k3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f4400c));
                Q.f27550j = 5000;
                Q.k(true);
                return;
            case 19:
                ei.e4 e4Var = (ei.e4) this.f4399b;
                e4Var.getMessagesController().openApp((TLRPC.User) this.f4400c, e4Var.getClassGuid());
                return;
            case 20:
                ei.e4 e4Var2 = (ei.e4) this.f4399b;
                e4Var2.getClass();
                e4Var2.presentFragment(zn.R9(((TL_payments.connectedBotStarRef) this.f4400c).bot_id));
                return;
            case 21:
                ei.q4 q4Var = (ei.q4) this.f4399b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f4400c;
                if (!q4Var.T) {
                    if (tL_error2 != null) {
                        q4Var.f26688b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(q4Var.U, 60000L);
                        return;
                    }
                }
                return;
            case 22:
                ei.q4 q4Var2 = (ei.q4) this.f4399b;
                org.telegram.ui.Components.qc Q2 = new org.telegram.ui.Components.xc(q4Var2.f26688b.getContainer(), q4Var2.f26687a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f4400c));
                Q2.f27550j = 5000;
                Q2.k(true);
                return;
            case 23:
                fi.s sVar = (fi.s) this.f4399b;
                sVar.getClass();
                sVar.presentFragment(zn.R9(((gi.f) this.f4400c).f10027b.f18443id));
                return;
            case 24:
                ((fi.k0) this.f4399b).f9129s.presentFragment(zn.R9(((gi.f) this.f4400c).f10027b.f18443id));
                return;
            case 25:
                gg.c cVar3 = (gg.c) this.f4399b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f4400c);
                int i12 = cVar3.G;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar3.v;
                cVar3.v = null;
                cVar3.H(cVar3.f9682w, location, false);
                return;
            case 26:
                gg.i0 i0Var = (gg.i0) this.f4399b;
                TLObject tLObject = (TLObject) this.f4400c;
                int i13 = i0Var.f9783s0;
                ArrayList arrayList = i0Var.K;
                i0Var.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        i0Var.l();
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i13).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    i0Var.l();
                    return;
                } else {
                    return;
                }
            case 27:
                gg.i0 i0Var2 = (gg.i0) this.f4399b;
                View view = (View) this.f4400c;
                i0Var2.m0 = false;
                i0Var2.f9777o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 28:
                gg.i0 i0Var3 = (gg.i0) this.f4399b;
                StringBuilder sb2 = (StringBuilder) this.f4400c;
                i0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(i0Var3.f9783s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                gg.u1 u1Var = (gg.u1) this.f4399b;
                String str = (String) this.f4400c;
                u1Var.I = str;
                if (u1Var.f9949r) {
                    u1Var.f9947f.g(str, true, false, u1Var.f9950s, u1Var.v, u1Var.f9952x, u1Var.f9951w, -1, 1);
                }
                int i14 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i14).contacts);
                u1Var.f9953y = true;
                int i15 = u1Var.F;
                u1Var.F = i15 + 1;
                u1Var.E = i15;
                u1Var.l();
                Utilities.searchQueue.postRunnable(new ei.x4(u1Var, str, i15, arrayList2, i14, 1));
                return;
        }
    }
}
