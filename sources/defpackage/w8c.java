package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
public final class w8c extends FrameLayout implements snb {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final v8c d;
    public final v8c e;
    public int f;
    public int h;

    public w8c(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setText(ob6.M0(2131743546, null));
        linearLayout.addView(textView, tre.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(hl.N(2.0f), 1.0f);
        linearLayout.addView(textView2, tre.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), tre.p(-2, 1, 17.0f, 1));
        v8c v8cVar = new v8c(activity);
        this.d = v8cVar;
        v8cVar.setPadding(hl.L(10.0f), hl.L(5.0f), hl.L(10.0f), hl.L(7.0f));
        v8cVar.setTypeface(hl.o());
        v8cVar.setTextSize(1, 14.22f);
        v8cVar.setText(ob6.M0(2131743565, null));
        linearLayout2.addView(v8cVar, tre.o(-2, 30));
        linearLayout2.addView(new Space(activity), tre.p(-2, 1, 17.0f, 1));
        v8c v8cVar2 = new v8c(activity);
        this.e = v8cVar2;
        v8cVar2.setPadding(hl.L(10.0f), hl.L(5.0f), hl.L(10.0f), hl.L(7.0f));
        v8cVar2.setTypeface(hl.o());
        v8cVar2.setTextSize(1, 14.22f);
        v8cVar2.setText(ob6.M0(2131743555, null));
        linearLayout2.addView(v8cVar2, tre.o(-2, 30));
        linearLayout2.addView(new Space(activity), tre.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, tre.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, tre.e(-1, -1, 119));
        updateColors();
    }

    public static String a(t8c t8cVar) {
        if (t8cVar == null) {
            return "";
        }
        String str = t8cVar.f;
        String valueOf = String.valueOf(t8cVar.e);
        if (!TextUtils.isEmpty(str) && !valueOf.isEmpty()) {
            valueOf = valueOf.concat(", ");
        }
        return c00.i(valueOf, str);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            size = hl.q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.q.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        v8c v8cVar;
        v8c v8cVar2;
        float f;
        TextView textView2 = this.b;
        if (textView2 != null && (textView = this.c) != null && (v8cVar = this.d) != null && (v8cVar2 = this.e) != null) {
            textView2.setTextColor(aob.w0(null, aob.G6, false));
            textView.setTextColor(aob.w0(null, aob.y6, false));
            int i = aob.I6;
            v8cVar.setTextColor(aob.w0(null, i, false));
            int w0 = aob.w0(null, i, false);
            float f2 = 0.15f;
            if (aob.I.o()) {
                f = 0.3f;
            } else {
                f = 0.15f;
            }
            int p1 = aob.p1(f, w0);
            if (v8cVar.getBackground() != null) {
                if (p1 != this.f) {
                    aob.F1(v8cVar.getBackground(), p1, true);
                }
            } else {
                v8cVar.setBackground(aob.f0(p1, 7, hl.L(8.0f)));
            }
            int i2 = aob.q7;
            v8cVar2.setTextColor(aob.w0(null, i2, false));
            int w02 = aob.w0(null, i2, false);
            if (aob.I.o()) {
                f2 = 0.3f;
            }
            int p12 = aob.p1(f2, w02);
            if (v8cVar2.getBackground() != null) {
                if (p12 != this.h) {
                    aob.F1(v8cVar2.getBackground(), p12, true);
                }
            } else {
                v8cVar2.setBackground(aob.f0(p12, 7, hl.L(8.0f)));
            }
            this.f = p1;
            this.h = p12;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
