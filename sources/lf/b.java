package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import i2.d;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f16023r;
    public final boolean f16024s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f16023r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f16009a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f16010b = j10;
            this.f16011c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f16012f = c(1);
            this.f16013g = b(8);
            this.h = c(6);
            this.f16015j = b(0);
            b(10);
            this.f16016k = b(14);
            this.f16018m = c(4);
            byte[] embeddedPicture = this.f16023r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f16020o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f16020o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f16020o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f16020o;
                    this.f16021p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f16020o.getHeight() / max), true);
                } else {
                    this.f16021p = this.f16020o;
                }
            }
        } catch (Exception e) {
            this.f16024s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f16023r;
            if (mediaMetadataRetriever2 != null) {
                d.t(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f16023r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f16023r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
