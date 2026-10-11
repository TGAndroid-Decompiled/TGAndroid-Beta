package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new m8.h(3);
    public final String f16658a;
    public final CharSequence f16659b;
    public final CharSequence f16660c;
    public final CharSequence d;
    public final Bitmap f16661e;
    public final Uri f16662f;
    public final Bundle h;
    public final Uri f16663n;
    public MediaDescription f16664r;

    public l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16658a = str;
        this.f16659b = charSequence;
        this.f16660c = charSequence2;
        this.d = charSequence3;
        this.f16661e = bitmap;
        this.f16662f = uri;
        this.h = bundle;
        this.f16663n = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f16664r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f16658a);
        builder.setTitle(this.f16659b);
        builder.setSubtitle(this.f16660c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f16661e);
        builder.setIconUri(this.f16662f);
        builder.setExtras(this.h);
        builder.setMediaUri(this.f16663n);
        MediaDescription build = builder.build();
        this.f16664r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f16659b) + ", " + ((Object) this.f16660c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
