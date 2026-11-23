package ji;

import a8.p0;
import ai.l0;
import ai.q1;
import ai.v;
import ai.v1;
import ai.w1;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c8.c1;
import c8.na;
import di.p9;
import hi.x8;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.bz;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.vr;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Dictation.DictationAsr;
public final class n implements v1 {
    public static boolean f18056n0;
    public static final HashMap f18057o0 = new HashMap();
    public volatile int E;
    public volatile int F;
    public volatile boolean G;
    public String H;
    public boolean J;
    public e K;
    public long N;
    public long O;
    public boolean T;
    public w1 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context f18058a;
    public final qf f18060b;
    public int f18061b0;
    public v d;
    public r f18065e;
    public String f18066e0;
    public w1 f18067f;
    public int f18068f0;
    public String f18069g0;
    public q h;
    public boolean f18070h0;
    public boolean f18071i0;
    public String f18074l0;
    public long f18076r;
    public long f18077s;
    public volatile long f18078w;
    public volatile long f18079x;
    public volatile int f18080y;
    public int f18062c = 0;
    public String f18075n = "";
    public final j I = new j(this, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final j W = new j(this, 1);
    public String f18059a0 = "";
    public final int[] f18063c0 = new int[2];
    public final int[] f18064d0 = new int[2];
    public final i f18072j0 = new i(this, 0);
    public final j f18073k0 = new j(this, 2);
    public final i m0 = new i(this, 1);

    public n(Context context, qf qfVar) {
        this.f18058a = context;
        this.f18060b = qfVar;
    }

    public static void b(n nVar, w1 w1Var, String str, int i7) {
        if (w1Var == nVar.f18067f || w1Var == nVar.U) {
            if (!nVar.J) {
                nVar.M(i7, str);
                return;
            }
            int i10 = nVar.f18062c;
            if (i10 != 2 && i10 != 4) {
                return;
            }
            nVar.t(w1Var, str);
            nVar.m();
        }
    }

    public static ArrayList u(String[] strArr, boolean z10, w10 w10Var) {
        String[] strArr2;
        w10 w10Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            int i10 = i7 + 1;
            ai.q M = DictationAsr.M(str);
            if (M != null) {
                strArr2 = M.d(str);
            } else {
                strArr2 = new String[0];
            }
            String[] strArr3 = strArr2;
            if (strArr3.length < 2) {
                arrayList.add(null);
                w10Var2 = w10Var;
            } else {
                String g02 = DictationAsr.g0(M, str);
                ArrayList arrayList2 = new ArrayList();
                int i11 = -1;
                for (int i12 = 0; i12 < strArr3.length; i12++) {
                    arrayList2.add(l0.L(strArr3[i12]));
                    if (!z10 && DictationAsr.B(str) && strArr3[i12].equals(g02)) {
                        i11 = i12;
                    }
                }
                w10Var2 = w10Var;
                arrayList.add(new k(l0.N(g02), arrayList2, i11, new p9(str, strArr3, w10Var2, i10, 2)));
            }
            w10Var = w10Var2;
            i7 = i10;
        }
        return arrayList;
    }

    @Override
    public final void M(int i7, String str) {
        if (this.f18062c == 2) {
            if (str == null) {
                str = "";
            }
            this.f18075n = str;
            q qVar = this.h;
            if (qVar != null) {
                qVar.t(i7, str);
            }
        }
    }

    @Override
    public final void P(String str) {
        String F;
        if (str == null) {
            F = null;
        } else {
            F = l0.F(str);
        }
        q qVar = this.h;
        if (qVar != null && this.f18062c == 2) {
            qVar.setLanguage(F);
        }
        e eVar = this.K;
        if (eVar != null && this.J && this.f18062c == 2) {
            this.f18074l0 = F;
            eVar.setLanguage(F);
        }
    }

    @Override
    public final void a(String str, String str2) {
        if (this.f18062c == 2) {
            if (!str.isEmpty()) {
                this.f18075n = str;
            }
            StringBuilder u10 = p0.u("recogniser ended error=", str2, " chars=");
            u10.append(this.f18075n.length());
            u10.append(" (the voice recording goes on)");
            Log.d("VoiceLive", u10.toString());
            this.f18067f = null;
            if (vr.f27687k == this) {
                vr.f27687k = null;
            }
            this.d = null;
            this.f18065e = null;
            if (TextUtils.isEmpty(this.f18075n.trim())) {
                q qVar = this.h;
                if (qVar != null) {
                    qVar.m();
                    return;
                }
                return;
            }
            q qVar2 = this.h;
            if (qVar2 != null) {
                qVar2.setText(this.f18075n);
                this.h.setListening(false);
            }
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public final void d() {
        String d02 = DictationAsr.d0();
        if (d02 != null) {
            String F = l0.F(d02);
            q qVar = this.h;
            if (qVar != null) {
                qVar.setLanguage(F);
            }
            e eVar = this.K;
            if (eVar != null && this.J) {
                this.f18074l0 = F;
                eVar.setLanguage(F);
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    @Override
    public final void f(float f10) {
        if (this.f18062c == 2) {
            if (this.J) {
                e eVar = this.K;
                if (eVar != null) {
                    eVar.setLevel(f10);
                    return;
                }
                return;
            }
            q qVar = this.h;
            if (qVar != null) {
                qVar.setLevel(f10);
            }
        }
    }

    public final boolean[] g(ArrayList arrayList, float f10, float f11) {
        long max;
        boolean z10;
        boolean[] zArr = new boolean[arrayList.size()];
        if (this.f18062c == 4) {
            long j3 = this.O;
            long j10 = 0;
            if (j3 > 0 && (f10 > 0.001f || f11 < 0.999f)) {
                float f12 = (float) j3;
                long j11 = f10 * f12;
                long j12 = f12 * f11;
                long j13 = 0;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    long j14 = ((m) arrayList.get(i7)).f18054b;
                    long j15 = j10;
                    if (((m) arrayList.get(i7)).f18055c >= j15) {
                        max = ((m) arrayList.get(i7)).f18055c;
                    } else {
                        max = Math.max(j13, j14 - 900);
                    }
                    long j16 = (max + j14) / 2;
                    if (j16 >= j11 && j16 <= j12) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr[i7] = z10;
                    i7++;
                    j13 = j14;
                    j10 = j15;
                }
            }
        }
        return zArr;
    }

    public final void h(String str, boolean z10) {
        boolean z11;
        q qVar;
        e eVar;
        String str2;
        String str3;
        int i7 = this.f18062c;
        if (i7 != 0 || this.h != null || this.K != null) {
            if (this.J && i7 == 4 && this.f18060b.c() && ("chat paused".equals(str) || "destroy".equals(str))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.J && this.f18062c != 0 && !z11) {
                f18057o0.remove(o());
            }
            if (this.f18062c != 0) {
                StringBuilder u10 = p0.u("dispose (", str, ") state=");
                int i10 = this.f18062c;
                if (i10 == 2) {
                    str3 = "live";
                } else if (i10 == 3) {
                    str3 = "review";
                } else if (i10 == 4) {
                    str3 = "paused";
                } else {
                    str3 = "buffering";
                }
                u10.append(str3);
                u10.append(" chars=");
                u10.append(this.f18075n.length());
                u10.append(" chunks=");
                u10.append(this.f18080y);
                Log.d("VoiceLive", u10.toString());
            }
            this.f18062c = 0;
            this.H = null;
            g0.r(this.W);
            w1 w1Var = this.U;
            if (w1Var != null) {
                w1Var.c();
                this.U = null;
            }
            i(true);
            if (z11) {
                if (this.U == null) {
                    e();
                }
                l lVar = new l();
                ArrayList arrayList = lVar.f18046a;
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    m mVar = (m) obj;
                    m mVar2 = new m(mVar.f18053a, mVar.f18054b);
                    mVar2.f18055c = mVar.f18055c;
                    arrayList.add(mVar2);
                }
                ArrayList arrayList3 = this.M;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    m mVar3 = (m) obj2;
                    m mVar4 = new m(mVar3.f18053a, mVar3.f18054b);
                    mVar4.f18055c = mVar3.f18055c;
                    arrayList.add(mVar4);
                }
                lVar.f18047b = this.O;
                lVar.f18048c = this.P;
                lVar.d = this.Q;
                lVar.f18049e = this.f18066e0;
                lVar.f18051g = this.f18068f0;
                lVar.f18050f = this.f18069g0;
                lVar.h = this.f18070h0;
                lVar.f18052i = this.f18074l0;
                f18057o0.put(o(), lVar);
                StringBuilder sb2 = new StringBuilder("field: kept for the chat (");
                sb2.append(arrayList.size());
                sb2.append(" words");
                if (this.f18066e0 != null) {
                    str2 = ", styled / edited";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(")");
                Log.d("VoiceLive", sb2.toString());
            }
            this.f18066e0 = null;
            this.f18069g0 = null;
            this.f18071i0 = false;
            this.f18060b.g(Float.NaN, 0.0f);
            if (z10 && (eVar = this.K) != null && eVar.R) {
                eVar.R = false;
                eVar.f17953f0 = -1;
                eVar.invalidate();
            }
            g0.r(this.I);
            DictationAsr.U(this.m0);
            g0.r(this.f18073k0);
            g0.r(this.f18072j0);
            if (vr.f27687k == this) {
                vr.f27687k = null;
            }
            w1 w1Var2 = this.f18067f;
            if (w1Var2 != null) {
                w1Var2.c();
                this.f18067f = null;
            }
            v vVar = this.d;
            if (vVar != null) {
                vVar.d();
                this.d = null;
            }
            this.f18065e = null;
            if (z10 && (qVar = this.h) != null) {
                qVar.m();
            }
        }
    }

    public final void i(boolean z10) {
        String obj;
        EditTextBoldCursor editTextBoldCursor = this.X;
        if (editTextBoldCursor == null) {
            return;
        }
        this.X = null;
        if (editTextBoldCursor.getText() == null) {
            obj = this.f18075n;
        } else {
            obj = editTextBoldCursor.getText().toString();
        }
        this.f18075n = obj;
        this.f18066e0 = obj.trim();
        this.f18068f0 = c().size();
        if (z10 && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f18075n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            g0.v1(editTextBoldCursor);
        }
        g0.E2(editTextBoldCursor);
    }

    public final void j(Object obj) {
        String str;
        if (obj != null && !this.f18071i0 && this.K != null) {
            boolean z10 = false;
            if (this.X != null) {
                i(false);
            }
            if (this.f18069g0 == null) {
                this.f18069g0 = this.f18075n.trim();
                if (this.f18066e0 != null) {
                    z10 = true;
                }
                this.f18070h0 = z10;
            }
            String str2 = this.f18069g0;
            if (!str2.isEmpty()) {
                this.f18071i0 = true;
                this.K.setBusy(true);
                StringBuilder sb2 = new StringBuilder("field: style ");
                qf qfVar = this.f18060b;
                qfVar.getClass();
                if (obj instanceof ai.c) {
                    str = ((ai.c) obj).a();
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(" in place on ");
                sb2.append(str2.length());
                sb2.append(" chars");
                Log.d("VoiceLive", sb2.toString());
                qfVar.f(obj, str2, new x8(this, SystemClock.uptimeMillis(), 1));
            }
        }
    }

    public final void k(String str) {
        boolean z10;
        long j3;
        if (this.f18062c == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        h(str, false);
        e eVar = this.K;
        if (eVar == null) {
            return;
        }
        f fVar = new f(0, this, eVar);
        if (z10) {
            j3 = 470;
        } else {
            j3 = 60;
        }
        g0.h3(fVar, j3);
    }

    public final void l(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        v vVar = this.d;
        r rVar = this.f18065e;
        if (vVar != null && rVar != null) {
            this.E = i10;
            this.F = i11;
            this.f18080y++;
            this.f18078w += i7;
            int c10 = rVar.c(byteBuffer, i7, i10);
            if (rVar.f18150c <= 0) {
                if (!this.G) {
                    this.G = true;
                    Log.w("VoiceLive", "recorder rate " + i10 + " Hz isn't a multiple of 16 kHz: no transcript");
                }
            } else if (c10 > 0) {
                this.f18079x += c10;
                byte[] bArr = (byte[]) rVar.f18153g;
                if (c10 > 0) {
                    synchronized (vVar.f1552a) {
                        try {
                            if (vVar.d) {
                                return;
                            }
                            vVar.a(c10, bArr);
                            int i12 = c10 / 2;
                            for (int i13 = 0; i13 < i12; i13++) {
                                int i14 = i13 * 2;
                                double d = (short) ((bArr[i14 + 1] << 8) | (bArr[i14] & 255));
                                vVar.h = (d * d) + vVar.h;
                            }
                            int i15 = vVar.f1558i + i12;
                            vVar.f1558i = i15;
                            if (i15 >= 1600) {
                                double sqrt = Math.sqrt(vVar.h / Math.max(1, i15));
                                vVar.h = 0.0d;
                                vVar.f1558i = 0;
                                q1 q1Var = vVar.f1557g;
                                if (q1Var != null) {
                                    q1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
    }

    public final void m() {
        int i7;
        ArrayList c10 = c();
        EditTextBoldCursor editTextBoldCursor = this.X;
        int i10 = 0;
        if (editTextBoldCursor != null) {
            Editable text = editTextBoldCursor.getText();
            if (text != null) {
                int i11 = this.Z;
                String str = "";
                if (i11 < 0 || this.f18059a0.length() + i11 != text.length() || !text.toString().substring(this.Z).equals(this.f18059a0)) {
                    this.Y = Math.min(this.f18061b0, c10.size());
                    this.Z = text.length();
                    this.f18059a0 = "";
                }
                if (this.Y > c10.size()) {
                    this.Y = c10.size();
                }
                this.f18061b0 = c10.size();
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = this.Y; i12 < c10.size(); i12++) {
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append(((m) c10.get(i12)).f18053a);
                }
                if (sb2.length() != 0 || !this.f18059a0.isEmpty()) {
                    if (sb2.length() > 0 && (i7 = this.Z) > 0 && !Character.isWhitespace(text.charAt(i7 - 1))) {
                        i10 = 1;
                    }
                    if (sb2.length() != 0) {
                        StringBuilder sb3 = new StringBuilder();
                        if (i10 != 0) {
                            str = " ";
                        }
                        sb3.append(str);
                        sb3.append((Object) sb2);
                        str = sb3.toString();
                    }
                    if (!str.equals(this.f18059a0)) {
                        text.replace(this.Z, text.length(), str);
                        this.f18059a0 = str;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean[] zArr = null;
        if (this.f18066e0 != null) {
            if (this.f18068f0 > c10.size()) {
                this.f18068f0 = c10.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f18066e0);
            StringBuilder sb4 = new StringBuilder(this.f18066e0);
            for (int i13 = this.f18068f0; i13 < c10.size(); i13++) {
                arrayList.add(((m) c10.get(i13)).f18053a);
                sb4.append(' ');
                sb4.append(((m) c10.get(i13)).f18053a);
            }
            this.f18075n = sb4.toString();
            e eVar = this.K;
            if (eVar != null) {
                eVar.x(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] g10 = g(c10, this.P, this.Q);
        if (this.T) {
            zArr = g(c10, this.R, this.S);
        }
        StringBuilder sb5 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(c10.size());
        boolean[] zArr2 = new boolean[c10.size()];
        int i14 = 0;
        while (i10 < c10.size()) {
            if (zArr == null || !zArr[i10] || !g10[i10]) {
                arrayList2.add(((m) c10.get(i10)).f18053a);
                int i15 = i14 + 1;
                zArr2[i14] = g10[i10];
                if (!g10[i10]) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    sb5.append(((m) c10.get(i10)).f18053a);
                }
                i14 = i15;
            }
            i10++;
        }
        this.f18075n = sb5.toString();
        e eVar2 = this.K;
        if (eVar2 != null) {
            eVar2.x(arrayList2, Arrays.copyOf(zArr2, i14), this.T);
        }
    }

    public final void n() {
        int i7;
        qf qfVar = this.f18060b;
        cu0 cu0Var = qfVar.f38823a.f32655c2;
        if (cu0Var == null) {
            return;
        }
        if (this.K == null) {
            i6 i6Var = qfVar.f38823a.M4;
            ?? obj = new Object();
            obj.d = this;
            obj.f60751c = cu0Var;
            obj.f60749a = new int[2];
            obj.f60750b = new int[2];
            this.K = new e(this.f18058a, i6Var, obj);
        }
        View a10 = qfVar.a();
        if (this.K.getParent() != cu0Var) {
            g0.E2(this.K);
            if (a10 != null && a10.getParent() == cu0Var) {
                i7 = cu0Var.indexOfChild(a10);
            } else {
                i7 = -1;
            }
            if (i7 >= 0) {
                cu0Var.addView(this.K, i7, na.c(-1.0f, -1));
            } else {
                cu0Var.addView(this.K, na.c(-1.0f, -1));
            }
        }
        this.K.E();
        this.K.setPaused(false);
        this.K.setListening(true);
        m();
        this.K.z();
        Log.d("VoiceLive", "field shown");
    }

    public final String o() {
        StringBuilder sb2 = new StringBuilder();
        qf qfVar = this.f18060b;
        sb2.append(qfVar.f38823a.R);
        sb2.append(":");
        sb2.append(qfVar.f38823a.G3);
        return sb2.toString();
    }

    public final void p() {
        j6.k kVar = new j6.k(this);
        ChatActivityEnterView chatActivityEnterView = this.f18060b.f38823a;
        w1 w1Var = new w1(this.f18058a, chatActivityEnterView.R, chatActivityEnterView.G3, false, kVar);
        kVar.f17343b = w1Var;
        this.f18067f = w1Var;
        w1Var.f1583w = this.d;
        w1Var.l();
    }

    public final void q() {
        String str;
        int i7;
        int i10;
        boolean z10;
        int f10;
        float f11;
        boolean z11;
        int i11;
        String str2;
        long j3;
        int i12;
        l lVar;
        boolean z12;
        boolean z13;
        boolean z14;
        float f12;
        float f13;
        long j10;
        int i13 = this.f18062c;
        if (i13 != 3) {
            if (i13 == 0 && mp.g1().getBoolean("design_voice_live_field", true) && !this.f18060b.d() && this.f18060b.c() && (lVar = (l) f18057o0.get(o())) != null) {
                j jVar = this.f18073k0;
                j jVar2 = this.W;
                float[] fArr = this.V;
                this.J = true;
                ArrayList arrayList = this.L;
                arrayList.clear();
                ArrayList arrayList2 = lVar.f18046a;
                int size = arrayList2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    m mVar = (m) arrayList2.get(i14);
                    m mVar2 = new m(mVar.f18053a, mVar.f18054b);
                    mVar2.f18055c = mVar.f18055c;
                    arrayList.add(mVar2);
                }
                long j11 = 0;
                this.M.clear();
                this.O = lVar.f18047b;
                this.f18066e0 = lVar.f18049e;
                this.f18068f0 = Math.min(lVar.f18051g, arrayList.size());
                this.f18069g0 = lVar.f18050f;
                this.f18070h0 = lVar.h;
                this.f18074l0 = lVar.f18052i;
                this.f18062c = 4;
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                if (lVar.f18048c <= 0.001f && lVar.d >= 0.999f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (this.f18060b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 && !z13 && this.O > 0) {
                    float f14 = lVar.f18048c;
                    this.P = f14;
                    float f15 = lVar.d;
                    this.Q = f15;
                    boolean[] g10 = g(arrayList, f14, f15);
                    float f16 = this.P;
                    float f17 = (float) this.O;
                    long j12 = f16 * f17;
                    long j13 = this.Q * f17;
                    ArrayList arrayList3 = new ArrayList();
                    int i15 = 0;
                    while (i15 < arrayList.size()) {
                        if (g10[i15]) {
                            j10 = j13;
                        } else {
                            m mVar3 = (m) arrayList.get(i15);
                            j10 = j13;
                            long j14 = j11;
                            mVar3.f18054b = Math.max(j14, mVar3.f18054b - j12);
                            long j15 = mVar3.f18055c;
                            if (j15 >= j14) {
                                mVar3.f18055c = Math.max(j14, j15 - j12);
                            }
                            arrayList3.add(mVar3);
                        }
                        i15++;
                        j13 = j10;
                        j11 = 0;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList3);
                    this.O = Math.max(0L, j13 - j12);
                    this.P = 0.0f;
                    this.Q = 1.0f;
                } else if (z13) {
                    this.P = fArr[0];
                    this.Q = fArr[1];
                }
                Log.d("VoiceLive", "field: back with the chat (" + arrayList.size() + " words, " + this.O + " ms)");
                n();
                e eVar = this.K;
                if (eVar != null) {
                    eVar.setListening(false);
                    this.K.setPaused(true);
                    e eVar2 = this.K;
                    if (this.f18069g0 != null) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    eVar2.setRevertShown(z14);
                    e eVar3 = this.K;
                    eVar3.z();
                    eVar3.W = 1.0f;
                    boolean z15 = eVar3.T;
                    if (z15) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    eVar3.f17930a0 = f12;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    eVar3.T0 = f13;
                    eVar3.f17935b0 = 0.0f;
                    eVar3.E0 = -1.0f;
                    eVar3.invalidate();
                    this.K.setLanguage(this.f18074l0);
                    d();
                }
                m();
                g0.r(jVar2);
                g0.h3(jVar2, 50L);
                g0.r(jVar);
                g0.h3(jVar, 250L);
            } else if (this.f18062c == 4) {
                if (this.f18060b.d()) {
                    g0.r(this.W);
                    w1 w1Var = this.U;
                    if (w1Var != null) {
                        this.U = null;
                        w1Var.c();
                        e();
                    }
                    e();
                    float f18 = this.P;
                    long j16 = this.O;
                    float f19 = (float) j16;
                    long j17 = f18 * f19;
                    float f20 = this.Q;
                    long j18 = f19 * f20;
                    if (j16 > 0 && (f18 > 0.001f || f20 < 0.999f)) {
                        boolean[] g11 = g(this.L, f18, f20);
                        ArrayList arrayList4 = new ArrayList();
                        int i16 = 0;
                        while (i16 < this.L.size()) {
                            if (g11[i16]) {
                                i12 = i16;
                            } else {
                                m mVar4 = (m) this.L.get(i16);
                                i12 = i16;
                                mVar4.f18054b = Math.max(0L, mVar4.f18054b - j17);
                                long j19 = mVar4.f18055c;
                                if (j19 >= 0) {
                                    mVar4.f18055c = Math.max(0L, j19 - j17);
                                }
                                arrayList4.add(mVar4);
                            }
                            i16 = i12 + 1;
                        }
                        this.L.clear();
                        this.L.addAll(arrayList4);
                        this.N = Math.max(0L, j18 - j17);
                        StringBuilder t6 = p0.t(j17, "field: resumed after a trim ", "..");
                        t6.append(j18);
                        t6.append(" ms, ");
                        t6.append(this.L.size());
                        t6.append(" words kept");
                        Log.d("VoiceLive", t6.toString());
                    } else {
                        this.N = j16;
                        Log.d("VoiceLive", "field: resumed at " + this.N + " ms");
                    }
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    if (this.f18066e0 != null) {
                        this.f18068f0 = this.L.size();
                    }
                    if (this.X != null) {
                        int size2 = this.L.size();
                        this.f18061b0 = size2;
                        this.Y = size2;
                        this.Z = this.X.length();
                        this.f18059a0 = "";
                    }
                    this.d = new v();
                    this.f18065e = new r(0);
                    vr.f27687k = this;
                    this.f18062c = 2;
                    p();
                    e eVar4 = this.K;
                    if (eVar4 != null) {
                        eVar4.setPaused(false);
                        this.K.setListening(true);
                    }
                    d();
                    DictationAsr.U(this.m0);
                    DictationAsr.l(this.m0);
                    s();
                    m();
                    g0.r(this.f18073k0);
                    g0.h3(this.f18073k0, 250L);
                } else if (!this.f18060b.c()) {
                    h("draft gone", true);
                }
            } else {
                ChatActivityEnterView chatActivityEnterView = this.f18060b.f38823a;
                if (!c1.a()) {
                    if (this.f18062c != 0) {
                        h("unavailable", true);
                    }
                } else if (!this.f18060b.d()) {
                    if (this.J && this.f18062c == 2) {
                        qf qfVar = this.f18060b;
                        qfVar.getClass();
                        if ((MediaController.B().K() || qfVar.f38823a.R3 != null) && this.f18060b.c()) {
                            j jVar3 = this.W;
                            this.f18062c = 4;
                            g0.r(this.f18072j0);
                            v vVar = this.d;
                            if (vVar != null) {
                                j3 = vVar.c() / 32;
                            } else {
                                j3 = 0;
                            }
                            this.O = this.N + j3;
                            if (vr.f27687k == this) {
                                vr.f27687k = null;
                            }
                            w1 w1Var2 = this.f18067f;
                            if (w1Var2 != null) {
                                this.U = w1Var2;
                                this.f18067f = null;
                                v vVar2 = this.d;
                                if (vVar2 != null) {
                                    vVar2.d();
                                }
                                this.U.m();
                            } else {
                                e();
                            }
                            this.d = null;
                            this.f18065e = null;
                            this.P = 0.0f;
                            this.Q = 1.0f;
                            this.T = false;
                            Log.d("VoiceLive", "field: paused at " + this.O + " ms, " + (this.M.size() + this.L.size()) + " words");
                            e eVar5 = this.K;
                            if (eVar5 != null) {
                                eVar5.setListening(false);
                                this.K.setPaused(true);
                            }
                            m();
                            g0.r(jVar3);
                            g0.h3(jVar3, 50L);
                            return;
                        }
                    }
                    if (this.f18062c != 0) {
                        h("not recording", true);
                    }
                } else {
                    int i17 = 1;
                    if (this.f18062c == 0) {
                        if (!f18056n0) {
                            f18056n0 = true;
                            StringBuilder sb2 = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                            StringBuilder sb3 = new StringBuilder();
                            int[] iArr = {1000, 12000};
                            int i18 = 0;
                            while (i18 < 2) {
                                int i19 = iArr[i18];
                                r rVar = new r(0);
                                ByteBuffer allocate = ByteBuffer.allocate(19200);
                                int i20 = 0;
                                while (i20 < 9600) {
                                    int[] iArr2 = iArr;
                                    short sin = (short) (Math.sin(((i19 * 6.283185307179586d) * i20) / 48000.0d) * 16000.0d);
                                    int i21 = i20 * 2;
                                    allocate.put(i21, (byte) sin);
                                    allocate.put(i21 + 1, (byte) (sin >> 8));
                                    i20++;
                                    iArr = iArr2;
                                }
                                int[] iArr3 = iArr;
                                int c10 = rVar.c(allocate, 19200, 48000);
                                byte[] bArr = (byte[]) rVar.f18153g;
                                double d = 0.0d;
                                int i22 = 0;
                                for (int i23 = 200; i23 < c10 / 2; i23++) {
                                    int i24 = i23 * 2;
                                    double d2 = (short) ((bArr[i24] & 255) | (bArr[i24 + 1] << 8));
                                    d += d2 * d2;
                                    i22++;
                                }
                                sb3.append(i19);
                                sb3.append("Hz=");
                                sb3.append(String.format(Locale.US, "%.1f", Double.valueOf(Math.log10(Math.max(1.0E-9d, Math.sqrt(d / Math.max(1, i22)) / (16000.0d / Math.sqrt(2.0d)))) * 20.0d)));
                                sb3.append("dB ");
                                i18++;
                                iArr = iArr3;
                            }
                            sb2.append(sb3.toString().trim());
                            Log.d("VoiceLive", sb2.toString());
                        }
                        this.d = new v();
                        this.f18065e = new r(0);
                        this.f18079x = 0L;
                        this.f18078w = 0L;
                        this.f18080y = 0;
                        this.E = 0;
                        this.F = 0;
                        this.G = false;
                        this.f18075n = "";
                        this.J = mp.g1().getBoolean("design_voice_live_field", true);
                        this.L.clear();
                        this.M.clear();
                        this.N = 0L;
                        this.P = 0.0f;
                        this.Q = 1.0f;
                        this.T = false;
                        this.f18076r = SystemClock.elapsedRealtime();
                        i17 = 1;
                        this.f18062c = 1;
                        vr.f27687k = this;
                        g0.r(this.f18073k0);
                        g0.h3(this.f18073k0, 250L);
                        Log.d("VoiceLive", "buffering: recorder tap on");
                    }
                    if (this.f18062c == i17 && this.f18060b.f38823a.V0()) {
                        this.f18062c = 2;
                        this.f18074l0 = null;
                        this.f18077s = SystemClock.elapsedRealtime();
                        StringBuilder sb4 = new StringBuilder("locked → live: buffered ");
                        sb4.append((this.d.c() * 1000) / 32000);
                        sb4.append(" ms, chunks=");
                        sb4.append(this.f18080y);
                        sb4.append(" rate=");
                        sb4.append(this.E);
                        sb4.append(" source=");
                        int i25 = this.F;
                        if (i25 == 1) {
                            str = "MediaController";
                        } else if (i25 == 2) {
                            str = "AudioRecorderV2";
                        } else {
                            str = "none";
                        }
                        sb4.append(str);
                        sb4.append(" (");
                        sb4.append(this.f18077s - this.f18076r);
                        sb4.append(" ms since start)");
                        Log.d("VoiceLive", sb4.toString());
                        p();
                        if (this.J) {
                            n();
                        } else {
                            qf qfVar2 = this.f18060b;
                            cu0 cu0Var = qfVar2.f38823a.f32655c2;
                            if (cu0Var != null) {
                                if (this.h == null) {
                                    this.h = new q(this.f18058a, qfVar2.f38823a.M4, this);
                                }
                                View a10 = qfVar2.a();
                                if (a10 != null && a10.getParent() == cu0Var) {
                                    i7 = cu0Var.indexOfChild(a10);
                                } else {
                                    i7 = -1;
                                }
                                if (this.h.getParent() != cu0Var || (i7 >= 0 && cu0Var.indexOfChild(this.h) != i7 - 1)) {
                                    g0.E2(this.h);
                                    if (a10 != null && a10.getParent() == cu0Var) {
                                        i10 = cu0Var.indexOfChild(a10);
                                    } else {
                                        i10 = -1;
                                    }
                                    if (i10 >= 0) {
                                        cu0Var.addView(this.h, i10, na.e(-1, -1, 80));
                                    } else {
                                        cu0Var.addView(this.h, na.e(-1, -1, 80));
                                        Log.w("VoiceLive", "composer isn't a direct child of the root: overlay on top");
                                    }
                                }
                                q qVar = this.h;
                                ChatActivityEnterView chatActivityEnterView2 = qfVar2.f38823a;
                                int i26 = n6.Pe;
                                int i27 = ChatActivityEnterView.f32633s7;
                                qVar.setAccent(chatActivityEnterView2.G0(i26) | (-16777216));
                                q qVar2 = this.h;
                                TextPaint textPaint = qVar2.f18094c;
                                int i28 = n6.f29451d6;
                                i6 i6Var = qVar2.f18091b;
                                if (g0.B(n6.w0(i28, i6Var)) < 0.5f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                qVar2.f18105g0 = z10;
                                int w02 = (-16777216) | n6.w0(n6.G6, i6Var);
                                qVar2.f18107h0 = w02;
                                textPaint.setColor(w02);
                                int i29 = qVar2.f18107h0;
                                q.Y1 = i29;
                                if (qVar2.f18105g0) {
                                    f10 = i0.a.f(0.12f, qVar2.f18109i0, -1);
                                } else {
                                    f10 = i0.a.f(0.32f, qVar2.f18109i0, i29);
                                }
                                q.X1 = f10;
                                q.Z1 = g0.L(7.0f);
                                TextPaint textPaint2 = qVar2.d;
                                int i30 = qVar2.f18107h0;
                                if (qVar2.f18105g0) {
                                    f11 = 0.42f;
                                } else {
                                    f11 = 0.36f;
                                }
                                textPaint2.setColor(n6.r1(f11, i30));
                                if (Build.VERSION.SDK_INT >= 31 && bz.o() != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                qVar2.f18111j0 = z11;
                                qVar2.f18125r = 0;
                                Paint paint = qVar2.f18128s;
                                if (qVar2.f18105g0) {
                                    i11 = 0;
                                } else {
                                    i11 = 335544320;
                                }
                                paint.setColor(i11);
                                qVar2.f18113k0 = "";
                                qVar2.f18145y1 = -1;
                                qVar2.f18115l0 = null;
                                qVar2.f18119o0.clear();
                                qVar2.U0 = true;
                                qVar2.D0 = 0.0f;
                                qVar2.C0 = 0.0f;
                                qVar2.E0 = 0.0f;
                                qVar2.F0 = 0.0f;
                                qVar2.H0 = -1.0f;
                                qVar2.G0 = -1.0f;
                                qVar2.J0 = -1.0f;
                                qVar2.L0 = false;
                                qVar2.setStyleIcon(null);
                                qVar2.M0 = false;
                                qVar2.P0 = false;
                                qVar2.f18142x1 = null;
                                qVar2.P1 = false;
                                qVar2.f18147z1 = false;
                                qVar2.D1 = null;
                                qVar2.E1.clear();
                                textPaint.setShader(null);
                                qVar2.S0 = 0L;
                                qVar2.T0 = 0.0f;
                                qVar2.A0 = true;
                                qVar2.X0 = 0.0f;
                                qVar2.Y0 = 0.0f;
                                qVar2.Z0 = true;
                                qVar2.f18090a1 = 1.0f;
                                qVar2.f18093b1 = 0.0f;
                                qVar2.l1 = -1;
                                Arrays.fill(qVar2.f18116m1, 0.0f);
                                qVar2.O = null;
                                qVar2.P = 0.0f;
                                qVar2.Q = 0.0f;
                                qVar2.W = false;
                                qVar2.R.setEmpty();
                                qVar2.setPlaceholder(null);
                                qVar2.f18121p0 = true;
                                qVar2.f18126r0 = SystemClock.uptimeMillis();
                                qVar2.f18131t0 = 0L;
                                qVar2.f18103f0 = 0L;
                                qVar2.setVisibility(0);
                                qVar2.invalidate();
                                Log.d("VoiceLive", "overlay shown at index " + cu0Var.indexOfChild(this.h) + "/" + cu0Var.getChildCount());
                            }
                        }
                        e eVar6 = this.K;
                        if (eVar6 != null && this.J && (str2 = this.f18074l0) != null) {
                            eVar6.setLanguage(str2);
                        }
                        d();
                        DictationAsr.U(this.m0);
                        DictationAsr.l(this.m0);
                        s();
                        g0.h3(this.f18072j0, 1500L);
                    }
                }
            }
        }
    }

    @Override
    public final void r(String str) {
        M(-1, str);
    }

    public final void s() {
        long[] jArr = new long[2];
        String str = null;
        if (DictationAsr.K(jArr)) {
            str = gd.a0(null, null, 2131745061, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        q qVar = this.h;
        if (qVar != null) {
            qVar.setPlaceholder(str);
        }
        e eVar = this.K;
        if (eVar != null && this.J) {
            eVar.setPlaceholder(str);
        }
    }

    public final void t(ai.w1 r25, java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: ji.n.t(ai.w1, java.lang.String):void");
    }
}
