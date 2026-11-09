package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.f10;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s10;
public final class ya implements c20 {
    public final int f5087a;
    public final int f5088b;
    public final Object f5089c;
    public final Object d;
    public final Object f5090e;

    public ya(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f5087a = i10;
        this.f5089c = obj;
        this.f5088b = i7;
        this.d = obj2;
        this.f5090e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f5087a;
        boolean z9 = true;
        int i10 = this.f5088b;
        Object obj2 = this.f5090e;
        Object obj3 = this.d;
        Object obj4 = this.f5089c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.jc jcVar = (org.telegram.ui.Components.jc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.kc.b(org.telegram.messenger.id.M0(2131745219, null), new ai.a1(this.f5088b, context, g6Var, savedStarGift, 2), g6Var, null));
                    jcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f26956id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.t3.T(chat);
                int i11 = this.f5088b;
                if (!T) {
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, f2Var.getContext(), null);
                    u1Var.r(250L);
                    qp.s1(i11).T(f2Var.getParentActivity(), chat.f26956id, f2Var, new ii.f0(u1Var, f2Var, i11, j3, booleanValue), null);
                    return;
                }
                long j10 = chat.f26956id;
                qp.s1(i11).Q2(-j10, j3, false, booleanValue, new ii.g0(f2Var, j10, 0));
                return;
            case 2:
                li.a6 a6Var = (li.a6) obj4;
                li.a aVar = (li.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i10 == a6Var.I && a6Var.f18435y == aVar) {
                    Editable text = a6Var.f18429f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (ni.f fVar : (ni.f[]) text.getSpans(0, text.length(), ni.f.class)) {
                            text.removeSpan(fVar);
                        }
                        ni.f[] fVarArr = (ni.f[]) spannableString.getSpans(0, spannableString.length(), ni.f.class);
                        int length = text.length();
                        for (int i12 = 0; i12 < fVarArr.length; i12++) {
                            int spanStart = spannableString.getSpanStart(fVarArr[i12]);
                            int spanEnd = spannableString.getSpanEnd(fVarArr[i12]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(fVarArr[i12], spanStart, spanEnd, 33);
                            }
                        }
                        a6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ru ruVar = (ru) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.f2 f2Var2 = ruVar.f37807j1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i10 && iArr[1] > 0) {
                    ruVar.dismiss();
                    org.telegram.ui.Components.cc.g(f2Var2, new ev0(f2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, f2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                s10 s10Var = (s10) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.B1;
                try {
                    s10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.hc X = org.telegram.ui.Components.hc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.o(null, 2131744730, X, 2131624236, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l10.longValue() > 0) {
                    bundle.putLong("user_id", l10.longValue());
                    if (l10.longValue() != p10.i(launchActivity.O).e()) {
                        z9 = false;
                    }
                    bundle.putBoolean("my_profile", z9);
                } else {
                    bundle.putLong("chat_id", -l10.longValue());
                }
                bundle.putInt("open_story_album_id", i10);
                launchActivity.t0(new ProfileActivity(bundle, null));
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                f10 f10Var = (f10) obj3;
                ij ijVar = (ij) obj2;
                String str3 = (String) obj;
                if (i10 == photoViewer.P4) {
                    photoViewer.f41473n5 = str3;
                    if (f10Var.s() && f10Var.b(ijVar, photoViewer.f41473n5)) {
                        if (photoViewer.f41464m5) {
                            photoViewer.f41477o0.S(20);
                            photoViewer.f41477o0.t(19);
                            return;
                        }
                        photoViewer.f41477o0.S(19);
                        photoViewer.f41477o0.t(20);
                        return;
                    }
                    photoViewer.f41477o0.t(19);
                    photoViewer.f41477o0.t(20);
                    return;
                }
                return;
        }
    }

    public ya(ru ruVar, int[] iArr, int i7, ArrayList arrayList) {
        this.f5087a = 3;
        this.f5089c = ruVar;
        this.d = iArr;
        this.f5088b = i7;
        this.f5090e = arrayList;
    }

    public ya(LaunchActivity launchActivity, s10 s10Var, Long l10, int i7) {
        this.f5087a = 4;
        this.f5089c = launchActivity;
        this.d = s10Var;
        this.f5090e = l10;
        this.f5088b = i7;
    }
}
