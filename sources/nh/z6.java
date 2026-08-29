package nh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wi;
public final class z6 implements Utilities.Callback2 {
    public final int f18964a;
    public final g7 f18965b;

    public z6(g7 g7Var, int i10) {
        this.f18964a = i10;
        this.f18965b = g7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f18964a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                g7 g7Var = this.f18965b;
                MessagesController.SavedMusicList savedMusicList = g7Var.f17707a0;
                k51Var.A = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(w41.C(AndroidUtilities.dp(64.0f)));
                if (g7Var.V || g7Var.f17710d0) {
                    dp += g7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), g7Var.X, false, false, -1);
                }
                if (!g7Var.V) {
                    if (TextUtils.isEmpty(g7Var.f17720o0) && !g7Var.f17710d0) {
                        k51Var.U();
                        w41 c3 = w41.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.f34305q = true;
                        arrayList.add(c3);
                        k51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!g7Var.f17710d0 && savedMusicList != null) {
                        dp += g7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = g7Var.Y;
                    if (!g7Var.f17724s0 && !g7Var.f17723r0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int W = dp + g7Var.W(false, arrayList, string, arrayList2, z10, g7Var.f17722q0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = g7Var.Z;
                    if (!g7Var.f17731z0 && !g7Var.f17730y0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = W + g7Var.W(false, arrayList, string2, arrayList3, z11, g7Var.f17729x0, 4);
                }
                int size = arrayList.size();
                if (!g7Var.V && TextUtils.isEmpty(g7Var.f17720o0) && !g7Var.f17710d0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(g7Var.f17720o0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = wi.f34421a;
                        w41 J = w41.J(wi.class);
                        J.f34300l = string3;
                        J.f34301m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (g7Var.f17720o0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, g7Var.f17720o0));
                        int i13 = wi.f34421a;
                        w41 J2 = w41.J(wi.class);
                        J2.f34300l = string5;
                        J2.f34301m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(w41.B(null));
                arrayList.add(w41.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                g7.P(this.f18965b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
