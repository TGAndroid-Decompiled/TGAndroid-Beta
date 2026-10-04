package fi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import ii.f6;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.q21;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h90;
public final class m0 implements Utilities.Callback {
    public final int f9932a;
    public final int f9933b;
    public final Object f9934c;
    public final Object d;
    public final Object f9935e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f9932a = i11;
        this.f9934c = obj;
        this.f9933b = i10;
        this.d = obj2;
        this.f9935e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f9932a;
        boolean z10 = true;
        int i11 = this.f9933b;
        Object obj2 = this.f9935e;
        Object obj3 = this.d;
        Object obj4 = this.f9934c;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f20038id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f9933b;
                if (!isChannel) {
                    b2 b2Var = new b2(n2Var.getContext(), 3, null);
                    b2Var.q(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(n2Var.getParentActivity(), chat.f20038id, n2Var, new n0(b2Var, n2Var, i12, j3, booleanValue));
                    return;
                }
                long j10 = chat.f20038id;
                MessagesController.getInstance(i12).linkCommunity(-j10, j3, booleanValue, new o0(n2Var, j10, 0));
                return;
            case 1:
                f6 f6Var = (f6) obj4;
                ii.a aVar = (ii.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == f6Var.I && f6Var.f12376x == aVar) {
                    Editable text = f6Var.f12371f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < colorSpanArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        f6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wv wvVar = (wv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                n2 n2Var2 = wvVar.f32630c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    wvVar.dismiss();
                    rc.g(n2Var2, new vx0(n2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, n2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                h90 h90Var = (h90) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    h90Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    yc X = yc.X();
                    if (X != null) {
                        org.telegram.messenger.f0.p(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                    photoViewer.f33986o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f33986o5)) {
                        if (photoViewer.f33977n5) {
                            photoViewer.f33981o0.K(20);
                            photoViewer.f33981o0.r(19);
                            return;
                        }
                        photoViewer.f33981o0.K(19);
                        photoViewer.f33981o0.r(20);
                        return;
                    }
                    photoViewer.f33981o0.r(19);
                    photoViewer.f33981o0.r(20);
                    return;
                }
                return;
            default:
                ad adVar = (ad) obj4;
                Context context = (Context) obj3;
                d6 d6Var = (d6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(adVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new q21(this.f9933b, context, d6Var, savedStarGift, 18), d6Var, null));
                    adVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(wv wvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f9932a = 2;
        this.f9934c = wvVar;
        this.d = iArr;
        this.f9933b = i10;
        this.f9935e = arrayList;
    }

    public m0(LaunchActivity launchActivity, h90 h90Var, Long l4, int i10) {
        this.f9932a = 3;
        this.f9934c = launchActivity;
        this.d = h90Var;
        this.f9935e = l4;
        this.f9933b = i10;
    }
}
