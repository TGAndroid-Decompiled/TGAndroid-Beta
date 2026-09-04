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
    public final String f16459a;
    public final CharSequence f16460b;
    public final CharSequence f16461c;
    public final CharSequence d;
    public final Bitmap f16462e;
    public final Uri f16463f;
    public final Bundle h;
    public final Uri f16464n;
    public MediaDescription f16465r;

    public l(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f16459a = str;
        this.f16460b = charSequence;
        this.f16461c = charSequence2;
        this.d = charSequence3;
        this.f16462e = bitmap;
        this.f16463f = uri;
        this.h = bundle;
        this.f16464n = uri2;
    }

    public final MediaDescription a() {
        Bundle bundle;
        MediaDescription mediaDescription = this.f16465r;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f16459a);
        builder.setTitle(this.f16460b);
        builder.setSubtitle(this.f16461c);
        builder.setDescription(this.d);
        builder.setIconBitmap(this.f16462e);
        builder.setIconUri(this.f16463f);
        int i10 = Build.VERSION.SDK_INT;
        Bundle bundle2 = this.h;
        Uri uri = this.f16464n;
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
        this.f16465r = build;
        return build;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f16460b) + ", " + ((Object) this.f16461c) + ", " + ((Object) this.d);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        a().writeToParcel(parcel, i10);
    }
}
