package m;

import android.content.Context;
import android.opengl.Matrix;
import android.widget.LinearLayout;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import ki.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h80;
import w7.z5;
public final class s3 implements n5.b {
    public Object f16397a;
    public Object f16398b;
    public Object f16399c;
    public Object d;
    public Object e;
    public Object f16400f;
    public Object h;

    public s3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f16397a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f16399c = fVar2;
        this.d = str;
        this.e = str2;
        this.f16400f = aVar == null ? n8.a.f17394a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f16398b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.j(it);
    }

    public void a() {
        e(null);
        h80 h80Var = (h80) this.f16399c;
        if (h80Var != null) {
            h80Var.u();
            this.f16399c = null;
        }
        this.d = null;
        this.e = null;
        this.f16400f = null;
    }

    public void b(c6 c6Var, ArrayList arrayList) {
        g6 g6Var = (g6) this.f16398b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ki.n0 n0Var = (ki.n0) obj;
                ki.m0 m0Var = new ki.m0(c6Var.getContext(), n0Var, g6Var);
                m0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                m0Var.setBackground(k6.Z(k6.w0(k6.f21273i6, g6Var), 0, 0));
                m0Var.setOnClickListener(new ai.v0(this, c6Var, n0Var, 13));
                ((LinearLayout) this.d).addView(m0Var, z5.n(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float[] fArr2 = (float[]) this.f16397a;
        float f12 = (i10 - i11) / 0.3902439f;
        if (f12 <= 0.0f || f12 > i10) {
            f12 = i10;
        }
        float f13 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i11 / Math.max(1.0f, f12 / 1.64f))) * 2.0d), i10 / Math.max(1, i11), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f16398b, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.f16399c;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f7, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f10, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.d, 0, (float[]) this.f16398b, 0, (float[]) this.f16399c, 0);
        Matrix.multiplyMM((float[]) this.e, 0, (float[]) this.f16397a, 0, (float[]) this.d, 0);
        if (z10) {
            f11 = 0.0125f;
        } else {
            f11 = -0.0125f;
        }
        if (!z10) {
            f13 = -1.0f;
        }
        float f14 = f13;
        float f15 = -f14;
        d(f11, 0.618561f, f14, i10, i11, fArr, 0);
        d(f11, 0.618561f, f15, i10, i11, fArr, 2);
        d(f11, -0.593561f, f15, i10, i11, fArr, 4);
        d(f11, -0.593561f, f14, i10, i11, fArr, 6);
    }

    public float d(float f7, float f10, float f11, int i10, int i11, float[] fArr, int i12) {
        float[] fArr2 = (float[]) this.f16400f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.h, 0, (float[]) this.e, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.h;
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = com.google.android.gms.internal.play_billing.k3.t(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = org.telegram.ui.Cells.b1.x(fArr3[1], f12, 0.5f, 0.5f) * i11;
        return fArr3[2] * f12;
    }

    public void e(c6 c6Var) {
        c6 c6Var2 = (c6) this.h;
        if (c6Var2 != c6Var) {
            if (c6Var2 != null) {
                c6Var2.setShowCommandBackground(false);
            }
            this.h = c6Var;
            if (c6Var != null) {
                c6Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(c6 c6Var, String str) {
        h80 h80Var;
        h80 h80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ki.n0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(c6Var);
        if (((c6) this.f16400f) == c6Var && a2.equals((ArrayList) this.e) && (h80Var2 = (h80) this.f16399c) != null && h80Var2.D()) {
            return;
        }
        if (((c6) this.f16400f) == c6Var && (h80Var = (h80) this.f16399c) != null && h80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(c6Var, a2);
            ((h80) this.f16399c).O();
            return;
        }
        a();
        e(c6Var);
        this.f16400f = c6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(c6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(c6Var, a2);
        h80 i10 = ((ki.o0) this.f16397a).i(c6Var.getEditText());
        i10.Q = true;
        i10.f26929s = 0;
        i10.f26930t = false;
        i10.r((LinearLayout) this.d, z5.n(220, -2));
        i10.X = AndroidUtilities.dp(240.0f);
        i10.f26911i = 3;
        i10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        i10.f26924p = new ki.u(this, 2);
        i10.f26904d0 = true;
        if (i10.D()) {
            i10.C();
        }
        i10.Z();
        this.f16399c = i10;
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        ?? obj = new Object();
        obj.f8552a = (Context) ((hd.a) this.f16397a).mo27get();
        obj.f8553b = (m5.d) ((hd.a) this.f16398b).mo27get();
        obj.f8554c = (s5.d) ((hd.a) this.f16399c).mo27get();
        obj.d = (g3) ((g3) this.d).mo27get();
        obj.e = (Executor) ((hd.a) this.e).mo27get();
        obj.f8555f = (t5.c) ((hd.a) this.f16400f).mo27get();
        obj.f8556g = bVar;
        obj.h = aVar;
        obj.f8557i = (s5.c) ((hd.a) this.h).mo27get();
        return obj;
    }

    public s3() {
        this.f16397a = new float[16];
        this.f16398b = new float[16];
        this.f16399c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f16400f = new float[4];
        this.h = new float[4];
    }

    public s3(ki.o0 o0Var, g6 g6Var) {
        this.f16397a = o0Var;
        this.f16398b = g6Var;
    }

    public s3(String str, ca.c cVar, com.google.firebase.messaging.r rVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f16400f = new c5.c0(18, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f16399c = str;
        this.f16397a = new y9.f(cVar);
        this.f16398b = rVar;
    }
}
