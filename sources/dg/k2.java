package dg;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.qg;
public final class k2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f4624w = Arrays.asList(new h2(0, 1, 20, 0), new h2(0, 2, 20, 40), new h2(1, 0, 0, 20), new h2(1, 2, 60, 40), new h2(2, 0, 40, 20), new h2(2, 1, 40, 60));
    public int f4625a;
    public final jj0 f4626b;
    public final ImageView f4627c;
    public final ImageView d;
    public final View e;
    public final j2 f4628f;
    public i2 h;
    public int f4629n;
    public int f4630r;
    public int f4631s;
    public String v;

    public k2(Context context) {
        super(context);
        this.f4625a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f4553b;

            {
                this.f4553b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f4553b.h.a();
                        return;
                    case 1:
                        k2 k2Var = this.f4553b;
                        k2Var.d((k2Var.f4625a + 1) % 3, true);
                        return;
                    case 2:
                        this.f4553b.h.d();
                        return;
                    case 3:
                        this.f4553b.h.t();
                        return;
                    default:
                        this.f4553b.h.D();
                        return;
                }
            }
        });
        addView(view, b6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f4626b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        gj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f4553b;

            {
                this.f4553b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f4553b.h.a();
                        return;
                    case 1:
                        k2 k2Var = this.f4553b;
                        k2Var.d((k2Var.f4625a + 1) % 3, true);
                        return;
                    case 2:
                        this.f4553b.h.d();
                        return;
                    case 3:
                        this.f4553b.h.t();
                        return;
                    default:
                        this.f4553b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f4627c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f4553b;

            {
                this.f4553b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f4553b.h.a();
                        return;
                    case 1:
                        k2 k2Var = this.f4553b;
                        k2Var.d((k2Var.f4625a + 1) % 3, true);
                        return;
                    case 2:
                        this.f4553b.h.d();
                        return;
                    case 3:
                        this.f4553b.h.t();
                        return;
                    default:
                        this.f4553b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(j6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f4553b;

            {
                this.f4553b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f4553b.h.a();
                        return;
                    case 1:
                        k2 k2Var = this.f4553b;
                        k2Var.d((k2Var.f4625a + 1) % 3, true);
                        return;
                    case 2:
                        this.f4553b.h.d();
                        return;
                    case 3:
                        this.f4553b.h.t();
                        return;
                    default:
                        this.f4553b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, b6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        j2 j2Var = new j2(context);
        this.f4628f = j2Var;
        j2Var.setCurrent(true);
        j2Var.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f4553b;

            {
                this.f4553b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f4553b.h.a();
                        return;
                    case 1:
                        k2 k2Var = this.f4553b;
                        k2Var.d((k2Var.f4625a + 1) % 3, true);
                        return;
                    case 2:
                        this.f4553b.h.d();
                        return;
                    case 3:
                        this.f4553b.h.t();
                        return;
                    default:
                        this.f4553b.h.D();
                        return;
                }
            }
        });
        addView(j2Var, b6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f4631s != i10) {
            this.f4631s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        j2 j2Var = this.f4628f;
        rectF.set(AndroidUtilities.dp(8.0f) + j2Var.getLeft(), j2Var.getTop(), AndroidUtilities.dp(8.0f) + j2Var.getRight(), j2Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f4630r + layoutParams.leftMargin;
            this.f4630r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f4630r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f4630r = layoutParams.width + layoutParams.rightMargin + this.f4630r;
        }
    }

    public final void d(int i10, boolean z4) {
        int i11 = this.f4625a;
        this.f4625a = i10;
        List list = f4624w;
        jj0 jj0Var = this.f4626b;
        if (i11 == i10) {
            gj0 animatedDrawable = jj0Var.getAnimatedDrawable();
            h2 h2Var = (h2) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                h2 h2Var2 = (h2) it.next();
                if (this.f4625a == h2Var2.f4563b) {
                    h2Var = h2Var2;
                    break;
                }
            }
            animatedDrawable.K(h2Var.d);
            animatedDrawable.N(h2Var.d);
            if (z4) {
                this.h.f(i10);
                return;
            }
            return;
        }
        h2 h2Var3 = (h2) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            h2 h2Var4 = (h2) it2.next();
            if (i11 == h2Var4.f4562a && this.f4625a == h2Var4.f4563b) {
                h2Var3 = h2Var4;
                break;
            }
        }
        gj0 animatedDrawable2 = jj0Var.getAnimatedDrawable();
        animatedDrawable2.K(h2Var3.f4564c);
        animatedDrawable2.N(h2Var3.d);
        animatedDrawable2.start();
        if (z4) {
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

    public final void e(int i10, boolean z4) {
        int i11;
        if (this.f4629n == i10) {
            return;
        }
        this.f4629n = i10;
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
        ImageView imageView = this.f4627c;
        if (z4) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.e;
    }

    public qg getEmojiButton() {
        return null;
    }

    public j2 getTypefaceCell() {
        return this.f4628f;
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f4630r = getPaddingLeft();
        c(this.e);
        c(this.f4626b);
        c(this.f4627c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        j2 j2Var = this.f4628f;
        j2Var.layout(measuredWidth - j2Var.getMeasuredWidth(), (getMeasuredHeight() - j2Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (j2Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            j2 j2Var = this.f4628f;
            if (childAt == j2Var) {
                j2Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(i2 i2Var) {
        this.h = i2Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        j2 j2Var = this.f4628f;
        if (j2Var != null) {
            for (cg.t0 t0Var : cg.t0.c()) {
                if (t0Var.f2512a.equals(str)) {
                    j2Var.setTypeface(t0Var.d());
                    String str2 = t0Var.f2514c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(t0Var.f2513b);
                    }
                    j2Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(q2 q2Var) {
    }
}
