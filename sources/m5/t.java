package m5;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class t extends z5.a {
    public static final Parcelable.Creator<t> CREATOR = new w(19);

    public float f17846a;

    public int f17847b;

    public int f17848c;
    public int d;

    public int f17849e;

    public int f17850f;
    public int h;

    public int f17851n;

    public String f17852r;

    public int f17853s;
    public int v;

    public String f17854w;

    public JSONObject f17855x;

    public t(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, String str, int i17, int i18, String str2) {
        this.f17846a = f10;
        this.f17847b = i10;
        this.f17848c = i11;
        this.d = i12;
        this.f17849e = i13;
        this.f17850f = i14;
        this.h = i15;
        this.f17851n = i16;
        this.f17852r = str;
        this.f17853s = i17;
        this.v = i18;
        this.f17854w = str2;
        if (str2 == null) {
            this.f17855x = null;
            return;
        }
        try {
            this.f17855x = new JSONObject(this.f17854w);
        } catch (JSONException unused) {
            this.f17855x = null;
            this.f17854w = null;
        }
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
            jSONObject.put("fontScale", this.f17846a);
            int i10 = this.f17847b;
            if (i10 != 0) {
                jSONObject.put("foregroundColor", d(i10));
            }
            int i11 = this.f17848c;
            if (i11 != 0) {
                jSONObject.put("backgroundColor", d(i11));
            }
            int i12 = this.d;
            if (i12 == 0) {
                jSONObject.put("edgeType", "NONE");
            } else if (i12 == 1) {
                jSONObject.put("edgeType", "OUTLINE");
            } else if (i12 == 2) {
                jSONObject.put("edgeType", "DROP_SHADOW");
            } else if (i12 == 3) {
                jSONObject.put("edgeType", "RAISED");
            } else if (i12 == 4) {
                jSONObject.put("edgeType", "DEPRESSED");
            }
            int i13 = this.f17849e;
            if (i13 != 0) {
                jSONObject.put("edgeColor", d(i13));
            }
            int i14 = this.f17850f;
            if (i14 == 0) {
                jSONObject.put("windowType", "NONE");
            } else if (i14 == 1) {
                jSONObject.put("windowType", "NORMAL");
            } else if (i14 == 2) {
                jSONObject.put("windowType", "ROUNDED_CORNERS");
            }
            int i15 = this.h;
            if (i15 != 0) {
                jSONObject.put("windowColor", d(i15));
            }
            if (this.f17850f == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.f17851n);
            }
            String str = this.f17852r;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.f17853s) {
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
            if (i16 == 0) {
                jSONObject.put("fontStyle", "NORMAL");
            } else if (i16 == 1) {
                jSONObject.put("fontStyle", "BOLD");
            } else if (i16 == 2) {
                jSONObject.put("fontStyle", "ITALIC");
            } else if (i16 == 3) {
                jSONObject.put("fontStyle", "BOLD_ITALIC");
            }
            JSONObject jSONObject2 = this.f17855x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        JSONObject jSONObject = this.f17855x;
        boolean z10 = jSONObject == null;
        JSONObject jSONObject2 = tVar.f17855x;
        if (z10 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || f6.c.a(jSONObject, jSONObject2)) && this.f17846a == tVar.f17846a && this.f17847b == tVar.f17847b && this.f17848c == tVar.f17848c && this.d == tVar.d && this.f17849e == tVar.f17849e && this.f17850f == tVar.f17850f && this.h == tVar.h && this.f17851n == tVar.f17851n && r5.a.d(this.f17852r, tVar.f17852r) && this.f17853s == tVar.f17853s && this.v == tVar.v;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f17846a), Integer.valueOf(this.f17847b), Integer.valueOf(this.f17848c), Integer.valueOf(this.d), Integer.valueOf(this.f17849e), Integer.valueOf(this.f17850f), Integer.valueOf(this.h), Integer.valueOf(this.f17851n), this.f17852r, Integer.valueOf(this.f17853s), Integer.valueOf(this.v), String.valueOf(this.f17855x)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        JSONObject jSONObject = this.f17855x;
        this.f17854w = jSONObject == null ? null : jSONObject.toString();
        int iQ = r8.q(parcel, 20293);
        float f10 = this.f17846a;
        r8.s(parcel, 2, 4);
        parcel.writeFloat(f10);
        int i11 = this.f17847b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.f17848c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(i13);
        int i14 = this.f17849e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(i14);
        int i15 = this.f17850f;
        r8.s(parcel, 7, 4);
        parcel.writeInt(i15);
        int i16 = this.h;
        r8.s(parcel, 8, 4);
        parcel.writeInt(i16);
        int i17 = this.f17851n;
        r8.s(parcel, 9, 4);
        parcel.writeInt(i17);
        r8.l(parcel, 10, this.f17852r);
        int i18 = this.f17853s;
        r8.s(parcel, 11, 4);
        parcel.writeInt(i18);
        int i19 = this.v;
        r8.s(parcel, 12, 4);
        parcel.writeInt(i19);
        r8.l(parcel, 13, this.f17854w);
        r8.r(parcel, iQ);
    }
}
