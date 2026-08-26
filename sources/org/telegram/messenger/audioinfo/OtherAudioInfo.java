package org.telegram.messenger.audioinfo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ArticleViewer;

public final class OtherAudioInfo extends AudioInfo {
    public final boolean failed;
    public final MediaMetadataRetriever r;

    public OtherAudioInfo(File file) {
        long j;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            this.brand = "OTHER";
            try {
                j = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            } catch (Exception unused) {
                j = 0;
            }
            this.duration = j;
            this.title = getString(7);
            this.artist = getString(2);
            this.albumArtist = getString(13);
            this.album = getString(1);
            this.year = getShort(8);
            this.genre = getString(6);
            this.track = getShort(0);
            getShort(10);
            this.disc = getShort(14);
            this.composer = getString(4);
            byte[] embeddedPicture = this.r.getEmbeddedPicture();
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
                ArticleViewer.IBlock.CC.m(mediaMetadataRetriever2);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public final short getShort(int i) {
        try {
            return Short.parseShort(this.r.extractMetadata(i));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    public final String getString(int i) {
        try {
            return this.r.extractMetadata(i);
        } catch (Exception unused) {
            return null;
        }
    }
}
