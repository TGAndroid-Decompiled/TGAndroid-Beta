package defpackage;

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
public final class nxb implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static nxb w;
    public static nxb x;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final mxb d = new Runnable(this) {
        public final nxb b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            nxb nxbVar = this.b;
            switch (b) {
                case 0:
                    nxbVar.c(false);
                    return;
                default:
                    nxbVar.a();
                    return;
            }
        }
    };
    public final mxb e = new Runnable(this) {
        public final nxb b;

        {
            this.b = this;
        }

        @Override
        public final void run() {
            byte b = r2;
            nxb nxbVar = this.b;
            switch (b) {
                case 0:
                    nxbVar.c(false);
                    return;
                default:
                    nxbVar.a();
                    return;
            }
        }
    };
    public int f;
    public int h;
    public oxb n;
    public boolean r;
    public boolean s;

    public nxb(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = jhc.a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = go.q(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.c = scaledTouchSlop;
        this.s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(nxb nxbVar) {
        nxb nxbVar2 = w;
        if (nxbVar2 != null) {
            nxbVar2.a.removeCallbacks(nxbVar2.d);
        }
        w = nxbVar;
        if (nxbVar != null) {
            nxbVar.a.postDelayed(nxbVar.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        nxb nxbVar = x;
        View view = this.a;
        if (nxbVar == this) {
            x = null;
            oxb oxbVar = this.n;
            if (oxbVar != null) {
                View view2 = (View) oxbVar.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) oxbVar.a).getSystemService("window")).removeView(view2);
                }
                this.n = null;
                this.s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (w == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap weakHashMap = ihc.a;
        View view = this.a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        nxb nxbVar = x;
        if (nxbVar != null) {
            nxbVar.a();
        }
        x = this;
        this.r = z;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.e = new Rect();
        obj.f = new int[2];
        obj.h = new int[2];
        obj.a = context;
        View inflate = LayoutInflater.from(context).inflate(2131492891, (ViewGroup) null);
        obj.b = inflate;
        obj.c = (TextView) inflate.findViewById(2131296515);
        layoutParams.setTitle(oxb.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755014;
        layoutParams.flags = 24;
        View view2 = (View) obj.b;
        Context context2 = (Context) obj.a;
        this.n = obj;
        int i7 = this.f;
        int i8 = this.h;
        boolean z3 = this.r;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.c).setText(this.b);
        int[] iArr = (int[]) obj.h;
        int[] iArr2 = (int[]) obj.f;
        Rect rect = (Rect) obj.e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(2131165359);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(2131165358);
            height = i8 + dimensionPixelOffset2;
            i = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z3) {
            i2 = 2131165362;
        } else {
            i2 = 2131165361;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i9 = i7;
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
            i5 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i5 = 1;
                i3 = i;
                z2 = z3;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i4 = 0;
                rect.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i3 = i;
                z2 = z3;
                i4 = 0;
                i5 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i10 = iArr2[i4] - iArr[i4];
            iArr2[i4] = i10;
            iArr2[i5] = iArr2[i5] - iArr[i5];
            layoutParams2.x = (i10 + i9) - (rootView.getWidth() / 2);
            view2.measure(i4, i4);
            int measuredHeight = view2.getMeasuredHeight();
            int i11 = iArr2[i5];
            int i12 = ((i11 + i3) - dimensionPixelOffset3) - measuredHeight;
            int i13 = i11 + height + dimensionPixelOffset3;
            if (z2) {
                if (i12 >= 0) {
                    layoutParams2.y = i12;
                } else {
                    layoutParams2.y = i13;
                }
            } else if (measuredHeight + i13 <= rect.height()) {
                layoutParams2.y = i13;
            } else {
                layoutParams2.y = i12;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.r) {
            j2 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == i5) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        mxb mxbVar = this.e;
        view.removeCallbacks(mxbVar);
        view.postDelayed(mxbVar, j2);
    }

    @Override
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxb.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
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
