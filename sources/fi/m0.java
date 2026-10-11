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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.jw;
import org.telegram.ui.Components.s21;
import org.telegram.ui.Components.sc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n70;
public final class m0 implements Utilities.Callback {
    public final int f10007a;
    public final int f10008b;
    public final Object f10009c;
    public final Object d;
    public final Object f10010e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f10007a = i11;
        this.f10009c = obj;
        this.f10008b = i10;
        this.d = obj2;
        this.f10010e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f10007a;
        boolean z10 = true;
        int i11 = this.f10008b;
        Object obj2 = this.f10010e;
        Object obj3 = this.d;
        Object obj4 = this.f10009c;
        switch (i10) {
            case 0:
                m2 m2Var = (m2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f20032id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f10008b;
                if (!isChannel) {
                    a2 a2Var = new a2(m2Var.getContext(), 3, null);
                    a2Var.q(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(m2Var.getParentActivity(), chat.f20032id, m2Var, new n0(a2Var, m2Var, i12, j3, booleanValue));
                    return;
                }
                long j10 = chat.f20032id;
                MessagesController.getInstance(i12).linkCommunity(-j10, j3, booleanValue, new o0(m2Var, j10, 0));
                return;
            case 1:
                f6 f6Var = (f6) obj4;
                ii.a aVar = (ii.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == f6Var.I && f6Var.f12423x == aVar) {
                    Editable text = f6Var.f12418f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (li.d dVar : (li.d[]) text.getSpans(0, text.length(), li.d.class)) {
                            text.removeSpan(dVar);
                        }
                        li.d[] dVarArr = (li.d[]) spannableString.getSpans(0, spannableString.length(), li.d.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < dVarArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        f6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                jw jwVar = (jw) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                m2 m2Var2 = jwVar.f27759c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    jwVar.dismiss();
                    sc.g(m2Var2, new ey0(m2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, m2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                n70 n70Var = (n70) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    n70Var.run();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    ad X = ad.X();
                    if (X != null) {
                        org.telegram.messenger.q.q(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                    photoViewer.f34023o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f34023o5)) {
                        if (photoViewer.f34014n5) {
                            photoViewer.f34018o0.K(20);
                            photoViewer.f34018o0.r(19);
                            return;
                        }
                        photoViewer.f34018o0.K(19);
                        photoViewer.f34018o0.r(20);
                        return;
                    }
                    photoViewer.f34018o0.r(19);
                    photoViewer.f34018o0.r(20);
                    return;
                }
                return;
            default:
                cd cdVar = (cd) obj4;
                Context context = (Context) obj3;
                d6 d6Var = (d6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cdVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) dd.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new s21(this.f10008b, context, d6Var, savedStarGift, 21), d6Var, null));
                    cdVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(jw jwVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f10007a = 2;
        this.f10009c = jwVar;
        this.d = iArr;
        this.f10008b = i10;
        this.f10010e = arrayList;
    }

    public m0(LaunchActivity launchActivity, n70 n70Var, Long l4, int i10) {
        this.f10007a = 3;
        this.f10009c = launchActivity;
        this.d = n70Var;
        this.f10010e = l4;
        this.f10008b = i10;
    }
}
