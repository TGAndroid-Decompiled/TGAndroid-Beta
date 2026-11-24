package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
public final class x6c extends FrameLayout implements vlb {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final w6c d;
    public final w6c e;
    public int f;
    public int h;

    public x6c(Activity activity) {
        super(activity);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.a = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(activity);
        this.b = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131743578, null));
        linearLayout.addView(textView, qoe.q(-1, -2, 0.0f, 55, 28, 8, 28, 0));
        TextView textView2 = new TextView(activity);
        this.c = textView2;
        textView2.setGravity(17);
        textView2.setTextSize(1, 13.0f);
        textView2.setLineSpacing(gm.N(2.0f), 1.0f);
        linearLayout.addView(textView2, qoe.q(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(activity), qoe.p(-2, 1, 17.0f, 1));
        w6c w6cVar = new w6c(activity);
        this.d = w6cVar;
        w6cVar.setPadding(gm.L(10.0f), gm.L(5.0f), gm.L(10.0f), gm.L(7.0f));
        w6cVar.setTypeface(gm.o());
        w6cVar.setTextSize(1, 14.22f);
        w6cVar.setText(jb6.M0(2131743597, null));
        linearLayout2.addView(w6cVar, qoe.o(-2, 30));
        linearLayout2.addView(new Space(activity), qoe.p(-2, 1, 17.0f, 1));
        w6c w6cVar2 = new w6c(activity);
        this.e = w6cVar2;
        w6cVar2.setPadding(gm.L(10.0f), gm.L(5.0f), gm.L(10.0f), gm.L(7.0f));
        w6cVar2.setTypeface(gm.o());
        w6cVar2.setTextSize(1, 14.22f);
        w6cVar2.setText(jb6.M0(2131743587, null));
        linearLayout2.addView(w6cVar2, qoe.o(-2, 30));
        linearLayout2.addView(new Space(activity), qoe.p(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, qoe.k(28.0f, 4.0f, 28.0f, 8.0f, -1, -2));
        addView(linearLayout, qoe.e(-1, -1, 119));
        updateColors();
    }

    public static String a(u6c u6cVar) {
        if (u6cVar == null) {
            return "";
        }
        String str = u6cVar.f;
        String valueOf = String.valueOf(u6cVar.e);
        if (!TextUtils.isEmpty(str) && !valueOf.isEmpty()) {
            valueOf = valueOf.concat(", ");
        }
        return b10.h(valueOf, str);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            size = gm.q.x;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gm.q.y, Integer.MIN_VALUE);
        LinearLayout linearLayout = this.a;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    @Override
    public final void updateColors() {
        TextView textView;
        w6c w6cVar;
        w6c w6cVar2;
        float f;
        TextView textView2 = this.b;
        if (textView2 != null && (textView = this.c) != null && (w6cVar = this.d) != null && (w6cVar2 = this.e) != null) {
            textView2.setTextColor(cmb.w0(null, cmb.F6, false));
            textView.setTextColor(cmb.w0(null, cmb.x6, false));
            int i = cmb.H6;
            w6cVar.setTextColor(cmb.w0(null, i, false));
            int w0 = cmb.w0(null, i, false);
            float f2 = 0.15f;
            if (cmb.I.o()) {
                f = 0.3f;
            } else {
                f = 0.15f;
            }
            int p1 = cmb.p1(f, w0);
            if (w6cVar.getBackground() != null) {
                if (p1 != this.f) {
                    cmb.F1(w6cVar.getBackground(), p1, true);
                }
            } else {
                w6cVar.setBackground(cmb.f0(p1, 7, gm.L(8.0f)));
            }
            int i2 = cmb.p7;
            w6cVar2.setTextColor(cmb.w0(null, i2, false));
            int w02 = cmb.w0(null, i2, false);
            if (cmb.I.o()) {
                f2 = 0.3f;
            }
            int p12 = cmb.p1(f2, w02);
            if (w6cVar2.getBackground() != null) {
                if (p12 != this.h) {
                    cmb.F1(w6cVar2.getBackground(), p12, true);
                }
            } else {
                w6cVar2.setBackground(cmb.f0(p12, 7, gm.L(8.0f)));
            }
            this.f = p1;
            this.h = p12;
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
