package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new m8.h(3);
    public final String f16326a;
    public final CharSequence f16327b;
    public final CharSequence f16328c;
    public final CharSequence d;
    public final Bitmap f16329e;
    public final Uri f16330f;
    public final Bundle h;
    public final Uri f16331n;
    public MediaDescription f16332r;

    public m(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16326a = str;
        this.f16327b = charSequence;
        this.f16328c = charSequence2;
        this.d = charSequence3;
        this.f16329e = bitmap;
        this.f16330f = uri;
        this.h = bundle;
        this.f16331n = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f16332r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f16326a);
        builder.setTitle(this.f16327b);
        builder.setSubtitle(this.f16328c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f16329e);
        builder.setIconUri(this.f16330f);
        builder.setExtras(this.h);
        builder.setMediaUri(this.f16331n);
        MediaDescription build = builder.build();
        this.f16332r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f16327b) + ", " + ((Object) this.f16328c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
