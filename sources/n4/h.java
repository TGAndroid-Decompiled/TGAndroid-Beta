package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f15712a;
    public final CharSequence f15713b;
    public final CharSequence f15714c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f15715f;
    public final Uri h;
    public final Bundle f15716n;
    public final Uri f15717r;
    public MediaDescription f15718s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f15712a = str;
        this.f15713b = charSequence;
        this.f15714c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f15716n = bundle;
        this.f15717r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f15718s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f15712a);
        builder.setTitle(this.f15713b);
        builder.setSubtitle(this.f15714c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f15716n);
        builder.setMediaUri(this.f15717r);
        MediaDescription build = builder.build();
        this.f15718s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f15713b) + ", " + ((Object) this.f15714c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
