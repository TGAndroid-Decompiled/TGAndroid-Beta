package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import di.tb;
import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.tj0;
public final class z extends tj0 {
    public ArrayList f18721c;
    public ArrayList d;
    public ArrayList f18722e;

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f18721c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f18722e;
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
        return this.f18721c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        y yVar = (y) e1Var.f58535a;
        String str = (String) this.f18721c.get(i7);
        if (((Boolean) this.f18722e.get(i7)).booleanValue()) {
            eq eqVar = new eq(2131231942, 0);
            eqVar.a(j6.A6);
            eqVar.f34413n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            yVar.f18702a.setText(spannableStringBuilder);
        } else {
            yVar.f18702a.setText(str);
        }
        yVar.f18703b.setText((CharSequence) this.d.get(i7));
        yVar.f18704c = str;
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        tb tbVar = new tb(context, 4);
        linearLayout.f18703b = tbVar;
        ns.i(tbVar);
        tbVar.setTextSize(1, 16.0f);
        int i10 = j6.G6;
        q6.U(tbVar, i10, null);
        tbVar.setTag(Integer.valueOf(i10));
        tbVar.setMaxLines(2);
        tbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(tbVar, ja.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f18702a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = j6.f29241y6;
        q6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        linearLayout.addView(textView, ja.p(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(linearLayout);
    }
}
