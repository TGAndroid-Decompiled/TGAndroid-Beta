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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.w9;
import w7.b6;
import w7.z5;
public final class o extends FrameLayout {
    public static final int f9224n = 0;
    public final d6 f9225a;
    public final w9 f9226b;
    public final ImageView f9227c;
    public final TextView d;
    public final TextView f9228e;
    public final TextView f9229f;
    public final q90 h;

    public o(Activity activity, d6 d6Var) {
        super(activity);
        this.f9225a = d6Var;
        LinearLayout e7 = org.telegram.messenger.q.e(activity, 0);
        e7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        b6.b(e7, 0.025f, 1.4f);
        addView(e7, z5.e(-1, -1, 119));
        int i10 = i6.Oh;
        setBackground(i6.Y(i6.l1(0.1f, i6.v0(i10, d6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        e7.addView(linearLayout, z5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, z5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = i6.G6;
        textView.setTextColor(i6.v0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, z5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f9229f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(i6.v0(i10, d6Var));
        b6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(i6.b0(AndroidUtilities.dp(9.0f), i6.l1(0.1f, i6.v0(i10, d6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, z5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.f9228e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(i6.v0(i11, d6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        q90 q90Var = new q90(activity, null);
        this.h = q90Var;
        q90Var.setTextSize(1, 13.0f);
        q90Var.setLinkTextColor(i6.v0(i6.gc, d6Var));
        q90Var.setTextColor(i6.v0(i11, d6Var));
        linearLayout.addView(q90Var, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(q90Var);
        w9 w9Var = new w9(activity);
        this.f9226b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        e7.addView(w9Var, z5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f9227c = imageView;
        imageView.setBackground(i6.f0(5, i6.l1(0.2f, i6.v0(i6.W5, d6Var)), -1));
        b6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f20835de, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ai.e2(3));
        imageView.setVisibility(8);
        e7.addView(imageView, z5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.yn r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.yf r26, org.telegram.ui.yf r27) {
        throw new UnsupportedOperationException("Method not decompiled: ei.o.a(org.telegram.ui.yn, org.telegram.messenger.MessageObject, org.telegram.ui.yf, org.telegram.ui.yf):void");
    }
}
