package ig;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.t01;
import vh.v2;
public final class v extends FrameLayout {
    public final ih.s f7548a;
    public final FrameLayout f7549b;
    public String f7550c;
    public String d;
    public final ImageView e;

    public v(Context context, f6 f6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7549b = frameLayout;
        ih.s sVar = new ih.s(context);
        this.f7548a = sVar;
        sVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        sVar.setTextSize(1, 16.0f);
        sVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        sVar.setSingleLine(true);
        sVar.setTextColor(j6.v0(j6.G6, f6Var));
        sVar.f7656f = false;
        frameLayout.addView(sVar, b6.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = j6.v0(j6.f19924e7, f6Var);
        int i10 = j6.f19996i6;
        int k10 = i0.a.k(j6.v0(i10, f6Var), 76);
        frameLayout.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, b6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final v f7545b;

            {
                this.f7545b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f7545b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f7545b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(j6.v0(j6.f20012j5, f6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(j6.v0(i10, f6Var), 76);
        imageView.setBackground(j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, b6.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final v f7545b;

            {
                this.f7545b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f7545b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f7545b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        ih.s sVar = this.f7548a;
        sVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f28583a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f7550c);
        if (this.f7550c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new t01(obj, 0), 0, spannableStringBuilder.length(), 33);
        sVar.setText(spannableStringBuilder);
        this.f7549b.setOnClickListener(new u(0, runnable));
    }

    public void setSlug(String str) {
        this.f7550c = str;
        this.d = v2.e("https://t.me/giftcode/", str);
        this.f7548a.setText("t.me/giftcode/" + str);
    }
}
