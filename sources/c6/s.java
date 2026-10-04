package c6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import w7.g0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f4370a;
    public int f4371b;
    public int f4372c;
    public int d;
    public int f4373e;
    public int f4374f;
    public int h;
    public int f4375n;
    public String f4376r;
    public int f4377s;
    public int v;
    public String f4378w;
    public JSONObject f4379x;

    public s(float f7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f4370a = f7;
        this.f4371b = i10;
        this.f4372c = i11;
        this.d = i12;
        this.f4373e = i13;
        this.f4374f = i14;
        this.h = i15;
        this.f4375n = i16;
        this.f4376r = str;
        this.f4377s = i17;
        this.v = i18;
        this.f4378w = str2;
        if (str2 != null) {
            try {
                this.f4379x = new JSONObject(this.f4378w);
                return;
            } catch (JSONException unused) {
                this.f4379x = null;
                this.f4378w = null;
                return;
            }
        }
        this.f4379x = null;
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

    public static final String d(int i10) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Integer.valueOf(Color.alpha(i10)));
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f4370a);
            int i10 = this.f4371b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.f4372c;
            if (i11 != 0) {
                jSONObject.put("backgroundColor", d(i11));
            }
            int i12 = this.d;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
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
            int i13 = this.f4373e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", d(i13));
            }
            int i14 = this.f4374f;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 == 2) {
                        jSONObject.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    jSONObject.put("windowType", "NORMAL");
                }
            } else {
                jSONObject.put("windowType", "NONE");
            }
            int i15 = this.h;
            if (i15 != 0) {
                jSONObject.put("windowColor", d(i15));
            }
            if (this.f4374f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f4375n);
            }
            String str = this.f4376r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f4377s) {
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
            int i16 = this.v;
            if (i16 != 0) {
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
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
            JSONObject jSONObject2 = this.f4379x;
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
        JSONObject jSONObject = this.f4379x;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f4379x;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || u6.c.a(jSONObject, jSONObject2)) && this.f4370a == sVar.f4370a && this.f4371b == sVar.f4371b && this.f4372c == sVar.f4372c && this.d == sVar.d && this.f4373e == sVar.f4373e && this.f4374f == sVar.f4374f && this.h == sVar.h && this.f4375n == sVar.f4375n && g6.a.d(this.f4376r, sVar.f4376r) && this.f4377s == sVar.f4377s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4370a), Integer.valueOf(this.f4371b), Integer.valueOf(this.f4372c), Integer.valueOf(this.d), Integer.valueOf(this.f4373e), Integer.valueOf(this.f4374f), Integer.valueOf(this.h), Integer.valueOf(this.f4375n), this.f4376r, Integer.valueOf(this.f4377s), Integer.valueOf(this.v), String.valueOf(this.f4379x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4379x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4378w = jSONObject;
        int q6 = g0.q(parcel, 20293);
        float f7 = this.f4370a;
        g0.s(parcel, 2, 4);
        parcel.writeFloat(f7);
        int i11 = this.f4371b;
        g0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f4372c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        g0.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f4373e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f4374f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f4375n;
        g0.s(parcel, 9, 4);
        parcel.writeInt(i17);
        g0.l(parcel, 10, this.f4376r);
        int i18 = this.f4377s;
        g0.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        g0.s(parcel, 12, 4);
        parcel.writeInt(i19);
        g0.l(parcel, 13, this.f4378w);
        g0.r(parcel, q6);
    }
}
