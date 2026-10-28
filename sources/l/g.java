package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f16709a;
    public LayoutInflater f16710b;
    public k f16711c;
    public ExpandedMenuView d;
    public w e;
    public f f16712f;

    public g(ContextWrapper contextWrapper) {
        this.f16709a = contextWrapper;
        this.f16710b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f16712f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final void e(w wVar) {
        throw null;
    }

    @Override
    public final void g(k kVar, boolean z10) {
        w wVar = this.e;
        if (wVar != null) {
            wVar.g(kVar, z10);
        }
    }

    @Override
    public final void i(Context context, k kVar) {
        if (this.f16709a != null) {
            this.f16709a = context;
            if (this.f16710b == null) {
                this.f16710b = LayoutInflater.from(context);
            }
        }
        this.f16711c = kVar;
        f fVar = this.f16712f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f16718a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f16738a = d0Var;
        d5.z zVar = new d5.z(context);
        g.b bVar = (g.b) zVar.f8027c;
        g gVar = new g(bVar.f12104a);
        obj.f16740c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f16740c;
        if (gVar2.f16712f == null) {
            gVar2.f16712f = new f(gVar2);
        }
        bVar.f12109i = gVar2.f16712f;
        bVar.f12110j = obj;
        View view = d0Var.f16729o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f12106c = d0Var.f16728n;
            bVar.d = d0Var.f16727m;
        }
        bVar.h = obj;
        g.f f7 = zVar.f();
        obj.f16739b = f7;
        f7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f16739b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f16739b.show();
        w wVar = this.e;
        if (wVar != null) {
            wVar.t(d0Var);
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
        this.f16711c.q(this.f16712f.getItem(i10), this, 0);
    }
}
