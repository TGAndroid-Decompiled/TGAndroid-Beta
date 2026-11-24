package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
public final class x4c extends FrameLayout implements tjb {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final w4c d;
    public final w4c e;
    public int f;
    public int h;

    public x4c(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setText(k96.M0(2131743652, null));
        linearLayout.addView(textView, nme.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(gl.N(2.0f), 1.0f);
        linearLayout.addView(textView2, nme.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), nme.p(-2, 1, 17.0f, 1));
        w4c w4cVar = new w4c(activity);
        this.d = w4cVar;
        w4cVar.setPadding(gl.L(10.0f), gl.L(5.0f), gl.L(10.0f), gl.L(7.0f));
        w4cVar.setTypeface(gl.o());
        w4cVar.setTextSize(1, 14.22f);
        w4cVar.setText(k96.M0(2131743671, null));
        linearLayout2.addView(w4cVar, nme.o(-2, 30));
        linearLayout2.addView(new Space(activity), nme.p(-2, 1, 17.0f, 1));
        w4c w4cVar2 = new w4c(activity);
        this.e = w4cVar2;
        w4cVar2.setPadding(gl.L(10.0f), gl.L(5.0f), gl.L(10.0f), gl.L(7.0f));
        w4cVar2.setTypeface(gl.o());
        w4cVar2.setTextSize(1, 14.22f);
        w4cVar2.setText(k96.M0(2131743661, null));
        linearLayout2.addView(w4cVar2, nme.o(-2, 30));
        linearLayout2.addView(new Space(activity), nme.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, nme.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, nme.e(-1, -1, 119));
        updateColors();
    }

    public static String a(u4c u4cVar) {
        if (u4cVar == null) {
            return "";
        }
        String str = u4cVar.f;
        String valueOf = String.valueOf(u4cVar.e);
        if (!TextUtils.isEmpty(str) && !valueOf.isEmpty()) {
            valueOf = valueOf.concat(", ");
        }
        return b00.h(valueOf, str);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            size = gl.q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.q.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        w4c w4cVar;
        w4c w4cVar2;
        float f;
        TextView textView2 = this.b;
        if (textView2 != null && (textView = this.c) != null && (w4cVar = this.d) != null && (w4cVar2 = this.e) != null) {
            textView2.setTextColor(bkb.w0(null, bkb.F6, false));
            textView.setTextColor(bkb.w0(null, bkb.x6, false));
            int i = bkb.H6;
            w4cVar.setTextColor(bkb.w0(null, i, false));
            int w0 = bkb.w0(null, i, false);
            float f2 = 0.15f;
            if (bkb.I.o()) {
                f = 0.3f;
            } else {
                f = 0.15f;
            }
            int p1 = bkb.p1(f, w0);
            if (w4cVar.getBackground() != null) {
                if (p1 != this.f) {
                    bkb.F1(w4cVar.getBackground(), p1, true);
                }
            } else {
                w4cVar.setBackground(bkb.f0(p1, 7, gl.L(8.0f)));
            }
            int i2 = bkb.p7;
            w4cVar2.setTextColor(bkb.w0(null, i2, false));
            int w02 = bkb.w0(null, i2, false);
            if (bkb.I.o()) {
                f2 = 0.3f;
            }
            int p12 = bkb.p1(f2, w02);
            if (w4cVar2.getBackground() != null) {
                if (p12 != this.h) {
                    bkb.F1(w4cVar2.getBackground(), p12, true);
                }
            } else {
                w4cVar2.setBackground(bkb.f0(p12, 7, gl.L(8.0f)));
            }
            this.f = p1;
            this.h = p12;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
