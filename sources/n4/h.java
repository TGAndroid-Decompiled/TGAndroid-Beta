package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f17155a;
    public final CharSequence f17156b;
    public final CharSequence f17157c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f17158f;
    public final Uri h;
    public final Bundle f17159n;
    public final Uri f17160r;
    public MediaDescription f17161s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17155a = str;
        this.f17156b = charSequence;
        this.f17157c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f17159n = bundle;
        this.f17160r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f17161s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f17155a);
        builder.setTitle(this.f17156b);
        builder.setSubtitle(this.f17157c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f17159n);
        builder.setMediaUri(this.f17160r);
        MediaDescription build = builder.build();
        this.f17161s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f17156b) + ", " + ((Object) this.f17157c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
