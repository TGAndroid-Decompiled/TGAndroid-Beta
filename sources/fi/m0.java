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
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ia0;
public final class m0 implements Utilities.Callback {
    public final int f9124a;
    public final int f9125b;
    public final Object f9126c;
    public final Object d;
    public final Object e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f9124a = i11;
        this.f9126c = obj;
        this.f9125b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f9124a;
        boolean z10 = true;
        int i11 = this.f9125b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f9126c;
        switch (i10) {
            case 0:
                n2 n2Var = (n2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f18083id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f9125b;
                if (!isChannel) {
                    b2 b2Var = new b2(n2Var.getContext(), 3, null);
                    b2Var.q(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(n2Var.getParentActivity(), chat.f18083id, n2Var, new n0(b2Var, n2Var, i12, j3, booleanValue));
                    return;
                }
                long j10 = chat.f18083id;
                MessagesController.getInstance(i12).linkCommunity(-j10, j3, booleanValue, new o0(n2Var, j10, 0));
                return;
            case 1:
                e6 e6Var = (e6) obj4;
                ii.a aVar = (ii.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == e6Var.I && e6Var.f11354x == aVar) {
                    Editable text = e6Var.f11349f.getText();
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
                        e6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                tv tvVar = (tv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                n2 n2Var2 = tvVar.f28305c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    tvVar.dismiss();
                    qc.g(n2Var2, new zw0(n2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, n2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ia0 ia0Var = (ia0) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    ia0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    xc X = xc.X();
                    if (X != null) {
                        z0.o(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                    photoViewer.f30999o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f30999o5)) {
                        if (photoViewer.f30990n5) {
                            photoViewer.f30994o0.K(20);
                            photoViewer.f30994o0.r(19);
                            return;
                        }
                        photoViewer.f30994o0.K(19);
                        photoViewer.f30994o0.r(20);
                        return;
                    }
                    photoViewer.f30994o0.r(19);
                    photoViewer.f30994o0.r(20);
                    return;
                }
                return;
            default:
                zc zcVar = (zc) obj4;
                Context context = (Context) obj3;
                d6 d6Var = (d6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new r11(this.f9125b, context, d6Var, savedStarGift, 18), d6Var, null));
                    zcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(tv tvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f9124a = 2;
        this.f9126c = tvVar;
        this.d = iArr;
        this.f9125b = i10;
        this.e = arrayList;
    }

    public m0(LaunchActivity launchActivity, ia0 ia0Var, Long l4, int i10) {
        this.f9124a = 3;
        this.f9126c = launchActivity;
        this.d = ia0Var;
        this.e = l4;
        this.f9125b = i10;
    }
}
