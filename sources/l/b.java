package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v1;

public final class b extends v1 {

    public final int f15269s = 0;
    public final View v;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v = actionMenuItemView;
    }

    @Override
    public final c0 b() {
        m.e eVar;
        switch (this.f15269s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.v).f943x;
                if (cVar == null || (eVar = ((m.f) cVar).f17317a.F) == null) {
                    return null;
                }
                return eVar.a();
            default:
                m.e eVar2 = ((m.h) this.v).d.E;
                if (eVar2 == null) {
                    return null;
                }
                return eVar2.a();
        }
    }

    @Override
    public final boolean c() {
        c0 c0VarB;
        switch (this.f15269s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                k kVar = actionMenuItemView.v;
                return kVar != null && kVar.a(actionMenuItemView.f939n) && (c0VarB = b()) != null && c0VarB.a();
            default:
                ((m.h) this.v).d.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.f15269s) {
            case 1:
                m.i iVar = ((m.h) this.v).d;
                if (iVar.G != null) {
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
        this.v = hVar;
    }
}
