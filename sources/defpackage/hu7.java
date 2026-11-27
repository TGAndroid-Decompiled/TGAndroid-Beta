package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
public final class hu7 extends h00 {
    public final MediaMetadataRetriever r;
    public final boolean s;

    public hu7(File file) {
        long j;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.a = "OTHER";
            try {
                j = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j = 0;
            }
            this.b = j;
            this.c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f = c(1);
            this.g = b(8);
            this.h = c(6);
            this.j = b(0);
            b(10);
            this.k = b(14);
            this.m = c(4);
            byte[] embeddedPicture = this.r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.o.getHeight()) / 120.0f;
                int i = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                Bitmap bitmap2 = this.o;
                if (i > 0) {
                    this.p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.o.getHeight() / max), true);
                } else {
                    this.p = bitmap2;
                }
            }
        } catch (Exception e) {
            this.s = true;
            cc4.g(e, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.r;
            if (mediaMetadataRetriever2 != null) {
                qu6.r(mediaMetadataRetriever2);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public final short b(int i) {
        try {
            return Short.parseShort(this.r.extractMetadata(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i) {
        try {
            return this.r.extractMetadata(i);
        } catch (Exception unused) {
            return null;
        }
    }
}
