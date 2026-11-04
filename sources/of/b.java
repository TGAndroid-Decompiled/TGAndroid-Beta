package of;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import k2.p1;
import org.telegram.messenger.a8;
public final class b extends a {
    public final MediaMetadataRetriever f21052r;
    public final boolean f21053s;

    public b(File file) {
        long j10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.f21052r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.f21037a = "OTHER";
            try {
                j10 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j10 = 0;
            }
            this.f21038b = j10;
            this.f21039c = c(7);
            this.d = c(2);
            this.f21040e = c(13);
            this.f21041f = c(1);
            this.f21042g = b(8);
            this.h = c(6);
            this.f21044j = b(0);
            b(10);
            this.f21045k = b(14);
            this.f21047m = c(4);
            byte[] embeddedPicture = this.f21052r.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.f21049o = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.f21049o;
            if (bitmap != null) {
                float max = Math.max(bitmap.getWidth(), this.f21049o.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    Bitmap bitmap2 = this.f21049o;
                    this.f21050p = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / max), (int) (this.f21049o.getHeight() / max), true);
                } else {
                    this.f21050p = this.f21049o;
                }
            }
        } catch (Exception e10) {
            this.f21053s = true;
            a8.g(e10, true);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f21052r;
            if (mediaMetadataRetriever2 != null) {
                p1.s(mediaMetadataRetriever2);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final short b(int i3) {
        try {
            return Short.parseShort(this.f21052r.extractMetadata(i3));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String c(int i3) {
        try {
            return this.f21052r.extractMetadata(i3);
        } catch (Exception unused) {
            return null;
        }
    }
}
