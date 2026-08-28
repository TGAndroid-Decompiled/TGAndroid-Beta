package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Location;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.d31;
import org.telegram.ui.qn;
public final class o8 implements Runnable {
    public final int f15800a;
    public final Object f15801b;
    public final Object f15802c;

    public o8(int i9, Object obj, Object obj2) {
        this.f15800a = i9;
        this.f15801b = obj;
        this.f15802c = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i9;
        switch (this.f15800a) {
            case 0:
                d dVar = (d) this.f15801b;
                Runnable runnable = (Runnable) this.f15802c;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ec ecVar = (ec) this.f15801b;
                Bitmap bitmap = (Bitmap) this.f15802c;
                if (ecVar.f15188k && !ecVar.f15186i) {
                    ecVar.d.add(new dc(ecVar, bitmap));
                    ecVar.f15188k = false;
                    ecVar.f15191n.invalidate();
                    return;
                }
                return;
            case 2:
                int[] iArr = (int[]) this.f15801b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f15802c;
                int i10 = iArr[0];
                if (i10 != 0) {
                    connectionsManager.cancelRequest(i10, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 3:
                mh.l lVar = (mh.l) this.f15801b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f15802c;
                if (userFull != null) {
                    lVar.S = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    lVar.U = starrefprogram;
                    if (starrefprogram == null) {
                        lVar.S = true;
                        lVar.U = lVar.E0();
                        lVar.T = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        lVar.T = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = lVar.U;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                lVar.G0(true);
                return;
            case 4:
                mh.c3 c3Var = (mh.c3) this.f15801b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f15802c;
                c3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    c3Var.g(botappsettings, true);
                    return;
                }
                return;
            case 5:
                mh.c3 c3Var2 = (mh.c3) this.f15801b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f15802c;
                if (!c3Var2.Y) {
                    if (tL_error != null) {
                        c3Var2.k(false);
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(c3Var2.f17767p0, 60000L);
                        return;
                    }
                }
                return;
            case 6:
                mh.c3 c3Var3 = (mh.c3) this.f15801b;
                org.telegram.ui.Components.gc Q = new org.telegram.ui.Components.oc(c3Var3.f17763l0, c3Var3.A).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f15802c));
                Q.f28737j = 5000;
                Q.k(true);
                return;
            case 7:
                mh.u3 u3Var = (mh.u3) this.f15801b;
                u3Var.getMessagesController().openApp((TLRPC.User) this.f15802c, u3Var.getClassGuid());
                return;
            case 8:
                mh.u3 u3Var2 = (mh.u3) this.f15801b;
                u3Var2.getClass();
                u3Var2.presentFragment(qn.R9(((TL_payments.connectedBotStarRef) this.f15802c).bot_id));
                return;
            case 9:
                mh.g4 g4Var = (mh.g4) this.f15801b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f15802c;
                if (!g4Var.P) {
                    if (tL_error2 != null) {
                        g4Var.f27493b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(g4Var.Q, 60000L);
                        return;
                    }
                }
                return;
            case 10:
                mh.g4 g4Var2 = (mh.g4) this.f15801b;
                org.telegram.ui.Components.gc Q2 = new org.telegram.ui.Components.oc(g4Var2.f27493b.getContainer(), g4Var2.f27492a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f15802c));
                Q2.f28737j = 5000;
                Q2.k(true);
                return;
            case 11:
                nh.r rVar = (nh.r) this.f15801b;
                rVar.getClass();
                rVar.presentFragment(qn.R9(((oh.e) this.f15802c).f19587b.f22527id));
                return;
            case 12:
                ((nh.j0) this.f15801b).f18655s.presentFragment(qn.R9(((oh.e) this.f15802c).f19587b.f22527id));
                return;
            case 13:
                of.c cVar = (of.c) this.f15801b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f15802c);
                int i11 = cVar.C;
                MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.f19258w, location, false);
                return;
            case 14:
                of.f0 f0Var = (of.f0) this.f15801b;
                TLObject tLObject = (TLObject) this.f15802c;
                int i12 = f0Var.f19303o0;
                ArrayList arrayList = f0Var.G;
                f0Var.O = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        f0Var.l();
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i12).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i12).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    f0Var.l();
                    return;
                } else {
                    return;
                }
            case 15:
                of.f0 f0Var2 = (of.f0) this.f15801b;
                View view = (View) this.f15802c;
                f0Var2.f19297i0 = false;
                f0Var2.f19299k0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 16:
                of.f0 f0Var3 = (of.f0) this.f15801b;
                StringBuilder sb2 = (StringBuilder) this.f15802c;
                f0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(f0Var3.f19303o0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 17:
                of.o1 o1Var = (of.o1) this.f15801b;
                String str = (String) this.f15802c;
                o1Var.E = str;
                if (o1Var.f19442r) {
                    o1Var.f19440f.g(str, true, false, o1Var.f19443s, o1Var.v, o1Var.f19445x, o1Var.f19444w, -1, 1);
                }
                int i13 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i13).contacts);
                o1Var.f19446y = true;
                int i14 = o1Var.B;
                o1Var.B = i14 + 1;
                o1Var.A = i14;
                o1Var.l();
                Utilities.searchQueue.postRunnable(new mh.l4(o1Var, str, i14, arrayList2, i13, 1));
                return;
            case 18:
                ArrayList arrayList3 = (ArrayList) this.f15802c;
                int i15 = ((of.v1) this.f15801b).f19534m;
                try {
                    MessagesStorage.getInstance(i15).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i15).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList3.size() && i16 != 100) {
                            of.t1 t1Var = (of.t1) arrayList3.get(i16);
                            executeFast.requery();
                            executeFast.bindString(1, t1Var.f19510a);
                            executeFast.bindInteger(2, t1Var.f19511b);
                            executeFast.step();
                            i16++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i15).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i9 = 100; i9 < arrayList3.size(); i9++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((of.t1) arrayList3.get(i9)).f19510a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i15).getDatabase().commitTransaction();
                    return;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 19:
                ((VideoAds) this.f15801b).lambda$showPremium$19((zf.x0) this.f15802c);
                return;
            case 20:
                ((VideoAds) this.f15801b).lambda$load$0((TLObject) this.f15802c);
                return;
            case 21:
                ((VideoAds) this.f15801b).lambda$show$16((Utilities.Callback) this.f15802c);
                return;
            case 22:
                d31.S((Context) this.f15801b, null, false, (ih.j0) this.f15802c, null);
                return;
            case 23:
                ((AudioRecordJNI) this.f15801b).lambda$startThread$0((ByteBuffer) this.f15802c);
                return;
            case 24:
                ((ConferenceCall) this.f15801b).lambda$processUpdates$4((TLRPC.Updates) this.f15802c);
                return;
            case 25:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.f15801b, (Point) this.f15802c);
                return;
            case 26:
                ((VideoCapturerDevice) this.f15801b).lambda$init$4((String) this.f15802c);
                return;
            case 27:
                ((VoIPService) this.f15801b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.f15802c);
                return;
            case 28:
                ((VoIPService) this.f15801b).lambda$createGroupInstance$71((String) this.f15802c);
                return;
            default:
                ((VoIPService) this.f15801b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.j0) this.f15802c);
                return;
        }
    }
}
