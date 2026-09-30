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
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.y51;
public final class u7 implements Utilities.Callback2 {
    public final int f5624a;
    public final d8 f5625b;

    public u7(d8 d8Var, int i10) {
        this.f5624a = i10;
        this.f5625b = d8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f5624a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m61 m61Var = (m61) obj2;
                d8 d8Var = this.f5625b;
                MessagesController.SavedMusicList savedMusicList = d8Var.f4531e0;
                m61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(y51.C(AndroidUtilities.dp(64.0f)));
                if (d8Var.Z || d8Var.f4534h0) {
                    dp += d8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), d8Var.f4528b0, false, false, -1);
                }
                if (!d8Var.Z) {
                    if (TextUtils.isEmpty(d8Var.f4544s0) && !d8Var.f4534h0) {
                        m61Var.U();
                        y51 c10 = y51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f30642q = true;
                        arrayList.add(c10);
                        m61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!d8Var.f4534h0 && savedMusicList != null) {
                        dp += d8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = d8Var.f4529c0;
                    if (!d8Var.f4548w0 && !d8Var.f4547v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + d8Var.W(false, arrayList, string, arrayList2, z10, d8Var.f4546u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = d8Var.f4530d0;
                    if (!d8Var.D0 && !d8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + d8Var.W(false, arrayList, string2, arrayList3, z11, d8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!d8Var.Z && TextUtils.isEmpty(d8Var.f4544s0) && !d8Var.f4534h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(d8Var.f4544s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = hj.f24875a;
                        y51 J = y51.J(hj.class);
                        J.f30637l = string3;
                        J.f30638m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (d8Var.f4544s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, d8Var.f4544s0));
                        int i13 = hj.f24875a;
                        y51 J2 = y51.J(hj.class);
                        J2.f30637l = string5;
                        J2.f30638m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(y51.B(null));
                arrayList.add(y51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                d8.P(this.f5625b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
