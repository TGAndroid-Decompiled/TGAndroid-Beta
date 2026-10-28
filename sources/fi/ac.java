package fi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ac {
    public long f10526a;
    public volatile long f10527b;
    public int f10528c;
    public volatile int f10529f;
    public volatile int f10530g;
    public final boolean h;
    public boolean f10531i;
    public long f10532j;
    public Path f10535m;
    public final cc f10536n;
    public final ArrayList d = new ArrayList();
    public boolean f10533k = false;
    public final Paint f10534l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public ac(cc ccVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f10536n = ccVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: fi.yb.run():void");
            }
        });
    }

    public final void b() {
        this.f10531i = true;
        Utilities.themeQueue.cancelRunnable(new ua(this, 4));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((zb) obj).f12079a;
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
        if (!this.f10533k && this.e != null && this.d.size() < this.f10528c) {
            this.f10533k = true;
            this.f10532j += this.f10527b;
            Utilities.themeQueue.cancelRunnable(new ua(this, 4));
            Utilities.themeQueue.postRunnable(new ua(this, 4));
        }
    }
}
