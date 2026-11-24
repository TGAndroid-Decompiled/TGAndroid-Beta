package defpackage;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
public final class hs9 extends FrameLayout implements gk7 {
    public int E;
    public int F;
    public final Activity G;
    public final d H;
    public boolean I;
    public ze4 J;
    public final se4 K;
    public String L;
    public String M;
    public bs9 N;
    public final t29 O;
    public boolean P;
    public boolean Q;
    public final zya a;
    public final fu b;
    public final gx0 c;
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList h;
    public final ArrayList n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public hs9(int i, d dVar) {
        super(dVar.getParentActivity());
        gx0 gx0Var = new gx0(this, (byte) 8);
        this.c = gx0Var;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.K = new se4(0, 0L);
        this.H = dVar;
        this.G = dVar.getParentActivity();
        this.d = i;
        fu fuVar = new fu((byte) 29, getContext(), this);
        this.b = fuVar;
        new is5(new r10(this, (byte) 6)).h(fuVar);
        addView(fuVar);
        dVar.getParentActivity();
        fuVar.setLayoutManager(new zr((byte) 15));
        fuVar.setAdapter(gx0Var);
        fuVar.setOnScrollListener(new n58(this, (byte) 14));
        gb3 gb3Var = new gb3();
        gb3Var.C = false;
        gb3Var.m = false;
        fuVar.setItemAnimator(gb3Var);
        fuVar.setOnItemClickListener(new cs9(this, i, (byte) 0));
        fuVar.setOnItemLongClickListener(new wh9(this, (byte) 8));
        this.O = new t29(fuVar, true);
        pi4 pi4Var = new pi4(getContext(), null);
        addView(pi4Var);
        pi4Var.setUseHeaderOffset(true);
        pi4Var.setViewType(3);
        pi4Var.setVisibility(8);
        zya zyaVar = new zya(getContext(), pi4Var, 1, null);
        this.a = zyaVar;
        addView(zyaVar);
        fuVar.setEmptyView(zyaVar);
        ba4.G(i).y(arrayList);
    }

    public final void a() {
        fu fuVar;
        k27 message;
        int i = this.d;
        if (!y6c.h(i).p() && (fuVar = this.b) != null) {
            for (int i2 = 0; i2 < fuVar.getChildCount(); i2++) {
                try {
                    View childAt = fuVar.getChildAt(i2);
                    if ((childAt instanceof es9) && (message = ((es9) childAt).a.getMessage()) != null) {
                        if (ba4.G(i).k(message.S0())) {
                            c(false);
                        } else if (ba4.G(i).k(message.S0())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    public final void b(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.Q = z;
        setPadding(0, i, 0, i2);
        fu fuVar = this.b;
        if (z) {
            fuVar.q1(0, i, 0, i2);
        } else {
            fuVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fuVar.getLayoutParams();
        marginLayoutParams.topMargin = -i;
        marginLayoutParams.bottomMargin = -i2;
        this.Q = false;
    }

    public final void c(boolean z) {
        double d;
        int i;
        int i2;
        if (this.H != null && this.b.H) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= na7.q1(this.d).k4.j2.f() * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!y6c.h(this.d).p() && !na7.q1(this.d).F3()) {
                    int i3 = this.d;
                    if (z) {
                        d = na7.q1(i3).k4.p3.i;
                    } else {
                        d = na7.q1(i3).k4.q3.i;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(((float) d) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
                    if (!this.H.hasStoryViewer()) {
                        u21 b0 = u21.b0(this.H);
                        if (z) {
                            i = 2131743563;
                        } else {
                            i = 2131751336;
                        }
                        String M0 = k96.M0(i, null);
                        if (z) {
                            i2 = 2131743562;
                        } else {
                            i2 = 2131751335;
                        }
                        m21 I = b0.I(2131624205, M0, gl.G2(gl.N2(k96.M0(i2, null), -1, 2, new k08((byte) 10, this, z), null), spannableString, "%d"));
                        I.j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z) {
        long j;
        gx0 gx0Var = this.c;
        gx0Var.l(0, ((hs9) gx0Var.d).r);
        if (!TextUtils.isEmpty(this.L)) {
            int i = this.d;
            if (!up3.q(i).H.isEmpty() || !up3.q(i).I.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ba4.G(this.d).y(arrayList);
                ba4.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.g.a(this.N);
                co3 co3Var = Utilities.g;
                bs9 bs9Var = new bs9(this, arrayList, lowerCase, arrayList2);
                this.N = bs9Var;
                if (equals) {
                    j = 0;
                } else {
                    j = 300;
                }
                co3Var.d(bs9Var, j);
                this.n.clear();
                this.h.clear();
                if (!equals) {
                    this.a.e(true, true);
                    e(this.h, this.n, z);
                    return;
                }
                return;
            }
        }
        if (this.r == 0) {
            this.O.b(0);
        }
        if (this.P) {
            this.h.clear();
            this.n.clear();
        }
        ba4.G(this.d).y(this.h);
        ba4.G(this.d).P(this.n);
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((k27) this.e.get(i2)).J5(null, true);
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            ((k27) this.f.get(i3)).J5(null, true);
        }
        this.M = null;
        e(this.h, this.n, z);
        if (this.r == 0) {
            this.a.e(false, false);
            this.a.d.setText(k96.M0(2131745616, null));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.d5) {
            if (getVisibility() == 0) {
                up3.q(this.d).J.clear();
            }
            d(true);
        } else if (i == kk7.u3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        s49 T;
        gx0 gx0Var = this.c;
        if (z) {
            int i = this.s;
            int i2 = this.w;
            int i3 = this.x;
            int i4 = this.y;
            int i5 = this.E;
            int i6 = this.F;
            int i7 = this.r;
            ArrayList arrayList3 = new ArrayList(this.e);
            ArrayList arrayList4 = new ArrayList(this.f);
            f(arrayList, arrayList2);
            vu7.a(new ds9(this, i7, i, i4, i2, i3, arrayList3, i5, i6, arrayList4), true).c(gx0Var);
            int i8 = 0;
            while (true) {
                fu fuVar = this.b;
                if (i8 < fuVar.getChildCount()) {
                    View childAt = fuVar.getChildAt(i8);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = fuVar.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof l35) {
                            gx0Var.t(T, R);
                        } else if (childAt instanceof es9) {
                            iba ibaVar = ((es9) childAt).a;
                            ibaVar.f(true);
                            int e1 = ibaVar.getMessage().e1();
                            long B0 = k27.B0(ibaVar.getMessage().k);
                            se4 se4Var = this.K;
                            se4Var.a = B0;
                            se4Var.b = e1;
                            ibaVar.b(this.J.b(se4Var), true);
                        }
                    }
                    i8++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            gx0Var.f();
        }
    }

    public final void f(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            k27 k27Var = (k27) obj;
            if (!k27Var.g4() && !k27.Q4(k27Var.k)) {
                arrayList3.add(k27Var);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            k27 k27Var2 = (k27) obj2;
            if (!k27Var2.g4() && !k27.Q4(k27Var2.k)) {
                arrayList4.add(k27Var2);
            }
        }
        this.r = 0;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.I = false;
        if (!arrayList3.isEmpty()) {
            int i4 = this.r;
            int i5 = i4 + 1;
            this.r = i5;
            this.s = i4;
            this.w = i5;
            int size3 = arrayList3.size() + i5;
            this.r = size3;
            this.x = size3;
            while (true) {
                if (i >= arrayList3.size()) {
                    break;
                } else if (ba4.G(this.d).S(((k27) arrayList3.get(i)).S0())) {
                    this.I = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            int i6 = this.r;
            int i7 = i6 + 1;
            this.r = i7;
            this.y = i6;
            this.E = i7;
            int size4 = arrayList4.size() + i7;
            this.r = size4;
            this.F = size4;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.d).b(this, kk7.d5);
        kk7.f(this.d).b(this, kk7.u3);
        if (getVisibility() == 0) {
            up3.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.g.c(new zk9(this, (byte) 10));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.d;
        kk7.f(i).n(this, kk7.d5);
        kk7.f(i).n(this, kk7.u3);
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(ze4 ze4Var) {
        this.J = ze4Var;
    }
}
