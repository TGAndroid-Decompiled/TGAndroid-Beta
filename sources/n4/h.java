package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f17091a;
    public final CharSequence f17092b;
    public final CharSequence f17093c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f17094f;
    public final Uri h;
    public final Bundle f17095n;
    public final Uri f17096r;
    public MediaDescription f17097s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f17091a = str;
        this.f17092b = charSequence;
        this.f17093c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f17095n = bundle;
        this.f17096r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f17097s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f17091a);
        builder.setTitle(this.f17092b);
        builder.setSubtitle(this.f17093c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f17095n);
        builder.setMediaUri(this.f17096r);
        MediaDescription build = builder.build();
        this.f17097s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f17092b) + ", " + ((Object) this.f17093c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
