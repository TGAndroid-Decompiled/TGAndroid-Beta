package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class d17 extends Dialog {
    public final c17 E;
    public final e17 F;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final et8 h;
    public final a17 n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public de0 w;
    public BitmapDrawable x;
    public float y;

    public d17(e17 e17Var, Activity activity, d79 d79Var, vnb vnbVar, boolean z) {
        super(activity, 2131755353);
        int i;
        this.F = e17Var;
        Drawable mutate = getContext().getResources().getDrawable(2131232581).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        c17 c17Var = new c17(this, getContext());
        this.E = c17Var;
        setCancelable(true);
        c17Var.setVisibility(4);
        int i2 = aob.G8;
        e eVar = e17Var.g;
        aob.v0(i2, eVar.getResourceProvider());
        yob.x(c17Var, mutate, i2, eVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(c17Var);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, vnbVar);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        yob.h(i2, eVar.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        c17Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? sb0Var = new sb0(getContext());
        this.n = sb0Var;
        et8 et8Var = new et8(activity, eVar.getActionBar(), d79Var, sb0Var);
        this.h = et8Var;
        et8Var.setCreateThumbFromParent(true);
        c17Var.addView(et8Var);
        sb0Var.setProfileGalleryView(et8Var);
        c17Var.addView(sb0Var);
        textView.setMaxLines(1);
        yob.X(textView, aob.G6, eVar.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(hl.o());
        c17Var.addView(textView);
        yob.X(textView2, aob.y6, eVar.getResourceProvider());
        textView2.setTextSize(14.0f);
        c17Var.addView(textView2);
        b8 b8Var = new b8(0, vnbVar, activity, true, false);
        int i3 = aob.E8;
        int i4 = aob.F8;
        b8Var.c(i3, i4);
        int i5 = aob.I5;
        b8Var.h(1.0f, i5);
        if (z) {
            i = 2131754371;
        } else {
            i = 2131754366;
        }
        b8Var.j(ob6.M0(i, null), 2131232345, null);
        b8Var.setOnClickListener(new View.OnClickListener(this) {
            public final d17 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                d17 d17Var = this.b;
                switch (b) {
                    case 0:
                        e17 e17Var2 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d17Var.r;
                        if (tL_chatInviteImporter != null) {
                            e17Var2.d(tL_chatInviteImporter, true);
                        }
                        e17Var2.s.e(false);
                        e17Var2.r = null;
                        return;
                    case 1:
                        d17Var.d();
                        return;
                    default:
                        e17 e17Var3 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d17Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            e17Var3.d(tL_chatInviteImporter2, false);
                        }
                        e17Var3.s.e(false);
                        e17Var3.r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
        b8 b8Var2 = new b8(0, vnbVar, activity, false, false);
        b8Var2.c(i3, i4);
        b8Var2.h(1.0f, i5);
        b8Var2.j(ob6.M0(2131745329, null), 2131232260, null);
        b8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final d17 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                d17 d17Var = this.b;
                switch (b) {
                    case 0:
                        e17 e17Var2 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d17Var.r;
                        if (tL_chatInviteImporter != null) {
                            e17Var2.d(tL_chatInviteImporter, true);
                        }
                        e17Var2.s.e(false);
                        e17Var2.r = null;
                        return;
                    case 1:
                        d17Var.d();
                        return;
                    default:
                        e17 e17Var3 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d17Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            e17Var3.d(tL_chatInviteImporter2, false);
                        }
                        e17Var3.s.e(false);
                        e17Var3.r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var2);
        b8 b8Var3 = new b8(0, vnbVar, activity, false, true);
        b8Var3.c(aob.q7, aob.p7);
        b8Var3.h(1.0f, i5);
        b8Var3.j(ob6.M0(2131751333, null), 2131232333, null);
        b8Var3.setOnClickListener(new View.OnClickListener(this) {
            public final d17 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                d17 d17Var = this.b;
                switch (b) {
                    case 0:
                        e17 e17Var2 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = d17Var.r;
                        if (tL_chatInviteImporter != null) {
                            e17Var2.d(tL_chatInviteImporter, true);
                        }
                        e17Var2.s.e(false);
                        e17Var2.r = null;
                        return;
                    case 1:
                        d17Var.d();
                        return;
                    default:
                        e17 e17Var3 = d17Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = d17Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            e17Var3.d(tL_chatInviteImporter2, false);
                        }
                        e17Var3.s.e(false);
                        e17Var3.r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var3);
    }

    public final int c() {
        int measuredHeight = this.d.getMeasuredHeight() + hl.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + hl.L(4.0f);
        }
        return this.f.getMeasuredHeight() + hl.L(12.0f) + measuredHeight;
    }

    public final void d() {
        e17 e17Var = this.F;
        e eVar = e17Var.g;
        if (this.r != null) {
            e17Var.b = true;
            super.dismiss();
            eVar.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.r.user_id);
            eVar.presentFragment(new zu1(bundle));
        }
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.w.getLocationOnScreen(iArr);
        float f = 1.0f;
        et8 et8Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / et8Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        float f2 = 1.0f - width;
        float left = iArr[0] - (et8Var.getLeft() + ((int) ((et8Var.getMeasuredWidth() * f2) / 2.0f)));
        float top = iArr[1] - (et8Var.getTop() + ((int) ((c() * f2) / 2.0f)));
        int i = (-this.f.getTop()) / 2;
        float f3 = 0.0f;
        if (!z) {
            f3 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new y07(this, width, left, top, width2, i, (byte) 0));
        this.s.addListener(new b17(this, z, width, (byte) 0));
        this.s.setDuration(220L);
        this.s.setInterpolator(k43.f);
        this.s.start();
    }

    public final void f() {
        int i;
        BitmapDrawable bitmapDrawable = this.x;
        if (bitmapDrawable != null) {
            i = bitmapDrawable.getAlpha();
        } else {
            i = 255;
        }
        Resources resources = getContext().getResources();
        c17 c17Var = this.E;
        int measuredWidth = (int) (c17Var.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (c17Var.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        e eVar = this.F.g;
        ((LaunchActivity) eVar.getParentActivity()).N().getView().draw(canvas);
        canvas.drawColor(vm2.o(-16777216, 76));
        Dialog visibleDialog = eVar.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i);
        getWindow().setBackgroundDrawable(this.x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(2131755178);
        setContentView(this.E, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        attributes.gravity = 51;
        attributes.flags = (attributes.flags & (-3)) | (-2147417856);
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        hl.d3(new z96(this, (byte) 21), 80L);
    }
}
