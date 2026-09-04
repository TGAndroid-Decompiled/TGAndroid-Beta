package di;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xc {
    public long f8428a;
    public volatile long f8429b;
    public int f8430c;
    public volatile int f8432f;
    public volatile int f8433g;
    public final boolean h;
    public boolean f8434i;
    public long f8435j;
    public Path f8438m;
    public final zc f8439n;
    public final ArrayList d = new ArrayList();
    public boolean f8436k = false;
    public final Paint f8437l = new Paint(3);
    public MediaMetadataRetriever f8431e = new MediaMetadataRetriever();

    public xc(zc zcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f8439n = zcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: di.vc.run():void");
            }
        });
    }

    public final void b() {
        this.f8434i = true;
        Utilities.themeQueue.cancelRunnable(new nb(this, 6));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((wc) obj).f8355a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f8431e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                this.f8431e = null;
                FileLog.e(e7);
            }
        }
    }

    public final void c() {
        if (!this.f8436k && this.f8431e != null && this.d.size() < this.f8430c) {
            this.f8436k = true;
            this.f8435j += this.f8429b;
            Utilities.themeQueue.cancelRunnable(new nb(this, 6));
            Utilities.themeQueue.postRunnable(new nb(this, 6));
        }
    }
}
