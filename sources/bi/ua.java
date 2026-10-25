package bi;

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
import org.telegram.ui.Components.gy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sz;
public final class ua implements Utilities.Callback {
    public final int f5525a;
    public final int f5526b;
    public final Object f5527c;
    public final Object d;
    public final Object e;

    public ua(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f5525a = i11;
        this.f5527c = obj;
        this.f5526b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f5525a;
        boolean z10 = true;
        int i11 = this.f5526b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f5527c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ycVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.zc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new ai.h1(this.f5526b, context, u6Var, savedStarGift, 2), u6Var, null));
                    ycVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).f22027id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f5526b;
                if (!isChannel) {
                    org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(r2Var.getContext(), 3, null);
                    e2Var.r(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(r2Var.getParentActivity(), chat.f22027id, r2Var, new ii.l0(e2Var, r2Var, i12, j10, booleanValue));
                    return;
                }
                long j11 = chat.f22027id;
                MessagesController.getInstance(i12).linkCommunity(-j11, j10, booleanValue, new ii.m0(r2Var, j11, 0));
                return;
            case 2:
                li.d6 d6Var = (li.d6) obj4;
                li.a aVar = (li.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == d6Var.I && d6Var.f17202x == aVar) {
                    Editable text = d6Var.f17197f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (ni.d dVar : (ni.d[]) text.getSpans(0, text.length(), ni.d.class)) {
                            text.removeSpan(dVar);
                        }
                        ni.d[] dVarArr = (ni.d[]) spannableString.getSpans(0, spannableString.length(), ni.d.class);
                        int length = text.length();
                        for (int i13 = 0; i13 < dVarArr.length; i13++) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i13]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i13]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i13], spanStart, spanEnd, 33);
                            }
                        }
                        d6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 3:
                aw awVar = (aw) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.r2 r2Var2 = awVar.f26624c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    awVar.dismiss();
                    org.telegram.ui.Components.qc.g(r2Var2, new gy0(r2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, r2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                sz szVar = (sz) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    szVar.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.wc Y = org.telegram.ui.Components.wc.Y();
                    if (Y != null) {
                        org.telegram.messenger.t.q(R.string.StoryAlbumNotFound, Y, R.raw.story_bomb2, 36);
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
                launchActivity.u0(new ProfileActivity(bundle, null));
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                TranslateController translateController = (TranslateController) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                String str2 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.f35735o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f35735o5)) {
                        if (photoViewer.f35726n5) {
                            photoViewer.f35730o0.S(20);
                            photoViewer.f35730o0.t(19);
                            return;
                        }
                        photoViewer.f35730o0.S(19);
                        photoViewer.f35730o0.t(20);
                        return;
                    }
                    photoViewer.f35730o0.t(19);
                    photoViewer.f35730o0.t(20);
                    return;
                }
                return;
        }
    }

    public ua(aw awVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f5525a = 3;
        this.f5527c = awVar;
        this.d = iArr;
        this.f5526b = i10;
        this.e = arrayList;
    }

    public ua(LaunchActivity launchActivity, sz szVar, Long l4, int i10) {
        this.f5525a = 4;
        this.f5527c = launchActivity;
        this.d = szVar;
        this.e = l4;
        this.f5526b = i10;
    }
}
