package m;

import android.content.Context;
import android.opengl.Matrix;
import android.widget.LinearLayout;
import ii.e6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Wallet.n5;
import w7.w5;
public final class r3 implements n5.b {
    public Object f15555a;
    public Object f15556b;
    public Object f15557c;
    public Object d;
    public Object f15558e;
    public Object f15559f;
    public Object h;

    public r3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f15555a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f15557c = fVar2;
        this.d = str;
        this.f15558e = str2;
        this.f15559f = aVar == null ? n8.a.f16575a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f15556b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.k(it);
    }

    public void a() {
        e(null);
        s80 s80Var = (s80) this.f15557c;
        if (s80Var != null) {
            s80Var.u();
            this.f15557c = null;
        }
        this.d = null;
        this.f15558e = null;
        this.f15559f = null;
    }

    public void b(e6 e6Var, ArrayList arrayList) {
        c6 c6Var = (c6) this.f15556b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ii.o0 o0Var = (ii.o0) obj;
                ii.n0 n0Var = new ii.n0(e6Var.getContext(), o0Var, c6Var);
                n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n0Var.setBackground(h6.Z(h6.w0(h6.f20651i6, c6Var), 0, 0));
                n0Var.setOnClickListener(new ai.d0(this, e6Var, o0Var, 10));
                ((LinearLayout) this.d).addView(n0Var, w5.n(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float f12;
        float[] fArr2 = (float[]) this.f15555a;
        n5.e(fArr2, i10, i11);
        float[] fArr3 = (float[]) this.f15556b;
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr4 = (float[]) this.f15557c;
        n5.d(f7, f10, fArr4);
        float[] fArr5 = (float[]) this.d;
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        Matrix.multiplyMM((float[]) this.f15558e, 0, fArr2, 0, fArr5, 0);
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
        float[] fArr2 = (float[]) this.f15559f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        float[] fArr3 = (float[]) this.h;
        Matrix.multiplyMV(fArr3, 0, (float[]) this.f15558e, 0, fArr2, 0);
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = com.google.android.gms.internal.vision.e2.w(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = (0.5f - ((fArr3[1] * f12) * 0.5f)) * i11;
    }

    public void e(e6 e6Var) {
        e6 e6Var2 = (e6) this.h;
        if (e6Var2 != e6Var) {
            if (e6Var2 != null) {
                e6Var2.setShowCommandBackground(false);
            }
            this.h = e6Var;
            if (e6Var != null) {
                e6Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(e6 e6Var, String str) {
        s80 s80Var;
        s80 s80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ii.o0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(e6Var);
        if (((e6) this.f15559f) == e6Var && a2.equals((ArrayList) this.f15558e) && (s80Var2 = (s80) this.f15557c) != null && s80Var2.D()) {
            return;
        }
        if (((e6) this.f15559f) == e6Var && (s80Var = (s80) this.f15557c) != null && s80Var.D() && ((LinearLayout) this.d) != null) {
            this.f15558e = a2;
            b(e6Var, a2);
            ((s80) this.f15557c).O();
            return;
        }
        a();
        e(e6Var);
        this.f15559f = e6Var;
        this.f15558e = a2;
        LinearLayout linearLayout = new LinearLayout(e6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(e6Var, a2);
        s80 a10 = ((ii.p0) this.f15555a).a(e6Var.getEditText());
        a10.Q = true;
        a10.f30468s = 0;
        a10.f30469t = false;
        a10.r((LinearLayout) this.d, w5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f30450i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f30463p = new i2.h0(this, 4);
        a10.f30442d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f15557c = a10;
    }

    @Override
    public Object mo27get() {
        qb.b bVar = new qb.b(24);
        ob.a aVar = new ob.a(24);
        ?? obj = new Object();
        obj.f8229a = (Context) ((gd.a) this.f15555a).mo27get();
        obj.f8230b = (m5.d) ((gd.a) this.f15556b).mo27get();
        obj.f8231c = (s5.d) ((gd.a) this.f15557c).mo27get();
        obj.d = (f3) ((f3) this.d).mo27get();
        obj.f8232e = (Executor) ((gd.a) this.f15558e).mo27get();
        obj.f8233f = (t5.c) ((gd.a) this.f15559f).mo27get();
        obj.f8234g = bVar;
        obj.h = aVar;
        obj.f8235i = (s5.c) ((gd.a) this.h).mo27get();
        return obj;
    }

    public r3(ii.p0 p0Var, c6 c6Var) {
        this.f15555a = p0Var;
        this.f15556b = c6Var;
    }

    public r3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.f15558e = new com.google.firebase.messaging.m(this, true);
        this.f15559f = new c5.b0(13, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f15557c = str;
        this.f15555a = new x9.f(cVar);
        this.f15556b = sVar;
    }

    public r3() {
        this.f15555a = new float[16];
        this.f15556b = new float[16];
        this.f15557c = new float[16];
        this.d = new float[16];
        this.f15558e = new float[16];
        this.f15559f = new float[4];
        this.h = new float[4];
    }
}
