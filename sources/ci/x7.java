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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.y51;
public final class x7 implements Utilities.Callback2 {
    public final int f5760a;
    public final g8 f5761b;

    public x7(g8 g8Var, int i10) {
        this.f5760a = i10;
        this.f5761b = g8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f5760a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m61 m61Var = (m61) obj2;
                g8 g8Var = this.f5761b;
                MessagesController.SavedMusicList savedMusicList = g8Var.f4702e0;
                m61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(y51.C(AndroidUtilities.dp(64.0f)));
                if (g8Var.Z || g8Var.f4705h0) {
                    dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), g8Var.f4699b0, false, false, -1);
                }
                if (!g8Var.Z) {
                    if (TextUtils.isEmpty(g8Var.f4715s0) && !g8Var.f4705h0) {
                        m61Var.U();
                        y51 c10 = y51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f30523q = true;
                        arrayList.add(c10);
                        m61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!g8Var.f4705h0 && savedMusicList != null) {
                        dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = g8Var.f4700c0;
                    if (!g8Var.f4719w0 && !g8Var.f4718v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + g8Var.W(false, arrayList, string, arrayList2, z10, g8Var.f4717u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = g8Var.f4701d0;
                    if (!g8Var.D0 && !g8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + g8Var.W(false, arrayList, string2, arrayList3, z11, g8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!g8Var.Z && TextUtils.isEmpty(g8Var.f4715s0) && !g8Var.f4705h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(g8Var.f4715s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = ej.f23957a;
                        y51 J = y51.J(ej.class);
                        J.f30518l = string3;
                        J.f30519m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (g8Var.f4715s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, g8Var.f4715s0));
                        int i13 = ej.f23957a;
                        y51 J2 = y51.J(ej.class);
                        J2.f30518l = string5;
                        J2.f30519m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(y51.B(null));
                arrayList.add(y51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g8.Q(this.f5761b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
