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
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;
public final class x7 implements Utilities.Callback2 {
    public final int f5761a;
    public final g8 f5762b;

    public x7(g8 g8Var, int i10) {
        this.f5761a = i10;
        this.f5762b = g8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f5761a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                g8 g8Var = this.f5762b;
                MessagesController.SavedMusicList savedMusicList = g8Var.f4703e0;
                x51Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(j51.C(AndroidUtilities.dp(64.0f)));
                if (g8Var.Z || g8Var.f4706h0) {
                    dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), g8Var.f4700b0, false, false, -1);
                }
                if (!g8Var.Z) {
                    if (TextUtils.isEmpty(g8Var.f4716s0) && !g8Var.f4706h0) {
                        x51Var.U();
                        j51 c10 = j51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f25129q = true;
                        arrayList.add(c10);
                        x51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!g8Var.f4706h0 && savedMusicList != null) {
                        dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = g8Var.f4701c0;
                    if (!g8Var.f4720w0 && !g8Var.f4719v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + g8Var.W(false, arrayList, string, arrayList2, z10, g8Var.f4718u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = g8Var.f4702d0;
                    if (!g8Var.D0 && !g8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + g8Var.W(false, arrayList, string2, arrayList3, z11, g8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!g8Var.Z && TextUtils.isEmpty(g8Var.f4716s0) && !g8Var.f4706h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(g8Var.f4716s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = ej.f23574a;
                        j51 J = j51.J(ej.class);
                        J.f25124l = string3;
                        J.f25125m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (g8Var.f4716s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, g8Var.f4716s0));
                        int i13 = ej.f23574a;
                        j51 J2 = j51.J(ej.class);
                        J2.f25124l = string5;
                        J2.f25125m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(j51.B(null));
                arrayList.add(j51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g8.Q(this.f5762b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
