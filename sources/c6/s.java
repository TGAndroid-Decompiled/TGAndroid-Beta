package c6;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f4591a;
    public int f4592b;
    public int f4593c;
    public int d;
    public int f4594e;
    public int f4595f;
    public int h;
    public int f4596n;
    public String f4597r;
    public int f4598s;
    public int v;
    public String f4599w;
    public JSONObject f4600x;

    public s(float f7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f4591a = f7;
        this.f4592b = i10;
        this.f4593c = i11;
        this.d = i12;
        this.f4594e = i13;
        this.f4595f = i14;
        this.h = i15;
        this.f4596n = i16;
        this.f4597r = str;
        this.f4598s = i17;
        this.v = i18;
        this.f4599w = str2;
        if (str2 != null) {
            try {
                this.f4600x = new JSONObject(this.f4599w);
                return;
            } catch (JSONException unused) {
                this.f4600x = null;
                this.f4599w = null;
                return;
            }
        }
        this.f4600x = null;
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
            jSONObject.put("fontScale", this.f4591a);
            int i10 = this.f4592b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.f4593c;
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
            int i13 = this.f4594e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", d(i13));
            }
            int i14 = this.f4595f;
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
            if (this.f4595f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f4596n);
            }
            String str = this.f4597r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f4598s) {
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
            JSONObject jSONObject2 = this.f4600x;
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
        JSONObject jSONObject = this.f4600x;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f4600x;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || u6.c.a(jSONObject, jSONObject2)) && this.f4591a == sVar.f4591a && this.f4592b == sVar.f4592b && this.f4593c == sVar.f4593c && this.d == sVar.d && this.f4594e == sVar.f4594e && this.f4595f == sVar.f4595f && this.h == sVar.h && this.f4596n == sVar.f4596n && g6.a.d(this.f4597r, sVar.f4597r) && this.f4598s == sVar.f4598s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4591a), Integer.valueOf(this.f4592b), Integer.valueOf(this.f4593c), Integer.valueOf(this.d), Integer.valueOf(this.f4594e), Integer.valueOf(this.f4595f), Integer.valueOf(this.h), Integer.valueOf(this.f4596n), this.f4597r, Integer.valueOf(this.f4598s), Integer.valueOf(this.v), String.valueOf(this.f4600x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f4600x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4599w = jSONObject;
        int q6 = w7.e0.q(parcel, 20293);
        float f7 = this.f4591a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeFloat(f7);
        int i11 = this.f4592b;
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f4593c;
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f4594e;
        w7.e0.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f4595f;
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f4596n;
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(i17);
        w7.e0.l(parcel, 10, this.f4597r);
        int i18 = this.f4598s;
        w7.e0.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        w7.e0.s(parcel, 12, 4);
        parcel.writeInt(i19);
        w7.e0.l(parcel, 13, this.f4599w);
        w7.e0.r(parcel, q6);
    }
}
