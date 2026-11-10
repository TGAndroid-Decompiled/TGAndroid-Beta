package fi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class db {
    public long f11811a;
    public volatile long f11812b;
    public int f11813c;
    public volatile int f11815f;
    public volatile int f11816g;
    public final boolean h;
    public boolean f11817i;
    public long f11818j;
    public Path f11821m;
    public final fb f11822n;
    public final ArrayList d = new ArrayList();
    public boolean f11819k = false;
    public final Paint f11820l = new Paint(3);
    public MediaMetadataRetriever f11814e = new MediaMetadataRetriever();

    public db(fb fbVar, boolean z9, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f11822n = fbVar;
        this.h = z9;
        Utilities.f21344i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: fi.bb.run():void");
            }
        });
    }

    public final void b() {
        this.f11817i = true;
        Utilities.f21344i.a(new v9(this, 6));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((cb) obj).f11749a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f11814e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f11814e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f11819k && this.f11814e != null && this.d.size() < this.f11813c) {
            this.f11819k = true;
            this.f11818j += this.f11812b;
            Utilities.f21344i.a(new v9(this, 6));
            Utilities.f21344i.c(new v9(this, 6));
        }
    }
}
