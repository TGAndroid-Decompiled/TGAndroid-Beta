package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class bb {
    public long f14233a;
    public volatile long f14234b;
    public int f14235c;
    public volatile int f14237f;
    public volatile int f14238g;
    public final boolean h;
    public boolean f14239i;
    public long f14240j;
    public Path f14243m;
    public final db f14244n;
    public final ArrayList d = new ArrayList();
    public boolean f14241k = false;
    public final Paint f14242l = new Paint(3);
    public MediaMetadataRetriever f14236e = new MediaMetadataRetriever();

    public bb(db dbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f14244n = dbVar;
        this.h = z10;
        Utilities.f22777i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: hi.za.run():void");
            }
        });
    }

    public final void b() {
        this.f14239i = true;
        Utilities.f22777i.a(new b0(this, 23));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((ab) obj).f14201a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f14236e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f14236e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f14241k && this.f14236e != null && this.d.size() < this.f14235c) {
            this.f14241k = true;
            this.f14240j += this.f14234b;
            Utilities.f22777i.a(new b0(this, 23));
            Utilities.f22777i.c(new b0(this, 23));
        }
    }
}
