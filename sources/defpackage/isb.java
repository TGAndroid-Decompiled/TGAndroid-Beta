package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class isb {
    public long a;
    public volatile long b;
    public int c;
    public volatile int f;
    public volatile int g;
    public final boolean h;
    public boolean i;
    public long j;
    public Path m;
    public final ksb n;
    public final ArrayList d = new ArrayList();
    public boolean k = false;
    public final Paint l = new Paint(3);
    public MediaMetadataRetriever e = new MediaMetadataRetriever();

    public isb(ksb ksbVar, boolean z, final String str, final int i, final int i2, final Long l, final long j, final long j2, final long j3, final Runnable runnable) {
        this.n = ksbVar;
        this.h = z;
        Utilities.i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: defpackage.gsb.run():void");
            }
        });
    }

    public final void a() {
        this.i = true;
        Utilities.i.a(new s8b(this, (byte) 26));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Bitmap bitmap = ((hsb) obj).a;
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
                cc4.g(e, true);
            }
        }
    }

    public final void b() {
        if (!this.k && this.e != null && this.d.size() < this.c) {
            this.k = true;
            this.j += this.b;
            Utilities.i.a(new s8b(this, (byte) 26));
            Utilities.i.c(new s8b(this, (byte) 26));
        }
    }
}
