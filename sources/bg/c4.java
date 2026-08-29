package bg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.th;
public final class c4 extends Dialog {
    public ValueAnimator A;
    public boolean B;
    public h1 C;
    public nh.b0 D;
    public final int f2126a;
    public final x2 f2127b;
    public final y3 f2128c;
    public final z3 d;
    public final ImageView f2129e;
    public final a4 f2130f;
    public final Rect h;
    public Bitmap f2131n;
    public BitmapShader f2132r;
    public Paint f2133s;
    public Matrix v;
    public final qb0 f2134w;
    public final qb0 f2135x;
    public float f2136y;

    public c4(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        lh.b bVar = new lh.b();
        this.h = new Rect();
        this.B = false;
        this.f2126a = i10;
        x2 x2Var = new x2(this, context, 2);
        this.f2127b = x2Var;
        x2Var.setOnClickListener(new ag.o(this, 3));
        y3 y3Var = new y3(context, 0);
        this.f2128c = y3Var;
        y3Var.setOrientation(1);
        x2Var.addView(y3Var, f6.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        z3 z3Var = new z3(this, context, 0);
        z3Var.setWillNotDraw(false);
        y3Var.addView(z3Var, f6.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        z3Var.addView(frameLayout, f6.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = th.h(frameLayout, textView, f6.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        h.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        h.setTextColor(-8421505);
        h.setTextSize(1, 14.0f);
        frameLayout.addView(h, f6.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        z3 z3Var2 = new z3(this, context, 1);
        this.d = z3Var2;
        z3Var.addView(z3Var2, f6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f2129e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        z3Var2.addView(imageView, f6.e(-1, -1, 119));
        a4 a4Var = new a4(this, context, AndroidUtilities.density);
        this.f2130f = a4Var;
        z3Var2.addView(a4Var, f6.e(-2, -2, 17));
        j70 F = j70.F(x2Var, bVar, x2Var);
        qb0 qb0Var = new qb0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.f2134w = qb0Var;
        qb0Var.setOnClickListener(new View.OnClickListener(this) {
            public final c4 f2610b;

            {
                this.f2610b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        c4 c4Var = this.f2610b;
                        h1 h1Var = c4Var.C;
                        boolean z10 = h1Var.f2286f;
                        h1Var.f2286f = !z10;
                        c4Var.f2134w.a(z10, true);
                        c4Var.f2130f.b(i10, c4Var.C, true);
                        return;
                    default:
                        c4 c4Var2 = this.f2610b;
                        h1 h1Var2 = c4Var2.C;
                        boolean z11 = h1Var2.f2285e;
                        h1Var2.f2285e = !z11;
                        c4Var2.f2135x.a(z11, true);
                        c4Var2.f2130f.b(i10, c4Var2.C, true);
                        return;
                }
            }
        });
        F.q(qb0Var);
        qb0 qb0Var2 = new qb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.f2135x = qb0Var2;
        qb0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final c4 f2610b;

            {
                this.f2610b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r3) {
                    case 0:
                        c4 c4Var = this.f2610b;
                        h1 h1Var = c4Var.C;
                        boolean z10 = h1Var.f2286f;
                        h1Var.f2286f = !z10;
                        c4Var.f2134w.a(z10, true);
                        c4Var.f2130f.b(i10, c4Var.C, true);
                        return;
                    default:
                        c4 c4Var2 = this.f2610b;
                        h1 h1Var2 = c4Var2.C;
                        boolean z11 = h1Var2.f2285e;
                        h1Var2.f2285e = !z11;
                        c4Var2.f2135x.a(z11, true);
                        c4Var2.f2130f.b(i10, c4Var2.C, true);
                        return;
                }
            }
        });
        F.q(qb0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new w3(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new w3(this, 3), true);
        y3Var.addView(F.A, f6.o(-2, -2, 0.0f, 85));
        x2Var.setFitsSystemWindows(true);
        x2Var.setOnApplyWindowInsetsListener(new b4(this));
    }

    public final void b(boolean z10, w3 w3Var) {
        float f9;
        long j10;
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f10 = this.f2136y;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new q1(this, 5));
        this.A.addListener(new androidx.fragment.app.g(this, z10, w3Var, 1));
        this.A.setInterpolator(jr.h);
        ValueAnimator valueAnimator2 = this.A;
        if (z10) {
            j10 = 420;
        } else {
            j10 = 320;
        }
        valueAnimator2.setDuration(j10);
        this.A.start();
    }

    @Override
    public final void dismiss() {
        if (this.B) {
            return;
        }
        nh.b0 b0Var = this.D;
        if (b0Var != null) {
            b0Var.run(this.C);
            this.D = null;
        }
        this.B = true;
        b(false, new w3(this, 1));
        this.f2127b.invalidate();
    }

    @Override
    public final boolean isShowing() {
        return !this.B;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        x2 x2Var = this.f2127b;
        setContentView(x2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i10;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-1945959040);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        x2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(x2Var, !g6.I.q());
    }

    @Override
    public final void show() {
        if (!AndroidUtilities.isSafeToShow(getContext())) {
            return;
        }
        super.show();
        AndroidUtilities.makeGlobalBlurBitmap(new ag.i0(this, 3), 14.0f);
        b(true, null);
    }
}
