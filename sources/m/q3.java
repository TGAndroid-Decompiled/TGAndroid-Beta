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
import ji.i6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Wallet.j5;
import w7.a6;
public final class q3 implements n5.b {
    public Object f15219a;
    public Object f15220b;
    public Object f15221c;
    public Object d;
    public Object e;
    public Object f15222f;
    public Object h;

    public q3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f15219a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f15221c = fVar2;
        this.d = str;
        this.e = str2;
        this.f15222f = aVar == null ? n8.a.f16240a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f15220b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.j(it);
    }

    public void a() {
        e(null);
        m80 m80Var = (m80) this.f15221c;
        if (m80Var != null) {
            m80Var.u();
            this.f15221c = null;
        }
        this.d = null;
        this.e = null;
        this.f15222f = null;
    }

    public void b(i6 i6Var, ArrayList arrayList) {
        c6 c6Var = (c6) this.f15220b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ji.n0 n0Var = (ji.n0) obj;
                ji.m0 m0Var = new ji.m0(i6Var.getContext(), n0Var, c6Var);
                m0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                m0Var.setBackground(g6.Z(g6.w0(g6.f19990i6, c6Var), 0, 0));
                m0Var.setOnClickListener(new bi.x(this, i6Var, n0Var, 10));
                ((LinearLayout) this.d).addView(m0Var, a6.n(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float f12;
        float[] fArr2 = (float[]) this.f15219a;
        j5.e(fArr2, i10, i11);
        float[] fArr3 = (float[]) this.f15220b;
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr4 = (float[]) this.f15221c;
        j5.d(f7, f10, fArr4);
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
        float[] fArr2 = (float[]) this.f15222f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        float[] fArr3 = (float[]) this.h;
        Matrix.multiplyMV(fArr3, 0, (float[]) this.e, 0, fArr2, 0);
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = com.google.android.gms.internal.play_billing.k3.t(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = (0.5f - ((fArr3[1] * f12) * 0.5f)) * i11;
    }

    public void e(i6 i6Var) {
        i6 i6Var2 = (i6) this.h;
        if (i6Var2 != i6Var) {
            if (i6Var2 != null) {
                i6Var2.setShowCommandBackground(false);
            }
            this.h = i6Var;
            if (i6Var != null) {
                i6Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(i6 i6Var, String str) {
        m80 m80Var;
        m80 m80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ji.n0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(i6Var);
        if (((i6) this.f15222f) == i6Var && a2.equals((ArrayList) this.e) && (m80Var2 = (m80) this.f15221c) != null && m80Var2.D()) {
            return;
        }
        if (((i6) this.f15222f) == i6Var && (m80Var = (m80) this.f15221c) != null && m80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(i6Var, a2);
            ((m80) this.f15221c).O();
            return;
        }
        a();
        e(i6Var);
        this.f15222f = i6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(i6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(i6Var, a2);
        m80 i10 = ((ji.o0) this.f15219a).i(i6Var.getEditText());
        i10.Q = true;
        i10.f27298s = 0;
        i10.f27299t = false;
        i10.r((LinearLayout) this.d, a6.n(220, -2));
        i10.X = AndroidUtilities.dp(240.0f);
        i10.f27280i = 3;
        i10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        i10.f27293p = new ig.t0(this, 9);
        i10.f27273d0 = true;
        if (i10.D()) {
            i10.C();
        }
        i10.Z();
        this.f15221c = i10;
    }

    @Override
    public Object mo27get() {
        rb.b bVar = new rb.b(24);
        pb.a aVar = new pb.a(24);
        ?? obj = new Object();
        obj.f8663a = (Context) ((hd.a) this.f15219a).mo27get();
        obj.f8664b = (m5.d) ((hd.a) this.f15220b).mo27get();
        obj.f8665c = (s5.d) ((hd.a) this.f15221c).mo27get();
        obj.d = (li.k) ((li.k) this.d).mo27get();
        obj.e = (Executor) ((hd.a) this.e).mo27get();
        obj.f8666f = (t5.c) ((hd.a) this.f15222f).mo27get();
        obj.f8667g = bVar;
        obj.h = aVar;
        obj.f8668i = (s5.c) ((hd.a) this.h).mo27get();
        return obj;
    }

    public q3(ji.o0 o0Var, c6 c6Var) {
        this.f15219a = o0Var;
        this.f15220b = c6Var;
    }

    public q3(String str, ca.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f15222f = new c5.c0(17, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f15221c = str;
        this.f15219a = new y9.f(cVar);
        this.f15220b = sVar;
    }

    public q3() {
        this.f15219a = new float[16];
        this.f15220b = new float[16];
        this.f15221c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f15222f = new float[4];
        this.h = new float[4];
    }
}
