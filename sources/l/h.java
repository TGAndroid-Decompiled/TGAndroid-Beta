package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f13951a;
    public LayoutInflater f13952b;
    public l f13953c;
    public ExpandedMenuView d;
    public x e;
    public g f13954f;

    public h(ContextWrapper contextWrapper) {
        this.f13951a = contextWrapper;
        this.f13952b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d() {
        g gVar = this.f13954f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void e(x xVar) {
        throw null;
    }

    @Override
    public final void g(l lVar, boolean z10) {
        x xVar = this.e;
        if (xVar != null) {
            xVar.g(lVar, z10);
        }
    }

    @Override
    public final void i(Context context, l lVar) {
        if (this.f13951a != null) {
            this.f13951a = context;
            if (this.f13952b == null) {
                this.f13952b = LayoutInflater.from(context);
            }
        }
        this.f13953c = lVar;
        g gVar = this.f13954f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f13960a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f13980a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f3841c;
        h hVar = new h(cVar.f9215a);
        obj.f13982c = hVar;
        hVar.e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f13982c;
        if (hVar2.f13954f == null) {
            hVar2.f13954f = new g(hVar2);
        }
        cVar.f9220i = hVar2.f13954f;
        cVar.f9221j = obj;
        View view = e0Var.f13971o;
        if (view != null) {
            cVar.e = view;
        } else {
            cVar.f9217c = e0Var.f13970n;
            cVar.d = e0Var.f13969m;
        }
        cVar.h = obj;
        g.g e = b0Var.e();
        obj.f13981b = e;
        e.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f13981b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f13981b.show();
        x xVar = this.e;
        if (xVar != null) {
            xVar.v(e0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(n nVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        this.f13953c.q(this.f13954f.getItem(i10), this, 0);
    }
}
