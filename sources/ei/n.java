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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.u9;
import w7.x5;
import w7.z5;
public final class n extends FrameLayout {
    public static final int f8492n = 0;
    public final e6 f8493a;
    public final u9 f8494b;
    public final ImageView f8495c;
    public final TextView d;
    public final TextView e;
    public final TextView f8496f;
    public final c90 h;

    public n(Activity activity, e6 e6Var) {
        super(activity);
        this.f8493a = e6Var;
        LinearLayout f7 = org.telegram.messenger.y0.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        z5.b(f7, 0.025f, 1.4f);
        addView(f7, x5.e(-1, -1, 119));
        int i10 = i6.Oh;
        setBackground(i6.Y(i6.l1(0.1f, i6.v0(i10, e6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, x5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, x5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = i6.G6;
        textView.setTextColor(i6.v0(i11, e6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, x5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f8496f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(i6.v0(i10, e6Var));
        z5.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(i6.b0(AndroidUtilities.dp(9.0f), i6.l1(0.1f, i6.v0(i10, e6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, x5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(i6.v0(i11, e6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, x5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        c90 c90Var = new c90(activity, null);
        this.h = c90Var;
        c90Var.setTextSize(1, 13.0f);
        c90Var.setLinkTextColor(i6.v0(i6.gc, e6Var));
        c90Var.setTextColor(i6.v0(i11, e6Var));
        linearLayout.addView(c90Var, x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(c90Var);
        u9 u9Var = new u9(activity);
        this.f8494b = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        u9Var.setVisibility(8);
        f7.addView(u9Var, x5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f8495c = imageView;
        imageView.setBackground(i6.f0(5, i6.l1(0.2f, i6.v0(i6.W5, e6Var)), -1));
        z5.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(i6.v0(i6.f18842de, e6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ai.e2(3));
        imageView.setVisibility(8);
        f7.addView(imageView, x5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.bo r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.qf r26, org.telegram.ui.qf r27) {
        throw new UnsupportedOperationException("Method not decompiled: ei.n.a(org.telegram.ui.bo, org.telegram.messenger.MessageObject, org.telegram.ui.qf, org.telegram.ui.qf):void");
    }
}
