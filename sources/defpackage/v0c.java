package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.StateSet;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
public abstract class v0c {
    public static HashMap O;
    public static HashMap P;
    public static ArrayList Q;
    public Path C;
    public int D;
    public int E;
    public float F;
    public float G;
    public Paint H;
    public Paint I;
    public Paint J;
    public float K;
    public Path L;
    public float[] M;
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public Paint f;
    public Paint g;
    public Path h;
    public boolean i;
    public final ln j;
    public boolean k;
    public final ln l;
    public int m;
    public final p09 n;
    public int o;
    public final p09 p;
    public fg0 q;
    public final rc2 r;
    public final gx9 s;
    public final Rect u;
    public final Rect v;
    public final boolean x;
    public boolean y;
    public boolean z;
    public static final int[] N = {16842910, 16842919};
    public static final HashMap R = new HashMap();
    public static final HashMap S = new HashMap();
    public boolean w = false;
    public boolean A = false;
    public final l94 B = new l94();
    public long t = SystemClock.elapsedRealtime();

    public v0c(rc2 rc2Var, gx9 gx9Var) {
        boolean z = false;
        this.r = rc2Var;
        this.s = gx9Var;
        Rect rect = new Rect(0, 0, gm.L(30.0f), gm.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(gm.L(8.0f), gm.L(8.0f));
        p09 p09Var = new p09(2131624297, gm.L(26.0f), gm.L(26.0f));
        this.p = p09Var;
        p09Var.H(0);
        p09Var.setCallback(rc2Var);
        p09Var.N(19, new Runnable(this) {
            public final v0c b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                v0c v0cVar = this.b;
                switch (b) {
                    case 0:
                        v0cVar.p.stop();
                        p09 p09Var2 = v0cVar.n;
                        p09Var2.stop();
                        v0cVar.z = true;
                        v0cVar.y = true;
                        p09Var2.H(0);
                        return;
                    default:
                        v0cVar.n.stop();
                        p09 p09Var3 = v0cVar.p;
                        p09Var3.stop();
                        v0cVar.z = false;
                        v0cVar.y = false;
                        p09Var3.H(0);
                        return;
                }
            }
        });
        p09Var.E(true);
        p09 p09Var2 = new p09(2131624296, gm.L(26.0f), gm.L(26.0f));
        this.n = p09Var2;
        p09Var2.H(0);
        p09Var2.setCallback(rc2Var);
        p09Var2.M(rc2Var);
        p09Var2.N(19, new Runnable(this) {
            public final v0c b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                v0c v0cVar = this.b;
                switch (b) {
                    case 0:
                        v0cVar.p.stop();
                        p09 p09Var22 = v0cVar.n;
                        p09Var22.stop();
                        v0cVar.z = true;
                        v0cVar.y = true;
                        p09Var22.H(0);
                        return;
                    default:
                        v0cVar.n.stop();
                        p09 p09Var3 = v0cVar.p;
                        p09Var3.stop();
                        v0cVar.z = false;
                        v0cVar.y = false;
                        p09Var3.H(0);
                        return;
                }
            }
        });
        p09Var2.E(true);
        this.y = false;
        this.z = false;
        if (rc2Var.getMessageObject() != null && z8c.h(rc2Var.getMessageObject().K1).p()) {
            z = true;
        }
        this.x = z;
        d53 d53Var = d53.h;
        this.l = new ln(250L, rc2Var, d53Var);
        this.j = new ln(250L, rc2Var, d53Var);
    }

    public static boolean A(k47 k47Var) {
        if (k47Var != null) {
            int i = k47Var.K1;
            if (k47.Q4(k47Var.k) && ((j(k47Var) || DictationAsr.B(i)) && DictationAsr.C(i) && k47Var.L0() * 16000.0d * 4.0d < 3.145728E8d)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        float a = pqe.a(f, 0.0f, 1.0f);
        float a2 = pqe.a(f2, 0.0f, 1.0f) - a;
        if (a2 <= 0.0f) {
            return;
        }
        if (i4 == 1) {
            gm.P.set(i - i3, i2, i, i2 + i3);
        } else if (i4 == 2) {
            gm.P.set(i - i3, i2 - i3, i, i2);
        } else if (i4 == 3) {
            gm.P.set(i, i2 - i3, i + i3, i2);
        } else if (i4 == 4) {
            gm.P.set(i, i2, i + i3, i2 + i3);
        }
        path.addArc(gm.P, (a * 90.0f) + ((i4 * 90) - 180), a2 * 90.0f);
    }

    public static void b(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        if (f > f2) {
            float f5 = f4 - f3;
            a(path, i, i2, i3, i4, (f - f3) / f5, 1.0f);
            a(path, i, i2, i3, i4, 0.0f, (f2 - f3) / f5);
            return;
        }
        float f6 = f4 - f3;
        a(path, i, i2, i3, i4, Math.max(0.0f, f - f3) / f6, (Math.min(f2, f4) - f3) / f6);
    }

    public static void c(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        if (i != i3 || i2 != i4) {
            float a = pqe.a(f, 0.0f, 1.0f);
            float a2 = pqe.a(f2, 0.0f, 1.0f);
            if (a2 - a <= 0.0f) {
                return;
            }
            path.moveTo(gm.U1(a, i, i3), gm.U1(a, i2, i4));
            path.lineTo(gm.U1(a2, i, i3), gm.U1(a2, i2, i4));
        }
    }

    public static void d(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        if (f > f2) {
            float f5 = f4 - f3;
            c(path, i, i2, i3, i4, (f - f3) / f5, 1.0f);
            c(path, i, i2, i3, i4, 0.0f, (f2 - f3) / f5);
            return;
        }
        float f6 = f4 - f3;
        c(path, i, i2, i3, i4, Math.max(0.0f, f - f3) / f6, (Math.min(f2, f4) - f3) / f6);
    }

    public static boolean e(k47 k47Var) {
        if (k47Var != null) {
            int i = k47Var.K1;
            if (k47Var.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                oc7 r1 = oc7.r1(i);
                if (!i(k47Var)) {
                    if (r1.G3 > 0 && k47Var.L0() <= r1.l4.P1.f()) {
                        if (r1.H3 == 0 || connectionsManager.getCurrentTime() > r1.H3 || r1.I3 > 0) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean f(k47 k47Var, long j, String str) {
        k47 k47Var2;
        k47 k47Var3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j))) {
                k47Var2 = (k47) O.remove(Long.valueOf(j));
            } else {
                k47Var2 = null;
            }
            if (k47Var == null) {
                k47Var3 = k47Var2;
            } else {
                k47Var3 = k47Var;
            }
            if (k47Var3 != null && k47Var3.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(r(k47Var3)));
                }
                TLRPC.Message message = k47Var3.k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                cf7 Y = cf7.Y(k47Var3.K1);
                Y.a.c(new wz(Y, k47Var3.e1(), k47.B0(k47Var3.k), k47Var3.k, str, (byte) 6));
                gm.c3(new o0c(k47Var3, j, str, (byte) 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        oc7 r1 = oc7.r1(i);
        if (r1.G3 <= 0) {
            return 0;
        }
        if (r1.H3 != 0 && connectionsManager.getCurrentTime() <= r1.H3) {
            return r1.I3;
        }
        return r1.G3;
    }

    public static boolean i(k47 k47Var) {
        if (k47Var != null && k47Var.k != null) {
            oc7 r1 = oc7.r1(k47Var.K1);
            TLRPC.Chat L0 = r1.L0(Long.valueOf(k47Var.x0()));
            if (sd2.n0(L0) && L0.level >= r1.l4.Z1.f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j(k47 k47Var) {
        if (k47Var != null && pg3.B(k47.B0(k47Var.k))) {
            return true;
        }
        return false;
    }

    public static boolean k(k47 k47Var) {
        TLRPC.Message message;
        if (k47Var != null && (message = k47Var.k) != null && k47.Q4(message) && k47Var.p4()) {
            TLRPC.Message message2 = k47Var.k;
            if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal && message2.voiceTranscription != null && message2.voiceTranscriptionLocal && !A(k47Var)) {
                if ((z8c.h(k47Var.K1).p() || e(k47Var)) && !l(k47Var)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean l(k47 k47Var) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(k47Var) && !P.containsKey(Integer.valueOf(r(k47Var))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && k47Var != null && (message = k47Var.k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean m(k47 k47Var) {
        if (Q != null) {
            if (!k47Var.g4() || Q.contains(Integer.valueOf(r(k47Var)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void n(k47 k47Var) {
        R.remove(Integer.valueOf(r(k47Var)));
        S.remove(Integer.valueOf(r(k47Var)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(r(k47Var)));
        }
        if (e21.a) {
            fc4.b("local transcription of msg_id=" + k47Var.e1() + " failed");
        }
        nm7.f(k47Var.K1).k(nm7.A1, k47Var);
    }

    public static void o(k47 k47Var) {
        n(k47Var);
        if (e21.a) {
            fc4.b("local transcription of msg_id=" + k47Var.e1() + ": no model and no auto-download, opening speech settings");
        }
        d S2 = LaunchActivity.S();
        if (S2 != null) {
            S2.presentFragment(new ana());
        }
    }

    public static void q(k47 k47Var) {
        if (k47Var != null && !m(k47Var)) {
            ArrayList arrayList = Q;
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                Q = arrayList;
            }
            arrayList.add(Integer.valueOf(r(k47Var)));
        }
    }

    public static int r(k47 k47Var) {
        if (k47Var == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(k47Var.K1), Long.valueOf(k47.B0(k47Var.k)), Integer.valueOf(k47Var.e1()));
    }

    public static void v(k47 k47Var, boolean z) {
        TLRPC.Message message = k47Var.k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            cf7 Y = cf7.Y(k47Var.K1);
            long B0 = k47.B0(k47Var.k);
            Y.a.c(new o77(Y, k47Var.e1(), B0, k47Var.k, (byte) 11));
            if (z) {
                gm.c3(new au1(k47Var, (byte) 4));
            }
        }
    }

    public static boolean w(k47 k47Var) {
        if (k47Var != null) {
            int i = k47Var.K1;
            if (k47Var.k == null || i(k47Var) || A(k47Var) || !TextUtils.isEmpty(k47Var.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            oc7 r1 = oc7.r1(i);
            if (!z8c.h(i).p() && r1.H3 != 0 && connectionsManager.getCurrentTime() <= r1.H3 && r1.I3 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void x(k47 k47Var) {
        Integer valueOf = Integer.valueOf(r(k47Var));
        k47 k47Var2 = (k47) R.remove(valueOf);
        Runnable runnable = (Runnable) S.remove(valueOf);
        if (k47Var2 == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(valueOf);
        }
        k47[] k47VarArr = {k47Var2, k47Var};
        for (int i = 0; i < 2; i++) {
            TLRPC.Message message = k47VarArr[i].k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (e21.a) {
            fc4.b("local transcription of msg_id=" + k47Var.e1() + " stopped");
        }
        nm7.f(k47Var2.K1).k(nm7.A1, k47Var2);
    }

    public static void y(k47 k47Var, String str) {
        ArrayList arrayList;
        int i = k47Var.K1;
        long B0 = k47.B0(k47Var.k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = (ArrayList) bo3.a.get(Long.valueOf(B0));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        in3 V = DictationAsr.V(arrayList);
        if (e21.a) {
            fc4.b("local transcription of msg_id=" + k47Var.e1() + " with " + V);
        }
        Integer valueOf = Integer.valueOf(r(k47Var));
        HashMap hashMap = S;
        t0c t0cVar = new t0c(valueOf, k47Var, i, B0, elapsedRealtime);
        boolean[] zArr = {false};
        DictationLid.a(a.b);
        new Thread(new xo1(str, zArr, t0cVar, V), "DictationAsrFile").start();
        hashMap.put(valueOf, new rm1(zArr, (byte) 1));
    }

    public static void z(final k47 k47Var, boolean z, final mc2 mc2Var) {
        ArrayList arrayList;
        gn3 gn3Var;
        if (k47Var != null && k47Var.k != null && k47Var.p4()) {
            final int i = k47Var.K1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer l1 = oc7.r1(i).l1(k47Var.k.peer_id);
            final long m = pg3.m(l1);
            TLRPC.Message message = k47Var.k;
            final int i2 = message.id;
            int i3 = 0;
            if (z) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal && (!message.voiceTranscriptionLocal || A(k47Var))) {
                    q(k47Var);
                    k47Var.k.voiceTranscriptionOpen = true;
                    cf7 Y = cf7.Y(i);
                    Y.a.c(new o77(Y, i2, m, k47Var.k, (byte) 11));
                    gm.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b = r3;
                            k47 k47Var2 = k47Var;
                            int i4 = i;
                            switch (b) {
                                case 0:
                                    nm7 f = nm7.f(i4);
                                    Boolean bool = Boolean.TRUE;
                                    f.k(116, k47Var2, null, null, bool, bool);
                                    return;
                                default:
                                    nm7.f(i4).k(116, k47Var2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (A(k47Var)) {
                    ArrayList arrayList2 = (ArrayList) bo3.a.get(Long.valueOf(k47.B0(k47Var.k)));
                    if (arrayList2 != null) {
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    in3 V = DictationAsr.V(arrayList);
                    if (V != null && ((gn3Var = (gn3) V.b) == null || gn3Var.f != 0 || DictationAsr.y(gn3Var) || jo3.b())) {
                        int i4 = k47Var.K1;
                        if (P == null) {
                            P = new HashMap();
                        }
                        Integer valueOf = Integer.valueOf(r(k47Var));
                        P.put(valueOf, k47Var);
                        R.put(valueOf, k47Var);
                        bc4.G(i4);
                        File M = bc4.M(k47Var.k, false, true);
                        if (M != null && M.exists()) {
                            y(k47Var, M.getAbsolutePath());
                            return;
                        }
                        String r = bc4.r(null, k47Var.F0());
                        nm7 f = nm7.f(i4);
                        s0c s0cVar = new s0c(r, f, k47Var, mc2Var);
                        f.a(s0cVar, nm7.Y1);
                        f.a(s0cVar, nm7.Z1);
                        S.put(valueOf, new b7b(f, s0cVar, (byte) 25));
                        bc4.G(i4).X(k47Var.F0(), k47Var, 3, 0);
                        return;
                    }
                    o(k47Var);
                    return;
                } else if (j(k47Var)) {
                    n(k47Var);
                    return;
                } else {
                    if (e21.a) {
                        fc4.b("sending Transcription request, msg_id=" + i2 + " dialog_id=" + m);
                    }
                    TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                    tL_messages_transcribeAudio.peer = l1;
                    tL_messages_transcribeAudio.msg_id = i2;
                    HashMap hashMap = P;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        P = hashMap;
                    }
                    hashMap.put(Integer.valueOf(r(k47Var)), k47Var);
                    if (!z8c.h(i).p()) {
                        i3 = 1024;
                    }
                    ConnectionsManager.getInstance(i).sendRequest(tL_messages_transcribeAudio, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            boolean z2;
                            long j;
                            String str;
                            boolean z3 = tLObject instanceof TLRPC.TL_messages_transcribedAudio;
                            int i5 = i;
                            mc2 mc2Var2 = mc2Var;
                            k47 k47Var2 = k47Var;
                            String str2 = "";
                            if (z3) {
                                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) tLObject;
                                String str3 = tL_messages_transcribedAudio.text;
                                j = tL_messages_transcribedAudio.transcription_id;
                                boolean z4 = tL_messages_transcribedAudio.pending;
                                boolean z5 = !z4;
                                if (TextUtils.isEmpty(str3)) {
                                    if (z4) {
                                        str2 = null;
                                    }
                                } else {
                                    str2 = str3;
                                }
                                if ((tL_messages_transcribedAudio.flags & 2) != 0) {
                                    oc7 r1 = oc7.r1(i5);
                                    int i6 = tL_messages_transcribedAudio.trial_remains_num;
                                    if (i6 != r1.I3) {
                                        r1.I3 = i6;
                                        r1.X3.edit().putInt("transcribeAudioTrialCurrentNumber", r1.I3).apply();
                                    }
                                    oc7 r12 = oc7.r1(i5);
                                    int i7 = tL_messages_transcribedAudio.trial_remains_until_date;
                                    if (i7 != r12.H3) {
                                        r12.H3 = i7;
                                        r12.X3.edit().putInt("transcribeAudioTrialCooldownUntil", r12.H3).apply();
                                        gm.c3(new g87(r12, (byte) 9));
                                    }
                                    gm.c3(new b7b(mc2Var2, tL_messages_transcribedAudio, (byte) 24));
                                }
                                HashMap hashMap2 = v0c.O;
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                    v0c.O = hashMap2;
                                }
                                hashMap2.put(Long.valueOf(j), k47Var2);
                                k47Var2.k.voiceTranscriptionId = j;
                                z2 = z5;
                            } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                                oc7 r13 = oc7.r1(i5);
                                if (r13.I3 != 0) {
                                    r13.I3 = 0;
                                    r13.X3.edit().putInt("transcribeAudioTrialCurrentNumber", r13.I3).apply();
                                }
                                oc7 r14 = oc7.r1(i5);
                                int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i5).getCurrentTime();
                                if (intValue != r14.H3) {
                                    r14.H3 = intValue;
                                    r14.X3.edit().putInt("transcribeAudioTrialCooldownUntil", r14.H3).apply();
                                    gm.c3(new g87(r14, (byte) 9));
                                }
                                gm.c3(new v99(k47Var2, mc2Var2, i5, (byte) 27));
                                return;
                            } else {
                                z2 = true;
                                j = 0;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            v0c.q(k47Var2);
                            TLRPC.Message message2 = k47Var2.k;
                            message2.voiceTranscriptionOpen = true;
                            message2.voiceTranscriptionFinal = z2;
                            message2.voiceTranscriptionLocal = false;
                            message2.voiceTranscriptionWords = null;
                            if (e21.a) {
                                fc4.b("Transcription request sent, received final=" + z2 + " id=" + j + " text=" + str2);
                            }
                            cf7 Y2 = cf7.Y(i5);
                            String str4 = str2;
                            Y2.a.c(new wz(Y2, i2, m, k47Var2.k, str4, (byte) 6));
                            if (z2) {
                                gm.d3(new o0c(k47Var2, j, str4, (byte) 1), Math.max(0L, 350 - elapsedRealtime2));
                            }
                        }
                    }, i3);
                    return;
                }
            }
            x(k47Var);
            HashMap hashMap2 = P;
            if (hashMap2 != null) {
                hashMap2.remove(Integer.valueOf(r(k47Var)));
            }
            k47Var.k.voiceTranscriptionOpen = false;
            cf7 Y2 = cf7.Y(i);
            Y2.a.c(new o77(Y2, i2, m, k47Var.k, (byte) 11));
            gm.c3(new Runnable() {
                @Override
                public final void run() {
                    byte b = r3;
                    k47 k47Var2 = k47Var;
                    int i42 = i;
                    switch (b) {
                        case 0:
                            nm7 f2 = nm7.f(i42);
                            Boolean bool = Boolean.TRUE;
                            f2.k(116, k47Var2, null, null, bool, bool);
                            return;
                        default:
                            nm7.f(i42).k(116, k47Var2, null, null, Boolean.FALSE, null);
                            return;
                    }
                }
            });
        }
    }

    public final int B() {
        return this.u.width();
    }

    public final int h() {
        return this.u.height();
    }

    public final void p() {
        boolean z;
        rc2 rc2Var = this.r;
        if (rc2Var != null) {
            this.w = false;
            boolean z2 = this.z;
            boolean z3 = !z2;
            boolean z4 = this.x;
            if (!z2) {
                z = !this.k;
                if ((z4 || e(rc2Var.getMessageObject()) || A(rc2Var.getMessageObject())) && rc2Var.getMessageObject().p4()) {
                    s(true, true);
                }
            } else {
                u(false, true);
                s(false, true);
                z = true;
            }
            fg0 fg0Var = this.q;
            if (fg0Var != null) {
                fg0Var.setState(StateSet.NOTHING);
                rc2Var.invalidate();
            }
            this.A = false;
            if (z) {
                if (!z4 && !z2) {
                    if (!e(rc2Var.getMessageObject()) && !A(rc2Var.getMessageObject()) && (rc2Var.getMessageObject() == null || rc2Var.getMessageObject().k == null || TextUtils.isEmpty(rc2Var.getMessageObject().k.voiceTranscription))) {
                        if (rc2Var.getDelegate() != null) {
                            if (oc7.r1(rc2Var.a6).G3 > 0) {
                                rc2Var.getDelegate().Y(3);
                                return;
                            } else {
                                rc2Var.getDelegate().Y(0);
                                return;
                            }
                        }
                        return;
                    }
                    z(rc2Var.getMessageObject(), z3, rc2Var.getDelegate());
                    return;
                }
                if (!z2) {
                    this.w = true;
                }
                z(rc2Var.getMessageObject(), z3, rc2Var.getDelegate());
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        this.k = z;
        gx9 gx9Var = this.s;
        if (!gx9Var.z && z && gx9Var.B.c <= 0.0f) {
            gx9Var.A = SystemClock.elapsedRealtime();
        }
        gx9Var.z = z;
        rc2 rc2Var = gx9Var.n;
        if (rc2Var != null) {
            rc2Var.invalidate();
        }
        ln lnVar = this.l;
        if (!z2) {
            lnVar.f(this.k, true);
        } else if (lnVar.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        rc2 rc2Var2 = this.r;
        if (rc2Var2 != null) {
            rc2Var2.invalidate();
        }
    }

    public final void t(boolean z, boolean z2) {
        rc2 rc2Var;
        if (this.i != z && (rc2Var = this.r) != null) {
            rc2Var.invalidate();
        }
        this.i = z;
        if (!z2) {
            this.j.f(z, true);
        }
    }

    public final void u(boolean z, boolean z2) {
        boolean z3 = this.z;
        if (!z3 && z && this.w) {
            this.w = false;
            ((bc2) this).T.a.T2 = true;
        }
        this.z = z;
        p09 p09Var = this.p;
        p09 p09Var2 = this.n;
        if (z2) {
            if (z) {
                if (!z3) {
                    this.y = false;
                    p09Var2.H(0);
                    p09Var.H(0);
                    p09Var.start();
                }
            } else if (z3) {
                this.y = true;
                p09Var.H(0);
                p09Var2.H(0);
                p09Var2.start();
            }
        } else {
            this.y = z;
            p09Var2.stop();
            p09Var.stop();
            p09Var2.H(0);
            p09Var.H(0);
        }
        rc2 rc2Var = this.r;
        if (rc2Var != null) {
            rc2Var.invalidate();
        }
    }
}
