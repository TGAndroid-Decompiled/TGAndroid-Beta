package c6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f4564a;
    public int f4565b;
    public int f4566c;
    public int d;
    public int f4567e;
    public int f4568f;
    public int h;
    public int f4569n;
    public String f4570r;
    public int f4571s;
    public int v;
    public String f4572w;
    public JSONObject f4573x;

    public s(float f7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f4564a = f7;
        this.f4565b = i10;
        this.f4566c = i11;
        this.d = i12;
        this.f4567e = i13;
        this.f4568f = i14;
        this.h = i15;
        this.f4569n = i16;
        this.f4570r = str;
        this.f4571s = i17;
        this.v = i18;
        this.f4572w = str2;
        if (str2 != null) {
            try {
                this.f4573x = new JSONObject(this.f4572w);
                return;
            } catch (JSONException unused) {
                this.f4573x = null;
                this.f4572w = null;
                return;
            }
        }
        this.f4573x = null;
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
            jSONObject.put("fontScale", this.f4564a);
            int i10 = this.f4565b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.f4566c;
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
            int i13 = this.f4567e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", d(i13));
            }
            int i14 = this.f4568f;
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
            if (this.f4568f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f4569n);
            }
            String str = this.f4570r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f4571s) {
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
            JSONObject jSONObject2 = this.f4573x;
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
        JSONObject jSONObject = this.f4573x;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f4573x;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || u6.c.a(jSONObject, jSONObject2)) && this.f4564a == sVar.f4564a && this.f4565b == sVar.f4565b && this.f4566c == sVar.f4566c && this.d == sVar.d && this.f4567e == sVar.f4567e && this.f4568f == sVar.f4568f && this.h == sVar.h && this.f4569n == sVar.f4569n && g6.a.d(this.f4570r, sVar.f4570r) && this.f4571s == sVar.f4571s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4564a), Integer.valueOf(this.f4565b), Integer.valueOf(this.f4566c), Integer.valueOf(this.d), Integer.valueOf(this.f4567e), Integer.valueOf(this.f4568f), Integer.valueOf(this.h), Integer.valueOf(this.f4569n), this.f4570r, Integer.valueOf(this.f4571s), Integer.valueOf(this.v), String.valueOf(this.f4573x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4573x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4572w = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        float f7 = this.f4564a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(f7);
        int i11 = this.f4565b;
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f4566c;
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f4567e;
        w7.e0.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f4568f;
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f4569n;
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(i17);
        w7.e0.l(parcel, 10, this.f4570r);
        int i18 = this.f4571s;
        w7.e0.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        w7.e0.s(parcel, 12, 4);
        parcel.writeInt(i19);
        w7.e0.l(parcel, 13, this.f4572w);
        w7.e0.r(parcel, q6);
    }
}
