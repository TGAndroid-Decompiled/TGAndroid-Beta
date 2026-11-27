package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class dp0 extends c79 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final void E(zh6 zh6Var) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i = 0; i < zh6Var.m(); i++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) zh6Var.n(i);
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
    public final void t(f89 f89Var, int i) {
        cp0 cp0Var = (cp0) f89Var.a;
        String str = (String) this.c.get(i);
        if (((Boolean) this.e.get(i)).booleanValue()) {
            wm2 wm2Var = new wm2(2131231946, 0);
            wm2Var.a(aob.A6);
            wm2Var.n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            cp0Var.a.setText(spannableStringBuilder);
        } else {
            cp0Var.a.setText(str);
        }
        cp0Var.b.setText((CharSequence) this.d.get(i));
        cp0Var.c = str;
    }
}
