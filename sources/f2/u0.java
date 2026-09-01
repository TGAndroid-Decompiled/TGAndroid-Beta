package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.vk0;
public abstract class u0 {
    public y5.h f5928a;
    public ArrayList f5929b;
    public long f5930c;
    public long d;
    public long f5931e;
    public long f5932f;
    public long f5933g;
    public TimeInterpolator h;
    public TimeInterpolator f5934i;
    public TimeInterpolator f5935j;
    public TimeInterpolator f5936k;
    public long f5937l;

    public static int b(m1 m1Var) {
        int i10 = m1Var.f5884l;
        int i11 = i10 & 14;
        if (m1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = m1Var.d;
            int b10 = m1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(m1 m1Var, c5.e eVar, c5.e eVar2);

    public abstract boolean c(m1 m1Var, List list);

    public final void d(m1 m1Var) {
        y5.h hVar = this.f5928a;
        if (hVar != null) {
            RecyclerView recyclerView = (RecyclerView) hVar.f50777b;
            boolean z4 = true;
            m1Var.q(true);
            View view = m1Var.f5875a;
            if (m1Var.f5882j != null && m1Var.f5883k == null) {
                m1Var.f5882j = null;
            }
            m1Var.f5883k = null;
            if ((m1Var.f5884l & 16) == 0) {
                bf.f fVar = recyclerView.f1320b;
                recyclerView.y0();
                androidx.biometric.e eVar = recyclerView.f1325e;
                c cVar = (c) eVar.f528c;
                ja.c cVar2 = (ja.c) eVar.f527b;
                int indexOfChild = ((RecyclerView) cVar2.f9988a).indexOfChild(view);
                if (indexOfChild == -1) {
                    eVar.C(view);
                } else if (cVar.D(indexOfChild)) {
                    cVar.G(indexOfChild);
                    eVar.C(view);
                    cVar2.D(indexOfChild);
                } else {
                    z4 = false;
                }
                if (z4) {
                    m1 U = RecyclerView.U(view);
                    fVar.k(U);
                    fVar.h(U);
                }
                recyclerView.z0(!z4);
                if (!z4 && m1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f5929b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            vk0 vk0Var = (vk0) arrayList.get(i10);
            vk0Var.f31920a.c(vk0Var.f31921b, vk0Var.f31922c, vk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(m1 m1Var);

    public abstract void g();

    public long h() {
        return this.f5930c;
    }

    public long i() {
        return Math.max(this.f5932f, this.f5933g);
    }

    public long j() {
        return this.f5931e;
    }

    public abstract boolean k();

    public c5.e l(j1 j1Var, m1 m1Var, int i10, List list) {
        ?? obj = new Object();
        View view = m1Var.f5875a;
        obj.f2268a = view.getLeft();
        obj.f2269b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f5930c = j10;
        this.f5931e = j10;
        this.d = j10;
        this.f5932f = j10;
        this.f5933g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f5934i = timeInterpolator;
        this.f5935j = timeInterpolator;
        this.f5936k = timeInterpolator;
    }
}
