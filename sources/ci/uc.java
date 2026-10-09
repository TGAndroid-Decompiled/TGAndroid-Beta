package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class uc {
    public long f6106a;
    public volatile long f6107b;
    public int f6108c;
    public volatile int f6110f;
    public volatile int f6111g;
    public final boolean h;
    public boolean f6112i;
    public long f6113j;
    public Path f6116m;
    public final wc f6117n;
    public final ArrayList d = new ArrayList();
    public boolean f6114k = false;
    public final Paint f6115l = new Paint(3);
    public MediaMetadataRetriever f6109e = new MediaMetadataRetriever();

    public uc(wc wcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f6117n = wcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.sc.run():void");
            }
        });
    }

    public final void b() {
        this.f6112i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new rc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((tc) obj).f6038a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f6109e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e7) {
                this.f6109e = null;
                FileLog.e(e7);
            }
        }
    }

    public final void c() {
        if (!this.f6114k && this.f6109e != null && this.d.size() < this.f6108c) {
            this.f6114k = true;
            this.f6113j += this.f6107b;
            Utilities.themeQueue.cancelRunnable(new rc(this, 0));
            Utilities.themeQueue.postRunnable(new rc(this, 0));
        }
    }
}
