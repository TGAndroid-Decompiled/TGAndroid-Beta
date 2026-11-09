package fi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class db {
    public long f11807a;
    public volatile long f11808b;
    public int f11809c;
    public volatile int f11811f;
    public volatile int f11812g;
    public final boolean h;
    public boolean f11813i;
    public long f11814j;
    public Path f11817m;
    public final fb f11818n;
    public final ArrayList d = new ArrayList();
    public boolean f11815k = false;
    public final Paint f11816l = new Paint(3);
    public MediaMetadataRetriever f11810e = new MediaMetadataRetriever();

    public db(fb fbVar, boolean z9, final String str, final int i7, final int i10, final Long l10, final long j3, final long j10, final long j11, final Runnable runnable) {
        this.f11818n = fbVar;
        this.h = z9;
        Utilities.f21339i.c(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: fi.bb.run():void");
            }
        });
    }

    public final void b() {
        this.f11813i = true;
        Utilities.f21339i.a(new v9(this, 6));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Bitmap bitmap = ((cb) obj).f11745a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f11810e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f11810e = null;
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void c() {
        if (!this.f11815k && this.f11810e != null && this.d.size() < this.f11809c) {
            this.f11815k = true;
            this.f11814j += this.f11808b;
            Utilities.f21339i.a(new v9(this, 6));
            Utilities.f21339i.c(new v9(this, 6));
        }
    }
}
