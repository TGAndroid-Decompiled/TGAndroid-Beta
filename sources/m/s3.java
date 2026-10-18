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
import org.telegram.ui.Wallet.b6;
import w7.z5;
public final class s3 implements n5.b {
    public Object f16335a;
    public Object f16336b;
    public Object f16337c;
    public Object d;
    public Object e;
    public Object f16338f;
    public Object h;

    public s3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f16335a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f16337c = fVar2;
        this.d = str;
        this.e = str2;
        this.f16338f = aVar == null ? n8.a.f17334a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f16336b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.j(it);
    }

    public void a() {
        e(null);
        i80 i80Var = (i80) this.f16337c;
        if (i80Var != null) {
            i80Var.u();
            this.f16337c = null;
        }
        this.d = null;
        this.e = null;
        this.f16338f = null;
    }

    public void b(c6 c6Var, ArrayList arrayList) {
        d6 d6Var = (d6) this.f16336b;
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
                m0Var.setBackground(h6.Z(h6.w0(h6.f21082i6, d6Var), 0, 0));
                m0Var.setOnClickListener(new ai.v0(this, c6Var, n0Var, 13));
                ((LinearLayout) this.d).addView(m0Var, z5.n(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float f12;
        float[] fArr2 = (float[]) this.f16335a;
        b6.d(fArr2, i10, i11);
        float[] fArr3 = (float[]) this.f16336b;
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr4 = (float[]) this.f16337c;
        b6.c(f7, f10, fArr4);
        float[] fArr5 = (float[]) this.d;
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        Matrix.multiplyMM((float[]) this.e, 0, fArr2, 0, fArr5, 0);
        if (z10) {
            f11 = 0.0125f;
        } else {
            f11 = -0.0125f;
        }
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = -1.0f;
        }
        float f13 = -f12;
        float f14 = f11;
        d(f14, 0.618561f, f12, i10, i11, fArr, 0);
        d(f14, 0.618561f, f13, i10, i11, fArr, 2);
        d(f14, -0.593561f, f13, i10, i11, fArr, 4);
        d(f14, -0.593561f, f12, i10, i11, fArr, 6);
    }

    public void d(float f7, float f10, float f11, int i10, int i11, float[] fArr, int i12) {
        float[] fArr2 = (float[]) this.f16338f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        float[] fArr3 = (float[]) this.h;
        Matrix.multiplyMV(fArr3, 0, (float[]) this.e, 0, fArr2, 0);
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = com.google.android.gms.internal.play_billing.k3.t(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = org.telegram.ui.Cells.c1.z(fArr3[1], f12, 0.5f, 0.5f) * i11;
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
        if (((c6) this.f16338f) == c6Var && a2.equals((ArrayList) this.e) && (i80Var2 = (i80) this.f16337c) != null && i80Var2.D()) {
            return;
        }
        if (((c6) this.f16338f) == c6Var && (i80Var = (i80) this.f16337c) != null && i80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(c6Var, a2);
            ((i80) this.f16337c).O();
            return;
        }
        a();
        e(c6Var);
        this.f16338f = c6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(c6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(c6Var, a2);
        i80 h = ((ki.o0) this.f16335a).h(c6Var.getEditText());
        h.Q = true;
        h.f27141s = 0;
        h.f27142t = false;
        h.r((LinearLayout) this.d, z5.n(220, -2));
        h.X = AndroidUtilities.dp(240.0f);
        h.f27123i = 3;
        h.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        h.f27136p = new ki.u(this, 2);
        h.f27116d0 = true;
        if (h.D()) {
            h.C();
        }
        h.Z();
        this.f16337c = h;
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        ?? obj = new Object();
        obj.f8548a = (Context) ((hd.a) this.f16335a).mo27get();
        obj.f8549b = (m5.d) ((hd.a) this.f16336b).mo27get();
        obj.f8550c = (s5.d) ((hd.a) this.f16337c).mo27get();
        obj.d = (g3) ((g3) this.d).mo27get();
        obj.e = (Executor) ((hd.a) this.e).mo27get();
        obj.f8551f = (t5.c) ((hd.a) this.f16338f).mo27get();
        obj.f8552g = bVar;
        obj.h = aVar;
        obj.f8553i = (s5.c) ((hd.a) this.h).mo27get();
        return obj;
    }

    public s3(ki.o0 o0Var, d6 d6Var) {
        this.f16335a = o0Var;
        this.f16336b = d6Var;
    }

    public s3(String str, ca.c cVar, com.google.firebase.messaging.r rVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f16338f = new c5.b0(17, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f16337c = str;
        this.f16335a = new y9.f(cVar);
        this.f16336b = rVar;
    }

    public s3() {
        this.f16335a = new float[16];
        this.f16336b = new float[16];
        this.f16337c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f16338f = new float[4];
        this.h = new float[4];
    }
}
