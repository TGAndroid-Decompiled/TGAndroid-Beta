package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new m8.h(3);
    public final String f16327a;
    public final CharSequence f16328b;
    public final CharSequence f16329c;
    public final CharSequence d;
    public final Bitmap f16330e;
    public final Uri f16331f;
    public final Bundle h;
    public final Uri f16332n;
    public MediaDescription f16333r;

    public m(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16327a = str;
        this.f16328b = charSequence;
        this.f16329c = charSequence2;
        this.d = charSequence3;
        this.f16330e = bitmap;
        this.f16331f = uri;
        this.h = bundle;
        this.f16332n = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f16333r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f16327a);
        builder.setTitle(this.f16328b);
        builder.setSubtitle(this.f16329c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f16330e);
        builder.setIconUri(this.f16331f);
        builder.setExtras(this.h);
        builder.setMediaUri(this.f16332n);
        MediaDescription build = builder.build();
        this.f16333r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f16328b) + ", " + ((Object) this.f16329c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
