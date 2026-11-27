package defpackage;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.WallpapersListActivity;
public final class wvc extends d6 {
    public final WallpapersListActivity a;

    public wvc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void b(int i) {
        jla jlaVar;
        jla jlaVar2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        if (i == -1) {
            jlaVar = ((e) wallpapersListActivity).simpleActionBar;
            if (jlaVar.z()) {
                longSparseArray.clear();
                jlaVar2 = ((e) wallpapersListActivity).simpleActionBar;
                jlaVar2.y();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = ob6.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                id idVar = alertDialog$Builder.a;
                idVar.S = G;
                idVar.U = ob6.a0("DeleteChatBackgroundsAlert", null, 2131751519, new Object[0]);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new vvc(this));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                wallpapersListActivity.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                }
            }
        } else if (i == 3) {
            uj3 uj3Var = new uj3(qd4.j(3, "onlySelect", "dialogsType", true));
            uj3Var.E2 = new vvc(this);
            wallpapersListActivity.presentFragment(uj3Var);
        }
    }
}
