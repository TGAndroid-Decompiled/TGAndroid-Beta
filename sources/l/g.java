package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class g implements x, AdapterView.OnItemClickListener {
    public Context f15227a;
    public LayoutInflater f15228b;
    public k f15229c;
    public ExpandedMenuView d;
    public w f15230e;
    public f f15231f;

    public g(ContextWrapper contextWrapper) {
        this.f15227a = contextWrapper;
        this.f15228b = LayoutInflater.from(contextWrapper);
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
        w wVar = this.f15230e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override
    public final void e() {
        f fVar = this.f15231f;
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
        if (this.f15227a != null) {
            this.f15227a = context;
            if (this.f15228b == null) {
                this.f15228b = LayoutInflater.from(context);
            }
        }
        this.f15229c = kVar;
        f fVar = this.f15231f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean j(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f15238a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f15259a = d0Var;
        c5.b0 b0Var = new c5.b0(context);
        g.b bVar = (g.b) b0Var.f4203c;
        g gVar = new g(bVar.f10096a);
        obj.f15261c = gVar;
        gVar.f15230e = obj;
        d0Var.b(gVar, context);
        g gVar2 = obj.f15261c;
        if (gVar2.f15231f == null) {
            gVar2.f15231f = new f(gVar2);
        }
        bVar.f10102i = gVar2.f15231f;
        bVar.f10103j = obj;
        View view = d0Var.f15250o;
        if (view != null) {
            bVar.f10099e = view;
        } else {
            bVar.f10098c = d0Var.f15249n;
            bVar.d = d0Var.f15248m;
        }
        bVar.h = obj;
        g.f e7 = b0Var.e();
        obj.f15260b = e7;
        e7.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f15260b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f15260b.show();
        w wVar = this.f15230e;
        if (wVar != null) {
            wVar.v(d0Var);
            return true;
        }
        return true;
    }

    @Override
    public final boolean k(m mVar) {
        return false;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        this.f15229c.q(this.f15231f.getItem(i10), this, 0);
    }
}
