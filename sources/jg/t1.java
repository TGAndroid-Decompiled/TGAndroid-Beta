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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fi0;
import w7.b6;
public final class t1 extends FrameLayout implements vs {
    public static final List f10261x = Arrays.asList(new q1(0, 1, 20, 0), new q1(0, 2, 20, 40), new q1(1, 0, 0, 20), new q1(1, 2, 60, 40), new q1(2, 0, 40, 20), new q1(2, 1, 40, 60));
    public int f10262a;
    public final fi0 f10263b;
    public final ImageView f10264c;
    public final ImageView d;
    public final View e;
    public final s1 f10265f;
    public r1 h;
    public int f10266n;
    public int f10267r;
    public int f10268s;
    public String f10269w;

    public t1(Context context) {
        super(context);
        this.f10262a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10138b;

            {
                this.f10138b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10138b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10138b;
                        t1Var.d((t1Var.f10262a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10138b.h.c();
                        return;
                    case 3:
                        this.f10138b.h.t();
                        return;
                    default:
                        this.f10138b.h.D();
                        return;
                }
            }
        });
        addView(view, b6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f10263b = imageView;
        imageView.f(2131624131, 24, 24, null);
        ci0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.P(20);
        animatedDrawable.M(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10138b;

            {
                this.f10138b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10138b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10138b;
                        t1Var.d((t1Var.f10262a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10138b.h.c();
                        return;
                    case 3:
                        this.f10138b.h.t();
                        return;
                    default:
                        this.f10138b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        addView((View) imageView, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f10264c = imageView2;
        imageView2.setImageResource(2131232398);
        imageView2.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10138b;

            {
                this.f10138b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10138b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10138b;
                        t1Var.d((t1Var.f10262a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10138b.h.c();
                        return;
                    case 3:
                        this.f10138b.h.t();
                        return;
                    default:
                        this.f10138b.h.D();
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
            public final t1 f10138b;

            {
                this.f10138b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10138b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10138b;
                        t1Var.d((t1Var.f10262a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10138b.h.c();
                        return;
                    case 3:
                        this.f10138b.h.t();
                        return;
                    default:
                        this.f10138b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        addView(imageView3, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        s1 s1Var = new s1(context);
        this.f10265f = s1Var;
        s1Var.setCurrent(true);
        s1Var.setOnClickListener(new View.OnClickListener(this) {
            public final t1 f10138b;

            {
                this.f10138b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10138b.h.a();
                        return;
                    case 1:
                        t1 t1Var = this.f10138b;
                        t1Var.d((t1Var.f10262a + 1) % 3, true);
                        return;
                    case 2:
                        this.f10138b.h.c();
                        return;
                    case 3:
                        this.f10138b.h.t();
                        return;
                    default:
                        this.f10138b.h.D();
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
        if (this.f10268s != i10) {
            this.f10268s = i10;
            org.telegram.messenger.i0.Q3(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        s1 s1Var = this.f10265f;
        rectF.set(org.telegram.messenger.i0.L(8.0f) + s1Var.getLeft(), s1Var.getTop(), org.telegram.messenger.i0.L(8.0f) + s1Var.getRight(), s1Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f10267r + layoutParams.leftMargin;
            this.f10267r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f10267r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f10267r = layoutParams.width + layoutParams.rightMargin + this.f10267r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f10262a;
        this.f10262a = i10;
        List list = f10261x;
        fi0 fi0Var = this.f10263b;
        if (i11 == i10) {
            ci0 animatedDrawable = fi0Var.getAnimatedDrawable();
            q1 q1Var = (q1) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q1 q1Var2 = (q1) it.next();
                if (this.f10262a == q1Var2.f10156b) {
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
            if (i11 == q1Var4.f10155a && this.f10262a == q1Var4.f10156b) {
                q1Var3 = q1Var4;
                break;
            }
        }
        ci0 animatedDrawable2 = fi0Var.getAnimatedDrawable();
        animatedDrawable2.M(q1Var3.f10157c);
        animatedDrawable2.P(q1Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.d(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == at.C5 && (str = this.f10269w) != null) {
            setTypeface(str);
            this.f10269w = null;
        }
    }

    public final void e(int i10, boolean z10) {
        int i11;
        if (this.f10266n == i10) {
            return;
        }
        this.f10266n = i10;
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
        ImageView imageView = this.f10264c;
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
        return this.f10265f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.e().c(this, at.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.e().n(this, at.C5);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f10267r = getPaddingLeft();
        c(this.e);
        c(this.f10263b);
        c(this.f10264c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        s1 s1Var = this.f10265f;
        s1Var.layout(measuredWidth - s1Var.getMeasuredWidth(), (getMeasuredHeight() - s1Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (s1Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            s1 s1Var = this.f10265f;
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
        this.f10269w = str;
        s1 s1Var = this.f10265f;
        if (s1Var != null) {
            for (ig.h0 h0Var : ig.h0.c()) {
                if (h0Var.f8320a.equals(str)) {
                    s1Var.setTypeface(h0Var.d());
                    String str2 = h0Var.f8322c;
                    if (str2 == null) {
                        str2 = dd.M0(h0Var.f8321b);
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
