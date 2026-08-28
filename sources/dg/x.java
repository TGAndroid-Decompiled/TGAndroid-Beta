package dg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wz0;
public final class x extends FrameLayout {
    public final dh.u f4560a;
    public final FrameLayout f4561b;
    public String f4562c;
    public String d;
    public final ImageView f4563e;

    public x(Context context, b6 b6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4561b = frameLayout;
        dh.u uVar = new dh.u(context);
        this.f4560a = uVar;
        uVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        uVar.setTextSize(1, 16.0f);
        uVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        uVar.setSingleLine(true);
        uVar.setTextColor(f6.v0(f6.G6, b6Var));
        uVar.f4671f = false;
        frameLayout.addView(uVar, e6.e(-2, -2, 17));
        int dp = AndroidUtilities.dp(8.0f);
        int v02 = f6.v0(f6.f23020e7, b6Var);
        int i9 = f6.f23092i6;
        int k10 = i0.a.k(f6.v0(i9, b6Var), 76);
        frameLayout.setBackground(f6.i0(dp, dp, dp, dp, v02, k10, k10));
        addView(frameLayout, e6.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final x f4557b;

            {
                this.f4557b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f4557b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f4557b.d);
                        return;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f4563e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(f6.v0(f6.f23108j5, b6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int dp2 = AndroidUtilities.dp(20.0f);
        int k11 = i0.a.k(f6.v0(i9, b6Var), 76);
        imageView.setBackground(f6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        addView(imageView, e6.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x f4557b;

            {
                this.f4557b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f4557b.d);
                        return;
                    default:
                        AndroidUtilities.addToClipboard(this.f4557b.d);
                        return;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f4563e.setVisibility(4);
        int dp = AndroidUtilities.dp(18.0f);
        int dp2 = AndroidUtilities.dp(14.0f);
        int dp3 = AndroidUtilities.dp(14.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        dh.u uVar = this.f4560a;
        uVar.setPadding(dp, dp2, dp3, dp4);
        ?? obj = new Object();
        obj.f34062a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f4562c);
        if (this.f4562c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new wz0(obj, 0), 0, spannableStringBuilder.length(), 33);
        uVar.setText(spannableStringBuilder);
        this.f4561b.setOnClickListener(new w(0, runnable));
    }

    public void setSlug(String str) {
        this.f4562c = str;
        this.d = ta.b.d("https://t.me/giftcode/", str);
        this.f4560a.setText("t.me/giftcode/" + str);
    }
}
