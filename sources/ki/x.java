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
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.nq;
public final class x extends dk0 {
    public ArrayList f19066c;
    public ArrayList d;
    public ArrayList f19067e;

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f19066c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f19067e;
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
        return this.f19066c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        w wVar = (w) f1Var.f59165a;
        String str = (String) this.f19066c.get(i7);
        if (((Boolean) this.f19067e.get(i7)).booleanValue()) {
            nq nqVar = new nq(2131231943, 0);
            nqVar.a(m6.A6);
            nqVar.f37950n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            wVar.f19046a.setText(spannableStringBuilder);
        } else {
            wVar.f19046a.setText(str);
        }
        wVar.f19047b.setText((CharSequence) this.d.get(i7));
        wVar.f19048c = str;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        xb xbVar = new xb(context, 4);
        linearLayout.f19047b = xbVar;
        ls.i(xbVar);
        xbVar.setTextSize(1, 16.0f);
        int i10 = m6.G6;
        t6.U(xbVar, i10, null);
        xbVar.setTag(Integer.valueOf(i10));
        xbVar.setMaxLines(2);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(xbVar, ma.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f19046a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = m6.f29773y6;
        t6.U(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        linearLayout.addView(textView, ma.p(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(linearLayout);
    }
}
