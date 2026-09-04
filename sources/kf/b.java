package kf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import i2.g;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f14916r;
    public final boolean f14917s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f14916r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f14901a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f14902b = j3;
            this.f14903c = c(7);
            this.d = c(2);
            this.f14904e = c(13);
            this.f14905f = c(1);
            this.f14906g = b(8);
            this.h = c(6);
            this.f14908j = b(0);
            b(10);
            this.f14909k = b(14);
            this.f14911m = c(4);
            byte[] embeddedPicture = this.f14916r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f14913o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f14913o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f14913o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f14913o;
                    this.f14914p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f14913o.getHeight() / max), true);
                } else {
                    this.f14914p = this.f14913o;
                }
            }
        } catch (Exception e7) {
            this.f14917s = true;
            FileLog.e(e7);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f14916r;
            if (mediaMetadataRetriever2 != null) {
                g.t(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f14916r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f14916r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
