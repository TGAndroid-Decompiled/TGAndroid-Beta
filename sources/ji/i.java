package ji;

import a8.la;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.util.Log;
import di.p6;
import e2.i1;
import e2.l1;
import e2.w1;
import h9.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kg.e1;
import kg.k0;
import kg.s0;
import kg.u1;
import kg.v1;
import ki.h3;
import ki.s2;
import ki.s3;
import l2.b0;
import l2.f0;
import l2.g1;
import l2.l0;
import l2.z;
import li.d0;
import n2.c0;
import n2.i0;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
import org.telegram.ui.jw0;
public final class i implements Runnable {
    public final int f17967a;
    public final Object f17968b;
    public final Object f17969c;

    public i(int i7, Object obj, Object obj2) {
        this.f17967a = i7;
        this.f17968b = obj;
        this.f17969c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i7;
        long j3;
        boolean z10;
        Object[] objArr;
        Object[] objArr2;
        boolean z11;
        n2.e eVar;
        TL_account.connectedBots connectedbots = null;
        Bitmap bitmap = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = true;
        switch (this.f17967a) {
            case 0:
                o oVar = (o) this.f17968b;
                String str = (String) this.f17969c;
                oVar.f18003i0 = false;
                if (oVar.f17994c == 0) {
                    e eVar2 = oVar.K;
                    if (eVar2 != null) {
                        eVar2.setBusy(false);
                        return;
                    }
                    return;
                } else if (str != null && !str.trim().isEmpty()) {
                    oVar.f17998e0 = str.trim();
                    oVar.f18000f0 = oVar.c().size();
                    e eVar3 = oVar.K;
                    if (eVar3 != null) {
                        eVar3.setRevertShown(true);
                        oVar.K.setRebuildNext(true);
                    }
                    oVar.o();
                    e eVar4 = oVar.K;
                    if (eVar4 != null) {
                        eVar4.setRebuildNext(false);
                        oVar.K.setBusy(false);
                        return;
                    }
                    return;
                } else {
                    Log.d("VoiceLive", "field: style failed");
                    e eVar5 = oVar.K;
                    if (eVar5 != null) {
                        eVar5.setBusy(false);
                        return;
                    }
                    return;
                }
            case 1:
                kg.f fVar = (kg.f) this.f17968b;
                TLObject tLObject = (TLObject) this.f17969c;
                fVar.f18341e = false;
                if (tLObject instanceof TL_account.connectedBots) {
                    connectedbots = (TL_account.connectedBots) tLObject;
                }
                fVar.f18340c = connectedbots;
                if (connectedbots != null) {
                    mp.u1(fVar.f18338a).f4(fVar.f18340c.users, false);
                }
                fVar.f18339b = System.currentTimeMillis();
                fVar.f18342f = true;
                fVar.d();
                return;
            case 2:
                k0 k0Var = (k0) this.f17968b;
                kg.f.a(k0Var.f30170a).b();
                ((jw0) this.f17969c).run();
                k0Var.dismiss();
                return;
            case 3:
                s0.a0((s0) this.f17968b, (TLObject) this.f17969c);
                return;
            case 4:
                e1 e1Var = (e1) this.f17968b;
                e1Var.getClass();
                e1Var.c0(((o41) this.f17969c).d);
                return;
            case 5:
                tr trVar = (tr) this.f17968b;
                u1 u1Var = (u1) this.f17969c;
                try {
                    try {
                        sQLitePreparedStatement2 = trVar.f27082b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, u1Var.f18530a);
                        sQLitePreparedStatement2.bindString(2, u1Var.f18531b);
                        sQLitePreparedStatement2.bindInteger(3, u1Var.f18532c);
                        sQLitePreparedStatement2.bindInteger(4, u1Var.f18534f);
                        sQLitePreparedStatement2.step();
                    } catch (Throwable th2) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th2;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 6:
                v1 v1Var = (v1) this.f17968b;
                TLObject tLObject2 = (TLObject) this.f17969c;
                ArrayList arrayList2 = v1Var.f18542b;
                int i11 = v1Var.f18541a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    mp.u1(i11).f4(tL_messages_quickReplies.users, false);
                    mp.u1(i11).Z3(tL_messages_quickReplies.chats, false);
                    tr.a0(i11).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_quickReplies.quick_replies.size(); i12++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i12);
                        u1 u1Var2 = new u1();
                        u1Var2.f18530a = tL_quickReply.shortcut_id;
                        u1Var2.f18531b = tL_quickReply.shortcut;
                        u1Var2.f18534f = tL_quickReply.count;
                        u1Var2.d = tL_quickReply.top_message;
                        u1Var2.f18532c = i12;
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i13);
                                if (message.f28452id != tL_quickReply.top_message) {
                                    i13++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            fj fjVar = new fj(i11, message, false, true);
                            u1Var2.f18533e = fjVar;
                            fjVar.r0(false);
                            u1Var2.f18533e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(u1Var2);
                    }
                    arrayList = arrayList3;
                }
                v1Var.f18544e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                v1Var.f18545f = true;
                v1Var.l();
                ks.f(i11).k(121, new Object[0]);
                return;
            case 7:
                tr trVar2 = (tr) this.f17969c;
                ArrayList arrayList4 = ((v1) this.f17968b).f18542b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar2.f27082b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                            u1 u1Var3 = (u1) arrayList4.get(i14);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, u1Var3.f18530a);
                            sQLitePreparedStatement.bindString(2, u1Var3.f18531b);
                            sQLitePreparedStatement.bindInteger(3, u1Var3.f18532c);
                            sQLitePreparedStatement.bindInteger(4, u1Var3.f18534f);
                            sQLitePreparedStatement.step();
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th3) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th3;
                }
            case 8:
                ki.j jVar = (ki.j) this.f17968b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f17969c;
                if (userFull != null) {
                    jVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    jVar.f18747b0 = starrefprogram;
                    if (starrefprogram == null) {
                        jVar.Z = true;
                        jVar.f18747b0 = jVar.I0();
                        jVar.f18746a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        jVar.f18746a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = jVar.f18747b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                jVar.K0(true);
                return;
            case 9:
                s2 s2Var = (s2) this.f17968b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f17969c;
                s2Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    s2Var.k(botappsettings, true);
                    return;
                }
                return;
            case 10:
                s2 s2Var2 = (s2) this.f17968b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f17969c;
                if (!s2Var2.f18936e0) {
                    if (tL_error != null) {
                        s2Var2.o(false);
                        return;
                    } else {
                        g0.h3(s2Var2.f18956v0, 60000L);
                        return;
                    }
                }
                return;
            case 11:
                s2 s2Var3 = (s2) this.f17968b;
                gc Q = new lc(s2Var3.f18951r0, s2Var3.G).Q(2131623990, 36, g0.W2((String) this.f17969c));
                Q.f35508j = 5000;
                Q.k(true);
                return;
            case 12:
                h3 h3Var = (h3) this.f17968b;
                h3Var.getMessagesController().E3(null, (TLRPC.User) this.f17969c, null, h3Var.getClassGuid(), null, false, false);
                return;
            case 13:
                h3 h3Var2 = (h3) this.f17968b;
                h3Var2.getClass();
                h3Var2.presentFragment(bn.ua(((TL_payments.connectedBotStarRef) this.f17969c).bot_id));
                return;
            case 14:
                s3 s3Var = (s3) this.f17968b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f17969c;
                if (!s3Var.U) {
                    if (tL_error2 != null) {
                        s3Var.f37521b.dismiss();
                        return;
                    } else {
                        g0.h3(s3Var.V, 60000L);
                        return;
                    }
                }
                return;
            case 15:
                s3 s3Var2 = (s3) this.f17968b;
                gc Q2 = new lc(s3Var2.f37521b.f30176c, s3Var2.f37520a).Q(2131623990, 36, g0.W2((String) this.f17969c));
                Q2.f35508j = 5000;
                Q2.k(true);
                return;
            case 16:
                f0 f0Var = (f0) this.f17968b;
                l0 l0Var = (l0) this.f17969c;
                int i15 = f0Var.J - l0Var.f19458b;
                f0Var.J = i15;
                if (l0Var.d) {
                    f0Var.K = l0Var.f19460e;
                    f0Var.L = true;
                }
                if (i15 == 0) {
                    l1 l1Var = ((g1) l0Var.f19461f).f19397a;
                    int i16 = -1;
                    if (!f0Var.f19367p0.f19397a.p() && l1Var.p()) {
                        f0Var.f19369q0 = -1;
                        f0Var.f19371r0 = 0L;
                    }
                    if (!l1Var.p()) {
                        List asList = Arrays.asList(((l2.l1) l1Var).f19465l);
                        if (asList.size() == f0Var.f19366p.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        la.p(z11);
                        for (int i17 = 0; i17 < asList.size(); i17++) {
                            ((b0) f0Var.f19366p.get(i17)).f19293c = (l1) asList.get(i17);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (f0Var.L) {
                        if (((g1) l0Var.f19461f).f19397a.p() && f0Var.f19367p0.f19397a.p()) {
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        boolean equals = ((g1) l0Var.f19461f).f19398b.equals(f0Var.f19367p0.f19398b);
                        if (((g1) l0Var.f19461f).d == f0Var.f19367p0.f19413s) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        if (objArr != null || (equals && objArr2 != null)) {
                            z13 = false;
                        }
                        if (z13) {
                            i16 = f0Var.o0();
                            if (!l1Var.p() && !((g1) l0Var.f19461f).f19398b.b()) {
                                g1 g1Var = (g1) l0Var.f19461f;
                                x2.g0 g0Var = g1Var.f19398b;
                                long j11 = g1Var.d;
                                Object obj = g0Var.f60129a;
                                i1 i1Var = f0Var.f19364o;
                                l1Var.g(obj, i1Var);
                                j10 = j11 + i1Var.f10463e;
                            } else {
                                j10 = ((g1) l0Var.f19461f).d;
                            }
                        }
                        i7 = i16;
                        j3 = j10;
                        z10 = z13;
                    } else {
                        i7 = -1;
                        j3 = -9223372036854775807L;
                        z10 = false;
                    }
                    f0Var.L = false;
                    f0Var.D1((g1) l0Var.f19461f, 1, z10, f0Var.K, j3, i7, false);
                    return;
                }
                return;
            case 17:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f17969c;
                ArrayList arrayList5 = ((z) this.f17968b).f19625a.f19375t0;
                int size = arrayList5.size();
                while (i10 < size) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    ((i61) ((w1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 18:
                li.s sVar = (li.s) this.f17968b;
                sVar.getClass();
                sVar.presentFragment(bn.ua(((mi.f) this.f17969c).f21047b.f28580id));
                return;
            case 19:
                ((d0) this.f17968b).f19936u1.presentFragment(bn.ua(((mi.f) this.f17969c).f21047b.f28580id));
                return;
            case 20:
                ((m2.g) this.f17968b).d.reportTrackChangeEvent((TrackChangeEvent) this.f17969c);
                return;
            case 21:
                ((m2.g) this.f17968b).d.reportNetworkEvent((NetworkEvent) this.f17969c);
                return;
            case 22:
                ((m2.g) this.f17968b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f17969c);
                return;
            case 23:
                ((m2.g) this.f17968b).d.reportPlaybackMetrics((PlaybackMetrics) this.f17969c);
                return;
            case 24:
                ((m2.g) this.f17968b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.f17969c);
                return;
            case 25:
                String str2 = h2.l0.f13812a;
                m2.d dVar = ((z) ((n2.s) ((k8.a) this.f17968b).f18212c)).f19625a.f19372s;
                m2.a U = dVar.U();
                dVar.V(U, 1012, new m2.c(U, (String) this.f17969c, 15));
                return;
            case 26:
                String str3 = h2.l0.f13812a;
                l.z(((z) ((n2.s) ((k8.a) this.f17968b).f18212c)).f19625a.F, (l2.c) this.f17969c);
                return;
            case 27:
                c0.a((c0) this.f17968b, (AudioRouting) this.f17969c);
                return;
            case 28:
                c0 c0Var = (c0) this.f17968b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.f17969c;
                if (c0Var.d != null && (eVar = ((i0) c0Var.f21102b.f15505b).f21161i) != null && !audioDeviceInfo.equals(eVar.f21114i)) {
                    eVar.f21114i = audioDeviceInfo;
                    Context context = eVar.f21108a;
                    e2.e eVar6 = eVar.f21115j;
                    List a10 = eVar.a();
                    t1 t1Var = n2.b.f21093e;
                    eVar.b(n2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar6, audioDeviceInfo, a10));
                    return;
                }
                return;
            default:
                q10 q10Var = (q10) this.f17969c;
                oi.p a11 = oi.p.a(((String[]) this.f17968b)[0], g0.L(26.0f), false);
                if (a11 == null) {
                    a11 = oi.p.a(gd.N0(2131754004, null), g0.L(26.0f), false);
                    z12 = true;
                }
                if (a11 != null) {
                    bitmap = a11.f22300a;
                }
                g0.g3(new p6(q10Var, bitmap, z12, 7));
                return;
        }
    }
}
