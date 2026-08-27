package hh;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;

public final class e4 extends FrameLayout {

    public final gh.y1 f9166a;

    public final FrameLayout f9167b;

    public final org.telegram.ui.Components.n9 f9168c;
    public final TextView d;

    public final FrameLayout f9169e;

    public final ImageView f9170f;
    public TL_stars.StarGift h;

    public boolean f9171n;

    public e4(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, h7.z5.d(-1, -1.0f, 119, 6.0f, 6.0f, 6.0f, 6.0f));
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.l1(0.12f, -4530177)));
        frameLayout.setForeground(new u4(AndroidUtilities.dp(18.0f), 0));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.filled_add_album);
        imageView.setScaleX(1.25f);
        imageView.setScaleY(1.25f);
        frameLayout.addView(imageView, h7.z5.e(24, 24, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9167b = frameLayout2;
        gh.y1 y1Var = new gh.y1(frameLayout2, null, false);
        this.f9166a = y1Var;
        frameLayout2.setBackground(y1Var);
        y1Var.f7669s = AndroidUtilities.dp(18.0f);
        y1Var.f7671u = false;
        frameLayout.addView(frameLayout2, h7.z5.e(-1, -1, 119));
        frameLayout2.setAlpha(0.0f);
        frameLayout2.setScaleX(0.6f);
        frameLayout2.setScaleY(0.6f);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f9168c = n9Var;
        frameLayout2.addView(n9Var, h7.z5.e(52, 52, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 10.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        addView(textView, h7.z5.d(-2, 15.33f, 51, 2.0f, 0.0f, 2.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f9169e = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        addView(frameLayout3, h7.z5.d(20, 20.0f, 53, 2.0f, 0.0f, 2.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f9170f = imageView2;
        imageView2.setImageResource(R.drawable.msg_close);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout3.addView(imageView2, h7.z5.e(12, 12, 17));
        b(false, false);
    }

    public final void a(TL_stars.StarGift starGift, boolean z10) {
        this.h = starGift;
        if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            gh.y1 y1Var = this.f9166a;
            y1Var.d(stargiftattributebackdrop);
            y1Var.e(stargiftattributepattern);
            oa.Z0(this.f9168c.getImageReceiver(), stargiftattributemodel.document, 52);
            int iB = org.telegram.ui.ActionBar.g6.b(-0.05f, -0.15f, org.telegram.ui.ActionBar.g6.l1(0.88f, stargiftattributebackdrop.edge_color | (-16777216)));
            String strG0 = nh.k.G0(starGift.craft_chance_permille);
            TextView textView = this.d;
            textView.setText(strG0);
            textView.setBackground(new u4(AndroidUtilities.dp(10.0f), iB));
            this.f9169e.setBackground(new u4(AndroidUtilities.dp(10.0f), iB));
        }
        b(starGift != null, z10);
    }

    public final void b(final boolean z10, boolean z11) {
        FrameLayout frameLayout = this.f9167b;
        frameLayout.animate().cancel();
        TextView textView = this.d;
        textView.animate().cancel();
        FrameLayout frameLayout2 = this.f9169e;
        frameLayout2.animate().cancel();
        if (!z11) {
            frameLayout.setVisibility(z10 ? 0 : 8);
            frameLayout.setScaleX(z10 ? 1.0f : 0.6f);
            frameLayout.setScaleY(z10 ? 1.0f : 0.6f);
            frameLayout.setAlpha(z10 ? 1.0f : 0.0f);
            textView.setVisibility(z10 ? 0 : 8);
            textView.setAlpha(z10 ? 1.0f : 0.0f);
            frameLayout2.setVisibility(z10 ? 0 : 8);
            frameLayout2.setAlpha(z10 ? 1.0f : 0.0f);
            return;
        }
        frameLayout.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = frameLayout.animate().scaleX(z10 ? 1.0f : 0.6f).scaleY(z10 ? 1.0f : 0.6f).alpha(z10 ? 1.0f : 0.0f);
        er erVar = er.h;
        final int i10 = 0;
        viewPropertyAnimatorAlpha.setInterpolator(erVar).setDuration(420L).withEndAction(new Runnable(this) {

            public final e4 f9123b;

            {
                this.f9123b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        boolean z12 = z10;
                        e4 e4Var = this.f9123b;
                        if (!z12) {
                            e4Var.f9169e.setVisibility(8);
                        } else {
                            e4Var.getClass();
                        }
                        break;
                    case 1:
                        boolean z13 = z10;
                        e4 e4Var2 = this.f9123b;
                        if (!z13) {
                            e4Var2.f9169e.setVisibility(8);
                        } else {
                            e4Var2.getClass();
                        }
                        break;
                    default:
                        boolean z14 = z10;
                        e4 e4Var3 = this.f9123b;
                        if (!z14) {
                            e4Var3.f9169e.setVisibility(8);
                        } else {
                            e4Var3.getClass();
                        }
                        break;
                }
            }
        }).start();
        textView.setVisibility(0);
        final int i11 = 1;
        textView.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(erVar).setDuration(420L).withEndAction(new Runnable(this) {

            public final e4 f9123b;

            {
                this.f9123b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        boolean z12 = z10;
                        e4 e4Var = this.f9123b;
                        if (!z12) {
                            e4Var.f9169e.setVisibility(8);
                        } else {
                            e4Var.getClass();
                        }
                        break;
                    case 1:
                        boolean z13 = z10;
                        e4 e4Var2 = this.f9123b;
                        if (!z13) {
                            e4Var2.f9169e.setVisibility(8);
                        } else {
                            e4Var2.getClass();
                        }
                        break;
                    default:
                        boolean z14 = z10;
                        e4 e4Var3 = this.f9123b;
                        if (!z14) {
                            e4Var3.f9169e.setVisibility(8);
                        } else {
                            e4Var3.getClass();
                        }
                        break;
                }
            }
        }).start();
        frameLayout2.setVisibility(0);
        final int i12 = 2;
        frameLayout2.animate().alpha(z10 ? 1.0f : 0.0f).setInterpolator(erVar).setDuration(420L).withEndAction(new Runnable(this) {

            public final e4 f9123b;

            {
                this.f9123b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        boolean z12 = z10;
                        e4 e4Var = this.f9123b;
                        if (!z12) {
                            e4Var.f9169e.setVisibility(8);
                        } else {
                            e4Var.getClass();
                        }
                        break;
                    case 1:
                        boolean z13 = z10;
                        e4 e4Var2 = this.f9123b;
                        if (!z13) {
                            e4Var2.f9169e.setVisibility(8);
                        } else {
                            e4Var2.getClass();
                        }
                        break;
                    default:
                        boolean z14 = z10;
                        e4 e4Var3 = this.f9123b;
                        if (!z14) {
                            e4Var3.f9169e.setVisibility(8);
                        } else {
                            e4Var3.getClass();
                        }
                        break;
                }
            }
        }).start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
    }
}
