package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class itc implements etc {
    public final WallpapersListActivity a;

    public itc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z) {
        rob robVar = new rob(new ntc(file, file, ""), bitmap, false);
        robVar.h1(0L);
        this.a.presentFragment(robVar, z);
    }

    @Override
    public final void a() {
    }
}
