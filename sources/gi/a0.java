package gi;

import ai.vd;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.yq;
import w7.z5;
public final class a0 extends hm0 {
    public ArrayList f11067c;
    public ArrayList d;
    public ArrayList e;

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.f11067c;
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
        return this.f11067c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        z zVar = (z) b1Var.f45910a;
        String str = (String) this.f11067c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            yq yqVar = new yq(R.drawable.mini_ephemeral_hidden_14, 0);
            yqVar.setColorKey(h6.A6);
            yqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(yqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            zVar.f11572a.setText(spannableStringBuilder);
        } else {
            zVar.f11572a.setText(str);
        }
        zVar.f11573b.setText((CharSequence) this.d.get(i10));
        zVar.f11574c = str;
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        ?? linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        vd vdVar = new vd(context, 3);
        linearLayout.f11573b = vdVar;
        NotificationCenter.listenEmojiLoading(vdVar);
        vdVar.setTextSize(1, 16.0f);
        int i11 = h6.G6;
        vdVar.setTextColor(h6.x0(null, i11, false));
        vdVar.setTag(Integer.valueOf(i11));
        vdVar.setMaxLines(2);
        vdVar.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(vdVar, z5.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        linearLayout.f11572a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = h6.f21374y6;
        textView.setTextColor(h6.x0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        linearLayout.addView(textView, z5.o(-2, -2, 0.0f, 16));
        linearLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(linearLayout);
    }
}
