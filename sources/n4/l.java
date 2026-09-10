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
    public final String f13790a;
    public final CharSequence f13791b;
    public final CharSequence f13792c;
    public final CharSequence d;
    public final Bitmap e;
    public final Uri f13793f;
    public final Bundle h;
    public final Uri f13794n;
    public MediaDescription f13795r;

    public l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f13790a = str;
        this.f13791b = charSequence;
        this.f13792c = charSequence2;
        this.d = charSequence3;
        this.e = bitmap;
        this.f13793f = uri;
        this.h = bundle;
        this.f13794n = uri2;
    }

    public final MediaDescription a() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f13795r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f13790a);
        builder.setTitle(this.f13791b);
        builder.setSubtitle(this.f13792c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.e);
        builder.setIconUri(this.f13793f);
        int i10 = Build.VERSION.SDK_INT;
        Bundle bundle2 = this.h;
        Uri uri = this.f13794n;
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
        this.f13795r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f13791b) + ", " + ((Object) this.f13792c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
