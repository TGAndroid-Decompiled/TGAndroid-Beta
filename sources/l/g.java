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
    public Context f19197a;
    public LayoutInflater f19198b;
    public k f19199c;
    public ExpandedMenuView d;
    public w f19200e;
    public f f19201f;

    public g(ContextWrapper contextWrapper) {
        this.f19197a = contextWrapper;
        this.f19198b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f19200e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f19201f;
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
        if (this.f19197a != null) {
            this.f19197a = context;
            if (this.f19198b == null) {
                this.f19198b = LayoutInflater.from(context);
            }
        }
        this.f19199c = kVar;
        f fVar = this.f19201f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f19208a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f19229a = d0Var;
        b3.j jVar = new b3.j(context);
        g.b bVar = (g.b) jVar.f2922c;
        g gVar = new g((ContextThemeWrapper) bVar.f12961c);
        obj.f19231c = gVar;
        gVar.f19200e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f19231c;
        if (gVar2.f19201f == null) {
            gVar2.f19201f = new f(gVar2);
        }
        bVar.f12968l = gVar2.f19201f;
        bVar.f12969m = obj;
        View view = d0Var.f19220o;
        if (view != null) {
            bVar.h = view;
        } else {
            bVar.f12962e = d0Var.f19219n;
            bVar.f12963f = d0Var.f19218m;
        }
        bVar.f12967k = obj;
        g.f g10 = jVar.g();
        obj.f19230b = g10;
        g10.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f19230b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f19230b.show();
        w wVar = this.f19200e;
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
        this.f19199c.q(this.f19201f.getItem(i7), this, 0);
    }
}
