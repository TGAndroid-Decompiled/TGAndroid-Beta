package kf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import hg.c;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f14808r;
    public final boolean f14809s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f14808r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f14793a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f14794b = j3;
            this.f14795c = c(7);
            this.d = c(2);
            this.f14796e = c(13);
            this.f14797f = c(1);
            this.f14798g = b(8);
            this.h = c(6);
            this.f14800j = b(0);
            b(10);
            this.f14801k = b(14);
            this.f14803m = c(4);
            byte[] embeddedPicture = this.f14808r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f14805o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f14805o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f14805o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f14805o;
                    this.f14806p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f14805o.getHeight() / max), true);
                } else {
                    this.f14806p = this.f14805o;
                }
            }
        } catch (Exception e7) {
            this.f14809s = true;
            FileLog.e(e7);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f14808r;
            if (mediaMetadataRetriever2 != null) {
                c.r(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f14808r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f14808r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
