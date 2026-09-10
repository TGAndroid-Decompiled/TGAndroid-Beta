package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;
public final class y8 implements Utilities.Callback2 {
    public final int f3973a;
    public final i9 f3974b;

    public y8(i9 i9Var, int i10) {
        this.f3973a = i10;
        this.f3974b = i9Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f3973a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                i9 i9Var = this.f3974b;
                MessagesController.SavedMusicList savedMusicList = i9Var.f2866e0;
                j61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(v51.C(AndroidUtilities.dp(64.0f)));
                if (i9Var.Z || i9Var.f2869h0) {
                    dp += i9Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), i9Var.f2863b0, false, false, -1);
                }
                if (!i9Var.Z) {
                    if (TextUtils.isEmpty(i9Var.f2879s0) && !i9Var.f2869h0) {
                        j61Var.U();
                        v51 c10 = v51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f27834q = true;
                        arrayList.add(c10);
                        j61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!i9Var.f2869h0 && savedMusicList != null) {
                        dp += i9Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = i9Var.f2864c0;
                    if (!i9Var.f2883w0 && !i9Var.f2882v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + i9Var.W(false, arrayList, string, arrayList2, z10, i9Var.f2881u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = i9Var.f2865d0;
                    if (!i9Var.D0 && !i9Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + i9Var.W(false, arrayList, string2, arrayList3, z11, i9Var.B0, 4);
                }
                int size = arrayList.size();
                if (!i9Var.Z && TextUtils.isEmpty(i9Var.f2879s0) && !i9Var.f2869h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(i9Var.f2879s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = hj.f23644a;
                        v51 J = v51.J(hj.class);
                        J.f27829l = string3;
                        J.f27830m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (i9Var.f2879s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, i9Var.f2879s0));
                        int i13 = hj.f23644a;
                        v51 J2 = v51.J(hj.class);
                        J2.f27829l = string5;
                        J2.f27830m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(v51.B(null));
                arrayList.add(v51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                i9.Q(this.f3974b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
