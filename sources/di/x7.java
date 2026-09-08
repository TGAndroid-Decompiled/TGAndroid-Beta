package di;

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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
public final class x7 implements Utilities.Callback2 {
    public final int f8421a;
    public final g8 f8422b;

    public x7(g8 g8Var, int i10) {
        this.f8421a = i10;
        this.f8422b = g8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f8421a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                g8 g8Var = this.f8422b;
                MessagesController.SavedMusicList savedMusicList = g8Var.f7304e0;
                v51Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(h51.C(AndroidUtilities.dp(64.0f)));
                if (g8Var.Z || g8Var.f7307h0) {
                    dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), g8Var.f7301b0, false, false, -1);
                }
                if (!g8Var.Z) {
                    if (TextUtils.isEmpty(g8Var.f7317s0) && !g8Var.f7307h0) {
                        v51Var.U();
                        h51 c10 = h51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f26626q = true;
                        arrayList.add(c10);
                        v51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!g8Var.f7307h0 && savedMusicList != null) {
                        dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = g8Var.f7302c0;
                    if (!g8Var.f7321w0 && !g8Var.f7320v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + g8Var.W(false, arrayList, string, arrayList2, z10, g8Var.f7319u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = g8Var.f7303d0;
                    if (!g8Var.D0 && !g8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + g8Var.W(false, arrayList, string2, arrayList3, z11, g8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!g8Var.Z && TextUtils.isEmpty(g8Var.f7317s0) && !g8Var.f7307h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(g8Var.f7317s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = ej.f25744a;
                        h51 J = h51.J(ej.class);
                        J.f26621l = string3;
                        J.f26622m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (g8Var.f7317s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, g8Var.f7317s0));
                        int i13 = ej.f25744a;
                        h51 J2 = h51.J(ej.class);
                        J2.f26621l = string5;
                        J2.f26622m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(h51.B(null));
                arrayList.add(h51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g8.Q(this.f8422b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
