package f6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f11323a;
    public int f11324b;
    public int f11325c;
    public int d;
    public int f11326e;
    public int f11327f;
    public int h;
    public int f11328n;
    public String f11329r;
    public int f11330s;
    public int f11331w;
    public String f11332x;
    public JSONObject f11333y;

    public s(float f10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f11323a = f10;
        this.f11324b = i7;
        this.f11325c = i10;
        this.d = i11;
        this.f11326e = i12;
        this.f11327f = i13;
        this.h = i14;
        this.f11328n = i15;
        this.f11329r = str;
        this.f11330s = i16;
        this.f11331w = i17;
        this.f11332x = str2;
        if (str2 != null) {
            try {
                this.f11333y = new JSONObject(this.f11332x);
                return;
            } catch (JSONException unused) {
                this.f11333y = null;
                this.f11332x = null;
                return;
            }
        }
        this.f11333y = null;
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
            jSONObject.put("fontScale", this.f11323a);
            int i7 = this.f11324b;
            if (i7 != 0) {
                jSONObject.put("foregroundColor", d(i7));
            }
            int i10 = this.f11325c;
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
            int i12 = this.f11326e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", d(i12));
            }
            int i13 = this.f11327f;
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
            if (this.f11327f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f11328n);
            }
            String str = this.f11329r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f11330s) {
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
            int i15 = this.f11331w;
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
            JSONObject jSONObject2 = this.f11333y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        JSONObject jSONObject = this.f11333y;
        if (jSONObject != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        JSONObject jSONObject2 = sVar.f11333y;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && this.f11323a == sVar.f11323a && this.f11324b == sVar.f11324b && this.f11325c == sVar.f11325c && this.d == sVar.d && this.f11326e == sVar.f11326e && this.f11327f == sVar.f11327f && this.h == sVar.h && this.f11328n == sVar.f11328n && j6.a.d(this.f11329r, sVar.f11329r) && this.f11330s == sVar.f11330s && this.f11331w == sVar.f11331w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11323a), Integer.valueOf(this.f11324b), Integer.valueOf(this.f11325c), Integer.valueOf(this.d), Integer.valueOf(this.f11326e), Integer.valueOf(this.f11327f), Integer.valueOf(this.h), Integer.valueOf(this.f11328n), this.f11329r, Integer.valueOf(this.f11330s), Integer.valueOf(this.f11331w), String.valueOf(this.f11333y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11333y;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11332x = jSONObject;
        int r10 = xb.r(parcel, 20293);
        float f10 = this.f11323a;
        xb.q(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i10 = this.f11324b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.f11325c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f11326e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f11327f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.f11328n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(i16);
        xb.l(parcel, 10, this.f11329r);
        int i17 = this.f11330s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.f11331w;
        xb.q(parcel, 12, 4);
        parcel.writeInt(i18);
        xb.l(parcel, 13, this.f11332x);
        xb.s(parcel, r10);
    }
}
