package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new m8.h(3);
    public final String f15998a;
    public final CharSequence f15999b;
    public final CharSequence f16000c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f16001f;
    public final Uri h;
    public final Bundle f16002n;
    public final Uri f16003r;
    public MediaDescription f16004s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f15998a = str;
        this.f15999b = charSequence;
        this.f16000c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f16002n = bundle;
        this.f16003r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f16004s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f15998a);
        builder.setTitle(this.f15999b);
        builder.setSubtitle(this.f16000c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f16002n);
        builder.setMediaUri(this.f16003r);
        MediaDescription build = builder.build();
        this.f16004s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f15999b) + ", " + ((Object) this.f16000c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
