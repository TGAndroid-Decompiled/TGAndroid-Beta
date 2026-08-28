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
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
public final class s3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static s3 v;
    public static s3 f17082w;
    public final View f17083a;
    public final CharSequence f17084b;
    public final int f17085c;
    public final r3 d = new Runnable(this) {
        public final s3 f17069b;

        {
            this.f17069b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f17069b.c(false);
                    return;
                default:
                    this.f17069b.a();
                    return;
            }
        }
    };
    public final r3 f17086e = new Runnable(this) {
        public final s3 f17069b;

        {
            this.f17069b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f17069b.c(false);
                    return;
                default:
                    this.f17069b.a();
                    return;
            }
        }
    };
    public int f17087f;
    public int h;
    public t3 f17088n;
    public boolean f17089r;
    public boolean f17090s;

    public s3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f17083a = view;
        this.f17084b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.k0.f46921a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = d1.f.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f17085c = scaledTouchSlop;
        this.f17090s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s3 s3Var) {
        s3 s3Var2 = v;
        if (s3Var2 != null) {
            s3Var2.f17083a.removeCallbacks(s3Var2.d);
        }
        v = s3Var;
        if (s3Var != null) {
            s3Var.f17083a.postDelayed(s3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s3 s3Var = f17082w;
        View view = this.f17083a;
        if (s3Var == this) {
            f17082w = null;
            t3 t3Var = this.f17088n;
            if (t3Var != null) {
                View view2 = (View) t3Var.f17099b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) t3Var.f17098a).getSystemService("window")).removeView(view2);
                }
                this.f17088n = null;
                this.f17090s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (v == this) {
            b(null);
        }
        view.removeCallbacks(this.f17086e);
    }

    public final void c(boolean z10) {
        int height;
        int i9;
        int i10;
        int i11;
        boolean z11;
        int i12;
        char c10;
        int i13;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = r0.j0.f46915a;
        View view = this.f17083a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        s3 s3Var = f17082w;
        if (s3Var != null) {
            s3Var.a();
        }
        f17082w = this;
        this.f17089r = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.f17101e = new Rect();
        obj.f17102f = new int[2];
        obj.h = new int[2];
        obj.f17098a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.f17099b = inflate;
        obj.f17100c = (TextView) inflate.findViewById(2131296513);
        layoutParams.setTitle(t3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.f17099b;
        Context context2 = (Context) obj.f17098a;
        this.f17088n = obj;
        int i14 = this.f17087f;
        int i15 = this.h;
        boolean z12 = this.f17089r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f17100c).setText(this.f17084b);
        int[] iArr = (int[]) obj.h;
        int[] iArr2 = (int[]) obj.f17102f;
        Rect rect = (Rect) obj.f17101e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131165359);
        if (view.getWidth() < dimensionPixelOffset) {
            i14 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131165358);
            height = i15 + dimensionPixelOffset2;
            i9 = i15 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i9 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z12) {
            i10 = 2131165362;
        } else {
            i10 = 2131165361;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i16 = i14;
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                c10 = 1;
                i11 = i9;
                z11 = z12;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i13 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i13 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i13, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i11 = i9;
                z11 = z12;
                i12 = 0;
                c10 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i17 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i17;
            iArr2[c10] = iArr2[c10] - iArr[c10];
            layoutParams2.x = (i17 + i16) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i18 = iArr2[c10];
            int i19 = ((i18 + i11) - dimensionPixelOffset3) - measuredHeight;
            int i20 = i18 + height + dimensionPixelOffset3;
            if (z11) {
                if (i19 >= 0) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i20;
                }
            } else if (measuredHeight + i20 <= rect.height()) {
                layoutParams2.y = i20;
            } else {
                layoutParams2.y = i19;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f17089r) {
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
        r3 r3Var = this.f17086e;
        view.removeCallbacks(r3Var);
        view.postDelayed(r3Var, j11);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.s3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f17087f = view.getWidth() / 2;
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
