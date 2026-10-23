package ig;

import ai.wd;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.x3;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import w7.z5;
public final class a2 extends LinearLayout implements b6 {
    public final TextView f12853a;
    public final wd f12854b;
    public final wd f12855c;
    public final g6 d;

    public a2(Activity activity, int i10, long j10, String str, g6 g6Var) {
        super(activity);
        String str2;
        setOrientation(1);
        this.d = g6Var;
        TextView textView = new TextView(activity);
        this.f12853a = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        textView.setGravity(17);
        wd wdVar = new wd(activity, 4);
        this.f12854b = wdVar;
        wdVar.setTextAlignment(4);
        wdVar.setGravity(17);
        wdVar.setTextSize(1, 12.0f);
        wdVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        wdVar.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        wdVar.setMaxWidth(AndroidUtilities.dp(160.0f));
        int i11 = 22;
        if (i10 == 9) {
            imageView.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.WelcomeMessageEmptyTitle));
            wdVar.setText(LocaleController.getString(R.string.WelcomeMessageEmptySubtitle));
            wdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), x3.a(wdVar.getText(), wdVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.BusinessGreetingIntroTitle));
            wdVar.setText(LocaleController.getString(R.string.BusinessGreetingIntro));
            wdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), x3.a(wdVar.getText(), wdVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(R.drawable.large_away);
            textView.setText(LocaleController.getString(R.string.BusinessAwayIntroTitle));
            wdVar.setText(LocaleController.getString(R.string.BusinessAwayIntro));
            wdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), x3.a(wdVar.getText(), wdVar.getPaint())));
        } else {
            if (i10 == 5) {
                imageView.setImageResource(R.drawable.large_quickreplies);
                y1 c10 = z1.f(UserConfig.selectedAccount).c(j10);
                if (c10 == null) {
                    str2 = str;
                } else {
                    str2 = c10.f13130b;
                }
                textView.setText(LocaleController.getString(R.string.BusinessRepliesIntroTitle));
                wdVar.setMaxWidth(AndroidUtilities.dp(208.0f));
                wdVar.setTextAlignment(2);
                wdVar.setGravity(3);
                wdVar.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessRepliesIntro1, str2)));
                wdVar.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                wd wdVar2 = new wd(activity, 4);
                this.f12855c = wdVar2;
                wdVar2.setMaxWidth(AndroidUtilities.dp(208.0f));
                wdVar2.setTextAlignment(2);
                wdVar2.setGravity(3);
                wdVar2.setTextSize(1, 13.0f);
                wdVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessRepliesIntro2)));
                wdVar2.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
            }
            i11 = 12;
        }
        int i12 = i11;
        addView(imageView, z5.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, z5.t(-2, -2, 49, 20, 0, 20, 6));
        addView(wdVar, z5.t(-2, -2, 49, i12, 0, i12, this.f12855c == null ? 19 : 9));
        View view = this.f12855c;
        if (view != null) {
            addView(view, z5.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void updateColors() {
        wd wdVar;
        TextView textView = this.f12853a;
        if (textView != null && (wdVar = this.f12854b) != null) {
            int i10 = k6.f21277ic;
            g6 g6Var = this.d;
            textView.setTextColor(k6.w0(i10, g6Var));
            wdVar.setTextColor(k6.w0(i10, g6Var));
            wd wdVar2 = this.f12855c;
            if (wdVar2 != null) {
                wdVar2.setTextColor(k6.w0(i10, g6Var));
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
