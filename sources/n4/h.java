package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f17095a;
    public final CharSequence f17096b;
    public final CharSequence f17097c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f17098f;
    public final Uri h;
    public final Bundle f17099n;
    public final Uri f17100r;
    public MediaDescription f17101s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17095a = str;
        this.f17096b = charSequence;
        this.f17097c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f17099n = bundle;
        this.f17100r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f17101s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f17095a);
        builder.setTitle(this.f17096b);
        builder.setSubtitle(this.f17097c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f17099n);
        builder.setMediaUri(this.f17100r);
        MediaDescription build = builder.build();
        this.f17101s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f17096b) + ", " + ((Object) this.f17097c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
