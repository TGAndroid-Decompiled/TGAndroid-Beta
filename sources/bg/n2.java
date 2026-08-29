package bg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.xi0;
public final class n2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f2416w = Arrays.asList(new k2(0, 1, 20, 0), new k2(0, 2, 20, 40), new k2(1, 0, 0, 20), new k2(1, 2, 60, 40), new k2(2, 0, 40, 20), new k2(2, 1, 40, 60));
    public int f2417a;
    public final aj0 f2418b;
    public final ImageView f2419c;
    public final ImageView d;
    public final View f2420e;
    public final m2 f2421f;
    public l2 h;
    public int f2422n;
    public int f2423r;
    public int f2424s;
    public String v;

    public n2(Context context) {
        super(context);
        this.f2417a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f2420e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f2336b;

            {
                this.f2336b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f2336b.h.a();
                        return;
                    case 1:
                        n2 n2Var = this.f2336b;
                        n2Var.d((n2Var.f2417a + 1) % 3, true);
                        return;
                    case 2:
                        this.f2336b.h.d();
                        return;
                    case 3:
                        this.f2336b.h.u();
                        return;
                    default:
                        this.f2336b.h.D();
                        return;
                }
            }
        });
        addView(view, f6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f2418b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        xi0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f2336b;

            {
                this.f2336b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f2336b.h.a();
                        return;
                    case 1:
                        n2 n2Var = this.f2336b;
                        n2Var.d((n2Var.f2417a + 1) % 3, true);
                        return;
                    case 2:
                        this.f2336b.h.d();
                        return;
                    case 3:
                        this.f2336b.h.u();
                        return;
                    default:
                        this.f2336b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, f6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f2419c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f2336b;

            {
                this.f2336b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f2336b.h.a();
                        return;
                    case 1:
                        n2 n2Var = this.f2336b;
                        n2Var.d((n2Var.f2417a + 1) % 3, true);
                        return;
                    case 2:
                        this.f2336b.h.d();
                        return;
                    case 3:
                        this.f2336b.h.u();
                        return;
                    default:
                        this.f2336b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, f6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(g6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f2336b;

            {
                this.f2336b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f2336b.h.a();
                        return;
                    case 1:
                        n2 n2Var = this.f2336b;
                        n2Var.d((n2Var.f2417a + 1) % 3, true);
                        return;
                    case 2:
                        this.f2336b.h.d();
                        return;
                    case 3:
                        this.f2336b.h.u();
                        return;
                    default:
                        this.f2336b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, f6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        m2 m2Var = new m2(context);
        this.f2421f = m2Var;
        m2Var.setCurrent(true);
        m2Var.setOnClickListener(new View.OnClickListener(this) {
            public final n2 f2336b;

            {
                this.f2336b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f2336b.h.a();
                        return;
                    case 1:
                        n2 n2Var = this.f2336b;
                        n2Var.d((n2Var.f2417a + 1) % 3, true);
                        return;
                    case 2:
                        this.f2336b.h.d();
                        return;
                    case 3:
                        this.f2336b.h.u();
                        return;
                    default:
                        this.f2336b.h.D();
                        return;
                }
            }
        });
        addView(m2Var, f6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f2424s != i10) {
            this.f2424s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        m2 m2Var = this.f2421f;
        rectF.set(AndroidUtilities.dp(8.0f) + m2Var.getLeft(), m2Var.getTop(), AndroidUtilities.dp(8.0f) + m2Var.getRight(), m2Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f2423r + layoutParams.leftMargin;
            this.f2423r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f2423r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f2423r = layoutParams.width + layoutParams.rightMargin + this.f2423r;
        }
    }

    public final void d(int i10, boolean z10) {
        int i11 = this.f2417a;
        this.f2417a = i10;
        List list = f2416w;
        aj0 aj0Var = this.f2418b;
        if (i11 == i10) {
            xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
            k2 k2Var = (k2) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k2 k2Var2 = (k2) it.next();
                if (this.f2417a == k2Var2.f2373b) {
                    k2Var = k2Var2;
                    break;
                }
            }
            animatedDrawable.K(k2Var.d);
            animatedDrawable.N(k2Var.d);
            if (z10) {
                this.h.f(i10);
                return;
            }
            return;
        }
        k2 k2Var3 = (k2) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            k2 k2Var4 = (k2) it2.next();
            if (i11 == k2Var4.f2372a && this.f2417a == k2Var4.f2373b) {
                k2Var3 = k2Var4;
                break;
            }
        }
        xi0 animatedDrawable2 = aj0Var.getAnimatedDrawable();
        animatedDrawable2.K(k2Var3.f2374c);
        animatedDrawable2.N(k2Var3.d);
        animatedDrawable2.start();
        if (z10) {
            this.h.f(i10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (str = this.v) != null) {
            setTypeface(str);
            this.v = null;
        }
    }

    public final void e(int i10, boolean z10) {
        int i11;
        if (this.f2422n == i10) {
            return;
        }
        this.f2422n = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    i11 = R.drawable.msg_photo_text_framed;
                } else {
                    i11 = R.drawable.msg_photo_text_regular;
                }
            } else {
                i11 = R.drawable.msg_photo_text_framed3;
            }
        } else {
            i11 = R.drawable.msg_photo_text_framed2;
        }
        ImageView imageView = this.f2419c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.f2420e;
    }

    public tg getEmojiButton() {
        return null;
    }

    public m2 getTypefaceCell() {
        return this.f2421f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f2423r = getPaddingLeft();
        c(this.f2420e);
        c(this.f2418b);
        c(this.f2419c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        m2 m2Var = this.f2421f;
        m2Var.layout(measuredWidth - m2Var.getMeasuredWidth(), (getMeasuredHeight() - m2Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (m2Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            m2 m2Var = this.f2421f;
            if (childAt == m2Var) {
                m2Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(l2 l2Var) {
        this.h = l2Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        m2 m2Var = this.f2421f;
        if (m2Var != null) {
            for (ag.u0 u0Var : ag.u0.c()) {
                if (u0Var.f674a.equals(str)) {
                    m2Var.setTypeface(u0Var.d());
                    String str2 = u0Var.f676c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(u0Var.f675b);
                    }
                    m2Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(t2 t2Var) {
    }
}
