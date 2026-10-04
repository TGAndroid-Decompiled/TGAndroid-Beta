package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class tc {
    public long f6024a;
    public volatile long f6025b;
    public int f6026c;
    public volatile int f6028f;
    public volatile int f6029g;
    public final boolean h;
    public boolean f6030i;
    public long f6031j;
    public Path f6034m;
    public final vc f6035n;
    public final ArrayList d = new ArrayList();
    public boolean f6032k = false;
    public final Paint f6033l = new Paint(3);
    public MediaMetadataRetriever f6027e = new MediaMetadataRetriever();

    public tc(vc vcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f6035n = vcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.rc.run():void");
            }
        });
    }

    public final void b() {
        this.f6030i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new qc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((sc) obj).f5934a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f6027e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                this.f6027e = null;
                FileLog.e(e7);
            }
        }
    }

    public final void c() {
        if (!this.f6032k && this.f6027e != null && this.d.size() < this.f6026c) {
            this.f6032k = true;
            this.f6031j += this.f6025b;
            Utilities.themeQueue.cancelRunnable(new qc(this, 0));
            Utilities.themeQueue.postRunnable(new qc(this, 0));
        }
    }
}
