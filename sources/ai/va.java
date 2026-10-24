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
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.yv;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f80;
public final class va implements Utilities.Callback {
    public final int f2327a;
    public final int f2328b;
    public final Object f2329c;
    public final Object d;
    public final Object e;

    public va(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2327a = i11;
        this.f2329c = obj;
        this.f2328b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f2327a;
        boolean z10 = true;
        int i11 = this.f2328b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f2329c;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.yc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new db(this.f2328b, context, g6Var, savedStarGift, 0), g6Var, null));
                    xcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).f20344id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i12 = this.f2328b;
                if (!isChannel) {
                    org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(o2Var.getContext(), 3, null);
                    c2Var.r(250L);
                    MessagesController.getInstance(i12).convertToMegaGroup(o2Var.getParentActivity(), chat.f20344id, o2Var, new hi.m0(c2Var, o2Var, i12, j10, booleanValue));
                    return;
                }
                long j11 = chat.f20344id;
                MessagesController.getInstance(i12).linkCommunity(-j11, j10, booleanValue, new hi.n0(o2Var, j11, 0));
                return;
            case 2:
                ki.c6 c6Var = (ki.c6) obj4;
                ki.a aVar = (ki.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == c6Var.I && c6Var.f15245x == aVar) {
                    Editable text = c6Var.f15240f.getText();
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
                yv yvVar = (yv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var2 = yvVar.f33049c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    yvVar.dismiss();
                    org.telegram.ui.Components.oc.g(o2Var2, new xx0(o2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                f80 f80Var = (f80) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f80Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LaunchActivity.R();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.vc X = org.telegram.ui.Components.vc.X();
                    if (X != null) {
                        org.telegram.messenger.v0.p(R.string.StoryAlbumNotFound, X, R.raw.story_bomb2, 36);
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
                    photoViewer.f33674o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f33674o5)) {
                        if (photoViewer.f33665n5) {
                            photoViewer.f33669o0.K(20);
                            photoViewer.f33669o0.r(19);
                            return;
                        }
                        photoViewer.f33669o0.K(19);
                        photoViewer.f33669o0.r(20);
                        return;
                    }
                    photoViewer.f33669o0.r(19);
                    photoViewer.f33669o0.r(20);
                    return;
                }
                return;
        }
    }

    public va(yv yvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f2327a = 3;
        this.f2329c = yvVar;
        this.d = iArr;
        this.f2328b = i10;
        this.e = arrayList;
    }

    public va(LaunchActivity launchActivity, f80 f80Var, Long l4, int i10) {
        this.f2327a = 4;
        this.f2329c = launchActivity;
        this.d = f80Var;
        this.e = l4;
        this.f2328b = i10;
    }
}
