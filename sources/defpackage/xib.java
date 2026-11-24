package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class xib extends b4 {
    public static final Parcelable.Creator<xib> CREATOR = new rpd((byte) 6);
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public String r;
    public int s;
    public int w;
    public String x;
    public JSONObject y;

    public xib(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.h = i6;
        this.n = i7;
        this.r = str;
        this.s = i8;
        this.w = i9;
        this.x = str2;
        if (str2 != null) {
            try {
                this.y = new JSONObject(this.x);
                return;
            } catch (JSONException unused) {
                this.y = null;
                this.x = null;
                return;
            }
        }
        this.y = null;
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

    public static final String d(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.a);
            int i = this.b;
            if (i != 0) {
                jSONObject.put("foregroundColor", d(i));
            }
            int i2 = this.c;
            if (i2 != 0) {
                jSONObject.put("backgroundColor", d(i2));
            }
            int i3 = this.d;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
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
            int i4 = this.e;
            if (i4 != 0) {
                jSONObject.put("edgeColor", d(i4));
            }
            int i5 = this.f;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        jSONObject.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    jSONObject.put("windowType", "NORMAL");
                }
            } else {
                jSONObject.put("windowType", "NONE");
            }
            int i6 = this.h;
            if (i6 != 0) {
                jSONObject.put("windowColor", d(i6));
            }
            if (this.f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.n);
            }
            String str = this.r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.s) {
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
            int i7 = this.w;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
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
            JSONObject jSONObject2 = this.y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xib)) {
            return false;
        }
        xib xibVar = (xib) obj;
        JSONObject jSONObject = this.y;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = xibVar.y;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || vu5.a(jSONObject, jSONObject2)) && this.a == xibVar.a && this.b == xibVar.b && this.c == xibVar.c && this.d == xibVar.d && this.e == xibVar.e && this.f == xibVar.f && this.h == xibVar.h && this.n == xibVar.n && id1.d(this.r, xibVar.r) && this.s == xibVar.s && this.w == xibVar.w) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.h), Integer.valueOf(this.n), this.r, Integer.valueOf(this.s), Integer.valueOf(this.w), String.valueOf(this.y)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.y;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.x = jSONObject;
        int r = jte.r(parcel, 20293);
        float f = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.b;
        jte.q(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.d;
        jte.q(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.e;
        jte.q(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.h;
        jte.q(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.n;
        jte.q(parcel, 9, 4);
        parcel.writeInt(i8);
        jte.l(parcel, 10, this.r);
        int i9 = this.s;
        jte.q(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.w;
        jte.q(parcel, 12, 4);
        parcel.writeInt(i10);
        jte.l(parcel, 13, this.x);
        jte.s(parcel, r);
    }
}
