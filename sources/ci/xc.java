package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xc {
    public long f5783a;
    public volatile long f5784b;
    public int f5785c;
    public volatile int f5786f;
    public volatile int f5787g;
    public final boolean h;
    public boolean f5788i;
    public long f5789j;
    public Path f5792m;
    public final zc f5793n;
    public final ArrayList d = new ArrayList();
    public boolean f5790k = false;
    public final Paint f5791l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public xc(zc zcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f5793n = zcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.vc.run():void");
            }
        });
    }

    public final void b() {
        this.f5788i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new uc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((wc) obj).f5721a;
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
        if (!this.f5790k && this.e != null && this.d.size() < this.f5785c) {
            this.f5790k = true;
            this.f5789j += this.f5784b;
            Utilities.themeQueue.cancelRunnable(new uc(this, 0));
            Utilities.themeQueue.postRunnable(new uc(this, 0));
        }
    }
}
