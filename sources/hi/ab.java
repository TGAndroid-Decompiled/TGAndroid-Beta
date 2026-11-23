package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ab {
    public long f14268a;
    public volatile long f14269b;
    public int f14270c;
    public volatile int f14272f;
    public volatile int f14273g;
    public final boolean h;
    public boolean f14274i;
    public long f14275j;
    public Path f14278m;
    public final cb f14279n;
    public final ArrayList d = new ArrayList();
    public boolean f14276k = false;
    public final Paint f14277l = new Paint(3);
    public MediaMetadataRetriever f14271e = new MediaMetadataRetriever();

    public ab(cb cbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f14279n = cbVar;
        this.h = z10;
        Utilities.f22813i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: hi.ya.run():void");
            }
        });
    }

    public final void b() {
        this.f14274i = true;
        Utilities.f22813i.a(new l(this, 24));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((za) obj).f15872a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f14271e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f14271e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f14276k && this.f14271e != null && this.d.size() < this.f14270c) {
            this.f14276k = true;
            this.f14275j += this.f14269b;
            Utilities.f22813i.a(new l(this, 24));
            Utilities.f22813i.c(new l(this, 24));
        }
    }
}
