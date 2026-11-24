package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
public final class l55 extends FrameLayout implements vlb {
    public static final int h = 0;
    public final fn a;
    public final rj b;
    public final FrameLayout.LayoutParams c;
    public final ylb d;
    public int e;
    public boolean f;

    public l55(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        int i3;
        int i4;
        this.e = 32;
        this.d = ylbVar;
        anb.h(cmb.d7, ylbVar, this);
        fn fnVar = new fn(getContext());
        this.a = fnVar;
        fnVar.setTextSize(1, 14.0f);
        fnVar.setTypeface(gm.o());
        int i5 = cmb.e7;
        anb.X(fnVar, i5, ylbVar);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        fnVar.setGravity(i2 | 16);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i6 = i3 | 48;
        float f = i;
        addView(fnVar, qoe.d(-1, -1.0f, i6, f, 0.0f, f, 0.0f));
        rj rjVar = new rj(getContext(), true, true, true, (byte) 2);
        this.b = rjVar;
        rjVar.setPadding(gm.L(2.0f), 0, gm.L(2.0f), 0);
        rjVar.b(0.9f, 420L, d53.h);
        rjVar.setTextSize(gm.L(14.0f));
        anb.U(rjVar, i5, ylbVar);
        if (jb6.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        rjVar.setGravity(i4);
        FrameLayout.LayoutParams d = qoe.d(-2, -1.0f, (jb6.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f);
        this.c = d;
        addView(rjVar, d);
        WeakHashMap weakHashMap = kfc.a;
        new yec(2131296686, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        rj rjVar = this.b;
        rjVar.c(charSequence, true, true);
        rjVar.setOnClickListener(onClickListener);
        rjVar.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        rj rjVar = this.b;
        rjVar.c(charSequence2, false, true);
        rjVar.setOnClickListener(onClickListener);
        rjVar.setVisibility(0);
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(this.e), 1073741824));
    }

    public void setLayerHeight(int i) {
        this.e = i;
        requestLayout();
    }

    public void setNoBackground(boolean z) {
        this.f = z;
        updateColors();
    }

    public void setRightText(CharSequence charSequence) {
        rj rjVar = this.b;
        rjVar.c(charSequence, true, true);
        rjVar.setVisibility(0);
    }

    public void setRightTextMargin(int i) {
        float f = i;
        int L = gm.L(f);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = gm.L(f);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        rj rjVar = this.b;
        rjVar.setVisibility(8);
        rjVar.setOnClickListener(null);
    }

    public void setTextColor(int i) {
        fn fnVar = this.a;
        ylb ylbVar = this.d;
        anb.X(fnVar, i, ylbVar);
        anb.U(this.b, i, ylbVar);
    }

    @Override
    public final void updateColors() {
        int v0;
        boolean z = this.f;
        ylb ylbVar = this.d;
        if (z) {
            v0 = 0;
        } else {
            v0 = cmb.v0(cmb.d7, ylbVar);
        }
        setBackgroundColor(v0);
        int i = cmb.e7;
        this.a.setTextColor(cmb.v0(i, ylbVar));
        this.b.setTextColor(cmb.v0(i, ylbVar));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public l55(Context context, ylb ylbVar) {
        this(16, ylbVar, context);
    }
}
