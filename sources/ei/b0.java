package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.oq;
import w7.x5;
public final class b0 extends kl0 {
    public ArrayList f8239c;
    public ArrayList d;
    public ArrayList e;

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final void E(a0.i iVar) {
        ArrayList arrayList = this.f8239c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i10 = 0; i10 < iVar.m(); i10++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(i10);
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
        return this.f8239c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        a0 a0Var = (a0) c1Var.f42671a;
        String str = (String) this.f8239c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            oq oqVar = new oq(R.drawable.mini_ephemeral_hidden_14, 0);
            oqVar.setColorKey(i6.A6);
            oqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(oqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            a0Var.f8211a.setText(spannableStringBuilder);
        } else {
            a0Var.f8211a.setText(str);
        }
        a0Var.f8212b.setText((CharSequence) this.d.get(i10));
        a0Var.f8213c = str;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        ai.p4 p4Var = new ai.p4(context, 2);
        linearLayout.f8212b = p4Var;
        NotificationCenter.listenEmojiLoading(p4Var);
        p4Var.setTextSize(1, 16.0f);
        int i11 = i6.G6;
        p4Var.setTextColor(i6.w0(null, i11, false));
        p4Var.setTag(Integer.valueOf(i11));
        p4Var.setMaxLines(2);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(p4Var, x5.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f8211a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = i6.f19215y6;
        textView.setTextColor(i6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        linearLayout.addView(textView, x5.o(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(linearLayout);
    }
}
