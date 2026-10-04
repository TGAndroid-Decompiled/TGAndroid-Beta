package jf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import hg.c;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f14113r;
    public final boolean f14114s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f14113r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f14098a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f14099b = j3;
            this.f14100c = c(7);
            this.d = c(2);
            this.f14101e = c(13);
            this.f14102f = c(1);
            this.f14103g = b(8);
            this.h = c(6);
            this.f14105j = b(0);
            b(10);
            this.f14106k = b(14);
            this.f14108m = c(4);
            byte[] embeddedPicture = this.f14113r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f14110o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f14110o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f14110o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f14110o;
                    this.f14111p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f14110o.getHeight() / max), true);
                } else {
                    this.f14111p = this.f14110o;
                }
            }
        } catch (Exception e7) {
            this.f14114s = true;
            FileLog.e(e7);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f14113r;
            if (mediaMetadataRetriever2 != null) {
                c.r(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f14113r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f14113r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
