package nh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ob {
    public long f18315a;
    public volatile long f18316b;
    public int f18317c;
    public volatile int f18319f;
    public volatile int f18320g;
    public final boolean h;
    public boolean f18321i;
    public long f18322j;
    public Path f18325m;
    public final qb f18326n;
    public final ArrayList d = new ArrayList();
    public boolean f18323k = false;
    public final Paint f18324l = new Paint(3);
    public MediaMetadataRetriever f18318e = new MediaMetadataRetriever();

    public ob(qb qbVar, boolean z10, final String str, final int i10, final int i11, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f18326n = qbVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: nh.mb.run():void");
            }
        });
    }

    public final void b() {
        this.f18321i = true;
        Utilities.themeQueue.cancelRunnable(new m6(this, 11));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((nb) obj).f18203a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f18318e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f18318e = null;
                FileLog.e(e10);
            }
        }
    }

    public final void c() {
        if (!this.f18323k && this.f18318e != null && this.d.size() < this.f18317c) {
            this.f18323k = true;
            this.f18322j += this.f18316b;
            Utilities.themeQueue.cancelRunnable(new m6(this, 11));
            Utilities.themeQueue.postRunnable(new m6(this, 11));
        }
    }
}
