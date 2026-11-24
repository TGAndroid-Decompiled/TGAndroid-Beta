package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.WallpapersListActivity;
public final class mrc extends n39 {
    public final Context c;
    public final WallpapersListActivity d;

    public mrc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.a;
    }

    @Override
    public final int d(int i) {
        int i2;
        WallpapersListActivity wallpapersListActivity = this.d;
        i2 = wallpapersListActivity.uploadImageRow;
        if (i != i2 && i != wallpapersListActivity.h && i != wallpapersListActivity.b && i != wallpapersListActivity.e) {
            if (i != wallpapersListActivity.f && i != wallpapersListActivity.n) {
                return 2;
            }
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(defpackage.s49 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrc.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View wgbVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 3) {
                wgbVar = new u12(this, context, (byte) 1);
                wgbVar.setTag(-33024);
            } else {
                wgbVar = new mhb(context);
            }
        } else {
            wgbVar = new wgb(context);
        }
        return new s49(wgbVar);
    }
}
