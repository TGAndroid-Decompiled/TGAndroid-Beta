package di;

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
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.w9;
import w7.a6;
import w7.c6;
public final class p extends FrameLayout {
    public static final int f6835n = 0;
    public final f6 f6836a;
    public final w9 f6837b;
    public final ImageView f6838c;
    public final TextView d;
    public final TextView e;
    public final TextView f6839f;
    public final m90 h;

    public p(Activity activity, f6 f6Var) {
        super(activity);
        this.f6836a = f6Var;
        LinearLayout f7 = org.telegram.messenger.a2.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        c6.b(f7, 0.025f, 1.4f);
        addView(f7, a6.e(-1, -1, 119));
        int i10 = j6.Oh;
        setBackground(j6.Y(j6.l1(0.1f, j6.v0(i10, f6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, a6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, a6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.G6;
        textView.setTextColor(j6.v0(i11, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, a6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f6839f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(j6.v0(i10, f6Var));
        c6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(j6.b0(AndroidUtilities.dp(9.0f), j6.l1(0.1f, j6.v0(i10, f6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, a6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(j6.v0(i11, f6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, a6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        m90 m90Var = new m90(activity, null);
        this.h = m90Var;
        m90Var.setTextSize(1, 13.0f);
        m90Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        m90Var.setTextColor(j6.v0(i11, f6Var));
        linearLayout.addView(m90Var, a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(m90Var);
        w9 w9Var = new w9(activity);
        this.f6837b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        f7.addView(w9Var, a6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f6838c = imageView;
        imageView.setBackground(j6.f0(5, j6.l1(0.2f, j6.v0(j6.W5, f6Var)), -1));
        c6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.f17936de, f6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new bi.d5(2));
        imageView.setVisibility(8);
        f7.addView(imageView, a6.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.eo r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.sf r26, org.telegram.ui.sf r27) {
        throw new UnsupportedOperationException("Method not decompiled: di.p.a(org.telegram.ui.eo, org.telegram.messenger.MessageObject, org.telegram.ui.sf, org.telegram.ui.sf):void");
    }
}
