package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class gy0 extends FrameLayout {
    public final fn a;
    public final ImageView b;
    public final ImageView c;
    public final byte d;
    public boolean e;
    public boolean f;

    public gy0(int i, ylb ylbVar, Context context) {
        super(context);
        int i2;
        int i3;
        this.f = false;
        this.d = i;
        if (i != 4) {
            setBackgroundDrawable(cmb.K0(ylbVar, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        anb.s(imageView, cmb.I5, ylbVar, PorterDuff.Mode.MULTIPLY);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(imageView, qoe.e(56, 48, i2 | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        anb.s(imageView2, cmb.g7, ylbVar, PorterDuff.Mode.SRC_IN);
        if (jb6.a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        addView(imageView2, qoe.e(56, 48, i3 | 16));
        fn fnVar = new fn(context);
        this.a = fnVar;
        fnVar.setLines(1);
        fnVar.setSingleLine(true);
        fnVar.setGravity(1);
        fnVar.setEllipsize(TextUtils.TruncateAt.END);
        if (i != 0 && i != 4) {
            if (i == 1) {
                fnVar.setGravity(17);
                anb.X(fnVar, cmb.i5, ylbVar);
                fnVar.setTextSize(1, 14.0f);
                fnVar.setTypeface(gm.o());
                addView(fnVar, qoe.c(-1.0f, -1));
                return;
            } else if (i == 2) {
                fnVar.setGravity(17);
                anb.X(fnVar, cmb.Ii, ylbVar);
                fnVar.setTextSize(1, 14.0f);
                fnVar.setTypeface(gm.o());
                fnVar.setBackground(ulb.e(cmb.v0(cmb.Ei, ylbVar), 6.0f));
                addView(fnVar, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                return;
            } else {
                return;
            }
        }
        anb.X(fnVar, cmb.i5, ylbVar);
        fnVar.setTextSize(1, 16.0f);
        addView(fnVar, qoe.e(-2, -2, (jb6.a0 ? 5 : 3) | 16));
    }

    public final void a(CharSequence charSequence, int i, Drawable drawable, boolean z) {
        float f;
        float f2;
        int L;
        int i2;
        float f3;
        fn fnVar = this.a;
        fnVar.setText(charSequence);
        float f4 = 16.0f;
        float f5 = 21.0f;
        ImageView imageView = this.b;
        if (i == 0 && drawable == null) {
            imageView.setVisibility(4);
            if (z) {
                f3 = 21.0f;
            } else {
                f3 = 16.0f;
            }
            int L2 = gm.L(f3);
            if (z) {
                f4 = 21.0f;
            }
            fnVar.setPadding(L2, 0, gm.L(f4), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i);
        }
        imageView.setVisibility(0);
        boolean z2 = jb6.a0;
        if (z) {
            if (z2) {
                f2 = 21.0f;
            } else {
                f2 = 72.0f;
            }
            int L3 = gm.L(f2);
            if (jb6.a0) {
                f5 = 72.0f;
            }
            fnVar.setPadding(L3, 0, gm.L(f5), 0);
            if (jb6.a0) {
                L = 0;
            } else {
                L = gm.L(5.0f);
            }
            if (jb6.a0) {
                i2 = gm.L(5.0f);
            } else {
                i2 = 5;
            }
            imageView.setPadding(L, 0, i2, 0);
            return;
        }
        if (z2) {
            f = 16.0f;
        } else {
            f = 72.0f;
        }
        int L4 = gm.L(f);
        if (jb6.a0) {
            f4 = 72.0f;
        }
        fnVar.setPadding(L4, 0, gm.L(f4), 0);
        imageView.setPadding(0, 0, 0, 0);
    }

    public ImageView getImageView() {
        return this.b;
    }

    public fn getTextView() {
        return this.a;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        byte b = this.d;
        if (b == 2) {
            i3 = 80;
        } else {
            i3 = 48;
        }
        if (b == 0) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(i3), 1073741824));
    }

    public void setChecked(boolean z) {
        int i;
        this.e = z;
        if (z) {
            i = 2131231007;
        } else {
            i = 0;
        }
        this.c.setImageResource(i);
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setIconColor(int i) {
        this.b.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
