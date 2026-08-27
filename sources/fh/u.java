package fh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class u extends Dialog {
    public final v A;

    public final int f6162a;

    public final int f6163b;

    public final Drawable f6164c;
    public final TextView d;

    public final TextView f6165e;

    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f6166f;
    public final ch0 h;

    public final q f6167n;

    public TLRPC.TL_chatInviteImporter f6168r;

    public ValueAnimator f6169s;
    public n9 v;

    public BitmapDrawable f6170w;

    public float f6171x;

    public final t f6172y;

    public u(v vVar, Activity activity, zk0 zk0Var, c6 c6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        this.A = vVar;
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f6164c = drawableMutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f6165e = textView2;
        t tVar = new t(this, getContext());
        this.f6172y = tVar;
        setCancelable(true);
        tVar.setVisibility(4);
        int i10 = g6.G8;
        n2 n2Var = vVar.f6178g;
        int iV0 = g6.v0(i10, n2Var.getResourceProvider());
        drawableMutate.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
        drawableMutate.setCallback(tVar);
        Rect rect = new Rect();
        drawableMutate.getPadding(rect);
        this.f6162a = rect.top;
        this.f6163b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, c6Var);
        this.f6166f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(iV0);
        tVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        q qVar = new q(getContext());
        this.f6167n = qVar;
        ch0 ch0Var = new ch0(activity, n2Var.getActionBar(), zk0Var, qVar);
        this.h = ch0Var;
        ch0Var.setCreateThumbFromParent(true);
        tVar.addView(ch0Var);
        qVar.setProfileGalleryView(ch0Var);
        tVar.addView(qVar);
        textView.setMaxLines(1);
        textView.setTextColor(g6.v0(g6.G6, n2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        tVar.addView(textView);
        textView2.setTextColor(g6.v0(g6.f23423y6, n2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        tVar.addView(textView2);
        f1 f1Var = new f1(activity, true, false);
        int i11 = g6.E8;
        int iV1 = g6.v0(i11, c6Var);
        int i12 = g6.F8;
        f1Var.c(iV1, g6.v0(i12, c6Var));
        int i13 = g6.I5;
        f1Var.setSelectorColor(g6.v0(i13, c6Var));
        f1Var.g(LocaleController.getString(z10 ? R.string.AddToChannel : R.string.AddToGroup), R.drawable.msg_requests, null);
        final int i14 = 0;
        f1Var.setOnClickListener(new View.OnClickListener(this) {

            public final u f6153b;

            {
                this.f6153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        u uVar = this.f6153b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f6168r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f6189s.e(false);
                        vVar2.f6188r = null;
                        break;
                    case 1:
                        u.a(this.f6153b);
                        break;
                    default:
                        u uVar2 = this.f6153b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f6168r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f6189s.e(false);
                        vVar3.f6188r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var);
        f1 f1Var2 = new f1(activity, false, false);
        f1Var2.c(g6.v0(i11, c6Var), g6.v0(i12, c6Var));
        f1Var2.setSelectorColor(g6.v0(i13, c6Var));
        f1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        final int i15 = 1;
        f1Var2.setOnClickListener(new View.OnClickListener(this) {

            public final u f6153b;

            {
                this.f6153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        u uVar = this.f6153b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f6168r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f6189s.e(false);
                        vVar2.f6188r = null;
                        break;
                    case 1:
                        u.a(this.f6153b);
                        break;
                    default:
                        u uVar2 = this.f6153b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f6168r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f6189s.e(false);
                        vVar3.f6188r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var2);
        f1 f1Var3 = new f1(activity, false, true);
        f1Var3.c(g6.v0(g6.f23284q7, c6Var), g6.v0(g6.f23269p7, c6Var));
        f1Var3.setSelectorColor(g6.v0(i13, c6Var));
        f1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        final int i16 = 2;
        f1Var3.setOnClickListener(new View.OnClickListener(this) {

            public final u f6153b;

            {
                this.f6153b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        u uVar = this.f6153b;
                        v vVar2 = uVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = uVar.f6168r;
                        if (tL_chatInviteImporter != null) {
                            vVar2.d(tL_chatInviteImporter, true);
                        }
                        vVar2.f6189s.e(false);
                        vVar2.f6188r = null;
                        break;
                    case 1:
                        u.a(this.f6153b);
                        break;
                    default:
                        u uVar2 = this.f6153b;
                        v vVar3 = uVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = uVar2.f6168r;
                        if (tL_chatInviteImporter2 != null) {
                            vVar3.d(tL_chatInviteImporter2, false);
                        }
                        vVar3.f6189s.e(false);
                        vVar3.f6188r = null;
                        break;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(f1Var3);
    }

    public static void a(u uVar) {
        v vVar = uVar.A;
        if (uVar.f6168r != null) {
            vVar.f6174b = true;
            n2 n2Var = vVar.f6178g;
            super.dismiss();
            n2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", uVar.f6168r.user_id);
            n2Var.presentFragment(new rn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f6165e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f6166f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        ValueAnimator valueAnimator = this.f6169s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float width = this.v.getWidth() * 1.0f;
        ch0 ch0Var = this.h;
        final float measuredWidth = width / ch0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / measuredWidth;
        int i10 = 0;
        float f10 = 1.0f - measuredWidth;
        final float left = iArr[0] - (ch0Var.getLeft() + ((int) ((ch0Var.getMeasuredWidth() * f10) / 2.0f)));
        final float top = iArr[1] - (ch0Var.getTop() + ((int) ((d() * f10) / 2.0f)));
        final int i11 = (-this.f6166f.getTop()) / 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        this.f6169s = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                u uVar = this.f6147a;
                uVar.f6171x = fFloatValue;
                float f11 = measuredWidth;
                float fZ = com.google.android.recaptcha.internal.a.z(1.0f, f11, fFloatValue, f11);
                t tVar = uVar.f6172y;
                tVar.setScaleX(fZ);
                tVar.setScaleY(fZ);
                tVar.setTranslationX((1.0f - uVar.f6171x) * left);
                tVar.setTranslationY((1.0f - uVar.f6171x) * top);
                int i12 = (int) ((1.0f - uVar.f6171x) * width2);
                uVar.h.N(i12, i12);
                float fA = h7.n.a((uVar.f6171x * 2.0f) - 1.0f, 0.0f, 1.0f);
                uVar.f6164c.setAlpha((int) (fA * 255.0f));
                uVar.d.setAlpha(fA);
                uVar.f6165e.setAlpha(fA);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = uVar.f6166f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - uVar.f6171x) * i11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(fA);
                BitmapDrawable bitmapDrawable = uVar.f6170w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (uVar.f6171x * 255.0f));
                }
                uVar.f6167n.setAlpha(fA);
            }
        });
        this.f6169s.addListener(new r(this, z10, measuredWidth, i10));
        this.f6169s.setDuration(220L);
        this.f6169s.setInterpolator(er.f28122f);
        this.f6169s.start();
    }

    public final void f() {
        BitmapDrawable bitmapDrawable = this.f6170w;
        int alpha = bitmapDrawable != null ? bitmapDrawable.getAlpha() : 255;
        Resources resources = getContext().getResources();
        t tVar = this.f6172y;
        int measuredWidth = (int) (tVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (tVar.getMeasuredHeight() / 6.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        n2 n2Var = this.A.f6178g;
        ((LaunchActivity) n2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.b.k(-16777216, 76));
        Dialog visibleDialog = n2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, bitmapCreateBitmap);
        this.f6170w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(alpha);
        getWindow().setBackgroundDrawable(this.f6170w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f6172y, new ViewGroup.LayoutParams(-1, -1));
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
        AndroidUtilities.runOnUIThread(new f2.r(this, 1), 80L);
    }
}
