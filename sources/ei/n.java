package ei;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.w9;
import w7.a6;
import w7.y5;
public final class n extends FrameLayout {
    public static final int f8494n = 0;
    public final e6 f8495a;
    public final w9 f8496b;
    public final ImageView f8497c;
    public final TextView d;
    public final TextView e;
    public final TextView f8498f;
    public final l90 h;

    public n(Activity activity, e6 e6Var) {
        super(activity);
        this.f8495a = e6Var;
        LinearLayout f7 = org.telegram.messenger.q.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        a6.b(f7, 0.025f, 1.4f);
        addView(f7, y5.e(-1, -1, 119));
        int i10 = j6.Oh;
        setBackground(j6.Y(j6.l1(0.1f, j6.v0(i10, e6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, y5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, y5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, y5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f8498f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(j6.v0(i10, e6Var));
        a6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(j6.b0(AndroidUtilities.dp(9.0f), j6.l1(0.1f, j6.v0(i10, e6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, y5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.v0(i11, e6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, y5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        l90 l90Var = new l90(activity, null);
        this.h = l90Var;
        l90Var.setTextSize(1, 13.0f);
        l90Var.setLinkTextColor(j6.v0(j6.gc, e6Var));
        l90Var.setTextColor(j6.v0(i11, e6Var));
        linearLayout.addView(l90Var, y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(l90Var);
        w9 w9Var = new w9(activity);
        this.f8496b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        f7.addView(w9Var, y5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f8497c = imageView;
        imageView.setBackground(j6.f0(5, j6.l1(0.2f, j6.v0(j6.W5, e6Var)), -1));
        a6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f19070de, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ai.e2(3));
        imageView.setVisibility(8);
        f7.addView(imageView, y5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.zn r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.rf r26, org.telegram.ui.rf r27) {
        throw new UnsupportedOperationException("Method not decompiled: ei.n.a(org.telegram.ui.zn, org.telegram.messenger.MessageObject, org.telegram.ui.rf, org.telegram.ui.rf):void");
    }
}
