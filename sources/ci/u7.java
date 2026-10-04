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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.u61;
public final class u7 implements Utilities.Callback2 {
    public final int f6072a;
    public final c8 f6073b;

    public u7(c8 c8Var, int i10) {
        this.f6072a = i10;
        this.f6073b = c8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f6072a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                u61 u61Var = (u61) obj2;
                c8 c8Var = this.f6073b;
                MessagesController.SavedMusicList savedMusicList = c8Var.f4814e0;
                u61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(g61.C(AndroidUtilities.dp(64.0f)));
                if (c8Var.Z || c8Var.f4817h0) {
                    dp += c8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), c8Var.f4811b0, false, false, -1);
                }
                if (!c8Var.Z) {
                    if (TextUtils.isEmpty(c8Var.f4825q0) && !c8Var.f4817h0) {
                        u61Var.U();
                        g61 c10 = g61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f26674q = true;
                        arrayList.add(c10);
                        u61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!c8Var.f4817h0 && savedMusicList != null) {
                        dp += c8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = c8Var.f4812c0;
                    if (!c8Var.f4829u0 && !c8Var.f4828t0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + c8Var.W(false, arrayList, string, arrayList2, z10, c8Var.f4827s0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = c8Var.f4813d0;
                    if (!c8Var.B0 && !c8Var.A0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + c8Var.W(false, arrayList, string2, arrayList3, z11, c8Var.f4834z0, 4);
                }
                int size = arrayList.size();
                if (!c8Var.Z && TextUtils.isEmpty(c8Var.f4825q0) && !c8Var.f4817h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(c8Var.f4825q0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = hj.f27145a;
                        g61 J = g61.J(hj.class);
                        J.f26669l = string3;
                        J.f26670m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (c8Var.f4825q0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, c8Var.f4825q0));
                        int i13 = hj.f27145a;
                        g61 J2 = g61.J(hj.class);
                        J2.f26669l = string5;
                        J2.f26670m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(g61.B(null));
                arrayList.add(g61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c8.P(this.f6073b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
