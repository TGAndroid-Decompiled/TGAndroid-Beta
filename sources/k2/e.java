package k2;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n7.z0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.ff0;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.oq0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sg0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.os0;
import s4.c1;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import yh.x3;
public class e implements m.k, xo0, d5, lg.o, a81, com.google.android.gms.common.api.internal.s, h1, oq0 {
    public final int f14387a;
    public Object f14388b;

    public e(int i10, boolean z10) {
        this.f14387a = i10;
    }

    public static float[] f(ArrayList arrayList) {
        double d;
        double d10;
        float f7;
        double[] dArr;
        ArrayList arrayList2;
        float f10;
        float f11;
        int i10;
        float f12;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            PointF pointF = (PointF) arrayList.get(i11);
            pointF.x *= 255.0f;
            pointF.y *= 255.0f;
        }
        int size2 = arrayList.size();
        double d11 = 1.0d;
        if (size2 <= 0 || size2 == 1) {
            d = 1.0d;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr = null;
        } else {
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size2, 3);
            double[] dArr3 = new double[size2];
            double[] dArr4 = dArr2[0];
            dArr4[1] = 1.0d;
            double d12 = 0.0d;
            dArr4[0] = 0.0d;
            dArr4[2] = 0.0d;
            int i12 = 1;
            while (true) {
                i10 = size2 - 1;
                if (i12 >= i10) {
                    break;
                }
                PointF pointF2 = (PointF) arrayList.get(i12 - 1);
                PointF pointF3 = (PointF) arrayList.get(i12);
                int i13 = i12 + 1;
                double d13 = d11;
                PointF pointF4 = (PointF) arrayList.get(i13);
                double[] dArr5 = dArr2[i12];
                float f13 = pointF3.x;
                double d14 = d12;
                double d15 = f13 - pointF2.x;
                dArr5[0] = d15 / 6.0d;
                float f14 = pointF4.x;
                dArr5[1] = (f14 - f12) / 3.0d;
                double d16 = f14 - f13;
                dArr5[2] = d16 / 6.0d;
                float f15 = pointF4.y;
                float f16 = pointF3.y;
                dArr3[i12] = ((f15 - f16) / d16) - ((f16 - pointF2.y) / d15);
                i12 = i13;
                d11 = d13;
                d12 = d14;
            }
            d = d11;
            double d17 = d12;
            d10 = 6.0d;
            f7 = 255.0f;
            dArr3[0] = d17;
            dArr3[i10] = d17;
            double[] dArr6 = dArr2[i10];
            dArr6[1] = d;
            dArr6[0] = d17;
            dArr6[2] = d17;
            for (int i14 = 1; i14 < size2; i14++) {
                double[] dArr7 = dArr2[i14];
                double d18 = dArr7[0];
                int i15 = i14 - 1;
                double[] dArr8 = dArr2[i15];
                double d19 = d18 / dArr8[1];
                dArr7[1] = dArr7[1] - (dArr8[2] * d19);
                dArr7[0] = d17;
                dArr3[i14] = dArr3[i14] - (d19 * dArr3[i15]);
            }
            for (int i16 = size2 - 2; i16 >= 0; i16--) {
                double[] dArr9 = dArr2[i16];
                double d20 = dArr9[2];
                int i17 = i16 + 1;
                double[] dArr10 = dArr2[i17];
                double d21 = d20 / dArr10[1];
                dArr9[1] = dArr9[1] - (dArr10[0] * d21);
                dArr9[2] = d17;
                dArr3[i16] = dArr3[i16] - (d21 * dArr3[i17]);
            }
            dArr = new double[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                dArr[i18] = dArr3[i18] / dArr2[i18][1];
            }
        }
        int length = dArr.length;
        if (length < 1) {
            arrayList2 = null;
            f10 = 0.0f;
        } else {
            arrayList2 = new ArrayList(length + 1);
            int i19 = 0;
            while (i19 < length - 1) {
                PointF pointF5 = (PointF) arrayList.get(i19);
                int i20 = i19 + 1;
                PointF pointF6 = (PointF) arrayList.get(i20);
                int i21 = (int) pointF5.x;
                while (true) {
                    float f17 = pointF6.x;
                    if (i21 < ((int) f17)) {
                        float f18 = i21;
                        PointF pointF7 = pointF5;
                        double d22 = f17 - pointF5.x;
                        double d23 = (f18 - f11) / d22;
                        double d24 = d - d23;
                        int i22 = length;
                        double[] dArr11 = dArr;
                        float f19 = (float) (((((((d23 * d23) * d23) - d23) * dArr11[i20]) + ((((d24 * d24) * d24) - d24) * dArr11[i19])) * ((d22 * d22) / d10)) + (pointF6.y * d23) + (pointF7.y * d24));
                        if (f19 > f7) {
                            f19 = 255.0f;
                        } else if (f19 < 0.0f) {
                            f19 = 0.0f;
                        }
                        arrayList2.add(new PointF(f18, f19));
                        i21++;
                        dArr = dArr11;
                        pointF5 = pointF7;
                        length = i22;
                    }
                }
                i19 = i20;
            }
            f10 = 0.0f;
            arrayList2.add((PointF) hg.k0.g(1, arrayList));
        }
        float f20 = ((PointF) arrayList2.get(0)).x;
        if (f20 > f10) {
            for (int i23 = (int) f20; i23 >= 0; i23--) {
                arrayList2.add(0, new PointF(i23, 0.0f));
            }
        }
        float f21 = ((PointF) hg.k0.g(1, arrayList2)).x;
        if (f21 < f7) {
            for (int i24 = ((int) f21) + 1; i24 <= 255; i24++) {
                arrayList2.add(new PointF(i24, 255.0f));
            }
        }
        float[] fArr = new float[arrayList2.size()];
        int size3 = arrayList2.size();
        for (int i25 = 0; i25 < size3; i25++) {
            PointF pointF8 = (PointF) arrayList2.get(i25);
            float sqrt = (float) Math.sqrt(Math.pow(pointF8.x - pointF8.y, 2.0d));
            if (pointF8.x > pointF8.y) {
                sqrt = -sqrt;
            }
            fArr[i25] = sqrt;
        }
        return fArr;
    }

    @Override
    public void F() {
        ff0 ff0Var = ((gf0) this.f14388b).f26849a;
        if (ff0Var != null) {
            ((os0) ff0Var).f39271a.f33894e0.invalidate();
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f14388b;
        e0Var.l0(i10, i11, z10);
        e0Var.dismiss();
    }

    @Override
    public void S(boolean z10) {
        ((gf0) this.f14388b).f26851c.setAspectLock(z10);
    }

    @Override
    public void Y(float f7, boolean z10) {
        mg.h hVar = (mg.h) this.f14388b;
        float f10 = hVar.f16414b;
        float z11 = e2.z(hVar.f16415c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            r6 r6Var = hVar.f16416e;
            r6Var.getClass();
            r6Var.c(null, z11);
        }
        hVar.invalidate();
    }

    public n4.a a() {
        return new n4.a(((AudioAttributes.Builder) this.f14388b).build());
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f14387a) {
            case 16:
                r7.z zVar = (r7.z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, (g8.e) this.f14388b);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar2);
                k7.a.c(I0, (s6.a) this.f14388b);
                eVar.J0(I0, 1);
                return;
        }
    }

    public s0.d b(int i10) {
        return null;
    }

    public String c(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.f14388b;
            ka.e eVar = new ka.e(stringWriter, dVar.f14738a, dVar.f14739b, dVar.f14740c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.f14742b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public s0.d d(int i10) {
        return null;
    }

    @Override
    public int e(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    public void g(aa.a aVar) {
        h8.j jVar = (h8.j) this.f14388b;
        jVar.f11037a = aVar;
        Iterator it = jVar.f11039c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f11039c.clear();
        jVar.f11038b = null;
    }

    @Override
    public CharSequence getContentDescription() {
        mg.h hVar = (mg.h) this.f14388b;
        float f7 = hVar.f16414b;
        return String.valueOf(Math.round((hVar.f16413a.getProgress() * (hVar.f16415c - f7)) + f7));
    }

    public void h(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f14388b;
        if (pVar == eVar.f44167y && mVar != null) {
            p4.u uVar = eVar.f44166x.f44265a;
            String d = mVar.d();
            p4.v vVar = new p4.v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f44167y, 3, eVar.f44166x, collection);
                eVar.f44166x = null;
                eVar.f44167y = null;
            }
        } else if (pVar == eVar.f44149e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    public boolean i(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void j(c1 c1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        c1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f14388b;
        recyclerView.f3061b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.f3064c0;
        f1Var.getClass();
        int i13 = q0Var.f3454a;
        int i14 = q0Var.f3455b;
        View view = c1Var.f46523a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f3454a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f3455b;
        }
        int i16 = i11;
        if (!c1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = f1Var.r(c1Var, q0Var, i13, i14, i15, i16);
        } else {
            int i17 = c1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f46529i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public e k(int i10) {
        if (i10 == 16) {
            i10 = 12;
        }
        ((AudioAttributes.Builder) this.f14388b).setUsage(i10);
        return this;
    }

    @Override
    public int l() {
        return ((o0) this.f14388b).D();
    }

    public void m(int i10) {
        k(i10);
    }

    @Override
    public int n() {
        o0 o0Var = (o0) this.f14388b;
        return o0Var.f46636m - o0Var.E();
    }

    @Override
    public void n0(boolean z10) {
        gf0 gf0Var = (gf0) this.f14388b;
        gf0Var.getClass();
        ff0 ff0Var = gf0Var.f26849a;
        if (ff0Var != null) {
            ((os0) ff0Var).a(z10);
        }
    }

    public void o(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f14388b;
        o0 o0Var = recyclerView.f3090x;
        View view = c1Var.f46523a;
        of.e eVar = recyclerView.f3061b;
        la.h hVar = o0Var.f46626a;
        hh.h hVar2 = (hh.h) hVar.f15397b;
        int indexOfChild = hVar2.f11462a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) hVar.f15398c).A(indexOfChild)) {
                hVar.Y(view);
            }
            hVar2.a(indexOfChild);
        }
        eVar.g(view);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        tk0 tk0Var = (tk0) this.f14388b;
        if (z10 && tk0Var.f31080n.n() >= 0) {
            tk0Var.f31083w = true;
        }
        sg0 sg0Var = tk0Var.f31079f;
        lc0 lc0Var = tk0Var.f31084x;
        sg0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(lc0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(lc0Var, 16L);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public View p(int i10) {
        return ((o0) this.f14388b).q(i10);
    }

    @Override
    public int p0() {
        return 0;
    }

    public Object q() {
        if (n7.a.f16759b == null) {
            n7.a.f16759b = new Exception();
        }
        synchronized (n7.a.f16758a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override
    public int r(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void r0() {
        ff0 ff0Var = ((gf0) this.f14388b).f26849a;
        if (ff0Var != null) {
            PhotoViewer photoViewer = ((os0) ff0Var).f39271a;
            if (photoViewer.f33877c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override
    public void x0() {
        rc k10 = ((x3) this.f14388b).getBulletinFactory().k(false);
        k10.f30348t = true;
        k10.j();
    }

    public e(Object obj, int i10) {
        this.f14387a = i10;
        this.f14388b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public e(s6.g gVar, s6.a aVar) {
        this.f14387a = 21;
        this.f14388b = aVar;
    }

    public e(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f14387a = 15;
        this.f14388b = new GestureDetector(context, onGestureListener, null);
    }

    public e(int i10) {
        this.f14387a = i10;
        switch (i10) {
            case 18:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f14388b = new mh0(this);
                    return;
                } else {
                    this.f14388b = new mh0(this);
                    return;
                }
            case 25:
                this.f14388b = new CopyOnWriteArrayList();
                return;
            case 27:
                this.f14388b = new z0[zf.b.values().length];
                return;
            default:
                this.f14388b = new AudioAttributes.Builder();
                return;
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void V() {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void onError(d81 d81Var, Exception exc) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
