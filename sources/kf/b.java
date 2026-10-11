package kf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import hg.c;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f14807r;
    public final boolean f14808s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f14807r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f14792a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f14793b = j3;
            this.f14794c = c(7);
            this.d = c(2);
            this.f14795e = c(13);
            this.f14796f = c(1);
            this.f14797g = b(8);
            this.h = c(6);
            this.f14799j = b(0);
            b(10);
            this.f14800k = b(14);
            this.f14802m = c(4);
            byte[] embeddedPicture = this.f14807r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f14804o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f14804o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f14804o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f14804o;
                    this.f14805p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f14804o.getHeight() / max), true);
                } else {
                    this.f14805p = this.f14804o;
                }
            }
        } catch (Exception e7) {
            this.f14808s = true;
            FileLog.e(e7);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f14807r;
            if (mediaMetadataRetriever2 != null) {
                c.r(mediaMetadataRetriever2);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f14807r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f14807r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
