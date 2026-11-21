package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.u1;
public final class b extends u1 {
    public final int f19166s = 0;
    public final View f19167w;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f19167w = actionMenuItemView;
    }

    @Override
    public final b0 b() {
        m.d dVar;
        switch (this.f19166s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f19167w).f1850y;
                if (cVar != null && (dVar = ((m.e) cVar).f20075a.K) != null) {
                    return dVar.a();
                }
                return null;
            default:
                m.d dVar2 = ((m.g) this.f19167w).d.J;
                if (dVar2 == null) {
                    return null;
                }
                return dVar2.a();
        }
    }

    @Override
    public final boolean c() {
        b0 b10;
        switch (this.f19166s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f19167w;
                j jVar = actionMenuItemView.f1848w;
                if (jVar != null && jVar.a(actionMenuItemView.f1845n) && (b10 = b()) != null && b10.a()) {
                    return true;
                }
                return false;
            default:
                ((m.g) this.f19167w).d.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.f19166s) {
            case 1:
                m.h hVar = ((m.g) this.f19167w).d;
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
        this.f19167w = gVar;
    }
}
