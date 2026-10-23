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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.i80;
import w7.z5;
public final class s3 implements n5.b {
    public Object f16334a;
    public Object f16335b;
    public Object f16336c;
    public Object d;
    public Object e;
    public Object f16337f;
    public Object h;

    public s3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f16334a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f16336c = fVar2;
        this.d = str;
        this.e = str2;
        this.f16337f = aVar == null ? n8.a.f17331a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f16335b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.j(it);
    }

    public void a() {
        e(null);
        i80 i80Var = (i80) this.f16336c;
        if (i80Var != null) {
            i80Var.u();
            this.f16336c = null;
        }
        this.d = null;
        this.e = null;
        this.f16337f = null;
    }

    public void b(c6 c6Var, ArrayList arrayList) {
        d6 d6Var = (d6) this.f16335b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ki.n0 n0Var = (ki.n0) obj;
                ki.m0 m0Var = new ki.m0(c6Var.getContext(), n0Var, d6Var);
                m0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                m0Var.setBackground(h6.Z(h6.w0(h6.f21083i6, d6Var), 0, 0));
                m0Var.setOnClickListener(new ai.v0(this, c6Var, n0Var, 13));
                ((LinearLayout) this.d).addView(m0Var, z5.n(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float[] fArr2 = (float[]) this.f16334a;
        float f12 = (i10 - i11) / 0.3902439f;
        if (f12 <= 0.0f || f12 > i10) {
            f12 = i10;
        }
        float f13 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i11 / Math.max(1.0f, f12 / 1.64f))) * 2.0d), i10 / Math.max(1, i11), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f16335b, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.f16336c;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f7, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f10, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.d, 0, (float[]) this.f16335b, 0, (float[]) this.f16336c, 0);
        Matrix.multiplyMM((float[]) this.e, 0, (float[]) this.f16334a, 0, (float[]) this.d, 0);
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
        float[] fArr2 = (float[]) this.f16337f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.h, 0, (float[]) this.e, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.h;
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = com.google.android.gms.internal.play_billing.k3.t(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = org.telegram.ui.Cells.c1.z(fArr3[1], f12, 0.5f, 0.5f) * i11;
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
        i80 i80Var;
        i80 i80Var2;
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
        if (((c6) this.f16337f) == c6Var && a2.equals((ArrayList) this.e) && (i80Var2 = (i80) this.f16336c) != null && i80Var2.D()) {
            return;
        }
        if (((c6) this.f16337f) == c6Var && (i80Var = (i80) this.f16336c) != null && i80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(c6Var, a2);
            ((i80) this.f16336c).O();
            return;
        }
        a();
        e(c6Var);
        this.f16337f = c6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(c6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(c6Var, a2);
        i80 h = ((ki.o0) this.f16334a).h(c6Var.getEditText());
        h.Q = true;
        h.f27189s = 0;
        h.f27190t = false;
        h.r((LinearLayout) this.d, z5.n(220, -2));
        h.X = AndroidUtilities.dp(240.0f);
        h.f27171i = 3;
        h.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        h.f27184p = new ki.u(this, 2);
        h.f27164d0 = true;
        if (h.D()) {
            h.C();
        }
        h.Z();
        this.f16336c = h;
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        ?? obj = new Object();
        obj.f8545a = (Context) ((hd.a) this.f16334a).mo27get();
        obj.f8546b = (m5.d) ((hd.a) this.f16335b).mo27get();
        obj.f8547c = (s5.d) ((hd.a) this.f16336c).mo27get();
        obj.d = (g3) ((g3) this.d).mo27get();
        obj.e = (Executor) ((hd.a) this.e).mo27get();
        obj.f8548f = (t5.c) ((hd.a) this.f16337f).mo27get();
        obj.f8549g = bVar;
        obj.h = aVar;
        obj.f8550i = (s5.c) ((hd.a) this.h).mo27get();
        return obj;
    }

    public s3() {
        this.f16334a = new float[16];
        this.f16335b = new float[16];
        this.f16336c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f16337f = new float[4];
        this.h = new float[4];
    }

    public s3(ki.o0 o0Var, d6 d6Var) {
        this.f16334a = o0Var;
        this.f16335b = d6Var;
    }

    public s3(String str, ca.c cVar, com.google.firebase.messaging.r rVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f16337f = new c5.c0(18, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f16336c = str;
        this.f16334a = new y9.f(cVar);
        this.f16335b = rVar;
    }
}
