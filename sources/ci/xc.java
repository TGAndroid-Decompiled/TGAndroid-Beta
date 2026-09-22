package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xc {
    public long f5785a;
    public volatile long f5786b;
    public int f5787c;
    public volatile int f5788f;
    public volatile int f5789g;
    public final boolean h;
    public boolean f5790i;
    public long f5791j;
    public Path f5794m;
    public final zc f5795n;
    public final ArrayList d = new ArrayList();
    public boolean f5792k = false;
    public final Paint f5793l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public xc(zc zcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f5795n = zcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.vc.run():void");
            }
        });
    }

    public final void b() {
        this.f5790i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new uc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((wc) obj).f5723a;
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
        if (!this.f5792k && this.e != null && this.d.size() < this.f5787c) {
            this.f5792k = true;
            this.f5791j += this.f5786b;
            Utilities.themeQueue.cancelRunnable(new uc(this, 0));
            Utilities.themeQueue.postRunnable(new uc(this, 0));
        }
    }
}
