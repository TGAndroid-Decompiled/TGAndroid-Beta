package ci;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.x51;
public final class u7 implements Utilities.Callback2 {
    public final int f5641a;
    public final c8 f5642b;

    public u7(c8 c8Var, int i10) {
        this.f5641a = i10;
        this.f5642b = c8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f5641a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                c8 c8Var = this.f5642b;
                MessagesController.SavedMusicList savedMusicList = c8Var.f4455e0;
                l61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(x51.C(AndroidUtilities.dp(64.0f)));
                if (c8Var.Z || c8Var.f4458h0) {
                    dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), c8Var.f4452b0, false, false, -1);
                }
                if (!c8Var.Z) {
                    if (TextUtils.isEmpty(c8Var.f4466q0) && !c8Var.f4458h0) {
                        l61Var.U();
                        x51 c10 = x51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f30307q = true;
                        arrayList.add(c10);
                        l61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!c8Var.f4458h0 && savedMusicList != null) {
                        dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = c8Var.f4453c0;
                    if (!c8Var.f4470u0 && !c8Var.f4469t0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int X = dp + c8Var.X(false, arrayList, string, arrayList2, z10, c8Var.f4468s0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = c8Var.f4454d0;
                    if (!c8Var.B0 && !c8Var.A0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = X + c8Var.X(false, arrayList, string2, arrayList3, z11, c8Var.f4475z0, 4);
                }
                int size = arrayList.size();
                if (!c8Var.Z && TextUtils.isEmpty(c8Var.f4466q0) && !c8Var.f4458h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(c8Var.f4466q0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = gj.f24586a;
                        x51 J = x51.J(gj.class);
                        J.f30302l = string3;
                        J.f30303m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (c8Var.f4466q0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, c8Var.f4466q0));
                        int i13 = gj.f24586a;
                        x51 J2 = x51.J(gj.class);
                        J2.f30302l = string5;
                        J2.f30303m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(x51.B(null));
                arrayList.add(x51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c8.R(this.f5642b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
