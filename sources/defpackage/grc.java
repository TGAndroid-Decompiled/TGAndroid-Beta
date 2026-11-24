package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.ui.WallpapersListActivity;
public final class grc implements crc {
    public final WallpapersListActivity a;

    public grc(WallpapersListActivity wallpapersListActivity) {
        this.a = wallpapersListActivity;
    }

    @Override
    public final void b(File file, Bitmap bitmap, boolean z) {
        qmb qmbVar = new qmb(new lrc(file, file, ""), bitmap, false);
        qmbVar.g1(0L);
        this.a.presentFragment(qmbVar, z);
    }

    @Override
    public final void a() {
    }
}
