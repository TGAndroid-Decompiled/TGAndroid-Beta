package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
public final class snc implements bo3 {
    public static boolean p0;
    public static final HashMap q0 = new HashMap();
    public volatile char E;
    public volatile byte F;
    public volatile boolean G;
    public String H;
    public String[] J;
    public boolean K;
    public knc L;
    public long O;
    public long P;
    public boolean U;
    public co3 V;
    public m7 Y;
    public int Z;
    public final Context a;
    public int a0;
    public final c b;
    public float b0;
    public sm3 d;
    public int d0;
    public ekb e;
    public co3 f;
    public String g0;
    public vnc h;
    public int h0;
    public String i0;
    public boolean j0;
    public boolean k0;
    public String n0;
    public long r;
    public long s;
    public volatile long w;
    public volatile long x;
    public volatile int y;
    public byte c = 0;
    public String n = "";
    public final onc I = new onc(this, (byte) 0);
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public float Q = 0.0f;
    public float R = 1.0f;
    public float S = 0.0f;
    public float T = 1.0f;
    public final float[] W = new float[3];
    public final onc X = new onc(this, (byte) 1);
    public String c0 = "";
    public final int[] e0 = new int[2];
    public final int[] f0 = new int[2];
    public final lnc l0 = new lnc(this, (byte) 0);
    public final onc m0 = new onc(this, (byte) 2);
    public final lnc o0 = new lnc(this, (byte) 2);

    public snc(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
    }

    public static ArrayList x(String[] strArr, boolean z, pcc pccVar) {
        String[] strArr2;
        pcc pccVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            int i2 = i + 1;
            nm3 N = DictationAsr.N(str);
            if (N != null) {
                strArr2 = N.d(str);
            } else {
                strArr2 = new String[0];
            }
            String[] strArr3 = strArr2;
            if (strArr3.length < 2) {
                arrayList.add(null);
                pccVar2 = pccVar;
            } else {
                String i0 = DictationAsr.i0(N, str);
                ArrayList arrayList2 = new ArrayList();
                int i3 = -1;
                for (int i4 = 0; i4 < strArr3.length; i4++) {
                    arrayList2.add(bn3.R(strArr3[i4]));
                    if (!z && DictationAsr.A(str) && strArr3[i4].equals(i0)) {
                        i3 = i4;
                    }
                }
                pccVar2 = pccVar;
                arrayList.add(new pnc(bn3.S(i0), arrayList2, i3, new zo2(str, strArr3, pccVar2, i2, (byte) 8)));
            }
            pccVar = pccVar2;
            i = i2;
        }
        return arrayList;
    }

    @Override
    public final void a(String str, String str2) {
        if (this.c == 2) {
            if (!str.isEmpty()) {
                this.n = str;
            }
            StringBuilder p = ik8.p("recogniser ended error=", str2, " chars=");
            p.append(this.n.length());
            p.append(" (the voice recording goes on)");
            Log.d("VoiceLive", p.toString());
            this.f = null;
            if (r2f.a == this) {
                r2f.a = null;
            }
            this.d = null;
            this.e = null;
            boolean isEmpty = TextUtils.isEmpty(this.n.trim());
            vnc vncVar = this.h;
            if (isEmpty) {
                if (vncVar != null) {
                    vncVar.m();
                }
            } else if (vncVar != null) {
                vncVar.setText(this.n);
                this.h.setListening(false);
            }
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        ArrayList arrayList2 = this.N;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public final void c() {
        String e0 = DictationAsr.e0();
        if (e0 != null) {
            String L = bn3.L(e0);
            vnc vncVar = this.h;
            if (vncVar != null) {
                vncVar.setLanguage(L);
            }
            knc kncVar = this.L;
            if (kncVar != null && this.K) {
                this.n0 = L;
                kncVar.setLanguage(L);
            }
        }
    }

    @Override
    public final void e(float f) {
        if (this.c == 2) {
            if (this.K) {
                knc kncVar = this.L;
                if (kncVar != null) {
                    kncVar.setLevel(f);
                    return;
                }
                return;
            }
            vnc vncVar = this.h;
            if (vncVar != null) {
                vncVar.setLevel(f);
            }
        }
    }

    @Override
    public final void f(String str) {
        h(-1, str);
    }

    public final void g() {
        ArrayList arrayList = this.M;
        ArrayList arrayList2 = this.N;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    @Override
    public final void h(int i, String str) {
        if (this.c == 2) {
            if (str == null) {
                str = "";
            }
            this.n = str;
            vnc vncVar = this.h;
            if (vncVar != null) {
                vncVar.t(i, str);
            }
        }
    }

    @Override
    public final void i(String str) {
        String L;
        if (str == null) {
            L = null;
        } else {
            L = bn3.L(str);
        }
        vnc vncVar = this.h;
        if (vncVar != null && this.c == 2) {
            vncVar.setLanguage(L);
        }
        knc kncVar = this.L;
        if (kncVar != null && this.K && this.c == 2) {
            this.n0 = L;
            kncVar.setLanguage(L);
        }
    }

    public final boolean[] j(ArrayList arrayList, float f, float f2) {
        long max;
        boolean z;
        boolean[] zArr = new boolean[arrayList.size()];
        if (this.c == 4) {
            long j = this.P;
            if (j > 0 && (f > 0.001f || f2 < 0.999f)) {
                float f3 = (float) j;
                long j2 = f * f3;
                long j3 = f2 * f3;
                int i = 0;
                long j4 = 0;
                while (i < arrayList.size()) {
                    long j5 = ((rnc) arrayList.get(i)).b;
                    if (((rnc) arrayList.get(i)).c >= 0) {
                        max = ((rnc) arrayList.get(i)).c;
                    } else {
                        max = Math.max(j4, j5 - 900);
                    }
                    long j6 = (max + j5) / 2;
                    if (j6 >= j2 && j6 <= j3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zArr[i] = z;
                    i++;
                    j4 = j5;
                }
            }
        }
        return zArr;
    }

    public final void k(String str, boolean z) {
        boolean z2;
        vnc vncVar;
        knc kncVar;
        knc kncVar2;
        String str2;
        String str3;
        byte b = this.c;
        if (b != 0 || this.h != null || this.L != null) {
            if (this.K && b == 4 && this.b.c() && ("chat paused".equals(str) || "destroy".equals(str))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.K && this.c != 0 && !z2) {
                q0.remove(s());
            }
            if (this.c != 0) {
                StringBuilder p = ik8.p("dispose (", str, ") state=");
                byte b2 = this.c;
                if (b2 == 2) {
                    str3 = "live";
                } else if (b2 == 3) {
                    str3 = "review";
                } else if (b2 == 4) {
                    str3 = "paused";
                } else {
                    str3 = "buffering";
                }
                p.append(str3);
                p.append(" chars=");
                p.append(this.n.length());
                p.append(" chunks=");
                p.append(this.y);
                Log.d("VoiceLive", p.toString());
            }
            this.c = (byte) 0;
            this.H = null;
            hl.r(this.X);
            co3 co3Var = this.V;
            if (co3Var != null) {
                co3Var.c();
                this.V = null;
            }
            l(true);
            if (z2) {
                if (this.V == null) {
                    g();
                }
                qnc qncVar = new qnc();
                ArrayList arrayList = qncVar.a;
                ArrayList arrayList2 = this.M;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    rnc rncVar = (rnc) obj;
                    rnc rncVar2 = new rnc(rncVar.a, rncVar.b);
                    rncVar2.c = rncVar.c;
                    arrayList.add(rncVar2);
                }
                ArrayList arrayList3 = this.N;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    rnc rncVar3 = (rnc) obj2;
                    rnc rncVar4 = new rnc(rncVar3.a, rncVar3.b);
                    rncVar4.c = rncVar3.c;
                    arrayList.add(rncVar4);
                }
                qncVar.b = this.P;
                qncVar.c = this.Q;
                qncVar.d = this.R;
                qncVar.e = this.g0;
                qncVar.g = this.h0;
                qncVar.f = this.i0;
                qncVar.h = this.j0;
                qncVar.i = this.n0;
                q0.put(s(), qncVar);
                StringBuilder sb = new StringBuilder("field: kept for the chat (");
                sb.append(arrayList.size());
                sb.append(" words");
                if (this.g0 != null) {
                    str2 = ", styled / edited";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(")");
                Log.d("VoiceLive", sb.toString());
            }
            this.g0 = null;
            this.i0 = null;
            this.k0 = false;
            if (!z || (kncVar2 = this.L) == null || !kncVar2.R) {
                this.b.g(Float.NaN, 0.0f);
            }
            if (z && (kncVar = this.L) != null && kncVar.R) {
                kncVar.R = false;
                kncVar.f0 = -1;
                kncVar.invalidate();
            }
            hl.r(this.I);
            DictationAsr.V(this.o0);
            hl.r(this.m0);
            hl.r(this.l0);
            if (r2f.a == this) {
                r2f.a = null;
            }
            co3 co3Var2 = this.f;
            if (co3Var2 != null) {
                co3Var2.c();
                this.f = null;
            }
            sm3 sm3Var = this.d;
            if (sm3Var != null) {
                sm3Var.d();
                this.d = null;
            }
            this.e = null;
            if (z && (vncVar = this.h) != null) {
                vncVar.m();
            }
        }
    }

    public final void l(boolean z) {
        String obj;
        m7 m7Var = this.Y;
        if (m7Var == null) {
            return;
        }
        this.Y = null;
        if (m7Var.getText() == null) {
            obj = this.n;
        } else {
            obj = m7Var.getText().toString();
        }
        this.n = obj;
        this.g0 = obj.trim();
        this.h0 = b().size();
        if (z && this.L != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.n);
            this.L.D(arrayList, null, false);
        }
        if (m7Var.hasFocus()) {
            hl.t1(m7Var);
        }
        hl.B2(m7Var);
    }

    public final void m(Object obj) {
        String str;
        if (obj != null && !this.k0 && this.L != null) {
            boolean z = false;
            if (this.Y != null) {
                l(false);
            }
            String str2 = this.i0;
            if (str2 == null) {
                str2 = this.n.trim();
                this.i0 = str2;
                if (this.g0 != null) {
                    z = true;
                }
                this.j0 = z;
            }
            if (!str2.isEmpty()) {
                this.k0 = true;
                this.L.setBusy(true);
                StringBuilder sb = new StringBuilder("field: style ");
                c cVar = this.b;
                cVar.getClass();
                if (obj instanceof cm3) {
                    str = ((cm3) obj).a();
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(" in place on ");
                sb.append(str2.length());
                sb.append(" chars");
                Log.d("VoiceLive", sb.toString());
                cVar.f(obj, str2, new cz3(this, SystemClock.uptimeMillis(), (byte) 3));
            }
        }
    }

    public final void n(String str) {
        boolean z;
        long j;
        if (this.c == 4) {
            z = true;
        } else {
            z = false;
        }
        k(str, false);
        knc kncVar = this.L;
        if (kncVar == null) {
            return;
        }
        slc slcVar = new slc(this, kncVar, (byte) 3);
        if (z) {
            j = 470;
        } else {
            j = 60;
        }
        hl.d3(slcVar, j);
    }

    public final void o(ByteBuffer byteBuffer, int i, int i2, int i3) {
        sm3 sm3Var = this.d;
        ekb ekbVar = this.e;
        if (sm3Var != null && ekbVar != null) {
            this.E = i2;
            this.F = i3;
            this.y++;
            this.w += i;
            int c = ekbVar.c(byteBuffer, i, i2);
            if (ekbVar.b <= 0) {
                if (!this.G) {
                    this.G = true;
                    Log.w("VoiceLive", "recorder rate " + i2 + " Hz isn't a multiple of 16 kHz: no transcript");
                }
            } else if (c > 0) {
                this.x += c;
                byte[] bArr = (byte[]) ekbVar.g;
                if (c > 0) {
                    synchronized (sm3Var.a) {
                        if (sm3Var.d) {
                            return;
                        }
                        sm3Var.a(c, bArr);
                        int i4 = c / 2;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = i5 << 1;
                            double d = (short) ((bArr[i6] & 255) | (bArr[i6 + 1] << 8));
                            sm3Var.h = (d * d) + sm3Var.h;
                        }
                        int i7 = sm3Var.i + i4;
                        sm3Var.i = i7;
                        if (i7 >= 1600) {
                            double sqrt = Math.sqrt(sm3Var.h / Math.max(1, i7));
                            sm3Var.h = 0.0d;
                            sm3Var.i = 0;
                            xn3 xn3Var = sm3Var.g;
                            if (xn3Var != null) {
                                xn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void p(co3 co3Var, String str, int i) {
        if (co3Var == this.f || co3Var == this.V) {
            if (!this.K) {
                h(i, str);
                return;
            }
            byte b = this.c;
            if (b != 2 && b != 4) {
                return;
            }
            w(co3Var, str);
            q();
        }
    }

    public final void q() {
        int i;
        ArrayList b = b();
        m7 m7Var = this.Y;
        int i2 = 0;
        if (m7Var != null) {
            Editable text = m7Var.getText();
            if (text != null) {
                int i3 = this.a0;
                String str = "";
                if (i3 < 0 || this.c0.length() + i3 != text.length() || !text.toString().substring(this.a0).equals(this.c0)) {
                    this.Z = Math.min(this.d0, b.size());
                    this.a0 = text.length();
                    this.c0 = "";
                }
                if (this.Z > b.size()) {
                    this.Z = b.size();
                }
                this.d0 = b.size();
                StringBuilder sb = new StringBuilder();
                for (int i4 = this.Z; i4 < b.size(); i4++) {
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(((rnc) b.get(i4)).a);
                }
                if (sb.length() != 0 || !this.c0.isEmpty()) {
                    if (sb.length() > 0 && (i = this.a0) > 0 && !Character.isWhitespace(text.charAt(i - 1))) {
                        i2 = 1;
                    }
                    if (sb.length() != 0) {
                        if (i2 != 0) {
                            str = " ";
                        }
                        str = str + ((Object) sb);
                    }
                    if (!str.equals(this.c0)) {
                        text.replace(this.a0, text.length(), str);
                        this.c0 = str;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean[] zArr = null;
        if (this.g0 != null) {
            if (this.h0 > b.size()) {
                this.h0 = b.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.g0);
            StringBuilder sb2 = new StringBuilder(this.g0);
            for (int i5 = this.h0; i5 < b.size(); i5++) {
                arrayList.add(((rnc) b.get(i5)).a);
                sb2.append(' ');
                sb2.append(((rnc) b.get(i5)).a);
            }
            this.n = sb2.toString();
            knc kncVar = this.L;
            if (kncVar != null) {
                kncVar.D(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] j = j(b, this.Q, this.R);
        if (this.U) {
            zArr = j(b, this.S, this.T);
        }
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(b.size());
        boolean[] zArr2 = new boolean[b.size()];
        int i6 = 0;
        while (i2 < b.size()) {
            if (zArr == null || !zArr[i2] || !j[i2]) {
                arrayList2.add(((rnc) b.get(i2)).a);
                int i7 = i6 + 1;
                zArr2[i6] = j[i2];
                if (!j[i2]) {
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append(((rnc) b.get(i2)).a);
                }
                i6 = i7;
            }
            i2++;
        }
        this.n = sb3.toString();
        knc kncVar2 = this.L;
        if (kncVar2 != null) {
            kncVar2.D(arrayList2, Arrays.copyOf(zArr2, i6), this.U);
        }
    }

    public final void r() {
        int i;
        c cVar = this.b;
        wma wmaVar = cVar.a.b2;
        if (wmaVar == null) {
            return;
        }
        if (this.L == null) {
            this.L = new knc(this.a, cVar.a.K4, new lyc(this, wmaVar));
        }
        View a = cVar.a();
        if (this.L.getParent() != wmaVar) {
            hl.B2(this.L);
            if (a != null && a.getParent() == wmaVar) {
                i = wmaVar.indexOfChild(a);
            } else {
                i = -1;
            }
            knc kncVar = this.L;
            if (i >= 0) {
                wmaVar.addView(kncVar, i, tre.c(-1.0f, -1));
            } else {
                wmaVar.addView(kncVar, tre.c(-1.0f, -1));
            }
        }
        this.L.K();
        this.L.setPaused(false);
        this.L.setListening(true);
        q();
        this.L.F();
        Log.d("VoiceLive", "field shown");
    }

    public final String s() {
        StringBuilder sb = new StringBuilder();
        c cVar = this.b;
        sb.append(cVar.a.R);
        sb.append(":");
        sb.append(cVar.a.F3);
        return sb.toString();
    }

    public final void t() {
        String[] strArr;
        if (DictationAsr.E()) {
            strArr = bn3.K0;
        } else {
            strArr = null;
        }
        this.J = strArr;
        vnc vncVar = this.h;
        if (vncVar != null) {
            vncVar.setDetected(strArr);
        }
        knc kncVar = this.L;
        if (kncVar != null) {
            kncVar.setDetected(this.J);
        }
        k7b k7bVar = new k7b(this);
        ChatActivityEnterView chatActivityEnterView = this.b.a;
        co3 co3Var = new co3(this.a, chatActivityEnterView.R, chatActivityEnterView.F3, false, k7bVar);
        k7bVar.b = co3Var;
        this.f = co3Var;
        co3Var.w = this.d;
        co3Var.l();
    }

    public final void u() {
        byte b;
        String str;
        String str2;
        int i;
        int i2;
        boolean z;
        int f;
        float f2;
        boolean z2;
        int i3;
        String str3;
        long j;
        long j2;
        qnc qncVar;
        boolean z3;
        boolean z4;
        boolean z5;
        float f3;
        float f4;
        long j3;
        byte b2 = this.c;
        if (b2 != 3) {
            String str4 = "VoiceLive";
            if (b2 == 0 && uc7.e1().getBoolean("design_voice_live_field", true) && !this.b.d() && this.b.c() && (qncVar = (qnc) q0.get(s())) != null) {
                onc oncVar = this.m0;
                onc oncVar2 = this.X;
                float[] fArr = this.W;
                this.K = true;
                ArrayList arrayList = this.M;
                arrayList.clear();
                ArrayList arrayList2 = qncVar.a;
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    rnc rncVar = (rnc) arrayList2.get(i4);
                    rnc rncVar2 = new rnc(rncVar.a, rncVar.b);
                    rncVar2.c = rncVar.c;
                    arrayList.add(rncVar2);
                }
                long j4 = 0;
                this.N.clear();
                this.P = qncVar.b;
                this.g0 = qncVar.e;
                this.h0 = Math.min(qncVar.g, arrayList.size());
                this.i0 = qncVar.f;
                this.j0 = qncVar.h;
                this.n0 = qncVar.i;
                this.c = (byte) 4;
                this.Q = 0.0f;
                this.R = 1.0f;
                this.U = false;
                if (qncVar.c <= 0.001f && qncVar.d >= 0.999f) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 && !z4 && this.P > 0) {
                    float f5 = qncVar.c;
                    this.Q = f5;
                    float f6 = qncVar.d;
                    this.R = f6;
                    boolean[] j5 = j(arrayList, f5, f6);
                    float f7 = this.Q;
                    float f8 = (float) this.P;
                    long j6 = f7 * f8;
                    long j7 = this.R * f8;
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        if (j5[i5]) {
                            j3 = j7;
                        } else {
                            rnc rncVar3 = (rnc) arrayList.get(i5);
                            j3 = j7;
                            long j8 = j4;
                            rncVar3.b = Math.max(j8, rncVar3.b - j6);
                            long j9 = rncVar3.c;
                            if (j9 >= j8) {
                                rncVar3.c = Math.max(j8, j9 - j6);
                            }
                            arrayList3.add(rncVar3);
                        }
                        i5++;
                        j7 = j3;
                        j4 = 0;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList3);
                    this.P = Math.max(0L, j7 - j6);
                    this.Q = 0.0f;
                    this.R = 1.0f;
                } else if (z4) {
                    this.Q = fArr[0];
                    this.R = fArr[1];
                }
                Log.d("VoiceLive", "field: back with the chat (" + arrayList.size() + " words, " + this.P + " ms)");
                r();
                knc kncVar = this.L;
                if (kncVar != null) {
                    kncVar.setListening(false);
                    this.L.setPaused(true);
                    knc kncVar2 = this.L;
                    if (this.i0 != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    kncVar2.setRevertShown(z5);
                    knc kncVar3 = this.L;
                    kncVar3.F();
                    kncVar3.W = 1.0f;
                    boolean z6 = kncVar3.T;
                    if (z6) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    kncVar3.a0 = f3;
                    if (z6) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    kncVar3.U0 = f4;
                    kncVar3.b0 = 0.0f;
                    kncVar3.F0 = -1.0f;
                    kncVar3.invalidate();
                    this.L.setLanguage(this.n0);
                    c();
                }
                q();
                hl.r(oncVar2);
                hl.d3(oncVar2, 50L);
                hl.r(oncVar);
                hl.d3(oncVar, 250L);
                return;
            }
            byte b3 = this.c;
            c cVar = this.b;
            if (b3 == 4) {
                if (cVar.d()) {
                    hl.r(this.X);
                    co3 co3Var = this.V;
                    if (co3Var != null) {
                        this.V = null;
                        co3Var.c();
                        g();
                    }
                    g();
                    float f9 = this.Q;
                    long j10 = this.P;
                    float f10 = (float) j10;
                    long j11 = f9 * f10;
                    float f11 = this.R;
                    long j12 = f10 * f11;
                    if (j10 > 0 && (f9 > 0.001f || f11 < 0.999f)) {
                        boolean[] j13 = j(this.M, f9, f11);
                        ArrayList arrayList4 = new ArrayList();
                        int i6 = 0;
                        while (i6 < this.M.size()) {
                            if (j13[i6]) {
                                j2 = j11;
                            } else {
                                rnc rncVar4 = (rnc) this.M.get(i6);
                                j2 = j11;
                                rncVar4.b = Math.max(0L, rncVar4.b - j2);
                                long j14 = rncVar4.c;
                                if (j14 >= 0) {
                                    rncVar4.c = Math.max(0L, j14 - j2);
                                }
                                arrayList4.add(rncVar4);
                            }
                            i6++;
                            j11 = j2;
                        }
                        long j15 = j11;
                        this.M.clear();
                        this.M.addAll(arrayList4);
                        this.O = Math.max(0L, j12 - j15);
                        StringBuilder o = ik8.o(j15, "field: resumed after a trim ", "..");
                        o.append(j12);
                        o.append(" ms, ");
                        o.append(this.M.size());
                        o.append(" words kept");
                        Log.d("VoiceLive", o.toString());
                    } else {
                        this.O = j10;
                        Log.d("VoiceLive", "field: resumed at " + this.O + " ms");
                    }
                    this.Q = 0.0f;
                    this.R = 1.0f;
                    this.U = false;
                    if (this.g0 != null) {
                        this.h0 = this.M.size();
                    }
                    if (this.Y != null) {
                        int size2 = this.M.size();
                        this.d0 = size2;
                        this.Z = size2;
                        this.a0 = this.Y.length();
                        this.c0 = "";
                    }
                    this.d = new sm3();
                    this.e = new ekb((byte) 1);
                    r2f.a = this;
                    this.c = (byte) 2;
                    t();
                    knc kncVar4 = this.L;
                    if (kncVar4 != null) {
                        kncVar4.setPaused(false);
                        this.L.setListening(true);
                    }
                    c();
                    DictationAsr.V(this.o0);
                    DictationAsr.i(this.o0);
                    v();
                    q();
                    hl.r(this.m0);
                    hl.d3(this.m0, 250L);
                    return;
                } else if (!this.b.c()) {
                    k("draft gone", true);
                    return;
                } else {
                    return;
                }
            }
            ChatActivityEnterView chatActivityEnterView = cVar.a;
            if (!o2f.a()) {
                if (this.c != 0) {
                    k("unavailable", true);
                }
            } else if (!this.b.d()) {
                if (this.K && this.c == 2) {
                    c cVar2 = this.b;
                    cVar2.getClass();
                    if ((MediaController.z().J() || cVar2.a.Q3 != null) && this.b.c()) {
                        onc oncVar3 = this.X;
                        this.c = (byte) 4;
                        hl.r(this.l0);
                        sm3 sm3Var = this.d;
                        if (sm3Var != null) {
                            j = sm3Var.c() / 32;
                        } else {
                            j = 0;
                        }
                        this.P = this.O + j;
                        if (r2f.a == this) {
                            r2f.a = null;
                        }
                        co3 co3Var2 = this.f;
                        if (co3Var2 != null) {
                            this.V = co3Var2;
                            this.f = null;
                            sm3 sm3Var2 = this.d;
                            if (sm3Var2 != null) {
                                sm3Var2.d();
                            }
                            this.V.m();
                        } else {
                            g();
                        }
                        this.d = null;
                        this.e = null;
                        this.Q = 0.0f;
                        this.R = 1.0f;
                        this.U = false;
                        Log.d("VoiceLive", "field: paused at " + this.P + " ms, " + (this.N.size() + this.M.size()) + " words");
                        knc kncVar5 = this.L;
                        if (kncVar5 != null) {
                            kncVar5.setListening(false);
                            this.L.setPaused(true);
                        }
                        q();
                        hl.r(oncVar3);
                        hl.d3(oncVar3, 50L);
                        return;
                    }
                }
                if (this.c != 0) {
                    k("not recording", true);
                }
            } else {
                if (this.c == 0) {
                    if (p0) {
                        str = "VoiceLive";
                    } else {
                        p0 = true;
                        StringBuilder sb = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                        StringBuilder sb2 = new StringBuilder();
                        int[] iArr = {1000, 12000};
                        int i7 = 0;
                        while (i7 < 2) {
                            int i8 = iArr[i7];
                            ekb ekbVar = new ekb((byte) 1);
                            ByteBuffer allocate = ByteBuffer.allocate(19200);
                            int i9 = 0;
                            while (i9 < 9600) {
                                int i10 = i7;
                                short sin = (short) (Math.sin(((i8 * 6.283185307179586d) * i9) / 48000.0d) * 16000.0d);
                                int i11 = i9 << 1;
                                allocate.put(i11, (byte) sin);
                                allocate.put(i11 + 1, (byte) (sin >> 8));
                                i9++;
                                str4 = str4;
                                i7 = i10;
                            }
                            int i12 = i7;
                            String str5 = str4;
                            int c = ekbVar.c(allocate, 19200, 48000);
                            byte[] bArr = (byte[]) ekbVar.g;
                            double d = 0.0d;
                            int i13 = 0;
                            for (int i14 = 200; i14 < c / 2; i14++) {
                                int i15 = i14 << 1;
                                double d2 = (short) ((bArr[i15] & 255) | (bArr[i15 + 1] << 8));
                                d += d2 * d2;
                                i13++;
                            }
                            sb2.append(i8);
                            sb2.append("Hz=");
                            sb2.append(String.format(Locale.US, "%.1f", Double.valueOf(Math.log10(Math.max(1.0E-9d, Math.sqrt(d / Math.max(1, i13)) / 11313.708498984759d)) * 20.0d)));
                            sb2.append("dB ");
                            i7 = i12 + 1;
                            str4 = str5;
                        }
                        sb.append(sb2.toString().trim());
                        str = str4;
                        Log.d(str, sb.toString());
                    }
                    this.d = new sm3();
                    this.e = new ekb((byte) 1);
                    this.x = 0L;
                    this.w = 0L;
                    this.y = 0;
                    this.E = (char) 0;
                    this.F = (byte) 0;
                    this.G = false;
                    this.n = "";
                    this.K = uc7.e1().getBoolean("design_voice_live_field", true);
                    this.M.clear();
                    this.N.clear();
                    this.O = 0L;
                    this.Q = 0.0f;
                    this.R = 1.0f;
                    this.U = false;
                    this.r = SystemClock.elapsedRealtime();
                    b = 1;
                    this.c = (byte) 1;
                    r2f.a = this;
                    hl.r(this.m0);
                    hl.d3(this.m0, 250L);
                    Log.d(str, "buffering: recorder tap on");
                } else {
                    b = 1;
                    str = "VoiceLive";
                }
                if (this.c == b && this.b.a.W0()) {
                    this.c = (byte) 2;
                    this.n0 = null;
                    this.s = SystemClock.elapsedRealtime();
                    StringBuilder sb3 = new StringBuilder("locked → live: buffered ");
                    sb3.append((this.d.c() * 1000) / 32000);
                    sb3.append(" ms, chunks=");
                    sb3.append(this.y);
                    sb3.append(" rate=");
                    sb3.append((int) this.E);
                    sb3.append(" source=");
                    byte b4 = this.F;
                    if (b4 == 1) {
                        str2 = "MediaController";
                    } else if (b4 == 2) {
                        str2 = "AudioRecorderV2";
                    } else {
                        str2 = "none";
                    }
                    sb3.append(str2);
                    sb3.append(" (");
                    sb3.append(this.s - this.r);
                    sb3.append(" ms since start)");
                    Log.d(str, sb3.toString());
                    t();
                    if (this.K) {
                        r();
                    } else {
                        c cVar3 = this.b;
                        wma wmaVar = cVar3.a.b2;
                        if (wmaVar != null) {
                            if (this.h == null) {
                                this.h = new vnc(this.a, cVar3.a.K4, this);
                            }
                            View a = cVar3.a();
                            if (a != null && a.getParent() == wmaVar) {
                                i = wmaVar.indexOfChild(a);
                            } else {
                                i = -1;
                            }
                            if (this.h.getParent() != wmaVar || (i >= 0 && wmaVar.indexOfChild(this.h) != i - 1)) {
                                hl.B2(this.h);
                                if (a != null && a.getParent() == wmaVar) {
                                    i2 = wmaVar.indexOfChild(a);
                                } else {
                                    i2 = -1;
                                }
                                vnc vncVar = this.h;
                                if (i2 >= 0) {
                                    wmaVar.addView(vncVar, i2, tre.e(-1, -1, 80));
                                } else {
                                    wmaVar.addView(vncVar, tre.e(-1, -1, 80));
                                    Log.w(str, "composer isn't a direct child of the root: overlay on top");
                                }
                            }
                            vnc vncVar2 = this.h;
                            ChatActivityEnterView chatActivityEnterView2 = cVar3.a;
                            int i16 = aob.Pe;
                            int i17 = ChatActivityEnterView.X7;
                            vncVar2.setAccent(chatActivityEnterView2.J0(i16) | (-16777216));
                            vnc vncVar3 = this.h;
                            TextPaint textPaint = vncVar3.c;
                            int i18 = aob.d6;
                            vnb vnbVar = vncVar3.b;
                            if (hl.B(aob.v0(i18, vnbVar)) < 0.5f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            vncVar3.h0 = z;
                            int v0 = aob.v0(aob.G6, vnbVar) | (-16777216);
                            vncVar3.i0 = v0;
                            textPaint.setColor(v0);
                            int i19 = vncVar3.i0;
                            vnc.Z1 = i19;
                            boolean z7 = vncVar3.h0;
                            int i20 = vncVar3.j0;
                            if (z7) {
                                f = vm2.f(0.12f, i20, -1);
                            } else {
                                f = vm2.f(0.32f, i20, i19);
                            }
                            vnc.Y1 = f;
                            vnc.a2 = hl.L(7.0f);
                            TextPaint textPaint2 = vncVar3.d;
                            int i21 = vncVar3.i0;
                            if (vncVar3.h0) {
                                f2 = 0.42f;
                            } else {
                                f2 = 0.36f;
                            }
                            textPaint2.setColor(aob.p1(f2, i21));
                            if (Build.VERSION.SDK_INT >= 31 && xea.o() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            vncVar3.k0 = z2;
                            vncVar3.r = 0;
                            Paint paint = vncVar3.s;
                            if (vncVar3.h0) {
                                i3 = 0;
                            } else {
                                i3 = 335544320;
                            }
                            paint.setColor(i3);
                            vncVar3.l0 = "";
                            vncVar3.z1 = -1;
                            vncVar3.m0 = null;
                            vncVar3.p0.clear();
                            vncVar3.V0 = true;
                            vncVar3.E0 = 0.0f;
                            vncVar3.D0 = 0.0f;
                            vncVar3.F0 = 0.0f;
                            vncVar3.G0 = 0.0f;
                            vncVar3.I0 = -1.0f;
                            vncVar3.H0 = -1.0f;
                            vncVar3.K0 = -1.0f;
                            vncVar3.M0 = false;
                            vncVar3.setStyleIcon(null);
                            vncVar3.N0 = false;
                            vncVar3.Q0 = false;
                            vncVar3.y1 = null;
                            vncVar3.Q1 = false;
                            vncVar3.A1 = false;
                            vncVar3.E1 = null;
                            vncVar3.F1.clear();
                            textPaint.setShader(null);
                            vncVar3.T0 = 0L;
                            vncVar3.U0 = 0.0f;
                            vncVar3.B0 = true;
                            vncVar3.Y0 = 0.0f;
                            vncVar3.Z0 = 0.0f;
                            vncVar3.a1 = true;
                            vncVar3.b1 = 1.0f;
                            vncVar3.c1 = 0.0f;
                            vncVar3.m1 = -1;
                            Arrays.fill(vncVar3.n1, 0.0f);
                            vncVar3.O = null;
                            vncVar3.P = 0.0f;
                            vncVar3.Q = 0.0f;
                            vncVar3.W = false;
                            vncVar3.R.setEmpty();
                            vncVar3.setPlaceholder(null);
                            vncVar3.q0 = true;
                            vncVar3.s0 = SystemClock.uptimeMillis();
                            vncVar3.u0 = 0L;
                            vncVar3.g0 = 0L;
                            vncVar3.setVisibility(0);
                            vncVar3.invalidate();
                            Log.d(str, "overlay shown at index " + wmaVar.indexOfChild(this.h) + "/" + wmaVar.getChildCount());
                        }
                    }
                    vnc vncVar4 = this.h;
                    if (vncVar4 != null) {
                        vncVar4.setDetected(this.J);
                    }
                    knc kncVar6 = this.L;
                    if (kncVar6 != null) {
                        kncVar6.setDetected(this.J);
                    }
                    knc kncVar7 = this.L;
                    if (kncVar7 != null && this.K && (str3 = this.n0) != null) {
                        kncVar7.setLanguage(str3);
                    }
                    c();
                    DictationAsr.V(this.o0);
                    DictationAsr.i(this.o0);
                    v();
                    hl.d3(this.l0, 1500L);
                }
            }
        }
    }

    public final void v() {
        long[] jArr = new long[2];
        String str = null;
        if (DictationAsr.L(jArr)) {
            str = ob6.a0(null, null, 2131744980, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        vnc vncVar = this.h;
        if (vncVar != null) {
            vncVar.setPlaceholder(str);
        }
        knc kncVar = this.L;
        if (kncVar != null && this.K) {
            kncVar.setPlaceholder(str);
        }
    }

    public final void w(defpackage.co3 r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snc.w(co3, java.lang.String):void");
    }

    @Override
    public final void d(String[] strArr, float[] fArr, int i) {
    }
}
