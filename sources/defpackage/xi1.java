package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public final class xi1 extends LinearLayout {
    public final LinearLayout a;
    public final LinearLayout[] b;
    public final fm[] c;
    public final TextView[] d;
    public final TextView e;
    public final DecimalFormat f;

    public xi1(Context context, wjb wjbVar) {
        super(context);
        this.b = new LinearLayout[2];
        this.c = new fm[2];
        this.d = new TextView[2];
        setOrientation(1);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.k(22.0f, 9.0f, 22.0f, 0.0f, -1, -2));
        for (int i = 0; i < 2; i++) {
            this.b[i] = new LinearLayout(context);
            this.b[i].setOrientation(0);
            this.a.addView(this.b[i], nme.p(-1, -2, 1.0f, 119));
            this.c[i] = new fm(context);
            this.c[i].setTypeface(gl.o());
            this.c[i].setTextSize(1, 16.0f);
            zkb.X(this.c[i], bkb.F6, wjbVar);
            this.b[i].addView(this.c[i], nme.t(-2, -2, 80, 0, 0, 5, 0));
            this.d[i] = new fm(context);
            this.d[i].setTextSize(1, 11.5f);
            zkb.X(this.d[i], bkb.x6, wjbVar);
            this.b[i].addView(this.d[i], nme.r(-2, -2, 80));
        }
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 13.0f);
        zkb.X(textView, bkb.x6, wjbVar);
        addView(textView, nme.t(-1, -2, 55, 22, 5, 22, 9));
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        this.f = decimalFormat;
        decimalFormat.setMinimumFractionDigits(2);
        decimalFormat.setMaximumFractionDigits(12);
        decimalFormat.setGroupingUsed(false);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void set(wi1 wi1Var) {
        String str;
        long j;
        int i;
        int indexOf;
        this.e.setText(wi1Var.c);
        int i2 = 0;
        while (i2 < 2) {
            if (i2 == 0) {
                str = wi1Var.b;
                j = wi1Var.e;
            } else {
                str = wi1Var.h;
                j = wi1Var.j;
            }
            LinearLayout[] linearLayoutArr = this.b;
            if (i2 == 0 && !wi1Var.a) {
                linearLayoutArr[i2].setVisibility(8);
            } else if (i2 == 1 && !wi1Var.g) {
                linearLayoutArr[i2].setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tb4.o(str, " "));
                boolean equalsIgnoreCase = "TON".equalsIgnoreCase(str);
                TextView[] textViewArr = this.c;
                if (equalsIgnoreCase) {
                    String format = this.f.format(wi1Var.d / 1.0E9d);
                    int indexOf2 = format.indexOf(46);
                    i = i2;
                    if (indexOf2 >= 0) {
                        spannableStringBuilder.append((CharSequence) k96.E((long) Math.floor(wi1Var.d / 1.0E9d), ' '));
                        spannableStringBuilder.append((CharSequence) format.substring(indexOf2));
                    } else {
                        spannableStringBuilder.append((CharSequence) format);
                    }
                    spannableStringBuilder = zi1.L(spannableStringBuilder, textViewArr[i].getPaint(), 1.05f, 0.0f, true);
                } else {
                    i = i2;
                    if ("XTR".equalsIgnoreCase(str)) {
                        if (i == 0) {
                            spannableStringBuilder.append((CharSequence) k96.E(wi1Var.d, ' '));
                        } else {
                            spannableStringBuilder.append((CharSequence) jva.G0(wi1Var.i, 0.8f, ' '));
                        }
                        spannableStringBuilder = jva.a1(false, spannableStringBuilder, 0.7f, null);
                    } else {
                        spannableStringBuilder.append((CharSequence) Long.toString(wi1Var.d));
                    }
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if ("TON".equalsIgnoreCase(str) && (indexOf = TextUtils.indexOf(spannableStringBuilder2, ".")) >= 0) {
                    spannableStringBuilder2.setSpan(new RelativeSizeSpan(0.8125f), indexOf, spannableStringBuilder2.length(), 33);
                }
                linearLayoutArr[i].setVisibility(0);
                textViewArr[i].setText(spannableStringBuilder2);
                TextView textView = this.d[i];
                textView.setText("≈" + ci0.h().e(j, wi1Var.f));
                i2 = i + 1;
            }
            i = i2;
            i2 = i + 1;
        }
    }
}
