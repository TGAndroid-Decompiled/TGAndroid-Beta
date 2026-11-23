package f6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f11449a;
    public int f11450b;
    public int f11451c;
    public int d;
    public int f11452e;
    public int f11453f;
    public int h;
    public int f11454n;
    public String f11455r;
    public int f11456s;
    public int f11457w;
    public String f11458x;
    public JSONObject f11459y;

    public s(float f10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f11449a = f10;
        this.f11450b = i7;
        this.f11451c = i10;
        this.d = i11;
        this.f11452e = i12;
        this.f11453f = i13;
        this.h = i14;
        this.f11454n = i15;
        this.f11455r = str;
        this.f11456s = i16;
        this.f11457w = i17;
        this.f11458x = str2;
        if (str2 != null) {
            try {
                this.f11459y = new JSONObject(this.f11458x);
                return;
            } catch (JSONException unused) {
                this.f11459y = null;
                this.f11458x = null;
                return;
            }
        }
        this.f11459y = null;
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

    public static final String d(int i7) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i7)), Integer.valueOf(Color.green(i7)), Integer.valueOf(Color.blue(i7)), Integer.valueOf(Color.alpha(i7)));
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f11449a);
            int i7 = this.f11450b;
            if (i7 != 0) {
                jSONObject.put("foregroundColor", d(i7));
            }
            int i10 = this.f11451c;
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
            int i12 = this.f11452e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", d(i12));
            }
            int i13 = this.f11453f;
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
            if (this.f11453f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f11454n);
            }
            String str = this.f11455r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f11456s) {
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
            int i15 = this.f11457w;
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
            JSONObject jSONObject2 = this.f11459y;
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
        JSONObject jSONObject = this.f11459y;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f11459y;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && this.f11449a == sVar.f11449a && this.f11450b == sVar.f11450b && this.f11451c == sVar.f11451c && this.d == sVar.d && this.f11452e == sVar.f11452e && this.f11453f == sVar.f11453f && this.h == sVar.h && this.f11454n == sVar.f11454n && j6.a.d(this.f11455r, sVar.f11455r) && this.f11456s == sVar.f11456s && this.f11457w == sVar.f11457w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11449a), Integer.valueOf(this.f11450b), Integer.valueOf(this.f11451c), Integer.valueOf(this.d), Integer.valueOf(this.f11452e), Integer.valueOf(this.f11453f), Integer.valueOf(this.h), Integer.valueOf(this.f11454n), this.f11455r, Integer.valueOf(this.f11456s), Integer.valueOf(this.f11457w), String.valueOf(this.f11459y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11459y;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11458x = jSONObject;
        int r10 = cc.r(parcel, 20293);
        float f10 = this.f11449a;
        cc.q(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i10 = this.f11450b;
        cc.q(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.f11451c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        cc.q(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f11452e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f11453f;
        cc.q(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.f11454n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(i16);
        cc.l(parcel, 10, this.f11455r);
        int i17 = this.f11456s;
        cc.q(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.f11457w;
        cc.q(parcel, 12, 4);
        parcel.writeInt(i18);
        cc.l(parcel, 13, this.f11458x);
        cc.s(parcel, r10);
    }
}
