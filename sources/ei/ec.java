package ei;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ec {
    public long f8983a;
    public volatile long f8984b;
    public int f8985c;
    public volatile int f8986f;
    public volatile int f8987g;
    public final boolean h;
    public boolean f8988i;
    public long f8989j;
    public Path f8992m;
    public final gc f8993n;
    public final ArrayList d = new ArrayList();
    public boolean f8990k = false;
    public final Paint f8991l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ec(gc gcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f8993n = gcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ei.cc.run():void");
            }
        });
    }

    public final void b() {
        this.f8988i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new bc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((dc) obj).f8914a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e) {
                this.e = null;
                FileLog.e(e);
            }
        }
    }

    public final void c() {
        if (!this.f8990k && this.e != null && this.d.size() < this.f8985c) {
            this.f8990k = true;
            this.f8989j += this.f8984b;
            Utilities.themeQueue.cancelRunnable(new bc(this, 0));
            Utilities.themeQueue.postRunnable(new bc(this, 0));
        }
    }
}
