package gi;

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
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x90;
import w7.b6;
import w7.z5;
public final class n extends FrameLayout {
    public static final int f11342n = 0;
    public final d6 f11343a;
    public final w9 f11344b;
    public final ImageView f11345c;
    public final TextView d;
    public final TextView e;
    public final TextView f11346f;
    public final x90 h;

    public n(Activity activity, d6 d6Var) {
        super(activity);
        this.f11343a = d6Var;
        LinearLayout e = org.telegram.messenger.g0.e(activity, 0);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        b6.b(e, 0.025f, 1.4f);
        addView(e, z5.e(-1, -1, 119));
        int i10 = h6.Oh;
        setBackground(h6.Z(h6.m1(0.1f, h6.w0(i10, d6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        e.addView(linearLayout, z5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, z5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = h6.G6;
        textView.setTextColor(h6.w0(i11, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, z5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f11346f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(h6.w0(i10, d6Var));
        b6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(h6.c0(AndroidUtilities.dp(9.0f), h6.m1(0.1f, h6.w0(i10, d6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, z5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(h6.w0(i11, d6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        x90 x90Var = new x90(activity, null);
        this.h = x90Var;
        x90Var.setTextSize(1, 13.0f);
        x90Var.setLinkTextColor(h6.w0(h6.f21045gc, d6Var));
        x90Var.setTextColor(h6.w0(i11, d6Var));
        linearLayout.addView(x90Var, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(x90Var);
        w9 w9Var = new w9(activity);
        this.f11344b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        e.addView(w9Var, z5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f11345c = imageView;
        imageView.setBackground(h6.g0(5, h6.m1(0.2f, h6.w0(h6.W5, d6Var)), -1));
        b6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(h6.w0(h6.f20992de, d6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ah.f(5));
        imageView.setVisibility(8);
        e.addView(imageView, z5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.sn r25, final org.telegram.messenger.MessageObject r26, org.telegram.ui.mf r27, org.telegram.ui.mf r28) {
        throw new UnsupportedOperationException("Method not decompiled: gi.n.a(org.telegram.ui.sn, org.telegram.messenger.MessageObject, org.telegram.ui.mf, org.telegram.ui.mf):void");
    }
}
