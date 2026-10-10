package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new m8.h(3);
    public final String f16580a;
    public final CharSequence f16581b;
    public final CharSequence f16582c;
    public final CharSequence d;
    public final Bitmap f16583e;
    public final Uri f16584f;
    public final Bundle h;
    public final Uri f16585n;
    public MediaDescription f16586r;

    public l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16580a = str;
        this.f16581b = charSequence;
        this.f16582c = charSequence2;
        this.d = charSequence3;
        this.f16583e = bitmap;
        this.f16584f = uri;
        this.h = bundle;
        this.f16585n = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f16586r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f16580a);
        builder.setTitle(this.f16581b);
        builder.setSubtitle(this.f16582c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f16583e);
        builder.setIconUri(this.f16584f);
        builder.setExtras(this.h);
        builder.setMediaUri(this.f16585n);
        MediaDescription build = builder.build();
        this.f16586r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f16581b) + ", " + ((Object) this.f16582c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
