package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15807a;
    public LayoutInflater f15808b;
    public k f15809c;
    public ExpandedMenuView d;
    public w e;
    public f f15810f;

    public g(ContextWrapper contextWrapper) {
        this.f15807a = contextWrapper;
        this.f15808b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(k kVar, boolean z10) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f15810f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void h(w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f15807a != null) {
            this.f15807a = context;
            if (this.f15808b == null) {
                this.f15808b = LayoutInflater.from(context);
            }
        }
        this.f15809c = kVar;
        f fVar = this.f15810f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15816a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15836a = d0Var;
        c5.c0 c0Var = new c5.c0(context);
        g.b bVar = (g.b) c0Var.f4729c;
        g gVar = new g(bVar.f10657a);
        obj.f15838c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15838c;
        if (gVar2.f15810f == null) {
            gVar2.f15810f = new f(gVar2);
        }
        bVar.f10662i = gVar2.f15810f;
        bVar.f10663j = obj;
        View view = d0Var.f15827o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f10659c = d0Var.f15826n;
            bVar.d = d0Var.f15825m;
        }
        bVar.h = obj;
        g.f i10 = c0Var.i();
        obj.f15837b = i10;
        i10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15837b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15837b.show();
        w wVar = this.e;
        if (wVar != null) {
            wVar.o(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f15809c.q(this.f15810f.getItem(i10), this, 0);
    }
}
