package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class wu0 implements jm7, ah0, cz0 {
    public static void l(int i, long j) {
        TL_bots.BotInfo botInfo;
        TLRPC.UserFull X1 = oc7.r1(i).X1(j);
        if (X1 != null && (botInfo = X1.bot_info) != null) {
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
                        str = jb6.M0(2131753063, null);
                        break;
                    }
                }
            }
            if (str != null) {
                l11.u(a.b, str);
                return;
            }
            d S = LaunchActivity.S();
            if (S == null) {
                return;
            }
            if (!(S instanceof yv1) || ((yv1) S).a() != j) {
                S.presentFragment(yv1.ga(j));
            }
            gm.d3(new an0(i, j, (byte) 1), 150L);
        }
    }
}
