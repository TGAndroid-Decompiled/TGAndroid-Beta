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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.m61;
public final class t7 implements Utilities.Callback2 {
    public final int f7839a;
    public final c8 f7840b;

    public t7(c8 c8Var, int i10) {
        this.f7839a = i10;
        this.f7840b = c8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f7839a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                c8 c8Var = this.f7840b;
                MessagesController.SavedMusicList savedMusicList = c8Var.f6718e0;
                a71Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(m61.C(AndroidUtilities.dp(64.0f)));
                if (c8Var.Z || c8Var.f6721h0) {
                    dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), c8Var.f6715b0, false, false, -1);
                }
                if (!c8Var.Z) {
                    if (TextUtils.isEmpty(c8Var.f6731s0) && !c8Var.f6721h0) {
                        a71Var.U();
                        m61 c10 = m61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f26951q = true;
                        arrayList.add(c10);
                        a71Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!c8Var.f6721h0 && savedMusicList != null) {
                        dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = c8Var.f6716c0;
                    if (!c8Var.f6735w0 && !c8Var.f6734v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int X = dp + c8Var.X(false, arrayList, string, arrayList2, z10, c8Var.f6733u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = c8Var.f6717d0;
                    if (!c8Var.D0 && !c8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = X + c8Var.X(false, arrayList, string2, arrayList3, z11, c8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!c8Var.Z && TextUtils.isEmpty(c8Var.f6731s0) && !c8Var.f6721h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(c8Var.f6731s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = fj.f24759a;
                        m61 J = m61.J(fj.class);
                        J.f26946l = string3;
                        J.f26947m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (c8Var.f6731s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, c8Var.f6731s0));
                        int i13 = fj.f24759a;
                        m61 J2 = m61.J(fj.class);
                        J2.f26946l = string5;
                        J2.f26947m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(m61.B(null));
                arrayList.add(m61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c8.Q(this.f7840b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
