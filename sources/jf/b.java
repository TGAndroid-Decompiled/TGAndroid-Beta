package jf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f11885r;
    public final boolean f11886s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f11885r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f11871a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f11872b = j3;
            this.f11873c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f11874f = c(1);
            this.f11875g = b(8);
            this.h = c(6);
            this.f11877j = b(0);
            b(10);
            this.f11878k = b(14);
            this.f11880m = c(4);
            byte[] embeddedPicture = this.f11885r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f11882o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f11882o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f11882o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f11882o;
                    this.f11883p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f11882o.getHeight() / max), true);
                } else {
                    this.f11883p = this.f11882o;
                }
            }
        } catch (Exception e) {
            this.f11886s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f11885r;
            if (mediaMetadataRetriever2 != null) {
                hc.b.t(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f11885r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f11885r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
