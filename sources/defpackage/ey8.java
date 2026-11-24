package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
public final class ey8 implements LeadingMarginSpan {
    public final float[] E;
    public final Path F;
    public final Paint G;
    public final float[] H;
    public final Path I;
    public int J;
    public u20 K;
    public SpannableString L;
    public final boolean a;
    public boolean b = true;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public final dy8 s;
    public yk w;
    public final Drawable x;
    public final Paint y;

    public ey8(boolean z, boolean z2, dy8 dy8Var) {
        Paint paint = new Paint(1);
        this.y = paint;
        this.E = new float[8];
        this.F = new Path();
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new float[8];
        this.I = new Path();
        this.J = -1;
        this.a = z;
        this.s = dy8Var;
        this.e = z2;
        this.x = b00.d(a.b, 2131231970);
        paint2.setColor(this.J);
        paint.setColor(bm2.o(this.J, 30));
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2;
        int i3;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        dy8[] dy8VarArr = (dy8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dy8.class);
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= dy8VarArr.length) {
                break;
            }
            dy8 dy8Var = dy8VarArr[i4];
            int spanStart = spannableStringBuilder.getSpanStart(dy8Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(dy8Var);
            treeSet.add(Integer.valueOf(spanStart));
            Integer valueOf = Integer.valueOf(spanStart);
            if (hashMap.containsKey(Integer.valueOf(spanStart))) {
                i2 = ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue();
            } else {
                i2 = 0;
            }
            if (dy8Var.a.e) {
                i5 = 16;
            }
            hashMap.put(valueOf, Integer.valueOf(i2 | i5));
            treeSet.add(Integer.valueOf(spanEnd));
            Integer valueOf2 = Integer.valueOf(spanEnd);
            if (hashMap.containsKey(Integer.valueOf(spanEnd))) {
                i3 = ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue();
            } else {
                i3 = 0;
            }
            hashMap.put(valueOf2, Integer.valueOf(i3 | 2));
            spannableStringBuilder.removeSpan(dy8Var);
            spannableStringBuilder.removeSpan(dy8Var.a);
            i4++;
        }
        Iterator it = treeSet.iterator();
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = ((Integer) hashMap.get(num)).intValue();
            if (i6 != intValue) {
                int i8 = intValue - 1;
                if (i8 >= 0 && i8 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i8) == '\n') {
                    i = intValue - 1;
                } else {
                    i = intValue;
                }
                if (i7 > 0) {
                    c(spannableStringBuilder, i6, i, z);
                }
                i6 = intValue + 1;
                if (i6 >= spannableStringBuilder.length() || spannableStringBuilder.charAt(intValue) != '\n') {
                    i6 = intValue;
                }
            }
            if ((intValue2 & 2) != 0) {
                i7--;
            }
            if ((intValue2 & 1) != 0 || (intValue2 & 16) != 0) {
                i7++;
                if ((intValue2 & 16) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (i6 < spannableStringBuilder.length() && i7 > 0) {
            c(spannableStringBuilder, i6, spannableStringBuilder.length(), z);
        }
    }

    public static void b(Spannable spannable, int i, int i2, boolean z) {
        ey8[] ey8VarArr = (ey8[]) spannable.getSpans(i, i2, ey8.class);
        if (ey8VarArr != null && ey8VarArr.length > 0) {
            return;
        }
        int j = Utilities.j(i, spannable.length(), 0);
        int j2 = Utilities.j(i2, spannable.length(), 0);
        ?? metricAffectingSpan = new MetricAffectingSpan();
        ey8 ey8Var = new ey8(false, z, metricAffectingSpan);
        metricAffectingSpan.a = ey8Var;
        ey8Var.c = j;
        ey8Var.d = j2;
        spannable.setSpan(metricAffectingSpan, j, j2, 33);
        spannable.setSpan(ey8Var, j, j2, 33);
    }

    public static int c(Editable editable, int i, int i2, boolean z) {
        if (editable == 0) {
            return -1;
        }
        int j = Utilities.j(i, editable.length(), 0);
        int j2 = Utilities.j(i2, editable.length(), 0);
        if (j > 0 && editable.charAt(j - 1) != '\n') {
            editable.insert(j, "\n");
            j++;
            j2++;
        }
        int i3 = j2 + 1;
        if (j2 >= editable.length() || editable.charAt(j2) != '\n') {
            editable.insert(j2, "\n");
        }
        ?? metricAffectingSpan = new MetricAffectingSpan();
        ey8 ey8Var = new ey8(true, z, metricAffectingSpan);
        metricAffectingSpan.a = ey8Var;
        ey8Var.c = j;
        ey8Var.d = j2;
        editable.setSpan(ey8Var, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.setSpan(metricAffectingSpan, Utilities.j(j, editable.length(), 0), Utilities.j(j2, editable.length(), 0), 33);
        editable.insert(Utilities.j(j2, editable.length(), 0), "\ufeff");
        editable.delete(Utilities.j(j2, editable.length(), 0), Utilities.j(i3, editable.length(), 0));
        return i3;
    }

    public static java.util.ArrayList d(defpackage.lt3 r20, android.text.Layout r21, java.util.ArrayList r22, boolean[] r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey8.d(lt3, android.text.Layout, java.util.ArrayList, boolean[]):java.util.ArrayList");
    }

    public static ArrayList e(Layout layout, ArrayList arrayList) {
        ey8[] ey8VarArr;
        if (layout == null) {
            if (arrayList != null) {
                arrayList.clear();
                return arrayList;
            }
        } else {
            CharSequence text = layout.getText();
            if (text != null && (text instanceof Spanned)) {
                Spanned spanned = (Spanned) text;
                if (arrayList != null) {
                    arrayList.clear();
                }
                for (ey8 ey8Var : (ey8[]) spanned.getSpans(0, spanned.length(), ey8.class)) {
                    boolean z = ey8Var.n;
                    ay8 ay8Var = new ay8(null, layout, spanned, ey8Var);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ay8Var);
                }
                return arrayList;
            } else if (arrayList != null) {
                arrayList.clear();
            }
        }
        return arrayList;
    }

    @Override
    public final int getLeadingMargin(boolean z) {
        float f;
        if (this.b) {
            f = 8.0f;
        } else {
            f = 10.0f;
        }
        return gl.L(f);
    }

    @Override
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
    }
}
