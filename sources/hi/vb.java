package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class vb {
    public long f15618a;
    public volatile long f15619b;
    public int f15620c;
    public volatile int f15622f;
    public volatile int f15623g;
    public final boolean h;
    public boolean f15624i;
    public long f15625j;
    public Path f15628m;
    public final xb f15629n;
    public final ArrayList d = new ArrayList();
    public boolean f15626k = false;
    public final Paint f15627l = new Paint(3);
    public MediaMetadataRetriever f15621e = new MediaMetadataRetriever();

    public vb(xb xbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f15629n = xbVar;
        this.h = z10;
        Utilities.f22880i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: hi.tb.run():void");
            }
        });
    }

    public final void b() {
        this.f15624i = true;
        Utilities.f22880i.a(new w(this, 24));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((ub) obj).f15534a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f15621e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f15621e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f15626k && this.f15621e != null && this.d.size() < this.f15620c) {
            this.f15626k = true;
            this.f15625j += this.f15619b;
            Utilities.f22880i.a(new w(this, 24));
            Utilities.f22880i.c(new w(this, 24));
        }
    }
}
