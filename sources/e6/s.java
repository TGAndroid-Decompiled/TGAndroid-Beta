package e6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends q6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f9766a;
    public int f9767b;
    public int f9768c;
    public int d;
    public int f9769e;
    public int f9770f;
    public int h;
    public int f9771n;
    public String f9772r;
    public int f9773s;
    public int f9774w;
    public String f9775x;
    public JSONObject f9776y;

    public s(float f10, int i3, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f9766a = f10;
        this.f9767b = i3;
        this.f9768c = i10;
        this.d = i11;
        this.f9769e = i12;
        this.f9770f = i13;
        this.h = i14;
        this.f9771n = i15;
        this.f9772r = str;
        this.f9773s = i16;
        this.f9774w = i17;
        this.f9775x = str2;
        if (str2 != null) {
            try {
                this.f9776y = new JSONObject(this.f9775x);
                return;
            } catch (JSONException unused) {
                this.f9776y = null;
                this.f9775x = null;
                return;
            }
        }
        this.f9776y = null;
    }

    public static final int c(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String d(int i3) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i3)), Integer.valueOf(Color.green(i3)), Integer.valueOf(Color.blue(i3)), Integer.valueOf(Color.alpha(i3)));
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f9766a);
            int i3 = this.f9767b;
            if (i3 != 0) {
                jSONObject.put("foregroundColor", d(i3));
            }
            int i10 = this.f9768c;
            if (i10 != 0) {
                jSONObject.put("backgroundColor", d(i10));
            }
            int i11 = this.d;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                jSONObject.put("edgeType", "DEPRESSED");
                            }
                        } else {
                            jSONObject.put("edgeType", "RAISED");
                        }
                    } else {
                        jSONObject.put("edgeType", "DROP_SHADOW");
                    }
                } else {
                    jSONObject.put("edgeType", "OUTLINE");
                }
            } else {
                jSONObject.put("edgeType", "NONE");
            }
            int i12 = this.f9769e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", d(i12));
            }
            int i13 = this.f9770f;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        jSONObject.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    jSONObject.put("windowType", "NORMAL");
                }
            } else {
                jSONObject.put("windowType", "NONE");
            }
            int i14 = this.h;
            if (i14 != 0) {
                jSONObject.put("windowColor", d(i14));
            }
            if (this.f9770f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f9771n);
            }
            String str = this.f9772r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f9773s) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i15 = this.f9774w;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            jSONObject.put("fontStyle", "BOLD_ITALIC");
                        }
                    } else {
                        jSONObject.put("fontStyle", "ITALIC");
                    }
                } else {
                    jSONObject.put("fontStyle", "BOLD");
                }
            } else {
                jSONObject.put("fontStyle", "NORMAL");
            }
            JSONObject jSONObject2 = this.f9776y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        JSONObject jSONObject = this.f9776y;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f9776y;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || w6.c.a(jSONObject, jSONObject2)) && this.f9766a == sVar.f9766a && this.f9767b == sVar.f9767b && this.f9768c == sVar.f9768c && this.d == sVar.d && this.f9769e == sVar.f9769e && this.f9770f == sVar.f9770f && this.h == sVar.h && this.f9771n == sVar.f9771n && i6.a.d(this.f9772r, sVar.f9772r) && this.f9773s == sVar.f9773s && this.f9774w == sVar.f9774w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9766a), Integer.valueOf(this.f9767b), Integer.valueOf(this.f9768c), Integer.valueOf(this.d), Integer.valueOf(this.f9769e), Integer.valueOf(this.f9770f), Integer.valueOf(this.h), Integer.valueOf(this.f9771n), this.f9772r, Integer.valueOf(this.f9773s), Integer.valueOf(this.f9774w), String.valueOf(this.f9776y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        String jSONObject;
        JSONObject jSONObject2 = this.f9776y;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f9775x = jSONObject;
        int s6 = j8.a.s(parcel, 20293);
        float f10 = this.f9766a;
        j8.a.r(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i10 = this.f9767b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.f9768c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f9769e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f9770f;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.h;
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.f9771n;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(i16);
        j8.a.m(parcel, 10, this.f9772r);
        int i17 = this.f9773s;
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.f9774w;
        j8.a.r(parcel, 12, 4);
        parcel.writeInt(i18);
        j8.a.m(parcel, 13, this.f9775x);
        j8.a.t(parcel, s6);
    }
}
