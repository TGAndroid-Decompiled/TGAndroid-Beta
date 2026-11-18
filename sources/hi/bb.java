package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class bb {
    public long f14284a;
    public volatile long f14285b;
    public int f14286c;
    public volatile int f14288f;
    public volatile int f14289g;
    public final boolean h;
    public boolean f14290i;
    public long f14291j;
    public Path f14294m;
    public final db f14295n;
    public final ArrayList d = new ArrayList();
    public boolean f14292k = false;
    public final Paint f14293l = new Paint(3);
    public MediaMetadataRetriever f14287e = new MediaMetadataRetriever();

    public bb(db dbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f14295n = dbVar;
        this.h = z10;
        Utilities.f22782i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: hi.za.run():void");
            }
        });
    }

    public final void b() {
        this.f14290i = true;
        Utilities.f22782i.a(new k(this, 24));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((ab) obj).f14248a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f14287e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f14287e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f14292k && this.f14287e != null && this.d.size() < this.f14286c) {
            this.f14292k = true;
            this.f14291j += this.f14285b;
            Utilities.f22782i.a(new k(this, 24));
            Utilities.f22782i.c(new k(this, 24));
        }
    }
}
