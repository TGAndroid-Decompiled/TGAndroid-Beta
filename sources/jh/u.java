package jh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v4;
import org.telegram.ui.zn;
public final class u extends Dialog {
    public final v B;
    public final int f9450a;
    public final int f9451b;
    public final Drawable f9452c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f9453f;
    public final wh0 h;
    public final q f9454n;
    public TLRPC.TL_chatInviteImporter f9455r;
    public ValueAnimator f9456s;
    public p9 v;
    public BitmapDrawable f9457w;
    public float f9458x;
    public final t f9459y;

    public u(v vVar, Activity activity, rl0 rl0Var, f6 f6Var, boolean z4) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.B = vVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f9452c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        t tVar = new t(this, getContext());
        this.f9459y = tVar;
        setCancelable(true);
        tVar.setVisibility(4);
        int i11 = j6.G8;
        p2 p2Var = vVar.f9464g;
        int v02 = j6.v0(i11, p2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(tVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f9450a = rect.top;
        this.f9451b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f9453f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        tVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? v4Var = new v4(getContext());
        this.f9454n = v4Var;
        wh0 wh0Var = new wh0(activity, p2Var.getActionBar(), rl0Var, v4Var);
        this.h = wh0Var;
        wh0Var.setCreateThumbFromParent(true);
        tVar.addView(wh0Var);
        v4Var.setProfileGalleryView(wh0Var);
        tVar.addView(v4Var);
        textView.setMaxLines(1);
        textView.setTextColor(j6.v0(j6.G6, p2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        tVar.addView(textView);
        textView2.setTextColor(j6.v0(j6.f20256y6, p2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        tVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i12 = j6.E8;
        int v03 = j6.v0(i12, f6Var);
        int i13 = j6.F8;
        g1Var.c(v03, j6.v0(i13, f6Var));
        int i14 = j6.I5;
        g1Var.setSelectorColor(j6.v0(i14, f6Var));
        if (z4) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        g1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        g1Var.setOnClickListener(new View.OnClickListener(this) {
            public final u f9442b;

            {
                this.f9442b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f9442b;
                        v vVar2 = uVar.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f9455r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f9475s.e(false);
                        vVar2.f9474r = null;
                        return;
                    case 1:
                        u.a(this.f9442b);
                        return;
                    default:
                        u uVar2 = this.f9442b;
                        v vVar3 = uVar2.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f9455r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f9475s.e(false);
                        vVar3.f9474r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(j6.v0(i12, f6Var), j6.v0(i13, f6Var));
        g1Var2.setSelectorColor(j6.v0(i14, f6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        g1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final u f9442b;

            {
                this.f9442b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f9442b;
                        v vVar2 = uVar.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f9455r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f9475s.e(false);
                        vVar2.f9474r = null;
                        return;
                    case 1:
                        u.a(this.f9442b);
                        return;
                    default:
                        u uVar2 = this.f9442b;
                        v vVar3 = uVar2.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f9455r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f9475s.e(false);
                        vVar3.f9474r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(j6.v0(j6.f20116q7, f6Var), j6.v0(j6.f20097p7, f6Var));
        g1Var3.setSelectorColor(j6.v0(i14, f6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        g1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final u f9442b;

            {
                this.f9442b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f9442b;
                        v vVar2 = uVar.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f9455r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f9475s.e(false);
                        vVar2.f9474r = null;
                        return;
                    case 1:
                        u.a(this.f9442b);
                        return;
                    default:
                        u uVar2 = this.f9442b;
                        v vVar3 = uVar2.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f9455r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f9475s.e(false);
                        vVar3.f9474r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static void a(u uVar) {
        v vVar = uVar.B;
        if (uVar.f9455r != null) {
            vVar.f9461b = true;
            p2 p2Var = vVar.f9464g;
            super.dismiss();
            p2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", uVar.f9455r.user_id);
            p2Var.presentFragment(new zn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f9453f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.f9456s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        wh0 wh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / wh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        final float left = iArr[0] - (wh0Var.getLeft() + ((int) ((wh0Var.getMeasuredWidth() * f12) / 2.0f)));
        final float top = iArr[1] - (wh0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        final int i10 = (-this.f9453f.getTop()) / 2;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f9456s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u uVar = u.this;
                uVar.f9458x = floatValue;
                float f13 = width;
                float w10 = e2.c.w(1.0f, f13, floatValue, f13);
                t tVar = uVar.f9459y;
                tVar.setScaleX(w10);
                tVar.setScaleY(w10);
                tVar.setTranslationX((1.0f - uVar.f9458x) * left);
                tVar.setTranslationY((1.0f - uVar.f9458x) * top);
                int i11 = (int) ((1.0f - uVar.f9458x) * width2);
                uVar.h.N(i11, i11);
                float a2 = k7.n.a((uVar.f9458x * 2.0f) - 1.0f, 0.0f, 1.0f);
                uVar.f9452c.setAlpha((int) (a2 * 255.0f));
                uVar.d.setAlpha(a2);
                uVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f9453f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - uVar.f9458x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = uVar.f9457w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (uVar.f9458x * 255.0f));
                }
                uVar.f9454n.setAlpha(a2);
            }
        });
        this.f9456s.addListener(new r(this, z4, width, 0));
        this.f9456s.setDuration(220L);
        this.f9456s.setInterpolator(mr.f27122f);
        this.f9456s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f9457w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        t tVar = this.f9459y;
        int measuredWidth = (int) (tVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (tVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        p2 p2Var = this.B.f9464g;
        ((LaunchActivity) p2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = p2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f9457w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f9457w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f9459y, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.flags = i10;
        attributes.gravity = 51;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-2147417856);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new e3.h(this, 19), 80L);
    }
}
