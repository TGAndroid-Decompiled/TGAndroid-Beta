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
    public static q3 f13308w;
    public final View f13309a;
    public final CharSequence f13310b;
    public final int f13311c;
    public final p3 d = new Runnable(this) {
        public final q3 f13301b;

        {
            this.f13301b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f13301b.c(false);
                    return;
                default:
                    this.f13301b.a();
                    return;
            }
        }
    };
    public final p3 f13312e = new Runnable(this) {
        public final q3 f13301b;

        {
            this.f13301b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f13301b.c(false);
                    return;
                default:
                    this.f13301b.a();
                    return;
            }
        }
    };
    public int f13313f;
    public int h;
    public r3 f13314n;
    public boolean f13315r;
    public boolean f13316s;

    public q3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f13309a = view;
        this.f13310b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.k0.f46475a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = d1.f.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f13311c = scaledTouchSlop;
        this.f13316s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(q3 q3Var) {
        q3 q3Var2 = v;
        if (q3Var2 != null) {
            q3Var2.f13309a.removeCallbacks(q3Var2.d);
        }
        v = q3Var;
        if (q3Var != null) {
            q3Var.f13309a.postDelayed(q3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        q3 q3Var = f13308w;
        View view = this.f13309a;
        if (q3Var == this) {
            f13308w = null;
            r3 r3Var = this.f13314n;
            if (r3Var != null) {
                View view2 = (View) r3Var.f13330b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) r3Var.f13329a).getSystemService("window")).removeView(view2);
                }
                this.f13314n = null;
                this.f13316s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (v == this) {
            b(null);
        }
        view.removeCallbacks(this.f13312e);
    }

    public final void c(boolean z4) {
        int height;
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        char c3;
        int i14;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = r0.j0.f46469a;
        View view = this.f13309a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        q3 q3Var = f13308w;
        if (q3Var != null) {
            q3Var.a();
        }
        f13308w = this;
        this.f13315r = z4;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.f13332e = new Rect();
        obj.f13333f = new int[2];
        obj.h = new int[2];
        obj.f13329a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.f13330b = inflate;
        obj.f13331c = (TextView) inflate.findViewById(2131296513);
        layoutParams.setTitle(r3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.f13330b;
        Context context2 = (Context) obj.f13329a;
        this.f13314n = obj;
        int i15 = this.f13313f;
        int i16 = this.h;
        boolean z11 = this.f13315r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f13331c).setText(this.f13310b);
        int[] iArr = (int[]) obj.h;
        int[] iArr2 = (int[]) obj.f13333f;
        Rect rect = (Rect) obj.f13332e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131165359);
        if (view.getWidth() < dimensionPixelOffset) {
            i15 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131165358);
            height = i16 + dimensionPixelOffset2;
            i10 = i16 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z11) {
            i11 = 2131165362;
        } else {
            i11 = 2131165361;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
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
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                c3 = 1;
                i12 = i10;
                z10 = z11;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i14 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i14 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i13 = 0;
                rect.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i12 = i10;
                z10 = z11;
                i13 = 0;
                c3 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i18 = iArr2[i13] - iArr[i13];
            iArr2[i13] = i18;
            iArr2[c3] = iArr2[c3] - iArr[c3];
            layoutParams2.x = (i18 + i17) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, i13);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i19 = iArr2[c3];
            int i20 = ((i19 + i12) - dimensionPixelOffset3) - measuredHeight;
            int i21 = i19 + height + dimensionPixelOffset3;
            if (z10) {
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
        if (this.f13315r) {
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
        p3 p3Var = this.f13312e;
        view.removeCallbacks(p3Var);
        view.postDelayed(p3Var, j11);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.q3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f13313f = view.getWidth() / 2;
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
