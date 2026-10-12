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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.z9;
import w7.a6;
public final class n extends FrameLayout {
    public static final int f9420n = 0;
    public final c6 f9421a;
    public final z9 f9422b;
    public final ImageView f9423c;
    public final TextView d;
    public final TextView e;
    public final TextView f9424f;
    public final da0 h;

    public n(Activity activity, c6 c6Var) {
        super(activity);
        this.f9421a = c6Var;
        LinearLayout f7 = org.telegram.messenger.q.f(activity, 0);
        f7.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        w7.c6.b(f7, 0.025f, 1.4f);
        addView(f7, a6.e(-1, -1, 119));
        int i10 = g6.Oh;
        setBackground(g6.Z(g6.m1(0.1f, g6.w0(i10, c6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        f7.addView(linearLayout, a6.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, a6.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = g6.G6;
        textView.setTextColor(g6.w0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, a6.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f9424f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(g6.w0(i10, c6Var));
        w7.c6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(g6.c0(AndroidUtilities.dp(9.0f), g6.m1(0.1f, g6.w0(i10, c6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, a6.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.w0(i11, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, a6.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        da0 da0Var = new da0(activity, null);
        this.h = da0Var;
        da0Var.setTextSize(1, 13.0f);
        da0Var.setLinkTextColor(g6.w0(g6.f19960gc, c6Var));
        da0Var.setTextColor(g6.w0(i11, c6Var));
        linearLayout.addView(da0Var, a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(da0Var);
        z9 z9Var = new z9(activity);
        this.f9422b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z9Var.setVisibility(8);
        f7.addView(z9Var, a6.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f9423c = imageView;
        imageView.setBackground(g6.g0(5, g6.m1(0.2f, g6.w0(g6.W5, c6Var)), -1));
        w7.c6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.f19907de, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ah.f(4));
        imageView.setVisibility(8);
        f7.addView(imageView, a6.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.fo r25, final org.telegram.messenger.MessageObject r26, org.telegram.ui.wf r27, org.telegram.ui.wf r28) {
        throw new UnsupportedOperationException("Method not decompiled: fi.n.a(org.telegram.ui.fo, org.telegram.messenger.MessageObject, org.telegram.ui.wf, org.telegram.ui.wf):void");
    }
}
