package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class bb {
    public long f14287a;
    public volatile long f14288b;
    public int f14289c;
    public volatile int f14291f;
    public volatile int f14292g;
    public final boolean h;
    public boolean f14293i;
    public long f14294j;
    public Path f14297m;
    public final db f14298n;
    public final ArrayList d = new ArrayList();
    public boolean f14295k = false;
    public final Paint f14296l = new Paint(3);
    public MediaMetadataRetriever f14290e = new MediaMetadataRetriever();

    public bb(db dbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f14298n = dbVar;
        this.h = z10;
        Utilities.f22785i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: hi.za.run():void");
            }
        });
    }

    public final void b() {
        this.f14293i = true;
        Utilities.f22785i.a(new k(this, 24));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((ab) obj).f14251a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f14290e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f14290e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f14295k && this.f14290e != null && this.d.size() < this.f14289c) {
            this.f14295k = true;
            this.f14294j += this.f14288b;
            Utilities.f22785i.a(new k(this, 24));
            Utilities.f22785i.c(new k(this, 24));
        }
    }
}
