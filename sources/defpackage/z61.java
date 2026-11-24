package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class z61 extends oec {
    public m8 a;
    public final Context b;
    public final qw4 c;
    public final d d;
    public final dha e;
    public final o71 f;

    public z61(o71 o71Var, Context context, qw4 qw4Var, d dVar, dha dhaVar) {
        this.f = o71Var;
        this.b = context;
        this.c = qw4Var;
        this.d = dVar;
        this.e = dhaVar;
    }

    @Override
    public final void b(View view, int i, int i2) {
        o71 o71Var = this.f;
        o39 a = o71Var.a(view);
        ArrayList arrayList = o71Var.f;
        a.setAdapter(((m71) arrayList.get(i)).c);
        if (((m71) arrayList.get(i)).b != 1 && ((m71) arrayList.get(i)).b != 4) {
            view.getContext();
            a.setLayoutManager(new t26());
        } else {
            view.getContext();
            a.setLayoutManager(new r35(3));
        }
        a.setTag(Integer.valueOf(((m71) arrayList.get(i)).b));
        view.setTag(Integer.valueOf(((m71) arrayList.get(i)).b));
        if (this.e != null) {
            ((s39) o71Var.n).L(view);
        }
    }

    @Override
    public final View d(int i) {
        Context context = this.b;
        o39 o39Var = new o39(context, null);
        qw4 qw4Var = this.c;
        if (qw4Var != null) {
            qw4Var.b(o39Var);
        }
        gb3 gb3Var = (gb3) o39Var.getItemAnimator();
        gb3Var.C = false;
        gb3Var.m = false;
        o39Var.setClipToPadding(false);
        if (i != 1 && i != 4 && qw4Var != null) {
            o39Var.setSections(false);
        }
        o39Var.setCaptureSectionsDecoratorAllowed(true);
        o71 o71Var = this.f;
        if (i == 1) {
            o39Var.setPadding(gl.L(2.0f), 0, 0, o71Var.w);
        } else {
            o39Var.setPadding(0, 0, 0, o71Var.w);
        }
        o39Var.setOnItemClickListener(new y61(this, o39Var));
        o39Var.setOnItemLongClickListener(new ie(this, o39Var, this.d, (byte) 9));
        if (this.e == null) {
            return o39Var;
        }
        return new n71(o39Var, context);
    }

    @Override
    public final int e() {
        return this.f.f.size();
    }

    @Override
    public final int f(int i) {
        return ((m71) this.f.f.get(i)).b;
    }

    @Override
    public final CharSequence g(int i) {
        return ((m71) this.f.f.get(i)).a;
    }

    @Override
    public final int h(int i) {
        return ((m71) this.f.f.get(i)).b;
    }
}
