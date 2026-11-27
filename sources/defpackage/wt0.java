package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class wt0 implements fn7, ag0, dy0 {
    public static void l(int i, long j) {
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull Y1 = uc7.s1(i).Y1(j);
        if (Y1 != null && (botInfo = Y1.bot_info) != null) {
            String str = botInfo.privacy_policy_url;
            if (str == null && str == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        TLRPC.BotCommand botCommand = arrayList.get(i2);
                        i2++;
                        if ("privacy".equals(botCommand.command)) {
                            break;
                        }
                    } else {
                        str = ob6.M0(2131753091, null);
                        break;
                    }
                }
            }
            if (str != null) {
                m01.u(a.b, str);
                return;
            }
            e S = LaunchActivity.S();
            if (S == null) {
                return;
            }
            if (!(S instanceof zu1) || ((zu1) S).a() != j) {
                S.presentFragment(zu1.ha(j));
            }
            hl.d3(new am0(i, j, (byte) 1), 150L);
        }
    }
}
