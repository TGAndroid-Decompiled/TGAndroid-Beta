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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.m61;
public final class k7 implements Utilities.Callback2 {
    public final int f9332a;
    public final s7 f9333b;

    public k7(s7 s7Var, int i10) {
        this.f9332a = i10;
        this.f9333b = s7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f9332a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b71 b71Var = (b71) obj2;
                s7 s7Var = this.f9333b;
                MessagesController.SavedMusicList savedMusicList = s7Var.f9811e0;
                b71Var.F = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(m61.C(AndroidUtilities.dp(64.0f)));
                if (s7Var.Z || s7Var.f9814h0) {
                    dp += s7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), s7Var.f9808b0, false, false, -1);
                }
                if (!s7Var.Z) {
                    if (TextUtils.isEmpty(s7Var.f9825t0) && !s7Var.f9814h0) {
                        b71Var.U();
                        m61 c10 = m61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f28564q = true;
                        arrayList.add(c10);
                        b71Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!s7Var.f9814h0 && savedMusicList != null) {
                        dp += s7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = s7Var.f9809c0;
                    if (!s7Var.f9829x0 && !s7Var.f9828w0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + s7Var.W(false, arrayList, string, arrayList2, z10, s7Var.f9827v0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = s7Var.f9810d0;
                    if (!s7Var.E0 && !s7Var.D0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + s7Var.W(false, arrayList, string2, arrayList3, z11, s7Var.C0, 4);
                }
                int size = arrayList.size();
                if (!s7Var.Z && TextUtils.isEmpty(s7Var.f9825t0) && !s7Var.f9814h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(s7Var.f9825t0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = dj.f25661a;
                        m61 J = m61.J(dj.class);
                        J.f28559l = string3;
                        J.f28560m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (s7Var.f9825t0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, s7Var.f9825t0));
                        int i13 = dj.f25661a;
                        m61 J2 = m61.J(dj.class);
                        J2.f28559l = string5;
                        J2.f28560m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(m61.B(null));
                arrayList.add(m61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s7.P(this.f9333b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
