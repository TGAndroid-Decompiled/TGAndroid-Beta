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
public final class vo6 extends MediaController.Callback {
    public final WeakReference a;

    public vo6(yu6 yu6Var) {
        this.a = new WeakReference(yu6Var);
    }

    @Override
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        if (((yu6) this.a.get()) != null) {
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
        rx6.D(bundle);
        yu6 yu6Var = (yu6) this.a.get();
    }

    @Override
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        MediaMetadataCompat mediaMetadataCompat;
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            qs qsVar = MediaMetadataCompat.d;
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
            yu6Var.a(mediaMetadataCompat);
        }
    }

    @Override
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null && yu6Var.c == null) {
            yu6Var.b(PlaybackStateCompat.a(playbackState));
        }
    }

    @Override
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        if (((yu6) this.a.get()) != null && list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.a(nx6.b(queueItem)), nx6.c(queueItem));
                } else {
                    mediaSessionCompat$QueueItem = null;
                }
                arrayList.add(mediaSessionCompat$QueueItem);
            }
        }
    }

    @Override
    public final void onQueueTitleChanged(CharSequence charSequence) {
        yu6 yu6Var = (yu6) this.a.get();
    }

    @Override
    public final void onSessionDestroyed() {
        yu6 yu6Var = (yu6) this.a.get();
        if (yu6Var != null) {
            yu6Var.d();
        }
    }

    @Override
    public final void onSessionEvent(String str, Bundle bundle) {
        rx6.D(bundle);
        yu6 yu6Var = (yu6) this.a.get();
    }
}
