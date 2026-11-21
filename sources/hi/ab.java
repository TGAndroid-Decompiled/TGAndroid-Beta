package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ab {
    public long f14265a;
    public volatile long f14266b;
    public int f14267c;
    public volatile int f14269f;
    public volatile int f14270g;
    public final boolean h;
    public boolean f14271i;
    public long f14272j;
    public Path f14275m;
    public final cb f14276n;
    public final ArrayList d = new ArrayList();
    public boolean f14273k = false;
    public final Paint f14274l = new Paint(3);
    public MediaMetadataRetriever f14268e = new MediaMetadataRetriever();

    public ab(cb cbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f14276n = cbVar;
        this.h = z10;
        Utilities.f22810i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: hi.ya.run():void");
            }
        });
    }

    public final void b() {
        this.f14271i = true;
        Utilities.f22810i.a(new l(this, 24));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((za) obj).f15869a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f14268e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f14268e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f14273k && this.f14268e != null && this.d.size() < this.f14267c) {
            this.f14273k = true;
            this.f14272j += this.f14266b;
            Utilities.f22810i.a(new l(this, 24));
            Utilities.f22810i.c(new l(this, 24));
        }
    }
}
