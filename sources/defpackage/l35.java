package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.WeakHashMap;
public final class l35 extends FrameLayout implements tjb {
    public static final int h = 0;
    public final fm a;
    public final ri b;
    public final FrameLayout.LayoutParams c;
    public final wjb d;
    public int e;
    public boolean f;

    public l35(int i, wjb wjbVar, Context context) {
        super(context);
        int i2;
        int i3;
        int i4;
        this.e = 32;
        this.d = wjbVar;
        zkb.h(bkb.d7, wjbVar, this);
        fm fmVar = new fm(getContext());
        this.a = fmVar;
        fmVar.setTextSize(1, 14.0f);
        fmVar.setTypeface(gl.o());
        int i5 = bkb.e7;
        zkb.X(fmVar, i5, wjbVar);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        fmVar.setGravity(i2 | 16);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i6 = i3 | 48;
        float f = i;
        addView(fmVar, nme.d(-1, -1.0f, i6, f, 0.0f, f, 0.0f));
        ri riVar = new ri(getContext(), true, true, true, (byte) 2);
        this.b = riVar;
        riVar.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        riVar.b(0.9f, 420L, s33.h);
        riVar.setTextSize(gl.L(14.0f));
        zkb.U(riVar, i5, wjbVar);
        if (k96.a0) {
            i4 = 3;
        } else {
            i4 = 5;
        }
        riVar.setGravity(i4);
        FrameLayout.LayoutParams d = nme.d(-2, -1.0f, (k96.a0 ? 3 : 5) | 48, f, 0.0f, f, 0.0f);
        this.c = d;
        addView(riVar, d);
        WeakHashMap weakHashMap = jdc.a;
        new xcc(2131296686, Boolean.class, 0, 28, (byte) 2).a(this, Boolean.TRUE);
    }

    public final void a(CharSequence charSequence, View.OnClickListener onClickListener) {
        ri riVar = this.b;
        riVar.c(charSequence, true, true);
        riVar.setOnClickListener(onClickListener);
        riVar.setVisibility(0);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.a.setText(charSequence);
        ri riVar = this.b;
        riVar.c(charSequence2, false, true);
        riVar.setOnClickListener(onClickListener);
        riVar.setVisibility(0);
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(this.e), 1073741824));
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
        ri riVar = this.b;
        riVar.c(charSequence, true, true);
        riVar.setVisibility(0);
    }

    public void setRightTextMargin(int i) {
        float f = i;
        int L = gl.L(f);
        FrameLayout.LayoutParams layoutParams = this.c;
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = gl.L(f);
        this.b.setLayoutParams(layoutParams);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        ri riVar = this.b;
        riVar.setVisibility(8);
        riVar.setOnClickListener(null);
    }

    public void setTextColor(int i) {
        fm fmVar = this.a;
        wjb wjbVar = this.d;
        zkb.X(fmVar, i, wjbVar);
        zkb.U(this.b, i, wjbVar);
    }

    @Override
    public final void updateColors() {
        int v0;
        boolean z = this.f;
        wjb wjbVar = this.d;
        if (z) {
            v0 = 0;
        } else {
            v0 = bkb.v0(bkb.d7, wjbVar);
        }
        setBackgroundColor(v0);
        int i = bkb.e7;
        this.a.setTextColor(bkb.v0(i, wjbVar));
        this.b.setTextColor(bkb.v0(i, wjbVar));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public l35(Context context, wjb wjbVar) {
        this(16, wjbVar, context);
    }
}
