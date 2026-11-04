package ii;

import android.graphics.SurfaceTexture;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.view.View;
import b8.zb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.r31;
import org.telegram.ui.wm;
public final class e implements Runnable {
    public final int f14904a;
    public final Object f14905b;
    public final Object f14906c;

    public e(int i3, Object obj, Object obj2) {
        this.f14904a = i3;
        this.f14906c = obj;
        this.f14905b = obj2;
    }

    @Override
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i3;
        long j10;
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        boolean z11;
        int i10;
        TLRPC.Message message;
        TL_account.connectedBots connectedbots = null;
        r10 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r10 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i11 = 0;
        boolean z12 = true;
        switch (this.f14904a) {
            case 0:
                k kVar = (k) this.f14906c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f14905b;
                if (userFull != null) {
                    kVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.f15034b0 = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.Z = true;
                        kVar.f15034b0 = kVar.I0();
                        kVar.f15033a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.f15033a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.f15034b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.K0(true);
                return;
            case 1:
                a3 a3Var = (a3) this.f14906c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f14905b;
                a3Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    a3Var.k(botappsettings, true);
                    return;
                }
                return;
            case 2:
                a3 a3Var2 = (a3) this.f14906c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f14905b;
                if (!a3Var2.f14801e0) {
                    if (tL_error != null) {
                        a3Var2.o(false);
                        return;
                    } else {
                        org.telegram.messenger.g0.i3(a3Var2.f14821v0, 60000L);
                        return;
                    }
                }
                return;
            case 3:
                a3 a3Var3 = (a3) this.f14906c;
                ac Q = new fc(a3Var3.f14816r0, a3Var3.G).Q(2131623989, 36, org.telegram.messenger.g0.X2((String) this.f14905b));
                Q.f31792j = 5000;
                Q.k(true);
                return;
            case 4:
                q3 q3Var = (q3) this.f14906c;
                q3Var.getMessagesController().x3(null, (TLRPC.User) this.f14905b, null, q3Var.getClassGuid(), null, false, false);
                return;
            case 5:
                q3 q3Var2 = (q3) this.f14906c;
                q3Var2.getClass();
                q3Var2.presentFragment(wm.ra(((TL_payments.connectedBotStarRef) this.f14905b).bot_id));
                return;
            case 6:
                d4 d4Var = (d4) this.f14906c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f14905b;
                if (!d4Var.U) {
                    if (tL_error2 != null) {
                        d4Var.f38416b.dismiss();
                        return;
                    } else {
                        org.telegram.messenger.g0.i3(d4Var.V, 60000L);
                        return;
                    }
                }
                return;
            case 7:
                d4 d4Var2 = (d4) this.f14906c;
                ac Q2 = new fc(d4Var2.f38416b.f28589c, d4Var2.f38415a).Q(2131623989, 36, org.telegram.messenger.g0.X2((String) this.f14905b));
                Q2.f31792j = 5000;
                Q2.k(true);
                return;
            case 8:
                ji.q qVar = (ji.q) this.f14906c;
                qVar.getClass();
                qVar.presentFragment(wm.ra(((ki.f) this.f14905b).f17326b.f27150id));
                return;
            case 9:
                ((ji.b0) this.f14906c).f16270r1.presentFragment(wm.ra(((ki.f) this.f14905b).f17326b.f27150id));
                return;
            case 10:
                k2.i0 i0Var = (k2.i0) this.f14906c;
                k2.o0 o0Var = (k2.o0) this.f14905b;
                int i12 = i0Var.J - o0Var.f16660b;
                i0Var.J = i12;
                if (o0Var.d) {
                    i0Var.K = o0Var.f16662e;
                    i0Var.L = true;
                }
                if (i12 == 0) {
                    d2.n1 n1Var = ((k2.j1) o0Var.f16663f).f16597a;
                    int i13 = -1;
                    if (!i0Var.f16567p0.f16597a.p() && n1Var.p()) {
                        i0Var.f16569q0 = -1;
                        i0Var.f16571r0 = 0L;
                    }
                    if (!n1Var.p()) {
                        List asList = Arrays.asList(((k2.o1) n1Var).f16667l);
                        if (asList.size() == i0Var.f16566p.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zb.p(z11);
                        for (int i14 = 0; i14 < asList.size(); i14++) {
                            ((k2.e0) i0Var.f16566p.get(i14)).f16485c = (d2.n1) asList.get(i14);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (i0Var.L) {
                        if (((k2.j1) o0Var.f16663f).f16597a.p() && i0Var.f16567p0.f16597a.p()) {
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        boolean equals = ((k2.j1) o0Var.f16663f).f16598b.equals(i0Var.f16567p0.f16598b);
                        if (((k2.j1) o0Var.f16663f).d == i0Var.f16567p0.f16613s) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        if (objArr != null || (equals && objArr2 != null)) {
                            z12 = false;
                        }
                        if (z12) {
                            i13 = i0Var.l0();
                            if (!n1Var.p() && !((k2.j1) o0Var.f16663f).f16598b.b()) {
                                k2.j1 j1Var = (k2.j1) o0Var.f16663f;
                                w2.g0 g0Var = j1Var.f16598b;
                                long j12 = j1Var.d;
                                Object obj = g0Var.f57081a;
                                d2.k1 k1Var = i0Var.f16564o;
                                n1Var.g(obj, k1Var);
                                j11 = j12 + k1Var.f8164e;
                            } else {
                                j11 = ((k2.j1) o0Var.f16663f).d;
                            }
                        }
                        i3 = i13;
                        j10 = j11;
                        z10 = z12;
                    } else {
                        i3 = -1;
                        j10 = -9223372036854775807L;
                        z10 = false;
                    }
                    i0Var.L = false;
                    i0Var.D1((k2.j1) o0Var.f16663f, 1, z10, i0Var.K, j10, i3, false);
                    return;
                }
                return;
            case 11:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f14905b;
                ArrayList arrayList2 = ((k2.c0) this.f14906c).f16459a.f16575t0;
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((m51) ((d2.z1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 12:
                kg.e0 e0Var = (kg.e0) this.f14906c;
                View view = (View) this.f14905b;
                e0Var.f16972n0 = false;
                e0Var.f16974p0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 13:
                kg.e0 e0Var2 = (kg.e0) this.f14906c;
                TLObject tLObject = (TLObject) this.f14905b;
                int i15 = e0Var2.f16980t0;
                ArrayList arrayList3 = e0Var2.L;
                e0Var2.T = 0;
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList3.isEmpty()) {
                        arrayList3.clear();
                        e0Var2.f();
                        return;
                    }
                    return;
                } else if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    hp.s1(i15).Y3(tL_contacts_sponsoredPeers.users, true);
                    hp.s1(i15).S3(tL_contacts_sponsoredPeers.chats, true);
                    arrayList3.addAll(tL_contacts_sponsoredPeers.peers);
                    e0Var2.f();
                    return;
                } else {
                    return;
                }
            case 14:
                kg.e0 e0Var3 = (kg.e0) this.f14906c;
                StringBuilder sb2 = (StringBuilder) this.f14905b;
                e0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    qr.a0(e0Var3.f16980t0).f24936b.executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 15:
                kg.o1 o1Var = (kg.o1) this.f14906c;
                String str = (String) this.f14905b;
                o1Var.J = str;
                if (o1Var.f17130r) {
                    o1Var.f17128f.g(str, true, false, o1Var.f17131s, o1Var.f17132w, o1Var.f17134y, o1Var.f17133x, -1, 1);
                }
                int i16 = h10.f22829t0;
                ArrayList arrayList4 = new ArrayList(g5.r(i16).f22653f0);
                o1Var.E = true;
                int i17 = o1Var.G;
                o1Var.G = i17 + 1;
                o1Var.F = i17;
                o1Var.f();
                Utilities.f21389g.c(new j4(o1Var, str, i17, arrayList4, i16, 1));
                return;
            case 16:
                ArrayList arrayList5 = (ArrayList) this.f14905b;
                int i18 = ((kg.v1) this.f14906c).f17216m;
                try {
                    qr.a0(i18).f24936b.beginTransaction();
                    SQLitePreparedStatement executeFast = qr.a0(i18).f24936b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i11 < arrayList5.size() && i11 != 100) {
                            kg.t1 t1Var = (kg.t1) arrayList5.get(i11);
                            executeFast.requery();
                            executeFast.bindString(1, t1Var.f17197a);
                            executeFast.bindInteger(2, t1Var.f17198b);
                            executeFast.step();
                            i11++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList5.size() > 100) {
                        SQLitePreparedStatement executeFast2 = qr.a0(i18).f24936b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList5.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((kg.t1) arrayList5.get(i10)).f17197a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    qr.a0(i18).f24936b.commitTransaction();
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 17:
                ((l2.i) this.f14906c).d.reportTrackChangeEvent((TrackChangeEvent) this.f14905b);
                return;
            case 18:
                ((l2.i) this.f14906c).d.reportNetworkEvent((NetworkEvent) this.f14905b);
                return;
            case 19:
                ((l2.i) this.f14906c).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f14905b);
                return;
            case 20:
                ((l2.i) this.f14906c).d.reportPlaybackMetrics((PlaybackMetrics) this.f14905b);
                return;
            case 21:
                ((l2.i) this.f14906c).d.reportPlaybackStateEvent((PlaybackStateEvent) this.f14905b);
                return;
            case 22:
                lg.f fVar = (lg.f) this.f14906c;
                TLObject tLObject2 = (TLObject) this.f14905b;
                fVar.f18293e = false;
                if (tLObject2 instanceof TL_account.connectedBots) {
                    connectedbots = (TL_account.connectedBots) tLObject2;
                }
                fVar.f18292c = connectedbots;
                if (connectedbots != null) {
                    hp.s1(fVar.f18290a).Y3(fVar.f18292c.users, false);
                }
                fVar.f18291b = System.currentTimeMillis();
                fVar.f18294f = true;
                fVar.d();
                return;
            case 23:
                lg.j0 j0Var = (lg.j0) this.f14906c;
                lg.f.a(j0Var.f28583a).b();
                ((org.telegram.ui.Components.o2) this.f14905b).run();
                j0Var.dismiss();
                return;
            case 24:
                lg.r0.a0((lg.r0) this.f14906c, (TLObject) this.f14905b);
                return;
            case 25:
                lg.d1 d1Var = (lg.d1) this.f14906c;
                d1Var.getClass();
                d1Var.c0(((r31) this.f14905b).d);
                return;
            case 26:
                qr qrVar = (qr) this.f14906c;
                lg.t1 t1Var2 = (lg.t1) this.f14905b;
                try {
                    try {
                        sQLitePreparedStatement2 = qrVar.f24936b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, t1Var2.f18473a);
                        sQLitePreparedStatement2.bindString(2, t1Var2.f18474b);
                        sQLitePreparedStatement2.bindInteger(3, t1Var2.f18475c);
                        sQLitePreparedStatement2.bindInteger(4, t1Var2.f18477f);
                        sQLitePreparedStatement2.step();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    a8.g(e12, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 27:
                lg.u1 u1Var = (lg.u1) this.f14906c;
                TLObject tLObject3 = (TLObject) this.f14905b;
                ArrayList arrayList6 = u1Var.f18485b;
                int i19 = u1Var.f18484a;
                if (tLObject3 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    hp.s1(i19).Y3(tL_messages_quickReplies.users, false);
                    hp.s1(i19).S3(tL_messages_quickReplies.chats, false);
                    qr.a0(i19).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i20 = 0; i20 < tL_messages_quickReplies.quick_replies.size(); i20++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i20);
                        lg.t1 t1Var3 = new lg.t1();
                        t1Var3.f18473a = tL_quickReply.shortcut_id;
                        t1Var3.f18474b = tL_quickReply.shortcut;
                        t1Var3.f18477f = tL_quickReply.count;
                        t1Var3.d = tL_quickReply.top_message;
                        t1Var3.f18475c = i20;
                        int i21 = 0;
                        while (true) {
                            if (i21 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i21);
                                if (message.f27022id != tL_quickReply.top_message) {
                                    i21++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            zi ziVar = new zi(i19, message, false, true);
                            t1Var3.f18476e = ziVar;
                            ziVar.r0(false);
                            t1Var3.f18476e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList7.add(t1Var3);
                    }
                    arrayList = arrayList7;
                }
                u1Var.f18487e = false;
                if (arrayList != null) {
                    arrayList6.clear();
                    arrayList6.addAll(arrayList);
                }
                u1Var.f18488f = true;
                u1Var.l();
                hs.f(i19).k(121, new Object[0]);
                return;
            case 28:
                qr qrVar2 = (qr) this.f14905b;
                ArrayList arrayList8 = ((lg.u1) this.f14906c).f18485b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar2.f24936b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i11 < arrayList8.size()) {
                            lg.t1 t1Var4 = (lg.t1) arrayList8.get(i11);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, t1Var4.f18473a);
                            sQLitePreparedStatement.bindString(2, t1Var4.f18474b);
                            sQLitePreparedStatement.bindInteger(3, t1Var4.f18475c);
                            sQLitePreparedStatement.bindInteger(4, t1Var4.f18477f);
                            sQLitePreparedStatement.step();
                            i11++;
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
                } catch (Exception e13) {
                    a8.g(e13, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            default:
                String str2 = g2.n0.f11873a;
                l2.f fVar2 = ((k2.c0) ((m2.u) ((m2.t) this.f14906c).f19007c)).f16459a.f16572s;
                l2.a U = fVar2.U();
                fVar2.V(U, 1012, new l2.d(U, (String) this.f14905b, 1));
                return;
        }
    }
}
