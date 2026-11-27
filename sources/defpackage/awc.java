package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.WallpapersListActivity;
public final class awc extends c79 {
    public final Context c;
    public final WallpapersListActivity d;

    public awc(WallpapersListActivity wallpapersListActivity, Context context) {
        this.d = wallpapersListActivity;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
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
    public final void t(defpackage.f89 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awc.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View skbVar;
        Context context = this.c;
        if (i != 0) {
            if (i != 3) {
                skbVar = new l22(this, context, (byte) 1);
                skbVar.setTag(-33024);
            } else {
                skbVar = new ilb(context);
            }
        } else {
            skbVar = new skb(context);
        }
        return new f89(skbVar);
    }
}
