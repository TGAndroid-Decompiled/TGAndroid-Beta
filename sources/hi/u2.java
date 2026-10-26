package hi;

import a8.yb;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.un;
public final class u2 implements Runnable {
    public final int f13314a;
    public final Object f13315b;
    public final Object f13316c;

    public u2(int i10, Object obj, Object obj2) {
        this.f13314a = i10;
        this.f13315b = obj;
        this.f13316c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j10;
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        boolean z11;
        int i11;
        TLRPC.Message message;
        TL_account.connectedBots connectedbots = null;
        ArrayList arrayList = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i12 = 0;
        boolean z12 = true;
        switch (this.f13314a) {
            case 0:
                m3 m3Var = (m3) this.f13315b;
                qc R = new wc(m3Var.f13121q0, m3Var.F).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f13316c));
                R.f31889j = 5000;
                R.k(true);
                return;
            case 1:
                d4 d4Var = (d4) this.f13315b;
                d4Var.getMessagesController().openApp((TLRPC.User) this.f13316c, d4Var.getClassGuid());
                return;
            case 2:
                d4 d4Var2 = (d4) this.f13315b;
                d4Var2.getClass();
                d4Var2.presentFragment(un.ba(((TL_payments.connectedBotStarRef) this.f13316c).bot_id));
                return;
            case 3:
                o4 o4Var = (o4) this.f13315b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f13316c;
                if (!o4Var.T) {
                    if (tL_error != null) {
                        o4Var.f30215b.dismiss();
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(o4Var.U, 60000L);
                        return;
                    }
                }
                return;
            case 4:
                o4 o4Var2 = (o4) this.f13315b;
                qc R2 = new wc(o4Var2.f30215b.getContainer(), o4Var2.f30214a).R(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.f13316c));
                R2.f31889j = 5000;
                R2.k(true);
                return;
            case 5:
                i2.j0 j0Var = (i2.j0) this.f13315b;
                i2.p0 p0Var = (i2.p0) this.f13316c;
                int i13 = j0Var.J - p0Var.f13698b;
                j0Var.J = i13;
                if (p0Var.d) {
                    j0Var.K = p0Var.e;
                    j0Var.L = true;
                }
                if (i13 == 0) {
                    b2.p1 p1Var = ((i2.k1) p0Var.f13700f).f13638a;
                    int i14 = -1;
                    if (!j0Var.f13609p0.f13638a.p() && p1Var.p()) {
                        j0Var.f13611q0 = -1;
                        j0Var.f13613r0 = 0L;
                    }
                    if (!p1Var.p()) {
                        List asList = Arrays.asList(((i2.p1) p1Var).f13704l);
                        if (asList.size() == j0Var.f13608p.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        yb.p(z11);
                        for (int i15 = 0; i15 < asList.size(); i15++) {
                            ((i2.f0) j0Var.f13608p.get(i15)).f13532c = (b2.p1) asList.get(i15);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (j0Var.L) {
                        if (((i2.k1) p0Var.f13700f).f13638a.p() && j0Var.f13609p0.f13638a.p()) {
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        boolean equals = ((i2.k1) p0Var.f13700f).f13639b.equals(j0Var.f13609p0.f13639b);
                        if (((i2.k1) p0Var.f13700f).d == j0Var.f13609p0.f13653s) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        if (objArr != null || (equals && objArr2 != null)) {
                            z12 = false;
                        }
                        if (z12) {
                            i14 = j0Var.n0();
                            if (!p1Var.p() && !((i2.k1) p0Var.f13700f).f13639b.b()) {
                                i2.k1 k1Var = (i2.k1) p0Var.f13700f;
                                u2.g0 g0Var = k1Var.f13639b;
                                long j12 = k1Var.d;
                                Object obj = g0Var.f49297a;
                                b2.m1 m1Var = j0Var.f13606o;
                                p1Var.g(obj, m1Var);
                                j11 = j12 + m1Var.e;
                            } else {
                                j11 = ((i2.k1) p0Var.f13700f).d;
                            }
                        }
                        i10 = i14;
                        j10 = j11;
                        z10 = z12;
                    } else {
                        i10 = -1;
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    j0Var.L = false;
                    j0Var.D1((i2.k1) p0Var.f13700f, 1, z10, j0Var.K, j10, i10, false);
                    return;
                }
                return;
            case 6:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f13316c;
                ArrayList arrayList2 = ((i2.d0) this.f13315b).f13509a.f13617t0;
                int size = arrayList2.size();
                while (i12 < size) {
                    Object obj2 = arrayList2.get(i12);
                    i12++;
                    ((s81) ((b2.a2) obj2)).J.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 7:
                ig.c cVar = (ig.c) this.f13315b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f13316c);
                int i16 = cVar.G;
                MessagesController.getInstance(i16).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.f14013w, location, false);
                return;
            case 8:
                ig.i0 i0Var = (ig.i0) this.f13315b;
                View view = (View) this.f13316c;
                i0Var.m0 = false;
                i0Var.f14088o0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 9:
                ig.i0 i0Var2 = (ig.i0) this.f13315b;
                TLObject tLObject = (TLObject) this.f13316c;
                int i17 = i0Var2.f14094s0;
                ArrayList arrayList3 = i0Var2.K;
                i0Var2.S = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList3.isEmpty()) {
                        arrayList3.clear();
                        i0Var2.l();
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    MessagesController.getInstance(i17).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i17).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList3.addAll(tL_contacts_sponsoredPeers.peers);
                    i0Var2.l();
                    return;
                } else {
                    return;
                }
            case 10:
                ig.i0 i0Var3 = (ig.i0) this.f13315b;
                StringBuilder sb2 = (StringBuilder) this.f13316c;
                i0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(i0Var3.f14094s0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                ig.t1 t1Var = (ig.t1) this.f13315b;
                String str = (String) this.f13316c;
                t1Var.I = str;
                if (t1Var.f14254r) {
                    t1Var.f14252f.g(str, true, false, t1Var.f14255s, t1Var.v, t1Var.f14257x, t1Var.f14256w, -1, 1);
                }
                int i18 = UserConfig.selectedAccount;
                ArrayList arrayList4 = new ArrayList(ContactsController.getInstance(i18).contacts);
                t1Var.f14258y = true;
                int i19 = t1Var.F;
                t1Var.F = i19 + 1;
                t1Var.E = i19;
                t1Var.l();
                Utilities.searchQueue.postRunnable(new v4(t1Var, str, i19, arrayList4, i18, 1));
                return;
            case 12:
                ArrayList arrayList5 = (ArrayList) this.f13316c;
                int i20 = ((ig.a2) this.f13315b).f13997m;
                try {
                    MessagesStorage.getInstance(i20).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i20).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i12 < arrayList5.size() && i12 != 100) {
                            ig.y1 y1Var = (ig.y1) arrayList5.get(i12);
                            executeFast.requery();
                            executeFast.bindString(1, y1Var.f14305a);
                            executeFast.bindInteger(2, y1Var.f14306b);
                            executeFast.step();
                            i12++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList5.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i20).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i11 = 100; i11 < arrayList5.size(); i11++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((ig.y1) arrayList5.get(i11)).f14305a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i20).getDatabase().commitTransaction();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 13:
                ii.r rVar = (ii.r) this.f13315b;
                rVar.getClass();
                rVar.presentFragment(un.ba(((ji.f) this.f13316c).f15981b.f22176id));
                return;
            case 14:
                ((ii.j0) this.f13315b).f14363s.presentFragment(un.ba(((ji.f) this.f13316c).f15981b.f22176id));
                return;
            case 15:
                ((j2.h) this.f13315b).d.reportTrackChangeEvent((TrackChangeEvent) this.f13316c);
                return;
            case 16:
                ((j2.h) this.f13315b).d.reportNetworkEvent((NetworkEvent) this.f13316c);
                return;
            case 17:
                ((j2.h) this.f13315b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f13316c);
                return;
            case 18:
                ((j2.h) this.f13315b).d.reportPlaybackMetrics((PlaybackMetrics) this.f13316c);
                return;
            case 19:
                ((j2.h) this.f13315b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.f13316c);
                return;
            case 20:
                jg.f fVar = (jg.f) this.f13315b;
                TLObject tLObject2 = (TLObject) this.f13316c;
                fVar.e = false;
                if (tLObject2 instanceof TL_account.connectedBots) {
                    connectedbots = (TL_account.connectedBots) tLObject2;
                }
                fVar.f15696c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(fVar.f15694a).putUsers(fVar.f15696c.users, false);
                }
                fVar.f15695b = System.currentTimeMillis();
                fVar.f15697f = true;
                fVar.d();
                return;
            case 21:
                jg.k0.R((jg.k0) this.f13315b, (org.telegram.ui.Components.h2) this.f13316c);
                return;
            case 22:
                jg.t0.W((jg.t0) this.f13315b, (TLObject) this.f13316c);
                return;
            case 23:
                jg.h1 h1Var = (jg.h1) this.f13315b;
                h1Var.getClass();
                h1Var.Y(((t61) this.f13316c).d);
                return;
            case 24:
                MessagesStorage messagesStorage = (MessagesStorage) this.f13315b;
                jg.b2 b2Var = (jg.b2) this.f13316c;
                try {
                    try {
                        sQLitePreparedStatement2 = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, b2Var.f15640a);
                        sQLitePreparedStatement2.bindString(2, b2Var.f15641b);
                        sQLitePreparedStatement2.bindInteger(3, b2Var.f15642c);
                        sQLitePreparedStatement2.bindInteger(4, b2Var.f15643f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th2;
                }
            case 25:
                MessagesStorage messagesStorage2 = (MessagesStorage) this.f13316c;
                ArrayList arrayList6 = ((jg.c2) this.f13315b).f15660b;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i12 < arrayList6.size()) {
                            jg.b2 b2Var2 = (jg.b2) arrayList6.get(i12);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, b2Var2.f15640a);
                            sQLitePreparedStatement.bindString(2, b2Var2.f15641b);
                            sQLitePreparedStatement.bindInteger(3, b2Var2.f15642c);
                            sQLitePreparedStatement.bindInteger(4, b2Var2.f15643f);
                            sQLitePreparedStatement.step();
                            i12++;
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th3;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            case 26:
                jg.c2 c2Var = (jg.c2) this.f13315b;
                TLObject tLObject3 = (TLObject) this.f13316c;
                ArrayList arrayList7 = c2Var.f15660b;
                int i21 = c2Var.f15659a;
                if (tLObject3 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    MessagesController.getInstance(i21).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i21).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i21).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList8 = new ArrayList();
                    for (int i22 = 0; i22 < tL_messages_quickReplies.quick_replies.size(); i22++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i22);
                        jg.b2 b2Var3 = new jg.b2();
                        b2Var3.f15640a = tL_quickReply.shortcut_id;
                        b2Var3.f15641b = tL_quickReply.shortcut;
                        b2Var3.f15643f = tL_quickReply.count;
                        b2Var3.d = tL_quickReply.top_message;
                        b2Var3.f15642c = i22;
                        int i23 = 0;
                        while (true) {
                            if (i23 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i23);
                                if (message.f22048id != tL_quickReply.top_message) {
                                    i23++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i21, message, false, true);
                            b2Var3.e = messageObject;
                            messageObject.generateThumbs(false);
                            b2Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList8.add(b2Var3);
                    }
                    arrayList = arrayList8;
                }
                c2Var.e = false;
                if (arrayList != null) {
                    arrayList7.clear();
                    arrayList7.addAll(arrayList);
                }
                c2Var.f15662f = true;
                c2Var.l();
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 27:
                String str2 = e2.n0.f9692a;
                j2.e eVar = ((i2.d0) ((k2.v) ((rf.b) this.f13315b).f47336c)).f13509a.f13614s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1012, new j2.d(p10, (String) this.f13316c, 14));
                return;
            case 28:
                String str3 = e2.n0.f9692a;
                rf.b.D(((i2.d0) ((k2.v) ((rf.b) this.f13315b).f47336c)).f13509a.F, (i2.d) this.f13316c);
                return;
            default:
                k2.f0.a((k2.f0) this.f13315b, (AudioRouting) this.f13316c);
                return;
        }
    }
}
