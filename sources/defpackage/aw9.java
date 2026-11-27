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
import org.telegram.ui.ActionBar.e;
public final class aw9 extends FrameLayout implements fn7 {
    public int E;
    public int F;
    public final Activity G;
    public final e H;
    public boolean I;
    public xg4 J;
    public final qg4 K;
    public String L;
    public String M;
    public uv9 N;
    public final i69 O;
    public boolean P;
    public boolean Q;
    public final z2b a;
    public final gu b;
    public final ox0 c;
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

    public aw9(int i, e eVar) {
        super(eVar.getParentActivity());
        ox0 ox0Var = new ox0(this, (byte) 8);
        this.c = ox0Var;
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
        this.K = new qg4(0, 0L);
        this.H = eVar;
        this.G = eVar.getParentActivity();
        this.d = i;
        gu guVar = new gu((byte) 29, getContext(), this);
        this.b = guVar;
        new lu5(new s10(this, (byte) 6)).h(guVar);
        addView(guVar);
        eVar.getParentActivity();
        guVar.setLayoutManager(new as((byte) 15));
        guVar.setAdapter(ox0Var);
        guVar.setOnScrollListener(new e98(this, (byte) 14));
        zb3 zb3Var = new zb3();
        zb3Var.C = false;
        zb3Var.m = false;
        guVar.setItemAnimator(zb3Var);
        guVar.setOnItemClickListener(new vv9(this, i, (byte) 0));
        guVar.setOnItemLongClickListener(new ye9(this, (byte) 21));
        this.O = new i69(guVar, true);
        tk4 tk4Var = new tk4(getContext(), null);
        addView(tk4Var);
        tk4Var.setUseHeaderOffset(true);
        tk4Var.setViewType(3);
        tk4Var.setVisibility(8);
        z2b z2bVar = new z2b(getContext(), tk4Var, 1, null);
        this.a = z2bVar;
        addView(z2bVar);
        guVar.setEmptyView(z2bVar);
        xb4.G(i).y(arrayList);
    }

    public final void a() {
        gu guVar;
        r47 message;
        int i = this.d;
        if (!yac.h(i).p() && (guVar = this.b) != null) {
            for (int i2 = 0; i2 < guVar.getChildCount(); i2++) {
                try {
                    View childAt = guVar.getChildAt(i2);
                    if ((childAt instanceof xv9) && (message = ((xv9) childAt).a.getMessage()) != null) {
                        if (xb4.G(i).k(message.S0())) {
                            c(false);
                        } else if (xb4.G(i).k(message.S0())) {
                            c(true);
                        } else {
                            continue;
                        }
                        return;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void b(int i, int i2, boolean z) {
        setClipToPadding(false);
        this.Q = z;
        setPadding(0, i, 0, i2);
        gu guVar = this.b;
        if (z) {
            guVar.r1(0, i, 0, i2);
        } else {
            guVar.setPadding(0, i, 0, i2);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) guVar.getLayoutParams();
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
            if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= uc7.s1(this.d).k4.r2.f() * 1000) {
                ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
                if (!yac.h(this.d).p() && !uc7.s1(this.d).M3()) {
                    int i3 = this.d;
                    if (z) {
                        d = uc7.s1(i3).k4.x3.i;
                    } else {
                        d = uc7.s1(i3).k4.y3.i;
                    }
                    SpannableString spannableString = new SpannableString(Double.toString(Math.round(((float) d) * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                    spannableString.setSpan(new y7c(hl.o()), 0, spannableString.length(), 33);
                    if (!this.H.hasStoryViewer()) {
                        d31 b0 = d31.b0(this.H);
                        if (z) {
                            i = 2131743457;
                        } else {
                            i = 2131751313;
                        }
                        String M0 = ob6.M0(i, null);
                        if (z) {
                            i2 = 2131743456;
                        } else {
                            i2 = 2131751312;
                        }
                        v21 I = b0.I(2131624205, M0, hl.G2(hl.N2(ob6.M0(i2, null), -1, 2, new q38((byte) 10, this, z), null), spannableString, "%d"));
                        I.j = 8000;
                        I.k(false);
                    }
                }
            }
        }
    }

    public final void d(boolean z) {
        long j;
        ox0 ox0Var = this.c;
        ox0Var.l(0, ((aw9) ox0Var.d).r);
        if (!TextUtils.isEmpty(this.L)) {
            int i = this.d;
            if (!lq3.q(i).H.isEmpty() || !lq3.q(i).I.isEmpty()) {
                this.a.setStickerType(1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                xb4.G(this.d).y(arrayList);
                xb4.G(this.d).P(arrayList2);
                String lowerCase = this.L.toLowerCase();
                boolean equals = lowerCase.equals(this.M);
                this.M = lowerCase;
                Utilities.g.a(this.N);
                to3 to3Var = Utilities.g;
                uv9 uv9Var = new uv9(this, arrayList, lowerCase, arrayList2);
                this.N = uv9Var;
                if (equals) {
                    j = 0;
                } else {
                    j = 300;
                }
                to3Var.d(uv9Var, j);
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
        xb4.G(this.d).y(this.h);
        xb4.G(this.d).P(this.n);
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((r47) this.e.get(i2)).J5(null, true);
        }
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            ((r47) this.f.get(i3)).J5(null, true);
        }
        this.M = null;
        e(this.h, this.n, z);
        if (this.r == 0) {
            this.a.e(false, false);
            this.a.d.setText(ob6.M0(2131745536, null));
            this.a.e.setVisibility(8);
        }
        this.a.setStickerType(9);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.e5) {
            if (getVisibility() == 0) {
                lq3.q(this.d).J.clear();
            }
            d(true);
        } else if (i == jn7.v3) {
            a();
        }
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        f89 U;
        ox0 ox0Var = this.c;
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
            cy7.a(new wv9(this, i7, i, i4, i2, i3, arrayList3, i5, i6, arrayList4), true).c(ox0Var);
            int i8 = 0;
            while (true) {
                gu guVar = this.b;
                if (i8 < guVar.getChildCount()) {
                    View childAt = guVar.getChildAt(i8);
                    int S = RecyclerView.S(childAt);
                    if (S >= 0 && (U = guVar.U(childAt)) != null && !U.r()) {
                        if (childAt instanceof p55) {
                            ox0Var.t(U, S);
                        } else if (childAt instanceof xv9) {
                            zea zeaVar = ((xv9) childAt).a;
                            zeaVar.f(true);
                            int e1 = zeaVar.getMessage().e1();
                            long B0 = r47.B0(zeaVar.getMessage().k);
                            qg4 qg4Var = this.K;
                            qg4Var.a = B0;
                            qg4Var.b = e1;
                            zeaVar.b(this.J.d(qg4Var), true);
                        }
                    }
                    i8++;
                } else {
                    return;
                }
            }
        } else {
            f(arrayList, arrayList2);
            ox0Var.f();
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
            r47 r47Var = (r47) obj;
            if (!r47Var.g4() && !r47.Q4(r47Var.k)) {
                arrayList3.add(r47Var);
            }
        }
        ArrayList arrayList4 = this.f;
        arrayList4.clear();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            r47 r47Var2 = (r47) obj2;
            if (!r47Var2.g4() && !r47.Q4(r47Var2.k)) {
                arrayList4.add(r47Var2);
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
                } else if (xb4.G(this.d).S(((r47) arrayList3.get(i)).S0())) {
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
        jn7.f(this.d).b(this, jn7.e5);
        jn7.f(this.d).b(this, jn7.v3);
        if (getVisibility() == 0) {
            lq3.q(this.d).J.clear();
        }
        if (!this.P) {
            this.P = true;
            Utilities.g.c(new v59(this, (byte) 26));
        }
        d(false);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.d;
        jn7.f(i).n(this, jn7.e5);
        jn7.f(i).n(this, jn7.v3);
    }

    @Override
    public final void requestLayout() {
        if (this.Q) {
            return;
        }
        super.requestLayout();
    }

    public void setUiCallback(xg4 xg4Var) {
        this.J = xg4Var;
    }
}
