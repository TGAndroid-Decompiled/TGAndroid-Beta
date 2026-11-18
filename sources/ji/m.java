package ji;

import a8.p0;
import ai.a2;
import ai.c2;
import ai.n0;
import ai.u1;
import ai.x2;
import ai.z;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c8.b1;
import c8.ma;
import hi.d8;
import hi.r1;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bn;
public final class m implements a2 {
    public static boolean f17957n0;
    public static final HashMap f17958o0 = new HashMap();
    public volatile int E;
    public volatile int F;
    public volatile boolean G;
    public String H;
    public boolean J;
    public e K;
    public long N;
    public long O;
    public boolean T;
    public c2 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context f17959a;
    public final pf f17961b;
    public int f17962b0;
    public z d;
    public q f17966e;
    public String f17967e0;
    public c2 f17968f;
    public int f17969f0;
    public String f17970g0;
    public p h;
    public boolean f17971h0;
    public boolean f17972i0;
    public String f17975l0;
    public long f17977r;
    public long f17978s;
    public volatile long f17979w;
    public volatile long f17980x;
    public volatile int f17981y;
    public int f17963c = 0;
    public String f17976n = "";
    public final i I = new i(this, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final i W = new i(this, 1);
    public String f17960a0 = "";
    public final int[] f17964c0 = new int[2];
    public final int[] f17965d0 = new int[2];
    public final f f17973j0 = new f(this, 1);
    public final i f17974k0 = new i(this, 2);
    public final f m0 = new f(this, 2);

    public m(Context context, pf pfVar) {
        this.f17959a = context;
        this.f17961b = pfVar;
    }

    public static void b(m mVar, c2 c2Var, String str, int i7) {
        if (c2Var == mVar.f17968f || c2Var == mVar.U) {
            if (!mVar.J) {
                mVar.l(i7, str);
                return;
            }
            int i10 = mVar.f17963c;
            if (i10 != 2 && i10 != 4) {
                return;
            }
            mVar.v(c2Var, str);
            mVar.p();
        }
    }

    @Override
    public final void a(String str, String str2) {
        if (this.f17963c == 2) {
            if (!str.isEmpty()) {
                this.f17976n = str;
            }
            StringBuilder u10 = p0.u("recogniser ended error=", str2, " chars=");
            u10.append(this.f17976n.length());
            u10.append(" (the voice recording goes on)");
            Log.d("VoiceLive", u10.toString());
            this.f17968f = null;
            if (vr.f27591k == this) {
                vr.f27591k = null;
            }
            this.d = null;
            this.f17966e = null;
            if (TextUtils.isEmpty(this.f17976n.trim())) {
                p pVar = this.h;
                if (pVar != null) {
                    pVar.m();
                    return;
                }
                return;
            }
            p pVar2 = this.h;
            if (pVar2 != null) {
                pVar2.setText(this.f17976n);
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
            String p10 = n0.p(U);
            p pVar = this.h;
            if (pVar != null) {
                pVar.setLanguage(p10);
            }
            e eVar = this.K;
            if (eVar != null && this.J) {
                this.f17975l0 = p10;
                eVar.setLanguage(p10);
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
        if (this.f17963c == 4) {
            long j3 = this.O;
            long j10 = 0;
            if (j3 > 0 && (f10 > 0.001f || f11 < 0.999f)) {
                float f12 = (float) j3;
                long j11 = f10 * f12;
                long j12 = f12 * f11;
                long j13 = 0;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    long j14 = ((l) arrayList.get(i7)).f17955b;
                    long j15 = j10;
                    if (((l) arrayList.get(i7)).f17956c >= j15) {
                        max = ((l) arrayList.get(i7)).f17956c;
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
        int i7 = this.f17963c;
        if (i7 != 0 || this.h != null || this.K != null) {
            if (this.J && i7 == 4 && this.f17961b.c() && ("chat paused".equals(str) || "destroy".equals(str))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.J && this.f17963c != 0 && !z11) {
                f17958o0.remove(r());
            }
            if (this.f17963c != 0) {
                StringBuilder u10 = p0.u("dispose (", str, ") state=");
                int i10 = this.f17963c;
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
                u10.append(this.f17976n.length());
                u10.append(" chunks=");
                u10.append(this.f17981y);
                Log.d("VoiceLive", u10.toString());
            }
            this.f17963c = 0;
            this.H = null;
            g0.r(this.W);
            c2 c2Var = this.U;
            if (c2Var != null) {
                c2Var.c();
                this.U = null;
            }
            j(true);
            if (z11) {
                if (this.U == null) {
                    e();
                }
                k kVar = new k();
                ArrayList arrayList = kVar.f17947a;
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    l lVar = (l) obj;
                    l lVar2 = new l(lVar.f17954a, lVar.f17955b);
                    lVar2.f17956c = lVar.f17956c;
                    arrayList.add(lVar2);
                }
                ArrayList arrayList3 = this.M;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    l lVar3 = (l) obj2;
                    l lVar4 = new l(lVar3.f17954a, lVar3.f17955b);
                    lVar4.f17956c = lVar3.f17956c;
                    arrayList.add(lVar4);
                }
                kVar.f17948b = this.O;
                kVar.f17949c = this.P;
                kVar.d = this.Q;
                kVar.f17950e = this.f17967e0;
                kVar.f17952g = this.f17969f0;
                kVar.f17951f = this.f17970g0;
                kVar.h = this.f17971h0;
                kVar.f17953i = this.f17975l0;
                f17958o0.put(r(), kVar);
                StringBuilder sb2 = new StringBuilder("field: kept for the chat (");
                sb2.append(arrayList.size());
                sb2.append(" words");
                if (this.f17967e0 != null) {
                    str2 = ", styled / edited";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(")");
                Log.d("VoiceLive", sb2.toString());
            }
            this.f17967e0 = null;
            this.f17970g0 = null;
            this.f17972i0 = false;
            this.f17961b.g(Float.NaN, 0.0f);
            if (z10 && (eVar = this.K) != null && eVar.R) {
                eVar.R = false;
                eVar.f17859f0 = -1;
                eVar.invalidate();
            }
            g0.r(this.I);
            DictationAsr.N(this.m0);
            g0.r(this.f17974k0);
            g0.r(this.f17973j0);
            if (vr.f27591k == this) {
                vr.f27591k = null;
            }
            c2 c2Var2 = this.f17968f;
            if (c2Var2 != null) {
                c2Var2.c();
                this.f17968f = null;
            }
            z zVar = this.d;
            if (zVar != null) {
                zVar.d();
                this.d = null;
            }
            this.f17966e = null;
            if (z10 && (pVar = this.h) != null) {
                pVar.m();
            }
        }
    }

    @Override
    public final void h(float f10) {
        if (this.f17963c == 2) {
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

    @Override
    public final void i(String str) {
        l(-1, str);
    }

    public final void j(boolean z10) {
        String obj;
        EditTextBoldCursor editTextBoldCursor = this.X;
        if (editTextBoldCursor == null) {
            return;
        }
        this.X = null;
        if (editTextBoldCursor.getText() == null) {
            obj = this.f17976n;
        } else {
            obj = editTextBoldCursor.getText().toString();
        }
        this.f17976n = obj;
        this.f17967e0 = obj.trim();
        this.f17969f0 = c().size();
        if (z10 && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f17976n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            g0.v1(editTextBoldCursor);
        }
        g0.E2(editTextBoldCursor);
    }

    public final void k(Object obj) {
        String str;
        if (obj != null && !this.f17972i0 && this.K != null) {
            boolean z10 = false;
            if (this.X != null) {
                j(false);
            }
            if (this.f17970g0 == null) {
                this.f17970g0 = this.f17976n.trim();
                if (this.f17967e0 != null) {
                    z10 = true;
                }
                this.f17971h0 = z10;
            }
            String str2 = this.f17970g0;
            if (!str2.isEmpty()) {
                this.f17972i0 = true;
                this.K.setBusy(true);
                StringBuilder sb2 = new StringBuilder("field: style ");
                pf pfVar = this.f17961b;
                pfVar.getClass();
                if (obj instanceof ai.g) {
                    str = ((ai.g) obj).a();
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(" in place on ");
                sb2.append(str2.length());
                sb2.append(" chars");
                Log.d("VoiceLive", sb2.toString());
                pfVar.f(obj, str2, new d8(this, SystemClock.uptimeMillis(), 1));
            }
        }
    }

    @Override
    public final void l(int i7, String str) {
        if (this.f17963c == 2) {
            if (str == null) {
                str = "";
            }
            this.f17976n = str;
            p pVar = this.h;
            if (pVar != null) {
                pVar.t(i7, str);
            }
        }
    }

    public final void m() {
        int i7 = this.f17963c;
        pf pfVar = this.f17961b;
        if (i7 == 4) {
            t();
            bn bnVar = pfVar.f38384a.D3;
            if (bnVar != null) {
                bnVar.presentFragment(new x2());
            }
        } else if (i7 != 2) {
        } else {
            pfVar.e();
            g0.h3(new f(this, 4), 300L);
        }
    }

    public final void n(String str) {
        boolean z10;
        long j3;
        if (this.f17963c == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(str, false);
        e eVar = this.K;
        if (eVar == null) {
            return;
        }
        r1 r1Var = new r1(26, this, eVar);
        if (z10) {
            j3 = 470;
        } else {
            j3 = 60;
        }
        g0.h3(r1Var, j3);
    }

    public final void o(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        z zVar = this.d;
        q qVar = this.f17966e;
        if (zVar != null && qVar != null) {
            this.E = i10;
            this.F = i11;
            this.f17981y++;
            this.f17979w += i7;
            int c10 = qVar.c(byteBuffer, i7, i10);
            if (qVar.f18051c <= 0) {
                if (!this.G) {
                    this.G = true;
                    Log.w("VoiceLive", "recorder rate " + i10 + " Hz isn't a multiple of 16 kHz: no transcript");
                }
            } else if (c10 > 0) {
                this.f17980x += c10;
                byte[] bArr = (byte[]) qVar.f18054g;
                if (c10 > 0) {
                    synchronized (zVar.f1628a) {
                        try {
                            if (zVar.d) {
                                return;
                            }
                            zVar.a(c10, bArr);
                            int i12 = c10 / 2;
                            for (int i13 = 0; i13 < i12; i13++) {
                                int i14 = i13 * 2;
                                double d = (short) ((bArr[i14 + 1] << 8) | (bArr[i14] & 255));
                                zVar.h = (d * d) + zVar.h;
                            }
                            int i15 = zVar.f1634i + i12;
                            zVar.f1634i = i15;
                            if (i15 >= 1600) {
                                double sqrt = Math.sqrt(zVar.h / Math.max(1, i15));
                                zVar.h = 0.0d;
                                zVar.f1634i = 0;
                                u1 u1Var = zVar.f1633g;
                                if (u1Var != null) {
                                    u1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
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

    public final void p() {
        int i7;
        ArrayList c10 = c();
        EditTextBoldCursor editTextBoldCursor = this.X;
        int i10 = 0;
        if (editTextBoldCursor != null) {
            Editable text = editTextBoldCursor.getText();
            if (text != null) {
                int i11 = this.Z;
                String str = "";
                if (i11 < 0 || this.f17960a0.length() + i11 != text.length() || !text.toString().substring(this.Z).equals(this.f17960a0)) {
                    this.Y = Math.min(this.f17962b0, c10.size());
                    this.Z = text.length();
                    this.f17960a0 = "";
                }
                if (this.Y > c10.size()) {
                    this.Y = c10.size();
                }
                this.f17962b0 = c10.size();
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = this.Y; i12 < c10.size(); i12++) {
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append(((l) c10.get(i12)).f17954a);
                }
                if (sb2.length() != 0 || !this.f17960a0.isEmpty()) {
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
                    if (!str.equals(this.f17960a0)) {
                        text.replace(this.Z, text.length(), str);
                        this.f17960a0 = str;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean[] zArr = null;
        if (this.f17967e0 != null) {
            if (this.f17969f0 > c10.size()) {
                this.f17969f0 = c10.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f17967e0);
            StringBuilder sb4 = new StringBuilder(this.f17967e0);
            for (int i13 = this.f17969f0; i13 < c10.size(); i13++) {
                arrayList.add(((l) c10.get(i13)).f17954a);
                sb4.append(' ');
                sb4.append(((l) c10.get(i13)).f17954a);
            }
            this.f17976n = sb4.toString();
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
                arrayList2.add(((l) c10.get(i10)).f17954a);
                int i15 = i14 + 1;
                zArr2[i14] = f10[i10];
                if (!f10[i10]) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    sb5.append(((l) c10.get(i10)).f17954a);
                }
                i14 = i15;
            }
            i10++;
        }
        this.f17976n = sb5.toString();
        e eVar2 = this.K;
        if (eVar2 != null) {
            eVar2.x(arrayList2, Arrays.copyOf(zArr2, i14), this.T);
        }
    }

    public final void q() {
        int i7;
        pf pfVar = this.f17961b;
        au0 au0Var = pfVar.f38384a.f32542a2;
        if (au0Var == null) {
            return;
        }
        if (this.K == null) {
            i6 i6Var = pfVar.f38384a.K4;
            ?? obj = new Object();
            obj.d = this;
            obj.f60623c = au0Var;
            obj.f60621a = new int[2];
            obj.f60622b = new int[2];
            this.K = new e(this.f17959a, i6Var, obj);
        }
        View a10 = pfVar.a();
        if (this.K.getParent() != au0Var) {
            g0.E2(this.K);
            if (a10 != null && a10.getParent() == au0Var) {
                i7 = au0Var.indexOfChild(a10);
            } else {
                i7 = -1;
            }
            if (i7 >= 0) {
                au0Var.addView(this.K, i7, ma.c(-1.0f, -1));
            } else {
                au0Var.addView(this.K, ma.c(-1.0f, -1));
            }
        }
        this.K.E();
        this.K.setPaused(false);
        this.K.setListening(true);
        p();
        this.K.z();
        Log.d("VoiceLive", "field shown");
    }

    public final String r() {
        StringBuilder sb2 = new StringBuilder();
        pf pfVar = this.f17961b;
        sb2.append(pfVar.f38384a.R);
        sb2.append(":");
        sb2.append(pfVar.f38384a.E3);
        return sb2.toString();
    }

    public final void s() {
        j jVar = new j(this);
        ChatActivityEnterView chatActivityEnterView = this.f17961b.f38384a;
        c2 c2Var = new c2(this.f17959a, chatActivityEnterView.R, chatActivityEnterView.E3, false, jVar);
        jVar.f17945b = c2Var;
        this.f17968f = c2Var;
        c2Var.J = this.d;
        c2Var.s();
    }

    public final void t() {
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
        k kVar;
        boolean z12;
        boolean z13;
        boolean z14;
        float f12;
        float f13;
        long j10;
        int i13 = this.f17963c;
        if (i13 != 3) {
            if (i13 == 0 && mp.g1().getBoolean("design_voice_live_field", true) && !this.f17961b.d() && this.f17961b.c() && (kVar = (k) f17958o0.get(r())) != null) {
                i iVar = this.f17974k0;
                i iVar2 = this.W;
                float[] fArr = this.V;
                this.J = true;
                ArrayList arrayList = this.L;
                arrayList.clear();
                ArrayList arrayList2 = kVar.f17947a;
                int size = arrayList2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    l lVar = (l) arrayList2.get(i14);
                    l lVar2 = new l(lVar.f17954a, lVar.f17955b);
                    lVar2.f17956c = lVar.f17956c;
                    arrayList.add(lVar2);
                }
                long j11 = 0;
                this.M.clear();
                this.O = kVar.f17948b;
                this.f17967e0 = kVar.f17950e;
                this.f17969f0 = Math.min(kVar.f17952g, arrayList.size());
                this.f17970g0 = kVar.f17951f;
                this.f17971h0 = kVar.h;
                this.f17975l0 = kVar.f17953i;
                this.f17963c = 4;
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                if (kVar.f17949c <= 0.001f && kVar.d >= 0.999f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (this.f17961b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 && !z13 && this.O > 0) {
                    float f14 = kVar.f17949c;
                    this.P = f14;
                    float f15 = kVar.d;
                    this.Q = f15;
                    boolean[] f16 = f(arrayList, f14, f15);
                    float f17 = this.P;
                    float f18 = (float) this.O;
                    long j12 = f17 * f18;
                    long j13 = this.Q * f18;
                    ArrayList arrayList3 = new ArrayList();
                    int i15 = 0;
                    while (i15 < arrayList.size()) {
                        if (f16[i15]) {
                            j10 = j13;
                        } else {
                            l lVar3 = (l) arrayList.get(i15);
                            j10 = j13;
                            long j14 = j11;
                            lVar3.f17955b = Math.max(j14, lVar3.f17955b - j12);
                            long j15 = lVar3.f17956c;
                            if (j15 >= j14) {
                                lVar3.f17956c = Math.max(j14, j15 - j12);
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
                q();
                e eVar = this.K;
                if (eVar != null) {
                    eVar.setListening(false);
                    this.K.setPaused(true);
                    e eVar2 = this.K;
                    if (this.f17970g0 != null) {
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
                    eVar3.f17836a0 = f12;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    eVar3.T0 = f13;
                    eVar3.f17841b0 = 0.0f;
                    eVar3.E0 = -1.0f;
                    eVar3.invalidate();
                    this.K.setLanguage(this.f17975l0);
                    d();
                }
                p();
                g0.r(iVar2);
                g0.h3(iVar2, 50L);
                g0.r(iVar);
                g0.h3(iVar, 250L);
            } else if (this.f17963c == 4) {
                if (this.f17961b.d()) {
                    g0.r(this.W);
                    c2 c2Var = this.U;
                    if (c2Var != null) {
                        this.U = null;
                        c2Var.c();
                        e();
                    }
                    e();
                    float f19 = this.P;
                    long j16 = this.O;
                    float f20 = (float) j16;
                    long j17 = f19 * f20;
                    float f21 = this.Q;
                    long j18 = f20 * f21;
                    if (j16 > 0 && (f19 > 0.001f || f21 < 0.999f)) {
                        boolean[] f22 = f(this.L, f19, f21);
                        ArrayList arrayList4 = new ArrayList();
                        int i16 = 0;
                        while (i16 < this.L.size()) {
                            if (f22[i16]) {
                                i12 = i16;
                            } else {
                                l lVar4 = (l) this.L.get(i16);
                                i12 = i16;
                                lVar4.f17955b = Math.max(0L, lVar4.f17955b - j17);
                                long j19 = lVar4.f17956c;
                                if (j19 >= 0) {
                                    lVar4.f17956c = Math.max(0L, j19 - j17);
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
                    if (this.f17967e0 != null) {
                        this.f17969f0 = this.L.size();
                    }
                    if (this.X != null) {
                        int size2 = this.L.size();
                        this.f17962b0 = size2;
                        this.Y = size2;
                        this.Z = this.X.length();
                        this.f17960a0 = "";
                    }
                    this.d = new z();
                    this.f17966e = new q(0);
                    vr.f27591k = this;
                    this.f17963c = 2;
                    s();
                    e eVar4 = this.K;
                    if (eVar4 != null) {
                        eVar4.setPaused(false);
                        this.K.setListening(true);
                    }
                    d();
                    DictationAsr.N(this.m0);
                    DictationAsr.f43028g.add(this.m0);
                    u();
                    p();
                    g0.r(this.f17974k0);
                    g0.h3(this.f17974k0, 250L);
                } else if (!this.f17961b.c()) {
                    g("draft gone", true);
                }
            } else if (!b1.a()) {
                if (this.f17963c != 0) {
                    g("unavailable", true);
                }
            } else if (!this.f17961b.d()) {
                if (this.J && this.f17963c == 2) {
                    pf pfVar = this.f17961b;
                    pfVar.getClass();
                    if ((MediaController.B().K() || pfVar.f38384a.P3 != null) && this.f17961b.c()) {
                        i iVar3 = this.W;
                        this.f17963c = 4;
                        g0.r(this.f17973j0);
                        z zVar = this.d;
                        if (zVar != null) {
                            j3 = zVar.c() / 32;
                        } else {
                            j3 = 0;
                        }
                        this.O = this.N + j3;
                        if (vr.f27591k == this) {
                            vr.f27591k = null;
                        }
                        c2 c2Var2 = this.f17968f;
                        if (c2Var2 != null) {
                            this.U = c2Var2;
                            this.f17968f = null;
                            z zVar2 = this.d;
                            if (zVar2 != null) {
                                zVar2.d();
                            }
                            this.U.u();
                        } else {
                            e();
                        }
                        this.d = null;
                        this.f17966e = null;
                        this.P = 0.0f;
                        this.Q = 1.0f;
                        this.T = false;
                        Log.d("VoiceLive", "field: paused at " + this.O + " ms, " + (this.M.size() + this.L.size()) + " words");
                        e eVar5 = this.K;
                        if (eVar5 != null) {
                            eVar5.setListening(false);
                            this.K.setPaused(true);
                        }
                        p();
                        g0.r(iVar3);
                        g0.h3(iVar3, 50L);
                        return;
                    }
                }
                if (this.f17963c != 0) {
                    g("not recording", true);
                }
            } else {
                int i17 = 1;
                if (this.f17963c == 0) {
                    if (!f17957n0) {
                        f17957n0 = true;
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
                            byte[] bArr = (byte[]) qVar.f18054g;
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
                    this.d = new z();
                    this.f17966e = new q(0);
                    this.f17980x = 0L;
                    this.f17979w = 0L;
                    this.f17981y = 0;
                    this.E = 0;
                    this.F = 0;
                    this.G = false;
                    this.f17976n = "";
                    this.J = mp.g1().getBoolean("design_voice_live_field", true);
                    this.L.clear();
                    this.M.clear();
                    this.N = 0L;
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    this.f17977r = SystemClock.elapsedRealtime();
                    i17 = 1;
                    this.f17963c = 1;
                    vr.f27591k = this;
                    g0.r(this.f17974k0);
                    g0.h3(this.f17974k0, 250L);
                    Log.d("VoiceLive", "buffering: recorder tap on");
                }
                if (this.f17963c == i17 && this.f17961b.f38384a.Q0()) {
                    this.f17963c = 2;
                    this.f17975l0 = null;
                    this.f17978s = SystemClock.elapsedRealtime();
                    StringBuilder sb4 = new StringBuilder("locked → live: buffered ");
                    sb4.append((this.d.c() * 1000) / 32000);
                    sb4.append(" ms, chunks=");
                    sb4.append(this.f17981y);
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
                    sb4.append(this.f17978s - this.f17977r);
                    sb4.append(" ms since start)");
                    Log.d("VoiceLive", sb4.toString());
                    s();
                    if (this.J) {
                        q();
                    } else {
                        pf pfVar2 = this.f17961b;
                        au0 au0Var = pfVar2.f38384a.f32542a2;
                        if (au0Var != null) {
                            if (this.h == null) {
                                this.h = new p(this.f17959a, pfVar2.f38384a.K4, this);
                            }
                            View a10 = pfVar2.a();
                            if (a10 != null && a10.getParent() == au0Var) {
                                i7 = au0Var.indexOfChild(a10);
                            } else {
                                i7 = -1;
                            }
                            if (this.h.getParent() != au0Var || (i7 >= 0 && au0Var.indexOfChild(this.h) != i7 - 1)) {
                                g0.E2(this.h);
                                if (a10 != null && a10.getParent() == au0Var) {
                                    i10 = au0Var.indexOfChild(a10);
                                } else {
                                    i10 = -1;
                                }
                                if (i10 >= 0) {
                                    au0Var.addView(this.h, i10, ma.e(-1, -1, 80));
                                } else {
                                    au0Var.addView(this.h, ma.e(-1, -1, 80));
                                    Log.w("VoiceLive", "composer isn't a direct child of the root: overlay on top");
                                }
                            }
                            p pVar = this.h;
                            ChatActivityEnterView chatActivityEnterView = pfVar2.f38384a;
                            int i26 = n6.Pe;
                            int i27 = ChatActivityEnterView.f32538n7;
                            pVar.setAccent(chatActivityEnterView.C0(i26) | (-16777216));
                            p pVar2 = this.h;
                            TextPaint textPaint = pVar2.f17995c;
                            int i28 = n6.f29394d6;
                            i6 i6Var = pVar2.f17992b;
                            if (g0.B(n6.w0(i28, i6Var)) < 0.5f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            pVar2.f18006g0 = z10;
                            int w02 = (-16777216) | n6.w0(n6.G6, i6Var);
                            pVar2.f18008h0 = w02;
                            textPaint.setColor(w02);
                            int i29 = pVar2.f18008h0;
                            p.Y1 = i29;
                            if (pVar2.f18006g0) {
                                f10 = i0.a.f(0.12f, pVar2.f18010i0, -1);
                            } else {
                                f10 = i0.a.f(0.32f, pVar2.f18010i0, i29);
                            }
                            p.X1 = f10;
                            p.Z1 = g0.L(7.0f);
                            TextPaint textPaint2 = pVar2.d;
                            int i30 = pVar2.f18008h0;
                            if (pVar2.f18006g0) {
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
                            pVar2.f18012j0 = z11;
                            pVar2.f18026r = 0;
                            Paint paint = pVar2.f18029s;
                            if (pVar2.f18006g0) {
                                i11 = 0;
                            } else {
                                i11 = 335544320;
                            }
                            paint.setColor(i11);
                            pVar2.f18014k0 = "";
                            pVar2.f18046y1 = -1;
                            pVar2.f18016l0 = null;
                            pVar2.f18020o0.clear();
                            pVar2.U0 = true;
                            pVar2.D0 = 0.0f;
                            pVar2.C0 = 0.0f;
                            pVar2.E0 = 0.0f;
                            pVar2.F0 = 0.0f;
                            pVar2.H0 = -1.0f;
                            pVar2.G0 = -1.0f;
                            pVar2.J0 = -1.0f;
                            pVar2.L0 = false;
                            pVar2.setStyleIcon(null);
                            pVar2.M0 = false;
                            pVar2.P0 = false;
                            pVar2.f18043x1 = null;
                            pVar2.P1 = false;
                            pVar2.f18048z1 = false;
                            pVar2.D1 = null;
                            pVar2.E1.clear();
                            textPaint.setShader(null);
                            pVar2.S0 = 0L;
                            pVar2.T0 = 0.0f;
                            pVar2.A0 = true;
                            pVar2.X0 = 0.0f;
                            pVar2.Y0 = 0.0f;
                            pVar2.Z0 = true;
                            pVar2.f17991a1 = 1.0f;
                            pVar2.f17994b1 = 0.0f;
                            pVar2.l1 = -1;
                            Arrays.fill(pVar2.f18017m1, 0.0f);
                            pVar2.O = null;
                            pVar2.P = 0.0f;
                            pVar2.Q = 0.0f;
                            pVar2.W = false;
                            pVar2.R.setEmpty();
                            pVar2.setPlaceholder(null);
                            pVar2.f18022p0 = true;
                            pVar2.f18027r0 = SystemClock.uptimeMillis();
                            pVar2.f18032t0 = 0L;
                            pVar2.f18004f0 = 0L;
                            pVar2.setVisibility(0);
                            pVar2.invalidate();
                            Log.d("VoiceLive", "overlay shown at index " + au0Var.indexOfChild(this.h) + "/" + au0Var.getChildCount());
                        }
                    }
                    e eVar6 = this.K;
                    if (eVar6 != null && this.J && (str2 = this.f17975l0) != null) {
                        eVar6.setLanguage(str2);
                    }
                    d();
                    DictationAsr.N(this.m0);
                    DictationAsr.f43028g.add(this.m0);
                    u();
                    g0.h3(this.f17973j0, 1500L);
                }
            }
        }
    }

    public final void u() {
        long[] jArr = new long[2];
        String str = null;
        if (DictationAsr.F(jArr)) {
            str = gd.a0(null, null, 2131745067, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        p pVar = this.h;
        if (pVar != null) {
            pVar.setPlaceholder(str);
        }
        e eVar = this.K;
        if (eVar != null && this.J) {
            eVar.setPlaceholder(str);
        }
    }

    public final void v(ai.c2 r25, java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: ji.m.v(ai.c2, java.lang.String):void");
    }

    @Override
    public final void x(String str) {
        String p10;
        if (str == null) {
            p10 = null;
        } else {
            p10 = n0.p(str);
        }
        p pVar = this.h;
        if (pVar != null && this.f17963c == 2) {
            pVar.setLanguage(p10);
        }
        e eVar = this.K;
        if (eVar != null && this.J && this.f17963c == 2) {
            this.f17975l0 = p10;
            eVar.setLanguage(p10);
        }
    }
}
