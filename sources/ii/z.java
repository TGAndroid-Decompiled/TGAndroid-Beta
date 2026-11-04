package ii;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ci.ec;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.wp;
public final class z extends sj0 {
    public ArrayList f15332c;
    public ArrayList d;
    public ArrayList f15333e;

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f15332c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.f15333e;
        arrayList3.clear();
        for (int i3 = 0; i3 < hVar.m(); i3++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i3);
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
        return this.f15332c.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        y yVar = (y) d1Var.f55540a;
        String str = (String) this.f15332c.get(i3);
        if (((Boolean) this.f15333e.get(i3)).booleanValue()) {
            wp wpVar = new wp(2131231942, 0);
            wpVar.a(k6.A6);
            wpVar.f40044n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            yVar.f15322a.setText(spannableStringBuilder);
        } else {
            yVar.f15322a.setText(str);
        }
        yVar.f15323b.setText((CharSequence) this.d.get(i3));
        yVar.f15324c = str;
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        ec ecVar = new ec(context, 3);
        linearLayout.f15323b = ecVar;
        hs.i(ecVar);
        ecVar.setTextSize(1, 16.0f);
        int i10 = k6.G6;
        r6.V(ecVar, i10, null);
        ecVar.setTag(Integer.valueOf(i10));
        ecVar.setMaxLines(2);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(ecVar, mf.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.g0.L(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f15322a = textView;
        textView.setTextSize(1, 14.0f);
        int i11 = k6.f28273y6;
        r6.V(textView, i11, null);
        textView.setTag(Integer.valueOf(i11));
        linearLayout.addView(textView, mf.p(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(linearLayout);
    }
}
