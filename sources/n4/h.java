package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.i(2);
    public final String f13498a;
    public final CharSequence f13499b;
    public final CharSequence f13500c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f13501f;
    public final Uri h;
    public final Bundle f13502n;
    public final Uri f13503r;
    public MediaDescription f13504s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f13498a = str;
        this.f13499b = charSequence;
        this.f13500c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f13502n = bundle;
        this.f13503r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f13504s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f13498a);
        builder.setTitle(this.f13499b);
        builder.setSubtitle(this.f13500c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f13502n);
        builder.setMediaUri(this.f13503r);
        MediaDescription build = builder.build();
        this.f13504s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f13499b) + ", " + ((Object) this.f13500c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
