package eh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q4;
import org.telegram.ui.qn;
public final class w extends Dialog {
    public final x A;
    public final int f5235a;
    public final int f5236b;
    public final Drawable f5237c;
    public final TextView d;
    public final TextView f5238e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f5239f;
    public final ah0 h;
    public final s f5240n;
    public TLRPC.TL_chatInviteImporter f5241r;
    public ValueAnimator f5242s;
    public o9 v;
    public BitmapDrawable f5243w;
    public float f5244x;
    public final v f5245y;

    public w(x xVar, Activity activity, wk0 wk0Var, b6 b6Var, boolean z10) {
        super(activity, R.style.TransparentDialog2);
        int i9;
        this.A = xVar;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert2).mutate();
        this.f5237c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.f5238e = textView2;
        v vVar = new v(this, getContext());
        this.f5245y = vVar;
        setCancelable(true);
        vVar.setVisibility(4);
        int i10 = f6.G8;
        o2 o2Var = xVar.f5251g;
        int v02 = f6.v0(i10, o2Var.getResourceProvider());
        mutate.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        mutate.setCallback(vVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f5235a = rect.top;
        this.f5236b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, b6Var);
        this.f5239f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(v02);
        vVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f5240n = q4Var;
        ah0 ah0Var = new ah0(activity, o2Var.getActionBar(), wk0Var, q4Var);
        this.h = ah0Var;
        ah0Var.setCreateThumbFromParent(true);
        vVar.addView(ah0Var);
        q4Var.setProfileGalleryView(ah0Var);
        vVar.addView(q4Var);
        textView.setMaxLines(1);
        textView.setTextColor(f6.v0(f6.G6, o2Var.getResourceProvider()));
        textView.setTextSize(16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        vVar.addView(textView);
        textView2.setTextColor(f6.v0(f6.f23369y6, o2Var.getResourceProvider()));
        textView2.setTextSize(14.0f);
        vVar.addView(textView2);
        g1 g1Var = new g1(activity, true, false);
        int i11 = f6.E8;
        int v03 = f6.v0(i11, b6Var);
        int i12 = f6.F8;
        g1Var.c(v03, f6.v0(i12, b6Var));
        int i13 = f6.I5;
        g1Var.setSelectorColor(f6.v0(i13, b6Var));
        if (z10) {
            i9 = R.string.AddToChannel;
        } else {
            i9 = R.string.AddToGroup;
        }
        g1Var.g(LocaleController.getString(i9), R.drawable.msg_requests, null);
        g1Var.setOnClickListener(new View.OnClickListener(this) {
            public final w f5226b;

            {
                this.f5226b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w wVar = this.f5226b;
                        x xVar2 = wVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wVar.f5241r;
                        if (tL_chatInviteImporter != null) {
                            xVar2.d(tL_chatInviteImporter, true);
                        }
                        xVar2.f5262s.e(false);
                        xVar2.f5261r = null;
                        return;
                    case 1:
                        w.a(this.f5226b);
                        return;
                    default:
                        w wVar2 = this.f5226b;
                        x xVar3 = wVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wVar2.f5241r;
                        if (tL_chatInviteImporter2 != null) {
                            xVar3.d(tL_chatInviteImporter2, false);
                        }
                        xVar3.f5262s.e(false);
                        xVar3.f5261r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
        g1 g1Var2 = new g1(activity, false, false);
        g1Var2.c(f6.v0(i11, b6Var), f6.v0(i12, b6Var));
        g1Var2.setSelectorColor(f6.v0(i13, b6Var));
        g1Var2.g(LocaleController.getString(R.string.SendMessage), R.drawable.msg_msgbubble3, null);
        g1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final w f5226b;

            {
                this.f5226b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w wVar = this.f5226b;
                        x xVar2 = wVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wVar.f5241r;
                        if (tL_chatInviteImporter != null) {
                            xVar2.d(tL_chatInviteImporter, true);
                        }
                        xVar2.f5262s.e(false);
                        xVar2.f5261r = null;
                        return;
                    case 1:
                        w.a(this.f5226b);
                        return;
                    default:
                        w wVar2 = this.f5226b;
                        x xVar3 = wVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wVar2.f5241r;
                        if (tL_chatInviteImporter2 != null) {
                            xVar3.d(tL_chatInviteImporter2, false);
                        }
                        xVar3.f5262s.e(false);
                        xVar3.f5261r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
        g1 g1Var3 = new g1(activity, false, true);
        g1Var3.c(f6.v0(f6.f23230q7, b6Var), f6.v0(f6.f23212p7, b6Var));
        g1Var3.setSelectorColor(f6.v0(i13, b6Var));
        g1Var3.g(LocaleController.getString(R.string.DismissRequest), R.drawable.msg_remove, null);
        g1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final w f5226b;

            {
                this.f5226b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        w wVar = this.f5226b;
                        x xVar2 = wVar.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wVar.f5241r;
                        if (tL_chatInviteImporter != null) {
                            xVar2.d(tL_chatInviteImporter, true);
                        }
                        xVar2.f5262s.e(false);
                        xVar2.f5261r = null;
                        return;
                    case 1:
                        w.a(this.f5226b);
                        return;
                    default:
                        w wVar2 = this.f5226b;
                        x xVar3 = wVar2.A;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wVar2.f5241r;
                        if (tL_chatInviteImporter2 != null) {
                            xVar3.d(tL_chatInviteImporter2, false);
                        }
                        xVar3.f5262s.e(false);
                        xVar3.f5261r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var3);
    }

    public static void a(w wVar) {
        x xVar = wVar.A;
        if (wVar.f5241r != null) {
            xVar.f5247b = true;
            o2 o2Var = xVar.f5251g;
            super.dismiss();
            o2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", wVar.f5241r.user_id);
            o2Var.presentFragment(new qn(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.f5238e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        }
        return this.f5239f.getMeasuredHeight() + AndroidUtilities.dp(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.f5242s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.v.getLocationOnScreen(iArr);
        float f11 = 1.0f;
        ah0 ah0Var = this.h;
        final float width = (this.v.getWidth() * 1.0f) / ah0Var.getMeasuredWidth();
        final float width2 = (this.v.getWidth() / 2.0f) / width;
        float f12 = 1.0f - width;
        final float left = iArr[0] - (ah0Var.getLeft() + ((int) ((ah0Var.getMeasuredWidth() * f12) / 2.0f)));
        final float top = iArr[1] - (ah0Var.getTop() + ((int) ((d() * f12) / 2.0f)));
        final int i9 = (-this.f5239f.getTop()) / 2;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f5242s = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                w wVar = w.this;
                wVar.f5244x = floatValue;
                float f13 = width;
                float z11 = e2.c.z(1.0f, f13, floatValue, f13);
                v vVar = wVar.f5245y;
                vVar.setScaleX(z11);
                vVar.setScaleY(z11);
                vVar.setTranslationX((1.0f - wVar.f5244x) * left);
                vVar.setTranslationY((1.0f - wVar.f5244x) * top);
                int i10 = (int) ((1.0f - wVar.f5244x) * width2);
                wVar.h.N(i10, i10);
                float a2 = g7.n.a((wVar.f5244x * 2.0f) - 1.0f, 0.0f, 1.0f);
                wVar.f5237c.setAlpha((int) (a2 * 255.0f));
                wVar.d.setAlpha(a2);
                wVar.f5238e.setAlpha(a2);
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = wVar.f5239f;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((1.0f - wVar.f5244x) * i9);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(a2);
                BitmapDrawable bitmapDrawable = wVar.f5243w;
                if (bitmapDrawable != null) {
                    bitmapDrawable.setAlpha((int) (wVar.f5244x * 255.0f));
                }
                wVar.f5240n.setAlpha(a2);
            }
        });
        this.f5242s.addListener(new t(this, z10, width, 0));
        this.f5242s.setDuration(220L);
        this.f5242s.setInterpolator(gr.f28844f);
        this.f5242s.start();
    }

    public final void f() {
        int i9;
        BitmapDrawable bitmapDrawable = this.f5243w;
        if (bitmapDrawable != null) {
            i9 = bitmapDrawable.getAlpha();
        } else {
            i9 = 255;
        }
        Resources resources = getContext().getResources();
        v vVar = this.f5245y;
        int measuredWidth = (int) (vVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (vVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        o2 o2Var = this.A.f5251g;
        ((LaunchActivity) o2Var.getParentActivity()).O().getView().draw(canvas);
        canvas.drawColor(i0.a.k(-16777216, 76));
        Dialog visibleDialog = o2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f5243w = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i9);
        getWindow().setBackgroundDrawable(this.f5243w);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(R.style.DialogNoAnimation);
        setContentView(this.f5245y, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.dimAmount = 0.0f;
        int i9 = attributes.flags & (-3);
        attributes.flags = i9;
        attributes.gravity = 51;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i9 | (-2147417856);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        AndroidUtilities.runOnUIThread(new af.e(this, 23), 80L);
    }
}
