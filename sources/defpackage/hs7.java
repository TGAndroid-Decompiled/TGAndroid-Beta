package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public final class hs7 extends FrameLayout implements gk7 {
    public static final List x = Arrays.asList(new es7(0, 1, 20, 0), new es7(0, 2, 20, 40), new es7(1, 0, 0, 20), new es7(1, 2, 60, 40), new es7(2, 0, 40, 20), new es7(2, 1, 40, 60));
    public int a;
    public final ry8 b;
    public final ImageView c;
    public final ImageView d;
    public final View e;
    public final gs7 f;
    public fs7 h;
    public int n;
    public int r;
    public int s;
    public String w;

    public hs7(Context context) {
        super(context);
        this.a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final hs7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hs7 hs7Var = this.b;
                switch (b) {
                    case 0:
                        hs7Var.h.a();
                        return;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        return;
                    case 2:
                        hs7Var.h.b();
                        return;
                    case 3:
                        hs7Var.h.t();
                        return;
                    default:
                        hs7Var.h.D();
                        return;
                }
            }
        });
        addView(view, nme.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.b = imageView;
        imageView.f(2131624134, 24, 24, null);
        oy8 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.K(20);
        animatedDrawable.H(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final hs7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hs7 hs7Var = this.b;
                switch (b) {
                    case 0:
                        hs7Var.h.a();
                        return;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        return;
                    case 2:
                        hs7Var.h.b();
                        return;
                    case 3:
                        hs7Var.h.t();
                        return;
                    default:
                        hs7Var.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        addView((View) imageView, nme.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(2131232404);
        imageView2.setPadding(gl.L(1.0f), gl.L(1.0f), gl.L(1.0f), gl.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final hs7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hs7 hs7Var = this.b;
                switch (b) {
                    case 0:
                        hs7Var.h.a();
                        return;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        return;
                    case 2:
                        hs7Var.h.b();
                        return;
                    case 3:
                        hs7Var.h.t();
                        return;
                    default:
                        hs7Var.h.D();
                        return;
                }
            }
        });
        addView(imageView2, nme.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232047);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(bkb.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final hs7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hs7 hs7Var = this.b;
                switch (b) {
                    case 0:
                        hs7Var.h.a();
                        return;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        return;
                    case 2:
                        hs7Var.h.b();
                        return;
                    case 3:
                        hs7Var.h.t();
                        return;
                    default:
                        hs7Var.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        addView(imageView3, nme.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        gs7 gs7Var = new gs7(context);
        this.f = gs7Var;
        gs7Var.setCurrent(true);
        gs7Var.setOnClickListener(new View.OnClickListener(this) {
            public final hs7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r2;
                hs7 hs7Var = this.b;
                switch (b) {
                    case 0:
                        hs7Var.h.a();
                        return;
                    case 1:
                        hs7Var.d((hs7Var.a + 1) % 3, true);
                        return;
                    case 2:
                        hs7Var.h.b();
                        return;
                    case 3:
                        hs7Var.h.t();
                        return;
                    default:
                        hs7Var.h.D();
                        return;
                }
            }
        });
        addView(gs7Var, nme.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i) {
        if (i == 0) {
            i = 2131232047;
        }
        if (this.s != i) {
            this.s = i;
            gl.L3(this.d, i);
        }
    }

    public final void b(RectF rectF) {
        gs7 gs7Var = this.f;
        rectF.set(gl.L(8.0f) + gs7Var.getLeft(), gs7Var.getTop(), gl.L(8.0f) + gs7Var.getRight(), gs7Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i = this.r + layoutParams.leftMargin;
            this.r = i;
            view.layout(i, (getMeasuredHeight() - layoutParams.height) / 2, this.r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.r = layoutParams.width + layoutParams.rightMargin + this.r;
        }
    }

    public final void d(int i, boolean z) {
        int i2 = this.a;
        this.a = i;
        List list = x;
        ry8 ry8Var = this.b;
        if (i2 == i) {
            oy8 animatedDrawable = ry8Var.getAnimatedDrawable();
            es7 es7Var = (es7) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                es7 es7Var2 = (es7) it.next();
                if (this.a == es7Var2.b) {
                    es7Var = es7Var2;
                    break;
                }
            }
            animatedDrawable.H(es7Var.d);
            animatedDrawable.K(es7Var.d);
            if (z) {
                this.h.c(i);
                return;
            }
            return;
        }
        es7 es7Var3 = (es7) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            es7 es7Var4 = (es7) it2.next();
            if (i2 == es7Var4.a && this.a == es7Var4.b) {
                es7Var3 = es7Var4;
                break;
            }
        }
        oy8 animatedDrawable2 = ry8Var.getAnimatedDrawable();
        animatedDrawable2.H(es7Var3.c);
        animatedDrawable2.K(es7Var3.d);
        animatedDrawable2.start();
        if (z) {
            this.h.c(i);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        String str;
        if (i == kk7.E5 && (str = this.w) != null) {
            setTypeface(str);
            this.w = null;
        }
    }

    public final void e(int i, boolean z) {
        int i2;
        if (this.n == i) {
            return;
        }
        this.n = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    i2 = 2131232292;
                } else {
                    i2 = 2131232295;
                }
            } else {
                i2 = 2131232294;
            }
        } else {
            i2 = 2131232293;
        }
        ImageView imageView = this.c;
        if (z) {
            gl.L3(imageView, i2);
        } else {
            imageView.setImageResource(i2);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public qy1 getEmojiButton() {
        return null;
    }

    public gs7 getTypefaceCell() {
        return this.f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.e().b(this, kk7.E5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.E5);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.r = getPaddingLeft();
        c(this.e);
        c(this.b);
        c(this.c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        gs7 gs7Var = this.f;
        gs7Var.layout(measuredWidth - gs7Var.getMeasuredWidth(), (getMeasuredHeight() - gs7Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (gs7Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            gs7 gs7Var = this.f;
            if (childAt == gs7Var) {
                gs7Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i) {
        d(i, false);
    }

    public void setDelegate(fs7 fs7Var) {
        this.h = fs7Var;
    }

    public void setOutlineType(int i) {
        e(i, false);
    }

    public void setTypeface(String str) {
        this.w = str;
        gs7 gs7Var = this.f;
        if (gs7Var != null) {
            for (qs7 qs7Var : qs7.a()) {
                if (qs7Var.a.equals(str)) {
                    gs7Var.setTypeface(qs7Var.b());
                    String str2 = qs7Var.c;
                    if (str2 == null) {
                        str2 = k96.N0(qs7Var.b);
                    }
                    gs7Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(ss7 ss7Var) {
    }
}
