package ji;

import a8.p0;
import ai.k0;
import ai.p1;
import ai.u;
import ai.u1;
import ai.v1;
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
import hi.d8;
import hi.q1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.cz;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.wr;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Dictation.DictationAsr;
public final class n implements u1 {
    public static boolean f17954n0;
    public static final HashMap f17955o0 = new HashMap();
    public volatile int E;
    public volatile int F;
    public volatile boolean G;
    public String H;
    public boolean J;
    public e K;
    public long N;
    public long O;
    public boolean T;
    public v1 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context f17956a;
    public final qf f17958b;
    public int f17959b0;
    public u d;
    public r f17963e;
    public String f17964e0;
    public v1 f17965f;
    public int f17966f0;
    public String f17967g0;
    public q h;
    public boolean f17968h0;
    public boolean f17969i0;
    public String f17972l0;
    public long f17974r;
    public long f17975s;
    public volatile long f17976w;
    public volatile long f17977x;
    public volatile int f17978y;
    public int f17960c = 0;
    public String f17973n = "";
    public final i I = new i(this, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final i W = new i(this, 1);
    public String f17957a0 = "";
    public final int[] f17961c0 = new int[2];
    public final int[] f17962d0 = new int[2];
    public final h f17970j0 = new h(this, 0);
    public final i f17971k0 = new i(this, 2);
    public final h m0 = new h(this, 1);

    public n(Context context, qf qfVar) {
        this.f17956a = context;
        this.f17958b = qfVar;
    }

    public static void b(n nVar, v1 v1Var, String str, int i7) {
        if (v1Var == nVar.f17965f || v1Var == nVar.U) {
            if (!nVar.J) {
                nVar.l(i7, str);
                return;
            }
            int i10 = nVar.f17960c;
            if (i10 != 2 && i10 != 4) {
                return;
            }
            nVar.u(v1Var, str);
            nVar.o();
        }
    }

    public static ArrayList v(String[] strArr, boolean z10, y10 y10Var) {
        String[] strArr2;
        y10 y10Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            int i10 = i7 + 1;
            ai.p I = DictationAsr.I(str);
            if (I != null) {
                strArr2 = I.d(str);
            } else {
                strArr2 = new String[0];
            }
            String[] strArr3 = strArr2;
            if (strArr3.length < 2) {
                arrayList.add(null);
                y10Var2 = y10Var;
            } else {
                String c02 = DictationAsr.c0(I, str);
                ArrayList arrayList2 = new ArrayList();
                int i11 = -1;
                for (int i12 = 0; i12 < strArr3.length; i12++) {
                    arrayList2.add(k0.N(strArr3[i12]));
                    if (!z10 && DictationAsr.z(str) && strArr3[i12].equals(c02)) {
                        i11 = i12;
                    }
                }
                y10Var2 = y10Var;
                arrayList.add(new j(k0.O(c02), arrayList2, i11, new p9(str, strArr3, y10Var2, i10, 2)));
            }
            y10Var = y10Var2;
            i7 = i10;
        }
        return arrayList;
    }

    @Override
    public final void a(String str, String str2) {
        if (this.f17960c == 2) {
            if (!str.isEmpty()) {
                this.f17973n = str;
            }
            StringBuilder u10 = p0.u("recogniser ended error=", str2, " chars=");
            u10.append(this.f17973n.length());
            u10.append(" (the voice recording goes on)");
            Log.d("VoiceLive", u10.toString());
            this.f17965f = null;
            if (wr.f27759k == this) {
                wr.f27759k = null;
            }
            this.d = null;
            this.f17963e = null;
            if (TextUtils.isEmpty(this.f17973n.trim())) {
                q qVar = this.h;
                if (qVar != null) {
                    qVar.m();
                    return;
                }
                return;
            }
            q qVar2 = this.h;
            if (qVar2 != null) {
                qVar2.setText(this.f17973n);
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
        String Z = DictationAsr.Z();
        if (Z != null) {
            String H = k0.H(Z);
            q qVar = this.h;
            if (qVar != null) {
                qVar.setLanguage(H);
            }
            e eVar = this.K;
            if (eVar != null && this.J) {
                this.f17972l0 = H;
                eVar.setLanguage(H);
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
        if (this.f17960c == 4) {
            long j3 = this.O;
            long j10 = 0;
            if (j3 > 0 && (f10 > 0.001f || f11 < 0.999f)) {
                float f12 = (float) j3;
                long j11 = f10 * f12;
                long j12 = f12 * f11;
                long j13 = 0;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    long j14 = ((m) arrayList.get(i7)).f17952b;
                    long j15 = j10;
                    if (((m) arrayList.get(i7)).f17953c >= j15) {
                        max = ((m) arrayList.get(i7)).f17953c;
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
        q qVar;
        e eVar;
        String str2;
        String str3;
        int i7 = this.f17960c;
        if (i7 != 0 || this.h != null || this.K != null) {
            if (this.J && i7 == 4 && this.f17958b.c() && ("chat paused".equals(str) || "destroy".equals(str))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.J && this.f17960c != 0 && !z11) {
                f17955o0.remove(q());
            }
            if (this.f17960c != 0) {
                StringBuilder u10 = p0.u("dispose (", str, ") state=");
                int i10 = this.f17960c;
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
                u10.append(this.f17973n.length());
                u10.append(" chunks=");
                u10.append(this.f17978y);
                Log.d("VoiceLive", u10.toString());
            }
            this.f17960c = 0;
            this.H = null;
            g0.r(this.W);
            v1 v1Var = this.U;
            if (v1Var != null) {
                v1Var.c();
                this.U = null;
            }
            j(true);
            if (z11) {
                if (this.U == null) {
                    e();
                }
                l lVar = new l();
                ArrayList arrayList = lVar.f17944a;
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    m mVar = (m) obj;
                    m mVar2 = new m(mVar.f17951a, mVar.f17952b);
                    mVar2.f17953c = mVar.f17953c;
                    arrayList.add(mVar2);
                }
                ArrayList arrayList3 = this.M;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    m mVar3 = (m) obj2;
                    m mVar4 = new m(mVar3.f17951a, mVar3.f17952b);
                    mVar4.f17953c = mVar3.f17953c;
                    arrayList.add(mVar4);
                }
                lVar.f17945b = this.O;
                lVar.f17946c = this.P;
                lVar.d = this.Q;
                lVar.f17947e = this.f17964e0;
                lVar.f17949g = this.f17966f0;
                lVar.f17948f = this.f17967g0;
                lVar.h = this.f17968h0;
                lVar.f17950i = this.f17972l0;
                f17955o0.put(q(), lVar);
                StringBuilder sb2 = new StringBuilder("field: kept for the chat (");
                sb2.append(arrayList.size());
                sb2.append(" words");
                if (this.f17964e0 != null) {
                    str2 = ", styled / edited";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(")");
                Log.d("VoiceLive", sb2.toString());
            }
            this.f17964e0 = null;
            this.f17967g0 = null;
            this.f17969i0 = false;
            this.f17958b.g(Float.NaN, 0.0f);
            if (z10 && (eVar = this.K) != null && eVar.R) {
                eVar.R = false;
                eVar.f17851f0 = -1;
                eVar.invalidate();
            }
            g0.r(this.I);
            DictationAsr.Q(this.m0);
            g0.r(this.f17971k0);
            g0.r(this.f17970j0);
            if (wr.f27759k == this) {
                wr.f27759k = null;
            }
            v1 v1Var2 = this.f17965f;
            if (v1Var2 != null) {
                v1Var2.c();
                this.f17965f = null;
            }
            u uVar = this.d;
            if (uVar != null) {
                uVar.d();
                this.d = null;
            }
            this.f17963e = null;
            if (z10 && (qVar = this.h) != null) {
                qVar.m();
            }
        }
    }

    @Override
    public final void h(float f10) {
        if (this.f17960c == 2) {
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
            obj = this.f17973n;
        } else {
            obj = editTextBoldCursor.getText().toString();
        }
        this.f17973n = obj;
        this.f17964e0 = obj.trim();
        this.f17966f0 = c().size();
        if (z10 && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f17973n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            g0.v1(editTextBoldCursor);
        }
        g0.E2(editTextBoldCursor);
    }

    public final void k(Object obj) {
        String str;
        if (obj != null && !this.f17969i0 && this.K != null) {
            boolean z10 = false;
            if (this.X != null) {
                j(false);
            }
            if (this.f17967g0 == null) {
                this.f17967g0 = this.f17973n.trim();
                if (this.f17964e0 != null) {
                    z10 = true;
                }
                this.f17968h0 = z10;
            }
            String str2 = this.f17967g0;
            if (!str2.isEmpty()) {
                this.f17969i0 = true;
                this.K.setBusy(true);
                StringBuilder sb2 = new StringBuilder("field: style ");
                qf qfVar = this.f17958b;
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
                qfVar.f(obj, str2, new d8(this, SystemClock.uptimeMillis(), 1));
            }
        }
    }

    @Override
    public final void l(int i7, String str) {
        if (this.f17960c == 2) {
            if (str == null) {
                str = "";
            }
            this.f17973n = str;
            q qVar = this.h;
            if (qVar != null) {
                qVar.t(i7, str);
            }
        }
    }

    public final void m(String str) {
        boolean z10;
        long j3;
        if (this.f17960c == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(str, false);
        e eVar = this.K;
        if (eVar == null) {
            return;
        }
        q1 q1Var = new q1(26, this, eVar);
        if (z10) {
            j3 = 470;
        } else {
            j3 = 60;
        }
        g0.h3(q1Var, j3);
    }

    public final void n(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        u uVar = this.d;
        r rVar = this.f17963e;
        if (uVar != null && rVar != null) {
            this.E = i10;
            this.F = i11;
            this.f17978y++;
            this.f17976w += i7;
            int c10 = rVar.c(byteBuffer, i7, i10);
            if (rVar.f18048c <= 0) {
                if (!this.G) {
                    this.G = true;
                    Log.w("VoiceLive", "recorder rate " + i10 + " Hz isn't a multiple of 16 kHz: no transcript");
                }
            } else if (c10 > 0) {
                this.f17977x += c10;
                byte[] bArr = (byte[]) rVar.f18051g;
                if (c10 > 0) {
                    synchronized (uVar.f1540a) {
                        try {
                            if (uVar.d) {
                                return;
                            }
                            uVar.a(c10, bArr);
                            int i12 = c10 / 2;
                            for (int i13 = 0; i13 < i12; i13++) {
                                int i14 = i13 * 2;
                                double d = (short) ((bArr[i14 + 1] << 8) | (bArr[i14] & 255));
                                uVar.h = (d * d) + uVar.h;
                            }
                            int i15 = uVar.f1546i + i12;
                            uVar.f1546i = i15;
                            if (i15 >= 1600) {
                                double sqrt = Math.sqrt(uVar.h / Math.max(1, i15));
                                uVar.h = 0.0d;
                                uVar.f1546i = 0;
                                p1 p1Var = uVar.f1545g;
                                if (p1Var != null) {
                                    p1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
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

    public final void o() {
        int i7;
        ArrayList c10 = c();
        EditTextBoldCursor editTextBoldCursor = this.X;
        int i10 = 0;
        if (editTextBoldCursor != null) {
            Editable text = editTextBoldCursor.getText();
            if (text != null) {
                int i11 = this.Z;
                String str = "";
                if (i11 < 0 || this.f17957a0.length() + i11 != text.length() || !text.toString().substring(this.Z).equals(this.f17957a0)) {
                    this.Y = Math.min(this.f17959b0, c10.size());
                    this.Z = text.length();
                    this.f17957a0 = "";
                }
                if (this.Y > c10.size()) {
                    this.Y = c10.size();
                }
                this.f17959b0 = c10.size();
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = this.Y; i12 < c10.size(); i12++) {
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append(((m) c10.get(i12)).f17951a);
                }
                if (sb2.length() != 0 || !this.f17957a0.isEmpty()) {
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
                    if (!str.equals(this.f17957a0)) {
                        text.replace(this.Z, text.length(), str);
                        this.f17957a0 = str;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean[] zArr = null;
        if (this.f17964e0 != null) {
            if (this.f17966f0 > c10.size()) {
                this.f17966f0 = c10.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f17964e0);
            StringBuilder sb4 = new StringBuilder(this.f17964e0);
            for (int i13 = this.f17966f0; i13 < c10.size(); i13++) {
                arrayList.add(((m) c10.get(i13)).f17951a);
                sb4.append(' ');
                sb4.append(((m) c10.get(i13)).f17951a);
            }
            this.f17973n = sb4.toString();
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
                arrayList2.add(((m) c10.get(i10)).f17951a);
                int i15 = i14 + 1;
                zArr2[i14] = f10[i10];
                if (!f10[i10]) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    sb5.append(((m) c10.get(i10)).f17951a);
                }
                i14 = i15;
            }
            i10++;
        }
        this.f17973n = sb5.toString();
        e eVar2 = this.K;
        if (eVar2 != null) {
            eVar2.x(arrayList2, Arrays.copyOf(zArr2, i14), this.T);
        }
    }

    public final void p() {
        int i7;
        qf qfVar = this.f17958b;
        du0 du0Var = qfVar.f38848a.f32557c2;
        if (du0Var == null) {
            return;
        }
        if (this.K == null) {
            h6 h6Var = qfVar.f38848a.M4;
            ?? obj = new Object();
            obj.d = this;
            obj.f60633c = du0Var;
            obj.f60631a = new int[2];
            obj.f60632b = new int[2];
            this.K = new e(this.f17956a, h6Var, obj);
        }
        View a10 = qfVar.a();
        if (this.K.getParent() != du0Var) {
            g0.E2(this.K);
            if (a10 != null && a10.getParent() == du0Var) {
                i7 = du0Var.indexOfChild(a10);
            } else {
                i7 = -1;
            }
            if (i7 >= 0) {
                du0Var.addView(this.K, i7, na.c(-1.0f, -1));
            } else {
                du0Var.addView(this.K, na.c(-1.0f, -1));
            }
        }
        this.K.E();
        this.K.setPaused(false);
        this.K.setListening(true);
        o();
        this.K.z();
        Log.d("VoiceLive", "field shown");
    }

    public final String q() {
        StringBuilder sb2 = new StringBuilder();
        qf qfVar = this.f17958b;
        sb2.append(qfVar.f38848a.R);
        sb2.append(":");
        sb2.append(qfVar.f38848a.G3);
        return sb2.toString();
    }

    public final void r() {
        k kVar = new k(this);
        ChatActivityEnterView chatActivityEnterView = this.f17958b.f38848a;
        v1 v1Var = new v1(this.f17956a, chatActivityEnterView.R, chatActivityEnterView.G3, false, kVar);
        kVar.f17942b = v1Var;
        this.f17965f = v1Var;
        v1Var.f1571w = this.d;
        v1Var.l();
    }

    public final void s() {
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
        int i13 = this.f17960c;
        if (i13 != 3) {
            if (i13 == 0 && np.g1().getBoolean("design_voice_live_field", true) && !this.f17958b.d() && this.f17958b.c() && (lVar = (l) f17955o0.get(q())) != null) {
                i iVar = this.f17971k0;
                i iVar2 = this.W;
                float[] fArr = this.V;
                this.J = true;
                ArrayList arrayList = this.L;
                arrayList.clear();
                ArrayList arrayList2 = lVar.f17944a;
                int size = arrayList2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    m mVar = (m) arrayList2.get(i14);
                    m mVar2 = new m(mVar.f17951a, mVar.f17952b);
                    mVar2.f17953c = mVar.f17953c;
                    arrayList.add(mVar2);
                }
                long j11 = 0;
                this.M.clear();
                this.O = lVar.f17945b;
                this.f17964e0 = lVar.f17947e;
                this.f17966f0 = Math.min(lVar.f17949g, arrayList.size());
                this.f17967g0 = lVar.f17948f;
                this.f17968h0 = lVar.h;
                this.f17972l0 = lVar.f17950i;
                this.f17960c = 4;
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                if (lVar.f17946c <= 0.001f && lVar.d >= 0.999f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (this.f17958b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 && !z13 && this.O > 0) {
                    float f14 = lVar.f17946c;
                    this.P = f14;
                    float f15 = lVar.d;
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
                            m mVar3 = (m) arrayList.get(i15);
                            j10 = j13;
                            long j14 = j11;
                            mVar3.f17952b = Math.max(j14, mVar3.f17952b - j12);
                            long j15 = mVar3.f17953c;
                            if (j15 >= j14) {
                                mVar3.f17953c = Math.max(j14, j15 - j12);
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
                p();
                e eVar = this.K;
                if (eVar != null) {
                    eVar.setListening(false);
                    this.K.setPaused(true);
                    e eVar2 = this.K;
                    if (this.f17967g0 != null) {
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
                    eVar3.f17828a0 = f12;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    eVar3.T0 = f13;
                    eVar3.f17833b0 = 0.0f;
                    eVar3.E0 = -1.0f;
                    eVar3.invalidate();
                    this.K.setLanguage(this.f17972l0);
                    d();
                }
                o();
                g0.r(iVar2);
                g0.h3(iVar2, 50L);
                g0.r(iVar);
                g0.h3(iVar, 250L);
            } else if (this.f17960c == 4) {
                if (this.f17958b.d()) {
                    g0.r(this.W);
                    v1 v1Var = this.U;
                    if (v1Var != null) {
                        this.U = null;
                        v1Var.c();
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
                                m mVar4 = (m) this.L.get(i16);
                                i12 = i16;
                                mVar4.f17952b = Math.max(0L, mVar4.f17952b - j17);
                                long j19 = mVar4.f17953c;
                                if (j19 >= 0) {
                                    mVar4.f17953c = Math.max(0L, j19 - j17);
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
                    if (this.f17964e0 != null) {
                        this.f17966f0 = this.L.size();
                    }
                    if (this.X != null) {
                        int size2 = this.L.size();
                        this.f17959b0 = size2;
                        this.Y = size2;
                        this.Z = this.X.length();
                        this.f17957a0 = "";
                    }
                    this.d = new u();
                    this.f17963e = new r(0);
                    wr.f27759k = this;
                    this.f17960c = 2;
                    r();
                    e eVar4 = this.K;
                    if (eVar4 != null) {
                        eVar4.setPaused(false);
                        this.K.setListening(true);
                    }
                    d();
                    DictationAsr.Q(this.m0);
                    DictationAsr.f43038g.add(this.m0);
                    t();
                    o();
                    g0.r(this.f17971k0);
                    g0.h3(this.f17971k0, 250L);
                } else if (!this.f17958b.c()) {
                    g("draft gone", true);
                }
            } else {
                ChatActivityEnterView chatActivityEnterView = this.f17958b.f38848a;
                if (!c1.a()) {
                    if (this.f17960c != 0) {
                        g("unavailable", true);
                    }
                } else if (!this.f17958b.d()) {
                    if (this.J && this.f17960c == 2) {
                        qf qfVar = this.f17958b;
                        qfVar.getClass();
                        if ((MediaController.B().K() || qfVar.f38848a.R3 != null) && this.f17958b.c()) {
                            i iVar3 = this.W;
                            this.f17960c = 4;
                            g0.r(this.f17970j0);
                            u uVar = this.d;
                            if (uVar != null) {
                                j3 = uVar.c() / 32;
                            } else {
                                j3 = 0;
                            }
                            this.O = this.N + j3;
                            if (wr.f27759k == this) {
                                wr.f27759k = null;
                            }
                            v1 v1Var2 = this.f17965f;
                            if (v1Var2 != null) {
                                this.U = v1Var2;
                                this.f17965f = null;
                                u uVar2 = this.d;
                                if (uVar2 != null) {
                                    uVar2.d();
                                }
                                this.U.m();
                            } else {
                                e();
                            }
                            this.d = null;
                            this.f17963e = null;
                            this.P = 0.0f;
                            this.Q = 1.0f;
                            this.T = false;
                            Log.d("VoiceLive", "field: paused at " + this.O + " ms, " + (this.M.size() + this.L.size()) + " words");
                            e eVar5 = this.K;
                            if (eVar5 != null) {
                                eVar5.setListening(false);
                                this.K.setPaused(true);
                            }
                            o();
                            g0.r(iVar3);
                            g0.h3(iVar3, 50L);
                            return;
                        }
                    }
                    if (this.f17960c != 0) {
                        g("not recording", true);
                    }
                } else {
                    int i17 = 1;
                    if (this.f17960c == 0) {
                        if (!f17954n0) {
                            f17954n0 = true;
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
                                byte[] bArr = (byte[]) rVar.f18051g;
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
                        this.d = new u();
                        this.f17963e = new r(0);
                        this.f17977x = 0L;
                        this.f17976w = 0L;
                        this.f17978y = 0;
                        this.E = 0;
                        this.F = 0;
                        this.G = false;
                        this.f17973n = "";
                        this.J = np.g1().getBoolean("design_voice_live_field", true);
                        this.L.clear();
                        this.M.clear();
                        this.N = 0L;
                        this.P = 0.0f;
                        this.Q = 1.0f;
                        this.T = false;
                        this.f17974r = SystemClock.elapsedRealtime();
                        i17 = 1;
                        this.f17960c = 1;
                        wr.f27759k = this;
                        g0.r(this.f17971k0);
                        g0.h3(this.f17971k0, 250L);
                        Log.d("VoiceLive", "buffering: recorder tap on");
                    }
                    if (this.f17960c == i17 && this.f17958b.f38848a.U0()) {
                        this.f17960c = 2;
                        this.f17972l0 = null;
                        this.f17975s = SystemClock.elapsedRealtime();
                        StringBuilder sb4 = new StringBuilder("locked → live: buffered ");
                        sb4.append((this.d.c() * 1000) / 32000);
                        sb4.append(" ms, chunks=");
                        sb4.append(this.f17978y);
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
                        sb4.append(this.f17975s - this.f17974r);
                        sb4.append(" ms since start)");
                        Log.d("VoiceLive", sb4.toString());
                        r();
                        if (this.J) {
                            p();
                        } else {
                            qf qfVar2 = this.f17958b;
                            du0 du0Var = qfVar2.f38848a.f32557c2;
                            if (du0Var != null) {
                                if (this.h == null) {
                                    this.h = new q(this.f17956a, qfVar2.f38848a.M4, this);
                                }
                                View a10 = qfVar2.a();
                                if (a10 != null && a10.getParent() == du0Var) {
                                    i7 = du0Var.indexOfChild(a10);
                                } else {
                                    i7 = -1;
                                }
                                if (this.h.getParent() != du0Var || (i7 >= 0 && du0Var.indexOfChild(this.h) != i7 - 1)) {
                                    g0.E2(this.h);
                                    if (a10 != null && a10.getParent() == du0Var) {
                                        i10 = du0Var.indexOfChild(a10);
                                    } else {
                                        i10 = -1;
                                    }
                                    if (i10 >= 0) {
                                        du0Var.addView(this.h, i10, na.e(-1, -1, 80));
                                    } else {
                                        du0Var.addView(this.h, na.e(-1, -1, 80));
                                        Log.w("VoiceLive", "composer isn't a direct child of the root: overlay on top");
                                    }
                                }
                                q qVar = this.h;
                                ChatActivityEnterView chatActivityEnterView2 = qfVar2.f38848a;
                                int i26 = m6.Pe;
                                int i27 = ChatActivityEnterView.f32535s7;
                                qVar.setAccent(chatActivityEnterView2.G0(i26) | (-16777216));
                                q qVar2 = this.h;
                                TextPaint textPaint = qVar2.f17992c;
                                int i28 = m6.f29347d6;
                                h6 h6Var = qVar2.f17989b;
                                if (g0.B(m6.w0(i28, h6Var)) < 0.5f) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                qVar2.f18003g0 = z10;
                                int w02 = (-16777216) | m6.w0(m6.G6, h6Var);
                                qVar2.f18005h0 = w02;
                                textPaint.setColor(w02);
                                int i29 = qVar2.f18005h0;
                                q.Y1 = i29;
                                if (qVar2.f18003g0) {
                                    f10 = i0.a.f(0.12f, qVar2.f18007i0, -1);
                                } else {
                                    f10 = i0.a.f(0.32f, qVar2.f18007i0, i29);
                                }
                                q.X1 = f10;
                                q.Z1 = g0.L(7.0f);
                                TextPaint textPaint2 = qVar2.d;
                                int i30 = qVar2.f18005h0;
                                if (qVar2.f18003g0) {
                                    f11 = 0.42f;
                                } else {
                                    f11 = 0.36f;
                                }
                                textPaint2.setColor(m6.r1(f11, i30));
                                if (Build.VERSION.SDK_INT >= 31 && cz.o() != 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                qVar2.f18009j0 = z11;
                                qVar2.f18023r = 0;
                                Paint paint = qVar2.f18026s;
                                if (qVar2.f18003g0) {
                                    i11 = 0;
                                } else {
                                    i11 = 335544320;
                                }
                                paint.setColor(i11);
                                qVar2.f18011k0 = "";
                                qVar2.f18043y1 = -1;
                                qVar2.f18013l0 = null;
                                qVar2.f18017o0.clear();
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
                                qVar2.f18040x1 = null;
                                qVar2.P1 = false;
                                qVar2.f18045z1 = false;
                                qVar2.D1 = null;
                                qVar2.E1.clear();
                                textPaint.setShader(null);
                                qVar2.S0 = 0L;
                                qVar2.T0 = 0.0f;
                                qVar2.A0 = true;
                                qVar2.X0 = 0.0f;
                                qVar2.Y0 = 0.0f;
                                qVar2.Z0 = true;
                                qVar2.f17988a1 = 1.0f;
                                qVar2.f17991b1 = 0.0f;
                                qVar2.l1 = -1;
                                Arrays.fill(qVar2.f18014m1, 0.0f);
                                qVar2.O = null;
                                qVar2.P = 0.0f;
                                qVar2.Q = 0.0f;
                                qVar2.W = false;
                                qVar2.R.setEmpty();
                                qVar2.setPlaceholder(null);
                                qVar2.f18019p0 = true;
                                qVar2.f18024r0 = SystemClock.uptimeMillis();
                                qVar2.f18029t0 = 0L;
                                qVar2.f18001f0 = 0L;
                                qVar2.setVisibility(0);
                                qVar2.invalidate();
                                Log.d("VoiceLive", "overlay shown at index " + du0Var.indexOfChild(this.h) + "/" + du0Var.getChildCount());
                            }
                        }
                        e eVar6 = this.K;
                        if (eVar6 != null && this.J && (str2 = this.f17972l0) != null) {
                            eVar6.setLanguage(str2);
                        }
                        d();
                        DictationAsr.Q(this.m0);
                        DictationAsr.f43038g.add(this.m0);
                        t();
                        g0.h3(this.f17970j0, 1500L);
                    }
                }
            }
        }
    }

    public final void t() {
        long[] jArr = new long[2];
        String str = null;
        if (DictationAsr.G(jArr)) {
            str = hd.a0(null, null, 2131745061, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
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

    public final void u(ai.v1 r25, java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: ji.n.u(ai.v1, java.lang.String):void");
    }

    @Override
    public final void x(String str) {
        String H;
        if (str == null) {
            H = null;
        } else {
            H = k0.H(str);
        }
        q qVar = this.h;
        if (qVar != null && this.f17960c == 2) {
            qVar.setLanguage(H);
        }
        e eVar = this.K;
        if (eVar != null && this.J && this.f17960c == 2) {
            this.f17972l0 = H;
            eVar.setLanguage(H);
        }
    }
}
