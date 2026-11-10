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
    public float f11328a;
    public int f11329b;
    public int f11330c;
    public int d;
    public int f11331e;
    public int f11332f;
    public int h;
    public int f11333n;
    public String f11334r;
    public int f11335s;
    public int f11336w;
    public String f11337x;
    public JSONObject f11338y;

    public s(float f10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f11328a = f10;
        this.f11329b = i7;
        this.f11330c = i10;
        this.d = i11;
        this.f11331e = i12;
        this.f11332f = i13;
        this.h = i14;
        this.f11333n = i15;
        this.f11334r = str;
        this.f11335s = i16;
        this.f11336w = i17;
        this.f11337x = str2;
        if (str2 != null) {
            try {
                this.f11338y = new JSONObject(this.f11337x);
                return;
            } catch (JSONException unused) {
                this.f11338y = null;
                this.f11337x = null;
                return;
            }
        }
        this.f11338y = null;
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
            jSONObject.put("fontScale", this.f11328a);
            int i7 = this.f11329b;
            if (i7 != 0) {
                jSONObject.put("foregroundColor", d(i7));
            }
            int i10 = this.f11330c;
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
            int i12 = this.f11331e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", d(i12));
            }
            int i13 = this.f11332f;
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
            if (this.f11332f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f11333n);
            }
            String str = this.f11334r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f11335s) {
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
            int i15 = this.f11336w;
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
            JSONObject jSONObject2 = this.f11338y;
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
        JSONObject jSONObject = this.f11338y;
        if (jSONObject != null) {
            z9 = false;
        } else {
            z9 = true;
        }
        JSONObject jSONObject2 = sVar.f11338y;
        if (jSONObject2 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 != z10) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && this.f11328a == sVar.f11328a && this.f11329b == sVar.f11329b && this.f11330c == sVar.f11330c && this.d == sVar.d && this.f11331e == sVar.f11331e && this.f11332f == sVar.f11332f && this.h == sVar.h && this.f11333n == sVar.f11333n && j6.a.d(this.f11334r, sVar.f11334r) && this.f11335s == sVar.f11335s && this.f11336w == sVar.f11336w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11328a), Integer.valueOf(this.f11329b), Integer.valueOf(this.f11330c), Integer.valueOf(this.d), Integer.valueOf(this.f11331e), Integer.valueOf(this.f11332f), Integer.valueOf(this.h), Integer.valueOf(this.f11333n), this.f11334r, Integer.valueOf(this.f11335s), Integer.valueOf(this.f11336w), String.valueOf(this.f11338y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11338y;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11337x = jSONObject;
        int r10 = xb.r(parcel, 20293);
        float f10 = this.f11328a;
        xb.q(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i10 = this.f11329b;
        xb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.f11330c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        xb.q(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f11331e;
        xb.q(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f11332f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.f11333n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(i16);
        xb.l(parcel, 10, this.f11334r);
        int i17 = this.f11335s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.f11336w;
        xb.q(parcel, 12, 4);
        parcel.writeInt(i18);
        xb.l(parcel, 13, this.f11337x);
        xb.s(parcel, r10);
    }
}
