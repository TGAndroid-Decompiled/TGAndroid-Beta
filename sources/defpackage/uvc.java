package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class uvc implements qvc {
    public final WallpapersListActivity a;

    public uvc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z) {
        pqb pqbVar = new pqb(new zvc(file, file, ""), bitmap, false);
        pqbVar.h1(0L);
        this.a.presentFragment(pqbVar, z);
    }

    @Override
    public final void a() {
    }
}
