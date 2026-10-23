package lf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import i2.o1;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f16087r;
    public final boolean f16088s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f16087r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f16073a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f16074b = j10;
            this.f16075c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f16076f = c(1);
            this.f16077g = b(8);
            this.h = c(6);
            this.f16079j = b(0);
            b(10);
            this.f16080k = b(14);
            this.f16082m = c(4);
            byte[] embeddedPicture = this.f16087r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f16084o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f16084o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f16084o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f16084o;
                    this.f16085p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f16084o.getHeight() / max), true);
                } else {
                    this.f16085p = this.f16084o;
                }
            }
        } catch (Exception e) {
            this.f16088s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f16087r;
            if (mediaMetadataRetriever2 != null) {
                o1.u(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f16087r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f16087r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
