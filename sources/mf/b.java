package mf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f18436r;
    public final boolean f18437s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f18436r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f18422a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f18423b = j10;
            this.f18424c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f18425f = c(1);
            this.f18426g = b(8);
            this.h = c(6);
            this.f18428j = b(0);
            b(10);
            this.f18429k = b(14);
            this.f18431m = c(4);
            byte[] embeddedPicture = this.f18436r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f18433o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f18433o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f18433o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f18433o;
                    this.f18434p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f18433o.getHeight() / max), true);
                } else {
                    this.f18434p = this.f18433o;
                }
            }
        } catch (Exception e) {
            this.f18437s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f18436r;
            if (mediaMetadataRetriever2 != null) {
                ic.a.t(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f18436r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f18436r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
