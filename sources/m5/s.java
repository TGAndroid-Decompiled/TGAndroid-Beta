package m5;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class s extends y5.a {
    public static final Parcelable.Creator<s> CREATOR = new v(19);
    public float f17467a;
    public int f17468b;
    public int f17469c;
    public int d;
    public int f17470e;
    public int f17471f;
    public int h;
    public int f17472n;
    public String f17473r;
    public int f17474s;
    public int v;
    public String f17475w;
    public JSONObject f17476x;

    public s(float f10, int i9, int i10, int i11, int i12, int i13, int i14, int i15, String str, int i16, int i17, String str2) {
        this.f17467a = f10;
        this.f17468b = i9;
        this.f17469c = i10;
        this.d = i11;
        this.f17470e = i12;
        this.f17471f = i13;
        this.h = i14;
        this.f17472n = i15;
        this.f17473r = str;
        this.f17474s = i16;
        this.v = i17;
        this.f17475w = str2;
        if (str2 != null) {
            try {
                this.f17476x = new JSONObject(this.f17475w);
                return;
            } catch (JSONException unused) {
                this.f17476x = null;
                this.f17475w = null;
                return;
            }
        }
        this.f17476x = null;
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

    public static final String d(int i9) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i9)), Integer.valueOf(Color.green(i9)), Integer.valueOf(Color.blue(i9)), Integer.valueOf(Color.alpha(i9)));
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.f17467a);
            int i9 = this.f17468b;
            if (i9 != 0) {
                jSONObject.put("foregroundColor", d(i9));
            }
            int i10 = this.f17469c;
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
            int i12 = this.f17470e;
            if (i12 != 0) {
                jSONObject.put("edgeColor", d(i12));
            }
            int i13 = this.f17471f;
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
            if (this.f17471f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f17472n);
            }
            String str = this.f17473r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f17474s) {
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
            int i15 = this.v;
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
            JSONObject jSONObject2 = this.f17476x;
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
        JSONObject jSONObject = this.f17476x;
        if (jSONObject != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        JSONObject jSONObject2 = sVar.f17476x;
        if (jSONObject2 != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 != z11) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || e6.c.a(jSONObject, jSONObject2)) && this.f17467a == sVar.f17467a && this.f17468b == sVar.f17468b && this.f17469c == sVar.f17469c && this.d == sVar.d && this.f17470e == sVar.f17470e && this.f17471f == sVar.f17471f && this.h == sVar.h && this.f17472n == sVar.f17472n && q5.a.d(this.f17473r, sVar.f17473r) && this.f17474s == sVar.f17474s && this.v == sVar.v) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17467a), Integer.valueOf(this.f17468b), Integer.valueOf(this.f17469c), Integer.valueOf(this.d), Integer.valueOf(this.f17470e), Integer.valueOf(this.f17471f), Integer.valueOf(this.h), Integer.valueOf(this.f17472n), this.f17473r, Integer.valueOf(this.f17474s), Integer.valueOf(this.v), String.valueOf(this.f17476x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        String jSONObject;
        JSONObject jSONObject2 = this.f17476x;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f17475w = jSONObject;
        int q10 = p8.q(parcel, 20293);
        float f10 = this.f17467a;
        p8.s(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i10 = this.f17468b;
        p8.s(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.f17469c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        int i12 = this.d;
        p8.s(parcel, 5, 4);
        parcel.writeInt(i12);
        int i13 = this.f17470e;
        p8.s(parcel, 6, 4);
        parcel.writeInt(i13);
        int i14 = this.f17471f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i14);
        int i15 = this.h;
        p8.s(parcel, 8, 4);
        parcel.writeInt(i15);
        int i16 = this.f17472n;
        p8.s(parcel, 9, 4);
        parcel.writeInt(i16);
        p8.l(parcel, 10, this.f17473r);
        int i17 = this.f17474s;
        p8.s(parcel, 11, 4);
        parcel.writeInt(i17);
        int i18 = this.v;
        p8.s(parcel, 12, 4);
        parcel.writeInt(i18);
        p8.l(parcel, 13, this.f17475w);
        p8.r(parcel, q10);
    }
}
