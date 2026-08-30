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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t4;
import org.telegram.ui.xn;
public final class u extends Dialog {
    public final v B;
    public final int f9469a;
    public final int f9470b;
    public final Drawable f9471c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f9472f;
    public final vh0 h;
    public final q f9473n;
    public TLRPC.TL_chatInviteImporter f9474r;
    public ValueAnimator f9475s;
    public p9 v;
    public BitmapDrawable f9476w;
    public float f9477x;
    public final t f9478y;

    public u(v vVar, Activity activity, sl0 sl0Var, f6 f6Var, boolean z4) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.B = vVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f9471c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        t tVar = new t(this, getContext());
        this.f9478y = tVar;
        setCancelable(true);
        tVar.setVisibility(4);
        int i11 = j6.G8;
        p2 p2Var = vVar.f9483g;
        int v02 = j6.v0(i11, p2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(tVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f9469a = rect.top;
        this.f9470b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, f6Var);
        this.f9472f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        tVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? t4Var = new t4(getContext());
        this.f9473n = t4Var;
        vh0 vh0Var = new vh0(activity, p2Var.getActionBar(), sl0Var, t4Var);
        this.h = vh0Var;
        vh0Var.setCreateThumbFromParent(true);
        tVar.addView(vh0Var);
        t4Var.setProfileGalleryView(vh0Var);
        tVar.addView(t4Var);
        textView.setMaxLines(1);
        textView.setTextColor(j6.v0(j6.G6, p2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        tVar.addView(textView);
        textView2.setTextColor(j6.v0(j6.f20281y6, p2Var.getResourceProvider()));
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
            public final u f9461b;

            {
                this.f9461b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f9461b;
                        v vVar2 = uVar.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f9474r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f9494s.e(false);
                        vVar2.f9493r = null;
                        return;
                    case 1:
                        u.a(this.f9461b);
                        return;
                    default:
                        u uVar2 = this.f9461b;
                        v vVar3 = uVar2.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f9474r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f9494s.e(false);
                        vVar3.f9493r = null;
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
            public final u f9461b;

            {
                this.f9461b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f9461b;
                        v vVar2 = uVar.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f9474r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f9494s.e(false);
                        vVar2.f9493r = null;
                        return;
                    case 1:
                        u.a(this.f9461b);
                        return;
                    default:
                        u uVar2 = this.f9461b;
                        v vVar3 = uVar2.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f9474r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f9494s.e(false);
                        vVar3.f9493r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(j6.v0(j6.f20141q7, f6Var), j6.v0(j6.f20122p7, f6Var));
        g1Var3.setSelectorColor(j6.v0(i14, f6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        g1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final u f9461b;

            {
                this.f9461b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f9461b;
                        v vVar2 = uVar.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f9474r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f9494s.e(false);
                        vVar2.f9493r = null;
                        return;
                    case 1:
                        u.a(this.f9461b);
                        return;
                    default:
                        u uVar2 = this.f9461b;
                        v vVar3 = uVar2.B;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f9474r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f9494s.e(false);
                        vVar3.f9493r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static void a(u uVar) {
        v vVar = uVar.B;
        if (uVar.f9474r != null) {
            vVar.f9480b = true;
            p2 p2Var = vVar.f9483g;
            super.dismiss();
            p2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", uVar.f9474r.user_id);
            p2Var.presentFragment(new xn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f9472f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.f9475s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        vh0 vh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / vh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        final float left = iArr[0] - (vh0Var.getLeft() + ((int) ((vh0Var.getMeasuredWidth() * f12) / 2.0f)));
        final float top = iArr[1] - (vh0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        final int i10 = (-this.f9472f.getTop()) / 2;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f9475s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u uVar = u.this;
                uVar.f9477x = floatValue;
                float f13 = width;
                float w10 = e2.c.w(1.0f, f13, floatValue, f13);
                t tVar = uVar.f9478y;
                tVar.setScaleX(w10);
                tVar.setScaleY(w10);
                tVar.setTranslationX((1.0f - uVar.f9477x) * left);
                tVar.setTranslationY((1.0f - uVar.f9477x) * top);
                int i11 = (int) ((1.0f - uVar.f9477x) * width2);
                uVar.h.N(i11, i11);
                float a2 = k7.n.a((uVar.f9477x * 2.0f) - 1.0f, 0.0f, 1.0f);
                uVar.f9471c.setAlpha((int) (a2 * 255.0f));
                uVar.d.setAlpha(a2);
                uVar.e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f9472f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - uVar.f9477x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = uVar.f9476w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (uVar.f9477x * 255.0f));
                }
                uVar.f9473n.setAlpha(a2);
            }
        });
        this.f9475s.addListener(new r(this, z4, width, 0));
        this.f9475s.setDuration(220L);
        this.f9475s.setInterpolator(nr.f27346f);
        this.f9475s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f9476w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        t tVar = this.f9478y;
        int measuredWidth = (int) (tVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (tVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        p2 p2Var = this.B.f9483g;
        ((LaunchActivity) p2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = p2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f9476w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f9476w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f9478y, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new ef.e(this, 19), 80L);
    }
}
