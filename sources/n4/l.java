package n4;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new m8.h(3);
    public final String f15184a;
    public final CharSequence f15185b;
    public final CharSequence f15186c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f15187f;
    public final Bundle h;
    public final Uri f15188n;
    public MediaDescription f15189r;

    public l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f15184a = str;
        this.f15185b = charSequence;
        this.f15186c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f15187f = uri;
        this.h = bundle;
        this.f15188n = uri2;
    }

    public final MediaDescription a() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f15189r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f15184a);
        builder.setTitle(this.f15185b);
        builder.setSubtitle(this.f15186c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.f15187f);
        int i10 = Build.VERSION.SDK_INT;
        Bundle bundle2 = this.h;
        Uri uri = this.f15188n;
        if (i10 < 23 && uri != null) {
            if (bundle2 == null) {
                bundle = a4.a.i("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            } else {
                bundle = new Bundle(bundle2);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            builder.setExtras(bundle);
        } else {
            builder.setExtras(bundle2);
        }
        if (i10 >= 23) {
            e0.b.E(builder, uri);
        }
        MediaDescription build = builder.build();
        this.f15189r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f15185b) + ", " + ((Object) this.f15186c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
