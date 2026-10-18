package ei;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
public final class k7 implements Utilities.Callback2 {
    public final int f9324a;
    public final s7 f9325b;

    public k7(s7 s7Var, int i10) {
        this.f9324a = i10;
        this.f9325b = s7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f9324a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                s7 s7Var = this.f9325b;
                MessagesController.SavedMusicList savedMusicList = s7Var.f9798e0;
                s61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(f61.C(AndroidUtilities.dp(64.0f)));
                if (s7Var.Z || s7Var.f9801h0) {
                    dp += s7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), s7Var.f9795b0, false, false, -1);
                }
                if (!s7Var.Z) {
                    if (TextUtils.isEmpty(s7Var.f9811s0) && !s7Var.f9801h0) {
                        s61Var.U();
                        f61 c10 = f61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f26152q = true;
                        arrayList.add(c10);
                        s61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!s7Var.f9801h0 && savedMusicList != null) {
                        dp += s7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = s7Var.f9796c0;
                    if (!s7Var.f9815w0 && !s7Var.f9814v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int X = dp + s7Var.X(false, arrayList, string, arrayList2, z10, s7Var.f9813u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = s7Var.f9797d0;
                    if (!s7Var.D0 && !s7Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = X + s7Var.X(false, arrayList, string2, arrayList3, z11, s7Var.B0, 4);
                }
                int size = arrayList.size();
                if (!s7Var.Z && TextUtils.isEmpty(s7Var.f9811s0) && !s7Var.f9801h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(s7Var.f9811s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = dj.f25605a;
                        f61 J = f61.J(dj.class);
                        J.f26147l = string3;
                        J.f26148m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (s7Var.f9811s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, s7Var.f9811s0));
                        int i13 = dj.f25605a;
                        f61 J2 = f61.J(dj.class);
                        J2.f26147l = string5;
                        J2.f26148m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(f61.B(null));
                arrayList.add(f61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s7.Q(this.f9325b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
