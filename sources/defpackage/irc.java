package defpackage;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;
public final class irc extends c6 {
    public final WallpapersListActivity a;

    public irc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void b(int i) {
        pha phaVar;
        pha phaVar2;
        WallpapersListActivity wallpapersListActivity = this.a;
        LongSparseArray longSparseArray = wallpapersListActivity.f0;
        if (i == -1) {
            phaVar = ((d) wallpapersListActivity).simpleActionBar;
            if (phaVar.x()) {
                longSparseArray.clear();
                phaVar2 = ((d) wallpapersListActivity).simpleActionBar;
                phaVar2.w();
                wallpapersListActivity.H0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = k96.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = G;
                hdVar.U = k96.a0("DeleteChatBackgroundsAlert", null, 2131751542, new Object[0]);
                alertDialog$Builder.j(k96.M0(2131751586, null), new hrc(this));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                wallpapersListActivity.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                }
            }
        } else if (i == 3) {
            cj3 cj3Var = new cj3(tb4.j(3, "onlySelect", "dialogsType", true));
            cj3Var.E2 = new hrc(this);
            wallpapersListActivity.presentFragment(cj3Var);
        }
    }
}
