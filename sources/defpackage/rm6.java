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
public final class rm6 extends MediaController.Callback {
    public final WeakReference a;

    public rm6(ts6 ts6Var) {
        this.a = new WeakReference(ts6Var);
    }

    @Override
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((ts6) this.a.get()) != null) {
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
        mv6.B(bundle);
        ts6 ts6Var = (ts6) this.a.get();
    }

    @Override
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompat;
        ts6 ts6Var = (ts6) this.a.get();
        if (ts6Var != null) {
            ps psVar = MediaMetadataCompat.d;
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
            ts6Var.a(mediaMetadataCompat);
        }
    }

    @Override
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        ts6 ts6Var = (ts6) this.a.get();
        if (ts6Var != null && ts6Var.c == null) {
            ts6Var.b(PlaybackStateCompat.a(playbackState));
        }
    }

    @Override
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((ts6) this.a.get()) != null && list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.a(iv6.b(queueItem)), iv6.c(queueItem));
                } else {
                    mediaSessionCompat$QueueItem = null;
                }
                arrayList.add(mediaSessionCompat$QueueItem);
            }
        }
    }

    @Override
    public final void onQueueTitleChanged(CharSequence charSequence) {
        ts6 ts6Var = (ts6) this.a.get();
    }

    @Override
    public final void onSessionDestroyed() {
        ts6 ts6Var = (ts6) this.a.get();
        if (ts6Var != null) {
            ts6Var.d();
        }
    }

    @Override
    public final void onSessionEvent(String str, Bundle bundle) {
        mv6.B(bundle);
        ts6 ts6Var = (ts6) this.a.get();
    }
}
