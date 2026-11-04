package gi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class db {
    public long f12602a;
    public volatile long f12603b;
    public int f12604c;
    public volatile int f12606f;
    public volatile int f12607g;
    public final boolean h;
    public boolean f12608i;
    public long f12609j;
    public Path f12612m;
    public final fb f12613n;
    public final ArrayList d = new ArrayList();
    public boolean f12610k = false;
    public final Paint f12611l = new Paint(3);
    public MediaMetadataRetriever f12605e = new MediaMetadataRetriever();

    public db(fb fbVar, boolean z10, final String str, final int i3, final int i10, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f12613n = fbVar;
        this.h = z10;
        Utilities.f21390i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: gi.bb.run():void");
            }
        });
    }

    public final void b() {
        this.f12608i = true;
        Utilities.f21390i.a(new f6(this, 11));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Bitmap bitmap = ((cb) obj).f12509a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f12605e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f12605e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f12610k && this.f12605e != null && this.d.size() < this.f12604c) {
            this.f12610k = true;
            this.f12609j += this.f12603b;
            Utilities.f21390i.a(new f6(this, 11));
            Utilities.f21390i.c(new f6(this, 11));
        }
    }
}
