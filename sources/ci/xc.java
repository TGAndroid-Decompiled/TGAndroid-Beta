package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xc {
    public long f5788a;
    public volatile long f5789b;
    public int f5790c;
    public volatile int f5791f;
    public volatile int f5792g;
    public final boolean h;
    public boolean f5793i;
    public long f5794j;
    public Path f5797m;
    public final zc f5798n;
    public final ArrayList d = new ArrayList();
    public boolean f5795k = false;
    public final Paint f5796l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public xc(zc zcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f5798n = zcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.vc.run():void");
            }
        });
    }

    public final void b() {
        this.f5793i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new uc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((wc) obj).f5726a;
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
        if (!this.f5795k && this.e != null && this.d.size() < this.f5790c) {
            this.f5795k = true;
            this.f5794j += this.f5789b;
            Utilities.themeQueue.cancelRunnable(new uc(this, 0));
            Utilities.themeQueue.postRunnable(new uc(this, 0));
        }
    }
}
