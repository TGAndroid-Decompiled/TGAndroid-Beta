package b5;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import d5.g0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class h extends x {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final SparseArray N;
    public final SparseBooleanArray O;

    public h(Context context) {
        CaptioningManager captioningManager;
        int i10 = g0.f4795a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f2011t = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f2010s = p8.z.y(i10 >= 21 ? locale.toLanguageTag() : locale.toString());
            }
        }
        Point pointP = g0.p(context);
        b(pointP.x, pointP.y);
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }

    @Override
    public final x b(int i10, int i11) {
        super.b(i10, i11);
        return this;
    }

    public final void c() {
        this.f2015y.clear();
    }

    public final void d() {
        this.A = true;
        this.B = false;
        this.C = true;
        this.D = false;
        this.E = true;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = false;
        this.J = true;
        this.K = true;
        this.L = false;
        this.M = true;
    }

    public h(i iVar) {
        a(iVar);
        this.A = iVar.M;
        this.B = iVar.N;
        this.C = iVar.O;
        this.D = iVar.P;
        this.E = iVar.Q;
        this.F = iVar.R;
        this.G = iVar.S;
        this.H = iVar.T;
        this.I = iVar.U;
        this.J = iVar.V;
        this.K = iVar.W;
        this.L = iVar.X;
        this.M = iVar.Y;
        SparseArray sparseArray = iVar.Z;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.N = sparseArray2;
        this.O = iVar.f1951a0.clone();
    }

    public h() {
        this.N = new SparseArray();
        this.O = new SparseBooleanArray();
        d();
    }
}
