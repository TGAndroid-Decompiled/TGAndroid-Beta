package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.LaunchActivity;
public abstract class px9 extends Dialog {
    public final int E;
    public final int F;
    public final int G;
    public final int[] H;
    public boolean I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public boolean P;
    public final tx9 Q;
    public final dx9 a;
    public final ImageReceiver b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final jx9 f;
    public final View h;
    public Bitmap n;
    public Paint r;
    public final oc6 s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout w;
    public fx0 x;
    public boolean y;

    public px9(tx9 tx9Var, Context context, jx9 jx9Var, View view, dx9 dx9Var, wjb wjbVar) {
        super(context);
        boolean z;
        gl5 b;
        String str;
        ColorFilter colorFilter;
        this.Q = tx9Var;
        Rect rect = new Rect();
        this.c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.a = dx9Var;
        this.f = jx9Var;
        this.h = view;
        final jw9 jw9Var = (jw9) this;
        oc6 oc6Var = new oc6((byte) 19, context, jw9Var);
        this.s = oc6Var;
        setContentView(oc6Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new si9((byte) 2, context, jw9Var), nme.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232570, 0, wjbVar, context);
        this.w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.t(-2, -2, 17, 0, 0, 0, 0));
        r7.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745340, null), false, wjbVar).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b2 = r2;
                jw9 jw9Var2 = jw9Var;
                switch (b2) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745338, null), false, wjbVar).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b2 = r2;
                jw9 jw9Var2 = jw9Var;
                switch (b2) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745337, null), false, wjbVar).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b2 = r2;
                jw9 jw9Var2 = jw9Var;
                switch (b2) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745339, null), false, wjbVar).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                byte b2 = r2;
                jw9 jw9Var2 = jw9Var;
                switch (b2) {
                    case 0:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        jw9Var2.c(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        r7.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, k96.M0(2131745335, null), false, wjbVar).setOnClickListener(new b99(jw9Var, context, (byte) 3));
        oc6Var.addView(linearLayout, nme.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            oc6Var.setOnApplyWindowInsetsListener(new vs(jw9Var));
            attributes.flags |= 1024;
            z = true;
            oc6Var.setFitsSystemWindows(true);
            oc6Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z = true;
        }
        dx9Var.b = z;
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        imageReceiver.p0(oc6Var);
        imageReceiver.m0(7);
        TLRPC.Document document = dx9Var.d;
        if (document == null) {
            Drawable drawable = dx9Var.F;
            if (drawable instanceof vl) {
                document = ((vl) drawable).e;
            }
        }
        if (document != null) {
            kcb d = uo3.d(document.thumbs, bkb.l6, 0.2f, false);
            TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b = gl5.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && k27.K2(document, false)) {
                    d.e = 512;
                    d.f = 512;
                }
                b = gl5.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.Y(b, str, gl5.c(w, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((dx9Var.F instanceof vl) && (k27.B4(document2) || ((vl) dx9Var.F).c())) {
                if (!k27.B4(document2)) {
                    vl vlVar = (vl) dx9Var.F;
                    SparseArray sparseArray = vl.r;
                    if (vlVar == null || !vlVar.k()) {
                        colorFilter = bkb.n0(wjbVar);
                        imageReceiver.p1 = colorFilter;
                    }
                }
                colorFilter = tx9Var.l1;
                imageReceiver.p1 = colorFilter;
            }
        }
        dx9Var.getLocationOnScreen(iArr);
        rect.left = dx9Var.getPaddingLeft() + iArr[0];
        rect.top = dx9Var.getPaddingTop() + iArr[1];
        rect.right = (dx9Var.getWidth() + iArr[0]) - dx9Var.getPaddingRight();
        rect.bottom = (dx9Var.getHeight() + iArr[1]) - dx9Var.getPaddingBottom();
        gl.V1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i = iArr[1];
        this.F = i;
        this.G = view.getHeight() + i;
    }

    public static WindowInsets e(View view, WindowInsets windowInsets) {
        view.requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void a(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            if (this.N == z) {
                return;
            }
            valueAnimator.cancel();
        }
        this.N = z;
        float f2 = this.M;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new x89(this, (byte) 18));
        this.O.addListener(new pu9((byte) 1, this, z));
        ValueAnimator valueAnimator2 = this.O;
        if (z) {
            valueAnimator2.setDuration(360L);
            this.O.setInterpolator(s33.h);
        } else {
            valueAnimator2.setDuration(240L);
            this.O.setInterpolator(s33.g);
        }
        this.O.start();
    }

    public final void b(final boolean z, lx9 lx9Var, final lx9 lx9Var2, final boolean z2) {
        float f;
        dx9 dx9Var = this.a;
        if (dx9Var == null) {
            if (lx9Var != null) {
                lx9Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            if (this.K == z) {
                return;
            }
            valueAnimator.cancel();
        }
        this.K = z;
        if (z) {
            dx9Var.b = true;
        }
        final boolean[] zArr = new boolean[1];
        float f2 = this.J;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                lx9 lx9Var3;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                px9 px9Var = px9.this;
                px9Var.J = floatValue;
                gl.V1(px9Var.c, px9Var.d, floatValue, px9Var.e);
                px9Var.s.invalidate();
                boolean z3 = z;
                if (!z3) {
                    px9Var.w.setAlpha(px9Var.J);
                }
                if (px9Var.J < 0.025f && !z3) {
                    if (z2) {
                        px9Var.a.b = false;
                        px9Var.Q.i0.invalidate();
                    }
                    kk7.e().k(kk7.j1, 4);
                }
                if (px9Var.J < 0.5f && !z3 && (lx9Var3 = lx9Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        lx9Var3.run();
                    }
                }
            }
        });
        this.L.addListener(new ox9(this, z, lx9Var2, zArr, z2, lx9Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(s33.h);
        this.L.start();
    }

    public final void c(java.lang.Integer r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px9.c(java.lang.Integer):void");
    }

    public final void d(Integer num) {
        jx9 jx9Var;
        jw9 jw9Var = (jw9) this;
        if (num != null && (jx9Var = jw9Var.T.e.V1) != null) {
            jx9Var.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override
    public void dismiss() {
        if (this.P) {
            return;
        }
        c(null);
        this.P = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent && motionEvent.getAction() == 0) {
            dismiss();
            return false;
        }
        return dispatchTouchEvent;
    }

    public final void f() {
        Activity activity;
        int[] iArr;
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
        int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.083333336f, 0.083333336f);
        canvas.drawColor(bkb.w0(null, bkb.c6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.N().getLastFragment().getVisibleDialog() != null) {
                launchActivity.N().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.H);
            canvas.save();
            canvas.translate(iArr[0], iArr[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.r = new Paint(1);
        this.n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        kk7.e().k(kk7.i1, 4);
        b(true, null, null, true);
        a(true);
    }
}
