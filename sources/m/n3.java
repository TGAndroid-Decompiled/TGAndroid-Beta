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
public final class n3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static n3 f18663w;
    public static n3 f18664x;
    public final View f18665a;
    public final CharSequence f18666b;
    public final int f18667c;
    public final m3 d = new Runnable(this) {
        public final n3 f18655b;

        {
            this.f18655b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f18655b.c(false);
                    return;
                default:
                    this.f18655b.a();
                    return;
            }
        }
    };
    public final m3 f18668e = new Runnable(this) {
        public final n3 f18655b;

        {
            this.f18655b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f18655b.c(false);
                    return;
                default:
                    this.f18655b.a();
                    return;
            }
        }
    };
    public int f18669f;
    public int h;
    public o3 f18670n;
    public boolean f18671r;
    public boolean f18672s;

    public n3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f18665a = view;
        this.f18666b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.j0.f54023a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = d1.f.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f18667c = scaledTouchSlop;
        this.f18672s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(n3 n3Var) {
        n3 n3Var2 = f18663w;
        if (n3Var2 != null) {
            n3Var2.f18665a.removeCallbacks(n3Var2.d);
        }
        f18663w = n3Var;
        if (n3Var != null) {
            n3Var.f18665a.postDelayed(n3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        n3 n3Var = f18664x;
        View view = this.f18665a;
        if (n3Var == this) {
            f18664x = null;
            o3 o3Var = this.f18670n;
            if (o3Var != null) {
                View view2 = (View) o3Var.f18683b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) o3Var.f18682a).getSystemService("window")).removeView(view2);
                }
                this.f18670n = null;
                this.f18672s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f18663w == this) {
            b(null);
        }
        view.removeCallbacks(this.f18668e);
    }

    public final void c(boolean z10) {
        int height;
        int i3;
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = r0.i0.f54015a;
        View view = this.f18665a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        n3 n3Var = f18664x;
        if (n3Var != null) {
            n3Var.a();
        }
        f18664x = this;
        this.f18671r = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.f18685e = new Rect();
        obj.f18686f = new int[2];
        obj.f18687g = new int[2];
        obj.f18682a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.f18683b = inflate;
        obj.f18684c = (TextView) inflate.findViewById(2131296513);
        layoutParams.setTitle(o3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.f18683b;
        Context context2 = (Context) obj.f18682a;
        this.f18670n = obj;
        int i15 = this.f18669f;
        int i16 = this.h;
        boolean z12 = this.f18671r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f18684c).setText(this.f18666b);
        int[] iArr = (int[]) obj.f18687g;
        int[] iArr2 = (int[]) obj.f18686f;
        Rect rect = (Rect) obj.f18685e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131165359);
        if (view.getWidth() < dimensionPixelOffset) {
            i15 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131165358);
            height = i16 + dimensionPixelOffset2;
            i3 = i16 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
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
        int i17 = i15;
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
            i13 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i13 = 1;
                i11 = i3;
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
                i11 = i3;
                z11 = z12;
                i12 = 0;
                i13 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i18 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i18;
            iArr2[i13] = iArr2[i13] - iArr[i13];
            layoutParams2.x = (i18 + i17) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i19 = iArr2[i13];
            int i20 = ((i19 + i11) - dimensionPixelOffset3) - measuredHeight;
            int i21 = i19 + height + dimensionPixelOffset3;
            if (z11) {
                if (i20 >= 0) {
                    layoutParams2.y = i20;
                } else {
                    layoutParams2.y = i21;
                }
            } else if (measuredHeight + i21 <= rect.height()) {
                layoutParams2.y = i21;
            } else {
                layoutParams2.y = i20;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f18671r) {
            j11 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        m3 m3Var = this.f18668e;
        view.removeCallbacks(m3Var);
        view.postDelayed(m3Var, j11);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.n3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f18669f = view.getWidth() / 2;
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
