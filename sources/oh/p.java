package oh;

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
import lg.s;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q4;
import org.telegram.ui.un;
public final class p extends Dialog {
    public final o D;
    public final q E;
    public final int f14283a;
    public final int f14284b;
    public final Drawable f14285c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f14286f;
    public final vg0 h;
    public final m f14287n;
    public TLRPC.TL_chatInviteImporter f14288r;
    public ValueAnimator f14289s;
    public g9 f14290w;
    public BitmapDrawable f14291x;
    public float f14292y;

    public p(q qVar, Activity activity, uk0 uk0Var, p6 p6Var, boolean z10) {
        super(activity, 2131755353);
        int i10;
        this.E = qVar;
        Drawable mutate = getContext().getResources().getDrawable(2131232562).mutate();
        this.f14285c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        o oVar = new o(this, getContext());
        this.D = oVar;
        setCancelable(true);
        oVar.setVisibility(4);
        int i11 = t6.G8;
        k2 k2Var = qVar.f14297g;
        t6.w0(i11, k2Var.getResourceProvider());
        a7.y(oVar, mutate, i11, k2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(oVar);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.f14283a = rect.top;
        this.f14284b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, p6Var);
        this.f14286f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        a7.i(i11, actionBarPopupWindow$ActionBarPopupWindowLayout, k2Var.getResourceProvider());
        oVar.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? q4Var = new q4(getContext());
        this.f14287n = q4Var;
        vg0 vg0Var = new vg0(activity, k2Var.getActionBar(), uk0Var, q4Var);
        this.h = vg0Var;
        vg0Var.setCreateThumbFromParent(true);
        oVar.addView(vg0Var);
        q4Var.setProfileGalleryView(vg0Var);
        oVar.addView(q4Var);
        textView.setMaxLines(1);
        a7.V(textView, t6.G6, k2Var.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(i0.o());
        oVar.addView(textView);
        a7.V(textView2, t6.f21312y6, k2Var.getResourceProvider());
        textView2.setTextSize(14.0f);
        oVar.addView(textView2);
        b1 b1Var = new b1(0, activity, p6Var, true, false);
        int i12 = t6.E8;
        int i13 = t6.F8;
        b1Var.c(i12, i13);
        int i14 = t6.I5;
        b1Var.h(1.0f, i14);
        if (z10) {
            i10 = 2131754378;
        } else {
            i10 = 2131754373;
        }
        b1Var.j(dd.L0(i10, null), 2131232339, null);
        b1Var.setOnClickListener(new View.OnClickListener(this) {
            public final p f14276b;

            {
                this.f14276b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p pVar = this.f14276b;
                        q qVar2 = pVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.f14288r;
                        if (tL_chatInviteImporter != null) {
                            qVar2.d(tL_chatInviteImporter, true);
                        }
                        qVar2.f14308s.e(false);
                        qVar2.f14307r = null;
                        return;
                    case 1:
                        p.a(this.f14276b);
                        return;
                    default:
                        p pVar2 = this.f14276b;
                        q qVar3 = pVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = pVar2.f14288r;
                        if (tL_chatInviteImporter2 != null) {
                            qVar3.d(tL_chatInviteImporter2, false);
                        }
                        qVar3.f14308s.e(false);
                        qVar3.f14307r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var);
        b1 b1Var2 = new b1(0, activity, p6Var, false, false);
        b1Var2.c(i12, i13);
        b1Var2.h(1.0f, i14);
        b1Var2.j(dd.L0(2131745618, null), 2131232254, null);
        b1Var2.setOnClickListener(new View.OnClickListener(this) {
            public final p f14276b;

            {
                this.f14276b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p pVar = this.f14276b;
                        q qVar2 = pVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.f14288r;
                        if (tL_chatInviteImporter != null) {
                            qVar2.d(tL_chatInviteImporter, true);
                        }
                        qVar2.f14308s.e(false);
                        qVar2.f14307r = null;
                        return;
                    case 1:
                        p.a(this.f14276b);
                        return;
                    default:
                        p pVar2 = this.f14276b;
                        q qVar3 = pVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = pVar2.f14288r;
                        if (tL_chatInviteImporter2 != null) {
                            qVar3.d(tL_chatInviteImporter2, false);
                        }
                        qVar3.f14308s.e(false);
                        qVar3.f14307r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var2);
        b1 b1Var3 = new b1(0, activity, p6Var, false, true);
        b1Var3.c(t6.f21171q7, t6.f21154p7);
        b1Var3.h(1.0f, i14);
        b1Var3.j(dd.L0(2131751369, null), 2131232327, null);
        b1Var3.setOnClickListener(new View.OnClickListener(this) {
            public final p f14276b;

            {
                this.f14276b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        p pVar = this.f14276b;
                        q qVar2 = pVar.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = pVar.f14288r;
                        if (tL_chatInviteImporter != null) {
                            qVar2.d(tL_chatInviteImporter, true);
                        }
                        qVar2.f14308s.e(false);
                        qVar2.f14307r = null;
                        return;
                    case 1:
                        p.a(this.f14276b);
                        return;
                    default:
                        p pVar2 = this.f14276b;
                        q qVar3 = pVar2.E;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = pVar2.f14288r;
                        if (tL_chatInviteImporter2 != null) {
                            qVar3.d(tL_chatInviteImporter2, false);
                        }
                        qVar3.f14308s.e(false);
                        qVar3.f14307r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b1Var3);
    }

    public static void a(p pVar) {
        q qVar = pVar.E;
        if (pVar.f14288r != null) {
            qVar.f14294b = true;
            k2 k2Var = qVar.f14297g;
            super.dismiss();
            k2Var.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", pVar.f14288r.user_id);
            k2Var.presentFragment(new un(bundle));
        }
    }

    public final int d() {
        int measuredHeight = this.d.getMeasuredHeight() + i0.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + i0.L(4.0f);
        }
        return this.f14286f.getMeasuredHeight() + i0.L(12.0f) + measuredHeight;
    }

    @Override
    public final void dismiss() {
        e(false);
    }

    public final void e(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.f14289s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int[] iArr = new int[2];
        this.f14290w.getLocationOnScreen(iArr);
        float f10 = 1.0f;
        vg0 vg0Var = this.h;
        float width = (this.f14290w.getWidth() * 1.0f) / vg0Var.getMeasuredWidth();
        float width2 = (this.f14290w.getWidth() / 2.0f) / width;
        float f11 = 1.0f - width;
        float left = iArr[0] - (vg0Var.getLeft() + ((int) ((vg0Var.getMeasuredWidth() * f11) / 2.0f)));
        float top = iArr[1] - (vg0Var.getTop() + ((int) ((d() * f11) / 2.0f)));
        int i10 = (-this.f14286f.getTop()) / 2;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
        this.f14289s = ofFloat;
        ofFloat.addUpdateListener(new k(this, width, left, top, width2, i10, 0));
        this.f14289s.addListener(new n(this, z10, width, 0));
        this.f14289s.setDuration(220L);
        this.f14289s.setInterpolator(gr.f26523f);
        this.f14289s.start();
    }

    public final void f() {
        int i10;
        BitmapDrawable bitmapDrawable = this.f14291x;
        if (bitmapDrawable != null) {
            i10 = bitmapDrawable.getAlpha();
        } else {
            i10 = 255;
        }
        Resources resources = getContext().getResources();
        o oVar = this.D;
        int measuredWidth = (int) (oVar.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (oVar.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        k2 k2Var = this.E.f14297g;
        ((LaunchActivity) k2Var.getParentActivity()).M().getView().draw(canvas);
        canvas.drawColor(i0.b.o(-16777216, 76));
        Dialog visibleDialog = k2Var.getVisibleDialog();
        if (visibleDialog != null) {
            visibleDialog.getWindow().getDecorView().draw(canvas);
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources, createBitmap);
        this.f14291x = bitmapDrawable2;
        bitmapDrawable2.setAlpha(i10);
        getWindow().setBackgroundDrawable(this.f14291x);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setWindowAnimations(2131755178);
        setContentView(this.D, new ViewGroup.LayoutParams(-1, -1));
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
        i0.h3(new s(this, 13), 80L);
    }
}
