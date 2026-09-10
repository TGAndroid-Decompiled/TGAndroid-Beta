package ig;

import android.graphics.Color;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.SegmentTree;
import org.telegram.ui.ActionBar.i5;
public class b {
    public long[] f10590a;
    public float[] f10591b;
    public String[] f10592c;
    public ArrayList d = new ArrayList();
    public long e = 0;
    public long f10593f = Long.MAX_VALUE;
    public float f10594g = 0.0f;
    public float h = 0.0f;
    public int f10595i;
    public int f10596j;
    public long f10597k;

    public b(JSONObject jSONObject) {
        this.f10595i = 0;
        this.f10596j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i10);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f10590a = new long[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    this.f10590a[i11] = jSONArray2.getLong(i12);
                    i11 = i12;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f10586c = jSONArray2.getString(0);
                aVar.f10584a = new long[length2];
                int i13 = 0;
                while (i13 < length2) {
                    int i14 = i13 + 1;
                    aVar.f10584a[i13] = jSONArray2.getLong(i14);
                    long j3 = aVar.f10584a[i13];
                    if (j3 > aVar.e) {
                        aVar.e = j3;
                    }
                    if (j3 < aVar.f10587f) {
                        aVar.f10587f = j3;
                    }
                    i13 = i14;
                }
            }
            long[] jArr = this.f10590a;
            if (jArr.length > 1) {
                this.f10597k = jArr[1] - jArr[0];
            } else {
                this.f10597k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.f10595i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.f10596j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i15 = 0; i15 < this.d.size(); i15++) {
            a aVar2 = (a) this.d.get(i15);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f10586c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.f10588g = i5.s("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.f10589i = i0.a.d(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.d = optJSONObject2.getString(aVar2.f10586c);
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

    public final int a(float f7, int i10) {
        int length = this.f10591b.length;
        if (f7 == 1.0f) {
            return length - 1;
        }
        int i11 = length - 1;
        int i12 = i11;
        while (i10 <= i12) {
            int i13 = (i12 + i10) >> 1;
            float[] fArr = this.f10591b;
            float f10 = fArr[i13];
            if ((f7 > f10 && (i13 == i11 || f7 < fArr[i13 + 1])) || f7 == f10) {
                return i13;
            }
            if (f7 < f10) {
                i12 = i13 - 1;
            } else if (f7 > f10) {
                i10 = i13 + 1;
            }
        }
        return i12;
    }

    public final int b(float f7, int i10, int i11) {
        float[] fArr = this.f10591b;
        int length = fArr.length;
        if (f7 <= fArr[i10]) {
            return i10;
        }
        if (f7 >= fArr[i11]) {
            return i11;
        }
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr2 = this.f10591b;
            float f10 = fArr2[i12];
            if ((f7 > f10 && (i12 == length - 1 || f7 < fArr2[i12 + 1])) || f7 == f10) {
                return i12;
            }
            if (f7 < f10) {
                i11 = i12 - 1;
            } else if (f7 > f10) {
                i10 = i12 + 1;
            }
        }
        return i11;
    }

    public final int c(float f7) {
        int length;
        int i10 = 0;
        if (f7 == 0.0f || (length = this.f10591b.length) < 2) {
            return 0;
        }
        int i11 = length - 1;
        while (i10 <= i11) {
            int i12 = (i11 + i10) >> 1;
            float[] fArr = this.f10591b;
            float f10 = fArr[i12];
            if ((f7 < f10 && (i12 == 0 || f7 > fArr[i12 - 1])) || f7 == f10) {
                return i12;
            }
            if (f7 < f10) {
                i11 = i12 - 1;
            } else if (f7 > f10) {
                i10 = i12 + 1;
            }
        }
        return i10;
    }

    public void e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f10590a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j3 = jArr[0];
        long j10 = jArr[length - 1];
        float[] fArr = new float[length];
        this.f10591b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i10 = 0; i10 < length; i10++) {
                this.f10591b[i10] = ((float) (this.f10590a[i10] - j3)) / ((float) (j10 - j3));
            }
        }
        for (int i11 = 0; i11 < this.d.size(); i11++) {
            if (((a) this.d.get(i11)).e > this.e) {
                this.e = ((a) this.d.get(i11)).e;
            }
            if (((a) this.d.get(i11)).f10587f < this.f10593f) {
                this.f10593f = ((a) this.d.get(i11)).f10587f;
            }
            ((a) this.d.get(i11)).f10585b = new SegmentTree(((a) this.d.get(i11)).f10584a);
        }
        long j11 = this.f10597k;
        this.f10592c = new String[((int) ((j10 - j3) / j11)) + 10];
        if (j11 == 1) {
            simpleDateFormat = null;
        } else if (j11 < 86400000) {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        } else {
            simpleDateFormat = new SimpleDateFormat("MMM d");
        }
        int i12 = 0;
        while (true) {
            String[] strArr = this.f10592c;
            if (i12 < strArr.length) {
                if (this.f10597k == 1) {
                    strArr[i12] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i12));
                } else {
                    strArr[i12] = simpleDateFormat.format(new Date((i12 * this.f10597k) + j3));
                }
                i12++;
            } else {
                long[] jArr2 = this.f10590a;
                this.f10594g = ((float) this.f10597k) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            }
        }
    }
}
