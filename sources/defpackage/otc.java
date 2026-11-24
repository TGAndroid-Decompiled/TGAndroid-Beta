package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.WallpapersListActivity;
public final class otc extends q59 {
    public final Context c;
    public final WallpapersListActivity d;

    public otc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
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
    public final void t(defpackage.u69 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.otc.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View xibVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 3) {
                xibVar = new g32(this, context, (byte) 1);
                xibVar.setTag(-33024);
            } else {
                xibVar = new njb(context);
            }
        } else {
            xibVar = new xib(context);
        }
        return new u69(xibVar);
    }
}
