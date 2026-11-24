package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class rza extends LinearLayout implements vlb {
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public rza(Context context, int i) {
        super(context);
        int i2 = i << 1;
        this.a = new TextView[i2];
        this.b = new TextView[i2];
        this.c = new TextView[i2];
        setOrientation(1);
        setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        for (int i3 = 0; i3 < i; i3++) {
            LinearLayout i4 = hg9.i(context, 0);
            for (int i5 = 0; i5 < 2; i5++) {
                LinearLayout i6 = hg9.i(context, 1);
                LinearLayout i7 = hg9.i(context, 0);
                int i8 = (i3 << 1) + i5;
                this.a[i8] = new TextView(context);
                this.b[i8] = new TextView(context);
                this.c[i8] = new TextView(context);
                this.a[i8].setTypeface(gm.o());
                this.a[i8].setTextSize(1, 17.0f);
                this.c[i8].setTextSize(1, 13.0f);
                this.c[i8].setGravity(3);
                this.b[i8].setTextSize(1, 13.0f);
                this.b[i8].setPadding(gm.L(4.0f), 0, 0, 0);
                i7.addView(this.a[i8]);
                i7.addView(this.b[i8]);
                i6.addView(i7);
                i6.addView(this.c[i8]);
                i4.addView(i6, qoe.l(1.0f, -1, -2));
            }
            addView(i4, qoe.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i, String str2, String str3) {
        this.a[i].setText(str);
        this.b[i].setText(str2);
        this.c[i].setText(str3);
        updateColors();
    }

    public void setData(tza tzaVar) {
        int i;
        int i2;
        int i3;
        int i4;
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(tzaVar.b);
        textViewArr[1].setText(tzaVar.f);
        textViewArr[2].setText(tzaVar.j);
        textViewArr[3].setText(tzaVar.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(tzaVar.c);
        TextView textView = textViewArr2[0];
        if (tzaVar.d) {
            i = cmb.w6;
        } else {
            i = cmb.o7;
        }
        textView.setTag(Integer.valueOf(i));
        textViewArr2[1].setText(tzaVar.g);
        TextView textView2 = textViewArr2[1];
        if (tzaVar.h) {
            i2 = cmb.w6;
        } else {
            i2 = cmb.o7;
        }
        textView2.setTag(Integer.valueOf(i2));
        textViewArr2[2].setText(tzaVar.k);
        TextView textView3 = textViewArr2[2];
        if (tzaVar.l) {
            i3 = cmb.w6;
        } else {
            i3 = cmb.o7;
        }
        textView3.setTag(Integer.valueOf(i3));
        textViewArr2[3].setText(tzaVar.o);
        TextView textView4 = textViewArr2[3];
        if (tzaVar.p) {
            i4 = cmb.w6;
        } else {
            i4 = cmb.o7;
        }
        textView4.setTag(Integer.valueOf(i4));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(tzaVar.a);
        textViewArr3[1].setText(tzaVar.e);
        textViewArr3[2].setText(tzaVar.i);
        textViewArr3[3].setText(tzaVar.m);
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextView[] textViewArr;
        TextView[] textViewArr2;
        TextView[] textViewArr3 = this.a;
        if (textViewArr3 != null && (textViewArr = this.b) != null && (textViewArr2 = this.c) != null) {
            for (int i = 0; i < textViewArr3.length; i++) {
                TextView textView = textViewArr3[i];
                int i2 = cmb.F6;
                textView.setTextColor(cmb.w0(null, i2, false));
                textViewArr2[i].setTextColor(cmb.w0(null, cmb.y6, false));
                Integer num = (Integer) textViewArr[i].getTag();
                if (num != null) {
                    textViewArr[i].setTextColor(cmb.w0(null, num.intValue(), false));
                } else {
                    textViewArr[i].setTextColor(cmb.w0(null, i2, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
