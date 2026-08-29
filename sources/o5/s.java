package o5;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends a6.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f19326a;
    public int f19327b;
    public int f19328c;
    public int d;
    public int f19329e;
    public int f19330f;
    public int h;
    public int f19331n;
    public String f19332r;
    public int f19333s;
    public int v;
    public String f19334w;
    public JSONObject f19335x;

    public s(float f9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f19326a = f9;
        this.f19327b = i10;
        this.f19328c = i11;
        this.d = i12;
        this.f19329e = i13;
        this.f19330f = i14;
        this.h = i15;
        this.f19331n = i16;
        this.f19332r = str;
        this.f19333s = i17;
        this.v = i18;
        this.f19334w = str2;
        if (str2 != null) {
            try {
                this.f19335x = new JSONObject(this.f19334w);
                return;
            } catch (JSONException unused) {
                this.f19335x = null;
                this.f19334w = null;
                return;
            }
        }
        this.f19335x = null;
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
            jSONObject.put("fontScale", this.f19326a);
            int i10 = this.f19327b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.f19328c;
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
            int i13 = this.f19329e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", d(i13));
            }
            int i14 = this.f19330f;
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
            if (this.f19330f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f19331n);
            }
            String str = this.f19332r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f19333s) {
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
            JSONObject jSONObject2 = this.f19335x;
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
        JSONObject jSONObject = this.f19335x;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f19335x;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || g6.c.a(jSONObject, jSONObject2)) && this.f19326a == sVar.f19326a && this.f19327b == sVar.f19327b && this.f19328c == sVar.f19328c && this.d == sVar.d && this.f19329e == sVar.f19329e && this.f19330f == sVar.f19330f && this.h == sVar.h && this.f19331n == sVar.f19331n && s5.a.d(this.f19332r, sVar.f19332r) && this.f19333s == sVar.f19333s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19326a), Integer.valueOf(this.f19327b), Integer.valueOf(this.f19328c), Integer.valueOf(this.d), Integer.valueOf(this.f19329e), Integer.valueOf(this.f19330f), Integer.valueOf(this.h), Integer.valueOf(this.f19331n), this.f19332r, Integer.valueOf(this.f19333s), Integer.valueOf(this.v), String.valueOf(this.f19335x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.f19335x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f19334w = jSONObject;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        float f9 = this.f19326a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeFloat(f9);
        int i11 = this.f19327b;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f19328c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f19329e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f19330f;
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        com.google.android.gms.internal.cast.o.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f19331n;
        com.google.android.gms.internal.cast.o.s(parcel, 9, 4);
        parcel.writeInt(i17);
        com.google.android.gms.internal.cast.o.l(parcel, 10, this.f19332r);
        int i18 = this.f19333s;
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        com.google.android.gms.internal.cast.o.s(parcel, 12, 4);
        parcel.writeInt(i19);
        com.google.android.gms.internal.cast.o.l(parcel, 13, this.f19334w);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
