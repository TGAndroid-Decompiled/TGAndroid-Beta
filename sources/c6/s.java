package c6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import w7.h0;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f3934a;
    public int f3935b;
    public int f3936c;
    public int d;
    public int e;
    public int f3937f;
    public int h;
    public int f3938n;
    public String f3939r;
    public int f3940s;
    public int f3941w;
    public String f3942x;
    public JSONObject f3943y;

    public s(float f7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f3934a = f7;
        this.f3935b = i10;
        this.f3936c = i11;
        this.d = i12;
        this.e = i13;
        this.f3937f = i14;
        this.h = i15;
        this.f3938n = i16;
        this.f3939r = str;
        this.f3940s = i17;
        this.f3941w = i18;
        this.f3942x = str2;
        if (str2 != null) {
            try {
                this.f3943y = new JSONObject(this.f3942x);
                return;
            } catch (JSONException unused) {
                this.f3943y = null;
                this.f3942x = null;
                return;
            }
        }
        this.f3943y = null;
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
            jSONObject.put("fontScale", this.f3934a);
            int i10 = this.f3935b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.f3936c;
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
            int i13 = this.e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", d(i13));
            }
            int i14 = this.f3937f;
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
            if (this.f3937f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f3938n);
            }
            String str = this.f3939r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f3940s) {
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
            int i16 = this.f3941w;
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
            JSONObject jSONObject2 = this.f3943y;
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
        JSONObject jSONObject = this.f3943y;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f3943y;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || u6.c.a(jSONObject, jSONObject2)) && this.f3934a == sVar.f3934a && this.f3935b == sVar.f3935b && this.f3936c == sVar.f3936c && this.d == sVar.d && this.e == sVar.e && this.f3937f == sVar.f3937f && this.h == sVar.h && this.f3938n == sVar.f3938n && g6.a.d(this.f3939r, sVar.f3939r) && this.f3940s == sVar.f3940s && this.f3941w == sVar.f3941w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3934a), Integer.valueOf(this.f3935b), Integer.valueOf(this.f3936c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f3937f), Integer.valueOf(this.h), Integer.valueOf(this.f3938n), this.f3939r, Integer.valueOf(this.f3940s), Integer.valueOf(this.f3941w), String.valueOf(this.f3943y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f3943y;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f3942x = jSONObject;
        int q6 = h0.q(parcel, 20293);
        float f7 = this.f3934a;
        h0.s(parcel, 2, 4);
        parcel.writeFloat(f7);
        int i11 = this.f3935b;
        h0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f3936c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        h0.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f3937f;
        h0.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        h0.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f3938n;
        h0.s(parcel, 9, 4);
        parcel.writeInt(i17);
        h0.l(parcel, 10, this.f3939r);
        int i18 = this.f3940s;
        h0.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.f3941w;
        h0.s(parcel, 12, 4);
        parcel.writeInt(i19);
        h0.l(parcel, 13, this.f3942x);
        h0.r(parcel, q6);
    }
}
