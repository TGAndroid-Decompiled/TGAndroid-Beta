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
import w7.b6;
import w7.z5;
public final class n extends FrameLayout {
    public static final int f9423n = 0;
    public final c6 f9424a;
    public final z9 f9425b;
    public final ImageView f9426c;
    public final TextView d;
    public final TextView e;
    public final TextView f9427f;
    public final da0 h;

    public n(Activity activity, c6 c6Var) {
        super(activity);
        this.f9424a = c6Var;
        LinearLayout e = org.telegram.messenger.g0.e(activity, 0);
        e.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(5.0f));
        b6.b(e, 0.025f, 1.4f);
        addView(e, z5.e(-1, -1, 119));
        int i10 = g6.Oh;
        setBackground(g6.Z(g6.m1(0.1f, g6.w0(i10, c6Var)), 0, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        e.addView(linearLayout, z5.o(-1, -2, 1.0f, 3));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, z5.p(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = g6.G6;
        textView.setTextColor(g6.w0(i11, c6Var));
        textView.setTypeface(AndroidUtilities.bold());
        linearLayout2.addView(textView, z5.o(-2, -2, 0.0f, 16));
        NotificationCenter.listenEmojiLoading(textView);
        TextView textView2 = new TextView(activity);
        this.f9427f = textView2;
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(g6.w0(i10, c6Var));
        b6.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        textView2.setBackground(g6.c0(AndroidUtilities.dp(9.0f), g6.m1(0.1f, g6.w0(i10, c6Var))));
        textView2.setText(LocaleController.getString(R.string.BotAdWhat));
        linearLayout2.addView(textView2, z5.p(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(g6.w0(i11, c6Var));
        textView3.setTypeface(AndroidUtilities.bold());
        linearLayout.addView(textView3, z5.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(textView3);
        da0 da0Var = new da0(activity, null);
        this.h = da0Var;
        da0Var.setTextSize(1, 13.0f);
        da0Var.setLinkTextColor(g6.w0(g6.f19660gc, c6Var));
        da0Var.setTextColor(g6.w0(i11, c6Var));
        linearLayout.addView(da0Var, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        NotificationCenter.listenEmojiLoading(da0Var);
        z9 z9Var = new z9(activity);
        this.f9425b = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z9Var.setVisibility(8);
        e.addView(z9Var, z5.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.f9426c = imageView;
        imageView.setBackground(g6.g0(5, g6.m1(0.2f, g6.w0(g6.W5, c6Var)), -1));
        b6.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(g6.w0(g6.f19607de, c6Var), PorterDuff.Mode.SRC_IN));
        imageView.setOnClickListener(new ah.f(4));
        imageView.setVisibility(8);
        e.addView(imageView, z5.t(32, 32, 53, 10, 3, 0, 2));
    }

    public final void a(final org.telegram.ui.fo r25, final org.telegram.messenger.MessageObject r26, org.telegram.ui.wf r27, org.telegram.ui.wf r28) {
        throw new UnsupportedOperationException("Method not decompiled: fi.n.a(org.telegram.ui.fo, org.telegram.messenger.MessageObject, org.telegram.ui.wf, org.telegram.ui.wf):void");
    }
}
