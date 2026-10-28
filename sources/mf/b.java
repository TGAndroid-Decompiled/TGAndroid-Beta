package mf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f18435r;
    public final boolean f18436s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f18435r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f18421a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f18422b = j10;
            this.f18423c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f18424f = c(1);
            this.f18425g = b(8);
            this.h = c(6);
            this.f18427j = b(0);
            b(10);
            this.f18428k = b(14);
            this.f18430m = c(4);
            byte[] embeddedPicture = this.f18435r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f18432o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f18432o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f18432o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f18432o;
                    this.f18433p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f18432o.getHeight() / max), true);
                } else {
                    this.f18433p = this.f18432o;
                }
            }
        } catch (Exception e) {
            this.f18436s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f18435r;
            if (mediaMetadataRetriever2 != null) {
                ic.a.t(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f18435r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f18435r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
