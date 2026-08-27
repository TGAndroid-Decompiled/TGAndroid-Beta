package lh;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

public final class ac {

    public long f15657a;

    public volatile long f15658b;

    public int f15659c;

    public volatile int f15661f;

    public volatile int f15662g;
    public final boolean h;

    public boolean f15663i;

    public long f15664j;

    public Path f15667m;

    public final cc f15668n;
    public final ArrayList d = new ArrayList();

    public boolean f15665k = false;

    public final Paint f15666l = new Paint(3);

    public MediaMetadataRetriever f15660e = new MediaMetadataRetriever();

    public ac(cc ccVar, boolean z10, final String str, final int i10, final int i11, final Long l10, final long j10, final long j11, final long j12, final Runnable runnable) {
        this.f15668n = ccVar;
        this.h = z10;
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                int i12;
                int i13;
                float f10;
                int i14;
                ac acVar = this.f17127a;
                String str2 = str;
                Long l11 = l10;
                long j13 = j11;
                long j14 = j12;
                int i15 = i11;
                long j15 = j10;
                int i16 = i10;
                Runnable runnable2 = runnable;
                long maxScrollDuration = acVar.f15668n.getMaxScrollDuration();
                try {
                    acVar.f15660e.setDataSource(str2);
                    String strExtractMetadata = acVar.f15660e.extractMetadata(9);
                    if (strExtractMetadata != null) {
                        maxScrollDuration = Long.parseLong(strExtractMetadata);
                        acVar.f15657a = maxScrollDuration;
                    }
                    String strExtractMetadata2 = acVar.f15660e.extractMetadata(18);
                    i12 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
                    try {
                        String strExtractMetadata3 = acVar.f15660e.extractMetadata(19);
                        i13 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
                        try {
                            String strExtractMetadata4 = acVar.f15660e.extractMetadata(24);
                            if (strExtractMetadata4 != null && ((i14 = Integer.parseInt(strExtractMetadata4)) == 90 || i14 == 270)) {
                                int i17 = i13;
                                i13 = i12;
                                i12 = i17;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            acVar.f15660e = null;
                            FileLog.e(e);
                        }
                    } catch (Exception e10) {
                        e = e10;
                        i13 = 0;
                        acVar.f15660e = null;
                        FileLog.e(e);
                        int i18 = i13;
                        if (l11 != null) {
                            maxScrollDuration = l11.longValue();
                            acVar.f15657a = maxScrollDuration;
                        }
                        if (j13 != -1) {
                            maxScrollDuration = j14 - j13;
                        }
                        if (i12 != 0) {
                            f10 = 1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        float fClamp = Utilities.clamp(f10, 1.3333334f, 0.5625f);
                        acVar.f15662g = Math.max(1, i15);
                        acVar.f15661f = Math.max(1, (int) Math.ceil(i15 * fClamp));
                        int iCeil = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i16) / acVar.f15661f);
                        acVar.f15659c = iCeil;
                        acVar.f15658b = (long) (maxScrollDuration / iCeil);
                        acVar.f15664j = -acVar.f15658b;
                        if (j13 != -1) {
                            acVar.f15664j = j13 - acVar.f15658b;
                        }
                        acVar.c();
                        if (runnable2 != null) {
                            AndroidUtilities.runOnUIThread(runnable2);
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    i12 = 0;
                }
                int i19 = i13;
                if (l11 != null) {
                    maxScrollDuration = l11.longValue();
                    acVar.f15657a = maxScrollDuration;
                }
                if (j13 != -1 && j14 != -1) {
                    maxScrollDuration = j14 - j13;
                }
                if (i12 != 0 || i19 == 0) {
                    f10 = 1.0f;
                } else {
                    f10 = i12 / i19;
                }
                float fClamp2 = Utilities.clamp(f10, 1.3333334f, 0.5625f);
                acVar.f15662g = Math.max(1, i15);
                acVar.f15661f = Math.max(1, (int) Math.ceil(i15 * fClamp2));
                int iCeil2 = (int) Math.ceil(((Math.max(maxScrollDuration, j15) / j15) * i16) / acVar.f15661f);
                acVar.f15659c = iCeil2;
                acVar.f15658b = (long) (maxScrollDuration / iCeil2);
                acVar.f15664j = -acVar.f15658b;
                if (j13 != -1) {
                    acVar.f15664j = j13 - acVar.f15658b;
                }
                acVar.c();
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                }
            }
        });
    }

    public final void b() {
        this.f15663i = true;
        Utilities.themeQueue.cancelRunnable(new kh.c(this, 27));
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Bitmap bitmap = ((zb) obj).f17255a;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.d.clear();
        MediaMetadataRetriever mediaMetadataRetriever = this.f15660e;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception e9) {
                this.f15660e = null;
                FileLog.e(e9);
            }
        }
    }

    public final void c() {
        if (this.f15665k || this.f15660e == null || this.d.size() >= this.f15659c) {
            return;
        }
        this.f15665k = true;
        this.f15664j += this.f15658b;
        int i10 = 27;
        Utilities.themeQueue.cancelRunnable(new kh.c(this, i10));
        Utilities.themeQueue.postRunnable(new kh.c(this, i10));
    }
}
