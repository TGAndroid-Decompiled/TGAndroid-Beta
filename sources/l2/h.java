package l2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import b2.q0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import e9.i0;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import k1.a0;
import m.e3;
import n4.r;
import n4.x;
import n4.y;
import og.e1;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.n81;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.t81;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.yi;
import r7.z;
import s4.c1;
import s4.f1;
import s4.h1;
import s4.o0;
import s4.p0;
import xh.x3;
public class h implements y2.o, no0, m.k, k1.f, c5, zg.g, q71, t81, s, h1, w2.a, hq0, y2.i {
    public final int f12720a;
    public Object f12721b;

    public h(Object obj, int i10) {
        this.f12720a = i10;
        this.f12721b = obj;
    }

    public boolean A(int i10, int i11, Bundle bundle) {
        return false;
    }

    public void B(c1 c1Var, q0 q0Var, q0 q0Var2) {
        int i10;
        int i11;
        boolean z10;
        c1 T;
        int i12;
        RecyclerView recyclerView = (RecyclerView) this.f12721b;
        recyclerView.f1532b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.f1535c0;
        f1Var.getClass();
        int i13 = q0Var.f1896a;
        int i14 = q0Var.f1897b;
        View view = c1Var.f41610a;
        if (q0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = q0Var2.f1896a;
        }
        int i15 = i10;
        if (q0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = q0Var2.f1897b;
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
            c1Var.f41615i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, q0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    public void D(c1 c1Var) {
        RecyclerView recyclerView = (RecyclerView) this.f12721b;
        o0 o0Var = recyclerView.f1560x;
        View view = c1Var.f41610a;
        of.e eVar = recyclerView.f1532b;
        e3 e3Var = o0Var.f41702a;
        gh.h hVar = (gh.h) e3Var.f13001b;
        int indexOfChild = hVar.f9143a.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((e6.n) e3Var.f13002c).C(indexOfChild)) {
                e3Var.X(view);
            }
            hVar.a(indexOfChild);
        }
        eVar.g(view);
    }

    public void E() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f12721b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long G = G();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + G);
    }

    public void F(long j3) {
        long G = G();
        if (G != j3) {
            if (G != -1) {
                if (G == -2) {
                    G = -2;
                } else {
                    return;
                }
            }
            StringBuilder t10 = a4.a.t(j3, "expected non-string scope or scope ", " but found ");
            t10.append(G);
            throw new IOException(t10.toString());
        }
    }

    public long G() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f12721b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void I(int i10, int i11, boolean z10) {
        g0 g0Var = (g0) this.f12721b;
        g0Var.l0(i10, i11, z10);
        g0Var.dismiss();
    }

    @Override
    public void W(float f7, boolean z10) {
        lg.h hVar = (lg.h) this.f12721b;
        float f10 = hVar.f12949b;
        float z11 = e2.z(hVar.f12950c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            q6 q6Var = hVar.e;
            q6Var.getClass();
            q6Var.b(null, z11);
        }
        hVar.invalidate();
    }

    @Override
    public void a() {
        i iVar = (i) this.f12721b;
        iVar.A.a();
        b5 b5Var = iVar.C;
        if (b5Var == null) {
            return;
        }
        throw b5Var;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f12720a) {
            case 14:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                Parcel I0 = aVar.I0();
                k7.a.c(I0, (n6.o) this.f12721b);
                try {
                    aVar.f311b.transact(1, I0, null, 1);
                    I0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    I0.recycle();
                    throw th2;
                }
            case 17:
                z zVar = (z) ((r7.k) obj).u();
                r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
                Parcel O0 = zVar.O0();
                r7.d.c(O0, (g8.e) this.f12721b);
                r7.d.d(O0, fVar);
                O0.writeString(null);
                zVar.S0(O0, 63);
                return;
            default:
                s6.f fVar2 = new s6.f(0, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                Parcel I02 = eVar.I0();
                k7.a.d(I02, fVar2);
                k7.a.c(I02, (s6.a) this.f12721b);
                eVar.J0(I02, 1);
                return;
        }
    }

    @Override
    public long b(long j3) {
        ArrayList arrayList = (ArrayList) this.f12721b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((z3.a) arrayList.get(0)).f47197b) {
            return ((z3.a) arrayList.get(0)).f47197b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            z3.a aVar = (z3.a) arrayList.get(i10);
            long j10 = aVar.f47197b;
            long j11 = aVar.f47197b;
            if (j3 < j10) {
                long j12 = ((z3.a) arrayList.get(i10 - 1)).d;
                if (j12 != -9223372036854775807L && j12 > j3 && j12 < j11) {
                    return j12;
                }
                return j11;
            }
        }
        long j13 = ((z3.a) e9.q.l(arrayList)).d;
        if (j13 == -9223372036854775807L || j3 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public i0 c(long j3) {
        int v = v(j3);
        if (v == 0) {
            e9.g0 g0Var = i0.f7384b;
            return a1.e;
        }
        z3.a aVar = (z3.a) ((ArrayList) this.f12721b).get(v - 1);
        long j10 = aVar.d;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            e9.g0 g0Var2 = i0.f7384b;
            return a1.e;
        }
        return aVar.f47196a;
    }

    @Override
    public void clear() {
        ((ArrayList) this.f12721b).clear();
    }

    @Override
    public void d(Canvas canvas) {
        switch (this.f12720a) {
            case 9:
                yi yiVar = (yi) this.f12721b;
                canvas.drawColor(yiVar.getThemedColor(j6.f17928d6));
                if (SharedConfig.chatBlurEnabled()) {
                    yiVar.C2.b(canvas, -3);
                    return;
                }
                return;
            default:
                sq0 sq0Var = (sq0) this.f12721b;
                canvas.drawColor(sq0Var.getThemedColor(j6.f17928d6));
                if (SharedConfig.chatBlurEnabled()) {
                    sq0Var.O0.b(canvas, -2);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean e(z3.a r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: l2.h.e(z3.a, long):boolean");
    }

    @Override
    public int f(View view) {
        return o0.x(view) - ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).leftMargin;
    }

    @Override
    public long g(long j3) {
        ArrayList arrayList = (ArrayList) this.f12721b;
        if (arrayList.isEmpty() || j3 < ((z3.a) arrayList.get(0)).f47197b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((z3.a) arrayList.get(i10)).f47197b;
            int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
            if (i11 == 0) {
                return j10;
            }
            if (i11 < 0) {
                z3.a aVar = (z3.a) arrayList.get(i10 - 1);
                long j11 = aVar.d;
                if (j11 != -9223372036854775807L && j11 <= j3) {
                    return j11;
                }
                return aVar.f47197b;
            }
        }
        z3.a aVar2 = (z3.a) e9.q.l(arrayList);
        long j12 = aVar2.d;
        if (j12 != -9223372036854775807L && j3 >= j12) {
            return j12;
        }
        return aVar2.f47197b;
    }

    @Override
    public CharSequence getContentDescription() {
        lg.h hVar = (lg.h) this.f12721b;
        float f7 = hVar.f12949b;
        return String.valueOf(Math.round((hVar.f12948a.getProgress() * (hVar.f12950c - f7)) + f7));
    }

    @Override
    public ce.b getData() {
        return ((a0) this.f12721b).f11997c;
    }

    @Override
    public Object h(rd.p pVar, kd.c cVar) {
        return ((a0) this.f12721b).h(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public void i(long j3) {
        ArrayList arrayList = (ArrayList) this.f12721b;
        int v = v(j3);
        if (v == 0) {
            return;
        }
        long j10 = ((z3.a) arrayList.get(v - 1)).d;
        if (j10 == -9223372036854775807L || j10 >= j3) {
            v--;
        }
        arrayList.subList(0, v).clear();
    }

    public boolean j(int i10) {
        n81 n81Var = ((v81) this.f12721b).L;
        if (n81Var == null) {
            return false;
        }
        return n81Var.c(i10);
    }

    @Override
    public k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        ((d) this.f12721b).f12708a.x(iOException);
        return y2.n.e;
    }

    @Override
    public int k0() {
        return 0;
    }

    @Override
    public int m() {
        return ((o0) this.f12721b).D();
    }

    public void n() {
        og.f1 f1Var = ((og.h1) this.f12721b).d;
        if (f1Var != null) {
            e1 e1Var = f1Var.f14360s;
            if (e1Var != null) {
                f1Var.cancelRunnable(e1Var);
                f1Var.f14360s = null;
            }
            e1 e1Var2 = new e1(f1Var, 1);
            f1Var.f14360s = e1Var2;
            f1Var.postRunnable(e1Var2, 1L);
        }
    }

    public s0.d o(int i10) {
        return null;
    }

    @Override
    public void onError(t71 t71Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        f60 f60Var;
        VideoEditedInfo videoEditedInfo;
        e60 e60Var = (e60) this.f12721b;
        t71 t71Var = e60Var.H0.O;
        if (t71Var != null && t71Var.y() && i10 == 4 && (videoEditedInfo = (f60Var = e60Var.H0).N) != null) {
            t71 t71Var2 = f60Var.O;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            t71Var2.K(j3);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void p(y2.k kVar, long j3, long j10) {
        boolean z10;
        d dVar = (d) this.f12721b;
        synchronized (z2.b.f47194b) {
            z10 = z2.b.f47195c;
        }
        if (!z10) {
            dVar.f12708a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public int q() {
        o0 o0Var = (o0) this.f12721b;
        return o0Var.f41711m - o0Var.E();
    }

    @Override
    public View r(int i10) {
        return ((o0) this.f12721b).q(i10);
    }

    @Override
    public int s(View view) {
        return o0.y(view) + ((ViewGroup.MarginLayoutParams) ((p0) view.getLayoutParams())).rightMargin;
    }

    @Override
    public void s0() {
        pc k10 = ((x3) this.f12721b).getBulletinFactory().k(false);
        k10.f26091t = true;
        k10.j();
    }

    public s0.d t(int i10) {
        return null;
    }

    @Override
    public void u(g.z zVar) {
        switch (this.f12720a) {
            case 9:
                zVar.a(((yi) this.f12721b).getThemedColor(j6.f17928d6));
                zVar.b(SharedConfig.chatBlurEnabled());
                return;
            default:
                zVar.a(((sq0) this.f12721b).getThemedColor(j6.f17928d6));
                zVar.b(SharedConfig.chatBlurEnabled());
                return;
        }
    }

    public int v(long j3) {
        ArrayList arrayList = (ArrayList) this.f12721b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j3 < ((z3.a) arrayList.get(i10)).f47197b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public StringBuilder w() {
        df.a aVar = (df.a) this.f12721b;
        if (aVar instanceof ye.m) {
            StringBuilder sb2 = ((ye.m) aVar).f46922b.f46908b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    public void x(aa.a aVar) {
        h8.j jVar = (h8.j) this.f12721b;
        jVar.f9264a = aVar;
        Iterator it = jVar.f9266c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f9266c.clear();
        jVar.f9265b = null;
    }

    public void z(float f7) {
        v81 v81Var = (v81) this.f12721b;
        if (f7 == 1.0f) {
            View[] viewArr = v81Var.e;
            View[] viewArr2 = v81Var.e;
            if (viewArr[1] != null) {
                v81Var.F();
                v81Var.h.put(v81Var.f27888f[1], viewArr2[1]);
                v81Var.removeView(viewArr2[1]);
                v81Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            v81Var.z(v81Var.f27886b);
            return;
        }
        View[] viewArr3 = v81Var.e;
        View[] viewArr4 = v81Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (v81Var.f27894y) {
            v81Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            v81Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            v81Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            v81Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        v81Var.w(false);
    }

    public h(s6.g gVar, s6.a aVar) {
        this.f12720a = 22;
        this.f12721b = aVar;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public h(int i10) {
        this.f12720a = i10;
        switch (i10) {
            case 19:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f12721b = new jh0(this);
                    return;
                } else {
                    this.f12721b = new jh0(this);
                    return;
                }
            case 24:
                return;
            case 25:
                this.f12721b = new ArrayList();
                return;
            default:
                this.f12721b = new ArrayDeque(16);
                return;
        }
    }

    public h(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f12720a = 16;
        this.f12721b = new GestureDetector(context, onGestureListener, null);
    }

    public h(EditText editText) {
        this.f12720a = 15;
        this.f12721b = new n7.a1(editText);
    }

    public h(Context context, y yVar) {
        this.f12720a = 4;
        x xVar = ((r) yVar.f13824b).f13807c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12721b = new n4.j(context, xVar);
        } else {
            this.f12721b = new n4.j(context, xVar);
        }
    }

    @Override
    public void T() {
    }

    @Override
    public void y() {
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
    public void C(y2.k kVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void l(y2.k kVar, long j3, long j10, int i10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
