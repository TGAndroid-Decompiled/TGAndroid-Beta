package fi;

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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
public final class h7 implements Utilities.Callback2 {
    public final int f10962a;
    public final o7 f10963b;

    public h7(o7 o7Var, int i10) {
        this.f10962a = i10;
        this.f10963b = o7Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        switch (this.f10962a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j71 j71Var = (j71) obj2;
                o7 o7Var = this.f10963b;
                MessagesController.SavedMusicList savedMusicList = o7Var.f11400e0;
                j71Var.F = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(t61.D(AndroidUtilities.dp(64.0f)));
                if (o7Var.Z || o7Var.f11403h0) {
                    dp += o7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), o7Var.f11397b0, false, false, -1);
                }
                if (!o7Var.Z) {
                    if (TextUtils.isEmpty(o7Var.f11412r0) && !o7Var.f11403h0) {
                        j71Var.V();
                        t61 c10 = t61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.f32880q = true;
                        arrayList.add(c10);
                        j71Var.U();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!o7Var.f11403h0 && savedMusicList != null) {
                        dp += o7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    String string = LocaleController.getString(R.string.AudioSearchChats);
                    ArrayList arrayList2 = o7Var.f11398c0;
                    if (!o7Var.f11416v0 && !o7Var.f11415u0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int X = dp + o7Var.X(false, arrayList, string, arrayList2, z10, o7Var.f11414t0, 3);
                    String string2 = LocaleController.getString(R.string.AudioSearchGlobal);
                    ArrayList arrayList3 = o7Var.f11399d0;
                    if (!o7Var.C0 && !o7Var.B0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    dp = X + o7Var.X(false, arrayList, string2, arrayList3, z11, o7Var.A0, 4);
                }
                int size = arrayList.size();
                if (!o7Var.Z && TextUtils.isEmpty(o7Var.f11412r0) && !o7Var.f11403h0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                if (size <= i10) {
                    if (TextUtils.isEmpty(o7Var.f11412r0)) {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        String string4 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i12 = dj.f27531a;
                        t61 K = t61.K(dj.class);
                        K.f32875l = string3;
                        K.f32876m = string4;
                        arrayList.add(K);
                    } else {
                        String string5 = LocaleController.getString(R.string.NoAudioFound);
                        if (o7Var.f11412r0.length() >= 3) {
                            i11 = R.string.NoAudioFoundInfo2;
                        } else {
                            i11 = R.string.NoAudioFoundInfo;
                        }
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i11, o7Var.f11412r0));
                        int i13 = dj.f27531a;
                        t61 K2 = t61.K(dj.class);
                        K2.f32875l = string5;
                        K2.f32876m = replaceTags;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(t61.C(null));
                arrayList.add(t61.D(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                o7.R(this.f10963b, (TLRPC.messages_BotResults) obj);
                return;
        }
    }
}
