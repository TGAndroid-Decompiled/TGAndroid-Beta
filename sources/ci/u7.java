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
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
public final class u7 implements Utilities.Callback2 {
    public final int f5615a;
    public final d8 f5616b;

    public u7(d8 d8Var, int i10) {
        this.f5615a = i10;
        this.f5616b = d8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f5615a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v51 v51Var = (v51) obj2;
                d8 d8Var = this.f5616b;
                MessagesController.SavedMusicList savedMusicList = d8Var.f4524e0;
                v51Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(h51.C(AndroidUtilities.dp(64.0f)));
                if (d8Var.Z || d8Var.f4527h0) {
                    dp += d8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), d8Var.f4521b0, false, false, -1);
                }
                if (!d8Var.Z) {
                    if (TextUtils.isEmpty(d8Var.f4537s0) && !d8Var.f4527h0) {
                        v51Var.U();
                        h51 c10 = h51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f24512q = true;
                        arrayList.add(c10);
                        v51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!d8Var.f4527h0 && savedMusicList != null) {
                        dp += d8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = d8Var.f4522c0;
                    if (!d8Var.f4541w0 && !d8Var.f4540v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + d8Var.W(false, arrayList, string, arrayList2, z10, d8Var.f4539u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = d8Var.f4523d0;
                    if (!d8Var.D0 && !d8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + d8Var.W(false, arrayList, string2, arrayList3, z11, d8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!d8Var.Z && TextUtils.isEmpty(d8Var.f4537s0) && !d8Var.f4527h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(d8Var.f4537s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = fj.f23994a;
                        h51 J = h51.J(fj.class);
                        J.f24507l = string3;
                        J.f24508m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (d8Var.f4537s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, d8Var.f4537s0));
                        int i13 = fj.f23994a;
                        h51 J2 = h51.J(fj.class);
                        J2.f24507l = string5;
                        J2.f24508m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(h51.B(null));
                arrayList.add(h51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d8.P(this.f5616b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
