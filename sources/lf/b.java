package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f16018r;
    public final boolean f16019s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f16018r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f16004a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f16005b = j10;
            this.f16006c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f16007f = c(1);
            this.f16008g = b(8);
            this.h = c(6);
            this.f16010j = b(0);
            b(10);
            this.f16011k = b(14);
            this.f16013m = c(4);
            byte[] embeddedPicture = this.f16018r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f16015o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f16015o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f16015o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f16015o;
                    this.f16016p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f16015o.getHeight() / max), true);
                } else {
                    this.f16016p = this.f16015o;
                }
            }
        } catch (Exception e) {
            this.f16019s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f16018r;
            if (mediaMetadataRetriever2 != null) {
                i0.a.t(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f16018r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f16018r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
