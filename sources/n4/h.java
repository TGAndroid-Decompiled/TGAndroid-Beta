package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f17088a;
    public final CharSequence f17089b;
    public final CharSequence f17090c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f17091f;
    public final Uri h;
    public final Bundle f17092n;
    public final Uri f17093r;
    public MediaDescription f17094s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17088a = str;
        this.f17089b = charSequence;
        this.f17090c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f17092n = bundle;
        this.f17093r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f17094s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f17088a);
        builder.setTitle(this.f17089b);
        builder.setSubtitle(this.f17090c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f17092n);
        builder.setMediaUri(this.f17093r);
        MediaDescription build = builder.build();
        this.f17094s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f17089b) + ", " + ((Object) this.f17090c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
