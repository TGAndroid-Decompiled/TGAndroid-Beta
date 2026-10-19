package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f17094a;
    public final CharSequence f17095b;
    public final CharSequence f17096c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f17097f;
    public final Uri h;
    public final Bundle f17098n;
    public final Uri f17099r;
    public MediaDescription f17100s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17094a = str;
        this.f17095b = charSequence;
        this.f17096c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f17098n = bundle;
        this.f17099r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f17100s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f17094a);
        builder.setTitle(this.f17095b);
        builder.setSubtitle(this.f17096c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f17098n);
        builder.setMediaUri(this.f17099r);
        MediaDescription build = builder.build();
        this.f17100s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f17095b) + ", " + ((Object) this.f17096c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
