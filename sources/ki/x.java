package ki;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import di.xb;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.kq;
public final class x extends dk0 {
    public ArrayList f19130c;
    public ArrayList d;
    public ArrayList f19131e;

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f19130c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f19131e;
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
        return this.f19130c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        w wVar = (w) f1Var.f59245a;
        String str = (String) this.f19130c.get(i7);
        if (((Boolean) this.f19131e.get(i7)).booleanValue()) {
            kq kqVar = new kq(2131231946, 0);
            kqVar.a(n6.A6);
            kqVar.f36852n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(kqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            wVar.f19110a.setText(spannableStringBuilder);
        } else {
            wVar.f19110a.setText(str);
        }
        wVar.f19111b.setText((CharSequence) this.d.get(i7));
        wVar.f19112c = str;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        xb xbVar = new xb(context, 4);
        linearLayout.f19111b = xbVar;
        ks.i(xbVar);
        xbVar.setTextSize(1, 16.0f);
        int i10 = n6.G6;
        u6.U(xbVar, i10, null);
        xbVar.setTag(Integer.valueOf(i10));
        xbVar.setMaxLines(2);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(xbVar, na.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f19110a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = n6.f29843y6;
        u6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        linearLayout.addView(textView, na.p(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(linearLayout);
    }
}
