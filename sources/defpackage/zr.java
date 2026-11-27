package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class zr extends FrameLayout implements fn7 {
    public final int a;
    public final p66 b;
    public final Runnable c;

    public zr(Context context, int i, vnb vnbVar, Runnable runnable, zg3 zg3Var) {
        super(context);
        int i2;
        this.a = i;
        this.c = runnable;
        lv2.r(i).B();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.e(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        int L = hl.L(80.0f);
        int i3 = aob.K7;
        ShapeDrawable K = aob.K(L, aob.v0(i3, vnbVar));
        uob M = yob.M(i3);
        imageView.setBackground(K);
        yob.j(imageView, K, M, null, vnbVar);
        imageView.setImageResource(2131231605);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (zg3Var != null) {
            i2 = 14;
        } else {
            i2 = 0;
        }
        linearLayout.addView(imageView, tre.t(80, 80, 49, 0, i2, 0, 14));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        yob.X(textView, aob.j5, vnbVar);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        textView.setText(ob6.M0(2131754160, null));
        linearLayout.addView(textView, tre.t(-1, -2, 1, 32, 0, 32, 9));
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, aob.z6, vnbVar);
        p66Var.setGravity(1);
        b();
        linearLayout.addView(p66Var, tre.t(-1, -2, 1, 32, 0, 32, 25));
        linearLayout.addView(a(2131232057, ob6.N0("ArchiveHintSection1"), ob6.N0("ArchiveHintSection1Info"), vnbVar), tre.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232058, ob6.N0("ArchiveHintSection2"), ob6.N0("ArchiveHintSection2Info"), vnbVar), tre.t(-1, -2, 7, 32, 0, 32, 16));
        linearLayout.addView(a(2131232060, ob6.N0("ArchiveHintSection3"), ob6.N0("ArchiveHintSection3Info"), vnbVar), tre.t(-1, -2, 7, 32, 0, 32, 16));
        if (zg3Var != null) {
            c51 i4 = xnb.i(24, vnbVar, context, true);
            i4.i(ob6.N0("GotIt"), false, true);
            i4.setOnClickListener(new k1(zg3Var, (byte) 9));
            linearLayout.addView(i4, tre.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
        }
    }

    public final FrameLayout a(int i, String str, String str2, vnb vnbVar) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        ImageView imageView = new ImageView(getContext());
        int i2 = aob.j5;
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.SRC_ATOP);
        imageView.setImageResource(i);
        frameLayout.addView(imageView, tre.d(24, 24.0f, 51, 0.0f, 8.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(getContext());
        yob.X(textView, i2, vnbVar);
        textView.setTypeface(hl.o());
        textView.setTextSize(0, hl.L(14.0f));
        textView.setText(str);
        linearLayout.addView(textView, tre.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(getContext());
        yob.X(textView2, aob.z6, vnbVar);
        textView2.setTextSize(0, hl.L(14.0f));
        textView2.setText(str2);
        linearLayout.addView(textView2, tre.k(0.0f, 2.6f, 0.0f, 0.0f, -1, -2));
        frameLayout.addView(linearLayout, tre.d(-1, -2.0f, 55, 41.0f, 0.0f, 0.0f, 0.0f));
        return frameLayout;
    }

    public final void b() {
        boolean z;
        String str;
        TLRPC.GlobalPrivacySettings globalPrivacySettings = lv2.r(this.a).Y;
        if (globalPrivacySettings != null) {
            z = globalPrivacySettings.keep_archived_unmuted;
        } else {
            z = true;
        }
        if (z) {
            str = "ArchiveHintSubtitle";
        } else {
            str = "ArchiveHintSubtitleUnmutedMove";
        }
        String N0 = ob6.N0(str);
        int i = aob.Xc;
        SpannableStringBuilder N2 = hl.N2(N0, i, 0, this.c, null);
        SpannableString spannableString = new SpannableString(">");
        Drawable mutate = getContext().getResources().getDrawable(2131232064).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        wm2 wm2Var = new wm2(0, mutate);
        wm2Var.a(i);
        wm2Var.c(hl.L(18.0f));
        wm2Var.F = hl.L(11.0f);
        wm2Var.r = -hl.L(5.0f);
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
        this.b.setText(hl.G2(N2, spannableString, ">"));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.k0) {
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.k0);
        b();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.k0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(hl.L(400.0f), View.MeasureSpec.getSize(i)), 1073741824), i2);
    }
}
