package f6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends r6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f11137a;
    public int f11138b;
    public int f11139c;
    public int d;
    public int f11140e;
    public int f11141f;
    public int h;
    public int f11142n;
    public String f11143r;
    public int f11144s;
    public int f11145w;
    public String f11146x;
    public JSONObject f11147y;

    public s(float f10, int i7, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f11137a = f10;
        this.f11138b = i7;
        this.f11139c = i10;
        this.d = i11;
        this.f11140e = i12;
        this.f11141f = i13;
        this.h = i14;
        this.f11142n = i15;
        this.f11143r = str;
        this.f11144s = i16;
        this.f11145w = i17;
        this.f11146x = str2;
        if (str2 != null) {
            try {
                this.f11147y = new JSONObject(this.f11146x);
                return;
            } catch (JSONException unused) {
                this.f11147y = null;
                this.f11146x = null;
                return;
            }
        }
        this.f11147y = null;
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
            jSONObject.put("fontScale", this.f11137a);
            int i7 = this.f11138b;
            if (i7 != 0) {
                jSONObject.put("foregroundColor", d(i7));
            }
            int i10 = this.f11139c;
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
            int i12 = this.f11140e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", d(i12));
            }
            int i13 = this.f11141f;
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
            if (this.f11141f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f11142n);
            }
            String str = this.f11143r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f11144s) {
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
            int i15 = this.f11145w;
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
            JSONObject jSONObject2 = this.f11147y;
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
        JSONObject jSONObject = this.f11147y;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f11147y;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || x6.c.a(jSONObject, jSONObject2)) && this.f11137a == sVar.f11137a && this.f11138b == sVar.f11138b && this.f11139c == sVar.f11139c && this.d == sVar.d && this.f11140e == sVar.f11140e && this.f11141f == sVar.f11141f && this.h == sVar.h && this.f11142n == sVar.f11142n && j6.a.d(this.f11143r, sVar.f11143r) && this.f11144s == sVar.f11144s && this.f11145w == sVar.f11145w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11137a), Integer.valueOf(this.f11138b), Integer.valueOf(this.f11139c), Integer.valueOf(this.d), Integer.valueOf(this.f11140e), Integer.valueOf(this.f11141f), Integer.valueOf(this.h), Integer.valueOf(this.f11142n), this.f11143r, Integer.valueOf(this.f11144s), Integer.valueOf(this.f11145w), String.valueOf(this.f11147y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.f11147y;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f11146x = jSONObject;
        int r10 = yb.r(parcel, 20293);
        float f10 = this.f11137a;
        yb.q(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i10 = this.f11138b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.f11139c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        yb.q(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f11140e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f11141f;
        yb.q(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.h;
        yb.q(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.f11142n;
        yb.q(parcel, 9, 4);
        parcel.writeInt(i16);
        yb.l(parcel, 10, this.f11143r);
        int i17 = this.f11144s;
        yb.q(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.f11145w;
        yb.q(parcel, 12, 4);
        parcel.writeInt(i18);
        yb.l(parcel, 13, this.f11146x);
        yb.s(parcel, r10);
    }
}
