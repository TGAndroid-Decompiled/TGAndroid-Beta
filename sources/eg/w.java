package eg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.yz0;

public final class w extends FrameLayout {

    public final eh.s f5451a;

    public final FrameLayout f5452b;

    public String f5453c;
    public String d;

    public final ImageView f5454e;

    public w(Context context, c6 c6Var) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5452b = frameLayout;
        eh.s sVar = new eh.s(context);
        this.f5451a = sVar;
        sVar.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(13.0f));
        sVar.setTextSize(1, 16.0f);
        sVar.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        sVar.setSingleLine(true);
        sVar.setTextColor(g6.v0(g6.G6, c6Var));
        sVar.f5567f = false;
        frameLayout.addView(sVar, z5.e(-2, -2, 17));
        int iDp = AndroidUtilities.dp(8.0f);
        int iV0 = g6.v0(g6.f23073e7, c6Var);
        int i10 = g6.f23144i6;
        int iK = i0.b.k(g6.v0(i10, c6Var), 76);
        frameLayout.setBackground(g6.i0(iDp, iDp, iDp, iDp, iV0, iK, iK));
        addView(frameLayout, z5.d(-1, -2.0f, 0, 14.0f, 0.0f, 14.0f, 0.0f));
        final int i11 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) {

            public final w f5448b;

            {
                this.f5448b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f5448b.d);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.f5448b.d);
                        break;
                }
            }
        });
        ImageView imageView = new ImageView(getContext());
        this.f5454e = imageView;
        imageView.setImageResource(R.drawable.menu_copy_s);
        imageView.setColorFilter(g6.v0(g6.f23161j5, c6Var));
        imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        int iDp2 = AndroidUtilities.dp(20.0f);
        int iK2 = i0.b.k(g6.v0(i10, c6Var), 76);
        imageView.setBackground(g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK2, iK2));
        addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 17.0f, 0.0f));
        final int i12 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final w f5448b;

            {
                this.f5448b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        AndroidUtilities.addToClipboard(this.f5448b.d);
                        break;
                    default:
                        AndroidUtilities.addToClipboard(this.f5448b.d);
                        break;
                }
            }
        });
    }

    public final void a(Runnable runnable) {
        this.f5454e.setVisibility(4);
        int iDp = AndroidUtilities.dp(18.0f);
        int iDp2 = AndroidUtilities.dp(14.0f);
        int iDp3 = AndroidUtilities.dp(14.0f);
        int iDp4 = AndroidUtilities.dp(18.0f);
        eh.s sVar = this.f5451a;
        sVar.setPadding(iDp, iDp2, iDp3, iDp4);
        xz0 xz0Var = new xz0();
        xz0Var.f34734a |= 256;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("t.me/giftcode/" + this.f5453c);
        if (this.f5453c == null) {
            spannableStringBuilder.append((CharSequence) "1234567891011123654897566536223");
        }
        spannableStringBuilder.setSpan(new yz0(xz0Var, 0), 0, spannableStringBuilder.length(), 33);
        sVar.setText(spannableStringBuilder);
        this.f5452b.setOnClickListener(new v(0, runnable));
    }

    public void setSlug(String str) {
        this.f5453c = str;
        this.d = s3.c.e("https://t.me/giftcode/", str);
        this.f5451a.setText("t.me/giftcode/" + str);
    }
}
