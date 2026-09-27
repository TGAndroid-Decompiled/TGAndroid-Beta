package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class tc {
    public long f5598a;
    public volatile long f5599b;
    public int f5600c;
    public volatile int f5601f;
    public volatile int f5602g;
    public final boolean h;
    public boolean f5603i;
    public long f5604j;
    public Path f5607m;
    public final vc f5608n;
    public final ArrayList d = new ArrayList();
    public boolean f5605k = false;
    public final Paint f5606l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public tc(vc vcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f5608n = vcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.rc.run():void");
            }
        });
    }

    public final void b() {
        this.f5603i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new qc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((sc) obj).f5516a;
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
        if (!this.f5605k && this.e != null && this.d.size() < this.f5600c) {
            this.f5605k = true;
            this.f5604j += this.f5599b;
            Utilities.themeQueue.cancelRunnable(new qc(this, 0));
            Utilities.themeQueue.postRunnable(new qc(this, 0));
        }
    }
}
