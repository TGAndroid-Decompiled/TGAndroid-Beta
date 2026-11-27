package defpackage;

import android.content.Context;
import android.view.View;
public final class d4a extends vu7 {
    public final lcb c;
    public final Context d;
    public final g4a e;

    public d4a(g4a g4aVar, lcb lcbVar, Context context) {
        this.e = g4aVar;
        this.c = lcbVar;
        this.d = context;
    }

    @Override
    public final void a(fic ficVar, Object obj) {
        ficVar.removeView((View) obj);
        this.e.H.remove(obj);
    }

    @Override
    public final int b() {
        return this.e.G.size();
    }

    @Override
    public final Object e(fic ficVar, int i) {
        g4a g4aVar = this.e;
        c4a c4aVar = new c4a(this, this.c, this.d, g4aVar.I, new sh9(this, (byte) 5));
        c4aVar.setTag(Integer.valueOf(i));
        c4aVar.setShadowDrawable(g4aVar.s);
        c4aVar.setPadding(0, hl.L(16.0f), 0, 0);
        c4aVar.f(g4aVar.E, (f4a) g4aVar.G.get(i));
        c4aVar.setListBottomPadding(g4aVar.d);
        ficVar.addView(c4aVar);
        g4aVar.H.add(c4aVar);
        return c4aVar;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
