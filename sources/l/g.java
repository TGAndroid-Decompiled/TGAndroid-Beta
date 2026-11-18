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
    public Context f19166a;
    public LayoutInflater f19167b;
    public k f19168c;
    public ExpandedMenuView d;
    public w f19169e;
    public f f19170f;

    public g(ContextWrapper contextWrapper) {
        this.f19166a = contextWrapper;
        this.f19167b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f19169e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f19170f;
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
        if (this.f19166a != null) {
            this.f19166a = context;
            if (this.f19167b == null) {
                this.f19167b = LayoutInflater.from(context);
            }
        }
        this.f19168c = kVar;
        f fVar = this.f19170f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f19177a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f19198a = d0Var;
        b3.j jVar = new b3.j(context);
        g.b bVar = (g.b) jVar.f2903c;
        g gVar = new g((ContextThemeWrapper) bVar.f12929c);
        obj.f19200c = gVar;
        gVar.f19169e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f19200c;
        if (gVar2.f19170f == null) {
            gVar2.f19170f = new f(gVar2);
        }
        bVar.f12936l = gVar2.f19170f;
        bVar.f12937m = obj;
        View view = d0Var.f19189o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f12930e = d0Var.f19188n;
            bVar.f12931f = d0Var.f19187m;
        }
        bVar.f12935k = obj;
        g.f g10 = jVar.g();
        obj.f19199b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f19199b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f19199b.show();
        w wVar = this.f19169e;
        if (wVar != null) {
            wVar.C(d0Var);
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
        this.f19168c.q(this.f19170f.getItem(i7), this, 0);
    }
}
