package hh;

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
import cg.m2;
import i7.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r4;
import org.telegram.ui.tn;
public final class u extends Dialog {
    public final v A;
    public final int f8109a;
    public final int f8110b;
    public final Drawable f8111c;
    public final TextView d;
    public final TextView f8112e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f8113f;
    public final kh0 h;
    public final q f8114n;
    public TLRPC.TL_chatInviteImporter f8115r;
    public ValueAnimator f8116s;
    public t9 v;
    public BitmapDrawable f8117w;
    public float f8118x;
    public final t f8119y;

    public u(v vVar, Activity activity, jl0 jl0Var, c6 c6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i10;
        this.A = vVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f8111c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f8112e = textView2;
        t tVar = new t(this, getContext());
        this.f8119y = tVar;
        setCancelable(true);
        tVar.setVisibility(4);
        int i11 = g6.G8;
        o2 o2Var = vVar.f8125g;
        int v02 = g6.v0(i11, o2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(tVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f8109a = rect.top;
        this.f8110b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, c6Var);
        this.f8113f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        tVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? r4Var = new r4(getContext());
        this.f8114n = r4Var;
        kh0 kh0Var = new kh0(activity, o2Var.getActionBar(), jl0Var, r4Var);
        this.h = kh0Var;
        kh0Var.setCreateThumbFromParent(true);
        tVar.addView(kh0Var);
        r4Var.setProfileGalleryView(kh0Var);
        tVar.addView(r4Var);
        textView.setMaxLines(1);
        textView.setTextColor(g6.v0(g6.G6, o2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        tVar.addView(textView);
        textView2.setTextColor(g6.v0(g6.f23433y6, o2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        tVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i12 = g6.E8;
        int v03 = g6.v0(i12, c6Var);
        int i13 = g6.F8;
        g1Var.c(v03, g6.v0(i13, c6Var));
        int i14 = g6.I5;
        g1Var.setSelectorColor(g6.v0(i14, c6Var));
        if (z10) {
            i10 = R.string.AddToChannel;
        } else {
            i10 = R.string.AddToGroup;
        }
        g1Var.g(LocaleController.getString(i10), R.drawable.msg_requests, null);
        g1Var.setOnClickListener(new View.OnClickListener(this) {
            public final u f8100b;

            {
                this.f8100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f8100b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f8115r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f8136s.e(false);
                        vVar2.f8135r = null;
                        return;
                    case 1:
                        u.a(this.f8100b);
                        return;
                    default:
                        u uVar2 = this.f8100b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f8115r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f8136s.e(false);
                        vVar3.f8135r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(g6.v0(i12, c6Var), g6.v0(i13, c6Var));
        g1Var2.setSelectorColor(g6.v0(i14, c6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        g1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final u f8100b;

            {
                this.f8100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f8100b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f8115r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f8136s.e(false);
                        vVar2.f8135r = null;
                        return;
                    case 1:
                        u.a(this.f8100b);
                        return;
                    default:
                        u uVar2 = this.f8100b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f8115r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f8136s.e(false);
                        vVar3.f8135r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(g6.v0(g6.f23295q7, c6Var), g6.v0(g6.f23279p7, c6Var));
        g1Var3.setSelectorColor(g6.v0(i14, c6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        g1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final u f8100b;

            {
                this.f8100b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u uVar = this.f8100b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f8115r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f8136s.e(false);
                        vVar2.f8135r = null;
                        return;
                    case 1:
                        u.a(this.f8100b);
                        return;
                    default:
                        u uVar2 = this.f8100b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f8115r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f8136s.e(false);
                        vVar3.f8135r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static void a(u uVar) {
        v vVar = uVar.A;
        if (uVar.f8115r != null) {
            vVar.f8121b = true;
            o2 o2Var = vVar.f8125g;
            super.dismiss();
            o2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", uVar.f8115r.user_id);
            o2Var.presentFragment(new tn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f8112e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f8113f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.f8116s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        kh0 kh0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / kh0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        final float left = iArr[0] - (kh0Var.getLeft() + ((int) ((kh0Var.getMeasuredWidth() * f11) / 2.0f)));
        final float top = iArr[1] - (kh0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        final int i10 = (-this.f8113f.getTop()) / 2;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
        this.f8116s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u uVar = u.this;
                uVar.f8118x = floatValue;
                float f12 = width;
                float z11 = com.google.android.recaptcha.internal.a.z(1.0f, f12, floatValue, f12);
                t tVar = uVar.f8119y;
                tVar.setScaleX(z11);
                tVar.setScaleY(z11);
                tVar.setTranslationX((1.0f - uVar.f8118x) * left);
                tVar.setTranslationY((1.0f - uVar.f8118x) * top);
                int i11 = (int) ((1.0f - uVar.f8118x) * width2);
                uVar.h.N(i11, i11);
                float a2 = w.a((uVar.f8118x * 2.0f) - 1.0f, 0.0f, 1.0f);
                uVar.f8111c.setAlpha((int) (a2 * 255.0f));
                uVar.d.setAlpha(a2);
                uVar.f8112e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f8113f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - uVar.f8118x) * i10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = uVar.f8117w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (uVar.f8118x * 255.0f));
                }
                uVar.f8114n.setAlpha(a2);
            }
        });
        this.f8116s.addListener(new r(this, z10, width, 0));
        this.f8116s.setDuration(220L);
        this.f8116s.setInterpolator(jr.f29800f);
        this.f8116s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f8117w;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        t tVar = this.f8119y;
        int measuredWidth = (int) (tVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (tVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        o2 o2Var = this.A.f8125g;
        ((LaunchActivity) o2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = o2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f8117w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f8117w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f8119y, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new m2(this, 16), 80L);
    }
}
