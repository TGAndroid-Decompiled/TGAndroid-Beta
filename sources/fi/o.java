package fi;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.x9;
import w7.x5;
import w7.z5;
public final class o extends FrameLayout {
    public static final int f9846n = 0;
    public final f6 f9847a;
    public final x9 f9848b;
    public final ImageView f9849c;
    public final TextView d;
    public final TextView f9850e;
    public final TextView f9851f;
    public final d90 h;

    public o(Activity activity, f6 f6Var) {
        super(activity);
        this.f9847a = f6Var;
        LinearLayout f7 = org.telegram.messenger.w1.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        z5.b(f7, 0.025f, 1.4f);
        addView(f7, x5.e(-1, -1, 119));
        int i10 = j6.Oh;
        setBackground(j6.Y(j6.l1(0.1f, j6.v0(i10, f6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, x5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, x5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, x5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f9851f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(j6.v0(i10, f6Var));
        z5.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(j6.b0(AndroidUtilities.dp(9.0f), j6.l1(0.1f, j6.v0(i10, f6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, x5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f9850e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.v0(i11, f6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, x5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        d90 d90Var = new d90(activity, null);
        this.h = d90Var;
        d90Var.setTextSize(1, 13.0f);
        d90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        d90Var.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(d90Var, x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(d90Var);
        x9 x9Var = new x9(activity);
        this.f9848b = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        x9Var.setVisibility(8);
        f7.addView(x9Var, x5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f9849c = imageView;
        imageView.setBackground(j6.f0(5, j6.l1(0.2f, j6.v0(j6.W5, f6Var)), -1));
        z5.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f20671de, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ah.f(4));
        imageView.setVisibility(8);
        f7.addView(imageView, x5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.co r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.qf r26, org.telegram.ui.qf r27) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o.a(org.telegram.ui.co, org.telegram.messenger.MessageObject, org.telegram.ui.qf, org.telegram.ui.qf):void");
    }
}
