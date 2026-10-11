package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class uc {
    public long f6105a;
    public volatile long f6106b;
    public int f6107c;
    public volatile int f6109f;
    public volatile int f6110g;
    public final boolean h;
    public boolean f6111i;
    public long f6112j;
    public Path f6115m;
    public final wc f6116n;
    public final ArrayList d = new ArrayList();
    public boolean f6113k = false;
    public final Paint f6114l = new Paint(3);
    public MediaMetadataRetriever f6108e = new MediaMetadataRetriever();

    public uc(wc wcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f6116n = wcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.sc.run():void");
            }
        });
    }

    public final void b() {
        this.f6111i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new rc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((tc) obj).f6037a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f6108e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                this.f6108e = null;
                FileLog.e(e7);
            }
        }
    }

    public final void c() {
        if (!this.f6113k && this.f6108e != null && this.d.size() < this.f6107c) {
            this.f6113k = true;
            this.f6112j += this.f6106b;
            Utilities.themeQueue.cancelRunnable(new rc(this, 0));
            Utilities.themeQueue.postRunnable(new rc(this, 0));
        }
    }
}
