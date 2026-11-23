package mg;

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
import org.telegram.ui.ActionBar.v4;
public class b {
    public long[] f21012a;
    public float[] f21013b;
    public String[] f21014c;
    public ArrayList d = new ArrayList();
    public long f21015e = 0;
    public long f21016f = Long.MAX_VALUE;
    public float f21017g = 0.0f;
    public float h = 0.0f;
    public int f21018i;
    public int f21019j;
    public long f21020k;

    public b(JSONObject jSONObject) {
        this.f21018i = 0;
        this.f21019j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i7);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.f21012a = new long[length];
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    this.f21012a[i10] = jSONArray2.getLong(i11);
                    i10 = i11;
                }
            } else {
                a aVar = new a();
                this.d.add(aVar);
                int length2 = jSONArray2.length() - 1;
                aVar.f21007c = jSONArray2.getString(0);
                aVar.f21005a = new long[length2];
                int i12 = 0;
                while (i12 < length2) {
                    int i13 = i12 + 1;
                    aVar.f21005a[i12] = jSONArray2.getLong(i13);
                    long j3 = aVar.f21005a[i12];
                    if (j3 > aVar.f21008e) {
                        aVar.f21008e = j3;
                    }
                    if (j3 < aVar.f21009f) {
                        aVar.f21009f = j3;
                    }
                    i12 = i13;
                }
            }
            long[] jArr = this.f21012a;
            if (jArr.length > 1) {
                this.f21020k = jArr[1] - jArr[0];
            } else {
                this.f21020k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.f21018i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.f21019j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i14 = 0; i14 < this.d.size(); i14++) {
            a aVar2 = (a) this.d.get(i14);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(aVar2.f21007c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        aVar2.f21010g = v4.h("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    aVar2.h = parseColor;
                    aVar2.f21011i = i0.a.f(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                aVar2.d = optJSONObject2.getString(aVar2.f21007c);
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

    public final int a(float f10, int i7) {
        int length = this.f21013b.length;
        if (f10 == 1.0f) {
            return length - 1;
        }
        int i10 = length - 1;
        int i11 = i10;
        while (i7 <= i11) {
            int i12 = (i11 + i7) >> 1;
            float[] fArr = this.f21013b;
            float f11 = fArr[i12];
            if ((f10 > f11 && (i12 == i10 || f10 < fArr[i12 + 1])) || f10 == f11) {
                return i12;
            }
            if (f10 < f11) {
                i11 = i12 - 1;
            } else if (f10 > f11) {
                i7 = i12 + 1;
            }
        }
        return i11;
    }

    public final int b(float f10, int i7, int i10) {
        float[] fArr = this.f21013b;
        int length = fArr.length;
        if (f10 <= fArr[i7]) {
            return i7;
        }
        if (f10 >= fArr[i10]) {
            return i10;
        }
        while (i7 <= i10) {
            int i11 = (i10 + i7) >> 1;
            float[] fArr2 = this.f21013b;
            float f11 = fArr2[i11];
            if ((f10 > f11 && (i11 == length - 1 || f10 < fArr2[i11 + 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i7 = i11 + 1;
            }
        }
        return i10;
    }

    public final int c(float f10) {
        int length;
        int i7 = 0;
        if (f10 == 0.0f || (length = this.f21013b.length) < 2) {
            return 0;
        }
        int i10 = length - 1;
        while (i7 <= i10) {
            int i11 = (i10 + i7) >> 1;
            float[] fArr = this.f21013b;
            float f11 = fArr[i11];
            if ((f10 < f11 && (i11 == 0 || f10 > fArr[i11 - 1])) || f10 == f11) {
                return i11;
            }
            if (f10 < f11) {
                i10 = i11 - 1;
            } else if (f10 > f11) {
                i7 = i11 + 1;
            }
        }
        return i7;
    }

    public void e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.f21012a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j3 = jArr[0];
        long j10 = jArr[length - 1];
        float[] fArr = new float[length];
        this.f21013b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i7 = 0; i7 < length; i7++) {
                this.f21013b[i7] = ((float) (this.f21012a[i7] - j3)) / ((float) (j10 - j3));
            }
        }
        for (int i10 = 0; i10 < this.d.size(); i10++) {
            if (((a) this.d.get(i10)).f21008e > this.f21015e) {
                this.f21015e = ((a) this.d.get(i10)).f21008e;
            }
            if (((a) this.d.get(i10)).f21009f < this.f21016f) {
                this.f21016f = ((a) this.d.get(i10)).f21009f;
            }
            ((a) this.d.get(i10)).f21006b = new k8.a(((a) this.d.get(i10)).f21005a);
        }
        long j11 = this.f21020k;
        this.f21014c = new String[((int) ((j10 - j3) / j11)) + 10];
        if (j11 == 1) {
            simpleDateFormat = null;
        } else if (j11 < 86400000) {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        } else {
            simpleDateFormat = new SimpleDateFormat("MMM d");
        }
        int i11 = 0;
        while (true) {
            String[] strArr = this.f21014c;
            if (i11 < strArr.length) {
                if (this.f21020k == 1) {
                    strArr[i11] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i11));
                } else {
                    strArr[i11] = simpleDateFormat.format(new Date((i11 * this.f21020k) + j3));
                }
                i11++;
            } else {
                long[] jArr2 = this.f21012a;
                this.f21017g = ((float) this.f21020k) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            }
        }
    }
}
