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
public final class o3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static o3 v;
    public static o3 f15611w;
    public final View f15612a;
    public final CharSequence f15613b;
    public final int f15614c;
    public final n3 d = new Runnable(this) {
        public final o3 f15601b;

        {
            this.f15601b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f15601b.c(false);
                    return;
                default:
                    this.f15601b.a();
                    return;
            }
        }
    };
    public final n3 f15615e = new Runnable(this) {
        public final o3 f15601b;

        {
            this.f15601b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f15601b.c(false);
                    return;
                default:
                    this.f15601b.a();
                    return;
            }
        }
    };
    public int f15616f;
    public int h;
    public p3 f15617n;
    public boolean f15618r;
    public boolean f15619s;

    public o3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f15612a = view;
        this.f15613b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.j0.f44703a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = b5.d.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f15614c = scaledTouchSlop;
        this.f15619s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(o3 o3Var) {
        o3 o3Var2 = v;
        if (o3Var2 != null) {
            o3Var2.f15612a.removeCallbacks(o3Var2.d);
        }
        v = o3Var;
        if (o3Var != null) {
            o3Var.f15612a.postDelayed(o3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        o3 o3Var = f15611w;
        View view = this.f15612a;
        if (o3Var == this) {
            f15611w = null;
            p3 p3Var = this.f15617n;
            if (p3Var != null) {
                View view2 = (View) p3Var.f15635b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) p3Var.f15634a).getSystemService("window")).removeView(view2);
                }
                this.f15617n = null;
                this.f15619s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (v == this) {
            b(null);
        }
        view.removeCallbacks(this.f15615e);
    }

    public final void c(boolean z10) {
        int height;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        char c10;
        int i14;
        long longPressTimeout;
        long j3;
        long j10;
        WeakHashMap weakHashMap = r0.i0.f44697a;
        View view = this.f15612a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        o3 o3Var = f15611w;
        if (o3Var != null) {
            o3Var.a();
        }
        f15611w = this;
        this.f15618r = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.f15637e = new Rect();
        obj.f15638f = new int[2];
        obj.h = new int[2];
        obj.f15634a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.f15635b = inflate;
        obj.f15636c = (TextView) inflate.findViewById(2131296513);
        layoutParams.setTitle(p3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.f15635b;
        Context context2 = (Context) obj.f15634a;
        this.f15617n = obj;
        int i15 = this.f15616f;
        int i16 = this.h;
        boolean z12 = this.f15618r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f15636c).setText(this.f15613b);
        int[] iArr = (int[]) obj.h;
        int[] iArr2 = (int[]) obj.f15638f;
        Rect rect = (Rect) obj.f15637e;
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
        if (z12) {
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
                c10 = 1;
                i12 = i10;
                z11 = z12;
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
                z11 = z12;
                i13 = 0;
                c10 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i18 = iArr2[i13] - iArr[i13];
            iArr2[i13] = i18;
            iArr2[c10] = iArr2[c10] - iArr[c10];
            layoutParams2.x = (i18 + i17) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, i13);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i19 = iArr2[c10];
            int i20 = ((i19 + i12) - dimensionPixelOffset3) - measuredHeight;
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
        if (this.f15618r) {
            j10 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 15000;
            }
            j10 = j3 - longPressTimeout;
        }
        n3 n3Var = this.f15615e;
        view.removeCallbacks(n3Var);
        view.postDelayed(n3Var, j10);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.o3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f15616f = view.getWidth() / 2;
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
