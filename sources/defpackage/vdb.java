package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.WallpapersListActivity;
public final class vdb extends i49 {
    public final byte a;
    public final Object b;

    public vdb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        zoc zocVar;
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 1:
                if (i == 0) {
                    ((qmb) obj).t0 = false;
                    return;
                }
                return;
            case 2:
                if (i == 1) {
                    gl.t1(((vob) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 3:
                if (i == 1) {
                    gl.t1(((zsb) obj).getParentActivity().getCurrentFocus());
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
                    gl.t1(((s7c) obj).U1.getEditText());
                    return;
                }
                return;
            case 6:
                x7c x7cVar = (x7c) obj;
                ns9 ns9Var = x7cVar.n1;
                if (i == 0 && x7cVar.A1) {
                    if (gl.L(13.0f) + x7cVar.x1 + x7cVar.t0 < (gl.m << 1) && ns9Var.canScrollVertically(1) && (y29Var = (y29) ns9Var.K(0)) != null) {
                        View view = y29Var.a;
                        if (view.getTop() > 0) {
                            ns9Var.x0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                if (i == 1) {
                    gl.t1(((UsersSelectActivity) obj).c);
                    return;
                }
                return;
            case 9:
                if (i == 1 && (zocVar = ((hmc) obj).j0) != null) {
                    zocVar.a();
                    return;
                }
                return;
            case 12:
                WallpapersListActivity wallpapersListActivity = (WallpapersListActivity) obj;
                if (i == 1) {
                    gl.t1(wallpapersListActivity.getParentActivity().getCurrentFocus());
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vdb.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
