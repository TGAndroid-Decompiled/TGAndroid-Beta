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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.p61;
public final class u7 implements Utilities.Callback2 {
    public final int f6077a;
    public final d8 f6078b;

    public u7(d8 d8Var, int i10) {
        this.f6077a = i10;
        this.f6078b = d8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f6077a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                d8 d8Var = this.f6078b;
                MessagesController.SavedMusicList savedMusicList = d8Var.f4950e0;
                c71Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(p61.C(AndroidUtilities.dp(64.0f)));
                if (d8Var.Z || d8Var.f4953h0) {
                    dp += d8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), d8Var.f4947b0, false, false, -1);
                }
                if (!d8Var.Z) {
                    if (TextUtils.isEmpty(d8Var.f4963s0) && !d8Var.f4953h0) {
                        c71Var.U();
                        p61 c10 = p61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f29739q = true;
                        arrayList.add(c10);
                        c71Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!d8Var.f4953h0 && savedMusicList != null) {
                        dp += d8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = d8Var.f4948c0;
                    if (!d8Var.f4967w0 && !d8Var.f4966v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int X = dp + d8Var.X(false, arrayList, string, arrayList2, z10, d8Var.f4965u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = d8Var.f4949d0;
                    if (!d8Var.D0 && !d8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = X + d8Var.X(false, arrayList, string2, arrayList3, z11, d8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!d8Var.Z && TextUtils.isEmpty(d8Var.f4963s0) && !d8Var.f4953h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(d8Var.f4963s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = ij.f27409a;
                        p61 J = p61.J(ij.class);
                        J.f29734l = string3;
                        J.f29735m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (d8Var.f4963s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, d8Var.f4963s0));
                        int i13 = ij.f27409a;
                        p61 J2 = p61.J(ij.class);
                        J2.f29734l = string5;
                        J2.f29735m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(p61.B(null));
                arrayList.add(p61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d8.Q(this.f6078b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
