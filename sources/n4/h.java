package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f17092a;
    public final CharSequence f17093b;
    public final CharSequence f17094c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f17095f;
    public final Uri h;
    public final Bundle f17096n;
    public final Uri f17097r;
    public MediaDescription f17098s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17092a = str;
        this.f17093b = charSequence;
        this.f17094c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f17096n = bundle;
        this.f17097r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f17098s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f17092a);
        builder.setTitle(this.f17093b);
        builder.setSubtitle(this.f17094c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f17096n);
        builder.setMediaUri(this.f17097r);
        MediaDescription build = builder.build();
        this.f17098s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f17093b) + ", " + ((Object) this.f17094c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
