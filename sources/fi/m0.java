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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.uv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ea0;
public final class m0 implements Utilities.Callback {
    public final int f9128a;
    public final int f9129b;
    public final Object f9130c;
    public final Object d;
    public final Object e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f9128a = i11;
        this.f9130c = obj;
        this.f9129b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f9128a;
        boolean z10 = true;
        int i11 = this.f9129b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f9130c;
        switch (i10) {
            case 0:
                o2 o2Var = (o2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f18329id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f9129b;
                if (!isChannel) {
                    c2 c2Var = new c2(o2Var.getContext(), 3, null);
                    c2Var.q(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(o2Var.getParentActivity(), chat.f18329id, o2Var, new n0(c2Var, o2Var, i12, j3, booleanValue));
                    return;
                }
                long j10 = chat.f18329id;
                MessagesController.getInstance(i12).linkCommunity(-j10, j3, booleanValue, new o0(o2Var, j10, 0));
                return;
            case 1:
                e6 e6Var = (e6) obj4;
                ii.a aVar = (ii.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == e6Var.I && e6Var.f11357x == aVar) {
                    Editable text = e6Var.f11352f.getText();
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
                uv uvVar = (uv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                o2 o2Var2 = uvVar.f28944c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    uvVar.dismiss();
                    qc.g(o2Var2, new mx0(o2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ea0 ea0Var = (ea0) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    ea0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    xc X = xc.X();
                    if (X != null) {
                        org.telegram.messenger.l0.o(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                    photoViewer.f31316o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f31316o5)) {
                        if (photoViewer.f31307n5) {
                            photoViewer.f31311o0.K(20);
                            photoViewer.f31311o0.r(19);
                            return;
                        }
                        photoViewer.f31311o0.K(19);
                        photoViewer.f31311o0.r(20);
                        return;
                    }
                    photoViewer.f31311o0.r(19);
                    photoViewer.f31311o0.r(20);
                    return;
                }
                return;
            default:
                zc zcVar = (zc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ad.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new h21(this.f9129b, context, e6Var2, savedStarGift, 18), e6Var2, null));
                    zcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(uv uvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f9128a = 2;
        this.f9130c = uvVar;
        this.d = iArr;
        this.f9129b = i10;
        this.e = arrayList;
    }

    public m0(LaunchActivity launchActivity, ea0 ea0Var, Long l4, int i10) {
        this.f9128a = 3;
        this.f9130c = launchActivity;
        this.d = ea0Var;
        this.e = l4;
        this.f9129b = i10;
    }
}
