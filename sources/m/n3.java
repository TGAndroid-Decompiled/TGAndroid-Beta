package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public final class n3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static n3 f20233w;
    public static n3 f20234x;
    public final View f20235a;
    public final CharSequence f20236b;
    public final int f20237c;
    public final m3 d = new Runnable(this) {
        public final n3 f20225b;

        {
            this.f20225b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f20225b.c(false);
                    return;
                default:
                    this.f20225b.a();
                    return;
            }
        }
    };
    public final m3 f20238e = new Runnable(this) {
        public final n3 f20225b;

        {
            this.f20225b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f20225b.c(false);
                    return;
                default:
                    this.f20225b.a();
                    return;
            }
        }
    };
    public int f20239f;
    public int h;
    public o3 f20240n;
    public boolean f20241r;
    public boolean f20242s;

    public n3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f20235a = view;
        this.f20236b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.j0.f56377a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = d1.f.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f20237c = scaledTouchSlop;
        this.f20242s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(n3 n3Var) {
        n3 n3Var2 = f20233w;
        if (n3Var2 != null) {
            n3Var2.f20235a.removeCallbacks(n3Var2.d);
        }
        f20233w = n3Var;
        if (n3Var != null) {
            n3Var.f20235a.postDelayed(n3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        n3 n3Var = f20234x;
        View view = this.f20235a;
        if (n3Var == this) {
            f20234x = null;
            o3 o3Var = this.f20240n;
            if (o3Var != null) {
                View view2 = (View) o3Var.f20253b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) o3Var.f20252a).getSystemService("window")).removeView(view2);
                }
                this.f20240n = null;
                this.f20242s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f20233w == this) {
            b(null);
        }
        view.removeCallbacks(this.f20238e);
    }

    public final void c(boolean z10) {
        int height;
        int i7;
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        long longPressTimeout;
        long j3;
        long j10;
        WeakHashMap weakHashMap = r0.i0.f56367a;
        View view = this.f20235a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        n3 n3Var = f20234x;
        if (n3Var != null) {
            n3Var.a();
        }
        f20234x = this;
        this.f20241r = z10;
        o3 o3Var = new o3(view.getContext());
        View view2 = (View) o3Var.f20253b;
        Context context = (Context) o3Var.f20252a;
        this.f20240n = o3Var;
        int i15 = this.f20239f;
        int i16 = this.h;
        boolean z12 = this.f20241r;
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) o3Var.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context.getSystemService("window")).removeView(view2);
        }
        ((TextView) o3Var.f20254c).setText(this.f20236b);
        int[] iArr = (int[]) o3Var.h;
        int[] iArr2 = (int[]) o3Var.f20256f;
        Rect rect = (Rect) o3Var.f20255e;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131165359);
        if (view.getWidth() < dimensionPixelOffset) {
            i15 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131165358);
            height = i16 + dimensionPixelOffset2;
            i7 = i16 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i7 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z12) {
            i10 = 2131165362;
        } else {
            i10 = 2131165361;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        int i17 = i15;
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            i13 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context.getResources();
                i13 = 1;
                i11 = i7;
                z11 = z12;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i14 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i14 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i11 = i7;
                z11 = z12;
                i12 = 0;
                i13 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i18 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i18;
            iArr2[i13] = iArr2[i13] - iArr[i13];
            layoutParams.x = (i18 + i17) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i19 = iArr2[i13];
            int i20 = ((i19 + i11) - dimensionPixelOffset3) - measuredHeight;
            int i21 = i19 + height + dimensionPixelOffset3;
            if (z11) {
                if (i20 >= 0) {
                    layoutParams.y = i20;
                } else {
                    layoutParams.y = i21;
                }
            } else if (measuredHeight + i21 <= rect.height()) {
                layoutParams.y = i21;
            } else {
                layoutParams.y = i20;
            }
        }
        ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f20241r) {
            j10 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 15000;
            }
            j10 = j3 - longPressTimeout;
        }
        m3 m3Var = this.f20238e;
        view.removeCallbacks(m3Var);
        view.postDelayed(m3Var, j10);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.n3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f20239f = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
    }
}
