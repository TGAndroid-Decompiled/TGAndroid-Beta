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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
public abstract class u2c {
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
    public final mm j;
    public boolean k;
    public final mm l;
    public int m;
    public final b29 n;
    public int o;
    public final b29 p;
    public hf0 q;
    public final wb2 r;
    public final xy9 s;
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
    public final x84 B = new x84();
    public long t = SystemClock.elapsedRealtime();

    public u2c(wb2 wb2Var, xy9 xy9Var) {
        boolean z = false;
        this.r = wb2Var;
        this.s = xy9Var;
        Rect rect = new Rect(0, 0, hl.L(30.0f), hl.L(30.0f));
        this.u = rect;
        Rect rect2 = new Rect(rect);
        this.v = rect2;
        rect2.inset(hl.L(8.0f), hl.L(8.0f));
        b29 b29Var = new b29(2131624297, hl.L(26.0f), hl.L(26.0f));
        this.p = b29Var;
        b29Var.H(0);
        b29Var.setCallback(wb2Var);
        b29Var.N(19, new Runnable(this) {
            public final u2c b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                u2c u2cVar = this.b;
                switch (b) {
                    case 0:
                        u2cVar.p.stop();
                        b29 b29Var2 = u2cVar.n;
                        b29Var2.stop();
                        u2cVar.z = true;
                        u2cVar.y = true;
                        b29Var2.H(0);
                        return;
                    default:
                        u2cVar.n.stop();
                        b29 b29Var3 = u2cVar.p;
                        b29Var3.stop();
                        u2cVar.z = false;
                        u2cVar.y = false;
                        b29Var3.H(0);
                        return;
                }
            }
        });
        b29Var.E(true);
        b29 b29Var2 = new b29(2131624296, hl.L(26.0f), hl.L(26.0f));
        this.n = b29Var2;
        b29Var2.H(0);
        b29Var2.setCallback(wb2Var);
        b29Var2.M(wb2Var);
        b29Var2.N(19, new Runnable(this) {
            public final u2c b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                u2c u2cVar = this.b;
                switch (b) {
                    case 0:
                        u2cVar.p.stop();
                        b29 b29Var22 = u2cVar.n;
                        b29Var22.stop();
                        u2cVar.z = true;
                        u2cVar.y = true;
                        b29Var22.H(0);
                        return;
                    default:
                        u2cVar.n.stop();
                        b29 b29Var3 = u2cVar.p;
                        b29Var3.stop();
                        u2cVar.z = false;
                        u2cVar.y = false;
                        b29Var3.H(0);
                        return;
                }
            }
        });
        b29Var2.E(true);
        this.y = false;
        this.z = false;
        if (wb2Var.getMessageObject() != null && yac.h(wb2Var.getMessageObject().K1).p()) {
            z = true;
        }
        this.x = z;
        k43 k43Var = k43.h;
        this.l = new mm(250L, wb2Var, k43Var);
        this.j = new mm(250L, wb2Var, k43Var);
    }

    public static boolean A(r47 r47Var) {
        if (r47Var != null) {
            int i = r47Var.K1;
            if (r47.Q4(r47Var.k) && ((j(r47Var) || DictationAsr.C(i)) && DictationAsr.x(i) && qn3.h() && r47Var.L0() * 16000.0d * 4.0d < 3.145728E8d)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        float a = ete.a(f, 0.0f, 1.0f);
        float a2 = ete.a(f2, 0.0f, 1.0f) - a;
        if (a2 <= 0.0f) {
            return;
        }
        if (i4 == 1) {
            hl.P.set(i - i3, i2, i, i2 + i3);
        } else if (i4 == 2) {
            hl.P.set(i - i3, i2 - i3, i, i2);
        } else if (i4 == 3) {
            hl.P.set(i, i2 - i3, i + i3, i2);
        } else if (i4 == 4) {
            hl.P.set(i, i2, i + i3, i2 + i3);
        }
        path.addArc(hl.P, (a * 90.0f) + ((i4 * 90) - 180), a2 * 90.0f);
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
            float a = ete.a(f, 0.0f, 1.0f);
            float a2 = ete.a(f2, 0.0f, 1.0f);
            if (a2 - a <= 0.0f) {
                return;
            }
            path.moveTo(hl.U1(a, i, i3), hl.U1(a, i2, i4));
            path.lineTo(hl.U1(a2, i, i3), hl.U1(a2, i2, i4));
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

    public static boolean e(r47 r47Var) {
        if (r47Var != null) {
            int i = r47Var.K1;
            if (r47Var.k != null) {
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                uc7 s1 = uc7.s1(i);
                if (!i(r47Var)) {
                    if (s1.G3 > 0 && r47Var.L0() <= s1.k4.X1.f()) {
                        if (s1.H3 == 0 || connectionsManager.getCurrentTime() > s1.H3 || s1.I3 > 0) {
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

    public static boolean f(r47 r47Var, long j, String str) {
        r47 r47Var2;
        r47 r47Var3;
        try {
            HashMap hashMap = O;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j))) {
                r47Var2 = (r47) O.remove(Long.valueOf(j));
            } else {
                r47Var2 = null;
            }
            if (r47Var == null) {
                r47Var3 = r47Var2;
            } else {
                r47Var3 = r47Var;
            }
            if (r47Var3 != null && r47Var3.k != null) {
                HashMap hashMap2 = P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(r(r47Var3)));
                }
                TLRPC.Message message = r47Var3.k;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionWords = null;
                jf7 Y = jf7.Y(r47Var3.K1);
                Y.a.c(new wy(Y, r47Var3.e1(), r47.B0(r47Var3.k), r47Var3.k, str, (byte) 6));
                hl.c3(new n2c(r47Var3, j, str, (byte) 0));
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static int g(int i) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        uc7 s1 = uc7.s1(i);
        if (s1.G3 <= 0) {
            return 0;
        }
        if (s1.H3 != 0 && connectionsManager.getCurrentTime() <= s1.H3) {
            return s1.I3;
        }
        return s1.G3;
    }

    public static boolean i(r47 r47Var) {
        if (r47Var != null && r47Var.k != null) {
            uc7 s1 = uc7.s1(r47Var.K1);
            TLRPC.Chat M0 = s1.M0(Long.valueOf(r47Var.x0()));
            if (xc2.n0(M0) && M0.level >= s1.k4.h2.f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j(r47 r47Var) {
        if (r47Var != null && wf3.B(r47.B0(r47Var.k))) {
            return true;
        }
        return false;
    }

    public static boolean k(r47 r47Var) {
        TLRPC.Message message;
        if (r47Var != null && (message = r47Var.k) != null && r47.Q4(message) && r47Var.p4()) {
            TLRPC.Message message2 = r47Var.k;
            if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal && message2.voiceTranscription != null && message2.voiceTranscriptionLocal && !A(r47Var)) {
                if ((yac.h(r47Var.K1).p() || e(r47Var)) && !l(r47Var)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean l(r47 r47Var) {
        TLRPC.Message message;
        HashMap hashMap = P;
        if (hashMap == null || (!hashMap.containsValue(r47Var) && !P.containsKey(Integer.valueOf(r(r47Var))))) {
            HashMap hashMap2 = O;
            if (hashMap2 != null && r47Var != null && (message = r47Var.k) != null && hashMap2.containsKey(Long.valueOf(message.voiceTranscriptionId))) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean m(r47 r47Var) {
        if (Q != null) {
            if (!r47Var.g4() || Q.contains(Integer.valueOf(r(r47Var)))) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void n(r47 r47Var) {
        R.remove(Integer.valueOf(r(r47Var)));
        S.remove(Integer.valueOf(r(r47Var)));
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(r(r47Var)));
        }
        if (f11.a) {
            cc4.b("local transcription of msg_id=" + r47Var.e1() + " failed");
        }
        jn7.f(r47Var.K1).k(jn7.A1, r47Var);
    }

    public static void o(r47 r47Var) {
        n(r47Var);
        if (f11.a) {
            cc4.b("local transcription of msg_id=" + r47Var.e1() + ": no model and no auto-download, opening speech settings");
        }
        e S2 = LaunchActivity.S();
        if (S2 != null) {
            S2.presentFragment(new woa());
        }
    }

    public static void q(r47 r47Var) {
        if (r47Var != null && !m(r47Var)) {
            ArrayList arrayList = Q;
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                Q = arrayList;
            }
            arrayList.add(Integer.valueOf(r(r47Var)));
        }
    }

    public static int r(r47 r47Var) {
        if (r47Var == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(r47Var.K1), Long.valueOf(r47.B0(r47Var.k)), Integer.valueOf(r47Var.e1()));
    }

    public static void v(r47 r47Var, boolean z) {
        TLRPC.Message message = r47Var.k;
        if (message != null) {
            message.voiceTranscriptionForce = true;
            jf7 Y = jf7.Y(r47Var.K1);
            long B0 = r47.B0(r47Var.k);
            Y.a.c(new r77(Y, r47Var.e1(), B0, r47Var.k, (byte) 11));
            if (z) {
                hl.c3(new bt1(r47Var, (byte) 4));
            }
        }
    }

    public static boolean w(r47 r47Var) {
        if (r47Var != null) {
            int i = r47Var.K1;
            if (r47Var.k == null || i(r47Var) || A(r47Var) || !TextUtils.isEmpty(r47Var.k.voiceTranscription)) {
                return false;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            uc7 s1 = uc7.s1(i);
            if (!yac.h(i).p() && s1.H3 != 0 && connectionsManager.getCurrentTime() <= s1.H3 && s1.I3 <= 0) {
                return true;
            }
        }
        return false;
    }

    public static void x(r47 r47Var) {
        Integer valueOf = Integer.valueOf(r(r47Var));
        r47 r47Var2 = (r47) R.remove(valueOf);
        Runnable runnable = (Runnable) S.remove(valueOf);
        if (r47Var2 == null) {
            return;
        }
        if (runnable != null) {
            runnable.run();
        }
        HashMap hashMap = P;
        if (hashMap != null) {
            hashMap.remove(valueOf);
        }
        r47[] r47VarArr = {r47Var2, r47Var};
        for (int i = 0; i < 2; i++) {
            TLRPC.Message message = r47VarArr[i].k;
            if (message != null && message.voiceTranscriptionLocal && !message.voiceTranscriptionFinal) {
                message.voiceTranscription = null;
                message.voiceTranscriptionWords = null;
                message.voiceTranscriptionLocal = false;
                message.voiceTranscriptionOpen = false;
            }
        }
        if (f11.a) {
            cc4.b("local transcription of msg_id=" + r47Var.e1() + " stopped");
        }
        jn7.f(r47Var2.K1).k(jn7.A1, r47Var2);
    }

    public static void y(r47 r47Var, String str) {
        ArrayList arrayList;
        int i = r47Var.K1;
        long B0 = r47.B0(r47Var.k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList2 = (ArrayList) in3.a.get(Long.valueOf(B0));
        if (arrayList2 != null) {
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = new ArrayList();
        }
        pm3 X = DictationAsr.X(arrayList);
        if (f11.a) {
            cc4.b("local transcription of msg_id=" + r47Var.e1() + " with " + X);
        }
        Integer valueOf = Integer.valueOf(r(r47Var));
        HashMap hashMap = S;
        s2c s2cVar = new s2c(valueOf, r47Var, i, B0, elapsedRealtime);
        boolean[] zArr = {false};
        DictationLid.a(a.b);
        new Thread(new ao1(str, zArr, s2cVar, X, (byte) 14), "DictationAsrFile").start();
        hashMap.put(valueOf, new om1(zArr, (byte) 2));
    }

    public static void z(final r47 r47Var, boolean z, final rb2 rb2Var) {
        ArrayList arrayList;
        nm3 nm3Var;
        if (r47Var != null && r47Var.k != null && r47Var.p4()) {
            final int i = r47Var.K1;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            TLRPC.InputPeer m1 = uc7.s1(i).m1(r47Var.k.peer_id);
            final long m = wf3.m(m1);
            TLRPC.Message message = r47Var.k;
            final int i2 = message.id;
            int i3 = 0;
            if (z) {
                if (message.voiceTranscription != null && message.voiceTranscriptionFinal && (!message.voiceTranscriptionLocal || A(r47Var))) {
                    q(r47Var);
                    r47Var.k.voiceTranscriptionOpen = true;
                    jf7 Y = jf7.Y(i);
                    Y.a.c(new r77(Y, i2, m, r47Var.k, (byte) 11));
                    hl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            byte b = r3;
                            r47 r47Var2 = r47Var;
                            int i4 = i;
                            switch (b) {
                                case 0:
                                    jn7 f = jn7.f(i4);
                                    Boolean bool = Boolean.TRUE;
                                    f.k(116, r47Var2, null, null, bool, bool);
                                    return;
                                default:
                                    jn7.f(i4).k(116, r47Var2, null, null, Boolean.FALSE, null);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (A(r47Var)) {
                    ArrayList arrayList2 = (ArrayList) in3.a.get(Long.valueOf(r47.B0(r47Var.k)));
                    if (arrayList2 != null) {
                        arrayList = new ArrayList(arrayList2);
                    } else {
                        arrayList = new ArrayList();
                    }
                    pm3 X = DictationAsr.X(arrayList);
                    if (X != null && ((nm3Var = (nm3) X.b) == null || nm3Var.f != 0 || DictationAsr.z(nm3Var) || qn3.b())) {
                        int i4 = r47Var.K1;
                        if (P == null) {
                            P = new HashMap();
                        }
                        Integer valueOf = Integer.valueOf(r(r47Var));
                        P.put(valueOf, r47Var);
                        R.put(valueOf, r47Var);
                        xb4.G(i4);
                        File M = xb4.M(r47Var.k, false, true);
                        if (M != null && M.exists()) {
                            y(r47Var, M.getAbsolutePath());
                            return;
                        }
                        String r = xb4.r(null, r47Var.F0());
                        jn7 f = jn7.f(i4);
                        r2c r2cVar = new r2c(r, f, r47Var, rb2Var);
                        f.a(r2cVar, jn7.Y1);
                        f.a(r2cVar, jn7.Z1);
                        S.put(valueOf, new bcb(f, r2cVar, (byte) 20));
                        xb4.G(i4).X(r47Var.F0(), r47Var, 3, 0);
                        return;
                    }
                    o(r47Var);
                    return;
                } else if (j(r47Var)) {
                    n(r47Var);
                    return;
                } else {
                    if (f11.a) {
                        cc4.b("sending Transcription request, msg_id=" + i2 + " dialog_id=" + m);
                    }
                    TLRPC.TL_messages_transcribeAudio tL_messages_transcribeAudio = new TLRPC.TL_messages_transcribeAudio();
                    tL_messages_transcribeAudio.peer = m1;
                    tL_messages_transcribeAudio.msg_id = i2;
                    HashMap hashMap = P;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                        P = hashMap;
                    }
                    hashMap.put(Integer.valueOf(r(r47Var)), r47Var);
                    if (!yac.h(i).p()) {
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
                            rb2 rb2Var2 = rb2Var;
                            r47 r47Var2 = r47Var;
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
                                    uc7 s1 = uc7.s1(i5);
                                    int i6 = tL_messages_transcribedAudio.trial_remains_num;
                                    if (i6 != s1.I3) {
                                        s1.I3 = i6;
                                        s1.X3.edit().putInt("transcribeAudioTrialCurrentNumber", s1.I3).apply();
                                    }
                                    uc7 s12 = uc7.s1(i5);
                                    int i7 = tL_messages_transcribedAudio.trial_remains_until_date;
                                    if (i7 != s12.H3) {
                                        s12.H3 = i7;
                                        s12.X3.edit().putInt("transcribeAudioTrialCooldownUntil", s12.H3).apply();
                                        hl.c3(new l87(s12, (byte) 8));
                                    }
                                    hl.c3(new bcb(rb2Var2, tL_messages_transcribedAudio, (byte) 19));
                                }
                                HashMap hashMap2 = u2c.O;
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                    u2c.O = hashMap2;
                                }
                                hashMap2.put(Long.valueOf(j), r47Var2);
                                r47Var2.k.voiceTranscriptionId = j;
                                z2 = z5;
                            } else if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
                                uc7 s13 = uc7.s1(i5);
                                if (s13.I3 != 0) {
                                    s13.I3 = 0;
                                    s13.X3.edit().putInt("transcribeAudioTrialCurrentNumber", s13.I3).apply();
                                }
                                uc7 s14 = uc7.s1(i5);
                                int intValue = Utilities.z(tL_error.text).intValue() + ConnectionsManager.getInstance(i5).getCurrentTime();
                                if (intValue != s14.H3) {
                                    s14.H3 = intValue;
                                    s14.X3.edit().putInt("transcribeAudioTrialCooldownUntil", s14.H3).apply();
                                    hl.c3(new l87(s14, (byte) 8));
                                }
                                hl.c3(new a39(r47Var2, rb2Var2, i5, (byte) 28));
                                return;
                            } else {
                                z2 = true;
                                j = 0;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                            u2c.q(r47Var2);
                            TLRPC.Message message2 = r47Var2.k;
                            message2.voiceTranscriptionOpen = true;
                            message2.voiceTranscriptionFinal = z2;
                            message2.voiceTranscriptionLocal = false;
                            message2.voiceTranscriptionWords = null;
                            if (f11.a) {
                                cc4.b("Transcription request sent, received final=" + z2 + " id=" + j + " text=" + str2);
                            }
                            jf7 Y2 = jf7.Y(i5);
                            String str4 = str2;
                            Y2.a.c(new wy(Y2, i2, m, r47Var2.k, str4, (byte) 6));
                            if (z2) {
                                hl.d3(new n2c(r47Var2, j, str4, (byte) 1), Math.max(0L, 350 - elapsedRealtime2));
                            }
                        }
                    }, i3);
                    return;
                }
            }
            x(r47Var);
            HashMap hashMap2 = P;
            if (hashMap2 != null) {
                hashMap2.remove(Integer.valueOf(r(r47Var)));
            }
            r47Var.k.voiceTranscriptionOpen = false;
            jf7 Y2 = jf7.Y(i);
            Y2.a.c(new r77(Y2, i2, m, r47Var.k, (byte) 11));
            hl.c3(new Runnable() {
                @Override
                public final void run() {
                    byte b = r3;
                    r47 r47Var2 = r47Var;
                    int i42 = i;
                    switch (b) {
                        case 0:
                            jn7 f2 = jn7.f(i42);
                            Boolean bool = Boolean.TRUE;
                            f2.k(116, r47Var2, null, null, bool, bool);
                            return;
                        default:
                            jn7.f(i42).k(116, r47Var2, null, null, Boolean.FALSE, null);
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
        wb2 wb2Var = this.r;
        if (wb2Var != null) {
            this.w = false;
            boolean z2 = this.z;
            boolean z3 = !z2;
            boolean z4 = this.x;
            if (!z2) {
                z = !this.k;
                if ((z4 || e(wb2Var.getMessageObject()) || A(wb2Var.getMessageObject())) && wb2Var.getMessageObject().p4()) {
                    s(true, true);
                }
            } else {
                u(false, true);
                s(false, true);
                z = true;
            }
            hf0 hf0Var = this.q;
            if (hf0Var != null) {
                hf0Var.setState(StateSet.NOTHING);
                wb2Var.invalidate();
            }
            this.A = false;
            if (z) {
                if (!z4 && !z2) {
                    if (!e(wb2Var.getMessageObject()) && !A(wb2Var.getMessageObject()) && (wb2Var.getMessageObject() == null || wb2Var.getMessageObject().k == null || TextUtils.isEmpty(wb2Var.getMessageObject().k.voiceTranscription))) {
                        if (wb2Var.getDelegate() != null) {
                            if (uc7.s1(wb2Var.a6).G3 > 0) {
                                wb2Var.getDelegate().Y(3);
                                return;
                            } else {
                                wb2Var.getDelegate().Y(0);
                                return;
                            }
                        }
                        return;
                    }
                    z(wb2Var.getMessageObject(), z3, wb2Var.getDelegate());
                    return;
                }
                if (!z2) {
                    this.w = true;
                }
                z(wb2Var.getMessageObject(), z3, wb2Var.getDelegate());
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        this.k = z;
        xy9 xy9Var = this.s;
        if (!xy9Var.z && z && xy9Var.B.c <= 0.0f) {
            xy9Var.A = SystemClock.elapsedRealtime();
        }
        xy9Var.z = z;
        wb2 wb2Var = xy9Var.n;
        if (wb2Var != null) {
            wb2Var.invalidate();
        }
        mm mmVar = this.l;
        if (!z2) {
            mmVar.f(this.k, true);
        } else if (mmVar.c <= 0.0f) {
            this.t = SystemClock.elapsedRealtime();
        }
        wb2 wb2Var2 = this.r;
        if (wb2Var2 != null) {
            wb2Var2.invalidate();
        }
    }

    public final void t(boolean z, boolean z2) {
        wb2 wb2Var;
        if (this.i != z && (wb2Var = this.r) != null) {
            wb2Var.invalidate();
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
            ((gb2) this).T.a.T2 = true;
        }
        this.z = z;
        b29 b29Var = this.p;
        b29 b29Var2 = this.n;
        if (z2) {
            if (z) {
                if (!z3) {
                    this.y = false;
                    b29Var2.H(0);
                    b29Var.H(0);
                    b29Var.start();
                }
            } else if (z3) {
                this.y = true;
                b29Var.H(0);
                b29Var2.H(0);
                b29Var2.start();
            }
        } else {
            this.y = z;
            b29Var2.stop();
            b29Var.stop();
            b29Var2.H(0);
            b29Var.H(0);
        }
        wb2 wb2Var = this.r;
        if (wb2Var != null) {
            wb2Var.invalidate();
        }
    }
}
