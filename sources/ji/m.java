package ji;

import a8.p0;
import ai.b2;
import ai.m0;
import ai.t1;
import ai.v2;
import ai.y;
import ai.z1;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c8.ja;
import c8.z0;
import hi.d8;
import hi.h4;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.xr;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.an;
public final class m implements z1 {
    public static boolean f17567n0;
    public static final HashMap f17568o0 = new HashMap();
    public volatile int E;
    public volatile int F;
    public volatile boolean G;
    public String H;
    public boolean J;
    public e K;
    public long N;
    public long O;
    public boolean T;
    public b2 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context f17569a;
    public final gf f17571b;
    public int f17572b0;
    public y d;
    public q f17576e;
    public String f17577e0;
    public b2 f17578f;
    public int f17579f0;
    public String f17580g0;
    public p h;
    public boolean f17581h0;
    public boolean f17582i0;
    public String f17585l0;
    public long f17587r;
    public long f17588s;
    public volatile long f17589w;
    public volatile long f17590x;
    public volatile int f17591y;
    public int f17573c = 0;
    public String f17586n = "";
    public final i I = new i(this, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final i W = new i(this, 1);
    public String f17570a0 = "";
    public final int[] f17574c0 = new int[2];
    public final int[] f17575d0 = new int[2];
    public final f f17583j0 = new f(this, 1);
    public final i f17584k0 = new i(this, 2);
    public final f m0 = new f(this, 2);

    public m(Context context, gf gfVar) {
        this.f17569a = context;
        this.f17571b = gfVar;
    }

    public static void b(m mVar, b2 b2Var, String str, int i7) {
        if (b2Var == mVar.f17578f || b2Var == mVar.U) {
            if (!mVar.J) {
                mVar.M(i7, str);
                return;
            }
            int i10 = mVar.f17573c;
            if (i10 != 2 && i10 != 4) {
                return;
            }
            mVar.u(b2Var, str);
            mVar.n();
        }
    }

    @Override
    public final void M(int i7, String str) {
        if (this.f17573c == 2) {
            if (str == null) {
                str = "";
            }
            this.f17586n = str;
            p pVar = this.h;
            if (pVar != null) {
                pVar.t(i7, str);
            }
        }
    }

    @Override
    public final void P(String str) {
        String l10;
        if (str == null) {
            l10 = null;
        } else {
            l10 = m0.l(str);
        }
        p pVar = this.h;
        if (pVar != null && this.f17573c == 2) {
            pVar.setLanguage(l10);
        }
        e eVar = this.K;
        if (eVar != null && this.J && this.f17573c == 2) {
            this.f17585l0 = l10;
            eVar.setLanguage(l10);
        }
    }

    @Override
    public final void a(String str, String str2) {
        if (this.f17573c == 2) {
            if (!str.isEmpty()) {
                this.f17586n = str;
            }
            StringBuilder u10 = p0.u("recogniser ended error=", str2, " chars=");
            u10.append(this.f17586n.length());
            u10.append(" (the voice recording goes on)");
            Log.d("VoiceLive", u10.toString());
            this.f17578f = null;
            if (xr.f27575k == this) {
                xr.f27575k = null;
            }
            this.d = null;
            this.f17576e = null;
            if (TextUtils.isEmpty(this.f17586n.trim())) {
                p pVar = this.h;
                if (pVar != null) {
                    pVar.m();
                    return;
                }
                return;
            }
            p pVar2 = this.h;
            if (pVar2 != null) {
                pVar2.setText(this.f17586n);
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
        String U = DictationAsr.U();
        if (U != null) {
            String l10 = m0.l(U);
            p pVar = this.h;
            if (pVar != null) {
                pVar.setLanguage(l10);
            }
            e eVar = this.K;
            if (eVar != null && this.J) {
                this.f17585l0 = l10;
                eVar.setLanguage(l10);
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    public final boolean[] f(ArrayList arrayList, float f10, float f11) {
        long max;
        boolean z10;
        boolean[] zArr = new boolean[arrayList.size()];
        if (this.f17573c == 4) {
            long j3 = this.O;
            long j10 = 0;
            if (j3 > 0 && (f10 > 0.001f || f11 < 0.999f)) {
                float f12 = (float) j3;
                long j11 = f10 * f12;
                long j12 = f12 * f11;
                long j13 = 0;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    long j14 = ((l) arrayList.get(i7)).f17565b;
                    long j15 = j10;
                    if (((l) arrayList.get(i7)).f17566c >= j15) {
                        max = ((l) arrayList.get(i7)).f17566c;
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

    public final void g(String str, boolean z10) {
        boolean z11;
        p pVar;
        e eVar;
        String str2;
        String str3;
        int i7 = this.f17573c;
        if (i7 != 0 || this.h != null || this.K != null) {
            if (this.J && i7 == 4 && this.f17571b.c() && ("chat paused".equals(str) || "destroy".equals(str))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.J && this.f17573c != 0 && !z11) {
                f17568o0.remove(p());
            }
            if (this.f17573c != 0) {
                StringBuilder u10 = p0.u("dispose (", str, ") state=");
                int i10 = this.f17573c;
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
                u10.append(this.f17586n.length());
                u10.append(" chunks=");
                u10.append(this.f17591y);
                Log.d("VoiceLive", u10.toString());
            }
            this.f17573c = 0;
            this.H = null;
            g0.r(this.W);
            b2 b2Var = this.U;
            if (b2Var != null) {
                b2Var.c();
                this.U = null;
            }
            i(true);
            if (z11) {
                if (this.U == null) {
                    e();
                }
                k kVar = new k();
                ArrayList arrayList = kVar.f17557a;
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    l lVar = (l) obj;
                    l lVar2 = new l(lVar.f17564a, lVar.f17565b);
                    lVar2.f17566c = lVar.f17566c;
                    arrayList.add(lVar2);
                }
                ArrayList arrayList3 = this.M;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    l lVar3 = (l) obj2;
                    l lVar4 = new l(lVar3.f17564a, lVar3.f17565b);
                    lVar4.f17566c = lVar3.f17566c;
                    arrayList.add(lVar4);
                }
                kVar.f17558b = this.O;
                kVar.f17559c = this.P;
                kVar.d = this.Q;
                kVar.f17560e = this.f17577e0;
                kVar.f17562g = this.f17579f0;
                kVar.f17561f = this.f17580g0;
                kVar.h = this.f17581h0;
                kVar.f17563i = this.f17585l0;
                f17568o0.put(p(), kVar);
                StringBuilder sb2 = new StringBuilder("field: kept for the chat (");
                sb2.append(arrayList.size());
                sb2.append(" words");
                if (this.f17577e0 != null) {
                    str2 = ", styled / edited";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(")");
                Log.d("VoiceLive", sb2.toString());
            }
            this.f17577e0 = null;
            this.f17580g0 = null;
            this.f17582i0 = false;
            this.f17571b.g(Float.NaN, 0.0f);
            if (z10 && (eVar = this.K) != null && eVar.R) {
                eVar.R = false;
                eVar.f17477f0 = -1;
                eVar.invalidate();
            }
            g0.r(this.I);
            DictationAsr.N(this.m0);
            g0.r(this.f17584k0);
            g0.r(this.f17583j0);
            if (xr.f27575k == this) {
                xr.f27575k = null;
            }
            b2 b2Var2 = this.f17578f;
            if (b2Var2 != null) {
                b2Var2.c();
                this.f17578f = null;
            }
            y yVar = this.d;
            if (yVar != null) {
                yVar.d();
                this.d = null;
            }
            this.f17576e = null;
            if (z10 && (pVar = this.h) != null) {
                pVar.m();
            }
        }
    }

    @Override
    public final void h(float f10) {
        if (this.f17573c == 2) {
            if (this.J) {
                e eVar = this.K;
                if (eVar != null) {
                    eVar.setLevel(f10);
                    return;
                }
                return;
            }
            p pVar = this.h;
            if (pVar != null) {
                pVar.setLevel(f10);
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
            obj = this.f17586n;
        } else {
            obj = editTextBoldCursor.getText().toString();
        }
        this.f17586n = obj;
        this.f17577e0 = obj.trim();
        this.f17579f0 = c().size();
        if (z10 && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f17586n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            g0.v1(editTextBoldCursor);
        }
        g0.E2(editTextBoldCursor);
    }

    public final void j(Object obj) {
        String str;
        if (obj != null && !this.f17582i0 && this.K != null) {
            boolean z10 = false;
            if (this.X != null) {
                i(false);
            }
            if (this.f17580g0 == null) {
                this.f17580g0 = this.f17586n.trim();
                if (this.f17577e0 != null) {
                    z10 = true;
                }
                this.f17581h0 = z10;
            }
            String str2 = this.f17580g0;
            if (!str2.isEmpty()) {
                this.f17582i0 = true;
                this.K.setBusy(true);
                StringBuilder sb2 = new StringBuilder("field: style ");
                gf gfVar = this.f17571b;
                gfVar.getClass();
                if (obj instanceof ai.h) {
                    str = ((ai.h) obj).f1232a;
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(" in place on ");
                sb2.append(str2.length());
                sb2.append(" chars");
                Log.d("VoiceLive", sb2.toString());
                gfVar.f(obj, str2, new d8(this, SystemClock.uptimeMillis(), 1));
            }
        }
    }

    public final void k() {
        int i7 = this.f17573c;
        gf gfVar = this.f17571b;
        if (i7 == 4) {
            s();
            an anVar = gfVar.f34928a.f32319x3;
            if (anVar != null) {
                anVar.presentFragment(new v2());
            }
        } else if (i7 != 2) {
        } else {
            gfVar.e();
            g0.i3(new f(this, 4), 300L);
        }
    }

    public final void l(String str) {
        boolean z10;
        long j3;
        if (this.f17573c == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(str, false);
        e eVar = this.K;
        if (eVar == null) {
            return;
        }
        h4 h4Var = new h4(23, this, eVar);
        if (z10) {
            j3 = 470;
        } else {
            j3 = 60;
        }
        g0.i3(h4Var, j3);
    }

    public final void m(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        y yVar = this.d;
        q qVar = this.f17576e;
        if (yVar != null && qVar != null) {
            this.E = i10;
            this.F = i11;
            this.f17591y++;
            this.f17589w += i7;
            int c10 = qVar.c(byteBuffer, i7, i10);
            if (qVar.f17659c <= 0) {
                if (!this.G) {
                    this.G = true;
                    Log.w("VoiceLive", "recorder rate " + i10 + " Hz isn't a multiple of 16 kHz: no transcript");
                }
            } else if (c10 > 0) {
                this.f17590x += c10;
                byte[] bArr = (byte[]) qVar.f17662g;
                if (c10 > 0) {
                    synchronized (yVar.f1624a) {
                        try {
                            if (yVar.d) {
                                return;
                            }
                            yVar.a(c10, bArr);
                            int i12 = c10 / 2;
                            for (int i13 = 0; i13 < i12; i13++) {
                                int i14 = i13 * 2;
                                double d = (short) ((bArr[i14 + 1] << 8) | (bArr[i14] & 255));
                                yVar.h = (d * d) + yVar.h;
                            }
                            int i15 = yVar.f1630i + i12;
                            yVar.f1630i = i15;
                            if (i15 >= 1600) {
                                double sqrt = Math.sqrt(yVar.h / Math.max(1, i15));
                                yVar.h = 0.0d;
                                yVar.f1630i = 0;
                                t1 t1Var = yVar.f1629g;
                                if (t1Var != null) {
                                    t1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
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

    public final void n() {
        int i7;
        ArrayList c10 = c();
        EditTextBoldCursor editTextBoldCursor = this.X;
        int i10 = 0;
        if (editTextBoldCursor != null) {
            Editable text = editTextBoldCursor.getText();
            if (text != null) {
                int i11 = this.Z;
                String str = "";
                if (i11 < 0 || this.f17570a0.length() + i11 != text.length() || !text.toString().substring(this.Z).equals(this.f17570a0)) {
                    this.Y = Math.min(this.f17572b0, c10.size());
                    this.Z = text.length();
                    this.f17570a0 = "";
                }
                if (this.Y > c10.size()) {
                    this.Y = c10.size();
                }
                this.f17572b0 = c10.size();
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = this.Y; i12 < c10.size(); i12++) {
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append(((l) c10.get(i12)).f17564a);
                }
                if (sb2.length() != 0 || !this.f17570a0.isEmpty()) {
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
                    if (!str.equals(this.f17570a0)) {
                        text.replace(this.Z, text.length(), str);
                        this.f17570a0 = str;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean[] zArr = null;
        if (this.f17577e0 != null) {
            if (this.f17579f0 > c10.size()) {
                this.f17579f0 = c10.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f17577e0);
            StringBuilder sb4 = new StringBuilder(this.f17577e0);
            for (int i13 = this.f17579f0; i13 < c10.size(); i13++) {
                arrayList.add(((l) c10.get(i13)).f17564a);
                sb4.append(' ');
                sb4.append(((l) c10.get(i13)).f17564a);
            }
            this.f17586n = sb4.toString();
            e eVar = this.K;
            if (eVar != null) {
                eVar.x(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] f10 = f(c10, this.P, this.Q);
        if (this.T) {
            zArr = f(c10, this.R, this.S);
        }
        StringBuilder sb5 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(c10.size());
        boolean[] zArr2 = new boolean[c10.size()];
        int i14 = 0;
        while (i10 < c10.size()) {
            if (zArr == null || !zArr[i10] || !f10[i10]) {
                arrayList2.add(((l) c10.get(i10)).f17564a);
                int i15 = i14 + 1;
                zArr2[i14] = f10[i10];
                if (!f10[i10]) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    sb5.append(((l) c10.get(i10)).f17564a);
                }
                i14 = i15;
            }
            i10++;
        }
        this.f17586n = sb5.toString();
        e eVar2 = this.K;
        if (eVar2 != null) {
            eVar2.x(arrayList2, Arrays.copyOf(zArr2, i14), this.T);
        }
    }

    public final void o() {
        int i7;
        gf gfVar = this.f17571b;
        st0 st0Var = gfVar.f34928a.U1;
        if (st0Var == null) {
            return;
        }
        if (this.K == null) {
            e6 e6Var = gfVar.f34928a.E4;
            ?? obj = new Object();
            obj.d = this;
            obj.f60057c = st0Var;
            obj.f60055a = new int[2];
            obj.f60056b = new int[2];
            this.K = new e(this.f17569a, e6Var, obj);
        }
        View a10 = gfVar.a();
        if (this.K.getParent() != st0Var) {
            g0.E2(this.K);
            if (a10 != null && a10.getParent() == st0Var) {
                i7 = st0Var.indexOfChild(a10);
            } else {
                i7 = -1;
            }
            if (i7 >= 0) {
                st0Var.addView(this.K, i7, ja.c(-1.0f, -1));
            } else {
                st0Var.addView(this.K, ja.c(-1.0f, -1));
            }
        }
        this.K.E();
        this.K.setPaused(false);
        this.K.setListening(true);
        n();
        this.K.z();
        Log.d("VoiceLive", "field shown");
    }

    public final String p() {
        StringBuilder sb2 = new StringBuilder();
        gf gfVar = this.f17571b;
        sb2.append(gfVar.f34928a.R);
        sb2.append(":");
        sb2.append(gfVar.f34928a.f32327y3);
        return sb2.toString();
    }

    public final void q() {
        j jVar = new j(this);
        ChatActivityEnterView chatActivityEnterView = this.f17571b.f34928a;
        b2 b2Var = new b2(this.f17569a, chatActivityEnterView.R, chatActivityEnterView.f32327y3, false, jVar);
        jVar.f17555b = b2Var;
        this.f17578f = b2Var;
        b2Var.L = this.d;
        b2Var.s();
    }

    @Override
    public final void r(String str) {
        M(-1, str);
    }

    public final void s() {
        float f10;
        String str;
        int i7;
        int i10;
        boolean z10;
        int f11;
        float f12;
        boolean z11;
        int i11;
        String str2;
        long j3;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        float f13;
        float f14;
        long j10;
        int i13 = this.f17573c;
        if (i13 != 3) {
            if (i13 == 0 && z0.c() && !this.f17571b.d() && this.f17571b.c()) {
                f10 = 0.999f;
                k kVar = (k) f17568o0.get(p());
                if (kVar != null) {
                    i iVar = this.f17584k0;
                    i iVar2 = this.W;
                    float[] fArr = this.V;
                    this.J = true;
                    ArrayList arrayList = this.L;
                    arrayList.clear();
                    ArrayList arrayList2 = kVar.f17557a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList2.get(i14);
                        i14++;
                        l lVar = (l) obj;
                        l lVar2 = new l(lVar.f17564a, lVar.f17565b);
                        lVar2.f17566c = lVar.f17566c;
                        arrayList.add(lVar2);
                    }
                    long j11 = 0;
                    this.M.clear();
                    this.O = kVar.f17558b;
                    this.f17577e0 = kVar.f17560e;
                    this.f17579f0 = Math.min(kVar.f17562g, arrayList.size());
                    this.f17580g0 = kVar.f17561f;
                    this.f17581h0 = kVar.h;
                    this.f17585l0 = kVar.f17563i;
                    this.f17573c = 4;
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    if (kVar.f17559c <= 0.001f && kVar.d >= 0.999f) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (this.f17571b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z12 && !z13 && this.O > 0) {
                        float f15 = kVar.f17559c;
                        this.P = f15;
                        float f16 = kVar.d;
                        this.Q = f16;
                        boolean[] f17 = f(arrayList, f15, f16);
                        float f18 = this.P;
                        float f19 = (float) this.O;
                        long j12 = f18 * f19;
                        long j13 = this.Q * f19;
                        ArrayList arrayList3 = new ArrayList();
                        int i15 = 0;
                        while (i15 < arrayList.size()) {
                            if (f17[i15]) {
                                j10 = j13;
                            } else {
                                l lVar3 = (l) arrayList.get(i15);
                                j10 = j13;
                                long j14 = j11;
                                lVar3.f17565b = Math.max(j14, lVar3.f17565b - j12);
                                long j15 = lVar3.f17566c;
                                if (j15 >= j14) {
                                    lVar3.f17566c = Math.max(j14, j15 - j12);
                                }
                                arrayList3.add(lVar3);
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
                    o();
                    e eVar = this.K;
                    if (eVar != null) {
                        eVar.setListening(false);
                        this.K.setPaused(true);
                        e eVar2 = this.K;
                        if (this.f17580g0 != null) {
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
                            f13 = 1.0f;
                        } else {
                            f13 = 0.0f;
                        }
                        eVar3.f17454a0 = f13;
                        if (z15) {
                            f14 = 1.0f;
                        } else {
                            f14 = 0.0f;
                        }
                        eVar3.T0 = f14;
                        eVar3.f17459b0 = 0.0f;
                        eVar3.E0 = -1.0f;
                        eVar3.invalidate();
                        this.K.setLanguage(this.f17585l0);
                        d();
                    }
                    n();
                    g0.r(iVar2);
                    g0.i3(iVar2, 50L);
                    g0.r(iVar);
                    g0.i3(iVar, 250L);
                    return;
                }
            } else {
                f10 = 0.999f;
            }
            if (this.f17573c == 4) {
                if (this.f17571b.d()) {
                    g0.r(this.W);
                    b2 b2Var = this.U;
                    if (b2Var != null) {
                        this.U = null;
                        b2Var.c();
                        e();
                    }
                    e();
                    float f20 = this.P;
                    long j16 = this.O;
                    float f21 = (float) j16;
                    long j17 = f20 * f21;
                    float f22 = this.Q;
                    long j18 = f21 * f22;
                    if (j16 > 0 && (f20 > 0.001f || f22 < f10)) {
                        boolean[] f23 = f(this.L, f20, f22);
                        ArrayList arrayList4 = new ArrayList();
                        int i16 = 0;
                        while (i16 < this.L.size()) {
                            if (f23[i16]) {
                                i12 = i16;
                            } else {
                                l lVar4 = (l) this.L.get(i16);
                                i12 = i16;
                                lVar4.f17565b = Math.max(0L, lVar4.f17565b - j17);
                                long j19 = lVar4.f17566c;
                                if (j19 >= 0) {
                                    lVar4.f17566c = Math.max(0L, j19 - j17);
                                }
                                arrayList4.add(lVar4);
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
                    if (this.f17577e0 != null) {
                        this.f17579f0 = this.L.size();
                    }
                    if (this.X != null) {
                        int size2 = this.L.size();
                        this.f17572b0 = size2;
                        this.Y = size2;
                        this.Z = this.X.length();
                        this.f17570a0 = "";
                    }
                    this.d = new y();
                    this.f17576e = new q(0);
                    xr.f27575k = this;
                    this.f17573c = 2;
                    q();
                    e eVar4 = this.K;
                    if (eVar4 != null) {
                        eVar4.setPaused(false);
                        this.K.setListening(true);
                    }
                    d();
                    DictationAsr.N(this.m0);
                    DictationAsr.f42584g.add(this.m0);
                    t();
                    n();
                    g0.r(this.f17584k0);
                    g0.i3(this.f17584k0, 250L);
                } else if (!this.f17571b.c()) {
                    g("draft gone", true);
                }
            } else if (!z0.a()) {
                if (this.f17573c != 0) {
                    g("unavailable", true);
                }
            } else if (!this.f17571b.d()) {
                if (this.J && this.f17573c == 2) {
                    gf gfVar = this.f17571b;
                    gfVar.getClass();
                    if ((MediaController.B().K() || gfVar.f34928a.J3 != null) && this.f17571b.c()) {
                        i iVar3 = this.W;
                        this.f17573c = 4;
                        g0.r(this.f17583j0);
                        y yVar = this.d;
                        if (yVar != null) {
                            j3 = yVar.c() / 32;
                        } else {
                            j3 = 0;
                        }
                        this.O = this.N + j3;
                        if (xr.f27575k == this) {
                            xr.f27575k = null;
                        }
                        b2 b2Var2 = this.f17578f;
                        if (b2Var2 != null) {
                            this.U = b2Var2;
                            this.f17578f = null;
                            y yVar2 = this.d;
                            if (yVar2 != null) {
                                yVar2.d();
                            }
                            this.U.u();
                        } else {
                            e();
                        }
                        this.d = null;
                        this.f17576e = null;
                        this.P = 0.0f;
                        this.Q = 1.0f;
                        this.T = false;
                        Log.d("VoiceLive", "field: paused at " + this.O + " ms, " + (this.M.size() + this.L.size()) + " words");
                        e eVar5 = this.K;
                        if (eVar5 != null) {
                            eVar5.setListening(false);
                            this.K.setPaused(true);
                        }
                        n();
                        g0.r(iVar3);
                        g0.i3(iVar3, 50L);
                        return;
                    }
                }
                if (this.f17573c != 0) {
                    g("not recording", true);
                }
            } else {
                int i17 = 1;
                if (this.f17573c == 0) {
                    if (!f17567n0) {
                        f17567n0 = true;
                        StringBuilder sb2 = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                        StringBuilder sb3 = new StringBuilder();
                        int[] iArr = {1000, 12000};
                        int i18 = 0;
                        while (i18 < 2) {
                            int i19 = iArr[i18];
                            q qVar = new q(0);
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
                            int c10 = qVar.c(allocate, 19200, 48000);
                            byte[] bArr = (byte[]) qVar.f17662g;
                            double d = 0.0d;
                            int i22 = 0;
                            for (int i23 = 200; i23 < c10 / 2; i23++) {
                                int i24 = i23 * 2;
                                double d2 = (short) ((bArr[i24 + 1] << 8) | (bArr[i24] & 255));
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
                    this.d = new y();
                    this.f17576e = new q(0);
                    this.f17590x = 0L;
                    this.f17589w = 0L;
                    this.f17591y = 0;
                    this.E = 0;
                    this.F = 0;
                    this.G = false;
                    this.f17586n = "";
                    this.J = z0.c();
                    this.L.clear();
                    this.M.clear();
                    this.N = 0L;
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    this.f17587r = SystemClock.elapsedRealtime();
                    i17 = 1;
                    this.f17573c = 1;
                    xr.f27575k = this;
                    g0.r(this.f17584k0);
                    g0.i3(this.f17584k0, 250L);
                    Log.d("VoiceLive", "buffering: recorder tap on");
                }
                if (this.f17573c == i17 && this.f17571b.f34928a.I0()) {
                    this.f17573c = 2;
                    this.f17585l0 = null;
                    this.f17588s = SystemClock.elapsedRealtime();
                    StringBuilder sb4 = new StringBuilder("locked → live: buffered ");
                    sb4.append((this.d.c() * 1000) / 32000);
                    sb4.append(" ms, chunks=");
                    sb4.append(this.f17591y);
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
                    sb4.append(this.f17588s - this.f17587r);
                    sb4.append(" ms since start)");
                    Log.d("VoiceLive", sb4.toString());
                    q();
                    if (this.J) {
                        o();
                    } else {
                        gf gfVar2 = this.f17571b;
                        st0 st0Var = gfVar2.f34928a.U1;
                        if (st0Var != null) {
                            if (this.h == null) {
                                this.h = new p(this.f17569a, gfVar2.f34928a.E4, this);
                            }
                            View a10 = gfVar2.a();
                            if (a10 != null && a10.getParent() == st0Var) {
                                i7 = st0Var.indexOfChild(a10);
                            } else {
                                i7 = -1;
                            }
                            if (this.h.getParent() != st0Var || (i7 >= 0 && st0Var.indexOfChild(this.h) != i7 - 1)) {
                                g0.E2(this.h);
                                if (a10 != null && a10.getParent() == st0Var) {
                                    i10 = st0Var.indexOfChild(a10);
                                } else {
                                    i10 = -1;
                                }
                                if (i10 >= 0) {
                                    st0Var.addView(this.h, i10, ja.e(-1, -1, 80));
                                } else {
                                    st0Var.addView(this.h, ja.e(-1, -1, 80));
                                    Log.w("VoiceLive", "composer isn't a direct child of the root: overlay on top");
                                }
                            }
                            p pVar = this.h;
                            ChatActivityEnterView chatActivityEnterView = gfVar2.f34928a;
                            int i26 = j6.Pe;
                            int i27 = ChatActivityEnterView.N6;
                            pVar.setAccent(chatActivityEnterView.u0(i26) | (-16777216));
                            p pVar2 = this.h;
                            TextPaint textPaint = pVar2.f17603c;
                            int i28 = j6.f28849d6;
                            e6 e6Var = pVar2.f17600b;
                            if (g0.B(j6.w0(i28, e6Var)) < 0.5f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            pVar2.f17609e0 = z10;
                            int w02 = (-16777216) | j6.w0(j6.G6, e6Var);
                            pVar2.f17612f0 = w02;
                            textPaint.setColor(w02);
                            int i29 = pVar2.f17612f0;
                            p.W1 = i29;
                            if (pVar2.f17609e0) {
                                f11 = i0.a.f(0.12f, pVar2.f17614g0, -1);
                            } else {
                                f11 = i0.a.f(0.32f, pVar2.f17614g0, i29);
                            }
                            p.V1 = f11;
                            p.X1 = g0.L(7.0f);
                            TextPaint textPaint2 = pVar2.d;
                            int i30 = pVar2.f17612f0;
                            if (pVar2.f17609e0) {
                                f12 = 0.42f;
                            } else {
                                f12 = 0.36f;
                            }
                            textPaint2.setColor(j6.r1(f12, i30));
                            if (Build.VERSION.SDK_INT >= 31 && gz.o() != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            pVar2.f17616h0 = z11;
                            pVar2.f17634r = 0;
                            Paint paint = pVar2.f17637s;
                            if (pVar2.f17609e0) {
                                i11 = 0;
                            } else {
                                i11 = 335544320;
                            }
                            paint.setColor(i11);
                            pVar2.f17618i0 = "";
                            pVar2.f17648w1 = -1;
                            pVar2.f17620j0 = null;
                            pVar2.m0.clear();
                            pVar2.S0 = true;
                            pVar2.B0 = 0.0f;
                            pVar2.A0 = 0.0f;
                            pVar2.C0 = 0.0f;
                            pVar2.D0 = 0.0f;
                            pVar2.F0 = -1.0f;
                            pVar2.E0 = -1.0f;
                            pVar2.H0 = -1.0f;
                            pVar2.J0 = false;
                            pVar2.setStyleIcon(null);
                            pVar2.K0 = false;
                            pVar2.N0 = false;
                            pVar2.f17645v1 = null;
                            pVar2.N1 = false;
                            pVar2.f17651x1 = false;
                            pVar2.B1 = null;
                            pVar2.C1.clear();
                            textPaint.setShader(null);
                            pVar2.Q0 = 0L;
                            pVar2.R0 = 0.0f;
                            pVar2.f17653y0 = true;
                            pVar2.V0 = 0.0f;
                            pVar2.W0 = 0.0f;
                            pVar2.X0 = true;
                            pVar2.Y0 = 1.0f;
                            pVar2.Z0 = 0.0f;
                            pVar2.f17621j1 = -1;
                            Arrays.fill(pVar2.f17623k1, 0.0f);
                            pVar2.M = null;
                            pVar2.N = 0.0f;
                            pVar2.O = 0.0f;
                            pVar2.U = false;
                            pVar2.P.setEmpty();
                            pVar2.setPlaceholder(null);
                            pVar2.f17627n0 = true;
                            pVar2.f17630p0 = SystemClock.uptimeMillis();
                            pVar2.f17635r0 = 0L;
                            pVar2.f17606d0 = 0L;
                            pVar2.setVisibility(0);
                            pVar2.invalidate();
                            Log.d("VoiceLive", "overlay shown at index " + st0Var.indexOfChild(this.h) + "/" + st0Var.getChildCount());
                        }
                    }
                    e eVar6 = this.K;
                    if (eVar6 != null && this.J && (str2 = this.f17585l0) != null) {
                        eVar6.setLanguage(str2);
                    }
                    d();
                    DictationAsr.N(this.m0);
                    DictationAsr.f42584g.add(this.m0);
                    t();
                    g0.i3(this.f17583j0, 1500L);
                }
            }
        }
    }

    public final void t() {
        String r10;
        long[] jArr = new long[2];
        if (!DictationAsr.F(jArr)) {
            r10 = null;
        } else {
            Locale locale = Locale.US;
            long round = Math.round(jArr[0] / 1048576.0d);
            r10 = p0.r(p0.t(round, "Downloading models… ", " / "), Math.max(1L, Math.round(jArr[1] / 1048576.0d)), "MB");
        }
        p pVar = this.h;
        if (pVar != null) {
            pVar.setPlaceholder(r10);
        }
        e eVar = this.K;
        if (eVar != null && this.J) {
            eVar.setPlaceholder(r10);
        }
    }

    public final void u(ai.b2 r25, java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: ji.m.u(ai.b2, java.lang.String):void");
    }
}
