package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zq;
public final class h0 extends lm0 {
    public ArrayList f13005c;
    public ArrayList d;
    public ArrayList e;

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f13005c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i10);
            for (int i11 = 0; i11 < botInfo.commands.size(); i11++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i11);
                if (botCommand != null && botCommand.command != null) {
                    arrayList.add("/" + botCommand.command);
                    arrayList2.add(botCommand.description);
                    arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                }
            }
        }
        l();
    }

    @Override
    public final int h() {
        return this.f13005c.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        g0 g0Var = (g0) e1Var.f47735a;
        String str = (String) this.f13005c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            zq zqVar = new zq(R.drawable.mini_ephemeral_hidden_14, 0);
            zqVar.setColorKey(y6.A6);
            zqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(zqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            g0Var.f12987a.setText(spannableStringBuilder);
        } else {
            g0Var.f12987a.setText(str);
        }
        g0Var.f12988b.setText((CharSequence) this.d.get(i10));
        g0Var.f12989c = str;
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        md mdVar = new md(context, 3);
        linearLayout.f12988b = mdVar;
        NotificationCenter.listenEmojiLoading(mdVar);
        mdVar.setTextSize(1, 16.0f);
        int i11 = y6.G6;
        f7.V(mdVar, i11, null);
        mdVar.setTag(Integer.valueOf(i11));
        mdVar.setMaxLines(2);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(mdVar, gb1.t(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f12987a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = y6.f23746y6;
        f7.V(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        linearLayout.addView(textView, gb1.s(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new s4.q0(-1, -2));
        return new s4.e1(linearLayout);
    }
}
