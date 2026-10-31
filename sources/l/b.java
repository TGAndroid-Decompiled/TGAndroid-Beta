package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.u1;
public final class b extends u1 {
    public final int f11459s = 0;
    public final View f11460w;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f11460w = actionMenuItemView;
    }

    @Override
    public final c0 b() {
        m.d dVar;
        switch (this.f11459s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f11460w).f1001y;
                if (cVar != null && (dVar = ((m.e) cVar).f12400a.J) != null) {
                    return dVar.a();
                }
                return null;
            default:
                m.d dVar2 = ((m.g) this.f11460w).d.I;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.a();
        }
    }

    @Override
    public final boolean c() {
        c0 b10;
        switch (this.f11459s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f11460w;
                k kVar = actionMenuItemView.f999w;
                if (kVar != null && kVar.a(actionMenuItemView.f996n) && (b10 = b()) != null && b10.a()) {
                    return true;
                }
                return false;
            default:
                ((m.g) this.f11460w).d.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.f11459s) {
            case 1:
                m.h hVar = ((m.g) this.f11460w).d;
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
        this.f11460w = gVar;
    }
}
