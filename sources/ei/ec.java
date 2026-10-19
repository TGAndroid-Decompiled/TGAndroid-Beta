package ei;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ec {
    public long f8980a;
    public volatile long f8981b;
    public int f8982c;
    public volatile int f8983f;
    public volatile int f8984g;
    public final boolean h;
    public boolean f8985i;
    public long f8986j;
    public Path f8989m;
    public final gc f8990n;
    public final ArrayList d = new ArrayList();
    public boolean f8987k = false;
    public final Paint f8988l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ec(gc gcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f8990n = gcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ei.cc.run():void");
            }
        });
    }

    public final void b() {
        this.f8985i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new bc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((dc) obj).f8911a;
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
        if (!this.f8987k && this.e != null && this.d.size() < this.f8982c) {
            this.f8987k = true;
            this.f8986j += this.f8981b;
            Utilities.themeQueue.cancelRunnable(new bc(this, 0));
            Utilities.themeQueue.postRunnable(new bc(this, 0));
        }
    }
}
