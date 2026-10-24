package gi;

import ai.wd;
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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.vq;
import w7.z5;
public final class a0 extends km0 {
    public ArrayList f11085c;
    public ArrayList d;
    public ArrayList e;

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f11085c;
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
        return this.f11085c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        z zVar = (z) b1Var.f46342a;
        String str = (String) this.f11085c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            vq vqVar = new vq(R.drawable.mini_ephemeral_hidden_14, 0);
            vqVar.setColorKey(k6.A6);
            vqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(vqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            zVar.f11598a.setText(spannableStringBuilder);
        } else {
            zVar.f11598a.setText(str);
        }
        zVar.f11599b.setText((CharSequence) this.d.get(i10));
        zVar.f11600c = str;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        wd wdVar = new wd(context, 3);
        linearLayout.f11599b = wdVar;
        NotificationCenter.listenEmojiLoading(wdVar);
        wdVar.setTextSize(1, 16.0f);
        int i11 = k6.G6;
        r6.W(wdVar, i11, null);
        wdVar.setTag(Integer.valueOf(i11));
        wdVar.setMaxLines(2);
        wdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(wdVar, z5.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f11598a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = k6.f21572y6;
        r6.W(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        linearLayout.addView(textView, z5.o(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(linearLayout);
    }
}
