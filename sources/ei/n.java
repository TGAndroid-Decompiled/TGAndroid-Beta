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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.y9;
import w7.w5;
import w7.y5;
public final class n extends FrameLayout {
    public static final int f9223n = 0;
    public final c6 f9224a;
    public final y9 f9225b;
    public final ImageView f9226c;
    public final TextView d;
    public final TextView f9227e;
    public final TextView f9228f;
    public final ia0 h;

    public n(Activity activity, c6 c6Var) {
        super(activity);
        this.f9224a = c6Var;
        LinearLayout f7 = org.telegram.messenger.v0.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        y5.b(f7, 0.025f, 1.4f);
        addView(f7, w5.e(-1, -1, 119));
        int i10 = h6.Oh;
        setBackground(h6.Z(h6.m1(0.1f, h6.w0(i10, c6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, w5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = h6.G6;
        textView.setTextColor(h6.w0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, w5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f9228f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(h6.w0(i10, c6Var));
        y5.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(h6.c0(AndroidUtilities.dp(9.0f), h6.m1(0.1f, h6.w0(i10, c6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, w5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f9227e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.w0(i11, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, w5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        ia0 ia0Var = new ia0(activity, null);
        this.h = ia0Var;
        ia0Var.setTextSize(1, 13.0f);
        ia0Var.setLinkTextColor(h6.w0(h6.gc, c6Var));
        ia0Var.setTextColor(h6.w0(i11, c6Var));
        linearLayout.addView(ia0Var, w5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(ia0Var);
        y9 y9Var = new y9(activity);
        this.f9225b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        y9Var.setVisibility(8);
        f7.addView(y9Var, w5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f9226c = imageView;
        imageView.setBackground(h6.g0(5, h6.m1(0.2f, h6.w0(h6.W5, c6Var)), -1));
        y5.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f20567de, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ai.e2(3));
        imageView.setVisibility(8);
        f7.addView(imageView, w5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.eo r25, final org.telegram.messenger.MessageObject r26, org.telegram.ui.vf r27, org.telegram.ui.vf r28) {
        throw new UnsupportedOperationException("Method not decompiled: ei.n.a(org.telegram.ui.eo, org.telegram.messenger.MessageObject, org.telegram.ui.vf, org.telegram.ui.vf):void");
    }
}
