package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.xb;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.lq;
public final class y extends bk0 {
    public ArrayList f19056c;
    public ArrayList d;
    public ArrayList f19057e;

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f19056c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f19057e;
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
        return this.f19056c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        x xVar = (x) f1Var.f59122a;
        String str = (String) this.f19056c.get(i7);
        if (((Boolean) this.f19057e.get(i7)).booleanValue()) {
            lq lqVar = new lq(2131231943, 0);
            lqVar.a(n6.A6);
            lqVar.f37197n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            xVar.f19036a.setText(spannableStringBuilder);
        } else {
            xVar.f19036a.setText(str);
        }
        xVar.f19037b.setText((CharSequence) this.d.get(i7));
        xVar.f19038c = str;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        xb xbVar = new xb(context, 4);
        linearLayout.f19037b = xbVar;
        ks.i(xbVar);
        xbVar.setTextSize(1, 16.0f);
        int i10 = n6.G6;
        u6.U(xbVar, i10, null);
        xbVar.setTag(Integer.valueOf(i10));
        xbVar.setMaxLines(2);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(xbVar, ma.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f19036a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = n6.f29788y6;
        u6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        linearLayout.addView(textView, ma.p(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(linearLayout);
    }
}
