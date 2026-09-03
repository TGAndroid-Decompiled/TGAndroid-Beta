package jg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.t01;
import org.telegram.ui.yh;
public final class v extends FrameLayout {
    public final jh.s f10072a;
    public final FrameLayout f10073b;
    public String f10074c;
    public String d;
    public final ImageView f10075e;

    public v(Context context, g6 g6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10073b = frameLayout;
        jh.s sVar = new jh.s(context);
        this.f10072a = sVar;
        sVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        sVar.setTextSize(1, 16.0f);
        sVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        sVar.setSingleLine(true);
        sVar.setTextColor(k6.v0(k6.G6, g6Var));
        sVar.f10189f = false;
        frameLayout.addView(sVar, c6.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = k6.v0(k6.f21680e7, g6Var);
        int i10 = k6.f21752i6;
        int k10 = i0.a.k(k6.v0(i10, g6Var), 76);
        frameLayout.setBackground(k6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, c6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final v f10069b;

            {
                this.f10069b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f10069b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f10069b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f10075e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(k6.v0(k6.f21768j5, g6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(k6.v0(i10, g6Var), 76);
        imageView.setBackground(k6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, c6.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v f10069b;

            {
                this.f10069b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f10069b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f10069b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f10075e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        jh.s sVar = this.f10072a;
        sVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f30949a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f10074c);
        if (this.f10074c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new t01(obj, 0), 0, spannableStringBuilder.length(), 33);
        sVar.setText(spannableStringBuilder);
        this.f10073b.setOnClickListener(new u(0, runnable));
    }

    public void setSlug(String str) {
        this.f10074c = str;
        this.d = yh.k("https://t.me/giftcode/", str);
        this.f10072a.setText("t.me/giftcode/" + str);
    }
}
