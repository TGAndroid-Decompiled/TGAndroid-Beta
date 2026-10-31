package jg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.fg;
import w7.b6;
public final class t1 extends FrameLayout implements us {
    public static final List f10260x = Arrays.asList(new q1(0, 1, 20, 0), new q1(0, 2, 20, 40), new q1(1, 0, 0, 20), new q1(1, 2, 60, 40), new q1(2, 0, 40, 20), new q1(2, 1, 40, 60));
    public int f10261a;
    public final ei0 f10262b;
    public final ImageView f10263c;
    public final ImageView d;
    public final View e;
    public final s1 f10264f;
    public r1 h;
    public int f10265n;
    public int f10266r;
    public int f10267s;
    public String f10268w;

    public t1(Context context) {
        super(context);
        this.f10261a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10137b;

            {
                this.f10137b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10137b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10137b;
                        t1Var.d((t1Var.f10261a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10137b.h.c();
                        return;
                    case 3:
                        this.f10137b.h.t();
                        return;
                    default:
                        this.f10137b.h.D();
                        return;
                }
            }
        });
        addView(view, b6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f10262b = imageView;
        imageView.f(2131624131, 24, 24, null);
        bi0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10137b;

            {
                this.f10137b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10137b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10137b;
                        t1Var.d((t1Var.f10261a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10137b.h.c();
                        return;
                    case 3:
                        this.f10137b.h.t();
                        return;
                    default:
                        this.f10137b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        addView((View) imageView, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f10263c = imageView2;
        imageView2.setImageResource(2131232398);
        imageView2.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10137b;

            {
                this.f10137b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10137b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10137b;
                        t1Var.d((t1Var.f10261a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10137b.h.c();
                        return;
                    case 3:
                        this.f10137b.h.t();
                        return;
                    default:
                        this.f10137b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(2131232041);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(t6.h0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10137b;

            {
                this.f10137b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10137b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10137b;
                        t1Var.d((t1Var.f10261a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10137b.h.c();
                        return;
                    case 3:
                        this.f10137b.h.t();
                        return;
                    default:
                        this.f10137b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        addView(imageView3, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        s1 s1Var = new s1(context);
        this.f10264f = s1Var;
        s1Var.setCurrent(true);
        s1Var.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10137b;

            {
                this.f10137b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10137b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10137b;
                        t1Var.d((t1Var.f10261a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10137b.h.c();
                        return;
                    case 3:
                        this.f10137b.h.t();
                        return;
                    default:
                        this.f10137b.h.D();
                        return;
                }
            }
        });
        addView(s1Var, b6.p(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = 2131232041;
        }
        if (this.f10267s != i10) {
            this.f10267s = i10;
            org.telegram.messenger.i0.Q3(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        s1 s1Var = this.f10264f;
        rectF.set(org.telegram.messenger.i0.L(8.0f) + s1Var.getLeft(), s1Var.getTop(), org.telegram.messenger.i0.L(8.0f) + s1Var.getRight(), s1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f10266r + layoutParams.leftMargin;
            this.f10266r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f10266r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f10266r = layoutParams.width + layoutParams.rightMargin + this.f10266r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f10261a;
        this.f10261a = i10;
        List list = f10260x;
        ei0 ei0Var = this.f10262b;
        if (i11 == i10) {
            bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
            q1 q1Var = (q1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q1 q1Var2 = (q1) it.next();
                if (this.f10261a == q1Var2.f10155b) {
                    q1Var = q1Var2;
                    break;
                }
            }
            animatedDrawable.M(q1Var.d);
            animatedDrawable.P(q1Var.d);
            if (z10) {
                this.h.d(i10);
                return;
            }
            return;
        }
        q1 q1Var3 = (q1) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            q1 q1Var4 = (q1) it2.next();
            if (i11 == q1Var4.f10154a && this.f10261a == q1Var4.f10155b) {
                q1Var3 = q1Var4;
                break;
            }
        }
        bi0 animatedDrawable2 = ei0Var.getAnimatedDrawable();
        animatedDrawable2.M(q1Var3.f10156c);
        animatedDrawable2.P(q1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.d(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == zs.C5 && (str = this.f10268w) != null) {
            setTypeface(str);
            this.f10268w = null;
        }
    }

    public final void e(int i10, boolean z10) {
        int i11;
        if (this.f10265n == i10) {
            return;
        }
        this.f10265n = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    i11 = 2131232286;
                } else {
                    i11 = 2131232289;
                }
            } else {
                i11 = 2131232288;
            }
        } else {
            i11 = 2131232287;
        }
        ImageView imageView = this.f10263c;
        if (z10) {
            org.telegram.messenger.i0.Q3(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public fg getEmojiButton() {
        return null;
    }

    public s1 getTypefaceCell() {
        return this.f10264f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.e().c(this, zs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.C5);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f10266r = getPaddingLeft();
        c(this.e);
        c(this.f10262b);
        c(this.f10263c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        s1 s1Var = this.f10264f;
        s1Var.layout(measuredWidth - s1Var.getMeasuredWidth(), (getMeasuredHeight() - s1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (s1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            s1 s1Var = this.f10264f;
            if (childAt == s1Var) {
                s1Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
            } else {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                paddingLeft -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setAlignment(int i10) {
        d(i10, false);
    }

    public void setDelegate(r1 r1Var) {
        this.h = r1Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.f10268w = str;
        s1 s1Var = this.f10264f;
        if (s1Var != null) {
            for (ig.h0 h0Var : ig.h0.c()) {
                if (h0Var.f8319a.equals(str)) {
                    s1Var.setTypeface(h0Var.d());
                    String str2 = h0Var.f8321c;
                    if (str2 == null) {
                        str2 = cd.M0(h0Var.f8320b);
                    }
                    s1Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(a2 a2Var) {
    }
}
