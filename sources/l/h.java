package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

public final class h implements y, AdapterView.OnItemClickListener {

    public Context f15299a;

    public LayoutInflater f15300b;

    public l f15301c;
    public ExpandedMenuView d;

    public x f15302e;

    public g f15303f;

    public h(ContextWrapper contextWrapper) {
        this.f15299a = contextWrapper;
        this.f15300b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final void b(l lVar, boolean z10) {
        x xVar = this.f15302e;
        if (xVar != null) {
            xVar.b(lVar, z10);
        }
    }

    @Override
    public final boolean c(n nVar) {
        return false;
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        g gVar = this.f15303f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void h(x xVar) {
        throw null;
    }

    @Override
    public final void i(Context context, l lVar) {
        if (this.f15299a != null) {
            this.f15299a = context;
            if (this.f15300b == null) {
                this.f15300b = LayoutInflater.from(context);
            }
        }
        this.f15301c = lVar;
        g gVar = this.f15303f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean zHasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f15310a;
        if (!zHasVisibleItems) {
            return false;
        }
        m mVar = new m();
        mVar.f15331a = e0Var;
        n2.v vVar = new n2.v(context);
        g.d dVar = (g.d) vVar.f18187c;
        h hVar = new h(dVar.f6227a);
        mVar.f15333c = hVar;
        hVar.f15302e = mVar;
        e0Var.b(hVar, context);
        h hVar2 = mVar.f15333c;
        if (hVar2.f15303f == null) {
            hVar2.f15303f = new g(hVar2);
        }
        dVar.f6233i = hVar2.f15303f;
        dVar.f6234j = mVar;
        View view = e0Var.f15322o;
        if (view != null) {
            dVar.f6230e = view;
        } else {
            dVar.f6229c = e0Var.f15321n;
            dVar.d = e0Var.f15320m;
        }
        dVar.h = mVar;
        g.g gVarD = vVar.d();
        mVar.f15332b = gVarD;
        gVarD.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f15332b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f15332b.show();
        x xVar = this.f15302e;
        if (xVar == null) {
            return true;
        }
        xVar.l(e0Var);
        return true;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f15301c.q(this.f15303f.getItem(i10), this, 0);
    }
}
