package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
public final class i19 implements Parcelable {
    public static final Parcelable.Creator<i19> CREATOR = new hx6((byte) 12);
    public final int a;
    public final float b;
    public Rating c;

    public i19(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static i19 c(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new i19(6, f);
        }
        ncd.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static i19 d(float f, int i) {
        float f2;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    ncd.c("Rating", "Invalid rating style (" + i + ") for a star rating");
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
            return new i19(i, f);
        }
        ncd.c("Rating", "Trying to set out of range star-based rating");
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
