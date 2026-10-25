package d6;

import a8.df;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends p6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f8131a;
    public int f8132b;
    public int f8133c;
    public int d;
    public int e;
    public int f8134f;
    public int h;
    public int f8135n;
    public String f8136r;
    public int f8137s;
    public int v;
    public String f8138w;
    public JSONObject f8139x;

    public s(float f7, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f8131a = f7;
        this.f8132b = i10;
        this.f8133c = i11;
        this.d = i12;
        this.e = i13;
        this.f8134f = i14;
        this.h = i15;
        this.f8135n = i16;
        this.f8136r = str;
        this.f8137s = i17;
        this.v = i18;
        this.f8138w = str2;
        if (str2 != null) {
            try {
                this.f8139x = new JSONObject(this.f8138w);
                return;
            } catch (JSONException unused) {
                this.f8139x = null;
                this.f8138w = null;
                return;
            }
        }
        this.f8139x = null;
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
            jSONObject.put("fontScale", this.f8131a);
            int i10 = this.f8132b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.f8133c;
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
            int i14 = this.f8134f;
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
            if (this.f8134f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f8135n);
            }
            String str = this.f8136r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f8137s) {
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
            JSONObject jSONObject2 = this.f8139x;
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
        JSONObject jSONObject = this.f8139x;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f8139x;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || v6.c.a(jSONObject, jSONObject2)) && this.f8131a == sVar.f8131a && this.f8132b == sVar.f8132b && this.f8133c == sVar.f8133c && this.d == sVar.d && this.e == sVar.e && this.f8134f == sVar.f8134f && this.h == sVar.h && this.f8135n == sVar.f8135n && h6.a.d(this.f8136r, sVar.f8136r) && this.f8137s == sVar.f8137s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f8131a), Integer.valueOf(this.f8132b), Integer.valueOf(this.f8133c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f8134f), Integer.valueOf(this.h), Integer.valueOf(this.f8135n), this.f8136r, Integer.valueOf(this.f8137s), Integer.valueOf(this.v), String.valueOf(this.f8139x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f8139x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f8138w = jSONObject;
        int q5 = df.q(parcel, 20293);
        float f7 = this.f8131a;
        df.s(parcel, 2, 4);
        parcel.writeFloat(f7);
        int i11 = this.f8132b;
        df.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f8133c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        df.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f8134f;
        df.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        df.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f8135n;
        df.s(parcel, 9, 4);
        parcel.writeInt(i17);
        df.l(parcel, 10, this.f8136r);
        int i18 = this.f8137s;
        df.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        df.s(parcel, 12, 4);
        parcel.writeInt(i19);
        df.l(parcel, 13, this.f8138w);
        df.r(parcel, q5);
    }
}
