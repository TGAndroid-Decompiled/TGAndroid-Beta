package ji;

import ai.c2;
import ai.e2;
import ai.p0;
import ai.t;
import ai.w1;
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
import di.p9;
import hi.c8;
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
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Dictation.DictationAsr;
public final class o implements c2 {
    public static boolean f17988n0;
    public static final HashMap f17989o0 = new HashMap();
    public volatile int E;
    public volatile int F;
    public volatile boolean G;
    public String H;
    public boolean J;
    public e K;
    public long N;
    public long O;
    public boolean T;
    public e2 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context f17990a;
    public final rf f17992b;
    public int f17993b0;
    public z d;
    public s f17997e;
    public String f17998e0;
    public e2 f17999f;
    public int f18000f0;
    public String f18001g0;
    public r h;
    public boolean f18002h0;
    public boolean f18003i0;
    public String f18006l0;
    public long f18008r;
    public long f18009s;
    public volatile long f18010w;
    public volatile long f18011x;
    public volatile int f18012y;
    public int f17994c = 0;
    public String f18007n = "";
    public final j I = new j(this, 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final j W = new j(this, 1);
    public String f17991a0 = "";
    public final int[] f17995c0 = new int[2];
    public final int[] f17996d0 = new int[2];
    public final h f18004j0 = new h(this, 0);
    public final j f18005k0 = new j(this, 2);
    public final h m0 = new h(this, 1);

    public o(Context context, rf rfVar) {
        this.f17990a = context;
        this.f17992b = rfVar;
    }

    public static void b(o oVar, e2 e2Var, String str, int i7) {
        if (e2Var == oVar.f17999f || e2Var == oVar.U) {
            if (!oVar.J) {
                oVar.l(i7, str);
                return;
            }
            int i10 = oVar.f17994c;
            if (i10 != 2 && i10 != 4) {
                return;
            }
            oVar.u(e2Var, str);
            oVar.o();
        }
    }

    public static ArrayList v(String[] strArr, boolean z10, x10 x10Var) {
        String[] strArr2;
        x10 x10Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i7 = 0;
        while (i7 < strArr.length) {
            String str = strArr[i7];
            int i10 = i7 + 1;
            t J = DictationAsr.J(str);
            if (J != null) {
                strArr2 = J.d(str);
            } else {
                strArr2 = new String[0];
            }
            String[] strArr3 = strArr2;
            if (strArr3.length < 2) {
                arrayList.add(null);
                x10Var2 = x10Var;
            } else {
                String d02 = DictationAsr.d0(J, str);
                ArrayList arrayList2 = new ArrayList();
                int i11 = -1;
                for (int i12 = 0; i12 < strArr3.length; i12++) {
                    arrayList2.add(p0.N(strArr3[i12]));
                    if (!z10 && DictationAsr.A(str) && strArr3[i12].equals(d02)) {
                        i11 = i12;
                    }
                }
                x10Var2 = x10Var;
                arrayList.add(new k(p0.O(d02), arrayList2, i11, new p9(str, strArr3, x10Var2, i10, 2)));
            }
            x10Var = x10Var2;
            i7 = i10;
        }
        return arrayList;
    }

    @Override
    public final void a(String str, String str2) {
        if (this.f17994c == 2) {
            if (!str.isEmpty()) {
                this.f18007n = str;
            }
            StringBuilder u10 = a8.p0.u("recogniser ended error=", str2, " chars=");
            u10.append(this.f18007n.length());
            u10.append(" (the voice recording goes on)");
            Log.d("VoiceLive", u10.toString());
            this.f17999f = null;
            if (vr.f27619k == this) {
                vr.f27619k = null;
            }
            this.d = null;
            this.f17997e = null;
            if (TextUtils.isEmpty(this.f18007n.trim())) {
                r rVar = this.h;
                if (rVar != null) {
                    rVar.m();
                    return;
                }
                return;
            }
            r rVar2 = this.h;
            if (rVar2 != null) {
                rVar2.setText(this.f18007n);
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
        String a02 = DictationAsr.a0();
        if (a02 != null) {
            String H = p0.H(a02);
            r rVar = this.h;
            if (rVar != null) {
                rVar.setLanguage(H);
            }
            e eVar = this.K;
            if (eVar != null && this.J) {
                this.f18006l0 = H;
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
        if (this.f17994c == 4) {
            long j3 = this.O;
            long j10 = 0;
            if (j3 > 0 && (f10 > 0.001f || f11 < 0.999f)) {
                float f12 = (float) j3;
                long j11 = f10 * f12;
                long j12 = f12 * f11;
                long j13 = 0;
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    long j14 = ((n) arrayList.get(i7)).f17986b;
                    long j15 = j10;
                    if (((n) arrayList.get(i7)).f17987c >= j15) {
                        max = ((n) arrayList.get(i7)).f17987c;
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
        r rVar;
        e eVar;
        String str2;
        String str3;
        int i7 = this.f17994c;
        if (i7 != 0 || this.h != null || this.K != null) {
            if (this.J && i7 == 4 && this.f17992b.c() && ("chat paused".equals(str) || "destroy".equals(str))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.J && this.f17994c != 0 && !z11) {
                f17989o0.remove(q());
            }
            if (this.f17994c != 0) {
                StringBuilder u10 = a8.p0.u("dispose (", str, ") state=");
                int i10 = this.f17994c;
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
                u10.append(this.f18007n.length());
                u10.append(" chunks=");
                u10.append(this.f18012y);
                Log.d("VoiceLive", u10.toString());
            }
            this.f17994c = 0;
            this.H = null;
            g0.r(this.W);
            e2 e2Var = this.U;
            if (e2Var != null) {
                e2Var.c();
                this.U = null;
            }
            j(true);
            if (z11) {
                if (this.U == null) {
                    e();
                }
                m mVar = new m();
                ArrayList arrayList = mVar.f17978a;
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    n nVar = (n) obj;
                    n nVar2 = new n(nVar.f17985a, nVar.f17986b);
                    nVar2.f17987c = nVar.f17987c;
                    arrayList.add(nVar2);
                }
                ArrayList arrayList3 = this.M;
                int size2 = arrayList3.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    n nVar3 = (n) obj2;
                    n nVar4 = new n(nVar3.f17985a, nVar3.f17986b);
                    nVar4.f17987c = nVar3.f17987c;
                    arrayList.add(nVar4);
                }
                mVar.f17979b = this.O;
                mVar.f17980c = this.P;
                mVar.d = this.Q;
                mVar.f17981e = this.f17998e0;
                mVar.f17983g = this.f18000f0;
                mVar.f17982f = this.f18001g0;
                mVar.h = this.f18002h0;
                mVar.f17984i = this.f18006l0;
                f17989o0.put(q(), mVar);
                StringBuilder sb2 = new StringBuilder("field: kept for the chat (");
                sb2.append(arrayList.size());
                sb2.append(" words");
                if (this.f17998e0 != null) {
                    str2 = ", styled / edited";
                } else {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append(")");
                Log.d("VoiceLive", sb2.toString());
            }
            this.f17998e0 = null;
            this.f18001g0 = null;
            this.f18003i0 = false;
            this.f17992b.g(Float.NaN, 0.0f);
            if (z10 && (eVar = this.K) != null && eVar.R) {
                eVar.R = false;
                eVar.f17882f0 = -1;
                eVar.invalidate();
            }
            g0.r(this.I);
            DictationAsr.R(this.m0);
            g0.r(this.f18005k0);
            g0.r(this.f18004j0);
            if (vr.f27619k == this) {
                vr.f27619k = null;
            }
            e2 e2Var2 = this.f17999f;
            if (e2Var2 != null) {
                e2Var2.c();
                this.f17999f = null;
            }
            z zVar = this.d;
            if (zVar != null) {
                zVar.d();
                this.d = null;
            }
            this.f17997e = null;
            if (z10 && (rVar = this.h) != null) {
                rVar.m();
            }
        }
    }

    @Override
    public final void h(float f10) {
        if (this.f17994c == 2) {
            if (this.J) {
                e eVar = this.K;
                if (eVar != null) {
                    eVar.setLevel(f10);
                    return;
                }
                return;
            }
            r rVar = this.h;
            if (rVar != null) {
                rVar.setLevel(f10);
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
            obj = this.f18007n;
        } else {
            obj = editTextBoldCursor.getText().toString();
        }
        this.f18007n = obj;
        this.f17998e0 = obj.trim();
        this.f18000f0 = c().size();
        if (z10 && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f18007n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            g0.v1(editTextBoldCursor);
        }
        g0.E2(editTextBoldCursor);
    }

    public final void k(Object obj) {
        String str;
        if (obj != null && !this.f18003i0 && this.K != null) {
            boolean z10 = false;
            if (this.X != null) {
                j(false);
            }
            if (this.f18001g0 == null) {
                this.f18001g0 = this.f18007n.trim();
                if (this.f17998e0 != null) {
                    z10 = true;
                }
                this.f18002h0 = z10;
            }
            String str2 = this.f18001g0;
            if (!str2.isEmpty()) {
                this.f18003i0 = true;
                this.K.setBusy(true);
                StringBuilder sb2 = new StringBuilder("field: style ");
                rf rfVar = this.f17992b;
                rfVar.getClass();
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
                rfVar.f(obj, str2, new c8(this, SystemClock.uptimeMillis(), 1));
            }
        }
    }

    @Override
    public final void l(int i7, String str) {
        if (this.f17994c == 2) {
            if (str == null) {
                str = "";
            }
            this.f18007n = str;
            r rVar = this.h;
            if (rVar != null) {
                rVar.t(i7, str);
            }
        }
    }

    public final void m(String str) {
        boolean z10;
        long j3;
        if (this.f17994c == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        g(str, false);
        e eVar = this.K;
        if (eVar == null) {
            return;
        }
        hi.c cVar = new hi.c(28, this, eVar);
        if (z10) {
            j3 = 470;
        } else {
            j3 = 60;
        }
        g0.h3(cVar, j3);
    }

    public final void n(ByteBuffer byteBuffer, int i7, int i10, int i11) {
        z zVar = this.d;
        s sVar = this.f17997e;
        if (zVar != null && sVar != null) {
            this.E = i10;
            this.F = i11;
            this.f18012y++;
            this.f18010w += i7;
            int c10 = sVar.c(byteBuffer, i7, i10);
            if (sVar.f18082c <= 0) {
                if (!this.G) {
                    this.G = true;
                    Log.w("VoiceLive", "recorder rate " + i10 + " Hz isn't a multiple of 16 kHz: no transcript");
                }
            } else if (c10 > 0) {
                this.f18011x += c10;
                byte[] bArr = (byte[]) sVar.f18085g;
                if (c10 > 0) {
                    synchronized (zVar.f1635a) {
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
                            int i15 = zVar.f1641i + i12;
                            zVar.f1641i = i15;
                            if (i15 >= 1600) {
                                double sqrt = Math.sqrt(zVar.h / Math.max(1, i15));
                                zVar.h = 0.0d;
                                zVar.f1641i = 0;
                                w1 w1Var = zVar.f1640g;
                                if (w1Var != null) {
                                    w1Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
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
                if (i11 < 0 || this.f17991a0.length() + i11 != text.length() || !text.toString().substring(this.Z).equals(this.f17991a0)) {
                    this.Y = Math.min(this.f17993b0, c10.size());
                    this.Z = text.length();
                    this.f17991a0 = "";
                }
                if (this.Y > c10.size()) {
                    this.Y = c10.size();
                }
                this.f17993b0 = c10.size();
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = this.Y; i12 < c10.size(); i12++) {
                    if (sb2.length() > 0) {
                        sb2.append(' ');
                    }
                    sb2.append(((n) c10.get(i12)).f17985a);
                }
                if (sb2.length() != 0 || !this.f17991a0.isEmpty()) {
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
                    if (!str.equals(this.f17991a0)) {
                        text.replace(this.Z, text.length(), str);
                        this.f17991a0 = str;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean[] zArr = null;
        if (this.f17998e0 != null) {
            if (this.f18000f0 > c10.size()) {
                this.f18000f0 = c10.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f17998e0);
            StringBuilder sb4 = new StringBuilder(this.f17998e0);
            for (int i13 = this.f18000f0; i13 < c10.size(); i13++) {
                arrayList.add(((n) c10.get(i13)).f17985a);
                sb4.append(' ');
                sb4.append(((n) c10.get(i13)).f17985a);
            }
            this.f18007n = sb4.toString();
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
                arrayList2.add(((n) c10.get(i10)).f17985a);
                int i15 = i14 + 1;
                zArr2[i14] = f10[i10];
                if (!f10[i10]) {
                    if (sb5.length() > 0) {
                        sb5.append(' ');
                    }
                    sb5.append(((n) c10.get(i10)).f17985a);
                }
                i14 = i15;
            }
            i10++;
        }
        this.f18007n = sb5.toString();
        e eVar2 = this.K;
        if (eVar2 != null) {
            eVar2.x(arrayList2, Arrays.copyOf(zArr2, i14), this.T);
        }
    }

    public final void p() {
        int i7;
        rf rfVar = this.f17992b;
        du0 du0Var = rfVar.f39168a.f32588c2;
        if (du0Var == null) {
            return;
        }
        if (this.K == null) {
            h6 h6Var = rfVar.f39168a.M4;
            ?? obj = new Object();
            obj.d = this;
            obj.f60664c = du0Var;
            obj.f60662a = new int[2];
            obj.f60663b = new int[2];
            this.K = new e(this.f17990a, h6Var, obj);
        }
        View a10 = rfVar.a();
        if (this.K.getParent() != du0Var) {
            g0.E2(this.K);
            if (a10 != null && a10.getParent() == du0Var) {
                i7 = du0Var.indexOfChild(a10);
            } else {
                i7 = -1;
            }
            if (i7 >= 0) {
                du0Var.addView(this.K, i7, ma.c(-1.0f, -1));
            } else {
                du0Var.addView(this.K, ma.c(-1.0f, -1));
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
        rf rfVar = this.f17992b;
        sb2.append(rfVar.f39168a.R);
        sb2.append(":");
        sb2.append(rfVar.f39168a.G3);
        return sb2.toString();
    }

    public final void r() {
        l lVar = new l(this);
        ChatActivityEnterView chatActivityEnterView = this.f17992b.f39168a;
        e2 e2Var = new e2(this.f17990a, chatActivityEnterView.R, chatActivityEnterView.G3, false, lVar);
        lVar.f17976b = e2Var;
        this.f17999f = e2Var;
        e2Var.J = this.d;
        e2Var.s();
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
        m mVar;
        boolean z12;
        boolean z13;
        boolean z14;
        float f12;
        float f13;
        long j10;
        int i13 = this.f17994c;
        if (i13 != 3) {
            if (i13 == 0 && mp.g1().getBoolean("design_voice_live_field", true) && !this.f17992b.d() && this.f17992b.c() && (mVar = (m) f17989o0.get(q())) != null) {
                j jVar = this.f18005k0;
                j jVar2 = this.W;
                float[] fArr = this.V;
                this.J = true;
                ArrayList arrayList = this.L;
                arrayList.clear();
                ArrayList arrayList2 = mVar.f17978a;
                int size = arrayList2.size();
                for (int i14 = 0; i14 < size; i14++) {
                    n nVar = (n) arrayList2.get(i14);
                    n nVar2 = new n(nVar.f17985a, nVar.f17986b);
                    nVar2.f17987c = nVar.f17987c;
                    arrayList.add(nVar2);
                }
                long j11 = 0;
                this.M.clear();
                this.O = mVar.f17979b;
                this.f17998e0 = mVar.f17981e;
                this.f18000f0 = Math.min(mVar.f17983g, arrayList.size());
                this.f18001g0 = mVar.f17982f;
                this.f18002h0 = mVar.h;
                this.f18006l0 = mVar.f17984i;
                this.f17994c = 4;
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                if (mVar.f17980c <= 0.001f && mVar.d >= 0.999f) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (this.f17992b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 && !z13 && this.O > 0) {
                    float f14 = mVar.f17980c;
                    this.P = f14;
                    float f15 = mVar.d;
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
                            n nVar3 = (n) arrayList.get(i15);
                            j10 = j13;
                            long j14 = j11;
                            nVar3.f17986b = Math.max(j14, nVar3.f17986b - j12);
                            long j15 = nVar3.f17987c;
                            if (j15 >= j14) {
                                nVar3.f17987c = Math.max(j14, j15 - j12);
                            }
                            arrayList3.add(nVar3);
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
                    if (this.f18001g0 != null) {
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
                    eVar3.f17859a0 = f12;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    eVar3.T0 = f13;
                    eVar3.f17864b0 = 0.0f;
                    eVar3.E0 = -1.0f;
                    eVar3.invalidate();
                    this.K.setLanguage(this.f18006l0);
                    d();
                }
                o();
                g0.r(jVar2);
                g0.h3(jVar2, 50L);
                g0.r(jVar);
                g0.h3(jVar, 250L);
            } else if (this.f17994c == 4) {
                if (this.f17992b.d()) {
                    g0.r(this.W);
                    e2 e2Var = this.U;
                    if (e2Var != null) {
                        this.U = null;
                        e2Var.c();
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
                                n nVar4 = (n) this.L.get(i16);
                                i12 = i16;
                                nVar4.f17986b = Math.max(0L, nVar4.f17986b - j17);
                                long j19 = nVar4.f17987c;
                                if (j19 >= 0) {
                                    nVar4.f17987c = Math.max(0L, j19 - j17);
                                }
                                arrayList4.add(nVar4);
                            }
                            i16 = i12 + 1;
                        }
                        this.L.clear();
                        this.L.addAll(arrayList4);
                        this.N = Math.max(0L, j18 - j17);
                        StringBuilder t6 = a8.p0.t(j17, "field: resumed after a trim ", "..");
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
                    if (this.f17998e0 != null) {
                        this.f18000f0 = this.L.size();
                    }
                    if (this.X != null) {
                        int size2 = this.L.size();
                        this.f17993b0 = size2;
                        this.Y = size2;
                        this.Z = this.X.length();
                        this.f17991a0 = "";
                    }
                    this.d = new z();
                    this.f17997e = new s(0);
                    vr.f27619k = this;
                    this.f17994c = 2;
                    r();
                    e eVar4 = this.K;
                    if (eVar4 != null) {
                        eVar4.setPaused(false);
                        this.K.setListening(true);
                    }
                    d();
                    DictationAsr.R(this.m0);
                    DictationAsr.f43069g.add(this.m0);
                    t();
                    o();
                    g0.r(this.f18005k0);
                    g0.h3(this.f18005k0, 250L);
                } else if (!this.f17992b.c()) {
                    g("draft gone", true);
                }
            } else if (!b1.a()) {
                if (this.f17994c != 0) {
                    g("unavailable", true);
                }
            } else if (!this.f17992b.d()) {
                if (this.J && this.f17994c == 2) {
                    rf rfVar = this.f17992b;
                    rfVar.getClass();
                    if ((MediaController.B().K() || rfVar.f39168a.R3 != null) && this.f17992b.c()) {
                        j jVar3 = this.W;
                        this.f17994c = 4;
                        g0.r(this.f18004j0);
                        z zVar = this.d;
                        if (zVar != null) {
                            j3 = zVar.c() / 32;
                        } else {
                            j3 = 0;
                        }
                        this.O = this.N + j3;
                        if (vr.f27619k == this) {
                            vr.f27619k = null;
                        }
                        e2 e2Var2 = this.f17999f;
                        if (e2Var2 != null) {
                            this.U = e2Var2;
                            this.f17999f = null;
                            z zVar2 = this.d;
                            if (zVar2 != null) {
                                zVar2.d();
                            }
                            this.U.u();
                        } else {
                            e();
                        }
                        this.d = null;
                        this.f17997e = null;
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
                        g0.r(jVar3);
                        g0.h3(jVar3, 50L);
                        return;
                    }
                }
                if (this.f17994c != 0) {
                    g("not recording", true);
                }
            } else {
                int i17 = 1;
                if (this.f17994c == 0) {
                    if (!f17988n0) {
                        f17988n0 = true;
                        StringBuilder sb2 = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                        StringBuilder sb3 = new StringBuilder();
                        int[] iArr = {1000, 12000};
                        int i18 = 0;
                        while (i18 < 2) {
                            int i19 = iArr[i18];
                            s sVar = new s(0);
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
                            int c10 = sVar.c(allocate, 19200, 48000);
                            byte[] bArr = (byte[]) sVar.f18085g;
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
                    this.f17997e = new s(0);
                    this.f18011x = 0L;
                    this.f18010w = 0L;
                    this.f18012y = 0;
                    this.E = 0;
                    this.F = 0;
                    this.G = false;
                    this.f18007n = "";
                    this.J = mp.g1().getBoolean("design_voice_live_field", true);
                    this.L.clear();
                    this.M.clear();
                    this.N = 0L;
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    this.f18008r = SystemClock.elapsedRealtime();
                    i17 = 1;
                    this.f17994c = 1;
                    vr.f27619k = this;
                    g0.r(this.f18005k0);
                    g0.h3(this.f18005k0, 250L);
                    Log.d("VoiceLive", "buffering: recorder tap on");
                }
                if (this.f17994c == i17 && this.f17992b.f39168a.U0()) {
                    this.f17994c = 2;
                    this.f18006l0 = null;
                    this.f18009s = SystemClock.elapsedRealtime();
                    StringBuilder sb4 = new StringBuilder("locked → live: buffered ");
                    sb4.append((this.d.c() * 1000) / 32000);
                    sb4.append(" ms, chunks=");
                    sb4.append(this.f18012y);
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
                    sb4.append(this.f18009s - this.f18008r);
                    sb4.append(" ms since start)");
                    Log.d("VoiceLive", sb4.toString());
                    r();
                    if (this.J) {
                        p();
                    } else {
                        rf rfVar2 = this.f17992b;
                        du0 du0Var = rfVar2.f39168a.f32588c2;
                        if (du0Var != null) {
                            if (this.h == null) {
                                this.h = new r(this.f17990a, rfVar2.f39168a.M4, this);
                            }
                            View a10 = rfVar2.a();
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
                                    du0Var.addView(this.h, i10, ma.e(-1, -1, 80));
                                } else {
                                    du0Var.addView(this.h, ma.e(-1, -1, 80));
                                    Log.w("VoiceLive", "composer isn't a direct child of the root: overlay on top");
                                }
                            }
                            r rVar = this.h;
                            ChatActivityEnterView chatActivityEnterView = rfVar2.f39168a;
                            int i26 = m6.Pe;
                            int i27 = ChatActivityEnterView.f32566s7;
                            rVar.setAccent(chatActivityEnterView.G0(i26) | (-16777216));
                            r rVar2 = this.h;
                            TextPaint textPaint = rVar2.f18026c;
                            int i28 = m6.f29378d6;
                            h6 h6Var = rVar2.f18023b;
                            if (g0.B(m6.w0(i28, h6Var)) < 0.5f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            rVar2.f18037g0 = z10;
                            int w02 = (-16777216) | m6.w0(m6.G6, h6Var);
                            rVar2.f18039h0 = w02;
                            textPaint.setColor(w02);
                            int i29 = rVar2.f18039h0;
                            r.Y1 = i29;
                            if (rVar2.f18037g0) {
                                f10 = i0.a.f(0.12f, rVar2.f18041i0, -1);
                            } else {
                                f10 = i0.a.f(0.32f, rVar2.f18041i0, i29);
                            }
                            r.X1 = f10;
                            r.Z1 = g0.L(7.0f);
                            TextPaint textPaint2 = rVar2.d;
                            int i30 = rVar2.f18039h0;
                            if (rVar2.f18037g0) {
                                f11 = 0.42f;
                            } else {
                                f11 = 0.36f;
                            }
                            textPaint2.setColor(m6.r1(f11, i30));
                            if (Build.VERSION.SDK_INT >= 31 && bz.o() != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            rVar2.f18043j0 = z11;
                            rVar2.f18057r = 0;
                            Paint paint = rVar2.f18060s;
                            if (rVar2.f18037g0) {
                                i11 = 0;
                            } else {
                                i11 = 335544320;
                            }
                            paint.setColor(i11);
                            rVar2.f18045k0 = "";
                            rVar2.f18077y1 = -1;
                            rVar2.f18047l0 = null;
                            rVar2.f18051o0.clear();
                            rVar2.U0 = true;
                            rVar2.D0 = 0.0f;
                            rVar2.C0 = 0.0f;
                            rVar2.E0 = 0.0f;
                            rVar2.F0 = 0.0f;
                            rVar2.H0 = -1.0f;
                            rVar2.G0 = -1.0f;
                            rVar2.J0 = -1.0f;
                            rVar2.L0 = false;
                            rVar2.setStyleIcon(null);
                            rVar2.M0 = false;
                            rVar2.P0 = false;
                            rVar2.f18074x1 = null;
                            rVar2.P1 = false;
                            rVar2.f18079z1 = false;
                            rVar2.D1 = null;
                            rVar2.E1.clear();
                            textPaint.setShader(null);
                            rVar2.S0 = 0L;
                            rVar2.T0 = 0.0f;
                            rVar2.A0 = true;
                            rVar2.X0 = 0.0f;
                            rVar2.Y0 = 0.0f;
                            rVar2.Z0 = true;
                            rVar2.f18022a1 = 1.0f;
                            rVar2.f18025b1 = 0.0f;
                            rVar2.l1 = -1;
                            Arrays.fill(rVar2.f18048m1, 0.0f);
                            rVar2.O = null;
                            rVar2.P = 0.0f;
                            rVar2.Q = 0.0f;
                            rVar2.W = false;
                            rVar2.R.setEmpty();
                            rVar2.setPlaceholder(null);
                            rVar2.f18053p0 = true;
                            rVar2.f18058r0 = SystemClock.uptimeMillis();
                            rVar2.f18063t0 = 0L;
                            rVar2.f18035f0 = 0L;
                            rVar2.setVisibility(0);
                            rVar2.invalidate();
                            Log.d("VoiceLive", "overlay shown at index " + du0Var.indexOfChild(this.h) + "/" + du0Var.getChildCount());
                        }
                    }
                    e eVar6 = this.K;
                    if (eVar6 != null && this.J && (str2 = this.f18006l0) != null) {
                        eVar6.setLanguage(str2);
                    }
                    d();
                    DictationAsr.R(this.m0);
                    DictationAsr.f43069g.add(this.m0);
                    t();
                    g0.h3(this.f18004j0, 1500L);
                }
            }
        }
    }

    public final void t() {
        long[] jArr = new long[2];
        String str = null;
        if (DictationAsr.H(jArr)) {
            str = gd.a0(null, null, 2131745061, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        r rVar = this.h;
        if (rVar != null) {
            rVar.setPlaceholder(str);
        }
        e eVar = this.K;
        if (eVar != null && this.J) {
            eVar.setPlaceholder(str);
        }
    }

    public final void u(ai.e2 r25, java.lang.String r26) {
        throw new UnsupportedOperationException("Method not decompiled: ji.o.u(ai.e2, java.lang.String):void");
    }

    @Override
    public final void x(String str) {
        String H;
        if (str == null) {
            H = null;
        } else {
            H = p0.H(str);
        }
        r rVar = this.h;
        if (rVar != null && this.f17994c == 2) {
            rVar.setLanguage(H);
        }
        e eVar = this.K;
        if (eVar != null && this.J && this.f17994c == 2) {
            this.f18006l0 = H;
            eVar.setLanguage(H);
        }
    }
}
