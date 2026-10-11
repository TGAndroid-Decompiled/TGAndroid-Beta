package n4;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new m8.h(11);
    public final int f16649a;
    public final float f16650b;
    public Rating f16651c;

    public g0(int i10, float f7) {
        this.f16649a = i10;
        this.f16650b = f7;
    }

    public static g0 c(float f7) {
        if (f7 >= 0.0f && f7 <= 100.0f) {
            return new g0(6, f7);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static g0 d(float f7, int i10) {
        float f10;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    Log.e("Rating", "Invalid rating style (" + i10 + ") for a star rating");
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
            return new g0(i10, f7);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i10 = this.f16649a;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && b()) {
            return this.f16650b;
        }
        return -1.0f;
    }

    public final boolean b() {
        if (this.f16650b >= 0.0f) {
            return true;
        }
        return false;
    }

    @Override
    public final int describeContents() {
        return this.f16649a;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f16649a);
        sb2.append(" rating=");
        float f7 = this.f16650b;
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
        parcel.writeInt(this.f16649a);
        parcel.writeFloat(this.f16650b);
    }
}
