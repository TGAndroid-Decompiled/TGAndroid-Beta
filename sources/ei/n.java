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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.w9;
import w7.a6;
import w7.y5;
public final class n extends FrameLayout {
    public static final int f8477n = 0;
    public final d6 f8478a;
    public final w9 f8479b;
    public final ImageView f8480c;
    public final TextView d;
    public final TextView e;
    public final TextView f8481f;
    public final n90 h;

    public n(Activity activity, d6 d6Var) {
        super(activity);
        this.f8478a = d6Var;
        LinearLayout e = org.telegram.messenger.f0.e(activity, 0);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        a6.b(e, 0.025f, 1.4f);
        addView(e, y5.e(-1, -1, 119));
        int i10 = h6.Oh;
        setBackground(h6.Y(h6.l1(0.1f, h6.v0(i10, d6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        e.addView(linearLayout, y5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, y5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = h6.G6;
        textView.setTextColor(h6.v0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, y5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f8481f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(h6.v0(i10, d6Var));
        a6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(h6.b0(AndroidUtilities.dp(9.0f), h6.l1(0.1f, h6.v0(i10, d6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, y5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.v0(i11, d6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, y5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        n90 n90Var = new n90(activity, null);
        this.h = n90Var;
        n90Var.setTextSize(1, 13.0f);
        n90Var.setLinkTextColor(h6.v0(h6.gc, d6Var));
        n90Var.setTextColor(h6.v0(i11, d6Var));
        linearLayout.addView(n90Var, y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(n90Var);
        w9 w9Var = new w9(activity);
        this.f8479b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        e.addView(w9Var, y5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f8480c = imageView;
        imageView.setBackground(h6.f0(5, h6.l1(0.2f, h6.v0(h6.W5, d6Var)), -1));
        a6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.v0(h6.f19067de, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ai.e2(3));
        imageView.setVisibility(8);
        e.addView(imageView, y5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.wn r24, final org.telegram.messenger.MessageObject r25, org.telegram.ui.of r26, org.telegram.ui.of r27) {
        throw new UnsupportedOperationException("Method not decompiled: ei.n.a(org.telegram.ui.wn, org.telegram.messenger.MessageObject, org.telegram.ui.of, org.telegram.ui.of):void");
    }
}
