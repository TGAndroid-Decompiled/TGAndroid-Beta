package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class dq0 extends q59 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E(vh6 vh6Var) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i = 0; i < vh6Var.m(); i++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) vh6Var.n(i);
            for (int i2 = 0; i2 < botInfo.commands.size(); i2++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i2);
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
        return this.c.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        cq0 cq0Var = (cq0) u69Var.a;
        String str = (String) this.c.get(i);
        if (((Boolean) this.e.get(i)).booleanValue()) {
            pn2 pn2Var = new pn2(2131231947, 0);
            pn2Var.a(cmb.z6);
            pn2Var.n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(pn2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            cq0Var.a.setText(spannableStringBuilder);
        } else {
            cq0Var.a.setText(str);
        }
        cq0Var.b.setText((CharSequence) this.d.get(i));
        cq0Var.c = str;
    }
}
