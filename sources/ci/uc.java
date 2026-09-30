package ci;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class uc {
    public long f5651a;
    public volatile long f5652b;
    public int f5653c;
    public volatile int f5654f;
    public volatile int f5655g;
    public final boolean h;
    public boolean f5656i;
    public long f5657j;
    public Path f5660m;
    public final wc f5661n;
    public final ArrayList d = new ArrayList();
    public boolean f5658k = false;
    public final Paint f5659l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public uc(wc wcVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f5661n = wcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: ci.sc.run():void");
            }
        });
    }

    public final void b() {
        this.f5656i = true;
        int i10 = 0;
        Utilities.themeQueue.cancelRunnable(new rc(this, 0));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((tc) obj).f5590a;
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
        if (!this.f5658k && this.e != null && this.d.size() < this.f5653c) {
            this.f5658k = true;
            this.f5657j += this.f5652b;
            Utilities.themeQueue.cancelRunnable(new rc(this, 0));
            Utilities.themeQueue.postRunnable(new rc(this, 0));
        }
    }
}
