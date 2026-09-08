package kf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import i2.g;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f14942r;
    public final boolean f14943s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f14942r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f14927a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f14928b = j3;
            this.f14929c = c(7);
            this.d = c(2);
            this.f14930e = c(13);
            this.f14931f = c(1);
            this.f14932g = b(8);
            this.h = c(6);
            this.f14934j = b(0);
            b(10);
            this.f14935k = b(14);
            this.f14937m = c(4);
            byte[] embeddedPicture = this.f14942r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f14939o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f14939o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f14939o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f14939o;
                    this.f14940p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f14939o.getHeight() / max), true);
                } else {
                    this.f14940p = this.f14939o;
                }
            }
        } catch (Exception e7) {
            this.f14943s = true;
            FileLog.e(e7);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f14942r;
            if (mediaMetadataRetriever2 != null) {
                g.t(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f14942r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f14942r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
