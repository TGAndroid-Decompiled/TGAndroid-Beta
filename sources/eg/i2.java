package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.qg;
public final class i2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final List f5249w = Arrays.asList(new f2(0, 1, 20, 0), new f2(0, 2, 20, 40), new f2(1, 0, 0, 20), new f2(1, 2, 60, 40), new f2(2, 0, 40, 20), new f2(2, 1, 40, 60));
    public int f5250a;
    public final kj0 f5251b;
    public final ImageView f5252c;
    public final ImageView d;
    public final View f5253e;
    public final h2 f5254f;
    public g2 h;
    public int f5255n;
    public int f5256r;
    public int f5257s;
    public String v;

    public i2(Context context) {
        super(context);
        this.f5250a = 0;
        setWillNotDraw(false);
        View view = new View(context);
        this.f5253e = view;
        view.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f5196b;

            {
                this.f5196b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f5196b.h.a();
                        return;
                    case 1:
                        i2 i2Var = this.f5196b;
                        i2Var.d((i2Var.f5250a + 1) % 3, true);
                        return;
                    case 2:
                        this.f5196b.h.d();
                        return;
                    case 3:
                        this.f5196b.h.u();
                        return;
                    default:
                        this.f5196b.h.D();
                        return;
                }
            }
        });
        addView(view, c6.d(24, 24.0f, 48, 0.0f, 0.0f, 16.0f, 0.0f));
        ?? imageView = new ImageView(context);
        this.f5251b = imageView;
        imageView.f(R.raw.photo_text_allign, 24, 24, null);
        hj0 animatedDrawable = imageView.getAnimatedDrawable();
        animatedDrawable.h = true;
        animatedDrawable.N(20);
        animatedDrawable.K(20);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f5196b;

            {
                this.f5196b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f5196b.h.a();
                        return;
                    case 1:
                        i2 i2Var = this.f5196b;
                        i2Var.d((i2Var.f5250a + 1) % 3, true);
                        return;
                    case 2:
                        this.f5196b.h.d();
                        return;
                    case 3:
                        this.f5196b.h.u();
                        return;
                    default:
                        this.f5196b.h.D();
                        return;
                }
            }
        });
        imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView((View) imageView, c6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f5252c = imageView2;
        imageView2.setImageResource(R.drawable.msg_text_outlined);
        imageView2.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f5196b;

            {
                this.f5196b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f5196b.h.a();
                        return;
                    case 1:
                        i2 i2Var = this.f5196b;
                        i2Var.d((i2Var.f5250a + 1) % 3, true);
                        return;
                    case 2:
                        this.f5196b.h.d();
                        return;
                    case 3:
                        this.f5196b.h.u();
                        return;
                    default:
                        this.f5196b.h.D();
                        return;
                }
            }
        });
        addView(imageView2, c6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_add);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView3.setBackground(k6.f0(1090519039, 1, -1));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f5196b;

            {
                this.f5196b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f5196b.h.a();
                        return;
                    case 1:
                        i2 i2Var = this.f5196b;
                        i2Var.d((i2Var.f5250a + 1) % 3, true);
                        return;
                    case 2:
                        this.f5196b.h.d();
                        return;
                    case 3:
                        this.f5196b.h.u();
                        return;
                    default:
                        this.f5196b.h.D();
                        return;
                }
            }
        });
        imageView3.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        addView(imageView3, c6.d(28, 28.0f, 16, 0.0f, 0.0f, 16.0f, 0.0f));
        h2 h2Var = new h2(context);
        this.f5254f = h2Var;
        h2Var.setCurrent(true);
        h2Var.setOnClickListener(new View.OnClickListener(this) {
            public final i2 f5196b;

            {
                this.f5196b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f5196b.h.a();
                        return;
                    case 1:
                        i2 i2Var = this.f5196b;
                        i2Var.d((i2Var.f5250a + 1) % 3, true);
                        return;
                    case 2:
                        this.f5196b.h.d();
                        return;
                    case 3:
                        this.f5196b.h.u();
                        return;
                    default:
                        this.f5196b.h.D();
                        return;
                }
            }
        });
        addView(h2Var, c6.o(-2, -2, 0.0f, 21));
    }

    public final void a(int i10) {
        if (i10 == 0) {
            i10 = R.drawable.msg_add;
        }
        if (this.f5257s != i10) {
            this.f5257s = i10;
            AndroidUtilities.updateImageViewImageAnimated(this.d, i10);
        }
    }

    public final void b(RectF rectF) {
        h2 h2Var = this.f5254f;
        rectF.set(AndroidUtilities.dp(8.0f) + h2Var.getLeft(), h2Var.getTop(), AndroidUtilities.dp(8.0f) + h2Var.getRight(), h2Var.getBottom());
    }

    public final void c(View view) {
        if (view.getVisibility() != 8) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i10 = this.f5256r + layoutParams.leftMargin;
            this.f5256r = i10;
            view.layout(i10, (getMeasuredHeight() - layoutParams.height) / 2, this.f5256r + layoutParams.width, (getMeasuredHeight() + layoutParams.height) / 2);
            this.f5256r = layoutParams.width + layoutParams.rightMargin + this.f5256r;
        }
    }

    public final void d(int i10, boolean z4) {
        int i11 = this.f5250a;
        this.f5250a = i10;
        List list = f5249w;
        kj0 kj0Var = this.f5251b;
        if (i11 == i10) {
            hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
            f2 f2Var = (f2) list.get(0);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f2 f2Var2 = (f2) it.next();
                if (this.f5250a == f2Var2.f5208b) {
                    f2Var = f2Var2;
                    break;
                }
            }
            animatedDrawable.K(f2Var.d);
            animatedDrawable.N(f2Var.d);
            if (z4) {
                this.h.f(i10);
                return;
            }
            return;
        }
        f2 f2Var3 = (f2) list.get(0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            f2 f2Var4 = (f2) it2.next();
            if (i11 == f2Var4.f5207a && this.f5250a == f2Var4.f5208b) {
                f2Var3 = f2Var4;
                break;
            }
        }
        hj0 animatedDrawable2 = kj0Var.getAnimatedDrawable();
        animatedDrawable2.K(f2Var3.f5209c);
        animatedDrawable2.N(f2Var3.d);
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
        if (this.f5255n == i10) {
            return;
        }
        this.f5255n = i10;
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
        ImageView imageView = this.f5252c;
        if (z4) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            imageView.setImageResource(i11);
        }
    }

    public View getColorClickableView() {
        return this.f5253e;
    }

    public qg getEmojiButton() {
        return null;
    }

    public h2 getTypefaceCell() {
        return this.f5254f;
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
        this.f5256r = getPaddingLeft();
        c(this.f5253e);
        c(this.f5251b);
        c(this.f5252c);
        c(this.d);
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        h2 h2Var = this.f5254f;
        h2Var.layout(measuredWidth - h2Var.getMeasuredWidth(), (getMeasuredHeight() - h2Var.getMeasuredHeight()) / 2, getMeasuredWidth() - getPaddingRight(), (h2Var.getMeasuredHeight() + getMeasuredHeight()) / 2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            h2 h2Var = this.f5254f;
            if (childAt == h2Var) {
                h2Var.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
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

    public void setDelegate(g2 g2Var) {
        this.h = g2Var;
    }

    public void setOutlineType(int i10) {
        e(i10, false);
    }

    public void setTypeface(String str) {
        this.v = str;
        h2 h2Var = this.f5254f;
        if (h2Var != null) {
            for (dg.s0 s0Var : dg.s0.c()) {
                if (s0Var.f4665a.equals(str)) {
                    h2Var.setTypeface(s0Var.d());
                    String str2 = s0Var.f4667c;
                    if (str2 == null) {
                        str2 = LocaleController.getString(s0Var.f4666b);
                    }
                    h2Var.setText(str2);
                    return;
                }
            }
        }
    }

    public void setTypefaceListView(o2 o2Var) {
    }
}
