package kh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z41;
public final class l7 implements Utilities.Callback2 {
    public final int f15605a;
    public final s7 f15606b;

    public l7(s7 s7Var, int i9) {
        this.f15605a = i9;
        this.f15606b = s7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i9;
        int i10;
        boolean z10;
        boolean z11;
        switch (this.f15605a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                s7 s7Var = this.f15606b;
                MessagesController.SavedMusicList savedMusicList = s7Var.f16033a0;
                z41Var.A = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(l41.C(AndroidUtilities.dp(64.0f)));
                if (s7Var.V || s7Var.f16036d0) {
                    dp += s7Var.V(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), s7Var.X, false, false, -1);
                }
                if (!s7Var.V) {
                    if (TextUtils.isEmpty(s7Var.f16046o0) && !s7Var.f16036d0) {
                        z41Var.U();
                        l41 c10 = l41.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f30344q = true;
                        arrayList.add(c10);
                        z41Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!s7Var.f16036d0 && savedMusicList != null) {
                        dp += s7Var.V(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = s7Var.Y;
                    if (!s7Var.f16050s0 && !s7Var.f16049r0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int V = dp + s7Var.V(false, arrayList, string, arrayList2, z10, s7Var.f16048q0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = s7Var.Z;
                    if (!s7Var.f16057z0 && !s7Var.f16056y0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = V + s7Var.V(false, arrayList, string2, arrayList3, z11, s7Var.f16055x0, 4);
                }
                int size = arrayList.size();
                if (!s7Var.V && TextUtils.isEmpty(s7Var.f16046o0) && !s7Var.f16036d0) {
                    i9 = 2;
                } else {
                    i9 = 1;
                }
                if (size <= i9) {
                    if (TextUtils.isEmpty(s7Var.f16046o0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i11 = ti.f32701a;
                        l41 J = l41.J(ti.class);
                        J.f30339l = string3;
                        J.f30340m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (s7Var.f16046o0.length() >= 3) {
                            i10 = R.string.NoAudioFoundInfo2;
                        } else {
                            i10 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, s7Var.f16046o0));
                        int i12 = ti.f32701a;
                        l41 J2 = l41.J(ti.class);
                        J2.f30339l = string5;
                        J2.f30340m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(l41.B(null));
                arrayList.add(l41.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s7.O(this.f15606b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
