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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
public final class gjc implements kn3 {
    public static boolean n0;
    public static final HashMap o0 = new HashMap();
    public volatile char E;
    public volatile byte F;
    public volatile boolean G;
    public String H;
    public boolean J;
    public yic K;
    public long N;
    public long O;
    public boolean T;
    public ln3 U;
    public EditTextBoldCursor X;
    public int Y;
    public int Z;
    public final Context a;
    public final c b;
    public int b0;
    public am3 d;
    public igb e;
    public String e0;
    public ln3 f;
    public int f0;
    public String g0;
    public jjc h;
    public boolean h0;
    public boolean i0;
    public String l0;
    public long r;
    public long s;
    public volatile long w;
    public volatile long x;
    public volatile int y;
    public byte c = 0;
    public String n = "";
    public final cjc I = new cjc(this, (byte) 0);
    public final ArrayList L = new ArrayList();
    public final ArrayList M = new ArrayList();
    public float P = 0.0f;
    public float Q = 1.0f;
    public float R = 0.0f;
    public float S = 1.0f;
    public final float[] V = new float[3];
    public final cjc W = new cjc(this, (byte) 1);
    public String a0 = "";
    public final int[] c0 = new int[2];
    public final int[] d0 = new int[2];
    public final bjc j0 = new bjc(this, (byte) 0);
    public final cjc k0 = new cjc(this, (byte) 2);
    public final bjc m0 = new bjc(this, (byte) 1);

    public gjc(Context context, c cVar) {
        this.a = context;
        this.b = cVar;
    }

    public static ArrayList w(String[] strArr, boolean z, p8c p8cVar) {
        String[] strArr2;
        p8c p8cVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            int i2 = i + 1;
            vl3 L = DictationAsr.L(str);
            if (L != null) {
                strArr2 = L.d(str);
            } else {
                strArr2 = new String[0];
            }
            String[] strArr3 = strArr2;
            if (strArr3.length < 2) {
                arrayList.add(null);
                p8cVar2 = p8cVar;
            } else {
                String g0 = DictationAsr.g0(L, str);
                ArrayList arrayList2 = new ArrayList();
                int i3 = -1;
                for (int i4 = 0; i4 < strArr3.length; i4++) {
                    arrayList2.add(jm3.N(strArr3[i4]));
                    if (!z && DictationAsr.z(str) && strArr3[i4].equals(g0)) {
                        i3 = i4;
                    }
                }
                p8cVar2 = p8cVar;
                arrayList.add(new djc(jm3.O(g0), arrayList2, i3, new go2(str, strArr3, p8cVar2, i2, (byte) 7)));
            }
            p8cVar = p8cVar2;
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
            StringBuilder p = ug8.p("recogniser ended error=", str2, " chars=");
            p.append(this.n.length());
            p.append(" (the voice recording goes on)");
            Log.d("VoiceLive", p.toString());
            this.f = null;
            if (xxe.a == this) {
                xxe.a = null;
            }
            this.d = null;
            this.e = null;
            boolean isEmpty = TextUtils.isEmpty(this.n.trim());
            jjc jjcVar = this.h;
            if (isEmpty) {
                if (jjcVar != null) {
                    jjcVar.m();
                }
            } else if (jjcVar != null) {
                jjcVar.setText(this.n);
                this.h.setListening(false);
            }
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        ArrayList arrayList2 = this.M;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public final void c() {
        String c0 = DictationAsr.c0();
        if (c0 != null) {
            String H = jm3.H(c0);
            jjc jjcVar = this.h;
            if (jjcVar != null) {
                jjcVar.setLanguage(H);
            }
            yic yicVar = this.K;
            if (yicVar != null && this.J) {
                this.l0 = H;
                yicVar.setLanguage(H);
            }
        }
    }

    @Override
    public final void d(float f) {
        if (this.c == 2) {
            if (this.J) {
                yic yicVar = this.K;
                if (yicVar != null) {
                    yicVar.setLevel(f);
                    return;
                }
                return;
            }
            jjc jjcVar = this.h;
            if (jjcVar != null) {
                jjcVar.setLevel(f);
            }
        }
    }

    @Override
    public final void e(String str) {
        f(-1, str);
    }

    @Override
    public final void f(int i, String str) {
        if (this.c == 2) {
            if (str == null) {
                str = "";
            }
            this.n = str;
            jjc jjcVar = this.h;
            if (jjcVar != null) {
                jjcVar.t(i, str);
            }
        }
    }

    @Override
    public final void g(String str) {
        String H;
        if (str == null) {
            H = null;
        } else {
            H = jm3.H(str);
        }
        jjc jjcVar = this.h;
        if (jjcVar != null && this.c == 2) {
            jjcVar.setLanguage(H);
        }
        yic yicVar = this.K;
        if (yicVar != null && this.J && this.c == 2) {
            this.l0 = H;
            yicVar.setLanguage(H);
        }
    }

    public final void h() {
        ArrayList arrayList = this.L;
        ArrayList arrayList2 = this.M;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
    }

    public final boolean[] i(ArrayList arrayList, float f, float f2) {
        long max;
        boolean z;
        boolean[] zArr = new boolean[arrayList.size()];
        if (this.c == 4) {
            long j = this.O;
            if (j > 0 && (f > 0.001f || f2 < 0.999f)) {
                float f3 = (float) j;
                long j2 = f * f3;
                long j3 = f2 * f3;
                int i = 0;
                long j4 = 0;
                while (i < arrayList.size()) {
                    long j5 = ((fjc) arrayList.get(i)).b;
                    if (((fjc) arrayList.get(i)).c >= 0) {
                        max = ((fjc) arrayList.get(i)).c;
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

    public final void j(String str, boolean z) {
        boolean z2;
        jjc jjcVar;
        yic yicVar;
        String str2;
        String str3;
        byte b = this.c;
        if (b != 0 || this.h != null || this.K != null) {
            if (this.J && b == 4 && this.b.c() && ("chat paused".equals(str) || "destroy".equals(str))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.J && this.c != 0 && !z2) {
                o0.remove(r());
            }
            if (this.c != 0) {
                StringBuilder p = ug8.p("dispose (", str, ") state=");
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
            gl.r(this.W);
            ln3 ln3Var = this.U;
            if (ln3Var != null) {
                ln3Var.c();
                this.U = null;
            }
            k(true);
            if (z2) {
                if (this.U == null) {
                    h();
                }
                ejc ejcVar = new ejc();
                ArrayList arrayList = ejcVar.a;
                ArrayList arrayList2 = this.L;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    fjc fjcVar = (fjc) obj;
                    fjc fjcVar2 = new fjc(fjcVar.a, fjcVar.b);
                    fjcVar2.c = fjcVar.c;
                    arrayList.add(fjcVar2);
                }
                ArrayList arrayList3 = this.M;
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList3.get(i2);
                    i2++;
                    fjc fjcVar3 = (fjc) obj2;
                    fjc fjcVar4 = new fjc(fjcVar3.a, fjcVar3.b);
                    fjcVar4.c = fjcVar3.c;
                    arrayList.add(fjcVar4);
                }
                ejcVar.b = this.O;
                ejcVar.c = this.P;
                ejcVar.d = this.Q;
                ejcVar.e = this.e0;
                ejcVar.g = this.f0;
                ejcVar.f = this.g0;
                ejcVar.h = this.h0;
                ejcVar.i = this.l0;
                o0.put(r(), ejcVar);
                StringBuilder sb = new StringBuilder("field: kept for the chat (");
                sb.append(arrayList.size());
                sb.append(" words");
                if (this.e0 != null) {
                    str2 = ", styled / edited";
                } else {
                    str2 = "";
                }
                sb.append(str2);
                sb.append(")");
                Log.d("VoiceLive", sb.toString());
            }
            this.e0 = null;
            this.g0 = null;
            this.i0 = false;
            this.b.g(Float.NaN, 0.0f);
            if (z && (yicVar = this.K) != null && yicVar.R) {
                yicVar.R = false;
                yicVar.f0 = -1;
                yicVar.invalidate();
            }
            gl.r(this.I);
            DictationAsr.T(this.m0);
            gl.r(this.k0);
            gl.r(this.j0);
            if (xxe.a == this) {
                xxe.a = null;
            }
            ln3 ln3Var2 = this.f;
            if (ln3Var2 != null) {
                ln3Var2.c();
                this.f = null;
            }
            am3 am3Var = this.d;
            if (am3Var != null) {
                am3Var.d();
                this.d = null;
            }
            this.e = null;
            if (z && (jjcVar = this.h) != null) {
                jjcVar.m();
            }
        }
    }

    public final void k(boolean z) {
        String obj;
        EditTextBoldCursor editTextBoldCursor = this.X;
        if (editTextBoldCursor == null) {
            return;
        }
        this.X = null;
        if (editTextBoldCursor.getText() == null) {
            obj = this.n;
        } else {
            obj = editTextBoldCursor.getText().toString();
        }
        this.n = obj;
        this.e0 = obj.trim();
        this.f0 = b().size();
        if (z && this.K != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.n);
            this.K.x(arrayList, null, false);
        }
        if (editTextBoldCursor.hasFocus()) {
            gl.t1(editTextBoldCursor);
        }
        gl.B2(editTextBoldCursor);
    }

    public final void l(Object obj) {
        String str;
        if (obj != null && !this.i0 && this.K != null) {
            boolean z = false;
            if (this.X != null) {
                k(false);
            }
            String str2 = this.g0;
            if (str2 == null) {
                str2 = this.n.trim();
                this.g0 = str2;
                if (this.e0 != null) {
                    z = true;
                }
                this.h0 = z;
            }
            if (!str2.isEmpty()) {
                this.i0 = true;
                this.K.setBusy(true);
                StringBuilder sb = new StringBuilder("field: style ");
                c cVar = this.b;
                cVar.getClass();
                if (obj instanceof kl3) {
                    str = ((kl3) obj).a();
                } else {
                    str = null;
                }
                sb.append(str);
                sb.append(" in place on ");
                sb.append(str2.length());
                sb.append(" chars");
                Log.d("VoiceLive", sb.toString());
                cVar.f(obj, str2, new hy3(this, SystemClock.uptimeMillis(), (byte) 3));
            }
        }
    }

    public final void m(String str) {
        boolean z;
        long j;
        if (this.c == 4) {
            z = true;
        } else {
            z = false;
        }
        j(str, false);
        yic yicVar = this.K;
        if (yicVar == null) {
            return;
        }
        mhc mhcVar = new mhc(this, yicVar, (byte) 3);
        if (z) {
            j = 470;
        } else {
            j = 60;
        }
        gl.e3(mhcVar, j);
    }

    public final void n(ByteBuffer byteBuffer, int i, int i2, int i3) {
        am3 am3Var = this.d;
        igb igbVar = this.e;
        if (am3Var != null && igbVar != null) {
            this.E = i2;
            this.F = i3;
            this.y++;
            this.w += i;
            int c = igbVar.c(byteBuffer, i, i2);
            if (igbVar.b <= 0) {
                if (!this.G) {
                    this.G = true;
                    Log.w("VoiceLive", "recorder rate " + i2 + " Hz isn't a multiple of 16 kHz: no transcript");
                }
            } else if (c > 0) {
                this.x += c;
                byte[] bArr = (byte[]) igbVar.g;
                if (c > 0) {
                    synchronized (am3Var.a) {
                        if (am3Var.d) {
                            return;
                        }
                        am3Var.a(c, bArr);
                        int i4 = c / 2;
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = i5 << 1;
                            double d = (short) ((bArr[i6] & 255) | (bArr[i6 + 1] << 8));
                            am3Var.h = (d * d) + am3Var.h;
                        }
                        int i7 = am3Var.i + i4;
                        am3Var.i = i7;
                        if (i7 >= 1600) {
                            double sqrt = Math.sqrt(am3Var.h / Math.max(1, i7));
                            am3Var.h = 0.0d;
                            am3Var.i = 0;
                            gn3 gn3Var = am3Var.g;
                            if (gn3Var != null) {
                                gn3Var.a((float) Math.max(0.0d, Math.min(1.0d, ((Math.log10(Math.max(1.0d, sqrt)) * 20.0d) - 42.0d) / 30.0d)));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void o(ln3 ln3Var, String str, int i) {
        if (ln3Var == this.f || ln3Var == this.U) {
            if (!this.J) {
                f(i, str);
                return;
            }
            byte b = this.c;
            if (b != 2 && b != 4) {
                return;
            }
            v(ln3Var, str);
            p();
        }
    }

    public final void p() {
        int i;
        ArrayList b = b();
        EditTextBoldCursor editTextBoldCursor = this.X;
        int i2 = 0;
        if (editTextBoldCursor != null) {
            Editable text = editTextBoldCursor.getText();
            if (text != null) {
                int i3 = this.Z;
                String str = "";
                if (i3 < 0 || this.a0.length() + i3 != text.length() || !text.toString().substring(this.Z).equals(this.a0)) {
                    this.Y = Math.min(this.b0, b.size());
                    this.Z = text.length();
                    this.a0 = "";
                }
                if (this.Y > b.size()) {
                    this.Y = b.size();
                }
                this.b0 = b.size();
                StringBuilder sb = new StringBuilder();
                for (int i4 = this.Y; i4 < b.size(); i4++) {
                    if (sb.length() > 0) {
                        sb.append(' ');
                    }
                    sb.append(((fjc) b.get(i4)).a);
                }
                if (sb.length() != 0 || !this.a0.isEmpty()) {
                    if (sb.length() > 0 && (i = this.Z) > 0 && !Character.isWhitespace(text.charAt(i - 1))) {
                        i2 = 1;
                    }
                    if (sb.length() != 0) {
                        if (i2 != 0) {
                            str = " ";
                        }
                        str = str + ((Object) sb);
                    }
                    if (!str.equals(this.a0)) {
                        text.replace(this.Z, text.length(), str);
                        this.a0 = str;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean[] zArr = null;
        if (this.e0 != null) {
            if (this.f0 > b.size()) {
                this.f0 = b.size();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.e0);
            StringBuilder sb2 = new StringBuilder(this.e0);
            for (int i5 = this.f0; i5 < b.size(); i5++) {
                arrayList.add(((fjc) b.get(i5)).a);
                sb2.append(' ');
                sb2.append(((fjc) b.get(i5)).a);
            }
            this.n = sb2.toString();
            yic yicVar = this.K;
            if (yicVar != null) {
                yicVar.x(arrayList, null, false);
                return;
            }
            return;
        }
        boolean[] i6 = i(b, this.P, this.Q);
        if (this.T) {
            zArr = i(b, this.R, this.S);
        }
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList(b.size());
        boolean[] zArr2 = new boolean[b.size()];
        int i7 = 0;
        while (i2 < b.size()) {
            if (zArr == null || !zArr[i2] || !i6[i2]) {
                arrayList2.add(((fjc) b.get(i2)).a);
                int i8 = i7 + 1;
                zArr2[i7] = i6[i2];
                if (!i6[i2]) {
                    if (sb3.length() > 0) {
                        sb3.append(' ');
                    }
                    sb3.append(((fjc) b.get(i2)).a);
                }
                i7 = i8;
            }
            i2++;
        }
        this.n = sb3.toString();
        yic yicVar2 = this.K;
        if (yicVar2 != null) {
            yicVar2.x(arrayList2, Arrays.copyOf(zArr2, i7), this.T);
        }
    }

    public final void q() {
        int i;
        c cVar = this.b;
        cja cjaVar = cVar.a.c2;
        if (cjaVar == null) {
            return;
        }
        if (this.K == null) {
            this.K = new yic(this.a, cVar.a.L4, new c5a(this, cjaVar));
        }
        View a = cVar.a();
        if (this.K.getParent() != cjaVar) {
            gl.B2(this.K);
            if (a != null && a.getParent() == cjaVar) {
                i = cjaVar.indexOfChild(a);
            } else {
                i = -1;
            }
            yic yicVar = this.K;
            if (i >= 0) {
                cjaVar.addView(yicVar, i, nme.c(-1.0f, -1));
            } else {
                cjaVar.addView(yicVar, nme.c(-1.0f, -1));
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
        StringBuilder sb = new StringBuilder();
        c cVar = this.b;
        sb.append(cVar.a.R);
        sb.append(":");
        sb.append(cVar.a.G3);
        return sb.toString();
    }

    public final void s() {
        v8b v8bVar = new v8b(this);
        ChatActivityEnterView chatActivityEnterView = this.b.a;
        ln3 ln3Var = new ln3(this.a, chatActivityEnterView.R, chatActivityEnterView.G3, false, v8bVar);
        v8bVar.b = ln3Var;
        this.f = ln3Var;
        ln3Var.w = this.d;
        ln3Var.l();
    }

    public final void t() {
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
        ejc ejcVar;
        boolean z3;
        boolean z4;
        boolean z5;
        float f3;
        float f4;
        long j3;
        byte b2 = this.c;
        if (b2 != 3) {
            String str4 = "VoiceLive";
            if (b2 == 0 && na7.c1().getBoolean("design_voice_live_field", true) && !this.b.d() && this.b.c() && (ejcVar = (ejc) o0.get(r())) != null) {
                cjc cjcVar = this.k0;
                cjc cjcVar2 = this.W;
                float[] fArr = this.V;
                this.J = true;
                ArrayList arrayList = this.L;
                arrayList.clear();
                ArrayList arrayList2 = ejcVar.a;
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    fjc fjcVar = (fjc) arrayList2.get(i4);
                    fjc fjcVar2 = new fjc(fjcVar.a, fjcVar.b);
                    fjcVar2.c = fjcVar.c;
                    arrayList.add(fjcVar2);
                }
                long j4 = 0;
                this.M.clear();
                this.O = ejcVar.b;
                this.e0 = ejcVar.e;
                this.f0 = Math.min(ejcVar.g, arrayList.size());
                this.g0 = ejcVar.f;
                this.h0 = ejcVar.h;
                this.l0 = ejcVar.i;
                this.c = (byte) 4;
                this.P = 0.0f;
                this.Q = 1.0f;
                this.T = false;
                if (ejcVar.c <= 0.001f && ejcVar.d >= 0.999f) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.b.b(fArr) && (fArr[0] > 0.001f || fArr[1] < 0.999f)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 && !z4 && this.O > 0) {
                    float f5 = ejcVar.c;
                    this.P = f5;
                    float f6 = ejcVar.d;
                    this.Q = f6;
                    boolean[] i5 = i(arrayList, f5, f6);
                    float f7 = this.P;
                    float f8 = (float) this.O;
                    long j5 = f7 * f8;
                    long j6 = this.Q * f8;
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (i6 < arrayList.size()) {
                        if (i5[i6]) {
                            j3 = j6;
                        } else {
                            fjc fjcVar3 = (fjc) arrayList.get(i6);
                            j3 = j6;
                            long j7 = j4;
                            fjcVar3.b = Math.max(j7, fjcVar3.b - j5);
                            long j8 = fjcVar3.c;
                            if (j8 >= j7) {
                                fjcVar3.c = Math.max(j7, j8 - j5);
                            }
                            arrayList3.add(fjcVar3);
                        }
                        i6++;
                        j6 = j3;
                        j4 = 0;
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList3);
                    this.O = Math.max(0L, j6 - j5);
                    this.P = 0.0f;
                    this.Q = 1.0f;
                } else if (z4) {
                    this.P = fArr[0];
                    this.Q = fArr[1];
                }
                Log.d("VoiceLive", "field: back with the chat (" + arrayList.size() + " words, " + this.O + " ms)");
                q();
                yic yicVar = this.K;
                if (yicVar != null) {
                    yicVar.setListening(false);
                    this.K.setPaused(true);
                    yic yicVar2 = this.K;
                    if (this.g0 != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    yicVar2.setRevertShown(z5);
                    yic yicVar3 = this.K;
                    yicVar3.z();
                    yicVar3.W = 1.0f;
                    boolean z6 = yicVar3.T;
                    if (z6) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    yicVar3.a0 = f3;
                    if (z6) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    yicVar3.T0 = f4;
                    yicVar3.b0 = 0.0f;
                    yicVar3.E0 = -1.0f;
                    yicVar3.invalidate();
                    this.K.setLanguage(this.l0);
                    c();
                }
                p();
                gl.r(cjcVar2);
                gl.e3(cjcVar2, 50L);
                gl.r(cjcVar);
                gl.e3(cjcVar, 250L);
                return;
            }
            byte b3 = this.c;
            c cVar = this.b;
            if (b3 == 4) {
                if (cVar.d()) {
                    gl.r(this.W);
                    ln3 ln3Var = this.U;
                    if (ln3Var != null) {
                        this.U = null;
                        ln3Var.c();
                        h();
                    }
                    h();
                    float f9 = this.P;
                    long j9 = this.O;
                    float f10 = (float) j9;
                    long j10 = f9 * f10;
                    float f11 = this.Q;
                    long j11 = f10 * f11;
                    if (j9 > 0 && (f9 > 0.001f || f11 < 0.999f)) {
                        boolean[] i7 = i(this.L, f9, f11);
                        ArrayList arrayList4 = new ArrayList();
                        int i8 = 0;
                        while (i8 < this.L.size()) {
                            if (i7[i8]) {
                                j2 = j10;
                            } else {
                                fjc fjcVar4 = (fjc) this.L.get(i8);
                                j2 = j10;
                                fjcVar4.b = Math.max(0L, fjcVar4.b - j2);
                                long j12 = fjcVar4.c;
                                if (j12 >= 0) {
                                    fjcVar4.c = Math.max(0L, j12 - j2);
                                }
                                arrayList4.add(fjcVar4);
                            }
                            i8++;
                            j10 = j2;
                        }
                        long j13 = j10;
                        this.L.clear();
                        this.L.addAll(arrayList4);
                        this.N = Math.max(0L, j11 - j13);
                        StringBuilder o = ug8.o(j13, "field: resumed after a trim ", "..");
                        o.append(j11);
                        o.append(" ms, ");
                        o.append(this.L.size());
                        o.append(" words kept");
                        Log.d("VoiceLive", o.toString());
                    } else {
                        this.N = j9;
                        Log.d("VoiceLive", "field: resumed at " + this.N + " ms");
                    }
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    if (this.e0 != null) {
                        this.f0 = this.L.size();
                    }
                    if (this.X != null) {
                        int size2 = this.L.size();
                        this.b0 = size2;
                        this.Y = size2;
                        this.Z = this.X.length();
                        this.a0 = "";
                    }
                    this.d = new am3();
                    this.e = new igb((byte) 1);
                    xxe.a = this;
                    this.c = (byte) 2;
                    s();
                    yic yicVar4 = this.K;
                    if (yicVar4 != null) {
                        yicVar4.setPaused(false);
                        this.K.setListening(true);
                    }
                    c();
                    DictationAsr.T(this.m0);
                    DictationAsr.i(this.m0);
                    u();
                    p();
                    gl.r(this.k0);
                    gl.e3(this.k0, 250L);
                    return;
                } else if (!this.b.c()) {
                    j("draft gone", true);
                    return;
                } else {
                    return;
                }
            }
            ChatActivityEnterView chatActivityEnterView = cVar.a;
            if (!wxe.a()) {
                if (this.c != 0) {
                    j("unavailable", true);
                }
            } else if (!this.b.d()) {
                if (this.J && this.c == 2) {
                    c cVar2 = this.b;
                    cVar2.getClass();
                    if ((MediaController.w().F() || cVar2.a.R3 != null) && this.b.c()) {
                        cjc cjcVar3 = this.W;
                        this.c = (byte) 4;
                        gl.r(this.j0);
                        am3 am3Var = this.d;
                        if (am3Var != null) {
                            j = am3Var.c() / 32;
                        } else {
                            j = 0;
                        }
                        this.O = this.N + j;
                        if (xxe.a == this) {
                            xxe.a = null;
                        }
                        ln3 ln3Var2 = this.f;
                        if (ln3Var2 != null) {
                            this.U = ln3Var2;
                            this.f = null;
                            am3 am3Var2 = this.d;
                            if (am3Var2 != null) {
                                am3Var2.d();
                            }
                            this.U.m();
                        } else {
                            h();
                        }
                        this.d = null;
                        this.e = null;
                        this.P = 0.0f;
                        this.Q = 1.0f;
                        this.T = false;
                        Log.d("VoiceLive", "field: paused at " + this.O + " ms, " + (this.M.size() + this.L.size()) + " words");
                        yic yicVar5 = this.K;
                        if (yicVar5 != null) {
                            yicVar5.setListening(false);
                            this.K.setPaused(true);
                        }
                        p();
                        gl.r(cjcVar3);
                        gl.e3(cjcVar3, 50L);
                        return;
                    }
                }
                if (this.c != 0) {
                    j("not recording", true);
                }
            } else {
                if (this.c == 0) {
                    if (n0) {
                        str = "VoiceLive";
                    } else {
                        n0 = true;
                        StringBuilder sb = new StringBuilder("resampler self-test (expect 1000Hz≈0dB, 12000Hz<-50dB): ");
                        StringBuilder sb2 = new StringBuilder();
                        int[] iArr = {1000, 12000};
                        int i9 = 0;
                        while (i9 < 2) {
                            int i10 = iArr[i9];
                            igb igbVar = new igb((byte) 1);
                            ByteBuffer allocate = ByteBuffer.allocate(19200);
                            int i11 = 0;
                            while (i11 < 9600) {
                                int i12 = i9;
                                short sin = (short) (Math.sin(((i10 * 6.283185307179586d) * i11) / 48000.0d) * 16000.0d);
                                int i13 = i11 << 1;
                                allocate.put(i13, (byte) sin);
                                allocate.put(i13 + 1, (byte) (sin >> 8));
                                i11++;
                                str4 = str4;
                                i9 = i12;
                            }
                            int i14 = i9;
                            String str5 = str4;
                            int c = igbVar.c(allocate, 19200, 48000);
                            byte[] bArr = (byte[]) igbVar.g;
                            double d = 0.0d;
                            int i15 = 0;
                            for (int i16 = 200; i16 < c / 2; i16++) {
                                int i17 = i16 << 1;
                                double d2 = (short) ((bArr[i17] & 255) | (bArr[i17 + 1] << 8));
                                d += d2 * d2;
                                i15++;
                            }
                            sb2.append(i10);
                            sb2.append("Hz=");
                            sb2.append(String.format(Locale.US, "%.1f", Double.valueOf(Math.log10(Math.max(1.0E-9d, Math.sqrt(d / Math.max(1, i15)) / 11313.708498984759d)) * 20.0d)));
                            sb2.append("dB ");
                            i9 = i14 + 1;
                            str4 = str5;
                        }
                        sb.append(sb2.toString().trim());
                        str = str4;
                        Log.d(str, sb.toString());
                    }
                    this.d = new am3();
                    this.e = new igb((byte) 1);
                    this.x = 0L;
                    this.w = 0L;
                    this.y = 0;
                    this.E = (char) 0;
                    this.F = (byte) 0;
                    this.G = false;
                    this.n = "";
                    this.J = na7.c1().getBoolean("design_voice_live_field", true);
                    this.L.clear();
                    this.M.clear();
                    this.N = 0L;
                    this.P = 0.0f;
                    this.Q = 1.0f;
                    this.T = false;
                    this.r = SystemClock.elapsedRealtime();
                    b = 1;
                    this.c = (byte) 1;
                    xxe.a = this;
                    gl.r(this.k0);
                    gl.e3(this.k0, 250L);
                    Log.d(str, "buffering: recorder tap on");
                } else {
                    b = 1;
                    str = "VoiceLive";
                }
                if (this.c == b && this.b.a.S0()) {
                    this.c = (byte) 2;
                    this.l0 = null;
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
                    s();
                    if (this.J) {
                        q();
                    } else {
                        c cVar3 = this.b;
                        cja cjaVar = cVar3.a.c2;
                        if (cjaVar != null) {
                            if (this.h == null) {
                                this.h = new jjc(this.a, cVar3.a.L4, this);
                            }
                            View a = cVar3.a();
                            if (a != null && a.getParent() == cjaVar) {
                                i = cjaVar.indexOfChild(a);
                            } else {
                                i = -1;
                            }
                            if (this.h.getParent() != cjaVar || (i >= 0 && cjaVar.indexOfChild(this.h) != i - 1)) {
                                gl.B2(this.h);
                                if (a != null && a.getParent() == cjaVar) {
                                    i2 = cjaVar.indexOfChild(a);
                                } else {
                                    i2 = -1;
                                }
                                jjc jjcVar = this.h;
                                if (i2 >= 0) {
                                    cjaVar.addView(jjcVar, i2, nme.e(-1, -1, 80));
                                } else {
                                    cjaVar.addView(jjcVar, nme.e(-1, -1, 80));
                                    Log.w(str, "composer isn't a direct child of the root: overlay on top");
                                }
                            }
                            jjc jjcVar2 = this.h;
                            ChatActivityEnterView chatActivityEnterView2 = cVar3.a;
                            int i18 = bkb.Oe;
                            int i19 = ChatActivityEnterView.r7;
                            jjcVar2.setAccent(chatActivityEnterView2.F0(i18) | (-16777216));
                            jjc jjcVar3 = this.h;
                            TextPaint textPaint = jjcVar3.c;
                            int i20 = bkb.c6;
                            wjb wjbVar = jjcVar3.b;
                            if (gl.B(bkb.v0(i20, wjbVar)) < 0.5f) {
                                z = true;
                            } else {
                                z = false;
                            }
                            jjcVar3.g0 = z;
                            int v0 = bkb.v0(bkb.F6, wjbVar) | (-16777216);
                            jjcVar3.h0 = v0;
                            textPaint.setColor(v0);
                            int i21 = jjcVar3.h0;
                            jjc.Y1 = i21;
                            boolean z7 = jjcVar3.g0;
                            int i22 = jjcVar3.i0;
                            if (z7) {
                                f = bm2.f(0.12f, i22, -1);
                            } else {
                                f = bm2.f(0.32f, i22, i21);
                            }
                            jjc.X1 = f;
                            jjc.Z1 = gl.L(7.0f);
                            TextPaint textPaint2 = jjcVar3.d;
                            int i23 = jjcVar3.h0;
                            if (jjcVar3.g0) {
                                f2 = 0.42f;
                            } else {
                                f2 = 0.36f;
                            }
                            textPaint2.setColor(bkb.p1(f2, i23));
                            if (Build.VERSION.SDK_INT >= 31 && gba.o() != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            jjcVar3.j0 = z2;
                            jjcVar3.r = 0;
                            Paint paint = jjcVar3.s;
                            if (jjcVar3.g0) {
                                i3 = 0;
                            } else {
                                i3 = 335544320;
                            }
                            paint.setColor(i3);
                            jjcVar3.k0 = "";
                            jjcVar3.y1 = -1;
                            jjcVar3.l0 = null;
                            jjcVar3.o0.clear();
                            jjcVar3.U0 = true;
                            jjcVar3.D0 = 0.0f;
                            jjcVar3.C0 = 0.0f;
                            jjcVar3.E0 = 0.0f;
                            jjcVar3.F0 = 0.0f;
                            jjcVar3.H0 = -1.0f;
                            jjcVar3.G0 = -1.0f;
                            jjcVar3.J0 = -1.0f;
                            jjcVar3.L0 = false;
                            jjcVar3.setStyleIcon(null);
                            jjcVar3.M0 = false;
                            jjcVar3.P0 = false;
                            jjcVar3.x1 = null;
                            jjcVar3.P1 = false;
                            jjcVar3.z1 = false;
                            jjcVar3.D1 = null;
                            jjcVar3.E1.clear();
                            textPaint.setShader(null);
                            jjcVar3.S0 = 0L;
                            jjcVar3.T0 = 0.0f;
                            jjcVar3.A0 = true;
                            jjcVar3.X0 = 0.0f;
                            jjcVar3.Y0 = 0.0f;
                            jjcVar3.Z0 = true;
                            jjcVar3.a1 = 1.0f;
                            jjcVar3.b1 = 0.0f;
                            jjcVar3.l1 = -1;
                            Arrays.fill(jjcVar3.m1, 0.0f);
                            jjcVar3.O = null;
                            jjcVar3.P = 0.0f;
                            jjcVar3.Q = 0.0f;
                            jjcVar3.W = false;
                            jjcVar3.R.setEmpty();
                            jjcVar3.setPlaceholder(null);
                            jjcVar3.p0 = true;
                            jjcVar3.r0 = SystemClock.uptimeMillis();
                            jjcVar3.t0 = 0L;
                            jjcVar3.f0 = 0L;
                            jjcVar3.setVisibility(0);
                            jjcVar3.invalidate();
                            Log.d(str, "overlay shown at index " + cjaVar.indexOfChild(this.h) + "/" + cjaVar.getChildCount());
                        }
                    }
                    yic yicVar6 = this.K;
                    if (yicVar6 != null && this.J && (str3 = this.l0) != null) {
                        yicVar6.setLanguage(str3);
                    }
                    c();
                    DictationAsr.T(this.m0);
                    DictationAsr.i(this.m0);
                    u();
                    gl.e3(this.j0, 1500L);
                }
            }
        }
    }

    public final void u() {
        long[] jArr = new long[2];
        String str = null;
        if (DictationAsr.J(jArr)) {
            str = k96.a0(null, null, 2131745065, Long.valueOf(Math.round(jArr[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(jArr[1] / 1048576.0d))));
        }
        jjc jjcVar = this.h;
        if (jjcVar != null) {
            jjcVar.setPlaceholder(str);
        }
        yic yicVar = this.K;
        if (yicVar != null && this.J) {
            yicVar.setPlaceholder(str);
        }
    }

    public final void v(defpackage.ln3 r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjc.v(ln3, java.lang.String):void");
    }
}
