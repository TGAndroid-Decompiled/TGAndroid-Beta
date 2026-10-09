package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new m8.h(3);
    public final String f16576a;
    public final CharSequence f16577b;
    public final CharSequence f16578c;
    public final CharSequence d;
    public final Bitmap f16579e;
    public final Uri f16580f;
    public final Bundle h;
    public final Uri f16581n;
    public MediaDescription f16582r;

    public l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16576a = str;
        this.f16577b = charSequence;
        this.f16578c = charSequence2;
        this.d = charSequence3;
        this.f16579e = bitmap;
        this.f16580f = uri;
        this.h = bundle;
        this.f16581n = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f16582r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f16576a);
        builder.setTitle(this.f16577b);
        builder.setSubtitle(this.f16578c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f16579e);
        builder.setIconUri(this.f16580f);
        builder.setExtras(this.h);
        builder.setMediaUri(this.f16581n);
        MediaDescription build = builder.build();
        this.f16582r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f16577b) + ", " + ((Object) this.f16578c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
