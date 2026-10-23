package ei;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ec {
    public long f8991a;
    public volatile long f8992b;
    public int f8993c;
    public volatile int f8994f;
    public volatile int f8995g;
    public final boolean h;
    public boolean f8996i;
    public long f8997j;
    public Path f9000m;
    public final gc f9001n;
    public final ArrayList d = new ArrayList();
    public boolean f8998k = false;
    public final Paint f8999l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ec(gc gcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f9001n = gcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ei.cc.run():void");
            }
        });
    }

    public final void b() {
        this.f8996i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new bc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((dc) obj).f8922a;
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
        if (!this.f8998k && this.e != null && this.d.size() < this.f8993c) {
            this.f8998k = true;
            this.f8997j += this.f8992b;
            Utilities.themeQueue.cancelRunnable(new bc(this, 0));
            Utilities.themeQueue.postRunnable(new bc(this, 0));
        }
    }
}
