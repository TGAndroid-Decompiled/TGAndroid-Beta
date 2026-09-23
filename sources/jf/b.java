package jf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import hg.c;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f12982r;
    public final boolean f12983s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f12982r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f12968a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f12969b = j3;
            this.f12970c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f12971f = c(1);
            this.f12972g = b(8);
            this.h = c(6);
            this.f12974j = b(0);
            b(10);
            this.f12975k = b(14);
            this.f12977m = c(4);
            byte[] embeddedPicture = this.f12982r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f12979o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f12979o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f12979o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f12979o;
                    this.f12980p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f12979o.getHeight() / max), true);
                } else {
                    this.f12980p = this.f12979o;
                }
            }
        } catch (Exception e) {
            this.f12983s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f12982r;
            if (mediaMetadataRetriever2 != null) {
                c.t(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f12982r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f12982r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
