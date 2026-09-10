package n4;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR;
    public static final a0.f f13796c;
    public static final String[] d;
    public final Bundle f13797a;
    public MediaMetadata f13798b;

    static {
        ?? lVar = new a0.l(0);
        f13796c = lVar;
        lVar.put("android.media.metadata.TITLE", 1);
        lVar.put("android.media.metadata.ARTIST", 1);
        lVar.put("android.media.metadata.DURATION", 0);
        lVar.put("android.media.metadata.ALBUM", 1);
        lVar.put("android.media.metadata.AUTHOR", 1);
        lVar.put("android.media.metadata.WRITER", 1);
        lVar.put("android.media.metadata.COMPOSER", 1);
        lVar.put("android.media.metadata.COMPILATION", 1);
        lVar.put("android.media.metadata.DATE", 1);
        lVar.put("android.media.metadata.YEAR", 0);
        lVar.put("android.media.metadata.GENRE", 1);
        lVar.put("android.media.metadata.TRACK_NUMBER", 0);
        lVar.put("android.media.metadata.NUM_TRACKS", 0);
        lVar.put("android.media.metadata.DISC_NUMBER", 0);
        lVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        lVar.put("android.media.metadata.ART", 2);
        lVar.put("android.media.metadata.ART_URI", 1);
        lVar.put("android.media.metadata.ALBUM_ART", 2);
        lVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        lVar.put("android.media.metadata.USER_RATING", 3);
        lVar.put("android.media.metadata.RATING", 3);
        lVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        lVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        lVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        lVar.put("android.media.metadata.DISPLAY_ICON", 2);
        lVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        lVar.put("android.media.metadata.MEDIA_ID", 1);
        lVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        lVar.put("android.media.metadata.MEDIA_URI", 1);
        lVar.put("android.media.metadata.ADVERTISEMENT", 0);
        lVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new m8.h(4);
    }

    public m(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f13797a = bundle2;
        y.i(bundle2);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f13797a);
    }

    public m(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(y.class.getClassLoader());
        readBundle.getClass();
        this.f13797a = readBundle;
    }
}
