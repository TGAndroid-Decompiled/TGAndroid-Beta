package di;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class sc {
    public long f7800a;
    public volatile long f7801b;
    public int f7802c;
    public volatile int f7803f;
    public volatile int f7804g;
    public final boolean h;
    public boolean f7805i;
    public long f7806j;
    public Path f7809m;
    public final uc f7810n;
    public final ArrayList d = new ArrayList();
    public boolean f7807k = false;
    public final Paint f7808l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public sc(uc ucVar, boolean z10, final String str, final int i10, final int i11, final Long l4, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f7810n = ucVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: di.qc.run():void");
            }
        });
    }

    public final void b() {
        this.f7805i = true;
        Utilities.themeQueue.cancelRunnable(new x8(this, 9));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((rc) obj).f7731a;
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
        if (!this.f7807k && this.e != null && this.d.size() < this.f7802c) {
            this.f7807k = true;
            this.f7806j += this.f7801b;
            Utilities.themeQueue.cancelRunnable(new x8(this, 9));
            Utilities.themeQueue.postRunnable(new x8(this, 9));
        }
    }
}
