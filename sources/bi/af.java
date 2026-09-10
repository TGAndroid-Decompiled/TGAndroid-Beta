package bi;

import android.content.Context;
import android.content.IntentFilter;
import android.database.SQLException;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.view.View;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.eo;
public final class af implements Runnable {
    public final int f2346a;
    public final Object f2347b;
    public final Object f2348c;

    public af(int i10, Object obj, Object obj2) {
        this.f2346a = i10;
        this.f2347b = obj;
        this.f2348c = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10 = 2;
        switch (this.f2346a) {
            case 0:
                int[] iArr = (int[]) this.f2347b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f2348c;
                int i11 = iArr[0];
                if (i11 != 0) {
                    connectionsManager.cancelRequest(i11, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 1:
                ((c1.e) this.f2347b).e().onError(((kotlin.jvm.internal.p) this.f2348c).f12576a);
                return;
            case 2:
                ((c1.e) this.f2347b).e().onError((w0.h) this.f2348c);
                return;
            case 3:
                ((c1.e) this.f2347b).e().onResult((v0.o) this.f2348c);
                return;
            case 4:
                c2.d.f4079a = (AudioManager) ((Context) this.f2347b).getSystemService("audio");
                ((e2.g) this.f2348c).e();
                return;
            case 5:
                ca.c cVar = (ca.c) this.f2347b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f2348c;
                try {
                    l5.s.a().d.e(cVar.h.f12811a.b(i5.d.f10479c), 1);
                } catch (SQLException unused) {
                }
                countDownLatch.countDown();
                return;
            case 6:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f2347b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f2348c;
                com.google.firebase.messaging.u uVar = FirebaseMessaging.f6040l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 7:
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.f2347b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f2348c;
                try {
                    taskCompletionSource2.setResult(oVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 8:
                v0.f fVar = (v0.f) this.f2348c;
                v0.i iVar = ((d1.e) this.f2347b).f6183f;
                if (iVar != null) {
                    iVar.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 9:
                di.m mVar = (di.m) this.f2347b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f2348c;
                if (userFull != null) {
                    mVar.W = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    mVar.Y = starrefprogram;
                    if (starrefprogram == null) {
                        mVar.W = true;
                        mVar.Y = mVar.F0();
                        mVar.X = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        mVar.X = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = mVar.Y;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                mVar.H0(true);
                return;
            case 10:
                di.n3 n3Var = (di.n3) this.f2347b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f2348c;
                n3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    n3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 11:
                di.n3 n3Var2 = (di.n3) this.f2347b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f2348c;
                if (!n3Var2.f6787c0) {
                    if (tL_error != null) {
                        n3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(n3Var2.f6807t0, 60000L);
                        return;
                    }
                }
                return;
            case 12:
                di.n3 n3Var3 = (di.n3) this.f2347b;
                org.telegram.ui.Components.pc Q = new org.telegram.ui.Components.wc(n3Var3.f6801p0, n3Var3.E).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f2348c));
                Q.f26081j = 5000;
                Q.k(true);
                return;
            case 13:
                di.h4 h4Var = (di.h4) this.f2347b;
                h4Var.getMessagesController().openApp((TLRPC.User) this.f2348c, h4Var.getClassGuid());
                return;
            case 14:
                di.h4 h4Var2 = (di.h4) this.f2347b;
                h4Var2.getClass();
                h4Var2.presentFragment(eo.R9(((TL_payments.connectedBotStarRef) this.f2348c).bot_id));
                return;
            case 15:
                di.u4 u4Var = (di.u4) this.f2347b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f2348c;
                if (!u4Var.T) {
                    if (tL_error2 != null) {
                        u4Var.f26422b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(u4Var.U, 60000L);
                        return;
                    }
                }
                return;
            case 16:
                di.u4 u4Var2 = (di.u4) this.f2347b;
                org.telegram.ui.Components.pc Q2 = new org.telegram.ui.Components.wc(u4Var2.f26422b.getContainer(), u4Var2.f26421a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f2348c));
                Q2.f26081j = 5000;
                Q2.k(true);
                return;
            case 17:
                ((v0.i) this.f2347b).onError((w0.d) this.f2348c);
                return;
            case 18:
                ((v0.i) this.f2347b).onResult((v0.f) this.f2348c);
                return;
            case 19:
                v0.c cVar2 = (v0.c) this.f2348c;
                v0.i iVar2 = ((e1.d) this.f2347b).f7169f;
                if (iVar2 != null) {
                    iVar2.onResult(cVar2);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 20:
                e2.c cVar3 = (e2.c) this.f2347b;
                Object apply = ((i2.v) this.f2348c).apply(cVar3.f7186f);
                cVar3.f7186f = apply;
                e2.b bVar = new e2.b(cVar3, apply, 1);
                e2.z zVar = (e2.z) cVar3.f7185c;
                if (zVar.f7243a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar);
                    return;
                }
                return;
            case 21:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) this.f2348c).registerReceiver(new androidx.mediarouter.app.g((e2.u) this.f2347b, 2), intentFilter);
                return;
            case 22:
                Context context = (Context) this.f2348c;
                e2.u uVar2 = (e2.u) ((androidx.mediarouter.app.g) this.f2347b).f1418b;
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
                    } catch (SecurityException unused2) {
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
            case 23:
                i9.w wVar = (i9.w) this.f2348c;
                if (((i9.c0) this.f2347b).f10530a instanceof i9.a) {
                    wVar.cancel(false);
                    return;
                }
                return;
            case 24:
                ei.s sVar = (ei.s) this.f2347b;
                sVar.getClass();
                sVar.presentFragment(eo.R9(((fi.f) this.f2348c).f8308b.f17342id));
                return;
            case 25:
                ((ei.k0) this.f2347b).f7574s.presentFragment(eo.R9(((fi.f) this.f2348c).f8308b.f17342id));
                return;
            case 26:
                fg.c cVar4 = (fg.c) this.f2347b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f2348c);
                int i12 = cVar4.G;
                MessagesController.getInstance(i12).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i12).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar4.v;
                cVar4.v = null;
                cVar4.H(cVar4.f7965w, location, false);
                return;
            case 27:
                fg.h0 h0Var = (fg.h0) this.f2347b;
                TLObject tLObject = (TLObject) this.f2348c;
                int i13 = h0Var.f8050s0;
                ArrayList arrayList = h0Var.K;
                h0Var.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        h0Var.l();
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i13).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    h0Var.l();
                    return;
                } else {
                    return;
                }
            case 28:
                fg.h0 h0Var2 = (fg.h0) this.f2347b;
                View view = (View) this.f2348c;
                h0Var2.m0 = false;
                h0Var2.f8044o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                fg.h0 h0Var3 = (fg.h0) this.f2347b;
                StringBuilder sb2 = (StringBuilder) this.f2348c;
                h0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(h0Var3.f8050s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
