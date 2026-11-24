package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
public final class i56 implements s07, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public yz6 c;
    public ExpandedMenuView d;
    public r07 e;
    public h56 f;

    public i56(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override
    public final boolean b(bab babVar) {
        boolean hasVisibleItems = babVar.hasVisibleItems();
        Context context = babVar.a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.a = babVar;
        dd ddVar = new dd(context, (byte) 0);
        pc pcVar = (pc) ddVar.c;
        i56 i56Var = new i56((ContextThemeWrapper) pcVar.c);
        obj.c = i56Var;
        i56Var.e = obj;
        babVar.b(i56Var, context);
        i56 i56Var2 = obj.c;
        h56 h56Var = i56Var2.f;
        if (h56Var == null) {
            h56Var = new h56(i56Var2);
            i56Var2.f = h56Var;
        }
        pcVar.l = h56Var;
        pcVar.m = obj;
        View view = babVar.o;
        if (view != null) {
            pcVar.h = view;
        } else {
            pcVar.e = babVar.n;
            pcVar.f = babVar.m;
        }
        pcVar.k = obj;
        id Y = ddVar.Y();
        obj.b = Y;
        Y.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        r07 r07Var = this.e;
        if (r07Var != null) {
            r07Var.J(babVar);
            return true;
        }
        return true;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final void d(yz6 yz6Var, boolean z) {
        r07 r07Var = this.e;
        if (r07Var != null) {
            r07Var.d(yz6Var, z);
        }
    }

    @Override
    public final boolean g(c07 c07Var) {
        return false;
    }

    @Override
    public final void h(r07 r07Var) {
        throw null;
    }

    @Override
    public final boolean i(c07 c07Var) {
        return false;
    }

    @Override
    public final void j() {
        h56 h56Var = this.f;
        if (h56Var != null) {
            h56Var.notifyDataSetChanged();
        }
    }

    @Override
    public final void k(Context context, yz6 yz6Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = yz6Var;
        h56 h56Var = this.f;
        if (h56Var != null) {
            h56Var.notifyDataSetChanged();
        }
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
