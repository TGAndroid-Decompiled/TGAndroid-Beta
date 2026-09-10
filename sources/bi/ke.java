package bi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ke {
    public long f3022a;
    public volatile long f3023b;
    public int f3024c;
    public volatile int f3025f;
    public volatile int f3026g;
    public final boolean h;
    public boolean f3027i;
    public long f3028j;
    public Path f3031m;
    public final me f3032n;
    public final ArrayList d = new ArrayList();
    public boolean f3029k = false;
    public final Paint f3030l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ke(me meVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f3032n = meVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: bi.ie.run():void");
            }
        });
    }

    public final void b() {
        this.f3027i = true;
        Utilities.themeQueue.cancelRunnable(new wc(this, 6));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((je) obj).f2975a;
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
        if (!this.f3029k && this.e != null && this.d.size() < this.f3024c) {
            this.f3029k = true;
            this.f3028j += this.f3023b;
            Utilities.themeQueue.cancelRunnable(new wc(this, 6));
            Utilities.themeQueue.postRunnable(new wc(this, 6));
        }
    }
}
