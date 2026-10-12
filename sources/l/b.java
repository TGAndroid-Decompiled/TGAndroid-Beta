package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v1;
public final class b extends v1 {
    public final int f14946s = 0;
    public final View v;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v = actionMenuItemView;
    }

    @Override
    public final b0 b() {
        m.d dVar;
        switch (this.f14946s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.v).f2193x;
                if (cVar != null && (dVar = ((m.e) cVar).f15408a.J) != null) {
                    return dVar.a();
                }
                return null;
            default:
                m.d dVar2 = ((m.g) this.v).d.I;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.a();
        }
    }

    @Override
    public final boolean c() {
        b0 b10;
        switch (this.f14946s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                j jVar = actionMenuItemView.v;
                if (jVar != null && jVar.a(actionMenuItemView.f2189n) && (b10 = b()) != null && b10.a()) {
                    return true;
                }
                return false;
            default:
                ((m.g) this.v).d.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.f14946s) {
            case 1:
                m.h hVar = ((m.g) this.v).d;
                if (hVar.K != null) {
                    return false;
                }
                hVar.f();
                return true;
            default:
                return super.d();
        }
    }

    public b(m.g gVar, m.g gVar2) {
        super(gVar2);
        this.v = gVar;
    }
}
