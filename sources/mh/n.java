package mh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import g7.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o9;
public final class n extends FrameLayout {
    public static final int f17987n = 0;
    public final b6 f17988a;
    public final o9 f17989b;
    public final ImageView f17990c;
    public final TextView d;
    public final TextView f17991e;
    public final TextView f17992f;
    public final l80 h;

    public n(Activity activity, b6 b6Var) {
        super(activity);
        this.f17988a = b6Var;
        LinearLayout f10 = org.telegram.messenger.l0.f(activity, 0);
        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        g6.b(f10, 0.025f, 1.4f);
        addView(f10, e6.e(-1, -1, 119));
        int i9 = f6.Oh;
        setBackground(f6.Y(f6.l1(0.1f, f6.v0(i9, b6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f10.addView(linearLayout, e6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, e6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = f6.G6;
        textView.setTextColor(f6.v0(i10, b6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, e6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f17992f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(f6.v0(i9, b6Var));
        g6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(f6.b0(AndroidUtilities.dp(9.0f), f6.l1(0.1f, f6.v0(i9, b6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, e6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f17991e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(f6.v0(i10, b6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, e6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        l80 l80Var = new l80(activity, null);
        this.h = l80Var;
        l80Var.setTextSize(1, 13.0f);
        l80Var.setLinkTextColor(f6.v0(f6.f23061gc, b6Var));
        l80Var.setTextColor(f6.v0(i10, b6Var));
        linearLayout.addView(l80Var, e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(l80Var);
        o9 o9Var = new o9(activity);
        this.f17989b = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        o9Var.setVisibility(8);
        f10.addView(o9Var, e6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f17990c = imageView;
        imageView.setBackground(f6.f0(5, f6.l1(0.2f, f6.v0(f6.W5, b6Var)), -1));
        g6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.f23008de, b6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new fh.n(8));
        imageView.setVisibility(8);
        f10.addView(imageView, e6.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.qn r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.gf r26, org.telegram.ui.gf r27) {
        throw new UnsupportedOperationException("Method not decompiled: mh.n.a(org.telegram.ui.qn, org.telegram.messenger.MessageObject, org.telegram.ui.gf, org.telegram.ui.gf):void");
    }
}
