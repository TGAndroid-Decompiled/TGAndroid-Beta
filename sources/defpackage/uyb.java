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
public abstract class uyb {
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
    public final lm j;
    public boolean k;
    public final lm l;
    public int m;
    public final oy8 n;
    public int o;
    public final oy8 p;
    public ff0 q;
    public final gb2 r;
    public final dv9 s;
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
    public final c84 B = new c84();
    public long t = SystemClock.elapsedRealtime();

    public uyb(gb2 gb2Var, dv9 dv9Var) {
        boolean z = false;
        this.r = gb2Var;
        this.s = dv9Var;
        Rect rect = new Rect(0, 0, gl.L(30.0f), gl.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(gl.L(8.0f), gl.L(8.0f));
        oy8 oy8Var = new oy8(2131624297, gl.L(26.0f), gl.L(26.0f));
        this.p = oy8Var;
        oy8Var.H(0);
        oy8Var.setCallback(gb2Var);
        oy8Var.N(19, new Runnable(this) {
            public final uyb b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                uyb uybVar = this.b;
                switch (b) {
                    case 0:
                        uybVar.p.stop();
                        oy8 oy8Var2 = uybVar.n;
                        oy8Var2.stop();
                        uybVar.z = true;
                        uybVar.y = true;
                        oy8Var2.H(0);
                        return;
                    default:
                        uybVar.n.stop();
                        oy8 oy8Var3 = uybVar.p;
                        oy8Var3.stop();
                        uybVar.z = false;
                        uybVar.y = false;
                        oy8Var3.H(0);
                        return;
                }
            }
        });
        oy8Var.E(true);
        oy8 oy8Var2 = new oy8(2131624296, gl.L(26.0f), gl.L(26.0f));
        this.n = oy8Var2;
        oy8Var2.H(0);
        oy8Var2.setCallback(gb2Var);
        oy8Var2.M(gb2Var);
        oy8Var2.N(19, new Runnable(this) {
            public final uyb b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                uyb uybVar = this.b;
                switch (b) {
                    case 0:
                        uybVar.p.stop();
                        oy8 oy8Var22 = uybVar.n;
                        oy8Var22.stop();
                        uybVar.z = true;
                        uybVar.y = true;
                        oy8Var22.H(0);
                        return;
                    default:
                        uybVar.n.stop();
                        oy8 oy8Var3 = uybVar.p;
                        oy8Var3.stop();
                        uybVar.z = false;
                        uybVar.y = false;
                        oy8Var3.H(0);
                        return;
                }
            }
        });
        oy8Var2.E(true);
        this.y = false;
        this.z = false;
        if (gb2Var.getMessageObject() != null && y6c.h(gb2Var.getMessageObject().K1).p()) {
            z = true;
        }
        this.x = z;
        s33 s33Var = s33.h;
        this.l = new lm(250L, gb2Var, s33Var);
        this.j = new lm(250L, gb2Var, s33Var);
    }

    public static boolean A(k27 k27Var) {
        if (k27Var != null) {
            int i = k27Var.K1;
            if (k27.Q4(k27Var.k) && ((j(k27Var) || DictationAsr.B(i)) && DictationAsr.C(i) && k27Var.L0() * 16000.0d * 4.0d < 3.145728E8d)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        float a = moe.a(f, 0.0f, 1.0f);
        float a2 = moe.a(f2, 0.0f, 1.0f) - a;
        if (a2 <= 0.0f) {
            return;
        }
        if (i4 == 1) {
            gl.P.set(i - i3, i2, i, i2 + i3);
        } else if (i4 == 2) {
            gl.P.set(i - i3, i2 - i3, i, i2);
        } else if (i4 == 3) {
            gl.P.set(i, i2 - i3, i + i3, i2);
        } else if (i4 == 4) {
            gl.P.set(i, i2, i + i3, i2 + i3);
        }
        path.addArc(gl.P, (a * 90.0f) + ((i4 * 90) - 180), a2 * 90.0f);
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
            float a = moe.a(f, 0.0f, 1.0f);
            float a2 = moe.a(f2, 0.0f, 1.0f);
            if (a2 - a <= 0.0f) {
                return;
            }
            path.moveTo(gl.U1(a, i, i3), gl.U1(a, i2, i4));
            path.lineTo(gl.U1(a2, i, i3), gl.U1(a2, i2, i4));
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

    public static boolean e(k27 k27Var) {
        if (k27Var != null) {
            int i = k27Var.K1;
            if (k27Var.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                na7 q1 = na7.q1(i);
                if (!i(k27Var)) {
                    if (q1.G3 > 0 && k27Var.L0() <= q1.k4.P1.f()) {
                        if (q1.H3 == 0 || connectionsManager.getCurrentTime() > q1.H3 || q1.I3 > 0) {
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

    public static boolean f(k27 k27Var, long j, String str) {
        k27 k27Var2;
        k27 k27Var3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j))) {
                k27Var2 = (k27) O.remove(Long.valueOf(j));
            } else {
                k27Var2 = null;
            }
            if (k27Var == null) {
                k27Var3 = k27Var2;
            } else {
                k27Var3 = k27Var;
            }
            if (k27Var3 != null && k27Var3.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(r(k27Var3)));
                }
                TLRPC.Message message = k27Var3.k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                ad7 Y = ad7.Y(k27Var3.K1);
                Y.a.c(new wy(Y, k27Var3.e1(), k27.B0(k27Var3.k), k27Var3.k, str, (byte) 6));
                gl.d3(new nyb(k27Var3, j, str, (byte) 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        na7 q1 = na7.q1(i);
        if (q1.G3 <= 0) {
            return 0;
        }
        if (q1.H3 != 0 && connectionsManager.getCurrentTime() <= q1.H3) {
            return q1.I3;
        }
        return q1.G3;
    }

    public static boolean i(k27 k27Var) {
        if (k27Var != null && k27Var.k != null) {
            na7 q1 = na7.q1(k27Var.K1);
            TLRPC.Chat K0 = q1.K0(Long.valueOf(k27Var.x0()));
            if (hc2.n0(K0) && K0.level >= q1.k4.Z1.f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j(k27 k27Var) {
        if (k27Var != null && cf3.B(k27.B0(k27Var.k))) {
            return true;
        }
        return false;
    }

    public static boolean k(k27 k27Var) {
        TLRPC.Message message;
        if (k27Var != null && (message = k27Var.k) != null && k27.Q4(message) && k27Var.p4()) {
            TLRPC.Message message2 = k27Var.k;
            if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal && message2.voiceTranscription != null && message2.voiceTranscriptionLocal && !A(k27Var)) {
                if ((y6c.h(k27Var.K1).p() || e(k27Var)) && !l(k27Var)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean l(k27 k27Var) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(k27Var) && !P.containsKey(Integer.valueOf(r(k27Var))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && k27Var != null && (message = k27Var.k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean m(k27 k27Var) {
        if (Q != null) {
            if (!k27Var.g4() || Q.contains(Integer.valueOf(r(k27Var)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void n(k27 k27Var) {
        R.remove(Integer.valueOf(r(k27Var)));
        S.remove(Integer.valueOf(r(k27Var)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(r(k27Var)));
        }
        if (w01.a) {
            fa4.b("local transcription of msg_id=" + k27Var.e1() + " failed");
        }
        kk7.f(k27Var.K1).k(kk7.z1, k27Var);
    }

    public static void o(k27 k27Var) {
        n(k27Var);
        if (w01.a) {
            fa4.b("local transcription of msg_id=" + k27Var.e1() + ": no model and no auto-download, opening speech settings");
        }
        d S2 = LaunchActivity.S();
        if (S2 != null) {
            S2.presentFragment(new zka());
        }
    }

    public static void q(k27 k27Var) {
        if (k27Var != null && !m(k27Var)) {
            ArrayList arrayList = Q;
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                Q = arrayList;
            }
            arrayList.add(Integer.valueOf(r(k27Var)));
        }
    }

    public static int r(k27 k27Var) {
        if (k27Var == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(k27Var.K1), Long.valueOf(k27.B0(k27Var.k)), Integer.valueOf(k27Var.e1()));
    }

    public static void v(k27 k27Var, boolean z) {
        TLRPC.Message message = k27Var.k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            ad7 Y = ad7.Y(k27Var.K1);
            long B0 = k27.B0(k27Var.k);
            Y.a.c(new o57(Y, k27Var.e1(), B0, k27Var.k, (byte) 11));
            if (z) {
                gl.d3(new os1(k27Var, (byte) 4));
            }
        }
    }

    public static boolean w(k27 k27Var) {
        if (k27Var != null) {
            int i = k27Var.K1;
            if (k27Var.k == null || i(k27Var) || A(k27Var) || !TextUtils.isEmpty(k27Var.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            na7 q1 = na7.q1(i);
            if (!y6c.h(i).p() && q1.H3 != 0 && connectionsManager.getCurrentTime() <= q1.H3 && q1.I3 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void x(k27 k27Var) {
        Integer valueOf = Integer.valueOf(r(k27Var));
        k27 k27Var2 = (k27) R.remove(valueOf);
        Runnable runnable = (Runnable) S.remove(valueOf);
        if (k27Var2 == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(valueOf);
        }
        k27[] k27VarArr = {k27Var2, k27Var};
        for (int i = 0; i < 2; i++) {
            TLRPC.Message message = k27VarArr[i].k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (w01.a) {
            fa4.b("local transcription of msg_id=" + k27Var.e1() + " stopped");
        }
        kk7.f(k27Var2.K1).k(kk7.z1, k27Var2);
    }

    public static void y(k27 k27Var, String str) {
        ArrayList arrayList;
        int i = k27Var.K1;
        long B0 = k27.B0(k27Var.k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = (ArrayList) qm3.a.get(Long.valueOf(B0));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        xl3 V = DictationAsr.V(arrayList);
        if (w01.a) {
            fa4.b("local transcription of msg_id=" + k27Var.e1() + " with " + V);
        }
        Integer valueOf = Integer.valueOf(r(k27Var));
        HashMap hashMap = S;
        syb sybVar = new syb(valueOf, k27Var, i, B0, elapsedRealtime);
        boolean[] zArr = {false};
        DictationLid.a(a.b);
        new Thread(new hn1(str, zArr, sybVar, V), "DictationAsrFile").start();
        hashMap.put(valueOf, new il1(zArr, (byte) 1));
    }

    public static void z(final k27 k27Var, boolean z, final bb2 bb2Var) {
        ArrayList arrayList;
        vl3 vl3Var;
        if (k27Var != null && k27Var.k != null && k27Var.p4()) {
            final int i = k27Var.K1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer k1 = na7.q1(i).k1(k27Var.k.peer_id);
            final long m = cf3.m(k1);
            TLRPC.Message message = k27Var.k;
            final int i2 = message.id;
            int i3 = 0;
            if (z) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal && (!message.voiceTranscriptionLocal || A(k27Var))) {
                    q(k27Var);
                    k27Var.k.voiceTranscriptionOpen = true;
                    ad7 Y = ad7.Y(i);
                    Y.a.c(new o57(Y, i2, m, k27Var.k, (byte) 11));
                    gl.d3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b = r3;
                            k27 k27Var2 = k27Var;
                            int i4 = i;
                            switch (b) {
                                case 0:
                                    kk7 f = kk7.f(i4);
                                    Boolean bool = Boolean.TRUE;
                                    f.k(115, k27Var2, null, null, bool, bool);
                                    return;
                                default:
                                    kk7.f(i4).k(115, k27Var2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (A(k27Var)) {
                    ArrayList arrayList2 = (ArrayList) qm3.a.get(Long.valueOf(k27.B0(k27Var.k)));
                    if (arrayList2 != null) {
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    xl3 V = DictationAsr.V(arrayList);
                    if (V != null && ((vl3Var = (vl3) V.b) == null || vl3Var.f != 0 || DictationAsr.y(vl3Var) || zm3.b())) {
                        int i4 = k27Var.K1;
                        if (P == null) {
                            P = new HashMap();
                        }
                        Integer valueOf = Integer.valueOf(r(k27Var));
                        P.put(valueOf, k27Var);
                        R.put(valueOf, k27Var);
                        ba4.G(i4);
                        File M = ba4.M(k27Var.k, false, true);
                        if (M != null && M.exists()) {
                            y(k27Var, M.getAbsolutePath());
                            return;
                        }
                        String r = ba4.r(null, k27Var.F0());
                        kk7 f = kk7.f(i4);
                        ryb rybVar = new ryb(r, f, k27Var, bb2Var);
                        f.a(rybVar, kk7.X1);
                        f.a(rybVar, kk7.Y1);
                        S.put(valueOf, new a5b(f, rybVar, (byte) 23));
                        ba4.G(i4).X(k27Var.F0(), k27Var, 3, 0);
                        return;
                    }
                    o(k27Var);
                    return;
                } else if (j(k27Var)) {
                    n(k27Var);
                    return;
                } else {
                    if (w01.a) {
                        fa4.b("sending Transcription request, msg_id=" + i2 + " dialog_id=" + m);
                    }
                    TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                    tL_messages_transcribeAudio.peer = k1;
                    tL_messages_transcribeAudio.msg_id = i2;
                    HashMap hashMap = P;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        P = hashMap;
                    }
                    hashMap.put(Integer.valueOf(r(k27Var)), k27Var);
                    if (!y6c.h(i).p()) {
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
                            bb2 bb2Var2 = bb2Var;
                            k27 k27Var2 = k27Var;
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
                                    na7 q1 = na7.q1(i5);
                                    int i6 = tL_messages_transcribedAudio.trial_remains_num;
                                    if (i6 != q1.I3) {
                                        q1.I3 = i6;
                                        q1.X3.edit().putInt("transcribeAudioTrialCurrentNumber", q1.I3).apply();
                                    }
                                    na7 q12 = na7.q1(i5);
                                    int i7 = tL_messages_transcribedAudio.trial_remains_until_date;
                                    if (i7 != q12.H3) {
                                        q12.H3 = i7;
                                        q12.X3.edit().putInt("transcribeAudioTrialCooldownUntil", q12.H3).apply();
                                        gl.d3(new f67(q12, (byte) 8));
                                    }
                                    gl.d3(new a5b(bb2Var2, tL_messages_transcribedAudio, (byte) 22));
                                }
                                HashMap hashMap2 = uyb.O;
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                    uyb.O = hashMap2;
                                }
                                hashMap2.put(Long.valueOf(j), k27Var2);
                                k27Var2.k.voiceTranscriptionId = j;
                                z2 = z5;
                            } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                                na7 q13 = na7.q1(i5);
                                if (q13.I3 != 0) {
                                    q13.I3 = 0;
                                    q13.X3.edit().putInt("transcribeAudioTrialCurrentNumber", q13.I3).apply();
                                }
                                na7 q14 = na7.q1(i5);
                                int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i5).getCurrentTime();
                                if (intValue != q14.H3) {
                                    q14.H3 = intValue;
                                    q14.X3.edit().putInt("transcribeAudioTrialCooldownUntil", q14.H3).apply();
                                    gl.d3(new f67(q14, (byte) 8));
                                }
                                gl.d3(new t79(k27Var2, bb2Var2, i5, (byte) 27));
                                return;
                            } else {
                                z2 = true;
                                j = 0;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            uyb.q(k27Var2);
                            TLRPC.Message message2 = k27Var2.k;
                            message2.voiceTranscriptionOpen = true;
                            message2.voiceTranscriptionFinal = z2;
                            message2.voiceTranscriptionLocal = false;
                            message2.voiceTranscriptionWords = null;
                            if (w01.a) {
                                fa4.b("Transcription request sent, received final=" + z2 + " id=" + j + " text=" + str2);
                            }
                            ad7 Y2 = ad7.Y(i5);
                            String str4 = str2;
                            Y2.a.c(new wy(Y2, i2, m, k27Var2.k, str4, (byte) 6));
                            if (z2) {
                                gl.e3(new nyb(k27Var2, j, str4, (byte) 1), Math.max(0L, 350 - elapsedRealtime2));
                            }
                        }
                    }, i3);
                    return;
                }
            }
            x(k27Var);
            HashMap hashMap2 = P;
            if (hashMap2 != null) {
                hashMap2.remove(Integer.valueOf(r(k27Var)));
            }
            k27Var.k.voiceTranscriptionOpen = false;
            ad7 Y2 = ad7.Y(i);
            Y2.a.c(new o57(Y2, i2, m, k27Var.k, (byte) 11));
            gl.d3(new Runnable() {
                @Override
                public final void run() {
                    byte b = r3;
                    k27 k27Var2 = k27Var;
                    int i42 = i;
                    switch (b) {
                        case 0:
                            kk7 f2 = kk7.f(i42);
                            Boolean bool = Boolean.TRUE;
                            f2.k(115, k27Var2, null, null, bool, bool);
                            return;
                        default:
                            kk7.f(i42).k(115, k27Var2, null, null, Boolean.FALSE, null);
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
        gb2 gb2Var = this.r;
        if (gb2Var != null) {
            this.w = false;
            boolean z2 = this.z;
            boolean z3 = !z2;
            boolean z4 = this.x;
            if (!z2) {
                z = !this.k;
                if ((z4 || e(gb2Var.getMessageObject()) || A(gb2Var.getMessageObject())) && gb2Var.getMessageObject().p4()) {
                    s(true, true);
                }
            } else {
                u(false, true);
                s(false, true);
                z = true;
            }
            ff0 ff0Var = this.q;
            if (ff0Var != null) {
                ff0Var.setState(StateSet.NOTHING);
                gb2Var.invalidate();
            }
            this.A = false;
            if (z) {
                if (!z4 && !z2) {
                    if (!e(gb2Var.getMessageObject()) && !A(gb2Var.getMessageObject()) && (gb2Var.getMessageObject() == null || gb2Var.getMessageObject().k == null || TextUtils.isEmpty(gb2Var.getMessageObject().k.voiceTranscription))) {
                        if (gb2Var.getDelegate() != null) {
                            if (na7.q1(gb2Var.a6).G3 > 0) {
                                gb2Var.getDelegate().c0(3);
                                return;
                            } else {
                                gb2Var.getDelegate().c0(0);
                                return;
                            }
                        }
                        return;
                    }
                    z(gb2Var.getMessageObject(), z3, gb2Var.getDelegate());
                    return;
                }
                if (!z2) {
                    this.w = true;
                }
                z(gb2Var.getMessageObject(), z3, gb2Var.getDelegate());
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        this.k = z;
        dv9 dv9Var = this.s;
        if (!dv9Var.z && z && dv9Var.B.c <= 0.0f) {
            dv9Var.A = SystemClock.elapsedRealtime();
        }
        dv9Var.z = z;
        gb2 gb2Var = dv9Var.n;
        if (gb2Var != null) {
            gb2Var.invalidate();
        }
        lm lmVar = this.l;
        if (!z2) {
            lmVar.f(this.k, true);
        } else if (lmVar.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        gb2 gb2Var2 = this.r;
        if (gb2Var2 != null) {
            gb2Var2.invalidate();
        }
    }

    public final void t(boolean z, boolean z2) {
        gb2 gb2Var;
        if (this.i != z && (gb2Var = this.r) != null) {
            gb2Var.invalidate();
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
            ((qa2) this).T.a.T2 = true;
        }
        this.z = z;
        oy8 oy8Var = this.p;
        oy8 oy8Var2 = this.n;
        if (z2) {
            if (z) {
                if (!z3) {
                    this.y = false;
                    oy8Var2.H(0);
                    oy8Var.H(0);
                    oy8Var.start();
                }
            } else if (z3) {
                this.y = true;
                oy8Var.H(0);
                oy8Var2.H(0);
                oy8Var2.start();
            }
        } else {
            this.y = z;
            oy8Var2.stop();
            oy8Var.stop();
            oy8Var2.H(0);
            oy8Var.H(0);
        }
        gb2 gb2Var = this.r;
        if (gb2Var != null) {
            gb2Var.invalidate();
        }
    }
}
