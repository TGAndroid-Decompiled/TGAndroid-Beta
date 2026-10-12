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
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
public final class t7 implements Utilities.Callback2 {
    public final int f7836a;
    public final c8 f7837b;

    public t7(c8 c8Var, int i10) {
        this.f7836a = i10;
        this.f7837b = c8Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f7836a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z61 z61Var = (z61) obj2;
                c8 c8Var = this.f7837b;
                MessagesController.SavedMusicList savedMusicList = c8Var.f6715e0;
                z61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(l61.C(AndroidUtilities.dp(64.0f)));
                if (c8Var.Z || c8Var.f6718h0) {
                    dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), c8Var.f6712b0, false, false, -1);
                }
                if (!c8Var.Z) {
                    if (TextUtils.isEmpty(c8Var.f6728s0) && !c8Var.f6718h0) {
                        z61Var.U();
                        l61 c10 = l61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f26959q = true;
                        arrayList.add(c10);
                        z61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!c8Var.f6718h0 && savedMusicList != null) {
                        dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = c8Var.f6713c0;
                    if (!c8Var.f6732w0 && !c8Var.f6731v0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int X = dp + c8Var.X(false, arrayList, string, arrayList2, z10, c8Var.f6730u0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = c8Var.f6714d0;
                    if (!c8Var.D0 && !c8Var.C0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = X + c8Var.X(false, arrayList, string2, arrayList3, z11, c8Var.B0, 4);
                }
                int size = arrayList.size();
                if (!c8Var.Z && TextUtils.isEmpty(c8Var.f6728s0) && !c8Var.f6718h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(c8Var.f6728s0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = fj.f25061a;
                        l61 J = l61.J(fj.class);
                        J.f26954l = string3;
                        J.f26955m = string4;
                        arrayList.add(J);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (c8Var.f6728s0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, c8Var.f6728s0));
                        int i13 = fj.f25061a;
                        l61 J2 = l61.J(fj.class);
                        J2.f26954l = string5;
                        J2.f26955m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(l61.B(null));
                arrayList.add(l61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                c8.Q(this.f7837b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
