package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v1;
public final class b extends v1 {
    public final int f13944s = 0;
    public final View v;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.v = actionMenuItemView;
    }

    @Override
    public final b0 b() {
        m.e eVar;
        switch (this.f13944s) {
            case 0:
                c cVar = ((ActionMenuItemView) this.v).f930x;
                if (cVar != null && (eVar = ((m.f) cVar).f16541a.F) != null) {
                    return eVar.a();
                }
                return null;
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
        b0 b10;
        switch (this.f13944s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.v;
                j jVar = actionMenuItemView.v;
                if (jVar != null && jVar.a(actionMenuItemView.f926n) && (b10 = b()) != null && b10.a()) {
                    return true;
                }
                return false;
            default:
                ((m.h) this.v).d.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.f13944s) {
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
