package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class h implements y, AdapterView.OnItemClickListener {
    public Context f15125a;
    public LayoutInflater f15126b;
    public l f15127c;
    public ExpandedMenuView d;
    public x f15128e;
    public g f15129f;

    public h(ContextWrapper contextWrapper) {
        this.f15125a = contextWrapper;
        this.f15126b = LayoutInflater.from(contextWrapper);
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
        x xVar = this.f15128e;
        if (xVar != null) {
            xVar.d(lVar, z10);
        }
    }

    @Override
    public final void e() {
        g gVar = this.f15129f;
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
        if (this.f15125a != null) {
            this.f15125a = context;
            if (this.f15126b == null) {
                this.f15126b = LayoutInflater.from(context);
            }
        }
        this.f15127c = lVar;
        g gVar = this.f15129f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(e0 e0Var) {
        boolean hasVisibleItems = e0Var.hasVisibleItems();
        Context context = e0Var.f15136a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15157a = e0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.c cVar = (g.c) b0Var.f4374c;
        h hVar = new h(cVar.f10191a);
        obj.f15159c = hVar;
        hVar.f15128e = obj;
        e0Var.b(hVar, context);
        h hVar2 = obj.f15159c;
        if (hVar2.f15129f == null) {
            hVar2.f15129f = new g(hVar2);
        }
        cVar.f10197i = hVar2.f15129f;
        cVar.f10198j = obj;
        View view = e0Var.f15148o;
        if (view != null) {
            cVar.f10194e = view;
        } else {
            cVar.f10193c = e0Var.f15147n;
            cVar.d = e0Var.f15146m;
        }
        cVar.h = obj;
        g.g e7 = b0Var.e();
        obj.f15158b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15158b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15158b.show();
        x xVar = this.f15128e;
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
        this.f15127c.q(this.f15129f.getItem(i10), this, 0);
    }
}
