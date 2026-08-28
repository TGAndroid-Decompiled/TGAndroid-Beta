package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.vk0;
public final class b0 extends vk0 {
    public ArrayList f17706c;
    public ArrayList d;
    public ArrayList f17707e;

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f17706c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f17707e;
        arrayList3.clear();
        for (int i9 = 0; i9 < hVar.m(); i9++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i9);
            for (int i10 = 0; i10 < botInfo.commands.size(); i10++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i10);
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
        return this.f17706c.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        a0 a0Var = (a0) q1Var.f5501a;
        String str = (String) this.f17706c.get(i9);
        if (((Boolean) this.f17707e.get(i9)).booleanValue()) {
            eq eqVar = new eq(R.drawable.mini_ephemeral_hidden_14, 0);
            eqVar.setColorKey(f6.A6);
            eqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            a0Var.f17690a.setText(spannableStringBuilder);
        } else {
            a0Var.f17690a.setText(str);
        }
        a0Var.f17691b.setText((CharSequence) this.d.get(i9));
        a0Var.f17692c = str;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        bg.t tVar = new bg.t(context, 4);
        linearLayout.f17691b = tVar;
        NotificationCenter.listenEmojiLoading(tVar);
        tVar.setTextSize(1, 16.0f);
        int i10 = f6.G6;
        tVar.setTextColor(f6.w0(null, i10, false));
        tVar.setTag(Integer.valueOf(i10));
        tVar.setMaxLines(2);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(tVar, e6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f17690a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = f6.f23369y6;
        textView.setTextColor(f6.w0(null, i11, false));
        textView.setTag(Integer.valueOf(i11));
        linearLayout.addView(textView, e6.o(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(linearLayout);
    }
}
