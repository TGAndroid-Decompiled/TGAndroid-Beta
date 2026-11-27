package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class uh1 extends FrameLayout implements snb {
    public final int a;
    public final vnb b;
    public final ArrayList c;
    public final qob d;
    public final tk4 e;
    public boolean f;
    public final sh1 h;
    public boolean n;
    public pcc r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public uh1(int i, vnb vnbVar, Activity activity) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i;
        this.b = vnbVar;
        tk4 tk4Var = new tk4(getContext(), vnbVar);
        this.e = tk4Var;
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        addView(tk4Var, tre.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        qob qobVar = new qob(activity, vnbVar, (byte) 2);
        this.d = qobVar;
        qobVar.setClipToPadding(false);
        qobVar.setPadding(hl.L(16.0f), hl.L(13.0f), hl.L(16.0f), hl.L(6.0f));
        getContext();
        x46 x46Var = new x46();
        x46Var.i1(0);
        qobVar.setLayoutManager(x46Var);
        qobVar.setAlpha(0.0f);
        sh1 sh1Var = new sh1(this, i, vnbVar);
        this.h = sh1Var;
        qobVar.setAdapter(sh1Var);
        addView(qobVar, tre.c(130.0f, -1));
        qobVar.setOnItemClickListener(new u(this, (byte) 8));
        af2 e = af2.e(i);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        e.o(new th1(this, i), true);
        if (!this.n) {
            hl.T3(tk4Var, true, 1.0f, true, false);
        } else {
            hl.T3(tk4Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z) {
        ArrayList arrayList;
        int S;
        this.s = str;
        int i = -1;
        int i2 = 0;
        while (true) {
            arrayList = this.c;
            boolean z2 = true;
            if (i2 >= arrayList.size()) {
                break;
            }
            ne2 ne2Var = (ne2) arrayList.get(i2);
            if (!TextUtils.equals(this.s, ne2Var.a()) && (!TextUtils.isEmpty(str) || !ne2Var.a.a)) {
                z2 = false;
            }
            ne2Var.d = z2;
            if (z2) {
                i = i2;
            }
            i2++;
        }
        qob qobVar = this.d;
        if (i >= 0 && !z && (qobVar.getLayoutManager() instanceof x46)) {
            ((x46) qobVar.getLayoutManager()).g1(i, (hl.q.x - hl.L(83.0f)) / 2);
        }
        for (int i3 = 0; i3 < qobVar.getChildCount(); i3++) {
            View childAt = qobVar.getChildAt(i3);
            if ((childAt instanceof zqb) && (S = RecyclerView.S(childAt)) >= 0 && S < arrayList.size()) {
                ((zqb) childAt).g(((ne2) arrayList.get(S)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.w = wallPaper;
        hl.d0(this.d, new qh1(this, (byte) 1));
        if (this.w != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((ne2) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new ne2(ez3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(pcc pccVar) {
        this.r = pccVar;
    }

    public void setWithRemovedStub(boolean z) {
        this.f = z;
    }

    @Override
    public final void updateColors() {
        ?? r0;
        sh1 sh1Var;
        vnb vnbVar = this.b;
        if (vnbVar != null) {
            r0 = vnbVar.a();
        } else {
            r0 = aob.I.o();
        }
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                break;
            }
            ne2 ne2Var = (ne2) arrayList.get(i);
            if (ne2Var.c != r0) {
                ne2Var.c = r0;
                z = true;
            }
            i++;
        }
        qob qobVar = this.d;
        if (qobVar != null) {
            hl.d0(qobVar, new qh1(this, (byte) 0));
            if (z && (sh1Var = this.h) != null) {
                sh1Var.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
