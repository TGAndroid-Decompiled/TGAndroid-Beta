package ng;

import android.graphics.Color;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.t;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.ui.ActionBar.u4;
public class b {
    public long[] f20373a;
    public float[] f20374b;
    public String[] f20375c;
    public ArrayList d = new ArrayList();
    public long f20376e = 0;
    public long f20377f = Long.MAX_VALUE;
    public float f20378g = 0.0f;
    public float h = 0.0f;
    public int f20379i;
    public int f20380j;
    public long f20381k;

    public b(JSONObject jSONObject) {
        this.f20379i = 0;
        this.f20380j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i3);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f20373a = new long[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    this.f20373a[i10] = jSONArray2.getLong(i11);
                    i10 = i11;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f20368c = jSONArray2.getString(0);
                aVar.f20366a = new long[length2];
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = i12 + 1;
                    aVar.f20366a[i12] = jSONArray2.getLong(i13);
                    long j10 = aVar.f20366a[i12];
                    if (j10 > aVar.f20369e) {
                        aVar.f20369e = j10;
                    }
                    if (j10 < aVar.f20370f) {
                        aVar.f20370f = j10;
                    }
                    i12 = i13;
                }
            }
            long[] jArr = this.f20373a;
            if (jArr.length > 1) {
                this.f20381k = jArr[1] - jArr[0];
            } else {
                this.f20381k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.f20379i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.f20380j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i14 = 0; i14 < this.d.size(); i14++) {
            a aVar2 = (a) this.d.get(i14);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f20368c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.f20371g = u4.h("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.f20372i = i0.a.f(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.d = optJSONObject2.getString(aVar2.f20368c);
            }
        }
    }

    public static int d(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("TON")) {
                return 1;
            }
            if (str.contains("XTR")) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public final int a(float f10, int i3) {
        int length = this.f20374b.length;
        if (f10 == 1.0f) {
            return length - 1;
        }
        int i10 = length - 1;
        int i11 = i10;
        while (i3 <= i11) {
            int i12 = (i11 + i3) >> 1;
            float[] fArr = this.f20374b;
            float f11 = fArr[i12];
            if ((f10 > f11 && (i12 == i10 || f10 < fArr[i12 + 1])) || f10 == f11) {
                return i12;
            }
            if (f10 < f11) {
                i11 = i12 - 1;
            } else if (f10 > f11) {
                i3 = i12 + 1;
            }
        }
        return i11;
    }

    public final int b(float f10, int i3, int i10) {
        float[] fArr = this.f20374b;
        int length = fArr.length;
        if (f10 <= fArr[i3]) {
            return i3;
        }
        if (f10 >= fArr[i10]) {
            return i10;
        }
        while (i3 <= i10) {
            int i11 = (i10 + i3) >> 1;
            float[] fArr2 = this.f20374b;
            float f11 = fArr2[i11];
            if ((f10 > f11 && (i11 == length - 1 || f10 < fArr2[i11 + 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i3 = i11 + 1;
            }
        }
        return i10;
    }

    public final int c(float f10) {
        int length;
        int i3 = 0;
        if (f10 == 0.0f || (length = this.f20374b.length) < 2) {
            return 0;
        }
        int i10 = length - 1;
        while (i3 <= i10) {
            int i11 = (i10 + i3) >> 1;
            float[] fArr = this.f20374b;
            float f11 = fArr[i11];
            if ((f10 < f11 && (i11 == 0 || f10 > fArr[i11 - 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i3 = i11 + 1;
            }
        }
        return i3;
    }

    public void e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f20373a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j10 = jArr[0];
        long j11 = jArr[length - 1];
        float[] fArr = new float[length];
        this.f20374b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i3 = 0; i3 < length; i3++) {
                this.f20374b[i3] = ((float) (this.f20373a[i3] - j10)) / ((float) (j11 - j10));
            }
        }
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            if (((a) this.d.get(i10)).f20369e > this.f20376e) {
                this.f20376e = ((a) this.d.get(i10)).f20369e;
            }
            if (((a) this.d.get(i10)).f20370f < this.f20377f) {
                this.f20377f = ((a) this.d.get(i10)).f20370f;
            }
            ((a) this.d.get(i10)).f20367b = new t(((a) this.d.get(i10)).f20366a);
        }
        long j12 = this.f20381k;
        this.f20375c = new String[((int) ((j11 - j10) / j12)) + 10];
        if (j12 == 1) {
            simpleDateFormat = null;
        } else if (j12 < 86400000) {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        } else {
            simpleDateFormat = new SimpleDateFormat("MMM d");
        }
        int i11 = 0;
        while (true) {
            String[] strArr = this.f20375c;
            if (i11 < strArr.length) {
                if (this.f20381k == 1) {
                    strArr[i11] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i11));
                } else {
                    strArr[i11] = simpleDateFormat.format(new Date((i11 * this.f20381k) + j10));
                }
                i11++;
            } else {
                long[] jArr2 = this.f20373a;
                this.f20378g = ((float) this.f20381k) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            }
        }
    }
}
