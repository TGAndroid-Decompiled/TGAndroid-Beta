package di;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xc {
    public long f8456a;
    public volatile long f8457b;
    public int f8458c;
    public volatile int f8460f;
    public volatile int f8461g;
    public final boolean h;
    public boolean f8462i;
    public long f8463j;
    public Path f8466m;
    public final zc f8467n;
    public final ArrayList d = new ArrayList();
    public boolean f8464k = false;
    public final Paint f8465l = new Paint(3);
    public MediaMetadataRetriever f8459e = new MediaMetadataRetriever();

    public xc(zc zcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f8467n = zcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: di.vc.run():void");
            }
        });
    }

    public final void b() {
        this.f8462i = true;
        Utilities.themeQueue.cancelRunnable(new nb(this, 6));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((wc) obj).f8383a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f8459e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                this.f8459e = null;
                FileLog.e(e7);
            }
        }
    }

    public final void c() {
        if (!this.f8464k && this.f8459e != null && this.d.size() < this.f8458c) {
            this.f8464k = true;
            this.f8463j += this.f8457b;
            Utilities.themeQueue.cancelRunnable(new nb(this, 6));
            Utilities.themeQueue.postRunnable(new nb(this, 6));
        }
    }
}
