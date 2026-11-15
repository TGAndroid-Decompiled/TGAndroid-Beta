package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.u1;
public final class b extends u1 {
    public final int f18774s = 0;
    public final View f18775w;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f18775w = actionMenuItemView;
    }

    @Override
    public final b0 b() {
        m.d dVar;
        switch (this.f18774s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f18775w).f1839y;
                if (cVar != null && (dVar = ((m.e) cVar).f19683a.K) != null) {
                    return dVar.a();
                }
                return null;
            default:
                m.d dVar2 = ((m.g) this.f18775w).d.J;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.a();
        }
    }

    @Override
    public final boolean c() {
        b0 b10;
        switch (this.f18774s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f18775w;
                j jVar = actionMenuItemView.f1837w;
                if (jVar != null && jVar.a(actionMenuItemView.f1834n) && (b10 = b()) != null && b10.a()) {
                    return true;
                }
                return false;
            default:
                ((m.g) this.f18775w).d.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.f18774s) {
            case 1:
                m.h hVar = ((m.g) this.f18775w).d;
                if (hVar.L != null) {
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
        this.f18775w = gVar;
    }
}
