package lh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.pi;

public final class j7 implements Utilities.Callback2 {

    public final int f16193a;

    public final r7 f16194b;

    public j7(r7 r7Var, int i10) {
        this.f16193a = i10;
        this.f16194b = r7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f16193a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                r7 r7Var = this.f16194b;
                MessagesController.SavedMusicList savedMusicList = r7Var.f16651a0;
                b51Var.A = 1;
                int iDp = AndroidUtilities.dp(64.0f);
                arrayList.add(n41.C(AndroidUtilities.dp(64.0f)));
                if (r7Var.V || r7Var.f16654d0) {
                    iDp += r7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), r7Var.X, false, false, -1);
                }
                if (!r7Var.V) {
                    if (TextUtils.isEmpty(r7Var.f16664o0) && !r7Var.f16654d0) {
                        b51Var.U();
                        n41 n41VarC = n41.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        n41VarC.f30849q = true;
                        arrayList.add(n41VarC);
                        b51Var.T();
                        iDp += AndroidUtilities.dp(50.0f);
                    }
                    if (!r7Var.f16654d0 && savedMusicList != null) {
                        iDp += r7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    iDp = iDp + r7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), r7Var.Y, r7Var.f16668s0 || r7Var.f16667r0, r7Var.f16666q0, 3) + r7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), r7Var.Z, r7Var.f16675z0 || r7Var.f16674y0, r7Var.f16673x0, 4);
                }
                if (arrayList.size() <= ((r7Var.V || !TextUtils.isEmpty(r7Var.f16664o0) || r7Var.f16654d0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(r7Var.f16664o0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = pi.f31612a;
                        n41 n41VarJ = n41.J(pi.class);
                        n41VarJ.f30844l = string;
                        n41VarJ.f30845m = string2;
                        arrayList.add(n41VarJ);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(r7Var.f16664o0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, r7Var.f16664o0));
                        int i11 = pi.f31612a;
                        n41 n41VarJ2 = n41.J(pi.class);
                        n41VarJ2.f30844l = string3;
                        n41VarJ2.f30845m = spannableStringBuilderReplaceTags;
                        arrayList.add(n41VarJ2);
                    }
                }
                arrayList.add(n41.B(null));
                arrayList.add(n41.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + iDp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                r7.P(this.f16194b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
