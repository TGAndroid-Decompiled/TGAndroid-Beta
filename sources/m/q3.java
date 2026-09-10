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
    public static q3 f13118w;
    public final View f13119a;
    public final CharSequence f13120b;
    public final int f13121c;
    public final p3 d = new Runnable(this) {
        public final q3 f13111b;

        {
            this.f13111b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f13111b.c(false);
                    return;
                default:
                    this.f13111b.a();
                    return;
            }
        }
    };
    public final p3 e = new Runnable(this) {
        public final q3 f13111b;

        {
            this.f13111b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f13111b.c(false);
                    return;
                default:
                    this.f13111b.a();
                    return;
            }
        }
    };
    public int f13122f;
    public int h;
    public r3 f13123n;
    public boolean f13124r;
    public boolean f13125s;

    public q3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f13119a = view;
        this.f13120b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.j0.f41067a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = b5.d.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f13121c = scaledTouchSlop;
        this.f13125s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(q3 q3Var) {
        q3 q3Var2 = v;
        if (q3Var2 != null) {
            q3Var2.f13119a.removeCallbacks(q3Var2.d);
        }
        v = q3Var;
        if (q3Var != null) {
            q3Var.f13119a.postDelayed(q3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        q3 q3Var = f13118w;
        View view = this.f13119a;
        if (q3Var == this) {
            f13118w = null;
            r3 r3Var = this.f13123n;
            if (r3Var != null) {
                View view2 = (View) r3Var.f13138b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) r3Var.f13137a).getSystemService("window")).removeView(view2);
                }
                this.f13123n = null;
                this.f13125s = true;
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
        char c10;
        int i14;
        long longPressTimeout;
        long j3;
        long j10;
        WeakHashMap weakHashMap = r0.i0.f41062a;
        View view = this.f13119a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        q3 q3Var = f13118w;
        if (q3Var != null) {
            q3Var.a();
        }
        f13118w = this;
        this.f13124r = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.e = new Rect();
        obj.f13140f = new int[2];
        obj.h = new int[2];
        obj.f13137a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.f13138b = inflate;
        obj.f13139c = (TextView) inflate.findViewById(2131296513);
        layoutParams.setTitle(r3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.f13138b;
        Context context2 = (Context) obj.f13137a;
        this.f13123n = obj;
        int i15 = this.f13122f;
        int i16 = this.h;
        boolean z12 = this.f13124r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f13139c).setText(this.f13120b);
        int[] iArr = (int[]) obj.h;
        int[] iArr2 = (int[]) obj.f13140f;
        Rect rect = (Rect) obj.e;
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
        if (this.f13124r) {
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
        p3 p3Var = this.e;
        view.removeCallbacks(p3Var);
        view.postDelayed(p3Var, j10);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.q3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f13122f = view.getWidth() / 2;
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
