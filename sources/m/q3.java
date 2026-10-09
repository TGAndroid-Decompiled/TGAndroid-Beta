package m;

import android.content.Context;
import android.opengl.Matrix;
import android.widget.LinearLayout;
import ii.f6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Wallet.j5;
import w7.x5;
public final class q3 implements n5.b {
    public Object f15795a;
    public Object f15796b;
    public Object f15797c;
    public Object d;
    public Object f15798e;
    public Object f15799f;
    public Object h;

    public q3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f15795a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f15797c = fVar2;
        this.d = str;
        this.f15798e = str2;
        this.f15799f = aVar == null ? n8.a.f16822a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f15796b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.k(it);
    }

    public void a() {
        e(null);
        p80 p80Var = (p80) this.f15797c;
        if (p80Var != null) {
            p80Var.u();
            this.f15797c = null;
        }
        this.d = null;
        this.f15798e = null;
        this.f15799f = null;
    }

    public void b(f6 f6Var, ArrayList arrayList) {
        e6 e6Var = (e6) this.f15796b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ii.o0 o0Var = (ii.o0) obj;
                ii.n0 n0Var = new ii.n0(f6Var.getContext(), o0Var, e6Var);
                n0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                n0Var.setBackground(i6.Z(i6.w0(i6.f20888i6, e6Var), 0, 0));
                n0Var.setOnClickListener(new ai.d0(this, f6Var, o0Var, 10));
                ((LinearLayout) this.d).addView(n0Var, x5.n(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float f12;
        float[] fArr2 = (float[]) this.f15795a;
        j5.e(fArr2, i10, i11);
        float[] fArr3 = (float[]) this.f15796b;
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr4 = (float[]) this.f15797c;
        j5.d(f7, f10, fArr4);
        float[] fArr5 = (float[]) this.d;
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        Matrix.multiplyMM((float[]) this.f15798e, 0, fArr2, 0, fArr5, 0);
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
        float[] fArr2 = (float[]) this.f15799f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        float[] fArr3 = (float[]) this.h;
        Matrix.multiplyMV(fArr3, 0, (float[]) this.f15798e, 0, fArr2, 0);
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = com.google.android.gms.internal.vision.e2.w(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = (0.5f - ((fArr3[1] * f12) * 0.5f)) * i11;
    }

    public void e(f6 f6Var) {
        f6 f6Var2 = (f6) this.h;
        if (f6Var2 != f6Var) {
            if (f6Var2 != null) {
                f6Var2.setShowCommandBackground(false);
            }
            this.h = f6Var;
            if (f6Var != null) {
                f6Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(f6 f6Var, String str) {
        p80 p80Var;
        p80 p80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = ii.o0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(f6Var);
        if (((f6) this.f15799f) == f6Var && a2.equals((ArrayList) this.f15798e) && (p80Var2 = (p80) this.f15797c) != null && p80Var2.D()) {
            return;
        }
        if (((f6) this.f15799f) == f6Var && (p80Var = (p80) this.f15797c) != null && p80Var.D() && ((LinearLayout) this.d) != null) {
            this.f15798e = a2;
            b(f6Var, a2);
            ((p80) this.f15797c).O();
            return;
        }
        a();
        e(f6Var);
        this.f15799f = f6Var;
        this.f15798e = a2;
        LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(f6Var, a2);
        p80 a10 = ((ii.p0) this.f15795a).a(f6Var.getEditText());
        a10.Q = true;
        a10.f29789s = 0;
        a10.f29790t = false;
        a10.r((LinearLayout) this.d, x5.n(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f29771i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f29784p = new i2.h0(this, 4);
        a10.f29763d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f15797c = a10;
    }

    @Override
    public Object mo27get() {
        ob.a aVar = new ob.a(24);
        na.d dVar = new na.d(24);
        ?? obj = new Object();
        obj.f8232a = (Context) ((gd.a) this.f15795a).mo27get();
        obj.f8233b = (m5.d) ((gd.a) this.f15796b).mo27get();
        obj.f8234c = (s5.d) ((gd.a) this.f15797c).mo27get();
        obj.d = (la.h) ((la.h) this.d).mo27get();
        obj.f8235e = (Executor) ((gd.a) this.f15798e).mo27get();
        obj.f8236f = (t5.c) ((gd.a) this.f15799f).mo27get();
        obj.f8237g = aVar;
        obj.h = dVar;
        obj.f8238i = (s5.c) ((gd.a) this.h).mo27get();
        return obj;
    }

    public q3(ii.p0 p0Var, e6 e6Var) {
        this.f15795a = p0Var;
        this.f15796b = e6Var;
    }

    public q3(String str, ba.c cVar, com.google.firebase.messaging.s sVar) {
        this.d = new com.google.firebase.messaging.m(this, false);
        this.f15798e = new com.google.firebase.messaging.m(this, true);
        this.f15799f = new c5.b0(14, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f15797c = str;
        this.f15795a = new x9.f(cVar);
        this.f15796b = sVar;
    }

    public q3() {
        this.f15795a = new float[16];
        this.f15796b = new float[16];
        this.f15797c = new float[16];
        this.d = new float[16];
        this.f15798e = new float[16];
        this.f15799f = new float[4];
        this.h = new float[4];
    }
}
