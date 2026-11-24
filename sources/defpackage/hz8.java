package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
public final class hz8 implements Parcelable {
    public static final Parcelable.Creator<hz8> CREATOR = new hv6((byte) 12);
    public final int a;
    public final float b;
    public Rating c;

    public hz8(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static hz8 c(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new hz8(6, f);
        }
        lad.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static hz8 d(float f, int i) {
        float f2;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    lad.c("Rating", "Invalid rating style (" + i + ") for a star rating");
                    return null;
                }
                f2 = 5.0f;
            } else {
                f2 = 4.0f;
            }
        } else {
            f2 = 3.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new hz8(i, f);
        }
        lad.c("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && b()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean b() {
        if (this.b >= 0.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
