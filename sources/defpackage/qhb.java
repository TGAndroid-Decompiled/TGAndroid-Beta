package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.WallpapersListActivity;
public final class qhb extends v79 {
    public final byte a;
    public final Object b;

    public qhb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        ltc ltcVar;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (i == 0) {
                    ((pqb) obj).t0 = false;
                    return;
                }
                return;
            case 2:
                if (i == 1) {
                    hl.t1(((vsb) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
                if (i == 1) {
                    hl.t1(((axb) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
            case 8:
            case 10:
            case 11:
            default:
                return;
            case 5:
                if (i == 1) {
                    hl.t1(((sbc) obj).U1.getEditText());
                    return;
                }
                return;
            case 6:
                xbc xbcVar = (xbc) obj;
                gw9 gw9Var = xbcVar.n1;
                if (i == 0 && xbcVar.A1) {
                    if (hl.L(13.0f) + xbcVar.x1 + xbcVar.t0 < (hl.m << 1) && gw9Var.canScrollVertically(1) && (n69Var = (n69) gw9Var.L(0)) != null) {
                        View view = n69Var.a;
                        if (view.getTop() > 0) {
                            gw9Var.y0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                if (i == 1) {
                    hl.t1(((UsersSelectActivity) obj).c);
                    return;
                }
                return;
            case 9:
                if (i == 1 && (ltcVar = ((uqc) obj).j0) != null) {
                    ltcVar.a();
                    return;
                }
                return;
            case 12:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (i == 1) {
                    hl.t1(wallpapersListActivity.getParentActivity().getCurrentFocus());
                }
                if (i != 0) {
                    z = true;
                }
                wallpapersListActivity.g0 = z;
                return;
        }
    }

    @Override
    public final void b(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhb.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
