package defpackage;

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
public class nl1 {
    public long[] a;
    public float[] b;
    public String[] c;
    public ArrayList d = new ArrayList();
    public long e = 0;
    public long f = Long.MAX_VALUE;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i;
    public int j;
    public long k;

    public nl1(JSONObject jSONObject) {
        this.i = 0;
        this.j = 0;
        JSONArray jSONArray = jSONObject.getJSONArray("columns");
        jSONArray.length();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            if (jSONArray2.getString(0).equals("x")) {
                int length = jSONArray2.length() - 1;
                this.a = new long[length];
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    this.a[i2] = jSONArray2.getLong(i3);
                    i2 = i3;
                }
            } else {
                ml1 ml1Var = new ml1();
                this.d.add(ml1Var);
                int length2 = jSONArray2.length() - 1;
                ml1Var.c = jSONArray2.getString(0);
                ml1Var.a = new long[length2];
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = i4 + 1;
                    ml1Var.a[i4] = jSONArray2.getLong(i5);
                    long j = ml1Var.a[i4];
                    if (j > ml1Var.e) {
                        ml1Var.e = j;
                    }
                    if (j < ml1Var.f) {
                        ml1Var.f = j;
                    }
                    i4 = i5;
                }
            }
            long[] jArr = this.a;
            if (jArr.length > 1) {
                this.k = jArr[1] - jArr[0];
            } else {
                this.k = 86400000L;
            }
            e();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("colors");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("names");
        try {
            d(jSONObject.getString("xTickFormatter"));
            this.i = d(jSONObject.getString("yTickFormatter"));
            d(jSONObject.getString("xTooltipFormatter"));
            this.j = d(jSONObject.getString("yTooltipFormatter"));
        } catch (Exception unused) {
        }
        Pattern compile = Pattern.compile("(.*)(#.*)");
        for (int i6 = 0; i6 < this.d.size(); i6++) {
            ml1 ml1Var2 = (ml1) this.d.get(i6);
            if (optJSONObject != null) {
                Matcher matcher = compile.matcher(optJSONObject.getString(ml1Var2.c));
                if (matcher.matches()) {
                    if (!TextUtils.isEmpty(matcher.group(1))) {
                        ml1Var2.g = nxe.d("statisticChartLine_" + matcher.group(1).toLowerCase());
                    }
                    int parseColor = Color.parseColor(matcher.group(2));
                    ml1Var2.h = parseColor;
                    ml1Var2.i = on2.f(0.85f, -1, parseColor);
                }
            }
            if (optJSONObject2 != null) {
                ml1Var2.d = optJSONObject2.getString(ml1Var2.c);
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

    public final int a(float f, int i) {
        int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        int length = this.b.length - 1;
        if (i2 == 0) {
            return length;
        }
        int i3 = length;
        while (i <= i3) {
            int i4 = (i3 + i) >> 1;
            float[] fArr = this.b;
            float f2 = fArr[i4];
            if ((f > f2 && (i4 == length || f < fArr[i4 + 1])) || f == f2) {
                return i4;
            }
            if (f < f2) {
                i3 = i4 - 1;
            } else if (f > f2) {
                i = i4 + 1;
            }
        }
        return i3;
    }

    public final int b(float f, int i, int i2) {
        float[] fArr = this.b;
        int length = fArr.length;
        if (f <= fArr[i]) {
            return i;
        }
        if (f >= fArr[i2]) {
            return i2;
        }
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr2 = this.b;
            float f2 = fArr2[i3];
            if ((f > f2 && (i3 == length - 1 || f < fArr2[i3 + 1])) || f == f2) {
                return i3;
            }
            if (f < f2) {
                i2 = i3 - 1;
            } else if (f > f2) {
                i = i3 + 1;
            }
        }
        return i2;
    }

    public final int c(float f) {
        int length;
        int i = 0;
        if (f == 0.0f || (length = this.b.length) < 2) {
            return 0;
        }
        int i2 = length - 1;
        while (i <= i2) {
            int i3 = (i2 + i) >> 1;
            float[] fArr = this.b;
            float f2 = fArr[i3];
            if ((f < f2 && (i3 == 0 || f > fArr[i3 - 1])) || f == f2) {
                return i3;
            }
            if (f < f2) {
                i2 = i3 - 1;
            } else if (f > f2) {
                i = i3 + 1;
            }
        }
        return i;
    }

    public void e() {
        SimpleDateFormat simpleDateFormat;
        long[] jArr = this.a;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        long j = jArr[0];
        long j2 = jArr[length - 1];
        float[] fArr = new float[length];
        this.b = fArr;
        if (length == 1) {
            fArr[0] = 1.0f;
        } else {
            for (int i = 0; i < length; i++) {
                this.b[i] = ((float) (this.a[i] - j)) / ((float) (j2 - j));
            }
        }
        for (int i2 = 0; i2 < this.d.size(); i2++) {
            if (((ml1) this.d.get(i2)).e > this.e) {
                this.e = ((ml1) this.d.get(i2)).e;
            }
            if (((ml1) this.d.get(i2)).f < this.f) {
                this.f = ((ml1) this.d.get(i2)).f;
            }
            ((ml1) this.d.get(i2)).b = new mj4(((ml1) this.d.get(i2)).a);
        }
        long j3 = this.k;
        this.c = new String[((int) ((j2 - j) / j3)) + 10];
        if (j3 == 1) {
            simpleDateFormat = null;
        } else if (j3 < 86400000) {
            simpleDateFormat = new SimpleDateFormat("HH:mm");
        } else {
            simpleDateFormat = new SimpleDateFormat("MMM d");
        }
        int i3 = 0;
        while (true) {
            String[] strArr = this.c;
            int length2 = strArr.length;
            long j4 = this.k;
            if (i3 < length2) {
                if (j4 == 1) {
                    strArr[i3] = String.format(Locale.ENGLISH, "%02d:00", Integer.valueOf(i3));
                } else {
                    strArr[i3] = simpleDateFormat.format(new Date((i3 * this.k) + j));
                }
                i3++;
            } else {
                long[] jArr2 = this.a;
                this.g = ((float) j4) / ((float) (jArr2[jArr2.length - 1] - jArr2[0]));
                return;
            }
        }
    }
}
