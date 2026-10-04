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
import org.telegram.ui.yn;
public final class x8 implements Runnable {
    public final int f6300a;
    public final Object f6301b;
    public final Object f6302c;

    public x8(int i10, Object obj, Object obj2) {
        this.f6300a = i10;
        this.f6301b = obj;
        this.f6302c = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10 = 2;
        switch (this.f6300a) {
            case 0:
                ea eaVar = (ea) this.f6301b;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f6302c).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new x8(1, eaVar, smallGroupsParticipantsCount));
                    return;
                }
                return;
            case 1:
                ea eaVar2 = (ea) this.f6301b;
                HashMap hashMap = (HashMap) this.f6302c;
                if (eaVar2.P == null) {
                    eaVar2.P = new HashMap();
                }
                eaVar2.P.putAll(hashMap);
                return;
            case 2:
                d dVar = (d) this.f6301b;
                Runnable runnable = (Runnable) this.f6302c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                tc tcVar = (tc) this.f6301b;
                Bitmap bitmap = (Bitmap) this.f6302c;
                if (tcVar.f6033k && !tcVar.f6031i) {
                    tcVar.d.add(new sc(tcVar, bitmap));
                    tcVar.f6033k = false;
                    tcVar.f6036n.invalidate();
                    return;
                }
                return;
            case 4:
                int[] iArr = (int[]) this.f6301b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f6302c;
                int i11 = iArr[0];
                if (i11 != 0) {
                    connectionsManager.cancelRequest(i11, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 5:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f6301b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6302c;
                com.google.firebase.messaging.u uVar = FirebaseMessaging.f7837l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource.setException(e7);
                    return;
                }
            case 6:
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.f6301b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f6302c;
                try {
                    taskCompletionSource2.setResult(oVar.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 7:
                v0.f fVar = (v0.f) this.f6302c;
                v0.i iVar = ((d1.e) this.f6301b).f7996f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 8:
                ((v0.i) this.f6301b).onError((w0.d) this.f6302c);
                return;
            case 9:
                ((v0.i) this.f6301b).onResult((v0.f) this.f6302c);
                return;
            case 10:
                v0.c cVar = (v0.c) this.f6302c;
                v0.i iVar2 = ((e1.d) this.f6301b).f8518f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                e2.c cVar2 = (e2.c) this.f6301b;
                Object apply = ((i2.w) this.f6302c).apply(cVar2.f8536f);
                cVar2.f8536f = apply;
                e2.b bVar = new e2.b(cVar2, apply, 1);
                e2.z zVar = (e2.z) cVar2.f8534c;
                if (zVar.f8599a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar);
                    return;
                }
                return;
            case 12:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f6302c).registerReceiver(new androidx.mediarouter.app.g((e2.u) this.f6301b, 2), intentFilter);
                return;
            case 13:
                Context context = (Context) this.f6302c;
                e2.u uVar2 = (e2.u) ((androidx.mediarouter.app.g) this.f6301b).f2943b;
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
                i9.w wVar = (i9.w) this.f6302c;
                if (((i9.c0) this.f6301b).f12022a instanceof i9.a) {
                    wVar.cancel(false);
                    return;
                }
                return;
            case 15:
                ei.m mVar = (ei.m) this.f6301b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f6302c;
                if (userFull != null) {
                    mVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    mVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        mVar.W = true;
                        mVar.Y = mVar.K0();
                        mVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        mVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = mVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                mVar.M0(true);
                return;
            case 16:
                ei.l3 l3Var = (ei.l3) this.f6301b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f6302c;
                l3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    l3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 17:
                ei.l3 l3Var2 = (ei.l3) this.f6301b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f6302c;
                if (!l3Var2.f9155c0) {
                    if (tL_error != null) {
                        l3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(l3Var2.f9176t0, 60000L);
                        return;
                    }
                }
                return;
            case 18:
                ei.l3 l3Var3 = (ei.l3) this.f6301b;
                org.telegram.ui.Components.rc Q = new org.telegram.ui.Components.yc(l3Var3.f9170p0, l3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f6302c));
                Q.f30345j = 5000;
                Q.k(true);
                return;
            case 19:
                ei.f4 f4Var = (ei.f4) this.f6301b;
                f4Var.getMessagesController().openApp((TLRPC.User) this.f6302c, f4Var.getClassGuid());
                return;
            case 20:
                ei.f4 f4Var2 = (ei.f4) this.f6301b;
                f4Var2.getClass();
                f4Var2.presentFragment(yn.Q9(((TL_payments.connectedBotStarRef) this.f6302c).bot_id));
                return;
            case 21:
                ei.r4 r4Var = (ei.r4) this.f6301b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f6302c;
                if (!r4Var.T) {
                    if (tL_error2 != null) {
                        r4Var.f29648b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(r4Var.U, 60000L);
                        return;
                    }
                }
                return;
            case 22:
                ei.r4 r4Var2 = (ei.r4) this.f6301b;
                org.telegram.ui.Components.rc Q2 = new org.telegram.ui.Components.yc(r4Var2.f29648b.getContainer(), r4Var2.f29647a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f6302c));
                Q2.f30345j = 5000;
                Q2.k(true);
                return;
            case 23:
                fi.s sVar = (fi.s) this.f6301b;
                sVar.getClass();
                sVar.presentFragment(yn.Q9(((gi.f) this.f6302c).f10903b.f20189id));
                return;
            case 24:
                ((fi.k0) this.f6301b).f9921s.presentFragment(yn.Q9(((gi.f) this.f6302c).f10903b.f20189id));
                return;
            case 25:
                gg.c cVar3 = (gg.c) this.f6301b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f6302c);
                int i12 = cVar3.G;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar3.v;
                cVar3.v = null;
                cVar3.H(cVar3.f10524w, location, false);
                return;
            case 26:
                gg.i0 i0Var = (gg.i0) this.f6301b;
                TLObject tLObject = (TLObject) this.f6302c;
                int i13 = i0Var.f10633s0;
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
                gg.i0 i0Var2 = (gg.i0) this.f6301b;
                View view = (View) this.f6302c;
                i0Var2.m0 = false;
                i0Var2.f10627o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 28:
                gg.i0 i0Var3 = (gg.i0) this.f6301b;
                StringBuilder sb2 = (StringBuilder) this.f6302c;
                i0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(i0Var3.f10633s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            default:
                gg.u1 u1Var = (gg.u1) this.f6301b;
                String str = (String) this.f6302c;
                u1Var.I = str;
                if (u1Var.f10815r) {
                    u1Var.f10813f.g(str, true, false, u1Var.f10816s, u1Var.v, u1Var.f10818x, u1Var.f10817w, -1, 1);
                }
                int i14 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i14).contacts);
                u1Var.f10819y = true;
                int i15 = u1Var.F;
                u1Var.F = i15 + 1;
                u1Var.E = i15;
                u1Var.l();
                Utilities.searchQueue.postRunnable(new ei.y4(u1Var, str, i15, arrayList2, i14, 1));
                return;
        }
    }
}
