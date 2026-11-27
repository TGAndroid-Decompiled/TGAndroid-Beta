package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class m76 implements z27, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public f27 c;
    public ExpandedMenuView d;
    public y27 e;
    public l76 f;

    public m76(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(zdb zdbVar) {
        boolean hasVisibleItems = zdbVar.hasVisibleItems();
        Context context = zdbVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.a = zdbVar;
        ed edVar = new ed(context, (byte) 0);
        qc qcVar = (qc) edVar.c;
        m76 m76Var = new m76((ContextThemeWrapper) qcVar.c);
        obj.c = m76Var;
        m76Var.e = obj;
        zdbVar.b(m76Var, context);
        m76 m76Var2 = obj.c;
        l76 l76Var = m76Var2.f;
        if (l76Var == null) {
            l76Var = new l76(m76Var2);
            m76Var2.f = l76Var;
        }
        qcVar.l = l76Var;
        qcVar.m = obj;
        View view = zdbVar.o;
        if (view != null) {
            qcVar.h = view;
        } else {
            qcVar.e = zdbVar.n;
            qcVar.f = zdbVar.m;
        }
        qcVar.k = obj;
        jd a0 = edVar.a0();
        obj.b = a0;
        a0.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        y27 y27Var = this.e;
        if (y27Var != null) {
            y27Var.z0(zdbVar);
            return true;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final boolean e(j27 j27Var) {
        return false;
    }

    @Override
    public final void f(f27 f27Var, boolean z) {
        y27 y27Var = this.e;
        if (y27Var != null) {
            y27Var.f(f27Var, z);
        }
    }

    @Override
    public final void h(y27 y27Var) {
        throw null;
    }

    @Override
    public final boolean i(j27 j27Var) {
        return false;
    }

    @Override
    public final void j() {
        l76 l76Var = this.f;
        if (l76Var != null) {
            l76Var.notifyDataSetChanged();
        }
    }

    @Override
    public final void k(Context context, f27 f27Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = f27Var;
        l76 l76Var = this.f;
        if (l76Var != null) {
            l76Var.notifyDataSetChanged();
        }
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
