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
public final class ti1 extends FrameLayout implements vlb {
    public final int a;
    public final ylb b;
    public final ArrayList c;
    public final smb d;
    public final tk4 e;
    public boolean f;
    public final ri1 h;
    public boolean n;
    public qac r;
    public String s;
    public TLRPC.WallPaper w;
    public final HashMap x;
    public final HashMap y;

    public ti1(int i, ylb ylbVar, Activity activity) {
        super(activity);
        this.c = new ArrayList();
        this.x = new HashMap();
        this.y = new HashMap();
        this.a = i;
        this.b = ylbVar;
        tk4 tk4Var = new tk4(getContext(), ylbVar);
        this.e = tk4Var;
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        addView(tk4Var, qoe.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        smb smbVar = new smb(activity, ylbVar, (byte) 2);
        this.d = smbVar;
        smbVar.setClipToPadding(false);
        smbVar.setPadding(gm.L(16.0f), gm.L(13.0f), gm.L(16.0f), gm.L(6.0f));
        getContext();
        u46 u46Var = new u46();
        u46Var.i1(0);
        smbVar.setLayoutManager(u46Var);
        smbVar.setAlpha(0.0f);
        ri1 ri1Var = new ri1(this, i, ylbVar);
        this.h = ri1Var;
        smbVar.setAdapter(ri1Var);
        addView(smbVar, qoe.c(130.0f, -1));
        smbVar.setOnItemClickListener(new u(this, (byte) 9));
        uf2 e = uf2.e(i);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        e.o(new si1(this, i), true);
        if (!this.n) {
            gm.T3(tk4Var, true, 1.0f, true, false);
        } else {
            gm.T3(tk4Var, false, 1.0f, true, false);
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
            hf2 hf2Var = (hf2) arrayList.get(i2);
            if (!TextUtils.equals(this.s, hf2Var.a()) && (!TextUtils.isEmpty(str) || !hf2Var.a.a)) {
                z2 = false;
            }
            hf2Var.d = z2;
            if (z2) {
                i = i2;
            }
            i2++;
        }
        smb smbVar = this.d;
        if (i >= 0 && !z && (smbVar.getLayoutManager() instanceof u46)) {
            ((u46) smbVar.getLayoutManager()).g1(i, (gm.q.x - gm.L(83.0f)) / 2);
        }
        for (int i3 = 0; i3 < smbVar.getChildCount(); i3++) {
            View childAt = smbVar.getChildAt(i3);
            if ((childAt instanceof bpb) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((bpb) childAt).g(((hf2) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.w = wallPaper;
        gm.d0(this.d, new pi1(this, (byte) 1));
        if (this.w != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((hf2) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new hf2(tz3.a(this.a)));
                this.h.f();
            }
        }
    }

    public void setOnEmoticonSelected(qac qacVar) {
        this.r = qacVar;
    }

    public void setWithRemovedStub(boolean z) {
        this.f = z;
    }

    @Override
    public final void updateColors() {
        ?? r0;
        ri1 ri1Var;
        ylb ylbVar = this.b;
        if (ylbVar != null) {
            r0 = ylbVar.a();
        } else {
            r0 = cmb.I.o();
        }
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                break;
            }
            hf2 hf2Var = (hf2) arrayList.get(i);
            if (hf2Var.c != r0) {
                hf2Var.c = r0;
                z = true;
            }
            i++;
        }
        smb smbVar = this.d;
        if (smbVar != null) {
            gm.d0(smbVar, new pi1(this, (byte) 0));
            if (z && (ri1Var = this.h) != null) {
                ri1Var.f();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
