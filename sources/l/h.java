package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f15099a;
    public LayoutInflater f15100b;
    public l f15101c;
    public ExpandedMenuView d;
    public x f15102e;
    public g f15103f;

    public h(ContextWrapper contextWrapper) {
        this.f15099a = contextWrapper;
        this.f15100b = LayoutInflater.from(contextWrapper);
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
    public final void d(l lVar, boolean z10) {
        x xVar = this.f15102e;
        if (xVar != null) {
            xVar.d(lVar, z10);
        }
    }

    @Override
    public final void e() {
        g gVar = this.f15103f;
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
        if (this.f15099a != null) {
            this.f15099a = context;
            if (this.f15100b == null) {
                this.f15100b = LayoutInflater.from(context);
            }
        }
        this.f15101c = lVar;
        g gVar = this.f15103f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f15110a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15131a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f4347c;
        h hVar = new h(cVar.f10163a);
        obj.f15133c = hVar;
        hVar.f15102e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f15133c;
        if (hVar2.f15103f == null) {
            hVar2.f15103f = new g(hVar2);
        }
        cVar.f10169i = hVar2.f15103f;
        cVar.f10170j = obj;
        View view = e0Var.f15122o;
        if (view != null) {
            cVar.f10166e = view;
        } else {
            cVar.f10165c = e0Var.f15121n;
            cVar.d = e0Var.f15120m;
        }
        cVar.h = obj;
        g.g e7 = b0Var.e();
        obj.f15132b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15132b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15132b.show();
        x xVar = this.f15102e;
        if (xVar != null) {
            xVar.q(e0Var);
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
        this.f15101c.q(this.f15103f.getItem(i10), this, 0);
    }
}
