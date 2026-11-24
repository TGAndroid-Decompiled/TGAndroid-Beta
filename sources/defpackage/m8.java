package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public class m8 extends PopupWindow {
    public static Method k;
    public static final Field l;
    public static final DecelerateInterpolator m = new DecelerateInterpolator();
    public static final e8 n;
    public AnimatorSet a;
    public boolean b;
    public short c;
    public boolean d;
    public boolean e;
    public long f;
    public boolean g;
    public ViewTreeObserver.OnScrollChangedListener h;
    public ViewTreeObserver i;
    public on j;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        l = field;
        n = new Object();
    }

    public m8(View view, int i, int i2) {
        super(view, i, i2);
        this.b = true;
        this.c = (short) 150;
        this.f = -1L;
        this.j = new on(null);
        e();
    }

    public static void i(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.n = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        float f = 1.0f;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
        int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
        HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.E;
        hashMap.clear();
        int i = 0;
        for (int i2 = 0; i2 < itemsCount; i2++) {
            View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i2);
            if (!(childAt instanceof j8)) {
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i));
                    i++;
                }
            }
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.s = itemsCount - 1;
        } else {
            actionBarPopupWindow$ActionBarPopupWindowLayout.s = 0;
        }
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
            f = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new f0(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 3));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a = false;
        actionBarPopupWindow$ActionBarPopupWindowLayout.b = true;
        animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255), ofFloat);
        animatorSet.setDuration((i << 4) + 150);
        animatorSet.addListener(new g0(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 3));
        animatorSet.start();
    }

    public final void b() {
        c(0.2f);
    }

    public final void c(float f) {
        View rootView = getContentView().getRootView();
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f;
        ((WindowManager) getContentView().getContext().getSystemService("window")).updateViewLayout(rootView, layoutParams);
    }

    public void d(boolean z) {
        float f;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j = this.f;
        setFocusable(false);
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() != null && (rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
            try {
                int i = layoutParams.flags;
                if ((i & 2) != 0) {
                    layoutParams.flags = i & (-3);
                    layoutParams.dimAmount = 0.0f;
                    windowManager.updateViewLayout(rootView, layoutParams);
                }
            } catch (Exception unused) {
            }
        }
        AnimatorSet animatorSet = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = null;
        if (animatorSet != null) {
            if (!z || !this.d) {
                animatorSet.cancel();
                this.a = null;
            } else {
                return;
            }
        }
        this.d = false;
        if (this.b && z) {
            this.d = true;
            ViewGroup viewGroup = (ViewGroup) getContentView();
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                if (viewGroup.getChildAt(i2) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i2);
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (arrayList = actionBarPopupWindow$ActionBarPopupWindowLayout.y) != null && !arrayList.isEmpty()) {
                int size = actionBarPopupWindow$ActionBarPopupWindowLayout.y.size();
                int i3 = 0;
                while (true) {
                    arrayList2 = actionBarPopupWindow$ActionBarPopupWindowLayout.y;
                    if (i3 >= size) {
                        break;
                    }
                    AnimatorSet animatorSet2 = (AnimatorSet) arrayList2.get(i3);
                    animatorSet2.removeAllListeners();
                    animatorSet2.cancel();
                    i3++;
                }
                arrayList2.clear();
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            this.a = animatorSet3;
            if (j > 0) {
                animatorSet3.playTogether(ValueAnimator.ofFloat(0.0f, 1.0f));
                this.a.setDuration(j);
            } else if (this.g) {
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.a.setDuration(this.c);
            } else {
                Property property = View.TRANSLATION_Y;
                float translationY = viewGroup.getTranslationY();
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
                    f = 5.0f;
                } else {
                    f = -5.0f;
                }
                animatorSet3.playTogether(ObjectAnimator.ofFloat(viewGroup, property, translationY + gl.L(f)), ObjectAnimator.ofFloat(viewGroup, View.ALPHA, 0.0f));
                this.a.setDuration(this.c);
            }
            this.a.addListener(new g8(this, (byte) 1));
            if (this.e) {
                this.j.d();
            }
            this.a.start();
            return;
        }
        try {
            super.dismiss();
        } catch (Exception unused2) {
        }
        j();
    }

    @Override
    public void dismiss() {
        d(true);
    }

    public final void e() {
        View contentView = getContentView();
        if (contentView instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) contentView;
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                setTouchInterceptor(new f8(this, actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0));
            }
        }
        Field field = l;
        if (field != null) {
            try {
                this.h = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, n);
            } catch (Exception unused) {
                this.h = null;
            }
        }
    }

    public final void f(View view) {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null) {
            if (view.getWindowToken() != null) {
                viewTreeObserver = view.getViewTreeObserver();
            } else {
                viewTreeObserver = null;
            }
            ViewTreeObserver viewTreeObserver2 = this.i;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.i.removeOnScrollChangedListener(this.h);
                }
                this.i = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(this.h);
                }
            }
        }
    }

    public final void g() {
        try {
            if (k == null) {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setLayoutInScreenEnabled", Boolean.TYPE);
                k = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            k.invoke(this, Boolean.TRUE);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void h() {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        if (this.b && this.a == null) {
            ViewGroup viewGroup = (ViewGroup) getContentView();
            if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = true;
            } else {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    if (viewGroup.getChildAt(i) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                        actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i);
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.n = true;
                    }
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
            HashMap hashMap = actionBarPopupWindow$ActionBarPopupWindowLayout.E;
            float f = 1.0f;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(1.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotX(actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
            actionBarPopupWindow$ActionBarPopupWindowLayout.setPivotY(0.0f);
            int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
            hashMap.clear();
            int i2 = 0;
            for (int i3 = 0; i3 < itemsCount; i3++) {
                View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i3);
                childAt.setAlpha(0.0f);
                if (childAt.getVisibility() == 0) {
                    hashMap.put(childAt, Integer.valueOf(i2));
                    i2++;
                }
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.w) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.s = itemsCount - 1;
            } else {
                actionBarPopupWindow$ActionBarPopupWindowLayout.s = 0;
            }
            if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().c(true);
                f = actionBarPopupWindow$ActionBarPopupWindowLayout.h;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            this.a = animatorSet;
            animatorSet.playTogether(ObjectAnimator.ofFloat(actionBarPopupWindow$ActionBarPopupWindowLayout, "backScaleY", 0.0f, f), ObjectAnimator.ofInt(actionBarPopupWindow$ActionBarPopupWindowLayout, "backAlpha", 0, 255));
            this.a.setDuration((i2 << 4) + 150);
            this.a.addListener(new g8(this, (byte) 0));
            this.a.start();
        }
    }

    public final void j() {
        ViewTreeObserver viewTreeObserver;
        if (this.h != null && (viewTreeObserver = this.i) != null) {
            if (viewTreeObserver.isAlive()) {
                this.i.removeOnScrollChangedListener(this.h);
            }
            this.i = null;
        }
    }

    @Override
    public final void showAsDropDown(View view, int i, int i2) {
        try {
            super.showAsDropDown(view, i, i2);
            f(view);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        j();
    }

    @Override
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
        f(view);
    }

    @Override
    public final void update(View view, int i, int i2) {
        super.update(view, i, i2);
        f(view);
    }
}
