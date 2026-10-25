package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f16710a;
    public LayoutInflater f16711b;
    public k f16712c;
    public ExpandedMenuView d;
    public w e;
    public f f16713f;

    public g(ContextWrapper contextWrapper) {
        this.f16710a = contextWrapper;
        this.f16711b = LayoutInflater.from(contextWrapper);
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
        f fVar = this.f16713f;
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
        if (this.f16710a != null) {
            this.f16710a = context;
            if (this.f16711b == null) {
                this.f16711b = LayoutInflater.from(context);
            }
        }
        this.f16712c = kVar;
        f fVar = this.f16713f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f16719a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f16739a = d0Var;
        d5.z zVar = new d5.z(context);
        g.b bVar = (g.b) zVar.f8027c;
        g gVar = new g(bVar.f12105a);
        obj.f16741c = gVar;
        gVar.e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f16741c;
        if (gVar2.f16713f == null) {
            gVar2.f16713f = new f(gVar2);
        }
        bVar.f12110i = gVar2.f16713f;
        bVar.f12111j = obj;
        View view = d0Var.f16730o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.f12107c = d0Var.f16729n;
            bVar.d = d0Var.f16728m;
        }
        bVar.h = obj;
        g.f f7 = zVar.f();
        obj.f16740b = f7;
        f7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f16740b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f16740b.show();
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
        this.f16712c.q(this.f16713f.getItem(i10), this, 0);
    }
}
