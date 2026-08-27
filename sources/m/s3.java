package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class s3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static s3 v;

    public static s3 f17457w;

    public final View f17458a;

    public final CharSequence f17459b;

    public final int f17460c;
    public final r3 d;

    public final r3 f17461e;

    public int f17462f;
    public int h;

    public t3 f17463n;

    public boolean f17464r;

    public boolean f17465s;

    public s3(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.d = new Runnable(this) {

            public final s3 f17444b;

            {
                this.f17444b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f17444b.c(false);
                        break;
                    default:
                        this.f17444b.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f17461e = new Runnable(this) {

            public final s3 f17444b;

            {
                this.f17444b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f17444b.c(false);
                        break;
                    default:
                        this.f17444b.a();
                        break;
                }
            }
        };
        this.f17458a = view;
        this.f17459b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.k0.f46611a;
        this.f17460c = Build.VERSION.SDK_INT >= 28 ? d1.f.o(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f17465s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s3 s3Var) {
        s3 s3Var2 = v;
        if (s3Var2 != null) {
            s3Var2.f17458a.removeCallbacks(s3Var2.d);
        }
        v = s3Var;
        if (s3Var != null) {
            s3Var.f17458a.postDelayed(s3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s3 s3Var = f17457w;
        View view = this.f17458a;
        if (s3Var == this) {
            f17457w = null;
            t3 t3Var = this.f17463n;
            if (t3Var != null) {
                View view2 = (View) t3Var.f17474b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) t3Var.f17473a).getSystemService("window")).removeView(view2);
                }
                this.f17463n = null;
                this.f17465s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (v == this) {
            b(null);
        }
        view.removeCallbacks(this.f17461e);
    }

    public final void c(boolean z10) {
        int height;
        int i10;
        int i11;
        char c10;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = r0.j0.f46605a;
        View view = this.f17458a;
        if (view.isAttachedToWindow()) {
            b(null);
            s3 s3Var = f17457w;
            if (s3Var != null) {
                s3Var.a();
            }
            f17457w = this;
            this.f17464r = z10;
            Context context = view.getContext();
            t3 t3Var = new t3();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            t3Var.d = layoutParams;
            t3Var.f17476e = new Rect();
            t3Var.f17477f = new int[2];
            t3Var.h = new int[2];
            t3Var.f17473a = context;
            View viewInflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
            t3Var.f17474b = viewInflate;
            t3Var.f17475c = (TextView) viewInflate.findViewById(2131296513);
            layoutParams.setTitle(t3.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = 2131755014;
            layoutParams.flags = 24;
            View view2 = (View) t3Var.f17474b;
            Context context2 = (Context) t3Var.f17473a;
            this.f17463n = t3Var;
            int width = this.f17462f;
            int i12 = this.h;
            boolean z11 = this.f17464r;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) t3Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) t3Var.f17475c).setText(this.f17459b);
            int[] iArr = (int[]) t3Var.h;
            int[] iArr2 = (int[]) t3Var.f17477f;
            Rect rect = (Rect) t3Var.f17476e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131165359);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131165358);
                height = i12 + dimensionPixelOffset2;
                i10 = i12 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z11 ? 2131165362 : 2131165361);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i13 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = 0;
                    c10 = 1;
                } else {
                    Resources resources = context2.getResources();
                    c10 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i14;
                iArr2[c10] = iArr2[c10] - iArr[c10];
                layoutParams2.x = (i14 + i13) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[c10];
                int i16 = ((i15 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i16 >= 0) {
                        layoutParams2.y = i16;
                    } else {
                        layoutParams2.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams2.y = i17;
                } else {
                    layoutParams2.y = i16;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f17464r) {
                j11 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            r3 r3Var = this.f17461e;
            view.removeCallbacks(r3Var);
            view.postDelayed(r3Var, j11);
        }
    }

    @Override
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f17463n == null || !this.f17464r) {
            View view2 = this.f17458a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f17465s = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f17463n == null) {
                    int x8 = (int) motionEvent.getX();
                    int y10 = (int) motionEvent.getY();
                    if (this.f17465s) {
                        this.f17462f = x8;
                        this.h = y10;
                        this.f17465s = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x8 - this.f17462f);
                        int i10 = this.f17460c;
                        if (iAbs > i10 || Math.abs(y10 - this.h) > i10) {
                            this.f17462f = x8;
                            this.h = y10;
                            this.f17465s = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f17462f = view.getWidth() / 2;
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
