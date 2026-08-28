package kh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
public final class ec {
    public long f15180a;
    public volatile long f15181b;
    public int f15182c;
    public volatile int f15184f;
    public volatile int f15185g;
    public final boolean h;
    public boolean f15186i;
    public long f15187j;
    public Path f15190m;
    public final gc f15191n;
    public final ArrayList d = new ArrayList();
    public boolean f15188k = false;
    public final Paint f15189l = new Paint(3);
    public MediaMetadataRetriever f15183e = new MediaMetadataRetriever();

    public ec(gc gcVar, boolean z10, final String str, final int i9, final int i10, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f15191n = gcVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                throw new UnsupportedOperationException("Method not decompiled: kh.cc.run():void");
            }
        });
    }

    public final void b() {
        this.f15186i = true;
        Utilities.themeQueue.cancelRunnable(new f1(this, 20));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Bitmap bitmap = ((dc) obj).f15125a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f15183e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e10) {
                this.f15183e = null;
                FileLog.e(e10);
            }
        }
    }

    public final void c() {
        if (!this.f15188k && this.f15183e != null && this.d.size() < this.f15182c) {
            this.f15188k = true;
            this.f15187j += this.f15181b;
            Utilities.themeQueue.cancelRunnable(new f1(this, 20));
            Utilities.themeQueue.postRunnable(new f1(this, 20));
        }
    }
}
