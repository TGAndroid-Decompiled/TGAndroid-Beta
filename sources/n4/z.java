package n4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new m8.h(9);
    public final int f15765a;
    public final float f15766b;
    public Rating f15767c;

    public z(int i10, float f7) {
        this.f15765a = i10;
        this.f15766b = f7;
    }

    public static z c(float f7) {
        if (f7 >= 0.0f && f7 <= 100.0f) {
            return new z(6, f7);
        }
        e2.a.c("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static z d(float f7, int i10) {
        float f10;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    e2.a.c("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                    return null;
                }
                f10 = 5.0f;
            } else {
                f10 = 4.0f;
            }
        } else {
            f10 = 3.0f;
        }
        if (f7 >= 0.0f && f7 <= f10) {
            return new z(i10, f7);
        }
        e2.a.c("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i10 = this.f15765a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && b()) {
            return this.f15766b;
        }
        return -1.0f;
    }

    public final boolean b() {
        if (this.f15766b >= 0.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final int describeContents() {
        return this.f15765a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f15765a);
        sb2.append(" rating=");
        float f7 = this.f15766b;
        if (f7 < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f7);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15765a);
        parcel.writeFloat(this.f15766b);
    }
}
