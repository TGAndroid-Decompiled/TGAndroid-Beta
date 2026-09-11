package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.u1;
public final class b extends u1 {
    public final int f15069s = 0;
    public final View v;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v = actionMenuItemView;
    }

    @Override
    public final c0 b() {
        m.d dVar;
        switch (this.f15069s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.v).f932x;
                if (cVar != null && (dVar = ((m.e) cVar).f15508a.J) != null) {
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
        c0 b10;
        switch (this.f15069s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                k kVar = actionMenuItemView.v;
                if (kVar != null && kVar.a(actionMenuItemView.f928n) && (b10 = b()) != null && b10.a()) {
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
        switch (this.f15069s) {
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
