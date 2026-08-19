package org.telegram.messenger.audioinfo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl$$ExternalSyntheticAutoCloseableDispatcher0;
import java.io.File;
import org.telegram.messenger.FileLog;

public class OtherAudioInfo extends AudioInfo {
    public boolean failed;
    private final MediaMetadataRetriever r;

    public OtherAudioInfo(File file) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.brand = "OTHER";
            this.version = "0";
            this.duration = getLong(9);
            this.title = getString(7);
            this.artist = getString(2);
            this.albumArtist = getString(13);
            this.album = getString(1);
            this.year = getShort(8);
            this.genre = getString(6);
            this.track = getShort(0);
            this.tracks = getShort(10);
            this.disc = getShort(14);
            this.composer = getString(4);
            byte[] embeddedPicture = mediaMetadataRetriever.getEmbeddedPicture();
            if (embeddedPicture != null) {
                this.cover = BitmapFactory.decodeByteArray(embeddedPicture, 0, embeddedPicture.length);
            }
            Bitmap bitmap = this.cover;
            if (bitmap != null) {
                float fMax = Math.max(bitmap.getWidth(), this.cover.getHeight()) / 120.0f;
                if (fMax > 0.0f) {
                    Bitmap bitmap2 = this.cover;
                    this.smallCover = Bitmap.createScaledBitmap(bitmap2, (int) (bitmap2.getWidth() / fMax), (int) (this.cover.getHeight() / fMax), true);
                } else {
                    this.smallCover = this.cover;
                }
            }
        } catch (Exception e) {
            this.failed = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.r;
            if (mediaMetadataRetriever2 != null) {
                FontProvider$ContentQueryWrapperApi24Impl$$ExternalSyntheticAutoCloseableDispatcher0.m(mediaMetadataRetriever2);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    private String getString(int i) {
        try {
            return this.r.extractMetadata(i);
        } catch (Exception unused) {
            return null;
        }
    }

    private short getShort(int i) {
        try {
            return Short.parseShort(this.r.extractMetadata(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    private long getLong(int i) {
        try {
            return Long.parseLong(this.r.extractMetadata(i));
        } catch (Exception unused) {
            return 0L;
        }
    }
}
