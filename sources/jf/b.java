package jf;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import hg.k0;
import java.io.File;
import org.telegram.messenger.FileLog;
public final class b extends a {
    public final MediaMetadataRetriever f12994r;
    public final boolean f12995s;

    public b(File file) {
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f12994r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f12980a = "OTHER";
            try {
                j3 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j3 = 0;
            }
            this.f12981b = j3;
            this.f12982c = c(7);
            this.d = c(2);
            this.e = c(13);
            this.f12983f = c(1);
            this.f12984g = b(8);
            this.h = c(6);
            this.f12986j = b(0);
            b(10);
            this.f12987k = b(14);
            this.f12989m = c(4);
            byte[] embeddedPicture = this.f12994r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f12991o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f12991o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f12991o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f12991o;
                    this.f12992p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f12991o.getHeight() / max), true);
                } else {
                    this.f12992p = this.f12991o;
                }
            }
        } catch (Exception e) {
            this.f12995s = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f12994r;
            if (mediaMetadataRetriever2 != null) {
                k0.r(mediaMetadataRetriever2);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final short b(int i10) {
        try {
            return Short.parseShort(this.f12994r.extractMetadata(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i10) {
        try {
            return this.f12994r.extractMetadata(i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
