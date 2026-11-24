package defpackage;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class lt6 implements Parcelable {
    public static final Parcelable.Creator<lt6> CREATOR;
    public static final qt c;
    public static final String[] d;
    public final Bundle a;
    public MediaMetadata b;

    static {
        ?? ckaVar = new cka(0);
        c = ckaVar;
        ckaVar.put("android.media.metadata.TITLE", 1);
        ckaVar.put("android.media.metadata.ARTIST", 1);
        ckaVar.put("android.media.metadata.DURATION", 0);
        ckaVar.put("android.media.metadata.ALBUM", 1);
        ckaVar.put("android.media.metadata.AUTHOR", 1);
        ckaVar.put("android.media.metadata.WRITER", 1);
        ckaVar.put("android.media.metadata.COMPOSER", 1);
        ckaVar.put("android.media.metadata.COMPILATION", 1);
        ckaVar.put("android.media.metadata.DATE", 1);
        ckaVar.put("android.media.metadata.YEAR", 0);
        ckaVar.put("android.media.metadata.GENRE", 1);
        ckaVar.put("android.media.metadata.TRACK_NUMBER", 0);
        ckaVar.put("android.media.metadata.NUM_TRACKS", 0);
        ckaVar.put("android.media.metadata.DISC_NUMBER", 0);
        ckaVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        ckaVar.put("android.media.metadata.ART", 2);
        ckaVar.put("android.media.metadata.ART_URI", 1);
        ckaVar.put("android.media.metadata.ALBUM_ART", 2);
        ckaVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        ckaVar.put("android.media.metadata.USER_RATING", 3);
        ckaVar.put("android.media.metadata.RATING", 3);
        ckaVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        ckaVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        ckaVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        ckaVar.put("android.media.metadata.DISPLAY_ICON", 2);
        ckaVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        ckaVar.put("android.media.metadata.MEDIA_ID", 1);
        ckaVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        ckaVar.put("android.media.metadata.MEDIA_URI", 1);
        ckaVar.put("android.media.metadata.ADVERTISEMENT", 0);
        ckaVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION"};
        CREATOR = new f41((byte) 28);
    }

    public lt6(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.a = bundle2;
        ClassLoader classLoader = lx6.class.getClassLoader();
        classLoader.getClass();
        bundle2.setClassLoader(classLoader);
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }

    public lt6(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(lx6.class.getClassLoader());
        readBundle.getClass();
        this.a = readBundle;
    }
}
