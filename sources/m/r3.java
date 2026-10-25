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
import li.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
public final class r3 implements o5.b {
    public Object f17844a;
    public Object f17845b;
    public Object f17846c;
    public Object d;
    public Object e;
    public Object f17847f;
    public Object h;

    public r3(Set set, a0.f fVar, String str, String str2, o8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f17844a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f17846c = fVar2;
        this.d = str;
        this.e = str2;
        this.f17847f = aVar == null ? o8.a.f19274a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f17845b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.j(it);
    }

    public void a() {
        e(null);
        k80 k80Var = (k80) this.f17846c;
        if (k80Var != null) {
            k80Var.u();
            this.f17846c = null;
        }
        this.d = null;
        this.e = null;
        this.f17847f = null;
    }

    public void b(d6 d6Var, ArrayList arrayList) {
        u6 u6Var = (u6) this.f17845b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                li.m0 m0Var = (li.m0) obj;
                li.l0 l0Var = new li.l0(d6Var.getContext(), m0Var, u6Var);
                l0Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(12.0f), 0);
                l0Var.setBackground(y6.Z(y6.w0(y6.f23446i6, u6Var), 0, 0));
                l0Var.setOnClickListener(new bi.w0(this, d6Var, m0Var, 13));
                ((LinearLayout) this.d).addView(l0Var, gb1.r(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float[] fArr2 = (float[]) this.f17844a;
        float f12 = (i10 - i11) / 0.3902439f;
        if (f12 <= 0.0f || f12 > i10) {
            f12 = i10;
        }
        float f13 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i11 / Math.max(1.0f, f12 / 1.64f))) * 2.0d), i10 / Math.max(1, i11), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f17845b, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.f17846c;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f7, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f10, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.d, 0, (float[]) this.f17845b, 0, (float[]) this.f17846c, 0);
        Matrix.multiplyMM((float[]) this.e, 0, (float[]) this.f17844a, 0, (float[]) this.d, 0);
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
        float[] fArr2 = (float[]) this.f17847f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.h, 0, (float[]) this.e, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.h;
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = c3.h0.u(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = org.telegram.ui.d3.A(fArr3[1], f12, 0.5f, 0.5f) * i11;
        return fArr3[2] * f12;
    }

    public void e(d6 d6Var) {
        d6 d6Var2 = (d6) this.h;
        if (d6Var2 != d6Var) {
            if (d6Var2 != null) {
                d6Var2.setShowCommandBackground(false);
            }
            this.h = d6Var;
            if (d6Var != null) {
                d6Var.setShowCommandBackground(true);
            }
        }
    }

    public void f(d6 d6Var, String str) {
        k80 k80Var;
        k80 k80Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = li.m0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(d6Var);
        if (((d6) this.f17847f) == d6Var && a2.equals((ArrayList) this.e) && (k80Var2 = (k80) this.f17846c) != null && k80Var2.D()) {
            return;
        }
        if (((d6) this.f17847f) == d6Var && (k80Var = (k80) this.f17846c) != null && k80Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(d6Var, a2);
            ((k80) this.f17846c).O();
            return;
        }
        a();
        e(d6Var);
        this.f17847f = d6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(d6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(d6Var, a2);
        k80 a10 = ((li.n0) this.f17844a).a(d6Var.getEditText());
        a10.Q = true;
        a10.f29866s = 0;
        a10.f29867t = false;
        a10.r((LinearLayout) this.d, gb1.r(220, -2));
        a10.X = AndroidUtilities.dp(240.0f);
        a10.f29848i = 3;
        a10.a0(-AndroidUtilities.dp(12.0f), 0.0f);
        a10.f29861p = new k2.c(this, 6);
        a10.f29841d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f17846c = a10;
    }

    @Override
    public Object mo27get() {
        Object obj = new Object();
        u7.s sVar = new u7.s(24);
        ?? obj2 = new Object();
        obj2.f1031a = (Context) ((id.a) this.f17844a).mo27get();
        obj2.f1033c = (n5.d) ((id.a) this.f17845b).mo27get();
        obj2.f1034f = (t5.d) ((id.a) this.f17846c).mo27get();
        obj2.f1032b = (s4.d) ((k6.c) this.d).mo27get();
        obj2.f1035g = (Executor) ((id.a) this.e).mo27get();
        obj2.d = (u5.c) ((id.a) this.f17847f).mo27get();
        obj2.e = obj;
        obj2.h = sVar;
        obj2.f1036i = (t5.c) ((id.a) this.h).mo27get();
        return obj2;
    }

    public r3() {
        this.f17844a = new float[16];
        this.f17845b = new float[16];
        this.f17846c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f17847f = new float[4];
        this.h = new float[4];
    }

    public r3(li.n0 n0Var, u6 u6Var) {
        this.f17844a = n0Var;
        this.f17845b = u6Var;
    }

    public r3(String str, da.c cVar, com.google.firebase.messaging.q qVar) {
        this.d = new c2.b(this, false);
        this.e = new c2.b(this, true);
        this.f17847f = new d5.z(18, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f17846c = str;
        this.f17844a = new z9.f(cVar);
        this.f17845b = qVar;
    }
}
