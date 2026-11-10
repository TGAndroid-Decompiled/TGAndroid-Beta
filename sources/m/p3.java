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
public final class p3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static p3 f19209w;
    public static p3 f19210x;
    public final View f19211a;
    public final CharSequence f19212b;
    public final int f19213c;
    public final o3 d = new Runnable(this) {
        public final p3 f19199b;

        {
            this.f19199b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f19199b.c(false);
                    return;
                default:
                    this.f19199b.a();
                    return;
            }
        }
    };
    public final o3 f19214e = new Runnable(this) {
        public final p3 f19199b;

        {
            this.f19199b = this;
        }

        @Override
        public final void run() {
            switch (r2) {
                case 0:
                    this.f19199b.c(false);
                    return;
                default:
                    this.f19199b.a();
                    return;
            }
        }
    };
    public int f19215f;
    public int h;
    public q3 f19216n;
    public boolean f19217r;
    public boolean f19218s;

    public p3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f19211a = view;
        this.f19212b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.j0.f54210a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = d1.f.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f19213c = scaledTouchSlop;
        this.f19218s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p3 p3Var) {
        p3 p3Var2 = f19209w;
        if (p3Var2 != null) {
            p3Var2.f19211a.removeCallbacks(p3Var2.d);
        }
        f19209w = p3Var;
        if (p3Var != null) {
            p3Var.f19211a.postDelayed(p3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p3 p3Var = f19210x;
        View view = this.f19211a;
        if (p3Var == this) {
            f19210x = null;
            q3 q3Var = this.f19216n;
            if (q3Var != null) {
                View view2 = (View) q3Var.f19234b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q3Var.f19233a).getSystemService("window")).removeView(view2);
                }
                this.f19216n = null;
                this.f19218s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f19209w == this) {
            b(null);
        }
        view.removeCallbacks(this.f19214e);
    }

    public final void c(boolean z9) {
        int height;
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        long longPressTimeout;
        long j3;
        long j10;
        WeakHashMap weakHashMap = r0.i0.f54202a;
        View view = this.f19211a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        p3 p3Var = f19210x;
        if (p3Var != null) {
            p3Var.a();
        }
        f19210x = this;
        this.f19217r = z9;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.f19236e = new Rect();
        obj.f19237f = new int[2];
        obj.f19238g = new int[2];
        obj.f19233a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.f19234b = inflate;
        obj.f19235c = (TextView) inflate.findViewById(2131296513);
        layoutParams.setTitle(q3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.f19234b;
        Context context2 = (Context) obj.f19233a;
        this.f19216n = obj;
        int i15 = this.f19215f;
        int i16 = this.h;
        boolean z11 = this.f19217r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f19235c).setText(this.f19212b);
        int[] iArr = (int[]) obj.f19238g;
        int[] iArr2 = (int[]) obj.f19237f;
        Rect rect = (Rect) obj.f19236e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131165359);
        if (view.getWidth() < dimensionPixelOffset) {
            i15 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131165358);
            height = i16 + dimensionPixelOffset2;
            i7 = i16 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i7 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z11) {
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
                i11 = i7;
                z10 = z11;
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
                z10 = z11;
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
        if (this.f19217r) {
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
        o3 o3Var = this.f19214e;
        view.removeCallbacks(o3Var);
        view.postDelayed(o3Var, j10);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: m.p3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f19215f = view.getWidth() / 2;
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
