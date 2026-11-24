package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
public final class ro6 extends MediaController.Callback {
    public final WeakReference a;

    public ro6(tu6 tu6Var) {
        this.a = new WeakReference(tu6Var);
    }

    @Override
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((tu6) this.a.get()) != null) {
            playbackInfo.getPlaybackType();
            playbackInfo.getAudioAttributes();
            if (Build.VERSION.SDK_INT >= 26) {
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
        }
    }

    @Override
    public final void onExtrasChanged(Bundle bundle) {
        mx6.D(bundle);
        tu6 tu6Var = (tu6) this.a.get();
    }

    @Override
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompat;
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            qt qtVar = MediaMetadataCompat.d;
            if (mediaMetadata != null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = mediaMetadata;
            } else {
                mediaMetadataCompat = null;
            }
            tu6Var.a(mediaMetadataCompat);
        }
    }

    @Override
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null && tu6Var.c == null) {
            tu6Var.b(PlaybackStateCompat.a(playbackState));
        }
    }

    @Override
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((tu6) this.a.get()) != null && list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.a(ix6.b(queueItem)), ix6.c(queueItem));
                } else {
                    mediaSessionCompat$QueueItem = null;
                }
                arrayList.add(mediaSessionCompat$QueueItem);
            }
        }
    }

    @Override
    public final void onQueueTitleChanged(CharSequence charSequence) {
        tu6 tu6Var = (tu6) this.a.get();
    }

    @Override
    public final void onSessionDestroyed() {
        tu6 tu6Var = (tu6) this.a.get();
        if (tu6Var != null) {
            tu6Var.d();
        }
    }

    @Override
    public final void onSessionEvent(String str, Bundle bundle) {
        mx6.D(bundle);
        tu6 tu6Var = (tu6) this.a.get();
    }
}
