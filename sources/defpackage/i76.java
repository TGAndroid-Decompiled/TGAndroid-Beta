package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class i76 implements s27, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public y17 c;
    public ExpandedMenuView d;
    public r27 e;
    public h76 f;

    public i76(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(dcb dcbVar) {
        boolean hasVisibleItems = dcbVar.hasVisibleItems();
        Context context = dcbVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.a = dcbVar;
        de deVar = new de(context, (byte) 0);
        pd pdVar = (pd) deVar.c;
        i76 i76Var = new i76((ContextThemeWrapper) pdVar.c);
        obj.c = i76Var;
        i76Var.e = obj;
        dcbVar.b(i76Var, context);
        i76 i76Var2 = obj.c;
        h76 h76Var = i76Var2.f;
        if (h76Var == null) {
            h76Var = new h76(i76Var2);
            i76Var2.f = h76Var;
        }
        pdVar.l = h76Var;
        pdVar.m = obj;
        View view = dcbVar.o;
        if (view != null) {
            pdVar.h = view;
        } else {
            pdVar.e = dcbVar.n;
            pdVar.f = dcbVar.m;
        }
        pdVar.k = obj;
        ie a0 = deVar.a0();
        obj.b = a0;
        a0.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        r27 r27Var = this.e;
        if (r27Var != null) {
            r27Var.w0(dcbVar);
            return true;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(y17 y17Var, boolean z) {
        r27 r27Var = this.e;
        if (r27Var != null) {
            r27Var.d(y17Var, z);
        }
    }

    @Override
    public final boolean g(c27 c27Var) {
        return false;
    }

    @Override
    public final void h(r27 r27Var) {
        throw null;
    }

    @Override
    public final boolean i(c27 c27Var) {
        return false;
    }

    @Override
    public final void j() {
        h76 h76Var = this.f;
        if (h76Var != null) {
            h76Var.notifyDataSetChanged();
        }
    }

    @Override
    public final void k(Context context, y17 y17Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = y17Var;
        h76 h76Var = this.f;
        if (h76Var != null) {
            h76Var.notifyDataSetChanged();
        }
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
