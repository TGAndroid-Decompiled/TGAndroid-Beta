package ai;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b80;
public final class ua implements Utilities.Callback {
    public final int f2270a;
    public final int f2271b;
    public final Object f2272c;
    public final Object d;
    public final Object e;

    public ua(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2270a = i11;
        this.f2272c = obj;
        this.f2271b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f2270a;
        boolean z10 = true;
        int i11 = this.f2271b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2272c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.ad.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new cb(this.f2271b, context, d6Var, savedStarGift, 0), d6Var, null));
                    zcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).f20272id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f2271b;
                if (!isChannel) {
                    org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(n2Var.getContext(), 3, null);
                    b2Var.q(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(n2Var.getParentActivity(), chat.f20272id, n2Var, new hi.m0(b2Var, n2Var, i12, j10, booleanValue));
                    return;
                }
                long j11 = chat.f20272id;
                MessagesController.getInstance(i12).linkCommunity(-j11, j10, booleanValue, new hi.n0(n2Var, j11, 0));
                return;
            case 2:
                ki.c6 c6Var = (ki.c6) obj4;
                ki.a aVar = (ki.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == c6Var.I && c6Var.f15186x == aVar) {
                    Editable text = c6Var.f15181f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (mi.d dVar : (mi.d[]) text.getSpans(0, text.length(), mi.d.class)) {
                            text.removeSpan(dVar);
                        }
                        mi.d[] dVarArr = (mi.d[]) spannableString.getSpans(0, spannableString.length(), mi.d.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < dVarArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        c6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 3:
                aw awVar = (aw) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = awVar.f24720c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    awVar.dismiss();
                    org.telegram.ui.Components.qc.g(n2Var2, new tx0(n2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, n2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                b80 b80Var = (b80) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.C1;
                try {
                    b80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.xc X = org.telegram.ui.Components.xc.X();
                    if (X != null) {
                        org.telegram.messenger.g0.q(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                launchActivity.t0(new ProfileActivity(bundle, null));
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                TranslateController translateController = (TranslateController) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                String str2 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.f33358o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f33358o5)) {
                        if (photoViewer.f33349n5) {
                            photoViewer.f33353o0.K(20);
                            photoViewer.f33353o0.r(19);
                            return;
                        }
                        photoViewer.f33353o0.K(19);
                        photoViewer.f33353o0.r(20);
                        return;
                    }
                    photoViewer.f33353o0.r(19);
                    photoViewer.f33353o0.r(20);
                    return;
                }
                return;
        }
    }

    public ua(aw awVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f2270a = 3;
        this.f2272c = awVar;
        this.d = iArr;
        this.f2271b = i10;
        this.e = arrayList;
    }

    public ua(LaunchActivity launchActivity, b80 b80Var, Long l4, int i10) {
        this.f2270a = 4;
        this.f2272c = launchActivity;
        this.d = b80Var;
        this.e = l4;
        this.f2271b = i10;
    }
}
