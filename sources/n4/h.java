package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new h8.j(26);
    public final String f18663a;
    public final CharSequence f18664b;
    public final CharSequence f18665c;
    public final CharSequence d;
    public final Bitmap e;
    public byte[] f18666f;
    public final Uri h;
    public final Bundle f18667n;
    public final Uri f18668r;
    public MediaDescription f18669s;

    public h(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f18663a = str;
        this.f18664b = charSequence;
        this.f18665c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.h = uri;
        this.f18667n = bundle;
        this.f18668r = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.f18669s;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f18663a);
        builder.setTitle(this.f18664b);
        builder.setSubtitle(this.f18665c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.h);
        builder.setExtras(this.f18667n);
        builder.setMediaUri(this.f18668r);
        MediaDescription build = builder.build();
        this.f18669s = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f18664b) + ", " + ((Object) this.f18665c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
