package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class tc {
    public long f6025a;
    public volatile long f6026b;
    public int f6027c;
    public volatile int f6029f;
    public volatile int f6030g;
    public final boolean h;
    public boolean f6031i;
    public long f6032j;
    public Path f6035m;
    public final vc f6036n;
    public final ArrayList d = new ArrayList();
    public boolean f6033k = false;
    public final Paint f6034l = new Paint(3);
    public MediaMetadataRetriever f6028e = new MediaMetadataRetriever();

    public tc(vc vcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f6036n = vcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.rc.run():void");
            }
        });
    }

    public final void b() {
        this.f6031i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new qc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((sc) obj).f5935a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f6028e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                this.f6028e = null;
                FileLog.e(e7);
            }
        }
    }

    public final void c() {
        if (!this.f6033k && this.f6028e != null && this.d.size() < this.f6027c) {
            this.f6033k = true;
            this.f6032j += this.f6026b;
            Utilities.themeQueue.cancelRunnable(new qc(this, 0));
            Utilities.themeQueue.postRunnable(new qc(this, 0));
        }
    }
}
