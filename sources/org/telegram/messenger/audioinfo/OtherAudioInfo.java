package org.telegram.messenger.audioinfo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;

public class OtherAudioInfo extends AudioInfo {
    public boolean failed;
    private final MediaMetadataRetriever r;

    public OtherAudioInfo(File file) {
        Bitmap bitmap;
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
            if (this.cover != null) {
                float max = Math.max(r5.getWidth(), this.cover.getHeight()) / 120.0f;
                if (max > 0.0f) {
                    bitmap = Bitmap.createScaledBitmap(this.cover, (int) (r0.getWidth() / max), (int) (this.cover.getHeight() / max), true);
                } else {
                    bitmap = this.cover;
                }
                this.smallCover = bitmap;
            }
        } catch (Exception e) {
            this.failed = true;
            FileLog.e(e);
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = this.r;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    private long getLong(int i) {
        try {
            return Long.parseLong(this.r.extractMetadata(i));
        } catch (Exception unused) {
            return 0L;
        }
    }

    private short getShort(int i) {
        try {
            return Short.parseShort(this.r.extractMetadata(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    private String getString(int i) {
        try {
            return this.r.extractMetadata(i);
        } catch (Exception unused) {
            return null;
        }
    }
}
