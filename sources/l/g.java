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
    public Context f17657a;
    public LayoutInflater f17658b;
    public k f17659c;
    public ExpandedMenuView d;
    public w f17660e;
    public f f17661f;

    public g(ContextWrapper contextWrapper) {
        this.f17657a = contextWrapper;
        this.f17658b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(m mVar) {
        return false;
    }

    @Override
    public final void c(k kVar, boolean z9) {
        w wVar = this.f17660e;
        if (wVar != null) {
            wVar.c(kVar, z9);
        }
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e() {
        f fVar = this.f17661f;
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
        if (this.f17657a != null) {
            this.f17657a = context;
            if (this.f17658b == null) {
                this.f17658b = LayoutInflater.from(context);
            }
        }
        this.f17659c = kVar;
        f fVar = this.f17661f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f17668a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f17689a = d0Var;
        f5.u uVar = new f5.u(context);
        g.b bVar = (g.b) uVar.f11191c;
        g gVar = new g((ContextThemeWrapper) bVar.f13265c);
        obj.f17691c = gVar;
        gVar.f17660e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f17691c;
        if (gVar2.f17661f == null) {
            gVar2.f17661f = new f(gVar2);
        }
        bVar.f13272l = gVar2.f17661f;
        bVar.f13273m = obj;
        View view = d0Var.f17680o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f13266e = d0Var.f17679n;
            bVar.f13267f = d0Var.f17678m;
        }
        bVar.f13271k = obj;
        g.f e10 = uVar.e();
        obj.f17690b = e10;
        e10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f17690b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f17690b.show();
        w wVar = this.f17660e;
        if (wVar != null) {
            wVar.A(d0Var);
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
        this.f17659c.q(this.f17661f.getItem(i7), this, 0);
    }
}
