package jf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import hg.c;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f12997r;
    public final boolean f12998s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f12997r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f12983a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f12984b = j3;
            this.f12985c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f12986f = c(1);
            this.f12987g = b(8);
            this.h = c(6);
            this.f12989j = b(0);
            b(10);
            this.f12990k = b(14);
            this.f12992m = c(4);
            byte[] embeddedPicture = this.f12997r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f12994o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f12994o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f12994o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f12994o;
                    this.f12995p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f12994o.getHeight() / max), true);
                } else {
                    this.f12995p = this.f12994o;
                }
            }
        } catch (Exception e) {
            this.f12998s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f12997r;
            if (mediaMetadataRetriever2 != null) {
                c.r(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f12997r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f12997r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
