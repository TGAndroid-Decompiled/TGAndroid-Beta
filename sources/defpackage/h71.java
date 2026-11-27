package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class h71 extends nic {
    public n8 a;
    public final Context b;
    public final vy4 c;
    public final e d;
    public final wka e;
    public final w71 f;

    public h71(w71 w71Var, Context context, vy4 vy4Var, e eVar, wka wkaVar) {
        this.f = w71Var;
        this.b = context;
        this.c = vy4Var;
        this.d = eVar;
        this.e = wkaVar;
    }

    @Override
    public final void b(View view, int i, int i2) {
        w71 w71Var = this.f;
        d79 a = w71Var.a(view);
        ArrayList arrayList = w71Var.f;
        a.setAdapter(((u71) arrayList.get(i)).c);
        if (((u71) arrayList.get(i)).b != 1 && ((u71) arrayList.get(i)).b != 4) {
            view.getContext();
            a.setLayoutManager(new x46());
        } else {
            view.getContext();
            a.setLayoutManager(new u55(3));
        }
        a.setTag(Integer.valueOf(((u71) arrayList.get(i)).b));
        view.setTag(Integer.valueOf(((u71) arrayList.get(i)).b));
        if (this.e != null) {
            ((h79) w71Var.n).M(view);
        }
    }

    @Override
    public final View d(int i) {
        Context context = this.b;
        d79 d79Var = new d79(context, null);
        vy4 vy4Var = this.c;
        if (vy4Var != null) {
            vy4Var.b(d79Var);
        }
        zb3 zb3Var = (zb3) d79Var.getItemAnimator();
        zb3Var.C = false;
        zb3Var.m = false;
        d79Var.setClipToPadding(false);
        if (i != 1 && i != 4 && vy4Var != null) {
            d79Var.setSections(false);
        }
        d79Var.setCaptureSectionsDecoratorAllowed(true);
        w71 w71Var = this.f;
        if (i == 1) {
            d79Var.setPadding(hl.L(2.0f), 0, 0, w71Var.w);
        } else {
            d79Var.setPadding(0, 0, 0, w71Var.w);
        }
        d79Var.setOnItemClickListener(new g71(this, d79Var));
        d79Var.setOnItemLongClickListener(new ie(this, d79Var, this.d, (byte) 9));
        if (this.e == null) {
            return d79Var;
        }
        return new v71(d79Var, context);
    }

    @Override
    public final int e() {
        return this.f.f.size();
    }

    @Override
    public final int f(int i) {
        return ((u71) this.f.f.get(i)).b;
    }

    @Override
    public final CharSequence g(int i) {
        return ((u71) this.f.f.get(i)).a;
    }

    @Override
    public final int h(int i) {
        return ((u71) this.f.f.get(i)).b;
    }
}
