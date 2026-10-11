package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new m8.h(3);
    public final String f16622a;
    public final CharSequence f16623b;
    public final CharSequence f16624c;
    public final CharSequence d;
    public final Bitmap f16625e;
    public final Uri f16626f;
    public final Bundle h;
    public final Uri f16627n;
    public MediaDescription f16628r;

    public l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16622a = str;
        this.f16623b = charSequence;
        this.f16624c = charSequence2;
        this.d = charSequence3;
        this.f16625e = bitmap;
        this.f16626f = uri;
        this.h = bundle;
        this.f16627n = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f16628r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f16622a);
        builder.setTitle(this.f16623b);
        builder.setSubtitle(this.f16624c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f16625e);
        builder.setIconUri(this.f16626f);
        builder.setExtras(this.h);
        builder.setMediaUri(this.f16627n);
        MediaDescription build = builder.build();
        this.f16628r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f16623b) + ", " + ((Object) this.f16624c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
