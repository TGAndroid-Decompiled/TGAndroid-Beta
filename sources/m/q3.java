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
public final class q3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static q3 v;
    public static q3 f17825w;
    public final View f17826a;
    public final CharSequence f17827b;
    public final int f17828c;
    public final p3 d = new Runnable(this) {
        public final q3 f17818b;

        {
            this.f17818b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f17818b.c(false);
                    return;
                default:
                    this.f17818b.a();
                    return;
            }
        }
    };
    public final p3 e = new Runnable(this) {
        public final q3 f17818b;

        {
            this.f17818b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f17818b.c(false);
                    return;
                default:
                    this.f17818b.a();
                    return;
            }
        }
    };
    public int f17829f;
    public int h;
    public r3 f17830n;
    public boolean f17831r;
    public boolean f17832s;

    public q3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f17826a = view;
        this.f17827b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.j0.f47109a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = c5.d.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f17828c = scaledTouchSlop;
        this.f17832s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(q3 q3Var) {
        q3 q3Var2 = v;
        if (q3Var2 != null) {
            q3Var2.f17826a.removeCallbacks(q3Var2.d);
        }
        v = q3Var;
        if (q3Var != null) {
            q3Var.f17826a.postDelayed(q3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        q3 q3Var = f17825w;
        View view = this.f17826a;
        if (q3Var == this) {
            f17825w = null;
            r3 r3Var = this.f17830n;
            if (r3Var != null) {
                View view2 = (View) r3Var.f17845b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) r3Var.f17844a).getSystemService("window")).removeView(view2);
                }
                this.f17830n = null;
                this.f17832s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (v == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z10) {
        int height;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = r0.i0.f47105a;
        View view = this.f17826a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        q3 q3Var = f17825w;
        if (q3Var != null) {
            q3Var.a();
        }
        f17825w = this;
        this.f17831r = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.e = new Rect();
        obj.f17847f = new int[2];
        obj.h = new int[2];
        obj.f17844a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.f17845b = inflate;
        obj.f17846c = (TextView) inflate.findViewById(2131296513);
        layoutParams.setTitle(r3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.f17845b;
        Context context2 = (Context) obj.f17844a;
        this.f17830n = obj;
        int i16 = this.f17829f;
        int i17 = this.h;
        boolean z12 = this.f17831r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f17846c).setText(this.f17827b);
        int[] iArr = (int[]) obj.h;
        int[] iArr2 = (int[]) obj.f17847f;
        Rect rect = (Rect) obj.e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131165359);
        if (view.getWidth() < dimensionPixelOffset) {
            i16 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131165358);
            height = i17 + dimensionPixelOffset2;
            i10 = i17 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z12) {
            i11 = 2131165362;
        } else {
            i11 = 2131165361;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i18 = i16;
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
            i14 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i14 = 1;
                i12 = i10;
                z11 = z12;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i15 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i15 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i13 = 0;
                rect.set(0, i15, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i12 = i10;
                z11 = z12;
                i13 = 0;
                i14 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i19 = iArr2[i13] - iArr[i13];
            iArr2[i13] = i19;
            iArr2[i14] = iArr2[i14] - iArr[i14];
            layoutParams2.x = (i19 + i18) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, i13);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i20 = iArr2[i14];
            int i21 = ((i20 + i12) - dimensionPixelOffset3) - measuredHeight;
            int i22 = i20 + height + dimensionPixelOffset3;
            if (z11) {
                if (i21 >= 0) {
                    layoutParams2.y = i21;
                } else {
                    layoutParams2.y = i22;
                }
            } else if (measuredHeight + i22 <= rect.height()) {
                layoutParams2.y = i22;
            } else {
                layoutParams2.y = i21;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f17831r) {
            j11 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == i14) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        p3 p3Var = this.e;
        view.removeCallbacks(p3Var);
        view.postDelayed(p3Var, j11);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.q3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f17829f = view.getWidth() / 2;
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
