package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import i2.d;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f14681r;
    public final boolean f14682s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f14681r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f14667a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f14668b = j10;
            this.f14669c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f14670f = c(1);
            this.f14671g = b(8);
            this.h = c(6);
            this.f14673j = b(0);
            b(10);
            this.f14674k = b(14);
            this.f14676m = c(4);
            byte[] embeddedPicture = this.f14681r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f14678o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f14678o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f14678o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f14678o;
                    this.f14679p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f14678o.getHeight() / max), true);
                } else {
                    this.f14679p = this.f14678o;
                }
            }
        } catch (Exception e) {
            this.f14682s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f14681r;
            if (mediaMetadataRetriever2 != null) {
                d.r(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f14681r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f14681r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
