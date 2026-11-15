package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f18802a;
    public LayoutInflater f18803b;
    public k f18804c;
    public ExpandedMenuView d;
    public w f18805e;
    public f f18806f;

    public g(ContextWrapper contextWrapper) {
        this.f18802a = contextWrapper;
        this.f18803b = LayoutInflater.from(contextWrapper);
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
    public final void d() {
        f fVar = this.f18806f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void e(k kVar, boolean z10) {
        w wVar = this.f18805e;
        if (wVar != null) {
            wVar.e(kVar, z10);
        }
    }

    @Override
    public final void h(w wVar) {
        throw null;
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f18802a != null) {
            this.f18802a = context;
            if (this.f18803b == null) {
                this.f18803b = LayoutInflater.from(context);
            }
        }
        this.f18804c = kVar;
        f fVar = this.f18806f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f18813a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f18834a = d0Var;
        f5.v vVar = new f5.v(context);
        g.b bVar = (g.b) vVar.f11019c;
        g gVar = new g((ContextThemeWrapper) bVar.f12615c);
        obj.f18836c = gVar;
        gVar.f18805e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f18836c;
        if (gVar2.f18806f == null) {
            gVar2.f18806f = new f(gVar2);
        }
        bVar.f12622l = gVar2.f18806f;
        bVar.f12623m = obj;
        View view = d0Var.f18825o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f12616e = d0Var.f18824n;
            bVar.f12617f = d0Var.f18823m;
        }
        bVar.f12621k = obj;
        g.f g10 = vVar.g();
        obj.f18835b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f18835b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f18835b.show();
        w wVar = this.f18805e;
        if (wVar != null) {
            wVar.y(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        this.f18804c.q(this.f18806f.getItem(i7), this, 0);
    }
}
