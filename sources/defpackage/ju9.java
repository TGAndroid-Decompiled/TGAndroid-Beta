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
public final class ju9 extends FrameLayout implements jm7 {
    public int E;
    public int F;
    public final Activity G;
    public final d H;
    public boolean I;
    public bh4 J;
    public final ug4 K;
    public String L;
    public String M;
    public du9 N;
    public final w49 O;
    public boolean P;
    public boolean Q;
    public final a1b a;
    public final fv b;
    public final ny0 c;
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

    public ju9(int i, d dVar) {
        super(dVar.getParentActivity());
        ny0 ny0Var = new ny0(this, (byte) 8);
        this.c = ny0Var;
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
        this.K = new ug4(0, 0L);
        this.H = dVar;
        this.G = dVar.getParentActivity();
        this.d = i;
        fv fvVar = new fv((byte) 29, getContext(), this);
        this.b = fvVar;
        new hu5(new r20(this, (byte) 6)).h(fvVar);
        addView(fvVar);
        dVar.getParentActivity();
        fvVar.setLayoutManager(new zs((byte) 15));
        fvVar.setAdapter(ny0Var);
        fvVar.setOnScrollListener(new so7(this, (byte) 15));
        sc3 sc3Var = new sc3();
        sc3Var.C = false;
        sc3Var.m = false;
        fvVar.setItemAnimator(sc3Var);
        fvVar.setOnItemClickListener(new eu9(this, i, (byte) 0));
        fvVar.setOnItemLongClickListener(new yf9(this, (byte) 12));
        this.O = new w49(fvVar, true);
        tk4 tk4Var = new tk4(getContext(), null);
        addView(tk4Var);
        tk4Var.setUseHeaderOffset(true);
        tk4Var.setViewType(3);
        tk4Var.setVisibility(8);
        a1b a1bVar = new a1b(getContext(), tk4Var, 1, null);
        this.a = a1bVar;
        addView(a1bVar);
        fvVar.setEmptyView(a1bVar);
        bc4.G(i).y(arrayList);
    }

    public final void a() {
        fv fvVar;
        k47 message;
        int i = this.d;
        if (!z8c.h(i).p() && (fvVar = this.b) != null) {
            for (int i2 = 0; i2 < fvVar.getChildCount(); i2++) {
                try {
                    View childAt = fvVar.getChildAt(i2);
                    if ((childAt instanceof gu9) && (message = ((gu9) childAt).a.getMessage()) != null) {
                        if (bc4.G(i).k(message.S0())) {
                            c(false);
                        } else if (bc4.G(i).k(message.S0())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void b(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.Q = z;
        setPadding(0, i, 0, i2);
        fv fvVar = this.b;
        if (z) {
            fvVar.q1(0, i, 0, i2);
        } else {
            fvVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fvVar.getLayoutParams();
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
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= oc7.r1(this.d).l4.j2.f() * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!z8c.h(this.d).p() && !oc7.r1(this.d).H3()) {
                    int i3 = this.d;
                    if (z) {
                        d = oc7.r1(i3).l4.p3.i;
                    } else {
                        d = oc7.r1(i3).l4.q3.i;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(((float) d) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new z5c(gm.o()), 0, spannableString.length(), 33);
                    if (!this.H.hasStoryViewer()) {
                        c41 b0 = c41.b0(this.H);
                        if (z) {
                            i = 2131743489;
                        } else {
                            i = 2131751285;
                        }
                        String M0 = jb6.M0(i, null);
                        if (z) {
                            i2 = 2131743488;
                        } else {
                            i2 = 2131751284;
                        }
                        u31 I = b0.I(2131624205, M0, gm.G2(gm.N2(jb6.M0(i2, null), -1, 2, new n28((byte) 10, this, z), null), spannableString, "%d"));
                        I.j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z) {
        long j;
        ny0 ny0Var = this.c;
        ny0Var.l(0, ((ju9) ny0Var.d).r);
        if (!TextUtils.isEmpty(this.L)) {
            int i = this.d;
            if (!er3.q(i).H.isEmpty() || !er3.q(i).I.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                bc4.G(this.d).y(arrayList);
                bc4.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.g.a(this.N);
                mp3 mp3Var = Utilities.g;
                du9 du9Var = new du9(this, arrayList, lowerCase, arrayList2);
                this.N = du9Var;
                if (equals) {
                    j = 0;
                } else {
                    j = 300;
                }
                mp3Var.d(du9Var, j);
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
        bc4.G(this.d).y(this.h);
        bc4.G(this.d).P(this.n);
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((k47) this.e.get(i2)).J5(null, true);
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            ((k47) this.f.get(i3)).J5(null, true);
        }
        this.M = null;
        e(this.h, this.n, z);
        if (this.r == 0) {
            this.a.e(false, false);
            this.a.d.setText(jb6.M0(2131745542, null));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.f5) {
            if (getVisibility() == 0) {
                er3.q(this.d).J.clear();
            }
            d(true);
        } else if (i == nm7.v3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        u69 T;
        ny0 ny0Var = this.c;
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
            ww7.a(new fu9(this, i7, i, i4, i2, i3, arrayList3, i5, i6, arrayList4), true).c(ny0Var);
            int i8 = 0;
            while (true) {
                fv fvVar = this.b;
                if (i8 < fvVar.getChildCount()) {
                    View childAt = fvVar.getChildAt(i8);
                    int R = RecyclerView.R(childAt);
                    if (R >= 0 && (T = fvVar.T(childAt)) != null && !T.r()) {
                        if (childAt instanceof l55) {
                            ny0Var.t(T, R);
                        } else if (childAt instanceof gu9) {
                            ida idaVar = ((gu9) childAt).a;
                            idaVar.f(true);
                            int e1 = idaVar.getMessage().e1();
                            long B0 = k47.B0(idaVar.getMessage().k);
                            ug4 ug4Var = this.K;
                            ug4Var.a = B0;
                            ug4Var.b = e1;
                            idaVar.b(this.J.e(ug4Var), true);
                        }
                    }
                    i8++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            ny0Var.f();
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
            k47 k47Var = (k47) obj;
            if (!k47Var.g4() && !k47.Q4(k47Var.k)) {
                arrayList3.add(k47Var);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            k47 k47Var2 = (k47) obj2;
            if (!k47Var2.g4() && !k47.Q4(k47Var2.k)) {
                arrayList4.add(k47Var2);
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
                } else if (bc4.G(this.d).S(((k47) arrayList3.get(i)).S0())) {
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
        nm7.f(this.d).b(this, nm7.f5);
        nm7.f(this.d).b(this, nm7.v3);
        if (getVisibility() == 0) {
            er3.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.g.c(new kf9(this, (byte) 18));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.d;
        nm7.f(i).n(this, nm7.f5);
        nm7.f(i).n(this, nm7.v3);
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(bh4 bh4Var) {
        this.J = bh4Var;
    }
}
