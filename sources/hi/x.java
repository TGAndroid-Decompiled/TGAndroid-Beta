package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.md;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.wp;
public final class x extends oj0 {
    public ArrayList f15023c;
    public ArrayList d;
    public ArrayList f15024e;

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f15023c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f15024e;
        arrayList3.clear();
        for (int i7 = 0; i7 < hVar.m(); i7++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i7);
            for (int i10 = 0; i10 < botInfo.commands.size(); i10++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i10);
                if (botCommand != null && botCommand.command != null) {
                    arrayList.add("/" + botCommand.command);
                    arrayList2.add(botCommand.description);
                    arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                }
            }
        }
        f();
    }

    @Override
    public final int b() {
        return this.f15023c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        w wVar = (w) d1Var.f56927a;
        String str = (String) this.f15023c.get(i7);
        if (((Boolean) this.f15024e.get(i7)).booleanValue()) {
            wp wpVar = new wp(2131231942, 0);
            wpVar.a(k6.A6);
            wpVar.f40054n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            wVar.f15007a.setText(spannableStringBuilder);
        } else {
            wVar.f15007a.setText(str);
        }
        wVar.f15008b.setText((CharSequence) this.d.get(i7));
        wVar.f15009c = str;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        md mdVar = new md(context, 3);
        linearLayout.f15008b = mdVar;
        qs.i(mdVar);
        mdVar.setTextSize(1, 16.0f);
        int i10 = k6.G6;
        r6.V(mdVar, i10, null);
        mdVar.setTag(Integer.valueOf(i10));
        mdVar.setMaxLines(2);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(mdVar, ha.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f15007a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = k6.f28240y6;
        r6.V(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        linearLayout.addView(textView, ha.p(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(linearLayout);
    }
}
