package hi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ab {
    public long f13900a;
    public volatile long f13901b;
    public int f13902c;
    public volatile int f13904f;
    public volatile int f13905g;
    public final boolean h;
    public boolean f13906i;
    public long f13907j;
    public Path f13910m;
    public final cb f13911n;
    public final ArrayList d = new ArrayList();
    public boolean f13908k = false;
    public final Paint f13909l = new Paint(3);
    public MediaMetadataRetriever f13903e = new MediaMetadataRetriever();

    public ab(cb cbVar, boolean z10, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f13911n = cbVar;
        this.h = z10;
        Utilities.f22419i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: hi.ya.run():void");
            }
        });
    }

    public final void b() {
        this.f13906i = true;
        Utilities.f22419i.a(new e1(this, 20));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((za) obj).f15528a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f13903e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f13903e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f13908k && this.f13903e != null && this.d.size() < this.f13902c) {
            this.f13908k = true;
            this.f13907j += this.f13901b;
            Utilities.f22419i.a(new e1(this, 20));
            Utilities.f22419i.c(new e1(this, 20));
        }
    }
}
