package ji;

import a8.ma;
import android.graphics.SurfaceTexture;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.util.Log;
import e2.i1;
import e2.l1;
import h2.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kg.e1;
import kg.k0;
import kg.s0;
import kg.v1;
import kg.w1;
import ki.i3;
import ki.t2;
import ki.t3;
import l2.a0;
import l2.c0;
import l2.h1;
import l2.m0;
import l2.m1;
import n2.d0;
import n2.s;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.ao0;
import org.telegram.ui.bn;
public final class f implements Runnable {
    public final int f18031a;
    public final Object f18032b;
    public final Object f18033c;

    public f(int i7, Object obj, Object obj2) {
        this.f18031a = i7;
        this.f18032b = obj;
        this.f18033c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Message message;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i7;
        boolean z10;
        long j3;
        Object[] objArr;
        Object[] objArr2;
        long j10;
        boolean z11;
        TL_account.connectedBots connectedbots = null;
        r11 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        ArrayList arrayList = null;
        r11 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i10 = 0;
        boolean z12 = true;
        switch (this.f18031a) {
            case 0:
                n nVar = (n) this.f18032b;
                e eVar = (e) this.f18033c;
                if (nVar.f18062c == 0 && nVar.K == eVar && eVar.R) {
                    eVar.R = false;
                    eVar.f17953f0 = -1;
                    eVar.invalidate();
                    return;
                }
                return;
            case 1:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f18033c;
                if (((n) this.f18032b).X == editTextBoldCursor) {
                    g0.I3(editTextBoldCursor);
                    return;
                }
                return;
            case 2:
                n nVar2 = (n) this.f18032b;
                String str = (String) this.f18033c;
                nVar2.f18071i0 = false;
                if (nVar2.f18062c == 0) {
                    e eVar2 = nVar2.K;
                    if (eVar2 != null) {
                        eVar2.setBusy(false);
                        return;
                    }
                    return;
                } else if (str != null && !str.trim().isEmpty()) {
                    nVar2.f18066e0 = str.trim();
                    nVar2.f18068f0 = nVar2.c().size();
                    e eVar3 = nVar2.K;
                    if (eVar3 != null) {
                        eVar3.setRevertShown(true);
                        nVar2.K.setRebuildNext(true);
                    }
                    nVar2.m();
                    e eVar4 = nVar2.K;
                    if (eVar4 != null) {
                        eVar4.setRebuildNext(false);
                        nVar2.K.setBusy(false);
                        return;
                    }
                    return;
                } else {
                    Log.d("VoiceLive", "field: style failed");
                    e eVar5 = nVar2.K;
                    if (eVar5 != null) {
                        eVar5.setBusy(false);
                        return;
                    }
                    return;
                }
            case 3:
                kg.f fVar = (kg.f) this.f18032b;
                TLObject tLObject = (TLObject) this.f18033c;
                fVar.f18406e = false;
                if (tLObject instanceof TL_account.connectedBots) {
                    connectedbots = (TL_account.connectedBots) tLObject;
                }
                fVar.f18405c = connectedbots;
                if (connectedbots != null) {
                    mp.u1(fVar.f18403a).f4(fVar.f18405c.users, false);
                }
                fVar.f18404b = System.currentTimeMillis();
                fVar.f18407f = true;
                fVar.d();
                return;
            case 4:
                k0 k0Var = (k0) this.f18032b;
                kg.f.a(k0Var.f30223a).b();
                ((ao0) this.f18033c).run();
                k0Var.dismiss();
                return;
            case 5:
                s0.a0((s0) this.f18032b, (TLObject) this.f18033c);
                return;
            case 6:
                e1 e1Var = (e1) this.f18032b;
                e1Var.getClass();
                e1Var.c0(((n41) this.f18033c).d);
                return;
            case 7:
                tr trVar = (tr) this.f18032b;
                v1 v1Var = (v1) this.f18033c;
                try {
                    try {
                        sQLitePreparedStatement2 = trVar.f27151b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, v1Var.f18601a);
                        sQLitePreparedStatement2.bindString(2, v1Var.f18602b);
                        sQLitePreparedStatement2.bindInteger(3, v1Var.f18603c);
                        sQLitePreparedStatement2.bindInteger(4, v1Var.f18605f);
                        sQLitePreparedStatement2.step();
                    } catch (Exception e10) {
                        a8.g(e10, true);
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
            case 8:
                w1 w1Var = (w1) this.f18032b;
                TLObject tLObject2 = (TLObject) this.f18033c;
                ArrayList arrayList2 = w1Var.f18615b;
                int i11 = w1Var.f18614a;
                if (tLObject2 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject2;
                    mp.u1(i11).f4(tL_messages_quickReplies.users, false);
                    mp.u1(i11).Z3(tL_messages_quickReplies.chats, false);
                    tr.a0(i11).m1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = 0; i12 < tL_messages_quickReplies.quick_replies.size(); i12++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i12);
                        v1 v1Var2 = new v1();
                        v1Var2.f18601a = tL_quickReply.shortcut_id;
                        v1Var2.f18602b = tL_quickReply.shortcut;
                        v1Var2.f18605f = tL_quickReply.count;
                        v1Var2.d = tL_quickReply.top_message;
                        v1Var2.f18603c = i12;
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i13);
                                if (message.f28513id != tL_quickReply.top_message) {
                                    i13++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            fj fjVar = new fj(i11, message, false, true);
                            v1Var2.f18604e = fjVar;
                            fjVar.r0(false);
                            v1Var2.f18604e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(v1Var2);
                    }
                    arrayList = arrayList3;
                }
                w1Var.f18617e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                w1Var.f18618f = true;
                w1Var.l();
                ks.f(i11).k(121, new Object[0]);
                return;
            case 9:
                tr trVar2 = (tr) this.f18033c;
                ArrayList arrayList4 = ((w1) this.f18032b).f18615b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar2.f27151b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i10 < arrayList4.size()) {
                            v1 v1Var3 = (v1) arrayList4.get(i10);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, v1Var3.f18601a);
                            sQLitePreparedStatement.bindString(2, v1Var3.f18602b);
                            sQLitePreparedStatement.bindInteger(3, v1Var3.f18603c);
                            sQLitePreparedStatement.bindInteger(4, v1Var3.f18605f);
                            sQLitePreparedStatement.step();
                            i10++;
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
            case 10:
                ki.j jVar = (ki.j) this.f18032b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.f18033c;
                if (userFull != null) {
                    jVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    jVar.f18815b0 = starrefprogram;
                    if (starrefprogram == null) {
                        jVar.Z = true;
                        jVar.f18815b0 = jVar.I0();
                        jVar.f18814a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        jVar.f18814a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = jVar.f18815b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                jVar.K0(true);
                return;
            case 11:
                t2 t2Var = (t2) this.f18032b;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.f18033c;
                t2Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    t2Var.k(botappsettings, true);
                    return;
                }
                return;
            case 12:
                t2 t2Var2 = (t2) this.f18032b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f18033c;
                if (!t2Var2.f19024e0) {
                    if (tL_error != null) {
                        t2Var2.o(false);
                        return;
                    } else {
                        g0.h3(t2Var2.f19044v0, 60000L);
                        return;
                    }
                }
                return;
            case 13:
                t2 t2Var3 = (t2) this.f18032b;
                fc Q = new kc(t2Var3.f19039r0, t2Var3.G).Q(2131623990, 36, g0.W2((String) this.f18033c));
                Q.f35091j = 5000;
                Q.k(true);
                return;
            case 14:
                i3 i3Var = (i3) this.f18032b;
                i3Var.getMessagesController().E3(null, (TLRPC.User) this.f18033c, null, i3Var.getClassGuid(), null, false, false);
                return;
            case 15:
                i3 i3Var2 = (i3) this.f18032b;
                i3Var2.getClass();
                i3Var2.presentFragment(bn.ua(((TL_payments.connectedBotStarRef) this.f18033c).bot_id));
                return;
            case 16:
                t3 t3Var = (t3) this.f18032b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f18033c;
                if (!t3Var.U) {
                    if (tL_error2 != null) {
                        t3Var.f37135b.dismiss();
                        return;
                    } else {
                        g0.h3(t3Var.V, 60000L);
                        return;
                    }
                }
                return;
            case 17:
                t3 t3Var2 = (t3) this.f18032b;
                fc Q2 = new kc(t3Var2.f37135b.f30229c, t3Var2.f37134a).Q(2131623990, 36, g0.W2((String) this.f18033c));
                Q2.f35091j = 5000;
                Q2.k(true);
                return;
            case 18:
                l2.g0 g0Var = (l2.g0) this.f18032b;
                m0 m0Var = (m0) this.f18033c;
                int i14 = g0Var.J - m0Var.f19531b;
                g0Var.J = i14;
                if (m0Var.d) {
                    g0Var.K = m0Var.f19533e;
                    g0Var.L = true;
                }
                if (i14 == 0) {
                    l1 l1Var = ((h1) m0Var.f19534f).f19470a;
                    if (!g0Var.f19440p0.f19470a.p() && l1Var.p()) {
                        g0Var.f19442q0 = -1;
                        g0Var.f19444r0 = 0L;
                    }
                    if (!l1Var.p()) {
                        List asList = Arrays.asList(((m1) l1Var).f19538l);
                        if (asList.size() == g0Var.f19439p.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        ma.p(z11);
                        for (int i15 = 0; i15 < asList.size(); i15++) {
                            ((c0) g0Var.f19439p.get(i15)).f19366c = (l1) asList.get(i15);
                        }
                    }
                    if (g0Var.L) {
                        if (((h1) m0Var.f19534f).f19470a.p() && g0Var.f19440p0.f19470a.p()) {
                            objArr = 1;
                        } else {
                            objArr = null;
                        }
                        boolean equals = ((h1) m0Var.f19534f).f19471b.equals(g0Var.f19440p0.f19471b);
                        if (((h1) m0Var.f19534f).d == g0Var.f19440p0.f19486s) {
                            objArr2 = 1;
                        } else {
                            objArr2 = null;
                        }
                        if (objArr != null || (equals && objArr2 != null)) {
                            z12 = false;
                        }
                        if (z12) {
                            int p02 = g0Var.p0();
                            if (!l1Var.p() && !((h1) m0Var.f19534f).f19471b.b()) {
                                h1 h1Var = (h1) m0Var.f19534f;
                                x2.g0 g0Var2 = h1Var.f19471b;
                                long j11 = h1Var.d;
                                Object obj = g0Var2.f60216a;
                                i1 i1Var = g0Var.f19437o;
                                l1Var.g(obj, i1Var);
                                j10 = j11 + i1Var.f10427e;
                            } else {
                                j10 = ((h1) m0Var.f19534f).d;
                            }
                            j3 = j10;
                            i7 = p02;
                            z10 = z12;
                            g0Var.L = false;
                            g0Var.D1((h1) m0Var.f19534f, 1, z10, g0Var.K, j3, i7, false);
                            return;
                        }
                        i7 = -1;
                        z10 = z12;
                    } else {
                        i7 = -1;
                        z10 = false;
                    }
                    j3 = -9223372036854775807L;
                    g0Var.L = false;
                    g0Var.D1((h1) m0Var.f19534f, 1, z10, g0Var.K, j3, i7, false);
                    return;
                }
                return;
            case 19:
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f18033c;
                ArrayList arrayList5 = ((a0) this.f18032b).f19342a.f19448t0;
                int size = arrayList5.size();
                while (i10 < size) {
                    Object obj2 = arrayList5.get(i10);
                    i10++;
                    ((h61) ((e2.w1) obj2)).K.onSurfaceTextureUpdated(surfaceTexture);
                }
                return;
            case 20:
                li.r rVar = (li.r) this.f18032b;
                rVar.getClass();
                rVar.presentFragment(bn.ua(((mi.f) this.f18033c).f21112b.f28641id));
                return;
            case 21:
                ((li.c0) this.f18032b).f20002u1.presentFragment(bn.ua(((mi.f) this.f18033c).f21112b.f28641id));
                return;
            case 22:
                ((m2.g) this.f18032b).d.reportTrackChangeEvent((TrackChangeEvent) this.f18033c);
                return;
            case 23:
                ((m2.g) this.f18032b).d.reportNetworkEvent((NetworkEvent) this.f18033c);
                return;
            case 24:
                ((m2.g) this.f18032b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f18033c);
                return;
            case 25:
                ((m2.g) this.f18032b).d.reportPlaybackMetrics((PlaybackMetrics) this.f18033c);
                return;
            case 26:
                ((m2.g) this.f18032b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.f18033c);
                return;
            case 27:
                String str2 = l0.f13778a;
                m2.d dVar = ((a0) ((s) ((jb.m) this.f18032b).f17465c)).f19342a.f19445s;
                m2.a U = dVar.U();
                dVar.V(U, 1012, new m2.c(U, (String) this.f18033c, 15));
                return;
            case 28:
                String str3 = l0.f13778a;
                j6.k.R(((a0) ((s) ((jb.m) this.f18032b).f17465c)).f19342a.F, (l2.d) this.f18033c);
                return;
            default:
                d0.a((d0) this.f18032b, (AudioRouting) this.f18033c);
                return;
        }
    }
}
