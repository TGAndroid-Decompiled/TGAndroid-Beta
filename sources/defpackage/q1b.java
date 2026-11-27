package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class q1b extends LinearLayout implements snb {
    public final TextView[] a;
    public final TextView[] b;
    public final TextView[] c;

    public q1b(Context context, int i) {
        super(context);
        int i2 = i << 1;
        this.a = new TextView[i2];
        this.b = new TextView[i2];
        this.c = new TextView[i2];
        setOrientation(1);
        setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        for (int i3 = 0; i3 < i; i3++) {
            LinearLayout j = uh9.j(context, 0);
            for (int i4 = 0; i4 < 2; i4++) {
                LinearLayout j2 = uh9.j(context, 1);
                LinearLayout j3 = uh9.j(context, 0);
                int i5 = (i3 << 1) + i4;
                this.a[i5] = new TextView(context);
                this.b[i5] = new TextView(context);
                this.c[i5] = new TextView(context);
                this.a[i5].setTypeface(hl.o());
                this.a[i5].setTextSize(1, 17.0f);
                this.c[i5].setTextSize(1, 13.0f);
                this.c[i5].setGravity(3);
                this.b[i5].setTextSize(1, 13.0f);
                this.b[i5].setPadding(hl.L(4.0f), 0, 0, 0);
                j3.addView(this.a[i5]);
                j3.addView(this.b[i5]);
                j2.addView(j3);
                j2.addView(this.c[i5]);
                j.addView(j2, tre.l(1.0f, -1, -2));
            }
            addView(j, tre.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, 16.0f));
        }
    }

    public final void a(String str, int i, String str2, String str3) {
        this.a[i].setText(str);
        this.b[i].setText(str2);
        this.c[i].setText(str3);
        updateColors();
    }

    public void setData(s1b s1bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        TextView[] textViewArr = this.a;
        textViewArr[0].setText(s1bVar.b);
        textViewArr[1].setText(s1bVar.f);
        textViewArr[2].setText(s1bVar.j);
        textViewArr[3].setText(s1bVar.n);
        TextView[] textViewArr2 = this.b;
        textViewArr2[0].setText(s1bVar.c);
        TextView textView = textViewArr2[0];
        if (s1bVar.d) {
            i = aob.x6;
        } else {
            i = aob.p7;
        }
        textView.setTag(Integer.valueOf(i));
        textViewArr2[1].setText(s1bVar.g);
        TextView textView2 = textViewArr2[1];
        if (s1bVar.h) {
            i2 = aob.x6;
        } else {
            i2 = aob.p7;
        }
        textView2.setTag(Integer.valueOf(i2));
        textViewArr2[2].setText(s1bVar.k);
        TextView textView3 = textViewArr2[2];
        if (s1bVar.l) {
            i3 = aob.x6;
        } else {
            i3 = aob.p7;
        }
        textView3.setTag(Integer.valueOf(i3));
        textViewArr2[3].setText(s1bVar.o);
        TextView textView4 = textViewArr2[3];
        if (s1bVar.p) {
            i4 = aob.x6;
        } else {
            i4 = aob.p7;
        }
        textView4.setTag(Integer.valueOf(i4));
        TextView[] textViewArr3 = this.c;
        textViewArr3[0].setText(s1bVar.a);
        textViewArr3[1].setText(s1bVar.e);
        textViewArr3[2].setText(s1bVar.i);
        textViewArr3[3].setText(s1bVar.m);
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
                int i2 = aob.G6;
                textView.setTextColor(aob.w0(null, i2, false));
                textViewArr2[i].setTextColor(aob.w0(null, aob.z6, false));
                Integer num = (Integer) textViewArr[i].getTag();
                if (num != null) {
                    textViewArr[i].setTextColor(aob.w0(null, num.intValue(), false));
                } else {
                    textViewArr[i].setTextColor(aob.w0(null, i2, false));
                }
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
