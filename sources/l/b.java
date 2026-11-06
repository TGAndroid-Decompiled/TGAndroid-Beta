package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v1;
public final class b extends v1 {
    public final int f17629s = 0;
    public final View f17630w;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f17630w = actionMenuItemView;
    }

    @Override
    public final b0 b() {
        m.e eVar;
        switch (this.f17629s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f17630w).f1896y;
                if (cVar != null && (eVar = ((m.f) cVar).f19098a.J) != null) {
                    return eVar.a();
                }
                return null;
            default:
                m.e eVar2 = ((m.h) this.f17630w).d.I;
                if (eVar2 == null) {
                    return null;
                }
                return eVar2.a();
        }
    }

    @Override
    public final boolean c() {
        b0 b10;
        switch (this.f17629s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f17630w;
                j jVar = actionMenuItemView.f1894w;
                if (jVar != null && jVar.a(actionMenuItemView.f1891n) && (b10 = b()) != null && b10.a()) {
                    return true;
                }
                return false;
            default:
                ((m.h) this.f17630w).d.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.f17629s) {
            case 1:
                m.i iVar = ((m.h) this.f17630w).d;
                if (iVar.K != null) {
                    return false;
                }
                iVar.f();
                return true;
            default:
                return super.d();
        }
    }

    public b(m.h hVar, m.h hVar2) {
        super(hVar2);
        this.f17630w = hVar;
    }
}
