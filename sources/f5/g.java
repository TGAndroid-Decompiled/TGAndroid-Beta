package f5;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import h5.d0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
public final class g extends v {
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
    public boolean N;
    public final SparseArray O;
    public final SparseBooleanArray P;

    public g(Context context) {
        CaptioningManager captioningManager;
        String locale;
        int i10 = d0.f6924a;
        if (i10 >= 19 && ((i10 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled())) {
            this.f5973t = 1088;
            Locale locale2 = captioningManager.getLocale();
            if (locale2 != null) {
                if (i10 >= 21) {
                    locale = locale2.toLanguageTag();
                } else {
                    locale = locale2.toString();
                }
                this.f5972s = s8.v.x(locale);
            }
        }
        Point q10 = d0.q(context);
        b(q10.x, q10.y);
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        d();
    }

    @Override
    public final v b(int i10, int i11) {
        super.b(i10, i11);
        return this;
    }

    public final void c() {
        this.f5977y.clear();
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
        this.N = false;
    }

    public g(h hVar) {
        a(hVar);
        this.A = hVar.N;
        this.B = hVar.O;
        this.C = hVar.P;
        this.D = hVar.Q;
        this.E = hVar.R;
        this.F = hVar.S;
        this.G = hVar.T;
        this.H = hVar.U;
        this.I = hVar.V;
        this.J = hVar.W;
        this.K = hVar.X;
        this.L = hVar.Y;
        this.M = hVar.Z;
        this.N = hVar.f5916a0;
        SparseArray sparseArray = hVar.f5917b0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.O = sparseArray2;
        this.P = hVar.f5918c0.clone();
    }

    public g() {
        this.O = new SparseArray();
        this.P = new SparseBooleanArray();
        d();
    }
}
