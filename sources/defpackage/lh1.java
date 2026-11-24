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
public final class lh1 extends FrameLayout implements tjb {
    public final int a;
    public final wjb b;
    public final ArrayList c;
    public final rkb d;
    public final pi4 e;
    public boolean f;
    public final jh1 h;
    public boolean n;
    public p8c r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public lh1(int i, wjb wjbVar, Activity activity) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i;
        this.b = wjbVar;
        pi4 pi4Var = new pi4(getContext(), wjbVar);
        this.e = pi4Var;
        pi4Var.setViewType(14);
        pi4Var.setVisibility(0);
        addView(pi4Var, nme.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        rkb rkbVar = new rkb(activity, wjbVar, (byte) 2);
        this.d = rkbVar;
        rkbVar.setClipToPadding(false);
        rkbVar.setPadding(gl.L(16.0f), gl.L(13.0f), gl.L(16.0f), gl.L(6.0f));
        getContext();
        t26 t26Var = new t26();
        t26Var.i1(0);
        rkbVar.setLayoutManager(t26Var);
        rkbVar.setAlpha(0.0f);
        jh1 jh1Var = new jh1(this, i, wjbVar);
        this.h = jh1Var;
        rkbVar.setAdapter(jh1Var);
        addView(rkbVar, nme.c(130.0f, -1));
        rkbVar.setOnItemClickListener(new u(this, (byte) 8));
        je2 e = je2.e(i);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        e.o(new kh1(this, i), true);
        if (!this.n) {
            gl.U3(pi4Var, true, 1.0f, true, false);
        } else {
            gl.U3(pi4Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i = -1;
        int i2 = 0;
        while (true) {
            arrayList = this.c;
            boolean z2 = true;
            if (i2 >= arrayList.size()) {
                break;
            }
            wd2 wd2Var = (wd2) arrayList.get(i2);
            if (!TextUtils.equals(this.s, wd2Var.a()) && (!TextUtils.isEmpty(str) || !wd2Var.a.a)) {
                z2 = false;
            }
            wd2Var.d = z2;
            if (z2) {
                i = i2;
            }
            i2++;
        }
        rkb rkbVar = this.d;
        if (i >= 0 && !z && (rkbVar.getLayoutManager() instanceof t26)) {
            ((t26) rkbVar.getLayoutManager()).g1(i, (gl.q.x - gl.L(83.0f)) / 2);
        }
        for (int i3 = 0; i3 < rkbVar.getChildCount(); i3++) {
            View childAt = rkbVar.getChildAt(i3);
            if ((childAt instanceof anb) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((anb) childAt).g(((wd2) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.w = wallPaper;
        gl.d0(this.d, new hh1(this, (byte) 1));
        if (this.w != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((wd2) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new wd2(jy3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(p8c p8cVar) {
        this.r = p8cVar;
    }

    public void setWithRemovedStub(boolean z) {
        this.f = z;
    }

    @Override
    public final void updateColors() {
        ?? r0;
        jh1 jh1Var;
        wjb wjbVar = this.b;
        if (wjbVar != null) {
            r0 = wjbVar.a();
        } else {
            r0 = bkb.I.o();
        }
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                break;
            }
            wd2 wd2Var = (wd2) arrayList.get(i);
            if (wd2Var.c != r0) {
                wd2Var.c = r0;
                z = true;
            }
            i++;
        }
        rkb rkbVar = this.d;
        if (rkbVar != null) {
            gl.d0(rkbVar, new hh1(this, (byte) 0));
            if (z && (jh1Var = this.h) != null) {
                jh1Var.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
