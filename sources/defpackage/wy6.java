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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class wy6 extends Dialog {
    public final vy6 E;
    public final xy6 F;
    public final int a;
    public final int b;
    public final Drawable c;
    public final TextView d;
    public final TextView e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f;
    public final sp8 h;
    public final ty6 n;
    public TLRPC.TL_chatInviteImporter r;
    public ValueAnimator s;
    public be0 w;
    public BitmapDrawable x;
    public float y;

    public wy6(xy6 xy6Var, Activity activity, o39 o39Var, wjb wjbVar, boolean z) {
        super(activity, 2131755353);
        int i;
        this.F = xy6Var;
        Drawable mutate = getContext().getResources().getDrawable(2131232570).mutate();
        this.c = mutate;
        TextView textView = new TextView(getContext());
        this.d = textView;
        TextView textView2 = new TextView(getContext());
        this.e = textView2;
        vy6 vy6Var = new vy6(this, getContext());
        this.E = vy6Var;
        setCancelable(true);
        vy6Var.setVisibility(4);
        int i2 = bkb.F8;
        d dVar = xy6Var.g;
        bkb.v0(i2, dVar.getResourceProvider());
        zkb.x(vy6Var, mutate, i2, dVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
        mutate.setCallback(vy6Var);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        this.a = rect.top;
        this.b = rect.left;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, wjbVar);
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        zkb.h(i2, dVar.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
        vy6Var.addView(actionBarPopupWindow$ActionBarPopupWindowLayout);
        ?? qb0Var = new qb0(getContext());
        this.n = qb0Var;
        sp8 sp8Var = new sp8(activity, dVar.getActionBar(), o39Var, qb0Var);
        this.h = sp8Var;
        sp8Var.setCreateThumbFromParent(true);
        vy6Var.addView(sp8Var);
        qb0Var.setProfileGalleryView(sp8Var);
        vy6Var.addView(qb0Var);
        textView.setMaxLines(1);
        zkb.X(textView, bkb.F6, dVar.getResourceProvider());
        textView.setTextSize(16.0f);
        textView.setTypeface(gl.o());
        vy6Var.addView(textView);
        zkb.X(textView2, bkb.x6, dVar.getResourceProvider());
        textView2.setTextSize(14.0f);
        vy6Var.addView(textView2);
        a8 a8Var = new a8(0, wjbVar, activity, true, false);
        int i3 = bkb.D8;
        int i4 = bkb.E8;
        a8Var.c(i3, i4);
        int i5 = bkb.H5;
        a8Var.h(1.0f, i5);
        if (z) {
            i = 2131754375;
        } else {
            i = 2131754370;
        }
        a8Var.j(k96.M0(i, null), 2131232345, null);
        a8Var.setOnClickListener(new View.OnClickListener(this) {
            public final wy6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wy6 wy6Var = this.b;
                switch (b) {
                    case 0:
                        xy6 xy6Var2 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wy6Var.r;
                        if (tL_chatInviteImporter != null) {
                            xy6Var2.d(tL_chatInviteImporter, true);
                        }
                        xy6Var2.s.e(false);
                        xy6Var2.r = null;
                        return;
                    case 1:
                        wy6Var.d();
                        return;
                    default:
                        xy6 xy6Var3 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wy6Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            xy6Var3.d(tL_chatInviteImporter2, false);
                        }
                        xy6Var3.s.e(false);
                        xy6Var3.r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
        a8 a8Var2 = new a8(0, wjbVar, activity, false, false);
        a8Var2.c(i3, i4);
        a8Var2.h(1.0f, i5);
        a8Var2.j(k96.M0(2131745409, null), 2131232260, null);
        a8Var2.setOnClickListener(new View.OnClickListener(this) {
            public final wy6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wy6 wy6Var = this.b;
                switch (b) {
                    case 0:
                        xy6 xy6Var2 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wy6Var.r;
                        if (tL_chatInviteImporter != null) {
                            xy6Var2.d(tL_chatInviteImporter, true);
                        }
                        xy6Var2.s.e(false);
                        xy6Var2.r = null;
                        return;
                    case 1:
                        wy6Var.d();
                        return;
                    default:
                        xy6 xy6Var3 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wy6Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            xy6Var3.d(tL_chatInviteImporter2, false);
                        }
                        xy6Var3.s.e(false);
                        xy6Var3.r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
        a8 a8Var3 = new a8(0, wjbVar, activity, false, true);
        a8Var3.c(bkb.p7, bkb.o7);
        a8Var3.h(1.0f, i5);
        a8Var3.j(k96.M0(2131751356, null), 2131232333, null);
        a8Var3.setOnClickListener(new View.OnClickListener(this) {
            public final wy6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wy6 wy6Var = this.b;
                switch (b) {
                    case 0:
                        xy6 xy6Var2 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = wy6Var.r;
                        if (tL_chatInviteImporter != null) {
                            xy6Var2.d(tL_chatInviteImporter, true);
                        }
                        xy6Var2.s.e(false);
                        xy6Var2.r = null;
                        return;
                    case 1:
                        wy6Var.d();
                        return;
                    default:
                        xy6 xy6Var3 = wy6Var.F;
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = wy6Var.r;
                        if (tL_chatInviteImporter2 != null) {
                            xy6Var3.d(tL_chatInviteImporter2, false);
                        }
                        xy6Var3.s.e(false);
                        xy6Var3.r = null;
                        return;
                }
            }
        });
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var3);
    }

    public final int c() {
        int measuredHeight = this.d.getMeasuredHeight() + gl.L(12.0f) + this.h.getMeasuredHeight();
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            measuredHeight += textView.getMeasuredHeight() + gl.L(4.0f);
        }
        return this.f.getMeasuredHeight() + gl.L(12.0f) + measuredHeight;
    }

    public final void d() {
        xy6 xy6Var = this.F;
        d dVar = xy6Var.g;
        if (this.r != null) {
            xy6Var.b = true;
            super.dismiss();
            dVar.dismissCurrentDialog();
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.r.user_id);
            dVar.presentFragment(new mu1(bundle));
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
        sp8 sp8Var = this.h;
        float width = (this.w.getWidth() * 1.0f) / sp8Var.getMeasuredWidth();
        float width2 = (this.w.getWidth() / 2.0f) / width;
        float f2 = 1.0f - width;
        float left = iArr[0] - (sp8Var.getLeft() + ((int) ((sp8Var.getMeasuredWidth() * f2) / 2.0f)));
        float top = iArr[1] - (sp8Var.getTop() + ((int) ((c() * f2) / 2.0f)));
        int i = (-this.f.getTop()) / 2;
        float f3 = 0.0f;
        if (!z) {
            f3 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
        this.s = ofFloat;
        ofFloat.addUpdateListener(new ry6(this, width, left, top, width2, i, (byte) 0));
        this.s.addListener(new uy6(this, z, width, (byte) 0));
        this.s.setDuration(220L);
        this.s.setInterpolator(s33.f);
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
        vy6 vy6Var = this.E;
        int measuredWidth = (int) (vy6Var.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (vy6Var.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        canvas.save();
        d dVar = this.F.g;
        ((LaunchActivity) dVar.getParentActivity()).N().getView().draw(canvas);
        canvas.drawColor(bm2.o(-16777216, 76));
        Dialog visibleDialog = dVar.getVisibleDialog();
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
        gl.e3(new vl6(this, (byte) 8), 80L);
    }
}
