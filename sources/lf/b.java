package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import i2.e;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f16024r;
    public final boolean f16025s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f16024r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f16010a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f16011b = j10;
            this.f16012c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f16013f = c(1);
            this.f16014g = b(8);
            this.h = c(6);
            this.f16016j = b(0);
            b(10);
            this.f16017k = b(14);
            this.f16019m = c(4);
            byte[] embeddedPicture = this.f16024r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f16021o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f16021o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f16021o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f16021o;
                    this.f16022p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f16021o.getHeight() / max), true);
                } else {
                    this.f16022p = this.f16021o;
                }
            }
        } catch (Exception e) {
            this.f16025s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f16024r;
            if (mediaMetadataRetriever2 != null) {
                e.t(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f16024r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f16024r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
