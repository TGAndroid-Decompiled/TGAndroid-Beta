package cf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import c3.i0;
import java.io.File;
import org.telegram.messenger.f8;
public final class c extends a {
    public final MediaMetadataRetriever f4156r;
    public final boolean f4157s;

    public c(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f4156r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f4142a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f4143b = j10;
            this.f4144c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f4145f = c(1);
            this.f4146g = b(8);
            this.h = c(6);
            this.f4148j = b(0);
            b(10);
            this.f4149k = b(14);
            this.f4151m = c(4);
            byte[] embeddedPicture = this.f4156r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f4153o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f4153o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f4153o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f4153o;
                    this.f4154p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f4153o.getHeight() / max), true);
                } else {
                    this.f4154p = this.f4153o;
                }
            }
        } catch (Exception e) {
            this.f4157s = true;
            f8.g(e, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f4156r;
            if (mediaMetadataRetriever2 != null) {
                i0.p(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f4156r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f4156r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
