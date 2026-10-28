package jg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import fi.v3;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
public final class d2 extends LinearLayout implements p6 {
    public final TextView f15675a;
    public final md f15676b;
    public final md f15677c;
    public final u6 d;

    public d2(Activity activity, int i10, long j10, String str, u6 u6Var) {
        super(activity);
        String str2;
        setOrientation(1);
        this.d = u6Var;
        TextView textView = new TextView(activity);
        this.f15675a = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextAlignment(4);
        textView.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
        textView.setGravity(17);
        md mdVar = new md(activity, 4);
        this.f15676b = mdVar;
        mdVar.setTextAlignment(4);
        mdVar.setGravity(17);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        mdVar.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        mdVar.setMaxWidth(AndroidUtilities.dp(160.0f));
        int i11 = 22;
        if (i10 == 9) {
            imageView.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.WelcomeMessageEmptyTitle));
            mdVar.setText(LocaleController.getString(R.string.WelcomeMessageEmptySubtitle));
            mdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), v3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(R.drawable.large_greeting);
            textView.setText(LocaleController.getString(R.string.BusinessGreetingIntroTitle));
            mdVar.setText(LocaleController.getString(R.string.BusinessGreetingIntro));
            mdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), v3.a(mdVar.getText(), mdVar.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(R.drawable.large_away);
            textView.setText(LocaleController.getString(R.string.BusinessAwayIntroTitle));
            mdVar.setText(LocaleController.getString(R.string.BusinessAwayIntro));
            mdVar.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), v3.a(mdVar.getText(), mdVar.getPaint())));
        } else {
            if (i10 == 5) {
                imageView.setImageResource(R.drawable.large_quickreplies);
                b2 c10 = c2.f(UserConfig.selectedAccount).c(j10);
                if (c10 == null) {
                    str2 = str;
                } else {
                    str2 = c10.f15640b;
                }
                textView.setText(LocaleController.getString(R.string.BusinessRepliesIntroTitle));
                mdVar.setMaxWidth(AndroidUtilities.dp(208.0f));
                mdVar.setTextAlignment(2);
                mdVar.setGravity(3);
                mdVar.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessRepliesIntro1, str2)));
                mdVar.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                md mdVar2 = new md(activity, 4);
                this.f15677c = mdVar2;
                mdVar2.setMaxWidth(AndroidUtilities.dp(208.0f));
                mdVar2.setTextAlignment(2);
                mdVar2.setGravity(3);
                mdVar2.setTextSize(1, 13.0f);
                mdVar2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessRepliesIntro2)));
                mdVar2.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
            }
            i11 = 12;
        }
        int i12 = i11;
        addView(imageView, kb1.x(78, 78, 49, 20, 17, 20, 9));
        addView(textView, kb1.x(-2, -2, 49, 20, 0, 20, 6));
        addView(mdVar, kb1.x(-2, -2, 49, i12, 0, i12, this.f15677c == null ? 19 : 9));
        View view = this.f15677c;
        if (view != null) {
            addView(view, kb1.x(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void updateColors() {
        md mdVar;
        TextView textView = this.f15675a;
        if (textView != null && (mdVar = this.f15676b) != null) {
            int i10 = y6.f23454ic;
            u6 u6Var = this.d;
            textView.setTextColor(y6.w0(i10, u6Var));
            mdVar.setTextColor(y6.w0(i10, u6Var));
            md mdVar2 = this.f15677c;
            if (mdVar2 != null) {
                mdVar2.setTextColor(y6.w0(i10, u6Var));
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
