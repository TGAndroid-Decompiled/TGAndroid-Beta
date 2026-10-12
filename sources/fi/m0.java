package fi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import ii.e6;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q70;
public final class m0 implements Utilities.Callback {
    public final int f10006a;
    public final int f10007b;
    public final Object f10008c;
    public final Object d;
    public final Object f10009e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f10006a = i11;
        this.f10008c = obj;
        this.f10007b = i10;
        this.d = obj2;
        this.f10009e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f10006a;
        boolean z10 = true;
        int i11 = this.f10007b;
        Object obj2 = this.f10009e;
        Object obj3 = this.d;
        Object obj4 = this.f10008c;
        switch (i10) {
            case 0:
                m2 m2Var = (m2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f19803id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f10007b;
                if (!isChannel) {
                    a2 a2Var = new a2(m2Var.getContext(), 3, null);
                    a2Var.q(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(m2Var.getParentActivity(), chat.f19803id, m2Var, new n0(a2Var, m2Var, i12, j3, booleanValue));
                    return;
                }
                long j10 = chat.f19803id;
                MessagesController.getInstance(i12).linkCommunity(-j10, j3, booleanValue, new o0(m2Var, j10, 0));
                return;
            case 1:
                e6 e6Var = (e6) obj4;
                ii.a aVar = (ii.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == e6Var.I && e6Var.f12409x == aVar) {
                    Editable text = e6Var.f12404f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (ki.d dVar : (ki.d[]) text.getSpans(0, text.length(), ki.d.class)) {
                            text.removeSpan(dVar);
                        }
                        ki.d[] dVarArr = (ki.d[]) spannableString.getSpans(0, spannableString.length(), ki.d.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < dVarArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        e6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                lw lwVar = (lw) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                m2 m2Var2 = lwVar.f28288c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    lwVar.dismiss();
                    sc.g(m2Var2, new iy0(m2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, m2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                q70 q70Var = (q70) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    q70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    zc X = zc.X();
                    if (X != null) {
                        v0.q(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l4.longValue() > 0) {
                    bundle.putLong("user_id", l4.longValue());
                    if (l4.longValue() != UserConfig.getInstance(launchActivity.O).getClientUserId()) {
                        z10 = false;
                    }
                    bundle.putBoolean("my_profile", z10);
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                bundle.putInt("open_story_album_id", i11);
                launchActivity.p0(new ProfileActivity(bundle, null));
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                TranslateController translateController = (TranslateController) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                String str2 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.f33834o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f33834o5)) {
                        if (photoViewer.f33825n5) {
                            photoViewer.f33829o0.K(20);
                            photoViewer.f33829o0.r(19);
                            return;
                        }
                        photoViewer.f33829o0.K(19);
                        photoViewer.f33829o0.r(20);
                        return;
                    }
                    photoViewer.f33829o0.r(19);
                    photoViewer.f33829o0.r(20);
                    return;
                }
                return;
            default:
                bd bdVar = (bd) obj4;
                Context context = (Context) obj3;
                c6 c6Var = (c6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bdVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) cd.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new w21(this.f10007b, context, c6Var, savedStarGift, 21), c6Var, null));
                    bdVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(lw lwVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f10006a = 2;
        this.f10008c = lwVar;
        this.d = iArr;
        this.f10007b = i10;
        this.f10009e = arrayList;
    }

    public m0(LaunchActivity launchActivity, q70 q70Var, Long l4, int i10) {
        this.f10006a = 3;
        this.f10008c = launchActivity;
        this.d = q70Var;
        this.f10009e = l4;
        this.f10007b = i10;
    }
}
