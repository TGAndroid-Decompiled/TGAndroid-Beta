package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class xc {
    public long f5789a;
    public volatile long f5790b;
    public int f5791c;
    public volatile int f5792f;
    public volatile int f5793g;
    public final boolean h;
    public boolean f5794i;
    public long f5795j;
    public Path f5798m;
    public final zc f5799n;
    public final ArrayList d = new ArrayList();
    public boolean f5796k = false;
    public final Paint f5797l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public xc(zc zcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f5799n = zcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.vc.run():void");
            }
        });
    }

    public final void b() {
        this.f5794i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new uc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((wc) obj).f5727a;
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
        if (!this.f5796k && this.e != null && this.d.size() < this.f5791c) {
            this.f5796k = true;
            this.f5795j += this.f5790b;
            Utilities.themeQueue.cancelRunnable(new uc(this, 0));
            Utilities.themeQueue.postRunnable(new uc(this, 0));
        }
    }
}
