package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.WallpapersListActivity;
public final class k2b extends k69 {
    public final byte a;
    public final Object b;

    public k2b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        brc brcVar;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 2:
                if (i == 0) {
                    ((rob) obj).t0 = false;
                    return;
                }
                return;
            case 3:
                if (i == 1) {
                    gm.t1(((wqb) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (i == 1) {
                    gm.t1(((avb) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
            case 9:
            case 11:
            case 12:
            default:
                return;
            case 6:
                if (i == 1) {
                    gm.t1(((t9c) obj).U1.getEditText());
                    return;
                }
                return;
            case 7:
                y9c y9cVar = (y9c) obj;
                pu9 pu9Var = y9cVar.n1;
                if (i == 0 && y9cVar.A1) {
                    if (gm.L(13.0f) + y9cVar.x1 + y9cVar.t0 < (gm.m << 1) && pu9Var.canScrollVertically(1) && (b59Var = (b59) pu9Var.K(0)) != null) {
                        View view = b59Var.a;
                        if (view.getTop() > 0) {
                            pu9Var.x0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                if (i == 1) {
                    gm.t1(((UsersSelectActivity) obj).c);
                    return;
                }
                return;
            case 10:
                if (i == 1 && (brcVar = ((goc) obj).j0) != null) {
                    brcVar.a();
                    return;
                }
                return;
            case 13:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (i == 1) {
                    gm.t1(wallpapersListActivity.getParentActivity().getCurrentFocus());
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k2b.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
